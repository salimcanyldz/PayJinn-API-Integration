package com.payjinn.app.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payjinn.app.model.TransactionDetail;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {}
