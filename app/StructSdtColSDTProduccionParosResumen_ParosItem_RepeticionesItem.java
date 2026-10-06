package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTProduccionParosResumen.ParosItem.RepeticionesItem", namespace ="TexplusNET")
public final  class StructSdtColSDTProduccionParosResumen_ParosItem_RepeticionesItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTProduccionParosResumen_ParosItem_RepeticionesItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTProduccionParosResumen_ParosItem_RepeticionesItem.class ));
   }

   public StructSdtColSDTProduccionParosResumen_ParosItem_RepeticionesItem( int remoteHandle ,
                                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTProduccionParosResumen_ParosItem_RepeticionesItem( java.util.Vector<StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTProduccionParosResumen.ParosItem.RepeticionesItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTProduccionParosResumen_ParosItem_RepeticionesItem> item = new java.util.Vector<>();
}

