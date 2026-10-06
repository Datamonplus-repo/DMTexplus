package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtRecepcionPedido", namespace ="TexplusNET")
public final  class StructSdtColSdtRecepcionPedido implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtRecepcionPedido( )
   {
      this( -1, new ModelContext( StructSdtColSdtRecepcionPedido.class ));
   }

   public StructSdtColSdtRecepcionPedido( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColSdtRecepcionPedido( java.util.Vector<StructSdtSdtRecepcionPedido> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtRecepcionPedido",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtRecepcionPedido> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtRecepcionPedido> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtRecepcionPedido> item = new java.util.Vector<>();
}

