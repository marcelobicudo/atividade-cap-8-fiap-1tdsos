package atividade.bean;

public class Esporte {
    private int id_esporte;
    private String nm_esporte;

    public Esporte(int id_esporte, String nm_esporte) {
        this.id_esporte = id_esporte;
        this.nm_esporte = nm_esporte;
    }

    public Esporte() {

    }

    public int getId_esporte() {
        return id_esporte;
    }

    public void setId_esporte(int id_esporte) {
        this.id_esporte = id_esporte;
    }

    public String getNm_esporte() {
        return nm_esporte;
    }

    public void setNm_esporte(String nm_esporte) {
        this.nm_esporte = nm_esporte;
    }
}
