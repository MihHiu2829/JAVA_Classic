package OOP_16;

public class Insert_Sort implements Sort{
    @Override
    public void SortUp(double[] arr) {
        int i  ,j  ;
        double key  ;
        int n = arr.length ;
        for( i=1;i<n;i++){
            key = arr[i] ;
            j = i - 1 ;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j] ;
                j-- ;
            }
            arr[j+1] = key ;
        }
    }
    @Override
    public void Sortdown(double[] arr) {
           int i , j ;
           double key  ;
           int n = arr.length ;
           for(i = 1; i<n;i++){
               key = arr[i]  ;
               j = i - 1;
               while(j>=0 && arr[j] < key) {
                    arr[j+1] = arr[j--];
               }
               arr[++j] = key  ;
           }
    }
}
