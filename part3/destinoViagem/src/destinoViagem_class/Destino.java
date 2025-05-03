package destinoViagem_class;

public class Destino {

    private String regiao;
    private String pais;
    private String identificador;
    static int contador = 1;

    public Destino(String regiao, String pais) {
        this.regiao = regiao;
        this.pais = pais;

        identificador = "D" + contador;
        contador++;
    }

    public String Descreva_Destino() {
        return identificador + " - " + regiao + " - " + pais;
    }

    //getters;
    public String getRegiao() {
        return regiao;
    }

    public String getPais() {
        return pais;
    }

    public String getIdentificador() {
        return identificador;
    }

    //setters;
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String toString() {
        return Descreva_Destino();
    }

}


