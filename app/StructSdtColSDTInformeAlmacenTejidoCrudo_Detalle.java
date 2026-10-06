package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeAlmacenTejidoCrudo_Detalle", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle.class ));
   }

   public StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Detalle> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeAlmacenTejidoCrudo_Detalle",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Detalle> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Detalle> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Detalle> item = new java.util.Vector<>();
}

