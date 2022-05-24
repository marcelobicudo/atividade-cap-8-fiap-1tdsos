package atividade.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PesoDAO {

    private Connection conexao;

    //TODO - incluir parametro
    public void cadastrar(/*Peso peso*/) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO T_PESO(id_peso, id_usuario, dt_pesagem, vl_peso) VALUES (SQ_T_PESO.NEXTVAL, ?, ?, ?, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, T_PESO.getid_peso());
            stmt.setString(2, T_PESO.getT_USUARIO_id_usuario());
            stmt.setDouble(3, T_PESO.getdt_pesagem());
            stmt.setDouble(4, T_PESO.getvl_peso());
            java.sql.Date data = new java.sql.Date(colaborador.getdt_pesagemgetdt_pesagem().getTimeInMillis());
            stmt.setDate(5, data);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
}
