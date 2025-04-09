# SERENITYBDD-CHALLENGE-2025
Challenge NTTDATA con Serenity BBD 
Automatización página: https://www.saucedemo.com Autor: David Coronel
Quito-Ecuador
--------------------------------------------------------------------
Patron de diseño: 
Screenplay
Framework: gherkin, cucumber, Junit, SerenityBDD, selenium
Framework adicionales: librerias lombok, Faker, SonarLink, cucumber for java
--------------------------------------------------------------------
1. Prerrequisitos:
-	Maquina local con el sistema operativo Windows 11
-	Microsoft Edge (Versión 135.0.3179.54 )
-	IDE IntelliJ IDEA (Community Edition) version 2023.1.7
-	Maven version 3.9.6 (debe estar en la variable de entorno)
-	Gradle versión 7.6.1 (debe estar en la variable de entorno)
- JDK versión 1.8  (debe estar en la variable de entorno)
  
-Importante: Se utilizo el browser Microsoft Edge debido a la estabilidad que presenta al momento de ejecutar pruebas, por lo que la automatización corre en este navegador. Es necesario tenerlo instalado.

--------------------------------------------------------------------

2. Ejecución en el archivo:
-Abrir los archivos de la carpeta dentro del programa Intellij IDEA y esperar a que cargue el proyecto.
-Dirigirse al ícono de Run y correr el test o (Mayús + F10)
--------------------------------------------------------------------
3. Comandos para ejecución por consola
   
•	-Comando para limpiar el proyecto y luego ejecuta TODOS los escenarios uno por uno ./gradlew clean test

•	-Comando para generar reporte después que haya terminado un test (Por consola arrojara la ruta .html )./gradlew reports

•	-Comando para limpiar la carpeta Target (Reportes) ./gradlew clearReports

--------------------------------------------------------------------
4.Información adicional	
-Para visualizar el reporte generado en Serenity nos dirigimos después de obtener el resultado del test a "Main report" que se muestra en la parte final 


---------------------------------------------------------------------------------------
El archivo readme.txt y conclusiones txt se encuentran dentro de la carpeta de archivos
