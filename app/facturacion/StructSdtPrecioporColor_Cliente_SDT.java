package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "PrecioporColor_Cliente_SDT", namespace ="TexplusNET")
public final  class StructSdtPrecioporColor_Cliente_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtPrecioporColor_Cliente_SDT( )
   {
      this( -1, new ModelContext( StructSdtPrecioporColor_Cliente_SDT.class ));
   }

   public StructSdtPrecioporColor_Cliente_SDT( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtPrecioporColor_Cliente_SDT( java.util.Vector<StructSdtPrecioporColor_Cliente_SDT_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtPrecioporColor_Cliente_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPrecioporColor_Cliente_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPrecioporColor_Cliente_SDT_Item> item = new java.util.Vector<>();
}

