package duke;

import edu.duke.FileResource;

public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.runHello();
    }

    public void runHello() {
        FileResource res = new FileResource("./duke/hello_unicode.txt");
        for (String line : res.lines()) {
            System.out.println(line);
        }
    }
}

