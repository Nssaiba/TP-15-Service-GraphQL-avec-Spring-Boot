package com.example.banqueservice.repositories;

import com.example.banqueservice.entities.Compte;
import com.example.banqueservice.entities.TypeTransaction;
import jakarta.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByCompteId(Long compteId);

    @Query("SELECT COUNT(t) FROM Transaction t")
    Long countTransactions();

    @Query("SELECT COALESCE(SUM(t.montant), 0) FROM Transaction t WHERE t.type = 'DEPOT'")
    Double sumDepots();

    @Query("SELECT COALESCE(SUM(t.montant), 0) FROM Transaction t WHERE t.type = 'RETRAIT'")
    Double sumRetraits();
}