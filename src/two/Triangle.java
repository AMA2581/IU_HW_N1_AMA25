package two;

public class Triangle {

    private static final char star = '*';
    private static final char space = ' ';
    private static final String starWspace = "* ";
    private static final String dspace = "  ";

    public void aTri(int x) {

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(star);
            }

            System.out.println();
        }
    }

    public void bTri(int x) {

        int k = x;

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= k; j++) {

                System.out.print(star);
            }

            k--;
            System.out.println();
        }
    }

    public void cTri(int x) {

        int k = x;
        int z = 1;

        // line 1
        while (z <= x) {

            System.out.print(star);
            z++;
        }

        System.out.println();

        for (int i = 2; i < x; i++) {

            for (int j = 1; j <= k; j++) {

                if (j == 1 || j == k - 1) {
                    System.out.print(star);
                }

                else {
                    System.out.print(space);
                }

            }

            k--;
            System.out.println();
        }

        System.out.print(star);
    }

    public void dTri(int x) {
        // for space behind of triangle
        int y = x - 1;

        for (int i = 1; i <= x; i++) {

            int tempCounter = 0;

            while (tempCounter != y) {
                System.out.print(space);
                tempCounter++;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(starWspace);
            }

            y--;
            System.out.println();
        }

    }

    public void eTri(int x) {

        for (int i = x - 1; i >= 0; i--) {

            for (int j = x / 2 - i + 1; j >= 0; j--) {
                System.out.print(space);
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(starWspace);
            }

            System.out.println();
        }
    }

    public void fTri(int x) {
        
        for (int i= 0; i < x; i++) {
            
            for (int j = x / 2 - i + 2; j >= 0; j--){
                System.out.print(space);
            }
            
            for(int j = 0; j <= i - 1; j++){
               
                if (j == 0 || j == i - 1 || j == x - 1){
                    System.out.print(starWspace);
                }
                
                else {
                    System.out.print(dspace);
                }
            }
            System.out.println();
        }
        
        for (int i = 1; i <= x; i++) {
            System.out.print(starWspace);
        }
    }
}