import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        setTitle("Concesionario Fast and Furious");  // Título actualizado
        setSize(600, 400);  // Ventana más grande
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Establecer el fondo de la ventana principal a azul
        getContentPane().setBackground(new Color(0, 102, 204));  // Fondo azul para la ventana

        // Cambié el FlowLayout a GridLayout para tener los botones en columnas
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));  // 4 filas, 1 columna
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));  // Añadir márgenes

        // Fondo blanco para el panel donde están los botones
        panel.setBackground(new Color(255, 255, 255));  // Fondo blanco para el panel de botones

        // Título de la ventana con fondo blanco
        JLabel titulo = new JLabel("Concesionario Fast and Furious", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(new Color(0, 102, 204));  // Texto en azul
        titulo.setOpaque(true);
        titulo.setBackground(Color.WHITE);  // Fondo blanco para el título
        titulo.setPreferredSize(new Dimension(600, 50));  // Aumentar tamaño del título

        // Botones con colores personalizados
        JButton btnCatalogoMotos = new JButton("Ver Catálogo de Motos");
        JButton btnCatalogoAutos = new JButton("Ver Catálogo de Autos");
        JButton btnSalir = new JButton("Salir");

        // Cambiar colores de los botones
        btnCatalogoMotos.setBackground(new Color(34, 193, 195));  // Verde agua
        btnCatalogoMotos.setForeground(Color.WHITE);

        btnCatalogoAutos.setBackground(new Color(253, 29, 29));  // Rojo brillante
        btnCatalogoAutos.setForeground(Color.WHITE);

        btnSalir.setBackground(new Color(60, 179, 113));  // Verde pasto
        btnSalir.setForeground(Color.WHITE);

        // Añadir el título y los botones al panel
        panel.add(titulo);
        panel.add(btnCatalogoMotos);
        panel.add(btnCatalogoAutos);
        panel.add(btnSalir);

        // Acción para el botón "Ver Catálogo de Motos"
        btnCatalogoMotos.addActionListener((ActionEvent e) -> {
            new VentanaCatalogo("Motos").setVisible(true);  // Abre el catálogo de motos
            this.setVisible(false);  // Oculta la ventana principal
        });

        // Acción para el botón "Ver Catálogo de Autos"
        btnCatalogoAutos.addActionListener((ActionEvent e) -> {
            new VentanaCatalogo("Autos").setVisible(true);  // Abre el catálogo de autos
            this.setVisible(false);  // Oculta la ventana principal
        });

        // Acción para el botón "Salir"
        btnSalir.addActionListener((ActionEvent e) -> {
            System.exit(0);  // Cierra la aplicación
        });

        add(panel);  // Añadir el panel a la ventana
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
}

