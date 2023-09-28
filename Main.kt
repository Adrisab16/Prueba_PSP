fun main(args: Array<String>) {
    // Hay muchas cosas que no me han dado tiempo a terminar, por lo que explicaré por comentarios mis ideas en cada parte.
    var codigo: Int = -1
    // Un bucle para el menú principal, con una variable para moverse por el menú
    while (codigo !=0) {
        print("Menú: \n" +
                "1: Listar Discos\n" +
                "2: Listar Peliculas\n" +
                "3: Comprar Pelicula o Disco\n" +
                "4: Listar los clientes\n" +
                "5: Salir\n" +
                "Introduzca la opción deseada: ")
        codigo= readln().toInt()
        when (codigo){
            1-> {/*Aqui llamamos a un metodo para listar los objetos discos creados*/}
            2-> {/* Lo mismo pero con peliculas */}
            3-> {print("¿Pelicula o disco?\n" +
                    "6: Pelicula\n" +
                    "7: Disco")
                codigo = readln().toInt()
                when(codigo){
                    6->{/* Compramos la pelicula llamando a la función película de la clase pelicula */}
                    7->{/* Lo mismo pero con disco */}
                }
            }
            4-> {/* Llamamos al método listarClientes de la interfaz cliente*/}
            5-> {/* Código = 0 significa que rompemos el bucle de main, por lo que se acaba el programa */
                codigo= 0
            }
        }
    }
}