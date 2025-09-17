public class Main {
    public static void main(String[] args){
        Caneta c1 = new Caneta("compactor", "Azul", 0.7f, 10, true);
        c1.tampar();
        c1.escrever();
        c1.destampar();
        c1.escrever();
        c1.status();
    } 
}
