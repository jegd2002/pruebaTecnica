README

Este es el proyecto PruebaTecnica que utiliza Java 11 y Spring Boot 2.7.3. A continuación, se proporcionan instrucciones sobre cómo configurar el proyecto y realizar las instalaciones necesarias.



Requisitos previos
Asegúrate de tener instalados los siguientes componentes en tu entorno de desarrollo:

Java Development Kit (JDK) 11
Maven
PostgreSQL (si decides utilizar tu propia base de datos)
IntelliJ IDEA como recomendacion personal en caso contrario usar el editor de su preferencia


Configuración del proyecto
1. Clona el repositorio del proyecto desde Git.
	GIT--------
2. Abre el proyecto en tu IDE de preferencia.

3. Ejecuta el siguiente comando para descargar e instalar las dependencias del proyecto:
	mvn clean install
	o ve a la parte superior derecha donde dice maven despues selecciona Lifecycle y presiona las opciones clean and install de forma 
	individual dejando que cada una termine su respectivo proceso

4. Configuración de la base de datos

A continuación, se describen dos opciones para configurar la base de datos.

Opción 1: Crear una base de datos manualmente
Asegúrate de tener PostgreSQL instalado y ejecutándose en tu entorno local.

Crea una base de datos con los siguientes datos:

-Nombre de la base de datos: prueba_tecnica
-Puerto: 5432

Una vez creada la base de datos en local el proyecto deberia de funcionar.

COMO SEGUNDA OPCION 

Utilizar el archivo de PostgreSQL del repositorio

-Importa el archivo de respaldo de la base de datos PostgreSQL que se encuentra en el repositorio.

-Asegúrate de que PostgreSQL esté instalado y en ejecución en tu entorno local.

-Abre el archivo application.properties ubicado en src/main/resources y realiza los siguientes cambios:

# Datasource
# Driver de PostgreSQL
spring.datasource.driver-class-name=org.postgresql.Driver

# URL del servicio de PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/prueba_tecnica

# Usuario y contraseña de la base de datos
spring.datasource.username=postgres
spring.datasource.password=COLOCATUCONTRASEÑA

# Mostrar las consultas
spring.jpa.show-sql=true

# Actualizar las consultas DDL del proyecto
spring.jpa.hibernate.ddl-auto=update

Una vez configurado esto el proyecto deberia de cargar.


