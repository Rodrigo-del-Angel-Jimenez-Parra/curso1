import java.util.Scanner;
import javax.swing.JOptionPane;
//for(i=;Mientras se cumpla lo va hacer; que va hacer )
public class Problems3loops
{
    public static void main(String[] args) 
    {
        Scanner e= new Scanner(System.in);
        /* 
        double a, r, c=0;

        System.out.print("Ingrese un numero negativo para salir o uno positivo obtener su cuadrado: ");
        a= e.nextDouble();
        if (a>=0)
        {
            while (a>=0) 
            {
                r= Math.pow(a, 2);
                System.out.print("El cuadrado del numero es: " +r + "\n\n");
                System.out.print("Ingrese otro numero positivo para sacar su cuadrado, si desea salir ingrese un numero negativo.\n"+
                ": ");
                a= e.nextDouble();
                if (a>=0) 
                {

                }
                else 
                {
                    System.out.println("Saliendo tenga un buen día");
                    e.close();
                }
            }
        } 
        else 
        {
            System.out.println("Saliendo tenga un buen día");
            e.close();
        }
        */

        /*Este programa te dice si un numero es positivo o negativo, si el numero es 0 sale del programa 
        float a;

        a= Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (a!=0) 
        {
            while (a!=0) 
            {
                if (a>0)
                {
                    JOptionPane.showMessageDialog(null, "El numero " + a + " es positivo");
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "El numero " + a + " es negativo");
                }
                a= Float.parseFloat(JOptionPane.showInputDialog("\nIngrese un numero: "));
                if (a==0) 
                {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                }
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Hasta luego");
        }
        */

        /*este programa te pide un numero y te dice si es par o impar
        float a,r;
        System.out.print("Para salir ingrese 0, si no ingrese un numero: ");
        a= e.nextFloat();
        if (a==0) 
            {
                System.out.print("Hasta luego");
            }
        while (a!=0) 
        {
            r=a%2;
            if (r==0) 
            {
                System.out.print("El numero " +a+ " es par\n");
            } 
            else 
            {
                System.out.print("El numero " +a+ " es impar\n");
            }
            System.out.print("Para salir ingrese 0, si no ingrese otro numero: ");
            a= e.nextFloat();
            if (a==0) 
            {
                System.out.print("Hasta luego");
            }
        }
        */

        /*Este programa cuenta cuantos numeros positivos ingresaste para salir ingresar un numero negativo 
        float a,c=0;

        a=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero positivo para contar o uno negativo para salir\n"+       
        ": "));

        while (a>=0)
        {
            if (a>=0)
            {
                c++;
                a=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese otro numero positivo para contar o uno negativo para salir\n"+       
                ": "));
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "El total de numeros positivos que ingreso son: " + c +
                "\nHasta luego");
            }
        }
        if (a<0) 
        {
            JOptionPane.showMessageDialog(null, "El total de numeros positivos que ingreso son: " + c +
                "\nHasta luego");
        }
        */

        /*Juego de adivinar un numero del rango 0-100, te dice cuantos intentos fallidos tuviste 
        double n;
        int n1,a,c=0;

        n= Math.random();
        while (n<0 && n>100) 
        {
            n= Math.random();
        }
        if (n>=0 && n<=100) 
        {
            n= n*100;
        }
        do
        {
          n1= (int)n;
          System.out.print("Adivina el numero oculto del rango 0-100\n"+
          "Ingresa un numero: ");
          a= e.nextInt();
          if (a>n1) 
          {
            c++;
            System.out.println("El numero que ingresaste es mayor, intenta con otro numero :)");
            System.out.print("\n");
          } 
          else if(a<n1)
          {
            c++;
            System.out.println("El numero que ingresaste es menor, intenta con otro numero :)");
            System.out.print("\n");
          }
          else
          {
            System.out.println("\nFelicidades adivinaste el numero oculto 0_0\n");
            System.out.print("Tu numero de intentos fue: " +c);
          }
        } while(a!=n1);
        */

        /*Este programa suma los numeros que ingreses hasta que pongas 0 
        float a, r=0;

        a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero para empezar a sumar o presione 0 para salir\n"+
        ":"));
        if (a==0) 
        {
            JOptionPane.showMessageDialog(null, "Usted ingreso: "+a);
            JOptionPane.showMessageDialog(null, "Hasta luego");
        }
        else
        {
            do
            {
                r+= a;
                a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese otro numero para sumar o presione 0 para salir")); 
                if (a==0) 
                {
                    JOptionPane.showMessageDialog(null, "La suma de los numeros es: "+r);
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                }
            } while (a!=0);
        }
        */

        /*Este programa calcula la media de los numeros que ingreses para salir ingresar un numero negativo
        float a, c=0, r=0;

        a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero para empezar a calcular la media o ingrese un numero negativo para salir\n"+
        ":"));
        if (a<0) 
        {
            JOptionPane.showMessageDialog(null, "Usted ingreso: "+a);
            JOptionPane.showMessageDialog(null, "Hasta luego");
        }
        else
        {
            do
            {
                c++;
                r+= a;
                a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese otro numero para calcular la media o ingrese un numero negativo para salir"));
                if (a<0) 
                {
                    r/=c;
                    JOptionPane.showMessageDialog(null, "La media de los numeros es: "+r);
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                }
            } while (a>0);
        }
        */

        /* 
        int n;
        System.out.print("Ingresa un numero mayor o igual a 1 para mostrarte cuantos numeros hay desde el numero 1 hasta el que hayas ingresado\n"+
        ":");
        n= e.nextInt();
        if (n>=1) 
        {
            System.out.println("Estos son los numeros que hay del 1 al "+n+" :");
            for (int i = 1; i <= n; i++) 
            {
                System.out.println(i);
            }
        } 
        else 
        {
            System.out.println("Ingresa un numero mayor o igual a 1");
        }
        */

        /* Este programa te enseña cuantos numeros hay del 100 al 0 en decremento de 7 en 7
        JOptionPane.showMessageDialog(null, "Estos los numeros que hay del 100 al 0 en decremento de 7 en 7");
        for (int i = 100; i >0; i-=7)
        {
            JOptionPane.showMessageDialog(null,i);
        }
        */

        /*Este programa suma 10 numeros que ingreses 
        float n,r;;
        System.out.println("Ingrese un numero para empezar a sumar: ");
        n= e.nextFloat();
        r=n;
        for (float i = 0; i <=8; i++)
        {
            r+=n;
            System.out.println("Ingrese otro numero para sumar: ");
            n= e.nextFloat();
        }
        System.out.println("La suma de los 10 numeros es: "+r);
        */

        /*El programa calcula la factorial de un numero 
        int n;
        long r=1;
        n= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero para calcular su factorial: "));
        for (int i = 2; i <=n; i++)
        {
            r*=i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de "+n+ " es: "+r);
        */

        /*Este programa calcula la media de numeros negativos y positivos por separado y te dice el numero de 0 que ingresaste 
        float n, ng=0,np=0, no=0, cp=0, cn=0, r;
        for (int ni = 1; ni <=10; ni++) 
        {
            System.out.print("Ingrese el "+ni+".- numero: ");
            n= e.nextFloat();
            if (n>0)
            {
                cp++;
                np+=n;
            }
            else if(n<0)
            {
                cn++;
                ng+=n;
            }
            else if(n==0)
            {
                no++;
            }
        }
        r=np/cp;
        System.out.print("\n \nLa media de los numeros positivos es: " +r);
        r=ng/cn;
        System.out.print("\nLa media de los numeros negativos es: " +r);
        System.out.print("\nSe ingresaron "+no+", 0");
        */

        /*Este programa te pide 10 sueldos los suma y te dice la suma y cuatos hay mayores a 1000
        float a,c=0,r=0;

        for (int ns = 1; ns <=10; ns++) 
        {
            a= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el "+ns+".- sueldo"));
            r+=a;
            if (a>=1000)
            {
                c++;
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de los sueldos es: " +r);
        JOptionPane.showMessageDialog(null, "Hay "+c+" sueldos mayores a 1000");
        */

        /*Este programa pide 5 edades y estaturas, te da la media de c/u y te dice cuales son mayores a 18 años
          y cuales miden mas de 1.75
         
        float a,b,c1=0,c2=0,r1=0,r2=0;
        for (int ni = 1; ni <=5; ni++)
        {
            System.out.print("Ingrese la "+ni+".- edad: ");
            a= e.nextFloat();
            System.out.print("Ingrese la "+ni+".- estatura: ");
            b= e.nextFloat();
            r1+=a;
            r2+=b;
            if (a>18)
            {
                c1++;
            }
            if (b>1.75) 
            {
                c2++;
            }
        }
        r1/=5;
        r2/=5;
        System.out.print("\n\nLa media de las edades es: "+r1+"\nLa media de las estaturas es: "+r2+"\n");
        System.out.print("\n\nLa media de las edades es: "+r1+"\nLa media de las estaturas es: "+r2+"\n");
        if (c1>1 && c2>1)
        {
            System.out.println("\nHay "+c1+" alumnos mayores a 18 años y hay "+c2+" alumnos que miden mas de 1.75");
        }
        else if(c1<=1 && c2<=1)
        {
            System.out.println("\nHay "+c1+" alumno mayor a 18 años y hay "+c2+" alumno que mide mas de 1.75");
        }
        else if(c1>1 && c2<=1)
        {
            System.out.println("\nHay "+c1+" alumnos mayores a 18 años y hay "+c2+" alumno que mide mas de 1.75");
        }
        else if(c1<=1 && c2>1)
        {
            System.out.println("\nHay "+c1+" alumno mayor a 18 años y hay "+c2+" alumnos que miden mas de 1.75");
        }
        */

        /* 
        int n,r;

        n= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero enre 1-10"));
        if (n>=1 && n<=10) 
        {
            JOptionPane.showMessageDialog(null, "La tabla de multiplicar del numero "+n+" es");
            for (int i = 1; i <=10; i++)
            {
                r=n*i;
                JOptionPane.showMessageDialog(null, n+"x"+i+"= "+r);
            }
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "Error ingresa un numero entre 1-10");
        }
        */

        /*Este programa te pide datos de 5 facturas y luego te muestra cuantas facturas se contaron
        cantidad de litros vendidos y cuantas facturas rebasaban lo vendido de 600
        float ca,l, pl,pl1,pl2,pl3, cl1=0,cl2=0,cl3=0, r1=0,r2=0,r3=0,r4, c=0,a=0;

        for (int i = 1; i <=5; i++)
        {
            System.out.print("Ingrese el codigo del articulo: ");
            ca= e.nextFloat();
            System.out.print("\nIngrese los litros vendidos: ");
            l= e.nextFloat();
            System.out.print("\nIngrese el precio por litro: ");
            pl= e.nextFloat();
            System.out.print("\n");
            if (ca==1)
            {
                r1+=l;
                cl1+=l;
                pl1=pl;
            }
            else if(ca==2)
            {
                r2+=l;
                cl2+=l;
                pl2=pl;
            }
            else if(ca==3)
            {
                r3=l;
                cl3+=l;
                pl3=pl;
            }
            r4=l*pl;
            if(r4>600)
            {
                c++;
            }
            a++;
            System.out.print("\n\nr4: "+r4+"c: "+c);
        }
        System.out.print("Facturacion total: "+a+"\nCantidad de litros vendidos del articulo con codigo 1: "+cl1+
        "\nCantidad de litros vendidos del articulo con codigo 2: "+cl2+"\nCantidad de litros vendidos del articulo con codigo 3: "+cl3+
        "\nDe las facturas introducidas hay "+c+" que son mas de 600");
        */

        int a;
        float b, r1=0;

        a= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de sueldos a evaluar: "));
        for (int i = 1; i <=a; i++)
        {
            b= Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el "+i+".- sueldo"));
            if (b>r1)
            {
                r1=b;
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo mas alto es: "+r1);
    }    
}