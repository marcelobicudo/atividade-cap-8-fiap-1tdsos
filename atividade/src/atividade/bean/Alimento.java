package atividade.bean;

import java.sql.Date;

public class Alimento {
    private int id_alimento;
    private int id_usuario;
    private Date dt_refeicao;
    private String nm_alimento;

    public Alimento(int id_alimento, int id_usuario, Date dt_refeicao, String nm_alimento) {
        this.id_alimento = id_alimento;
        this.id_usuario = id_usuario;
        this.dt_refeicao = dt_refeicao;
        this.nm_alimento = nm_alimento;
    }

    public int getId_alimento() {
        return id_alimento;
    }

    public void setId_alimento(int id_alimento) {
        this.id_alimento = id_alimento;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getDt_refeicao() {
        return dt_refeicao;
    }

    public void setDt_refeicao(Date dt_refeicao) {
        this.dt_refeicao = dt_refeicao;
    }

    public String getNm_alimento() {
        return nm_alimento;
    }

    public void setNm_alimento(String nm_alimento) {
        this.nm_alimento = nm_alimento;
    }
}
