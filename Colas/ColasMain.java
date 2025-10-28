/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colas;

import java.util.Scanner;

/**
 *
 * @author Miguel
 * 
 */


public class ColasMain {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.insertar("Prepara café");
        cola.insertar("Revisar emails");
        cola.insertar("Iniciar proyecto");
        
   
        System.out.println("Tamaño de la cola: " + cola.getTamano());
        System.out.println("Frente de la cola: " + cola.frente());
        cola.quitar();
        System.out.println(cola.quitar());
        System.out.println("Tarea ejecutada");
        
        System.out.println(cola.quitar());
        System.out.println("Tarea ejecutada");
        
        Scanner teclado = new Scanner(System.in);
        String elemento = "";
        int opcion = 0;
        do {
            
            System.out.println("----------Menu----------");
            System.out.println("Elige una de las siguientes operaciones: ");
            System.out.println("Insertar(1), Eliminar(2), Ver frente(3), Ver tamaño(4), Salir(5)");
            opcion = teclado.nextInt();
            teclado.nextLine(); 
            switch(opcion){
                case 1: 
                    System.out.println("Ingresa un elemento: ");
                    elemento = teclado.nextLine();
                    cola.insertar(elemento);
                    break;
                case 2:
                    System.out.println("Tarea eliminada");
                    System.out.println(cola.quitar());
                    break;
                case 3:
                    System.out.println("Frente de la cola: ");
                    System.out.println(cola.frente());
                    break;
                case 4:
                    System.out.println("Tamaño de la cola: ");
                    System.out.println(cola.getTamano());
                    break;
            }
            
        } while(opcion != 5);
    }
}

