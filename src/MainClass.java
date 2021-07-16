public class MainClass {

    private int class_number = 20;
    private String class_string = "Hello, world";

    public String getClassString () {
        this.class_string=class_string;
        return class_string;
    }

    public int getClassNumber () {
        this.class_number=class_number;
        return class_number;
    }

    public int getLocalNumber (int number) {
        number = 14;
        return number;
    }
}
