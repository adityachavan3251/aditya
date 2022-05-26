27.  A Static memberfunctions

class Student
{
int roll;
String name;
Static String cname="vivekanand";
Student(int x,String y)
{
roll=x;
name=y;
}

void display()
{
System.out.println("roll="+roll+"name="+name+"college name="+cname);
}
}
 Static void change()
{
cname="Abc";
}
} 

class Demo1
{
public static void main(String args[])
{
Student a=new Student(111,"Aditya");
Student b=new Student(222,"kunal");
a.display();
b.display();
Student.change();
a.display();
b.display();
}
}
