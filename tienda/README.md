# proyecto_final

Este proyecto es una implementación de una cafetería que permite gestionar productos, clientes y facturas. Utiliza varios patrones de diseño para asegurar una arquitectura robusta y flexible.

## Descripción básica

El proyecto simula el funcionamiento de una cafetería, donde se pueden realizar las siguientes acciones:
- Crear productos y agregarlos al inventario.
- Crear clientes de diferentes tipos (VIP y Regular).
- Crear facturas y agregar productos a ellas.
- Aplicar descuentos a las facturas según el tipo de cliente.
- Mostrar el inventario y las facturas generadas.

La aplicación está diseñada para ser extensible y fácil de mantener, utilizando varios patrones de diseño que permiten una separación clara de responsabilidades y facilitan la adición de nuevas funcionalidades sin afectar el código existente.

### Funcionalidades principales

1. **Gestión de productos**: Los productos pueden ser creados y agregados al inventario de la cafetería. Cada producto tiene atributos como nombre, precio, código y cantidad disponible. Los productos pueden ser de diferentes tipos, como café o fruta, cada uno con sus propias características específicas.

2. **Gestión de clientes**: Los clientes pueden ser creados y clasificados en diferentes tipos, como VIP y Regular. Cada tipo de cliente tiene su propia estrategia de descuento que se aplica a las facturas.

3. **Gestión de facturas**: Las facturas pueden ser creadas y productos pueden ser agregados a ellas. La factura calcula el total de los productos agregados y aplica los descuentos correspondientes según el tipo de cliente.

4. **Aplicación de descuentos**: Los descuentos se aplican a las facturas según el tipo de cliente. Los clientes VIP reciben un descuento especial, mientras que los clientes regulares no reciben descuentos.

5. **Visualización de inventario y facturas**: La aplicación permite mostrar el inventario actual de productos y las facturas generadas, incluyendo los detalles de los productos y los totales con descuentos aplicados.

## Patrones de diseño utilizados

### Factory Method
Se utiliza para la creación de clientes. Este patrón permite crear objetos sin especificar la clase exacta del objeto que se va a crear. En este caso, `ClienteFactory` es responsable de crear instancias de `ClienteVIP` o `ClienteRegular` según el tipo de cliente. Esto facilita la extensión del sistema para soportar nuevos tipos de clientes sin modificar el código existente.

### Composite
Se utiliza para gestionar productos y facturas. Este patrón permite tratar objetos individuales y compuestos de manera uniforme. En este proyecto, `Factura` actúa como un contenedor de `Producto`, permitiendo agregar múltiples productos a una factura y calcular el total de manera uniforme. Esto simplifica la gestión de colecciones de productos y facilita la extensión del sistema para soportar nuevos tipos de productos.

### Strategy
Se utiliza para aplicar descuentos a las facturas. Este patrón permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. En este caso, cada tipo de cliente (`ClienteVIP` y `ClienteRegular`) tiene su propia estrategia de descuento que se aplica a la factura. Esto permite cambiar el comportamiento de los descuentos sin modificar el código de las facturas o de los clientes.

### Builder
Se utiliza para la construcción de objetos complejos paso a paso. Este patrón permite crear una representación de un objeto complejo y proporciona una forma de construirlo de manera incremental. En este proyecto, se podría utilizar para construir objetos como `Factura` o `Cliente` de manera más flexible y controlada.

### Visitor
Se utiliza para separar un algoritmo de la estructura de objetos sobre la que opera. Este patrón permite agregar nuevas operaciones a estructuras de objetos existentes sin modificar sus clases. En este proyecto, podría utilizarse para agregar nuevas operaciones a los productos o facturas sin cambiar sus clases.

### Prototype
Se utiliza para crear nuevos objetos copiando una instancia existente. Este patrón es útil cuando la creación de una instancia de una clase es costosa o compleja. En este proyecto, podría utilizarse para clonar productos o facturas, facilitando la duplicación de objetos sin necesidad de recrearlos desde cero.

### Chain of Responsibility
Se utiliza para pasar una solicitud a lo largo de una cadena de manejadores. Este patrón permite que múltiples objetos tengan la oportunidad de manejar la solicitud sin acoplar el remitente de la solicitud a su receptor. En este proyecto, podría utilizarse para manejar diferentes tipos de solicitudes de clientes o productos, permitiendo que cada manejador procese o pase la solicitud a otro manejador en la cadena.

## Autores

- Samuel Alejandro Diaz Aguilar
- Deivid Mateo Cañan p 

## Herramientas

- [java 17](https://adoptium.net/es)
- [junit 5.10.0](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0)
- [maven](https://maven.apache.org)

## Construcción y pruebas

Para compilar el proyecto puede usar el comando:

```shell
mvn clean compile
```

Para ejecutar las pruebas puede usar el comando: 

```shell
 mvn clean test
```

Para generar el jar puede usar el comando: 

```shell
 mvn clean package
```

y para ejecutar el jar

```shell
 java -jar target/proyecto_final-1.0.jar
```

```shell
mvn javadoc:javadoc
```