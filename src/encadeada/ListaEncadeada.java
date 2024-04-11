package encadeada;

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

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            this.referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = this.referenciaEntrada;
        while(noAuxiliar.getProximoNo() != null){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
        this.validaIndice(index);
        No<T> noAuxiliar = this.referenciaEntrada;
        for(int i = 0; i < index; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private void validaIndice(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException("A lista lista está vazia");
        }
        if(this.size() < index){
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice: "+index);
        }
    }

    public T remove(int index){
        No<T> noPivo = this.getNo(index);
        if(index == 0){
            noPivo = this.referenciaEntrada;
            this.referenciaEntrada = this.referenciaEntrada.getProximoNo();
        }else{
            No<T> noAnterior = getNo(index -1);
            noAnterior.setProximoNo(noPivo.getProximoNo());
        }
        return noPivo.getConteudo();
    }

    @Override
    public String toString(){
        String stringRetorno = "[";
        No<T> noAuxiliar = this.referenciaEntrada;
        while (noAuxiliar != null) {
            stringRetorno += noAuxiliar.getConteudo() + "-->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        stringRetorno += "null]";
        return stringRetorno;
    }

}
