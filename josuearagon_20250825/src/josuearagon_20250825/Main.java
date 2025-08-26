/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package josuearagon_20250825;

/**
 *
 * @author UFG
 */

import java.util.Scanner; //java es un paquete, util un subpaquete y Scanner es una clase

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ingresar_datos( );
        
    }
    
    public static void ingresar_datos( ){
    
        //Iniciando la clase scanner
    Scanner scanner = new Scanner (System.in); 
    
    //DECLARACION DE VARIABLES A UTILIZAR
    int[] edades = new int[10];
    
    int suma = 0;
    int total_pares = 0;
    int total_impares =  0;
    
    
    //MENSAJE AL USUARIO
    System.out.println( "Ingrese" + edades.length+ "edades" );
    
    //SE RECORRE EL ARREGLO PARA ASIGNAR VALOR A CADA ELEMENTO
    for(int i = 0 ; i < edades.length; i++){
        
        //SE SOLICITA AL USUARIO UN VALOR A INGRESAR
        System.out.println("Edad" + i + ": ");
        
        //SE LEE DESDE EL TECLADO UN VALOR
        //SE LE ASIGNA ESE VALOR A LA VARIABLE EDAD QUE
        //ESTA UBICADA EN CADA ITERACION
        edades[i] = scanner.nextInt();
        
        
        //PARA CALCULAR EL PROMEDIO SE SUMAN TODOS LOS VALORES INGRESADOS
        suma+= edades[i];
        
        //ESTABLECER SI EL VALOR INGRESADO ES PAR O IMPAR
         if((edades[i] % 2) == 0 ){
             
             total_pares++;
         }else{
             total_impares++;
         }
        
    }
    
    
    double promedio = (double) suma/edades.length;
    
    
    System.out.println("Usted a ingresado " + edades.length+ " edades");
    
    System.out.println("El promedio de las edades ingresadas es: " + promedio);
    
    System.out.println("De las cuales: " + total_pares+ " son pares y "+ total_impares+ " son impares ");
    
    
    //SE CIERRA EL OBJETO DE TIPO SCANNER, YA QUE NO HABRÁ MÁS CONSULTAS
    scanner.close();
    }
    
}
