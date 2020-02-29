

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uso_ciclos_validaciones;
import java.util.Scanner;
/**
 *
 * @author ev
 */
public class Aritmetica {
     int selector;
    float division, num1, num2;
    Scanner t=new Scanner(System.in);
    public float operacionesAritmeticas(){
        System.out.println("Ingrese el primer valor: ");
        num1=t.nextFloat();

        System.out.println("Ingrese el segundo valor: ");
        num2=t.nextFloat();

        System.out.println("Para sumar presionar 1 \npara restar presionar 2 \n" +
                "para multiplicar presionar 3 \npara dividir presionar 4 ");
        selector=t.nextInt();
        if(selector==1){
            System.out.println("La suma de ambos numeros es= " +(num1+num2));
        }
        else if (selector==2){
            System.out.println("La diferencia entre ambos numeros es= " +(num1-num2));
        }
        else if(selector==3){
            System.out.println("La multiplicacion de ambos numeros es= " +(num1*num2));
        }
        else if (selector==4){
            division=num1/num2;
            System.out.println("La division entre ambos numeros es= " + division);
        }
        else {
            System.out.println("no se ha seleccionado ninguna operacion valida ");
        }
        System.out.println("\n"+"\nFinalizado");
        return 0;
    }

}

