Zebra Savanna Data Services Java SDK
====================================

This is the source code for the Savanna Java SDK.  
The core of this SDK is a basic API connection call to the Zebra Savanna Data Services in the SavannaAPI class.  Currently the API has public methods for the three public APIs that are part of the Barcode Intelligence Product.  These APIs are:

* Barcode Generate
* UPC Lookup
* FDA Recall

This SDK also has models for all the data sent and received by these APIs in order to make it easier to work with them.  

API Key
-------

To get an API key to work with these APIs, use the [Getting Started Guide](https://developer.zebra.com/gsg) and select the Barcode Intelligence product.  

Documentation
-------------

For more information on these APIs, go to [developer.zebra.com/apis](https://developer.zebra.com/apis) or visit the [Forums](https://developer.zebra.com/forum/search?keys=&field_zebra_curated_tags_tid%5B%5D=273)

Usage guide
-----------

Set Zebra Savanna API key

`SavannaAPI.setAPIKey(sharedPreferences.getString("apikey", ""));`

Create Barcode

`byte[] barcodeBytes = CreateBarcode.create(symbology, barcodeText.Text);`

UPC Lookup

`String upcLookupJson = UPCLookup.lookup(barcode);`

FDA Food Recall

`String foodUpcJson = FDARecall.foodUpc(barcode);`

FDA Drug Recall

`String drugUpcJson = FDARecall.drugUpc(barcode);`

FDA Device Recall Search

`String deviceSearchJson = FDARecall.deviceSearch(searchText.Text);`

FDA Drug Recall Search

`String drugSearchJson = FDARecall.drugSearch(searchText.Text);`
