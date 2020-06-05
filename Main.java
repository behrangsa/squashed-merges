public class Main {

  public static void main(String[] args) {
    System.out.println("================");
    System.out.println("==== Banner ====");
    System.out.println("================");

    for (int i = 0; i < 3; i++) {
      System.out.println("Hello, World");
    }

    for (String arg : args) {
      System.out.println(arg);
    }
  }

}