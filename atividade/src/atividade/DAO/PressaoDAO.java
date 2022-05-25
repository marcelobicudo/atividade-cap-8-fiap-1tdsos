package atividade.DAO;

import atividade.bean.Pressao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PressaoDAO {
    private Connection conexao;

    public void cadastrar(Pressao pressao) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO T_PRESSAO(id_pressao, id_usuario, dt_medicao, vl_bpm) VALUES (SQ_T_PRESSAO.NEXTVAL, ?, ?, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, pressao.getId_usuario());
            stmt.setDate(2, pressao.getDt_medicao());
            stmt.setDouble(3, pressao.getVl_bpm());

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

    public List<Pressao> getAll() {
        List<Pressao> listPressao = new ArrayList<Pressao>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            stmt = conexao.prepareStatement("SELECT * FROM T_PRESSAO");
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int id_pressao = resultSet.getInt("id_pressao");
                int id_usuario = resultSet.getInt("id_usuario");
                Date dt_medicao = resultSet.getDate("dt_medicao");
                int vl_bpm = resultSet.getInt("vl_bpm");

                Pressao pressao = new Pressao(id_pressao, id_usuario, dt_medicao, vl_bpm);

                listPressao.add(pressao);
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

        return listPressao;
    }
}
