package com.zebra.savanna;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.zebra.savanna.Models.Classification;
import com.zebra.savanna.Models.DeviceClass;
import com.zebra.savanna.Models.Status;

/**
 * ConvertibleSerializer --- Serializes enum values for use with Savanna aPIs
 * 
 * @author SLippert@zebra.com
 *
 */
public class ConvertibleSerializer implements JsonSerializer<IConvertible>, JsonDeserializer<IConvertible> {

	public JsonElement serialize(IConvertible src, Type typeOfSrc, JsonSerializationContext context) {
		return new JsonPrimitive(src.toValue());
	}

	public IConvertible deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {

		if (typeOfT.equals(Status.class)) {
			return Status.fromValue(json.getAsString());
		}
		if (typeOfT.equals(DeviceClass.class)) {
			return DeviceClass.fromValue(json.getAsString());
		}
		if (typeOfT.equals(Classification.class)) {
			return Classification.fromValue(json.getAsString());
		}
		if (typeOfT.equals(Symbology.class)) {
			return Symbology.fromValue(json.getAsString());
		}
		if (typeOfT.equals(Rotation.class)) {
			return Rotation.fromValue(json.getAsString());
		}

		throw new JsonParseException("Could not deserialize " + json);
	}
}