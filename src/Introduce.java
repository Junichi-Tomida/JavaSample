
public class Introduce {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human[] human = new Human[4];
		human[0] = new Junichi("Junichi", 25, "東京都", "本人");
		human[1] = new Father("Hiroshi", 60, "東京都", "父");
		human[2] = new Mother("Misae", 55, "東京都", "母");
		human[3] = new Sister("Himawari", 22, "東京都", "妹");

		for (int index = 0; index < human.length; index++) {
			System.out.println("私の名前は" + human[index].getName() + "です。");
			System.out.println("現在" + human[index].getAge() + "歳です。");
			System.out.println("現在" + human[index].getAdress() + "在住です。");
			System.out.println(human[0].getName() + "の" + human[index].getFamily() + "です。");
			human[index].action();
			System.out.println("-----------------------------------------------");
		}
	}
}
