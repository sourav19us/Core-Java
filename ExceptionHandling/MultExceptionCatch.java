import java.nio.channels.FileLockInterruptionException;
import java.nio.file.FileAlreadyExistsException;

public class MultExceptionCatch {
    public static void main(String[] args) {
        int a = 1, b = 0;
        try {
            System.out.println(a / b);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
            // catch (ArithmeticException | ArrayIndexOutOfBoundsException |
            // FileAlreadyExistsException e1)
            System.out.println(e1.getMessage());
        }
    }
}
