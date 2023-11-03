package DAO;
import entity.Usuario
import Conexao
public class UsuarioDAO {
    public void cadastroUsuario(Usuario Usuario){
        /*
        private String  dia_data;
        private int valor;
        private int valor_creditado;
        private String  bandeira;
        private String percentual;
        private String parcelamento;*/
        String sql = "INSERT INTO USUARIO (dia_data, valor,valor_creditado, bandeira, percentual, parcelamento) VALUES (?,?,?,?,?,?)";

        PreparedStatement ps = null;

        try{
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString()
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}