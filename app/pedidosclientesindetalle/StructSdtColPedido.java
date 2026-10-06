package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColPedido", namespace ="TexplusNET")
public final  class StructSdtColPedido implements Cloneable, java.io.Serializable
{
   public StructSdtColPedido( )
   {
      this( -1, new ModelContext( StructSdtColPedido.class ));
   }

   public StructSdtColPedido( int remoteHandle ,
                              ModelContext context )
   {
   }

   public  StructSdtColPedido( java.util.Vector<StructSdtPedido> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pedido",namespace="TexplusNET")
   public java.util.Vector<StructSdtPedido> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPedido> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPedido> item = new java.util.Vector<>();
}

