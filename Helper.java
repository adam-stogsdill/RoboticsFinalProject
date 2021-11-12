
public class Helper{

    private int[][] image;
    private int width, height;
    
    public Helper(int width, int height){
        System.out.println("CREATING HELPER OBJECT!");
        this.image = new int[height][width];
        this.width = width;
        this.height = height;
    }

    public void print(){
        System.out.println("CALLING HELPER OBJECT PRINT STATEMENT!");
        for(int i = 0; i < this.height; i++)
            for(int j = 0; j < this.width; j++)
                System.out.println(this.image[i][j]);
    }
    
    public static void main(String[] args) {

        Helper h1 = new Helper(20, 20);
    
        h1.print();
    }

}


