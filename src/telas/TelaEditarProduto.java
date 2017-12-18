package telas;

import codigos.AcaoTela;
import dao.ProdutoDAO;
import javax.swing.JOptionPane;
import tabelas.Produto;

public class TelaEditarProduto extends TelaCadastroProdutos {
    
    Produto produto;
    ProdutoDAO produtoDAO;
    /*Abaixo está sendo criado um método do de nome TelaEditarProduto onde está sendo criado um objeto do tipo acaoTela 
    e um uma variável do tipo id;
    *Logo ápos está sendo criado uma objeto do tipo produtoDAO;
    */
    public TelaEditarProduto(AcaoTela acaoTela, int id) {
        super(acaoTela);
        
        produtoDAO = new ProdutoDAO();
        produto = produtoDAO.carregarProduto(id);
        if(produto != null) {
            tfNome.setText(produto.getNome());
            tfQuantidade.setText(produto.getQnt() + "");
            jComboItens.setSelectedIndex(produto.getCategoria());
            tfPreco.setText(produto.getPreco() + "");
            btCadastrar.setText("Atualizar");
            lbCadastrodeProdutos.setText("Editar produto");
        }
        else
            setVisible(false);
    }
    
    @Override
    /*Abaixo o usuario poderá apenas digitar números*/
    public void salvar() {                                            
        String nome = tfNome.getText();
        
        String strPreco = "";
        for(int i = 0; i < tfPreco.getText().length(); i++) {
            if(tfPreco.getText().charAt(i) == ',') 
                strPreco += '.';
            else if (tfPreco.getText().charAt(i) == '.' ||
                    tfPreco.getText().charAt(i) == '1' ||
                    tfPreco.getText().charAt(i) == '2' ||
                    tfPreco.getText().charAt(i) == '3' ||
                    tfPreco.getText().charAt(i) == '4' ||
                    tfPreco.getText().charAt(i) == '5' ||
                    tfPreco.getText().charAt(i) == '6' ||
                    tfPreco.getText().charAt(i) == '7' ||
                    tfPreco.getText().charAt(i) == '8' ||
                    tfPreco.getText().charAt(i) == '9' ||
                    tfPreco.getText().charAt(i) == '0')
                strPreco += tfPreco.getText().charAt(i);
        }
        float preco;
        if(temValorNumerico(strPreco))
            preco = Float.parseFloat(strPreco);
        else
        {
            JOptionPane.showMessageDialog(null, "Digite um preco válido");
            return;
        }

        System.out.println(preco + ":"+tfPreco.getText()+":"+strPreco);
        String strQnt = "";
        for(int j = 0; j < tfQuantidade.getText().length(); j++) {
            if(tfQuantidade.getText().charAt(j) == '1' ||
                    tfQuantidade.getText().charAt(j) == '2' ||
                    tfQuantidade.getText().charAt(j) == '3' ||
                    tfQuantidade.getText().charAt(j) == '4' ||
                    tfQuantidade.getText().charAt(j) == '5' ||
                    tfQuantidade.getText().charAt(j) == '6' ||
                    tfQuantidade.getText().charAt(j) == '7' ||
                    tfQuantidade.getText().charAt(j) == '8' ||
                    tfQuantidade.getText().charAt(j) == '9' ||
                    tfQuantidade.getText().charAt(j) == '0')
                strQnt += tfQuantidade.getText().charAt(j);
                
        }
        
        int quantidade;
        if(temValorNumerico(strQnt))
            quantidade = Integer.parseInt(strQnt);
        else {
            JOptionPane.showMessageDialog(null, "Digite uma quantidade válida");
            return;
        }
        int categoria = jComboItens.getSelectedIndex();
        if(!nome.isEmpty()){
            ProdutoDAO produtoDAO = new ProdutoDAO();
            produtoDAO.atualizarProduto(new Produto(produto.getId(), nome, 
                    quantidade, preco, categoria));
            setVisible(false);
            acaoTela.voltar();
        } 
        else {
                JOptionPane.showMessageDialog(null, "Digite informações válidas");
        }
        
    }
}
