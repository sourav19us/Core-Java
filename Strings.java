public class Strings {
    public static void main(String[] args) {

        // Strings
        // String objects are stored in a special memory area known as string constant
        // pool.
        // The string can also be declared using a new operator i.e. dynamically
        // allocated.In case
        // of String are dynamically allocated they are assigned a new memory location
        // in the heap.
        // Whenever a String Object is created as a literal, the object will be created
        // in the String constant pool.
        // This allows JVM to optimize the initialization of String literal.
        // In java, objects of String are >>>>>>"immutable" <<<<<<

        String str = "sourav";
        String str1 = "saini"; // str1 and str2 have same string object, and in String pool shar a same object
        String str3 = new String("Sourav kumar Saini");
        String str4 = null;

        // Array of string
        String arr[] = new String[3];
        arr[0] = "C";
        arr[1] = "C++";
        arr[2] = "java";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        String arr1[] = { "c", "c++", "python" };
        for (String st : arr1) {
            System.out.println(st);
        }
        // String Methods
        // length() , charAt(int) , substring(int) , substring(int,int) ,
        // concat( String str), indexOf (String s) , trim(),
        // toLowerCase() ,toUpperCase() ,replace (char oldChar, char newChar)
        // endsWith(String), startsWith(String)
        // indexOf(String ) , lastIndexOf(String) // o/p index value or -1( at false)
        // indexOf(String ,int) ,lastIndexOf(String ,int)// o/p index value or -1( at
        // false)
        // compareTo(String)
        System.out.println(str.length());
        System.out.println(str3.charAt(8));// 8 is index value
        String str6 = str3.substring(6);
        System.out.println(str6);
        String str7 = str3.substring(7, 13);
        System.out.println(str7);
        System.out.println("Output Befor Trim");
        String str8 = "     Sourav     Kuamr     saini      ";
        System.out.println(str8);
        System.out.println("Output After Trim");
        String str9 = str8.trim();
        System.out.println(str9);

        String str10 = str.concat(str1);
        System.out.println(str10);

        String str11 = str.replace('a', '*');
        System.out.println(str11);
        System.out.println(str.endsWith("av"));
        System.out.println(str.startsWith("av"));

        String str12 = "abcdxyzacbd**##abcdxyabc";
        int pos;
        pos = str12.indexOf("acz");
        System.out.println(pos);
        pos = str12.indexOf("#abc");
        System.out.println(pos);
        pos = str12.indexOf("abc", 5);
        System.out.println(pos);
        pos = str12.lastIndexOf("abc");
        System.out.println(pos);
        pos = str12.lastIndexOf("abc", 20);
        System.out.println(pos);

        // == ,equals(string) ,equalsIgnoreCase(string)

        String str13 = "java";
        String str14 = "java";
        String str15 = new String("Java");
        String str16 = new String("java");
        System.out.println(str13.equals(str14));
        System.out.println(str13.equals(str15));
        System.out.println(str13.equalsIgnoreCase(str15));
        System.out.println(str13 == str14); // str13 and str14 have same object so shar same memory in string pool
        System.out.println(str13 == str16); // str16 is dynamically allocated memory

        // compareTo(String) // 0 if both string is same ,
        // if not than difference of ASCII value
        String str17 = "abcd";
        String str18 = "abcd";
        String str19 = "abed";
        System.out.println(str17.compareTo(str18));
        System.out.println(str17.compareTo(str19));// ASCII value c=67 , e= 69 o/p =67-69

        // >>>>>>>>>>>>>>>>> String object Convert to Char Array <<<<<<<<<<<<<<<<<<<<<<<
        // toCharArray()
        char arr4[];
        arr4 = str.toCharArray();
        for (char ch : arr4) {
            System.out.println(ch);
        }
        // getChars(int, int, charArray, int)
        char arr5[] = new char[10];
        str.getChars(2, 5, arr5, 3);
        for (char c : arr5) {
            System.out.println(c);
        }

        // copyValueOf(string) is method is stactic methode of class String
        // copyValueOf(string, int ,int) is method is stactic methode of class String
        char charr[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i' };
        String str20 = String.copyValueOf(charr);
        System.out.println(str20);
        String str21 = String.copyValueOf(charr, 2, 5);
        System.out.println(str21);

        // if(ch>='a'&& ch<='z');

        // >>>>> Character class <<<<<
        // all methodes are static methode
        // isWhileSpace(char), isDigit(char), isAlphabetic(char), isLowerCase(char),
        // isUpperCase(char) this all methode return boolean expr
        // toLowerCase(char) and toUpperCase(char) convert char to lower and Upper case
        char ch = 'a';
        System.out.println(Character.isAlphabetic(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.toUpperCase(ch));

    }
}
