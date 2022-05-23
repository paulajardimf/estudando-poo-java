package Classes;

public class Pessoa {

    //Atributos
    private float peso;
    private float altura;

    //Método construtor
    public Pessoa() {
        //validações, valores default
    }


    //Métodos

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }


    //Métodos acessores
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }
}
