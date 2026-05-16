class DiceRoll {
    public int roll(){
        return  (int) (Math.random()*6) + 1;
    }

    static void main() {
        System.out.println("welcome to roll the dice game ");
        DiceRoll obj = new DiceRoll();

        for(int i =0; i<=20; i++){
            int number = obj.roll();
            System.out.println("Dice number is: " + number);
        }

    }
}
