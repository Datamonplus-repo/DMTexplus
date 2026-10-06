package app ;
import com.genexus.*;

public final  class StructSdtBC_ALBREC implements Cloneable, java.io.Serializable
{
   public StructSdtBC_ALBREC( )
   {
      this( -1, new ModelContext( StructSdtBC_ALBREC.class ));
   }

   public StructSdtBC_ALBREC( int remoteHandle ,
                              ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtBC_ALBREC_Emprcod = "" ;
      gxTv_SdtBC_ALBREC_Emprnom = "" ;
      gxTv_SdtBC_ALBREC_Clinom = "" ;
      gxTv_SdtBC_ALBREC_Albref = "" ;
      gxTv_SdtBC_ALBREC_Trnnom = "" ;
      gxTv_SdtBC_ALBREC_Albrent = "" ;
      gxTv_SdtBC_ALBREC_Albruni = "" ;
      gxTv_SdtBC_ALBREC_Albrloc = "" ;
      gxTv_SdtBC_ALBREC_Albrfen = cal.getTime() ;
      gxTv_SdtBC_ALBREC_Albrunient = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrtam = "" ;
      gxTv_SdtBC_ALBREC_Emp_item1 = "" ;
      gxTv_SdtBC_ALBREC_Albrreo = "" ;
      gxTv_SdtBC_ALBREC_Albruniuti = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrunireb = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrunidis = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrfecult = cal.getTime() ;
      gxTv_SdtBC_ALBREC_Tipentnom = "" ;
      gxTv_SdtBC_ALBREC_Albrdes = "" ;
      gxTv_SdtBC_ALBREC_Procenom = "" ;
      gxTv_SdtBC_ALBREC_Albrefdsc = "" ;
      gxTv_SdtBC_ALBREC_Albpmppza = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrpre = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albraju = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrent2 = "" ;
      gxTv_SdtBC_ALBREC_Albrusu = "" ;
      gxTv_SdtBC_ALBREC_Albrhor = cal.getTime() ;
      gxTv_SdtBC_ALBREC_Albrunic = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrnf = "" ;
      gxTv_SdtBC_ALBREC_Albrfenf = cal.getTime() ;
      gxTv_SdtBC_ALBREC_Albrcfop = "" ;
      gxTv_SdtBC_ALBREC_Albrdiscli = "" ;
      gxTv_SdtBC_ALBREC_Albrtartd = "" ;
      gxTv_SdtBC_ALBREC_Albrimp = "" ;
      gxTv_SdtBC_ALBREC_Albrlote = "" ;
      gxTv_SdtBC_ALBREC_Albrtelar = "" ;
      gxTv_SdtBC_ALBREC_Albrlot2 = "" ;
      gxTv_SdtBC_ALBREC_Albrlu = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrmdlcod = "" ;
      gxTv_SdtBC_ALBREC_Albrtara = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrunib = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albdocprv = "" ;
      gxTv_SdtBC_ALBREC_Albrudas = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Almnom = "" ;
      gxTv_SdtBC_ALBREC_Albcolor = "" ;
      gxTv_SdtBC_ALBREC_Albopst = "" ;
      gxTv_SdtBC_ALBREC_Albopsc = "" ;
      gxTv_SdtBC_ALBREC_Alboc = "" ;
      gxTv_SdtBC_ALBREC_Albhdri = "" ;
      gxTv_SdtBC_ALBREC_Albnumb = "" ;
      gxTv_SdtBC_ALBREC_Albnumm = "" ;
      gxTv_SdtBC_ALBREC_Albancc = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albanccr = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albmaqtej = "" ;
      gxTv_SdtBC_ALBREC_Albpdac = "" ;
      gxTv_SdtBC_ALBREC_Albostj = "" ;
      gxTv_SdtBC_ALBREC_Cliest = "" ;
      gxTv_SdtBC_ALBREC_Alboekotex = "" ;
      gxTv_SdtBC_ALBREC_Albrent_3 = "" ;
      gxTv_SdtBC_ALBREC_Albrartlu = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Mode = "" ;
      gxTv_SdtBC_ALBREC_Emprcod_Z = "" ;
      gxTv_SdtBC_ALBREC_Emprnom_Z = "" ;
      gxTv_SdtBC_ALBREC_Clinom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albref_Z = "" ;
      gxTv_SdtBC_ALBREC_Trnnom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrent_Z = "" ;
      gxTv_SdtBC_ALBREC_Albruni_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrloc_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrfen_Z = cal.getTime() ;
      gxTv_SdtBC_ALBREC_Albrunient_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrtam_Z = "" ;
      gxTv_SdtBC_ALBREC_Emp_item1_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrreo_Z = "" ;
      gxTv_SdtBC_ALBREC_Albruniuti_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrunireb_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrunidis_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrfecult_Z = cal.getTime() ;
      gxTv_SdtBC_ALBREC_Tipentnom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrdes_Z = "" ;
      gxTv_SdtBC_ALBREC_Procenom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrefdsc_Z = "" ;
      gxTv_SdtBC_ALBREC_Albpmppza_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrpre_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albraju_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrent2_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrusu_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrhor_Z = cal.getTime() ;
      gxTv_SdtBC_ALBREC_Albrunic_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrnf_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrfenf_Z = cal.getTime() ;
      gxTv_SdtBC_ALBREC_Albrcfop_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrdiscli_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrtartd_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrimp_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrlote_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrtelar_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrlot2_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrlu_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrmdlcod_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrtara_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albrunib_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albdocprv_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrudas_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Almnom_Z = "" ;
      gxTv_SdtBC_ALBREC_Albcolor_Z = "" ;
      gxTv_SdtBC_ALBREC_Albopst_Z = "" ;
      gxTv_SdtBC_ALBREC_Albopsc_Z = "" ;
      gxTv_SdtBC_ALBREC_Alboc_Z = "" ;
      gxTv_SdtBC_ALBREC_Albhdri_Z = "" ;
      gxTv_SdtBC_ALBREC_Albnumb_Z = "" ;
      gxTv_SdtBC_ALBREC_Albnumm_Z = "" ;
      gxTv_SdtBC_ALBREC_Albancc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albanccr_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Albmaqtej_Z = "" ;
      gxTv_SdtBC_ALBREC_Albpdac_Z = "" ;
      gxTv_SdtBC_ALBREC_Albostj_Z = "" ;
      gxTv_SdtBC_ALBREC_Cliest_Z = "" ;
      gxTv_SdtBC_ALBREC_Alboekotex_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrent_3_Z = "" ;
      gxTv_SdtBC_ALBREC_Albrartlu_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtBC_ALBREC_Emprnom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Trncod_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Trnnom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Tipentcod_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Tipentnom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Procecod_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Procenom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Albrtartc_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Albrtartd_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Almcod_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Almnom_N = (byte)(1) ;
      gxTv_SdtBC_ALBREC_Albrartlu_N = (byte)(1) ;
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
      return gxTv_SdtBC_ALBREC_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Emprcod = value ;
   }

   public int getAlbreccod( )
   {
      return gxTv_SdtBC_ALBREC_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albreccod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtBC_ALBREC_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtBC_ALBREC_Emprnom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Emprnom = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtBC_ALBREC_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtBC_ALBREC_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Clinom = value ;
   }

   public String getAlbref( )
   {
      return gxTv_SdtBC_ALBREC_Albref ;
   }

   public void setAlbref( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albref = value ;
   }

   public short getTrncod( )
   {
      return gxTv_SdtBC_ALBREC_Trncod ;
   }

   public void setTrncod( short value )
   {
      gxTv_SdtBC_ALBREC_Trncod_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Trncod = value ;
   }

   public String getTrnnom( )
   {
      return gxTv_SdtBC_ALBREC_Trnnom ;
   }

   public void setTrnnom( String value )
   {
      gxTv_SdtBC_ALBREC_Trnnom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Trnnom = value ;
   }

   public String getAlbrent( )
   {
      return gxTv_SdtBC_ALBREC_Albrent ;
   }

   public void setAlbrent( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrent = value ;
   }

   public int getAlbrpieent( )
   {
      return gxTv_SdtBC_ALBREC_Albrpieent ;
   }

   public void setAlbrpieent( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpieent = value ;
   }

   public String getAlbruni( )
   {
      return gxTv_SdtBC_ALBREC_Albruni ;
   }

   public void setAlbruni( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albruni = value ;
   }

   public String getAlbrloc( )
   {
      return gxTv_SdtBC_ALBREC_Albrloc ;
   }

   public void setAlbrloc( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrloc = value ;
   }

   public java.util.Date getAlbrfen( )
   {
      return gxTv_SdtBC_ALBREC_Albrfen ;
   }

   public void setAlbrfen( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrfen = value ;
   }

   public java.math.BigDecimal getAlbrunient( )
   {
      return gxTv_SdtBC_ALBREC_Albrunient ;
   }

   public void setAlbrunient( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunient = value ;
   }

   public String getAlbrtam( )
   {
      return gxTv_SdtBC_ALBREC_Albrtam ;
   }

   public void setAlbrtam( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtam = value ;
   }

   public String getEmp_item1( )
   {
      return gxTv_SdtBC_ALBREC_Emp_item1 ;
   }

   public void setEmp_item1( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Emp_item1 = value ;
   }

   public String getAlbrreo( )
   {
      return gxTv_SdtBC_ALBREC_Albrreo ;
   }

   public void setAlbrreo( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrreo = value ;
   }

   public int getAlbrpieuti( )
   {
      return gxTv_SdtBC_ALBREC_Albrpieuti ;
   }

   public void setAlbrpieuti( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpieuti = value ;
   }

   public int getAlbrpiereb( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiereb ;
   }

   public void setAlbrpiereb( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpiereb = value ;
   }

   public java.math.BigDecimal getAlbruniuti( )
   {
      return gxTv_SdtBC_ALBREC_Albruniuti ;
   }

   public void setAlbruniuti( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albruniuti = value ;
   }

   public java.math.BigDecimal getAlbrunireb( )
   {
      return gxTv_SdtBC_ALBREC_Albrunireb ;
   }

   public void setAlbrunireb( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunireb = value ;
   }

   public int getAlbrpiedis( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiedis ;
   }

   public void setAlbrpiedis( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpiedis = value ;
   }

   public java.math.BigDecimal getAlbrunidis( )
   {
      return gxTv_SdtBC_ALBREC_Albrunidis ;
   }

   public void setAlbrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunidis = value ;
   }

   public java.util.Date getAlbrfecult( )
   {
      return gxTv_SdtBC_ALBREC_Albrfecult ;
   }

   public void setAlbrfecult( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrfecult = value ;
   }

   public byte getAlbrest( )
   {
      return gxTv_SdtBC_ALBREC_Albrest ;
   }

   public void setAlbrest( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrest = value ;
   }

   public short getTipentcod( )
   {
      return gxTv_SdtBC_ALBREC_Tipentcod ;
   }

   public void setTipentcod( short value )
   {
      gxTv_SdtBC_ALBREC_Tipentcod_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Tipentcod = value ;
   }

   public String getTipentnom( )
   {
      return gxTv_SdtBC_ALBREC_Tipentnom ;
   }

   public void setTipentnom( String value )
   {
      gxTv_SdtBC_ALBREC_Tipentnom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Tipentnom = value ;
   }

   public short getAlbnumeti( )
   {
      return gxTv_SdtBC_ALBREC_Albnumeti ;
   }

   public void setAlbnumeti( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albnumeti = value ;
   }

   public String getAlbrdes( )
   {
      return gxTv_SdtBC_ALBREC_Albrdes ;
   }

   public void setAlbrdes( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrdes = value ;
   }

   public short getProcecod( )
   {
      return gxTv_SdtBC_ALBREC_Procecod ;
   }

   public void setProcecod( short value )
   {
      gxTv_SdtBC_ALBREC_Procecod_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Procecod = value ;
   }

   public String getProcenom( )
   {
      return gxTv_SdtBC_ALBREC_Procenom ;
   }

   public void setProcenom( String value )
   {
      gxTv_SdtBC_ALBREC_Procenom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Procenom = value ;
   }

   public byte getAlbrulin( )
   {
      return gxTv_SdtBC_ALBREC_Albrulin ;
   }

   public void setAlbrulin( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrulin = value ;
   }

   public String getAlbrefdsc( )
   {
      return gxTv_SdtBC_ALBREC_Albrefdsc ;
   }

   public void setAlbrefdsc( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrefdsc = value ;
   }

   public java.math.BigDecimal getAlbpmppza( )
   {
      return gxTv_SdtBC_ALBREC_Albpmppza ;
   }

   public void setAlbpmppza( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albpmppza = value ;
   }

   public int getAlbpzaest( )
   {
      return gxTv_SdtBC_ALBREC_Albpzaest ;
   }

   public void setAlbpzaest( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albpzaest = value ;
   }

   public short getAlbrgrm2( )
   {
      return gxTv_SdtBC_ALBREC_Albrgrm2 ;
   }

   public void setAlbrgrm2( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrgrm2 = value ;
   }

   public short getAlbranc( )
   {
      return gxTv_SdtBC_ALBREC_Albranc ;
   }

   public void setAlbranc( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albranc = value ;
   }

   public short getAlbpml( )
   {
      return gxTv_SdtBC_ALBREC_Albpml ;
   }

   public void setAlbpml( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albpml = value ;
   }

   public java.math.BigDecimal getAlbrpre( )
   {
      return gxTv_SdtBC_ALBREC_Albrpre ;
   }

   public void setAlbrpre( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpre = value ;
   }

   public java.math.BigDecimal getAlbraju( )
   {
      return gxTv_SdtBC_ALBREC_Albraju ;
   }

   public void setAlbraju( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albraju = value ;
   }

   public byte getAlbrrep( )
   {
      return gxTv_SdtBC_ALBREC_Albrrep ;
   }

   public void setAlbrrep( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrrep = value ;
   }

   public String getAlbrent2( )
   {
      return gxTv_SdtBC_ALBREC_Albrent2 ;
   }

   public void setAlbrent2( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrent2 = value ;
   }

   public String getAlbrusu( )
   {
      return gxTv_SdtBC_ALBREC_Albrusu ;
   }

   public void setAlbrusu( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrusu = value ;
   }

   public java.util.Date getAlbrhor( )
   {
      return gxTv_SdtBC_ALBREC_Albrhor ;
   }

   public void setAlbrhor( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrhor = value ;
   }

   public java.math.BigDecimal getAlbrunic( )
   {
      return gxTv_SdtBC_ALBREC_Albrunic ;
   }

   public void setAlbrunic( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunic = value ;
   }

   public int getAlbrpiec( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiec ;
   }

   public void setAlbrpiec( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpiec = value ;
   }

   public String getAlbrnf( )
   {
      return gxTv_SdtBC_ALBREC_Albrnf ;
   }

   public void setAlbrnf( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrnf = value ;
   }

   public java.util.Date getAlbrfenf( )
   {
      return gxTv_SdtBC_ALBREC_Albrfenf ;
   }

   public void setAlbrfenf( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrfenf = value ;
   }

   public String getAlbrcfop( )
   {
      return gxTv_SdtBC_ALBREC_Albrcfop ;
   }

   public void setAlbrcfop( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrcfop = value ;
   }

   public String getAlbrdiscli( )
   {
      return gxTv_SdtBC_ALBREC_Albrdiscli ;
   }

   public void setAlbrdiscli( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrdiscli = value ;
   }

   public short getAlbrtartc( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartc ;
   }

   public void setAlbrtartc( short value )
   {
      gxTv_SdtBC_ALBREC_Albrtartc_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtartc = value ;
   }

   public String getAlbrtartd( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartd ;
   }

   public void setAlbrtartd( String value )
   {
      gxTv_SdtBC_ALBREC_Albrtartd_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtartd = value ;
   }

   public String getAlbrimp( )
   {
      return gxTv_SdtBC_ALBREC_Albrimp ;
   }

   public void setAlbrimp( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrimp = value ;
   }

   public String getAlbrlote( )
   {
      return gxTv_SdtBC_ALBREC_Albrlote ;
   }

   public void setAlbrlote( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrlote = value ;
   }

   public String getAlbrtelar( )
   {
      return gxTv_SdtBC_ALBREC_Albrtelar ;
   }

   public void setAlbrtelar( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtelar = value ;
   }

   public String getAlbrlot2( )
   {
      return gxTv_SdtBC_ALBREC_Albrlot2 ;
   }

   public void setAlbrlot2( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrlot2 = value ;
   }

   public java.math.BigDecimal getAlbrlu( )
   {
      return gxTv_SdtBC_ALBREC_Albrlu ;
   }

   public void setAlbrlu( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrlu = value ;
   }

   public String getAlbrmdlcod( )
   {
      return gxTv_SdtBC_ALBREC_Albrmdlcod ;
   }

   public void setAlbrmdlcod( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrmdlcod = value ;
   }

   public java.math.BigDecimal getAlbrtara( )
   {
      return gxTv_SdtBC_ALBREC_Albrtara ;
   }

   public void setAlbrtara( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtara = value ;
   }

   public java.math.BigDecimal getAlbrunib( )
   {
      return gxTv_SdtBC_ALBREC_Albrunib ;
   }

   public void setAlbrunib( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunib = value ;
   }

   public String getAlbdocprv( )
   {
      return gxTv_SdtBC_ALBREC_Albdocprv ;
   }

   public void setAlbdocprv( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albdocprv = value ;
   }

   public java.math.BigDecimal getAlbrudas( )
   {
      return gxTv_SdtBC_ALBREC_Albrudas ;
   }

   public void setAlbrudas( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrudas = value ;
   }

   public byte getAlmcod( )
   {
      return gxTv_SdtBC_ALBREC_Almcod ;
   }

   public void setAlmcod( byte value )
   {
      gxTv_SdtBC_ALBREC_Almcod_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Almcod = value ;
   }

   public String getAlmnom( )
   {
      return gxTv_SdtBC_ALBREC_Almnom ;
   }

   public void setAlmnom( String value )
   {
      gxTv_SdtBC_ALBREC_Almnom_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Almnom = value ;
   }

   public String getAlbcolor( )
   {
      return gxTv_SdtBC_ALBREC_Albcolor ;
   }

   public void setAlbcolor( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albcolor = value ;
   }

   public String getAlbopst( )
   {
      return gxTv_SdtBC_ALBREC_Albopst ;
   }

   public void setAlbopst( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albopst = value ;
   }

   public String getAlbopsc( )
   {
      return gxTv_SdtBC_ALBREC_Albopsc ;
   }

   public void setAlbopsc( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albopsc = value ;
   }

   public String getAlboc( )
   {
      return gxTv_SdtBC_ALBREC_Alboc ;
   }

   public void setAlboc( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Alboc = value ;
   }

   public String getAlbhdri( )
   {
      return gxTv_SdtBC_ALBREC_Albhdri ;
   }

   public void setAlbhdri( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albhdri = value ;
   }

   public String getAlbnumb( )
   {
      return gxTv_SdtBC_ALBREC_Albnumb ;
   }

   public void setAlbnumb( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albnumb = value ;
   }

   public String getAlbnumm( )
   {
      return gxTv_SdtBC_ALBREC_Albnumm ;
   }

   public void setAlbnumm( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albnumm = value ;
   }

   public java.math.BigDecimal getAlbancc( )
   {
      return gxTv_SdtBC_ALBREC_Albancc ;
   }

   public void setAlbancc( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albancc = value ;
   }

   public short getAlbdndc( )
   {
      return gxTv_SdtBC_ALBREC_Albdndc ;
   }

   public void setAlbdndc( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albdndc = value ;
   }

   public java.math.BigDecimal getAlbanccr( )
   {
      return gxTv_SdtBC_ALBREC_Albanccr ;
   }

   public void setAlbanccr( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albanccr = value ;
   }

   public short getAlbdndcr( )
   {
      return gxTv_SdtBC_ALBREC_Albdndcr ;
   }

   public void setAlbdndcr( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albdndcr = value ;
   }

   public short getAlbgalga( )
   {
      return gxTv_SdtBC_ALBREC_Albgalga ;
   }

   public void setAlbgalga( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albgalga = value ;
   }

   public String getAlbmaqtej( )
   {
      return gxTv_SdtBC_ALBREC_Albmaqtej ;
   }

   public void setAlbmaqtej( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albmaqtej = value ;
   }

   public short getAlbdmt( )
   {
      return gxTv_SdtBC_ALBREC_Albdmt ;
   }

   public void setAlbdmt( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albdmt = value ;
   }

   public String getAlbpdac( )
   {
      return gxTv_SdtBC_ALBREC_Albpdac ;
   }

   public void setAlbpdac( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albpdac = value ;
   }

   public String getAlbostj( )
   {
      return gxTv_SdtBC_ALBREC_Albostj ;
   }

   public void setAlbostj( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albostj = value ;
   }

   public byte getAlbstlot( )
   {
      return gxTv_SdtBC_ALBREC_Albstlot ;
   }

   public void setAlbstlot( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albstlot = value ;
   }

   public byte getAlbturno( )
   {
      return gxTv_SdtBC_ALBREC_Albturno ;
   }

   public void setAlbturno( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albturno = value ;
   }

   public String getCliest( )
   {
      return gxTv_SdtBC_ALBREC_Cliest ;
   }

   public void setCliest( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Cliest = value ;
   }

   public String getAlboekotex( )
   {
      return gxTv_SdtBC_ALBREC_Alboekotex ;
   }

   public void setAlboekotex( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Alboekotex = value ;
   }

   public String getAlbrent_3( )
   {
      return gxTv_SdtBC_ALBREC_Albrent_3 ;
   }

   public void setAlbrent_3( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrent_3 = value ;
   }

   public java.math.BigDecimal getAlbrartlu( )
   {
      return gxTv_SdtBC_ALBREC_Albrartlu ;
   }

   public void setAlbrartlu( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_Albrartlu_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrartlu = value ;
   }

   public java.util.Vector<app.StructSdtBC_ALBREC_Level1Item> getLevel1( )
   {
      return gxTv_SdtBC_ALBREC_Level1 ;
   }

   public void setLevel1( java.util.Vector<app.StructSdtBC_ALBREC_Level1Item> value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Level1 = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtBC_ALBREC_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtBC_ALBREC_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Emprcod_Z = value ;
   }

   public int getAlbreccod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albreccod_Z ;
   }

   public void setAlbreccod_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albreccod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Emprnom_Z = value ;
   }

   public int getClicod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Clicod_Z ;
   }

   public void setClicod_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Clicod_Z = value ;
   }

   public String getClinom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Clinom_Z ;
   }

   public void setClinom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Clinom_Z = value ;
   }

   public String getAlbref_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albref_Z ;
   }

   public void setAlbref_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albref_Z = value ;
   }

   public short getTrncod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Trncod_Z ;
   }

   public void setTrncod_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Trncod_Z = value ;
   }

   public String getTrnnom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Trnnom_Z ;
   }

   public void setTrnnom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Trnnom_Z = value ;
   }

   public String getAlbrent_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrent_Z ;
   }

   public void setAlbrent_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrent_Z = value ;
   }

   public int getAlbrpieent_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpieent_Z ;
   }

   public void setAlbrpieent_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpieent_Z = value ;
   }

   public String getAlbruni_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albruni_Z ;
   }

   public void setAlbruni_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albruni_Z = value ;
   }

   public String getAlbrloc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrloc_Z ;
   }

   public void setAlbrloc_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrloc_Z = value ;
   }

   public java.util.Date getAlbrfen_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrfen_Z ;
   }

   public void setAlbrfen_Z( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrfen_Z = value ;
   }

   public java.math.BigDecimal getAlbrunient_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunient_Z ;
   }

   public void setAlbrunient_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunient_Z = value ;
   }

   public String getAlbrtam_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtam_Z ;
   }

   public void setAlbrtam_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtam_Z = value ;
   }

   public String getEmp_item1_Z( )
   {
      return gxTv_SdtBC_ALBREC_Emp_item1_Z ;
   }

   public void setEmp_item1_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Emp_item1_Z = value ;
   }

   public String getAlbrreo_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrreo_Z ;
   }

   public void setAlbrreo_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrreo_Z = value ;
   }

   public int getAlbrpieuti_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpieuti_Z ;
   }

   public void setAlbrpieuti_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpieuti_Z = value ;
   }

   public int getAlbrpiereb_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiereb_Z ;
   }

   public void setAlbrpiereb_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpiereb_Z = value ;
   }

   public java.math.BigDecimal getAlbruniuti_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albruniuti_Z ;
   }

   public void setAlbruniuti_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albruniuti_Z = value ;
   }

   public java.math.BigDecimal getAlbrunireb_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunireb_Z ;
   }

   public void setAlbrunireb_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunireb_Z = value ;
   }

   public int getAlbrpiedis_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiedis_Z ;
   }

   public void setAlbrpiedis_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpiedis_Z = value ;
   }

   public java.math.BigDecimal getAlbrunidis_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunidis_Z ;
   }

   public void setAlbrunidis_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunidis_Z = value ;
   }

   public java.util.Date getAlbrfecult_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrfecult_Z ;
   }

   public void setAlbrfecult_Z( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrfecult_Z = value ;
   }

   public byte getAlbrest_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrest_Z ;
   }

   public void setAlbrest_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrest_Z = value ;
   }

   public short getTipentcod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Tipentcod_Z ;
   }

   public void setTipentcod_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Tipentcod_Z = value ;
   }

   public String getTipentnom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Tipentnom_Z ;
   }

   public void setTipentnom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Tipentnom_Z = value ;
   }

   public short getAlbnumeti_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albnumeti_Z ;
   }

   public void setAlbnumeti_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albnumeti_Z = value ;
   }

   public String getAlbrdes_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrdes_Z ;
   }

   public void setAlbrdes_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrdes_Z = value ;
   }

   public short getProcecod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Procecod_Z ;
   }

   public void setProcecod_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Procecod_Z = value ;
   }

   public String getProcenom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Procenom_Z ;
   }

   public void setProcenom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Procenom_Z = value ;
   }

   public byte getAlbrulin_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrulin_Z ;
   }

   public void setAlbrulin_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrulin_Z = value ;
   }

   public String getAlbrefdsc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrefdsc_Z ;
   }

   public void setAlbrefdsc_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrefdsc_Z = value ;
   }

   public java.math.BigDecimal getAlbpmppza_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albpmppza_Z ;
   }

   public void setAlbpmppza_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albpmppza_Z = value ;
   }

   public int getAlbpzaest_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albpzaest_Z ;
   }

   public void setAlbpzaest_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albpzaest_Z = value ;
   }

   public short getAlbrgrm2_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrgrm2_Z ;
   }

   public void setAlbrgrm2_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrgrm2_Z = value ;
   }

   public short getAlbranc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albranc_Z ;
   }

   public void setAlbranc_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albranc_Z = value ;
   }

   public short getAlbpml_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albpml_Z ;
   }

   public void setAlbpml_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albpml_Z = value ;
   }

   public java.math.BigDecimal getAlbrpre_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpre_Z ;
   }

   public void setAlbrpre_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpre_Z = value ;
   }

   public java.math.BigDecimal getAlbraju_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albraju_Z ;
   }

   public void setAlbraju_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albraju_Z = value ;
   }

   public byte getAlbrrep_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrrep_Z ;
   }

   public void setAlbrrep_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrrep_Z = value ;
   }

   public String getAlbrent2_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrent2_Z ;
   }

   public void setAlbrent2_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrent2_Z = value ;
   }

   public String getAlbrusu_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrusu_Z ;
   }

   public void setAlbrusu_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrusu_Z = value ;
   }

   public java.util.Date getAlbrhor_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrhor_Z ;
   }

   public void setAlbrhor_Z( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrhor_Z = value ;
   }

   public java.math.BigDecimal getAlbrunic_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunic_Z ;
   }

   public void setAlbrunic_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunic_Z = value ;
   }

   public int getAlbrpiec_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrpiec_Z ;
   }

   public void setAlbrpiec_Z( int value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrpiec_Z = value ;
   }

   public String getAlbrnf_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrnf_Z ;
   }

   public void setAlbrnf_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrnf_Z = value ;
   }

   public java.util.Date getAlbrfenf_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrfenf_Z ;
   }

   public void setAlbrfenf_Z( java.util.Date value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrfenf_Z = value ;
   }

   public String getAlbrcfop_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrcfop_Z ;
   }

   public void setAlbrcfop_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrcfop_Z = value ;
   }

   public String getAlbrdiscli_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrdiscli_Z ;
   }

   public void setAlbrdiscli_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrdiscli_Z = value ;
   }

   public short getAlbrtartc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartc_Z ;
   }

   public void setAlbrtartc_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtartc_Z = value ;
   }

   public String getAlbrtartd_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartd_Z ;
   }

   public void setAlbrtartd_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtartd_Z = value ;
   }

   public String getAlbrimp_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrimp_Z ;
   }

   public void setAlbrimp_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrimp_Z = value ;
   }

   public String getAlbrlote_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrlote_Z ;
   }

   public void setAlbrlote_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrlote_Z = value ;
   }

   public String getAlbrtelar_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtelar_Z ;
   }

   public void setAlbrtelar_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtelar_Z = value ;
   }

   public String getAlbrlot2_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrlot2_Z ;
   }

   public void setAlbrlot2_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrlot2_Z = value ;
   }

   public java.math.BigDecimal getAlbrlu_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrlu_Z ;
   }

   public void setAlbrlu_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrlu_Z = value ;
   }

   public String getAlbrmdlcod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrmdlcod_Z ;
   }

   public void setAlbrmdlcod_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrmdlcod_Z = value ;
   }

   public java.math.BigDecimal getAlbrtara_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrtara_Z ;
   }

   public void setAlbrtara_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtara_Z = value ;
   }

   public java.math.BigDecimal getAlbrunib_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrunib_Z ;
   }

   public void setAlbrunib_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrunib_Z = value ;
   }

   public String getAlbdocprv_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albdocprv_Z ;
   }

   public void setAlbdocprv_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albdocprv_Z = value ;
   }

   public java.math.BigDecimal getAlbrudas_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrudas_Z ;
   }

   public void setAlbrudas_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrudas_Z = value ;
   }

   public byte getAlmcod_Z( )
   {
      return gxTv_SdtBC_ALBREC_Almcod_Z ;
   }

   public void setAlmcod_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Almcod_Z = value ;
   }

   public String getAlmnom_Z( )
   {
      return gxTv_SdtBC_ALBREC_Almnom_Z ;
   }

   public void setAlmnom_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Almnom_Z = value ;
   }

   public String getAlbcolor_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albcolor_Z ;
   }

   public void setAlbcolor_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albcolor_Z = value ;
   }

   public String getAlbopst_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albopst_Z ;
   }

   public void setAlbopst_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albopst_Z = value ;
   }

   public String getAlbopsc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albopsc_Z ;
   }

   public void setAlbopsc_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albopsc_Z = value ;
   }

   public String getAlboc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Alboc_Z ;
   }

   public void setAlboc_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Alboc_Z = value ;
   }

   public String getAlbhdri_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albhdri_Z ;
   }

   public void setAlbhdri_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albhdri_Z = value ;
   }

   public String getAlbnumb_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albnumb_Z ;
   }

   public void setAlbnumb_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albnumb_Z = value ;
   }

   public String getAlbnumm_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albnumm_Z ;
   }

   public void setAlbnumm_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albnumm_Z = value ;
   }

   public java.math.BigDecimal getAlbancc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albancc_Z ;
   }

   public void setAlbancc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albancc_Z = value ;
   }

   public short getAlbdndc_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albdndc_Z ;
   }

   public void setAlbdndc_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albdndc_Z = value ;
   }

   public java.math.BigDecimal getAlbanccr_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albanccr_Z ;
   }

   public void setAlbanccr_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albanccr_Z = value ;
   }

   public short getAlbdndcr_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albdndcr_Z ;
   }

   public void setAlbdndcr_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albdndcr_Z = value ;
   }

   public short getAlbgalga_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albgalga_Z ;
   }

   public void setAlbgalga_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albgalga_Z = value ;
   }

   public String getAlbmaqtej_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albmaqtej_Z ;
   }

   public void setAlbmaqtej_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albmaqtej_Z = value ;
   }

   public short getAlbdmt_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albdmt_Z ;
   }

   public void setAlbdmt_Z( short value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albdmt_Z = value ;
   }

   public String getAlbpdac_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albpdac_Z ;
   }

   public void setAlbpdac_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albpdac_Z = value ;
   }

   public String getAlbostj_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albostj_Z ;
   }

   public void setAlbostj_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albostj_Z = value ;
   }

   public byte getAlbstlot_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albstlot_Z ;
   }

   public void setAlbstlot_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albstlot_Z = value ;
   }

   public byte getAlbturno_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albturno_Z ;
   }

   public void setAlbturno_Z( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albturno_Z = value ;
   }

   public String getCliest_Z( )
   {
      return gxTv_SdtBC_ALBREC_Cliest_Z ;
   }

   public void setCliest_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Cliest_Z = value ;
   }

   public String getAlboekotex_Z( )
   {
      return gxTv_SdtBC_ALBREC_Alboekotex_Z ;
   }

   public void setAlboekotex_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Alboekotex_Z = value ;
   }

   public String getAlbrent_3_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrent_3_Z ;
   }

   public void setAlbrent_3_Z( String value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrent_3_Z = value ;
   }

   public java.math.BigDecimal getAlbrartlu_Z( )
   {
      return gxTv_SdtBC_ALBREC_Albrartlu_Z ;
   }

   public void setAlbrartlu_Z( java.math.BigDecimal value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrartlu_Z = value ;
   }

   public byte getAlbreccod_N( )
   {
      return gxTv_SdtBC_ALBREC_Albreccod_N ;
   }

   public void setAlbreccod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albreccod_N = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtBC_ALBREC_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Emprnom_N = value ;
   }

   public byte getTrncod_N( )
   {
      return gxTv_SdtBC_ALBREC_Trncod_N ;
   }

   public void setTrncod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Trncod_N = value ;
   }

   public byte getTrnnom_N( )
   {
      return gxTv_SdtBC_ALBREC_Trnnom_N ;
   }

   public void setTrnnom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Trnnom_N = value ;
   }

   public byte getTipentcod_N( )
   {
      return gxTv_SdtBC_ALBREC_Tipentcod_N ;
   }

   public void setTipentcod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Tipentcod_N = value ;
   }

   public byte getTipentnom_N( )
   {
      return gxTv_SdtBC_ALBREC_Tipentnom_N ;
   }

   public void setTipentnom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Tipentnom_N = value ;
   }

   public byte getProcecod_N( )
   {
      return gxTv_SdtBC_ALBREC_Procecod_N ;
   }

   public void setProcecod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Procecod_N = value ;
   }

   public byte getProcenom_N( )
   {
      return gxTv_SdtBC_ALBREC_Procenom_N ;
   }

   public void setProcenom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Procenom_N = value ;
   }

   public byte getAlbrtartc_N( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartc_N ;
   }

   public void setAlbrtartc_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtartc_N = value ;
   }

   public byte getAlbrtartd_N( )
   {
      return gxTv_SdtBC_ALBREC_Albrtartd_N ;
   }

   public void setAlbrtartd_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrtartd_N = value ;
   }

   public byte getAlmcod_N( )
   {
      return gxTv_SdtBC_ALBREC_Almcod_N ;
   }

   public void setAlmcod_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Almcod_N = value ;
   }

   public byte getAlmnom_N( )
   {
      return gxTv_SdtBC_ALBREC_Almnom_N ;
   }

   public void setAlmnom_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Almnom_N = value ;
   }

   public byte getAlbrartlu_N( )
   {
      return gxTv_SdtBC_ALBREC_Albrartlu_N ;
   }

   public void setAlbrartlu_N( byte value )
   {
      gxTv_SdtBC_ALBREC_N = (byte)(0) ;
      gxTv_SdtBC_ALBREC_Albrartlu_N = value ;
   }

   protected byte gxTv_SdtBC_ALBREC_Albrest ;
   protected byte gxTv_SdtBC_ALBREC_Albrulin ;
   protected byte gxTv_SdtBC_ALBREC_Albrrep ;
   protected byte gxTv_SdtBC_ALBREC_Almcod ;
   protected byte gxTv_SdtBC_ALBREC_Albstlot ;
   protected byte gxTv_SdtBC_ALBREC_Albturno ;
   protected byte gxTv_SdtBC_ALBREC_Albrest_Z ;
   protected byte gxTv_SdtBC_ALBREC_Albrulin_Z ;
   protected byte gxTv_SdtBC_ALBREC_Albrrep_Z ;
   protected byte gxTv_SdtBC_ALBREC_Almcod_Z ;
   protected byte gxTv_SdtBC_ALBREC_Albstlot_Z ;
   protected byte gxTv_SdtBC_ALBREC_Albturno_Z ;
   protected byte gxTv_SdtBC_ALBREC_Albreccod_N ;
   protected byte gxTv_SdtBC_ALBREC_Emprnom_N ;
   protected byte gxTv_SdtBC_ALBREC_Trncod_N ;
   protected byte gxTv_SdtBC_ALBREC_Trnnom_N ;
   protected byte gxTv_SdtBC_ALBREC_Tipentcod_N ;
   protected byte gxTv_SdtBC_ALBREC_Tipentnom_N ;
   protected byte gxTv_SdtBC_ALBREC_Procecod_N ;
   protected byte gxTv_SdtBC_ALBREC_Procenom_N ;
   protected byte gxTv_SdtBC_ALBREC_Albrtartc_N ;
   protected byte gxTv_SdtBC_ALBREC_Albrtartd_N ;
   protected byte gxTv_SdtBC_ALBREC_Almcod_N ;
   protected byte gxTv_SdtBC_ALBREC_Almnom_N ;
   protected byte gxTv_SdtBC_ALBREC_Albrartlu_N ;
   private byte gxTv_SdtBC_ALBREC_N ;
   protected short gxTv_SdtBC_ALBREC_Trncod ;
   protected short gxTv_SdtBC_ALBREC_Tipentcod ;
   protected short gxTv_SdtBC_ALBREC_Albnumeti ;
   protected short gxTv_SdtBC_ALBREC_Procecod ;
   protected short gxTv_SdtBC_ALBREC_Albrgrm2 ;
   protected short gxTv_SdtBC_ALBREC_Albranc ;
   protected short gxTv_SdtBC_ALBREC_Albpml ;
   protected short gxTv_SdtBC_ALBREC_Albrtartc ;
   protected short gxTv_SdtBC_ALBREC_Albdndc ;
   protected short gxTv_SdtBC_ALBREC_Albdndcr ;
   protected short gxTv_SdtBC_ALBREC_Albgalga ;
   protected short gxTv_SdtBC_ALBREC_Albdmt ;
   protected short gxTv_SdtBC_ALBREC_Initialized ;
   protected short gxTv_SdtBC_ALBREC_Trncod_Z ;
   protected short gxTv_SdtBC_ALBREC_Tipentcod_Z ;
   protected short gxTv_SdtBC_ALBREC_Albnumeti_Z ;
   protected short gxTv_SdtBC_ALBREC_Procecod_Z ;
   protected short gxTv_SdtBC_ALBREC_Albrgrm2_Z ;
   protected short gxTv_SdtBC_ALBREC_Albranc_Z ;
   protected short gxTv_SdtBC_ALBREC_Albpml_Z ;
   protected short gxTv_SdtBC_ALBREC_Albrtartc_Z ;
   protected short gxTv_SdtBC_ALBREC_Albdndc_Z ;
   protected short gxTv_SdtBC_ALBREC_Albdndcr_Z ;
   protected short gxTv_SdtBC_ALBREC_Albgalga_Z ;
   protected short gxTv_SdtBC_ALBREC_Albdmt_Z ;
   protected int gxTv_SdtBC_ALBREC_Albreccod ;
   protected int gxTv_SdtBC_ALBREC_Clicod ;
   protected int gxTv_SdtBC_ALBREC_Albrpieent ;
   protected int gxTv_SdtBC_ALBREC_Albrpieuti ;
   protected int gxTv_SdtBC_ALBREC_Albrpiereb ;
   protected int gxTv_SdtBC_ALBREC_Albrpiedis ;
   protected int gxTv_SdtBC_ALBREC_Albpzaest ;
   protected int gxTv_SdtBC_ALBREC_Albrpiec ;
   protected int gxTv_SdtBC_ALBREC_Albreccod_Z ;
   protected int gxTv_SdtBC_ALBREC_Clicod_Z ;
   protected int gxTv_SdtBC_ALBREC_Albrpieent_Z ;
   protected int gxTv_SdtBC_ALBREC_Albrpieuti_Z ;
   protected int gxTv_SdtBC_ALBREC_Albrpiereb_Z ;
   protected int gxTv_SdtBC_ALBREC_Albrpiedis_Z ;
   protected int gxTv_SdtBC_ALBREC_Albpzaest_Z ;
   protected int gxTv_SdtBC_ALBREC_Albrpiec_Z ;
   protected String gxTv_SdtBC_ALBREC_Emprcod ;
   protected String gxTv_SdtBC_ALBREC_Emprnom ;
   protected String gxTv_SdtBC_ALBREC_Clinom ;
   protected String gxTv_SdtBC_ALBREC_Albref ;
   protected String gxTv_SdtBC_ALBREC_Trnnom ;
   protected String gxTv_SdtBC_ALBREC_Albrent ;
   protected String gxTv_SdtBC_ALBREC_Albruni ;
   protected String gxTv_SdtBC_ALBREC_Albrloc ;
   protected String gxTv_SdtBC_ALBREC_Albrtam ;
   protected String gxTv_SdtBC_ALBREC_Emp_item1 ;
   protected String gxTv_SdtBC_ALBREC_Albrreo ;
   protected String gxTv_SdtBC_ALBREC_Tipentnom ;
   protected String gxTv_SdtBC_ALBREC_Albrdes ;
   protected String gxTv_SdtBC_ALBREC_Procenom ;
   protected String gxTv_SdtBC_ALBREC_Albrefdsc ;
   protected String gxTv_SdtBC_ALBREC_Albrent2 ;
   protected String gxTv_SdtBC_ALBREC_Albrusu ;
   protected String gxTv_SdtBC_ALBREC_Albrnf ;
   protected String gxTv_SdtBC_ALBREC_Albrcfop ;
   protected String gxTv_SdtBC_ALBREC_Albrdiscli ;
   protected String gxTv_SdtBC_ALBREC_Albrtartd ;
   protected String gxTv_SdtBC_ALBREC_Albrimp ;
   protected String gxTv_SdtBC_ALBREC_Albrlote ;
   protected String gxTv_SdtBC_ALBREC_Albrtelar ;
   protected String gxTv_SdtBC_ALBREC_Albrmdlcod ;
   protected String gxTv_SdtBC_ALBREC_Albdocprv ;
   protected String gxTv_SdtBC_ALBREC_Almnom ;
   protected String gxTv_SdtBC_ALBREC_Albcolor ;
   protected String gxTv_SdtBC_ALBREC_Albopst ;
   protected String gxTv_SdtBC_ALBREC_Albopsc ;
   protected String gxTv_SdtBC_ALBREC_Alboc ;
   protected String gxTv_SdtBC_ALBREC_Albhdri ;
   protected String gxTv_SdtBC_ALBREC_Albnumb ;
   protected String gxTv_SdtBC_ALBREC_Albnumm ;
   protected String gxTv_SdtBC_ALBREC_Albmaqtej ;
   protected String gxTv_SdtBC_ALBREC_Albpdac ;
   protected String gxTv_SdtBC_ALBREC_Albostj ;
   protected String gxTv_SdtBC_ALBREC_Cliest ;
   protected String gxTv_SdtBC_ALBREC_Alboekotex ;
   protected String gxTv_SdtBC_ALBREC_Albrent_3 ;
   protected String gxTv_SdtBC_ALBREC_Mode ;
   protected String gxTv_SdtBC_ALBREC_Emprcod_Z ;
   protected String gxTv_SdtBC_ALBREC_Emprnom_Z ;
   protected String gxTv_SdtBC_ALBREC_Clinom_Z ;
   protected String gxTv_SdtBC_ALBREC_Albref_Z ;
   protected String gxTv_SdtBC_ALBREC_Trnnom_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrent_Z ;
   protected String gxTv_SdtBC_ALBREC_Albruni_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrloc_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrtam_Z ;
   protected String gxTv_SdtBC_ALBREC_Emp_item1_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrreo_Z ;
   protected String gxTv_SdtBC_ALBREC_Tipentnom_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrdes_Z ;
   protected String gxTv_SdtBC_ALBREC_Procenom_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrefdsc_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrent2_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrusu_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrnf_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrcfop_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrdiscli_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrtartd_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrimp_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrlote_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrtelar_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrmdlcod_Z ;
   protected String gxTv_SdtBC_ALBREC_Albdocprv_Z ;
   protected String gxTv_SdtBC_ALBREC_Almnom_Z ;
   protected String gxTv_SdtBC_ALBREC_Albcolor_Z ;
   protected String gxTv_SdtBC_ALBREC_Albopst_Z ;
   protected String gxTv_SdtBC_ALBREC_Albopsc_Z ;
   protected String gxTv_SdtBC_ALBREC_Alboc_Z ;
   protected String gxTv_SdtBC_ALBREC_Albhdri_Z ;
   protected String gxTv_SdtBC_ALBREC_Albnumb_Z ;
   protected String gxTv_SdtBC_ALBREC_Albnumm_Z ;
   protected String gxTv_SdtBC_ALBREC_Albmaqtej_Z ;
   protected String gxTv_SdtBC_ALBREC_Albpdac_Z ;
   protected String gxTv_SdtBC_ALBREC_Albostj_Z ;
   protected String gxTv_SdtBC_ALBREC_Cliest_Z ;
   protected String gxTv_SdtBC_ALBREC_Alboekotex_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrent_3_Z ;
   protected String gxTv_SdtBC_ALBREC_Albrlot2 ;
   protected String gxTv_SdtBC_ALBREC_Albrlot2_Z ;
   protected java.util.Date gxTv_SdtBC_ALBREC_Albrfen ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albruniuti ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunireb ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunidis ;
   protected java.util.Date gxTv_SdtBC_ALBREC_Albrfecult ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albpmppza ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrpre ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albraju ;
   protected java.util.Date gxTv_SdtBC_ALBREC_Albrhor ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunic ;
   protected java.util.Date gxTv_SdtBC_ALBREC_Albrfenf ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrlu ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrtara ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunib ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrudas ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albancc ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albanccr ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrartlu ;
   protected java.util.Date gxTv_SdtBC_ALBREC_Albrfen_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunient_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albruniuti_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunireb_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunidis_Z ;
   protected java.util.Date gxTv_SdtBC_ALBREC_Albrfecult_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albpmppza_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrpre_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albraju_Z ;
   protected java.util.Date gxTv_SdtBC_ALBREC_Albrhor_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunic_Z ;
   protected java.util.Date gxTv_SdtBC_ALBREC_Albrfenf_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrlu_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrtara_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrunib_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrudas_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albancc_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albanccr_Z ;
   protected java.math.BigDecimal gxTv_SdtBC_ALBREC_Albrartlu_Z ;
   protected java.util.Vector<app.StructSdtBC_ALBREC_Level1Item> gxTv_SdtBC_ALBREC_Level1=null ;
}

