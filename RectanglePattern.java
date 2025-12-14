public class RectanglePattern {
    public static void main(String[] args) {
        
        int n = 5;  // size of the square
        
        for(int i = 1; i <= n; i++) {
            
            for(int j = 1; j <= n; j++) {
                
                // Print * for first row, last row, first column, last column
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Move to next line
            System.out.println();
        }
    }
}
