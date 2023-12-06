public class RankedCalculator {
    public static void main(String[] args) {
        int victories = 322;
        int defeats = 279;
//calcula o saldo de vitóias
        int amountVictories = calculateAmount(victories, defeats);
        String level = calculateLevel(victories);

        System.out.println("The Hero has the number of victories "+amountVictories+" It's at the level of "+level);
    }
    public static int calculateAmount(int victories, int defeats){
        return victories - defeats;
    }
    public static String calculateLevel(int victories){
        String level;
        if(victories < 10){
            level="Iron";
        } else if(victories >=11 && victories <=20){
            level="Bronze";
        } else if(victories >=21 && victories<=50){
            level= "Silver";
        } else if(victories >=51 && victories <=80){
            level= "Gold";
        } else if(victories >=81 && victories <=90) {
            level = "Diamond";
        } else if (victories >=91 && victories <=100){
            level= "Legend";
        } else{
            level= "imortal";
        } return level;
    }

}