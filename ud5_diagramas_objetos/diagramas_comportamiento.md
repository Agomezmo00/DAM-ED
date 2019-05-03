## Diagramas de comportamiento.

Tratan de describir la estructura *dinámica* del modelo. Se enfocan en aquello que debe hacer el sistema, lo que debe ocurrir cuando el modelo esté funcionando.

### Diagramas de casos de uso.

*Un caso de uso es una descripción de las acciones de un sistema desde el punto de vista del usuario. Es una herramienta valiosa dado que es una técnica de aciertos y errores para obtener los requerimientos del sistema, justamente desde el punto de vista del usuario.*

*Los diagramas de caso de uso modelan la funcionalidad del sistema usando actores y casos de uso. Los casos de uso son servicios o funciones provistas por el sistema para sus usuarios.* [Fuente](https://ingsotfwarekarlacevallos.wordpress.com/2015/06/04/uml-casos-de-uso/)

#### Elementos que intervienen en el diagrama de casos de uso:
Para ver qué es el diagrama de caso de uso, primero es conveniente definir el caso de uso. A grandes rasgos puede decirse que se compone de: 

* Conjunto de acciones realizadas por el sistema.
* Producen un resultado observable.
* Participan actores.

Representan una unidad funcional del sistema que se lleva a cabo tras una acción de algún agente externo, generalmente una orden. Se representa mediante una elipse que encierra una descripción de texto.

##### Elementos que componen el diagrama de caso de uso.

* Actor. *Se le llama actor a toda entidad externa al sistema que guarda una relación con éste y que le demanda una funcionalidad. Esto incluye a los operadores humanos pero también incluye a todos los sistemas externos, además de entidades abstractas, como el tiempo.* [Fuente](https://es.wikipedia.org/wiki/Caso_de_uso#Actores). Se suele representar mediante un muñeco o monigote. 
  
* Relaciones. Pueden ser de varios tipos:
  * Asociación ----------- (línea recta) Relación entre actores y casos de uso.

  * Extensión  - - - - - > (flecha línea discontinua) Un caso de uso también se puede definir como una extensión incremental de un caso de uso base. Inserción de comportamiento adicional en un caso de uso base que no tiene conocimiento sobre él

  * Generalización de casos de uso ----------> (flecha línea continua) Un caso de uso también se puede especializar en uno o más casos de uso hijos. Una relación entre un caso de uso general y un caso de uso más específico, que hereda y añade propiedades al caso de uso base

  * Inclusión - - - - - > (flecha línea discontinua) Un caso de uso puede incorporar el comportamiento de otros casos de uso como fragmentos de su propio comportamiento. Inserción de comportamiento adicional en un caso de uso base, que describe explícitamente la inserción

* Límite del sistema. Se suele dibujar una línea que delimita el conjunto del sistema, para señalar qué elementos están dentro y cuáles están fuera del mismo.
  
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
