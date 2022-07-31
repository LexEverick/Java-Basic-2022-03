package com.homework12;

public class Account {

    Client client;
    int goldOnAccount;

    public Account(Client client, int goldOnAccount) {
        this.client = client;
        this.goldOnAccount = goldOnAccount;
    }

    public int getGoldOnAccount() {
        return goldOnAccount;
    }

    public Client getClient() {
        return client;
    }
}
