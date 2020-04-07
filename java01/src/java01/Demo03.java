package java01;
import java.util.Scanner;
public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建输入对象
		Scanner input =new Scanner(System.in);
		System.out.print("请输入Java成绩:");
		//从控制台上接受用户输入的数据类型
		int java =input.nextInt();
		System.out.print("请输入数据库成绩:");
		int db =input.nextInt();
		System.out.print("请输入html成绩：");
		int html=input.nextInt();
		int result=java-db;
		System.out.println("java-db="+result);
		double avg=(java+db+html)/3;
		System.out.print("平均分："+avg);
	}

}
