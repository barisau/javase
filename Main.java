public class Main {

    public static void main(String[] args) {
        //work1
        int position = 1;
        if(position >= 5){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



        //work2
        int countKillTanksFirstGamer = 1;
        int countKillTanksSecondGamer = 1;
        int scoreFirstPlayer = countKillTanksFirstGamer * 100;
        int scoreSecondPlayer = countKillTanksSecondGamer * 100;
        if(scoreFirstPlayer > scoreSecondPlayer){
            System.out.println("First Player: " + scoreFirstPlayer);
            System.out.println("Second Player: " + scoreSecondPlayer);
            System.out.println("First Player: " + scoreFirstPlayer + 1000);
        }else{
            System.out.println("First Player: " + scoreFirstPlayer);
            System.out.println("Second Player: " + scoreSecondPlayer);
            System.out.println("First Player: " + scoreSecondPlayer + 1000);
        }



        //work3
        int HP = 55;
        if(HP <= 25){
            System.out.println("red");
        }else if(HP <= 50 && HP > 25){
            System.out.println("orange");
        }else if(HP <= 75 && HP > 50){
            System.out.println("YELLOW");
        }else if(HP <= 100 && HP > 25){
            System.out.println("GREEN");
        }



        //work4
        double damage = 200;
        String monster = "ZOMBIE";
        if(monster == "ZOMBIE" || monster == "UNDEAD"){
            damage *= 1.5;
        }else if(monster == "SAINT"){
            damage /= 2;
        }
        System.out.println("Damage: " + damage);



        //work5
        int NumberMoth = 1;
        switch(NumberMoth){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
            break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Авгусь");
                break;
            case 9:
                System.out.println("Сентябрь =(");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ты дурак");
        }



        //work6
        double xPlayer = 5;
        double yPlayer = 5;
        double xNPC = 10;
        double yNPC = 10;
        System.out.println(  Math.sqrt(((xPlayer - xNPC) * (xPlayer - xNPC)) + ((yPlayer - yNPC) * (yPlayer - yNPC)) ));

    }
}
