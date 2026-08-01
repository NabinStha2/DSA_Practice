class Student {
    public String name;
    public int roll_no;

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}

public class practice {

    public static void main(String[] args) {

        Student[] arrStudent;
        arrStudent = new Student[3];
        arrStudent[0] = new Student("A", 1);
        arrStudent[1] = new Student("B", 2);
        arrStudent[2] = new Student("C", 3);

        for (Student s : arrStudent) {
            System.out.println(s.name + "->" + s.roll_no);
        }


        int[] arr = new int[4]; // initialization of an array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] arr1 = {10, 20, 30, 40}; // array literal
        for (int i : arr1) {
            System.out.print(i + " ");
        }


    }
}
