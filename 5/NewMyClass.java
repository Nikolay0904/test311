
public class NewMyClass {
    
    public String func1(int year) {
        String a = null;
        
        
        if ((year > 1918) && (year != 1918) ) {
            if (((year % 4 == 0)&&(year % 100 != 0)&&(year % 400!=0))||(year % 400==0)) {
                a = "12.09." + year;
            } else {
                a = "13.09."+ year;
            }
        }else if ((year < 1918)&&(year !=1918) ) {
            if (year % 4 == 0)  {
                a = "12.09."+ year;
            } else {
                a = "13.09."+ year;
            }
        }
        
        if (year==1918)
            a = "26.09."+ year;
        
        return  a;
    }
    
}
