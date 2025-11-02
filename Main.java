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
        System.out.println("\n busca endereço pelo cep, digite o CEP:  ");
        String cep = scanner.nextLine();


        Requisicoes searchFilm = new Requisicoes();
        String busca = searchFilm.request(cep);

        System.out.println("Retorno do APi viaCEP: ");
        System.out.println(gson.toJson(gson.fromJson(busca, Object.class)));

    }
}
