package three;

public class Diamond {

    private static final char space = ' ';
    private static final String starWspace = "* ";

    public void diamond(int x){

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
        
        for (int i = x - 2; i >= 0; i--) {

            for (int j = x / 2 - i + 1; j >= 0; j--) {
                System.out.print(space);
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(starWspace);
            }

            System.out.println();
        }
    }
}
