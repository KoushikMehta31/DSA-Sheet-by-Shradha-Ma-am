public class find_max
{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
