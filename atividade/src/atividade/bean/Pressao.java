package atividade.bean;

import java.sql.Date;

public class Pressao {
    private int id_pressao;
    private int id_usuario;
    private Date dt_medicao;
    private int vl_bpm;

    public Pressao(int id_pressao, int id_usuario, Date dt_medicao, int vl_bpm) {
        this.id_pressao = id_pressao;
        this.id_usuario = id_usuario;
        this.dt_medicao = dt_medicao;
        this.vl_bpm = vl_bpm;
    }

    public int getId_pressao() {
        return id_pressao;
    }

    public void setId_pressao(int id_pressao) {
        this.id_pressao = id_pressao;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getDt_medicao() {
        return dt_medicao;
    }

    public void setDt_medicao(Date dt_medicao) {
        this.dt_medicao = dt_medicao;
    }

    public int getVl_bpm() {
        return vl_bpm;
    }

    public void setVl_bpm(int vl_bpm) {
        this.vl_bpm = vl_bpm;
    }
}
