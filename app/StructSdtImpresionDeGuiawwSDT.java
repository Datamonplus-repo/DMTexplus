package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ImpresionDeGuiawwSDT", namespace ="TexplusNET")
public final  class StructSdtImpresionDeGuiawwSDT implements Cloneable, java.io.Serializable
{
   public StructSdtImpresionDeGuiawwSDT( )
   {
      this( -1, new ModelContext( StructSdtImpresionDeGuiawwSDT.class ));
   }

   public StructSdtImpresionDeGuiawwSDT( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtImpresionDeGuiawwSDT( java.util.Vector<StructSdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ImpresionDeGuiawwSDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> item = new java.util.Vector<>();
}

