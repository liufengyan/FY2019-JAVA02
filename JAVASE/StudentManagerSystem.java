import java.util.*;
/**
ѧ������ϵͳ
*/

public class StudentManagerSystem{
	
	public static void main(String[]args){
		welcome();
		
		Admin[] admins = new Admin[5]; //�ֲ������������ڶ���ֲ������ķ����ڲ�ʹ��
		
		initData(admins);//���ݳ�ʼ��
		//Admin admin = admins[0];
	
		operation(admins);
		   
	}
	public static void initData(Admin[] admins){
		
		Admin admin = new Admin("admin","admin");
		
		admins[0] = admin;
	}
	
	public static void operation(Admin[] admins){
		Scanner s = new Scanner(System.in);
		System.out.print("��ѡ��");
		   int operation =s.nextInt();
		   if(operation == 1){
			  //��½
			  login(admins);
		  }else if(operation == 2){
			  //�˳�
			  System.exit(0);
		  }else{
			  System.out.println("������������������......");
              operation(admins);		 
		 }
	}
	
	public static void login(Admin[] admins){
		
		
		System.out.println("��ӭ��¼");
		Scanner s = new Scanner(System.in);
		System.out.print("�������û���");
		String username = s.nextLine();
		
		System.out.print("����������");
		String password = s.nextLine();
		
		
		
		//�ж��û��������Ƿ���ȷ
		for(int i=0;i<admins.length;i++){
			Admin admin = admins[i];
			if(admin ==null){
				continue;
			}
			
			if(username.equals(admin.username)&&password.equals(admin.password)){
				System.out.println("��ӭ��"+username);
				
			}else{
				System.out.println("�������");
			}
		}
	}
	
	public static void welcome(){
		System.out.println("===========��ӭ��½ѧ������ϵͳ===========");
		System.out.println("1.��½  2.�˳�");
		System.out.println("---------------------------------------------");
	}
	
}
/**
����Ա��
*/
class Admin{
	
	public String username;//�û���
	public String password;//����
	
	public Admin(String username,String password){
		this.username = username;
		this.password = password;
	}
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}
	
}

/**
ѧ����
*/

class Student{
	
	public int id;//ѧ��
	public String name;
	public String sex;
	public int age;
	public String _class;
	public String address;
	public String phone;
	public String email;
	
	
	
	public int getid(){
		return id;
	}
	public void setid(int id){
		this.id = id;
	}
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name = name;
	}
	
	public String getsex(){
		return sex;
	}
	public void setsex(String sex){
		this.sex = sex;
	}
	
	public int getage(){
		return age;
	}
	public void setage(int age){
		this.age = age;
	}
	
	public String get_class(){
		return _class;
	}
	public void set_class(String _class){
		this._class = _class;
	}
	
	public String getaddress(){
		return address;
	}
	public void setaddress(String address){
		this.address = address;
	}
	
	public String getphone(){
		return phone;
	}
	public void setphone(String phone){
		this.phone = phone;
	}
	
	public String getemail(){
		return email;
	}
	public void setemail(String email){
		this.email = email;
	}
	

	
	
	
	
}