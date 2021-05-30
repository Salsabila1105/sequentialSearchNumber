public class Main {
  public static void main (String[] args) {
    int[] Number = {5, 11, 21, 17, 4, 18};
    boolean found = false;
    int key = 11;

    for (int i = 0; i< Number.length; i++) {
      if (key == Number[i]) {
        System.out.println("Data pada nomor : " + (i+1));
        found = true;
        break;
      }
    }
    if (found == false) {
      System.out.println("Data Not Found");
    }
  }
}