package app.controlcalidadhtd ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDT_CCtarc_SeleccionaArchivo", namespace ="TexplusNET")
public final  class StructSdtSDT_CCtarc_SeleccionaArchivo implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_CCtarc_SeleccionaArchivo( )
   {
      this( -1, new ModelContext( StructSdtSDT_CCtarc_SeleccionaArchivo.class ));
   }

   public StructSdtSDT_CCtarc_SeleccionaArchivo( int remoteHandle ,
                                                 ModelContext context )
   {
   }

   public  StructSdtSDT_CCtarc_SeleccionaArchivo( java.util.Vector<StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDT_CCtarc_SeleccionaArchivoItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem> item = new java.util.Vector<>();
}

