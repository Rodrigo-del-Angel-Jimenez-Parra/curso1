import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Problem1Operators
{
    public static void main(String[] args) 
    {
        Scanner e= new Scanner(System.in);
        float a, b= 0, c, r;

        /*suma 3 calificaciones 
        System.out.println("Este programa suma 3 calificaciones\n\n");
        System.out.print("Escriba la primera calificación: ");
        a= e.nextFloat();
        System.out.print("Escriba la segunda calificación: ");
        b= e.nextFloat();
        System.out.print("Escriba la tercera calificación: ");
        c= e.nextFloat();
        r= a+b+c;
        System.out.println("\nLa suma de las calificaciónes es: " +r);
        */

        /* Calcula salario semanal por hora
        System.out.print("Este programa calcula el salario semanal por hora\n\n");
        System.out.print("Ingrese el numero de horas que trabajo en la semana: ");
        a= e.nextFloat();
        System.out.print("Ingrese cuanto le pagan por una hora: ");
        b= e.nextFloat();
        r= a*b;
        System.out.println("Su salario de esta semana es: " +r);
        */
        /* Este programa calcula la suma de 3 cantidades del dinero
        la primera cantidad es el dinero que ingrese
        la segunda es el dinero que ingrese dividido netre 2
        la tercera es la suma de la primera cantidad mas la segunda dividido entre 2
        System.out.print("Ingrese cuanto dinero tiene: ");
        a= e.nextFloat();
        b= a/2;
        c= (a+b)/2;
        r= a+b+c;
        System.out.print("Usted tiene esta cantidad de dinero: " +r);
        */

        /* Una empresa paga 1000 + 150 por carro vendido + 5% del valor del carro vendido a sus empleados
        al mes haga un programa que calcule el salario de un mes de un empleado
        float d=0, r2, r3;
        System.out.print("Ingrese cuantos carros vendio la persona: ");
        a= e.nextFloat();
        do
        {
            b++;
            System.out.print("Ingrese el valor del ");
            System.out.print(b);
            System.out.print(" carro: ");
            c= 0;
            r3=0;
            c= e.nextFloat();
            d=d+c;
            r2= d*0.05F;
            r3= r3+r2;
        } while (b!=a);
        r= 1000+ (b*150)+ r3;
        System.out.println("El salario mensual de este empleado es: " +r);
        */

        /* Este programa calcula el porcentaje de participaciones, primer examen, segundo examen 
        y tercer examen, de un alumno de acuerdo a las ponderaciones que asigne el maestro,
        en este caso 10% participaciones, 25 primer y segundo examen y 40 examen final
        float d, a1, b1, c1, d1, r1=0;
        System.out.print("Ingrese el numero total de participaciones: ");
        a= e.nextFloat();
        System.out.print("Ingrese el numero total de aciertos del primer examen: ");
        b= e.nextFloat();
        System.out.print("Ingrese el numero total de aciertos del segundo examen: ");
        c= e.nextFloat();
        System.out.print("Ingrese el numero total de aciertos del examen final: ");
        d= e.nextFloat();
        System.out.print("\nIngrese el numero total de participaciones del alumno: ");
        a1= e.nextFloat();
        System.out.print("Ingrese el numero total de aciertos del primer examen del alumno: ");
        b1= e.nextFloat();
        System.out.print("Ingrese el numero total de aciertos del segundo examen del alumno: ");
        c1= e.nextFloat();
        System.out.print("Ingrese el numero total de aciertos del examen final del alumno: ");
        d1= e.nextFloat();
        r= (a1*10)/a;
        r1+=r;
        System.out.print("\nEl porcentaje del alumno en participaciones es: " +r);
        System.out.println("%");
        r= (b1*25)/b;
        r1+=r;
        System.out.print("El porcentaje del alumno en el primer examen es: " +r);
        System.out.println("%");
        r= (c1*25)/c;
        r1+=r;
        System.out.print("El porcentaje del alumno en el segundo examen es: " +r);
        System.out.println("%");
        r= (d1*40)/d;
        r1+=r;
        System.out.print("El porcentaje del alumno en el examen final es: " +r);
        System.out.println("%");
        System.out.print("\nLa calificacion del alumno es: " +r1);
        */

        /*Este programa Calcula el cuadrado de una suma
        double z, y, r1;
        System.out.print("Ingrese el valor de a: ");
        z= e.nextFloat();
        System.out.print("Ingrese el valor de b: ");
        y= e.nextFloat();
        r1= (Math.pow(z, 2))+ Math.pow(y, 2)+ (2*z*y);
        System.out.println("El cuadrado de la suma es: " +r1);
        */

        /*El programa convierte las horas ingresadas en semanas dias y horas 
        int z, r1;
        System.out.print("Ingrese el numero de horas:");
        z= e.nextInt();
        r1= z/168;
        System.out.print("Las horas ingresadas equivalen a: " +r1);
        if (r1==1) 
        {
            System.out.print(" semana, ");    
        }
        else
        {
            System.out.print(" semanas, ");
        }
        r1= (z%168)/24;
        System.out.print(r1);
        if (r1==1) 
        {
            System.out.print(" dia, ");    
        }
        else
        {
            System.out.print(" dias, ");
        }
        r1= z%24;
        System.out.print(r1);
        if (r1==1) 
        {
            System.out.print(" hora.");    
        }
        else
        {
            System.out.print(" horas.");
        }
        */

        /*Este programa calcula las raicies de la ecuacion de segundo grado de coeficientes reales
        double z, x, v, r1, r2, r3, r4;

        System.out.print("Ingrese el valor de A: ");
        z= e.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        x= e.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        v= e.nextDouble();

        r1= (-(x)+(Math.sqrt((Math.pow((x), 2))-4*(z)*(v))))/(2*(z));
        r2= (-(x)-(Math.sqrt((Math.pow((x), 2))-4*(z)*(v))))/(2*(z));

        r3=((z*Math.pow((r1), 2))+(x*(r1))+v);
        r4=((z*Math.pow((r2), 2))+(x*(r2))+v);

        System.out.println("X1 es igual a: " +r1);
        System.out.println("X2 es igual a: " +r2);
        System.out.println("F1 es igual a: " +r3);
        System.out.println("F2 es igual a: " +r4);
        */
    }    
}