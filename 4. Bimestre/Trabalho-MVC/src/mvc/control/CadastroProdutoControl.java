package mvc.control;

import mvc.model.ProdutoModel;
import mvc.view.CadastroProdutoView;

public class CadastroProdutoControl {
	
	private CadastroProdutoView view;
	private ProdutoModel model;
	
	public CadastroProdutoControl(CadastroProdutoView view, ProdutoModel model) {
		this.view = view;
		this.model = model;
		model.attach(view);
		view.setModel(model);
		view.setControl(this);
	}
	
	public void exibirTela() {
		view.show();
		model.notifyObservers();
	}
	//deletar
	public void deletar() {
		model.deletar();
		view.setMensagemStatusBar("Produto Excluido");
		view.getBotaoDeletar().setEnabled(false);
	} 
	
	//salvar
	public void salvar() {
		model.setNome(view.getNome());
		model.setPreco(view.getPreco());
		model.setQuantidade(view.getQuantidade());

		try {
			model.salvar();
			view.setMensagemStatusBar("Produto cadastrado com sucesso!");
			view.getBotaoDeletar().setEnabled(true);
		}catch(Exception e) {
			e.printStackTrace();
			view.setMensagemStatusBar("Erro ao Cadastrar: "+e.getMessage());
		}
	}

}
