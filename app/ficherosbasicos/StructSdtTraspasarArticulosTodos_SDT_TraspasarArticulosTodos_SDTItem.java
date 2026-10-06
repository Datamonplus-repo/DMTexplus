package app.ficherosbasicos ;
import com.genexus.*;

public final  class StructSdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem.class ));
   }

   public StructSdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem( int remoteHandle ,
                                                                                ModelContext context )
   {
      gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artcod = "" ;
      gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artdsc = "" ;
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

   public boolean getSeleccion( )
   {
      return gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Seleccion ;
   }

   public void setSeleccion( boolean value )
   {
      gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_N = (byte)(0) ;
      gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Seleccion = value ;
   }

   public String getArtcod( )
   {
      return gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artcod ;
   }

   public void setArtcod( String value )
   {
      gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_N = (byte)(0) ;
      gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artcod = value ;
   }

   public String getArtdsc( )
   {
      return gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artdsc ;
   }

   public void setArtdsc( String value )
   {
      gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_N = (byte)(0) ;
      gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artdsc = value ;
   }

   protected byte gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_N ;
   protected String gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artcod ;
   protected String gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Artdsc ;
   protected boolean gxTv_SdtTraspasarArticulosTodos_SDT_TraspasarArticulosTodos_SDTItem_Seleccion ;
}

