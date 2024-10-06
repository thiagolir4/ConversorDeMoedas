import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String conversion_rates = "";

        while (opcao != 7) {
            ApiServices apiServices = new ApiServices();
            System.out.println("*********************************************");

            System.out.println("Seja bem vindo ao conversor de moedas! \n");

            System.out.println("1) Dólar =>> Real brasileiro");
            System.out.println("2) Real brasileiro =>> Dólar");
            System.out.println("3) Euro =>> Dólar");
            System.out.println("4) Dólar =>> Euro");
            System.out.println("5) Libra esterlina =>> Real");
            System.out.println("6) Real =>> Libra esterlina");
            System.out.println("7) Sair");
            System.out.println("Digita a opção desejada: ");

            System.out.println("*********************************************\n");
            opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao ==1){
                conversion_rates = "USD";
            } else if (opcao ==2) {
                conversion_rates = "BRL";
            } else if (opcao ==3) {
                conversion_rates = "EUR";
            } else if (opcao == 4) {
                conversion_rates = "USD";
            }else if (opcao == 5) {
                conversion_rates = "GBP";
            }else if (opcao == 6) {
                conversion_rates = "BRL";
            }

                Moedas novaMoeda = apiServices.buscaMoedas(conversion_rates);
                GeradorDeArquivos gerador = new GeradorDeArquivos();
                gerador.salvaJson(novaMoeda, conversion_rates);
            }
        }
    }

