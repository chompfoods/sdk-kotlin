/**
* Chomp Food Database API Documentation
* ## Important An **[API key](https://chompthis.com/api/)** is required for access to this API. Get yours at **[https://chompthis.com/api](https://chompthis.com/api/)**.  ### Getting Started   * **[Subscribe](https://chompthis.com/api/#pricing)** to the API.   * Scroll down and click the \"**Authorize**\" button.   * Enter your API key into the \"**value**\" input, click the \"**Authorize**\" button, then click the \"**Close**\" button.   * Scroll down to the section titled \"**default**\" and click on the API endpoint you wish to use.   * Click the \"**Try it out**\" button.   * Enter the information the endpoint requires.   * Click the \"**Execute**\" button.  ### Example    * Branded food response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/branded-food-response-object.json)**   * Ingredient response object: **[View example &raquo;](https://raw.githubusercontent.com/chompfoods/examples/master/ingredient-response-object.json)**  ### How Do I Find My API Key?   * Your API key was sent to the email address you used to create your subscription.   * You will also find your API key in the **[Client Center](https://chompthis.com/api/manage.php)**.   * Read **[this article](https://desk.zoho.com/portal/chompthis/kb/articles/how-do-i-find-my-api-key)** for more information.  ||| | ------- | -------- | | [Knowledge Base](https://desk.zoho.com/portal/chompthis/kb/chomp) | [Pricing](https://chompthis.com/api/) | | [Attribution](https://chompthis.com/api/docs/attribution.php) | [Cost Calculator](https://chompthis.com/api/cost-calculator.php) | | [Terms & License](https://chompthis.com/api/terms.php) | [Database Search](https://chompthis.com/api/lookup.php) | | [Support](https://chompthis.com/api/ticket-new.php) | [Query Builder](https://chompthis.com/api/build.php) | | [Client Center](https://chompthis.com/api/manage.php) | | 
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
 * An object containing information on this item's compatibility with Gluten Free diets
 * @param name Diet name
 * @param isCompatible Boolean describing if this item is compatible with this diet
 * @param compatibilityLevel Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility
 * @param confidence Boolean that indicates if we are confident in how this item is graded for this diet
 * @param confidenceDescription Description of our confidence that this item was graded correctly
 */
data class BrandedFoodObjectDietLabelsGlutenFree (

    /* Diet name */
    val name: kotlin.String? = null,
    /* Boolean describing if this item is compatible with this diet */
    val isCompatible: kotlin.Boolean? = null,
    /* Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility */
    val compatibilityLevel: kotlin.Int? = null,
    /* Boolean that indicates if we are confident in how this item is graded for this diet */
    val confidence: kotlin.Int? = null,
    /* Description of our confidence that this item was graded correctly */
    val confidenceDescription: kotlin.String? = null
) {
}