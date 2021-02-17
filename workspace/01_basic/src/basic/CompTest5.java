package basic;
/*
ch에 있는 데이터가 대문자이면 소문자로 출력하고 아니면(소문자) 대문자로 출력하시오
[실행결과]
T → t
또는
e → E
*/
public class CompTest5 {
	public static void main(String[] args) {
		//char ch ='T';
		char ch = 'E';  // 대문소 65~90 소문자 97~122
		char ch2= (char) (ch >= 65 && ch <= 90 ? ch+32 : ch-32);
		System.out.println(ch + " -> " + ch2);
	}
}
