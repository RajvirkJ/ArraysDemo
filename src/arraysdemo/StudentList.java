
package arraysdemo;

//main method
public class StudentList {
    public static void main(String[] args) {
    Student s1 = new Student("s1", "Rajvir");
    Student [] myArray = new Student [3];
    
    myArray[0]=s1;
    myArray[1]=new Student("s2", "abc");
    myArray[2]=new Student("s3", "xyz");
    
    for (int i=0; i<myArray.length;i++) {
    System.out.println(myArray[i].getsName());
    }
    }
}
