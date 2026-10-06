package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Penalizaciones_SDT", namespace ="TexplusNET")
public final  class StructSdtPenalizaciones_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtPenalizaciones_SDT( )
   {
      this( -1, new ModelContext( StructSdtPenalizaciones_SDT.class ));
   }

   public StructSdtPenalizaciones_SDT( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtPenalizaciones_SDT( java.util.Vector<StructSdtPenalizaciones_SDT_Item> value )
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
   public java.util.Vector<StructSdtPenalizaciones_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPenalizaciones_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPenalizaciones_SDT_Item> item = new java.util.Vector<>();
}

