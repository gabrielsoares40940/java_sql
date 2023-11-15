package modelDAO;
import connection.Conexao;
import entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    public void cadastroUsuario(Usuario cliente){
        
        String sql = "INSERT INTO cliente (dia_data, valor, bandeira, pagamento, parcelamento) VALUES (?,?,?,?,?)";

        PreparedStatement ps = null;

        try{
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, cliente.getDia_data());
            ps.setString(2, cliente.getBandeira());
            ps.setInt(3, cliente.getValor());
            ps.setString(4, cliente.getPagamento());
            ps.setString(5, cliente.getParcelamento());
            
            ps.execute();
            ps.close();
            
        }catch (SQLException e){
        }

    }
}