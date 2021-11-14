package com.example.apiversioningdemo.application.coordinator;

import com.example.apiversioningdemo.application.converter.DepositRequestToDTOConverter;
import com.example.apiversioningdemo.application.converter.DepositRequestV2ToDTOConverter;
import com.example.apiversioningdemo.domain.service.WalletService;
import com.example.apiversioningdemo.infrastructure.model.DepositRequest;
import com.example.apiversioningdemo.infrastructure.model.DepositRequestV2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class WalletCoordinator {
    private final DepositRequestToDTOConverter depositRequestToDTOConverter;
    private final DepositRequestV2ToDTOConverter depositRequestV2ToDTOConverter;
    private final WalletService walletService;

    public void depositV1(final DepositRequest depositRequest) {
        final var depositDTO = depositRequestToDTOConverter.convert(depositRequest);
        walletService.deposit(depositDTO);
    }

    public void depositV2(final DepositRequestV2 depositRequest) {
        final var depositDTO = depositRequestV2ToDTOConverter.convert(depositRequest);
        walletService.deposit(depositDTO);
    }
}
