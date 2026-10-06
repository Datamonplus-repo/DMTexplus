package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProduccionParosResumen", namespace ="TexplusNET")
public final  class StructSdtColSDTProduccionParosResumen implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProduccionParosResumen( )
   {
      this( -1, new ModelContext( StructSdtColSDTProduccionParosResumen.class ));
   }

   public StructSdtColSDTProduccionParosResumen( int remoteHandle ,
                                                 ModelContext context )
   {
   }

   public  StructSdtColSDTProduccionParosResumen( java.util.Vector<StructSdtSDTProduccionParosResumen> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProduccionParosResumen",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProduccionParosResumen> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProduccionParosResumen> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProduccionParosResumen> item = new java.util.Vector<>();
}

