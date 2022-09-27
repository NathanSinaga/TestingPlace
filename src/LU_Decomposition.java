/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan Sinaga
 */
public class LU_Decomposition {

    static int MAX = 100;
    static String s = "";
    static void luDecomposition(int[][] mat, int n)
    {
        int[][] lower = new int[n][n];
        int[][] upper = new int[n][n];
 
        for (int i = 0; i < n; i++)
        {
            
            for (int k = i; k < n; k++)
            {
                int sum = 0;
                for (int j = 0; j < i; j++)
                    sum += (lower[i][j] * upper[j][k]);
 
                upper[i][k] = mat[i][k] - sum;
            }
 
            for (int k = i; k < n; k++)
            {
                if (i == k)
                    lower[i][i] = 1;
                else
                {
                    int sum = 0;
                    for (int j = 0; j < i; j++)
                        sum += (lower[k][j] * upper[j][i]);
 
                    lower[k][i]
                        = (mat[k][i] - sum) / upper[i][i];
                }
            }
        }
 
        System.out.println(setSpace(1) + "     L:"
                           + setSpace(30) + "U:");
 
        for (int i = 0; i < n; i++)
        {
            //L
            for (int j = 0; j < n; j++)
                System.out.print(setSpace(4) + lower[i][j]
                                 + "\t");
            System.out.print("\t");
 
            //U
            for (int j = 0; j < n; j++)
                System.out.print(setSpace(4) + upper[i][j]
                                 + "\t");
            System.out.print("\n");
        }
    }
    static String setSpace(int space)
    {
        s = "";
        for (int i = 0; i < space; i++)
            s += " ";
        return s;
    }
 
    static int[] searchForY_Ux (int upper[][], int equationResult[]){
        int[] Y = new int[equationResult.length];
        for(int n = 0; n < Y.length; n++){
            Y[n] = 1;
        }
        for(int n = equationResult.length-1; n >= 0; n--){
            int temp = 0;
            for(int m = Y.length -1; m >= 0; m--){
                temp += upper[n][m] * Y[n];
            }
            Y[n] = equationResult[n] / temp;
        }
        
        return Y;
    }
    public static void main(String arr[])
    {
        int mat[][] = { { 1, 1, 1 },
                        { 3, 1, -3 },
                        { 1, -2, -5 } };
        int res[] = {};
 
        luDecomposition(mat, 3);
    }
    
}
