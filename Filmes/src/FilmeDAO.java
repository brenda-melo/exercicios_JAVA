import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {

    public void cadastrarFilme(Filme filme) {
        String sql = "INSERT INTO filmes (titulo, ano) VALUES (?, ?)";
        PreparedStatement ps = null;

        try {
            Connection conn = Conexao.getConexao();
            ps = conn.prepareStatement(sql);
            ps.setString(1, filme.getTitulo());
            ps.setInt(2, filme.getAno());

            ps.execute();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void removerFilme(Filme filme) {
    	String sql = "DELETE FROM filmes WHERE (id) = (?)";
    	PreparedStatement ps = null;
    	
    	try {
    		Connection conn = Conexao.getConexao();
            ps = conn.prepareStatement(sql);
    		ps.setInt(1, filme.getId());
            
            
            ps.execute();
            ps.close();
    	} catch (SQLException e) {
            e.printStackTrace();
        }
    	
    }
    
    public List<Filme> getFilmes(){
    	String sql = "SELECT * FROM filmes";
    	List<Filme> filmes = new ArrayList<Filme>();
    	PreparedStatement ps = null;
    	ResultSet rset = null;
    	try {
    		Connection conn = Conexao.getConexao();
    		ps = conn.prepareStatement(sql);
    		rset = ps.executeQuery();
    		
    		while (rset.next()) {
				Filme filme = new Filme();
				filme.setId(rset.getInt("id"));
				filme.setTitulo(rset.getString("titulo"));
				filme.setAno(rset.getInt("ano"));
				
				filmes.add(filme);
			}
    		
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filmes;
    	
    	
    }
    
}