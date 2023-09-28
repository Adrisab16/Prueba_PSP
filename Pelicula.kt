class Pelicula(protected var director:String, titulo: String, precio: Float, anio_publicacion: Int) : Producto(titulo, precio, anio_publicacion) {
    protected var generopelicula = mutableListOf<String>()
}