package aula02;

public class Aula2 {
    
    public class Pote{
        int carga;
        int encher;
        double tamanho;
        String formato;
        String cor;
        boolean posicao;
        
        void encher(int encher){
            this.carga += encher;
        }
        void esvaziar(int encher){
            this.carga -= encher;
        }
        void virar(){
            if(posicao == true){
                this.posicao = false;
            }
            else{
                this.posicao = true;
            }
        }
    }
    public class PostIt{
        boolean amassado;
        boolean preenchido;
        String cor;
        int tamanho;
        
        void preencher(){
            if(preenchido == true){
                this.preenchido = false;
            }
            else{
                this.preenchido = true;
            }
        }
        void amassar(){
            this.amassado = true;
        }
        void desamassar(){
            this.amassado = false;
        }
    }
    public class Ave{
        String nome;
        String especie;
        double tamanho;
        
        void voar(){
            System.out.println("Voando!!");
        }
        void comer(){
            System.out.println("Comendo!!");
        }
    }
    public class Dimensoes{
        boolean existencia;
        boolean parado;
        int quantidade;
        double tamanho;
        double localização;
        
        void mexendo(boolean sentido){
            if(parado == false){
                if(sentido == true){
                    this.localização += 1;
                }
                else{
                    this.localização -= 1;
                }
            }
            else{
                System.out.println("Estou parado");
            }
        }
        void parado(boolean parar){
            if(parar = true){
                this.parado = true;
            }
            else{
                this.parado = false;
            }
        }
        void criando(int quantidade){
            this.quantidade += quantidade;
        }
        void morrendo(int quantidade){
            this.quantidade -= quantidade;
        }
    }
}
