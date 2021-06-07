package br.espm.invest.wallet.common.datatype;

import java.util.List;

public class Wallet {
    private String id;
    //private User user;
    private Double balance;
    private List<ExchangeTransaction> exchangeTransactions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<ExchangeTransaction> getExchangeTransactions() {
        return exchangeTransactions;
    }

    public void setExchangeTransactions(List<ExchangeTransaction> exchangeTransactions) {
        this.exchangeTransactions = exchangeTransactions;
    }
}
