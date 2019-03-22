import java.util.*;
/**
学生管理系统
*/

public class StudentManagerSystem{
	
	public static void main(String[]args){
		welcome();
		
		Admin[] admins = new Admin[5]; //局部变量：作用在定义局部变量的方法内部使用
		
		initData(admins);//数据初始化
		//Admin admin = admins[0];
	
		operation(admins);
		   
	}
	public static void initData(Admin[] admins){
		
		Admin admin = new Admin("admin","admin");
		
		admins[0] = admin;
	}
	
	public static void operation(Admin[] admins){
		Scanner s = new Scanner(System.in);
		System.out.print("请选择：");
		   int operation =s.nextInt();
		   if(operation == 1){
			  //登陆
			  login(admins);
		  }else if(operation == 2){
			  //退出
			  System.exit(0);
		  }else{
			  System.out.println("输入有误，请重新输入......");
              operation(admins);		 
		 }
	}
	
	public static void login(Admin[] admins){
		
		
		System.out.println("欢迎登录");
		Scanner s = new Scanner(System.in);
		System.out.print("请输入用户名");
		String username = s.nextLine();
		
		System.out.print("请输入密码");
		String password = s.nextLine();
		
		
		
		//判断用户名密码是否正确
		for(int i=0;i<admins.length;i++){
			Admin admin = admins[i];
			if(admin ==null){
				continue;
			}
			
			if(username.equals(admin.username)&&password.equals(admin.password)){
				System.out.println("欢迎您"+username);
				
			}else{
				System.out.println("输入错误");
			}
		}
	}
	
	public static void welcome(){
		System.out.println("===========欢迎登陆学生管理系统===========");
		System.out.println("1.登陆  2.退出");
		System.out.println("---------------------------------------------");
	}
	
}
/**
管理员类
*/
class Admin{
	
	public String username;//用户名
	public String password;//密码
	
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
学生类
*/

class Student{
	
	public int id;//学号
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