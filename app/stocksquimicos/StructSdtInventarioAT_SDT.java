package app.stocksquimicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "InventarioAT_SDT", namespace ="TexplusNET")
public final  class StructSdtInventarioAT_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtInventarioAT_SDT( )
   {
      this( -1, new ModelContext( StructSdtInventarioAT_SDT.class ));
   }

   public StructSdtInventarioAT_SDT( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtInventarioAT_SDT( java.util.Vector<StructSdtInventarioAT_SDT_InventarioAT_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="InventarioAT_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtInventarioAT_SDT_InventarioAT_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtInventarioAT_SDT_InventarioAT_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtInventarioAT_SDT_InventarioAT_SDTItem> item = new java.util.Vector<>();
}

