/*Pokemonクラス
フィールド
CP
name
fullHp
hp
weight
tall
メソッド
strengthen 引数なし モンスターを強化するメソッド
    →CPをweightとtallの積の平方根倍する
    →Hpをweightとtallの積の平方根倍する
modifyName 引数あり モンスターの名前を変更するメソッド
　　ただし最大入力文字数は３２文字までとして例外を発生させる。
getDamage 引数は受けたダメージポイント ダメージを受ける。
各フィールドのgetter/setterメソッド
　　ただしfullHp、weight、tallの範囲は、0から999。HPは0からfullHpの値まで。*/

public class Pokemon implements Buttle {
    short CP;
    String name;
    short fullHp;
    short hp;
    double weight;
    double tall;

    void strengthen(){
        //Pokemon.java:28: エラー: 不適合な型: 精度が失われる可能性があるdoubleからshortへの変換
        // double -> short
        // 1. new DoubleにMath.sqrt:doubleをいれました プリミティブ型からオブジェクト型に変換した
        // 2. Double.shortValueでdoubleからshortに変換した
        this.CP = new Double(Math.sqrt(weight*tall)*CP/5).shortValue();
        this.fullHp = new Double(Math.sqrt(weight*tall)*fullHp/5).shortValue();
        System.out.println(CP+ "強化した");
    }

    //体力を回復
    void recover(){
        this.hp = this.fullHp;
        System.out.println(this.hp + "回復した");
    }

    void modifyName(String Name){
        // 名前のサイズを３２文字以下であれば代入する
        // それ以外例外を出す
        // this.name = Name.getBytes().length;
        this.name = Name;
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

    //シンボルを見つけられません
    public Short getfullHP(){
        return fullHp;
    }

    public void setfullHP(Short fullHp){
//ただしfullHp、weight、tallの範囲は、0から999。HPは0からfullHpの値まで。 （編集済み）ifを使う.1000以下なら〜で、それ以外であれば例外を指定する.
        this.fullHp = fullHp;
    }

    public double gethp(){
        return hp;
    }

    public void sethp(short hp){
        this.hp = hp;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setTall(double tall){
        this.tall = tall;
    }

    public double getTall(){
        return tall;
    }

    @Override
    public int attack() {
        // このモンスターが攻撃する
        // CP*乱数 0~1 を返す
        int i;
        i = (int) ((short) CP * Math.random());
        return i;
    }

    @Override
    public int getHP() {
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
        System.out.println("HP:"+hp);

        if(hp <= 0){
            hp = 0;
        }else{
            hp -= damage;
        }
    }
}