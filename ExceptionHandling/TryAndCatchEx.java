public class TryAndCatchEx {
    public static void main(String[] args) {

        int a = 14, b = 0;
        try {
            System.out.println("try start");
            System.out.println(a / b);
            System.out.println("try end");

        } catch (ArithmeticException e) {
            System.out.println("catch start");
            System.out.println(e);
            System.out.println("catch end");

            System.out.print("e.printStackTrace() = ");
            e.printStackTrace();
            System.out.println("toString() = " + e.toString());
            System.out.println("getMessage() = " + e.getMessage());

        } catch (Exception e) { // catch all Exception
            System.out.println(e);
        }

    }
}

// Methods to print the Exception information:
// 1. printStackTrace() - This method prints exception information in the format
// of Name of the exception: description of the exception.
// 2. toString() - This method prints exception information in the format of
// Name of the exception: description of the exception.
// 3. getMessage() -This method prints only the description of the exception.