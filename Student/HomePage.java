package com.Neuedu.Student;

import java.util.*;
/**

* @ClassName: HomePage

* @Description: 学生信息管理系统

* @author QiChen

* @date 2019年8月10日 下午4:24:39

*/
public class HomePage {
	
	static Student[] studentAll = {};
	
    public static void main(String[] args) {
	    welcome();
}
    //开始页面
    public static void welcome() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("-------------------------欢 迎 登 录 学 生 信 息 管 理 系 统-------------------------");
    	System.out.println(" 1.登录   2.退出");
    	System.out.println("-------------------------------------------------------------------------------------");
    	int A = scanner.nextInt();
    	if(A == 1) {
    		register();
    		}
    	}
    
    //登录页面
    public static void register() {
    	Scanner scanner = new Scanner(System.in);
    	Student student =  new Student();
    	System.out.println("请输入您的用户名:");
    	String user = scanner.next();
    	System.out.println("请输入您的密码:");
    	String passWord = scanner.next();
       if(user.equals(Student.user) && passWord.equals(Student.passWord)){
        	System.out.println("--------------------登录成功，欢迎admin--------------------");
        	page();
        }else {
        	System.out.println("您输入的用户名密码有误,请重新输入。");
        	register();
        }
    	
}
     //主页
     public static void page() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("1.查看学生信息   2.添加学生信息   3.删除学生信息   4.修改学生信息   5.退出");
    	int B = scanner.nextInt();
    	switch(B) {
    	case 1 :
    		examine();
    		break;
    	case 2:
    		add();
    		break;
    	case 3:
    		delete();	
    		break;
    	case 4:
    		amend();
    		break;
    	case 5:
    		System.exit(0);
    		break;
    	}
    }
     
     // 查看学生信息页面
     public static void examine() {
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("1.查看所有学生信息");
    	 System.out.println("2.根据ID查询学生信息");
    	 System.out.println("3.根据ID查询学生姓名");
    	 System.out.println("4.返回主页");
    	 System.out.println("5.系统退出");
    	 int C = scanner.nextInt();
    	 switch(C) {
    	 case 1:
    		 toSeeAll();
    		 System.out.println("输入任意数字返回上一级");
    		 int Ca = scanner.nextInt();
    		 examine();
    		 break;
    	 case 2:
    		 idFind();
    		 System.out.println("输入任意数字返回上一级");
    		 int Cb = scanner.nextInt();
    		 examine();
    		 break;
    	 case 3:
    		 nameFind();
    		 System.out.println("输入任意数字返回上一级");
    		 int Cc = scanner.nextInt();
    		 examine();
    		 break;
    	 case 4:
    		 page();
    		 break;
    	 case 5:
    		 System.exit(0);
    		 break;
    	 
    	 }
}
     
     //查看所有学生信息页面
     private static void toSeeAll() {
 		for(int i=0;i<studentAll.length;i++) {
 			System.out.println(studentAll[i]);
 			
 		}
 		page();
 	}
     
     //根据id查询学生信息
     public static void idFind() {
    	Scanner scanner = new Scanner(System.in);
 		System.out.println("请输入要查询的学生id:");
 		String idf = scanner.next();
 		for(int i=0;i<studentAll.length;i++) {
 			if(studentAll[i].id.equals(idf)) {
 				System.out.println(studentAll[i]);
 				examine();
 			}
 		}
     }
     
     
     //根据id查询学生姓名
     public static void nameFind() {
    	 Scanner scanner = new Scanner(System.in);
  		System.out.println("请输入要查询的学生id:");
  		String idfa = scanner.next();
  		for(int i=0;i<studentAll.length;i++) {
  			if(studentAll[i].id.equals(idfa)) {
  				System.out.println(studentAll[i].name);
  				examine();
  			}
  		}
     }
     
     
     //添加学生信息
     public static void add() {
    	Scanner scanner = new Scanner(System.in);
     	System.out.println("请输入学生ID:");
     	String id = scanner.next();
    	System.out.println("请输入学生姓名:");
    	String name = scanner.next();
    	System.out.println("请输入学生性别:");
    	String sex = scanner.next();
    	System.out.println("请输入学生年龄:");
    	short age = scanner.nextShort();
    	System.out.println("请输入学生所属年级:");
    	String grade = scanner.next();
    	System.out.println("请输入学生地址:");
    	String site = scanner.next();
    	System.out.println("请输入学生联系方式:");
    	String phone = scanner.next();
    	System.out.println("请输入学生邮箱:");
    	String email = scanner.next();
    	
    	
    	Student student1 = new Student();
    	student1.id = id;    student1.name = name;    student1.sex = sex;    student1.age = age;
        student1.grade = grade;    student1.site = site;    student1.phone = phone;    student1.email = email;
        
        studentAll  = Arrays.copyOf(studentAll,studentAll.length+1);
        studentAll[studentAll.length-1] = student1;
        
        if(studentAll != null) {
        	System.out.println("添加成功");
        	System.out.println("1.查看学生信息   2.返回上一级");
        	int D = scanner.nextInt();
        	if(D == 1) {
        		examine();
        	}else if(D == 2) {
        		page();
        	}else {
        		System.out.println("输入有误，返回上一级。");
        		page();
        	}
        }/**else {
        	System.out.println("添加失败。请重试");
       }*/
        
     }
     
     //删除学生信息
     public static void delete() {
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("请输入要删除的学生姓名:");
    		String name = scanner.next();
    		for(int i=0;i<studentAll.length;i++) {
    			if(studentAll[i].name.equals(name)) 
    				studentAll[i] = studentAll[studentAll.length-1];
    				studentAll = Arrays.copyOf(studentAll, studentAll.length-1);
    			}System.out.println("删除成功");
    			page();
    		}
     
     //修改学生信息
     public static void amend() {
    	  Scanner scanner = new Scanner(System.in);
 		  System.out.println("1.根据id修改学生全部信息");
 		  System.out.println("2.根据id修改学生部分信息");
 		  System.out.println("3.返回上级目录");
 		  System.out.println("4.系统退出"); 
 		  int am = scanner.nextInt();
 		  switch(am) {
 		  case 1:
 			 allAmend();
 			  break;
 		 case 2:
 			 portionAmend();
			  break;
 		 case 3:
 			page();
			  break;
 		 case 4:
    		 System.exit(0);
			  break;
 		  
 		  }
     }
     
     //根据id修改学生全部信息
     public static void allAmend() {
 		Scanner scanner = new Scanner(System.in);
 		System.out.println("请输入要修改的学生id:");
 		String allid = scanner.next();
 		for(int i=0;i<studentAll.length;i++) {
			if(studentAll[i].id.equals(allid)) {
		    	
		     	System.out.println("1.请输入学生ID");
		     	String idAmend = scanner.next();
		    	System.out.println("请输入学生新姓名");
		    	String nameAmend = scanner.next();
		    	System.out.println("请输入学生新性别");
		    	String sexAmend = scanner.next();
		    	System.out.println("请输入学生新年龄");
		    	short ageAmend = scanner.nextShort();
		    	System.out.println("请输入学生新所属年级");
		    	String gradeAmend = scanner.next();
		    	System.out.println("请输入学生新地址");
		    	String siteAmend = scanner.next();
		    	System.out.println("请输入学生新联系方式");
		    	String phoneAmend = scanner.next();
		    	System.out.println("请输入学生新邮箱");
		    	String emailAmend = scanner.next();
		    	studentAll[i].id = idAmend;            studentAll[i].name = nameAmend;   
		    	studentAll[i].sex = sexAmend;        studentAll[i].age = ageAmend;
		    	studentAll[i].grade = gradeAmend;    studentAll[i].site = siteAmend;   
		    	studentAll[i].phone = phoneAmend;    studentAll[i].email = emailAmend;
				}
			}
    	         System.out.println("修改成功");
    	         page();
     
 		}
     
     //根据id修改学生部分信息
     public static void portionAmend() {
 		Scanner scanner = new Scanner(System.in);
 		System.out.println("请输入要修改学生id:");
 		String IDPortion = scanner.next();
 		
 		for(int i=0;i<studentAll.length;i++) {
 			
 			if(studentAll[i].id.equals(IDPortion)) {
 				
 				System.out.println("请输入修改的信息:");
 		 		System.out.println("1.姓名   2.性别   3.年龄   4.年级   5.地址   6.电话   7.邮箱   8.id");
 		 		int changeChoose = scanner.nextInt();
 	 		switch(changeChoose) {
 	 		    case 1:
 	 		    	System.out.println("请输入学生的新名字");
 	 		    	String newName = scanner.next();
 	 		    	studentAll[i].name = newName;
 	 		    	break;
 	 		    case 2:
	 		    	System.out.println("请输入学生的新性别");
	 		    	String newSex = scanner.next();
	 		    	studentAll[i].sex = newSex;
	 		    	break;
 	 		    case 3:
	 		    	System.out.println("请输入学生的新年龄");
	 		    	short newAge = scanner.nextShort();
	 		    	studentAll[i].age = newAge;
	 		    	break;
 	 		    case 4:
	 		    	System.out.println("请输入学生的新年级");
	 		    	String newGrade = scanner.next();
	 		    	studentAll[i].grade = newGrade;
	 		    	break;
 	 		    case 5:
	 		    	System.out.println("请输入学生的新地址");
	 		    	String newSite = scanner.next();
	 		    	studentAll[i].site = newSite;
	 		    	break;
 	 		    case 6:
	 		    	System.out.println("请输入学生的新电话");
	 		    	String newPhone = scanner.next();
	 		    	studentAll[i].phone = newPhone;
	 		    	break;
 	 		    case 7:
	 		    	System.out.println("请输入学生的新邮箱");
	 		    	String newEmail = scanner.next();
	 		    	studentAll[i].email = newEmail;
	 		    	break;
 	 		    case 8:
	 		    	System.out.println("请输入学生的新id");
	 		    	String newId = scanner.next();
	 		    	studentAll[i].id = newId;
	 		    	break;
 				
 			}
 			
 			
 			
 			
 		
 		
 		    }
 		
    }
			
}
}