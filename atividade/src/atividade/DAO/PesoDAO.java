package atividade.DAO;

import atividade.bean.Peso;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PesoDAO {

    private Connection conexao;

    //TODO - incluir parametros
    public void cadastrar(Peso peso) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO T_PESO(id_peso, id_usuario, dt_pesagem, vl_peso) VALUES (SQ_T_PESO.NEXTVAL, ?, ?, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, peso.getId_usuario());
            stmt.setDate(2, peso.getDt_pesagem());
            stmt.setDouble(3, peso.getVl_peso());

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

    public List<Peso> getAll() {
        List<Peso> listPeso = new ArrayList<Peso>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            stmt = conexao.prepareStatement("SELECT * FROM T_PESO");
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int id_peso = resultSet.getInt("id_peso");
                int id_usuario = resultSet.getInt("id_usuario");
                Date dt_pesagem = resultSet.getDate("dt_pesagem");
                double vl_peso = resultSet.getDouble("vl_peso");

                Peso peso = new Peso(id_peso, id_usuario, dt_pesagem, vl_peso);

                listPeso.add(peso);
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

        return listPeso;
    }
}
