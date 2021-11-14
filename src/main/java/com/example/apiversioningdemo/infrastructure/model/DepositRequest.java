package com.example.apiversioningdemo.infrastructure.model;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Value
@Builder
public class DepositRequest {
    @NotNull
    String walletId;
    @NotNull
    BigDecimal amount;
}
