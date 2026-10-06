package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenTipoArticulo", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenTipoArticulo implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenTipoArticulo( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenTipoArticulo.class ));
   }

   public StructSdtColSDTInformeProduccionResumenTipoArticulo( int remoteHandle ,
                                                               ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenTipoArticulo( java.util.Vector<StructSdtSDTInformeProduccionResumenTipoArticulo> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenTipoArticulo",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenTipoArticulo> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenTipoArticulo> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenTipoArticulo> item = new java.util.Vector<>();
}

