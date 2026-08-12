public class Televisao implements Ligavel {
    private String marca;
    private boolean ligado;

    public Televisao(String marca, boolean ligado) {
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }
}