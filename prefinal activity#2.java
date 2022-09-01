public class Stars2 {
    public static void main(String[] args) {
        drawDiamond();
    }
        public static void drawDiamond() {
        twoSpace();
        drawLine(1);
        oneSpace();
        drawLine(3);
        drawLine(5);
        oneSpace();
        drawLine(3);
        twoSpace();
        drawLine(1);
    }
    
    public static void drawLine(int height) {
        for (int k= 1; k<= height; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void oneSpace() {
    	System.out.print(" ");
    }
    public static void twoSpace(){
    	System.out.print("  ");
    }
}

K

