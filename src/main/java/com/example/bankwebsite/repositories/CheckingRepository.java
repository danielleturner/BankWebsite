package com.example.bankwebsite.repositories;


import com.example.bankwebsite.models.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckingRepository extends JpaRepository<CheckingAccount, Long> {


}
