package com.app.bank.ecea.controller;
import com.app.bank.ecea.service.BankEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import com.app.bank.ecea.entity.BankEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bank")
public class BankEntityController {
    @Autowired
    BankEntityService bankEntityService;
    @PostMapping("/create")
    public ResponseEntity<BankEntity> BankAccount(@RequestBody BankEntity ba) {
        bankEntityService.createAccount(ba);
        return new ResponseEntity<>(ba, HttpStatus.OK);
    }
}
