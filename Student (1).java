class Student
  {
    String name;
    int id;
   int phone;
    String dept;
    public static void main(String args[])
    {
      Student st1=new Student();
      st1.name="Vanaja";
      st1.id=9865;
      st1.phone =70000;
      st1.dept="cse";
      
      Student st2=new Student();
      st2.name="Anju";
      st2.id=5533;
      st2.phone=50000;
      st2.dept="Tester";
      Student st3=new Student();
      st3.name="Vaishu";
      st3.id=5668;
      st3.phone=50000;
      st3.dept="Accountant";
    
    System.out.println(st1.name+"\n "+ st1.id+"\n "+ st1.phone+"\n "+st1.dept);
    System.out.println(st2.name+"\n "+ st2.id+"\n"+ st2.phone+"\n "+st2.dept);
    System.out.println(st3.name+"\n "+ st3.id+"\n "+ st3.phone+"\n"+st3.dept);
  }
}