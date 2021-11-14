package com.example.apiversioningdemo.application.converter;

import com.example.apiversioningdemo.application.model.DepositDTO;
import com.example.apiversioningdemo.domain.enums.WalletVersion;
import com.example.apiversioningdemo.infrastructure.model.DepositRequest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class DepositRequestToDTOConverter implements Converter<DepositRequest, DepositDTO>, Function<DepositRequest, DepositDTO> {
    @Override
    public DepositDTO convert(final DepositRequest depositRequest) {
        return apply(depositRequest);
    }

    @Override
    public DepositDTO apply(final DepositRequest depositRequest) {
        return DepositDTO.builder()
                .amount(depositRequest.getAmount())
                .version(WalletVersion.V1)
                .walletId(depositRequest.getWalletId())
                .build();
    }
}
