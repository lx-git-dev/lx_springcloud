public class jicheng {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 8, 1, 11, 8};
        int[] results = bubbleSort(arr);
        for(int item : results){
            System.out.print(item + "   ");
        }
    }

    /**
     * 冒泡排序,升序排列
     * 数组当中比较小的数值向下沉，数值比较大的向上浮！
     */
    public static int[] bubbleSort(int[] arr) {
        // 外层for循环控制循环次数
        for(int i=0;i<arr.length;i++){
            int tem = 0;
            // 内层for循环控制相邻的两个元素进行比较
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    tem = arr[j];
                    arr[j]= arr[i];
                    arr[i] = tem;
                }
            }
        }
        return arr;
    }
}
