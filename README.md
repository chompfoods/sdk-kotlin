# io.swagger.client - Kotlin client library for Chomp Food &amp; Recipe Database API Documentation

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
*DefaultApi* | [**foodBrandedNamePhpGet**](docs/DefaultApi.md#foodbrandednamephpget) | **GET** /food/branded/name.php | Get a branded food item by name
*DefaultApi* | [**foodBrandedSearchPhpGet**](docs/DefaultApi.md#foodbrandedsearchphpget) | **GET** /food/branded/search.php | Get data for branded food items using various search parameters
*DefaultApi* | [**foodIngredientSearchPhpGet**](docs/DefaultApi.md#foodingredientsearchphpget) | **GET** /food/ingredient/search.php | Get raw/generic food ingredient item(s)
*DefaultApi* | [**recipeIdPhpGet**](docs/DefaultApi.md#recipeidphpget) | **GET** /recipe/id.php | Get a recipe by ID
*DefaultApi* | [**recipeIngredientPhpGet**](docs/DefaultApi.md#recipeingredientphpget) | **GET** /recipe/ingredient.php | Get recipes using a list of ingredients
*DefaultApi* | [**recipeRandomPhpGet**](docs/DefaultApi.md#reciperandomphpget) | **GET** /recipe/random.php | Get random popular recipes
*DefaultApi* | [**recipeSearchPhpGet**](docs/DefaultApi.md#recipesearchphpget) | **GET** /recipe/search.php | Get recipes using a title and optional filters

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.BrandedFoodObject](docs/BrandedFoodObject.md)
 - [io.swagger.client.models.BrandedFoodObjectCountryDetails](docs/BrandedFoodObjectCountryDetails.md)
 - [io.swagger.client.models.BrandedFoodObjectDietFlags](docs/BrandedFoodObjectDietFlags.md)
 - [io.swagger.client.models.BrandedFoodObjectDietLabels](docs/BrandedFoodObjectDietLabels.md)
 - [io.swagger.client.models.BrandedFoodObjectDietLabelsGlutenFree](docs/BrandedFoodObjectDietLabelsGlutenFree.md)
 - [io.swagger.client.models.BrandedFoodObjectDietLabelsVegan](docs/BrandedFoodObjectDietLabelsVegan.md)
 - [io.swagger.client.models.BrandedFoodObjectDietLabelsVegetarian](docs/BrandedFoodObjectDietLabelsVegetarian.md)
 - [io.swagger.client.models.BrandedFoodObjectItems](docs/BrandedFoodObjectItems.md)
 - [io.swagger.client.models.BrandedFoodObjectNutrients](docs/BrandedFoodObjectNutrients.md)
 - [io.swagger.client.models.BrandedFoodObjectPackage](docs/BrandedFoodObjectPackage.md)
 - [io.swagger.client.models.BrandedFoodObjectPackagingPhotos](docs/BrandedFoodObjectPackagingPhotos.md)
 - [io.swagger.client.models.BrandedFoodObjectPackagingPhotosFront](docs/BrandedFoodObjectPackagingPhotosFront.md)
 - [io.swagger.client.models.BrandedFoodObjectPackagingPhotosIngredients](docs/BrandedFoodObjectPackagingPhotosIngredients.md)
 - [io.swagger.client.models.BrandedFoodObjectPackagingPhotosNutrition](docs/BrandedFoodObjectPackagingPhotosNutrition.md)
 - [io.swagger.client.models.BrandedFoodObjectServing](docs/BrandedFoodObjectServing.md)
 - [io.swagger.client.models.IngredientObject](docs/IngredientObject.md)
 - [io.swagger.client.models.IngredientObjectCalorieConversionFactor](docs/IngredientObjectCalorieConversionFactor.md)
 - [io.swagger.client.models.IngredientObjectComponents](docs/IngredientObjectComponents.md)
 - [io.swagger.client.models.IngredientObjectItems](docs/IngredientObjectItems.md)
 - [io.swagger.client.models.IngredientObjectNutrients](docs/IngredientObjectNutrients.md)
 - [io.swagger.client.models.IngredientObjectPortions](docs/IngredientObjectPortions.md)
 - [io.swagger.client.models.RecipeObject](docs/RecipeObject.md)
 - [io.swagger.client.models.RecipeObjectAttributes](docs/RecipeObjectAttributes.md)
 - [io.swagger.client.models.RecipeObjectIngredients](docs/RecipeObjectIngredients.md)
 - [io.swagger.client.models.RecipeObjectItems](docs/RecipeObjectItems.md)
 - [io.swagger.client.models.RecipeObjectMeta](docs/RecipeObjectMeta.md)
 - [io.swagger.client.models.RecipeObjectMetaImages](docs/RecipeObjectMetaImages.md)
 - [io.swagger.client.models.RecipeObjectNutrients](docs/RecipeObjectNutrients.md)
 - [io.swagger.client.models.RecipeObjectNutrientsCalories](docs/RecipeObjectNutrientsCalories.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth


