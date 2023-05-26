
package arraysdemo;

public class Student {
    //comment added at 1:21 PM
    //comment1
    //comment2
    //comment3
    // comment added at 12:30
    //comment added for fetch and merge
    
    //instance variable
    private String sID;
    //instance variable
    private String sName;
    private String address;

    public Student(String sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }
    //comment added at 1:29 PM

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

}

