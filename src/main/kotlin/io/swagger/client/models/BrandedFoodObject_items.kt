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

import io.swagger.client.models.BrandedFoodObjectCalorieConversionFactor
import io.swagger.client.models.BrandedFoodObjectComponents
import io.swagger.client.models.BrandedFoodObjectCountryDetails
import io.swagger.client.models.BrandedFoodObjectDietFlags
import io.swagger.client.models.BrandedFoodObjectDietLabels
import io.swagger.client.models.BrandedFoodObjectIngredients
import io.swagger.client.models.BrandedFoodObjectNutrients
import io.swagger.client.models.BrandedFoodObjectPackage
import io.swagger.client.models.BrandedFoodObjectPackagingPhotos
import io.swagger.client.models.BrandedFoodObjectPortions
import io.swagger.client.models.BrandedFoodObjectServing

/**
 * An object containing information for this specific item.
 * @param barcode EAN/UPC barcode
 * @param name Item name as provided by brand owner or as shown on packaging
 * @param brand The brand name that owns this item
 * @param ingredients 
 * @param &#x60;package&#x60; 
 * @param serving 
 * @param categories 
 * @param nutrients 
 * @param calorieConversionFactor 
 * @param proteinConversionFactor The multiplication factor used to calculate protein from nitrogen
 * @param dietLabels 
 * @param dietFlags An array of ingredient objects that were flagged while grading this item for compatibility with each diet
 * @param packagingPhotos 
 * @param components An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
 * @param portions An array of objects containing information on discrete amounts of a food found in this item
 * @param allergens An array of ingredients in this item that may cause allergic reactions in people
 * @param brandList An array of brands we have associated with this item. Some items are sold by more than 1 brand.
 * @param countries An array of countries where this item is sold
 * @param countryDetails 
 * @param palmOilIngredients An array of ingredients made from palm oil
 * @param ingredientList An array of this item's ingredients
 * @param hasEnglishIngredients A boolean indicating if we have English ingredients for this item
 * @param minerals An array of minerals that this item contains
 * @param traces An array of trace ingredients that may be found in this item
 * @param vitamins An array of vitamins that are found in this item
 * @param commonNames An array containing other names commonly associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" a common name may be \"Chicken enchilada\")
 * @param description A description of this item
 * @param keywords An array of keywords that can be used to describe this item
 * @param footnote Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.
 */
data class BrandedFoodObjectItems (

    /* EAN/UPC barcode */
    val barcode: kotlin.String? = null,
    /* Item name as provided by brand owner or as shown on packaging */
    val name: kotlin.String? = null,
    /* The brand name that owns this item */
    val brand: kotlin.String? = null,
    val ingredients: BrandedFoodObjectIngredients? = null,
    val `package`: BrandedFoodObjectPackage? = null,
    val serving: BrandedFoodObjectServing? = null,
    val categories: kotlin.Array<kotlin.String>? = null,
    val nutrients: BrandedFoodObjectNutrients? = null,
    val calorieConversionFactor: BrandedFoodObjectCalorieConversionFactor? = null,
    /* The multiplication factor used to calculate protein from nitrogen */
    val proteinConversionFactor: java.math.BigDecimal? = null,
    val dietLabels: BrandedFoodObjectDietLabels? = null,
    /* An array of ingredient objects that were flagged while grading this item for compatibility with each diet */
    val dietFlags: kotlin.Array<BrandedFoodObjectDietFlags>? = null,
    val packagingPhotos: BrandedFoodObjectPackagingPhotos? = null,
    /* An array of objects containing the constituent parts of a food (e.g. bone is a component of meat) */
    val components: kotlin.Array<BrandedFoodObjectComponents>? = null,
    /* An array of objects containing information on discrete amounts of a food found in this item */
    val portions: kotlin.Array<BrandedFoodObjectPortions>? = null,
    /* An array of ingredients in this item that may cause allergic reactions in people */
    val allergens: kotlin.Array<kotlin.String>? = null,
    /* An array of brands we have associated with this item. Some items are sold by more than 1 brand. */
    val brandList: kotlin.Array<kotlin.String>? = null,
    /* An array of countries where this item is sold */
    val countries: kotlin.Array<kotlin.String>? = null,
    val countryDetails: BrandedFoodObjectCountryDetails? = null,
    /* An array of ingredients made from palm oil */
    val palmOilIngredients: kotlin.Array<kotlin.String>? = null,
    /* An array of this item's ingredients */
    val ingredientList: kotlin.Array<kotlin.String>? = null,
    /* A boolean indicating if we have English ingredients for this item */
    val hasEnglishIngredients: kotlin.Boolean? = null,
    /* An array of minerals that this item contains */
    val minerals: kotlin.Array<kotlin.String>? = null,
    /* An array of trace ingredients that may be found in this item */
    val traces: kotlin.Array<kotlin.String>? = null,
    /* An array of vitamins that are found in this item */
    val vitamins: kotlin.Array<kotlin.String>? = null,
    /* An array containing other names commonly associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" a common name may be \"Chicken enchilada\") */
    val commonNames: kotlin.Array<kotlin.String>? = null,
    /* A description of this item */
    val description: kotlin.String? = null,
    /* An array of keywords that can be used to describe this item */
    val keywords: kotlin.Array<kotlin.String>? = null,
    /* Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall. */
    val footnote: kotlin.String? = null
) {
}