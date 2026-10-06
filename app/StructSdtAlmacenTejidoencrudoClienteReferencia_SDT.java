package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "AlmacenTejidoencrudoClienteReferencia_SDT", namespace ="TexplusNET")
public final  class StructSdtAlmacenTejidoencrudoClienteReferencia_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtAlmacenTejidoencrudoClienteReferencia_SDT( )
   {
      this( -1, new ModelContext( StructSdtAlmacenTejidoencrudoClienteReferencia_SDT.class ));
   }

   public StructSdtAlmacenTejidoencrudoClienteReferencia_SDT( int remoteHandle ,
                                                              ModelContext context )
   {
   }

   public  StructSdtAlmacenTejidoencrudoClienteReferencia_SDT( java.util.Vector<StructSdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="AlmacenTejidoencrudoClienteReferencia_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAlmacenTejidoencrudoClienteReferencia_SDT_AlmacenTejidoencrudoClienteReferencia_SDTItem> item = new java.util.Vector<>();
}

