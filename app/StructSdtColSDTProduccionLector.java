package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProduccionLector", namespace ="TexplusNET")
public final  class StructSdtColSDTProduccionLector implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProduccionLector( )
   {
      this( -1, new ModelContext( StructSdtColSDTProduccionLector.class ));
   }

   public StructSdtColSDTProduccionLector( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColSDTProduccionLector( java.util.Vector<StructSdtSDTProduccionLector> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProduccionLector",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProduccionLector> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProduccionLector> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProduccionLector> item = new java.util.Vector<>();
}

