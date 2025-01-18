package net.sixtusdev.banking.service.impl;

import org.springframework.stereotype.Service;

import net.sixtusdev.banking.dto.AccountDto;
import net.sixtusdev.banking.entity.Account;
import net.sixtusdev.banking.mapper.AccountMapper;
import net.sixtusdev.banking.repository.AccountRepository;
import net.sixtusdev.banking.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long accountId) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Account not found"));
        return AccountMapper.mapToAccountDto(account);
    }

}
