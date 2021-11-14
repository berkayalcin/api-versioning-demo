package com.example.apiversioningdemo.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum WalletVersion {

    V1(1),
    V2(2);


    private long version;
}
