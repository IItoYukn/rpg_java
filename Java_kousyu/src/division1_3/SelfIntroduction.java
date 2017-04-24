package division1_3;
import java.util.Scanner;

public class SelfIntroduction {
public static void main(String[] args){
print("自己紹介処理を開始します");
print("趣味を入力してください");
String hobby=strInput();
introduction(hobby);

}
public static void print(String str){
	System.out.println(str);
}

public static String strInput(){
	String str=null;
	str=new Scanner(System.in).nextLine();

	return str;
}
public static void introduction(String hobby){
	print("私の名前は伊藤です");
	print("私の年齢は22歳です");
	print("私の趣味は"+hobby+"です");

}
}
