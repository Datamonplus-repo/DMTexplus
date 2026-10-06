package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "AlmacenTejidoencrudoDetalle_SDT", namespace ="TexplusNET")
public final  class StructSdtAlmacenTejidoencrudoDetalle_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtAlmacenTejidoencrudoDetalle_SDT( )
   {
      this( -1, new ModelContext( StructSdtAlmacenTejidoencrudoDetalle_SDT.class ));
   }

   public StructSdtAlmacenTejidoencrudoDetalle_SDT( int remoteHandle ,
                                                    ModelContext context )
   {
   }

   public  StructSdtAlmacenTejidoencrudoDetalle_SDT( java.util.Vector<StructSdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="AlmacenTejidoencrudoDetalle_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAlmacenTejidoencrudoDetalle_SDT_AlmacenTejidoencrudoDetalle_SDTItem> item = new java.util.Vector<>();
}

