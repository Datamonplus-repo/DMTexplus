package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "InformeProduccionResumenTipoArticulo_SDT", namespace ="TexplusNET")
public final  class StructSdtInformeProduccionResumenTipoArticulo_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtInformeProduccionResumenTipoArticulo_SDT( )
   {
      this( -1, new ModelContext( StructSdtInformeProduccionResumenTipoArticulo_SDT.class ));
   }

   public StructSdtInformeProduccionResumenTipoArticulo_SDT( int remoteHandle ,
                                                             ModelContext context )
   {
   }

   public  StructSdtInformeProduccionResumenTipoArticulo_SDT( java.util.Vector<StructSdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="InformeProduccionResumenTipoArticulo_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem> item = new java.util.Vector<>();
}

