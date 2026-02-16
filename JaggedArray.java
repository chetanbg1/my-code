import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int [][] arr = new int[row][];

        for (int i=0; i< row;i++){
            System.out.println("columns in current row");
            int columnsInCurrRow = scanner.nextInt();
            System.out.println("data in current row");
            arr[i] =  new int[columnsInCurrRow];
            for (int j =0; j < columnsInCurrRow; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));

    }
}
