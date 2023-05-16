package ATM;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class User {
    //first name of the user
    private String firstName;

    //last name of the user
    private String lastName;

    //unique user ID
    private String uuid;

    //the MD5 Hash of the user pin number
    private byte[] hashPin;

    //list of account for this user
    private ArrayList<Account> accounts;

    public User(String firstName, String lastName, String pin, Bank theBank) {
        this.firstName = firstName;
        this.lastName = lastName;
        //storing the hash code of the pin rather than the oib directly for
        //security reasons
        try {
            MessageDigest messageDigest=MessageDigest.getInstance("MD5");
            this.hashPin= messageDigest.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        this.uuid=theBank.getNewUserID();

        //creat empty list of accounts
        this.accounts=new ArrayList<Account>();

        System.out.printf("new user created for", lastName, firstName, this.uuid);
    }
}
