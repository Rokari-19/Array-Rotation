public class Rotate {

    public static void rotateLeft(int[] arr, int d) {
        if (d == 0 || d == arr.length) {
        return;
        }
    
        d = d % arr.length;
        
        for (int i = 0; i < d; i++) {
        int temp = arr[0];
        for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 3; 
    
        System.out.println("Original array: ");
        for (int i : arr) {
        System.out.print(i + " ");
        }
    
        rotateLeft(arr, d);
    
        System.out.println("\nArray after left rotation: ");
        for (int i : arr) {
        System.out.print(i + " ");
        }
    }
      
}
