package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenMaquina.MaquinaItem", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenMaquina_MaquinaItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenMaquina_MaquinaItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenMaquina_MaquinaItem.class ));
   }

   public StructSdtColSDTInformeProduccionResumenMaquina_MaquinaItem( int remoteHandle ,
                                                                      ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenMaquina_MaquinaItem( java.util.Vector<StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenMaquina.MaquinaItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem> item = new java.util.Vector<>();
}

