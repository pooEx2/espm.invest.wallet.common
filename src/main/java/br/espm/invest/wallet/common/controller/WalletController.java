package br.espm.invest.wallet.common.controller;

import br.espm.invest.wallet.common.datatype.ExchangeTransaction;
import br.espm.invest.wallet.common.datatype.TransactionBean;
import br.espm.invest.wallet.common.datatype.Wallet;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("wallet-service")
public interface WalletController {

    @GetMapping("wallet")
    List<Wallet> wallets();

    @GetMapping("wallet/{id}")
    Wallet wallet(String id);

    @PostMapping("wallet")
    Wallet create(@RequestBody Wallet wallet);

    @PostMapping("wallet/{id}/exchange/buy")
    ExchangeTransaction exchangeBuy(@RequestBody TransactionBean bean);

    @PostMapping("wallet/{id}/exchange/sell")
    ExchangeTransaction exchangeSell(@RequestBody TransactionBean bean);
}
