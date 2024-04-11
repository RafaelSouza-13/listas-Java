package duplamente;

public class NoDublo<T> {
    private T conteudo;
    private NoDublo<T> NoProximo;
    private NoDublo<T> NoAnterior;

    public NoDublo(T conteudo){
        this.conteudo = conteudo;
        this.NoProximo = null;
        this.NoAnterior = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDublo<T> getNoProximo() {
        return NoProximo;
    }

    public void setNoProximo(NoDublo<T> noProximo) {
        NoProximo = noProximo;
    }

    public NoDublo<T> getNoAnterior() {
        return NoAnterior;
    }

    public void setNoAnterior(NoDublo<T> noAnterior) {
        NoAnterior = noAnterior;
    }

    @Override
    public String toString() {
        return "NoDublo [conteudo=" + conteudo + ", toString()=" + super.toString() + "]";
    }
}
