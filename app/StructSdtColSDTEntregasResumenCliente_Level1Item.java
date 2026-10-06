package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTEntregasResumenCliente.Level1Item", namespace ="TexplusNET")
public final  class StructSdtColSDTEntregasResumenCliente_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTEntregasResumenCliente_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtColSDTEntregasResumenCliente_Level1Item.class ));
   }

   public StructSdtColSDTEntregasResumenCliente_Level1Item( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTEntregasResumenCliente_Level1Item( java.util.Vector<StructSdtSDTEntregasResumenCliente_Level1Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTEntregasResumenCliente.Level1Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTEntregasResumenCliente_Level1Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTEntregasResumenCliente_Level1Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTEntregasResumenCliente_Level1Item> item = new java.util.Vector<>();
}

