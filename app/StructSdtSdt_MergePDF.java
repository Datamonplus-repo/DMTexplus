package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Sdt_MergePDF", namespace ="TexplusNET")
public final  class StructSdtSdt_MergePDF implements Cloneable, java.io.Serializable
{
   public StructSdtSdt_MergePDF( )
   {
      this( -1, new ModelContext( StructSdtSdt_MergePDF.class ));
   }

   public StructSdtSdt_MergePDF( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtSdt_MergePDF( java.util.Vector<StructSdtSdt_MergePDF_PDF> value )
   {
      item = value;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   @jakarta.xml.bind.annotation.XmlElement(name="PDF",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdt_MergePDF_PDF> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdt_MergePDF_PDF> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdt_MergePDF_PDF> item = new java.util.Vector<>();
}

