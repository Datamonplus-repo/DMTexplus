package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColPedido.Proceso", namespace ="TexplusNET")
public final  class StructSdtColPedido_Proceso implements Cloneable, java.io.Serializable
{
   public StructSdtColPedido_Proceso( )
   {
      this( -1, new ModelContext( StructSdtColPedido_Proceso.class ));
   }

   public StructSdtColPedido_Proceso( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtColPedido_Proceso( java.util.Vector<StructSdtPedido_Proceso> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pedido.Proceso",namespace="TexplusNET")
   public java.util.Vector<StructSdtPedido_Proceso> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPedido_Proceso> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPedido_Proceso> item = new java.util.Vector<>();
}

