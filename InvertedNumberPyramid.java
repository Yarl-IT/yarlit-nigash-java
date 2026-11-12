class InvertedNumberPyramid {
    public static void main(String[] args) {

		int i;
		int j;
		int k;

        for (i=5;i>=1;i--) {
            for (j=0;j<5-i;j++) {
                System.out.print("  ");
            }
            for (k=1;k<=i;k++) {
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}