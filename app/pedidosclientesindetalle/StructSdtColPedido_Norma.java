package app.pedidosclientesindetalle ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColPedido.Norma", namespace ="TexplusNET")
public final  class StructSdtColPedido_Norma implements Cloneable, java.io.Serializable
{
   public StructSdtColPedido_Norma( )
   {
      this( -1, new ModelContext( StructSdtColPedido_Norma.class ));
   }

   public StructSdtColPedido_Norma( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColPedido_Norma( java.util.Vector<StructSdtPedido_Norma> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Pedido.Norma",namespace="TexplusNET")
   public java.util.Vector<StructSdtPedido_Norma> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPedido_Norma> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPedido_Norma> item = new java.util.Vector<>();
}

