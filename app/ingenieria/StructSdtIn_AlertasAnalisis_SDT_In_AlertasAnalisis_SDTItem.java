package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem.class ));
   }

   public StructSdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem( int remoteHandle ,
                                                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec = cal.getTime() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni = new java.math.BigDecimal(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni = new java.math.BigDecimal(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi = cal.getTime() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi = cal.getTime() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf = cal.getTime() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf = cal.getTime() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti = cal.getTime() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf = cal.getTime() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq = new java.math.BigDecimal(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini = new java.math.BigDecimal(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd = cal.getTime() ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd = new java.math.BigDecimal(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd = new java.math.BigDecimal(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2 = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar = "" ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N = (byte)(1) ;
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
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom = value ;
   }

   public String getEmprcodvir( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir ;
   }

   public void setEmprcodvir( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc = value ;
   }

   public java.util.Date getHisprofec( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec ;
   }

   public void setHisprofec( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec = value ;
   }

   public int getHisproulin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin ;
   }

   public void setHisproulin( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin = value ;
   }

   public java.math.BigDecimal getTotuni( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni ;
   }

   public void setTotuni( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni = value ;
   }

   public int getHisprolin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin ;
   }

   public void setHisprolin( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar = value ;
   }

   public int getGruopecod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod ;
   }

   public void setGruopecod( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod = value ;
   }

   public String getGruopedsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc ;
   }

   public void setGruopedsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc = value ;
   }

   public short getBarordlin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin ;
   }

   public void setBarordlin( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin = value ;
   }

   public String getFase( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase ;
   }

   public void setFase( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase = value ;
   }

   public String getFasedsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc ;
   }

   public void setFasedsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc = value ;
   }

   public java.math.BigDecimal getHisprouni( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni ;
   }

   public void setHisprouni( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni = value ;
   }

   public byte getHisprotur( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur ;
   }

   public void setHisprotur( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur = value ;
   }

   public byte getHisprohin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin ;
   }

   public void setHisprohin( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin = value ;
   }

   public byte getHispromin( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin ;
   }

   public void setHispromin( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin = value ;
   }

   public byte getHisprohfi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi ;
   }

   public void setHisprohfi( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi = value ;
   }

   public byte getHispromfi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi ;
   }

   public void setHispromfi( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi = value ;
   }

   public String getHisprof( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof ;
   }

   public void setHisprof( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod = value ;
   }

   public String getParcodnom( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom ;
   }

   public void setParcodnom( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom = value ;
   }

   public short getHisprotre( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre ;
   }

   public void setHisprotre( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre = value ;
   }

   public short getHisprotte( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte ;
   }

   public void setHisprotte( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte = value ;
   }

   public byte getHisbartip( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip ;
   }

   public void setHisbartip( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip = value ;
   }

   public byte getHisproest( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest ;
   }

   public void setHisproest( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr = value ;
   }

   public short getHisprotip( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip ;
   }

   public void setHisprotip( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip = value ;
   }

   public String getHisprocod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod ;
   }

   public void setHisprocod( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod = value ;
   }

   public String getHisprolot( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot ;
   }

   public void setHisprolot( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot = value ;
   }

   public byte getHisprotc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc ;
   }

   public void setHisprotc( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc = value ;
   }

   public byte getHisproreo( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo ;
   }

   public void setHisproreo( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo = value ;
   }

   public int getHisprobot( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot ;
   }

   public void setHisprobot( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot = value ;
   }

   public int getHispronpart( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart ;
   }

   public void setHispronpart( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart = value ;
   }

   public short getHispronpzs( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs ;
   }

   public void setHispronpzs( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs = value ;
   }

   public String getHisproban( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban ;
   }

   public void setHisproban( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban = value ;
   }

   public java.util.Date getHisprodi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi ;
   }

   public void setHisprodi( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi = value ;
   }

   public java.util.Date getHisprohi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi ;
   }

   public void setHisprohi( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi = value ;
   }

   public java.util.Date getHisprodf( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf ;
   }

   public void setHisprodf( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf = value ;
   }

   public java.util.Date getHisprohf( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf ;
   }

   public void setHisprohf( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf = value ;
   }

   public java.util.Date getHisprodti( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti ;
   }

   public void setHisprodti( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf = value ;
   }

   public short getHisprotr2( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2 ;
   }

   public void setHisprotr2( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2 = value ;
   }

   public short getHisprotdab( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab ;
   }

   public void setHisprotdab( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab = value ;
   }

   public byte getHispronpd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd ;
   }

   public void setHispronpd( byte value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd = value ;
   }

   public String getHisproctr( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr ;
   }

   public void setHisproctr( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr = value ;
   }

   public short getHisprogf( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf ;
   }

   public void setHisprogf( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf = value ;
   }

   public java.math.BigDecimal getHishhmaq( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq ;
   }

   public void setHishhmaq( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq = value ;
   }

   public java.math.BigDecimal getHishhini( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini ;
   }

   public void setHishhini( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini = value ;
   }

   public String getHispromq( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq ;
   }

   public void setHispromq( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq = value ;
   }

   public java.util.Date getHisprofd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd ;
   }

   public void setHisprofd( java.util.Date value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd = value ;
   }

   public String getHisprodibc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc ;
   }

   public void setHisprodibc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc = value ;
   }

   public int getHisprodibi( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi ;
   }

   public void setHisprodibi( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi = value ;
   }

   public String getHisprocom( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom ;
   }

   public void setHisprocom( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom = value ;
   }

   public String getHisprofon( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon ;
   }

   public void setHisprofon( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon = value ;
   }

   public java.math.BigDecimal getHispromthd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd ;
   }

   public void setHispromthd( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd = value ;
   }

   public java.math.BigDecimal getHisprokghd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd ;
   }

   public void setHisprokghd( java.math.BigDecimal value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd = value ;
   }

   public int getHispropzhd( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd ;
   }

   public void setHispropzhd( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc = value ;
   }

   public short getParfascod( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod ;
   }

   public void setParfascod( short value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod = value ;
   }

   public String getParfasdsc( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc ;
   }

   public void setParfasdsc( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc = value ;
   }

   public String getBarparvl2( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2 ;
   }

   public void setBarparvl2( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2 = value ;
   }

   public String getBarparvmn( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn ;
   }

   public void setBarparvmn( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn = value ;
   }

   public String getBarparvmx( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx ;
   }

   public void setBarparvmx( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx = value ;
   }

   public String getBarvalpar( )
   {
      return gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar ;
   }

   public void setBarvalpar( String value )
   {
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar = value ;
   }

   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotur ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohin ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromin ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohfi ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromfi ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisbartip ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproest ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotc ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproreo ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpd ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd_N ;
   protected byte gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_N ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcod ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotre ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotte ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotip ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpzs ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotr2 ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprotdab ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprogf ;
   protected short gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproulin ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolin ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopecod ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprobot ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispronpart ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibi ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispropzhd ;
   protected int gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcod ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprnom ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Emprcodvir ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqdsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Gruopedsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fasedsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprof ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parcodnom ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocod ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprolot ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproban ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisproctr ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromq ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodibc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprocom ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofon ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clinom ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barserdsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2 ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx ;
   protected String gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofec ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Totuni ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprouni ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromtr ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodi ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohi ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodti ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhmaq ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hishhini ;
   protected java.util.Date gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprofd ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hispromthd ;
   protected java.math.BigDecimal gxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprokghd ;
}

