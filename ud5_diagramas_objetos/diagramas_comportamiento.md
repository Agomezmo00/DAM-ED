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



### Diagramas de secuencia.
### Diagramas de estado.
### Diagramas de comunicación.
### Diagramas de actividades.




### Recursos
* [Requisito vs Caso de Uso vs Historia de usuario](http://www.angellozano.com/requisitos-del-sistema-vs-casos-uso-vs-historias-usuario/)
* [Casos de uso](https://repositorio.grial.eu/bitstream/grial/1155/1/UML%20-%20Casos%20de%20uso.pdf)