package com.boot.bansis.bootcoin.controllers;

import com.boot.bansis.bootcoin.entities.BootcoinWallet;
import com.boot.bansis.bootcoin.services.BootcoinWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
@RestController
@RequestMapping("/bootcoin")
public class BootcoinRestController {

    @Autowired
    private BootcoinWalletService bootcoinWalletService;

    @GetMapping("/")
    public Flux<BootcoinWallet> findAll() {
        return bootcoinWalletService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<BootcoinWallet> findById(@PathVariable String id) {
        return bootcoinWalletService.findById(id);
    }

    @PostMapping("/save")
    public Mono<BootcoinWallet> save(@RequestBody BootcoinWallet bootcoinWallet) {
        return bootcoinWalletService.save(bootcoinWallet);
    }

    @PutMapping("/update/{id}")
    public Mono<BootcoinWallet> update(@RequestBody BootcoinWallet bootcoinWallet, @PathVariable String id) {
        return bootcoinWalletService.update(bootcoinWallet, id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteById(@PathVariable String id) {
        return bootcoinWalletService.deleteById(id);
    }

}
