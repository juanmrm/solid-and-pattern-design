Nuestra aplicacion dispone de distintos jugadores de un mismo equipo, cada uno con su clase:
Jugador1, Jugador2 y Jugador3

Cada jugador, entre otras cosas, tiene un metodo dibuja() que devuelve un String mostrando
su camiseta.

Todos los jugadores comparten camiseta identica excepto por el numero, en la parte central.

Podeis ejecutar la clase Main para para observar como la tres camisetas se muestran por
consola.

El objetivo del ejercicio es evitar un problema que tenemos con el uso de la memoria: 
queremos usar el pattern flyweight para evitar tener una copia para cada camiseta.

La estrategia que usaremos sera crear una clase Camiseta con una "plantilla" de la camiseta,
usando en lugar del numero un "placeholder": p.e. "X"

Esta clase debe ser capaz de pintar cualquier camiseta sustituyendo la X por el numero correspondiente
(para simplificar, supondremos que no hace falta tratar numeros de dos cifras)

Cada jugador tendra una referencia a esta camiseta y debera eliminar la variable propia camiseta.

Para implementar el metodo dibuja, se usara la referencia a Camiseta pasando como "contexto" su numero particular.

El resultado de ejecutar el metodo main debe ser identico al original: dibujar las tres camisetas, cada uno
con su numero.