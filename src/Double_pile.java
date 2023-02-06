public class Double_pile {
    static final int maximum = 100;
    int lenght1 = 0;
    int lenght2 = 0;
    boolean one = true;
    int a[][] = new int[2][maximum];

    public Double_pile() {
    }

    public boolean full() {
        if (lenght1 + lenght2 == maximum) {
            return true;
        }
        return false;
    }

    public boolean push(boolean one, int elem) {
        if (full() == true) {
            System.out.println("Stack maxed out");
        } else if (one == true) {
            a[0][lenght1] = elem;
            lenght1++;

        } else {
            a[1][lenght2] = elem;
            lenght2++;
        }
        return true;
    }

    public int top(boolean one) {
        if (one == true) {
            if (lenght1 < 0) {
                System.out.println("no top");
                return 0;
            } else {
                int x = a[0][lenght1];
                return x;
            }
        } else {
            if (lenght2 < 0) {
                System.out.println("no top");
                return 0;
            } else {
                int x = a[1][lenght2];
                return x;
            }
        }
    }

    public int pop(boolean one) {
        if (one == true) {
            if (lenght1 < 0) {
                System.out.println("nothing to pop");
                return 0;
            } else {
                int x = a[0][lenght1 - 1];
                a[0][lenght1 - 1] = 0;
                lenght1--;
                System.out.println(x + " has been popped");
                return x;
            }
        } else {
            if (lenght2 < 0) {
                System.out.println("nothing to pop");
                return 0;
            } else {
                int x = a[1][lenght2 - 1];
                a[1][lenght2 - 1] = 0;
                lenght2--;
                System.out.println(x + " has been popped");
                return x;
            }
        }

    }

    public int length(boolean one) {
        if (one == true) {
            System.out.println("lenght is " + lenght1);
            return lenght1;
        } else {
            System.out.println("lenght is " + lenght2);
            return lenght2;

        }
    }

    public void print() {
        System.out.print("pile one : (");
        for (int i = 0; i < lenght1; i++) {
            System.out.print(a[0][i]);
            if (i + 1 == lenght1) {
                continue;
            }
            System.out.print(",");
        }
        System.out.println(')');

        System.out.print("pile two : (");
        for (int i = 0; i < lenght2; i++) {
            System.out.print(a[1][i]);
            if (i + 1 == lenght2) {
                continue;
            }
            System.out.print(",");
        }
        System.out.println(')');

    }
}
