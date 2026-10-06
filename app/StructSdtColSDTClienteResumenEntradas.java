package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTClienteResumenEntradas", namespace ="TexplusNET")
public final  class StructSdtColSDTClienteResumenEntradas implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTClienteResumenEntradas( )
   {
      this( -1, new ModelContext( StructSdtColSDTClienteResumenEntradas.class ));
   }

   public StructSdtColSDTClienteResumenEntradas( int remoteHandle ,
                                                 ModelContext context )
   {
   }

   public  StructSdtColSDTClienteResumenEntradas( java.util.Vector<StructSdtSDTClienteResumenEntradas> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTClienteResumenEntradas",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTClienteResumenEntradas> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTClienteResumenEntradas> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTClienteResumenEntradas> item = new java.util.Vector<>();
}

