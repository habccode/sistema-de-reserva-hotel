# sistema-de-reserva-hotel
Desarrollar un sistema de reservas que permita a los usuarios realizar, modificar y cancelar reservas de servicios (como hoteles, restaurantes, o eventos) de manera eficiente y amigable.




# Sistema de Gestión de Reservas de Hotel

Este sistema permite gestionar reservas de habitaciones de manera eficiente, ofreciendo opciones tanto online como manuales para clientes y empleados del hotel. Además, facilita la gestión de pagos, disponibilidad y relaciones con agencias de viajes.

---

## **Actores Principales**

### 1. **Cliente**
- **Descripción**: Persona que realiza una reserva de habitación.
- **Acciones**:
  - Realiza reservas online o manualmente.
  - Selecciona fecha, tipo de habitación y número de huéspedes.
  - Realiza pagos y confirma reservas.
  
### 2. **Recepcionista**
- **Descripción**: Empleado encargado de gestionar las reservas manualmente.
- **Acciones**:
  - Procesa reservas por teléfono o en persona.
  - Introduce datos del cliente en el sistema.
  - Procesa pagos y asigna habitaciones.

### 3. **Sistema de Reservas**
- **Descripción**: Sistema que gestiona la disponibilidad de las habitaciones y procesa pagos.
- **Acciones**:
  - Muestra la disponibilidad en tiempo real.
  - Realiza la validación de reservas y pagos.
  - Envía confirmaciones al cliente.



---

## **Operaciones y Casos de Uso**

### **Cliente**

El cliente puede interactuar con el sistema de diferentes formas: a través de la web, la app móvil, o de forma presencial.

1. **Inicia sesión en la web o app** para hacer una reserva.
2. **Selecciona fechas** de entrada y salida, **tipo de habitación** y número de huéspedes.
3. **Realiza el pago** y la reserva es confirmada por el sistema.
4. Si el cliente no puede completar la reserva online, puede contactar a un **recepcionista** para asistencia.

---

### **Recepcionista**

El recepcionista gestiona las reservas que no se realizan en línea.

1. **Gestiona las solicitudes de reserva** recibidas por teléfono o en persona.
2. **Introduce los datos del cliente** en el sistema de reservas.
3. **Confirma la disponibilidad** de habitaciones.
4. **Realiza el pago** y genera una confirmación para el cliente.

---

### **Sistema de Reservas**

El sistema de reservas gestiona la información sobre las habitaciones, la disponibilidad y los pagos.

1. **Muestra la disponibilidad** de las habitaciones según las fechas seleccionadas por el cliente.
2. **Procesa el pago** a través de un sistema de pagos externo (Ej. Stripe, PayPal).
3. **Confirma la reserva** y la registra en la base de datos.
4. **Envía una confirmación** de la reserva al cliente por correo electrónico o mensaje.

---

## **Diagrama de Casos de Uso**

```plaintext
                           +---------------------+                        +---------------------+
                           |     Cliente         |                        |  Recepcionista       |
                           +---------------------+                        +---------------------+
                                    |                                                 |
                                    | Inicia Reserva                  Gestiona Reserva |
                                    v                                                 v
                            +---------------------+   <-----------------+------------------------+
                            |     Sistema         |                      |  Sistema de Pagos      |
                            |  de Reservas        |                      +-----------------------+
                            +---------------------+                                  |
                                    |                                                 |
                            Muestra Disponibilidad                             Procesa Pago
                                    |                                                 |
                                    v                                                 v
                              Confirma Reserva                                    Validación
                                    |                                                 |
                                    v                                                 v
                              Envía Confirmación                                Respuesta Pago
````


## **Wireframe inicial**:
## **Diseño**:
<img src="images/casos-de-usos/casos-de-usos-SRHotel.drawio.png">

## **Diseño final a desarrolar:**
## Diseño mook:
<img src="images/mook/pantallasApp.drawio.png">



## **Sistema de Gestión de Reservas de Hotel: Facilitando la Experiencia del Cliente y la Administración del Hotel**:
El proyecto consiste en un sistema de gestión de reservas para hoteles, diseñado para facilitar tanto a los clientes como a los empleados la administración de las habitaciones y los pagos. Los clientes pueden realizar reservas online a través de la web o la aplicación del hotel, eligiendo fechas, tipo de habitación y número de huéspedes. Si prefieren hacerlo manualmente, el recepcionista puede gestionar la reserva de manera directa. El sistema también permite la integración con agencias de viajes, lo que aumenta la visibilidad del hotel. Además, se garantiza la seguridad y facilidad en los pagos mediante sistemas externos. A continuación, se muestra la interfaz de inicio de sesión del sistema.


<img src="images\appi-v-1\login-version-1.0.0.png">



[¡Ver más imágenes!](images)



## 📌 Tecnologías y Archivos Clave Utilizados en el Sistema de Reservas de Hotel:

| 💻 Tecnología / Archivo       | 📄 Descripción                                                                                                                                                                                                                              |
| ----------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 🖥️ **Java**                  | Utilizamos **Java** como lenguaje principal de programación por su **robustez, portabilidad** y **amplio soporte** para aplicaciones de escritorio. Es ideal para sistemas **seguros y escalables**, como el de reservas hoteleras.         |
| 🎨 **JavaFX**                 | Desarrollamos la **interfaz gráfica** con **JavaFX**, una librería moderna de Java para construir UIs **interactivas y visualmente atractivas**. Permite una experiencia fluida e intuitiva para los usuarios al realizar reservas.         |
| 🗄️ **SQLite3**               | Implementamos **SQLite3** como base de datos por ser **ligera, integrada** y **sin necesidad de servidor**. Es perfecta para aplicaciones de escritorio con necesidades moderadas de almacenamiento, y se integra fácilmente con Java.      |
| 🎨 **CSS**                    | Usamos **CSS** para estilizar la interfaz JavaFX, logrando una separación clara entre lógica y presentación. Esto mejora la **apariencia visual** y facilita el **mantenimiento** del sistema.                                              |
| ⚙️ **Maven**                  | Gestionamos el proyecto con **Apache Maven**, una herramienta para la **automatización de compilación** y **gestión de dependencias**. Ayuda a mantener el orden del proyecto y facilita el uso de librerías externas.                      |
| 🔁 **Maven Wrapper (`mvnw`)** | Incluimos **Maven Wrapper** para que el proyecto se compile sin necesidad de tener Maven instalado previamente. Esto asegura que todos los desarrolladores usen la **misma versión**, facilitando la portabilidad y consistencia.           |
| 📦 **`pom.xml`**              | El archivo **`pom.xml`** define la **estructura del proyecto**, sus **dependencias**, plugins y configuraciones necesarias para que Maven ejecute correctamente el sistema. Es esencial en la automatización y portabilidad del desarrollo. |
| 🌐 **GitHub**                 | Utilizamos **GitHub** como plataforma de control de versiones y colaboración. Permite trabajar en equipo, gestionar ramas, revisar código con **pull requests** y llevar un historial limpio del proyecto.                                  |
| 🛡️ **`.gitignore`**          | Incluimos un archivo **`.gitignore`** para excluir archivos innecesarios o generados automáticamente (como `target/`, `.idea/`, etc.), manteniendo el repositorio **limpio y profesional**.                                                 |
| 🤝 **`CONTRIBUTING.md`**      | El archivo **`CONTRIBUTING.md`** proporciona una guía clara para que otros desarrolladores puedan contribuir al proyecto. Incluye pautas de estilo, normas para enviar cambios y cómo reportar errores o sugerencias de mejora.             |

---




**Author: Habccode** 🧑‍💻🧠