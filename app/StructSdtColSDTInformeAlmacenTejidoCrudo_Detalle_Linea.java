package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeAlmacenTejidoCrudo_Detalle.Linea", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle_Linea implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle_Linea( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle_Linea.class ));
   }

   public StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle_Linea( int remoteHandle ,
                                                                  ModelContext context )
   {
   }

   public  StructSdtColSDTInformeAlmacenTejidoCrudo_Detalle_Linea( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeAlmacenTejidoCrudo_Detalle.Linea",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> item = new java.util.Vector<>();
}

