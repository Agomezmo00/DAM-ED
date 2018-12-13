# Diseño y realización de pruebas

## Introducción

En el desarrollo de software se establecen mecanismos destinados a verificar que el producto es válido __antes__ de su puesta en producción. Por lo tanto, se trata de una etapa más en el desarrollo del software. 

Hay que tener en cuenta que la realización de las pruebas involucra varias fases:
1. Planificación de las pruebas.
2. Diseño.
3. Construcción de casos de prueba.
4. Análisis y registro de los resultados.
5. Registro de los errores.
6. Depuración de los errores.
7. Informe de resultados.

## Técnicas de diseño de pruebas

*Un caso de prueba o test case es, en ingeniería del software, un conjunto de condiciones o variables bajo las cuales un analista determinará si una aplicación, un sistema software (software system), o una característica de éstos es parcial o completamente satisfactoria.* Fuente: [Wikipedia, Caso de prueba](https://es.wikipedia.org/wiki/Caso_de_prueba)

El caso de prueba debe definir una serie de entradas, condiciones de ejecución y resultados esperados.


### Pruebas de caja blanca

Se denominan también como pruebas de caja de cristal o estructurales. Inciden en el examen de los detalles procedimentales del código. Mediante este tipo de pruebas se busca llevar a cabo pruebas que:

* Ejecutar los bucles en sus límites.
* Ejecutar las decisiones lógicas por ambos lados (verdadero/falso).
* Emplear todas las estructuras de datos.
* Ejecutar *todo* el código al menos una vez --> Asegurar que se ejecutan al menos una vez todos los itinerarios posibles de los módulos.


### Pruebas de caja negra

También se denominan pruebas de comportamiento. Se efectúan sin entrar en los detalles del código, atendiendo únicamente a la interfaz que provee la aplicación. Aquí se busca poder asegurar que el software es *operativo* desde el punto de vista de sus funciones, evaluando las salidas que producen entradas determinadas. Mediante esta estrategia se pretende crear pruebas que presenten:

* Errores en la interfaz.
* Errores de rendimiento.
* Errores de inicialización o finalización.
* Funcionalidades ausentes o incorrectas.

## Estrategias de pruebas del software

A la hora de llevar a cabo las pruebas, se plantean una serie de estrategias que tratan de abordar todos los aspectos del funcionamiento del software. Se considera adecuado un modelo de estrategia que va de aspectos más particulares a otros más generales. Así, se definen 4 tipos de pruebas;

* Unitarias
* Integración
* Validación
* Sistema

### Pruebas unitarias

*Una prueba unitaria es una forma de probar el correcto funcionamiento de un módulo de código. Esto sirve para asegurar que cada uno de los módulos funcione correctamente por separado.*  Fuente: [Wikipedia, Caso de prueba](https://es.wikipedia.org/wiki/prueba_unitaria)

En el contexto que nos ocupa podemos decir que pretencden probar el comportamiento adecuado de las clases de manera aislada. Así, se prueban las clases aislándolas de su interacción con otras. Se trata de probar aspectos como:

* Estructuras de datos locales.
* Aspectos de la interfaz de la clase.
* Las condiciones límite (bucles, etc.).
* Los itinerarios independientes de las estructuras de control, asegurando la ejecución de las sentencias en una ocasión al menos.
* Sistemas de control y manejo de errores.

Al crear pruebas unitarias, es interesante tener en cuenta los principios [FIRST](https://www.paradigmadigital.com/dev/principio-first-aumentar-la-calidad-tests-unitarios/)

### Pruebas de integración

*Las pruebas de integración son aquellas que se realizan en el ámbito del desarrollo de software una vez que se han aprobado las pruebas unitarias y lo que prueban es que todos los elementos unitarios que componen el software, funcionan juntos correctamente probándolos en grupo.*[Wikipedia, pruebas de integración](https://es.wikipedia.org/wiki/Pruebas_de_integraci%C3%B3n)

Hay dos enfoques para trazar este tipo de pruebas:

* Incremental.
	* Se construye y se prueba el software completo dividido en pequeños segmentos. Hay dos estrategias; ascendente y descendente. Mediante la primera, se comienza desde los módulos de los niveles más bajos (los menos relevantes) a los más importantes y viceversa en la segunda, que iría del módulo (o clase) principal a las secundarias. 

	* Planteando la estructura de clases como un árbol, el enfoque ascendente pretende ir de las hojas a la raíz, mientras que la descendente pretende hacerlo desde la raíz a las hojas.

* No incremental
	 * Consiste en la prueba de todo el proyecto *de golpe*. No se aconseja este enfoque porque la aparición de errores es abundante y no se facilita su corrección.

### Pruebas de validación

*Las pruebas de validación en la ingeniería de software son el proceso de revisión que verifica que el sistema de software producido que cumple con las especificaciones y que logra su cometido.* [Wikipedia, pruebas de validación](https://es.wikipedia.org/wiki/Pruebas_de_validaci%C3%B3n)

Se entiede que el software es válido cuando funciona de acuerdo a la especificación de requisitos. Son pruebas de caja negra y se contemplan dos técnicas:

* Pruebas Alfa. Más experimentales. Hechas por el cliente junto al desarrollador, que debe registrar los fallos a fin de corregirlos.
* Pruebas Beta. Más definitivas. Hechas por el cliente sin el desarrollador presente. Se registran los fallos y se informan al desarrollador para corregirlas. Las correcciones desembocan por tanto en una nueva versión del software.

### Pruebas del sistema

Son una ejecución más global del software y verifican los siguientes aspectos:

* Resistencia. Se pretende llevar el producto a situaciones límite para evaluar la capacidad de respuesta en situaciones de alta demanda.
* Seguridad. Buscan verificar que el producto está protegido contra fenómenos como los accesos ilegales, etc.
* Recuperación. Se trata de forzar fallos en el software para comprobar la capacidad de recuperación del mismo.


