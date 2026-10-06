package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "FacturasEmitidas_SDT", namespace ="TexplusNET")
public final  class StructSdtFacturasEmitidas_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtFacturasEmitidas_SDT( )
   {
      this( -1, new ModelContext( StructSdtFacturasEmitidas_SDT.class ));
   }

   public StructSdtFacturasEmitidas_SDT( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtFacturasEmitidas_SDT( java.util.Vector<StructSdtFacturasEmitidas_SDT_Item> value )
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
   public java.util.Vector<StructSdtFacturasEmitidas_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFacturasEmitidas_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFacturasEmitidas_SDT_Item> item = new java.util.Vector<>();
}

