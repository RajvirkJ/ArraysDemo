
package arraysdemo;

public class Student {
    //comment added at 1:21 PM
    //comment1
    //comment2
    //comment3
    
    
    private String sID;
    private String sName;

    public Student(String sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }
    //comment added at 1:29 PM
    

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

