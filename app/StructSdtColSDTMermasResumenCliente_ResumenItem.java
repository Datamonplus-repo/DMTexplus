package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTMermasResumenCliente.ResumenItem", namespace ="TexplusNET")
public final  class StructSdtColSDTMermasResumenCliente_ResumenItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTMermasResumenCliente_ResumenItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTMermasResumenCliente_ResumenItem.class ));
   }

   public StructSdtColSDTMermasResumenCliente_ResumenItem( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColSDTMermasResumenCliente_ResumenItem( java.util.Vector<StructSdtSDTMermasResumenCliente_ResumenItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTMermasResumenCliente.ResumenItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTMermasResumenCliente_ResumenItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTMermasResumenCliente_ResumenItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTMermasResumenCliente_ResumenItem> item = new java.util.Vector<>();
}

