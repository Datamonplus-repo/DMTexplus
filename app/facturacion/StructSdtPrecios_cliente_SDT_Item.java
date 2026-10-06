package app.facturacion ;
import com.genexus.*;

public final  class StructSdtPrecios_cliente_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtPrecios_cliente_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtPrecios_cliente_SDT_Item.class ));
   }

   public StructSdtPrecios_cliente_SDT_Item( int remoteHandle ,
                                             ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtPrecios_cliente_SDT_Item_Emprcod = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forser = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Intdsc = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Cr = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcan = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Pc = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Mv = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Pv = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_C_m = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Cm = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fi = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Mc = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_F_i = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Obs = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forprefec = cal.getTime() ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forfecant = cal.getTime() ;
      gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Artdsc = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fortonal = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forrelban = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Clitipo = "" ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N = (byte)(1) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N = (byte)(1) ;
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
      return gxTv_SdtPrecios_cliente_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Seleccionar = value ;
   }

   public String getEmprcod( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Emprcod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Clicod = value ;
   }

   public String getForser( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forser ;
   }

   public void setForser( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forser = value ;
   }

   public String getForserdsc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc ;
   }

   public void setForserdsc( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc = value ;
   }

   public int getForcolnum( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forcolnum ;
   }

   public void setForcolnum( int value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcolnum = value ;
   }

   public byte getTipcolcod( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod ;
   }

   public void setTipcolcod( byte value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod = value ;
   }

   public String getForcolnom( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom ;
   }

   public void setForcolnom( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom = value ;
   }

   public String getFornomcli( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli ;
   }

   public void setFornomcli( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli = value ;
   }

   public String getIntdsc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Intdsc ;
   }

   public void setIntdsc( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Intdsc = value ;
   }

   public short getGrdtipart( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Grdtipart ;
   }

   public void setGrdtipart( short value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Grdtipart = value ;
   }

   public java.math.BigDecimal getCr( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Cr ;
   }

   public void setCr( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Cr = value ;
   }

   public java.math.BigDecimal getForcan( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forcan ;
   }

   public void setForcan( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcan = value ;
   }

   public java.math.BigDecimal getPc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Pc ;
   }

   public void setPc( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Pc = value ;
   }

   public java.math.BigDecimal getMv( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Mv ;
   }

   public void setMv( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Mv = value ;
   }

   public java.math.BigDecimal getPv( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Pv ;
   }

   public void setPv( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Pv = value ;
   }

   public java.math.BigDecimal getC_m( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_C_m ;
   }

   public void setC_m( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_C_m = value ;
   }

   public java.math.BigDecimal getCm( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Cm ;
   }

   public void setCm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Cm = value ;
   }

   public java.math.BigDecimal getFi( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fi ;
   }

   public void setFi( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fi = value ;
   }

   public short getTi( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Ti ;
   }

   public void setTi( short value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Ti = value ;
   }

   public java.math.BigDecimal getMc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Mc ;
   }

   public void setMc( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Mc = value ;
   }

   public java.math.BigDecimal getF_i( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_F_i ;
   }

   public void setF_i( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_F_i = value ;
   }

   public java.math.BigDecimal getNewprekgm( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm ;
   }

   public void setNewprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm = value ;
   }

   public String getObs( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Obs ;
   }

   public void setObs( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Obs = value ;
   }

   public java.util.Date getForprefec( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forprefec ;
   }

   public void setForprefec( java.util.Date value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forprefec = value ;
   }

   public java.util.Date getForfecant( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forfecant ;
   }

   public void setForfecant( java.util.Date value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forfecant = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc = value ;
   }

   public String getArtdsc( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Artdsc ;
   }

   public void setArtdsc( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Artdsc = value ;
   }

   public String getFortonal( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fortonal ;
   }

   public void setFortonal( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fortonal = value ;
   }

   public short getFam_cod( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fam_cod ;
   }

   public void setFam_cod( short value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fam_cod = value ;
   }

   public java.math.BigDecimal getForcosuti( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti ;
   }

   public void setForcosuti( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti = value ;
   }

   public short getOldclasse( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Oldclasse ;
   }

   public void setOldclasse( short value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Oldclasse = value ;
   }

   public java.math.BigDecimal getForrelban( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Forrelban ;
   }

   public void setForrelban( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Forrelban = value ;
   }

   public java.math.BigDecimal getOldprekgm( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm ;
   }

   public void setOldprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm = value ;
   }

   public int getFornumcol( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Fornumcol ;
   }

   public void setFornumcol( int value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Fornumcol = value ;
   }

   public String getClitipo( )
   {
      return gxTv_SdtPrecios_cliente_SDT_Item_Clitipo ;
   }

   public void setClitipo( String value )
   {
      gxTv_SdtPrecios_cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_SDT_Item_Clitipo = value ;
   }

   protected byte gxTv_SdtPrecios_cliente_SDT_Item_Tipcolcod ;
   protected byte gxTv_SdtPrecios_cliente_SDT_Item_Forprefec_N ;
   protected byte gxTv_SdtPrecios_cliente_SDT_Item_Forfecant_N ;
   protected byte gxTv_SdtPrecios_cliente_SDT_Item_N ;
   protected short gxTv_SdtPrecios_cliente_SDT_Item_Grdtipart ;
   protected short gxTv_SdtPrecios_cliente_SDT_Item_Ti ;
   protected short gxTv_SdtPrecios_cliente_SDT_Item_Fam_cod ;
   protected short gxTv_SdtPrecios_cliente_SDT_Item_Oldclasse ;
   protected int gxTv_SdtPrecios_cliente_SDT_Item_Clicod ;
   protected int gxTv_SdtPrecios_cliente_SDT_Item_Forcolnum ;
   protected int gxTv_SdtPrecios_cliente_SDT_Item_Fornumcol ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Emprcod ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Forser ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Forserdsc ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Forcolnom ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Fornomcli ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Intdsc ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Obs ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Tipartdsc ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Artdsc ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Fortonal ;
   protected String gxTv_SdtPrecios_cliente_SDT_Item_Clitipo ;
   protected boolean gxTv_SdtPrecios_cliente_SDT_Item_Seleccionar ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Cr ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Forcan ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Pc ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Mv ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Pv ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_C_m ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Cm ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Fi ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Mc ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_F_i ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Newprekgm ;
   protected java.util.Date gxTv_SdtPrecios_cliente_SDT_Item_Forprefec ;
   protected java.util.Date gxTv_SdtPrecios_cliente_SDT_Item_Forfecant ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Forcosuti ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Forrelban ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_SDT_Item_Oldprekgm ;
}

