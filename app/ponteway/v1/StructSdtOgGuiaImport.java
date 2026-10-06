package app.ponteway.v1 ;
import com.genexus.*;

public final  class StructSdtOgGuiaImport implements Cloneable, java.io.Serializable
{
   public StructSdtOgGuiaImport( )
   {
      this( -1, new ModelContext( StructSdtOgGuiaImport.class ));
   }

   public StructSdtOgGuiaImport( int remoteHandle ,
                                 ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtOgGuiaImport_Ogemprcod = "" ;
      gxTv_SdtOgGuiaImport_Ogfecha = cal.getTime() ;
      gxTv_SdtOgGuiaImport_Ogcodart = "" ;
      gxTv_SdtOgGuiaImport_Ogquant = new java.math.BigDecimal(0) ;
      gxTv_SdtOgGuiaImport_Ogquant_ = new java.math.BigDecimal(0) ;
      gxTv_SdtOgGuiaImport_Ogunidad = "" ;
      gxTv_SdtOgGuiaImport_Ogunidad_ = "" ;
      gxTv_SdtOgGuiaImport_Ogreferen = "" ;
      gxTv_SdtOgGuiaImport_Ogreclam = "" ;
      gxTv_SdtOgGuiaImport_Oglote = "" ;
      gxTv_SdtOgGuiaImport_Ogjogo = "" ;
      gxTv_SdtOgGuiaImport_Ogpoleg = "" ;
      gxTv_SdtOgGuiaImport_Ogfio = "" ;
      gxTv_SdtOgGuiaImport_Ogfio_ = "" ;
      gxTv_SdtOgGuiaImport_Ogmaqui = "" ;
      gxTv_SdtOgGuiaImport_Ogentrada = "" ;
      gxTv_SdtOgGuiaImport_Ogvossar = "" ;
      gxTv_SdtOgGuiaImport_Ogarticr = "" ;
      gxTv_SdtOgGuiaImport_Ogartiac = "" ;
      gxTv_SdtOgGuiaImport_Oglocalizac = "" ;
      gxTv_SdtOgGuiaImport_Oglocalizc_ = "" ;
      gxTv_SdtOgGuiaImport_Mode = "" ;
      gxTv_SdtOgGuiaImport_Ogemprcod_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogfecha_Z = cal.getTime() ;
      gxTv_SdtOgGuiaImport_Ogcodart_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogquant_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtOgGuiaImport_Ogquant__Z = new java.math.BigDecimal(0) ;
      gxTv_SdtOgGuiaImport_Ogunidad_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogunidad__Z = "" ;
      gxTv_SdtOgGuiaImport_Ogreferen_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogreclam_Z = "" ;
      gxTv_SdtOgGuiaImport_Oglote_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogjogo_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogpoleg_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogfio_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogfio__Z = "" ;
      gxTv_SdtOgGuiaImport_Ogmaqui_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogentrada_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogvossar_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogarticr_Z = "" ;
      gxTv_SdtOgGuiaImport_Ogartiac_Z = "" ;
      gxTv_SdtOgGuiaImport_Oglocalizac_Z = "" ;
      gxTv_SdtOgGuiaImport_Oglocalizc__Z = "" ;
      gxTv_SdtOgGuiaImport_Ognmrguia_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogserie_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogfecha_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogcodart_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogrolos_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogrolos__N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogquant_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogquant__N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogunidad_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogunidad__N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogreferen_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogreclam_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Oglote_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogjogo_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogpoleg_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogfio_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogfio__N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogmaqui_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogentrada_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogvossar_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogarticr_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogartiac_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Ogareccod_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Oglocalizac_N = (byte)(1) ;
      gxTv_SdtOgGuiaImport_Oglocalizc__N = (byte)(1) ;
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

   public long getOglinha( )
   {
      return gxTv_SdtOgGuiaImport_Oglinha ;
   }

   public void setOglinha( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglinha = value ;
   }

   public String getOgemprcod( )
   {
      return gxTv_SdtOgGuiaImport_Ogemprcod ;
   }

   public void setOgemprcod( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogemprcod = value ;
   }

   public long getOgclicod( )
   {
      return gxTv_SdtOgGuiaImport_Ogclicod ;
   }

   public void setOgclicod( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogclicod = value ;
   }

   public long getOgnmrguia( )
   {
      return gxTv_SdtOgGuiaImport_Ognmrguia ;
   }

   public void setOgnmrguia( long value )
   {
      gxTv_SdtOgGuiaImport_Ognmrguia_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ognmrguia = value ;
   }

   public short getOgserie( )
   {
      return gxTv_SdtOgGuiaImport_Ogserie ;
   }

   public void setOgserie( short value )
   {
      gxTv_SdtOgGuiaImport_Ogserie_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogserie = value ;
   }

   public java.util.Date getOgfecha( )
   {
      return gxTv_SdtOgGuiaImport_Ogfecha ;
   }

   public void setOgfecha( java.util.Date value )
   {
      gxTv_SdtOgGuiaImport_Ogfecha_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogfecha = value ;
   }

   public String getOgcodart( )
   {
      return gxTv_SdtOgGuiaImport_Ogcodart ;
   }

   public void setOgcodart( String value )
   {
      gxTv_SdtOgGuiaImport_Ogcodart_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogcodart = value ;
   }

   public short getOgrolos( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos ;
   }

   public void setOgrolos( short value )
   {
      gxTv_SdtOgGuiaImport_Ogrolos_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogrolos = value ;
   }

   public short getOgrolos_( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos_ ;
   }

   public void setOgrolos_( short value )
   {
      gxTv_SdtOgGuiaImport_Ogrolos__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogrolos_ = value ;
   }

   public java.math.BigDecimal getOgquant( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant ;
   }

   public void setOgquant( java.math.BigDecimal value )
   {
      gxTv_SdtOgGuiaImport_Ogquant_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogquant = value ;
   }

   public java.math.BigDecimal getOgquant_( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant_ ;
   }

   public void setOgquant_( java.math.BigDecimal value )
   {
      gxTv_SdtOgGuiaImport_Ogquant__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogquant_ = value ;
   }

   public String getOgunidad( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad ;
   }

   public void setOgunidad( String value )
   {
      gxTv_SdtOgGuiaImport_Ogunidad_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogunidad = value ;
   }

   public String getOgunidad_( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad_ ;
   }

   public void setOgunidad_( String value )
   {
      gxTv_SdtOgGuiaImport_Ogunidad__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogunidad_ = value ;
   }

   public String getOgreferen( )
   {
      return gxTv_SdtOgGuiaImport_Ogreferen ;
   }

   public void setOgreferen( String value )
   {
      gxTv_SdtOgGuiaImport_Ogreferen_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogreferen = value ;
   }

   public String getOgreclam( )
   {
      return gxTv_SdtOgGuiaImport_Ogreclam ;
   }

   public void setOgreclam( String value )
   {
      gxTv_SdtOgGuiaImport_Ogreclam_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogreclam = value ;
   }

   public String getOglote( )
   {
      return gxTv_SdtOgGuiaImport_Oglote ;
   }

   public void setOglote( String value )
   {
      gxTv_SdtOgGuiaImport_Oglote_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglote = value ;
   }

   public String getOgjogo( )
   {
      return gxTv_SdtOgGuiaImport_Ogjogo ;
   }

   public void setOgjogo( String value )
   {
      gxTv_SdtOgGuiaImport_Ogjogo_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogjogo = value ;
   }

   public String getOgpoleg( )
   {
      return gxTv_SdtOgGuiaImport_Ogpoleg ;
   }

   public void setOgpoleg( String value )
   {
      gxTv_SdtOgGuiaImport_Ogpoleg_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogpoleg = value ;
   }

   public String getOgfio( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio ;
   }

   public void setOgfio( String value )
   {
      gxTv_SdtOgGuiaImport_Ogfio_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogfio = value ;
   }

   public String getOgfio_( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio_ ;
   }

   public void setOgfio_( String value )
   {
      gxTv_SdtOgGuiaImport_Ogfio__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogfio_ = value ;
   }

   public String getOgmaqui( )
   {
      return gxTv_SdtOgGuiaImport_Ogmaqui ;
   }

   public void setOgmaqui( String value )
   {
      gxTv_SdtOgGuiaImport_Ogmaqui_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogmaqui = value ;
   }

   public String getOgentrada( )
   {
      return gxTv_SdtOgGuiaImport_Ogentrada ;
   }

   public void setOgentrada( String value )
   {
      gxTv_SdtOgGuiaImport_Ogentrada_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogentrada = value ;
   }

   public String getOgvossar( )
   {
      return gxTv_SdtOgGuiaImport_Ogvossar ;
   }

   public void setOgvossar( String value )
   {
      gxTv_SdtOgGuiaImport_Ogvossar_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogvossar = value ;
   }

   public String getOgarticr( )
   {
      return gxTv_SdtOgGuiaImport_Ogarticr ;
   }

   public void setOgarticr( String value )
   {
      gxTv_SdtOgGuiaImport_Ogarticr_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogarticr = value ;
   }

   public String getOgartiac( )
   {
      return gxTv_SdtOgGuiaImport_Ogartiac ;
   }

   public void setOgartiac( String value )
   {
      gxTv_SdtOgGuiaImport_Ogartiac_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogartiac = value ;
   }

   public int getOgareccod( )
   {
      return gxTv_SdtOgGuiaImport_Ogareccod ;
   }

   public void setOgareccod( int value )
   {
      gxTv_SdtOgGuiaImport_Ogareccod_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogareccod = value ;
   }

   public String getOglocalizac( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizac ;
   }

   public void setOglocalizac( String value )
   {
      gxTv_SdtOgGuiaImport_Oglocalizac_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglocalizac = value ;
   }

   public String getOglocalizc_( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizc_ ;
   }

   public void setOglocalizc_( String value )
   {
      gxTv_SdtOgGuiaImport_Oglocalizc__N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglocalizc_ = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtOgGuiaImport_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtOgGuiaImport_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Initialized = value ;
   }

   public long getOglinha_Z( )
   {
      return gxTv_SdtOgGuiaImport_Oglinha_Z ;
   }

   public void setOglinha_Z( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglinha_Z = value ;
   }

   public String getOgemprcod_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogemprcod_Z ;
   }

   public void setOgemprcod_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogemprcod_Z = value ;
   }

   public long getOgclicod_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogclicod_Z ;
   }

   public void setOgclicod_Z( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogclicod_Z = value ;
   }

   public long getOgnmrguia_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ognmrguia_Z ;
   }

   public void setOgnmrguia_Z( long value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ognmrguia_Z = value ;
   }

   public short getOgserie_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogserie_Z ;
   }

   public void setOgserie_Z( short value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogserie_Z = value ;
   }

   public java.util.Date getOgfecha_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogfecha_Z ;
   }

   public void setOgfecha_Z( java.util.Date value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogfecha_Z = value ;
   }

   public String getOgcodart_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogcodart_Z ;
   }

   public void setOgcodart_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogcodart_Z = value ;
   }

   public short getOgrolos_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos_Z ;
   }

   public void setOgrolos_Z( short value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogrolos_Z = value ;
   }

   public short getOgrolos__Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos__Z ;
   }

   public void setOgrolos__Z( short value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogrolos__Z = value ;
   }

   public java.math.BigDecimal getOgquant_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant_Z ;
   }

   public void setOgquant_Z( java.math.BigDecimal value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogquant_Z = value ;
   }

   public java.math.BigDecimal getOgquant__Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant__Z ;
   }

   public void setOgquant__Z( java.math.BigDecimal value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogquant__Z = value ;
   }

   public String getOgunidad_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad_Z ;
   }

   public void setOgunidad_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogunidad_Z = value ;
   }

   public String getOgunidad__Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad__Z ;
   }

   public void setOgunidad__Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogunidad__Z = value ;
   }

   public String getOgreferen_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogreferen_Z ;
   }

   public void setOgreferen_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogreferen_Z = value ;
   }

   public String getOgreclam_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogreclam_Z ;
   }

   public void setOgreclam_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogreclam_Z = value ;
   }

   public String getOglote_Z( )
   {
      return gxTv_SdtOgGuiaImport_Oglote_Z ;
   }

   public void setOglote_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglote_Z = value ;
   }

   public String getOgjogo_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogjogo_Z ;
   }

   public void setOgjogo_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogjogo_Z = value ;
   }

   public String getOgpoleg_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogpoleg_Z ;
   }

   public void setOgpoleg_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogpoleg_Z = value ;
   }

   public String getOgfio_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio_Z ;
   }

   public void setOgfio_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogfio_Z = value ;
   }

   public String getOgfio__Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio__Z ;
   }

   public void setOgfio__Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogfio__Z = value ;
   }

   public String getOgmaqui_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogmaqui_Z ;
   }

   public void setOgmaqui_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogmaqui_Z = value ;
   }

   public String getOgentrada_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogentrada_Z ;
   }

   public void setOgentrada_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogentrada_Z = value ;
   }

   public String getOgvossar_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogvossar_Z ;
   }

   public void setOgvossar_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogvossar_Z = value ;
   }

   public String getOgarticr_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogarticr_Z ;
   }

   public void setOgarticr_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogarticr_Z = value ;
   }

   public String getOgartiac_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogartiac_Z ;
   }

   public void setOgartiac_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogartiac_Z = value ;
   }

   public int getOgareccod_Z( )
   {
      return gxTv_SdtOgGuiaImport_Ogareccod_Z ;
   }

   public void setOgareccod_Z( int value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogareccod_Z = value ;
   }

   public String getOglocalizac_Z( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizac_Z ;
   }

   public void setOglocalizac_Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglocalizac_Z = value ;
   }

   public String getOglocalizc__Z( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizc__Z ;
   }

   public void setOglocalizc__Z( String value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglocalizc__Z = value ;
   }

   public byte getOgnmrguia_N( )
   {
      return gxTv_SdtOgGuiaImport_Ognmrguia_N ;
   }

   public void setOgnmrguia_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ognmrguia_N = value ;
   }

   public byte getOgserie_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogserie_N ;
   }

   public void setOgserie_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogserie_N = value ;
   }

   public byte getOgfecha_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogfecha_N ;
   }

   public void setOgfecha_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogfecha_N = value ;
   }

   public byte getOgcodart_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogcodart_N ;
   }

   public void setOgcodart_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogcodart_N = value ;
   }

   public byte getOgrolos_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos_N ;
   }

   public void setOgrolos_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogrolos_N = value ;
   }

   public byte getOgrolos__N( )
   {
      return gxTv_SdtOgGuiaImport_Ogrolos__N ;
   }

   public void setOgrolos__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogrolos__N = value ;
   }

   public byte getOgquant_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant_N ;
   }

   public void setOgquant_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogquant_N = value ;
   }

   public byte getOgquant__N( )
   {
      return gxTv_SdtOgGuiaImport_Ogquant__N ;
   }

   public void setOgquant__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogquant__N = value ;
   }

   public byte getOgunidad_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad_N ;
   }

   public void setOgunidad_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogunidad_N = value ;
   }

   public byte getOgunidad__N( )
   {
      return gxTv_SdtOgGuiaImport_Ogunidad__N ;
   }

   public void setOgunidad__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogunidad__N = value ;
   }

   public byte getOgreferen_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogreferen_N ;
   }

   public void setOgreferen_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogreferen_N = value ;
   }

   public byte getOgreclam_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogreclam_N ;
   }

   public void setOgreclam_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogreclam_N = value ;
   }

   public byte getOglote_N( )
   {
      return gxTv_SdtOgGuiaImport_Oglote_N ;
   }

   public void setOglote_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglote_N = value ;
   }

   public byte getOgjogo_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogjogo_N ;
   }

   public void setOgjogo_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogjogo_N = value ;
   }

   public byte getOgpoleg_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogpoleg_N ;
   }

   public void setOgpoleg_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogpoleg_N = value ;
   }

   public byte getOgfio_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio_N ;
   }

   public void setOgfio_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogfio_N = value ;
   }

   public byte getOgfio__N( )
   {
      return gxTv_SdtOgGuiaImport_Ogfio__N ;
   }

   public void setOgfio__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogfio__N = value ;
   }

   public byte getOgmaqui_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogmaqui_N ;
   }

   public void setOgmaqui_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogmaqui_N = value ;
   }

   public byte getOgentrada_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogentrada_N ;
   }

   public void setOgentrada_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogentrada_N = value ;
   }

   public byte getOgvossar_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogvossar_N ;
   }

   public void setOgvossar_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogvossar_N = value ;
   }

   public byte getOgarticr_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogarticr_N ;
   }

   public void setOgarticr_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogarticr_N = value ;
   }

   public byte getOgartiac_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogartiac_N ;
   }

   public void setOgartiac_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogartiac_N = value ;
   }

   public byte getOgareccod_N( )
   {
      return gxTv_SdtOgGuiaImport_Ogareccod_N ;
   }

   public void setOgareccod_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Ogareccod_N = value ;
   }

   public byte getOglocalizac_N( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizac_N ;
   }

   public void setOglocalizac_N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglocalizac_N = value ;
   }

   public byte getOglocalizc__N( )
   {
      return gxTv_SdtOgGuiaImport_Oglocalizc__N ;
   }

   public void setOglocalizc__N( byte value )
   {
      gxTv_SdtOgGuiaImport_N = (byte)(0) ;
      gxTv_SdtOgGuiaImport_Oglocalizc__N = value ;
   }

   protected byte gxTv_SdtOgGuiaImport_Ognmrguia_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogserie_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogfecha_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogcodart_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogrolos_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogrolos__N ;
   protected byte gxTv_SdtOgGuiaImport_Ogquant_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogquant__N ;
   protected byte gxTv_SdtOgGuiaImport_Ogunidad_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogunidad__N ;
   protected byte gxTv_SdtOgGuiaImport_Ogreferen_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogreclam_N ;
   protected byte gxTv_SdtOgGuiaImport_Oglote_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogjogo_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogpoleg_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogfio_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogfio__N ;
   protected byte gxTv_SdtOgGuiaImport_Ogmaqui_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogentrada_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogvossar_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogarticr_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogartiac_N ;
   protected byte gxTv_SdtOgGuiaImport_Ogareccod_N ;
   protected byte gxTv_SdtOgGuiaImport_Oglocalizac_N ;
   protected byte gxTv_SdtOgGuiaImport_Oglocalizc__N ;
   private byte gxTv_SdtOgGuiaImport_N ;
   protected short gxTv_SdtOgGuiaImport_Ogserie ;
   protected short gxTv_SdtOgGuiaImport_Ogrolos ;
   protected short gxTv_SdtOgGuiaImport_Ogrolos_ ;
   protected short gxTv_SdtOgGuiaImport_Initialized ;
   protected short gxTv_SdtOgGuiaImport_Ogserie_Z ;
   protected short gxTv_SdtOgGuiaImport_Ogrolos_Z ;
   protected short gxTv_SdtOgGuiaImport_Ogrolos__Z ;
   protected int gxTv_SdtOgGuiaImport_Ogareccod ;
   protected int gxTv_SdtOgGuiaImport_Ogareccod_Z ;
   protected long gxTv_SdtOgGuiaImport_Oglinha ;
   protected long gxTv_SdtOgGuiaImport_Ogclicod ;
   protected long gxTv_SdtOgGuiaImport_Ognmrguia ;
   protected long gxTv_SdtOgGuiaImport_Oglinha_Z ;
   protected long gxTv_SdtOgGuiaImport_Ogclicod_Z ;
   protected long gxTv_SdtOgGuiaImport_Ognmrguia_Z ;
   protected String gxTv_SdtOgGuiaImport_Mode ;
   protected String gxTv_SdtOgGuiaImport_Ogemprcod ;
   protected String gxTv_SdtOgGuiaImport_Ogcodart ;
   protected String gxTv_SdtOgGuiaImport_Ogunidad ;
   protected String gxTv_SdtOgGuiaImport_Ogunidad_ ;
   protected String gxTv_SdtOgGuiaImport_Ogreferen ;
   protected String gxTv_SdtOgGuiaImport_Ogreclam ;
   protected String gxTv_SdtOgGuiaImport_Oglote ;
   protected String gxTv_SdtOgGuiaImport_Ogjogo ;
   protected String gxTv_SdtOgGuiaImport_Ogpoleg ;
   protected String gxTv_SdtOgGuiaImport_Ogfio ;
   protected String gxTv_SdtOgGuiaImport_Ogfio_ ;
   protected String gxTv_SdtOgGuiaImport_Ogmaqui ;
   protected String gxTv_SdtOgGuiaImport_Ogentrada ;
   protected String gxTv_SdtOgGuiaImport_Ogvossar ;
   protected String gxTv_SdtOgGuiaImport_Ogarticr ;
   protected String gxTv_SdtOgGuiaImport_Ogartiac ;
   protected String gxTv_SdtOgGuiaImport_Oglocalizac ;
   protected String gxTv_SdtOgGuiaImport_Oglocalizc_ ;
   protected String gxTv_SdtOgGuiaImport_Ogemprcod_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogcodart_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogunidad_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogunidad__Z ;
   protected String gxTv_SdtOgGuiaImport_Ogreferen_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogreclam_Z ;
   protected String gxTv_SdtOgGuiaImport_Oglote_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogjogo_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogpoleg_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogfio_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogfio__Z ;
   protected String gxTv_SdtOgGuiaImport_Ogmaqui_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogentrada_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogvossar_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogarticr_Z ;
   protected String gxTv_SdtOgGuiaImport_Ogartiac_Z ;
   protected String gxTv_SdtOgGuiaImport_Oglocalizac_Z ;
   protected String gxTv_SdtOgGuiaImport_Oglocalizc__Z ;
   protected java.util.Date gxTv_SdtOgGuiaImport_Ogfecha ;
   protected java.math.BigDecimal gxTv_SdtOgGuiaImport_Ogquant ;
   protected java.math.BigDecimal gxTv_SdtOgGuiaImport_Ogquant_ ;
   protected java.util.Date gxTv_SdtOgGuiaImport_Ogfecha_Z ;
   protected java.math.BigDecimal gxTv_SdtOgGuiaImport_Ogquant_Z ;
   protected java.math.BigDecimal gxTv_SdtOgGuiaImport_Ogquant__Z ;
}

