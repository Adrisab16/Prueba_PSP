class Disco(protected var stock: Int,protected var grupo: String, titulo: String, precio: Float, anio_publicacion: Int) : Producto(titulo, precio, anio_publicacion) {
    protected var generomusica = mutableListOf<String>()
    var listadiscos= mutableListOf<Disco>()
    fun crearDisco(){
        // Creamos el objeto disco con los parámetros que nos introduzcan
    }
}