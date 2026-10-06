package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenOperario.OperarioItem", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenOperario_OperarioItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenOperario_OperarioItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenOperario_OperarioItem.class ));
   }

   public StructSdtColSDTInformeProduccionResumenOperario_OperarioItem( int remoteHandle ,
                                                                        ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenOperario_OperarioItem( java.util.Vector<StructSdtSDTInformeProduccionResumenOperario_OperarioItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenOperario.OperarioItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenOperario_OperarioItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenOperario_OperarioItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenOperario_OperarioItem> item = new java.util.Vector<>();
}

