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

### 4. **Gestor de Agencia de Viajes**
- **Descripción**: Intermediario que facilita reservas a nombre de agencias de viajes.
- **Acciones**:
  - Accede a la información de disponibilidad.
  - Realiza reservas para sus clientes.

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

### **Gestor de Agencia de Viajes**

El gestor de agencia de viajes facilita la reserva de habitaciones en nombre de sus clientes.

1. **Accede a la información de disponibilidad** en tiempo real.
2. **Realiza reservas** para sus clientes, ofreciendo opciones de habitación y precios.
3. **Gestiona pagos** para las reservas realizadas.

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

## **Sistema de Gestión de Reservas de Hotel: Facilitando la Experiencia del Cliente y la Administración del Hotel**:


El proyecto consiste en un sistema de gestión de reservas para hoteles, diseñado para facilitar tanto a los clientes como a los empleados la administración de las habitaciones y los pagos. Los clientes pueden realizar reservas online a través de la web o la aplicación del hotel, eligiendo fechas, tipo de habitación y número de huéspedes. Si prefieren hacerlo manualmente, el recepcionista puede gestionar la reserva de manera directa. El sistema también permite la integración con agencias de viajes, lo que aumenta la visibilidad del hotel. Además, se garantiza la seguridad y facilidad en los pagos mediante sistemas externos. A continuación, se muestra la interfaz de inicio de sesión del sistema.


<img src="images\appi-v-1\login-version-1.0.0.png">



[¡Ver más imágenes!](C:\Users\Usuario\Documents\proyects\sistema-de-reserva-hotel\images\appi-v-1)
