package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTClienteArticuloResumenEntradas", namespace ="TexplusNET")
public final  class StructSdtColSDTClienteArticuloResumenEntradas implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTClienteArticuloResumenEntradas( )
   {
      this( -1, new ModelContext( StructSdtColSDTClienteArticuloResumenEntradas.class ));
   }

   public StructSdtColSDTClienteArticuloResumenEntradas( int remoteHandle ,
                                                         ModelContext context )
   {
   }

   public  StructSdtColSDTClienteArticuloResumenEntradas( java.util.Vector<StructSdtSDTClienteArticuloResumenEntradas> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTClienteArticuloResumenEntradas",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTClienteArticuloResumenEntradas> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTClienteArticuloResumenEntradas> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTClienteArticuloResumenEntradas> item = new java.util.Vector<>();
}

