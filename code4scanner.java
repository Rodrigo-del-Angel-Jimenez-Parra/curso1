import java.util.Scanner;

public class code4scanner
{
    public static void main(String[] args) 
    {
        Scanner e= new Scanner(System.in);
        int n;
        float n2;
        double n3;
        String a, b, c, d, f;
        /*System.out.println("ingrese un numero entero: ");
        n= e.nextInt();
        System.out.println("ingrese un numero con 2 decimales: ");
        n2= e.nextFloat();//aveces no jala con un punto en los numeros entonces poner ,
        System.out.println("ingrese un numero con decimales: ");
        n3= e.nextDouble();
        System.out.print("Los numeros ingresados fueron: "+n);
        System.out.print(", "+n2);
        System.out.println(" y "+n3);*/
        System.out.println("escriba lo que quiera");
        a= e.next();
        System.out.println("Usted escribio: "+a);
        System.out.println("escriba lo que quiera sin espacios");
        b= e.nextLine(); //.next solo guarda hasta que pongas un espacio.
        // cuando pones next no debes poner nextLine porque se cierra el programa
        //cuando pones next siempre debes poner despues nextline porque si pones next se cierra el programa
        //lo mejor es poner puro nextLine
        //Tambien puedes poner next y de ahi puro nextLine o nextLine y de ahi puro next
        /*System.out.println("Usted escribio: "+b);
        System.out.println("ingrese un numero entero: ");
        n= e.nextInt();
        System.out.println("El numero que ingreso fue: "+n);*/
        System.out.println("Usted escribio: "+b);
        
        System.out.println("escriba lo que quiera");
        c= e.next();
        System.out.println("Usted escribio: "+c);
        //para escribir salteado (con espacio luego sin espacio) crear otro scanner
        Scanner z= new Scanner(System.in);

        System.out.println("escriba lo que quiera");
        d= z.nextLine();
        System.out.println("Usted escribio: "+d);

        System.out.println("escriba lo que quiera");
        f= z.nextLine();
        System.out.println("Usted escribio: "+f);

        //e.close();// si lo pones ya no puedes guardar datos en variables se cierra el programa pero se muestran los printf
    }
}