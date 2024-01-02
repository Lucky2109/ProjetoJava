package eComercio;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import eComercio.util.Cores;




public class Menu {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

		int opcao, opcao2, opcao3, qtd=0, numero;
		String recebedor = "compra não finalizada", pagamento = "não finalizado", endereco = "não encontrado";
		float saldo, limite = 0, valor;
		double cocaLata = 0 , fantaLata = 0, guaranaLata = 0 ,cocaLitro = 0, bSalada = 0, bBacon = 0, bCalabresa = 0, bFrango = 0;

		while (true) {
			System.out.println(Cores.ANSI_CYAN_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("****************BROTHER'S BURGUER********************");
			System.out.println("                	Grill!!!                         ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("============1 - Acessar Menu e Cadastro - ===========");
			System.out.println("============2 - Acessar Carrinho - ==================");
			System.out.println("============3 - Sair - ==========");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 3) {
				System.out.println(Cores.ANSI_RED_BACKGROUND_BRIGHT + "\nBROTHER'S BURGUER!");
				System.out.println("Valor Total**********************************************R$:"+(cocaLata+fantaLata+guaranaLata+cocaLitro+bSalada+bBacon+bCalabresa+bFrango));
				System.out.println("Meto de de pagamento: " + pagamento);
				System.out.println("Nome do recebedor: " + recebedor);
				System.out.println("endereco de entrega: " + endereco);
				System.out.println("\nObrigado pela preferencia!");
				System.exit(0);
			}

			switch (opcao) {
			
				case 1:
					
					System.out.println(Cores.ANSI_CYAN_BACKGROUND);
					System.out.println("                          BEBIDAS                           ");
					System.out.println("============================================================");
					System.out.println("Coca-Cola Lata*********************************1*****R$:4,00");
					System.out.println("============================================================");
					System.out.println("Fanta lata*************************************2*****R$:4,00");
					System.out.println("============================================================");
					System.out.println("Guarana lata***********************************3*****R$:4,00");
					System.out.println("============================================================");
					System.out.println("Coca-cola 2 litros*****************************4****R$:10,00");
					System.out.println("======================2 - LANCHES - ========================");
					System.out.println("Burguer Broter Salada:*************************5****R$:25,00");
					System.out.println("============================================================");
					System.out.println("Burguer Brother Bacon**************************6****R$:25,00");
					System.out.println("============================================================");
					System.out.println("Burguer Brother Calabresa**********************7****R$:23,00");
					System.out.println("============================================================");
					System.out.println("Burguer Brother Frango*************************8****R$:24,00");
					System.out.println("                                                            ");
					System.out.println("Pagamento**************************************9************");
					
					
						System.out.println("Digite o numero do seu pedido : ");
						opcao2 = leia.nextInt();
					
				
					
					switch(opcao2){
						case 1 -> {
							System.out.println("Digite a quantidade: ");
							qtd = leia.nextInt();
							cocaLata = 4.00 * qtd;
							
						}
						case 2 -> {
							System.out.println("Digite a quantidade: ");
							qtd = leia.nextInt();
							fantaLata = 4.00 * qtd;
						}
						case 3 -> {
							System.out.println("Digite a quantidade: ");
							qtd = leia.nextInt();
							guaranaLata = 4.00 * qtd;
						}
						
						case 4 -> {
							System.out.println("Digite a quantidade: ");
							qtd = leia.nextInt();
							cocaLitro = 10.00 * qtd;
						}
						
						case 5 -> {
							System.out.println("Digite a quantidade: ");
							qtd = leia.nextInt();
							bSalada = 22.00 * qtd;
						}
						
						case 6 -> {
							System.out.println("Digite a quantidade: ");
							qtd = leia.nextInt();
							bBacon = 25.00 * qtd;
						}
						
						case 7 -> {
							System.out.println("Digite a quantidade: ");
							qtd = leia.nextInt();
							bCalabresa = 23.00 * qtd;
						}
						
						case 8 -> {
							System.out.println("Digite a quantidade: ");
							qtd = leia.nextInt();
							bFrango = 24.00 * qtd;
						}
						
						case 9 -> {
							System.out.println("Digite o endereço com numero : ");
							endereco = leia.next();
							System.out.println("Nome do Recebedor: ");
							recebedor = leia.next();
							System.out.println("Metodo de pagamento: ");
							
							System.out.println("Digite 1 para Dinheiro e 2 para Cartão ");
							opcao3 = leia.nextInt();
							if(opcao3 == 1 || opcao3 == 2) {
							switch(opcao3){
							
							case 1 -> {
								pagamento = "pagamento em dinheiro";
								
							}
							case 2 -> {
								pagamento = "pagamento no cartão";
								
							}
							
							}
							
							}
							else {
								System.out.println("Opção invalida ");
								
							}
							
							
						}
						default ->{
							System.out.println("Opção Invalida!");
							
							
						}
					
					}
					
					
					keyPress();
					break;
				case 2:
					System.out.println("Coca-Cola Lata**************************************R$: "+cocaLata);
					System.out.println("============================================================");
					System.out.println("Fanta lata******************************************R$ :"+fantaLata);
					System.out.println("============================================================");
					System.out.println("Guarana lata****************************************R$:"+guaranaLata);
					System.out.println("============================================================");
					System.out.println("Coca-cola 2 litros*********************************R$: "+cocaLitro);
					System.out.println("======================2 - LANCHES - ========================");
					System.out.println("Burguer Broter Salada:*****************************R$: "+bSalada);
					System.out.println("============================================================");
					System.out.println("Burguer Brother Bacon******************************R$: "+bBacon);
					System.out.println("============================================================");
					System.out.println("Burguer Brother Calabresa**************************R$: "+bCalabresa);
					System.out.println("===========================================================");
					System.out.println("Burguer Brother Frango*****************************R$:"+bFrango);
					System.out.println("Total**********************************************R$:"+(cocaLata+fantaLata+guaranaLata+cocaLitro+bSalada+bBacon+bCalabresa+bFrango));
					keyPress();

					break;
				
				default:
					System.out.println("\nOpção Inválida!\n");
					keyPress();
					break;
			}
		}
		
		
	}
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por:Lucas Moura da Costa ");
		System.out.println("linkedin.com/in/lucas-moura-da-costa-2a5a98237");
		System.out.println("https://github.com/Lucky2109");
		System.out.println("*********************************************************");
	   }
		// TODO Auto-generated method stub

	}


