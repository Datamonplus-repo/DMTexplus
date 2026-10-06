package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColPedido.AlmacenTejido", namespace ="TexplusNET")
public final  class StructSdtColPedido_AlmacenTejido implements Cloneable, java.io.Serializable
{
   public StructSdtColPedido_AlmacenTejido( )
   {
      this( -1, new ModelContext( StructSdtColPedido_AlmacenTejido.class ));
   }

   public StructSdtColPedido_AlmacenTejido( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtColPedido_AlmacenTejido( java.util.Vector<StructSdtPedido_AlmacenTejido> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pedido.AlmacenTejido",namespace="TexplusNET")
   public java.util.Vector<StructSdtPedido_AlmacenTejido> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPedido_AlmacenTejido> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPedido_AlmacenTejido> item = new java.util.Vector<>();
}

