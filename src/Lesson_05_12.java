public class Lesson_05_12 {
    public static void main(String[] args) {
       /*
       task-1
       int arr[] = {1, 5, 33, 42, 55, 13};
        for (int i = 0; i < arr.length; i++) {
            if (issimple(arr[i])) {
                System.out.println(arr[i]);
            }
        }*/
       /* task-2
        int count=0;
        int arr[]={1,2,5,49,7,21,12,14};
        for (int item:arr){
            if (item %7 ==0) {
                count++;
            }
        }
        System.out.println(count);
        */
       /* task-3
        int arr[]={1,2,5,49,7,21,12,14};
        int minCut = arr[0];
        int maxTek = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] < minCut) {
                minCut = arr[i];
            }
            if (arr[i] % 2 != 0 && arr[i] > maxTek) {
                maxTek = arr[i];
            }
        }
        System.out.println(minCut);
        System.out.println(maxTek);
        */
        /*
        task-4
        int arr[]={1,3,5,8};
        for (int i = 1; i < arr.length; i+=2) {
            arr[i]=0;
        }
        for (int item:arr){
            System.out.println(item);
        }*/
 /* task-5
        int[] arr = {1,2,3,1,4,5,2};


        int[] uniqueArr = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        for(int item:uniqueArr){
            System.out.println(item);
        }

  */

      /* task-6 int[] arr = {1,2,3,4,5};
        for (int i = 0; i <arr.length ; i++) {
            if (i !=arr.length-1) {
                if (arr[i]+1!= arr[i+1]) {
                    System.out.println("negative case");
                    break;
                }
            }
            else{
                System.out.println("positive case");
            }
        }*/
/*        task-7
        int[] arr = {1, 2, 3,4,5,4,3,2,1};
        System.out.println(isPalindrom(arr));*/

     /* task-8   int arr[] = {1, 2,6, 4};
        int arr2[] = {1, 2,5, 4};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                System.out.println("negative case");
            }
        }*/

    }
   /* task 1
   public static boolean issimple(int sayi) {
        if (sayi < 2) return false;
        int counter = 0;
        for (int j = 1; j <= sayi; j++) {
            if (sayi % j == 0) {
                counter++;
            }
        }
        return counter == 2;
    }*/
/* task-7   public static boolean isPalindrom(int[] arr) {
       for (int i = 0; i < arr.length / 2; i++) {
           if (arr[i] != arr[arr.length - 1 - i]) {
               return false;
           }
       }
       return true;
   }*/
}
