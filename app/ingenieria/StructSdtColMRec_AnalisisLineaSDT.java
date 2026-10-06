package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMRec_AnalisisLineaSDT", namespace ="TexplusNET")
public final  class StructSdtColMRec_AnalisisLineaSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMRec_AnalisisLineaSDT( )
   {
      this( -1, new ModelContext( StructSdtColMRec_AnalisisLineaSDT.class ));
   }

   public StructSdtColMRec_AnalisisLineaSDT( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtColMRec_AnalisisLineaSDT( java.util.Vector<StructSdtMRec_AnalisisLineaSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MRec_AnalisisLineaSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMRec_AnalisisLineaSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMRec_AnalisisLineaSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMRec_AnalisisLineaSDT> item = new java.util.Vector<>();
}

