public class Lampada implements Ligavel {
    private String comodo;
    private boolean ligado;

    public Lampada(String comodo, boolean ligado) {
        this.comodo = comodo;
        this.ligado = ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    public String getComodo() {
        return comodo;
    }
}