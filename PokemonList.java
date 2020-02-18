import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class PokemonList {
    private static void importDB(Collection<String> dd, Collection<String> id) {//この中で解決してくださいという意味
        
    }

    public static void main(String args[]){


        //importDataの内容をdatabaseDataに追加してください。ただし同じメールアドレスは登録しないこと。
        Set<String> databaseData = new HashSet<>(); 
        for (int i = 0; i < 100; i++) {
        databaseData.add((int)(Math.random()*100)+"_access@gmail.com");
        }
        Iterator<String> ite = databaseData.iterator(); //イテレーターはカーソルのようなもの
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }

        List<String> importData = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
        importData.add((int)(Math.random()*100) + "_access@gmail.com");
        System.out.println(importData.get(i));
        }

        importDB(databaseData, importData);
    


        //Arrayリストを追加する
        List<Pokemon> myPockets = new ArrayList<>(); //変数名はmyPocketsになる

        //値を追加する
        Pokemon bmonstor1 = new Pokemon();
        bmonstor1.setCP((short) 1322);
        bmonstor1.setName("カイロス");
        bmonstor1.setfullHP((short) 5194);
        bmonstor1.sethp((short) 5194);
        bmonstor1.setWeight(58.13);
        bmonstor1.setTall(1.62);
        myPockets.add(bmonstor1);

        Pokemon bmonstor2 = new Pokemon();
        bmonstor2.setCP((short) 1290);
        bmonstor2.setName("ザングース");
        bmonstor2.setfullHP((short) 6111);
        bmonstor2.sethp((short) 6111);
        bmonstor2.setWeight(40.67);
        bmonstor2.setTall(1.37);
        bmonstor2.recover();
        myPockets.add(bmonstor2);

        for(Pokemon pokemon :myPockets){
        } //型の形をしっかり覚える 名前を返すときにはgetNameで返す

        for(Pokemon pokemon :myPockets){
            System.out.println(pokemon.getCP());
        } //型の形をしっかり覚える 名前を返すときにはgetNameで返す
    }

    //Pokemon@7852e922Pokemon@4e25154f% オブジェクトの名前が直接出てくる

}
