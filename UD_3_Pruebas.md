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

*Una prueba unitaria es una forma de probar el correcto funcionamiento de un módulo de código. Esto sirve para asegurar que cada uno de los módulos funcione correctamente por separado.*  Fuente: [Wikipedia, Pruebas Unitarias](https://es.wikipedia.org/wiki/prueba_unitaria)

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


## Pruebas de código

Consisten en la ejecución de los programas con el fin de localizar errores o fallos en los mismos. Para ello hay que definir una serie de entradas así como los resultados que se espera obtener a partir de ellas. Hay que observar si el funcionamiento se ajusta a lo esperado o no y por qué.

### Camino básico (Complejidad ciclomática) 
Es una prueba de caja blanca. Demuestra el conjunto de pasos base del programa, pretende lograr es que cada sentencia de código se ejecute como mínimo una vez.

Se trata de una técnica de prueba que permite al diseñador de casos de prueba obtener una medida de la complejidad lógica de un diseño procedimental y usar esa medida como guía para la definición de un conjunto básico diseño de casos de prueba de caminos de ejecución, los casos de prueba derivados del conjunto básico garantizan que durante la prueba se ejecuta por lo menos una vez cada sentencia del programa.

La idea es derivar casos de prueba a partir de un conjunto dado de caminos independientes por los cuales puede circular el flujo de control. Para obtener dicho conjunto de caminos independientes se construye el Grafo de Flujo asociado y se calcula su [complejidad ciclomática](https://es.wikipedia.org/wiki/Complejidad_ciclomática).


![alt-text](https://upload.wikimedia.org/wikipedia/commons/6/69/Grafo_de_control_de_flujo.gif "grafos de flujo de wikipedia")

Ejemplos de grafos de control de flujo: Secuencial, condicional (if), Mientras que (while), repetir hasta (do... while), casos múltiples (switch). Se construyen grafos a partir de los diagramas de flujo. 

* Los círculos (o nodos) representan las sentencias sin bifurcaciones, 
* Las flechas (o enlaces) representan el flujo de control. 
* El área delimitada por aristas o nodos se denomina región.
* A los nodos que contienen condiciones y por ello tienen más de una salida se los denomina nodos predicado. 



La complejidad ciclomática V(G) se puede calcular al menos de tres formas diferentes:

* V(G) = número de regiones del grafo.
* V(G) = Aristas - Nodos + 2.
* V(G) = Nodos predicado + 1.

```java
// a, b, c integers

if(a == 50) {
	if(b > c) {
		a = b;
	} else {
		a = c;
	}
}

System.out.println(a);

/* 
	* En función de los valores, se ejecutan unas sentencias u otras
	* Hacer el diagrama de flujo
	* Dibujar el grafo de flujo para el código anterior
	* Calcular la complejidad ciclomática
*/

```

Para determinar el riesgo de un código evaluado mediante este sistema se ha establecido lo siguiente:

| Complejidad ciclomática | Riesgo potencial | 
| :------- | :------: | 
| 1 <= V(G) <= 10  | Riesgo bajo    | 
| 11 <= V(G) <= 20   | Riesgo moderado  | 
| 21 <= V(G) <= 50   | Riesgo alto  | 
| V(G) > 50   | Riesgo muy alto  | 

El valor de V(G) proporciona el número de caminos independientes del conjunto básico de un programa. Un *camino independiente* es cualquier camino del programa que introduce, por lo menos, una condición o conjunto de sentencias. En el diagrama de flujo, un camino independiente constituye una arista (al menos) que no ha sido recorrida previamente en la definición del camino.


#### Obtención de casos de prueba

El último paso de este tipo de pruebas es determina los casos de prueba que llevan a la ejecución de cada camino. A fin de comprobar cada camino, se escogerán los casos de prueba de manera que las condiciones de los nodos predicado estén adecuadamente establecidas.

Una forma de representar el conjunto de casos de prueba es mediante una tabla en la que indicar el número de camino, la explicación del caso de prueba y el resultado que se espera obtener de dicho caso de prueba.


| Camino | Caso de prueba | Resultado esperado |
| :------- | :------: | :------: | 
| 1 | a toma valor 50, b mayor que c    | a toma el valor de b |
| 2 | a toma valor 50, b menor que c    | a toma el valor de c |
| 3 | a toma valor distinto de 50    | no entra en el bucle, imprime a |


_Ejercicio_:

_Crea el diagrama y grafo de flujo para un programa que admite hasta 10 números enteros y cuenta cuántos son pares e impares. Calcula la complejidad ciclomática del grafo creado y define los caminos básicos._


### Clases de equivalencia

Es un método de prueba de caja negra. Se basa en dividir los valores de los campos de entrada de un programa en __clases de equivalencia__. Por ejemplo, supongamos que hay un campo de entrada de una función que debe ser un número de 4 cifras y la primera no puede ser un 0. A partir de esta premisa, se puede establecer una clase de equivalencia no válida; números inferiores a 1000 y otra clase válida, números comprendidos entre 1000 y 9999.

Para identificar las clases, se estudian las condiciones de entrada que tiene el código y se dividen en _clases válidas_ y _clases no válidas_, que agruparán los valores de entrada válidos y no válidos respectivamente.

* Reglas para identificar las clases

1. Por cada rango de valores, se especifica una clase válida y dos no válidas.
2. Si se especifica un nº de valores, se creará una clase válida y dos no válidas.
3. Si se especifica una situación del tipo “debe ser” o booleana, se identifica una clase válida y una no válida.
4. Si se especifica un conjunto de valores admitidos, y el programa trata de forma distinta cada uno de ellos, se crea una clase válida por cada valor, y una no válida.
5. Si se sospecha que ciertos elementos de una clase no se tratan igual que el resto de la misma, debe dividirse en clases menores.

Tras aplicar estas reglas, se debe obtener una serie de clases de equivalencia válidas y no válidas que hay que definir para cada tipo de condición de entrada.

| Condiciones de entrada | Clases de equivalencia válidas (Nº)| Clases de equivalencia no válidas (Nº) |
| :------- | :------: | :------: | 
| 1. Rango | 1 CLASE VÁLIDA <br> Valores dentro del rango | 2 CLASES NO VÁLIDAS <br> valor por debajo y valor por encima del rango |
| 2. Valor específico | 1 CLASE VÁLIDA <br> Contempla el valor| 2 CLASES NO VÁLIDAS <br> Un valor por encima y un valor por debajo|
| 3. Miembro de conjunto | 1 CLASE VÁLIDA <br> Una clase por cada uno de los miembros del conjunto | 1 CLASE NO VÁLIDA <br> Un valor que no pertenece al conjunto|
| 4. Lógica | 1 CLASE VÁLIDA <br> Clase que cumpla la condición | 1 CLASE NO VÁLIDA <br> Clase que no cumpla la condición |
| 5. Distinto tratamiento | 0 CLASES VÁLIDAS <br> | 0 CLASES VÁLIDAS <br> |

Una vez que se tienen las clases de equivalencia definidas, mediante una tabla se puede expresar las clases para cada condición de entrada. En las filas se definen las clases de equivalencia para la condición de entrada, se define un código para cada clase definida (válidas y no válidas) para definir a partir de él los casos de prueba.


* Identificar los casos de prueba

1. Asignar un número único a cada clase de equivalencia.
2. Se escribe un caso que cubra tantas clases válidas como sea posible hasta que estén todas las clases de equivalencia cubiertas por casos de prueba.
3. Se escribe un caso de prueba para cada clase no válida.

### Condiciones límite
Los casos de prueba que analizan las condiciones en los límites producen mejores resultados. Es habitual que las situaciones límite acumulen defectos del software.

La diferencia entre el análisis de las condiciones límite con las particiones de equivalencia es que en los límites no se elige cualquier elemento de la clase sino aquellos que buscan someter a prueba los márgenes.

* Reglas para identificar los casos de prueba:
1. Si una condición de entrada especifica un rango delimitado por los valores a y b, se deben generar casos para a, b y casos no válidos justo por debajo y por encima de ambos.
2. Si una condición de entrada especifica un número de valores, se deben desarrollar casos de prueba que ejerciten los vslores máximo y mínimo, uno más el máximo y uno menos el mínimo.
3. Aplicar las directrices anteriores a las condiciones de salida.
4. Si las estructuras de datos internas tienen límites preestablecidos, habría que asegurarse de diseñar un caso de prueba que ejercite la estructuta de datos en sus límites.
