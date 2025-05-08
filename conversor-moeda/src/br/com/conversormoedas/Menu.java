package br.com.conversormoedas;

public class Menu {
    public void menuPrincipal () {
        System.out.println("""
                    -------------------------------------------------
                    1) Real Brasil [BRL] >>> Peso Argentina [ARS]
                    2) Peso Argentina [ARS] >>> Real Brasil [BRL]
                    3) Real Brasil [BRL] >>> Dólar Americano [USD]
                    4) Dólar Americano [USD] >>> Real Brasil [BRL]
                    5) Real Brasil [BRL] >>> Peso Colombia [COP]
                    6) Peso Colombia [COP] >>> Real Brasil [BRL]
                    7) Sair
                    -------------------------------------------------
                    """);
        System.out.println("Escolha uma opção: ");
    }

    public void mensagem() {
        System.out.println("Digite o valor da moeda para conversão: ");
    }


}
