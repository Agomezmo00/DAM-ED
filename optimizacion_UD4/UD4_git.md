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



## Recursos

[GIT cheat sheet[PDF EN]](https://services.github.com/on-demand/downloads/github-git-cheat-sheet.pdf)

[Taller de GIT PDF ES](https://ingenieriainformatica.uniovi.es/c/document_library/get_file?uuid=bbd3510e-4a10-4842-a29f-2d75f4bf9c12&groupId=780436)


[gitignore.io](https://www.gitignore.io)

