# IngredientObjectItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**kotlin.String**](.md) | Item name as provided by brand owner or as shown on packaging |  [optional]
**categories** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**nutrients** | [**kotlin.Array&lt;IngredientObjectNutrients&gt;**](IngredientObjectNutrients.md) | An array containing nutrient informatio objects for this food item |  [optional]
**calorieConversionFactor** | [**IngredientObjectCalorieConversionFactor**](IngredientObjectCalorieConversionFactor.md) |  |  [optional]
**proteinConversionFactor** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The multiplication factor used to calculate protein from nitrogen |  [optional]
**components** | [**kotlin.Array&lt;IngredientObjectComponents&gt;**](IngredientObjectComponents.md) | An array of objects containing the constituent parts of a food (e.g. bone is a component of meat) |  [optional]
**portions** | [**kotlin.Array&lt;IngredientObjectPortions&gt;**](IngredientObjectPortions.md) | An array of objects containing information on discrete amounts of a food found in this item |  [optional]
**commonName** | [**kotlin.String**](.md) | Common name associated with this item. These generally clarify what the item is (e.g. when the brand name is \&quot;BRAND&#x27;s Spicy Enchilada\&quot; the common name may be \&quot;Chicken enchilada\&quot;) |  [optional]
**footnote** | [**kotlin.String**](.md) | Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall. |  [optional]
