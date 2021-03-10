# DefaultApi

All URIs are relative to *https://chompthis.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**foodBrandedBarcodePhpGet**](DefaultApi.md#foodBrandedBarcodePhpGet) | **GET** /food/branded/barcode.php | Get a branded food item using a barcode
[**foodBrandedNamePhpGet**](DefaultApi.md#foodBrandedNamePhpGet) | **GET** /food/branded/name.php | Get a branded food item by name
[**foodBrandedSearchPhpGet**](DefaultApi.md#foodBrandedSearchPhpGet) | **GET** /food/branded/search.php | Get data for branded food items using various search parameters
[**foodIngredientSearchPhpGet**](DefaultApi.md#foodIngredientSearchPhpGet) | **GET** /food/ingredient/search.php | Get raw/generic food ingredient item(s)
[**recipeIdPhpGet**](DefaultApi.md#recipeIdPhpGet) | **GET** /recipe/id.php | Get a recipe by ID
[**recipeIngredientPhpGet**](DefaultApi.md#recipeIngredientPhpGet) | **GET** /recipe/ingredient.php | Get recipes using a list of ingredients
[**recipeRandomPhpGet**](DefaultApi.md#recipeRandomPhpGet) | **GET** /recipe/random.php | Get random popular recipes
[**recipeSearchPhpGet**](DefaultApi.md#recipeSearchPhpGet) | **GET** /recipe/search.php | Get recipes using a title and optional filters

<a name="foodBrandedBarcodePhpGet"></a>
# **foodBrandedBarcodePhpGet**
> BrandedFoodObject foodBrandedBarcodePhpGet(code, userId)

Get a branded food item using a barcode

## Get data for a branded food using the food&#x27;s UPC/EAN barcode.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example**  &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/barcode.php?api_key&#x3D;API_KEY&amp;code&#x3D;CODE&#x60;&#x60;&#x60;  **Tips**   * Read our **[Knowledge Base article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do)** for helpful tips and tricks.   * Perform a [check-digit](https://en.wikipedia.org/wiki/Check_digit#UPC) on the barcode you are using.   * Use a barcode from our website [ChompThis.com](https://chompthis.com/?r&#x3D;api). Search for a food and use the barcode shown in the search results.   * It is possible that our database contains the food you&#x27;re looking for, but does not have the same barcode you are using. This can happen if a manufacturer introduces a variation of the same food, or the barcode you got was from a 2 oz bag of chips when our database has the food packaged in a 4 oz bag.   * [Contact us](https://chompthis.com/contact.php?api&#x3D;y) if you are having trouble. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val code : kotlin.String = code_example // kotlin.String | #### UPC/EAN barcode  **Example** > ```&code=0842234000988``` 
val userId : kotlin.String = userId_example // kotlin.String | #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` 
try {
    val result : BrandedFoodObject = apiInstance.foodBrandedBarcodePhpGet(code, userId)
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
 **code** | **kotlin.String**| #### UPC/EAN barcode  **Example** &gt; &#x60;&#x60;&#x60;&amp;code&#x3D;0842234000988&#x60;&#x60;&#x60;  |
 **userId** | **kotlin.String**| #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn&#x27;t have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** &gt; &#x60;&#x60;&#x60;&amp;user_id&#x3D;fehef8w4ha&#x60;&#x60;&#x60;  | [optional]

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodBrandedNamePhpGet"></a>
# **foodBrandedNamePhpGet**
> BrandedFoodObject foodBrandedNamePhpGet(name, limit, page, userId)

Get a branded food item by name

## Search for branded food items by name.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/name.php?api_key&#x3D;API_KEY&amp;name&#x3D;NAME&#x60;&#x60;&#x60;  **Tips**   * Get started by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  &gt; This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren&#x27;t sure how to upgrade your subscription. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val name : kotlin.String = name_example // kotlin.String | #### Search for branded food items using a general food name keyword. This does not have to exactly match the \"official\" name for the food.  **Example** > ```&name=Starburst``` 
val limit : kotlin.Int = 56 // kotlin.Int | #### Set maximum number of records you want the API to return. The default value is \"**10**.\"  **Example** > ```&limit=10``` 
val page : kotlin.Int = 56 // kotlin.Int | #### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` 
val userId : kotlin.String = userId_example // kotlin.String | #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` 
try {
    val result : BrandedFoodObject = apiInstance.foodBrandedNamePhpGet(name, limit, page, userId)
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
 **name** | **kotlin.String**| #### Search for branded food items using a general food name keyword. This does not have to exactly match the \&quot;official\&quot; name for the food.  **Example** &gt; &#x60;&#x60;&#x60;&amp;name&#x3D;Starburst&#x60;&#x60;&#x60;  |
 **limit** | **kotlin.Int**| #### Set maximum number of records you want the API to return. The default value is \&quot;**10**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;limit&#x3D;10&#x60;&#x60;&#x60;  | [optional] [enum: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 **page** | **kotlin.Int**| #### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \&quot;**1**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;page&#x3D;1&#x60;&#x60;&#x60;  | [optional]
 **userId** | **kotlin.String**| #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn&#x27;t have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** &gt; &#x60;&#x60;&#x60;&amp;user_id&#x3D;fehef8w4ha&#x60;&#x60;&#x60;  | [optional]

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodBrandedSearchPhpGet"></a>
# **foodBrandedSearchPhpGet**
> BrandedFoodObject foodBrandedSearchPhpGet(allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page, userId)

Get data for branded food items using various search parameters

## Search for branded food items using various parameters.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/search.php?api_key&#x3D;API_KEY&amp;brand&#x3D;BRAND&amp;country&#x3D;COUNTRY&amp;page&#x3D;1&#x60;&#x60;&#x60;  **Tips**    * Get started by using the **[Query Builder](https://chompthis.com/api/build.php)**.  &gt; This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren&#x27;t sure how to upgrade your subscription. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val allergen : kotlin.String = allergen_example // kotlin.String | #### Filter the search to only include branded foods that contain a specific allergen.  **Example** > ```&allergen=Peanuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
val brand : kotlin.String = brand_example // kotlin.String | #### Filter the search to only include branded foods that are owned by a specific brand.  **Example** > ```&brand=Starbucks``` 
val category : kotlin.String = category_example // kotlin.String | #### Filter the search to only include branded foods from a specific category.  **Example** > ```&category=Plant Based Foods``` 
val country : kotlin.String = country_example // kotlin.String | #### Filter the search to only include branded foods that are sold in a specific country.  **Example** > ```&country=United States```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
val diet : kotlin.String = diet_example // kotlin.String | #### Filter the search to only include branded foods that are considered compatible with a specific diet.  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
val ingredient : kotlin.String = ingredient_example // kotlin.String | #### Filter the search to only include branded foods that contain a specific ingredient.  **Example** > ```&ingredient=Salt``` 
val keyword : kotlin.String = keyword_example // kotlin.String | #### Filter the search to only include branded foods that are associated with a specific keyword.  **Example** > ```&keyword=Organic```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
val mineral : kotlin.String = mineral_example // kotlin.String | #### Filter the search to only include branded foods that contain a specific mineral.  **Example** > ```&mineral=Potassium``` 
val nutrient : kotlin.String = nutrient_example // kotlin.String | #### Filter the search to only include branded foods that contain a specific nutrient.  **Example** > ```&nutrient=Caffeine```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
val palmOil : kotlin.String = palmOil_example // kotlin.String | #### Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  **Example** > ```&palm_oil=E160a Beta Carotene``` 
val trace : kotlin.String = trace_example // kotlin.String | ### Filter the search to only include branded foods that contain a specific trace ingredient.  **Example** > ```&trace=Tree Nuts```  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter. 
val vitamin : kotlin.String = vitamin_example // kotlin.String | #### Filter the search to only include branded foods that contain a specific vitamin.  **Example** > ```&vitamin=Biotin``` 
val limit : kotlin.Int = 56 // kotlin.Int | #### Set maximum number of records you want the API to return. The default value is \"**10**.\"  **Example** > ```&limit=10``` 
val page : kotlin.Int = 56 // kotlin.Int | #### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` 
val userId : kotlin.String = userId_example // kotlin.String | #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` 
try {
    val result : BrandedFoodObject = apiInstance.foodBrandedSearchPhpGet(allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page, userId)
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
 **allergen** | **kotlin.String**| #### Filter the search to only include branded foods that contain a specific allergen.  **Example** &gt; &#x60;&#x60;&#x60;&amp;allergen&#x3D;Peanuts&#x60;&#x60;&#x60;  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter.  | [optional]
 **brand** | **kotlin.String**| #### Filter the search to only include branded foods that are owned by a specific brand.  **Example** &gt; &#x60;&#x60;&#x60;&amp;brand&#x3D;Starbucks&#x60;&#x60;&#x60;  | [optional]
 **category** | **kotlin.String**| #### Filter the search to only include branded foods from a specific category.  **Example** &gt; &#x60;&#x60;&#x60;&amp;category&#x3D;Plant Based Foods&#x60;&#x60;&#x60;  | [optional]
 **country** | **kotlin.String**| #### Filter the search to only include branded foods that are sold in a specific country.  **Example** &gt; &#x60;&#x60;&#x60;&amp;country&#x3D;United States&#x60;&#x60;&#x60;  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter.  | [optional]
 **diet** | **kotlin.String**| #### Filter the search to only include branded foods that are considered compatible with a specific diet.  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter.  | [optional] [enum: Vegan, Vegetarian, Gluten Free]
 **ingredient** | **kotlin.String**| #### Filter the search to only include branded foods that contain a specific ingredient.  **Example** &gt; &#x60;&#x60;&#x60;&amp;ingredient&#x3D;Salt&#x60;&#x60;&#x60;  | [optional]
 **keyword** | **kotlin.String**| #### Filter the search to only include branded foods that are associated with a specific keyword.  **Example** &gt; &#x60;&#x60;&#x60;&amp;keyword&#x3D;Organic&#x60;&#x60;&#x60;  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter.  | [optional]
 **mineral** | **kotlin.String**| #### Filter the search to only include branded foods that contain a specific mineral.  **Example** &gt; &#x60;&#x60;&#x60;&amp;mineral&#x3D;Potassium&#x60;&#x60;&#x60;  | [optional]
 **nutrient** | **kotlin.String**| #### Filter the search to only include branded foods that contain a specific nutrient.  **Example** &gt; &#x60;&#x60;&#x60;&amp;nutrient&#x3D;Caffeine&#x60;&#x60;&#x60;  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter.  | [optional]
 **palmOil** | **kotlin.String**| #### Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  **Example** &gt; &#x60;&#x60;&#x60;&amp;palm_oil&#x3D;E160a Beta Carotene&#x60;&#x60;&#x60;  | [optional]
 **trace** | **kotlin.String**| ### Filter the search to only include branded foods that contain a specific trace ingredient.  **Example** &gt; &#x60;&#x60;&#x60;&amp;trace&#x3D;Tree Nuts&#x60;&#x60;&#x60;  **Important Note**: This parameter cannot be used alone. It must be paired with at least 1 additional parameter.  | [optional]
 **vitamin** | **kotlin.String**| #### Filter the search to only include branded foods that contain a specific vitamin.  **Example** &gt; &#x60;&#x60;&#x60;&amp;vitamin&#x3D;Biotin&#x60;&#x60;&#x60;  | [optional]
 **limit** | **kotlin.Int**| #### Set maximum number of records you want the API to return. The default value is \&quot;**10**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;limit&#x3D;10&#x60;&#x60;&#x60;  | [optional] [enum: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 **page** | **kotlin.Int**| #### This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on. The default value is \&quot;**1**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;page&#x3D;1&#x60;&#x60;&#x60;  | [optional]
 **userId** | **kotlin.String**| #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn&#x27;t have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** &gt; &#x60;&#x60;&#x60;&amp;user_id&#x3D;fehef8w4ha&#x60;&#x60;&#x60;  | [optional]

### Return type

[**BrandedFoodObject**](BrandedFoodObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="foodIngredientSearchPhpGet"></a>
# **foodIngredientSearchPhpGet**
> IngredientObject foodIngredientSearchPhpGet(find, limit, userId)

Get raw/generic food ingredient item(s)

## Get data for a specific ingredient or a specific set of ingredients.  **You must have a Food API key to use this endpoint.** Get a [Food API key](https://chompthis.com/api/).  **Example #1: Single Ingredient** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;raw broccoli&#x60;&#x60;&#x60;  **Example #2: Set of Ingredients** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;raw broccoli,mashed potatoes,chicken drumstick&#x60;&#x60;&#x60;  **Tips**   * Expose ingredient endpoints by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  &gt; This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren&#x27;t sure how to upgrade your subscription. 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val find : kotlin.String = find_example // kotlin.String | Search our database for a single ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** > ```&find=raw broccoli```  **Example #2: Set of Ingredients** > ```&find=raw broccoli,buttermilk waffle,mashed potatoes```  **Important Notes**    * Comma-separated lists cannot contain more than **10 ingredients**. You must perform additional API calls if you are looking up more than 10 ingredients. 
val limit : kotlin.Int = 56 // kotlin.Int | #### Set maximum number of records you want the API to return, per search term. The default value is \"**1**.\"  **Example** > ```&limit=3``` 
val userId : kotlin.String = userId_example // kotlin.String | #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` 
try {
    val result : IngredientObject = apiInstance.foodIngredientSearchPhpGet(find, limit, userId)
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
 **find** | **kotlin.String**| Search our database for a single ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** &gt; &#x60;&#x60;&#x60;&amp;find&#x3D;raw broccoli&#x60;&#x60;&#x60;  **Example #2: Set of Ingredients** &gt; &#x60;&#x60;&#x60;&amp;find&#x3D;raw broccoli,buttermilk waffle,mashed potatoes&#x60;&#x60;&#x60;  **Important Notes**    * Comma-separated lists cannot contain more than **10 ingredients**. You must perform additional API calls if you are looking up more than 10 ingredients.  |
 **limit** | **kotlin.Int**| #### Set maximum number of records you want the API to return, per search term. The default value is \&quot;**1**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;limit&#x3D;3&#x60;&#x60;&#x60;  | [optional] [enum: 1, 2, 3]
 **userId** | **kotlin.String**| #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn&#x27;t have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** &gt; &#x60;&#x60;&#x60;&amp;user_id&#x3D;fehef8w4ha&#x60;&#x60;&#x60;  | [optional]

### Return type

[**IngredientObject**](IngredientObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="recipeIdPhpGet"></a>
# **recipeIdPhpGet**
> RecipeObject recipeIdPhpGet(id, userId)

Get a recipe by ID

## Get a specific recipe using an ID.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/id.php?api_key&#x3D;API_KEY&amp;id&#x3D;RECIPE_ID&#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | #### A recipe ID. Recipe IDs are exposed in the /recipe/search and /recipe/ingredient endpoints.  **Example** > ```&list=tdm_1143_0459d0028fcf8990724785b9e6775037``` 
val userId : kotlin.String = userId_example // kotlin.String | #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` 
try {
    val result : RecipeObject = apiInstance.recipeIdPhpGet(id, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#recipeIdPhpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#recipeIdPhpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| #### A recipe ID. Recipe IDs are exposed in the /recipe/search and /recipe/ingredient endpoints.  **Example** &gt; &#x60;&#x60;&#x60;&amp;list&#x3D;tdm_1143_0459d0028fcf8990724785b9e6775037&#x60;&#x60;&#x60;  |
 **userId** | **kotlin.String**| #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn&#x27;t have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** &gt; &#x60;&#x60;&#x60;&amp;user_id&#x3D;fehef8w4ha&#x60;&#x60;&#x60;  | [optional]

### Return type

[**RecipeObject**](RecipeObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="recipeIngredientPhpGet"></a>
# **recipeIngredientPhpGet**
> RecipeObject recipeIngredientPhpGet(list, limit, page, userId)

Get recipes using a list of ingredients

## Get recipes that include all ingredients from a list.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example #1** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/ingredient.php?api_key&#x3D;API_KEY&amp;list&#x3D;INGREDIENT&#x60;&#x60;&#x60;  **Example #2** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/ingredient.php?api_key&#x3D;API_KEY&amp;list&#x3D;INGREDIENT,INGREDIENT,INGREDIENT&#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val list : kotlin.String = list_example // kotlin.String | #### A single ingredient, or a comma-separated list of up to 3 ingredients. Recipes with each of these ingredients will be returned. **You can pass in up to 3 ingredients at a time.**  **Example** > ```&list=cheese,tomato,milk``` 
val limit : kotlin.Int = 56 // kotlin.Int | #### Set maximum number of records you want the API to return. The default value is \"**3**.\"  **Example** > ```&limit=3``` 
val page : kotlin.Int = 56 // kotlin.Int | #### This is how you paginate the search result. By default, you will see the first 3 records. You must increment the page number to access the next 3 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` 
val userId : kotlin.String = userId_example // kotlin.String | #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` 
try {
    val result : RecipeObject = apiInstance.recipeIngredientPhpGet(list, limit, page, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#recipeIngredientPhpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#recipeIngredientPhpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **list** | **kotlin.String**| #### A single ingredient, or a comma-separated list of up to 3 ingredients. Recipes with each of these ingredients will be returned. **You can pass in up to 3 ingredients at a time.**  **Example** &gt; &#x60;&#x60;&#x60;&amp;list&#x3D;cheese,tomato,milk&#x60;&#x60;&#x60;  |
 **limit** | **kotlin.Int**| #### Set maximum number of records you want the API to return. The default value is \&quot;**3**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;limit&#x3D;3&#x60;&#x60;&#x60;  | [optional] [enum: 1, 2, 3]
 **page** | **kotlin.Int**| #### This is how you paginate the search result. By default, you will see the first 3 records. You must increment the page number to access the next 3 records, and so on. The default value is \&quot;**1**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;page&#x3D;1&#x60;&#x60;&#x60;  | [optional]
 **userId** | **kotlin.String**| #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn&#x27;t have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** &gt; &#x60;&#x60;&#x60;&amp;user_id&#x3D;fehef8w4ha&#x60;&#x60;&#x60;  | [optional]

### Return type

[**RecipeObject**](RecipeObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="recipeRandomPhpGet"></a>
# **recipeRandomPhpGet**
> RecipeObject recipeRandomPhpGet(limit, userId)

Get random popular recipes

## Get random recipes that have instructions and nutrients  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example** &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/random.php?api_key&#x3D;API_KEY&#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val limit : kotlin.Int = 56 // kotlin.Int | #### Set maximum number of records you want the API to return. The default value is \"**5**.\"  **Example** > ```&limit=5``` 
val userId : kotlin.String = userId_example // kotlin.String | #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` 
try {
    val result : RecipeObject = apiInstance.recipeRandomPhpGet(limit, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#recipeRandomPhpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#recipeRandomPhpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| #### Set maximum number of records you want the API to return. The default value is \&quot;**5**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;limit&#x3D;5&#x60;&#x60;&#x60;  | [optional] [enum: 1, 2, 3, 4, 5]
 **userId** | **kotlin.String**| #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn&#x27;t have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** &gt; &#x60;&#x60;&#x60;&amp;user_id&#x3D;fehef8w4ha&#x60;&#x60;&#x60;  | [optional]

### Return type

[**RecipeObject**](RecipeObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="recipeSearchPhpGet"></a>
# **recipeSearchPhpGet**
> RecipeObject recipeSearchPhpGet(title, excludedCuisine, includedCuisine, excludedIngredient, includedIngredient, nutrientsRequired, limit, page, userId)

Get recipes using a title and optional filters

## Get recipes using a title and optional filters.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example**  &gt; &#x60;&#x60;&#x60;https://chompthis.com/api/v2/recipe/search.php?api_key&#x3D;API_KEY&amp;title&#x3D;TITLE&#x60;&#x60;&#x60; 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val title : kotlin.String = title_example // kotlin.String | #### A recipe title  **Example** > ```&title=Banana Bread``` 
val excludedCuisine : kotlin.String = excludedCuisine_example // kotlin.String | #### A specific cuisine you want excluded from results  **Example** > ```&excluded_cuisine=Italian``` 
val includedCuisine : kotlin.String = includedCuisine_example // kotlin.String | #### A specific cuisine you want included in results  **Example** > ```&included_cuisine=Chinese``` 
val excludedIngredient : kotlin.String = excludedIngredient_example // kotlin.String | #### Recipes with this ingredient will be excluded from results  **Example** > ```&excluded_ingredient=egg``` 
val includedIngredient : kotlin.String = includedIngredient_example // kotlin.String | #### Only recipes with this ingredient will be returned  **Example** > ```&included_ingredient=apple``` 
val nutrientsRequired : kotlin.Int = 56 // kotlin.Int | #### Optionally require all recipes to include nutrition info. Recipes with, or without, nutrition info are returned by default.  **Example** > ```&nutrients_required=1``` 
val limit : kotlin.Int = 56 // kotlin.Int | #### Set maximum number of records you want the API to return. The default value is \"**5**.\"  **Example** > ```&limit=3``` 
val page : kotlin.Int = 56 // kotlin.Int | #### This is how you paginate the search result. By default, you will see the first 5 records. You must increment the page number to access the next 5 records, and so on. The default value is \"**1**.\"  **Example** > ```&page=1``` 
val userId : kotlin.String = userId_example // kotlin.String | #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn't have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** > ```&user_id=fehef8w4ha``` 
try {
    val result : RecipeObject = apiInstance.recipeSearchPhpGet(title, excludedCuisine, includedCuisine, excludedIngredient, includedIngredient, nutrientsRequired, limit, page, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#recipeSearchPhpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#recipeSearchPhpGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **title** | **kotlin.String**| #### A recipe title  **Example** &gt; &#x60;&#x60;&#x60;&amp;title&#x3D;Banana Bread&#x60;&#x60;&#x60;  |
 **excludedCuisine** | **kotlin.String**| #### A specific cuisine you want excluded from results  **Example** &gt; &#x60;&#x60;&#x60;&amp;excluded_cuisine&#x3D;Italian&#x60;&#x60;&#x60;  | [optional]
 **includedCuisine** | **kotlin.String**| #### A specific cuisine you want included in results  **Example** &gt; &#x60;&#x60;&#x60;&amp;included_cuisine&#x3D;Chinese&#x60;&#x60;&#x60;  | [optional]
 **excludedIngredient** | **kotlin.String**| #### Recipes with this ingredient will be excluded from results  **Example** &gt; &#x60;&#x60;&#x60;&amp;excluded_ingredient&#x3D;egg&#x60;&#x60;&#x60;  | [optional]
 **includedIngredient** | **kotlin.String**| #### Only recipes with this ingredient will be returned  **Example** &gt; &#x60;&#x60;&#x60;&amp;included_ingredient&#x3D;apple&#x60;&#x60;&#x60;  | [optional]
 **nutrientsRequired** | **kotlin.Int**| #### Optionally require all recipes to include nutrition info. Recipes with, or without, nutrition info are returned by default.  **Example** &gt; &#x60;&#x60;&#x60;&amp;nutrients_required&#x3D;1&#x60;&#x60;&#x60;  | [optional] [enum: 1, 0]
 **limit** | **kotlin.Int**| #### Set maximum number of records you want the API to return. The default value is \&quot;**5**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;limit&#x3D;3&#x60;&#x60;&#x60;  | [optional] [enum: 1, 2, 3, 4, 5]
 **page** | **kotlin.Int**| #### This is how you paginate the search result. By default, you will see the first 5 records. You must increment the page number to access the next 5 records, and so on. The default value is \&quot;**1**.\&quot;  **Example** &gt; &#x60;&#x60;&#x60;&amp;page&#x3D;1&#x60;&#x60;&#x60;  | [optional]
 **userId** | **kotlin.String**| #### **Only required for Premium subscribers.** The unique identifier assigned to each user on your platform. This can be any string of letters or numbers and doesn&#x27;t have to relate to your own database. [Learn more](https://desk.zoho.com/portal/chompthis/en/kb/articles/monthly-active-users)  **Example** &gt; &#x60;&#x60;&#x60;&amp;user_id&#x3D;fehef8w4ha&#x60;&#x60;&#x60;  | [optional]

### Return type

[**RecipeObject**](RecipeObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

