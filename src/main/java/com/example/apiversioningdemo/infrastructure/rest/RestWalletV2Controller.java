package com.example.apiversioningdemo.infrastructure.rest;

import com.example.apiversioningdemo.application.controller.WalletV2Controller;
import com.example.apiversioningdemo.application.coordinator.WalletCoordinator;
import com.example.apiversioningdemo.infrastructure.model.DepositRequestV2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v2/wallets")
@RequiredArgsConstructor
public class RestWalletV2Controller implements WalletV2Controller {
    private final WalletCoordinator walletCoordinator;

    @PutMapping("/{id}/deposit")
    @Override
    public void deposit(@PathVariable("id") final String id, @RequestBody @Valid final DepositRequestV2 depositRequest) {
        walletCoordinator.depositV2(depositRequest);
    }
}
