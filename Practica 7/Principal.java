  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

import java.util.Scanner;

/**
 *
 * @author OHMASTER
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int at,numempleado,modificar;
        int opcion=0,i=0,edad;
        String nombre,apellido;
        Empleado arr[]= new Empleado[5];
        do{
        numempleado=0;
        opcion=0;
       
        opcion=Integer.parseInt(JOptionPane.showInputDialog("-------Menu  -----\n" +"SOLO PODRA INGRESAR 5 EMPLEADOS " + "\n" + "1.-Agregar Empleado \n 2.- Modificar Empleado \n 3.- Mostrar empleado." ));
       switch(opcion){
           case 1:
           for(i=0;i<arr.length;i++){
            nombre = JOptionPane.showInputDialog("Agregue el nombre del empleado " + (i));
            apellido = JOptionPane.showInputDialog("Agregue el apellido del empleado " + (i));
            edad=Integer.parseInt(JOptionPane.showInputDialog("Agregue la edad del empleado " + (i)));
            arr[i]=new Empleado(nombre,apellido,edad);
           }
           break;
           case 2:
           modificar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleado que desea modificar"));
           JOptionPane.showMessageDialog(null, "Los datos actuales del empleado " + modificar +" que desea modificar son estos " + modificar + "\n Nombre: " + arr[modificar].getNombre() +"\n"+ " Apellidos " + arr[modificar].getApellido() + "\n"+" Edad " + arr[modificar].getEdad());
           JOptionPane.showMessageDialog(null,"A continuación se le pedira nuevamente lo datos que seran reescritos");
           nombre = JOptionPane.showInputDialog("Agregue el nombre del empleado " + (modificar));
           arr[modificar].setNombre(nombre);
           apellido = JOptionPane.showInputDialog("Agregue el apellido del empleado " + (modificar));
           arr[modificar].setApellido(apellido);
           edad=Integer.parseInt(JOptionPane.showInputDialog("Agregue la edad del empleado " + (modificar)));
           arr[modificar].setEdad(edad);
           JOptionPane.showMessageDialog(null,"Los datos han sido reescritos correctamente ");
           break;
           case 3:
           numempleado=Integer.parseInt(JOptionPane.showInputDialog("de que empleado desea ver su información ingresar numero del 0 al 4"));
            JOptionPane.showMessageDialog(null, "Los datos del empleado " + numempleado + "\n Nombre: " + arr[numempleado].getNombre() +"\n"+ " Apellidos " + arr[numempleado].getApellido() + "\n"+" Edad " + arr[numempleado].getEdad());
           break;
       }
       at=Integer.parseInt(JOptionPane.showInputDialog("Desea repetir el programa  1.-Si y 2.-No"));
    }while(at != 2);
    }
}