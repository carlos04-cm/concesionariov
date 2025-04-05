import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaCatalogo extends JFrame {

    // Lista de motos disponibles
    // En este array se guardan los vehículos de tipo moto con su nombre y precio
    private final String[] motos = {
        "Honda CBR600RR - $12,000",
        "Yamaha YZF-R3 - $9,500",
        "Kawasaki Ninja ZX-10R - $18,000",
        "Suzuki GSX-R1000 - $15,500",
        "BMW S1000RR - $20,000"
    };

    // Lista de autos disponibles
    // En este array se guardan los vehículos de tipo auto con su nombre y precio
    private final String[] autos = {
        "Toyota Corolla - $25,000",
        "Honda Civic - $27,000",
        "Ford Mustang - $45,000",
        "Chevrolet Tahoe - $55,000"
    };

    // Constructor de la ventana de catálogo
    public VentanaCatalogo(String tipo) {
        setTitle("Catálogo de " + tipo);  // Establece el título de la ventana dependiendo si es de autos o motos
        setSize(500, 400);  // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Cerrar solo esta ventana al cerrarla
        setLocationRelativeTo(null);  // Centrar la ventana en la pantalla

        // Crear un panel con un layout BorderLayout para organizar los componentes
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Añadir márgenes alrededor del panel

        // Crear una lista que mostrará los vehículos (motos o autos)
        JList<String> lista;
        // Carga la lista de motos o autos dependiendo del tipo recibido
        if (tipo.equals("Motos")) {
            lista = new JList<>(motos);  // Si el tipo es "Motos", se carga la lista de motos
        } else {
            lista = new JList<>(autos);  // Si el tipo es "Autos", se carga la lista de autos
        }

        // Establece que solo se pueda seleccionar un vehículo a la vez
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Crear los botones para volver al menú principal o para comprar el vehículo
        JButton btnVolver = new JButton("Volver");
        JButton btnComprar = new JButton("Comprar");

        // Crear un panel para los botones y alinearlos al centro
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelBotones.add(btnVolver);  // Añadir el botón "Volver"
        panelBotones.add(btnComprar);   // Añadir el botón "Comprar"

        // Añadir la lista de vehículos y los botones al panel principal
        panel.add(new JScrollPane(lista), BorderLayout.CENTER);  // Añadir la lista de vehículos al centro
        panel.add(panelBotones, BorderLayout.SOUTH);  // Añadir los botones en la parte inferior

        // Acción para el botón "Volver"
        // Al hacer clic en "Volver", se regresa a la ventana principal
        btnVolver.addActionListener((ActionEvent e) -> {
            new VentanaPrincipal().setVisible(true);  // Regresa a la ventana principal
            this.dispose();  // Cierra la ventana de catálogo
        });

        // Acción para el botón "Comprar"
        // Al hacer clic en "Comprar", si un vehículo ha sido seleccionado, se abre la ventana de compra
        btnComprar.addActionListener((ActionEvent e) -> {
            if (lista.getSelectedIndex() != -1) {  // Si un vehículo ha sido seleccionado
                // Se abre la ventana de compra con el vehículo seleccionado
                new VentanaCompra(lista.getSelectedValue()).setVisible(true);
                this.dispose();  // Cierra el catálogo actual
            } else {
                // Si no se ha seleccionado ningún vehículo, muestra un mensaje de error
                JOptionPane.showMessageDialog(this, "Seleccione un vehículo");  // Muestra un mensaje de advertencia
            }
        });

        // Añadir el panel a la ventana
        add(panel);  // Añadir el panel con la lista y los botones a la ventana
    }
}
