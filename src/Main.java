public class Main {
    public static void main(String[] args) {
        UserIOImpl foo = new UserIOImpl();

        foo.print("Testing print() method");
        foo.readDouble("Enter a double");
        foo.readInt("Enter a number between 1 and 50", 1, 50);
    }
}