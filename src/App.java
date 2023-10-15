import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digete su texto: "); //De esta forma se hace un panal para guardar datos de la variable de tipo String
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digete su numero: ")); //De esta forma se hace para guardar datos de una variable tipo int
        letra = JOptionPane.showInputDialog("Digete su letra: ").charAt(0); //De esta forma se hace para guardar datos de una variable tipo char
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digete su numero con decimales: ")); //De esta forma se guardan cosas con decimal


        JOptionPane.showMessageDialog(null, "El texto es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El numero con decimales es: "+decimal);
    }
}
