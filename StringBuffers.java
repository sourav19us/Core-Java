import java.io.*;

public class StringBuffers {
    public static void main(String[] args) {

        // >>>> StringBuffer class in Java <<<<
        // StringBuffer class is used to create mutable (modifiable) string

        // Constructors of StringBuffer class

        StringBuffer s1 = null;
        StringBuffer s2 = new StringBuffer(); // by default 16 char
        StringBuffer s3 = new StringBuffer("Java"); // by 4 + 16 = 20 char
        StringBuffer s4 = new StringBuffer(1000); // by 1000 char

        System.out.println(s3);
        // StringBuffer class Method
        // append(datatype) , all datatype double , float ,int ....etc
        s3.append(" python");
        System.out.println(s3);
        s3.append(6.5);
        System.out.println(s3);

        // insert(int,datatype) , all datatype double , float ,int ....etc
        s3.insert(5, " hello ");
        System.out.println(s3);

        // deleteCharAt(int)
        s3.deleteCharAt(6);
        System.out.println(s3);

        // delete(int , int)
        s3.delete(0, 5);
        System.out.println(s3);

        // setCharAt(int, char)
        s3.setCharAt(0, 'H');
        System.out.println(s3);

        // replace(int,int,string)
        s3.replace(6, 13, "java");
        System.out.println(s3);

        // reverse()
        s2.insert(0, "sourav");
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);

        // capacity(int)
        System.out.println(s2.capacity());
        System.out.println(s2.length());

        // ensureCapacity()
        // it increases the capacity by (oldcapacity*2)+2.
        // if your current capacity is 16, it will be (16*2)+2=34.
        s2.ensureCapacity(150);
        System.out.println(s2.capacity());

    }
}
