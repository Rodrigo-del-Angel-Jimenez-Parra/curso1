import javax.swing.JOptionPane;

public class code7Conditionals 
{
    public static void main(String[] args) 
    {
        int a, b= 5, c=0, r;

        /* If else 
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: ")) ;

        if (a==b) //igual (a!=b) diferente (a=>b)mayor igual que (a<=b) menor igual que 
        {
            JOptionPane.showInputDialog(null, "El numero es 5");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }
        */

        /* Switch
        a= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entero entre 1 y 3"));
        switch (a) 
        {
            case 1: JOptionPane.showMessageDialog(null, "Escogiste la opcion 1 y entraste en el menu 1");
            break;// si quito este break se pasa al siguiente caso(2) y asi hasta que encuentra un break
            case 2: JOptionPane.showMessageDialog(null, "Escogiste la opcion 2 y entraste en el menu 2");
            break;
            case 3: JOptionPane.showMessageDialog(null, "Escogiste la opcion 3 y entraste en el menu 3");
            break;
            default: JOptionPane.showMessageDialog(null, "Ingresaste un numero que no coincide con el de la instrucción");
            break;
        }
        */

        /* Ternario
        String m;
        do 
        {
            
            c++;
            a= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero: "));
            b= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa otro numero"));
            //primero hace este calculo m= (a%2== 0), despues si la condicion se cumple imprime el mensaje 1 si no imprime el mensaje 2
            m= (a%2== 0) ? "El numero es par" : "El numero es impar";
            JOptionPane.showMessageDialog(null, m);
            
            
            JOptionPane.showMessageDialog(null, "A continuacion ingresaras 2 numeros y se sumaran");
            JOptionPane.showMessageDialog(null, "Si la suma de los numeros es 4, r= 3 si no r= 5");
            a= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer numero: "));
            b= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa segundo numero"));
            r= (a+b== 4) ? 3 : 5;
            JOptionPane.showMessageDialog(null, "r= " +r);
            

        } while (c!= 3);
        */

        // for (inicializacion int a=; condicion a<=10; aumento o decremento a++ a--)
    }    
}
