package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMRec_DatoColumnaExisteSDT", namespace ="TexplusNET")
public final  class StructSdtColMRec_DatoColumnaExisteSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMRec_DatoColumnaExisteSDT( )
   {
      this( -1, new ModelContext( StructSdtColMRec_DatoColumnaExisteSDT.class ));
   }

   public StructSdtColMRec_DatoColumnaExisteSDT( int remoteHandle ,
                                                 ModelContext context )
   {
   }

   public  StructSdtColMRec_DatoColumnaExisteSDT( java.util.Vector<StructSdtMRec_DatoColumnaExisteSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MRec_DatoColumnaExisteSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMRec_DatoColumnaExisteSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMRec_DatoColumnaExisteSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMRec_DatoColumnaExisteSDT> item = new java.util.Vector<>();
}

