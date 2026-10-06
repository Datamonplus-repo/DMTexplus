package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColCuentaCorrienteProductos2_SDT", namespace ="TexplusNET")
public final  class StructSdtColCuentaCorrienteProductos2_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColCuentaCorrienteProductos2_SDT( )
   {
      this( -1, new ModelContext( StructSdtColCuentaCorrienteProductos2_SDT.class ));
   }

   public StructSdtColCuentaCorrienteProductos2_SDT( int remoteHandle ,
                                                     ModelContext context )
   {
   }

   public  StructSdtColCuentaCorrienteProductos2_SDT( java.util.Vector<StructSdtCuentaCorrienteProductos2_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="CuentaCorrienteProductos2_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtCuentaCorrienteProductos2_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtCuentaCorrienteProductos2_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtCuentaCorrienteProductos2_SDT> item = new java.util.Vector<>();
}

