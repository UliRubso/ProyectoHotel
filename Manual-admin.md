Sección de referencia para usuario administrador

Esta sección está orientada al responsable técnico o administrativo que mantiene el sistema en operación.

Responsabilidades del administrador
Ejecutar la aplicación
Validar que el sistema esté disponible
Revisar la base de datos local
Verificar el acceso de usuarios 
Ejecutar pruebas básicas de funcionamiento 
Supervisar actualizaciones del proyecto
Puesta en marcha local
Abrir terminal en la raíz del proyecto

Ejecutar:
mvn spring-boot:run
Verificar que la aplicación arranque correctamente en:
http://localhost:8080

Acceso administrativo al sistema
El administrador puede ingresar con las credenciales configuradas en SecurityConfig:
Usuario: admin 
Contraseña: 1234 

Verificación de base de datos
El proyecto utiliza H2 Database. Si está habilitada la consola H2, puede abrirse en:
http://localhost:8080/h2-console

Ejecución de pruebas
Para ejecutar pruebas manualmente:
mvn test
Revisión de integración continua
El administrador puede revisar la ejecución automática de pruebas en GitHub Actions desde la pestaña Actions del repositorio.
Tareas de mantenimiento recomendadas
Revisar que el sistema inicie sin errores
Validar acceso al login
Confirmar alta, edición y eliminación de huéspedes
Revisar que las pruebas unitarias pasen correctamente 
Respaldar el código en GitHub. 
Limitaciones actuales del sistema
La base de datos H2 en memoria es adecuada para desarrollo, pero no para operación persistente a largo plazo
El sistema no incluye facturación
El sistema no incluye pagos en línea 
El sistema no cuenta con manejo avanzado de roles y permisos
El sistema no integra reservaciones externas 
Recomendaciones para futura administración
Migrar a una base de datos persistente como MySQL o PostgreSQL
Definir usuarios administrativos y operativos separados
Agregar respaldos automáticos
Mejorar la interfaz gráfica para uso cotidiano

