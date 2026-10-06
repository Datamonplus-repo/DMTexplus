package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTListPrinter", namespace ="TexplusNET")
public final  class StructSdtSDTListPrinter implements Cloneable, java.io.Serializable
{
   public StructSdtSDTListPrinter( )
   {
      this( -1, new ModelContext( StructSdtSDTListPrinter.class ));
   }

   public StructSdtSDTListPrinter( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtSDTListPrinter( java.util.Vector<StructSdtSDTListPrinter_SDTListPrinterItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTListPrinterItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTListPrinter_SDTListPrinterItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTListPrinter_SDTListPrinterItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTListPrinter_SDTListPrinterItem> item = new java.util.Vector<>();
}

