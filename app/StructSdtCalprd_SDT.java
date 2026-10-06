package app ;
import com.genexus.*;

public final  class StructSdtCalprd_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtCalprd_SDT( )
   {
      this( -1, new ModelContext( StructSdtCalprd_SDT.class ));
   }

   public StructSdtCalprd_SDT( int remoteHandle ,
                               ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtCalprd_SDT_Emprcod = "" ;
      gxTv_SdtCalprd_SDT_Albpropri = "" ;
      gxTv_SdtCalprd_SDT_Albprofch = cal.getTime() ;
      gxTv_SdtCalprd_SDT_Albfecsal = cal.getTime() ;
      gxTv_SdtCalprd_SDT_Albhorsal = "" ;
      gxTv_SdtCalprd_SDT_Albusu = "" ;
      gxTv_SdtCalprd_SDT_Guiremcln = "" ;
      gxTv_SdtCalprd_SDT_Trnnom = "" ;
      gxTv_SdtCalprd_SDT_Albmat = "" ;
      gxTv_SdtCalprd_SDT_Albsec = "" ;
      gxTv_SdtCalprd_SDT_Alblic = "" ;
      gxTv_SdtCalprd_SDT_Albproat = "" ;
      gxTv_SdtCalprd_SDT_Albhhfm = cal.getTime() ;
      gxTv_SdtCalprd_SDT_Albgrosst = new java.math.BigDecimal(0) ;
      gxTv_SdtCalprd_SDT_Albtrnnc = "" ;
      gxTv_SdtCalprd_SDT_Albfmd = "" ;
      gxTv_SdtCalprd_SDT_Albtrnnm = "" ;
      gxTv_SdtCalprd_SDT_Albfmdc = "" ;
      gxTv_SdtCalprd_SDT_Albtrndm = "" ;
      gxTv_SdtCalprd_SDT_Albmarca = "" ;
      gxTv_SdtCalprd_SDT_Albivacod = "" ;
      gxTv_SdtCalprd_SDT_Albcolca = "" ;
      gxTv_SdtCalprd_SDT_Albcambio = new java.math.BigDecimal(0) ;
      gxTv_SdtCalprd_SDT_Albmottr = "" ;
      gxTv_SdtCalprd_SDT_Albobscb = "" ;
      gxTv_SdtCalprd_SDT_Albmarco = "" ;
      gxTv_SdtCalprd_SDT_Albocomp = "" ;
      gxTv_SdtCalprd_SDT_Trnnif = "" ;
      gxTv_SdtCalprd_SDT_Albdivtcod = "" ;
      gxTv_SdtCalprd_SDT_Albdivabr = "" ;
      gxTv_SdtCalprd_SDT_Emprguirem = "" ;
      gxTv_SdtCalprd_SDT_Guiremdivt = "" ;
      gxTv_SdtCalprd_SDT_Emprnom = "" ;
      gxTv_SdtCalprd_SDT_Albprofch_N = (byte)(1) ;
      gxTv_SdtCalprd_SDT_Albfecsal_N = (byte)(1) ;
      gxTv_SdtCalprd_SDT_Albhhfm_N = (byte)(1) ;
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
      return gxTv_SdtCalprd_SDT_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Emprcod = value ;
   }

   public long getAlbprocod( )
   {
      return gxTv_SdtCalprd_SDT_Albprocod ;
   }

   public void setAlbprocod( long value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albprocod = value ;
   }

   public String getAlbpropri( )
   {
      return gxTv_SdtCalprd_SDT_Albpropri ;
   }

   public void setAlbpropri( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albpropri = value ;
   }

   public byte getAlbproest( )
   {
      return gxTv_SdtCalprd_SDT_Albproest ;
   }

   public void setAlbproest( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albproest = value ;
   }

   public java.util.Date getAlbprofch( )
   {
      return gxTv_SdtCalprd_SDT_Albprofch ;
   }

   public void setAlbprofch( java.util.Date value )
   {
      gxTv_SdtCalprd_SDT_Albprofch_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albprofch = value ;
   }

   public java.util.Date getAlbfecsal( )
   {
      return gxTv_SdtCalprd_SDT_Albfecsal ;
   }

   public void setAlbfecsal( java.util.Date value )
   {
      gxTv_SdtCalprd_SDT_Albfecsal_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albfecsal = value ;
   }

   public String getAlbhorsal( )
   {
      return gxTv_SdtCalprd_SDT_Albhorsal ;
   }

   public void setAlbhorsal( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albhorsal = value ;
   }

   public String getAlbusu( )
   {
      return gxTv_SdtCalprd_SDT_Albusu ;
   }

   public void setAlbusu( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albusu = value ;
   }

   public int getGuiremcli( )
   {
      return gxTv_SdtCalprd_SDT_Guiremcli ;
   }

   public void setGuiremcli( int value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremcli = value ;
   }

   public String getGuiremcln( )
   {
      return gxTv_SdtCalprd_SDT_Guiremcln ;
   }

   public void setGuiremcln( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremcln = value ;
   }

   public int getAlbclides( )
   {
      return gxTv_SdtCalprd_SDT_Albclides ;
   }

   public void setAlbclides( int value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albclides = value ;
   }

   public byte getAlbdomenv( )
   {
      return gxTv_SdtCalprd_SDT_Albdomenv ;
   }

   public void setAlbdomenv( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdomenv = value ;
   }

   public short getTrncod( )
   {
      return gxTv_SdtCalprd_SDT_Trncod ;
   }

   public void setTrncod( short value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Trncod = value ;
   }

   public String getTrnnom( )
   {
      return gxTv_SdtCalprd_SDT_Trnnom ;
   }

   public void setTrnnom( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Trnnom = value ;
   }

   public String getAlbmat( )
   {
      return gxTv_SdtCalprd_SDT_Albmat ;
   }

   public void setAlbmat( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albmat = value ;
   }

   public String getAlbsec( )
   {
      return gxTv_SdtCalprd_SDT_Albsec ;
   }

   public void setAlbsec( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albsec = value ;
   }

   public byte getAlbenvftp( )
   {
      return gxTv_SdtCalprd_SDT_Albenvftp ;
   }

   public void setAlbenvftp( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albenvftp = value ;
   }

   public String getAlblic( )
   {
      return gxTv_SdtCalprd_SDT_Alblic ;
   }

   public void setAlblic( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Alblic = value ;
   }

   public String getAlbproat( )
   {
      return gxTv_SdtCalprd_SDT_Albproat ;
   }

   public void setAlbproat( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albproat = value ;
   }

   public java.util.Date getAlbhhfm( )
   {
      return gxTv_SdtCalprd_SDT_Albhhfm ;
   }

   public void setAlbhhfm( java.util.Date value )
   {
      gxTv_SdtCalprd_SDT_Albhhfm_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albhhfm = value ;
   }

   public java.math.BigDecimal getAlbgrosst( )
   {
      return gxTv_SdtCalprd_SDT_Albgrosst ;
   }

   public void setAlbgrosst( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albgrosst = value ;
   }

   public String getAlbtrnnc( )
   {
      return gxTv_SdtCalprd_SDT_Albtrnnc ;
   }

   public void setAlbtrnnc( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtrnnc = value ;
   }

   public String getAlbfmd( )
   {
      return gxTv_SdtCalprd_SDT_Albfmd ;
   }

   public void setAlbfmd( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albfmd = value ;
   }

   public String getAlbtrnnm( )
   {
      return gxTv_SdtCalprd_SDT_Albtrnnm ;
   }

   public void setAlbtrnnm( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtrnnm = value ;
   }

   public String getAlbfmdc( )
   {
      return gxTv_SdtCalprd_SDT_Albfmdc ;
   }

   public void setAlbfmdc( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albfmdc = value ;
   }

   public String getAlbtrndm( )
   {
      return gxTv_SdtCalprd_SDT_Albtrndm ;
   }

   public void setAlbtrndm( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtrndm = value ;
   }

   public String getAlbmarca( )
   {
      return gxTv_SdtCalprd_SDT_Albmarca ;
   }

   public void setAlbmarca( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albmarca = value ;
   }

   public byte getAlblocdes( )
   {
      return gxTv_SdtCalprd_SDT_Alblocdes ;
   }

   public void setAlblocdes( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Alblocdes = value ;
   }

   public byte getAlbloccar( )
   {
      return gxTv_SdtCalprd_SDT_Albloccar ;
   }

   public void setAlbloccar( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albloccar = value ;
   }

   public byte getAlbpobscon( )
   {
      return gxTv_SdtCalprd_SDT_Albpobscon ;
   }

   public void setAlbpobscon( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albpobscon = value ;
   }

   public String getAlbivacod( )
   {
      return gxTv_SdtCalprd_SDT_Albivacod ;
   }

   public void setAlbivacod( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albivacod = value ;
   }

   public String getAlbcolca( )
   {
      return gxTv_SdtCalprd_SDT_Albcolca ;
   }

   public void setAlbcolca( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albcolca = value ;
   }

   public int getAlbdesp( )
   {
      return gxTv_SdtCalprd_SDT_Albdesp ;
   }

   public void setAlbdesp( int value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdesp = value ;
   }

   public java.math.BigDecimal getAlbcambio( )
   {
      return gxTv_SdtCalprd_SDT_Albcambio ;
   }

   public void setAlbcambio( java.math.BigDecimal value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albcambio = value ;
   }

   public int getAlbtipdoc( )
   {
      return gxTv_SdtCalprd_SDT_Albtipdoc ;
   }

   public void setAlbtipdoc( int value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtipdoc = value ;
   }

   public String getAlbmottr( )
   {
      return gxTv_SdtCalprd_SDT_Albmottr ;
   }

   public void setAlbmottr( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albmottr = value ;
   }

   public byte getAlbtipcal( )
   {
      return gxTv_SdtCalprd_SDT_Albtipcal ;
   }

   public void setAlbtipcal( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albtipcal = value ;
   }

   public String getAlbobscb( )
   {
      return gxTv_SdtCalprd_SDT_Albobscb ;
   }

   public void setAlbobscb( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albobscb = value ;
   }

   public long getAlbnumt( )
   {
      return gxTv_SdtCalprd_SDT_Albnumt ;
   }

   public void setAlbnumt( long value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albnumt = value ;
   }

   public String getAlbmarco( )
   {
      return gxTv_SdtCalprd_SDT_Albmarco ;
   }

   public void setAlbmarco( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albmarco = value ;
   }

   public String getAlbocomp( )
   {
      return gxTv_SdtCalprd_SDT_Albocomp ;
   }

   public void setAlbocomp( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albocomp = value ;
   }

   public String getTrnnif( )
   {
      return gxTv_SdtCalprd_SDT_Trnnif ;
   }

   public void setTrnnif( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Trnnif = value ;
   }

   public String getAlbdivtcod( )
   {
      return gxTv_SdtCalprd_SDT_Albdivtcod ;
   }

   public void setAlbdivtcod( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdivtcod = value ;
   }

   public String getAlbdivabr( )
   {
      return gxTv_SdtCalprd_SDT_Albdivabr ;
   }

   public void setAlbdivabr( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdivabr = value ;
   }

   public byte getAlbdivcod( )
   {
      return gxTv_SdtCalprd_SDT_Albdivcod ;
   }

   public void setAlbdivcod( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Albdivcod = value ;
   }

   public byte getBusdomenv( )
   {
      return gxTv_SdtCalprd_SDT_Busdomenv ;
   }

   public void setBusdomenv( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Busdomenv = value ;
   }

   public String getEmprguirem( )
   {
      return gxTv_SdtCalprd_SDT_Emprguirem ;
   }

   public void setEmprguirem( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Emprguirem = value ;
   }

   public byte getGuiremdom( )
   {
      return gxTv_SdtCalprd_SDT_Guiremdom ;
   }

   public void setGuiremdom( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremdom = value ;
   }

   public String getGuiremdivt( )
   {
      return gxTv_SdtCalprd_SDT_Guiremdivt ;
   }

   public void setGuiremdivt( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremdivt = value ;
   }

   public byte getGuiremdiv( )
   {
      return gxTv_SdtCalprd_SDT_Guiremdiv ;
   }

   public void setGuiremdiv( byte value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Guiremdiv = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtCalprd_SDT_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtCalprd_SDT_N = (byte)(0) ;
      gxTv_SdtCalprd_SDT_Emprnom = value ;
   }

   protected byte gxTv_SdtCalprd_SDT_Albproest ;
   protected byte gxTv_SdtCalprd_SDT_Albdomenv ;
   protected byte gxTv_SdtCalprd_SDT_Albenvftp ;
   protected byte gxTv_SdtCalprd_SDT_Alblocdes ;
   protected byte gxTv_SdtCalprd_SDT_Albloccar ;
   protected byte gxTv_SdtCalprd_SDT_Albpobscon ;
   protected byte gxTv_SdtCalprd_SDT_Albtipcal ;
   protected byte gxTv_SdtCalprd_SDT_Albdivcod ;
   protected byte gxTv_SdtCalprd_SDT_Busdomenv ;
   protected byte gxTv_SdtCalprd_SDT_Guiremdom ;
   protected byte gxTv_SdtCalprd_SDT_Guiremdiv ;
   protected byte gxTv_SdtCalprd_SDT_Albprofch_N ;
   protected byte gxTv_SdtCalprd_SDT_Albfecsal_N ;
   protected byte gxTv_SdtCalprd_SDT_Albhhfm_N ;
   protected byte gxTv_SdtCalprd_SDT_N ;
   protected short gxTv_SdtCalprd_SDT_Trncod ;
   protected int gxTv_SdtCalprd_SDT_Guiremcli ;
   protected int gxTv_SdtCalprd_SDT_Albclides ;
   protected int gxTv_SdtCalprd_SDT_Albdesp ;
   protected int gxTv_SdtCalprd_SDT_Albtipdoc ;
   protected long gxTv_SdtCalprd_SDT_Albprocod ;
   protected long gxTv_SdtCalprd_SDT_Albnumt ;
   protected String gxTv_SdtCalprd_SDT_Emprcod ;
   protected String gxTv_SdtCalprd_SDT_Albpropri ;
   protected String gxTv_SdtCalprd_SDT_Albhorsal ;
   protected String gxTv_SdtCalprd_SDT_Albusu ;
   protected String gxTv_SdtCalprd_SDT_Guiremcln ;
   protected String gxTv_SdtCalprd_SDT_Trnnom ;
   protected String gxTv_SdtCalprd_SDT_Albmat ;
   protected String gxTv_SdtCalprd_SDT_Albsec ;
   protected String gxTv_SdtCalprd_SDT_Alblic ;
   protected String gxTv_SdtCalprd_SDT_Albproat ;
   protected String gxTv_SdtCalprd_SDT_Albtrnnc ;
   protected String gxTv_SdtCalprd_SDT_Albtrnnm ;
   protected String gxTv_SdtCalprd_SDT_Albfmdc ;
   protected String gxTv_SdtCalprd_SDT_Albtrndm ;
   protected String gxTv_SdtCalprd_SDT_Albmarca ;
   protected String gxTv_SdtCalprd_SDT_Albivacod ;
   protected String gxTv_SdtCalprd_SDT_Albcolca ;
   protected String gxTv_SdtCalprd_SDT_Albmottr ;
   protected String gxTv_SdtCalprd_SDT_Albobscb ;
   protected String gxTv_SdtCalprd_SDT_Albmarco ;
   protected String gxTv_SdtCalprd_SDT_Albocomp ;
   protected String gxTv_SdtCalprd_SDT_Trnnif ;
   protected String gxTv_SdtCalprd_SDT_Albdivtcod ;
   protected String gxTv_SdtCalprd_SDT_Albdivabr ;
   protected String gxTv_SdtCalprd_SDT_Emprguirem ;
   protected String gxTv_SdtCalprd_SDT_Guiremdivt ;
   protected String gxTv_SdtCalprd_SDT_Emprnom ;
   protected String gxTv_SdtCalprd_SDT_Albfmd ;
   protected java.util.Date gxTv_SdtCalprd_SDT_Albprofch ;
   protected java.util.Date gxTv_SdtCalprd_SDT_Albfecsal ;
   protected java.util.Date gxTv_SdtCalprd_SDT_Albhhfm ;
   protected java.math.BigDecimal gxTv_SdtCalprd_SDT_Albgrosst ;
   protected java.math.BigDecimal gxTv_SdtCalprd_SDT_Albcambio ;
}

