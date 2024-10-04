import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    System.out.println("  Задача1");

    int[] massiv1 = new int[3];
    massiv1[0] = 1;
    massiv1[1] = 2;
    massiv1[2] = 3;

    double[] massiv2 = {1.57, 7.654, 9.986};

    byte[] old = {20, 40, 60, 80, 100};

    System.out.println();
    System.out.println("  Задача2");

    for (int index1 = 0; index1 < massiv1.length; index1++) {

      if (index1 == massiv1.length - 1) {
        System.out.print(massiv1[index1]);
        break;
      }
      System.out.print(massiv1[index1] + ", ");
    }
      System.out.println();

    for (int index2 = 0; index2 < massiv2.length; index2++) {

      if (index2 == massiv2.length - 1) {
        System.out.print(massiv2[index2]);
        break;
      }
      System.out.print(massiv2[index2] + ", ");
    }
    System.out.println();

    for (int index3 = 0; index3 < old.length; index3++) {

      if (index3 == old.length - 1) {
        System.out.print(old[index3]);
        break;
      }
      System.out.print(old[index3] + ", ");
    }

    System.out.println();
    System.out.println("  Задача3");

    for (int index1 = massiv1.length-1; index1 >= 0 ; index1--) {

      if (index1 == 0) {
        System.out.print(massiv1[index1]);
        break;
      }
      System.out.print(massiv1[index1] + ", ");
    }
    System.out.println();

    for (int index2 = massiv2.length-1; index2 >= 0 ; index2--) {

      if (index2 == 0) {
        System.out.print(massiv2[index2]);
        break;
      }
      System.out.print(massiv2[index2] + ", ");
    }

    System.out.println();

    for (int index3 = old.length-1; index3 >= 0 ; index3--) {

      if (index3 == 0) {
        System.out.print(old[index3]);
        break;
      }
      System.out.print(old[index3] + ", ");
    }
    System.out.println();
    System.out.println("  Задача4");

    for (int i1 = 0; i1 < massiv1.length ; i1++ ) {
      if (massiv1[i1] % 2 != 0) {
        massiv1[i1] = massiv1[i1] + 1;
      }
    }
    System.out.print(Arrays.toString(massiv1));


  }
}





