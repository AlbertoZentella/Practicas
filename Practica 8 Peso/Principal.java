import java.util.Scanner;
public class Principal{
    public static void main(String []args){
        Scanner leer=new Scanner(System.in);
        Persona e1=new Persona();
        double IMC;
        System.out.println("Ingrese su nombre");
        e1.set_Nombre(leer.nextLine());
        System.out.println("Ingrese su edad");
        e1.set_Edad(leer.nextInt());
        System.out.println("Ingrese su peso en kg");
        e1.set_Peso(leer.nextDouble());
        System.out.println("Ingrese su altura en m Ej: 1.65 m");
        e1.set_Altura(leer.nextDouble());
        IMC=Operaciones.calcular_Peso(e1.get_Peso(), e1.get_Altura());
        Operaciones.calcular_Pesoo(e1.get_Nombre(),e1.get_Edad(),e1.get_Peso(),e1.get_Altura(),IMC);
        }
    }
