// La clase Moto extiende la clase abstracta Vehículo.

public class Moto extends Vehículo {

    // Constructor de la clase Moto que llama al constructor de la clase base (Vehículo).
   
    public Moto(String nombre, double precio) {
        super(nombre, precio);  // Llama al constructor de Vehículo para inicializar nombre y precio
    }

    // Implementación concreta del método abstracto obtenerDetalles() que fue definido en la clase Vehículo.
    // Este método es un ejemplo de POLIMORFISMO, ya que se implementa de manera diferente según el tipo de vehículo.
    @Override
    public String obtenerDetalles() {
        // Devuelve una cadena con el nombre y el precio de la moto.
        return "Moto: " + getNombre() + " - $" + getPrecio();
    }
}
