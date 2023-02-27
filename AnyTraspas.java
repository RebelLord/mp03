// Funció esAnyTraspas que determini si un any concret és un any de traspàs. 
// La funció rebrà un any i retornarà vertader o fals depenent de si l’any és de traspàs. 
// Un any és de traspàs si es compleix alguna de les següents condicions: 
// - L’any es divisible per 4, però no es divisible per 100. Per exemple, 2020 va ser traspàs però 1900 no i 2100 tampoc ho serà. 
// - L’any és divisible per 400. Per exemple, l’any 2000 va ser de traspàs.

import java.util.Scanner;

public class AnyTraspas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix l'any: ");
        int any = sc.nextInt();

        if(esAnyTraspas(any)){
            System.out.println("L'any " + any + " és de traspàs");
        }else{
            System.out.println("L'any " + any + " no és de traspàs");
        }
    }

    public static boolean esAnyTraspas(int any){
        if(any % 4 == 0 && any % 100 != 0){
            return true;
        }else if(any % 400 == 0){
            return true;
        }else{
            return false;
        }
    }

}
