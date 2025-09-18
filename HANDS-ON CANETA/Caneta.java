public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta; 
        this.carga = carga;
        this.tampada = tampada;
    } 

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float ponta){
        this.ponta = ponta;
    }

    public int getCarga(){
        return this.carga;
    }

    public void setCarga(int carga){
        this.carga = carga;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public void settampada(boolean tampada){
        this.tampada = tampada;
    }

    public void status(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("tampada: " + this.tampada);
    }

    public void escrever(){
        if(this.tampada || this.carga <= 0){
            System.out.println("impossivel escrever");
        } else{
            System.out.println("escrevendo");
        }
    }

    public void tampar(){
        if(this.tampada){
            System.out.println("Já estou tampada.");
        }else{
            this.tampada = true;
            System.out.println("Caneta tampada.");
        }
    }

    public void destampar(){
        if (this.tampada){
            this.tampada = false;
            System.out.println("Caneta destampada.");
        }else{
            System.out.println("Já estou destampada");
        }
    }

    

}