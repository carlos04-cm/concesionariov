import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaCompra extends JFrame {

    // Constructor de la ventana de compra, recibe el vehículo seleccionado como parámetro
    public VentanaCompra(String vehiculoSeleccionado) {
        setTitle("Formulario de Compra");  // Establece el título de la ventana
        setSize(500, 400);  // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  // Cierra solo esta ventana al cerrarla
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla

        // Crear un panel con GridLayout, 6 filas y 2 columnas, con separación de 10 píxeles entre componentes
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Añadir márgenes alrededor del panel

        // Añadir las etiquetas y campos de texto para el formulario
        panel.add(new JLabel("Vehículo seleccionado:"));
        panel.add(new JLabel(vehiculoSeleccionado));  // Muestra el vehículo seleccionado

        panel.add(new JLabel("Nombre:"));
        JTextField txtNombre = new JTextField();  // Campo de texto para ingresar el nombre
        panel.add(txtNombre);

        panel.add(new JLabel("Email:"));
        JTextField txtEmail = new JTextField();  // Campo de texto para ingresar el email
        panel.add(txtEmail);

        panel.add(new JLabel("Teléfono:"));
        JTextField txtTelefono = new JTextField();  // Campo de texto para ingresar el teléfono
        panel.add(txtTelefono);

        panel.add(new JLabel("Método de pago:"));
        JComboBox<String> cmbPago = new JComboBox<>(new String[]{"Efectivo", "Crédito", "Financiamiento"});
        panel.add(cmbPago);  // ComboBox para seleccionar el método de pago

        // Botones para volver al catálogo o confirmar la compra
        JButton btnVolver = new JButton("Volver");
        JButton btnConfirmar = new JButton("Confirmar");

        panel.add(btnVolver);  // Botón para volver
        panel.add(btnConfirmar);  // Botón para confirmar la compra

        // Acción para el botón "Volver"
        // Al hacer clic en "Volver", se regresa a la ventana de catálogo (de motos en este caso)
        btnVolver.addActionListener((ActionEvent e) -> {
            new VentanaCatalogo("Motos").setVisible(true);  // Regresa a la ventana de catálogo
            this.dispose();  // Cierra la ventana de compra
        });

        // Acción para el botón "Confirmar"
        // Al hacer clic en "Confirmar", se verifican los campos y se muestra un mensaje de confirmación
        btnConfirmar.addActionListener((ActionEvent e) -> {
            if (txtNombre.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                // Si los campos obligatorios (nombre y email) están vacíos, muestra un mensaje de advertencia
                JOptionPane.showMessageDialog(this, "Complete todos los campos");
            } else {
                // Si todo está completo, muestra un mensaje de compra confirmada con los detalles
                JOptionPane.showMessageDialog(this,
                        "Compra confirmada!\n" +
                                "Vehículo: " + vehiculoSeleccionado + "\n" +
                                "Cliente: " + txtNombre.getText() + "\n" +
                                "Nos contactaremos al: " + txtTelefono.getText());

                // Regresa a la ventana principal después de confirmar la compra
                new VentanaPrincipal().setVisible(true);
                this.dispose();  // Cierra la ventana de compra
            }
        });

        // Añadir el panel con los elementos del formulario a la ventana
        add(panel);
    }
}
