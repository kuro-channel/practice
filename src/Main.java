public class Main {

    public static void main(String[] args) {

        /** AdultFeeクラスとChildFeeクラスを同じFee型として扱える（ポリモーフィズム）*/
        /** 異なるクラスのオブジェクトを同じ型（インターフェイス）として扱える。便利！*/

        // 大人料金 500円設定のチケットの値段
        Fee AdultFee = new AdultFee();
        System.out.println(AdultFee.getCalFee(500)); // 625

        // 大人料金 200円設定のチケットの値段
        Fee ChildFee = new ChildFee();
        System.out.println(ChildFee.getCalFee(200)); // 210
    }
}
