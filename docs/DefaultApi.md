# DefaultApi

All URIs are relative to *https://chompthis.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**foodBrandedBarcodePhpGet**](DefaultApi.md#foodBrandedBarcodePhpGet) | **GET** /food/branded/barcode.php | Get a branded food item using a barcode
[**foodBrandedIdPhpGet**](DefaultApi.md#foodBrandedIdPhpGet) | **GET** /food/branded/id.php | Get a branded food item using an ID number
[**foodBrandedNamePhpGet**](DefaultApi.md#foodBrandedNamePhpGet) | **GET** /food/branded/name.php | Get a branded food item by name
[**foodBrandedSearchPhpGet**](DefaultApi.md#foodBrandedSearchPhpGet) | **GET** /food/branded/search.php | Get data for branded food items using various search parameters
[**foodIngredientSearchPhpGet**](DefaultApi.md#foodIngredientSearchPhpGet) | **GET** /food/ingredient/search.php | Get raw/generic food ingredient item(s)

<a name="foodBrandedBarcodePhpGet"></a>
# **foodBrandedBarcodePhpGet**
> BrandedFoodObject foodBrandedBarcodePhpGet(code)

Get a branded food item using a barcode

# Get data for a branded food using the food&#x27;s UPC/EAN barcode.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/barcode.php?api_key&#x3D;API_KEY&amp;code&#x3D;CODE&#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val code : kotlin.String = code_example // kotlin.String | UPC/EAN barcode  __Example:__ 0842234000988  __Resources:__ [Database search](https://chompthis.com/api/lookup.php)  _Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for tips and tricks._ 
try {
    val result : BrandedFoodObject = apiInstance.foodBrandedBarcodePhpGet(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#foodBrandedBarcodePhpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#foodBrandedBarcodePhpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| UPC/EAN barcode  __Example:__ 0842234000988  __Resources:__ [Database search](https://chompthis.com/api/lookup.php)  _Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for tips and tricks._  |

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodBrandedIdPhpGet"></a>
# **foodBrandedIdPhpGet**
> BrandedFoodObject foodBrandedIdPhpGet(id, source)

Get a branded food item using an ID number

# Get data for a branded food using Chomp&#x27;s internal ID number.  _Alternatively, set the \&quot;source\&quot; parameter to \&quot;USDA\&quot; and use the food&#x27;s FDC ID._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/id.php?api_key&#x3D;API_KEY&amp;id&#x3D;ID&#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val id : kotlin.Int = 56 // kotlin.Int | Chomp branded food ID.  _Set \"source=USDA\" if you wish to pass in the food's FoodData Central ID (fdc_id)._  __Example #1:__ 15  __Resources:__ [Find branded food IDs](https://chompthis.com/api/lookup.php) 
val source : kotlin.String = source_example // kotlin.String | Specify the data source (optional).  You must pass in \"USDA\" if you want to look up a food item using a USDA FDC ID.  __Example:__ USDA _(defaults to \"Chomp\")_ 
try {
    val result : BrandedFoodObject = apiInstance.foodBrandedIdPhpGet(id, source)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#foodBrandedIdPhpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#foodBrandedIdPhpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**| Chomp branded food ID.  _Set \&quot;source&#x3D;USDA\&quot; if you wish to pass in the food&#x27;s FoodData Central ID (fdc_id)._  __Example #1:__ 15  __Resources:__ [Find branded food IDs](https://chompthis.com/api/lookup.php)  |
 **source** | **kotlin.String**| Specify the data source (optional).  You must pass in \&quot;USDA\&quot; if you want to look up a food item using a USDA FDC ID.  __Example:__ USDA _(defaults to \&quot;Chomp\&quot;)_  | [optional]

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodBrandedNamePhpGet"></a>
# **foodBrandedNamePhpGet**
> BrandedFoodObject foodBrandedNamePhpGet(name, limit)

Get a branded food item by name

# Search for branded food items by name.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/name.php?api_key&#x3D;API_KEY&amp;name&#x3D;NAME&#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val name : kotlin.String = name_example // kotlin.String | Branded food name  __Example:__ Starburst  __Resources:__ [Find branded food names](https://chompthis.com/api/lookup.php) 
val limit : kotlin.Int = 56 // kotlin.Int | Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_ 
try {
    val result : BrandedFoodObject = apiInstance.foodBrandedNamePhpGet(name, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#foodBrandedNamePhpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#foodBrandedNamePhpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**| Branded food name  __Example:__ Starburst  __Resources:__ [Find branded food names](https://chompthis.com/api/lookup.php)  |
 **limit** | **kotlin.Int**| Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_  | [optional] [enum: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodBrandedSearchPhpGet"></a>
# **foodBrandedSearchPhpGet**
> BrandedFoodObject foodBrandedSearchPhpGet(allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page)

Get data for branded food items using various search parameters

# Search for branded food items using various parameters.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/search.php?api_key&#x3D;API_KEY&amp;brand&#x3D;BRAND&amp;country&#x3D;COUNTRY&amp;page&#x3D;1&#x60;&#x60;&#x60;  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val allergen : kotlin.String = allergen_example // kotlin.String | Specify a required allergen ingredient (optional)  __Example__: Peanuts  __Resources__: [List of allergens](https://chompthis.com/api/data/allergen.php) 
val brand : kotlin.String = brand_example // kotlin.String | Specify a required brand (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php) 
val category : kotlin.String = category_example // kotlin.String | Specify a required category (optional)  __Example__: Pasta Dishes  __Resources__: [List of categories](https://chompthis.com/api/data/category.php) 
val country : kotlin.String = country_example // kotlin.String | Specify a required country (optional)  __Example__: United States  __Resources__: [List of countries](https://chompthis.com/api/data/country.php) 
val diet : kotlin.String = diet_example // kotlin.String | Specify a required diet (optional)  _Filters the search to only include food items that are considered compatible with the following diets: Vegan, Vegetarian, Gluten Free_  __Example__: Gluten Free  __Resources__: [List of diets](https://chompthis.com/api/data/lifestyle.php) 
val ingredient : kotlin.String = ingredient_example // kotlin.String | Specify a required ingredient (optional)  __Example__: Salt  __Resources__: [List of ingredients](https://chompthis.com/api/data/ingredient.php) 
val keyword : kotlin.String = keyword_example // kotlin.String | Specify a required keyword (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php) 
val mineral : kotlin.String = mineral_example // kotlin.String | Specify a required mineral (optional)  __Example__: Potassium  __Resources__: [List of minerals](https://chompthis.com/api/data/mineral.php) 
val nutrient : kotlin.String = nutrient_example // kotlin.String | Specify a required nutrition label item (optional)  __Example__: Caffeine  __Resources__: [List of nutrition label items](https://chompthis.com/api/data/nutrition.php) 
val palmOil : kotlin.String = palmOil_example // kotlin.String | Specify a required palm oil ingredient (optional)  __Example__: E160a Beta Carotene  __Resources__: [List of palm oil ingredients](https://chompthis.com/api/data/palm-oil.php) 
val trace : kotlin.String = trace_example // kotlin.String | Specify a required trace ingredient (optional)  __Example__: Tree Nuts  __Resources__: [List of trace ingredients](https://chompthis.com/api/data/trace.php) 
val vitamin : kotlin.String = vitamin_example // kotlin.String | Specify a required vitamin (optional)  __Example__: Biotin  __Resources__: [List of vitamins](https://chompthis.com/api/data/vitamin.php) 
val limit : kotlin.Int = 56 // kotlin.Int | Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_ 
val page : kotlin.Int = 56 // kotlin.Int | Specify the search response page number.  _Each page will contain up to 10 items._  __Example__: 1 _(default)_ 
try {
    val result : BrandedFoodObject = apiInstance.foodBrandedSearchPhpGet(allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#foodBrandedSearchPhpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#foodBrandedSearchPhpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allergen** | **kotlin.String**| Specify a required allergen ingredient (optional)  __Example__: Peanuts  __Resources__: [List of allergens](https://chompthis.com/api/data/allergen.php)  | [optional]
 **brand** | **kotlin.String**| Specify a required brand (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php)  | [optional]
 **category** | **kotlin.String**| Specify a required category (optional)  __Example__: Pasta Dishes  __Resources__: [List of categories](https://chompthis.com/api/data/category.php)  | [optional]
 **country** | **kotlin.String**| Specify a required country (optional)  __Example__: United States  __Resources__: [List of countries](https://chompthis.com/api/data/country.php)  | [optional]
 **diet** | **kotlin.String**| Specify a required diet (optional)  _Filters the search to only include food items that are considered compatible with the following diets: Vegan, Vegetarian, Gluten Free_  __Example__: Gluten Free  __Resources__: [List of diets](https://chompthis.com/api/data/lifestyle.php)  | [optional]
 **ingredient** | **kotlin.String**| Specify a required ingredient (optional)  __Example__: Salt  __Resources__: [List of ingredients](https://chompthis.com/api/data/ingredient.php)  | [optional]
 **keyword** | **kotlin.String**| Specify a required keyword (optional)  __Example__: Starbucks  __Resources__: [List of brands](https://chompthis.com/api/data/brand.php)  | [optional]
 **mineral** | **kotlin.String**| Specify a required mineral (optional)  __Example__: Potassium  __Resources__: [List of minerals](https://chompthis.com/api/data/mineral.php)  | [optional]
 **nutrient** | **kotlin.String**| Specify a required nutrition label item (optional)  __Example__: Caffeine  __Resources__: [List of nutrition label items](https://chompthis.com/api/data/nutrition.php)  | [optional]
 **palmOil** | **kotlin.String**| Specify a required palm oil ingredient (optional)  __Example__: E160a Beta Carotene  __Resources__: [List of palm oil ingredients](https://chompthis.com/api/data/palm-oil.php)  | [optional]
 **trace** | **kotlin.String**| Specify a required trace ingredient (optional)  __Example__: Tree Nuts  __Resources__: [List of trace ingredients](https://chompthis.com/api/data/trace.php)  | [optional]
 **vitamin** | **kotlin.String**| Specify a required vitamin (optional)  __Example__: Biotin  __Resources__: [List of vitamins](https://chompthis.com/api/data/vitamin.php)  | [optional]
 **limit** | **kotlin.Int**| Set maximum number of records you want the API to return.  ___Note:__ The maximum value is 10._  __Example:__ 3 _(defaults to 10)_  | [optional] [enum: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 **page** | **kotlin.Int**| Specify the search response page number.  _Each page will contain up to 10 items._  __Example__: 1 _(default)_  | [optional]

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodIngredientSearchPhpGet"></a>
# **foodIngredientSearchPhpGet**
> IngredientObject foodIngredientSearchPhpGet(find, list, raw, limit)

Get raw/generic food ingredient item(s)

# Get data for a specific ingredient or a specific set of ingredients.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;STRING/LIST&amp;list&#x3D;BOOLEAN&amp;raw&#x3D;BOOLEAN&#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val find : kotlin.Int = 56 // kotlin.Int | Specify the ingredient name(s).  __Example #1:__ broccoli  __Example #2:__ broccoli,cauliflower,spinach  ___Important Note:__ Set the \"is_list\" parameter to true before passing in a comma-separated list of ingredients._ 
val list : kotlin.Boolean = true // kotlin.Boolean | Specify if you are searching for multiple ingredients.  _Setting this to true will configure this endpoint so that it accepts a comma-separated list of ingredients._  _By default, this endpoint expects a single ingredient._  __Example:__ true _(defaults to false)_ 
val raw : kotlin.Boolean = true // kotlin.Boolean | Specify if you only want data for raw ingredients.  __Example:__ true _(defaults to true)_ 
val limit : kotlin.Int = 56 // kotlin.Int | Set maximum number of records you want the API to return.  ___Important Note:__ Setting this to \"1\" will return 1 record per search term._  __Example:__ 1 _(defaults to 1, max is 3)_ 
try {
    val result : IngredientObject = apiInstance.foodIngredientSearchPhpGet(find, list, raw, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#foodIngredientSearchPhpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#foodIngredientSearchPhpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **find** | **kotlin.Int**| Specify the ingredient name(s).  __Example #1:__ broccoli  __Example #2:__ broccoli,cauliflower,spinach  ___Important Note:__ Set the \&quot;is_list\&quot; parameter to true before passing in a comma-separated list of ingredients._  |
 **list** | **kotlin.Boolean**| Specify if you are searching for multiple ingredients.  _Setting this to true will configure this endpoint so that it accepts a comma-separated list of ingredients._  _By default, this endpoint expects a single ingredient._  __Example:__ true _(defaults to false)_  |
 **raw** | **kotlin.Boolean**| Specify if you only want data for raw ingredients.  __Example:__ true _(defaults to true)_  | [optional]
 **limit** | **kotlin.Int**| Set maximum number of records you want the API to return.  ___Important Note:__ Setting this to \&quot;1\&quot; will return 1 record per search term._  __Example:__ 1 _(defaults to 1, max is 3)_  | [optional] [enum: 1, 2, 3]

### Return type

[**IngredientObject**](IngredientObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

