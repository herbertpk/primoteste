public class Main {

    public static void main(String[] args){
        int numtest = 2;
        for(int cont = 50000;numtest < cont;numtest++){
            boolean primo = testprimo(numtest);
            if(primo){
                System.out.println(numtest);
            }
        }
    }

    public static boolean testprimo(int numtest) {
        int tests;
        for (tests = 2; tests*tests <= numtest; tests++){
            if ((numtest % tests) == 0) {
                return false;
            }
        }
        return true;
    }
}
