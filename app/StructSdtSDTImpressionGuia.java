package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTImpressionGuia", namespace ="TexplusNET")
public final  class StructSdtSDTImpressionGuia implements Cloneable, java.io.Serializable
{
   public StructSdtSDTImpressionGuia( )
   {
      this( -1, new ModelContext( StructSdtSDTImpressionGuia.class ));
   }

   public StructSdtSDTImpressionGuia( int remoteHandle ,
                                      ModelContext context )
   {
   }

   public  StructSdtSDTImpressionGuia( java.util.Vector<StructSdtSDTImpressionGuia_Guia> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Guia",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTImpressionGuia_Guia> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTImpressionGuia_Guia> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTImpressionGuia_Guia> item = new java.util.Vector<>();
}

