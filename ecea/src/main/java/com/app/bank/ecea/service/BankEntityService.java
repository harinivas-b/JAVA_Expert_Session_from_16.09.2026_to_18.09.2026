package com.app.bank.ecea.service;

import com.app.bank.ecea.entity.BankEntity;
import com.app.bank.ecea.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankEntityService {
    @Autowired
    BankAccountRepository bankAccountRepository;

    public BankEntity createAccount(BankEntity ba) {
        return bankAccountRepository.save(ba);
    }
}
