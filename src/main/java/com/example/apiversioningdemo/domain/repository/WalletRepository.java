package com.example.apiversioningdemo.domain.repository;

import com.example.apiversioningdemo.domain.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, String> {
}
