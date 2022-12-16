package a.b;

import a.b.c.Person;

public class ContactInfo extends Person {
    long phoneNo;

    public ContactInfo() {
        phoneNo = 0;
    }

    public ContactInfo(String str1, String str2, long d) {
        super(str1, str2);
        phoneNo = d;
    }

    public ContactInfo(ContactInfo conRef) {
        super(conRef);
        phoneNo = conRef.phoneNo;
    }

    public void show() {
        super.show();
        System.out.println("PhoneNo = " + phoneNo);
    }
}
