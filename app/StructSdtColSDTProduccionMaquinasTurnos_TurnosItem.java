package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProduccionMaquinasTurnos.TurnosItem", namespace ="TexplusNET")
public final  class StructSdtColSDTProduccionMaquinasTurnos_TurnosItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProduccionMaquinasTurnos_TurnosItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTProduccionMaquinasTurnos_TurnosItem.class ));
   }

   public StructSdtColSDTProduccionMaquinasTurnos_TurnosItem( int remoteHandle ,
                                                              ModelContext context )
   {
   }

   public  StructSdtColSDTProduccionMaquinasTurnos_TurnosItem( java.util.Vector<StructSdtSDTProduccionMaquinasTurnos_TurnosItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProduccionMaquinasTurnos.TurnosItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProduccionMaquinasTurnos_TurnosItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProduccionMaquinasTurnos_TurnosItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProduccionMaquinasTurnos_TurnosItem> item = new java.util.Vector<>();
}

