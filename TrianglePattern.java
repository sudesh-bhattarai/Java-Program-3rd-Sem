public class TrianglePattern {
    public static void main(String[] args) {
        
        // Outer loop for rows
        for(int i = 1; i <= 5; i++) {
            
            // Inner loop for printing stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Move to next line after each row
            System.out.println();
        }
    }
    
}
