package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtResultQRCode", namespace ="TexplusNET")
public final  class StructSdtColSdtResultQRCode implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtResultQRCode( )
   {
      this( -1, new ModelContext( StructSdtColSdtResultQRCode.class ));
   }

   public StructSdtColSdtResultQRCode( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColSdtResultQRCode( java.util.Vector<StructSdtSdtResultQRCode> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtResultQRCode",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtResultQRCode> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtResultQRCode> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtResultQRCode> item = new java.util.Vector<>();
}

