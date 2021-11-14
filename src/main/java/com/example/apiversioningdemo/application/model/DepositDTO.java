package com.example.apiversioningdemo.application.model;

import com.example.apiversioningdemo.domain.enums.WalletVersion;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class DepositDTO {
    private String walletId;
    private BigDecimal amount;
    private long timestamp;
    @Builder.Default
    private WalletVersion version = WalletVersion.V1;
}
