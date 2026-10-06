package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "DiariodeFacturacion_SDT", namespace ="TexplusNET")
public final  class StructSdtDiariodeFacturacion_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtDiariodeFacturacion_SDT( )
   {
      this( -1, new ModelContext( StructSdtDiariodeFacturacion_SDT.class ));
   }

   public StructSdtDiariodeFacturacion_SDT( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtDiariodeFacturacion_SDT( java.util.Vector<StructSdtDiariodeFacturacion_SDT_Item> value )
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
   public java.util.Vector<StructSdtDiariodeFacturacion_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDiariodeFacturacion_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDiariodeFacturacion_SDT_Item> item = new java.util.Vector<>();
}

