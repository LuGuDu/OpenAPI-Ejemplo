# OpenAPI-Ejemplo
 Primer ejemplo de Autogeneracion con OpenAPI y Spring

El proyecto se compone de un proyecto maven con dos modulos. En el modulo de especificación se genera automaticamente las clases de modelo y las interfaces de la API que se indican mediante un archivo YAML siguiendo la especificación de OpenAPI.

El modulo de implementación se encarga de lanzar la aplicación Spring y de introducir las implementaciones de la interfaz definida en el modulo de especificación.

Esto se ha logrado siguiendo el ejemplo expuesto en el siguiente artículo: 
 - https://medium.com/xgeeks/api-first-using-openapi-and-spring-boot-2602c04bb0d3
