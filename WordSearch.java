public class WordSearch {
    static boolean[][] visited;
    static int rows, colomns;
    public static boolean exist(char[][] board, String word) {
        if(word==null || word.isEmpty())
            return false;
        rows=board.length;
        colomns=board[0].length;
        visited = new boolean[rows][colomns];
        char ch = word.charAt(0);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colomns;j++)
            {
                if(ch==board[i][j])
                {
                    visited[i][j]=true;
                    if(checkNeighbors(i,j,board,word.substring(1)))
                        return true;
                    visited[i][j]=false;
                }
            }
        }
        return false;
    }
    private static boolean checkNeighbors(int i,int j,char[][] board,String word)
    {
        System.out.println("word is: "+word);
        if(word==null || word.isEmpty())
            return true;
        char ch = word.charAt(0);
        if(i>0 && !visited[i-1][j] && board[i-1][j]==ch)
        {
            visited[i-1][j]=true;
            if(checkNeighbors(i-1,j,board,word.substring(1)))
                return true;
            visited[i-1][j]=false;
        }
        if(i<rows-1 && !visited[i+1][j] && board[i+1][j]==ch)
        {
            visited[i+1][j]=true;
            if(checkNeighbors(i+1,j,board,word.substring(1)))
                return true;
            visited[i+1][j]=false;
        }
        if(j>0 && !visited[i][j-1] && board[i][j-1]==ch)
        {
            visited[i][j-1]=true;
            if(checkNeighbors(i,j-1,board,word.substring(1)))
                return true;
            visited[i][j-1]=false;
        }
        if(j<colomns-1 && !visited[i][j+1] && board[i][j+1]==ch)
        {
            visited[i][j+1]=true;
            if(checkNeighbors(i,j+1,board,word.substring(1)))
                return true;
            visited[i][j+1]=false;
        }
        return false;
    }
    public static void main(String[] args)
    {
        char[][] board = {{'a','a'}};
        System.out.println("Does exist: "+exist(board,"aaa"));
    }
}