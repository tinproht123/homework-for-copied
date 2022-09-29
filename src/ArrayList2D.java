import java.util.*;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);

        int height, width;
        System.out.print("Nhập chiều dài mảng: ");
        height = sc.nextInt();
        System.out.print("Nhập chiều rộng mảng: ");
        width = sc.nextInt();

        //nhập mảng 2 chiều
        for(int i = 0; i < height; i++){
            ArrayList<Integer> row = new ArrayList<>();

            for(int j = 0; j < width; j++){
                System.out.print("Rơ[" + i + "]" + "[" + j + "]: " );
                row.add(sc.nextInt());
            }

            resultList.add(row);
        }

        //hiển thị mảng 2 chiều
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print(resultList.get(i).get(j) + " ");
            }
            System.out.println("");
        }


    }
}
