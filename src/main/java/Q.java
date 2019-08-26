public class Q {

        Q(char c, int i) {
            System.out.println(("Q(char, int)"));}
    }

    class Ex8 extends Q {
        private char c;
        private int i;
        Ex8() {
            super('z', 3);
            System.out.println(("Ex8()"));
        }
        Ex8(char a, int j) {
            super(a, j);
            c = a;
            i = j;
            System.out.println("Ex8(char,int)");
        }
        public static void main(String[] args) {
           // Ex8 ex1 = new Ex8();
            Ex8 ex2 = new Ex8('b', 2);
        }
    }

