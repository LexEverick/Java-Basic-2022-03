package com.homework12;

import java.util.ArrayList;
import java.util.Objects;

public class Client {

    private String name;
    private int clientAge;

    public Client(String name, int clientAge) {
        this.name = name;
        this.clientAge = clientAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientAge == client.clientAge && name.equals(client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clientAge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientAge() {
        return clientAge;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

}
