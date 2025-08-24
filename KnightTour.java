public class KnightTour {
    public static boolean isvalid(int[][] grid,int r, int c, int n,int expVal){
        if(r<0 || c<0 ||r>=n ||c>=n ||grid[r][c]!=expVal){
            return false;
        }
        if(expVal==n*n-1){
            return true;
        }
        boolean ans1=isvalid(grid,r-2,c+1,n,expVal+1);
        boolean ans2=isvalid(grid,r-1,c+2,n,expVal+1);
        boolean ans3=isvalid(grid,r+1,c+2,n,expVal+1);
        boolean ans4=isvalid(grid,r+2,c+1,n,expVal+1);
        boolean ans5=isvalid(grid,r+2,c-1,n,expVal+1);
        boolean ans6=isvalid(grid,r+1,c-2,n,expVal+1);
        boolean ans7=isvalid(grid,r-1,c-2,n,expVal+1);
        boolean ans8=isvalid(grid,r-2,c-1,n,expVal+1);

        return ans1 ||ans2 ||ans3 ||ans4 ||ans5 ||ans6 ||ans7 ||ans8;
    }
    public static boolean checkValidGrid(int[][] grid) {
        return isvalid(grid,0,0,grid.length,0);
    }

    public static void main(String[] args) {
        int grid[][]={{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        System.out.println(checkValidGrid(grid));
    }
}

