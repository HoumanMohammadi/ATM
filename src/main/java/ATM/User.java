package ATM;

import java.security.MessageDigest;
import java.util.ArrayList;

public class User {
    //first name of the user
    private String firstName;

    //last name of the user
    private String lastName;

    //unique user ID
    private String uuid;

    //the MD5 Hash of the user pin number
    private byte hashPin;

    //list of account for this user
    private ArrayList<Account> accounts;

    public User(String firstName, String lastName, String pin, Bank theBank) {
        this.firstName = firstName;
        this.lastName = lastName;
        //storing the hash code of the pin rather than the oib directly for
        //security reasons
        MessageDigest messageDigest=MessageDigest.getInstance("MD5");
    }
}
