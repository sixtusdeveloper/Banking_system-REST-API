package net.sixtusdev.banking.service;

import java.util.List;

import net.sixtusdev.banking.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long accountId);

    AccountDto deposit(Long accountId, double amount);

    AccountDto withdraw(Long accountId, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long accountId);
}
