class Concat
  {
    public static void main(String args[])
    {
      String str1="hello";
      String str2="everyone";
      String str3="welcome";
      String str4=str1.concat(str2);
      System.out.println(str4);
      String str5=str4.concat(str3);
      System.out.println(str5);
    }
  }