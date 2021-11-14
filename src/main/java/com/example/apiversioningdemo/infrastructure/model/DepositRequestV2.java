package com.example.apiversioningdemo.infrastructure.model;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Value
@Builder
public class DepositRequestV2 {
    @NotBlank
    String walletId;
    @NotNull
    BigDecimal amount;
    @Min(value = 1)
    long timestamp;
}
