ProyectoHotel

ProyectoHotel es una aplicación web desarrollada para apoyar la administración básica del hotel Coahuila. El sistema permite registrar huéspedes, consultar la lista de hospedajes activos, editar registros existentes y eliminar registros cuando sea necesario. La información principal que administra el sistema es el nombre del huésped, número de habitación, fecha de entrada y fecha de salida.
La solución fue construida con Java, Spring Boot, Spring Data JPA, Thymeleaf y H2 Database, incorporando además autenticación básica para restringir el acceso al sistema a usuarios autorizados.

Problema identificado
En un hotel pequeño, el control de huéspedes suele llevarse de manera manual, ya sea en libretas, hojas sueltas o archivos poco estructurados. Esto provoca problemas como errores de captura, pérdida de información, lentitud para consultar registros, dificultad para actualizar datos y riesgo de asignar incorrectamente habitaciones o fechas de hospedaje.

Solución
Se desarrolló una aplicación web que centraliza la gestión básica de huéspedes en un solo sistema. La solución permite:
Iniciar sesión con acceso restringido,
Registrar huéspedes,
Listar los registros almacenados,
Editar información de hospedaje,
Eliminar registros,
Validar que la fecha de salida no sea anterior a la fecha de entrada.

Con esta propuesta se busca reducir errores, mejorar la consulta de información y brindar al personal una herramienta sencilla para administrar el hospedaje de manera más ordenada y segura.

Arquitectura
La solución sigue una arquitectura web de tres capas:
1. Capa de presentación
Corresponde a la interfaz con la que interactúa el usuario a través del navegador web. Esta capa fue desarrollada con Thymeleaf y contiene las vistas del sistema, como login, listado de huéspedes, registro de huésped y edición de registros.
2. Capa de lógica de negocio
Está implementada con Spring Boot y contiene la lógica principal del sistema. Aquí se ubican los controladores y servicios, responsables de procesar solicitudes, validar datos y coordinar el flujo entre la interfaz y la base de datos.
3. Capa de datos
Se implementó con Spring Data JPA y H2 Database. Esta capa administra la persistencia de los registros de huéspedes, permitiendo guardar, consultar, actualizar y eliminar información.

Componentes principales
AuthController: gestiona la vista de inicio de sesión.
HuespedController: administra las operaciones de registro, consulta, edición y eliminación de huéspedes.
HuespedService: contiene la lógica de negocio y validaciones.
HuespedRepository: proporciona acceso a la base de datos.
SecurityConfig: configura la seguridad y autenticación del sistema.

Tecnologías utilizadas
Java 17
Spring Boot
Spring Data JPA
Thymeleaf
Spring Security
H2 Database
Maven
JUnit
GitHub Actions

Estado del proyecto
El sistema cuenta con funcionalidades básicas de gestión de huéspedes, autenticación y prueba unitaria para validación de fechas, además de integración continua mediante GitHub Actions.
