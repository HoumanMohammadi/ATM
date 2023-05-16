package ATM;

import java.util.ArrayList;

public class Bank {

    //name of the bank
    private String bankName;

    //list of customers
    private ArrayList<User> users;

    //keeping track of accounts
    private ArrayList<Account> accounts;

    public String getNewUserID() {

    }

    public String getNewAccountUUID() {

    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
