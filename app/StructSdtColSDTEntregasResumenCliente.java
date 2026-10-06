package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTEntregasResumenCliente", namespace ="TexplusNET")
public final  class StructSdtColSDTEntregasResumenCliente implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTEntregasResumenCliente( )
   {
      this( -1, new ModelContext( StructSdtColSDTEntregasResumenCliente.class ));
   }

   public StructSdtColSDTEntregasResumenCliente( int remoteHandle ,
                                                 ModelContext context )
   {
   }

   public  StructSdtColSDTEntregasResumenCliente( java.util.Vector<StructSdtSDTEntregasResumenCliente> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTEntregasResumenCliente",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTEntregasResumenCliente> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTEntregasResumenCliente> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTEntregasResumenCliente> item = new java.util.Vector<>();
}

