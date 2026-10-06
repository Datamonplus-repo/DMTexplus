package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeAlmacenTejidoCrudo_Cliente.Level1Item", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item.class ));
   }

   public StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item( int remoteHandle ,
                                                                       ModelContext context )
   {
   }

   public  StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeAlmacenTejidoCrudo_Cliente.Level1Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> item = new java.util.Vector<>();
}

