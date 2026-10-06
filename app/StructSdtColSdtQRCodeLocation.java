package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtQRCodeLocation", namespace ="TexplusNET")
public final  class StructSdtColSdtQRCodeLocation implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtQRCodeLocation( )
   {
      this( -1, new ModelContext( StructSdtColSdtQRCodeLocation.class ));
   }

   public StructSdtColSdtQRCodeLocation( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColSdtQRCodeLocation( java.util.Vector<StructSdtSdtQRCodeLocation> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtQRCodeLocation",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtQRCodeLocation> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtQRCodeLocation> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtQRCodeLocation> item = new java.util.Vector<>();
}

