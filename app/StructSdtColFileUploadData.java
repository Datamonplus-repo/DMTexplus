package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFileUploadData", namespace ="TexplusNET")
public final  class StructSdtColFileUploadData implements Cloneable, java.io.Serializable
{
   public StructSdtColFileUploadData( )
   {
      this( -1, new ModelContext( StructSdtColFileUploadData.class ));
   }

   public StructSdtColFileUploadData( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtColFileUploadData( java.util.Vector<StructSdtFileUploadData> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FileUploadData",namespace="TexplusNET")
   public java.util.Vector<StructSdtFileUploadData> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFileUploadData> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFileUploadData> item = new java.util.Vector<>();
}

