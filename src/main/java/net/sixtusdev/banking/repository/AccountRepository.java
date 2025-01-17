package net.sixtusdev.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sixtusdev.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
