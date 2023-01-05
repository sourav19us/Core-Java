import java.util.*;

public class STACK {
    Vector vec = new Vector();

    public Object push(Object o) {
        vec.add(0, o);
        return vec;
    }

    public Object pop() throws UnderFlowException {
        if (vec.size() > 0) {
            Object obj;
            obj = vec.firstElement();
            vec.remove(0);
            return obj;
        } else {
            throw new UnderFlowException("UnderFlowException STACK is Empty");
        }
    }

    public boolean empty() {
        if (vec.size() > 0) {
            return false;
        } else {
            return true;
        }
    }
}
