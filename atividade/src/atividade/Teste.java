package atividade;

import atividade.DAO.AtividadeDAO;
import atividade.DAO.PesoDAO;
import atividade.DAO.PressaoDAO;
import atividade.bean.Atividade;
import atividade.bean.Peso;
import atividade.bean.Pressao;

import java.sql.Date;

public class Teste {
    public static void main(String[] args) {
        //PESO
        PesoDAO pDao = new PesoDAO();
        System.out.println("Cadastro de Peso 1");

        Peso peso1 = new Peso();
        peso1.setVl_peso(60.50);
        peso1.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso1.setId_usuario(1);
        pDao.cadastrar(peso1);
        
        System.out.println("Cadastro de Peso 2");

        Peso peso2 = new Peso();
        peso2.setVl_peso(75.50);
        peso2.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso2.setId_usuario(1);
        pDao.cadastrar(peso2);
        
        System.out.println("Cadastro de Peso 3");

        Peso peso3 = new Peso();
        peso3.setVl_peso(75.50);
        peso3.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso3.setId_usuario(1);
        pDao.cadastrar(peso3);
        
        System.out.println("Cadastro de Peso 4:");

        Peso peso4 = new Peso();
        peso4.setVl_peso(75.50);
        peso4.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso4.setId_usuario(1);
        pDao.cadastrar(peso4);
        
        System.out.println("Cadastro de Peso 5:");

        Peso peso5 = new Peso();
        peso5.setVl_peso(75.50);
        peso5.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso5.setId_usuario(1);
        pDao.cadastrar(peso5);

        // PRESSAO

        PressaoDAO pressaoDao = new PressaoDAO();
        Pressao pressao1 = new Pressao();
        pressao1.setId_usuario(1);
        pressao1.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao1.setVl_bpm(95);
        pressaoDao.cadastrar(pressao1);
       
        System.out.println("Cadastro de Pressão 1:");

        Pressao pressao2 = new Pressao();
        pressao2.setId_usuario(1);
        pressao2.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao2.setVl_bpm(110);
        pressaoDao.cadastrar(pressao2);
       
        System.out.println("Cadastro de Pressão 2:");

        Pressao pressao3 = new Pressao();
        pressao3.setId_usuario(1);
        pressao3.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao3.setVl_bpm(120);
        pressaoDao.cadastrar(pressao3);
       
        System.out.println("Cadastro de Pressão 3:");

        Pressao pressao4 = new Pressao();
        pressao4.setId_usuario(1);
        pressao4.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao4.setVl_bpm(118);
        pressaoDao.cadastrar(pressao4);
       
        System.out.println("Cadastro de Pressão 4:");

        Pressao pressao5 = new Pressao();
        pressao5.setId_usuario(1);
        pressao5.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao5.setVl_bpm(115);
        pressaoDao.cadastrar(pressao5);
       
        System.out.println("Cadastro de Pressão 5:");

        // ATIVIDADE

        AtividadeDAO atividadeDAO = new AtividadeDAO();
        Atividade atividade1 = new Atividade();
        atividade1.setId_usuario(1);
        atividade1.setId_esporte(2);
        atividade1.setDt_atividade(new Date(new java.util.Date().getTime()));
        atividade1.setVl_calorias(500);
        atividade1.setVl_tempo(42.30);
        atividadeDAO.cadastrar(atividade1);

        System.out.println("Cadastro de Atividade 1:");

        Atividade atividade2 = new Atividade();
        atividade2.setId_usuario(1);
        atividade2.setId_esporte(3);
        atividade2.setDt_atividade(new Date(new java.util.Date().getTime()));
        atividade2.setVl_calorias(150);
        atividade2.setVl_tempo(25.00);
        atividadeDAO.cadastrar(atividade2);

        System.out.println("Cadastro de Atividade 2:");

        Atividade atividade3 = new Atividade();
        atividade3.setId_usuario(1);
        atividade3.setId_esporte(2);
        atividade3.setDt_atividade(new Date(new java.util.Date().getTime()));
        atividade3.setVl_calorias(200);
        atividade3.setVl_tempo(18.51);
        atividadeDAO.cadastrar(atividade3);

        System.out.println("Cadastro de Atividade 3:");

        Atividade atividade4 = new Atividade();
        atividade4.setId_usuario(2);
        atividade4.setId_esporte(4);
        atividade4.setDt_atividade(new Date(new java.util.Date().getTime()));
        atividade4.setVl_calorias(784);
        atividade4.setVl_tempo(65.07);
        atividadeDAO.cadastrar(atividade4);

        System.out.println("Cadastro de Atividade 4:");

        Atividade atividade5 = new Atividade();
        atividade5.setId_usuario(1);
        atividade5.setId_esporte(1);
        atividade5.setDt_atividade(new Date(new java.util.Date().getTime()));
        atividade5.setVl_calorias(235);
        atividade5.setVl_tempo(41.22);
        atividadeDAO.cadastrar(atividade5);

        System.out.println("Cadastro de Atividade 5:");

    }
}
