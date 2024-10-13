import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        Moeda novaMoeda = new Moeda();

        while (opcao != 8) {
            ApiServices apiServices = new ApiServices();
            System.out.println("*********************************************");

            System.out.println("Seja bem vindo ao conversor de moedas! \n");

            System.out.println("1) Dólar =>> Real brasileiro");
            System.out.println("2) Real brasileiro =>> Dólar");
            System.out.println("3) Euro =>> Dólar");
            System.out.println("4) Dólar =>> Euro");
            System.out.println("5) Libra esterlina =>> Real");
            System.out.println("6) Real =>> Libra esterlina");
            System.out.println("7) Outra moeda não listada");
            System.out.println("8) Sair");
            System.out.println("Digita a opção desejada: ");

            System.out.println("*********************************************\n");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1: {
                    novaMoeda.setMoedaBase("USD");
                    novaMoeda.setMoedaDestino("BRL");
                    break;

                }
                case 2: {
                    novaMoeda.setMoedaBase("BRL");
                    novaMoeda.setMoedaDestino("USD");
                    break;
                }
                case 3: {
                    novaMoeda.setMoedaBase("EUR");
                    novaMoeda.setMoedaDestino("USD");
                    break;
                }
                case 4: {
                    novaMoeda.setMoedaBase("USD");
                    novaMoeda.setMoedaDestino("EUR");
                    break;
                }
                case 5: {
                    novaMoeda.setMoedaBase("GBP");
                    novaMoeda.setMoedaDestino("BRL");
                    break;
                }
                case 6: {
                    novaMoeda.setMoedaBase("BRL");
                    novaMoeda.setMoedaDestino("GBP");
                    break;
                }
                case 7: {
                    Scanner selecionaMoeda = new Scanner(System.in);
                    System.out.println("Digite o código da moeda base (COM 3 LETRAS)" +
                            " respeitando a ISO 4217 ");
                    String moedaBaseTemp = selecionaMoeda.nextLine().toUpperCase();
                    novaMoeda.setMoedaBase(moedaBaseTemp);
                    System.out.println("Digite o código da moeda destino (COM 3 LETRAS)" +
                            " respeitando a ISO 4217 ");
                    String moedaDestinoTemp= selecionaMoeda.nextLine().toUpperCase();
                    novaMoeda.setMoedaDestino(moedaDestinoTemp);
                    break;
                }
                case 8: {
                    System.out.println("Saindo ....");
                    break;
                }
                default:
                    System.out.println("Opção inválida.");

            }
            if (opcao != 8) {
                Scanner valorParaConverter = new Scanner(System.in);
                Moedas novaMoedas = apiServices.buscaMoedas(novaMoeda.getMoedaBase());
                GeradorDeArquivos gerador = new GeradorDeArquivos();
                gerador.salvaJson(novaMoedas, novaMoeda.getMoedaBase());
                double taxaDeCambioBase = novaMoedas.getConversionRate(novaMoeda.getMoedaBase());
                double taxaDeCambioDestino = novaMoedas.getConversionRate(novaMoeda.getMoedaDestino());
                System.out.println("Qual valor você deseja converter? ");
                double valor = valorParaConverter.nextDouble();
                double valorConvertido = valor * taxaDeCambioDestino;
                System.out.println("Convertendo de [" + novaMoeda.getMoedaBase() + "]" + " para [" + novaMoeda.getMoedaDestino() + "]");
                System.out.println(valor + "[" + novaMoeda.getMoedaBase() + "] é igual a ==>> " + valorConvertido + "[" + novaMoeda.getMoedaDestino() + "]");
            }
        }
    }
}

