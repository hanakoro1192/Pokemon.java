class Tool {
    //フィールド
    String name; //道具名を指定

    //メソッド
    boolean vest(){
        System.out.print("道具を捨てる");
        return true;
    }

    boolean use(){
        System.out.print("道具を使う");
        return true;
    }

    boolean gain(){
        System.out.print("道具を拾う");
        return true;
    }

    boolean give(){
        System.out.print("道具を与える");
        return true;
    }
}

class BallTool extends Tool {
    @Override
    boolean use(){
        System.out.print("モンスターボールを投げる");
        return true;
    };
}

class Recover extends Tool{
    @Override
    boolean gain(){
        System.out.print("回復薬を使う");
    };
}