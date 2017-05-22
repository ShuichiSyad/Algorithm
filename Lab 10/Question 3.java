package l10q3;
public class L10Q3 {
    public static void main(String[] args) {
        int[] array = {1,6};
        int m = 5;
        int n = array.length;
        if(modularSum(array,n,m))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
    public static boolean modularSum(int[] array,int n,int m){
        boolean subset[][] = new boolean[m+1][n+1];
        
        for(int i=0;i<=n;i++)
            subset[0][i] = true;
    
        for(int i=1;i<=m;i++)
            subset[i][0] = false;
        
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++){
                subset[i][j] = subset[i][j-1];
                if(i>= array[j-1])
                    subset[i][j] = subset[i][j] || subset[i-array[j-1]][j-1];
            }
        return subset[m][n];
    }
}
