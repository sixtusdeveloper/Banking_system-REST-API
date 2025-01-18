package net.sixtusdev.banking.service;

import net.sixtusdev.banking.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long accountId);
}
