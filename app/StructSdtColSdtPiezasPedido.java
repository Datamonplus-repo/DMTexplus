package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtPiezasPedido", namespace ="TexplusNET")
public final  class StructSdtColSdtPiezasPedido implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtPiezasPedido( )
   {
      this( -1, new ModelContext( StructSdtColSdtPiezasPedido.class ));
   }

   public StructSdtColSdtPiezasPedido( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColSdtPiezasPedido( java.util.Vector<StructSdtSdtPiezasPedido> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtPiezasPedido",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtPiezasPedido> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtPiezasPedido> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtPiezasPedido> item = new java.util.Vector<>();
}

