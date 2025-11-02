package desafios;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder().setPrettyPrinting().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Busca de informações postais pelo CEP (Código de Endereçamento Postal) , digite o CEP:  ")
        String cep = scanner.nextLine();


        Requisicoes searchInfo = new Requisicoes();
        String busca = searchInfo.request(cep);

        System.out.println("Retorno da APi viaCEP: ");
        System.out.println(gson.toJson(gson.fromJson(busca, Object.class)));

    }
}
