import br.com.conversormoedas.ConsumoConversorApi;
import br.com.conversormoedas.Menu;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        double valor = 0;
        ConsumoConversorApi consumoConversorApi = new ConsumoConversorApi();
        Menu menu = new Menu();

        while(opcao != 7) {

            menu.menuPrincipal();
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    menu.mensagem();
                    valor = leitura.nextDouble();
                    consumoConversorApi.serviceApi("BRL", "ARS", valor);
                    break;
                case 2:
                    menu.mensagem();
                    valor = leitura.nextDouble();
                    consumoConversorApi.serviceApi("ARS", "BRL", valor);
                    break;
                case 3:
                    menu.mensagem();
                    valor = leitura.nextDouble();
                    consumoConversorApi.serviceApi("BRL", "USD", valor);
                    break;
                case 4:
                    menu.mensagem();
                    valor = leitura.nextDouble();
                    consumoConversorApi.serviceApi("USD", "BRL", valor);
                    break;
                case 5:
                    menu.mensagem();
                    valor = leitura.nextDouble();
                    consumoConversorApi.serviceApi("BRL", "COP", valor);
                    break;
                case 6:
                    menu.mensagem();
                    valor = leitura.nextDouble();
                    consumoConversorApi.serviceApi("COP", "BRL", valor);
                    break;
                case 7:
                    System.out.println("Saindo! Obrigado por utilizar o APP");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha a opção correta!");
                    break;
            }


        }

    }
}