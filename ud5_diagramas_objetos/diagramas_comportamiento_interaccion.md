## Diagramas de comportamiento.

Tratan de describir la estructura *dinámica* del modelo. Se enfocan en aquello que debe hacer el sistema, lo que debe ocurrir cuando el modelo esté funcionando.

### Diagramas de casos de uso.

*Un caso de uso es una descripción de las acciones de un sistema desde el punto de vista del usuario. Es una herramienta valiosa dado que es una técnica de aciertos y errores para obtener los requerimientos del sistema, justamente desde el punto de vista del usuario.*

*Los diagramas de caso de uso modelan la funcionalidad del sistema usando actores y casos de uso. Los casos de uso son servicios o funciones provistas por el sistema para sus usuarios.* [Fuente](https://ingsotfwarekarlacevallos.wordpress.com/2015/06/04/uml-casos-de-uso/)


![Diagrama de caso de uso](https://www.uml-diagrams.org/use-case-diagrams/use-case-diagram-elements.png "Ejemplo de diagrama de caso de uso Fuente: https://www.uml-diagrams.org/use-case-diagrams/use-case-diagram-elements.png")


#### Elementos que intervienen en el diagrama de casos de uso:

* Caso de uso
  * Conjunto de acciones realizadas por el sistema.
  * Producen un resultado observable.
  * Participan actores.

Representan una unidad funcional del sistema que se lleva a cabo tras una acción de algún agente externo, generalmente una orden. Se representa mediante una elipse que encierra una descripción de texto. 

* Actor. *Se le llama actor a toda entidad externa al sistema que guarda una relación con éste y que le demanda una funcionalidad. Esto incluye a los operadores humanos pero también incluye a todos los sistemas externos, además de entidades abstractas, como el tiempo.* [Fuente](https://es.wikipedia.org/wiki/Caso_de_uso#Actores). Se suele representar mediante un muñeco o monigote. 
  
* Relaciones. Pueden ser de varios tipos:
  * Asociación ----------- (línea recta) Relación entre actores y casos de uso.

  * Extensión  - - - - - > (<<extends>> flecha línea discontinua) Un caso de uso también se puede definir como una extensión incremental de un caso de uso base. Inserción de comportamiento adicional en un caso de uso base que no tiene conocimiento sobre él

  * Generalización de casos de uso ----------> (flecha línea continua) Un caso de uso también se puede especializar en uno o más casos de uso hijos. Una relación entre un caso de uso general y un caso de uso más específico, que hereda y añade propiedades al caso de uso base

  * Inclusión - - - - - > (<<includes>> flecha línea discontinua) Un caso de uso puede incorporar el comportamiento de otros casos de uso como fragmentos de su propio comportamiento. Inserción de comportamiento adicional en un caso de uso base, que describe explícitamente la inserción

* Límite del sistema. Se suele dibujar una línea que delimita el conjunto del sistema, para señalar qué elementos están dentro y cuáles están fuera del mismo.

##### Pasos para construir los diagramas de casos de uso.
* Identificar los actores. 
  
* Identificar los casos de uso. Para ello hay que saber lo que el sistema debe hacer, y una vez identificados los actores que utilizarán el sistema y cómo lo harán, se puede plantear una serie de preguntas para establecer los casos:
  * ¿Qué tareas o funciones pueden realizar los actores?
  * ¿Qué información maneja cada actor?
  * ¿El actor debe notificar al sistema cambios externos?
  * ¿El sistema debe notificar a un actor cambios que ocurren?
  * ¿El sistema interactúa con otro sistema?
  
  Con las respuestas a estas preguntas es posible describir los casos de uso, de los que se puede consignar al menos: 
    * Nombre y descripción del caso de uso.
    * Actores que intervienen.
    * Precondiciones y postcondiciones.
    * Curso que debe seguir la ejecución del caso de uso.
    * Gestión de alternativas; errores o excepciones que pueden darse en la ejecución del caso de uso y la gestión que se propone de los mismos.
   
* Identificar las relaciones
  
##### Ejemplo Buscaminas

¿Qué casos de uso identificamos?
* Iniciar una nueva partida.
* Marcar una casilla.
* Descubrir una casilla.
  
¿Quién realiza estos casos de uso? » El jugador.

* Caso de Uso: interacción entre actores y el sistema que produce un resultado observable de valor para un actor.
* Actor: alguien o algo externo al sistema que interactúa con él desempeñando un rol. Un caso de uso siempre es iniciado por un actor externo.
* Asociación: la participación de un actor es necesaria para realizar el caso de uso.
* Límite del sistema: agrupa casos de uso dentro de un mismo sistema. Útil cuando tenemos varios sistemas / subsistemas.

## Diagramas de Interacción.

### Diagramas de secuencia.

* *El diagrama de secuencia es un tipo de diagrama usado para modelar interacción entre objetos en un sistema según UML. En inglés se pueden encontrar como "sequence diagram", "event-trace diagrams".* [Fuente wikipedia](https://es.wikipedia.org/wiki/Diagrama_de_secuencia)
  
* Sirven para destacar el orden temporal de los mensajes. Presentan un conjunto de roles y los mensajes enviados y recibidos por las instancias que interpretan dichos roles. Tiene forma de tabla con objetos dispuestos en horizontal y mensajes en vertical, ordenados temporalmente.

![Diagramas de secuencia](https://upload.wikimedia.org/wikipedia/commons/e/e5/Diagrama_de_secuencia_creación_de_usuario.png "Ejemplo diagrama de secuencia Fuente: https://upload.wikimedia.org/wikipedia/commons/e/e5/Diagrama_de_secuencia_creación_de_usuario.png")

#### Elementos que intervienen en el diagrama de secuencia:

* Actores y Objetos que intervienen en la interacción en el __eje horizontal__ representados por su nombre dentro de una caja.
  * _Mensajes_ que estos objetos se envían entre sí:
    * Síncronos: No devuelven el control al objeto que los llama hasta que han terminado su ejecución. Representados por una flecha de punta rellena y línea continua. 
    * Asíncronos: El objeto que envía un mensaje asíncrono continúa su ejecución, una vez que lo envía, sin esperar a que finalice la ejecución del método al que ha llamado. Se representa mediante una flecha de línea continua y cabeza abierta
    * De retorno: Son opcionales, representan la llegada de mensajes de confirmación, se representan mediante flecha de línea discontinua.

  * _Una línea de vida_, indicadora del tiempo en el __eje vertical__ mediante una __línea discontinua__ que indica el tiempo de vida del objeto, es decir, el tiempo en el que existe el objeto. Con la línea de vida se puede señalar:
    * Creación de objetos. Mediante flechas de llamada que terminan en el objeto creado (se puede añadir la palabra _create_ sobre la flecha)
    * Destrucción de los objetos. Terminando la línea de vida de dicho objeto con una _X_ o aspa sobre ella.
    
  * _Focos de control o barras de activación_, que muestran el periodo de tiempo durante el que el objeto ejecuta alguna operación y se representan mediante un __rectángulo__ en la línea de vida. Pueden tener un mensaje de retorno. También se puede mostrar si se produce anidamiento de llamadas (entre métodos de la misma clase), así como llamadas recursivas.
  
  * Bucles, opciones y alternativas. Se representan encerrando en un bloque rectangular los elementos que intervienen en ellos. Así como sus condiciones de ejecución.



#### Recursos y ejemplos

* [Diagramas de secuencia, Manuel Cillero](https://manuel.cillero.es/doc/metrica-3/tecnicas/diagrama-de-interaccion/diagrama-de-secuencia/)


### Diagramas de comunicación.

Muestran una información muy similar a los de secuencia. La mayoría de herramientas UML permiten generar uno a partir del otro.


### Diagramas de estados.

![Diagrama de estados](https://www.uml-diagrams.org/notation/state-composite.png "Ejemplo simple de diagrama de estados Fuente: https://www.uml-diagrams.org/notation/state-composite.png")

En algunas referencias también se denomina diagrama de máquina de estados.
Describen el comportamiento del sistema. Suelen representar los estados posibles de objetos concretos del sistema. Se componen de:

* Estados del objeto
  * Inicial. Es el punto de partida del diagrama, se representa por un círculo.
  * Final. Es el último estado del objeto. Se representa mediante un círculo dentro de otro.
  * Estado intermedio. Son todos los que transcurren entre los dos anteriores, se representan mediante un rectángulo con el nombre del estado en su interior.
* Transición, Línea que representa la unión de dos estados del objeto desencadenada por un evento.
* Evento que desencadena el cambio de un estado a otro, se representa mediante un nombre sobre la línea que representa la transición


### Diagramas de actividades.

![Diagrama de actividad](https://upload.wikimedia.org/wikipedia/commons/f/f9/Ejemplo_de_actividad.jpg "Ejemplo diagrama de actividad Fuente: https://upload.wikimedia.org/wikipedia/commons/f/f9/Ejemplo_de_actividad.jpg")

Constituyen una variante sobre los diagramas de estados. Si se considera que el diagrama de estados muestra el flujo de control entre diversas actividades.

* Permiten describir cómo un sistema implementa su funcionalidad.
* Modelan el comportamiento dinámico de un procedimiento, transacción o caso de uso haciendo énfasis en el proceso que se lleva a cabo.
* Es uno de los elementos de modelado que son mejor comprendidos por todos, ya que son herederos directos de los diagramas de flujo.
* Son mas expresivo que los diagramas de flujo.

#### Elementos del diagrama de actividades

* Inicio (Nodo origen)
* Acción, constituye una ejecución básica, se representan mediante un rectángulo con el nombre dentro. Tienen una entrada y una salida 
* Decisión entre alternativas, se representan mediante un rombo con una entrada y tantas salidas como alternativas, que serán otras acciones.
* Fin
* Líneas que conectan los elementos

* También pueden tener _fork_ y _join_ que representan la bifurcación de flujos que transcurren en paralelo, que _concurren_. Se inician mediante fork (recordar de GIT) y se cierran mediante join. Se representan mediante un rectángulo relleno del que parten o llegan más de una línea.




### Recursos
* [Requisito vs Caso de Uso vs Historia de usuario](http://www.angellozano.com/requisitos-del-sistema-vs-casos-uso-vs-historias-usuario/)
* [Casos de uso](https://repositorio.grial.eu/bitstream/grial/1155/1/UML%20-%20Casos%20de%20uso.pdf)