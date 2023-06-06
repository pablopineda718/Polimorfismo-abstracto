package polimorfismo.abstracto;

public class Rectangulo extends Figura{
    private double largo;
    private double ancho;
    
    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double calcularArea(){
        return largo * ancho;
    }
}
