package br.espm.invest.wallet.common.controller;

import br.espm.invest.wallet.common.datatype.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("wallet-service")
public interface WalletController {
    @GetMapping("wallet/{id}")
    Wallet wallet(String id);
}
