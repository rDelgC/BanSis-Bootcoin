package com.boot.bansis.bootcoin.services.impl;

import com.boot.bansis.bootcoin.entities.BootcoinWallet;
import com.boot.bansis.bootcoin.repositories.BootcoinWalletRepository;
import com.boot.bansis.bootcoin.services.BootcoinWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
@Service
public class BootcoinWalletServiceImpl implements BootcoinWalletService {

    @Autowired
    private BootcoinWalletRepository bootcoinWalletDao;
    
    @Override
    public Flux<BootcoinWallet> findAll() {
        return bootcoinWalletDao.findAll();
    }

    @Override
    public Mono<BootcoinWallet> findById(String id) {
        return bootcoinWalletDao.findById(id);
    }

    @Override
    public Mono<BootcoinWallet> save(BootcoinWallet bootcoinWallet) {
        return bootcoinWalletDao.insert(bootcoinWallet);
    }

    @Override
    public Mono<BootcoinWallet> update(BootcoinWallet bootcoinWallet, String id) {
        return bootcoinWalletDao.findById(id)
                .map(p -> bootcoinWallet)
                .doOnNext(e -> e.setId(id))
                .doOnNext(e -> e.setCreatedAt(bootcoinWallet.getCreatedAt()))
                .flatMap(bootcoinWalletDao::save);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return bootcoinWalletDao.deleteById(id);
    }
    
}
