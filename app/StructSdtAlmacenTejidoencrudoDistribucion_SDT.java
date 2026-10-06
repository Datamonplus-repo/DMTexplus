package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "AlmacenTejidoencrudoDistribucion_SDT", namespace ="TexplusNET")
public final  class StructSdtAlmacenTejidoencrudoDistribucion_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtAlmacenTejidoencrudoDistribucion_SDT( )
   {
      this( -1, new ModelContext( StructSdtAlmacenTejidoencrudoDistribucion_SDT.class ));
   }

   public StructSdtAlmacenTejidoencrudoDistribucion_SDT( int remoteHandle ,
                                                         ModelContext context )
   {
   }

   public  StructSdtAlmacenTejidoencrudoDistribucion_SDT( java.util.Vector<StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="AlmacenTejidoencrudoDistribucion_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtAlmacenTejidoencrudoDistribucion_SDT_AlmacenTejidoencrudoDistribucion_SDTItem> item = new java.util.Vector<>();
}

