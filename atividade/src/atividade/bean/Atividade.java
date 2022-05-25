package atividade.bean;

import java.sql.Date;

public class Atividade {
    private int id_atividade;
    private int id_esporte;
    private int id_usuario;
    private Date dt_atividade;
    private int vl_calorias;
    private double vl_tempo;

    public Atividade(int id_atividade, int id_esporte, int id_usuario, Date dt_atividade, int vl_calorias, double vl_tempo) {
        this.id_atividade = id_atividade;
        this.id_esporte = id_esporte;
        this.id_usuario = id_usuario;
        this.dt_atividade = dt_atividade;
        this.vl_calorias = vl_calorias;
        this.vl_tempo = vl_tempo;
    }

    public Atividade() {

    }

    public int getId_atividade() {
        return id_atividade;
    }

    public void setId_atividade(int id_atividade) {
        this.id_atividade = id_atividade;
    }

    public int getId_esporte() {
        return id_esporte;
    }

    public void setId_esporte(int id_esporte) {
        this.id_esporte = id_esporte;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getDt_atividade() {
        return dt_atividade;
    }

    public void setDt_atividade(Date dt_atividade) {
        this.dt_atividade = dt_atividade;
    }

    public int getVl_calorias() {
        return vl_calorias;
    }

    public void setVl_calorias(int vl_calorias) {
        this.vl_calorias = vl_calorias;
    }

    public double getVl_tempo() {
        return vl_tempo;
    }

    public void setVl_tempo(double vl_tempo) {
        this.vl_tempo = vl_tempo;
    }
}
