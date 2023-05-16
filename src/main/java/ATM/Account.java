package ATM;

import java.util.ArrayList;

public class Account {

    //name of the account, eg. saving account
    private String name;

    //uuid of the account
    private String uuid;

    //holder of type User
    private User holder;

    //arrayList for transactions
    private ArrayList<Transaction> transactions;


    public Account(String name, User holder, Bank theBank) {
        this.name = name;
        this.holder = holder;

        //get new uuid for the account
        this.uuid= theBank.getNewAccountUUID();

        //initialize transactions
        this.transactions= new ArrayList<Transaction>();

        //add to holder and bank lists
        holder.addAccount(this);
        theBank.addAccount(this);

    }
}
