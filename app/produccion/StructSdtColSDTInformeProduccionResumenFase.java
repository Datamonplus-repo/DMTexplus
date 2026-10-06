package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenFase", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenFase implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenFase( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenFase.class ));
   }

   public StructSdtColSDTInformeProduccionResumenFase( int remoteHandle ,
                                                       ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenFase( java.util.Vector<StructSdtSDTInformeProduccionResumenFase> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenFase",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenFase> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenFase> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenFase> item = new java.util.Vector<>();
}

