### Ejercicio Diagrama de secuencia:

* Se pretende modelar el servicio de un call-center que funciona de la siguiente forma:

  * El/la operador/a que ofrece un servicio crea un objeto _llamada_ que realiza una petición de datos al objeto _cliente_. El objeto _cliente_ realiza una consulta de forma aleatoria a la base de datos de aquellos clientes a los que no se le ha llamado los últimos 3 meses. 

  * Una vez que recibe los datos realiza la llamada el propio sistema. Durante la llamada el objeto _llamada_ va mostrando la información que el/la operador/a debe proporcionar al cliente.

  * Si la duración de la llamada es superior a un minuto el objeto _llamada_ hace una petición __no síncrona__ al _registro de impagos_ y mostrará un mensaje en pantalla del/la operador/a indicando si el/la cliente tiene algún impago y dará por terminada la llamada.

  * Por último, si el/la cliente está interesado/a, el objeto _llamada_ cederá el control de ejecución a otro objeto _registro_ que emitirá una locución de contratación de los productos que se ofrecen. En ese momento el objeto _llamada_ finaliza su ejecución, justo en la llamada del objeto _registro_.

