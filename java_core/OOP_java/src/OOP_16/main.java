package OOP_16;

public class main {
    public static void main(String[] args) {
        System.out.println("Test cau a: ");
        CasioFx500 casioFx500 = new CasioFx500()  ;
        VinaCal500 vinaCal500 = new VinaCal500() ;
        System.out.println("5+3="+casioFx500.cong(5,3));
        System.out.println("4*5="+vinaCal500.nhan(4,5));
        System.out.println("4/0="+vinaCal500.chia(4,0));
        System.out.println("test cau b: ");
        double[] arr = new double[] {5,1,3,4,5,8,0}  ;
        double[] arr2  = new double[] {6,2,7,9,2,4,5};
        Insert_Sort sx1 = new Insert_Sort() ;
        pick_Sort sx2 = new pick_Sort() ;
        sx1.SortUp(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print( arr[i]+ "  ");
        }
        System.out.println(" ");
        sx2.Sortdown(arr2);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i] + "  ");
        }
        softwave_computer pmmt = new softwave_computer() ;
        System.out.println("3+5="+ pmmt.cong(3,5));
        double arr3[] = new double[] {4,6,3,2,6,8,3,4,6,7,13} ;
        pmmt.Sortdown(arr3);
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+"  ");
        }
    }
}
