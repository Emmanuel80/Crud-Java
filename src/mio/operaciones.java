
package mio;

public class operaciones {
    double num1;
    double num2;
    double resultado;
    
    
    public double suma(double a, double b){
        this.num1=a;
        this.num2=b;
        
        this.resultado=a+b;
        return resultado;
    }
    public double resta(double c,double d){
        this.num1=c;
        this.num2=d;
        
        this.resultado=c-d;
        return resultado;
    }
    public double multiplicacion(double a,double b){
            
        this.num1=a;
        this.num2=b;
        this.resultado=a*b;
        return this.resultado;
    
    }
    
    public double Division(double a, double b){ 
    
            this.num1=a;
            this.num2=b;
            this.resultado=a/b;
            return this.resultado;
    }
}
