package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeAlmacenTejidoCrudo_Cliente", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente.class ));
   }

   public StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTInformeAlmacenTejidoCrudo_Cliente( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeAlmacenTejidoCrudo_Cliente",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeAlmacenTejidoCrudo_Cliente> item = new java.util.Vector<>();
}

