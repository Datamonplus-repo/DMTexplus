package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTInformeProduccionResumenOperario", namespace ="TexplusNET")
public final  class StructSdtColSDTInformeProduccionResumenOperario implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTInformeProduccionResumenOperario( )
   {
      this( -1, new ModelContext( StructSdtColSDTInformeProduccionResumenOperario.class ));
   }

   public StructSdtColSDTInformeProduccionResumenOperario( int remoteHandle ,
                                                           ModelContext context )
   {
   }

   public  StructSdtColSDTInformeProduccionResumenOperario( java.util.Vector<StructSdtSDTInformeProduccionResumenOperario> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTInformeProduccionResumenOperario",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTInformeProduccionResumenOperario> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInformeProduccionResumenOperario> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInformeProduccionResumenOperario> item = new java.util.Vector<>();
}

