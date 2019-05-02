/**
 * 子供チケット料金
 */
public class ChildFee implements Fee{

    @Override
    public int getCalFee(int fee) {
        // 子供の場合はシステム利用料の割合として1.05倍かける
        return (int)(fee * 1.05);
    }
}
