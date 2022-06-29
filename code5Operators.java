import java.util.Scanner;
public class code5Operators 
{
    public static void main(String[] args) 
    {
        Scanner e= new Scanner(System.in);
        /* 
        Scanner e= new Scanner(System.in);
        float a, b, sum, res, div, mul, mod;
        int r, r1, r2, a1, b1;
        System.out.println("Ingrese 2 numeros con punto decimal");
        System.out.print("\nIngrese el primer numero: ");
        a= e.nextFloat();
        System.out.print("\nIngrese el segundo numero: ");
        b= e.nextFloat();
        sum= a+b;
        res= a-b;
        mul= a*b;
        div= a/b;
        mod= a%b; //mod hace la division y luego te da el residuo de la division, 10%2= residuo de 10/2 
        System.out.println("\nSe realizaron las siguientes operaciones: \n");
        System.out.println("La suma de los numero es: " +sum);
        System.out.println("\nLa resta de los numero es: " +res);
        System.out.println("\nLa multiplicacion de los numeros es: " +mul);
        System.out.println("\nLa division de los numero es: " +div);
        System.out.println("\nEl resto de la division de los numero es: " +mod);
        System.out.println("\n");
        */
        /* 
        //sacar residuo de otra manera
        System.out.println("La division de los numeros es: " +div);
        r1= (int)div;
        r2= Math.round(div);
        System.out.println("La division de los numeros ahora es es: " +r1);
        //System.out.println("La division de los numeros ahora es es: " +r2);// redondea los numeros .5= siguiente numero, .4999 el numero pero sin decimales
        a1= (int)a;
        b1= (int)b;
        r=a1-(r1*b1);
        System.out.println("El resto de la division de los numero es: " +r);
        */

        //sumar restar multiplicar a una misma variable

        int n=40, n1=1, n2;
        n%=7; //n= n%7 40/7 mod=5
        //n-=5, n/=, n*=, n+=
        //System.out.println("n vale: " +n);
        
        //n++; n--; ++n; --n;

        n1++; //suma 1 a n1
        System.out.println("n1 es igual a: " +n1); 
        n1--;//resta a 1 a n1
        System.out.println("n1 es igual a: " +n1);
        n2= n1++; //asigna a n2 el valor de n1 y luego suma 1 a n1
        System.out.println("n2 es igual a: " +n2);
        System.out.println("n1 es igual a: "+ n1);
        n2= ++n1;// suma 1 a n1 y luego asigna el valor de n1 a n2
        System.out.println("n1 es igual a: "+ n1);
        System.out.println("n2 es igual a: " +n2);
        n2= --n1;// resta 1 a n1 y luego asigna el valor de n1 a n2
        System.out.println("n1 es igual a: "+ n1);
        System.out.println("n2 es igual a: " +n2);
    }
}