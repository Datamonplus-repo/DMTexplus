package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProduccionParos", namespace ="TexplusNET")
public final  class StructSdtColSDTProduccionParos implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProduccionParos( )
   {
      this( -1, new ModelContext( StructSdtColSDTProduccionParos.class ));
   }

   public StructSdtColSDTProduccionParos( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColSDTProduccionParos( java.util.Vector<StructSdtSDTProduccionParos> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProduccionParos",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProduccionParos> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProduccionParos> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProduccionParos> item = new java.util.Vector<>();
}

