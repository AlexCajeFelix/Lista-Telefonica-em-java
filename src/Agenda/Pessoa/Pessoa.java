package Agenda.Pessoa;

import java.math.BigInteger;

public class Pessoa {
    private String name;
    private BigInteger number;

    public Pessoa(String name, BigInteger number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigInteger getNumber() {
        return number;
    }
    public void setNumber(BigInteger number) {
        this.number = number;
    }

     @Override
    public String toString() {
        return "Nome: " + name + ", Telefone: " + number;
    }
}
