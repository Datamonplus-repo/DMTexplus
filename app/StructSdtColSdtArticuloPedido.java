package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtArticuloPedido", namespace ="TexplusNET")
public final  class StructSdtColSdtArticuloPedido implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtArticuloPedido( )
   {
      this( -1, new ModelContext( StructSdtColSdtArticuloPedido.class ));
   }

   public StructSdtColSdtArticuloPedido( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColSdtArticuloPedido( java.util.Vector<StructSdtSdtArticuloPedido> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtArticuloPedido",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtArticuloPedido> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtArticuloPedido> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtArticuloPedido> item = new java.util.Vector<>();
}

