/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismotarea2;

/**
 *
 * @author ALEX BELTRAN
 */
class OperacionNecesaria{

    int CalcularArea(int base, int altura){
    return base*altura;
    }
    double CalcularArea(double base, double altura){
    return (base*altura)/2;
    }
    float CalcularArea(float pi, float radio){
    return pi*radio*radio;
    }
    double CalcularArea(double arista){
    return 6*arista*arista;
    }
}


public class PolimorfismoTarea2 {

    public static void main(String[] args) {
    
        OperacionNecesaria Objeto1=new OperacionNecesaria();
        OperacionNecesaria Objeto2=new OperacionNecesaria();
        OperacionNecesaria Objeto3=new OperacionNecesaria();
        OperacionNecesaria Objeto4=new OperacionNecesaria();
        
        int resultado1;
        Objeto1.CalcularArea(10, 5);
        resultado1=Objeto1.CalcularArea(10, 5);
        System.out.println("Area de Objeto: "+resultado1);
        
        double resultado2;
        Objeto2.CalcularArea(20, 4);
        resultado2=Objeto2.CalcularArea(20, 4);
        System.out.println("Area de Objeto: "+resultado2);
        
        float resultado3;
        Objeto3.CalcularArea(3.1416, 6);
        resultado3=Objeto3.CalcularArea(3, 6);
        System.out.println("Area de Objeto: "+resultado3);
      
        double resultado4;
        Objeto4.CalcularArea(8);
        resultado4=Objeto4.CalcularArea(8);
        System.out.println("Area de Objeto: "+resultado4);
    }
    
}
