package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColCuentaCorrienteProductos_SDT.Level1", namespace ="TexplusNET")
public final  class StructSdtColCuentaCorrienteProductos_SDT_Level1 implements Cloneable, java.io.Serializable
{
   public StructSdtColCuentaCorrienteProductos_SDT_Level1( )
   {
      this( -1, new ModelContext( StructSdtColCuentaCorrienteProductos_SDT_Level1.class ));
   }

   public StructSdtColCuentaCorrienteProductos_SDT_Level1( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColCuentaCorrienteProductos_SDT_Level1( java.util.Vector<StructSdtCuentaCorrienteProductos_SDT_Level1> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="CuentaCorrienteProductos_SDT.Level1",namespace="TexplusNET")
   public java.util.Vector<StructSdtCuentaCorrienteProductos_SDT_Level1> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtCuentaCorrienteProductos_SDT_Level1> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtCuentaCorrienteProductos_SDT_Level1> item = new java.util.Vector<>();
}

