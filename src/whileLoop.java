public class whileLoop {
    public static void main(String[] args) {

        boolean expression = true;
        int counter = 0;
        while (expression) {
            int integerInsideWhile = 10;
            counter++;


            if (counter == 5) {
                expression = false;
            }
        }

        System.out.println("we are done with the loop and counter is : " + counter);
    }

}
