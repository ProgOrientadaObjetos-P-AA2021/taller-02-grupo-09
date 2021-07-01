# Taller 11 - 2

## Aplicación conceptos de herencia y polimorfismo

Se requiere generar una solución en **lenguaje Java** que permita administrar el valor de pasaje de transporte intercantonal de la ciudad de Loja.

El pasaje intercantonal tiene la siguientes: nombre-pasajero, cedula, origen, destino, número km de distancia, tarifa base, valor pasaje.

Se debe tomar en consideración que existen diversos tipo de transporte:

- Pasaje Transporte Normal
 
 	 - atributo: porcentaje adicional
  	- el valor del pasaje es igual a (número de km * 0.15) + (tarifa base + (tarifa base*(porcentaje/100)))

- Pasaje Transporte Menor de Edad
 	- atributo: porcentaje descuento
  	- el valor del pasaje es igual a (número de km * 0.10) + (tarifa base - (tarifa base*(porcentaje/100)))

- Pasaje Transporte Tercera Edad
	- el valor del pasaje es igual a (número de km * 0.5) + (tarifa base/2))

- Pasaje Transporte Universitario
	- nombre universidad
	- el valor del pasaje es igual a tarifa base/2


Tareas:

En una clase Principal usted debe:

- Generar un método main que permita crear múltiples tipos de objetos (1 de cada tipo, por lo menos) de pasajes de transporte. No ingresar por teclado.

- Usar constructores.

- Se debe calcular el valor del pasaje de acuerdo a su contexto.

- Guardar la información de cada objeto en un archivo serializado.

- Obtener la información del archivo serializado y presentar la información de cada objeto haciendo uso del método toString

Recomendaciones:

- Tomar como base el proyecto en Netbeans del repositorio.

- Analizar la problemática, leer cada clase del proyectos Netbeans y construir su solución.

- En cada objeto usted debe presentar todas las características posibles de cada tipo de objeto.