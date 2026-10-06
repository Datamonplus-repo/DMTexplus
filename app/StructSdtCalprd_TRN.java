package app ;
import com.genexus.*;

public final  class StructSdtCalprd_TRN implements Cloneable, java.io.Serializable
{
   public StructSdtCalprd_TRN( )
   {
      this( -1, new ModelContext( StructSdtCalprd_TRN.class ));
   }

   public StructSdtCalprd_TRN( int remoteHandle ,
                               ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtCalprd_TRN_Emprcod = "" ;
      gxTv_SdtCalprd_TRN_Albpropri = "" ;
      gxTv_SdtCalprd_TRN_Albprofch = cal.getTime() ;
      gxTv_SdtCalprd_TRN_Albfecsal = cal.getTime() ;
      gxTv_SdtCalprd_TRN_Albhorsal = "" ;
      gxTv_SdtCalprd_TRN_Albusu = "" ;
      gxTv_SdtCalprd_TRN_Guiremcln = "" ;
      gxTv_SdtCalprd_TRN_Trnnom = "" ;
      gxTv_SdtCalprd_TRN_Albmat = "" ;
      gxTv_SdtCalprd_TRN_Albsec = "" ;
      gxTv_SdtCalprd_TRN_Alblic = "" ;
      gxTv_SdtCalprd_TRN_Albproat = "" ;
      gxTv_SdtCalprd_TRN_Albhhfm = cal.getTime() ;
      gxTv_SdtCalprd_TRN_Albgrosst = new java.math.BigDecimal(0) ;
      gxTv_SdtCalprd_TRN_Albtrnnc = "" ;
      gxTv_SdtCalprd_TRN_Albfmd = "" ;
      gxTv_SdtCalprd_TRN_Albtrnnm = "" ;
      gxTv_SdtCalprd_TRN_Albfmdc = "" ;
      gxTv_SdtCalprd_TRN_Albtrndm = "" ;
      gxTv_SdtCalprd_TRN_Albmarca = "" ;
      gxTv_SdtCalprd_TRN_Albivacod = "" ;
      gxTv_SdtCalprd_TRN_Albcolca = "" ;
      gxTv_SdtCalprd_TRN_Albcambio = new java.math.BigDecimal(0) ;
      gxTv_SdtCalprd_TRN_Albmottr = "" ;
      gxTv_SdtCalprd_TRN_Albobscb = "" ;
      gxTv_SdtCalprd_TRN_Albmarco = "" ;
      gxTv_SdtCalprd_TRN_Albocomp = "" ;
      gxTv_SdtCalprd_TRN_Trnnif = "" ;
      gxTv_SdtCalprd_TRN_Albdivtcod = "" ;
      gxTv_SdtCalprd_TRN_Albdivabr = "" ;
      gxTv_SdtCalprd_TRN_Emprguirem = "" ;
      gxTv_SdtCalprd_TRN_Guiremdivt = "" ;
      gxTv_SdtCalprd_TRN_Emprnom = "" ;
      gxTv_SdtCalprd_TRN_Mode = "" ;
      gxTv_SdtCalprd_TRN_Emprcod_Z = "" ;
      gxTv_SdtCalprd_TRN_Albpropri_Z = "" ;
      gxTv_SdtCalprd_TRN_Albprofch_Z = cal.getTime() ;
      gxTv_SdtCalprd_TRN_Albfecsal_Z = cal.getTime() ;
      gxTv_SdtCalprd_TRN_Albhorsal_Z = "" ;
      gxTv_SdtCalprd_TRN_Albusu_Z = "" ;
      gxTv_SdtCalprd_TRN_Guiremcln_Z = "" ;
      gxTv_SdtCalprd_TRN_Trnnom_Z = "" ;
      gxTv_SdtCalprd_TRN_Albmat_Z = "" ;
      gxTv_SdtCalprd_TRN_Albsec_Z = "" ;
      gxTv_SdtCalprd_TRN_Alblic_Z = "" ;
      gxTv_SdtCalprd_TRN_Albproat_Z = "" ;
      gxTv_SdtCalprd_TRN_Albhhfm_Z = cal.getTime() ;
      gxTv_SdtCalprd_TRN_Albgrosst_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtCalprd_TRN_Albtrnnc_Z = "" ;
      gxTv_SdtCalprd_TRN_Albfmd_Z = "" ;
      gxTv_SdtCalprd_TRN_Albtrnnm_Z = "" ;
      gxTv_SdtCalprd_TRN_Albfmdc_Z = "" ;
      gxTv_SdtCalprd_TRN_Albtrndm_Z = "" ;
      gxTv_SdtCalprd_TRN_Albmarca_Z = "" ;
      gxTv_SdtCalprd_TRN_Albivacod_Z = "" ;
      gxTv_SdtCalprd_TRN_Albcolca_Z = "" ;
      gxTv_SdtCalprd_TRN_Albcambio_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtCalprd_TRN_Albmottr_Z = "" ;
      gxTv_SdtCalprd_TRN_Albobscb_Z = "" ;
      gxTv_SdtCalprd_TRN_Albmarco_Z = "" ;
      gxTv_SdtCalprd_TRN_Albocomp_Z = "" ;
      gxTv_SdtCalprd_TRN_Trnnif_Z = "" ;
      gxTv_SdtCalprd_TRN_Albdivtcod_Z = "" ;
      gxTv_SdtCalprd_TRN_Albdivabr_Z = "" ;
      gxTv_SdtCalprd_TRN_Emprguirem_Z = "" ;
      gxTv_SdtCalprd_TRN_Guiremdivt_Z = "" ;
      gxTv_SdtCalprd_TRN_Emprnom_Z = "" ;
      gxTv_SdtCalprd_TRN_Albdomenv_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Trnnom_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albfmd_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Trnnif_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albdivtcod_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albdivabr_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Albdivcod_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Busdomenv_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Guiremdom_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Guiremdivt_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Guiremdiv_N = (byte)(1) ;
      gxTv_SdtCalprd_TRN_Emprnom_N = (byte)(1) ;
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
      return gxTv_SdtCalprd_TRN_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Emprcod = value ;
   }

   public long getAlbprocod( )
   {
      return gxTv_SdtCalprd_TRN_Albprocod ;
   }

   public void setAlbprocod( long value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albprocod = value ;
   }

   public String getAlbpropri( )
   {
      return gxTv_SdtCalprd_TRN_Albpropri ;
   }

   public void setAlbpropri( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albpropri = value ;
   }

   public byte getAlbproest( )
   {
      return gxTv_SdtCalprd_TRN_Albproest ;
   }

   public void setAlbproest( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albproest = value ;
   }

   public java.util.Date getAlbprofch( )
   {
      return gxTv_SdtCalprd_TRN_Albprofch ;
   }

   public void setAlbprofch( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albprofch = value ;
   }

   public java.util.Date getAlbfecsal( )
   {
      return gxTv_SdtCalprd_TRN_Albfecsal ;
   }

   public void setAlbfecsal( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albfecsal = value ;
   }

   public String getAlbhorsal( )
   {
      return gxTv_SdtCalprd_TRN_Albhorsal ;
   }

   public void setAlbhorsal( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albhorsal = value ;
   }

   public String getAlbusu( )
   {
      return gxTv_SdtCalprd_TRN_Albusu ;
   }

   public void setAlbusu( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albusu = value ;
   }

   public int getGuiremcli( )
   {
      return gxTv_SdtCalprd_TRN_Guiremcli ;
   }

   public void setGuiremcli( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremcli = value ;
   }

   public String getGuiremcln( )
   {
      return gxTv_SdtCalprd_TRN_Guiremcln ;
   }

   public void setGuiremcln( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremcln = value ;
   }

   public int getAlbclides( )
   {
      return gxTv_SdtCalprd_TRN_Albclides ;
   }

   public void setAlbclides( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albclides = value ;
   }

   public byte getAlbdomenv( )
   {
      return gxTv_SdtCalprd_TRN_Albdomenv ;
   }

   public void setAlbdomenv( byte value )
   {
      gxTv_SdtCalprd_TRN_Albdomenv_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdomenv = value ;
   }

   public short getTrncod( )
   {
      return gxTv_SdtCalprd_TRN_Trncod ;
   }

   public void setTrncod( short value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Trncod = value ;
   }

   public String getTrnnom( )
   {
      return gxTv_SdtCalprd_TRN_Trnnom ;
   }

   public void setTrnnom( String value )
   {
      gxTv_SdtCalprd_TRN_Trnnom_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Trnnom = value ;
   }

   public String getAlbmat( )
   {
      return gxTv_SdtCalprd_TRN_Albmat ;
   }

   public void setAlbmat( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albmat = value ;
   }

   public String getAlbsec( )
   {
      return gxTv_SdtCalprd_TRN_Albsec ;
   }

   public void setAlbsec( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albsec = value ;
   }

   public byte getAlbenvftp( )
   {
      return gxTv_SdtCalprd_TRN_Albenvftp ;
   }

   public void setAlbenvftp( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albenvftp = value ;
   }

   public String getAlblic( )
   {
      return gxTv_SdtCalprd_TRN_Alblic ;
   }

   public void setAlblic( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Alblic = value ;
   }

   public String getAlbproat( )
   {
      return gxTv_SdtCalprd_TRN_Albproat ;
   }

   public void setAlbproat( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albproat = value ;
   }

   public java.util.Date getAlbhhfm( )
   {
      return gxTv_SdtCalprd_TRN_Albhhfm ;
   }

   public void setAlbhhfm( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albhhfm = value ;
   }

   public java.math.BigDecimal getAlbgrosst( )
   {
      return gxTv_SdtCalprd_TRN_Albgrosst ;
   }

   public void setAlbgrosst( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albgrosst = value ;
   }

   public String getAlbtrnnc( )
   {
      return gxTv_SdtCalprd_TRN_Albtrnnc ;
   }

   public void setAlbtrnnc( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtrnnc = value ;
   }

   public String getAlbfmd( )
   {
      return gxTv_SdtCalprd_TRN_Albfmd ;
   }

   public void setAlbfmd( String value )
   {
      gxTv_SdtCalprd_TRN_Albfmd_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albfmd = value ;
   }

   public String getAlbtrnnm( )
   {
      return gxTv_SdtCalprd_TRN_Albtrnnm ;
   }

   public void setAlbtrnnm( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtrnnm = value ;
   }

   public String getAlbfmdc( )
   {
      return gxTv_SdtCalprd_TRN_Albfmdc ;
   }

   public void setAlbfmdc( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albfmdc = value ;
   }

   public String getAlbtrndm( )
   {
      return gxTv_SdtCalprd_TRN_Albtrndm ;
   }

   public void setAlbtrndm( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtrndm = value ;
   }

   public String getAlbmarca( )
   {
      return gxTv_SdtCalprd_TRN_Albmarca ;
   }

   public void setAlbmarca( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albmarca = value ;
   }

   public byte getAlblocdes( )
   {
      return gxTv_SdtCalprd_TRN_Alblocdes ;
   }

   public void setAlblocdes( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Alblocdes = value ;
   }

   public byte getAlbloccar( )
   {
      return gxTv_SdtCalprd_TRN_Albloccar ;
   }

   public void setAlbloccar( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albloccar = value ;
   }

   public byte getAlbpobscon( )
   {
      return gxTv_SdtCalprd_TRN_Albpobscon ;
   }

   public void setAlbpobscon( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albpobscon = value ;
   }

   public String getAlbivacod( )
   {
      return gxTv_SdtCalprd_TRN_Albivacod ;
   }

   public void setAlbivacod( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albivacod = value ;
   }

   public String getAlbcolca( )
   {
      return gxTv_SdtCalprd_TRN_Albcolca ;
   }

   public void setAlbcolca( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albcolca = value ;
   }

   public int getAlbdesp( )
   {
      return gxTv_SdtCalprd_TRN_Albdesp ;
   }

   public void setAlbdesp( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdesp = value ;
   }

   public java.math.BigDecimal getAlbcambio( )
   {
      return gxTv_SdtCalprd_TRN_Albcambio ;
   }

   public void setAlbcambio( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albcambio = value ;
   }

   public int getAlbtipdoc( )
   {
      return gxTv_SdtCalprd_TRN_Albtipdoc ;
   }

   public void setAlbtipdoc( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtipdoc = value ;
   }

   public String getAlbmottr( )
   {
      return gxTv_SdtCalprd_TRN_Albmottr ;
   }

   public void setAlbmottr( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albmottr = value ;
   }

   public byte getAlbtipcal( )
   {
      return gxTv_SdtCalprd_TRN_Albtipcal ;
   }

   public void setAlbtipcal( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtipcal = value ;
   }

   public String getAlbobscb( )
   {
      return gxTv_SdtCalprd_TRN_Albobscb ;
   }

   public void setAlbobscb( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albobscb = value ;
   }

   public long getAlbnumt( )
   {
      return gxTv_SdtCalprd_TRN_Albnumt ;
   }

   public void setAlbnumt( long value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albnumt = value ;
   }

   public String getAlbmarco( )
   {
      return gxTv_SdtCalprd_TRN_Albmarco ;
   }

   public void setAlbmarco( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albmarco = value ;
   }

   public String getAlbocomp( )
   {
      return gxTv_SdtCalprd_TRN_Albocomp ;
   }

   public void setAlbocomp( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albocomp = value ;
   }

   public String getTrnnif( )
   {
      return gxTv_SdtCalprd_TRN_Trnnif ;
   }

   public void setTrnnif( String value )
   {
      gxTv_SdtCalprd_TRN_Trnnif_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Trnnif = value ;
   }

   public String getAlbdivtcod( )
   {
      return gxTv_SdtCalprd_TRN_Albdivtcod ;
   }

   public void setAlbdivtcod( String value )
   {
      gxTv_SdtCalprd_TRN_Albdivtcod_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdivtcod = value ;
   }

   public String getAlbdivabr( )
   {
      return gxTv_SdtCalprd_TRN_Albdivabr ;
   }

   public void setAlbdivabr( String value )
   {
      gxTv_SdtCalprd_TRN_Albdivabr_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdivabr = value ;
   }

   public byte getAlbdivcod( )
   {
      return gxTv_SdtCalprd_TRN_Albdivcod ;
   }

   public void setAlbdivcod( byte value )
   {
      gxTv_SdtCalprd_TRN_Albdivcod_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdivcod = value ;
   }

   public byte getBusdomenv( )
   {
      return gxTv_SdtCalprd_TRN_Busdomenv ;
   }

   public void setBusdomenv( byte value )
   {
      gxTv_SdtCalprd_TRN_Busdomenv_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Busdomenv = value ;
   }

   public String getEmprguirem( )
   {
      return gxTv_SdtCalprd_TRN_Emprguirem ;
   }

   public void setEmprguirem( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Emprguirem = value ;
   }

   public byte getGuiremdom( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdom ;
   }

   public void setGuiremdom( byte value )
   {
      gxTv_SdtCalprd_TRN_Guiremdom_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremdom = value ;
   }

   public String getGuiremdivt( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdivt ;
   }

   public void setGuiremdivt( String value )
   {
      gxTv_SdtCalprd_TRN_Guiremdivt_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremdivt = value ;
   }

   public byte getGuiremdiv( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdiv ;
   }

   public void setGuiremdiv( byte value )
   {
      gxTv_SdtCalprd_TRN_Guiremdiv_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremdiv = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtCalprd_TRN_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtCalprd_TRN_Emprnom_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Emprnom = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtCalprd_TRN_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtCalprd_TRN_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Emprcod_Z = value ;
   }

   public long getAlbprocod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albprocod_Z ;
   }

   public void setAlbprocod_Z( long value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albprocod_Z = value ;
   }

   public String getAlbpropri_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albpropri_Z ;
   }

   public void setAlbpropri_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albpropri_Z = value ;
   }

   public byte getAlbproest_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albproest_Z ;
   }

   public void setAlbproest_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albproest_Z = value ;
   }

   public java.util.Date getAlbprofch_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albprofch_Z ;
   }

   public void setAlbprofch_Z( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albprofch_Z = value ;
   }

   public java.util.Date getAlbfecsal_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albfecsal_Z ;
   }

   public void setAlbfecsal_Z( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albfecsal_Z = value ;
   }

   public String getAlbhorsal_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albhorsal_Z ;
   }

   public void setAlbhorsal_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albhorsal_Z = value ;
   }

   public String getAlbusu_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albusu_Z ;
   }

   public void setAlbusu_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albusu_Z = value ;
   }

   public int getGuiremcli_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremcli_Z ;
   }

   public void setGuiremcli_Z( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremcli_Z = value ;
   }

   public String getGuiremcln_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremcln_Z ;
   }

   public void setGuiremcln_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremcln_Z = value ;
   }

   public int getAlbclides_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albclides_Z ;
   }

   public void setAlbclides_Z( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albclides_Z = value ;
   }

   public byte getAlbdomenv_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdomenv_Z ;
   }

   public void setAlbdomenv_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdomenv_Z = value ;
   }

   public short getTrncod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Trncod_Z ;
   }

   public void setTrncod_Z( short value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Trncod_Z = value ;
   }

   public String getTrnnom_Z( )
   {
      return gxTv_SdtCalprd_TRN_Trnnom_Z ;
   }

   public void setTrnnom_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Trnnom_Z = value ;
   }

   public String getAlbmat_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albmat_Z ;
   }

   public void setAlbmat_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albmat_Z = value ;
   }

   public String getAlbsec_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albsec_Z ;
   }

   public void setAlbsec_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albsec_Z = value ;
   }

   public byte getAlbenvftp_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albenvftp_Z ;
   }

   public void setAlbenvftp_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albenvftp_Z = value ;
   }

   public String getAlblic_Z( )
   {
      return gxTv_SdtCalprd_TRN_Alblic_Z ;
   }

   public void setAlblic_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Alblic_Z = value ;
   }

   public String getAlbproat_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albproat_Z ;
   }

   public void setAlbproat_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albproat_Z = value ;
   }

   public java.util.Date getAlbhhfm_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albhhfm_Z ;
   }

   public void setAlbhhfm_Z( java.util.Date value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albhhfm_Z = value ;
   }

   public java.math.BigDecimal getAlbgrosst_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albgrosst_Z ;
   }

   public void setAlbgrosst_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albgrosst_Z = value ;
   }

   public String getAlbtrnnc_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtrnnc_Z ;
   }

   public void setAlbtrnnc_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtrnnc_Z = value ;
   }

   public String getAlbfmd_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albfmd_Z ;
   }

   public void setAlbfmd_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albfmd_Z = value ;
   }

   public String getAlbtrnnm_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtrnnm_Z ;
   }

   public void setAlbtrnnm_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtrnnm_Z = value ;
   }

   public String getAlbfmdc_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albfmdc_Z ;
   }

   public void setAlbfmdc_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albfmdc_Z = value ;
   }

   public String getAlbtrndm_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtrndm_Z ;
   }

   public void setAlbtrndm_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtrndm_Z = value ;
   }

   public String getAlbmarca_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albmarca_Z ;
   }

   public void setAlbmarca_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albmarca_Z = value ;
   }

   public byte getAlblocdes_Z( )
   {
      return gxTv_SdtCalprd_TRN_Alblocdes_Z ;
   }

   public void setAlblocdes_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Alblocdes_Z = value ;
   }

   public byte getAlbloccar_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albloccar_Z ;
   }

   public void setAlbloccar_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albloccar_Z = value ;
   }

   public byte getAlbpobscon_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albpobscon_Z ;
   }

   public void setAlbpobscon_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albpobscon_Z = value ;
   }

   public String getAlbivacod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albivacod_Z ;
   }

   public void setAlbivacod_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albivacod_Z = value ;
   }

   public String getAlbcolca_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albcolca_Z ;
   }

   public void setAlbcolca_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albcolca_Z = value ;
   }

   public int getAlbdesp_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdesp_Z ;
   }

   public void setAlbdesp_Z( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdesp_Z = value ;
   }

   public java.math.BigDecimal getAlbcambio_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albcambio_Z ;
   }

   public void setAlbcambio_Z( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albcambio_Z = value ;
   }

   public int getAlbtipdoc_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtipdoc_Z ;
   }

   public void setAlbtipdoc_Z( int value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtipdoc_Z = value ;
   }

   public String getAlbmottr_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albmottr_Z ;
   }

   public void setAlbmottr_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albmottr_Z = value ;
   }

   public byte getAlbtipcal_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albtipcal_Z ;
   }

   public void setAlbtipcal_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albtipcal_Z = value ;
   }

   public String getAlbobscb_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albobscb_Z ;
   }

   public void setAlbobscb_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albobscb_Z = value ;
   }

   public long getAlbnumt_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albnumt_Z ;
   }

   public void setAlbnumt_Z( long value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albnumt_Z = value ;
   }

   public String getAlbmarco_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albmarco_Z ;
   }

   public void setAlbmarco_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albmarco_Z = value ;
   }

   public String getAlbocomp_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albocomp_Z ;
   }

   public void setAlbocomp_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albocomp_Z = value ;
   }

   public String getTrnnif_Z( )
   {
      return gxTv_SdtCalprd_TRN_Trnnif_Z ;
   }

   public void setTrnnif_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Trnnif_Z = value ;
   }

   public String getAlbdivtcod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdivtcod_Z ;
   }

   public void setAlbdivtcod_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdivtcod_Z = value ;
   }

   public String getAlbdivabr_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdivabr_Z ;
   }

   public void setAlbdivabr_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdivabr_Z = value ;
   }

   public byte getAlbdivcod_Z( )
   {
      return gxTv_SdtCalprd_TRN_Albdivcod_Z ;
   }

   public void setAlbdivcod_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdivcod_Z = value ;
   }

   public byte getBusdomenv_Z( )
   {
      return gxTv_SdtCalprd_TRN_Busdomenv_Z ;
   }

   public void setBusdomenv_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Busdomenv_Z = value ;
   }

   public String getEmprguirem_Z( )
   {
      return gxTv_SdtCalprd_TRN_Emprguirem_Z ;
   }

   public void setEmprguirem_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Emprguirem_Z = value ;
   }

   public byte getGuiremdom_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdom_Z ;
   }

   public void setGuiremdom_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremdom_Z = value ;
   }

   public String getGuiremdivt_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdivt_Z ;
   }

   public void setGuiremdivt_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremdivt_Z = value ;
   }

   public byte getGuiremdiv_Z( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdiv_Z ;
   }

   public void setGuiremdiv_Z( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremdiv_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtCalprd_TRN_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Emprnom_Z = value ;
   }

   public byte getAlbdomenv_N( )
   {
      return gxTv_SdtCalprd_TRN_Albdomenv_N ;
   }

   public void setAlbdomenv_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdomenv_N = value ;
   }

   public byte getTrnnom_N( )
   {
      return gxTv_SdtCalprd_TRN_Trnnom_N ;
   }

   public void setTrnnom_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Trnnom_N = value ;
   }

   public byte getAlbfmd_N( )
   {
      return gxTv_SdtCalprd_TRN_Albfmd_N ;
   }

   public void setAlbfmd_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albfmd_N = value ;
   }

   public byte getTrnnif_N( )
   {
      return gxTv_SdtCalprd_TRN_Trnnif_N ;
   }

   public void setTrnnif_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Trnnif_N = value ;
   }

   public byte getAlbdivtcod_N( )
   {
      return gxTv_SdtCalprd_TRN_Albdivtcod_N ;
   }

   public void setAlbdivtcod_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdivtcod_N = value ;
   }

   public byte getAlbdivabr_N( )
   {
      return gxTv_SdtCalprd_TRN_Albdivabr_N ;
   }

   public void setAlbdivabr_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdivabr_N = value ;
   }

   public byte getAlbdivcod_N( )
   {
      return gxTv_SdtCalprd_TRN_Albdivcod_N ;
   }

   public void setAlbdivcod_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Albdivcod_N = value ;
   }

   public byte getBusdomenv_N( )
   {
      return gxTv_SdtCalprd_TRN_Busdomenv_N ;
   }

   public void setBusdomenv_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Busdomenv_N = value ;
   }

   public byte getGuiremdom_N( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdom_N ;
   }

   public void setGuiremdom_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremdom_N = value ;
   }

   public byte getGuiremdivt_N( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdivt_N ;
   }

   public void setGuiremdivt_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremdivt_N = value ;
   }

   public byte getGuiremdiv_N( )
   {
      return gxTv_SdtCalprd_TRN_Guiremdiv_N ;
   }

   public void setGuiremdiv_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Guiremdiv_N = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtCalprd_TRN_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtCalprd_TRN_N = (byte)(0) ;
      gxTv_SdtCalprd_TRN_Emprnom_N = value ;
   }

   protected byte gxTv_SdtCalprd_TRN_Albproest ;
   protected byte gxTv_SdtCalprd_TRN_Albdomenv ;
   protected byte gxTv_SdtCalprd_TRN_Albenvftp ;
   protected byte gxTv_SdtCalprd_TRN_Alblocdes ;
   protected byte gxTv_SdtCalprd_TRN_Albloccar ;
   protected byte gxTv_SdtCalprd_TRN_Albpobscon ;
   protected byte gxTv_SdtCalprd_TRN_Albtipcal ;
   protected byte gxTv_SdtCalprd_TRN_Albdivcod ;
   protected byte gxTv_SdtCalprd_TRN_Busdomenv ;
   protected byte gxTv_SdtCalprd_TRN_Guiremdom ;
   protected byte gxTv_SdtCalprd_TRN_Guiremdiv ;
   protected byte gxTv_SdtCalprd_TRN_Albproest_Z ;
   protected byte gxTv_SdtCalprd_TRN_Albdomenv_Z ;
   protected byte gxTv_SdtCalprd_TRN_Albenvftp_Z ;
   protected byte gxTv_SdtCalprd_TRN_Alblocdes_Z ;
   protected byte gxTv_SdtCalprd_TRN_Albloccar_Z ;
   protected byte gxTv_SdtCalprd_TRN_Albpobscon_Z ;
   protected byte gxTv_SdtCalprd_TRN_Albtipcal_Z ;
   protected byte gxTv_SdtCalprd_TRN_Albdivcod_Z ;
   protected byte gxTv_SdtCalprd_TRN_Busdomenv_Z ;
   protected byte gxTv_SdtCalprd_TRN_Guiremdom_Z ;
   protected byte gxTv_SdtCalprd_TRN_Guiremdiv_Z ;
   protected byte gxTv_SdtCalprd_TRN_Albdomenv_N ;
   protected byte gxTv_SdtCalprd_TRN_Trnnom_N ;
   protected byte gxTv_SdtCalprd_TRN_Albfmd_N ;
   protected byte gxTv_SdtCalprd_TRN_Trnnif_N ;
   protected byte gxTv_SdtCalprd_TRN_Albdivtcod_N ;
   protected byte gxTv_SdtCalprd_TRN_Albdivabr_N ;
   protected byte gxTv_SdtCalprd_TRN_Albdivcod_N ;
   protected byte gxTv_SdtCalprd_TRN_Busdomenv_N ;
   protected byte gxTv_SdtCalprd_TRN_Guiremdom_N ;
   protected byte gxTv_SdtCalprd_TRN_Guiremdivt_N ;
   protected byte gxTv_SdtCalprd_TRN_Guiremdiv_N ;
   protected byte gxTv_SdtCalprd_TRN_Emprnom_N ;
   private byte gxTv_SdtCalprd_TRN_N ;
   protected short gxTv_SdtCalprd_TRN_Trncod ;
   protected short gxTv_SdtCalprd_TRN_Initialized ;
   protected short gxTv_SdtCalprd_TRN_Trncod_Z ;
   protected int gxTv_SdtCalprd_TRN_Guiremcli ;
   protected int gxTv_SdtCalprd_TRN_Albclides ;
   protected int gxTv_SdtCalprd_TRN_Albdesp ;
   protected int gxTv_SdtCalprd_TRN_Albtipdoc ;
   protected int gxTv_SdtCalprd_TRN_Guiremcli_Z ;
   protected int gxTv_SdtCalprd_TRN_Albclides_Z ;
   protected int gxTv_SdtCalprd_TRN_Albdesp_Z ;
   protected int gxTv_SdtCalprd_TRN_Albtipdoc_Z ;
   protected long gxTv_SdtCalprd_TRN_Albprocod ;
   protected long gxTv_SdtCalprd_TRN_Albnumt ;
   protected long gxTv_SdtCalprd_TRN_Albprocod_Z ;
   protected long gxTv_SdtCalprd_TRN_Albnumt_Z ;
   protected String gxTv_SdtCalprd_TRN_Emprcod ;
   protected String gxTv_SdtCalprd_TRN_Albpropri ;
   protected String gxTv_SdtCalprd_TRN_Albhorsal ;
   protected String gxTv_SdtCalprd_TRN_Albusu ;
   protected String gxTv_SdtCalprd_TRN_Guiremcln ;
   protected String gxTv_SdtCalprd_TRN_Trnnom ;
   protected String gxTv_SdtCalprd_TRN_Albmat ;
   protected String gxTv_SdtCalprd_TRN_Albsec ;
   protected String gxTv_SdtCalprd_TRN_Alblic ;
   protected String gxTv_SdtCalprd_TRN_Albproat ;
   protected String gxTv_SdtCalprd_TRN_Albtrnnc ;
   protected String gxTv_SdtCalprd_TRN_Albtrnnm ;
   protected String gxTv_SdtCalprd_TRN_Albfmdc ;
   protected String gxTv_SdtCalprd_TRN_Albtrndm ;
   protected String gxTv_SdtCalprd_TRN_Albmarca ;
   protected String gxTv_SdtCalprd_TRN_Albivacod ;
   protected String gxTv_SdtCalprd_TRN_Albcolca ;
   protected String gxTv_SdtCalprd_TRN_Albmottr ;
   protected String gxTv_SdtCalprd_TRN_Albobscb ;
   protected String gxTv_SdtCalprd_TRN_Albmarco ;
   protected String gxTv_SdtCalprd_TRN_Albocomp ;
   protected String gxTv_SdtCalprd_TRN_Trnnif ;
   protected String gxTv_SdtCalprd_TRN_Albdivtcod ;
   protected String gxTv_SdtCalprd_TRN_Albdivabr ;
   protected String gxTv_SdtCalprd_TRN_Emprguirem ;
   protected String gxTv_SdtCalprd_TRN_Guiremdivt ;
   protected String gxTv_SdtCalprd_TRN_Emprnom ;
   protected String gxTv_SdtCalprd_TRN_Mode ;
   protected String gxTv_SdtCalprd_TRN_Emprcod_Z ;
   protected String gxTv_SdtCalprd_TRN_Albpropri_Z ;
   protected String gxTv_SdtCalprd_TRN_Albhorsal_Z ;
   protected String gxTv_SdtCalprd_TRN_Albusu_Z ;
   protected String gxTv_SdtCalprd_TRN_Guiremcln_Z ;
   protected String gxTv_SdtCalprd_TRN_Trnnom_Z ;
   protected String gxTv_SdtCalprd_TRN_Albmat_Z ;
   protected String gxTv_SdtCalprd_TRN_Albsec_Z ;
   protected String gxTv_SdtCalprd_TRN_Alblic_Z ;
   protected String gxTv_SdtCalprd_TRN_Albproat_Z ;
   protected String gxTv_SdtCalprd_TRN_Albtrnnc_Z ;
   protected String gxTv_SdtCalprd_TRN_Albtrnnm_Z ;
   protected String gxTv_SdtCalprd_TRN_Albfmdc_Z ;
   protected String gxTv_SdtCalprd_TRN_Albtrndm_Z ;
   protected String gxTv_SdtCalprd_TRN_Albmarca_Z ;
   protected String gxTv_SdtCalprd_TRN_Albivacod_Z ;
   protected String gxTv_SdtCalprd_TRN_Albcolca_Z ;
   protected String gxTv_SdtCalprd_TRN_Albmottr_Z ;
   protected String gxTv_SdtCalprd_TRN_Albobscb_Z ;
   protected String gxTv_SdtCalprd_TRN_Albmarco_Z ;
   protected String gxTv_SdtCalprd_TRN_Albocomp_Z ;
   protected String gxTv_SdtCalprd_TRN_Trnnif_Z ;
   protected String gxTv_SdtCalprd_TRN_Albdivtcod_Z ;
   protected String gxTv_SdtCalprd_TRN_Albdivabr_Z ;
   protected String gxTv_SdtCalprd_TRN_Emprguirem_Z ;
   protected String gxTv_SdtCalprd_TRN_Guiremdivt_Z ;
   protected String gxTv_SdtCalprd_TRN_Emprnom_Z ;
   protected String gxTv_SdtCalprd_TRN_Albfmd ;
   protected String gxTv_SdtCalprd_TRN_Albfmd_Z ;
   protected java.util.Date gxTv_SdtCalprd_TRN_Albprofch ;
   protected java.util.Date gxTv_SdtCalprd_TRN_Albfecsal ;
   protected java.util.Date gxTv_SdtCalprd_TRN_Albhhfm ;
   protected java.math.BigDecimal gxTv_SdtCalprd_TRN_Albgrosst ;
   protected java.math.BigDecimal gxTv_SdtCalprd_TRN_Albcambio ;
   protected java.util.Date gxTv_SdtCalprd_TRN_Albprofch_Z ;
   protected java.util.Date gxTv_SdtCalprd_TRN_Albfecsal_Z ;
   protected java.util.Date gxTv_SdtCalprd_TRN_Albhhfm_Z ;
   protected java.math.BigDecimal gxTv_SdtCalprd_TRN_Albgrosst_Z ;
   protected java.math.BigDecimal gxTv_SdtCalprd_TRN_Albcambio_Z ;
}

