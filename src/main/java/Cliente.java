
public class Cliente {

    // Propiedades privadas que almacenan la información del cliente.
    // El uso de 'private' sigue el principio de ENCAPSULAMIENTO, ya que estas variables están ocultas 
    // y solo se pueden acceder a través de métodos públicos (getters).
    private final String nombre;
    private final String correoElectronico;
    private final String telefono;

    // Constructor de la clase Cliente, que inicializa las propiedades 'nombre', 'correoElectronico' y 'telefono'.
    // Este es el punto donde se establece la información del cliente.
    public Cliente(String nombre, String correoElectronico, String telefono) {
        this.nombre = nombre;  // Inicializa la propiedad 'nombre' con el valor proporcionado
        this.correoElectronico = correoElectronico;  // Inicializa la propiedad 'correoElectronico' con el valor proporcionado
        this.telefono = telefono;  // Inicializa la propiedad 'telefono' con el valor proporcionado
    }

    // Métodos getter para obtener la información del cliente.
    // Los getters permiten el acceso controlado a las propiedades privadas de la clase.
    public String getNombre() {
        return nombre;  // Devuelve el nombre del cliente
    }

    public String getCorreoElectronico() {
        return correoElectronico;  // Devuelve el correo electrónico del cliente
    }

    public String getTelefono() {
        return telefono;  // Devuelve el número de teléfono del cliente
    }
}
