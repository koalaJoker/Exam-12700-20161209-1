package exam.Exam_12700_20161209_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List list=new ArrayList();
    	int count=0;
    	for(int i=101;i<200;i++){
    		for(int j=2;j<i/2;j++){
    			if(i%j==0){break;}
    			if(j==i/2-1){
    				//System.out.println(i);
    				list.add(i);
    				count++;
    			}
    		}
    				
    			}
    	System.out.print("101-200 间总共有"+ count+"个素数,分别是:");
    	for(int m=0;m<list.size();m++){
    		System.out.print(list.get(m)+",");
    	}
    		}
    	
    	
    }

