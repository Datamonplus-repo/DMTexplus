package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColImpresionHdrCv_SDT.Numero", namespace ="TexplusNET")
public final  class StructSdtColImpresionHdrCv_SDT_Numero implements Cloneable, java.io.Serializable
{
   public StructSdtColImpresionHdrCv_SDT_Numero( )
   {
      this( -1, new ModelContext( StructSdtColImpresionHdrCv_SDT_Numero.class ));
   }

   public StructSdtColImpresionHdrCv_SDT_Numero( int remoteHandle ,
                                                 ModelContext context )
   {
   }

   public  StructSdtColImpresionHdrCv_SDT_Numero( java.util.Vector<StructSdtImpresionHdrCv_SDT_Numero> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ImpresionHdrCv_SDT.Numero",namespace="TexplusNET")
   public java.util.Vector<StructSdtImpresionHdrCv_SDT_Numero> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtImpresionHdrCv_SDT_Numero> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtImpresionHdrCv_SDT_Numero> item = new java.util.Vector<>();
}

