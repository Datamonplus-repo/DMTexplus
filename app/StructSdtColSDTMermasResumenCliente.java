package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTMermasResumenCliente", namespace ="TexplusNET")
public final  class StructSdtColSDTMermasResumenCliente implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTMermasResumenCliente( )
   {
      this( -1, new ModelContext( StructSdtColSDTMermasResumenCliente.class ));
   }

   public StructSdtColSDTMermasResumenCliente( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtColSDTMermasResumenCliente( java.util.Vector<StructSdtSDTMermasResumenCliente> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTMermasResumenCliente",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTMermasResumenCliente> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTMermasResumenCliente> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTMermasResumenCliente> item = new java.util.Vector<>();
}

