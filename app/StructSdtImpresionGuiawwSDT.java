package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ImpresionGuiawwSDT", namespace ="TexplusNET")
public final  class StructSdtImpresionGuiawwSDT implements Cloneable, java.io.Serializable
{
   public StructSdtImpresionGuiawwSDT( )
   {
      this( -1, new ModelContext( StructSdtImpresionGuiawwSDT.class ));
   }

   public StructSdtImpresionGuiawwSDT( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtImpresionGuiawwSDT( java.util.Vector<StructSdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ImpresionGuiawwSDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtImpresionGuiawwSDT_ImpresionGuiawwSDTItem> item = new java.util.Vector<>();
}

