public class Operaciones{


    public static double calcular_Peso(double peso,double altura){
        double IMC=peso/(Math.pow(altura,2));
        return IMC;
    }

    public  static void calcular_Pesoo(String nombre,int edad,double peso,double altura,double IMC){
        if(IMC<18.5){
            System.out.println("Estimad@ " + nombre +" cuya edad es "+ edad +" y con una altura de " + altura +" y un peso de "+ peso +" Tu peso es BAJO ya que sacaste un IMC de " + IMC);
        }else if(IMC>=18.5 && IMC<25){
            System.out.println("Estimad@ " + nombre +" cuya edad es "+ edad +" y con una altura de " + altura +" y un peso de "+ peso +" Tu peso es NORMAL ya que sacaste un IMC de " + IMC);
        }else if(IMC>=25 && IMC <30){
            System.out.println("Estimad@ " + nombre +" cuya edad es "+ edad +" y con una altura de " + altura +" y un peso de "+ peso +" Tienes SOBREPESO ya que sacaste un IMC de " + IMC);
        }else if(IMC>30){
            System.out.println("Estimad@ " + nombre +" cuya edad es "+ edad +" y con una altura de " + altura +" y un peso de "+ peso +" Sufres de obesidad ya que sacaste un IMC de " + IMC);
        }else{
            System.out.println("lalala puto");
        }
    }

}