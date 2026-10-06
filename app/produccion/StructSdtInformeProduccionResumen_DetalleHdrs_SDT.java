package app.produccion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "InformeProduccionResumen_DetalleHdrs_SDT", namespace ="TexplusNET")
public final  class StructSdtInformeProduccionResumen_DetalleHdrs_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtInformeProduccionResumen_DetalleHdrs_SDT( )
   {
      this( -1, new ModelContext( StructSdtInformeProduccionResumen_DetalleHdrs_SDT.class ));
   }

   public StructSdtInformeProduccionResumen_DetalleHdrs_SDT( int remoteHandle ,
                                                             ModelContext context )
   {
   }

   public  StructSdtInformeProduccionResumen_DetalleHdrs_SDT( java.util.Vector<StructSdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="InformeProduccionResumen_DetalleHdrs_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> item = new java.util.Vector<>();
}

