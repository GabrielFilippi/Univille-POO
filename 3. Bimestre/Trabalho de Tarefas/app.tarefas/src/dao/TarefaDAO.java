package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Tarefa;

/**
 * tarefa Data Acess Object
 */
public class TarefaDAO extends BasicoDAO{
	

	/**
	 * Inserir uma nova tarefa
	 */
	public void insert(Tarefa tarefa) {

		String sql_insert_tarefa = "INSERT INTO tarefa(Usuario_idUsuario, nomeTarefa, statusTarefa, descricaoTarefa) VALUES(?, ?, ?, ?)";
		try {
			
			// try with-resources
			
			try (Connection conn = getConnection();
				 PreparedStatement statement = conn.prepareStatement(sql_insert_tarefa)){
				
				statement.setInt(1, tarefa.getUsuario_idUsuario());
				statement.setString(2, tarefa.getNomeTarefa());
				statement.setInt(3, tarefa.getStatusTarefa());
				statement.setString(4, tarefa.getDescricaoTarefa());
				statement.execute();
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Deletar uma tarefa pelo id
	 */
	public void delete(int idTarefa) {
		
		String sql_del_tarefa = "DELETE FROM tarefa WHERE idTarefa = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql_del_tarefa)) {
			statement.setInt(1, idTarefa);
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Atualizar uma Tarefa pelo id
	 */
	public void update(Tarefa tarefa, int idUsuario) {
		String sql = "UPDATE tarefa SET nomeTarefa = ?, statusTarefa = ?, descricaoTarefa = ? WHERE idTarefa = ? AND Usuario_idUsuario = ?";
		
		try (Connection conn = getConnection();
			 PreparedStatement statement = conn.prepareStatement(sql)){
			statement.setString(1, tarefa.getNomeTarefa());
			statement.setInt(2, tarefa.getStatusTarefa());
			statement.setString(3, tarefa.getDescricaoTarefa());
			statement.setInt(4, tarefa.getIdTarefa());
			statement.setInt(5, idUsuario);
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Obter uma Tarefa pelo id
	 */
	public Tarefa getById(int idTarefa) {
		Tarefa tarefa = null;
		String sql_select_tarefa = "SELECT * FROM tarefa WHERE idTarefa = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql_select_tarefa)) {
			statement.setInt(1, idTarefa);
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next()) {
				tarefa = new Tarefa(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getString(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return tarefa;
	}
	
	/**
	 * Obter todas as Tarefas da tabela por usuario
	 */
	public List<Tarefa> getAllByIdUsuario(int idUsuario){
		List<Tarefa> list = new ArrayList<>();
		String sql_select_tarefa = "SELECT * FROM Tarefa WHERE Usuario_idUsuario = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql_select_tarefa)) {
			statement.setInt(1, idUsuario);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Tarefa tarefa = new Tarefa(resultSet.getInt(1), resultSet.getInt(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getString(5));
				list.add(tarefa);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
