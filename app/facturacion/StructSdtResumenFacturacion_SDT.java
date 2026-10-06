package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ResumenFacturacion_SDT", namespace ="TexplusNET")
public final  class StructSdtResumenFacturacion_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtResumenFacturacion_SDT( )
   {
      this( -1, new ModelContext( StructSdtResumenFacturacion_SDT.class ));
   }

   public StructSdtResumenFacturacion_SDT( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtResumenFacturacion_SDT( java.util.Vector<StructSdtResumenFacturacion_SDT_Item> value )
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
   public java.util.Vector<StructSdtResumenFacturacion_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtResumenFacturacion_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtResumenFacturacion_SDT_Item> item = new java.util.Vector<>();
}

