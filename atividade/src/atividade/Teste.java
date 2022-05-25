package atividade;

public class Teste {
    public static void main(String[] args) {
        //PESSOA


        //PESO 
        PesoDAO pDao = new PesoDAO();
        Peso peso = new Peso();
        peso.setVl_peso(61.50);
        peso.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso.setId_usuario()
       
        System.out.println("Cadastro de Peso 1:" + pDao.add(peso));

        Peso peso1 = new Peso();
        peso1.setVl_peso(60.50);
        peso1.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso1.setId_usuario()
        
        System.out.println("Cadastro de Peso 2:" + pDao.add(peso1));

        Peso peso2 = new Peso();
        peso2.setVl_peso(75.50);
        peso2.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso2.setId_usuario()
        
        System.out.println("Cadastro de Peso 2:" + pDao.add(peso2));

        Peso peso3 = new Peso();
        peso3.setVl_peso(75.50);
        peso3.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso3.setId_usuario()
        
        System.out.println("Cadastro de Peso 3:" + pDao.add(peso3));

        Peso peso4 = new Peso();
        peso4.setVl_peso(75.50);
        peso4.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso4.setId_usuario()
        
        System.out.println("Cadastro de Peso 4:" + pDao.add(peso4));

        Peso peso5 = new Peso();
        peso5.setVl_peso(75.50);
        peso5.setDt_pesagem(new java.sql.Date(new java.util.Date().getTime()));
        peso5.setId_usuario()
        
        System.out.println("Cadastro de Peso 5:" + pDao.add(peso5));

        // PRESSAO

        PressaoDAO pressaoDao = new PressaoDAO();
        Pressao pressao1 = new Pressao();
        pressao1.setId_usuario()
        pressao1.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao1.setVl_bpm(95)
       
        System.out.println("Cadastro de Pressão 1:" + pressaoDao.add(pressao1));

        Pressao pressao2 = new Pressao();
        pressao2.setId_usuario()
        pressao2.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao2.setVl_bpm(110)
       
        System.out.println("Cadastro de Pressão 2:" + pressaoDao.add(pressao2));

        Pressao pressao3 = new Pressao();
        pressao3.setId_usuario()
        pressao3.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao3.setVl_bpm(120)
       
        System.out.println("Cadastro de Pressão 3:" + pressaoDao.add(pressao3));

        Pressao pressao4 = new Pressao();
        pressao4.setId_usuario()
        pressao4.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao4.setVl_bpm(118)
       
        System.out.println("Cadastro de Pressão 4:" + pressaoDao.add(pressao4));

        Pressao pressao5 = new Pressao();
        pressao5.setId_usuario()
        pressao5.setDt_medicao(new java.sql.Date(new java.util.Date().getTime()));
        pressao5.setVl_bpm(115)
       
        System.out.println("Cadastro de Pressão 5:" + pressaoDao.add(pressao5));
    }
}
