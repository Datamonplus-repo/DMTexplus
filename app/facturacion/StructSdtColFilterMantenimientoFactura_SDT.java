package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColFilterMantenimientoFactura_SDT", namespace ="TexplusNET")
public final  class StructSdtColFilterMantenimientoFactura_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColFilterMantenimientoFactura_SDT( )
   {
      this( -1, new ModelContext( StructSdtColFilterMantenimientoFactura_SDT.class ));
   }

   public StructSdtColFilterMantenimientoFactura_SDT( int remoteHandle ,
                                                      ModelContext context )
   {
   }

   public  StructSdtColFilterMantenimientoFactura_SDT( java.util.Vector<StructSdtFilterMantenimientoFactura_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="FilterMantenimientoFactura_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtFilterMantenimientoFactura_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFilterMantenimientoFactura_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFilterMantenimientoFactura_SDT> item = new java.util.Vector<>();
}

