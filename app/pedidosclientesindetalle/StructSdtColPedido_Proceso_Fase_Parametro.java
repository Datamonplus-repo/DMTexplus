package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColPedido.Proceso.Fase.Parametro", namespace ="TexplusNET")
public final  class StructSdtColPedido_Proceso_Fase_Parametro implements Cloneable, java.io.Serializable
{
   public StructSdtColPedido_Proceso_Fase_Parametro( )
   {
      this( -1, new ModelContext( StructSdtColPedido_Proceso_Fase_Parametro.class ));
   }

   public StructSdtColPedido_Proceso_Fase_Parametro( int remoteHandle ,
                                                     ModelContext context )
   {
   }

   public  StructSdtColPedido_Proceso_Fase_Parametro( java.util.Vector<StructSdtPedido_Proceso_Fase_Parametro> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pedido.Proceso.Fase.Parametro",namespace="TexplusNET")
   public java.util.Vector<StructSdtPedido_Proceso_Fase_Parametro> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPedido_Proceso_Fase_Parametro> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPedido_Proceso_Fase_Parametro> item = new java.util.Vector<>();
}

