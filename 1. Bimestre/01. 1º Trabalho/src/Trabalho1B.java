//importando o Scanner, Classe do JAVA onde podemos fazer a leitura dos dados digitados
import java.util.Scanner;
public class Trabalho1B {
    //Método CadastraaProduto, método onde cadastramos os valores dos produtos.
    public static double[] CadastraProduto(double valor[], String nome){
        //inicialiazamos o Scanner
        Scanner leitor = new Scanner(System.in);
        int numVenda=1;
        for (int i=0; i<valor.length; i++){
            System.out.println("Digite o valor da "+numVenda+++"º Venda de "+nome+":");
            double valorDigitado = leitor.nextDouble();
            valor[i]=valorDigitado;
            System.out.println("Deseja cadastrar mais "+nome+"? 1-Sim; 2-Não");
            int desejo = leitor.nextInt();
            if(desejo!=1){
                break;
            }
        }
        return valor;
    }
    public static void main(String[] Args){
        Scanner leitor = new Scanner(System.in);
        double valorLivros[] = new double[20];
        double valorCadernos[] = new double[20];
        double valorMaterias[] = new double[20];
        //definindo as variaveis principais e setando as mesmas com valor inicial de ZERO.
        double totalPedido = 0;
        double totalLivros=0;
        double valorDescontoLivros=0;
        double totalCadernos=0;
        double valorDescontoCadernos=0;
        int descontoLivros=0;
        int escolha=0;
        //MENU PRINCIPAL, se no while escolha==9 o while sera parado
        while(escolha!=9){
            System.out.println("========== MENU DE FUNCIONALIDADES ==========");
            System.out.println("1 - Venda de produtos por categorias");
            System.out.println("2 - Finalização do pedido");
            System.out.println("9 - Fechar Programa");
            System.out.println("Digite qual opção você deseja executar:");
            escolha = leitor.nextInt();
            //Caso a escolha seja 1, significa que o usuario deseja cadastrar as vendas.
            if(escolha==1){
                int opcao=0;
                //SUB-MENU
                while(opcao!=9){
                    System.out.println("===================== MENU DE REGISTRO =======================");
                    System.out.println("1 - Venda de livros Educacionais");
                    System.out.println("2 - Venda de Cadernos");
                    System.out.println("3 - Outros Materiais Escolares");
                    System.out.println("9 - Sair de Registro.");
                    System.out.println("Digite qual opção você deseja executar:");
                    opcao = leitor.nextInt();
                    //opção for igual a 1, será feito o cadastro de livros
                    if(opcao==1){
                        // Chamando o método CadastraProduto passando os parametros valores de livro e uma string de livros. O mesmo retorna o valores, estes agora recebidos e armazenados na variavel retorno.
                        double[] retorno = Trabalho1B.CadastraProduto(valorLivros, "Livros");
                        for(int i=0;i<retorno.length;i++){
                            valorLivros[i]=retorno[i];
                            totalPedido+=retorno[i];
                        }
                    }else if(opcao==2){
                        // Chamando o método CadastraProduto passando os parametros valores de Cadernos e uma string de livros. O mesmo retorna o valores, estes agora recebidos e armazenados na variavel retorno.
                        double[] retorno = Trabalho1B.CadastraProduto(valorLivros, "Cadernos");
                        for(int i=0;i<retorno.length;i++){
                            valorCadernos[i]=retorno[i];
                            totalPedido+=retorno[i];
                        }
                    }else if(opcao==3){
                        // Chamando o método CadastraProduto passando os parametros valores de Cadernos e uma string de livros. O mesmo retorna o valores, estes agora recebidos e armazenados na variavel retorno.
                        double[] retorno = Trabalho1B.CadastraProduto(valorLivros, "Materiais Escolares");
                        for(int i=0;i<retorno.length;i++){
                            valorMaterias[i]=retorno[i];
                            totalPedido+=retorno[i];
                        }
                    }else{
                        System.out.println("Voltando ao Menu anterior.");
                        break;
                    }
                }
            }else if(escolha==2 && totalPedido>0){
                //entra no laço de repetição e faz o somatorio dos valores dos livros
                for(int i=0; i<valorLivros.length;i++){
                    totalLivros +=valorLivros[i];
                }
                /*
                conforme o valor total dos livros e da compra é analisado qual a porcentagem
                de desconto que o cliente ganhará referente aos totais somados anteriormente
                */
                if(totalLivros>0){
                    if(totalLivros<=100){
                        System.out.println("Infelizmente para valores abaixo de R$100,00 não oferecemos desconto. :C");
                    }else if(totalLivros>100 && totalLivros<=200){
                        if(totalPedido<=600){
                            descontoLivros=5;
                        }else{
                            descontoLivros=7;
                        }
                    }else if(totalLivros>200){
                        if(totalPedido<=1000){
                            descontoLivros=9;
                        }else{
                            descontoLivros=10;
                        }
                    }
                    //Se o cliente ganho desconto, ele faz o calculo de porcentagem onde descobrimos o valor do desconto em Reais.
                    if(descontoLivros>0){
                        valorDescontoLivros = (totalLivros*descontoLivros)/100;
                        System.out.println("Parabéns você conseguiu "+descontoLivros+"% de desconto nos Seus livros escolhidos! Em reais o valor do desconto é R$"+valorDescontoLivros);
                    }
                    //FAZEMOS O DESVIO PADRÃO de Vendas de Livro.
                    //1º Descobrir quantos livros foram vendidos, pois o máximo pode ser 20 mas o minimo é 1.
                    int n = 0;//quantidade de livros vendidos.
                    for (int i = 0; i < 20; i++) {
                        if (valorLivros[i] != 0) {
                            n++;
                        }
                    }
                    //2º Passo média aritmética:
                    double mediaAritmetica = totalLivros / n;
                    //realizaremos agora um passo do desvio que é: pegar o valor do livro naquela posição especifica menos a media elevado a 2.
                    double somaDesvio = 0;
                    for (int i = 0; i < n; i++) {
                        //método Math.pow é para fazer um número(base) elevado a um expoente.
                        double base = valorLivros[i] - mediaAritmetica;
                        somaDesvio += Math.pow(base, 2);
                    }
                    double divSomaDesvio = somaDesvio / n;
                    //Utilizamos o método Math.sqrt para fazermos a raiz quadrada do valor, onde assim obtemos o valor final.
                    double desvioPadrao = Math.sqrt(divSomaDesvio);
                    System.out.println("O Desvio Padrão da compra de Livros é de " + desvioPadrao);
                }else{
                    System.out.println("Não foi vendido nenhum Livro");
                }
                /*
                Outro desconto que existe no sistema é relacionado a compras de cadernos, onde damos 1/4 se
                o valor total dos cadernos bater 2x mais o valor dos livros Educacionais
                */
                //entra no laço de repetição e faz o somatorio dos valores dos Cadernos
                for(int i=0; i<valorCadernos.length;i++){
                    totalCadernos +=valorCadernos[i];
                }
                // se o valor total dos cadernos for duas vezes o valor total dos livros geramos o desconto de 1/4 do valor dos caderno.
                if(totalCadernos>=totalLivros*2){
                    valorDescontoCadernos = totalCadernos/4;
                    System.out.println("Parabéns você conseguiu R$"+valorDescontoCadernos+" em desconto na compra de seus Cadernos");
                }
                //montamos na tela o sub-total, descontos e valor total
                System.out.println("====================================================");
                System.out.println("O Sub-Total do seu pedido é de R$"+totalPedido);
                if(valorDescontoLivros>0 || valorDescontoCadernos>0){
                    //mostra o valor total do pedido
                    if(valorDescontoLivros>0){
                        System.out.println("Os desconto em livros foram de R$"+valorDescontoLivros);
                    }
                    if(valorDescontoCadernos>0){
                        System.out.println("Os desconto em cadernos foram de R$"+valorDescontoCadernos);
                    }
                    //Agora calculamos o valor total de tudo e com os descontos.
                    totalPedido = totalPedido-valorDescontoLivros-valorDescontoCadernos;
                    System.out.println("O valor total de seu pedido é de R$"+totalPedido);
                }else{
                    System.out.println("Os desconto foram de R$0,00");
                    System.out.println("O valor total do seu pedido é de R$"+totalPedido);
                }
                //Após isso limpamos todas as variaveis para fazermos um novo pedido
                for (int i=0; i<20; i++) {
                    valorLivros[i] = 0;
                    valorCadernos[i] = 0;
                    valorMaterias[i] = 0;
                }
                totalPedido = 0;
                totalLivros=0;
                descontoLivros=0;
                valorDescontoLivros=0;
                totalCadernos=0;
                valorDescontoCadernos=0;
            }else if(totalPedido<0) {
                System.out.println("Valor total é de ZERO");
            }else{
                System.out.println("Encerrando Programa!");
                break;
            }
        }
    }
}