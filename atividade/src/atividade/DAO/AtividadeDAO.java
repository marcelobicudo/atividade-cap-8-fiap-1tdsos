package atividade.DAO;

import atividade.bean.Atividade;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AtividadeDAO {
    private Connection conexao;

    public void cadastrar(Atividade atividade) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO T_ATIVIDADE(id_atividade, id_esporte, id_usuario, dt_atividade, vl_caloria, vl_tempo) VALUES (SEQ_ATIVIDADE.NEXTVAL, ?, ?, ?, ?, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, atividade.getId_esporte());
            stmt.setInt(2, atividade.getId_usuario());
            stmt.setDate(3, atividade.getDt_atividade());
            stmt.setInt(4, atividade.getVl_calorias());
            stmt.setDouble(5, atividade.getVl_tempo());

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

    public List<Atividade> getAll() {
        List<Atividade> listAtividade = new ArrayList<Atividade>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            stmt = conexao.prepareStatement("SELECT * FROM T_ATIVIDADE");
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int id_atividade = resultSet.getInt("id_atividade");
                int id_esporte = resultSet.getInt("id_esporte");
                int id_usuario = resultSet.getInt("id_usuario");
                Date dt_atividade = resultSet.getDate("dt_atividade");
                int vl_caloria = resultSet.getInt("vl_caloria");
                double vl_tempo = resultSet.getDouble("vl_tempo");

                Atividade atividade = new Atividade(id_atividade, id_esporte, id_usuario, dt_atividade, vl_caloria, vl_tempo);

                listAtividade.add(atividade);
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

        return listAtividade;
    }
}
