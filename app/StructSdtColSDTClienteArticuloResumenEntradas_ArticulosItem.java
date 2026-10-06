package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTClienteArticuloResumenEntradas.ArticulosItem", namespace ="TexplusNET")
public final  class StructSdtColSDTClienteArticuloResumenEntradas_ArticulosItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTClienteArticuloResumenEntradas_ArticulosItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTClienteArticuloResumenEntradas_ArticulosItem.class ));
   }

   public StructSdtColSDTClienteArticuloResumenEntradas_ArticulosItem( int remoteHandle ,
                                                                       ModelContext context )
   {
   }

   public  StructSdtColSDTClienteArticuloResumenEntradas_ArticulosItem( java.util.Vector<StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTClienteArticuloResumenEntradas.ArticulosItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem> item = new java.util.Vector<>();
}

