/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatAllotment;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author rggop
 */
public class colom_7 {
    Class a;
    String dat;
    String dw;
    public static final String DEST ="results/";
    colom_7(Class b,String d)
    {
        a=b;
        dat=d;
    }

    private colom_7() {
         //To change body of generated methods, choose Tools | Templates.
    }
    public void Coll4() {
        dw=DEST+"classes-"+dat+"/";
        File file= new File(dw);
        file.getParentFile().mkdirs();
        Document document = new Document();
        document.left(100f);
        document.top(150f);
        String d = a.Name;
       
        String dest=dw+d+".pdf";
    try
    {
        Student q=new Student();
        Font font = new Font(FontFamily.HELVETICA, 20, Font.BOLD);
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
         document.add(new Paragraph("\t\t\t\t\t\t"+d+"\t\t\t\t\t\t\t\t"+dat,font));
        PdfPTable table = new PdfPTable(7); // 3 columns.
        table.setWidthPercentage(100); //Width 100%
        table.setSpacingBefore(10f); //Space before table
        table.setSpacingAfter(10f); //Space after table
 
        //Set Column widths
        float[] columnWidths = {2f, 2f, 2f,2f,2f,2f,2f};
        table.setWidths(columnWidths);
        int i=0;
         int maxrow = a.maxRowLength;
        
       
        while(i<maxrow)
        {
            String[] seat ={" "," "," "," "," "," "," "};
              
     for(int j=0;j<7;j++)
       {
        for(int k=0;k<a.seatType;k++)
        {
            q=a.nextForPdf();
            if(q==null)
            {
                if(!" ".equals(seat[j]))
                {
                seat[j]=seat[j]+"   "+"---";
                }
                else
                    seat[j]=seat[j]+"---";
              
            } else 
            {
                int roll=q.rollNo;
                String rollno=String.valueOf(roll);
                if(!" ".equals(seat[j]))
                {
                seat[j]=seat[j]+"    "+rollno;
                }
                else
                    seat[j]=seat[j]+rollno;
            }
        }
        
    }
       
               
 
        PdfPCell cell1 = new PdfPCell(new Paragraph(seat[0],font));
        cell1.setBorder(PdfPCell.NO_BORDER);
        cell1.setPaddingLeft(10);
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell1.setCellEvent(new MyBorder());
        cell1.setFixedHeight(50f);

        PdfPCell cell2 = new PdfPCell(new Paragraph(seat[1],font));
        
        cell2.setBorderColor(BaseColor.BLACK);
        cell2.setBorder(PdfPCell.NO_BORDER);
        cell2.setPaddingLeft(5f);
        cell2.setPaddingRight(5f);
        cell2.setPaddingBottom(5);
        cell2.setPaddingTop(5);
        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell2.setCellEvent(new MyBorder());
        cell2.setFixedHeight(50f);
 
        PdfPCell cell3 = new PdfPCell(new Paragraph(seat[2],font));
        cell3.setBorder(PdfPCell.NO_BORDER);
        cell3.setPaddingLeft(10);
        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell3.setCellEvent(new MyBorder());
        cell3.setFixedHeight(50f);
 
        
        PdfPCell cell4 = new PdfPCell(new Paragraph(seat[3],font));
        cell4.setBorder(PdfPCell.NO_BORDER);
        cell4.setPaddingLeft(10);
        cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell4.setCellEvent(new MyBorder());
        cell4.setFixedHeight(50f);
        
        
        PdfPCell cell5 = new PdfPCell(new Paragraph(seat[4],font));
        cell5.setBorder(PdfPCell.NO_BORDER);
        cell5.setPaddingLeft(10);
        cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell5.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell5.setCellEvent(new MyBorder());
        cell5.setFixedHeight(50f);
        
        
 PdfPCell cell6 = new PdfPCell(new Paragraph(seat[5],font));
        cell6.setBorder(PdfPCell.NO_BORDER);
        cell6.setPaddingLeft(10);
        cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell6.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell6.setCellEvent(new MyBorder());
        cell6.setFixedHeight(50f);
 
 
        PdfPCell cell7 = new PdfPCell(new Paragraph(seat[6],font));
        cell7.setBorder(PdfPCell.NO_BORDER);
        cell7.setPaddingLeft(10);
        cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell7.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell7.setCellEvent(new MyBorder());
        cell7.setFixedHeight(50f);
        //To avoid having the cell border and the content overlap, if you are having thick cell borders
        //cell1.setUserBorderPadding(true);
        //cell2.setUserBorderPadding(true);
        //cell3.setUserBorderPadding(true);
 
        table.addCell(cell1);
        table.addCell(cell2);
        table.addCell(cell3);
        table.addCell(cell4);
        table.addCell(cell5);
        table.addCell(cell6);
         table.addCell(cell7);

 i=i+1;
        }
        document.add(table);
 
      
        document.close();
        writer.close();
     
    
        
 
    }   
    catch(DocumentException | FileNotFoundException e)
    {
        System.out.println(e.getMessage());
    }
    }
    public static void main(String[] args) throws FileNotFoundException, DocumentException
    {
         new colom_7().Coll4();
    }   
    
}
