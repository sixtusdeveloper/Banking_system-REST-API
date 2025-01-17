package net.sixtusdev.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;

    // public String getAccountHolderName() {
    // return accountHolderName;
    // }

    // public void setAccountHolderName(String accountHolderName) {
    // this.accountHolderName = accountHolderName;
    // }

    // public double getBalance() {
    // return balance;
    // }

    // public void setBalance(double balance) {
    // this.balance = balance;
    // }

}
