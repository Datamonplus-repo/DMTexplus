package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem( )
   {
      this( -1, new ModelContext( StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem.class ));
   }

   public StructSdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem( int remoteHandle ,
                                                                                  ModelContext context )
   {
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile = "" ;
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

   public boolean getSelop( )
   {
      return gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop ;
   }

   public void setSelop( boolean value )
   {
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_N = (byte)(0) ;
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop = value ;
   }

   public String getNomfile( )
   {
      return gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile ;
   }

   public void setNomfile( String value )
   {
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_N = (byte)(0) ;
      gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile = value ;
   }

   protected byte gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_N ;
   protected String gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Nomfile ;
   protected boolean gxTv_SdtSDT_CCtarc_SeleccionaArchivo_SDT_CCtarc_SeleccionaArchivoItem_Selop ;
}

