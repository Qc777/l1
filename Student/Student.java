package com.Neuedu.Student;

/**

* @ClassName: Student

* @Description: 学生属性值

* @author QiChen

* @date 2019年8月10日 下午6:29:46

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
    	
    	return "Student [id：" + id + ", 姓名：" + name + ", 性别：" + sex + ", 年龄：" + age + ", 年级：" + grade + ", 地址："
				+ site + ", 电话：" + phone + ", 邮箱：" + email + "]";
	}
    
}
