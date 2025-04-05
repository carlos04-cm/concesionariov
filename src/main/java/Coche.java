// La clase Coche extiende la clase abstracta Vehículo.

public class Coche extends Vehículo {

    // Constructor de la clase Coche que llama al constructor de la clase base (Vehículo).
    
    public Coche(String nombre, double precio) {
        super(nombre, precio);  // Llama al constructor de Vehículo para inicializar nombre y precio
    }

    // Implementación concreta del método abstracto obtenerDetalles() que fue definido en la clase Vehículo.
    // Este método es un ejemplo de POLIMORFISMO, ya que se implementa de manera diferente según el tipo de vehículo.
    @Override
    public String obtenerDetalles() {
        // Devuelve una cadena con el nombre y el precio del coche.
        return "Coche: " + getNombre() + " - $" + getPrecio();
    }
}
