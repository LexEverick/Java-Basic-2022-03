package com.homework12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Bank {

    HashSet<Client> clients = new HashSet<>();
    HashSet<Account> accounts = new HashSet<>();
    public void createClientsHashSet(){
        Client clientOleg = new Client("Олег", 18);
        Client clientTimur = new Client("Тимур", 55);
        Client clientTatiana = new Client("Татьяна",24);
        Client clientDmitriy = new Client("Дмитрий", 62);
        Client clientKirill = new Client("Кирилл", 73);
        Client clientSergey = new Client("Сергей",46);
        Client clientSvetlana = new Client("Светлана", 35);
        Client clientELena = new Client("Елена", 19);
        Client clientNikita = new Client("Никита",51);
        Client clientTamara = new Client("Тамара", 80);

        clients.add(clientOleg);
        clients.add(clientTimur);
        clients.add(clientTatiana);
        clients.add(clientDmitriy);
        clients.add(clientKirill);
        clients.add(clientSergey);
        clients.add(clientSvetlana);
        clients.add(clientELena);
        clients.add(clientNikita);
        clients.add(clientTamara);


    }

    void createAccountHashSet(){

    }



    public void printAllClients() {
        System.out.println("All bank clients:");
        for (Client client: clients
             ) {
            System.out.println("Client name and age: " + client.getName() + " - " + client.getClientAge());
        }
        System.out.println();
    }

}
