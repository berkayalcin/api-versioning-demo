package com.example.apiversioningdemo.application.controller;

import com.example.apiversioningdemo.infrastructure.model.DepositRequestV2;

public interface WalletV2Controller {
    void deposit(final String id, final DepositRequestV2 depositRequest);
}
