package com.boot.bansis.bootcoin.repositories;

import com.boot.bansis.bootcoin.entities.BootcoinWallet;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Demn
 */
@Repository
public interface BootcoinWalletRepository extends ReactiveMongoRepository<BootcoinWallet, String> {

}
