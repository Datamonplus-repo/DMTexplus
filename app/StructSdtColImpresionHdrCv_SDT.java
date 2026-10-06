package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColImpresionHdrCv_SDT", namespace ="TexplusNET")
public final  class StructSdtColImpresionHdrCv_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtColImpresionHdrCv_SDT( )
   {
      this( -1, new ModelContext( StructSdtColImpresionHdrCv_SDT.class ));
   }

   public StructSdtColImpresionHdrCv_SDT( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColImpresionHdrCv_SDT( java.util.Vector<StructSdtImpresionHdrCv_SDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ImpresionHdrCv_SDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtImpresionHdrCv_SDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtImpresionHdrCv_SDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtImpresionHdrCv_SDT> item = new java.util.Vector<>();
}

