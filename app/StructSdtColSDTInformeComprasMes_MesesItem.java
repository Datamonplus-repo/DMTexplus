package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeComprasMes.MesesItem", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeComprasMes_MesesItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeComprasMes_MesesItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeComprasMes_MesesItem.class ));
   }

   public StructSdtColSDTInformeComprasMes_MesesItem( int remoteHandle ,
                                                      ModelContext context )
   {
   }

   public  StructSdtColSDTInformeComprasMes_MesesItem( java.util.Vector<StructSdtSDTInformeComprasMes_MesesItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeComprasMes.MesesItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeComprasMes_MesesItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeComprasMes_MesesItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeComprasMes_MesesItem> item = new java.util.Vector<>();
}

