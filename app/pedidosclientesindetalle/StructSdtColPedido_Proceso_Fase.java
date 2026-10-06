package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColPedido.Proceso.Fase", namespace ="TexplusNET")
public final  class StructSdtColPedido_Proceso_Fase implements Cloneable, java.io.Serializable
{
   public StructSdtColPedido_Proceso_Fase( )
   {
      this( -1, new ModelContext( StructSdtColPedido_Proceso_Fase.class ));
   }

   public StructSdtColPedido_Proceso_Fase( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColPedido_Proceso_Fase( java.util.Vector<StructSdtPedido_Proceso_Fase> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pedido.Proceso.Fase",namespace="TexplusNET")
   public java.util.Vector<StructSdtPedido_Proceso_Fase> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPedido_Proceso_Fase> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPedido_Proceso_Fase> item = new java.util.Vector<>();
}

