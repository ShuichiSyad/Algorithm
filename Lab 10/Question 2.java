package l10q2;
public class L10Q2 {
    public static void main(String[] args) {
        int[] price = new int[] {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.println("Cut rod price : "+cutRod(price,4));
    }
    public static int cutRod(int[] price,int n){
        int val[] = new int[n+1];
        val[0] = 0;
        
        for(int i=1;i<=n;i++){
            int max_val = 0;
            for(int j=0;j<i;j++){
                max_val = Math.max(max_val, price[j] + val[i-j-1]);
                //System.out.println("Checking value and Price["+j+"]at Val["+(i-j-1)+"]... Max = "+max_val);
                val[i] = max_val;
            }
            //System.out.println(max_val+" piece");
        }
        
        return val[n];
    }
}
