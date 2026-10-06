package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtQRCode", namespace ="TexplusNET")
public final  class StructSdtColSdtQRCode implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtQRCode( )
   {
      this( -1, new ModelContext( StructSdtColSdtQRCode.class ));
   }

   public StructSdtColSdtQRCode( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtColSdtQRCode( java.util.Vector<StructSdtSdtQRCode> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtQRCode",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtQRCode> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtQRCode> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtQRCode> item = new java.util.Vector<>();
}

