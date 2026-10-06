package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColProduccionResumenTurno_SDT.TurnosItem", namespace ="TexplusNET")
public final  class StructSdtColProduccionResumenTurno_SDT_TurnosItem implements Cloneable, java.io.Serializable
{
   public StructSdtColProduccionResumenTurno_SDT_TurnosItem( )
   {
      this( -1, new ModelContext( StructSdtColProduccionResumenTurno_SDT_TurnosItem.class ));
   }

   public StructSdtColProduccionResumenTurno_SDT_TurnosItem( int remoteHandle ,
                                                             ModelContext context )
   {
   }

   public  StructSdtColProduccionResumenTurno_SDT_TurnosItem( java.util.Vector<StructSdtProduccionResumenTurno_SDT_TurnosItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ProduccionResumenTurno_SDT.TurnosItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtProduccionResumenTurno_SDT_TurnosItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtProduccionResumenTurno_SDT_TurnosItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtProduccionResumenTurno_SDT_TurnosItem> item = new java.util.Vector<>();
}

