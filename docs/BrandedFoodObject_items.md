# BrandedFoodObjectItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**barcode** | [**kotlin.String**](.md) | EAN/UPC barcode |  [optional]
**name** | [**kotlin.String**](.md) | Item name as provided by brand owner or as shown on packaging |  [optional]
**brand** | [**kotlin.String**](.md) | The brand name that owns this item |  [optional]
**ingredients** | [**BrandedFoodObjectIngredients**](BrandedFoodObjectIngredients.md) |  |  [optional]
**&#x60;package&#x60;** | [**BrandedFoodObjectPackage**](BrandedFoodObjectPackage.md) |  |  [optional]
**serving** | [**BrandedFoodObjectServing**](BrandedFoodObjectServing.md) |  |  [optional]
**categories** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) |  |  [optional]
**nutrients** | [**BrandedFoodObjectNutrients**](BrandedFoodObjectNutrients.md) |  |  [optional]
**dietLabels** | [**BrandedFoodObjectDietLabels**](BrandedFoodObjectDietLabels.md) |  |  [optional]
**dietFlags** | [**kotlin.Array&lt;BrandedFoodObjectDietFlags&gt;**](BrandedFoodObjectDietFlags.md) | An array of ingredient objects that were flagged while grading this item for compatibility with each diet |  [optional]
**packagingPhotos** | [**BrandedFoodObjectPackagingPhotos**](BrandedFoodObjectPackagingPhotos.md) |  |  [optional]
**allergens** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of ingredients in this item that may cause allergic reactions in people |  [optional]
**brandList** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of brands we have associated with this item. Some items are sold by more than 1 brand. |  [optional]
**countries** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of countries where this item is sold |  [optional]
**countryDetails** | [**BrandedFoodObjectCountryDetails**](BrandedFoodObjectCountryDetails.md) |  |  [optional]
**palmOilIngredients** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of ingredients made from palm oil |  [optional]
**ingredientList** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of this item&#x27;s ingredients |  [optional]
**hasEnglishIngredients** | [**kotlin.Boolean**](.md) | A boolean indicating if we have English ingredients for this item |  [optional]
**minerals** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of minerals that this item contains |  [optional]
**traces** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of trace ingredients that may be found in this item |  [optional]
**vitamins** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of vitamins that are found in this item |  [optional]
**description** | [**kotlin.String**](.md) | A description of this item |  [optional]
**keywords** | [**kotlin.Array&lt;kotlin.String&gt;**](.md) | An array of keywords that can be used to describe this item |  [optional]
