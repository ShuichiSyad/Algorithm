package l10q3;
public class L10Q3 {
    public static void main(String[] args) {
        int[] array = {2,4,1,7};
        int m = 6;
        int n = array.length;
        if(modularSum(array,n,m))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
    public static boolean modularSum(int[] array,int n,int m){
        boolean subset[][] = new boolean[m+1][n+1];
        // The value of subset[i][j] will be true if there 
            // is a subset of set[0..j-1] with sum equal to i
        for(int i=0;i<=n;i++)
            subset[0][i] = true;
    
        for(int i=1;i<=m;i++)
            subset[i][0] = false;
        // Fill the subset table in botton up manner
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++){
                subset[i][j] = subset[i][j-1];
                if(i>= array[j-1])
                    subset[i][j] = subset[i][j] || subset[i-array[j-1]][j-1];
            }
// uncomment this code to print table
         for (int i = 0; i <= m; i++)
         {
           for (int j = 0; j <= n; j++)
              System.out.println ("subset["+i+"]["+j+"]="+subset[i][j]);
           System.out.print("\n");
         } 
        return subset[m][n];
    }
}
