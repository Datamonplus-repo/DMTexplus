package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTPropsPrinter", namespace ="TexplusNET")
public final  class StructSdtColSDTPropsPrinter implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTPropsPrinter( )
   {
      this( -1, new ModelContext( StructSdtColSDTPropsPrinter.class ));
   }

   public StructSdtColSDTPropsPrinter( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColSDTPropsPrinter( java.util.Vector<StructSdtSDTPropsPrinter> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTPropsPrinter",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTPropsPrinter> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTPropsPrinter> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTPropsPrinter> item = new java.util.Vector<>();
}

