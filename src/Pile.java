public class Pile {
    static final int maximum = 100;

    int length = 0;
    int a[] = new int[maximum];

    public Pile() {
    }

    public void push(int elem) {
        if (length >= (maximum - 1)) {
            System.out.println("Stack maxed out");
        } else {
            a[length] = elem;
            length++;
            // System.out.println(elem + " pushed into stack");
        }
    }

    public int top() {
        if (length < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[length];
            return x;
        }
    }

    public int pop() {
        if (length < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[length - 1];
            a[length - 1] = 0;
            length--;
            System.out.println(x + " has been popped");
            return x;
        }
    }

    public int length() {
        System.out.println("lenght is " + length);
        return length;
    }

    // Sentez vous libre de modifier pour que cela fit avec votre code
    public void print() {
        System.out.print('(');
        for (int i = 0; i < length; i++) {
            System.out.print(a[i]);
            if (i + 1 == length) {
                continue;
            }
            System.out.print(",");
        }

        System.out.println(')');
    }

}
