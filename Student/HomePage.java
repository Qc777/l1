package com.Neuedu.Student;

import java.util.*;
/**

* @ClassName: HomePage

* @Description: ѧ����Ϣ����ϵͳ

* @author QiChen

* @date 2019��8��10�� ����4:24:39

*/
public class HomePage {
	
	static Student[] studentAll = {};
	
    public static void main(String[] args) {
	    welcome();
}
    //��ʼҳ��
    public static void welcome() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("-------------------------�� ӭ �� ¼ ѧ �� �� Ϣ �� �� ϵ ͳ-------------------------");
    	System.out.println(" 1.��¼   2.�˳�");
    	System.out.println("-------------------------------------------------------------------------------------");
    	int A = scanner.nextInt();
    	if(A == 1) {
    		register();
    		}
    	}
    
    //��¼ҳ��
    public static void register() {
    	Scanner scanner = new Scanner(System.in);
    	Student student =  new Student();
    	System.out.println("�����������û���:");
    	String user = scanner.next();
    	System.out.println("��������������:");
    	String passWord = scanner.next();
       if(user.equals(Student.user) && passWord.equals(Student.passWord)){
        	System.out.println("--------------------��¼�ɹ�����ӭadmin--------------------");
        	page();
        }else {
        	System.out.println("��������û�����������,���������롣");
        	register();
        }
    	
}
     //��ҳ
     public static void page() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("1.�鿴ѧ����Ϣ   2.���ѧ����Ϣ   3.ɾ��ѧ����Ϣ   4.�޸�ѧ����Ϣ   5.�˳�");
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
     
     // �鿴ѧ����Ϣҳ��
     public static void examine() {
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("1.�鿴����ѧ����Ϣ");
    	 System.out.println("2.����ID��ѯѧ����Ϣ");
    	 System.out.println("3.����ID��ѯѧ������");
    	 System.out.println("4.������ҳ");
    	 System.out.println("5.ϵͳ�˳�");
    	 int C = scanner.nextInt();
    	 switch(C) {
    	 case 1:
    		 toSeeAll();
    		 System.out.println("�����������ַ�����һ��");
    		 int Ca = scanner.nextInt();
    		 examine();
    		 break;
    	 case 2:
    		 idFind();
    		 System.out.println("�����������ַ�����һ��");
    		 int Cb = scanner.nextInt();
    		 examine();
    		 break;
    	 case 3:
    		 nameFind();
    		 System.out.println("�����������ַ�����һ��");
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
     
     //�鿴����ѧ����Ϣҳ��
     private static void toSeeAll() {
 		for(int i=0;i<studentAll.length;i++) {
 			System.out.println(studentAll[i]);
 			
 		}
 		page();
 	}
     
     //����id��ѯѧ����Ϣ
     public static void idFind() {
    	Scanner scanner = new Scanner(System.in);
 		System.out.println("������Ҫ��ѯ��ѧ��id:");
 		String idf = scanner.next();
 		for(int i=0;i<studentAll.length;i++) {
 			if(studentAll[i].id.equals(idf)) {
 				System.out.println(studentAll[i]);
 				examine();
 			}
 		}
     }
     
     
     //����id��ѯѧ������
     public static void nameFind() {
    	 Scanner scanner = new Scanner(System.in);
  		System.out.println("������Ҫ��ѯ��ѧ��id:");
  		String idfa = scanner.next();
  		for(int i=0;i<studentAll.length;i++) {
  			if(studentAll[i].id.equals(idfa)) {
  				System.out.println(studentAll[i].name);
  				examine();
  			}
  		}
     }
     
     
     //���ѧ����Ϣ
     public static void add() {
    	Scanner scanner = new Scanner(System.in);
     	System.out.println("������ѧ��ID:");
     	String id = scanner.next();
    	System.out.println("������ѧ������:");
    	String name = scanner.next();
    	System.out.println("������ѧ���Ա�:");
    	String sex = scanner.next();
    	System.out.println("������ѧ������:");
    	short age = scanner.nextShort();
    	System.out.println("������ѧ�������꼶:");
    	String grade = scanner.next();
    	System.out.println("������ѧ����ַ:");
    	String site = scanner.next();
    	System.out.println("������ѧ����ϵ��ʽ:");
    	String phone = scanner.next();
    	System.out.println("������ѧ������:");
    	String email = scanner.next();
    	
    	
    	Student student1 = new Student();
    	student1.id = id;    student1.name = name;    student1.sex = sex;    student1.age = age;
        student1.grade = grade;    student1.site = site;    student1.phone = phone;    student1.email = email;
        
        studentAll  = Arrays.copyOf(studentAll,studentAll.length+1);
        studentAll[studentAll.length-1] = student1;
        
        if(studentAll != null) {
        	System.out.println("��ӳɹ�");
        	System.out.println("1.�鿴ѧ����Ϣ   2.������һ��");
        	int D = scanner.nextInt();
        	if(D == 1) {
        		examine();
        	}else if(D == 2) {
        		page();
        	}else {
        		System.out.println("�������󣬷�����һ����");
        		page();
        	}
        }/**else {
        	System.out.println("���ʧ�ܡ�������");
       }*/
        
     }
     
     //ɾ��ѧ����Ϣ
     public static void delete() {
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("������Ҫɾ����ѧ������:");
    		String name = scanner.next();
    		for(int i=0;i<studentAll.length;i++) {
    			if(studentAll[i].name.equals(name)) 
    				studentAll[i] = studentAll[studentAll.length-1];
    				studentAll = Arrays.copyOf(studentAll, studentAll.length-1);
    			}System.out.println("ɾ���ɹ�");
    			page();
    		}
     
     //�޸�ѧ����Ϣ
     public static void amend() {
    	  Scanner scanner = new Scanner(System.in);
 		  System.out.println("1.����id�޸�ѧ��ȫ����Ϣ");
 		  System.out.println("2.����id�޸�ѧ��������Ϣ");
 		  System.out.println("3.�����ϼ�Ŀ¼");
 		  System.out.println("4.ϵͳ�˳�"); 
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
     
     //����id�޸�ѧ��ȫ����Ϣ
     public static void allAmend() {
 		Scanner scanner = new Scanner(System.in);
 		System.out.println("������Ҫ�޸ĵ�ѧ��id:");
 		String allid = scanner.next();
 		for(int i=0;i<studentAll.length;i++) {
			if(studentAll[i].id.equals(allid)) {
		    	
		     	System.out.println("1.������ѧ��ID");
		     	String idAmend = scanner.next();
		    	System.out.println("������ѧ��������");
		    	String nameAmend = scanner.next();
		    	System.out.println("������ѧ�����Ա�");
		    	String sexAmend = scanner.next();
		    	System.out.println("������ѧ��������");
		    	short ageAmend = scanner.nextShort();
		    	System.out.println("������ѧ���������꼶");
		    	String gradeAmend = scanner.next();
		    	System.out.println("������ѧ���µ�ַ");
		    	String siteAmend = scanner.next();
		    	System.out.println("������ѧ������ϵ��ʽ");
		    	String phoneAmend = scanner.next();
		    	System.out.println("������ѧ��������");
		    	String emailAmend = scanner.next();
		    	studentAll[i].id = idAmend;            studentAll[i].name = nameAmend;   
		    	studentAll[i].sex = sexAmend;        studentAll[i].age = ageAmend;
		    	studentAll[i].grade = gradeAmend;    studentAll[i].site = siteAmend;   
		    	studentAll[i].phone = phoneAmend;    studentAll[i].email = emailAmend;
				}
			}
    	         System.out.println("�޸ĳɹ�");
    	         page();
     
 		}
     
     //����id�޸�ѧ��������Ϣ
     public static void portionAmend() {
 		Scanner scanner = new Scanner(System.in);
 		System.out.println("������Ҫ�޸�ѧ��id:");
 		String IDPortion = scanner.next();
 		
 		for(int i=0;i<studentAll.length;i++) {
 			
 			if(studentAll[i].id.equals(IDPortion)) {
 				
 				System.out.println("�������޸ĵ���Ϣ:");
 		 		System.out.println("1.����   2.�Ա�   3.����   4.�꼶   5.��ַ   6.�绰   7.����   8.id");
 		 		int changeChoose = scanner.nextInt();
 	 		switch(changeChoose) {
 	 		    case 1:
 	 		    	System.out.println("������ѧ����������");
 	 		    	String newName = scanner.next();
 	 		    	studentAll[i].name = newName;
 	 		    	break;
 	 		    case 2:
	 		    	System.out.println("������ѧ�������Ա�");
	 		    	String newSex = scanner.next();
	 		    	studentAll[i].sex = newSex;
	 		    	break;
 	 		    case 3:
	 		    	System.out.println("������ѧ����������");
	 		    	short newAge = scanner.nextShort();
	 		    	studentAll[i].age = newAge;
	 		    	break;
 	 		    case 4:
	 		    	System.out.println("������ѧ�������꼶");
	 		    	String newGrade = scanner.next();
	 		    	studentAll[i].grade = newGrade;
	 		    	break;
 	 		    case 5:
	 		    	System.out.println("������ѧ�����µ�ַ");
	 		    	String newSite = scanner.next();
	 		    	studentAll[i].site = newSite;
	 		    	break;
 	 		    case 6:
	 		    	System.out.println("������ѧ�����µ绰");
	 		    	String newPhone = scanner.next();
	 		    	studentAll[i].phone = newPhone;
	 		    	break;
 	 		    case 7:
	 		    	System.out.println("������ѧ����������");
	 		    	String newEmail = scanner.next();
	 		    	studentAll[i].email = newEmail;
	 		    	break;
 	 		    case 8:
	 		    	System.out.println("������ѧ������id");
	 		    	String newId = scanner.next();
	 		    	studentAll[i].id = newId;
	 		    	break;
 				
 			}
 			
 			
 			
 			
 		
 		
 		    }
 		
    }
			
}
}