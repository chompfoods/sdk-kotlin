# io.swagger.client - Kotlin client library for Chomp Food Database API Documentation

## Requires

* Kotlin 1.1.2
* Gradle 3.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://chompthis.com/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**foodBrandedBarcodePhpGet**](docs/DefaultApi.md#foodbrandedbarcodephpget) | **GET** /food/branded/barcode.php | Get a branded food item using a barcode
*DefaultApi* | [**foodBrandedIdPhpGet**](docs/DefaultApi.md#foodbrandedidphpget) | **GET** /food/branded/id.php | Get a branded food item using an ID number
*DefaultApi* | [**foodBrandedNamePhpGet**](docs/DefaultApi.md#foodbrandednamephpget) | **GET** /food/branded/name.php | Get a branded food item by name
*DefaultApi* | [**foodBrandedSearchPhpGet**](docs/DefaultApi.md#foodbrandedsearchphpget) | **GET** /food/branded/search.php | Get data for branded food items using various search parameters
*DefaultApi* | [**foodIngredientSearchPhpGet**](docs/DefaultApi.md#foodingredientsearchphpget) | **GET** /food/ingredient/search.php | Get raw/generic food ingredient item(s)

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.BrandedFoodObject](docs/BrandedFoodObject.md)
 - [io.swagger.client.models.BrandedFoodObjectCalorieConversionFactor](docs/BrandedFoodObjectCalorieConversionFactor.md)
 - [io.swagger.client.models.BrandedFoodObjectComponents](docs/BrandedFoodObjectComponents.md)
 - [io.swagger.client.models.BrandedFoodObjectCountryDetails](docs/BrandedFoodObjectCountryDetails.md)
 - [io.swagger.client.models.BrandedFoodObjectDietFlags](docs/BrandedFoodObjectDietFlags.md)
 - [io.swagger.client.models.BrandedFoodObjectDietLabels](docs/BrandedFoodObjectDietLabels.md)
 - [io.swagger.client.models.BrandedFoodObjectDietLabelsGlutenFree](docs/BrandedFoodObjectDietLabelsGlutenFree.md)
 - [io.swagger.client.models.BrandedFoodObjectDietLabelsVegan](docs/BrandedFoodObjectDietLabelsVegan.md)
 - [io.swagger.client.models.BrandedFoodObjectDietLabelsVegetarian](docs/BrandedFoodObjectDietLabelsVegetarian.md)
 - [io.swagger.client.models.BrandedFoodObjectIngredients](docs/BrandedFoodObjectIngredients.md)
 - [io.swagger.client.models.BrandedFoodObjectItems](docs/BrandedFoodObjectItems.md)
 - [io.swagger.client.models.BrandedFoodObjectNutrients](docs/BrandedFoodObjectNutrients.md)
 - [io.swagger.client.models.BrandedFoodObjectNutrientsChomp](docs/BrandedFoodObjectNutrientsChomp.md)
 - [io.swagger.client.models.BrandedFoodObjectNutrientsUsda](docs/BrandedFoodObjectNutrientsUsda.md)
 - [io.swagger.client.models.BrandedFoodObjectPackage](docs/BrandedFoodObjectPackage.md)
 - [io.swagger.client.models.BrandedFoodObjectPackagingPhotos](docs/BrandedFoodObjectPackagingPhotos.md)
 - [io.swagger.client.models.BrandedFoodObjectPackagingPhotosFront](docs/BrandedFoodObjectPackagingPhotosFront.md)
 - [io.swagger.client.models.BrandedFoodObjectPackagingPhotosIngredients](docs/BrandedFoodObjectPackagingPhotosIngredients.md)
 - [io.swagger.client.models.BrandedFoodObjectPackagingPhotosNutrition](docs/BrandedFoodObjectPackagingPhotosNutrition.md)
 - [io.swagger.client.models.BrandedFoodObjectPortions](docs/BrandedFoodObjectPortions.md)
 - [io.swagger.client.models.BrandedFoodObjectServing](docs/BrandedFoodObjectServing.md)
 - [io.swagger.client.models.IngredientObject](docs/IngredientObject.md)
 - [io.swagger.client.models.IngredientObjectItems](docs/IngredientObjectItems.md)
 - [io.swagger.client.models.IngredientObjectNutrients](docs/IngredientObjectNutrients.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth


