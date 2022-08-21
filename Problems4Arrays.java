import java.util.Scanner;
import javax.swing.JOptionPane;

public class Problems4Arrays 
{
    public static void main(String[] args) 
    {
        Scanner e= new Scanner(System.in);
        Scanner es= new Scanner(System.in);

        /*Este programa te pide 5 numeros y te los muestra en el orden que los ingresaste
        int c=0;
        float n[]= new float[5];
        for (int i = 0; i < n.length; i++) 
        {
            c++;
            n[i]= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el "+c+".- numero: "));
        }
        for (float numeros : n)
        {
            JOptionPane.showMessageDialog(null, "\nLos numeros que ingreso fueron: "+numeros);
        }
        */

        /*Este programa te pide 5 numeros y te los muestra en el orden inverso en el que los ingresaste 
        float[] n= new float[5];
        int c=0;
        for (int i = 0; i < n.length; i++)
        {
            c++;
            System.out.print("Ingresa el "+c+".- numero: ");
            n[i]= e.nextFloat();
        }
        System.out.print("Empezando del ultimo numero el orden es: ");
        for (int j = 4; j >= 0; j--)
        {
            System.out.print("\n"+n[j]);
        }
        */

        /*Este programa te pide 5 numeros y te devuele la media de los numeros +, - y la cantidad de 0 
        float r1=0,r2=0, c1=0,c2=0,c3=0,c4=0;
        float n[]= new float [5];
        for (int i = 0; i < n.length; i++) 
        {
            c1++;
            n[i]= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el "+c1+".- numero"));
            if (n[i]>0) 
            {
                c3++;
                r1+=n[i];
            } 
            else if(n[i]<0)
            {
                c4++;
                r2+=n[i];
            }
            else
            {
                c2++;
            }
        }
        r1/=c3;
        r2/=c4;
        JOptionPane.showMessageDialog(null, "La media de los numeros positvos es: "+r1+
        "\nLa media de los numeros negativos es: "+r2+"\nLa cantidad de 0 ingresados es: "+c2);
        */

        /*Este programa te pide 10 numeros y luego te muestra el primero y el ultimo, segundo y penultimo,etc..
        float n[]= new float[10];
        int c=0;
        for (int i = 0; i < n.length; i++) 
        {
            c++;
            System.out.print("Ingresa el "+c+".- numero: ");
            n[i]= e.nextFloat();   
        }
        for (int j = 0; j < 5; j++)
        {
            System.out.print("El orden de los numeros es: "+n[j]+", "+n[9-j]+"\n");
        }
        */

        /*Este programa te pide 2 series de numeros y te los muestra en orden en una 3 serie 
        int n1[]= new int[10];
        int n2[]= new int[10];
        int n3[]= new int[20];
        int c1=0;
        for (int i = 0; i <n1.length; i++)
        {
            c1++;
            n1[i]= Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Ingrese el "+c1+".- numero de la primera serie"));
            n2[i]= Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Ingrese el "+c1+".- numero de la segunda serie"));
        }
        */
        /*
        n3[0]= n1[0];
        n3[1]= n2[0];
        n3[2]= n1[1];
        n3[3]= n2[1];
        */
        /*
        int c2=0, c3=1;
        for (int j = 0; j < n1.length; j++) 
        {
            n3[c2]= n1[j];//0,2,4
            c2+=2;
            n3[c3]= n2[j];//1,3,5
            c3+=2;
        }
        JOptionPane.showMessageDialog(null, "La serie 3 esta formada por los numeros: ");
        for (int in3 : n3) 
        {
            JOptionPane.showMessageDialog(null,+in3);
        }
        */

        /*Este programa te pide 2 series de numeros con 12 numeros c/u y te los muestra en una 3 serie
         de 3 en 3 serie 1 primeros 3 numeros, 2 serie primeros 3 numeros,
         1 serie siguientes 3 numeros,2 serie siguientes 3 numeros, hasta mostrarte todos los numeros
         */

         int n1[]= new int[12];
         int n2[]= new int[12];
         int n3[]= new int[24];

         for (int i = 0; i < n1.length; i++)
         {
            System.out.print("Ingrese el "+(i+1)+".- numero de la primera serie: ");
            n1[i]= e.nextInt();
            System.out.print("Ingrese el "+(i+1)+".- numero de la segunda serie: ");
            n2[i]= e.nextInt();
         }

         for (int j = 0; j < n2.length; j++)
         {
            n3[]
         }
    }    
}