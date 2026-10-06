package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenTipoColorante.Item", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenTipoColorante_Item implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenTipoColorante_Item( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenTipoColorante_Item.class ));
   }

   public StructSdtColSDTInformeProduccionResumenTipoColorante_Item( int remoteHandle ,
                                                                     ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenTipoColorante_Item( java.util.Vector<StructSdtSDTInformeProduccionResumenTipoColorante_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenTipoColorante.Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenTipoColorante_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenTipoColorante_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenTipoColorante_Item> item = new java.util.Vector<>();
}

