package LukokiConversao.ao;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    Scanner leitura = new Scanner(System.in);
    Consumo consumo = new Consumo();
    String response;
    TaxaCambio taxaCambio;
    PegarDaApi pegarDaApi;
    public void meuMenu(){
        boolean sair = true;
        String linkPadrao ="https://v6.exchangerate-api.com/v6/74956b9bf7e7faf82a34752d/latest/";
        Double valor;
        while (sair){
            System.out.println("1- Dolar para AOA angolano");
            System.out.println("2- AOA para Dolar ");
            System.out.println("3- Dolar para Real Brasileiro");
            System.out.println("4- Real Para Dolar");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opcao: ");
            switch (leitura.nextInt()){
                case 1:
                    System.out.println("Dolar para AOA angolano");
                    System.out.print("Digite o valor a converter: ");
                    valor = leitura.nextDouble();
                    String link = linkPadrao+"USD";
                    response = consumo.pegarDadosDaApi(link);
                    pegarDaApi = consumo.converterJsonParaClass(response);
                    taxaCambio= new TaxaCambio(pegarDaApi);
                    Double valorConveridoParaUmaUnidade = pegarValorDaConversao("AOA",taxaCambio);
                    if(valorConveridoParaUmaUnidade!=null){
                        System.out.println("O VALOR "+valor+" convertido DE Dolar para AOA angolano é "+(valor*valorConveridoParaUmaUnidade));
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 0:
                    sair= false;
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }

    }
    public Double pegarValorDaConversao(String moeda,TaxaCambio taxaCambio){
        Map<String, Double> conversionRates =taxaCambio.getConversion_rates();
        if (conversionRates.containsKey(moeda)) {
            return conversionRates.get(moeda);
        } else {
            return null;
        }
    }
}
