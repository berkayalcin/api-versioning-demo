package com.example.apiversioningdemo.application.controller;

import com.example.apiversioningdemo.infrastructure.model.DepositRequest;

public interface WalletController {
    void deposit(final String id, final DepositRequest depositRequest);
}
