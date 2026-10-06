package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenMaquina", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenMaquina( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenMaquina.class ));
   }

   public StructSdtColSDTInformeProduccionResumenMaquina( int remoteHandle ,
                                                          ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenMaquina( java.util.Vector<StructSdtSDTInformeProduccionResumenMaquina> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenMaquina",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenMaquina> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenMaquina> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenMaquina> item = new java.util.Vector<>();
}

