package app.expedicionesautomatizadas ;
import com.genexus.*;

public final  class StructSdtSDT_Maquina implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_Maquina( )
   {
      this( -1, new ModelContext( StructSdtSDT_Maquina.class ));
   }

   public StructSdtSDT_Maquina( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtSDT_Maquina_Emprcod = "" ;
      gxTv_SdtSDT_Maquina_Maqcod = "" ;
      gxTv_SdtSDT_Maquina_Maqdsc = "" ;
      gxTv_SdtSDT_Maquina_Maqcosmin = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqtip = "" ;
      gxTv_SdtSDT_Maquina_Maqest = "" ;
      gxTv_SdtSDT_Maquina_Maqultfec = "" ;
      gxTv_SdtSDT_Maquina_Maqresdia = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqhorasi = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Tipmaqcod = "" ;
      gxTv_SdtSDT_Maquina_Tipmaqdsc = "" ;
      gxTv_SdtSDT_Maquina_Maqformul = "" ;
      gxTv_SdtSDT_Maquina_Maqkgsmin = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsmed = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsmax = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqchp = "" ;
      gxTv_SdtSDT_Maquina_Maqtintip = "" ;
      gxTv_SdtSDT_Maquina_Maqcodban = "" ;
      gxTv_SdtSDT_Maquina_Maqsalm = "" ;
      gxTv_SdtSDT_Maquina_Maqsalmki = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqsalmkf = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqcantcor = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqtipcen = "" ;
      gxTv_SdtSDT_Maquina_Maqdosifp = "" ;
      gxTv_SdtSDT_Maquina_Maqcodfor = "" ;
      gxTv_SdtSDT_Maquina_Maqfacabs = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsid = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqvaril = "" ;
      gxTv_SdtSDT_Maquina_Maqtipmaq = "" ;
      gxTv_SdtSDT_Maquina_Maqloc = "" ;
      gxTv_SdtSDT_Maquina_Maqobs = "" ;
      gxTv_SdtSDT_Maquina_Maqfabshm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqhhcon = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqhhctr = "" ;
      gxTv_SdtSDT_Maquina_Maqcosgen = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqogtid = "" ;
      gxTv_SdtSDT_Maquina_Maqogtdsc = "" ;
      gxTv_SdtSDT_Maquina_Maqmod = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqmoi = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqenerg = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqgas = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqagua = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqcosmm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqmtsmn = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqmtsmx = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqcosfijo = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqcoskg = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_Maquina_Maqcdsc = "" ;
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
      return gxTv_SdtSDT_Maquina_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Emprcod = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtSDT_Maquina_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDT_Maquina_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqdsc = value ;
   }

   public int getMaqcap( )
   {
      return gxTv_SdtSDT_Maquina_Maqcap ;
   }

   public void setMaqcap( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcap = value ;
   }

   public java.math.BigDecimal getMaqcosmin( )
   {
      return gxTv_SdtSDT_Maquina_Maqcosmin ;
   }

   public void setMaqcosmin( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcosmin = value ;
   }

   public byte getMaqhorpro( )
   {
      return gxTv_SdtSDT_Maquina_Maqhorpro ;
   }

   public void setMaqhorpro( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqhorpro = value ;
   }

   public byte getMaqminpro( )
   {
      return gxTv_SdtSDT_Maquina_Maqminpro ;
   }

   public void setMaqminpro( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqminpro = value ;
   }

   public String getMaqtip( )
   {
      return gxTv_SdtSDT_Maquina_Maqtip ;
   }

   public void setMaqtip( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtip = value ;
   }

   public String getMaqest( )
   {
      return gxTv_SdtSDT_Maquina_Maqest ;
   }

   public void setMaqest( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqest = value ;
   }

   public String getMaqultfec( )
   {
      return gxTv_SdtSDT_Maquina_Maqultfec ;
   }

   public void setMaqultfec( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqultfec = value ;
   }

   public java.math.BigDecimal getMaqresdia( )
   {
      return gxTv_SdtSDT_Maquina_Maqresdia ;
   }

   public void setMaqresdia( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqresdia = value ;
   }

   public java.math.BigDecimal getMaqhorasi( )
   {
      return gxTv_SdtSDT_Maquina_Maqhorasi ;
   }

   public void setMaqhorasi( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqhorasi = value ;
   }

   public short getMaqordseq( )
   {
      return gxTv_SdtSDT_Maquina_Maqordseq ;
   }

   public void setMaqordseq( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqordseq = value ;
   }

   public byte getMaqultlin( )
   {
      return gxTv_SdtSDT_Maquina_Maqultlin ;
   }

   public void setMaqultlin( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqultlin = value ;
   }

   public String getTipmaqcod( )
   {
      return gxTv_SdtSDT_Maquina_Tipmaqcod ;
   }

   public void setTipmaqcod( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Tipmaqcod = value ;
   }

   public String getTipmaqdsc( )
   {
      return gxTv_SdtSDT_Maquina_Tipmaqdsc ;
   }

   public void setTipmaqdsc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Tipmaqdsc = value ;
   }

   public String getMaqformul( )
   {
      return gxTv_SdtSDT_Maquina_Maqformul ;
   }

   public void setMaqformul( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqformul = value ;
   }

   public java.math.BigDecimal getMaqkgsmin( )
   {
      return gxTv_SdtSDT_Maquina_Maqkgsmin ;
   }

   public void setMaqkgsmin( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsmin = value ;
   }

   public java.math.BigDecimal getMaqkgsmed( )
   {
      return gxTv_SdtSDT_Maquina_Maqkgsmed ;
   }

   public void setMaqkgsmed( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsmed = value ;
   }

   public java.math.BigDecimal getMaqkgsmax( )
   {
      return gxTv_SdtSDT_Maquina_Maqkgsmax ;
   }

   public void setMaqkgsmax( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsmax = value ;
   }

   public short getMaqprdmin( )
   {
      return gxTv_SdtSDT_Maquina_Maqprdmin ;
   }

   public void setMaqprdmin( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqprdmin = value ;
   }

   public short getMaqprdmed( )
   {
      return gxTv_SdtSDT_Maquina_Maqprdmed ;
   }

   public void setMaqprdmed( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqprdmed = value ;
   }

   public short getMaqprdmax( )
   {
      return gxTv_SdtSDT_Maquina_Maqprdmax ;
   }

   public void setMaqprdmax( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqprdmax = value ;
   }

   public int getMaqvolmax( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolmax ;
   }

   public void setMaqvolmax( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolmax = value ;
   }

   public int getMaqvolmin( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolmin ;
   }

   public void setMaqvolmin( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolmin = value ;
   }

   public int getMaqvolmed( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolmed ;
   }

   public void setMaqvolmed( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolmed = value ;
   }

   public int getMaqvolres( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolres ;
   }

   public void setMaqvolres( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolres = value ;
   }

   public int getMaqvoltop( )
   {
      return gxTv_SdtSDT_Maquina_Maqvoltop ;
   }

   public void setMaqvoltop( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvoltop = value ;
   }

   public short getMaqtemmax( )
   {
      return gxTv_SdtSDT_Maquina_Maqtemmax ;
   }

   public void setMaqtemmax( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtemmax = value ;
   }

   public String getMaqchp( )
   {
      return gxTv_SdtSDT_Maquina_Maqchp ;
   }

   public void setMaqchp( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqchp = value ;
   }

   public String getMaqtintip( )
   {
      return gxTv_SdtSDT_Maquina_Maqtintip ;
   }

   public void setMaqtintip( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtintip = value ;
   }

   public byte getMaqmicro( )
   {
      return gxTv_SdtSDT_Maquina_Maqmicro ;
   }

   public void setMaqmicro( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmicro = value ;
   }

   public byte getMaqnrotub( )
   {
      return gxTv_SdtSDT_Maquina_Maqnrotub ;
   }

   public void setMaqnrotub( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqnrotub = value ;
   }

   public String getMaqcodban( )
   {
      return gxTv_SdtSDT_Maquina_Maqcodban ;
   }

   public void setMaqcodban( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcodban = value ;
   }

   public String getMaqsalm( )
   {
      return gxTv_SdtSDT_Maquina_Maqsalm ;
   }

   public void setMaqsalm( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqsalm = value ;
   }

   public java.math.BigDecimal getMaqsalmki( )
   {
      return gxTv_SdtSDT_Maquina_Maqsalmki ;
   }

   public void setMaqsalmki( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqsalmki = value ;
   }

   public java.math.BigDecimal getMaqsalmkf( )
   {
      return gxTv_SdtSDT_Maquina_Maqsalmkf ;
   }

   public void setMaqsalmkf( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqsalmkf = value ;
   }

   public java.math.BigDecimal getMaqcantcor( )
   {
      return gxTv_SdtSDT_Maquina_Maqcantcor ;
   }

   public void setMaqcantcor( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcantcor = value ;
   }

   public String getMaqtipcen( )
   {
      return gxTv_SdtSDT_Maquina_Maqtipcen ;
   }

   public void setMaqtipcen( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtipcen = value ;
   }

   public String getMaqdosifp( )
   {
      return gxTv_SdtSDT_Maquina_Maqdosifp ;
   }

   public void setMaqdosifp( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqdosifp = value ;
   }

   public int getMaqdtecol( )
   {
      return gxTv_SdtSDT_Maquina_Maqdtecol ;
   }

   public void setMaqdtecol( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqdtecol = value ;
   }

   public String getMaqcodfor( )
   {
      return gxTv_SdtSDT_Maquina_Maqcodfor ;
   }

   public void setMaqcodfor( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcodfor = value ;
   }

   public java.math.BigDecimal getMaqfacabs( )
   {
      return gxTv_SdtSDT_Maquina_Maqfacabs ;
   }

   public void setMaqfacabs( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqfacabs = value ;
   }

   public java.math.BigDecimal getMaqkgsid( )
   {
      return gxTv_SdtSDT_Maquina_Maqkgsid ;
   }

   public void setMaqkgsid( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqkgsid = value ;
   }

   public byte getMaqpln( )
   {
      return gxTv_SdtSDT_Maquina_Maqpln ;
   }

   public void setMaqpln( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqpln = value ;
   }

   public byte getMaqplnvis( )
   {
      return gxTv_SdtSDT_Maquina_Maqplnvis ;
   }

   public void setMaqplnvis( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqplnvis = value ;
   }

   public int getMaqconfas( )
   {
      return gxTv_SdtSDT_Maquina_Maqconfas ;
   }

   public void setMaqconfas( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqconfas = value ;
   }

   public String getMaqvaril( )
   {
      return gxTv_SdtSDT_Maquina_Maqvaril ;
   }

   public void setMaqvaril( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvaril = value ;
   }

   public String getMaqtipmaq( )
   {
      return gxTv_SdtSDT_Maquina_Maqtipmaq ;
   }

   public void setMaqtipmaq( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtipmaq = value ;
   }

   public byte getMaqrelban( )
   {
      return gxTv_SdtSDT_Maquina_Maqrelban ;
   }

   public void setMaqrelban( byte value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqrelban = value ;
   }

   public String getMaqloc( )
   {
      return gxTv_SdtSDT_Maquina_Maqloc ;
   }

   public void setMaqloc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqloc = value ;
   }

   public String getMaqobs( )
   {
      return gxTv_SdtSDT_Maquina_Maqobs ;
   }

   public void setMaqobs( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqobs = value ;
   }

   public java.math.BigDecimal getMaqfabshm( )
   {
      return gxTv_SdtSDT_Maquina_Maqfabshm ;
   }

   public void setMaqfabshm( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqfabshm = value ;
   }

   public java.math.BigDecimal getMaqhhcon( )
   {
      return gxTv_SdtSDT_Maquina_Maqhhcon ;
   }

   public void setMaqhhcon( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqhhcon = value ;
   }

   public String getMaqhhctr( )
   {
      return gxTv_SdtSDT_Maquina_Maqhhctr ;
   }

   public void setMaqhhctr( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqhhctr = value ;
   }

   public int getMaqvolbal( )
   {
      return gxTv_SdtSDT_Maquina_Maqvolbal ;
   }

   public void setMaqvolbal( int value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqvolbal = value ;
   }

   public java.math.BigDecimal getMaqcosgen( )
   {
      return gxTv_SdtSDT_Maquina_Maqcosgen ;
   }

   public void setMaqcosgen( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcosgen = value ;
   }

   public String getMaqogtid( )
   {
      return gxTv_SdtSDT_Maquina_Maqogtid ;
   }

   public void setMaqogtid( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqogtid = value ;
   }

   public String getMaqogtdsc( )
   {
      return gxTv_SdtSDT_Maquina_Maqogtdsc ;
   }

   public void setMaqogtdsc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqogtdsc = value ;
   }

   public java.math.BigDecimal getMaqmod( )
   {
      return gxTv_SdtSDT_Maquina_Maqmod ;
   }

   public void setMaqmod( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmod = value ;
   }

   public java.math.BigDecimal getMaqmoi( )
   {
      return gxTv_SdtSDT_Maquina_Maqmoi ;
   }

   public void setMaqmoi( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmoi = value ;
   }

   public java.math.BigDecimal getMaqenerg( )
   {
      return gxTv_SdtSDT_Maquina_Maqenerg ;
   }

   public void setMaqenerg( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqenerg = value ;
   }

   public java.math.BigDecimal getMaqgas( )
   {
      return gxTv_SdtSDT_Maquina_Maqgas ;
   }

   public void setMaqgas( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqgas = value ;
   }

   public java.math.BigDecimal getMaqagua( )
   {
      return gxTv_SdtSDT_Maquina_Maqagua ;
   }

   public void setMaqagua( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqagua = value ;
   }

   public java.math.BigDecimal getMaqcosmm( )
   {
      return gxTv_SdtSDT_Maquina_Maqcosmm ;
   }

   public void setMaqcosmm( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcosmm = value ;
   }

   public short getMaqtmcarg( )
   {
      return gxTv_SdtSDT_Maquina_Maqtmcarg ;
   }

   public void setMaqtmcarg( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtmcarg = value ;
   }

   public short getMaqtmdcarg( )
   {
      return gxTv_SdtSDT_Maquina_Maqtmdcarg ;
   }

   public void setMaqtmdcarg( short value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqtmdcarg = value ;
   }

   public java.math.BigDecimal getMaqmtsmn( )
   {
      return gxTv_SdtSDT_Maquina_Maqmtsmn ;
   }

   public void setMaqmtsmn( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmtsmn = value ;
   }

   public java.math.BigDecimal getMaqmtsmx( )
   {
      return gxTv_SdtSDT_Maquina_Maqmtsmx ;
   }

   public void setMaqmtsmx( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqmtsmx = value ;
   }

   public java.math.BigDecimal getMaqcosfijo( )
   {
      return gxTv_SdtSDT_Maquina_Maqcosfijo ;
   }

   public void setMaqcosfijo( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcosfijo = value ;
   }

   public java.math.BigDecimal getMaqcoskg( )
   {
      return gxTv_SdtSDT_Maquina_Maqcoskg ;
   }

   public void setMaqcoskg( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcoskg = value ;
   }

   public String getMaqcdsc( )
   {
      return gxTv_SdtSDT_Maquina_Maqcdsc ;
   }

   public void setMaqcdsc( String value )
   {
      gxTv_SdtSDT_Maquina_N = (byte)(0) ;
      gxTv_SdtSDT_Maquina_Maqcdsc = value ;
   }

   protected byte gxTv_SdtSDT_Maquina_Maqhorpro ;
   protected byte gxTv_SdtSDT_Maquina_Maqminpro ;
   protected byte gxTv_SdtSDT_Maquina_Maqultlin ;
   protected byte gxTv_SdtSDT_Maquina_Maqmicro ;
   protected byte gxTv_SdtSDT_Maquina_Maqnrotub ;
   protected byte gxTv_SdtSDT_Maquina_Maqpln ;
   protected byte gxTv_SdtSDT_Maquina_Maqplnvis ;
   protected byte gxTv_SdtSDT_Maquina_Maqrelban ;
   protected byte gxTv_SdtSDT_Maquina_N ;
   protected short gxTv_SdtSDT_Maquina_Maqordseq ;
   protected short gxTv_SdtSDT_Maquina_Maqprdmin ;
   protected short gxTv_SdtSDT_Maquina_Maqprdmed ;
   protected short gxTv_SdtSDT_Maquina_Maqprdmax ;
   protected short gxTv_SdtSDT_Maquina_Maqtemmax ;
   protected short gxTv_SdtSDT_Maquina_Maqtmcarg ;
   protected short gxTv_SdtSDT_Maquina_Maqtmdcarg ;
   protected int gxTv_SdtSDT_Maquina_Maqcap ;
   protected int gxTv_SdtSDT_Maquina_Maqvolmax ;
   protected int gxTv_SdtSDT_Maquina_Maqvolmin ;
   protected int gxTv_SdtSDT_Maquina_Maqvolmed ;
   protected int gxTv_SdtSDT_Maquina_Maqvolres ;
   protected int gxTv_SdtSDT_Maquina_Maqvoltop ;
   protected int gxTv_SdtSDT_Maquina_Maqdtecol ;
   protected int gxTv_SdtSDT_Maquina_Maqconfas ;
   protected int gxTv_SdtSDT_Maquina_Maqvolbal ;
   protected String gxTv_SdtSDT_Maquina_Emprcod ;
   protected String gxTv_SdtSDT_Maquina_Maqcod ;
   protected String gxTv_SdtSDT_Maquina_Maqdsc ;
   protected String gxTv_SdtSDT_Maquina_Maqtip ;
   protected String gxTv_SdtSDT_Maquina_Maqest ;
   protected String gxTv_SdtSDT_Maquina_Maqultfec ;
   protected String gxTv_SdtSDT_Maquina_Tipmaqcod ;
   protected String gxTv_SdtSDT_Maquina_Tipmaqdsc ;
   protected String gxTv_SdtSDT_Maquina_Maqformul ;
   protected String gxTv_SdtSDT_Maquina_Maqchp ;
   protected String gxTv_SdtSDT_Maquina_Maqtintip ;
   protected String gxTv_SdtSDT_Maquina_Maqcodban ;
   protected String gxTv_SdtSDT_Maquina_Maqsalm ;
   protected String gxTv_SdtSDT_Maquina_Maqtipcen ;
   protected String gxTv_SdtSDT_Maquina_Maqdosifp ;
   protected String gxTv_SdtSDT_Maquina_Maqcodfor ;
   protected String gxTv_SdtSDT_Maquina_Maqvaril ;
   protected String gxTv_SdtSDT_Maquina_Maqtipmaq ;
   protected String gxTv_SdtSDT_Maquina_Maqloc ;
   protected String gxTv_SdtSDT_Maquina_Maqhhctr ;
   protected String gxTv_SdtSDT_Maquina_Maqogtid ;
   protected String gxTv_SdtSDT_Maquina_Maqogtdsc ;
   protected String gxTv_SdtSDT_Maquina_Maqobs ;
   protected String gxTv_SdtSDT_Maquina_Maqcdsc ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcosmin ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqresdia ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqhorasi ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqkgsmin ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqkgsmed ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqkgsmax ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqsalmki ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqsalmkf ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcantcor ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqfacabs ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqkgsid ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqfabshm ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqhhcon ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcosgen ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqmod ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqmoi ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqenerg ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqgas ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqagua ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcosmm ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqmtsmn ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqmtsmx ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcosfijo ;
   protected java.math.BigDecimal gxTv_SdtSDT_Maquina_Maqcoskg ;
}

