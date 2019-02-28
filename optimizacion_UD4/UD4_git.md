# El control de versiones mediante git

## Introducción

*Se llama control de versiones a la gestión de los diversos cambios que se realizan sobre los elementos de algún producto o una configuración del mismo. Una versión, revisión o edición de un producto, es el estado en el que se encuentra el mismo en un momento dado de su desarrollo o modificación.* [Fuente](https://es.wikipedia.org/wiki/Control_de_versiones).

[Git](https://git-scm.com) es un sistema de control de versiones cuyo cometido es tener controlados los cambios que se producen en los ficheros. Para ello, podemos decir que cuando se lo indicamos va tomando [_fotografías_](https://git-scm.com/book/es/v1/Empezando-Fundamentos-de-Git) de los ficheros y nos muestra qué cosas han cambiado en los ficheros desde la anterior fotografía a la actual.

Hay que familiarizarse con el concepto de repositorio de código.


## Configuración en Windows

[Instalación de git en Windows](http://www.programandoapasitos.com/2016/08/instalacion-y-configuracion-de-git-en.html)

## Estados de los ficheros en git

*Esto es lo más importante a recordar acerca de Git si quieres que el resto de tu proceso de aprendizaje prosiga sin problemas. Git tiene tres estados principales en los que se pueden encontrar tus archivos: confirmado (committed), modificado (modified), y preparado (staged). Confirmado significa que los datos están almacenados de manera segura en tu base de datos local. Modificado significa que has modificado el archivo pero todavía no lo has confirmado a tu base de datos. Preparado significa que has marcado un archivo modificado en su versión actual para que vaya en tu próxima confirmación.*

*Esto nos lleva a las tres secciones principales de un proyecto de Git: el directorio de Git (Git directory), el directorio de trabajo (working directory), y el área de preparación (staging area).*

![Estados de git](https://git-scm.com/figures/18333fig0106-tn.png "Estados de los ficheros en git. Fuente: https://git-scm.com")

### Comandos básicos

* git presenta multitud de comandos para los propósitos más diversos. Sin embargo, la mayoría de nuestro trabajo con él puede hacerse con menos de 10 comandos. 

	* init
	* add
	* checkout
	* commit
	* pull
	* merge
	* push
	* clone

[Guía de comandos básicos](https://www.hostinger.es/tutoriales/comandos-de-git#gref)

### Etiquetar las versiones

*Los tag son una manera de etiquetar estados de tu repositorio, que se usa comúnmente para indicar las versiones o releases de un proyecto.*

*Git tiene la posibilidad de marcar estados importantes en la vida de un repositorio, algo que se suele usar habitualmente para el manejo de las releases de un proyecto. A través del comando "git tag" lo podemos hacer, en una operación que se conoce comúnmente con el nombre de "tagging". Es una operativa que tiene muchas variantes y utilidades, nosotros veremos las más habituales que estamos seguros te agradará conocer.* [Fuente](https://desarrolloweb.com/articulos/especificar-versiones-git-tag.html)

#### Etiquetas ligeras vs Etiquetas anotadas

*Git usa dos tipos principales de etiquetas: ligeras y anotadas. Una etiqueta ligera es muy parecida a una rama que no cambia —un puntero a una confirmación específica—.* 

*Sin embargo, las etiquetas anotadas son almacenadas como objetos completos en la base de datos de Git. Tienen suma de comprobación; contienen el nombre del etiquetador, correo electrónico y fecha; tienen mensaje de etiquetado; y pueden estar firmadas y verificadas con GNU Privacy Guard (GPG). Generalmente se recomienda crear etiquetas anotadas para disponer de toda esta información; pero si por alguna razón quieres una etiqueta temporal y no quieres almacenar el resto de información, también tiene disponibles las etiquetas ligeras.*

[Más info ES](https://git-scm.com/book/es/v1/Fundamentos-de-Git-Creando-etiquetas)

### Qué es el archivo .gitignore, para qué sirve, cómo implementar el gitignore en un repositorio Git.


*Git tiene una herramienta imprescindible casi en cualquier proyecto, el archivo "gitignore", que sirve para decirle a Git qué archivos o directorios completos debe ignorar y no subir al repositorio de código.*

*Su implementación es muy sencilla, por lo que no hay motivo para no usarlo en cualquier proyecto y para cualquier nivel de conocimientos de Git que tenga el desarrollador. Únicamente se necesita crear un archivo especificando qué elementos se deben ignorar y, a partir de entonces, realizar el resto del proceso para trabajo con Git de manera habitual.* [Fuente](https://desarrolloweb.com/articulos/archivo-gitignore.html)


### El stash. Cuando queremos esconder nuestros cambios.

Hay ocasiones en las que tenemos cosas en una rama sin commitear y surge la necesidad urgente de cambiar a otra rama. Si el proceso del commit en ese caso es tedioso: Hay que seleccionar qué ficheros se añaden y cuales no, etc. hay una alternativa para guardar de forma rápida nuestros cambios para:

1. Poder recuperarlos después
2. Poder cambiar a otra rama o crearla sin que estén presentes los cambios actuales.

[Doc oficial](https://git-scm.com/book/es/v1/Las-herramientas-de-Git-Guardado-rápido-provisional)

### Fetch

* ```git fetch``` Sirve para recuperar los cambios del repositorio remoto al local pero dejándolos en otra rama. Hay que recordar que al hacer pull sí se trae a la rama actual. Hay clientes de git, que al hacer pull hacen también fetch de forma automática.

[Más sobre fetch](https://es.stackoverflow.com/questions/245/cuál-es-la-diferencia-entre-pull-y-fetch-en-git)

* [git rebase vs git pull rebase](http://cambrico.net/git-control-de-versiones/rebase-en-git)

### Pull Request

*La traducción directa sería algo así como "Petición de Validación". Una Pull Request es la acción de validar un código que se va a mergear de una rama a otra. En este proceso de validación pueden entrar los factores que queramos: Builds (validaciones automáticas), asignación de código a tareas, validaciones manuales por parte del equipo, despliegues, etc.* [Fuente](http://www.nocountryforgeeks.com/pull-requests/)



### Estrategias de gestión de ramas (branching); git flow

*...Se hablaba de ramas para hacer hot-fixes urgentes, ramas para desarrollar nuevas versiones separadas de las ramas maestras donde está la versión en producción. Ramas para probar nuevas versiones, ramas y repositorios para trabajar con proveedores externos, ramas para hacer pruebas en pre-producción, ramas para que los departamentos de calidad hagan sus pruebas antes de liberar nuevas versiones. Con git podemos crear ramas “como churros”...*

*Sin embargo, esta facilidad para crear ramas también se puede utilizar para hacer el mal y sembrar el terror...*

*Para no acabar en el caos, debemos establecer unas “reglas del juego” que todo el equipo debe respetar. Aunque a grandes rasgos casi todos los proyectos pueden utilizar unas reglas de base comunes, las reglas deben ser flexibles para adaptarse a los cambios que puedan surgir en el tablero de juego; al fin y al cabo, las necesidades y particularidades de cada equipo, empresa o proyecto no son las mismas.*

*¿Y cuáles son estas reglas base comunes? En enero de 2010 Vincent Driessen publicó en su blog un artículo en el que compartía con la comunidad un flujo de trabajo que a él le estaba funcionando: “A successful Git branching model”. Como él mismo cuenta en el artículo (te recomiendo encarecidamente que lo leas) Vincent propone una serie de “reglas” para organizar el trabajo del equipo.* [Fuente](http://aprendegit.com/que-es-git-flow/)


#### Ramas master y develop

* El trabajo se organiza en dos ramas principales:

	* Rama __master__: cualquier commit que pongamos en esta rama debe estar __preparado para subir a producción__
	* Rama __develop__: rama en la que está el código que conformará __la siguiente versión del proyecto__

* Cada vez que se incorpora código a master, tenemos una nueva versión.

* Además de estas dos ramas, Se proponen las siguientes ramas auxiliares:

	* __Feature__: Salen de y vuelven a develop. Se utilizan para desarrollar nuevas características de la aplicación.
	* __Release__: Salen de develop. Se integran en master o develop. Se utilizan para preparar el siguiente código en producción. En estas ramas se hacen los últimos ajustes y se corrigen los últimos bugs antes de pasar el código a producción incorporándolo a la rama master.
	* __Hotfix__: Salen de master y se integran en master y develop. Se utilizan para corregir errores y bugs en el código en producción

[Más info git-flow](http://aprendegit.com/que-es-git-flow/)
[Vídeo estrategias branching Commit Conf](https://www.youtube.com/watch?v=LYn5Tc8O4GE)


### Versatilidad de los comandos en git. Ejemplo de checkout.

* La función principal es para cambiar de rama ```git checkout nombreRama```
* También permite crearlas ```git checkout -b```
* Es posible deshacer los cambios ```git checkout -- ficheros```

### git reset y git revert. Borrando o Deshaciendo cosas

Si ```git add``` es el comando habitual para decir que los ficheros están listos para ser commiteados, ```git reset``` lo es para decir que los ficheros que habíamos señalado como listos, no lo están. Puede ser porque se nos ha olvidado poner algo en el fichero o quitar algo que sobra, etc. Antes de hacer el commit, es posible quitar esos ficheros del commit. Lo que aparece a continuación se muestra siempre en el terminal cuando se ven los ficheros añadidos.

```
Changes to be committed:
#   (use "git reset HEAD <file>..." to unstage)
#
```

[Borrar el último commit con reset y revert](https://www.solucionex.com/blog/borrar-ultimo-commit-con-reset-y-revert-en-git)


## Documentación

Documentar un proyecto es algo fundamental de cara al mantenimiento posterior. Cuando se desarrolla una clase, es conveniente generar documentación lo suficientemente detallada sobre ella como para que otros programadores sean capaces de usarla sólo con su interfaz. No debe existir necesidad de estudiar su implementación del mismo modo que para manejar una clase del API de Java no es necesario conocer su código fuente.

Al documentar una clase es conveniente incluir:

* Nombre de la clase
* Descripción general (*brief*) 
* Versión
* Autores
* Documentación de cada constructor o método (especialmente los declarados como públicos):
	* Nombre del constructor o método
	* Tipo de retorno
	* Nombres y tipos de parámetros (si hay)
	* Descripción general
	* Descripción de parámetros (si hay)
	* Descripción del valor que devuelve


### Javadoc

[Javadoc](https://es.wikipedia.org/wiki/Javadoc) es una utilidad para la generación de documentación de APIs a partir de código fuente Java. Viene con el propio JDK de Java y el resultado de la documentación que se genera está en formato HTML.

A grandes rasgos, es el método estándar para documentar clases de Java. La mayoría de los IDEs lo utilizan para generar de forma automática documentación de las clases, aunque existen otras herramientas que aportan distintas funcionalidades, como [Doxygen](http://www.doxygen.nl).


Para que javadoc genere documentación automáticamente hay que cumplir ciertas reglas:

* La documentación para javadoc ha de incluirse entre símbolos de comentario que han de empezar con una barra y doble asterisco, y terminar con un asterisco y barra simple.

```java
/**
 * Comentario para javadoc
 */
```
 

* La ubicación le define a javadoc qué representa el comentario: 
	* si está justo ANTES de la declaración de clase se considerará un comentario de clase, 
	* si está justo ANTES de la declaración de un constructor o método se considerará un comentario de ese constructor o método.

* Para indicar a javadoc lo que significan los comentarios incluidos se usan ciertas palabras reservadas (tags) precedidas por "@", dentro de los símbolos de comentario javadoc. Si no existe al menos una línea que comience con @ no se reconocerá el comentario para la documentación de la clase. [Listado JavaSE EN](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/javadoc.html#CHDBEFIF)


## Refactorización

### ¿En qué consiste refactorizar?

*Refactorizar es un concepto interesante: consiste en mejorar el código poco a poco. Me gusta definirlo con una frase que aparece en el libro: así como con el tiempo el software se deteriora poco a poco, la refactorización debería mejorar el código poco a poco, sin realizar grandes cambios.*

*Cuando uno tiene entre sus manos un programa que no está en muy buenas condiciones, lo primero que desea es rehacerlo todo desde cero. Esto no es ni una posición realista, porque no se suele poder asumir el coste de una demolición y posterior construcción, ni respetuosa con los que lo programaron: no solemos saber las circunstancias en las que fue hecho ni los condicionantes de las decisiones. Frente a este deseo de rehacer todo surge el concepto de refactorización, que anima a ir cambiando el código a pasos pequeños y seguros.* [Fuente](https://www.adictosaltrabajo.com/2015/09/28/repasando-los-clasicos-refactoring-de-martin-fowler/)

La refactorización de código es la reescritura de una funcionalidad manteniendo su interfaz. Esto significa que se reemplaza el código pero se mantienen sus precondiciones y poscondiciones, es decir, lo que se debe aportar y lo que se debe obtener del código, respectivamente.

El objetivo puede ser variado, pero suele involucrar estos aspectos:

* Mejorar la reusabilidad. Crear componentes reutilizables.
* Optimizar un componente en términos de rendimiento.
* Corregir bugs provenientes de diseños erróneos.
* Generalizarlo para otros propósitos o entornos. Por ejemplo, parte del código responsable del acceso a los datos se puede refactorizar utilizando un framework que haga la aplicación independiente del DMBS utilizado.
* Mejorar la legibilidad del código.


### Bad smells ([Malos olores](https://es.wikipedia.org/wiki/Hediondez_del_código))

Son aquellos *síntomas* que se pueden encontrar en el código y que indican que probablemente existan otros problemas más profundos en la calidad del código, de diseño, o de ambos. 


* [Listado de algunos bad smells frecuentes](https://blog.intive-fdv.com.ar/repaso-los-code-smells-mas-comunes/)

* [Otro listado de bad smells ED](http://entornos.codeandcoke.com/doku.php?id=apuntes:refactorizacion#bad_smells)

### Refactorización en eclipse

* [Intro básica](https://tutobasico.com/refactoring-eclipse/)

* [Refactorización ED](http://entornos.codeandcoke.com/doku.php?id=apuntes:refactorizacion#refactorizacion_de_eclipse)


```java

public class GeneraPrimos {

	public static int[] generarPrimos(int max) {
		int i, j;
		
		if (max >= 2) {
		
			// Declaraciones
			
			int dim = max + 1; // Tamaño del array
			boolean[] esPrimo = new boolean[dim];
			
			// Inicializar el array
			for (i = 0; i < dim; i++) {
				esPrimo[i] = true;
			}
				
			// Eliminar el 0 y el 1, que no son primos
			esPrimo[0] = esPrimo[1] = false;
			
			// Se hace la criba de los que son múltiplos de otros y por tanto, no primos
			for (i = 2; i < Math.sqrt(dim) + 1; i++) {
				if (esPrimo[i]) {
					
					// Eliminar los múltiplos de i
					for (j = 2 * i; j < dim; j += i)
						esPrimo[j] = false;
				}
			}

			// ¿Cuántos primos hay?
			int cuenta = 0;
			for (i = 0; i < dim; i++) {
				if (esPrimo[i])
					cuenta++;
			}

			// Rellenar el vector de números primos
			
			int[] primos = new int[cuenta];
			
			for (i = 0, j = 0; i < dim; i++) {
				if (esPrimo[i])
					primos[j++] = i;
			}
			return primos;
			
		} else { 
			
			// max < 2
			return new int[0]; // Vector vacío
		}
	}

}
```

## Recursos

* __Ayuda de git__. Prueba a escribir -h a continuación de cualquier comando git. Por ejemplo: ```git branch -h``` y observa la documentación que te muestra. Además, si te equivocas al escribir un comando porque te dejas una letra o lo escribes sin los modificadores adecuados, git *entiende* que es lo que quieres hacer y te ofrece sugerencias.


* [GIT cheat sheet[PDF EN]](https://services.github.com/on-demand/downloads/github-git-cheat-sheet.pdf)

* [Taller de GIT PDF ES](https://ingenieriainformatica.uniovi.es/c/document_library/get_file?uuid=bbd3510e-4a10-4842-a29f-2d75f4bf9c12&groupId=780436)

* [Píldora de GIT UV PDF ES](https://www.uv.es/capgeminiuv/documents/P%C3%ADldora%20de%20Git.pdf)

* [Guía sencilla de GIT](http://rogerdudler.github.io/git-guide/index.es.html)

* [gitignore.io](https://www.gitignore.io)

* [Egit](https://www.eclipse.org/egit/)

* [GIT en eclipse (Más antiguo)](https://www.arquitecturajava.com/eclipse-git-repositorios/)

* [Importar a eclipse desde Github o otro repositorio](https://danielme.com/2013/08/07/importar-repositorios-de-github-con-git-o-eclipse/)

* [Ejemplo Proyecto para eclipse](https://github.com/jarroba/PolimorfismoJarroba)

* [Intro JAVADOC PREZI](https://prezi.com/t8wgiyfo4w54/introduccion-a-javadoc/)

