public class Principal {
    public static void main(String[] args){
        Carros c1 = new Carros();

        c1.potencia = 1200;
        c1.velocidade = 431;
        c1.nome = "Fiat Uno com Escada";

        c1.acelerar();
        c1.frear();
        c1.imprimir();
    }
}
