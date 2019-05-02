/**
 * 大人チケット料金
 */
public class AdultFee implements Fee{

    @Override
    public int getCalFee(int fee) {
        // 大人の場合はシステム利用料の割合として1.25倍かける
        return (int)(fee * 1.25);
    }
}