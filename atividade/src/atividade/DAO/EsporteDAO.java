package atividade.DAO;

import atividade.bean.Esporte;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EsporteDAO {
    private Connection conexao;

    public void cadastrar(Esporte esporte) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO T_ESPORTES(id_esporte, nm_esporte) VALUES (SQ_T_ESPORTE.NEXTVAL, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, esporte.getNm_esporte());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Esporte> getAll() {
        List<Esporte> listEsporte = new ArrayList<Esporte>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            stmt = conexao.prepareStatement("SELECT * FROM T_ESPORTES");
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int id_esporte = resultSet.getInt("id_esporte");
                String nm_esporte = resultSet.getString("nm_esporte");

                Esporte esporte = new Esporte(id_esporte, nm_esporte);

                listEsporte.add(esporte);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                assert stmt != null;
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listEsporte;
    }
}
