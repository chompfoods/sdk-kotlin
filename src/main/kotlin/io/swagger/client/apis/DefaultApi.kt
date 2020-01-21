/**
* Chomp Food Database API Documentation
* __Important:__   - An __[API key](https://chompthis.com/api/)__ is required for access to this API.   - Get yours at __[https://chompthis.com/api](https://chompthis.com/api/)__.  -----  __Getting Started:__   - __[Subscribe](https://chompthis.com/api/#pricing)__ to the API.   - Scroll down and click the \"__Authorize__\" button.   - Enter your API key into the \"__value__\" input, click the \"__Authorize__\" button, then click the \"__Close__\" button.   - Scroll down to the section titled \"__default__\" and click on the API endpoint you wish to use.   - Click the \"__Try it out__\" button.   - Enter the information the endpoint requires.   - Click the \"__Execute__\" button.  __Example:__    - Branded Food: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)__ API response object.   - Ingredient: __[View example](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)__ API response object.  -----  __How Do I Find My API Key?__   - Your API key was sent to the email address you used to create your subscription.   - You will also find your API key in the __[Client Center](https://chompthis.com/api/manage.php)__.   - _Read __[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)__ for more information._  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
*
* OpenAPI spec version: 1.0.0-oas3
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.apis

import io.swagger.client.models.BrandedFoodObject
import io.swagger.client.models.IngredientObject

import io.swagger.client.infrastructure.*

class DefaultApi(basePath: kotlin.String = "https://chompthis.com/api/v2") : ApiClient(basePath) {

    /**
     * Get a branded food item using a barcode
     * # Get data for a branded food using the food&#x27;s UPC/EAN barcode.  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/barcode.php?api_key&#x3D;API_KEY&amp;code&#x3D;CODE&#x60;&#x60;&#x60; 
     * @param code UPC/EAN barcode  __Example:__ &amp;code&#x3D;0842234000988  __Tips:__    - Use our [food lookup tool](https://chompthis.com/api/lookup.php).   - Read [this article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do) for general tips and tricks.  
     * @return BrandedFoodObject
     */
    @Suppress("UNCHECKED_CAST")
    fun foodBrandedBarcodePhpGet(code: kotlin.String): BrandedFoodObject {
        val localVariableQuery: MultiValueMap = mapOf("code" to listOf("$code"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/food/branded/barcode.php", query = localVariableQuery
        )
        val response = request<BrandedFoodObject>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as BrandedFoodObject
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
     * Get a branded food item using an ID number
     * # Get data for a branded food using Chomp&#x27;s internal ID number.  _Alternatively, set the \&quot;source\&quot; parameter to \&quot;USDA\&quot; and use the food&#x27;s FDC ID._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/id.php?api_key&#x3D;API_KEY&amp;id&#x3D;ID&#x60;&#x60;&#x60; 
     * @param id The ID number of a branded food item.  __Example #1:__ &amp;id&#x3D;15  __Example #2:__ &amp;id&#x3D;FDC_ID&amp;source&#x3D;USDA  ___Tip:__ Get started by using our  [ood lookup tool](https://chompthis.com/api/lookup.php)._  
     * @param source Configure the endpoint to accept food IDs from various data sources. This endpoint defaults to Chomp but can accept FDC IDs.  __Example:__ &amp;source&#x3D;Chomp  ___Important Note:__ Pass in &amp;source&#x3D;USDA if you want to look up food items using a USDA FDC ID._  (optional)
     * @return BrandedFoodObject
     */
    @Suppress("UNCHECKED_CAST")
    fun foodBrandedIdPhpGet(id: kotlin.Int, source: kotlin.String? = null): BrandedFoodObject {
        val localVariableQuery: MultiValueMap = mapOf("id" to listOf("$id"), "source" to listOf("$source"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/food/branded/id.php", query = localVariableQuery
        )
        val response = request<BrandedFoodObject>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as BrandedFoodObject
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
     * Get a branded food item by name
     * # Search for branded food items by name.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren&#x27;t sure how to upgrade your subscription._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/name.php?api_key&#x3D;API_KEY&amp;name&#x3D;NAME&#x60;&#x60;&#x60; 
     * @param name Search for branded food items using a general food name keyword. This does not have to exactly match the \&quot;official\&quot; name for the food.  __Example:__ &amp;name&#x3D;Starburst  ___Tip:__ Get started by using our [food lookup tool](https://chompthis.com/api/lookup.php)._  
     * @param limit Set maximum number of records you want the API to return.  __Example:__ &amp;limit&#x3D;10  (optional)
     * @param page This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &amp;page&#x3D;1  (optional)
     * @return BrandedFoodObject
     */
    @Suppress("UNCHECKED_CAST")
    fun foodBrandedNamePhpGet(name: kotlin.String, limit: kotlin.Int? = null, page: kotlin.Int? = null): BrandedFoodObject {
        val localVariableQuery: MultiValueMap = mapOf("name" to listOf("$name"), "limit" to listOf("$limit"), "page" to listOf("$page"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/food/branded/name.php", query = localVariableQuery
        )
        val response = request<BrandedFoodObject>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as BrandedFoodObject
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
     * Get data for branded food items using various search parameters
     * # Search for branded food items using various parameters.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren&#x27;t sure how to upgrade your subscription._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/food/branded/search.php?api_key&#x3D;API_KEY&amp;brand&#x3D;BRAND&amp;country&#x3D;COUNTRY&amp;page&#x3D;1&#x60;&#x60;&#x60;  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ 
     * @param allergen Filter the search to only include branded foods that contain a specific allergen.  __Example__: &amp;allergen&#x3D;Peanuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  (optional)
     * @param brand Filter the search to only include branded foods that are owned by a specific brand.  __Example__: &amp;brand&#x3D;Starbucks  (optional)
     * @param category Filter the search to only include branded foods from a specific category.  __Example__: &amp;category&#x3D;Plant Based Foods  (optional)
     * @param country Filter the search to only include branded foods that are sold in a specific country.  __Example__: &amp;country&#x3D;United States  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  (optional)
     * @param diet Filter the search to only include branded foods that are considered compatible with a specific diet.  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  (optional)
     * @param ingredient Filter the search to only include branded foods that contain a specific ingredient.  __Example__: &amp;ingredient&#x3D;Salt  (optional)
     * @param keyword Filter the search to only include branded foods that are associated with a specific keyword.  __Example__: &amp;keyword&#x3D;Organic  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  (optional)
     * @param mineral Filter the search to only include branded foods that contain a specific mineral.  __Example__: &amp;mineral&#x3D;Potassium  (optional)
     * @param nutrient Filter the search to only include branded foods that contain a specific nutrient.  __Example__: &amp;nutrient&#x3D;Caffeine  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  (optional)
     * @param palmOil Filter the search to only include branded foods that contain a specific ingredient made using palm oil.  __Example__: &amp;palm_oil&#x3D;E160a Beta Carotene  (optional)
     * @param trace Filter the search to only include branded foods that contain a specific trace ingredient.  __Example__: &amp;trace&#x3D;Tree Nuts  ___Important Note:__ This parameter cannot be used alone. It must be paired with at least 1 additional parameter._  (optional)
     * @param vitamin Filter the search to only include branded foods that contain a specific vitamin.  __Example__: &amp;vitamin&#x3D;Biotin  (optional)
     * @param limit Set maximum number of records you want the API to return.  __Example:__ &amp;limit&#x3D;10  (optional)
     * @param page This is how you paginate the search result. By default, you will see the first 10 records. You must increment the page number to access the next 10 records, and so on.  __Example__: &amp;page&#x3D;1  (optional)
     * @return BrandedFoodObject
     */
    @Suppress("UNCHECKED_CAST")
    fun foodBrandedSearchPhpGet(allergen: kotlin.String? = null, brand: kotlin.String? = null, category: kotlin.String? = null, country: kotlin.String? = null, diet: kotlin.String? = null, ingredient: kotlin.String? = null, keyword: kotlin.String? = null, mineral: kotlin.String? = null, nutrient: kotlin.String? = null, palmOil: kotlin.String? = null, trace: kotlin.String? = null, vitamin: kotlin.String? = null, limit: kotlin.Int? = null, page: kotlin.Int? = null): BrandedFoodObject {
        val localVariableQuery: MultiValueMap = mapOf("allergen" to listOf("$allergen"), "brand" to listOf("$brand"), "category" to listOf("$category"), "country" to listOf("$country"), "diet" to listOf("$diet"), "ingredient" to listOf("$ingredient"), "keyword" to listOf("$keyword"), "mineral" to listOf("$mineral"), "nutrient" to listOf("$nutrient"), "palm_oil" to listOf("$palmOil"), "trace" to listOf("$trace"), "vitamin" to listOf("$vitamin"), "limit" to listOf("$limit"), "page" to listOf("$page"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/food/branded/search.php", query = localVariableQuery
        )
        val response = request<BrandedFoodObject>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as BrandedFoodObject
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
     * Get raw/generic food ingredient item(s)
     * # Get data for a specific ingredient or a specific set of ingredients.  This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. _[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription) if you aren&#x27;t sure how to upgrade your subscription._  __Example:__ &#x60;&#x60;&#x60;https://chompthis.com/api/v2/ingredient/search.php?api_key&#x3D;API_KEY&amp;find&#x3D;STRING/LIST&amp;list&#x3D;BOOLEAN&amp;raw&#x3D;BOOLEAN&#x60;&#x60;&#x60; 
     * @param find Search our database for a single ingredient or a specific set of ingredients.  __Example #1:__ &amp;find&#x3D;broccoli  __Example #2:__ &amp;find&#x3D;broccoli,cauliflower,spinach&amp;list&#x3D;true  __Important List Notes:__    - Set the \&quot;list\&quot; parameter to \&quot;true\&quot; before passing in a comma-separated list of ingredients.   - Comma-separated lists cannot contain more than __15 ingredients__. You must perform additional API calls if you are looking up more than 15 ingredients.  
     * @param list Setting _&amp;list&#x3D;true_ will configure this endpoint to allow searching for ingredients using a comma-separated list. By default, this endpoint will __only__ return results for the first ingredient.  __Example:__ &amp;list&#x3D;true  
     * @param raw Optionally filter the search result to only include raw ingredients.  __Example:__ &amp;raw&#x3D;true  (optional)
     * @param limit Set maximum number of records you want the API to return, per search term.  __Example:__ &amp;limit&#x3D;3  (optional)
     * @return IngredientObject
     */
    @Suppress("UNCHECKED_CAST")
    fun foodIngredientSearchPhpGet(find: kotlin.Int, list: kotlin.Boolean, raw: kotlin.Boolean? = null, limit: kotlin.Int? = null): IngredientObject {
        val localVariableQuery: MultiValueMap = mapOf("find" to listOf("$find"), "list" to listOf("$list"), "raw" to listOf("$raw"), "limit" to listOf("$limit"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/food/ingredient/search.php", query = localVariableQuery
        )
        val response = request<IngredientObject>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as IngredientObject
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
