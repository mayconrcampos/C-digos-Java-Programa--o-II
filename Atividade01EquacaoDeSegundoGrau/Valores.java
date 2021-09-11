package Atividade01EquacaoDeSegundoGrau;


public class Valores {
    private Double a;
    private Double b;
    private Double c;
    
    public Valores(Double a, Double b, Double c){
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    protected void setA(Double a){
        this.a = a;  
    }

    protected void setB(Double b){
        this.b = b;   
    }

    protected void setC(Double c){
        this.c = c;
    }

    public Double getA() {
        return this.a;
    }

    public Double getB() {
        return this.b;
    }

    public Double getC() {
        return this.c;
    }
}
