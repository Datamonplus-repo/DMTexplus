package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtEncabezadoPedido", namespace ="TexplusNET")
public final  class StructSdtColSdtEncabezadoPedido implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtEncabezadoPedido( )
   {
      this( -1, new ModelContext( StructSdtColSdtEncabezadoPedido.class ));
   }

   public StructSdtColSdtEncabezadoPedido( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColSdtEncabezadoPedido( java.util.Vector<StructSdtSdtEncabezadoPedido> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtEncabezadoPedido",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtEncabezadoPedido> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtEncabezadoPedido> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtEncabezadoPedido> item = new java.util.Vector<>();
}

