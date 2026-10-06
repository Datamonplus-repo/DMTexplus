package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColCuentaCorrienteProductos_SDT", namespace ="TexplusNET")
public final  class StructSdtColCuentaCorrienteProductos_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColCuentaCorrienteProductos_SDT( )
   {
      this( -1, new ModelContext( StructSdtColCuentaCorrienteProductos_SDT.class ));
   }

   public StructSdtColCuentaCorrienteProductos_SDT( int remoteHandle ,
                                                    ModelContext context )
   {
   }

   public  StructSdtColCuentaCorrienteProductos_SDT( java.util.Vector<StructSdtCuentaCorrienteProductos_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="CuentaCorrienteProductos_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtCuentaCorrienteProductos_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtCuentaCorrienteProductos_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtCuentaCorrienteProductos_SDT> item = new java.util.Vector<>();
}

