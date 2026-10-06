package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTDetalleEntradas", namespace ="TexplusNET")
public final  class StructSdtColSDTDetalleEntradas implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTDetalleEntradas( )
   {
      this( -1, new ModelContext( StructSdtColSDTDetalleEntradas.class ));
   }

   public StructSdtColSDTDetalleEntradas( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColSDTDetalleEntradas( java.util.Vector<StructSdtSDTDetalleEntradas> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTDetalleEntradas",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTDetalleEntradas> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTDetalleEntradas> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTDetalleEntradas> item = new java.util.Vector<>();
}

