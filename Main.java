import java.util.Scanner;

class Main {
    // 単体テスト
    public static void unittest() {
        Pokemon mangus = new Pokemon();
        mangus.setCP((short) 109);
        mangus.setName("マングース");
        mangus.setfullHP((short) 144);
        mangus.sethp((short) 144);
        mangus.setWeight(44.5); //定義していない　
        mangus.setTall(1.4); //定義していない
        mangus.strengthen();
        mangus.modifyName("monguuuus");
        mangus.getDamage((double) 1000); //保留
        mangus.strengthen();
        System.out.println(mangus.getCP());
        System.out.println(mangus.getName());
        System.out.println(mangus.getfullHP());
        System.out.println(mangus.gethp());
        System.out.println(mangus.getWeight()); 
        System.out.println(mangus.getTall()); //保留
        mangus.getfullHP(); 
        mangus.setName("マングースマングースマングースマングースマングースマングースマングース");
    }
    public static void buttle() {
        Pokemon bmonstor1 = new Pokemon();
        bmonstor1.setCP((short) 1322);
        bmonstor1.setName("カイロス");
        bmonstor1.setfullHP((short) 5194);
        bmonstor1.sethp((short) 5194);
        bmonstor1.setWeight(58.13);
        bmonstor1.setTall(1.62);

        Pokemon bmonstor2 = new Pokemon();
        bmonstor2.setCP((short) 1290);
        bmonstor2.setName("ザングース");
        bmonstor2.setfullHP((short) 6111);
        bmonstor2.sethp((short) 6111);
        bmonstor2.setWeight(40.67);
        bmonstor2.setTall(1.37);
        bmonstor2.recover();
        
        buttle(bmonstor1, bmonstor2);
    }
    // メインメソッド
    public static void main(String[] args) {
        Tool ball = new BallTool();
        ball.gain();
        ball.give();
        ball.use();
        ball.vest();

        Tool recover = new Recover();
        recover.gain();
        recover.give();
        recover.use();
        recover.vest();

    }

    public static void buttle(Buttle monstor1, Buttle monstor2) {
        Scanner scan = new Scanner(System.in);
        String str = null;
        do {        
            System.out.println(monstor1.getName() + "が" + monstor2.getName() + "に攻撃した。");
            int m1Damage = monstor1.attack();
            monstor2.getDamage(m1Damage);
            System.out.println(monstor2.getName() + "に"+m1Damage+"のダメージ。");
            if(monstor2.getHP() <= 0) {
                System.out.println(monstor2.getName() + "は倒れた。");
                return;            
            }
            System.out.println(monstor2.getName() + "が" + monstor1.getName() + "に攻撃した。");
            int m2Damage = monstor2.attack();
            monstor1.getDamage(m2Damage);
            System.out.println(monstor1.getName() + "に"+m2Damage+"のダメージ。");
            if(monstor1.getHP() <= 0) {
                System.out.println(monstor1.getName() + "は倒れた。");
                return;            
            }
            str = scan.nextLine();

        } while(!str.equals("q"));
        
        scan.close();   
    }
}