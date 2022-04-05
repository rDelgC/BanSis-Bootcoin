package com.boot.bansis.bootcoin.services;

import com.boot.bansis.bootcoin.entities.BootcoinWallet;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
public interface BootcoinWalletService {

    public Flux<BootcoinWallet> findAll();

    public Mono<BootcoinWallet> findById(String id);

    public Mono<BootcoinWallet> save(BootcoinWallet bootcoinWallet);

    public Mono<BootcoinWallet> update(BootcoinWallet bootcoinWallet, String id);

    public Mono<Void> deleteById(String id);

}
