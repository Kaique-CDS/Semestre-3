import java.util.Scanner;

abstract class Forma {
    public abstract float area();
    public abstract void mostra();
    
    public float perimetro() {
        return 0f;
    }
}

class Circunferencia extends Forma {
    private float raio;

    public Circunferencia(float r) {
        this.raio = r;
    }

    public void setCircunferencia(float r) {
        this.raio = r;
    }

    public float getCircunferencia() {
        return this.raio;
    }

    @Override
    public float area() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * raio);
    }

    @Override
    public void mostra() {
        System.out.println("--- Circunferência ---");
        System.out.println("Raio: " + this.raio);
        System.out.println("Área: " + this.area());
        System.out.println("Perímetro: " + this.perimetro());
    }
}

class Triangulo extends Forma {
    protected float base;
    protected float altura;

    public Triangulo(float b, float h) {
        this.base = b;
        this.altura = h;
    }

    public float getBase() { return base; }
    public void setBase(float base) { this.base = base; }
    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }

    @Override
    public float area() {
        return (base * altura) / 2; 
    }

    @Override
    public void mostra() {
        System.out.println("Base: " + base + ", Altura: " + altura);
    }
}

class Retangulo extends Triangulo {
    public Retangulo(float b, float a) {
        super(b, a);
    }

    @Override
    public float area() {
        return base * altura;
    }

    @Override
    public float perimetro() {
        return (base * altura) * 2;
    }

    @Override
    public void mostra() {
        System.out.println("--- Retângulo ---");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + this.area());
        System.out.println("Perímetro: " + this.perimetro());
    }
}

public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o raio da circunferência: ");
        float raio = scanner.nextFloat();
        
        Circunferencia circ = new Circunferencia(raio);

        System.out.print("Digite a base do retângulo: ");
        float base = scanner.nextFloat();
        System.out.print("Digite a altura do retângulo: ");
        float altura = scanner.nextFloat();

        Retangulo ret = new Retangulo(base, altura);

        System.out.println("\n");
        circ.mostra();
        System.out.println();
        ret.mostra();
        
        scanner.close();
    }
}