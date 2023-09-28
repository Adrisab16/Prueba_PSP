class ClienteRegistrado(var nombre:String, apellidos:String, DNI_NIF:String, telefono:String, saldo:Float,descuento:Int=-2) {
    var listaDNI = mutableListOf<String>()
    fun valida_dni(){
        // Comparamos los DNI introducidos con la lista de DNI, si no está, lo introducimos,
        // si ya está, avisaremos en el output
    }
    fun esVIP(){
        //Comprobar si es o no es VIP
    }
    fun actualizaDescuento(){
        // Aqui ponemos el descuento correspondiente
    }
}