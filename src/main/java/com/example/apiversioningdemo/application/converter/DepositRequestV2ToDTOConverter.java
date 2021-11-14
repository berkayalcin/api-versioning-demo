package com.example.apiversioningdemo.application.converter;

import com.example.apiversioningdemo.application.model.DepositDTO;
import com.example.apiversioningdemo.domain.enums.WalletVersion;
import com.example.apiversioningdemo.infrastructure.model.DepositRequestV2;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class DepositRequestV2ToDTOConverter implements Converter<DepositRequestV2, DepositDTO>, Function<DepositRequestV2, DepositDTO> {
    @Override
    public DepositDTO convert(final DepositRequestV2 depositRequest) {
        return apply(depositRequest);
    }

    @Override
    public DepositDTO apply(final DepositRequestV2 depositRequest) {
        return DepositDTO.builder()
                .amount(depositRequest.getAmount())
                .version(WalletVersion.V2)
                .walletId(depositRequest.getWalletId())
                .timestamp(depositRequest.getTimestamp())
                .build();
    }
}
