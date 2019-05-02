/**
 * 各種チケット料金に関する処理を定義するインターフェース
 */
public interface Fee {
    /**
     * 口座の残高をamount分追加します。
     *
     * @param fee 各区分のチケット料金（手数料なし）
     * @return 各区分のチケット料金に手数料割合をかけた金額
     */
    int getCalFee(int fee);
}