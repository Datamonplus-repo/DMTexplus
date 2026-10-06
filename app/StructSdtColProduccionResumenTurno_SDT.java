package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColProduccionResumenTurno_SDT", namespace ="TexplusNET")
public final  class StructSdtColProduccionResumenTurno_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColProduccionResumenTurno_SDT( )
   {
      this( -1, new ModelContext( StructSdtColProduccionResumenTurno_SDT.class ));
   }

   public StructSdtColProduccionResumenTurno_SDT( int remoteHandle ,
                                                  ModelContext context )
   {
   }

   public  StructSdtColProduccionResumenTurno_SDT( java.util.Vector<StructSdtProduccionResumenTurno_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ProduccionResumenTurno_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtProduccionResumenTurno_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtProduccionResumenTurno_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtProduccionResumenTurno_SDT> item = new java.util.Vector<>();
}

