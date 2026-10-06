package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "InformeProduccionResumenDataTimeDetalle_SDT", namespace ="TexplusNET")
public final  class StructSdtInformeProduccionResumenDataTimeDetalle_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtInformeProduccionResumenDataTimeDetalle_SDT( )
   {
      this( -1, new ModelContext( StructSdtInformeProduccionResumenDataTimeDetalle_SDT.class ));
   }

   public StructSdtInformeProduccionResumenDataTimeDetalle_SDT( int remoteHandle ,
                                                                ModelContext context )
   {
   }

   public  StructSdtInformeProduccionResumenDataTimeDetalle_SDT( java.util.Vector<StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="InformeProduccionResumenDataTimeDetalle_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem> item = new java.util.Vector<>();
}

