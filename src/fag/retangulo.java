package fag;

public class retangulo {

    private double largura;
    private double altura;

    public retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura); 
    }
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        if (largura <= 0) {
            System.out.println("Largura deve ser maior que 0!");
            return;
        }
            this.largura = largura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
        	System.out.println("Altura deve ser maior que 0!"); 
        return;
        }
        this.altura = altura;
    }
    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }
}