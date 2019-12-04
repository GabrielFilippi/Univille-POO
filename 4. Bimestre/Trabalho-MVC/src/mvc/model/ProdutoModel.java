package mvc.model;


import java.util.ArrayList;
import java.util.List;

import jdbc.ProdutoDAO;
import mvc.util.Observer;
import mvc.util.Subject;

//clase do produto
public class ProdutoModel implements  Subject{
	
	private int id;
	private String nome;
	private float preco;
	private int quantidade;
	
	private List<Observer> list;
	
	public ProdutoModel() {
		list = new ArrayList<Observer>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public List<Observer> getList() {
		return list;
	}

	public void setList(List<Observer> list) {
		this.list = list;
	}

	public void novoRegistro() {
		id = 0;
		nome = null;
		preco = 0;
		quantidade = 0;
	}

	@Override
	public void attach(Observer o) {
		list.add(o);
	}

	@Override
	public void detach(Observer o) {
		list.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : list) {
			o.update(this, this);
		}
	}
	
	public void salvar() throws Exception {
		if(nome == null || nome.isEmpty()) {
			throw new Exception("Insira o nome!");
		}
		if(preco == 0 || preco<0) {
			throw new Exception("Insira o preço!");
		}
		if(quantidade <0) {
			throw new Exception("Insira a quantidade");
		}
		
		if(id == 0) {
			ProdutoDAO Produtodao = new ProdutoDAO();	
			Produtodao.insert(this);
		}else {
			ProdutoDAO Produtodao = new ProdutoDAO();
			Produtodao.update(this);
		}
		notifyObservers();
	}
	
	public void deletar() {
		ProdutoDAO Produtodao = new ProdutoDAO();	
		Produtodao.delete(this);
		
		novoRegistro();
		notifyObservers();
	}
}