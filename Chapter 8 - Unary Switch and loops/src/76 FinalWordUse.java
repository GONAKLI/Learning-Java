class FinalWordUse {
    final int CLASS_FAVOURITE_NUMBER;
    final String LANGUAGE ;

    FinalWordUse(int number, String language){
        this.CLASS_FAVOURITE_NUMBER = number;
        this.LANGUAGE = language;
    }
    static void main() {
        System.out.println("welcome to use of 'final' keyword ");
        FinalWordUse obj = new FinalWordUse(25, "python");

        System.out.println(obj.CLASS_FAVOURITE_NUMBER);
        System.out.println(obj.LANGUAGE);

    }
}
