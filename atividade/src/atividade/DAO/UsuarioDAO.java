package atividade.DAO;

import atividade.bean.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Connection conexao;

    public void cadastrar(Usuario usuario) {
        PreparedStatement stmt = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            String sql = "INSERT INTO T_USUARIO(id_usuario, nm_usuario, sn_usuario, sh_usuario, dt_usuario, ds_email, vl_altura) VALUES (SEQ_USUARIO.NEXTVAL, ?, ?, ?, ?, ?, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNm_usuario());
            stmt.setString(2, usuario.getSn_usuario());
            stmt.setString(3, usuario.getSh_usuario());
            stmt.setDate(4, usuario.getDt_usuario());
            stmt.setString(5, usuario.getDs_email());
            stmt.setDouble(6, usuario.getVl_altura());

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

    public List<Usuario> getAll() {
        List<Usuario> listUsuario = new ArrayList<Usuario>();
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        DAO dao = new DAO();

        try {
            conexao = dao.getConnection();
            stmt = conexao.prepareStatement("SELECT * FROM T_USUARIO");
            resultSet = dao.getData(stmt);

            while (resultSet.next()) {
                int id_usuario = resultSet.getInt("id_usuario");
                String nm_usuario = resultSet.getString("nm_usuario");
                String sn_usuario = resultSet.getString("sn_usuario");
                String sh_usuario = resultSet.getString("sh_usuario");
                Date dt_usuario = resultSet.getDate("dt_usuario");
                String ds_email = resultSet.getString("ds_email");
                double vl_altura = resultSet.getDouble("vl_altura");

                Usuario atividade = new Usuario(id_usuario, nm_usuario, sn_usuario, sh_usuario, dt_usuario, ds_email, vl_altura);

                listUsuario.add(atividade);
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

        return listUsuario;
    }
}
