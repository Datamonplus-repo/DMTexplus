package app.stocksquimicos ;
import com.genexus.*;

public final  class StructSdtSalidasManualesProductos_Detalle implements Cloneable, java.io.Serializable
{
   public StructSdtSalidasManualesProductos_Detalle( )
   {
      this( -1, new ModelContext( StructSdtSalidasManualesProductos_Detalle.class ));
   }

   public StructSdtSalidasManualesProductos_Detalle( int remoteHandle ,
                                                     ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSalidasManualesProductos_Detalle_Emprcod = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnum = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnom = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs = cal.getTime() ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdlote = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Mode = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z = cal.getTime() ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z = "" ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N = (byte)(1) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N = (byte)(1) ;
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
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprcod = value ;
   }

   public int getCumcodcont( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont ;
   }

   public void setCumcodcont( int value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom = value ;
   }

   public String getPrdnum( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnum = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnom = value ;
   }

   public java.math.BigDecimal getCumconcant( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant ;
   }

   public void setCumconcant( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant = value ;
   }

   public java.math.BigDecimal getCumconcbis( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis ;
   }

   public void setCumconcbis( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis = value ;
   }

   public java.math.BigDecimal getCumcospro( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro ;
   }

   public void setCumcospro( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro = value ;
   }

   public java.math.BigDecimal getPrdpreact( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact ;
   }

   public void setPrdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact = value ;
   }

   public java.math.BigDecimal getPrdexialm( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm ;
   }

   public void setPrdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm = value ;
   }

   public java.math.BigDecimal getPrdexicc( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc ;
   }

   public void setPrdexicc( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc = value ;
   }

   public java.math.BigDecimal getPrdcanres( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres ;
   }

   public void setPrdcanres( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres = value ;
   }

   public java.math.BigDecimal getPrdpremed( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed ;
   }

   public void setPrdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed = value ;
   }

   public java.util.Date getUltfecccs( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs ;
   }

   public void setUltfecccs( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs = value ;
   }

   public java.math.BigDecimal getPrdfaccon( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon ;
   }

   public void setPrdfaccon( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon = value ;
   }

   public String getCumconlot( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot ;
   }

   public void setCumconlot( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot = value ;
   }

   public java.math.BigDecimal getPrdvalstk( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk ;
   }

   public void setPrdvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk = value ;
   }

   public byte getForprdume( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprdume ;
   }

   public void setForprdume( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprdume = value ;
   }

   public String getForprddsc( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc ;
   }

   public void setForprddsc( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc = value ;
   }

   public byte getCumunidad( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad ;
   }

   public void setCumunidad( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad = value ;
   }

   public String getPrdcomid( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid ;
   }

   public void setPrdcomid( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid = value ;
   }

   public String getPrdlote( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdlote ;
   }

   public void setPrdlote( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdlote = value ;
   }

   public byte getCumumed( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumumed ;
   }

   public void setCumumed( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumumed = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z = value ;
   }

   public int getCumcodcont_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z ;
   }

   public void setCumcodcont_Z( int value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z = value ;
   }

   public String getPrdnum_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z ;
   }

   public void setPrdnum_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z = value ;
   }

   public String getPrdnom_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z ;
   }

   public void setPrdnom_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z = value ;
   }

   public java.math.BigDecimal getCumconcant_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z ;
   }

   public void setCumconcant_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z = value ;
   }

   public java.math.BigDecimal getCumconcbis_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z ;
   }

   public void setCumconcbis_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z = value ;
   }

   public java.math.BigDecimal getCumcospro_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z ;
   }

   public void setCumcospro_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z = value ;
   }

   public java.math.BigDecimal getPrdpreact_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z ;
   }

   public void setPrdpreact_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z = value ;
   }

   public java.math.BigDecimal getPrdexialm_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z ;
   }

   public void setPrdexialm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z = value ;
   }

   public java.math.BigDecimal getPrdexicc_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z ;
   }

   public void setPrdexicc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z = value ;
   }

   public java.math.BigDecimal getPrdcanres_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z ;
   }

   public void setPrdcanres_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z = value ;
   }

   public java.math.BigDecimal getPrdpremed_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z ;
   }

   public void setPrdpremed_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z = value ;
   }

   public java.util.Date getUltfecccs_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z ;
   }

   public void setUltfecccs_Z( java.util.Date value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z = value ;
   }

   public java.math.BigDecimal getPrdfaccon_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z ;
   }

   public void setPrdfaccon_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z = value ;
   }

   public String getCumconlot_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z ;
   }

   public void setCumconlot_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z = value ;
   }

   public java.math.BigDecimal getPrdvalstk_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z ;
   }

   public void setPrdvalstk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z = value ;
   }

   public byte getForprdume_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z ;
   }

   public void setForprdume_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z = value ;
   }

   public String getForprddsc_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z ;
   }

   public void setForprddsc_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z = value ;
   }

   public byte getCumunidad_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z ;
   }

   public void setCumunidad_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z = value ;
   }

   public String getPrdcomid_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z ;
   }

   public void setPrdcomid_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z = value ;
   }

   public String getPrdlote_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z ;
   }

   public void setPrdlote_Z( String value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z = value ;
   }

   public byte getCumumed_Z( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z ;
   }

   public void setCumumed_Z( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N = value ;
   }

   public byte getForprddsc_N( )
   {
      return gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N ;
   }

   public void setForprddsc_N( byte value )
   {
      gxTv_SdtSalidasManualesProductos_Detalle_N = (byte)(0) ;
      gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N = value ;
   }

   protected byte gxTv_SdtSalidasManualesProductos_Detalle_Forprdume ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_Cumumed ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N ;
   protected byte gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N ;
   private byte gxTv_SdtSalidasManualesProductos_Detalle_N ;
   protected short gxTv_SdtSalidasManualesProductos_Detalle_Initialized ;
   protected int gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont ;
   protected int gxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Emprcod ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Emprnom ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Prdnum ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Prdnom ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Prdlote ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Mode ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z ;
   protected String gxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed ;
   protected java.util.Date gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z ;
   protected java.util.Date gxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z ;
}

