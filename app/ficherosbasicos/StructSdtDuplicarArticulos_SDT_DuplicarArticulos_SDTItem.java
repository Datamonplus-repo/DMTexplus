package app.ficherosbasicos ;
import com.genexus.*;

public final  class StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem.class ));
   }

   public StructSdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem( int remoteHandle ,
                                                                    ModelContext context )
   {
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod = "" ;
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc = "" ;
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

   public boolean getSeleccionar( )
   {
      return gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N = (byte)(0) ;
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar = value ;
   }

   public String getArtcod( )
   {
      return gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod ;
   }

   public void setArtcod( String value )
   {
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N = (byte)(0) ;
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod = value ;
   }

   public String getArtdsc( )
   {
      return gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc ;
   }

   public void setArtdsc( String value )
   {
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N = (byte)(0) ;
      gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc = value ;
   }

   protected byte gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_N ;
   protected String gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artcod ;
   protected String gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Artdsc ;
   protected boolean gxTv_SdtDuplicarArticulos_SDT_DuplicarArticulos_SDTItem_Seleccionar ;
}

