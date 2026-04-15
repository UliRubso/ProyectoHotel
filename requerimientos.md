Servidores de aplicación, web y base de datos
La solución fue desarrollada como una aplicación web Java basada en Spring Boot. En este tipo de arquitectura, el proyecto puede ejecutarse como una aplicación autocontenida, utilizando un servidor embebido. Spring Boot documenta que sus aplicaciones pueden ejecutarse directamente con java -jar, y en aplicaciones web con spring-boot-starter-web se usa normalmente un contenedor servlet embebido; en este proyecto se utiliza Tomcat embebido como servidor de aplicación y servidor web. 
Componentes requeridos
Servidor de aplicación / web: Tomcat embebido incluido por Spring Boot.
Base de datos en desarrollo: H2 Database.
Acceso web local: navegador moderno para abrir la aplicación en http://localhost:8080
Integración continua: GitHub Actions para ejecutar compilación y pruebas con Maven.

Paquetes y dependencias adicionales
El proyecto utiliza Maven como administrador de dependencias y está compuesto por los siguientes paquetes principales de Spring Boot:
- spring-boot-starter-web
- spring-boot-starter-thymeleaf
- spring-boot-starter-data-jpa
- spring-boot-starter-security
- spring-boot-starter-test
- h2

Spring Boot documenta el uso de starters para agregar de forma simplificada las dependencias necesarias de cada tipo de aplicación. 

Función de cada dependencia
Spring Web: manejo de controladores, rutas HTTP y servidor web embebido.
Thymeleaf: motor de plantillas para las vistas HTML.
Spring Data JPA: acceso a base de datos y persistencia de entidades.
Spring Security: autenticación y protección de rutas.
H2 Database: base de datos ligera para ambiente local y pruebas; H2 soporta modo en memoria y consola web para administración. 
Spring Boot Starter Test: pruebas unitarias con soporte para JUnit.
GitHub Actions: ejecución automática de mvn test en pushes y pull requests. 

Versión de Java y herramientas de construcción
Java
El proyecto requiere Java 17. La documentación oficial de Spring Boot indica que Spring Boot 3.2.x requiere Java 17 y es compatible hasta Java 21. Además, la guía de instalación de Spring Boot indica que se necesita Java SDK 17 o superior. 
Maven
El proyecto utiliza Apache Maven como herramienta de construcción. Spring Boot documenta soporte explícito para Maven 3.6.3 o posterior. 

Requerimientos mínimos recomendados
JDK: 17
Maven: 3.6.3 o superior
Sistema operativo: Windows, Linux o macOS con soporte para Java y Maven
IDE recomendado: IntelliJ IDEA o NetBeans
Git: para control de versiones y trabajo con GitHub

Requerimientos de ejecución local
Para ejecutar la aplicación localmente se requiere:
1. Tener Java 17 instalado.
2. Tener Maven instalado o usar Maven Wrapper si está incluido en el proyecto.
3. Clonar el repositorio.
4. Ejecutar:
