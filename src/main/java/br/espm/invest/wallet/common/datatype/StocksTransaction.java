package br.espm.invest.wallet.common.datatype;

import br.espm.invest.stocks.common.datatype.Stocks;
import br.espm.invest.stocks.common.datatype.Price;

import java.util.Date;

public class StocksTransaction {
    private String id;
    private Stocks stocks;
    private Price price;
    private Date date;
    private Double amount;
    private TransactionType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Stocks getStocks() {
        return stocks;
    }

    public void setStocks(Stocks stocks) {
        this.stocks = stocks;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }



}
