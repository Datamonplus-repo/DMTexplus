package app ;
import com.genexus.*;

public final  class StructSdtSDTDispos implements Cloneable, java.io.Serializable
{
   public StructSdtSDTDispos( )
   {
      this( -1, new ModelContext( StructSdtSDTDispos.class ));
   }

   public StructSdtSDTDispos( int remoteHandle ,
                              ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTDispos_Emprcod = "" ;
      gxTv_SdtSDTDispos_Disdes = "" ;
      gxTv_SdtSDTDispos_Disartcod = "" ;
      gxTv_SdtSDTDispos_Disnumuni = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disunimed = "" ;
      gxTv_SdtSDTDispos_Pricod = "" ;
      gxTv_SdtSDTDispos_Disclinum = "" ;
      gxTv_SdtSDTDispos_Disfeccli = cal.getTime() ;
      gxTv_SdtSDTDispos_Disfec = cal.getTime() ;
      gxTv_SdtSDTDispos_Disfecent = cal.getTime() ;
      gxTv_SdtSDTDispos_Discolnom = "" ;
      gxTv_SdtSDTDispos_Disartdsc = "" ;
      gxTv_SdtSDTDispos_Dispiekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Dispiemtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disent = "" ;
      gxTv_SdtSDTDispos_Disartmat = "" ;
      gxTv_SdtSDTDispos_Disartlar = "" ;
      gxTv_SdtSDTDispos_Disartsua = "" ;
      gxTv_SdtSDTDispos_Disartaca = "" ;
      gxTv_SdtSDTDispos_Disartple = "" ;
      gxTv_SdtSDTDispos_Disartenc = "" ;
      gxTv_SdtSDTDispos_Disartcor = "" ;
      gxTv_SdtSDTDispos_Disartope = "" ;
      gxTv_SdtSDTDispos_Disarttr1 = "" ;
      gxTv_SdtSDTDispos_Disarttr2 = "" ;
      gxTv_SdtSDTDispos_Disarttr3 = "" ;
      gxTv_SdtSDTDispos_Disartrdt = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disartur1 = "" ;
      gxTv_SdtSDTDispos_Disartur2 = "" ;
      gxTv_SdtSDTDispos_Disartur3 = "" ;
      gxTv_SdtSDTDispos_Disprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Dispremtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Emprcoddis = "" ;
      gxTv_SdtSDTDispos_Findcol = "" ;
      gxTv_SdtSDTDispos_Disuni = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disnmtr = "" ;
      gxTv_SdtSDTDispos_Disnmez = "" ;
      gxTv_SdtSDTDispos_Findton = "" ;
      gxTv_SdtSDTDispos_Disnumten = "" ;
      gxTv_SdtSDTDispos_Maqcoddis = "" ;
      gxTv_SdtSDTDispos_Partcod = "" ;
      gxTv_SdtSDTDispos_Tipconnom = "" ;
      gxTv_SdtSDTDispos_Disnomcli = "" ;
      gxTv_SdtSDTDispos_Disenccom = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disencanh = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disloc = "" ;
      gxTv_SdtSDTDispos_Disrdon = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disrdoa = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disres = "" ;
      gxTv_SdtSDTDispos_Distipdis = "" ;
      gxTv_SdtSDTDispos_Discodtex = "" ;
      gxTv_SdtSDTDispos_Diskgslot = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Dismtrlot = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Displa = "" ;
      gxTv_SdtSDTDispos_Disple2 = "" ;
      gxTv_SdtSDTDispos_Disfac = "" ;
      gxTv_SdtSDTDispos_Disnumton = "" ;
      gxTv_SdtSDTDispos_Disreftmt = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disreftkg = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disfeclan = cal.getTime() ;
      gxTv_SdtSDTDispos_Retcod = "" ;
      gxTv_SdtSDTDispos_Disartmer = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Empescod = "" ;
      gxTv_SdtSDTDispos_Dibcli = "" ;
      gxTv_SdtSDTDispos_Disobs = "" ;
      gxTv_SdtSDTDispos_Totnuni = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Distin = "" ;
      gxTv_SdtSDTDispos_Disusrcod = "" ;
      gxTv_SdtSDTDispos_Discrumts = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Discrukgs = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Discruenr = "" ;
      gxTv_SdtSDTDispos_Dislotmts = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Dislotkgs = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disacabak = "" ;
      gxTv_SdtSDTDispos_Disacamar = "" ;
      gxTv_SdtSDTDispos_Dismdlcod = "" ;
      gxTv_SdtSDTDispos_Distam = "" ;
      gxTv_SdtSDTDispos_Dishorent = cal.getTime() ;
      gxTv_SdtSDTDispos_Dishorreg = cal.getTime() ;
      gxTv_SdtSDTDispos_Disdishcod = "" ;
      gxTv_SdtSDTDispos_Disenccli = "" ;
      gxTv_SdtSDTDispos_Dibcoldib = "" ;
      gxTv_SdtSDTDispos_Discom = "" ;
      gxTv_SdtSDTDispos_Disesttip = "" ;
      gxTv_SdtSDTDispos_Dispiepdm = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Dispiepdk = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disacc = "" ;
      gxTv_SdtSDTDispos_Distipcor = "" ;
      gxTv_SdtSDTDispos_Disobsgrm = "" ;
      gxTv_SdtSDTDispos_Disobsanc = "" ;
      gxTv_SdtSDTDispos_Disantp = "" ;
      gxTv_SdtSDTDispos_Disantpt = "" ;
      gxTv_SdtSDTDispos_Disrbmaq = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disdto = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disgratam = "" ;
      gxTv_SdtSDTDispos_Disrec = "" ;
      gxTv_SdtSDTDispos_Dismaqest = "" ;
      gxTv_SdtSDTDispos_Disexp = "" ;
      gxTv_SdtSDTDispos_Disfent = "" ;
      gxTv_SdtSDTDispos_Disdest = "" ;
      gxTv_SdtSDTDispos_Disfcht = cal.getTime() ;
      gxTv_SdtSDTDispos_Tb1_dscf = "" ;
      gxTv_SdtSDTDispos_Disitem1 = "" ;
      gxTv_SdtSDTDispos_Disitem2 = "" ;
      gxTv_SdtSDTDispos_Disitem3 = "" ;
      gxTv_SdtSDTDispos_Disitem4 = "" ;
      gxTv_SdtSDTDispos_Disitem5 = "" ;
      gxTv_SdtSDTDispos_Disitem6 = "" ;
      gxTv_SdtSDTDispos_Cod_idtx = "" ;
      gxTv_SdtSDTDispos_Disfecped = cal.getTime() ;
      gxTv_SdtSDTDispos_Dislotmaq = "" ;
      gxTv_SdtSDTDispos_Dibcolcol = "" ;
      gxTv_SdtSDTDispos_Disparpar = "" ;
      gxTv_SdtSDTDispos_Dismemo1 = "" ;
      gxTv_SdtSDTDispos_Dismemo2 = "" ;
      gxTv_SdtSDTDispos_Marcaid = "" ;
      gxTv_SdtSDTDispos_Disordcomp = "" ;
      gxTv_SdtSDTDispos_Discnoenco = "" ;
      gxTv_SdtSDTDispos_Nxt_modelo = "" ;
      gxTv_SdtSDTDispos_Nxt_statio = "" ;
      gxTv_SdtSDTDispos_Nxt_artcli = "" ;
      gxTv_SdtSDTDispos_Disarttipd = "" ;
      gxTv_SdtSDTDispos_Distipcd = "" ;
      gxTv_SdtSDTDispos_Revenid = "" ;
      gxTv_SdtSDTDispos_Disprodid = "" ;
      gxTv_SdtSDTDispos_Disprodds = "" ;
      gxTv_SdtSDTDispos_Disoekotex = "" ;
      gxTv_SdtSDTDispos_Dislinprd = "" ;
      gxTv_SdtSDTDispos_Disdgsummts = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTDispos_Disfeccli_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Disfec_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Disfecent_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Disfeclan_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Dishorent_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Dishorreg_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Disfcht_N = (byte)(1) ;
      gxTv_SdtSDTDispos_Disfecped_N = (byte)(1) ;
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
      return gxTv_SdtSDTDispos_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Emprcod = value ;
   }

   public int getDiscod( )
   {
      return gxTv_SdtSDTDispos_Discod ;
   }

   public void setDiscod( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discod = value ;
   }

   public String getDisdes( )
   {
      return gxTv_SdtSDTDispos_Disdes ;
   }

   public void setDisdes( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdes = value ;
   }

   public String getDisartcod( )
   {
      return gxTv_SdtSDTDispos_Disartcod ;
   }

   public void setDisartcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartcod = value ;
   }

   public short getDisnumpie( )
   {
      return gxTv_SdtSDTDispos_Disnumpie ;
   }

   public void setDisnumpie( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumpie = value ;
   }

   public java.math.BigDecimal getDisnumuni( )
   {
      return gxTv_SdtSDTDispos_Disnumuni ;
   }

   public void setDisnumuni( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumuni = value ;
   }

   public String getDisunimed( )
   {
      return gxTv_SdtSDTDispos_Disunimed ;
   }

   public void setDisunimed( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disunimed = value ;
   }

   public short getDisartpes( )
   {
      return gxTv_SdtSDTDispos_Disartpes ;
   }

   public void setDisartpes( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpes = value ;
   }

   public String getPricod( )
   {
      return gxTv_SdtSDTDispos_Pricod ;
   }

   public void setPricod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Pricod = value ;
   }

   public String getDisclinum( )
   {
      return gxTv_SdtSDTDispos_Disclinum ;
   }

   public void setDisclinum( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disclinum = value ;
   }

   public java.util.Date getDisfeccli( )
   {
      return gxTv_SdtSDTDispos_Disfeccli ;
   }

   public void setDisfeccli( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfeccli_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfeccli = value ;
   }

   public java.util.Date getDisfec( )
   {
      return gxTv_SdtSDTDispos_Disfec ;
   }

   public void setDisfec( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfec_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfec = value ;
   }

   public java.util.Date getDisfecent( )
   {
      return gxTv_SdtSDTDispos_Disfecent ;
   }

   public void setDisfecent( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfecent_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfecent = value ;
   }

   public String getDiscolnom( )
   {
      return gxTv_SdtSDTDispos_Discolnom ;
   }

   public void setDiscolnom( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discolnom = value ;
   }

   public int getDiscolnum( )
   {
      return gxTv_SdtSDTDispos_Discolnum ;
   }

   public void setDiscolnum( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discolnum = value ;
   }

   public byte getDistipcol( )
   {
      return gxTv_SdtSDTDispos_Distipcol ;
   }

   public void setDistipcol( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipcol = value ;
   }

   public String getDisartdsc( )
   {
      return gxTv_SdtSDTDispos_Disartdsc ;
   }

   public void setDisartdsc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartdsc = value ;
   }

   public short getDispiepie( )
   {
      return gxTv_SdtSDTDispos_Dispiepie ;
   }

   public void setDispiepie( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiepie = value ;
   }

   public java.math.BigDecimal getDispiekgm( )
   {
      return gxTv_SdtSDTDispos_Dispiekgm ;
   }

   public void setDispiekgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiekgm = value ;
   }

   public java.math.BigDecimal getDispiemtr( )
   {
      return gxTv_SdtSDTDispos_Dispiemtr ;
   }

   public void setDispiemtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiemtr = value ;
   }

   public short getDisdefcon( )
   {
      return gxTv_SdtSDTDispos_Disdefcon ;
   }

   public void setDisdefcon( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdefcon = value ;
   }

   public short getDispienor( )
   {
      return gxTv_SdtSDTDispos_Dispienor ;
   }

   public void setDispienor( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispienor = value ;
   }

   public short getSumpor( )
   {
      return gxTv_SdtSDTDispos_Sumpor ;
   }

   public void setSumpor( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Sumpor = value ;
   }

   public String getDisent( )
   {
      return gxTv_SdtSDTDispos_Disent ;
   }

   public void setDisent( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disent = value ;
   }

   public byte getDisobsulin( )
   {
      return gxTv_SdtSDTDispos_Disobsulin ;
   }

   public void setDisobsulin( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disobsulin = value ;
   }

   public String getDisartmat( )
   {
      return gxTv_SdtSDTDispos_Disartmat ;
   }

   public void setDisartmat( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartmat = value ;
   }

   public String getDisartlar( )
   {
      return gxTv_SdtSDTDispos_Disartlar ;
   }

   public void setDisartlar( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartlar = value ;
   }

   public String getDisartsua( )
   {
      return gxTv_SdtSDTDispos_Disartsua ;
   }

   public void setDisartsua( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartsua = value ;
   }

   public String getDisartaca( )
   {
      return gxTv_SdtSDTDispos_Disartaca ;
   }

   public void setDisartaca( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartaca = value ;
   }

   public String getDisartple( )
   {
      return gxTv_SdtSDTDispos_Disartple ;
   }

   public void setDisartple( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartple = value ;
   }

   public short getDisarttip( )
   {
      return gxTv_SdtSDTDispos_Disarttip ;
   }

   public void setDisarttip( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttip = value ;
   }

   public String getDisartenc( )
   {
      return gxTv_SdtSDTDispos_Disartenc ;
   }

   public void setDisartenc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartenc = value ;
   }

   public String getDisartcor( )
   {
      return gxTv_SdtSDTDispos_Disartcor ;
   }

   public void setDisartcor( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartcor = value ;
   }

   public String getDisartope( )
   {
      return gxTv_SdtSDTDispos_Disartope ;
   }

   public void setDisartope( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartope = value ;
   }

   public String getDisarttr1( )
   {
      return gxTv_SdtSDTDispos_Disarttr1 ;
   }

   public void setDisarttr1( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttr1 = value ;
   }

   public short getDisartpt1( )
   {
      return gxTv_SdtSDTDispos_Disartpt1 ;
   }

   public void setDisartpt1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpt1 = value ;
   }

   public String getDisarttr2( )
   {
      return gxTv_SdtSDTDispos_Disarttr2 ;
   }

   public void setDisarttr2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttr2 = value ;
   }

   public short getDisartpt2( )
   {
      return gxTv_SdtSDTDispos_Disartpt2 ;
   }

   public void setDisartpt2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpt2 = value ;
   }

   public String getDisarttr3( )
   {
      return gxTv_SdtSDTDispos_Disarttr3 ;
   }

   public void setDisarttr3( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttr3 = value ;
   }

   public short getDisartpt3( )
   {
      return gxTv_SdtSDTDispos_Disartpt3 ;
   }

   public void setDisartpt3( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpt3 = value ;
   }

   public java.math.BigDecimal getDisartrdt( )
   {
      return gxTv_SdtSDTDispos_Disartrdt ;
   }

   public void setDisartrdt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartrdt = value ;
   }

   public byte getDisarturg( )
   {
      return gxTv_SdtSDTDispos_Disarturg ;
   }

   public void setDisarturg( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarturg = value ;
   }

   public String getDisartur1( )
   {
      return gxTv_SdtSDTDispos_Disartur1 ;
   }

   public void setDisartur1( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartur1 = value ;
   }

   public short getDisartpu1( )
   {
      return gxTv_SdtSDTDispos_Disartpu1 ;
   }

   public void setDisartpu1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpu1 = value ;
   }

   public String getDisartur2( )
   {
      return gxTv_SdtSDTDispos_Disartur2 ;
   }

   public void setDisartur2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartur2 = value ;
   }

   public short getDisartpu2( )
   {
      return gxTv_SdtSDTDispos_Disartpu2 ;
   }

   public void setDisartpu2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpu2 = value ;
   }

   public String getDisartur3( )
   {
      return gxTv_SdtSDTDispos_Disartur3 ;
   }

   public void setDisartur3( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartur3 = value ;
   }

   public short getDisartpu3( )
   {
      return gxTv_SdtSDTDispos_Disartpu3 ;
   }

   public void setDisartpu3( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartpu3 = value ;
   }

   public short getDisartanh( )
   {
      return gxTv_SdtSDTDispos_Disartanh ;
   }

   public void setDisartanh( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartanh = value ;
   }

   public byte getDisest( )
   {
      return gxTv_SdtSDTDispos_Disest ;
   }

   public void setDisest( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disest = value ;
   }

   public java.math.BigDecimal getDisprekgm( )
   {
      return gxTv_SdtSDTDispos_Disprekgm ;
   }

   public void setDisprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disprekgm = value ;
   }

   public java.math.BigDecimal getDispremtr( )
   {
      return gxTv_SdtSDTDispos_Dispremtr ;
   }

   public void setDispremtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispremtr = value ;
   }

   public short getDispielan( )
   {
      return gxTv_SdtSDTDispos_Dispielan ;
   }

   public void setDispielan( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispielan = value ;
   }

   public short getDiskgmlan( )
   {
      return gxTv_SdtSDTDispos_Diskgmlan ;
   }

   public void setDiskgmlan( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Diskgmlan = value ;
   }

   public short getDismtrlan( )
   {
      return gxTv_SdtSDTDispos_Dismtrlan ;
   }

   public void setDismtrlan( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismtrlan = value ;
   }

   public String getEmprcoddis( )
   {
      return gxTv_SdtSDTDispos_Emprcoddis ;
   }

   public void setEmprcoddis( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Emprcoddis = value ;
   }

   public int getClicoddis( )
   {
      return gxTv_SdtSDTDispos_Clicoddis ;
   }

   public void setClicoddis( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Clicoddis = value ;
   }

   public String getFindcol( )
   {
      return gxTv_SdtSDTDispos_Findcol ;
   }

   public void setFindcol( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Findcol = value ;
   }

   public short getDispie( )
   {
      return gxTv_SdtSDTDispos_Dispie ;
   }

   public void setDispie( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispie = value ;
   }

   public java.math.BigDecimal getDisuni( )
   {
      return gxTv_SdtSDTDispos_Disuni ;
   }

   public void setDisuni( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disuni = value ;
   }

   public String getDisnmtr( )
   {
      return gxTv_SdtSDTDispos_Disnmtr ;
   }

   public void setDisnmtr( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnmtr = value ;
   }

   public String getDisnmez( )
   {
      return gxTv_SdtSDTDispos_Disnmez ;
   }

   public void setDisnmez( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnmez = value ;
   }

   public byte getFindint( )
   {
      return gxTv_SdtSDTDispos_Findint ;
   }

   public void setFindint( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Findint = value ;
   }

   public String getFindton( )
   {
      return gxTv_SdtSDTDispos_Findton ;
   }

   public void setFindton( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Findton = value ;
   }

   public String getDisnumten( )
   {
      return gxTv_SdtSDTDispos_Disnumten ;
   }

   public void setDisnumten( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumten = value ;
   }

   public String getMaqcoddis( )
   {
      return gxTv_SdtSDTDispos_Maqcoddis ;
   }

   public void setMaqcoddis( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Maqcoddis = value ;
   }

   public String getPartcod( )
   {
      return gxTv_SdtSDTDispos_Partcod ;
   }

   public void setPartcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Partcod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtSDTDispos_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Clicod = value ;
   }

   public short getTipconcod( )
   {
      return gxTv_SdtSDTDispos_Tipconcod ;
   }

   public void setTipconcod( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Tipconcod = value ;
   }

   public String getTipconnom( )
   {
      return gxTv_SdtSDTDispos_Tipconnom ;
   }

   public void setTipconnom( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Tipconnom = value ;
   }

   public String getDisnomcli( )
   {
      return gxTv_SdtSDTDispos_Disnomcli ;
   }

   public void setDisnomcli( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnomcli = value ;
   }

   public int getDisnumcli( )
   {
      return gxTv_SdtSDTDispos_Disnumcli ;
   }

   public void setDisnumcli( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumcli = value ;
   }

   public java.math.BigDecimal getDisenccom( )
   {
      return gxTv_SdtSDTDispos_Disenccom ;
   }

   public void setDisenccom( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disenccom = value ;
   }

   public java.math.BigDecimal getDisencanh( )
   {
      return gxTv_SdtSDTDispos_Disencanh ;
   }

   public void setDisencanh( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disencanh = value ;
   }

   public short getDisgracru( )
   {
      return gxTv_SdtSDTDispos_Disgracru ;
   }

   public void setDisgracru( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgracru = value ;
   }

   public short getDisartan1( )
   {
      return gxTv_SdtSDTDispos_Disartan1 ;
   }

   public void setDisartan1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartan1 = value ;
   }

   public short getDisartacb( )
   {
      return gxTv_SdtSDTDispos_Disartacb ;
   }

   public void setDisartacb( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartacb = value ;
   }

   public short getDisartac2( )
   {
      return gxTv_SdtSDTDispos_Disartac2 ;
   }

   public void setDisartac2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartac2 = value ;
   }

   public String getDisloc( )
   {
      return gxTv_SdtSDTDispos_Disloc ;
   }

   public void setDisloc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disloc = value ;
   }

   public short getDispart( )
   {
      return gxTv_SdtSDTDispos_Dispart ;
   }

   public void setDispart( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispart = value ;
   }

   public short getDisgraaca( )
   {
      return gxTv_SdtSDTDispos_Disgraaca ;
   }

   public void setDisgraaca( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgraaca = value ;
   }

   public java.math.BigDecimal getDisrdon( )
   {
      return gxTv_SdtSDTDispos_Disrdon ;
   }

   public void setDisrdon( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrdon = value ;
   }

   public java.math.BigDecimal getDisrdoa( )
   {
      return gxTv_SdtSDTDispos_Disrdoa ;
   }

   public void setDisrdoa( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrdoa = value ;
   }

   public String getDisres( )
   {
      return gxTv_SdtSDTDispos_Disres ;
   }

   public void setDisres( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disres = value ;
   }

   public String getDistipdis( )
   {
      return gxTv_SdtSDTDispos_Distipdis ;
   }

   public void setDistipdis( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipdis = value ;
   }

   public short getDisnumbas( )
   {
      return gxTv_SdtSDTDispos_Disnumbas ;
   }

   public void setDisnumbas( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumbas = value ;
   }

   public int getDisclides( )
   {
      return gxTv_SdtSDTDispos_Disclides ;
   }

   public void setDisclides( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disclides = value ;
   }

   public short getDismancod( )
   {
      return gxTv_SdtSDTDispos_Dismancod ;
   }

   public void setDismancod( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismancod = value ;
   }

   public int getDisopeant( )
   {
      return gxTv_SdtSDTDispos_Disopeant ;
   }

   public void setDisopeant( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disopeant = value ;
   }

   public String getDiscodtex( )
   {
      return gxTv_SdtSDTDispos_Discodtex ;
   }

   public void setDiscodtex( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discodtex = value ;
   }

   public byte getDisnumtex1( )
   {
      return gxTv_SdtSDTDispos_Disnumtex1 ;
   }

   public void setDisnumtex1( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumtex1 = value ;
   }

   public short getDisnumtex2( )
   {
      return gxTv_SdtSDTDispos_Disnumtex2 ;
   }

   public void setDisnumtex2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumtex2 = value ;
   }

   public int getDisnumlot( )
   {
      return gxTv_SdtSDTDispos_Disnumlot ;
   }

   public void setDisnumlot( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumlot = value ;
   }

   public java.math.BigDecimal getDiskgslot( )
   {
      return gxTv_SdtSDTDispos_Diskgslot ;
   }

   public void setDiskgslot( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Diskgslot = value ;
   }

   public java.math.BigDecimal getDismtrlot( )
   {
      return gxTv_SdtSDTDispos_Dismtrlot ;
   }

   public void setDismtrlot( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismtrlot = value ;
   }

   public String getDispla( )
   {
      return gxTv_SdtSDTDispos_Displa ;
   }

   public void setDispla( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Displa = value ;
   }

   public String getDisple2( )
   {
      return gxTv_SdtSDTDispos_Disple2 ;
   }

   public void setDisple2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disple2 = value ;
   }

   public short getDisnumcor( )
   {
      return gxTv_SdtSDTDispos_Disnumcor ;
   }

   public void setDisnumcor( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumcor = value ;
   }

   public short getDisancsal1( )
   {
      return gxTv_SdtSDTDispos_Disancsal1 ;
   }

   public void setDisancsal1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disancsal1 = value ;
   }

   public short getDisancsal2( )
   {
      return gxTv_SdtSDTDispos_Disancsal2 ;
   }

   public void setDisancsal2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disancsal2 = value ;
   }

   public short getDisancsal3( )
   {
      return gxTv_SdtSDTDispos_Disancsal3 ;
   }

   public void setDisancsal3( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disancsal3 = value ;
   }

   public short getDisgraaca2( )
   {
      return gxTv_SdtSDTDispos_Disgraaca2 ;
   }

   public void setDisgraaca2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgraaca2 = value ;
   }

   public short getDisgracru2( )
   {
      return gxTv_SdtSDTDispos_Disgracru2 ;
   }

   public void setDisgracru2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgracru2 = value ;
   }

   public String getDisfac( )
   {
      return gxTv_SdtSDTDispos_Disfac ;
   }

   public void setDisfac( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfac = value ;
   }

   public short getDismancod1( )
   {
      return gxTv_SdtSDTDispos_Dismancod1 ;
   }

   public void setDismancod1( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismancod1 = value ;
   }

   public short getDismancod2( )
   {
      return gxTv_SdtSDTDispos_Dismancod2 ;
   }

   public void setDismancod2( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismancod2 = value ;
   }

   public String getDisnumton( )
   {
      return gxTv_SdtSDTDispos_Disnumton ;
   }

   public void setDisnumton( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumton = value ;
   }

   public short getDisnumalb( )
   {
      return gxTv_SdtSDTDispos_Disnumalb ;
   }

   public void setDisnumalb( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumalb = value ;
   }

   public java.math.BigDecimal getDisreftmt( )
   {
      return gxTv_SdtSDTDispos_Disreftmt ;
   }

   public void setDisreftmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disreftmt = value ;
   }

   public java.math.BigDecimal getDisreftkg( )
   {
      return gxTv_SdtSDTDispos_Disreftkg ;
   }

   public void setDisreftkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disreftkg = value ;
   }

   public short getDisreftpz( )
   {
      return gxTv_SdtSDTDispos_Disreftpz ;
   }

   public void setDisreftpz( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disreftpz = value ;
   }

   public java.util.Date getDisfeclan( )
   {
      return gxTv_SdtSDTDispos_Disfeclan ;
   }

   public void setDisfeclan( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfeclan_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfeclan = value ;
   }

   public String getRetcod( )
   {
      return gxTv_SdtSDTDispos_Retcod ;
   }

   public void setRetcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Retcod = value ;
   }

   public java.math.BigDecimal getDisartmer( )
   {
      return gxTv_SdtSDTDispos_Disartmer ;
   }

   public void setDisartmer( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disartmer = value ;
   }

   public String getEmpescod( )
   {
      return gxTv_SdtSDTDispos_Empescod ;
   }

   public void setEmpescod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Empescod = value ;
   }

   public String getDibcli( )
   {
      return gxTv_SdtSDTDispos_Dibcli ;
   }

   public void setDibcli( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibcli = value ;
   }

   public int getDibint( )
   {
      return gxTv_SdtSDTDispos_Dibint ;
   }

   public void setDibint( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibint = value ;
   }

   public int getDisdibnum( )
   {
      return gxTv_SdtSDTDispos_Disdibnum ;
   }

   public void setDisdibnum( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdibnum = value ;
   }

   public short getDisnumcol( )
   {
      return gxTv_SdtSDTDispos_Disnumcol ;
   }

   public void setDisnumcol( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnumcol = value ;
   }

   public String getDisobs( )
   {
      return gxTv_SdtSDTDispos_Disobs ;
   }

   public void setDisobs( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disobs = value ;
   }

   public short getTotnpie( )
   {
      return gxTv_SdtSDTDispos_Totnpie ;
   }

   public void setTotnpie( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Totnpie = value ;
   }

   public java.math.BigDecimal getTotnuni( )
   {
      return gxTv_SdtSDTDispos_Totnuni ;
   }

   public void setTotnuni( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Totnuni = value ;
   }

   public byte getDiscomulin( )
   {
      return gxTv_SdtSDTDispos_Discomulin ;
   }

   public void setDiscomulin( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discomulin = value ;
   }

   public byte getDisenv( )
   {
      return gxTv_SdtSDTDispos_Disenv ;
   }

   public void setDisenv( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disenv = value ;
   }

   public String getDistin( )
   {
      return gxTv_SdtSDTDispos_Distin ;
   }

   public void setDistin( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distin = value ;
   }

   public int getDisnpzas( )
   {
      return gxTv_SdtSDTDispos_Disnpzas ;
   }

   public void setDisnpzas( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnpzas = value ;
   }

   public int getDisnpzasl( )
   {
      return gxTv_SdtSDTDispos_Disnpzasl ;
   }

   public void setDisnpzasl( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnpzasl = value ;
   }

   public String getDisusrcod( )
   {
      return gxTv_SdtSDTDispos_Disusrcod ;
   }

   public void setDisusrcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disusrcod = value ;
   }

   public short getDispelanh( )
   {
      return gxTv_SdtSDTDispos_Dispelanh ;
   }

   public void setDispelanh( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispelanh = value ;
   }

   public java.math.BigDecimal getDiscrumts( )
   {
      return gxTv_SdtSDTDispos_Discrumts ;
   }

   public void setDiscrumts( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discrumts = value ;
   }

   public java.math.BigDecimal getDiscrukgs( )
   {
      return gxTv_SdtSDTDispos_Discrukgs ;
   }

   public void setDiscrukgs( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discrukgs = value ;
   }

   public String getDiscruenr( )
   {
      return gxTv_SdtSDTDispos_Discruenr ;
   }

   public void setDiscruenr( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discruenr = value ;
   }

   public java.math.BigDecimal getDislotmts( )
   {
      return gxTv_SdtSDTDispos_Dislotmts ;
   }

   public void setDislotmts( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislotmts = value ;
   }

   public java.math.BigDecimal getDislotkgs( )
   {
      return gxTv_SdtSDTDispos_Dislotkgs ;
   }

   public void setDislotkgs( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislotkgs = value ;
   }

   public String getDisacabak( )
   {
      return gxTv_SdtSDTDispos_Disacabak ;
   }

   public void setDisacabak( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacabak = value ;
   }

   public short getDisacaanh( )
   {
      return gxTv_SdtSDTDispos_Disacaanh ;
   }

   public void setDisacaanh( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacaanh = value ;
   }

   public String getDisacamar( )
   {
      return gxTv_SdtSDTDispos_Disacamar ;
   }

   public void setDisacamar( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacamar = value ;
   }

   public String getDismdlcod( )
   {
      return gxTv_SdtSDTDispos_Dismdlcod ;
   }

   public void setDismdlcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismdlcod = value ;
   }

   public String getDistam( )
   {
      return gxTv_SdtSDTDispos_Distam ;
   }

   public void setDistam( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distam = value ;
   }

   public java.util.Date getDishorent( )
   {
      return gxTv_SdtSDTDispos_Dishorent ;
   }

   public void setDishorent( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Dishorent_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dishorent = value ;
   }

   public java.util.Date getDishorreg( )
   {
      return gxTv_SdtSDTDispos_Dishorreg ;
   }

   public void setDishorreg( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Dishorreg_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dishorreg = value ;
   }

   public String getDisdishcod( )
   {
      return gxTv_SdtSDTDispos_Disdishcod ;
   }

   public void setDisdishcod( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdishcod = value ;
   }

   public int getDisnrocor( )
   {
      return gxTv_SdtSDTDispos_Disnrocor ;
   }

   public void setDisnrocor( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disnrocor = value ;
   }

   public String getDisenccli( )
   {
      return gxTv_SdtSDTDispos_Disenccli ;
   }

   public void setDisenccli( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disenccli = value ;
   }

   public String getDibcoldib( )
   {
      return gxTv_SdtSDTDispos_Dibcoldib ;
   }

   public void setDibcoldib( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibcoldib = value ;
   }

   public byte getDistipest( )
   {
      return gxTv_SdtSDTDispos_Distipest ;
   }

   public void setDistipest( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipest = value ;
   }

   public byte getDisgracob( )
   {
      return gxTv_SdtSDTDispos_Disgracob ;
   }

   public void setDisgracob( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgracob = value ;
   }

   public String getDiscom( )
   {
      return gxTv_SdtSDTDispos_Discom ;
   }

   public void setDiscom( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discom = value ;
   }

   public String getDisesttip( )
   {
      return gxTv_SdtSDTDispos_Disesttip ;
   }

   public void setDisesttip( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disesttip = value ;
   }

   public java.math.BigDecimal getDispiepdm( )
   {
      return gxTv_SdtSDTDispos_Dispiepdm ;
   }

   public void setDispiepdm( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiepdm = value ;
   }

   public java.math.BigDecimal getDispiepdk( )
   {
      return gxTv_SdtSDTDispos_Dispiepdk ;
   }

   public void setDispiepdk( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiepdk = value ;
   }

   public short getDispiepdp( )
   {
      return gxTv_SdtSDTDispos_Dispiepdp ;
   }

   public void setDispiepdp( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispiepdp = value ;
   }

   public String getDisacc( )
   {
      return gxTv_SdtSDTDispos_Disacc ;
   }

   public void setDisacc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacc = value ;
   }

   public String getDistipcor( )
   {
      return gxTv_SdtSDTDispos_Distipcor ;
   }

   public void setDistipcor( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipcor = value ;
   }

   public String getDisobsgrm( )
   {
      return gxTv_SdtSDTDispos_Disobsgrm ;
   }

   public void setDisobsgrm( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disobsgrm = value ;
   }

   public String getDisobsanc( )
   {
      return gxTv_SdtSDTDispos_Disobsanc ;
   }

   public void setDisobsanc( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disobsanc = value ;
   }

   public String getDisantp( )
   {
      return gxTv_SdtSDTDispos_Disantp ;
   }

   public void setDisantp( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disantp = value ;
   }

   public String getDisantpt( )
   {
      return gxTv_SdtSDTDispos_Disantpt ;
   }

   public void setDisantpt( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disantpt = value ;
   }

   public int getDisvolmaq( )
   {
      return gxTv_SdtSDTDispos_Disvolmaq ;
   }

   public void setDisvolmaq( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disvolmaq = value ;
   }

   public java.math.BigDecimal getDisrbmaq( )
   {
      return gxTv_SdtSDTDispos_Disrbmaq ;
   }

   public void setDisrbmaq( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrbmaq = value ;
   }

   public java.math.BigDecimal getDisdto( )
   {
      return gxTv_SdtSDTDispos_Disdto ;
   }

   public void setDisdto( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdto = value ;
   }

   public byte getDisfacsep( )
   {
      return gxTv_SdtSDTDispos_Disfacsep ;
   }

   public void setDisfacsep( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfacsep = value ;
   }

   public byte getDisfacgra( )
   {
      return gxTv_SdtSDTDispos_Disfacgra ;
   }

   public void setDisfacgra( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfacgra = value ;
   }

   public byte getDisordsep( )
   {
      return gxTv_SdtSDTDispos_Disordsep ;
   }

   public void setDisordsep( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disordsep = value ;
   }

   public byte getDisordgra( )
   {
      return gxTv_SdtSDTDispos_Disordgra ;
   }

   public void setDisordgra( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disordgra = value ;
   }

   public byte getDisdescol( )
   {
      return gxTv_SdtSDTDispos_Disdescol ;
   }

   public void setDisdescol( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdescol = value ;
   }

   public String getDisgratam( )
   {
      return gxTv_SdtSDTDispos_Disgratam ;
   }

   public void setDisgratam( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disgratam = value ;
   }

   public String getDisrec( )
   {
      return gxTv_SdtSDTDispos_Disrec ;
   }

   public void setDisrec( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrec = value ;
   }

   public String getDismaqest( )
   {
      return gxTv_SdtSDTDispos_Dismaqest ;
   }

   public void setDismaqest( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismaqest = value ;
   }

   public String getDisexp( )
   {
      return gxTv_SdtSDTDispos_Disexp ;
   }

   public void setDisexp( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disexp = value ;
   }

   public String getDisfent( )
   {
      return gxTv_SdtSDTDispos_Disfent ;
   }

   public void setDisfent( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfent = value ;
   }

   public String getDisdest( )
   {
      return gxTv_SdtSDTDispos_Disdest ;
   }

   public void setDisdest( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdest = value ;
   }

   public java.util.Date getDisfcht( )
   {
      return gxTv_SdtSDTDispos_Disfcht ;
   }

   public void setDisfcht( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfcht_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfcht = value ;
   }

   public String getTb1_dscf( )
   {
      return gxTv_SdtSDTDispos_Tb1_dscf ;
   }

   public void setTb1_dscf( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Tb1_dscf = value ;
   }

   public String getDisitem1( )
   {
      return gxTv_SdtSDTDispos_Disitem1 ;
   }

   public void setDisitem1( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem1 = value ;
   }

   public String getDisitem2( )
   {
      return gxTv_SdtSDTDispos_Disitem2 ;
   }

   public void setDisitem2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem2 = value ;
   }

   public String getDisitem3( )
   {
      return gxTv_SdtSDTDispos_Disitem3 ;
   }

   public void setDisitem3( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem3 = value ;
   }

   public String getDisitem4( )
   {
      return gxTv_SdtSDTDispos_Disitem4 ;
   }

   public void setDisitem4( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem4 = value ;
   }

   public String getDisitem5( )
   {
      return gxTv_SdtSDTDispos_Disitem5 ;
   }

   public void setDisitem5( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem5 = value ;
   }

   public String getDisitem6( )
   {
      return gxTv_SdtSDTDispos_Disitem6 ;
   }

   public void setDisitem6( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disitem6 = value ;
   }

   public String getCod_idtx( )
   {
      return gxTv_SdtSDTDispos_Cod_idtx ;
   }

   public void setCod_idtx( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Cod_idtx = value ;
   }

   public java.util.Date getDisfecped( )
   {
      return gxTv_SdtSDTDispos_Disfecped ;
   }

   public void setDisfecped( java.util.Date value )
   {
      gxTv_SdtSDTDispos_Disfecped_N = (byte)(0) ;
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disfecped = value ;
   }

   public short getDislotpza( )
   {
      return gxTv_SdtSDTDispos_Dislotpza ;
   }

   public void setDislotpza( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislotpza = value ;
   }

   public String getDislotmaq( )
   {
      return gxTv_SdtSDTDispos_Dislotmaq ;
   }

   public void setDislotmaq( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislotmaq = value ;
   }

   public int getDisacafor( )
   {
      return gxTv_SdtSDTDispos_Disacafor ;
   }

   public void setDisacafor( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disacafor = value ;
   }

   public String getDibcolcol( )
   {
      return gxTv_SdtSDTDispos_Dibcolcol ;
   }

   public void setDibcolcol( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibcolcol = value ;
   }

   public int getDisdibcocn( )
   {
      return gxTv_SdtSDTDispos_Disdibcocn ;
   }

   public void setDisdibcocn( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdibcocn = value ;
   }

   public int getDibcolcoln( )
   {
      return gxTv_SdtSDTDispos_Dibcolcoln ;
   }

   public void setDibcolcoln( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dibcolcoln = value ;
   }

   public int getDisdibcodn( )
   {
      return gxTv_SdtSDTDispos_Disdibcodn ;
   }

   public void setDisdibcodn( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdibcodn = value ;
   }

   public byte getDisultnot( )
   {
      return gxTv_SdtSDTDispos_Disultnot ;
   }

   public void setDisultnot( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disultnot = value ;
   }

   public int getDisparcod( )
   {
      return gxTv_SdtSDTDispos_Disparcod ;
   }

   public void setDisparcod( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disparcod = value ;
   }

   public byte getDisparreo( )
   {
      return gxTv_SdtSDTDispos_Disparreo ;
   }

   public void setDisparreo( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disparreo = value ;
   }

   public String getDisparpar( )
   {
      return gxTv_SdtSDTDispos_Disparpar ;
   }

   public void setDisparpar( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disparpar = value ;
   }

   public String getDismemo1( )
   {
      return gxTv_SdtSDTDispos_Dismemo1 ;
   }

   public void setDismemo1( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismemo1 = value ;
   }

   public String getDismemo2( )
   {
      return gxTv_SdtSDTDispos_Dismemo2 ;
   }

   public void setDismemo2( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dismemo2 = value ;
   }

   public String getMarcaid( )
   {
      return gxTv_SdtSDTDispos_Marcaid ;
   }

   public void setMarcaid( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Marcaid = value ;
   }

   public String getDisordcomp( )
   {
      return gxTv_SdtSDTDispos_Disordcomp ;
   }

   public void setDisordcomp( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disordcomp = value ;
   }

   public String getDiscnoenco( )
   {
      return gxTv_SdtSDTDispos_Discnoenco ;
   }

   public void setDiscnoenco( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discnoenco = value ;
   }

   public String getNxt_modelo( )
   {
      return gxTv_SdtSDTDispos_Nxt_modelo ;
   }

   public void setNxt_modelo( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Nxt_modelo = value ;
   }

   public short getCpteid( )
   {
      return gxTv_SdtSDTDispos_Cpteid ;
   }

   public void setCpteid( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Cpteid = value ;
   }

   public String getNxt_statio( )
   {
      return gxTv_SdtSDTDispos_Nxt_statio ;
   }

   public void setNxt_statio( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Nxt_statio = value ;
   }

   public short getDesaid( )
   {
      return gxTv_SdtSDTDispos_Desaid ;
   }

   public void setDesaid( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Desaid = value ;
   }

   public short getDptoid( )
   {
      return gxTv_SdtSDTDispos_Dptoid ;
   }

   public void setDptoid( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dptoid = value ;
   }

   public String getNxt_artcli( )
   {
      return gxTv_SdtSDTDispos_Nxt_artcli ;
   }

   public void setNxt_artcli( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Nxt_artcli = value ;
   }

   public String getDisarttipd( )
   {
      return gxTv_SdtSDTDispos_Disarttipd ;
   }

   public void setDisarttipd( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disarttipd = value ;
   }

   public String getDistipcd( )
   {
      return gxTv_SdtSDTDispos_Distipcd ;
   }

   public void setDistipcd( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distipcd = value ;
   }

   public String getRevenid( )
   {
      return gxTv_SdtSDTDispos_Revenid ;
   }

   public void setRevenid( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Revenid = value ;
   }

   public byte getDispriorid( )
   {
      return gxTv_SdtSDTDispos_Dispriorid ;
   }

   public void setDispriorid( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dispriorid = value ;
   }

   public byte getDistpestam( )
   {
      return gxTv_SdtSDTDispos_Distpestam ;
   }

   public void setDistpestam( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Distpestam = value ;
   }

   public String getDisprodid( )
   {
      return gxTv_SdtSDTDispos_Disprodid ;
   }

   public void setDisprodid( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disprodid = value ;
   }

   public String getDisprodds( )
   {
      return gxTv_SdtSDTDispos_Disprodds ;
   }

   public void setDisprodds( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disprodds = value ;
   }

   public String getDisoekotex( )
   {
      return gxTv_SdtSDTDispos_Disoekotex ;
   }

   public void setDisoekotex( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disoekotex = value ;
   }

   public short getDislineaid( )
   {
      return gxTv_SdtSDTDispos_Dislineaid ;
   }

   public void setDislineaid( short value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislineaid = value ;
   }

   public int getDiscanalid( )
   {
      return gxTv_SdtSDTDispos_Discanalid ;
   }

   public void setDiscanalid( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Discanalid = value ;
   }

   public String getDislinprd( )
   {
      return gxTv_SdtSDTDispos_Dislinprd ;
   }

   public void setDislinprd( String value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Dislinprd = value ;
   }

   public byte getDisdgultli( )
   {
      return gxTv_SdtSDTDispos_Disdgultli ;
   }

   public void setDisdgultli( byte value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdgultli = value ;
   }

   public java.math.BigDecimal getDisdgsummts( )
   {
      return gxTv_SdtSDTDispos_Disdgsummts ;
   }

   public void setDisdgsummts( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdgsummts = value ;
   }

   public int getDisdgsumpzs( )
   {
      return gxTv_SdtSDTDispos_Disdgsumpzs ;
   }

   public void setDisdgsumpzs( int value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disdgsumpzs = value ;
   }

   public long getDisrgb( )
   {
      return gxTv_SdtSDTDispos_Disrgb ;
   }

   public void setDisrgb( long value )
   {
      gxTv_SdtSDTDispos_N = (byte)(0) ;
      gxTv_SdtSDTDispos_Disrgb = value ;
   }

   protected byte gxTv_SdtSDTDispos_Distipcol ;
   protected byte gxTv_SdtSDTDispos_Disobsulin ;
   protected byte gxTv_SdtSDTDispos_Disarturg ;
   protected byte gxTv_SdtSDTDispos_Disest ;
   protected byte gxTv_SdtSDTDispos_Findint ;
   protected byte gxTv_SdtSDTDispos_Disnumtex1 ;
   protected byte gxTv_SdtSDTDispos_Discomulin ;
   protected byte gxTv_SdtSDTDispos_Disenv ;
   protected byte gxTv_SdtSDTDispos_Distipest ;
   protected byte gxTv_SdtSDTDispos_Disgracob ;
   protected byte gxTv_SdtSDTDispos_Disfacsep ;
   protected byte gxTv_SdtSDTDispos_Disfacgra ;
   protected byte gxTv_SdtSDTDispos_Disordsep ;
   protected byte gxTv_SdtSDTDispos_Disordgra ;
   protected byte gxTv_SdtSDTDispos_Disdescol ;
   protected byte gxTv_SdtSDTDispos_Disultnot ;
   protected byte gxTv_SdtSDTDispos_Disparreo ;
   protected byte gxTv_SdtSDTDispos_Dispriorid ;
   protected byte gxTv_SdtSDTDispos_Distpestam ;
   protected byte gxTv_SdtSDTDispos_Disdgultli ;
   protected byte gxTv_SdtSDTDispos_Disfeccli_N ;
   protected byte gxTv_SdtSDTDispos_Disfec_N ;
   protected byte gxTv_SdtSDTDispos_Disfecent_N ;
   protected byte gxTv_SdtSDTDispos_Disfeclan_N ;
   protected byte gxTv_SdtSDTDispos_Dishorent_N ;
   protected byte gxTv_SdtSDTDispos_Dishorreg_N ;
   protected byte gxTv_SdtSDTDispos_Disfcht_N ;
   protected byte gxTv_SdtSDTDispos_Disfecped_N ;
   protected byte gxTv_SdtSDTDispos_N ;
   protected short gxTv_SdtSDTDispos_Disnumpie ;
   protected short gxTv_SdtSDTDispos_Disartpes ;
   protected short gxTv_SdtSDTDispos_Dispiepie ;
   protected short gxTv_SdtSDTDispos_Disdefcon ;
   protected short gxTv_SdtSDTDispos_Dispienor ;
   protected short gxTv_SdtSDTDispos_Sumpor ;
   protected short gxTv_SdtSDTDispos_Disarttip ;
   protected short gxTv_SdtSDTDispos_Disartpt1 ;
   protected short gxTv_SdtSDTDispos_Disartpt2 ;
   protected short gxTv_SdtSDTDispos_Disartpt3 ;
   protected short gxTv_SdtSDTDispos_Disartpu1 ;
   protected short gxTv_SdtSDTDispos_Disartpu2 ;
   protected short gxTv_SdtSDTDispos_Disartpu3 ;
   protected short gxTv_SdtSDTDispos_Disartanh ;
   protected short gxTv_SdtSDTDispos_Dispielan ;
   protected short gxTv_SdtSDTDispos_Diskgmlan ;
   protected short gxTv_SdtSDTDispos_Dismtrlan ;
   protected short gxTv_SdtSDTDispos_Dispie ;
   protected short gxTv_SdtSDTDispos_Tipconcod ;
   protected short gxTv_SdtSDTDispos_Disgracru ;
   protected short gxTv_SdtSDTDispos_Disartan1 ;
   protected short gxTv_SdtSDTDispos_Disartacb ;
   protected short gxTv_SdtSDTDispos_Disartac2 ;
   protected short gxTv_SdtSDTDispos_Dispart ;
   protected short gxTv_SdtSDTDispos_Disgraaca ;
   protected short gxTv_SdtSDTDispos_Disnumbas ;
   protected short gxTv_SdtSDTDispos_Dismancod ;
   protected short gxTv_SdtSDTDispos_Disnumtex2 ;
   protected short gxTv_SdtSDTDispos_Disnumcor ;
   protected short gxTv_SdtSDTDispos_Disancsal1 ;
   protected short gxTv_SdtSDTDispos_Disancsal2 ;
   protected short gxTv_SdtSDTDispos_Disancsal3 ;
   protected short gxTv_SdtSDTDispos_Disgraaca2 ;
   protected short gxTv_SdtSDTDispos_Disgracru2 ;
   protected short gxTv_SdtSDTDispos_Dismancod1 ;
   protected short gxTv_SdtSDTDispos_Dismancod2 ;
   protected short gxTv_SdtSDTDispos_Disnumalb ;
   protected short gxTv_SdtSDTDispos_Disreftpz ;
   protected short gxTv_SdtSDTDispos_Disnumcol ;
   protected short gxTv_SdtSDTDispos_Totnpie ;
   protected short gxTv_SdtSDTDispos_Dispelanh ;
   protected short gxTv_SdtSDTDispos_Disacaanh ;
   protected short gxTv_SdtSDTDispos_Dispiepdp ;
   protected short gxTv_SdtSDTDispos_Dislotpza ;
   protected short gxTv_SdtSDTDispos_Cpteid ;
   protected short gxTv_SdtSDTDispos_Desaid ;
   protected short gxTv_SdtSDTDispos_Dptoid ;
   protected short gxTv_SdtSDTDispos_Dislineaid ;
   protected int gxTv_SdtSDTDispos_Discod ;
   protected int gxTv_SdtSDTDispos_Discolnum ;
   protected int gxTv_SdtSDTDispos_Clicoddis ;
   protected int gxTv_SdtSDTDispos_Clicod ;
   protected int gxTv_SdtSDTDispos_Disnumcli ;
   protected int gxTv_SdtSDTDispos_Disclides ;
   protected int gxTv_SdtSDTDispos_Disopeant ;
   protected int gxTv_SdtSDTDispos_Disnumlot ;
   protected int gxTv_SdtSDTDispos_Dibint ;
   protected int gxTv_SdtSDTDispos_Disdibnum ;
   protected int gxTv_SdtSDTDispos_Disnpzas ;
   protected int gxTv_SdtSDTDispos_Disnpzasl ;
   protected int gxTv_SdtSDTDispos_Disnrocor ;
   protected int gxTv_SdtSDTDispos_Disvolmaq ;
   protected int gxTv_SdtSDTDispos_Disacafor ;
   protected int gxTv_SdtSDTDispos_Disdibcocn ;
   protected int gxTv_SdtSDTDispos_Dibcolcoln ;
   protected int gxTv_SdtSDTDispos_Disdibcodn ;
   protected int gxTv_SdtSDTDispos_Disparcod ;
   protected int gxTv_SdtSDTDispos_Discanalid ;
   protected int gxTv_SdtSDTDispos_Disdgsumpzs ;
   protected long gxTv_SdtSDTDispos_Disrgb ;
   protected String gxTv_SdtSDTDispos_Emprcod ;
   protected String gxTv_SdtSDTDispos_Disdes ;
   protected String gxTv_SdtSDTDispos_Disartcod ;
   protected String gxTv_SdtSDTDispos_Disunimed ;
   protected String gxTv_SdtSDTDispos_Pricod ;
   protected String gxTv_SdtSDTDispos_Disclinum ;
   protected String gxTv_SdtSDTDispos_Discolnom ;
   protected String gxTv_SdtSDTDispos_Disartdsc ;
   protected String gxTv_SdtSDTDispos_Disent ;
   protected String gxTv_SdtSDTDispos_Disartmat ;
   protected String gxTv_SdtSDTDispos_Disartlar ;
   protected String gxTv_SdtSDTDispos_Disartsua ;
   protected String gxTv_SdtSDTDispos_Disartaca ;
   protected String gxTv_SdtSDTDispos_Disartple ;
   protected String gxTv_SdtSDTDispos_Disartenc ;
   protected String gxTv_SdtSDTDispos_Disartcor ;
   protected String gxTv_SdtSDTDispos_Disartope ;
   protected String gxTv_SdtSDTDispos_Disarttr1 ;
   protected String gxTv_SdtSDTDispos_Disarttr2 ;
   protected String gxTv_SdtSDTDispos_Disarttr3 ;
   protected String gxTv_SdtSDTDispos_Disartur1 ;
   protected String gxTv_SdtSDTDispos_Disartur2 ;
   protected String gxTv_SdtSDTDispos_Disartur3 ;
   protected String gxTv_SdtSDTDispos_Emprcoddis ;
   protected String gxTv_SdtSDTDispos_Findcol ;
   protected String gxTv_SdtSDTDispos_Disnmtr ;
   protected String gxTv_SdtSDTDispos_Disnmez ;
   protected String gxTv_SdtSDTDispos_Findton ;
   protected String gxTv_SdtSDTDispos_Disnumten ;
   protected String gxTv_SdtSDTDispos_Maqcoddis ;
   protected String gxTv_SdtSDTDispos_Partcod ;
   protected String gxTv_SdtSDTDispos_Tipconnom ;
   protected String gxTv_SdtSDTDispos_Disnomcli ;
   protected String gxTv_SdtSDTDispos_Disloc ;
   protected String gxTv_SdtSDTDispos_Disres ;
   protected String gxTv_SdtSDTDispos_Distipdis ;
   protected String gxTv_SdtSDTDispos_Discodtex ;
   protected String gxTv_SdtSDTDispos_Displa ;
   protected String gxTv_SdtSDTDispos_Disple2 ;
   protected String gxTv_SdtSDTDispos_Disfac ;
   protected String gxTv_SdtSDTDispos_Disnumton ;
   protected String gxTv_SdtSDTDispos_Retcod ;
   protected String gxTv_SdtSDTDispos_Empescod ;
   protected String gxTv_SdtSDTDispos_Dibcli ;
   protected String gxTv_SdtSDTDispos_Disobs ;
   protected String gxTv_SdtSDTDispos_Distin ;
   protected String gxTv_SdtSDTDispos_Disusrcod ;
   protected String gxTv_SdtSDTDispos_Discruenr ;
   protected String gxTv_SdtSDTDispos_Disacabak ;
   protected String gxTv_SdtSDTDispos_Disacamar ;
   protected String gxTv_SdtSDTDispos_Dismdlcod ;
   protected String gxTv_SdtSDTDispos_Distam ;
   protected String gxTv_SdtSDTDispos_Disdishcod ;
   protected String gxTv_SdtSDTDispos_Disenccli ;
   protected String gxTv_SdtSDTDispos_Dibcoldib ;
   protected String gxTv_SdtSDTDispos_Discom ;
   protected String gxTv_SdtSDTDispos_Disesttip ;
   protected String gxTv_SdtSDTDispos_Disacc ;
   protected String gxTv_SdtSDTDispos_Distipcor ;
   protected String gxTv_SdtSDTDispos_Disobsgrm ;
   protected String gxTv_SdtSDTDispos_Disobsanc ;
   protected String gxTv_SdtSDTDispos_Disantp ;
   protected String gxTv_SdtSDTDispos_Disantpt ;
   protected String gxTv_SdtSDTDispos_Disgratam ;
   protected String gxTv_SdtSDTDispos_Disrec ;
   protected String gxTv_SdtSDTDispos_Dismaqest ;
   protected String gxTv_SdtSDTDispos_Disexp ;
   protected String gxTv_SdtSDTDispos_Disfent ;
   protected String gxTv_SdtSDTDispos_Disdest ;
   protected String gxTv_SdtSDTDispos_Tb1_dscf ;
   protected String gxTv_SdtSDTDispos_Disitem1 ;
   protected String gxTv_SdtSDTDispos_Disitem2 ;
   protected String gxTv_SdtSDTDispos_Disitem3 ;
   protected String gxTv_SdtSDTDispos_Disitem4 ;
   protected String gxTv_SdtSDTDispos_Disitem5 ;
   protected String gxTv_SdtSDTDispos_Disitem6 ;
   protected String gxTv_SdtSDTDispos_Cod_idtx ;
   protected String gxTv_SdtSDTDispos_Dislotmaq ;
   protected String gxTv_SdtSDTDispos_Dibcolcol ;
   protected String gxTv_SdtSDTDispos_Disparpar ;
   protected String gxTv_SdtSDTDispos_Marcaid ;
   protected String gxTv_SdtSDTDispos_Nxt_modelo ;
   protected String gxTv_SdtSDTDispos_Nxt_statio ;
   protected String gxTv_SdtSDTDispos_Nxt_artcli ;
   protected String gxTv_SdtSDTDispos_Disarttipd ;
   protected String gxTv_SdtSDTDispos_Distipcd ;
   protected String gxTv_SdtSDTDispos_Revenid ;
   protected String gxTv_SdtSDTDispos_Disprodid ;
   protected String gxTv_SdtSDTDispos_Disprodds ;
   protected String gxTv_SdtSDTDispos_Disoekotex ;
   protected String gxTv_SdtSDTDispos_Dislinprd ;
   protected String gxTv_SdtSDTDispos_Dismemo1 ;
   protected String gxTv_SdtSDTDispos_Dismemo2 ;
   protected String gxTv_SdtSDTDispos_Disordcomp ;
   protected String gxTv_SdtSDTDispos_Discnoenco ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disnumuni ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfeccli ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfec ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfecent ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispiekgm ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispiemtr ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disartrdt ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disprekgm ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispremtr ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disuni ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disenccom ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disencanh ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disrdon ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disrdoa ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Diskgslot ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dismtrlot ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disreftmt ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disreftkg ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfeclan ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disartmer ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Totnuni ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Discrumts ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Discrukgs ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dislotmts ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dislotkgs ;
   protected java.util.Date gxTv_SdtSDTDispos_Dishorent ;
   protected java.util.Date gxTv_SdtSDTDispos_Dishorreg ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispiepdm ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Dispiepdk ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disrbmaq ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disdto ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfcht ;
   protected java.util.Date gxTv_SdtSDTDispos_Disfecped ;
   protected java.math.BigDecimal gxTv_SdtSDTDispos_Disdgsummts ;
}

