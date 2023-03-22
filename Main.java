public class Main {
    public static void main(String[] args)
    {
        int sum = 0;
        Cool cool = new Cool();
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        System.out.println("原始的数组");
        cool.print(arr);
        //计算非零数据个数
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if(anInt != 0)
                    sum++;
            }
        }
        int[][] arr1 = new int[sum + 1][3];
        arr1[0][0] = 11;
        arr1[0][1] = 11;
        arr1[0][2] = sum;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0)
                {
                    count++;
                    arr1[count][0] = i;
                    arr1[count][1] = j;
                    arr1[count][2] = arr[i][j];
                    if(count == sum)
                        break;
                }
            }
            if(count == sum)
                break;
        }
        cool.print(arr1);
        int[][] arr2 = new int[arr1[0][0]][arr1[0][1]];
        for (int i = 0; i < arr1[0][2]; i++) {
            arr2[arr1[i + 1][0]][arr1[i + 1][1]] = arr1[i + 1][2];
        }
        System.out.println("还原后的数组");
        cool.print(arr2);
    }
}
class Cool
{
    public Cool() {
    }
    public void print(int[][] arr)
    {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf(anInt + "\t");
            }
            System.out.println();
        }
    }
}
