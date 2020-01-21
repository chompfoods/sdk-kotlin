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
package io.swagger.client.models


/**
 * 
 * @param id Nutrient ID
 * @param name Nutrient name
 * @param per100g Amount of the nutrient per 100g of food
 * @param measurementUnit The unit used for the measure of this nutrient
 * @param min Minimum nutrient value
 * @param max Maximum nutrient value
 * @param median Median nutrient value
 * @param rank Nutrient rank
 * @param dataPoints Number of observations on which the value is based
 * @param footnote Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.
 * @param description Description of the nutrient source
 */
data class BrandedFoodObjectNutrientsUsda (

    /* Nutrient ID */
    val id: kotlin.Int? = null,
    /* Nutrient name */
    val name: kotlin.String? = null,
    /* Amount of the nutrient per 100g of food */
    val per100g: java.math.BigDecimal? = null,
    /* The unit used for the measure of this nutrient */
    val measurementUnit: kotlin.String? = null,
    /* Minimum nutrient value */
    val min: java.math.BigDecimal? = null,
    /* Maximum nutrient value */
    val max: java.math.BigDecimal? = null,
    /* Median nutrient value */
    val median: java.math.BigDecimal? = null,
    /* Nutrient rank */
    val rank: kotlin.Int? = null,
    /* Number of observations on which the value is based */
    val dataPoints: kotlin.Int? = null,
    /* Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected. */
    val footnote: kotlin.String? = null,
    /* Description of the nutrient source */
    val description: kotlin.String? = null
) {
}