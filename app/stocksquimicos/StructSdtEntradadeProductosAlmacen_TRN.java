package app.stocksquimicos ;
import com.genexus.*;

public final  class StructSdtEntradadeProductosAlmacen_TRN implements Cloneable, java.io.Serializable
{
   public StructSdtEntradadeProductosAlmacen_TRN( )
   {
      this( -1, new ModelContext( StructSdtEntradadeProductosAlmacen_TRN.class ));
   }

   public StructSdtEntradadeProductosAlmacen_TRN( int remoteHandle ,
                                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Mode = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z = cal.getTime() ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z = "" ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N = (byte)(1) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N = (byte)(1) ;
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
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod = value ;
   }

   public String getPrdnum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum = value ;
   }

   public short getLinent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Linent ;
   }

   public void setLinent( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Linent = value ;
   }

   public java.util.Date getEntfecent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent ;
   }

   public void setEntfecent( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent = value ;
   }

   public String getAlbaran( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran ;
   }

   public void setAlbaran( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran = value ;
   }

   public String getEntnalbar( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar ;
   }

   public void setEntnalbar( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar = value ;
   }

   public int getPedcod( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod ;
   }

   public void setPedcod( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod = value ;
   }

   public int getEntprvnum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum ;
   }

   public void setEntprvnum( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum = value ;
   }

   public java.math.BigDecimal getEntunient( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient ;
   }

   public void setEntunient( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient = value ;
   }

   public java.math.BigDecimal getEntpre( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre ;
   }

   public void setEntpre( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre = value ;
   }

   public java.math.BigDecimal getEntunirem( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem ;
   }

   public void setEntunirem( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem = value ;
   }

   public String getEntlotn( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn ;
   }

   public void setEntlotn( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn = value ;
   }

   public java.util.Date getEntfval( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval ;
   }

   public void setEntfval( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval = value ;
   }

   public String getEntobs( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs ;
   }

   public void setEntobs( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs = value ;
   }

   public short getEntnumcon( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon ;
   }

   public void setEntnumcon( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon = value ;
   }

   public byte getEnteti( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti ;
   }

   public void setEnteti( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti = value ;
   }

   public byte getEntcon( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon ;
   }

   public void setEntcon( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon = value ;
   }

   public int getEntconini( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini ;
   }

   public void setEntconini( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini = value ;
   }

   public int getEntconfin( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin ;
   }

   public void setEntconfin( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin = value ;
   }

   public int getEntnro( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro ;
   }

   public void setEntnro( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro = value ;
   }

   public java.math.BigDecimal getEntunialb( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb ;
   }

   public void setEntunialb( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb = value ;
   }

   public String getEntpedcum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum ;
   }

   public void setEntpedcum( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum = value ;
   }

   public String getEntbnc( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc ;
   }

   public void setEntbnc( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc = value ;
   }

   public java.util.Date getPedfec( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec ;
   }

   public void setPedfec( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec = value ;
   }

   public short getPednumlin( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin ;
   }

   public void setPednumlin( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin = value ;
   }

   public String getPedpri( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri ;
   }

   public void setPedpri( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri = value ;
   }

   public String getPedsit( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit ;
   }

   public void setPedsit( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit = value ;
   }

   public String getPedcum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum ;
   }

   public void setPedcum( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum = value ;
   }

   public java.util.Date getPedfulent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent ;
   }

   public void setPedfulent( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent = value ;
   }

   public java.math.BigDecimal getPedcanent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent ;
   }

   public void setPedcanent( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent = value ;
   }

   public java.math.BigDecimal getPeduni( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni ;
   }

   public void setPeduni( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni = value ;
   }

   public java.math.BigDecimal getPedpre( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre ;
   }

   public void setPedpre( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre = value ;
   }

   public java.math.BigDecimal getCantpdte( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte ;
   }

   public void setCantpdte( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte = value ;
   }

   public String getEntcc( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc ;
   }

   public void setEntcc( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc = value ;
   }

   public short getEntccocod( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod ;
   }

   public void setEntccocod( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod = value ;
   }

   public String getEntremnro( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro ;
   }

   public void setEntremnro( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro = value ;
   }

   public java.util.Date getEntremfch( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch ;
   }

   public void setEntremfch( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch = value ;
   }

   public String getEntremsuc( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc ;
   }

   public void setEntremsuc( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc = value ;
   }

   public String getEntremtpo( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo ;
   }

   public void setEntremtpo( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo = value ;
   }

   public int getEntfabid( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid ;
   }

   public void setEntfabid( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid = value ;
   }

   public long getEntloteid( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid ;
   }

   public void setEntloteid( long value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid = value ;
   }

   public String getEntubicacion( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion ;
   }

   public void setEntubicacion( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion = value ;
   }

   public int getPrvnum( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum ;
   }

   public void setPrvnum( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum = value ;
   }

   public java.math.BigDecimal getPrdexialm( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm ;
   }

   public void setPrdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm = value ;
   }

   public java.math.BigDecimal getPrdcanpen( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen ;
   }

   public void setPrdcanpen( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen = value ;
   }

   public java.util.Date getPrdfulent( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent ;
   }

   public void setPrdfulent( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent = value ;
   }

   public java.util.Date getPrdfecpre( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre ;
   }

   public void setPrdfecpre( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre = value ;
   }

   public java.math.BigDecimal getPrdpreant( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant ;
   }

   public void setPrdpreant( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant = value ;
   }

   public java.math.BigDecimal getPrdpreact( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact ;
   }

   public void setPrdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact = value ;
   }

   public java.math.BigDecimal getPrdvalstk( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk ;
   }

   public void setPrdvalstk( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk = value ;
   }

   public java.math.BigDecimal getPeddto( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto ;
   }

   public void setPeddto( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto = value ;
   }

   public java.math.BigDecimal getPrdexicc( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc ;
   }

   public void setPrdexicc( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc = value ;
   }

   public String getPrddetpar( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar ;
   }

   public void setPrddetpar( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom = value ;
   }

   public String getPrdrec( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec ;
   }

   public void setPrdrec( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec = value ;
   }

   public byte getValcod( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod ;
   }

   public void setValcod( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod = value ;
   }

   public java.math.BigDecimal getPrdpremed( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed ;
   }

   public void setPrdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed = value ;
   }

   public byte getEntnemb( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb ;
   }

   public void setEntnemb( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z = value ;
   }

   public String getPrdnum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z ;
   }

   public void setPrdnum_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z = value ;
   }

   public short getLinent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z ;
   }

   public void setLinent_Z( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z = value ;
   }

   public java.util.Date getEntfecent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z ;
   }

   public void setEntfecent_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z = value ;
   }

   public String getAlbaran_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z ;
   }

   public void setAlbaran_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z = value ;
   }

   public String getEntnalbar_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z ;
   }

   public void setEntnalbar_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z = value ;
   }

   public int getPedcod_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z ;
   }

   public void setPedcod_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z = value ;
   }

   public int getEntprvnum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z ;
   }

   public void setEntprvnum_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z = value ;
   }

   public java.math.BigDecimal getEntunient_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z ;
   }

   public void setEntunient_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z = value ;
   }

   public java.math.BigDecimal getEntpre_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z ;
   }

   public void setEntpre_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z = value ;
   }

   public java.math.BigDecimal getEntunirem_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z ;
   }

   public void setEntunirem_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z = value ;
   }

   public String getEntlotn_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z ;
   }

   public void setEntlotn_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z = value ;
   }

   public java.util.Date getEntfval_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z ;
   }

   public void setEntfval_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z = value ;
   }

   public String getEntobs_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z ;
   }

   public void setEntobs_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z = value ;
   }

   public short getEntnumcon_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z ;
   }

   public void setEntnumcon_Z( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z = value ;
   }

   public byte getEnteti_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z ;
   }

   public void setEnteti_Z( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z = value ;
   }

   public byte getEntcon_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z ;
   }

   public void setEntcon_Z( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z = value ;
   }

   public int getEntconini_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z ;
   }

   public void setEntconini_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z = value ;
   }

   public int getEntconfin_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z ;
   }

   public void setEntconfin_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z = value ;
   }

   public int getEntnro_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z ;
   }

   public void setEntnro_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z = value ;
   }

   public java.math.BigDecimal getEntunialb_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z ;
   }

   public void setEntunialb_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z = value ;
   }

   public String getEntpedcum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z ;
   }

   public void setEntpedcum_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z = value ;
   }

   public String getEntbnc_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z ;
   }

   public void setEntbnc_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z = value ;
   }

   public java.util.Date getPedfec_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z ;
   }

   public void setPedfec_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z = value ;
   }

   public short getPednumlin_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z ;
   }

   public void setPednumlin_Z( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z = value ;
   }

   public String getPedpri_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z ;
   }

   public void setPedpri_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z = value ;
   }

   public String getPedsit_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z ;
   }

   public void setPedsit_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z = value ;
   }

   public String getPedcum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z ;
   }

   public void setPedcum_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z = value ;
   }

   public java.util.Date getPedfulent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z ;
   }

   public void setPedfulent_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z = value ;
   }

   public java.math.BigDecimal getPedcanent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z ;
   }

   public void setPedcanent_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z = value ;
   }

   public java.math.BigDecimal getPeduni_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z ;
   }

   public void setPeduni_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z = value ;
   }

   public java.math.BigDecimal getPedpre_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z ;
   }

   public void setPedpre_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z = value ;
   }

   public java.math.BigDecimal getCantpdte_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z ;
   }

   public void setCantpdte_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z = value ;
   }

   public String getEntcc_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z ;
   }

   public void setEntcc_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z = value ;
   }

   public short getEntccocod_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z ;
   }

   public void setEntccocod_Z( short value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z = value ;
   }

   public String getEntremnro_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z ;
   }

   public void setEntremnro_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z = value ;
   }

   public java.util.Date getEntremfch_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z ;
   }

   public void setEntremfch_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z = value ;
   }

   public String getEntremsuc_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z ;
   }

   public void setEntremsuc_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z = value ;
   }

   public String getEntremtpo_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z ;
   }

   public void setEntremtpo_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z = value ;
   }

   public int getEntfabid_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z ;
   }

   public void setEntfabid_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z = value ;
   }

   public long getEntloteid_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z ;
   }

   public void setEntloteid_Z( long value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z = value ;
   }

   public String getEntubicacion_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z ;
   }

   public void setEntubicacion_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z = value ;
   }

   public int getPrvnum_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z ;
   }

   public void setPrvnum_Z( int value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z = value ;
   }

   public java.math.BigDecimal getPrdexialm_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z ;
   }

   public void setPrdexialm_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z = value ;
   }

   public java.math.BigDecimal getPrdcanpen_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z ;
   }

   public void setPrdcanpen_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z = value ;
   }

   public java.util.Date getPrdfulent_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z ;
   }

   public void setPrdfulent_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z = value ;
   }

   public java.util.Date getPrdfecpre_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z ;
   }

   public void setPrdfecpre_Z( java.util.Date value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z = value ;
   }

   public java.math.BigDecimal getPrdpreant_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z ;
   }

   public void setPrdpreant_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z = value ;
   }

   public java.math.BigDecimal getPrdpreact_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z ;
   }

   public void setPrdpreact_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z = value ;
   }

   public java.math.BigDecimal getPrdvalstk_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z ;
   }

   public void setPrdvalstk_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z = value ;
   }

   public java.math.BigDecimal getPeddto_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z ;
   }

   public void setPeddto_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z = value ;
   }

   public java.math.BigDecimal getPrdexicc_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z ;
   }

   public void setPrdexicc_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z = value ;
   }

   public String getPrddetpar_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z ;
   }

   public void setPrddetpar_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z = value ;
   }

   public String getPrdnom_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z ;
   }

   public void setPrdnom_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z = value ;
   }

   public String getPrdrec_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z ;
   }

   public void setPrdrec_Z( String value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z = value ;
   }

   public byte getValcod_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z ;
   }

   public void setValcod_Z( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z = value ;
   }

   public java.math.BigDecimal getPrdpremed_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z ;
   }

   public void setPrdpremed_Z( java.math.BigDecimal value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z = value ;
   }

   public byte getEntnemb_Z( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z ;
   }

   public void setEntnemb_Z( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z = value ;
   }

   public byte getPedcod_N( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N ;
   }

   public void setPedcod_N( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N = value ;
   }

   public byte getEntprvnum_N( )
   {
      return gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N ;
   }

   public void setEntprvnum_N( byte value )
   {
      gxTv_SdtEntradadeProductosAlmacen_TRN_N = (byte)(0) ;
      gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N = value ;
   }

   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti ;
   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon ;
   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod ;
   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb ;
   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z ;
   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z ;
   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z ;
   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z ;
   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N ;
   protected byte gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N ;
   private byte gxTv_SdtEntradadeProductosAlmacen_TRN_N ;
   protected short gxTv_SdtEntradadeProductosAlmacen_TRN_Linent ;
   protected short gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon ;
   protected short gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin ;
   protected short gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod ;
   protected short gxTv_SdtEntradadeProductosAlmacen_TRN_Initialized ;
   protected short gxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z ;
   protected short gxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z ;
   protected short gxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z ;
   protected short gxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z ;
   protected int gxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z ;
   protected long gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid ;
   protected long gxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Mode ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z ;
   protected String gxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z ;
   protected java.util.Date gxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z ;
   protected java.math.BigDecimal gxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z ;
}

