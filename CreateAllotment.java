/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JERIN_JACOB
 */
public class CreateAllotment {
    public CreateAllotment(String classes[],int classlength,String subjectcodes[],int subjectlength,String date)
    {
        //<<INSTRUCTIONS::
        
        // date is of format 12_03_17_AN
        //fetch classes into CAClasses and subjectcodes into CASubjectcodes
        //>>
        
        
        
        //temperory variables to remove errors
         ArrayOfSubjectCode CASubjectcode=new ArrayOfSubjectCode();
         ArrayOfClasses CAClasses= new ArrayOfClasses();
         //end of temporary variables
         Connectivity co=new Connectivity();
         co.connect();
         int p=0,rowcount;
         String a,k;
         int b,c,d,e,f,g,h,i,j;
         String q1="use mysql";
         classlength--;
         while(classlength>=0)
         {
         String getclass="select * from class where name='"+classes[classlength]+"'";
         try {
                co.st.executeQuery(q1);
                co.rs=co.st.executeQuery(getclass);
                while(co.rs.next())
                {
                    a=co.rs.getString(1);
                    b=co.rs.getInt(2);
                    j=co.rs.getInt(10);
                    k=co.rs.getString(11);
                    rowcount=b;
                    int[] i1=new int[rowcount];
                    int q;
                    for(p=0,q=3;p<rowcount;p++)
                    {
                        i1[p]=co.rs.getInt(q);
                        q++;
                    }
                    Class c1 = new Class(b, i1, j);
                    c1.Name=a;
                    ArrayOfClasses ac= new ArrayOfClasses();
                    ac.push(c1);
                }
        } catch (SQLException ex) {
            Logger.getLogger(fetchclass.class.getName()).log(Level.SEVERE, null, ex);
        }
         classlength--;
         }
         subjectlength--;
         while(subjectlength>=0)
         {
               String getsujectcode="select * from studentlist where ";
             
         }
         
         
         
        Allotment allotment=new Allotment(CAClasses, CASubjectcode);
        
        try{
        passingclass ps=new passingclass(allotment.axx,date);
        }
        catch(FileNotFoundException execp)
        {
            System.out.println("SeatAllotment.CreateAllotment()");
        }
    }
}
