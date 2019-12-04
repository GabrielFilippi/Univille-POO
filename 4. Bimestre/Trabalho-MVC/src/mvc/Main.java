 package mvc;

import mvc.control.CadastroProdutoControl;
import mvc.model.ProdutoModel;
import mvc.view.CadastroProdutoView;

public class Main {

	public static void main(String[] args) {
		ProdutoModel p = new ProdutoModel();
		
		CadastroProdutoControl control = new CadastroProdutoControl(new CadastroProdutoView(), p);
		control.exibirTela();

	}

}