public class Pokemon implements Buttle{
    short CP;
    String name;
    short fullhp;
    short hp;
    double weight;
    double tall;

    void strengthen(){
        // double -> short
        // 1. new DoubleにMath.sqrt:doubleをいれました プリミティブ型からオブジェクト型に変換した
        // 2. Double.shortValueでdoubleからshortに変換した
        this.CP = new Double(Math.sqrt(weight*tall) * CP/5).shortValue(); //ターゲット VM 内のプリミティブな short 値へのアクセスを提供します。
        this.fullhp = new Double(Math.sqrt(weight*tall) * CP/5).shortValue();
        System.out.println(CP + "強化した");
    }

    //体力の回復 メソッドの作成
    void recover(){
        this.hp = this.fullhp;
        System.out.println(this.hp + "回復した");
    }

    //メソッドの作成
    void modifyName(String name){
        // 名前のサイズを３２文字以下であれば代入する
        // それ以外例外を出す
        // this.name = Name.getBytes().length;
        this.name = name;
    }

    public Short getCP(){
        return CP;
    }
    
    public void setCP(short CP){
        this.CP = CP;
    }

    @Override
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //シンボルはつけられない
    public Short getfullHP(){
        return fullhp;
    }

    public void setfullHP(Short fullHp){
        this.fullhp = fullHp;
    }

    public double gethp(){
        return hp;
    }

    public void sethp(short hp){
        this.hp = hp;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }

    public double getTall(){
        return tall;
    }

    public void setTall(double tall){
        this.tall = tall;
    }

    @Override
    public int attack(){
        // このモンスターが攻撃する
        // CP*乱数 0~1 を返す
        int i;
        i = (int) ((short) CP * Math.random());
        return i;
    }

    @Override
    public int getHP(){
        // 今のヒットポイントを返す
        return hp;
    }

    @Override
    //getDamage 引数は受けたダメージポイント ダメージを受ける。
    public void getDamage(double damage){
        // HPからダメージポイントを引く
        // ０以下の場合はHP０にする
        //Pokemon.java:51: エラー: 不適合な型: 精度が失われる可能性があるdoubleからshortへの変換
        // double -> short
        // 1. new DoubleにMath.sqrt:doubleを代入 プリミティブ型からオブジェクト型に変換
        // 2. Double.shortValueでdoubleからshortに変換
        hp = new Double(hp - damage).shortValue();
        System.out.println("HP" + hp);

        if(hp <= 0){
            hp = 0;
        }else{
            hp -= damage;
        }
    }
}