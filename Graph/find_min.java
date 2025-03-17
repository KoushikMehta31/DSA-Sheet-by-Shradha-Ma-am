public class find_min
{
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int min = Integer.MAX_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
