# OpenAPI-Ejemplo
 Primer ejemplo de Autogeneracion con OpenAPI y Spring

El proyecto se compone de un proyecto maven con dos modulos. En el modulo de especificación se genera automaticamente las clases de modelo y las interfaces de la API que se indican mediante un archivo YAML siguiendo la especificación de OpenAPI.

El modulo de implementación se encarga de lanzar la aplicación Spring y de introducir las implementaciones de la interfaz definida en el modulo de especificación.

Esto se ha logrado siguiendo el ejemplo expuesto en el siguiente artículo: 
 - https://medium.com/xgeeks/api-first-using-openapi-and-spring-boot-2602c04bb0d3

Otros enlaces de interés:
 - https://www.baeldung.com/java-openapi-generator-server
 - https://github.com/OpenAPITools/openapi-generator


Para una correcta generación del codigo (en lo referente a anotaciones sobre todo) es necesario añadir las siguientes dependencias en el pom.xml del modulo de especificacion:
```
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>jackson-databind-nullable</artifactId>
    <version>0.2.1</version>
</dependency>

<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-annotations</artifactId>
    <version>1.6.2</version>
</dependency>

<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
</dependency>
 ```
 
 
# Especificacion OpenAPI

Se puede usar la especificación OpenAPI para generar los objetos DTO y las interfaces para los controladores rest de SpringBoot. Por otro lado, el equipo del frontend puede utilizar esta especificación OpenAPI para crear objetos y clientes para dicha API.

Definición oficial de OpenAPI:
“La Especificación OpenAPI (OAS – OpenApi Specification) define un estándar, una interfaz de las APIs Restful hecha con lenguaje agnostico que permite tanto a humanos como a ordenadores descubrir y entender las posibilidades del servicio sin necesidad de acceder al código fuente, documentación o a través de la inspección del trafico de la red. Cuando es correctamente definida, un consumidor puede entender e interactuar con el servicio remoto con una cantidad mínima de implementación lógica”.



# API First

API First es una metodología de definición de APIs donde se prioriza la definición del contrato antes de empezar con el resto de procesos de coficicación, testing, etc.

Este enfoque se enfrenta al tradicional Consumer-First, en el que primero se desarrolla la lógica y después la API que interactuará con dicha lógica o la UI.

API First favorece, entre otras cosas, que la agregación de nuevas características de la apli sea algo más ordenado. Además, reduce mucho el time to market, mejora la calidad de la API, mejora la seguridad y permite generar tests facilmente.


Enlaces de interés:
 - https://medium.com/@emilianozublena/api-first-development-c202a61cf3b2
