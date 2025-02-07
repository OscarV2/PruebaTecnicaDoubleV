Para desplegar API Java
Requisitos

1. Para ejecutar:
   - Java 17
2. Para compilar:
   - Maven
   - Java 17

Instrucciones de despliegue y pruebas:

El proyecto se hizo en Spring boot, apuntando a una base de datos remota PostgreSQL de pruebas, y en caso de que se quiera compilar y generar artefactos se debe realizar los siguientes pasos:

1. Entrar a la carpeta ApiJavaTickets
2. Abrir consola de windows CMD
3. Ejecutar comando maven: "mvn clean install"

Esto generará un archivo "PruebaTecnicaDoubleV-0.0.1.jar" dentro de la carpeta "ApiJavaTickets/target".

Para ejecutar dicho archivo (PruebaTecnicaDoubleV-0.0.1.jar), es necesario ejecutar el siguiente comando desde la consola de windows dentro de la carpeta "ApiJavaTickets/target":

- java -jar PruebaTecnicaDoubleV-0.0.1.jar

Esto desplegará el API en la siguiente IP:

http://localhost:8080

Adjunto archivo "Prueba Double V.postman_collection" que es una colección de Postman para facilidad de la prueba.

Prueba de consumo de API de Github

Para este punto se realizó un aplicativo en angular que permite buscar por el campo username a los distintos usuarios de Github

Para probar este punto es necesario lo siguiente:

    - NodeJs versión 20.17.0

Para ejecutar el proyecto se debe ingresar a la ruta: "ConsumoApiGithub" y ejecutar los siguientes comandos en consola:

    1. npm i
    2. ng s

Esto desplegará el aplicativo en la dirección IP: http://localhost:4200/
