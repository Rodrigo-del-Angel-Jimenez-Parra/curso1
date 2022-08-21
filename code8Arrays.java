import java.util.Scanner;

public class code8Arrays 
{
    public static void main(String[] args)
    {
        Scanner e= new Scanner(System.in);
        Scanner an= new Scanner(System.in);
        //tipo de variable[] nombre del array= new tipo de variable[tamaño];

        /* 
        int[] edad= new int[3];
        edad[0]=7;
        edad[1]=8;
        edad[2]=9;
        System.out.print(edad[0]);
        */

        /* 
        float[] altura={1,2,3};
        for (int i = 0; i < altura.length; i++)
        {
            System.out.print("\n"+altura[i]);
        }
        */

        /* 
        int a,c=0;
        System.out.print("Ingrese cuantos caracteres va tener el arreglo: ");
        a= e.nextInt();
        char[] abc= new char[a];
        for (int i = 0; i < abc.length; i++)
        {
            c++;
            System.out.print("Ingrese el "+c+".- caracter: ");
            abc[i]= e.next().charAt(0);
        }
        System.out.print("\n");
        System.out.print("Los caracteres que ingreso fueron: ");
        for (int j = 0; j < abc.length; j++) 
        {
            System.out.print(abc[j]+", ");
        }
        */
        
        /*

        
        int a, c=0, cn=0;
        System.out.print("Ingrese el numero de nombres a guardar: ");
        a= e.nextInt();
        String[] nombres= new String[a];
        for (int i = 0; i < nombres.length; i++)
        {
            c++;
            System.out.print("Ingrese el "+c+".- nombre: ");
            nombres[i]= an.nextLine();
        }

        
        //for each: tipo de dato, nombre de la variable y nombre del arreglo
        for (String inombres : nombres) 
        {
            cn++;
            System.out.print("El "+cn+".- nombre es: "+inombres+"\n");
        }
        */
        
    }
}
