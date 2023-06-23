/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;
/**
 *
 * @author Henrique
 */
public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    private void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    private void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }
    
    public Livro(String titulo, String autor, int totPaginas){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.fechar();
        this.setPagAtual(0);
    }
    
    public void detalhes(){
        System.out.println(
                        leitor.getNome()
                        + "\nEsta lendo " + this.getTitulo()
                        + "\nAutoria de " + this.getAutor()
                        + "\nO livro esta aberto? " + this.getAberto()
                        + "\nEsta na pagina " + this.getPagAtual()
                        + " de " + this.getTotPaginas()
                        + "\n-------------------------------------------");
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.getAberto()){
            if(this.getTotPaginas() >= p){
                this.setPagAtual(p);
            }else{
                System.out.println("Pagina invalida!!!");
            }
            
        }else{
            System.out.println("Livro Fechado!!!");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getAberto()){
            if(getPagAtual() + 1 < getTotPaginas()){
                this.setPagAtual(getPagAtual() + 1);
            }else{
                System.out.println("Fim do livro!!!");
            }
            
        }else{
            System.out.println("Livro Fechado!!!");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto()){
            if(getPagAtual() - 1 > 0){
                this.setPagAtual(getPagAtual() - 1);
            }else{
                System.out.println("Voce esta no comeco do livro!!!");
            }
            
        }else{
            System.out.println("Livro Fechado!!!");
        }
    }
    
}
