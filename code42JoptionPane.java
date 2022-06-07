import javax.swing.JOptionPane;

/**
 * code42JoptionPane
 */
public class code42JoptionPane 
{
    public static void main(String[] args) 
    {
        int a;
        float b;
        double c;
        char d;
        String g;

        a= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));
        b= Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero con 2 decimales: "));
        // si funciona asi xd c= JOptionPane.showInputDialog("Escriba 1 caracter: ").charAt(0);
        c= Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero con 4 decimales: "));
        d= JOptionPane.showInputDialog("Escriba 1 caracter: ").charAt(0);
        g= JOptionPane.showInputDialog("Escriba lo que quiera: ");

        JOptionPane.showMessageDialog(null, "El numero entero que escribiste fue: " +a);
        JOptionPane.showMessageDialog(null, "El numero con 2 decimales que escribiste fue: " +b);
        JOptionPane.showMessageDialog(null, "El numero con 2 decimales que escribiste fue: " +c);
        JOptionPane.showMessageDialog(null, "El caracter que escribiste fue: " +d);
        JOptionPane.showMessageDialog(null, g);
        
    }    
}