package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProduccionMaquinasTurnos", namespace ="TexplusNET")
public final  class StructSdtColSDTProduccionMaquinasTurnos implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProduccionMaquinasTurnos( )
   {
      this( -1, new ModelContext( StructSdtColSDTProduccionMaquinasTurnos.class ));
   }

   public StructSdtColSDTProduccionMaquinasTurnos( int remoteHandle ,
                                                   ModelContext context )
   {
   }

   public  StructSdtColSDTProduccionMaquinasTurnos( java.util.Vector<StructSdtSDTProduccionMaquinasTurnos> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProduccionMaquinasTurnos",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProduccionMaquinasTurnos> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProduccionMaquinasTurnos> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProduccionMaquinasTurnos> item = new java.util.Vector<>();
}

