class Array_string
  {
    public static void main(String args[])
    {
String str = "welcome to bitlabs";
char []charr=str.toCharArray();
for(Character o : charr)
  System.out.println(o);
      
  
String [] strArray = str.split(" ");
for(String y :strArray)
    {
  System.out.println(y);
    }
      String [] StrArray = str.split(",");
for(String y :strArray)
    {
  System.out.println(y);
    }
    }
  }