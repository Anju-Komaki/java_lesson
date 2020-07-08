
public class Chapter07 {
	public static void main(String[] args) {
		//「int」のランチ金額変数（lunchMoney）を任意の値で初期化
		int lunchMoney = 550;
		//ランチ金額が800円以上の場合は、"チャーシューメンが食べられます"を出力
		if (lunchMoney >= 800) {
			System.out.println("チャーシューメンが食べられます");
		}else if (lunchMoney > 600) {
		//ランチ金額が600円より多い場合は、"ラーメンが食べられます"を出力
			System.out.println("ラーメンが食べられます");
		}else{
		//その他の場合は、"どのラーメンも食べられません"を出力
			System.out.println("どのラーメンも食べられません");
		}

		//Switch文
		int lunchMoney1 = 600;
		switch(lunchMoney1) {
		case 800:
			System.out.println("チャーシューメンが食べられます");
			break;
		case 600:
			System.out.println("ラーメンが食べられます");
			break;
		default:
			System.out.println("どのラーメンも食べられません");
		}
	}

}
