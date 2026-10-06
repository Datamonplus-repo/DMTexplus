package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSdtFasePedido", namespace ="TexplusNET")
public final  class StructSdtColSdtFasePedido implements Cloneable, java.io.Serializable
{
   public StructSdtColSdtFasePedido( )
   {
      this( -1, new ModelContext( StructSdtColSdtFasePedido.class ));
   }

   public StructSdtColSdtFasePedido( int remoteHandle ,
                                     ModelContext context )
   {
   }

   public  StructSdtColSdtFasePedido( java.util.Vector<StructSdtSdtFasePedido> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SdtFasePedido",namespace="TexplusNET")
   public java.util.Vector<StructSdtSdtFasePedido> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSdtFasePedido> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSdtFasePedido> item = new java.util.Vector<>();
}

