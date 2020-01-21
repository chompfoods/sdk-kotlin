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
 * An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet
 * @param ingredient Ingredient name
 * @param ingredientDescription Description of the ingredient
 * @param dietLabel Name of the diet with which this ingredient may not be compatible
 * @param isCompatible A description of if we believe this ingredient is compatible with the diet
 * @param compatibilityLevel A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility
 * @param compatibilityDescription A description of how we graded this ingredient for compatibility with the diet
 * @param isAllergen Boolean representing if the ingredient is a known allergen
 */
data class BrandedFoodObjectDietFlags (

    /* Ingredient name */
    val ingredient: kotlin.String? = null,
    /* Description of the ingredient */
    val ingredientDescription: kotlin.String? = null,
    /* Name of the diet with which this ingredient may not be compatible */
    val dietLabel: kotlin.String? = null,
    /* A description of if we believe this ingredient is compatible with the diet */
    val isCompatible: kotlin.String? = null,
    /* A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility */
    val compatibilityLevel: kotlin.Int? = null,
    /* A description of how we graded this ingredient for compatibility with the diet */
    val compatibilityDescription: kotlin.String? = null,
    /* Boolean representing if the ingredient is a known allergen */
    val isAllergen: kotlin.Boolean? = null
) {
}