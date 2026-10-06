package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMRec_AnalisisDetalleSDT", namespace ="TexplusNET")
public final  class StructSdtColMRec_AnalisisDetalleSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMRec_AnalisisDetalleSDT( )
   {
      this( -1, new ModelContext( StructSdtColMRec_AnalisisDetalleSDT.class ));
   }

   public StructSdtColMRec_AnalisisDetalleSDT( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtColMRec_AnalisisDetalleSDT( java.util.Vector<StructSdtMRec_AnalisisDetalleSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MRec_AnalisisDetalleSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMRec_AnalisisDetalleSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMRec_AnalisisDetalleSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMRec_AnalisisDetalleSDT> item = new java.util.Vector<>();
}

