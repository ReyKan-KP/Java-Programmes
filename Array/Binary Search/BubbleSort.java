public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            
            }
        }
        
        }
        public static void main(String[] args){
            int input[]={8,2,6,1,5};
            bubbleSort(input);
            for(int i=0;i<input.length;i++){
                System.out.print(input[i]+" ");
            }
        }
    }
