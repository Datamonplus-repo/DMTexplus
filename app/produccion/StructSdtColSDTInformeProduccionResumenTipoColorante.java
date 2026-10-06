package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenTipoColorante", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenTipoColorante implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenTipoColorante( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenTipoColorante.class ));
   }

   public StructSdtColSDTInformeProduccionResumenTipoColorante( int remoteHandle ,
                                                                ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenTipoColorante( java.util.Vector<StructSdtSDTInformeProduccionResumenTipoColorante> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenTipoColorante",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenTipoColorante> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenTipoColorante> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenTipoColorante> item = new java.util.Vector<>();
}

