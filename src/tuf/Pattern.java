package tuf;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        Pattern p = new Pattern();
        p.pattern1(n);
//        p.pattern2(n);
//        p.pattern3(n);
//        p.pattern4(n);
//        p.pattern5(n);
//        p.pattern6(n);
//        p.pattern7(n);
//        p.pattern8(n);
        // Pattern 9 is the combination of 7 and 8
//        p.pattern10(n);
//        p.pattern11(n);
//        p.pattern12(n);
//        p.pattern13(n);
//        p.pattern14(n);
//        p.pattern15(n);
//        p.pattern16(n);
//        p.pattern17(n);
//        p.pattern18(n);
//        p.pattern19(n);
//        p.pattern20(n);
//        p.pattern21(n);
//        p.pattern22(n);
    }

    public void pattern22(int n) {
        for (int top = 0; top < 2 * n - 1; top++) {
            for (int left = 0; left < 2 * n - 1; left++) {
                int right = (2 * n - 2) - left;
                int bottom = (2 * n - 2) - top;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }

    public void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else if (j < n - 1 && i > 0 && i < n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i + 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern18(int n) {
        for (int i = n; i > 0; i--) {
            char c = (char) ('A' + i - 1);
            for (int j = 0; j <= n - i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    public void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char c = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(c);
                if (j <
                    breakpoint) { //Division by default takes the floor value as 3/2 = 1.5, but it takes 1 as its value
                    c++;
                } else {
                    c--;
                }
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

    public void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char c = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            char c = 'A';
            for (int j = n; j >= i; j--) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    public void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
//            char c = 'A';
//            for (int j = 1; j <= i; j++) {
//                System.out.print(c);
//                c++;
//            }
            System.out.println();
        }
    }

    public void pattern13(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("-");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= 2 * i + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public void pattern10(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < 2 * n - i - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * n; j > (2 * i) + 1; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - 1 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((2 * i) + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n - 1 - i); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
