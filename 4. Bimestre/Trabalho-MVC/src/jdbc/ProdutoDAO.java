package jdbc;

import mvc.model.ProdutoModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
// CLASS PARA GERENCIAR PRODUTOS -> Banco de Dados.
public class ProdutoDAO extends BasicoDAO {
	
	// FUNÇÃO PARA INSERIR UM PRODUTO
    public void insert(ProdutoModel Produto) {

        String sql = "INSERT INTO produto(nome, preco, quantidade) VALUES(?,?,?)";

        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            statement.setString(1, Produto.getNome());
            statement.setFloat(2, Produto.getPreco());
            statement.setInt(3, Produto.getQuantidade());
            statement.execute();
            
            ResultSet idProduto = statement.getGeneratedKeys();
            if (idProduto.next()) {
                int id = idProduto.getInt(1);
                Produto.setId(id);
            }
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    // FUNÇÃO PARA ATUALIZARMOS O PRODUTO
    public void update(ProdutoModel Produto) {
        String sql = "UPDATE produto SET nome = ?, preco = ?, quantidade = ? WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)){
        	statement.setString(1, Produto.getNome());
            statement.setFloat(2, Produto.getPreco());
            statement.setInt(3, Produto.getQuantidade());
            statement.setInt(4, Produto.getId());
            statement.execute();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    // FUNÇÃO PARA DELETARMOS UM PRODUTO
    public void delete(ProdutoModel Produto) {

        String sql = "DELETE FROM produto WHERE id = ?";

        try(Connection conn = getConnection();
            PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, Produto.getId());
            statement.execute();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    // MONTAMOS UMA LISTA DE PRODUTOS.
    public List<ProdutoModel> getAll(){
        List<ProdutoModel> list = new ArrayList<>();
        String sql = "SELECT nome, preco, quantidade FROM produto";

        try(Connection conn = getConnection();
            PreparedStatement statement = conn.prepareStatement(sql)) {
            ResultSet resultado = statement.executeQuery();
            while(resultado.next()) {
                ProdutoModel produto = new ProdutoModel();
                produto.setNome(resultado.getString(1));
                produto.setPreco(resultado.getFloat(2));
                produto.setQuantidade(resultado.getInt(3));;
                
                list.add(produto);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
