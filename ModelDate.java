class Date
{
 private int dd,mm,yy;
public void showDate()
{
  System.out.println(+dd+"/"+mm+"/"+yy);
}
public void setDate(int a,int b,int c)
{
 dd=a;
 mm=b;
 yy=c;
 
}
}
public class ModelDate
{
 public static void main(String []a)
 {
   Date d1=new Date();
   d1.showDate();
   d1.setDate(15,4,2023);
   d1.showDate();
 }
}