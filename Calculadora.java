public class Calculadora {

    public int somar(int a, int b) {
        return a + b;
    }
    public int subtrair(int a, int b){
        return a - b;
    }
    public int multiplicacao(int a, int b){
        return a * b;
    }

    public int divisao(int a, int b){
        if (b == 0){
            System.out.println("Não pode divisão por 0");
        }

        return a / b;
    }

}
