# Introducción a Spring

![](https://img.shields.io/badge/Notas-En_Progreso-490c19?style=for-the-badge&logo=fnac)
![](https://img.shields.io/badge/Proyectos_Prueba-En_Progreso-991e34?style=for-the-badge&logo=github)
![](https://img.shields.io/badge/Proyecto_Final-No_disponible-AC5840?style=for-the-badge&logo=intellijidea)

> Parte de este apunte está parcialmente perdido en Linux Mint

## Flujo de trabajo

1. Incoming request
2. Front Controller Dispatcher Servlet / FCDS
3. Delegate Request
4. Handle request (Controller "@Controller")
5. Create Model (Business Logic "@Service" && "@Repository")
6. Delegate Rendering of Response (model to FCDS)
7. Render response (View Template)

## Dependencias que se usarán

- Thymeleaf
- Spring Web
- MariaDB Driver
- Spring Data JPA
- Lombok

## Estructura de paquetes para una aplicación Web

Normalmente, se recomienda la siguiente estructura para los paquetes en una aplicación Web con Spring:

- **Model:** Representa el modelo de datos (entity).
- **Repository:** Serían las clases que establecen la comunicación con la base de datos
- **Controller:** Son los **endpoints** que se crean en la aplicación.
- **Service:** Las clases que responden a la funcionalidad y lógica de negocio.
- **Util:** Responden a las utilerías necesarias para la aplicación.
- **Validation:** Clase que sirve como apoyo para validar las entradas.
- **Converter:** Aquí normalmente, se crean las clases que sirven para convertir la estructura de los datos del usuario.

## Módulos de Spring

- **Data Access / Integration**
  - **JDBC:** Elimina la necesidad de hacer codificaciones JDBC y un análisis de errores según el proveedor de la base
    de datos.
  - **TX:** Admite la gestión de transacciones.
  - **OXM:** Implementa el mapeo Objeto a XML como *JAXB* y *XStream*.
  - **ORM:** Posibilita la integración de API que hagan el mapeo de relación de objetos como *JPA* e *Hibernate*.
  - **JMS:** Permite producir y consumir mensajes.
  - Transactions
- **Web**
  - WebSocket
  - Servilet
  - Web
  - Portlet
- **AOP:** Implementa la programación orientada a aspectos, define interceptores de métodos con puntos de corte.
- **Aspects:** Facilita la integración con *AspectJ*
- **Instrument:** Brinda soporte para la instrumentación de clases e implementación de cargadores de clases para usar
  servidores de aplicación como *Tomcat*.
- **Messaging:** Para servir como aplicaciones fundamentadas en mensajería.
- **Core Container:** Este es el contenedor núcleo de Spring y proporciona la funcionalidad principal al Framework de
  Spring. En una aplicación Spring, los objetos de la aplicación 'viven' dentro de un contenedor.
  - Beans
  - Core
  - Context
  - SptL
- **Test**

## Inversion of Control (IoC)

A esto también se le conoce como Dependency Injection (DI). Este es el proceso donde los objetos definen sus
dependencias.

> *Dependencias:* Es la relación que necesita un objeto con los demás objetos con los que va a trabajar. Esta relación
> se realiza mediante los argumentos del constructor, de un método de fábrica o propiedades que contenga la instancia del
> objeto.

Estos objetos estarán dentro del contenedor *Spring IoC* y forman parte de la columna vertebral de la aplicación, y
normalmente se les llama **beans**.

### BeanFactory

La interfaz Bean-Factory es un contenedor de Spring, esta proporciona la configuración y funcionalidad básica.

> Implementa la **Patron Factory**, la cual consiste en la instanciación y entrega de los respectivos beans de la
> aplicación.

Una vez que haya muchos beans en la fábrica, crea asociaciones entre ellos, donde elimina la configuración desde el
bean.

### Configurar Beans para el contenedor Spring IoC

Las clases de la aplicación se combinan con *metadatos de configuración* para que después estos se puedan utilizar.

> Proximamente Diagrama

## Metadatos de configuración

Los metadatos sirven para indicarle a Spring como configurar y ensamblar los beans para crear las instancias en la aplicación. Existen 3 maneras de crear estos metadatos:

- Configuración con XML
- Configuración basada en Java (Anotaciones)
- Descubrimiento implícito de beans y Auto conexión.

### Metadatos de un bean por XML

Un contenedor Spring IoC gestionará uno o más beans, y se utilizarán los metadatos que proporcionaran al contenedor por definiciones XML. Los cuales son:

- **Nombre del paquete:** Es la ubicación de la clase de la implementación del bean.
- **Configuración del comportamiento del bean:** Alcance, devoluciones del ciclo de vida, entre otros.
- **Referencias:** Denominado también *colaboraciones* o *dependencias*, son las interacciones con los otros beans para realizar una lógica de negocio.
- **Ajustes de configuración:** Es la cantidad de conexiones de un bean que administra unos grupos de conexiones.

### Definición de un Bean

Atributos o elementos de la etiqueta bean:

- **Id o name:** Le asigna un nombre al bean por el que nos referimos a él en el contenedor de Spring.
- **Class:** Aquí se permite especificar qué tipo de bean será una vez sea especificado el paquete con el nombre de la clase a la que pertenece.
- **< constructor-arg >:** Se utiliza para dar información a Spring de cómo construir al bean por medio de un constructor.
- **< property >** Da la posibilidad de inyectar valores llamando al método setter de las propiedades del bean.
