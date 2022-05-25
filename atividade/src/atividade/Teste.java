package atividade;

public class Teste {
    public static void main(String[] args) {
        //PESSOA
        UsuarioDAO uDAO = new UsuarioDAO();
        Usuario usuario1 = new Usuario();
        usuario1.setSn_usuario(61.50);
        usuario1.setSh_usuario();
        usuario1.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario1.setDs_email("maria@gmail.com");
        usuario1.setVl_altura(1.61);

        System.out.println("Cadastro de Pessoa 1:" + uDAO.cadastrar(usuario1));

        Usuario usuario2 = new Usuario();
        usuario2.setSn_usuario(62.50);
        usuario2.setSh_usuario();
        usuario2.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario2.setDs_email("Leticia@gmail.com");
        usuario2.setVl_altura(1.71);

        System.out.println("Cadastro de Pessoa 2:" + uDAO.cadastrar(usuario2));

        Usuario usuario3 = new Usuario();
        usuario3.setSn_usuario(63.50);
        usuario3.setSh_usuario();
        usuario3.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario3.setDs_email("joao@gmail.com");
        usuario3.setVl_altura(1.40);

        System.out.println("Cadastro de Pessoa 3:" + uDAO.cadastrar(usuario3));

        Usuario usuario4 = new Usuario();
        usuario4.setSn_usuario(59.50);
        usuario4.setSh_usuario();
        usuario4.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario4.setDs_email("renata@gmail.com");
        usuario4.setVl_altura(1.40);

        System.out.println("Cadastro de Pessoa 4:" + uDAO.cadastrar(usuario4));

        Usuario usuario5 = new Usuario();
        usuario5.setSn_usuario(59.50);
        usuario5.setSh_usuario();
        usuario5.setDt_usuario(new java.sql.Date(new java.util.Date().getTime()));
        usuario5.setDs_email("renata@gmail.com");
        usuario5.setVl_altura(1.40);

        System.out.println("Cadastro de Pessoa 5:" + uDAO.cadastrar(usuario5));

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
