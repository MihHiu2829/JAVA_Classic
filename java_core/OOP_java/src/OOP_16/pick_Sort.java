package OOP_16;

public class pick_Sort implements Sort{
    @Override
    public void SortUp(double[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                  if(arr[j] < arr[i] )
                  {
                      double tmp  =arr[i] ;
                      arr[i]  = arr[j] ;
                      arr[j] = tmp ;
                  }
            }
        }
    }

    @Override
    public void Sortdown(double[] arr) {
              int n  =  arr.length ;
              for(int i=0;i<n-1;i++){
                  for(int j=i+1;j<n;j++){
                       if(arr[j] > arr[i])
                       {
                           double tmp = arr[i] ;
                           arr[i]  = arr[j] ;
                           arr[j] = tmp ;
                       }
                  }
              }
    }
}
