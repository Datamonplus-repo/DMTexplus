package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeAlmacenTejidoCrudo_Cliente_Referencia", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Referencia implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Referencia( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Referencia.class ));
   }

   public StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Referencia( int remoteHandle ,
                                                                       ModelContext context )
   {
   }

   public  StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente_Referencia( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeAlmacenTejidoCrudo_Cliente_Referencia",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia> item = new java.util.Vector<>();
}

