22/02/2025

Actividad

Jeronimo giraldo Gutierrez
Gustavo Montoya


¿Qué representa esta clase? ¿Qué información contiene?
Representa a un jugador de cualquier tipo de deporte, y la información que contiene son datos personales sobre el jugador .

2.     ¿Por qué es importante inicializar los atributos al crear un objeto? ¿Qué pasaría si no usáramos un constructor?
Es importante inicializar un objeto para darle un valor definido y que después eso no nos cree un error en el código, si no usamos un constructor los atributos no se van a poder visualizar, lo que en caso de atributos primitivos como int se le otorga por defecto un valor de 0 y por el lado del string quedaría nulo, esto crearía errores en el el proceso de avance del código

3.      ¿Por qué no accedemos directamente a los atributos de otras clases? ¿Qué ventajas tiene usar getters y setters?
No accedemos directamente a los atributos desde otras clases porque, en la programación orientada a objetos, se busca encapsular los datos para protegerlos de modificaciones indebidas y mantener un mayor control sobre su acceso.
Las ventajas de usar getters y setters incluyen:
Encapsulación: Protegen los atributos, evitando accesos y modificaciones no controladas.
Validación de datos: Permiten verificar o modificar los valores antes de asignarlos.
Flexibilidad: Facilitan cambios en la implementación sin afectar otras partes del código.
Mantenimiento y depuración: Hacen que el código sea más estructurado y fácil de mantener.





4.      ¿Qué otros métodos podrían ser útiles para la clase Jugador? ¿Cómo podríamos mejorar este método?

Algunos métodos útiles para la clase Jugador podrían ser:
anotarGol(): Para incrementar el número de goles del jugador.
darAsistencia(): Para registrar las asistencias realizadas.
cambiarEquipo(String nuevo Equipo): Para actualizar el equipo del jugador.
cambiarPosicion(String nueva Posición): Para modificar su posición en el campo.
mostrarEstadisticas(): Para visualizar datos como goles, asistencias y partidos jugados.

El método mostrarInformacion() se puede mejorar de las siguientes formas:
Usar String.format() para mejorar la presentación del texto.
Devolver un String en lugar de imprimirlo directamente, lo que haría el método más flexible.
Manejo de valores nulos o vacíos para evitar errores en la impresión.
Agregar más información relevante, como estadísticas del jugador.

5.      ¿Qué aprendiste al crear y utilizar objetos? ¿Cómo cambia el estado de un objeto cuando usamos métodos set?
Al crear y utilizar objetos, conocimos que cuando una clase actúa como un molde para definir las propiedades y comportamientos de los objetos. Al instanciarse con new, se asigna memoria y se inicializan sus atributos con los valores proporcionados.
Cuando usamos métodos set, el estado del objeto cambia porque se actualizan sus atributos con nuevos valores. En este caso, al modificar la edad de jugador 1 y el equipo de jugador 2, su información se actualiza, lo que se refleja al volver a llamar el método mostrarInformacion(). Esto demuestra cómo los métodos set permiten modificar datos sin necesidad de acceder directamente a los atributos, manteniendo el encapsulamiento y la seguridad del código.

