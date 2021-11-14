package com.example.apiversioningdemo.infrastructure.rest;

import com.example.apiversioningdemo.application.controller.WalletController;
import com.example.apiversioningdemo.application.coordinator.WalletCoordinator;
import com.example.apiversioningdemo.infrastructure.model.DepositRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/wallets")
@Slf4j
@RequiredArgsConstructor
public class RestWalletController implements WalletController {
    private final WalletCoordinator walletCoordinator;

    @PutMapping("/{id}/deposit")
    @Override
    public void deposit(@PathVariable("id") final String id, @RequestBody @Valid final DepositRequest depositRequest) {
        walletCoordinator.depositV1(depositRequest);
    }
}
