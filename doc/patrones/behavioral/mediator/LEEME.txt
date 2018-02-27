La aplicacion muestra un sistema de control de los dispositivos de un coche:
inicialmente solo hay radio y telefono pero puede extenderse en un futuro.

El sistema implementa las siguientes reglas ( - evento -> accion del sistema ):

- encender coche -> encender radio
                 -> apagar musica telefono
- sonar telefono -> apagar radio
- encender radio -> apagar musica telefono
- apagar coche -> apagar radio

Introducid una figura de mediator en el sistema de tal forma que se 
sigan respetando las normas mostradas pero de forma mas "desacoplada":
que los objetos coche, telefono y radio no tengan referencias entre ellas.

El test proporcionado os ayudara a comprobar que vuestros cambios no 
estropean la funcionalidad implementada.

Cuando cambies el codigo deberas adaptar el test, pero solo la parte 
de inicializacion ( metodo init y, segun la solucion, las variables).
No hay que cambiar nada de los metodos @Test