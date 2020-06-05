public class Main {

  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println("Hello, World");
    }

    for (String arg : args) {
      System.out.println(arg);
    }

    System.out.println("=============");
    System.out.println("==== END ====");
    System.out.println("=============");
  }

}