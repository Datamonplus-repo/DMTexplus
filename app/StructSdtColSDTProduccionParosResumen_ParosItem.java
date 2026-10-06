package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProduccionParosResumen.ParosItem", namespace ="TexplusNET")
public final  class StructSdtColSDTProduccionParosResumen_ParosItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProduccionParosResumen_ParosItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTProduccionParosResumen_ParosItem.class ));
   }

   public StructSdtColSDTProduccionParosResumen_ParosItem( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColSDTProduccionParosResumen_ParosItem( java.util.Vector<StructSdtSDTProduccionParosResumen_ParosItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProduccionParosResumen.ParosItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProduccionParosResumen_ParosItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProduccionParosResumen_ParosItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProduccionParosResumen_ParosItem> item = new java.util.Vector<>();
}

