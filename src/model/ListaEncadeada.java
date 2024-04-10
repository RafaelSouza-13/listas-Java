package model;

public class ListaEncadeada<T> {
    private No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return (this.referenciaEntrada == null) ? true : false;
    }

    public int size(){
        No<T> noAuxiliar = this.referenciaEntrada;
        if(this.isEmpty()){
            return 0;
        }
        int tamanho = 1;
        while(noAuxiliar.getProximoNo() != null){
            tamanho++;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return tamanho;
    }

    public void insert(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            this.referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxilar = this.referenciaEntrada;
        while(noAuxilar.getProximoNo() != null){
            noAuxilar = noAuxilar.getProximoNo();
        }
        noAuxilar.setProximoNo(novoNo);
    }


}
