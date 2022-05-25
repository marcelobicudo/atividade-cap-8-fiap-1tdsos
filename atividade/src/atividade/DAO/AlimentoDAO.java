package atividade.DAO;

import atividade.bean.Alimento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlimentoDAO {
    private Connection conexao;

    public void cadastrar(Alimento alimento) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO T_ALIMENTOS(id_alimento, id_usuario, dt_refeicao, nm_alimento) VALUES (SEQ_ALIMENTOS.NEXTVAL, ?, ?, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, alimento.getId_usuario());
            stmt.setDate(2, alimento.getDt_refeicao());
            stmt.setString(3, alimento.getNm_alimento());

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

    public List<Alimento> getAll() {
        List<Alimento> listAlimentos = new ArrayList<Alimento>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            stmt = conexao.prepareStatement("SELECT * FROM T_ALIMENTOS");
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int id_alimento = resultSet.getInt("id_alimento");
                int id_usuario = resultSet.getInt("id_usuario");
                Date dt_refeicao = resultSet.getDate("dt_refeicao");
                String nm_alimento = resultSet.getString("nm_alimento");

                Alimento alimento = new Alimento(id_alimento, id_usuario, dt_refeicao, nm_alimento);

                listAlimentos.add(alimento);
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

        return listAlimentos;
    }
}
