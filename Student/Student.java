package com.Neuedu.Student;

/**

* @ClassName: Student

* @Description: ѧ������ֵ

* @author QiChen

* @date 2019��8��10�� ����6:29:46

*/
public class Student {
	
    static String user = "admin";
    
    static String passWord = "admin";
    
    public String id;
    
    public String name;
    
    public String sex;
    
    public short age;
    
    public String grade;
    
    public String site;
    
    public String phone;
    
    public String email;
    
    @Override
	public String toString() {
    	
    	return "Student [id��" + id + ", ������" + name + ", �Ա�" + sex + ", ���䣺" + age + ", �꼶��" + grade + ", ��ַ��"
				+ site + ", �绰��" + phone + ", ���䣺" + email + "]";
	}
    
}
