package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColPedido.Proceso.Fase.TratamientoQuimico", namespace ="TexplusNET")
public final  class StructSdtColPedido_Proceso_Fase_TratamientoQuimico implements Cloneable, java.io.Serializable
{
   public StructSdtColPedido_Proceso_Fase_TratamientoQuimico( )
   {
      this( -1, new ModelContext( StructSdtColPedido_Proceso_Fase_TratamientoQuimico.class ));
   }

   public StructSdtColPedido_Proceso_Fase_TratamientoQuimico( int remoteHandle ,
                                                              ModelContext context )
   {
   }

   public  StructSdtColPedido_Proceso_Fase_TratamientoQuimico( java.util.Vector<StructSdtPedido_Proceso_Fase_TratamientoQuimico> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pedido.Proceso.Fase.TratamientoQuimico",namespace="TexplusNET")
   public java.util.Vector<StructSdtPedido_Proceso_Fase_TratamientoQuimico> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPedido_Proceso_Fase_TratamientoQuimico> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPedido_Proceso_Fase_TratamientoQuimico> item = new java.util.Vector<>();
}

