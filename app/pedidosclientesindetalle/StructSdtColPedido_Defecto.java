package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColPedido.Defecto", namespace ="TexplusNET")
public final  class StructSdtColPedido_Defecto implements Cloneable, java.io.Serializable
{
   public StructSdtColPedido_Defecto( )
   {
      this( -1, new ModelContext( StructSdtColPedido_Defecto.class ));
   }

   public StructSdtColPedido_Defecto( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtColPedido_Defecto( java.util.Vector<StructSdtPedido_Defecto> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pedido.Defecto",namespace="TexplusNET")
   public java.util.Vector<StructSdtPedido_Defecto> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPedido_Defecto> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPedido_Defecto> item = new java.util.Vector<>();
}

