package com.zebra.savanna;

import com.google.gson.Gson;
import com.zebra.savanna.Models.Errors.DeveloperMessage;
import com.zebra.savanna.Models.Errors.DeveloperMessageError;
import com.zebra.savanna.Models.Errors.Error;
import com.zebra.savanna.Models.Errors.StringError;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * SavannaAPI --- Provides common functionality for access to Savanna APIs.
 *
 * @author SLippert@zebra.com
 * 
 */
public abstract class SavannaAPI {
    private final static String baseUrl = "https://api.zebra.com/v2/tools/";
    private static String apiKey;

    private static byte[] getResponse(String URL) throws HttpRetryException {
        int status = -1;
        HttpURLConnection con = null;
        byte[] response = new byte[0];
        try {
            URL url = new URL(URL);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("apikey", getAPIKey());

            BufferedInputStream in = null;
            try {
                InputStream stream = con.getInputStream();
                if (stream != null) {
                    in = new BufferedInputStream(stream);
                }
            } catch (IOException e) {
                InputStream stream = con.getErrorStream();
                if (stream != null) {
                    in = new BufferedInputStream(stream);
                }
            }

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            int n;
            while (in != null && -1 != (n = in.read(buf))) {
                out.write(buf, 0, n);
            }
            out.close();
            if (in != null) {
                in.close();
            }

            response = out.toByteArray();
            status = con.getResponseCode();
        } catch (Exception e) {
            throw new HttpRetryException(new String(response, StandardCharsets.UTF_8), status);
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }
        return response;
    }

    /**
     * @return Your Zebra Savanna application key.
     */
    public static String getAPIKey() {
        return apiKey;
    }

    /**
     * @param apiKey Your Zebra Savanna application key.
     */
    public static void setAPIKey(String apiKey) {
        SavannaAPI.apiKey = apiKey;
    }

    /**
     * Retrieve a JSON string from a Barcode Intelligence Tools service.
     *
     * @param api The API path of the tool being accessed.
     * @throws HttpRetryException Thrown if there is an error calling the service
     * @throws Error              Thrown if there is an error returned from the
     *                            service
	 * @return A string containing JSON returned by the API call.
     */
    protected static String callService(String api) throws HttpRetryException, JSONException, Error {
        byte[] response = getResponse(baseUrl + api);
        String json = new String(response, StandardCharsets.UTF_8);
        CheckErrors(json);
        return json;
    }

    /**
     * Retrieve raw bytes from a Barcode Intelligence Tools service.
     *
     * @param api The API path of the tool being accessed.
     * @throws HttpRetryException Thrown if there is an error calling the service
     * @throws Error              Thrown if there is an error returned from the
     *                            service
	 * @return A byte array representation of the API call result.
     */
    protected static byte[] callServiceBytes(String api) throws HttpRetryException, JSONException, Error {
        byte[] response = getResponse(baseUrl + api);
        String json = new String(response, StandardCharsets.UTF_8);
        if (json.trim().startsWith("{")) {
            CheckErrors(json);
        }
        return response;
    }

    /**
     * Throw a deserialized error message from Savanna API response.
     *
     * @param json The JSON response from a Savanna service.
     * @throws Error Thrown if there is an error returned from the service
     */
    public static void CheckErrors(String json) throws Error, JSONException {
        JSONObject dynObj = new JSONObject(json);
        if (dynObj.has("errorResponse")) {
            dynObj = dynObj.getJSONObject("errorResponse");
        }

        Gson gson = new Gson();
        String message = null;
        DeveloperMessageError dmError = null;

        if (dynObj.has("message")) {
            message = dynObj.getString("message");
        } else if (dynObj.has("Message")) {
            message = dynObj.getString("Message");
        }
        if (message != null) {
            try {
                dmError = gson.fromJson(dynObj.toString(), DeveloperMessageError.class);
                DeveloperMessageError dmError2 = new DeveloperMessageError(message);
                dmError2.setCode(dmError.getCode());
                dmError2.setInfo(dmError.getInfo());
                dmError2.setDeveloperMessage(dmError.getDeveloperMessage());
                dmError2.setErrorDetail(dmError.getErrorDetail());
                dmError = dmError2;
            } finally {
                if (dmError != null) {
                    throw dmError;
                }
            }

            StringError stringError = null;
            try {
                stringError = gson.fromJson(dynObj.toString(), StringError.class);
                StringError stringError2 = new StringError(message);
                stringError2.setCode(stringError.getCode());
                stringError2.setInfo(stringError.getInfo());
                stringError2.setDeveloperMessage(stringError.getDeveloperMessage());
                stringError2.setErrorDetail(stringError.getErrorDetail());
                stringError = stringError2;
            } finally {
                if (stringError != null) {
                    throw stringError;
                }
            }
        }

        try {
            DeveloperMessage developerMessage = gson.fromJson(dynObj.toString(), DeveloperMessage.class);
            if (developerMessage != null && developerMessage.getFault() != null
                    && developerMessage.getFault().getFaultString() != null) {
                dmError = new DeveloperMessageError(developerMessage.getFault().getFaultString());
                dmError.setDeveloperMessage(developerMessage);
            }
        } finally {
            if (dmError != null) {
                throw dmError;
            }
        }
    }
}