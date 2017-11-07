/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

import com.itextpdf.text.DocumentException;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author gopan r g
 */
public class passingclass {

     String[] args;
  
    passingclass(ArrayOfClasses a,String date) throws FileNotFoundException
    {
        System.out.println("SeatAllotment.passingclass.<init>()");
        //int length= a.length;
        int i=0;
        Class b;
        new File("C:\\Users\\rggop\\Documents\\NetBeansProjects\\ExamSeatAllotment_JERIN_JACOB\\results\\classes-"+date).mkdir();
        new File("C:\\Users\\rggop\\Documents\\NetBeansProjects\\ExamSeatAllotment_JERIN_JACOB\\results\\Meta-classes-"+date).mkdir();

        while(a.empty()!=0)
        {
            
         b=a.pop();
         int c=b.column;
            System.out.println(c);
            int w;
         switch(c)
         {
            case 3:  colom_3 d1;
                       d1 = new colom_3(b,date);  
                           d1.Col();
                       MetaFinder m1;
                       m1 = new MetaFinder(b);
                       m1.assign();
                       for(int i2=0;i2<StaticMetaClass.n;i2++){
                           
                            w=StaticSubMetaClass.meta[i2].i;
                          if(StaticSubMetaClass.meta[i2].start[w]!=1000000)
                           StaticSubMetaClass.meta[i2].i++;
                          w=StaticSubMetaClass.meta[i2].i;
                           StaticSubMetaClass.meta[i2].start[w]=1000000;
                           StaticSubMetaClass.meta[i2].end[w]=0;
                           
                       }
                       break;
               case 4:  colom_4 d2;
                       d2 = new colom_4(b,date);  
                      
                       try {
                           d2.main(args);
                           } catch (DocumentException ex) {
                                 System.out.println(ex.getMessage());
                               }
                        MetaFinder m2;
                       m2 = new MetaFinder(b);
                       m2.assign();
                      for(int i2=0;i2<StaticMetaClass.n;i2++){
                            w=StaticSubMetaClass.meta[i2].i;
                          if(StaticSubMetaClass.meta[i2].start[w]!=1000000)
                           StaticSubMetaClass.meta[i2].i++;
                          w=StaticSubMetaClass.meta[i2].i;
                           StaticSubMetaClass.meta[i2].start[w]=1000000;
                           StaticSubMetaClass.meta[i2].end[w]=0;
                       }                       break;
                case 5:  colom_5 d3;
                       d3 = new colom_5(b,date);  
                        
                       try {
                           d3.main(args);
                           } catch (DocumentException ex) {
                                 System.out.println(ex.getMessage());
                               }
                        MetaFinder m3;
                       m3 = new MetaFinder(b);
                       m3.assign();
                       for(int i2=0;i2<StaticMetaClass.n;i2++){
                            w=StaticSubMetaClass.meta[i2].i;
                          if(StaticSubMetaClass.meta[i2].start[w]!=1000000)
                           StaticSubMetaClass.meta[i2].i++;
                          w=StaticSubMetaClass.meta[i2].i;
                           StaticSubMetaClass.meta[i2].start[w]=1000000;
                           StaticSubMetaClass.meta[i2].end[w]=0;
                       }
                       break;
                case 6:  colom_6 d4;
                       d4 = new colom_6(b,date);  
                      
                       try {
                           d4.main(args);
                           } catch (DocumentException ex) {
                                 System.out.println(ex.getMessage());
                               }
                        MetaFinder m4;
                        
                       m4 = new MetaFinder(b);
                       m4.assign();
                       for(int i2=0;i2<StaticMetaClass.n;i2++){
                            w=StaticSubMetaClass.meta[i2].i;
                          if(StaticSubMetaClass.meta[i2].start[w]!=1000000)
                           StaticSubMetaClass.meta[i2].i++;
                          w=StaticSubMetaClass.meta[i2].i;
                           StaticSubMetaClass.meta[i2].start[w]=1000000;
                           StaticSubMetaClass.meta[i2].end[w]=0;
                       }
                       break;
                case 7:  colom_7 d5;
                       d5 = new colom_7(b,date);  
                      
                       try {
                           d5.main(args);
                           } catch (DocumentException ex) {
                                 System.out.println(ex.getMessage());
                               }
                        MetaFinder m5;
                       m5 = new MetaFinder(b);
                      m5.assign();
                       for(int i2=0;i2<StaticMetaClass.n;i2++){
                            w=StaticSubMetaClass.meta[i2].i;
                          if(StaticSubMetaClass.meta[i2].start[w]!=1000000)
                           StaticSubMetaClass.meta[i2].i++;
                          w=StaticSubMetaClass.meta[i2].i;
                           StaticSubMetaClass.meta[i2].start[w]=1000000;
                           StaticSubMetaClass.meta[i2].end[w]=0;
                       }
                      
                       break;
        
         }
        }
        MetaPrinter q5;
        q5=new MetaPrinter(date);
        try {
                           q5.printer();
                           } catch (DocumentException ex) {
                                 System.out.println(ex.getMessage());
                               }
        
    }
}
