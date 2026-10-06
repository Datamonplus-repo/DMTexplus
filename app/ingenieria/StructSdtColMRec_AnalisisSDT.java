package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMRec_AnalisisSDT", namespace ="TexplusNET")
public final  class StructSdtColMRec_AnalisisSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMRec_AnalisisSDT( )
   {
      this( -1, new ModelContext( StructSdtColMRec_AnalisisSDT.class ));
   }

   public StructSdtColMRec_AnalisisSDT( int remoteHandle ,
                                        ModelContext context )
   {
   }

   public  StructSdtColMRec_AnalisisSDT( java.util.Vector<StructSdtMRec_AnalisisSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MRec_AnalisisSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMRec_AnalisisSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMRec_AnalisisSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMRec_AnalisisSDT> item = new java.util.Vector<>();
}

