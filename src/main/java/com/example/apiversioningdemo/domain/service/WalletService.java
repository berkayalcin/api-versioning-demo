package com.example.apiversioningdemo.domain.service;

import com.example.apiversioningdemo.application.model.DepositDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class WalletService {
    public void deposit(final DepositDTO depositDTO) {
        switch (depositDTO.getVersion()) {
            case V1:
                depositV1(depositDTO);
                return;
            case V2:
                depositV2(depositDTO);
                return;
            default:
                throw new IllegalArgumentException();
        }

    }

    private void depositV1(final DepositDTO depositDTO) {
        log.info("Call Service For {} And Version : {}", depositDTO, depositDTO.getVersion().getVersion());
    }

    private void depositV2(final DepositDTO depositDTO) {
        log.info("Call Service For {} And Version : {}", depositDTO, depositDTO.getVersion().getVersion());
    }
}
