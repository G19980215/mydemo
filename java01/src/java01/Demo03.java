package java01;
import java.util.Scanner;
public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����������
		Scanner input =new Scanner(System.in);
		System.out.print("������Java�ɼ�:");
		//�ӿ���̨�Ͻ����û��������������
		int java =input.nextInt();
		System.out.print("���������ݿ�ɼ�:");
		int db =input.nextInt();
		System.out.print("������html�ɼ���");
		int html=input.nextInt();
		int result=java-db;
		System.out.println("java-db="+result);
		double avg=(java+db+html)/3;
		System.out.print("ƽ���֣�"+avg);
	}

}
