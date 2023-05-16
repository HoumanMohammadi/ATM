package ATM;

import java.util.Date;

public class Transaction {

    //transferred amount
    private double amount;

    //date of the transaction
    private Date timeStamp;

    //purpose of transaction
    private String memo;

    //in which account was the transaction performed
    private Account inAccount;
}
