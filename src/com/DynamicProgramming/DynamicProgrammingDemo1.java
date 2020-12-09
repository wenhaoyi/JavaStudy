package com.DynamicProgramming;
//https://blog.csdn.net/weixin_43395911/article/details/105078340?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.control&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromMachineLearnPai2-2.control
public class DynamicProgrammingDemo1 {
    public static void main(String[] args) {
        DynamicProgrammingDemo1 solution = new DynamicProgrammingDemo1();
        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(solution.minPathSum(grid));
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        //初始化
        dp[0][0]=grid[0][0];
        //初始化第一列
        for (int i = 1; i < m; i++) {
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        //初始化第一行
        for (int i = 1; i < n; i++) {
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        //推导出dp[m-1][n-1]
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
