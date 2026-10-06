package app.ficherosbasicos ;
import com.genexus.*;

public final  class StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem( )
   {
      this( -1, new ModelContext( StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem.class ));
   }

   public StructSdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem( int remoteHandle ,
                                                                    ModelContext context )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc = "" ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext = "" ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom = value ;
   }

   public String getArtcod( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod ;
   }

   public void setArtcod( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod = value ;
   }

   public String getArtdsc( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc ;
   }

   public void setArtdsc( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc = value ;
   }

   public String getArtcodext( )
   {
      return gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext ;
   }

   public void setArtcodext( String value )
   {
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N = (byte)(0) ;
      gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext = value ;
   }

   protected byte gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_N ;
   protected int gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clicod ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprcod ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Emprnom ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Clinom ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcod ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artdsc ;
   protected String gxTv_SdtwCopiaSerieClienteSDT_wCopiaSerieClienteSDTItem_Artcodext ;
}

