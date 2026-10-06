package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTPrinterSelected", namespace ="TexplusNET")
public final  class StructSdtColSDTPrinterSelected implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTPrinterSelected( )
   {
      this( -1, new ModelContext( StructSdtColSDTPrinterSelected.class ));
   }

   public StructSdtColSDTPrinterSelected( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColSDTPrinterSelected( java.util.Vector<StructSdtSDTPrinterSelected> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTPrinterSelected",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTPrinterSelected> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTPrinterSelected> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTPrinterSelected> item = new java.util.Vector<>();
}

