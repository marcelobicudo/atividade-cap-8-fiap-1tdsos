package atividade.bean;


import java.sql.Date;

public class Peso {
    private int id_peso;
    private int id_usuario;
    private Date dt_pesagem;
    private double vl_peso;

    public Peso(int id_peso, int id_usuario, Date dt_pesagem, double vl_peso) {
        this.id_peso = id_peso;
        this.id_usuario = id_usuario;
        this.dt_pesagem = dt_pesagem;
        this.vl_peso = vl_peso;
    }

    public Peso() {
        
    }

    public int getId_peso() {
        return id_peso;
    }

    public void setId_peso(int id_peso) {
        this.id_peso = id_peso;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getDt_pesagem() {
        return dt_pesagem;
    }

    public void setDt_pesagem(Date dt_pesagem) {
        this.dt_pesagem = dt_pesagem;
    }

    public double getVl_peso() {
        return vl_peso;
    }

    public void setVl_peso(double vl_peso) {
        this.vl_peso = vl_peso;
    }
}
