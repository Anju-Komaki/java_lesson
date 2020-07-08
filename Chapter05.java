
public class Chapter05 {
	public static void main(String[] args) {
		//プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
		long long1 = 9222222000004445555L;
		double double1 =3.14;
		boolean boolean1 = true;
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);

		//ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
		Float fl = 1.1234f;
		Integer inte = 5;
		Character  chara = 'あ';
		System.out.println(fl);
		System.out.println(inte);
		System.out.println(chara);

		//要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
		int[] array = {1,2,3,4,5};
		System.out.println(array[3]);
	}

}
