package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenTipoArticulo.ArticuloItem", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenTipoArticulo_ArticuloItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenTipoArticulo_ArticuloItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenTipoArticulo_ArticuloItem.class ));
   }

   public StructSdtColSDTInformeProduccionResumenTipoArticulo_ArticuloItem( int remoteHandle ,
                                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenTipoArticulo_ArticuloItem( java.util.Vector<StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenTipoArticulo.ArticuloItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem> item = new java.util.Vector<>();
}

