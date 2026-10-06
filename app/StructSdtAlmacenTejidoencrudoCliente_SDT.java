package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "AlmacenTejidoencrudoCliente_SDT", namespace ="TexplusNET")
public final  class StructSdtAlmacenTejidoencrudoCliente_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtAlmacenTejidoencrudoCliente_SDT( )
   {
      this( -1, new ModelContext( StructSdtAlmacenTejidoencrudoCliente_SDT.class ));
   }

   public StructSdtAlmacenTejidoencrudoCliente_SDT( int remoteHandle ,
                                                    ModelContext context )
   {
   }

   public  StructSdtAlmacenTejidoencrudoCliente_SDT( java.util.Vector<StructSdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="AlmacenTejidoencrudoCliente_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAlmacenTejidoencrudoCliente_SDT_AlmacenTejidoencrudoCliente_SDTItem> item = new java.util.Vector<>();
}

