# Elaboración de diagramas de clases

## El lenguaje UML

*El lenguaje unificado de modelado (UML, por sus siglas en inglés, Unified Modeling Language) es el lenguaje de modelado de sistemas de software más conocido y utilizado en la actualidad; está respaldado por el Object Management Group (OMG).*

*Es un lenguaje gráfico para visualizar, especificar, construir y documentar un sistema. UML ofrece un estándar para describir un "plano" del sistema (modelo), incluyendo aspectos conceptuales tales como procesos, funciones del sistema, y aspectos concretos como expresiones de lenguajes de programación, esquemas de bases de datos y compuestos reciclados.*

*Es importante remarcar que UML es un "lenguaje de modelado" para especificar o para describir métodos o procesos. Se utiliza para definir un sistema, para detallar los artefactos en el sistema y para documentar y construir. En otras palabras, es el lenguaje en el que está descrito el modelo.*

*Se puede aplicar en el desarrollo de software gran variedad de formas para dar soporte a una metodología de desarrollo de software (tal como el Proceso Unificado Racional, Rational Unified Process o RUP), pero no especifica en sí mismo qué metodología o proceso usar.*

*UML no puede compararse con la programación estructurada, pues UML significa Lenguaje Unificado de Modelado, no es programación, solo se diagrama la realidad de una utilización en un requerimiento. Mientras que programación estructurada es una forma de programar como lo es la orientación a objetos, la programación orientada a objetos viene siendo un complemento perfecto de UML, pero no por eso se toma UML solo para lenguajes orientados a objetos.*

*UML cuenta con varios tipos de diagramas, los cuales muestran diferentes aspectos de las entidades representadas.* [UML, Wikipedia ES](https://es.wikipedia.org/wiki/Lenguaje_unificado_de_modelado)

### Versiones de UML

Los inicios de UML provienen de los años 90 del S. XX con distintos estándares para modelado de software. Hay dos grupos básicos: UML 1.X hasta 1.5 y UML 2.X, hasta 2.6 en la primera década del S.XXI.

UML es un conjunto muy amplio de normas y es complicado abarcarlas todas. Según el ámbito de la empresa o universidad, institución o centro de trabajo se usan determinados programas para crear diagramas y se conocen ciertas partes de UML, pero no el conjunto de todo lo definido por el UML.

¿Qué versión usar? Para generar diagramas UML se usa software específico. Lo importante de la documentación es que sirva a sus destinatarios, más allá de la versión del lenguaje utilizada. En el mundo corporativo no se presta tanta atención a que se cumpla estrictamente con las normas de una determinada versión de UML como a que los esquemas estén bien construidos y razonados.

### Tipos de diagramas
Se estructuran en 3 tipos: estructura, comportamiento e interacción y los diversos subtipos que engloba cada uno.

* Diagramas de estructura
Tratan de describir la estructura *estática* del modelo. Sirven para modelar lo que debe tener el modelo. El principal de este tipo es el [Diagrama de Clases](https://manuel.cillero.es/doc/metrica-3/tecnicas/diagrama-de-clases/)

* Diagramas de comportamiento
Tratan de describir la estructura *dinámica* del modelo. Se enfocan en aquello que debe hacer el sistema, lo que debe ocurrir cuando el modelo esté funcionando. El principal de este tipo es el [Diagrama de Casos de Uso](https://ingsotfwarekarlacevallos.wordpress.com/2015/06/04/uml-casos-de-uso/)

* Diagramas de interacción
Derivan de los de comportamiento y se centran en el flujo de control y datos dentro del sistema que se modela. El principal de este tipo es el [Diagrama de Secuencia](https://manuel.cillero.es/doc/metrica-3/tecnicas/diagrama-de-interaccion/diagrama-de-secuencia/).


* Visión global de los diagramas en UML2

![alt-text](https://upload.wikimedia.org/wikipedia/commons/f/fc/Uml_diagram-es.svg
 "Diagramas en UML2, Fuente: Wikipedia")


#### Diagramas de estructura:

* __[Diagrama de clases](https://manuel.cillero.es/doc/metrica-3/tecnicas/diagrama-de-clases/)__. Los diagramas de clase son los más utilizados. Muestran las clases del sistema, sus atributos y las operaciones de cada clase, así como las relaciones entre cada clase. En la mayoría de las herramientas de modelado, cada clase se divide en tres partes:

	* El nombre en la parte superior, 
	* Los atributos en el centro
	* Los métodos en la parte inferior. 

En sistemas grandes con muchas clases relacionadas, las clases se agrupan para crear diagramas de clases. Las [relaciones entre las clases PDF ES](http://elvex.ugr.es/decsai/java/pdf/3C-Relaciones.pdf) se muestran por flechas, cuyo aspecto varía en función del tipo de relación.



* __Diagrama de componentes__. Un diagrama de componentes muestra la relación estructural de los componentes de un sistema de software. Estos se utilizan principalmente cuando se trabaja con sistemas complejos que tienen muchos componentes. Los componentes se comunican entre sí mediante interfaces. Las interfaces se enlazan mediante conectores.

* __Diagrama de despliegue__. Un diagrama de despliegue muestra el hardware de su sistema y el software de ese hardware. Los diagramas de implementación son útiles cuando la solución de software se despliega en varios equipos, cada uno con una configuración única.

* __Diagrama de objetos__. Los diagramas de objetos, a veces denominados diagramas de instancia, son muy similares a los diagramas de clases. Al igual que los diagramas de clases, también muestran la relación entre los objetos, pero usan ejemplos del mundo real. Se utilizan para mostrar cómo se verá un sistema en un momento dado. Debido a que hay datos disponibles en los objetos, a menudo se utilizan para explicar relaciones complejas entre objetos.

* __Diagrama de paquetes__. Como su nombre indica, un diagrama de paquetes muestra las dependencias entre diferentes paquetes de un sistema.
Diagrama de perfiles El diagrama de perfil es un nuevo tipo de diagrama introducido en UML 2. Este es un tipo de diagrama que se utiliza muy raramente en cualquier especificación.

* __Diagrama de estructura compuesta__. Los diagramas de estructura compuesta se utilizan para mostrar la estructura interna de una clase.



### Recursos UML

[UML Fernando Berzal PDF ES](http://elvex.ugr.es/decsai/java/pdf/3E-UML.pdf)

### Otros recursos

* [ArgoUML](http://argouml.tigris.org)
* [Plugin Papyrus Eclipse](https://www.eclipse.org/papyrus/index.php)
* [Papyrus USER GUIDE EN](https://wiki.eclipse.org/Papyrus_User_Guide)
* [PACMAN Java](https://github.com/dtschust/javapacman.git)