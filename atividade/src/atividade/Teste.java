package atividade;

import atividade.DAO.*;
import atividade.bean.*;

import java.sql.Date;

public class Teste {
    public static void main(String[] args) {
        //PESSOA
        UsuarioDAO uDAO = new UsuarioDAO();
        Usuario usuario1 = new Usuario();
        usuario1.setSn_usuario("maria");
        usuario1.setSh_usuario("M09921");
        usuario1.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario1.setDs_email("maria@gmail.com");
        usuario1.setVl_altura(1.61);
        uDAO.cadastrar(usuario1);

        System.out.println("Cadastro de Pessoa 1:");

        Usuario usuario2 = new Usuario();
        usuario2.setSn_usuario("leticia");
        usuario2.setSh_usuario("L09922");
        usuario2.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario2.setDs_email("Leticia@gmail.com");
        usuario2.setVl_altura(1.71);
        uDAO.cadastrar(usuario2);

        System.out.println("Cadastro de Pessoa 2:");

        Usuario usuario3 = new Usuario();
        usuario3.setSn_usuario("joao");
        usuario3.setSh_usuario("J09923");
        usuario3.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario3.setDs_email("joao@gmail.com");
        usuario3.setVl_altura(1.40);
        uDAO.cadastrar(usuario3);

        System.out.println("Cadastro de Pessoa 3:");

        Usuario usuario4 = new Usuario();
        usuario4.setSn_usuario("renata");
        usuario4.setSh_usuario("RE09924");
        usuario4.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario4.setDs_email("renata@gmail.com");
        usuario4.setVl_altura(1.40);
        uDAO.cadastrar(usuario4);

        System.out.println("Cadastro de Pessoa 4:");

        Usuario usuario5 = new Usuario();
        usuario5.setSn_usuario("marta");
        usuario5.setSh_usuario("M09925");
        usuario5.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario5.setDs_email("marta@gmail.com");
        usuario5.setVl_altura(1.40);
        uDAO.cadastrar(usuario5);

        System.out.println("Cadastro de Pessoa 5:");

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
        peso2.setId_usuario(2);
        pDao.cadastrar(peso2);
        
        System.out.println("Cadastro de Peso 3");

        Peso peso3 = new Peso();
        peso3.setVl_peso(75.50);
        peso3.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso3.setId_usuario(3);
        pDao.cadastrar(peso3);
        
        System.out.println("Cadastro de Peso 4:");

        Peso peso4 = new Peso();
        peso4.setVl_peso(75.50);
        peso4.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso4.setId_usuario(4);
        pDao.cadastrar(peso4);
        
        System.out.println("Cadastro de Peso 5:");

        Peso peso5 = new Peso();
        peso5.setVl_peso(75.50);
        peso5.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso5.setId_usuario(5);
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

        // ESPORTE
        EsporteDAO eDao = new EsporteDAO();
        Esporte esporte1 = new Esporte();
        esporte1.setNm_esporte("Natação");
        eDao.cadastrar(esporte1);

        System.out.println("Cadastro de Esporte 1:");

        Esporte esporte2 = new Esporte();
        esporte2.setNm_esporte("Futebol");
        eDao.cadastrar(esporte2);

        System.out.println("Cadastro de Esporte 2:");

        Esporte esporte3 = new Esporte();
        esporte3.setNm_esporte("Basquete");
        eDao.cadastrar(esporte3);

        System.out.println("Cadastro de Esporte 3:");

        Esporte esporte4 = new Esporte();
        esporte4.setNm_esporte("Volei");
        eDao.cadastrar(esporte4);

        System.out.println("Cadastro de Esporte 4:");

        Esporte esporte5 = new Esporte();
        esporte5.setNm_esporte("Corrida");
        eDao.cadastrar(esporte5);

        System.out.println("Cadastro de Esporte 5:");
   
        // ALIMENTO
        AlimentoDAO aDao = new AlimentoDAO();
        Alimento alimento1 = new Alimento();
        alimento1.setId_usuario(1);
        alimento1.setDt_refeicao(new java.sql.Date(new java.util.Date().getTime()));
        alimento1.setNm_alimento("Sopa");
        aDao.cadastrar(alimento1);
       
        System.out.println("Cadastro de Alimantação 1:");

        Alimento alimento2 = new Alimento();
        alimento2.setId_usuario(2);
        alimento2.setDt_refeicao(new java.sql.Date(new java.util.Date().getTime()));
        alimento2.setNm_alimento("Pizza");
        aDao.cadastrar(alimento2);
       
        System.out.println("Cadastro de Alimantação 2:");

        Alimento alimento3 = new Alimento();
        alimento3.setId_usuario(3);
        alimento3.setDt_refeicao(new java.sql.Date(new java.util.Date().getTime()));
        alimento3.setNm_alimento("Bolo");
        aDao.cadastrar(alimento3);
       
        System.out.println("Cadastro de Alimantação 3:");

        Alimento alimento4 = new Alimento();
        alimento4.setId_usuario(4);
        alimento4.setDt_refeicao(new java.sql.Date(new java.util.Date().getTime()));
        alimento4.setNm_alimento("Bolo");
        aDao.cadastrar(alimento4);
       
        System.out.println("Cadastro de Alimantação 4:");
        
        Alimento alimento5 = new Alimento();
        alimento5.setId_usuario(5);
        alimento5.setDt_refeicao(new java.sql.Date(new java.util.Date().getTime()));
        alimento5.setNm_alimento("Torta");
        aDao.cadastrar(alimento5);
       
        System.out.println("Cadastro de Alimantação 5:");
    }
}
