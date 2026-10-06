package app.ingenieria ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColMRec_AlertaGraficaSDT", namespace ="TexplusNET")
public final  class StructSdtColMRec_AlertaGraficaSDT implements Cloneable, java.io.Serializable
{
   public StructSdtColMRec_AlertaGraficaSDT( )
   {
      this( -1, new ModelContext( StructSdtColMRec_AlertaGraficaSDT.class ));
   }

   public StructSdtColMRec_AlertaGraficaSDT( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtColMRec_AlertaGraficaSDT( java.util.Vector<StructSdtMRec_AlertaGraficaSDT> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="MRec_AlertaGraficaSDT",namespace="TexplusNET")
   public java.util.Vector<StructSdtMRec_AlertaGraficaSDT> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtMRec_AlertaGraficaSDT> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtMRec_AlertaGraficaSDT> item = new java.util.Vector<>();
}

