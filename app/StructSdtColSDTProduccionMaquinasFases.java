package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProduccionMaquinasFases", namespace ="TexplusNET")
public final  class StructSdtColSDTProduccionMaquinasFases implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProduccionMaquinasFases( )
   {
      this( -1, new ModelContext( StructSdtColSDTProduccionMaquinasFases.class ));
   }

   public StructSdtColSDTProduccionMaquinasFases( int remoteHandle ,
                                                  ModelContext context )
   {
   }

   public  StructSdtColSDTProduccionMaquinasFases( java.util.Vector<StructSdtSDTProduccionMaquinasFases> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProduccionMaquinasFases",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProduccionMaquinasFases> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProduccionMaquinasFases> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProduccionMaquinasFases> item = new java.util.Vector<>();
}

