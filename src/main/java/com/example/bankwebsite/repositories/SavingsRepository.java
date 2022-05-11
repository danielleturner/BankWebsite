package com.example.bankwebsite.repositories;


import com.example.bankwebsite.models.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsRepository extends JpaRepository<SavingsAccount, Long> {


}
