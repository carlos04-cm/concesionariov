// Clase abstracta Vehículo: Utiliza POO y define la base para otros vehículos.

public abstract class Vehículo {

    // Propiedades privadas que describen el vehículo.
    private final String nombre;  // Nombre del vehículo
    private final double precio;  // Precio del vehículo

    // Constructor para inicializar los valores de nombre y precio
    // Este constructor es llamado cuando se crea un objeto de una clase que extienda Vehículo.
    public Vehículo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método público para obtener el nombre del vehículo. 
    // Este es un ejemplo de encapsulamiento, ya que accedemos a los valores privados a través de métodos públicos.
    public String getNombre() {
        return nombre;
    }

    // Método público para obtener el precio del vehículo. 
    public double getPrecio() {
        return precio;
    }

    // Método abstracto que debe ser implementado por las subclases.
    // Este método es un ejemplo de POLIMORFISMO, ya que las subclases decidirán qué detalles mostrar.
    public abstract String obtenerDetalles();
}
