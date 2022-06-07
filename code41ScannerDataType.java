import java.util.Scanner;

public class code41ScannerDataType
{
    public static void main(String[] args) 
    {
        Scanner e= new Scanner(System.in);
        int a;
        float b;
        double c;
        String d,f;
        char g; 
        /*/
        System.out.println("Ingrese un numero entero: ");
        a= e.nextInt();
        System.out.println("El numero que ingreso fue: ");
        System.out.println(a);
        System.out.println("Ingrese un numero con 2 decimales y otro numero con 3 decimales:");
        b= e.nextFloat();
        c= e.nextDouble();
        System.out.println("Los numeros que ingreso fueron:" +b);
        System.out.println(" y " +c);
        System.out.println("Escriba lo que quiera sin espacios");
        d= e.next();
        System.out.println("Lo que escribio fue: " +d);
        Scanner e2= new Scanner(System.in);
        System.out.println("Escriba lo que quiera con espacios: ");
        f= e2.nextLine();
        System.out.println("Lo que escribio fue: " +f);*/
        System.out.println("Escriba una letra: ");
        g= e.next().charAt(2);// Si pones 0 guarda la primera letra, 1 la segunda letra, 2 la tercera letra
        // si le pones 1 y solo hay una letra manda error 
        // no acepta espacios, para espacios poner nextLine
        System.out.println("La letra que escribio fue: " +g);
    }
}