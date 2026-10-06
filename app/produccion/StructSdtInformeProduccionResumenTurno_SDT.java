package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "InformeProduccionResumenTurno_SDT", namespace ="TexplusNET")
public final  class StructSdtInformeProduccionResumenTurno_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtInformeProduccionResumenTurno_SDT( )
   {
      this( -1, new ModelContext( StructSdtInformeProduccionResumenTurno_SDT.class ));
   }

   public StructSdtInformeProduccionResumenTurno_SDT( int remoteHandle ,
                                                      ModelContext context )
   {
   }

   public  StructSdtInformeProduccionResumenTurno_SDT( java.util.Vector<StructSdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="InformeProduccionResumenTurno_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem> item = new java.util.Vector<>();
}

