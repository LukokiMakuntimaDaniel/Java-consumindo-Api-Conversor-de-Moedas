package LukokiConversao.ao;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consumo {
    private final HttpClient client;

    public Consumo(HttpClient client) {
        this.client = client;
    }

    public String pegarDadosDaApi(String link){
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(link)).build();
        try {
            HttpResponse<String> response = this.client.send(request,HttpResponse.BodyHandlers.ofString());
           if(response.statusCode()==200){
               return  response.body();
           }else{
               throw new RuntimeException();
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String procurarCorrespondencia(String response){

    }
}
