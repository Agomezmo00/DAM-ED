
## Ejercicio modelado de clases

Realiza el análisis de un sitema de gestión de un almacén dedicado a la venta de artículos. Para ello hay una base de datos donde están almacenados datos de los clientes, artículos, facturas y datos de detalle de las facturas. 

Para los clientes se tiene: código de cliente, nombre, teléfono y dirección.
Para los artículos se tiene: código de artículo, denominación, pvp y stock actual en el almacén.
Para las facturas: fecha y número de factura.

Existen dos tipos de clientes a nivel fiscal: particulares y empresas, de los primeros se almacena el NIF y el porcentaje de descuento a aplicar y de las segundas el CIF y la dirección.

Nótese que un mismo cliente puede tener multitud de facturas. Las cuales estarán formadas por líneas de detalle de factura, identificadas por el número de línea.

El sistema deberá mostrar una ventana inicial con una serie de menús que permiten abrir las vistas para trabajar con los datos de la base de datos. Esta ventana inicial debe incluir los métodos para abrir ventanas de mantenimiento de datos de clientes, facturas y artículos. Las vistas deben permitir las operaciones que se listan a continuación:

- Mantenimiento clientes CRUD (Create, read, update, delete)
- Mantenimiento artículos CRUD (Create, read, update, delete)
- Mantenimiento facturas CRUD (Create, read, update, delete)

### Cuestiones

1. Identifica las clases y sus relaciones.
2. Identifica atributos y métodos para las clases.
3. Plantea una estructura de paquetes para las clases según su cometido: Entidad, control, interfaz.
4. Realiza el diagrama de clases apropiado


