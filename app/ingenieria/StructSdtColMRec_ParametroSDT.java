package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMRec_ParametroSDT", namespace ="TexplusNET")
public final  class StructSdtColMRec_ParametroSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMRec_ParametroSDT( )
   {
      this( -1, new ModelContext( StructSdtColMRec_ParametroSDT.class ));
   }

   public StructSdtColMRec_ParametroSDT( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColMRec_ParametroSDT( java.util.Vector<StructSdtMRec_ParametroSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MRec_ParametroSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMRec_ParametroSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMRec_ParametroSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMRec_ParametroSDT> item = new java.util.Vector<>();
}

