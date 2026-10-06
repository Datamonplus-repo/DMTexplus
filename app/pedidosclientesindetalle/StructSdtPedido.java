package app.pedidosclientesindetalle ;
import com.genexus.*;

public final  class StructSdtPedido implements Cloneable, java.io.Serializable
{
   public StructSdtPedido( )
   {
      this( -1, new ModelContext( StructSdtPedido.class ));
   }

   public StructSdtPedido( int remoteHandle ,
                           ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtPedido_Emprcod = "" ;
      gxTv_SdtPedido_Emprnom = "" ;
      gxTv_SdtPedido_Pricod = "" ;
      gxTv_SdtPedido_Distipdis = "" ;
      gxTv_SdtPedido_Disenccli = "" ;
      gxTv_SdtPedido_Clinom = "" ;
      gxTv_SdtPedido_Clinomdes = "" ;
      gxTv_SdtPedido_Disfec = cal.getTime() ;
      gxTv_SdtPedido_Disfeccli = cal.getTime() ;
      gxTv_SdtPedido_Disfecent = cal.getTime() ;
      gxTv_SdtPedido_Disartcod = "" ;
      gxTv_SdtPedido_Disartdsc = "" ;
      gxTv_SdtPedido_Disarttipd = "" ;
      gxTv_SdtPedido_Disartmat = "" ;
      gxTv_SdtPedido_Disarttr1 = "" ;
      gxTv_SdtPedido_Disarttr2 = "" ;
      gxTv_SdtPedido_Disarttr3 = "" ;
      gxTv_SdtPedido_Disartur1 = "" ;
      gxTv_SdtPedido_Disartur2 = "" ;
      gxTv_SdtPedido_Disartur3 = "" ;
      gxTv_SdtPedido_Discolnom = "" ;
      gxTv_SdtPedido_Disdes = "" ;
      gxTv_SdtPedido_Disartdsc2 = "" ;
      gxTv_SdtPedido_Disple2 = "" ;
      gxTv_SdtPedido_Disartlar = "" ;
      gxTv_SdtPedido_Disartsua = "" ;
      gxTv_SdtPedido_Disartaca = "" ;
      gxTv_SdtPedido_Disartenc = "" ;
      gxTv_SdtPedido_Disartcor = "" ;
      gxTv_SdtPedido_Disartrdt = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disenccom = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disencanh = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disrdoa = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disrdon = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disobsgrm = "" ;
      gxTv_SdtPedido_Disobsanc = "" ;
      gxTv_SdtPedido_Disitem5 = "" ;
      gxTv_SdtPedido_Disartple = "" ;
      gxTv_SdtPedido_Disunimed = "" ;
      gxTv_SdtPedido_Cod_idtx = "" ;
      gxTv_SdtPedido_Dsc_idtx = "" ;
      gxTv_SdtPedido_Disordcomp = "" ;
      gxTv_SdtPedido_Revenid = "" ;
      gxTv_SdtPedido_Revennm = "" ;
      gxTv_SdtPedido_Marcaid = "" ;
      gxTv_SdtPedido_Marcadsc = "" ;
      gxTv_SdtPedido_Disidtx2 = "" ;
      gxTv_SdtPedido_Nxt_modelo = "" ;
      gxTv_SdtPedido_Cptedsc = "" ;
      gxTv_SdtPedido_Nxt_statio = "" ;
      gxTv_SdtPedido_Desadsc = "" ;
      gxTv_SdtPedido_Dptodsc = "" ;
      gxTv_SdtPedido_Nxt_artcli = "" ;
      gxTv_SdtPedido_Disexp = "" ;
      gxTv_SdtPedido_Mode = "" ;
      gxTv_SdtPedido_Emprcod_Z = "" ;
      gxTv_SdtPedido_Emprnom_Z = "" ;
      gxTv_SdtPedido_Pricod_Z = "" ;
      gxTv_SdtPedido_Distipdis_Z = "" ;
      gxTv_SdtPedido_Disenccli_Z = "" ;
      gxTv_SdtPedido_Clinom_Z = "" ;
      gxTv_SdtPedido_Clinomdes_Z = "" ;
      gxTv_SdtPedido_Disfec_Z = cal.getTime() ;
      gxTv_SdtPedido_Disfeccli_Z = cal.getTime() ;
      gxTv_SdtPedido_Disfecent_Z = cal.getTime() ;
      gxTv_SdtPedido_Disartcod_Z = "" ;
      gxTv_SdtPedido_Disartdsc_Z = "" ;
      gxTv_SdtPedido_Disarttipd_Z = "" ;
      gxTv_SdtPedido_Disartmat_Z = "" ;
      gxTv_SdtPedido_Disarttr1_Z = "" ;
      gxTv_SdtPedido_Disarttr2_Z = "" ;
      gxTv_SdtPedido_Disarttr3_Z = "" ;
      gxTv_SdtPedido_Disartur1_Z = "" ;
      gxTv_SdtPedido_Disartur2_Z = "" ;
      gxTv_SdtPedido_Disartur3_Z = "" ;
      gxTv_SdtPedido_Discolnom_Z = "" ;
      gxTv_SdtPedido_Disdes_Z = "" ;
      gxTv_SdtPedido_Disartdsc2_Z = "" ;
      gxTv_SdtPedido_Disple2_Z = "" ;
      gxTv_SdtPedido_Disartlar_Z = "" ;
      gxTv_SdtPedido_Disartsua_Z = "" ;
      gxTv_SdtPedido_Disartaca_Z = "" ;
      gxTv_SdtPedido_Disartenc_Z = "" ;
      gxTv_SdtPedido_Disartcor_Z = "" ;
      gxTv_SdtPedido_Disartrdt_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disenccom_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disencanh_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disrdoa_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disrdon_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtPedido_Disobsgrm_Z = "" ;
      gxTv_SdtPedido_Disobsanc_Z = "" ;
      gxTv_SdtPedido_Disitem5_Z = "" ;
      gxTv_SdtPedido_Disartple_Z = "" ;
      gxTv_SdtPedido_Disunimed_Z = "" ;
      gxTv_SdtPedido_Cod_idtx_Z = "" ;
      gxTv_SdtPedido_Dsc_idtx_Z = "" ;
      gxTv_SdtPedido_Disordcomp_Z = "" ;
      gxTv_SdtPedido_Revenid_Z = "" ;
      gxTv_SdtPedido_Revennm_Z = "" ;
      gxTv_SdtPedido_Marcaid_Z = "" ;
      gxTv_SdtPedido_Marcadsc_Z = "" ;
      gxTv_SdtPedido_Disidtx2_Z = "" ;
      gxTv_SdtPedido_Nxt_modelo_Z = "" ;
      gxTv_SdtPedido_Cptedsc_Z = "" ;
      gxTv_SdtPedido_Nxt_statio_Z = "" ;
      gxTv_SdtPedido_Desadsc_Z = "" ;
      gxTv_SdtPedido_Dptodsc_Z = "" ;
      gxTv_SdtPedido_Nxt_artcli_Z = "" ;
      gxTv_SdtPedido_Disexp_Z = "" ;
      gxTv_SdtPedido_Emprnom_N = (byte)(1) ;
      gxTv_SdtPedido_Distipdis_N = (byte)(1) ;
      gxTv_SdtPedido_E_disclides_N = (byte)(1) ;
      gxTv_SdtPedido_E_disartcod_N = (byte)(1) ;
      gxTv_SdtPedido_Disartpu3_N = (byte)(1) ;
      gxTv_SdtPedido_Discolnom_N = (byte)(1) ;
      gxTv_SdtPedido_Discolnum_N = (byte)(1) ;
      gxTv_SdtPedido_Distipcol_N = (byte)(1) ;
      gxTv_SdtPedido_Cod_idtx_N = (byte)(1) ;
      gxTv_SdtPedido_Dsc_idtx_N = (byte)(1) ;
      gxTv_SdtPedido_Revenid_N = (byte)(1) ;
      gxTv_SdtPedido_Revennm_N = (byte)(1) ;
      gxTv_SdtPedido_Marcaid_N = (byte)(1) ;
      gxTv_SdtPedido_Marcadsc_N = (byte)(1) ;
      gxTv_SdtPedido_Disidtx2_N = (byte)(1) ;
      gxTv_SdtPedido_Cpteid_N = (byte)(1) ;
      gxTv_SdtPedido_Cptedsc_N = (byte)(1) ;
      gxTv_SdtPedido_Desaid_N = (byte)(1) ;
      gxTv_SdtPedido_Desadsc_N = (byte)(1) ;
      gxTv_SdtPedido_Dptoid_N = (byte)(1) ;
      gxTv_SdtPedido_Dptodsc_N = (byte)(1) ;
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
      return gxTv_SdtPedido_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtPedido_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtPedido_Emprnom_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Emprnom = value ;
   }

   public String getPricod( )
   {
      return gxTv_SdtPedido_Pricod ;
   }

   public void setPricod( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Pricod = value ;
   }

   public int getDiscod( )
   {
      return gxTv_SdtPedido_Discod ;
   }

   public void setDiscod( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Discod = value ;
   }

   public String getDistipdis( )
   {
      return gxTv_SdtPedido_Distipdis ;
   }

   public void setDistipdis( String value )
   {
      gxTv_SdtPedido_Distipdis_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Distipdis = value ;
   }

   public String getDisenccli( )
   {
      return gxTv_SdtPedido_Disenccli ;
   }

   public void setDisenccli( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disenccli = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtPedido_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtPedido_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Clinom = value ;
   }

   public int getDisclides( )
   {
      return gxTv_SdtPedido_Disclides ;
   }

   public void setDisclides( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disclides = value ;
   }

   public String getClinomdes( )
   {
      return gxTv_SdtPedido_Clinomdes ;
   }

   public void setClinomdes( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Clinomdes = value ;
   }

   public short getE_disclides( )
   {
      return gxTv_SdtPedido_E_disclides ;
   }

   public void setE_disclides( short value )
   {
      gxTv_SdtPedido_E_disclides_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_E_disclides = value ;
   }

   public java.util.Date getDisfec( )
   {
      return gxTv_SdtPedido_Disfec ;
   }

   public void setDisfec( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disfec = value ;
   }

   public java.util.Date getDisfeccli( )
   {
      return gxTv_SdtPedido_Disfeccli ;
   }

   public void setDisfeccli( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disfeccli = value ;
   }

   public java.util.Date getDisfecent( )
   {
      return gxTv_SdtPedido_Disfecent ;
   }

   public void setDisfecent( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disfecent = value ;
   }

   public String getDisartcod( )
   {
      return gxTv_SdtPedido_Disartcod ;
   }

   public void setDisartcod( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartcod = value ;
   }

   public short getE_disartcod( )
   {
      return gxTv_SdtPedido_E_disartcod ;
   }

   public void setE_disartcod( short value )
   {
      gxTv_SdtPedido_E_disartcod_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_E_disartcod = value ;
   }

   public String getDisartdsc( )
   {
      return gxTv_SdtPedido_Disartdsc ;
   }

   public void setDisartdsc( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartdsc = value ;
   }

   public short getDisarttip( )
   {
      return gxTv_SdtPedido_Disarttip ;
   }

   public void setDisarttip( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttip = value ;
   }

   public String getDisarttipd( )
   {
      return gxTv_SdtPedido_Disarttipd ;
   }

   public void setDisarttipd( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttipd = value ;
   }

   public String getDisartmat( )
   {
      return gxTv_SdtPedido_Disartmat ;
   }

   public void setDisartmat( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartmat = value ;
   }

   public String getDisarttr1( )
   {
      return gxTv_SdtPedido_Disarttr1 ;
   }

   public void setDisarttr1( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttr1 = value ;
   }

   public short getDisartpt1( )
   {
      return gxTv_SdtPedido_Disartpt1 ;
   }

   public void setDisartpt1( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpt1 = value ;
   }

   public String getDisarttr2( )
   {
      return gxTv_SdtPedido_Disarttr2 ;
   }

   public void setDisarttr2( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttr2 = value ;
   }

   public short getDisartpt2( )
   {
      return gxTv_SdtPedido_Disartpt2 ;
   }

   public void setDisartpt2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpt2 = value ;
   }

   public String getDisarttr3( )
   {
      return gxTv_SdtPedido_Disarttr3 ;
   }

   public void setDisarttr3( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttr3 = value ;
   }

   public short getDisartpt3( )
   {
      return gxTv_SdtPedido_Disartpt3 ;
   }

   public void setDisartpt3( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpt3 = value ;
   }

   public String getDisartur1( )
   {
      return gxTv_SdtPedido_Disartur1 ;
   }

   public void setDisartur1( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartur1 = value ;
   }

   public short getDisartpu1( )
   {
      return gxTv_SdtPedido_Disartpu1 ;
   }

   public void setDisartpu1( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpu1 = value ;
   }

   public String getDisartur2( )
   {
      return gxTv_SdtPedido_Disartur2 ;
   }

   public void setDisartur2( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartur2 = value ;
   }

   public short getDisartpu2( )
   {
      return gxTv_SdtPedido_Disartpu2 ;
   }

   public void setDisartpu2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpu2 = value ;
   }

   public String getDisartur3( )
   {
      return gxTv_SdtPedido_Disartur3 ;
   }

   public void setDisartur3( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartur3 = value ;
   }

   public short getDisartpu3( )
   {
      return gxTv_SdtPedido_Disartpu3 ;
   }

   public void setDisartpu3( short value )
   {
      gxTv_SdtPedido_Disartpu3_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpu3 = value ;
   }

   public String getDiscolnom( )
   {
      return gxTv_SdtPedido_Discolnom ;
   }

   public void setDiscolnom( String value )
   {
      gxTv_SdtPedido_Discolnom_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Discolnom = value ;
   }

   public int getDiscolnum( )
   {
      return gxTv_SdtPedido_Discolnum ;
   }

   public void setDiscolnum( int value )
   {
      gxTv_SdtPedido_Discolnum_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Discolnum = value ;
   }

   public byte getDistipcol( )
   {
      return gxTv_SdtPedido_Distipcol ;
   }

   public void setDistipcol( byte value )
   {
      gxTv_SdtPedido_Distipcol_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Distipcol = value ;
   }

   public byte getDisest( )
   {
      return gxTv_SdtPedido_Disest ;
   }

   public void setDisest( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disest = value ;
   }

   public String getDisdes( )
   {
      return gxTv_SdtPedido_Disdes ;
   }

   public void setDisdes( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disdes = value ;
   }

   public String getDisartdsc2( )
   {
      return gxTv_SdtPedido_Disartdsc2 ;
   }

   public void setDisartdsc2( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartdsc2 = value ;
   }

   public String getDisple2( )
   {
      return gxTv_SdtPedido_Disple2 ;
   }

   public void setDisple2( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disple2 = value ;
   }

   public String getDisartlar( )
   {
      return gxTv_SdtPedido_Disartlar ;
   }

   public void setDisartlar( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartlar = value ;
   }

   public String getDisartsua( )
   {
      return gxTv_SdtPedido_Disartsua ;
   }

   public void setDisartsua( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartsua = value ;
   }

   public String getDisartaca( )
   {
      return gxTv_SdtPedido_Disartaca ;
   }

   public void setDisartaca( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartaca = value ;
   }

   public String getDisartenc( )
   {
      return gxTv_SdtPedido_Disartenc ;
   }

   public void setDisartenc( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartenc = value ;
   }

   public String getDisartcor( )
   {
      return gxTv_SdtPedido_Disartcor ;
   }

   public void setDisartcor( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartcor = value ;
   }

   public short getDisartpes( )
   {
      return gxTv_SdtPedido_Disartpes ;
   }

   public void setDisartpes( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpes = value ;
   }

   public java.math.BigDecimal getDisartrdt( )
   {
      return gxTv_SdtPedido_Disartrdt ;
   }

   public void setDisartrdt( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartrdt = value ;
   }

   public byte getDisarturg( )
   {
      return gxTv_SdtPedido_Disarturg ;
   }

   public void setDisarturg( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarturg = value ;
   }

   public short getDisgracru( )
   {
      return gxTv_SdtPedido_Disgracru ;
   }

   public void setDisgracru( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disgracru = value ;
   }

   public short getDisartanh( )
   {
      return gxTv_SdtPedido_Disartanh ;
   }

   public void setDisartanh( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartanh = value ;
   }

   public short getDisartan1( )
   {
      return gxTv_SdtPedido_Disartan1 ;
   }

   public void setDisartan1( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartan1 = value ;
   }

   public short getDisartacb( )
   {
      return gxTv_SdtPedido_Disartacb ;
   }

   public void setDisartacb( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartacb = value ;
   }

   public short getDisartac2( )
   {
      return gxTv_SdtPedido_Disartac2 ;
   }

   public void setDisartac2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartac2 = value ;
   }

   public java.math.BigDecimal getDisenccom( )
   {
      return gxTv_SdtPedido_Disenccom ;
   }

   public void setDisenccom( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disenccom = value ;
   }

   public java.math.BigDecimal getDisencanh( )
   {
      return gxTv_SdtPedido_Disencanh ;
   }

   public void setDisencanh( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disencanh = value ;
   }

   public short getDisnumcor( )
   {
      return gxTv_SdtPedido_Disnumcor ;
   }

   public void setDisnumcor( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disnumcor = value ;
   }

   public short getDisancsal1( )
   {
      return gxTv_SdtPedido_Disancsal1 ;
   }

   public void setDisancsal1( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disancsal1 = value ;
   }

   public short getDisancsal2( )
   {
      return gxTv_SdtPedido_Disancsal2 ;
   }

   public void setDisancsal2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disancsal2 = value ;
   }

   public short getDisancsal3( )
   {
      return gxTv_SdtPedido_Disancsal3 ;
   }

   public void setDisancsal3( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disancsal3 = value ;
   }

   public short getDisgraaca2( )
   {
      return gxTv_SdtPedido_Disgraaca2 ;
   }

   public void setDisgraaca2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disgraaca2 = value ;
   }

   public short getDisgracru2( )
   {
      return gxTv_SdtPedido_Disgracru2 ;
   }

   public void setDisgracru2( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disgracru2 = value ;
   }

   public short getDisgraaca( )
   {
      return gxTv_SdtPedido_Disgraaca ;
   }

   public void setDisgraaca( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disgraaca = value ;
   }

   public java.math.BigDecimal getDisrdoa( )
   {
      return gxTv_SdtPedido_Disrdoa ;
   }

   public void setDisrdoa( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disrdoa = value ;
   }

   public java.math.BigDecimal getDisrdon( )
   {
      return gxTv_SdtPedido_Disrdon ;
   }

   public void setDisrdon( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disrdon = value ;
   }

   public String getDisobsgrm( )
   {
      return gxTv_SdtPedido_Disobsgrm ;
   }

   public void setDisobsgrm( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disobsgrm = value ;
   }

   public String getDisobsanc( )
   {
      return gxTv_SdtPedido_Disobsanc ;
   }

   public void setDisobsanc( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disobsanc = value ;
   }

   public String getDisitem5( )
   {
      return gxTv_SdtPedido_Disitem5 ;
   }

   public void setDisitem5( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disitem5 = value ;
   }

   public String getDisartple( )
   {
      return gxTv_SdtPedido_Disartple ;
   }

   public void setDisartple( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartple = value ;
   }

   public String getDisunimed( )
   {
      return gxTv_SdtPedido_Disunimed ;
   }

   public void setDisunimed( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disunimed = value ;
   }

   public String getCod_idtx( )
   {
      return gxTv_SdtPedido_Cod_idtx ;
   }

   public void setCod_idtx( String value )
   {
      gxTv_SdtPedido_Cod_idtx_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Cod_idtx = value ;
   }

   public String getDsc_idtx( )
   {
      return gxTv_SdtPedido_Dsc_idtx ;
   }

   public void setDsc_idtx( String value )
   {
      gxTv_SdtPedido_Dsc_idtx_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dsc_idtx = value ;
   }

   public String getDisordcomp( )
   {
      return gxTv_SdtPedido_Disordcomp ;
   }

   public void setDisordcomp( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disordcomp = value ;
   }

   public String getRevenid( )
   {
      return gxTv_SdtPedido_Revenid ;
   }

   public void setRevenid( String value )
   {
      gxTv_SdtPedido_Revenid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Revenid = value ;
   }

   public String getRevennm( )
   {
      return gxTv_SdtPedido_Revennm ;
   }

   public void setRevennm( String value )
   {
      gxTv_SdtPedido_Revennm_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Revennm = value ;
   }

   public String getMarcaid( )
   {
      return gxTv_SdtPedido_Marcaid ;
   }

   public void setMarcaid( String value )
   {
      gxTv_SdtPedido_Marcaid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Marcaid = value ;
   }

   public String getMarcadsc( )
   {
      return gxTv_SdtPedido_Marcadsc ;
   }

   public void setMarcadsc( String value )
   {
      gxTv_SdtPedido_Marcadsc_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Marcadsc = value ;
   }

   public String getDisidtx2( )
   {
      return gxTv_SdtPedido_Disidtx2 ;
   }

   public void setDisidtx2( String value )
   {
      gxTv_SdtPedido_Disidtx2_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disidtx2 = value ;
   }

   public byte getDispriorid( )
   {
      return gxTv_SdtPedido_Dispriorid ;
   }

   public void setDispriorid( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dispriorid = value ;
   }

   public String getNxt_modelo( )
   {
      return gxTv_SdtPedido_Nxt_modelo ;
   }

   public void setNxt_modelo( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Nxt_modelo = value ;
   }

   public short getCpteid( )
   {
      return gxTv_SdtPedido_Cpteid ;
   }

   public void setCpteid( short value )
   {
      gxTv_SdtPedido_Cpteid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Cpteid = value ;
   }

   public String getCptedsc( )
   {
      return gxTv_SdtPedido_Cptedsc ;
   }

   public void setCptedsc( String value )
   {
      gxTv_SdtPedido_Cptedsc_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Cptedsc = value ;
   }

   public String getNxt_statio( )
   {
      return gxTv_SdtPedido_Nxt_statio ;
   }

   public void setNxt_statio( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Nxt_statio = value ;
   }

   public short getDesaid( )
   {
      return gxTv_SdtPedido_Desaid ;
   }

   public void setDesaid( short value )
   {
      gxTv_SdtPedido_Desaid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Desaid = value ;
   }

   public String getDesadsc( )
   {
      return gxTv_SdtPedido_Desadsc ;
   }

   public void setDesadsc( String value )
   {
      gxTv_SdtPedido_Desadsc_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Desadsc = value ;
   }

   public short getDptoid( )
   {
      return gxTv_SdtPedido_Dptoid ;
   }

   public void setDptoid( short value )
   {
      gxTv_SdtPedido_Dptoid_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dptoid = value ;
   }

   public String getDptodsc( )
   {
      return gxTv_SdtPedido_Dptodsc ;
   }

   public void setDptodsc( String value )
   {
      gxTv_SdtPedido_Dptodsc_N = (byte)(0) ;
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dptodsc = value ;
   }

   public String getNxt_artcli( )
   {
      return gxTv_SdtPedido_Nxt_artcli ;
   }

   public void setNxt_artcli( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Nxt_artcli = value ;
   }

   public String getDisexp( )
   {
      return gxTv_SdtPedido_Disexp ;
   }

   public void setDisexp( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disexp = value ;
   }

   public java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Norma> getNorma( )
   {
      return gxTv_SdtPedido_Norma ;
   }

   public void setNorma( java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Norma> value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Norma = value ;
   }

   public java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_AlmacenTejido> getAlmacentejido( )
   {
      return gxTv_SdtPedido_Almacentejido ;
   }

   public void setAlmacentejido( java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_AlmacenTejido> value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Almacentejido = value ;
   }

   public java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Defecto> getDefecto( )
   {
      return gxTv_SdtPedido_Defecto ;
   }

   public void setDefecto( java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Defecto> value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Defecto = value ;
   }

   public java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso> getProceso( )
   {
      return gxTv_SdtPedido_Proceso ;
   }

   public void setProceso( java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso> value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Proceso = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtPedido_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtPedido_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtPedido_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtPedido_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Emprnom_Z = value ;
   }

   public String getPricod_Z( )
   {
      return gxTv_SdtPedido_Pricod_Z ;
   }

   public void setPricod_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Pricod_Z = value ;
   }

   public int getDiscod_Z( )
   {
      return gxTv_SdtPedido_Discod_Z ;
   }

   public void setDiscod_Z( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Discod_Z = value ;
   }

   public String getDistipdis_Z( )
   {
      return gxTv_SdtPedido_Distipdis_Z ;
   }

   public void setDistipdis_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Distipdis_Z = value ;
   }

   public String getDisenccli_Z( )
   {
      return gxTv_SdtPedido_Disenccli_Z ;
   }

   public void setDisenccli_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disenccli_Z = value ;
   }

   public int getClicod_Z( )
   {
      return gxTv_SdtPedido_Clicod_Z ;
   }

   public void setClicod_Z( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Clicod_Z = value ;
   }

   public String getClinom_Z( )
   {
      return gxTv_SdtPedido_Clinom_Z ;
   }

   public void setClinom_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Clinom_Z = value ;
   }

   public int getDisclides_Z( )
   {
      return gxTv_SdtPedido_Disclides_Z ;
   }

   public void setDisclides_Z( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disclides_Z = value ;
   }

   public String getClinomdes_Z( )
   {
      return gxTv_SdtPedido_Clinomdes_Z ;
   }

   public void setClinomdes_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Clinomdes_Z = value ;
   }

   public short getE_disclides_Z( )
   {
      return gxTv_SdtPedido_E_disclides_Z ;
   }

   public void setE_disclides_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_E_disclides_Z = value ;
   }

   public java.util.Date getDisfec_Z( )
   {
      return gxTv_SdtPedido_Disfec_Z ;
   }

   public void setDisfec_Z( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disfec_Z = value ;
   }

   public java.util.Date getDisfeccli_Z( )
   {
      return gxTv_SdtPedido_Disfeccli_Z ;
   }

   public void setDisfeccli_Z( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disfeccli_Z = value ;
   }

   public java.util.Date getDisfecent_Z( )
   {
      return gxTv_SdtPedido_Disfecent_Z ;
   }

   public void setDisfecent_Z( java.util.Date value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disfecent_Z = value ;
   }

   public String getDisartcod_Z( )
   {
      return gxTv_SdtPedido_Disartcod_Z ;
   }

   public void setDisartcod_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartcod_Z = value ;
   }

   public short getE_disartcod_Z( )
   {
      return gxTv_SdtPedido_E_disartcod_Z ;
   }

   public void setE_disartcod_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_E_disartcod_Z = value ;
   }

   public String getDisartdsc_Z( )
   {
      return gxTv_SdtPedido_Disartdsc_Z ;
   }

   public void setDisartdsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartdsc_Z = value ;
   }

   public short getDisarttip_Z( )
   {
      return gxTv_SdtPedido_Disarttip_Z ;
   }

   public void setDisarttip_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttip_Z = value ;
   }

   public String getDisarttipd_Z( )
   {
      return gxTv_SdtPedido_Disarttipd_Z ;
   }

   public void setDisarttipd_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttipd_Z = value ;
   }

   public String getDisartmat_Z( )
   {
      return gxTv_SdtPedido_Disartmat_Z ;
   }

   public void setDisartmat_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartmat_Z = value ;
   }

   public String getDisarttr1_Z( )
   {
      return gxTv_SdtPedido_Disarttr1_Z ;
   }

   public void setDisarttr1_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttr1_Z = value ;
   }

   public short getDisartpt1_Z( )
   {
      return gxTv_SdtPedido_Disartpt1_Z ;
   }

   public void setDisartpt1_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpt1_Z = value ;
   }

   public String getDisarttr2_Z( )
   {
      return gxTv_SdtPedido_Disarttr2_Z ;
   }

   public void setDisarttr2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttr2_Z = value ;
   }

   public short getDisartpt2_Z( )
   {
      return gxTv_SdtPedido_Disartpt2_Z ;
   }

   public void setDisartpt2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpt2_Z = value ;
   }

   public String getDisarttr3_Z( )
   {
      return gxTv_SdtPedido_Disarttr3_Z ;
   }

   public void setDisarttr3_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarttr3_Z = value ;
   }

   public short getDisartpt3_Z( )
   {
      return gxTv_SdtPedido_Disartpt3_Z ;
   }

   public void setDisartpt3_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpt3_Z = value ;
   }

   public String getDisartur1_Z( )
   {
      return gxTv_SdtPedido_Disartur1_Z ;
   }

   public void setDisartur1_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartur1_Z = value ;
   }

   public short getDisartpu1_Z( )
   {
      return gxTv_SdtPedido_Disartpu1_Z ;
   }

   public void setDisartpu1_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpu1_Z = value ;
   }

   public String getDisartur2_Z( )
   {
      return gxTv_SdtPedido_Disartur2_Z ;
   }

   public void setDisartur2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartur2_Z = value ;
   }

   public short getDisartpu2_Z( )
   {
      return gxTv_SdtPedido_Disartpu2_Z ;
   }

   public void setDisartpu2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpu2_Z = value ;
   }

   public String getDisartur3_Z( )
   {
      return gxTv_SdtPedido_Disartur3_Z ;
   }

   public void setDisartur3_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartur3_Z = value ;
   }

   public short getDisartpu3_Z( )
   {
      return gxTv_SdtPedido_Disartpu3_Z ;
   }

   public void setDisartpu3_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpu3_Z = value ;
   }

   public String getDiscolnom_Z( )
   {
      return gxTv_SdtPedido_Discolnom_Z ;
   }

   public void setDiscolnom_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Discolnom_Z = value ;
   }

   public int getDiscolnum_Z( )
   {
      return gxTv_SdtPedido_Discolnum_Z ;
   }

   public void setDiscolnum_Z( int value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Discolnum_Z = value ;
   }

   public byte getDistipcol_Z( )
   {
      return gxTv_SdtPedido_Distipcol_Z ;
   }

   public void setDistipcol_Z( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Distipcol_Z = value ;
   }

   public byte getDisest_Z( )
   {
      return gxTv_SdtPedido_Disest_Z ;
   }

   public void setDisest_Z( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disest_Z = value ;
   }

   public String getDisdes_Z( )
   {
      return gxTv_SdtPedido_Disdes_Z ;
   }

   public void setDisdes_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disdes_Z = value ;
   }

   public String getDisartdsc2_Z( )
   {
      return gxTv_SdtPedido_Disartdsc2_Z ;
   }

   public void setDisartdsc2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartdsc2_Z = value ;
   }

   public String getDisple2_Z( )
   {
      return gxTv_SdtPedido_Disple2_Z ;
   }

   public void setDisple2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disple2_Z = value ;
   }

   public String getDisartlar_Z( )
   {
      return gxTv_SdtPedido_Disartlar_Z ;
   }

   public void setDisartlar_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartlar_Z = value ;
   }

   public String getDisartsua_Z( )
   {
      return gxTv_SdtPedido_Disartsua_Z ;
   }

   public void setDisartsua_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartsua_Z = value ;
   }

   public String getDisartaca_Z( )
   {
      return gxTv_SdtPedido_Disartaca_Z ;
   }

   public void setDisartaca_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartaca_Z = value ;
   }

   public String getDisartenc_Z( )
   {
      return gxTv_SdtPedido_Disartenc_Z ;
   }

   public void setDisartenc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartenc_Z = value ;
   }

   public String getDisartcor_Z( )
   {
      return gxTv_SdtPedido_Disartcor_Z ;
   }

   public void setDisartcor_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartcor_Z = value ;
   }

   public short getDisartpes_Z( )
   {
      return gxTv_SdtPedido_Disartpes_Z ;
   }

   public void setDisartpes_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpes_Z = value ;
   }

   public java.math.BigDecimal getDisartrdt_Z( )
   {
      return gxTv_SdtPedido_Disartrdt_Z ;
   }

   public void setDisartrdt_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartrdt_Z = value ;
   }

   public byte getDisarturg_Z( )
   {
      return gxTv_SdtPedido_Disarturg_Z ;
   }

   public void setDisarturg_Z( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disarturg_Z = value ;
   }

   public short getDisgracru_Z( )
   {
      return gxTv_SdtPedido_Disgracru_Z ;
   }

   public void setDisgracru_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disgracru_Z = value ;
   }

   public short getDisartanh_Z( )
   {
      return gxTv_SdtPedido_Disartanh_Z ;
   }

   public void setDisartanh_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartanh_Z = value ;
   }

   public short getDisartan1_Z( )
   {
      return gxTv_SdtPedido_Disartan1_Z ;
   }

   public void setDisartan1_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartan1_Z = value ;
   }

   public short getDisartacb_Z( )
   {
      return gxTv_SdtPedido_Disartacb_Z ;
   }

   public void setDisartacb_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartacb_Z = value ;
   }

   public short getDisartac2_Z( )
   {
      return gxTv_SdtPedido_Disartac2_Z ;
   }

   public void setDisartac2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartac2_Z = value ;
   }

   public java.math.BigDecimal getDisenccom_Z( )
   {
      return gxTv_SdtPedido_Disenccom_Z ;
   }

   public void setDisenccom_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disenccom_Z = value ;
   }

   public java.math.BigDecimal getDisencanh_Z( )
   {
      return gxTv_SdtPedido_Disencanh_Z ;
   }

   public void setDisencanh_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disencanh_Z = value ;
   }

   public short getDisnumcor_Z( )
   {
      return gxTv_SdtPedido_Disnumcor_Z ;
   }

   public void setDisnumcor_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disnumcor_Z = value ;
   }

   public short getDisancsal1_Z( )
   {
      return gxTv_SdtPedido_Disancsal1_Z ;
   }

   public void setDisancsal1_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disancsal1_Z = value ;
   }

   public short getDisancsal2_Z( )
   {
      return gxTv_SdtPedido_Disancsal2_Z ;
   }

   public void setDisancsal2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disancsal2_Z = value ;
   }

   public short getDisancsal3_Z( )
   {
      return gxTv_SdtPedido_Disancsal3_Z ;
   }

   public void setDisancsal3_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disancsal3_Z = value ;
   }

   public short getDisgraaca2_Z( )
   {
      return gxTv_SdtPedido_Disgraaca2_Z ;
   }

   public void setDisgraaca2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disgraaca2_Z = value ;
   }

   public short getDisgracru2_Z( )
   {
      return gxTv_SdtPedido_Disgracru2_Z ;
   }

   public void setDisgracru2_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disgracru2_Z = value ;
   }

   public short getDisgraaca_Z( )
   {
      return gxTv_SdtPedido_Disgraaca_Z ;
   }

   public void setDisgraaca_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disgraaca_Z = value ;
   }

   public java.math.BigDecimal getDisrdoa_Z( )
   {
      return gxTv_SdtPedido_Disrdoa_Z ;
   }

   public void setDisrdoa_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disrdoa_Z = value ;
   }

   public java.math.BigDecimal getDisrdon_Z( )
   {
      return gxTv_SdtPedido_Disrdon_Z ;
   }

   public void setDisrdon_Z( java.math.BigDecimal value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disrdon_Z = value ;
   }

   public String getDisobsgrm_Z( )
   {
      return gxTv_SdtPedido_Disobsgrm_Z ;
   }

   public void setDisobsgrm_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disobsgrm_Z = value ;
   }

   public String getDisobsanc_Z( )
   {
      return gxTv_SdtPedido_Disobsanc_Z ;
   }

   public void setDisobsanc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disobsanc_Z = value ;
   }

   public String getDisitem5_Z( )
   {
      return gxTv_SdtPedido_Disitem5_Z ;
   }

   public void setDisitem5_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disitem5_Z = value ;
   }

   public String getDisartple_Z( )
   {
      return gxTv_SdtPedido_Disartple_Z ;
   }

   public void setDisartple_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartple_Z = value ;
   }

   public String getDisunimed_Z( )
   {
      return gxTv_SdtPedido_Disunimed_Z ;
   }

   public void setDisunimed_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disunimed_Z = value ;
   }

   public String getCod_idtx_Z( )
   {
      return gxTv_SdtPedido_Cod_idtx_Z ;
   }

   public void setCod_idtx_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Cod_idtx_Z = value ;
   }

   public String getDsc_idtx_Z( )
   {
      return gxTv_SdtPedido_Dsc_idtx_Z ;
   }

   public void setDsc_idtx_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dsc_idtx_Z = value ;
   }

   public String getDisordcomp_Z( )
   {
      return gxTv_SdtPedido_Disordcomp_Z ;
   }

   public void setDisordcomp_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disordcomp_Z = value ;
   }

   public String getRevenid_Z( )
   {
      return gxTv_SdtPedido_Revenid_Z ;
   }

   public void setRevenid_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Revenid_Z = value ;
   }

   public String getRevennm_Z( )
   {
      return gxTv_SdtPedido_Revennm_Z ;
   }

   public void setRevennm_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Revennm_Z = value ;
   }

   public String getMarcaid_Z( )
   {
      return gxTv_SdtPedido_Marcaid_Z ;
   }

   public void setMarcaid_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Marcaid_Z = value ;
   }

   public String getMarcadsc_Z( )
   {
      return gxTv_SdtPedido_Marcadsc_Z ;
   }

   public void setMarcadsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Marcadsc_Z = value ;
   }

   public String getDisidtx2_Z( )
   {
      return gxTv_SdtPedido_Disidtx2_Z ;
   }

   public void setDisidtx2_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disidtx2_Z = value ;
   }

   public byte getDispriorid_Z( )
   {
      return gxTv_SdtPedido_Dispriorid_Z ;
   }

   public void setDispriorid_Z( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dispriorid_Z = value ;
   }

   public String getNxt_modelo_Z( )
   {
      return gxTv_SdtPedido_Nxt_modelo_Z ;
   }

   public void setNxt_modelo_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Nxt_modelo_Z = value ;
   }

   public short getCpteid_Z( )
   {
      return gxTv_SdtPedido_Cpteid_Z ;
   }

   public void setCpteid_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Cpteid_Z = value ;
   }

   public String getCptedsc_Z( )
   {
      return gxTv_SdtPedido_Cptedsc_Z ;
   }

   public void setCptedsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Cptedsc_Z = value ;
   }

   public String getNxt_statio_Z( )
   {
      return gxTv_SdtPedido_Nxt_statio_Z ;
   }

   public void setNxt_statio_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Nxt_statio_Z = value ;
   }

   public short getDesaid_Z( )
   {
      return gxTv_SdtPedido_Desaid_Z ;
   }

   public void setDesaid_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Desaid_Z = value ;
   }

   public String getDesadsc_Z( )
   {
      return gxTv_SdtPedido_Desadsc_Z ;
   }

   public void setDesadsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Desadsc_Z = value ;
   }

   public short getDptoid_Z( )
   {
      return gxTv_SdtPedido_Dptoid_Z ;
   }

   public void setDptoid_Z( short value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dptoid_Z = value ;
   }

   public String getDptodsc_Z( )
   {
      return gxTv_SdtPedido_Dptodsc_Z ;
   }

   public void setDptodsc_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dptodsc_Z = value ;
   }

   public String getNxt_artcli_Z( )
   {
      return gxTv_SdtPedido_Nxt_artcli_Z ;
   }

   public void setNxt_artcli_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Nxt_artcli_Z = value ;
   }

   public String getDisexp_Z( )
   {
      return gxTv_SdtPedido_Disexp_Z ;
   }

   public void setDisexp_Z( String value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disexp_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtPedido_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Emprnom_N = value ;
   }

   public byte getDistipdis_N( )
   {
      return gxTv_SdtPedido_Distipdis_N ;
   }

   public void setDistipdis_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Distipdis_N = value ;
   }

   public byte getE_disclides_N( )
   {
      return gxTv_SdtPedido_E_disclides_N ;
   }

   public void setE_disclides_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_E_disclides_N = value ;
   }

   public byte getE_disartcod_N( )
   {
      return gxTv_SdtPedido_E_disartcod_N ;
   }

   public void setE_disartcod_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_E_disartcod_N = value ;
   }

   public byte getDisartpu3_N( )
   {
      return gxTv_SdtPedido_Disartpu3_N ;
   }

   public void setDisartpu3_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disartpu3_N = value ;
   }

   public byte getDiscolnom_N( )
   {
      return gxTv_SdtPedido_Discolnom_N ;
   }

   public void setDiscolnom_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Discolnom_N = value ;
   }

   public byte getDiscolnum_N( )
   {
      return gxTv_SdtPedido_Discolnum_N ;
   }

   public void setDiscolnum_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Discolnum_N = value ;
   }

   public byte getDistipcol_N( )
   {
      return gxTv_SdtPedido_Distipcol_N ;
   }

   public void setDistipcol_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Distipcol_N = value ;
   }

   public byte getCod_idtx_N( )
   {
      return gxTv_SdtPedido_Cod_idtx_N ;
   }

   public void setCod_idtx_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Cod_idtx_N = value ;
   }

   public byte getDsc_idtx_N( )
   {
      return gxTv_SdtPedido_Dsc_idtx_N ;
   }

   public void setDsc_idtx_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dsc_idtx_N = value ;
   }

   public byte getRevenid_N( )
   {
      return gxTv_SdtPedido_Revenid_N ;
   }

   public void setRevenid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Revenid_N = value ;
   }

   public byte getRevennm_N( )
   {
      return gxTv_SdtPedido_Revennm_N ;
   }

   public void setRevennm_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Revennm_N = value ;
   }

   public byte getMarcaid_N( )
   {
      return gxTv_SdtPedido_Marcaid_N ;
   }

   public void setMarcaid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Marcaid_N = value ;
   }

   public byte getMarcadsc_N( )
   {
      return gxTv_SdtPedido_Marcadsc_N ;
   }

   public void setMarcadsc_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Marcadsc_N = value ;
   }

   public byte getDisidtx2_N( )
   {
      return gxTv_SdtPedido_Disidtx2_N ;
   }

   public void setDisidtx2_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Disidtx2_N = value ;
   }

   public byte getCpteid_N( )
   {
      return gxTv_SdtPedido_Cpteid_N ;
   }

   public void setCpteid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Cpteid_N = value ;
   }

   public byte getCptedsc_N( )
   {
      return gxTv_SdtPedido_Cptedsc_N ;
   }

   public void setCptedsc_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Cptedsc_N = value ;
   }

   public byte getDesaid_N( )
   {
      return gxTv_SdtPedido_Desaid_N ;
   }

   public void setDesaid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Desaid_N = value ;
   }

   public byte getDesadsc_N( )
   {
      return gxTv_SdtPedido_Desadsc_N ;
   }

   public void setDesadsc_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Desadsc_N = value ;
   }

   public byte getDptoid_N( )
   {
      return gxTv_SdtPedido_Dptoid_N ;
   }

   public void setDptoid_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dptoid_N = value ;
   }

   public byte getDptodsc_N( )
   {
      return gxTv_SdtPedido_Dptodsc_N ;
   }

   public void setDptodsc_N( byte value )
   {
      gxTv_SdtPedido_N = (byte)(0) ;
      gxTv_SdtPedido_Dptodsc_N = value ;
   }

   protected byte gxTv_SdtPedido_Distipcol ;
   protected byte gxTv_SdtPedido_Disest ;
   protected byte gxTv_SdtPedido_Disarturg ;
   protected byte gxTv_SdtPedido_Dispriorid ;
   protected byte gxTv_SdtPedido_Distipcol_Z ;
   protected byte gxTv_SdtPedido_Disest_Z ;
   protected byte gxTv_SdtPedido_Disarturg_Z ;
   protected byte gxTv_SdtPedido_Dispriorid_Z ;
   protected byte gxTv_SdtPedido_Emprnom_N ;
   protected byte gxTv_SdtPedido_Distipdis_N ;
   protected byte gxTv_SdtPedido_E_disclides_N ;
   protected byte gxTv_SdtPedido_E_disartcod_N ;
   protected byte gxTv_SdtPedido_Disartpu3_N ;
   protected byte gxTv_SdtPedido_Discolnom_N ;
   protected byte gxTv_SdtPedido_Discolnum_N ;
   protected byte gxTv_SdtPedido_Distipcol_N ;
   protected byte gxTv_SdtPedido_Cod_idtx_N ;
   protected byte gxTv_SdtPedido_Dsc_idtx_N ;
   protected byte gxTv_SdtPedido_Revenid_N ;
   protected byte gxTv_SdtPedido_Revennm_N ;
   protected byte gxTv_SdtPedido_Marcaid_N ;
   protected byte gxTv_SdtPedido_Marcadsc_N ;
   protected byte gxTv_SdtPedido_Disidtx2_N ;
   protected byte gxTv_SdtPedido_Cpteid_N ;
   protected byte gxTv_SdtPedido_Cptedsc_N ;
   protected byte gxTv_SdtPedido_Desaid_N ;
   protected byte gxTv_SdtPedido_Desadsc_N ;
   protected byte gxTv_SdtPedido_Dptoid_N ;
   protected byte gxTv_SdtPedido_Dptodsc_N ;
   private byte gxTv_SdtPedido_N ;
   protected short gxTv_SdtPedido_E_disclides ;
   protected short gxTv_SdtPedido_E_disartcod ;
   protected short gxTv_SdtPedido_Disarttip ;
   protected short gxTv_SdtPedido_Disartpt1 ;
   protected short gxTv_SdtPedido_Disartpt2 ;
   protected short gxTv_SdtPedido_Disartpt3 ;
   protected short gxTv_SdtPedido_Disartpu1 ;
   protected short gxTv_SdtPedido_Disartpu2 ;
   protected short gxTv_SdtPedido_Disartpu3 ;
   protected short gxTv_SdtPedido_Disartpes ;
   protected short gxTv_SdtPedido_Disgracru ;
   protected short gxTv_SdtPedido_Disartanh ;
   protected short gxTv_SdtPedido_Disartan1 ;
   protected short gxTv_SdtPedido_Disartacb ;
   protected short gxTv_SdtPedido_Disartac2 ;
   protected short gxTv_SdtPedido_Disnumcor ;
   protected short gxTv_SdtPedido_Disancsal1 ;
   protected short gxTv_SdtPedido_Disancsal2 ;
   protected short gxTv_SdtPedido_Disancsal3 ;
   protected short gxTv_SdtPedido_Disgraaca2 ;
   protected short gxTv_SdtPedido_Disgracru2 ;
   protected short gxTv_SdtPedido_Disgraaca ;
   protected short gxTv_SdtPedido_Cpteid ;
   protected short gxTv_SdtPedido_Desaid ;
   protected short gxTv_SdtPedido_Dptoid ;
   protected short gxTv_SdtPedido_Initialized ;
   protected short gxTv_SdtPedido_E_disclides_Z ;
   protected short gxTv_SdtPedido_E_disartcod_Z ;
   protected short gxTv_SdtPedido_Disarttip_Z ;
   protected short gxTv_SdtPedido_Disartpt1_Z ;
   protected short gxTv_SdtPedido_Disartpt2_Z ;
   protected short gxTv_SdtPedido_Disartpt3_Z ;
   protected short gxTv_SdtPedido_Disartpu1_Z ;
   protected short gxTv_SdtPedido_Disartpu2_Z ;
   protected short gxTv_SdtPedido_Disartpu3_Z ;
   protected short gxTv_SdtPedido_Disartpes_Z ;
   protected short gxTv_SdtPedido_Disgracru_Z ;
   protected short gxTv_SdtPedido_Disartanh_Z ;
   protected short gxTv_SdtPedido_Disartan1_Z ;
   protected short gxTv_SdtPedido_Disartacb_Z ;
   protected short gxTv_SdtPedido_Disartac2_Z ;
   protected short gxTv_SdtPedido_Disnumcor_Z ;
   protected short gxTv_SdtPedido_Disancsal1_Z ;
   protected short gxTv_SdtPedido_Disancsal2_Z ;
   protected short gxTv_SdtPedido_Disancsal3_Z ;
   protected short gxTv_SdtPedido_Disgraaca2_Z ;
   protected short gxTv_SdtPedido_Disgracru2_Z ;
   protected short gxTv_SdtPedido_Disgraaca_Z ;
   protected short gxTv_SdtPedido_Cpteid_Z ;
   protected short gxTv_SdtPedido_Desaid_Z ;
   protected short gxTv_SdtPedido_Dptoid_Z ;
   protected int gxTv_SdtPedido_Discod ;
   protected int gxTv_SdtPedido_Clicod ;
   protected int gxTv_SdtPedido_Disclides ;
   protected int gxTv_SdtPedido_Discolnum ;
   protected int gxTv_SdtPedido_Discod_Z ;
   protected int gxTv_SdtPedido_Clicod_Z ;
   protected int gxTv_SdtPedido_Disclides_Z ;
   protected int gxTv_SdtPedido_Discolnum_Z ;
   protected String gxTv_SdtPedido_Emprcod ;
   protected String gxTv_SdtPedido_Emprnom ;
   protected String gxTv_SdtPedido_Pricod ;
   protected String gxTv_SdtPedido_Distipdis ;
   protected String gxTv_SdtPedido_Disenccli ;
   protected String gxTv_SdtPedido_Clinom ;
   protected String gxTv_SdtPedido_Clinomdes ;
   protected String gxTv_SdtPedido_Disartcod ;
   protected String gxTv_SdtPedido_Disartdsc ;
   protected String gxTv_SdtPedido_Disarttipd ;
   protected String gxTv_SdtPedido_Disartmat ;
   protected String gxTv_SdtPedido_Disarttr1 ;
   protected String gxTv_SdtPedido_Disarttr2 ;
   protected String gxTv_SdtPedido_Disarttr3 ;
   protected String gxTv_SdtPedido_Disartur1 ;
   protected String gxTv_SdtPedido_Disartur2 ;
   protected String gxTv_SdtPedido_Disartur3 ;
   protected String gxTv_SdtPedido_Discolnom ;
   protected String gxTv_SdtPedido_Disdes ;
   protected String gxTv_SdtPedido_Disple2 ;
   protected String gxTv_SdtPedido_Disartlar ;
   protected String gxTv_SdtPedido_Disartsua ;
   protected String gxTv_SdtPedido_Disartaca ;
   protected String gxTv_SdtPedido_Disartenc ;
   protected String gxTv_SdtPedido_Disartcor ;
   protected String gxTv_SdtPedido_Disobsgrm ;
   protected String gxTv_SdtPedido_Disobsanc ;
   protected String gxTv_SdtPedido_Disitem5 ;
   protected String gxTv_SdtPedido_Disartple ;
   protected String gxTv_SdtPedido_Disunimed ;
   protected String gxTv_SdtPedido_Cod_idtx ;
   protected String gxTv_SdtPedido_Dsc_idtx ;
   protected String gxTv_SdtPedido_Revenid ;
   protected String gxTv_SdtPedido_Revennm ;
   protected String gxTv_SdtPedido_Marcaid ;
   protected String gxTv_SdtPedido_Marcadsc ;
   protected String gxTv_SdtPedido_Disidtx2 ;
   protected String gxTv_SdtPedido_Nxt_modelo ;
   protected String gxTv_SdtPedido_Cptedsc ;
   protected String gxTv_SdtPedido_Nxt_statio ;
   protected String gxTv_SdtPedido_Desadsc ;
   protected String gxTv_SdtPedido_Dptodsc ;
   protected String gxTv_SdtPedido_Nxt_artcli ;
   protected String gxTv_SdtPedido_Disexp ;
   protected String gxTv_SdtPedido_Mode ;
   protected String gxTv_SdtPedido_Emprcod_Z ;
   protected String gxTv_SdtPedido_Emprnom_Z ;
   protected String gxTv_SdtPedido_Pricod_Z ;
   protected String gxTv_SdtPedido_Distipdis_Z ;
   protected String gxTv_SdtPedido_Disenccli_Z ;
   protected String gxTv_SdtPedido_Clinom_Z ;
   protected String gxTv_SdtPedido_Clinomdes_Z ;
   protected String gxTv_SdtPedido_Disartcod_Z ;
   protected String gxTv_SdtPedido_Disartdsc_Z ;
   protected String gxTv_SdtPedido_Disarttipd_Z ;
   protected String gxTv_SdtPedido_Disartmat_Z ;
   protected String gxTv_SdtPedido_Disarttr1_Z ;
   protected String gxTv_SdtPedido_Disarttr2_Z ;
   protected String gxTv_SdtPedido_Disarttr3_Z ;
   protected String gxTv_SdtPedido_Disartur1_Z ;
   protected String gxTv_SdtPedido_Disartur2_Z ;
   protected String gxTv_SdtPedido_Disartur3_Z ;
   protected String gxTv_SdtPedido_Discolnom_Z ;
   protected String gxTv_SdtPedido_Disdes_Z ;
   protected String gxTv_SdtPedido_Disple2_Z ;
   protected String gxTv_SdtPedido_Disartlar_Z ;
   protected String gxTv_SdtPedido_Disartsua_Z ;
   protected String gxTv_SdtPedido_Disartaca_Z ;
   protected String gxTv_SdtPedido_Disartenc_Z ;
   protected String gxTv_SdtPedido_Disartcor_Z ;
   protected String gxTv_SdtPedido_Disobsgrm_Z ;
   protected String gxTv_SdtPedido_Disobsanc_Z ;
   protected String gxTv_SdtPedido_Disitem5_Z ;
   protected String gxTv_SdtPedido_Disartple_Z ;
   protected String gxTv_SdtPedido_Disunimed_Z ;
   protected String gxTv_SdtPedido_Cod_idtx_Z ;
   protected String gxTv_SdtPedido_Dsc_idtx_Z ;
   protected String gxTv_SdtPedido_Revenid_Z ;
   protected String gxTv_SdtPedido_Revennm_Z ;
   protected String gxTv_SdtPedido_Marcaid_Z ;
   protected String gxTv_SdtPedido_Marcadsc_Z ;
   protected String gxTv_SdtPedido_Disidtx2_Z ;
   protected String gxTv_SdtPedido_Nxt_modelo_Z ;
   protected String gxTv_SdtPedido_Cptedsc_Z ;
   protected String gxTv_SdtPedido_Nxt_statio_Z ;
   protected String gxTv_SdtPedido_Desadsc_Z ;
   protected String gxTv_SdtPedido_Dptodsc_Z ;
   protected String gxTv_SdtPedido_Nxt_artcli_Z ;
   protected String gxTv_SdtPedido_Disexp_Z ;
   protected String gxTv_SdtPedido_Disartdsc2 ;
   protected String gxTv_SdtPedido_Disordcomp ;
   protected String gxTv_SdtPedido_Disartdsc2_Z ;
   protected String gxTv_SdtPedido_Disordcomp_Z ;
   protected java.util.Date gxTv_SdtPedido_Disfec ;
   protected java.util.Date gxTv_SdtPedido_Disfeccli ;
   protected java.util.Date gxTv_SdtPedido_Disfecent ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disartrdt ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disenccom ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disencanh ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disrdoa ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disrdon ;
   protected java.util.Date gxTv_SdtPedido_Disfec_Z ;
   protected java.util.Date gxTv_SdtPedido_Disfeccli_Z ;
   protected java.util.Date gxTv_SdtPedido_Disfecent_Z ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disartrdt_Z ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disenccom_Z ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disencanh_Z ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disrdoa_Z ;
   protected java.math.BigDecimal gxTv_SdtPedido_Disrdon_Z ;
   protected java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Norma> gxTv_SdtPedido_Norma=null ;
   protected java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_AlmacenTejido> gxTv_SdtPedido_Almacentejido=null ;
   protected java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Defecto> gxTv_SdtPedido_Defecto=null ;
   protected java.util.Vector<app.pedidosclientesindetalle.StructSdtPedido_Proceso> gxTv_SdtPedido_Proceso=null ;
}

