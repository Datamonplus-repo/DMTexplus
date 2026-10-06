package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTCompraProductoQuimico", namespace ="TexplusNET")
public final  class StructSdtSDTCompraProductoQuimico implements Cloneable, java.io.Serializable
{
   public StructSdtSDTCompraProductoQuimico( )
   {
      this( -1, new ModelContext( StructSdtSDTCompraProductoQuimico.class ));
   }

   public StructSdtSDTCompraProductoQuimico( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtSDTCompraProductoQuimico( java.util.Vector<StructSdtSDTCompraProductoQuimico_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTCompraProductoQuimico_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTCompraProductoQuimico_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTCompraProductoQuimico_Item> item = new java.util.Vector<>();
}

