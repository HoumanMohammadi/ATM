package ATM;

import java.util.ArrayList;

public class Account {

    //name of the account, eg. saving account
    private String name;

    //the current balance of the account
    private double balance;

    //uuid of the account
    private String uuid;

    //holder of type User
    private User holder;

    //arrayList for transactions
    private ArrayList<Transaction> transactions;


    public Account(String name, double balance, String uuid, ATM.User holder, ArrayList<ATM.Transaction> transactions) {
        this.name = name;
        this.balance = balance;
        this.uuid = uuid;
        this.holder = holder;
        this.transactions = transactions;
    }
}
