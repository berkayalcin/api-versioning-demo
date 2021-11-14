package com.example.apiversioningdemo.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wallet {
    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private BigDecimal amount;
    private long lastModifiedDepositTimestamp;
}
