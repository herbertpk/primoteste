public class Main {
    public static void main(String[] args){
        int numtest = 2;
        int cont = 500000; //ate qual numero ele ira testar
        while(numtest < cont){
            boolean primo = testprimo(numtest);
            if(primo){
                System.out.println(numtest);
            }
            numtest++;

        }

    }


    public static boolean testprimo(int numtest) {

        int tests = 3;

        while (tests < numtest) {
            if ((numtest % tests) == 0) {
                return false;
            } else {
                tests++;
            }

        }
        return true;
    }
}
