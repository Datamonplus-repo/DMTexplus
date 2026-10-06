package app ;
import com.genexus.*;

public final  class StructSdtTDevPie2 implements Cloneable, java.io.Serializable
{
   public StructSdtTDevPie2( )
   {
      this( -1, new ModelContext( StructSdtTDevPie2.class ));
   }

   public StructSdtTDevPie2( int remoteHandle ,
                             ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTDevPie2_Emprcod = "" ;
      gxTv_SdtTDevPie2_Emprnom = "" ;
      gxTv_SdtTDevPie2_Devgenfec = cal.getTime() ;
      gxTv_SdtTDevPie2_Clinom = "" ;
      gxTv_SdtTDevPie2_Albref = "" ;
      gxTv_SdtTDevPie2_Devtrnnom = "" ;
      gxTv_SdtTDevPie2_Albrunidis = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Albruni = "" ;
      gxTv_SdtTDevPie2_Devgenuni = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Albruniuti = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Albrunient = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Albdevpuni = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Mode = "" ;
      gxTv_SdtTDevPie2_Emprcod_Z = "" ;
      gxTv_SdtTDevPie2_Emprnom_Z = "" ;
      gxTv_SdtTDevPie2_Devgenfec_Z = cal.getTime() ;
      gxTv_SdtTDevPie2_Clinom_Z = "" ;
      gxTv_SdtTDevPie2_Albref_Z = "" ;
      gxTv_SdtTDevPie2_Devtrnnom_Z = "" ;
      gxTv_SdtTDevPie2_Albrunidis_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Albruni_Z = "" ;
      gxTv_SdtTDevPie2_Devgenuni_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Albruniuti_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Albrunient_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Albdevpuni_Z = new java.math.BigDecimal(0) ;
      gxTv_SdtTDevPie2_Emprnom_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgenfec_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Albreccod_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgendom_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgentrn_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devtrnnom_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgenuni_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgenpie_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devgenest_N = (byte)(1) ;
      gxTv_SdtTDevPie2_Devulin_N = (byte)(1) ;
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
      return gxTv_SdtTDevPie2_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Emprcod = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtTDevPie2_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtTDevPie2_Emprnom_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Emprnom = value ;
   }

   public int getDevgencod( )
   {
      return gxTv_SdtTDevPie2_Devgencod ;
   }

   public void setDevgencod( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgencod = value ;
   }

   public java.util.Date getDevgenfec( )
   {
      return gxTv_SdtTDevPie2_Devgenfec ;
   }

   public void setDevgenfec( java.util.Date value )
   {
      gxTv_SdtTDevPie2_Devgenfec_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenfec = value ;
   }

   public int getAlbreccod( )
   {
      return gxTv_SdtTDevPie2_Albreccod ;
   }

   public void setAlbreccod( int value )
   {
      gxTv_SdtTDevPie2_Albreccod_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albreccod = value ;
   }

   public byte getDevgendom( )
   {
      return gxTv_SdtTDevPie2_Devgendom ;
   }

   public void setDevgendom( byte value )
   {
      gxTv_SdtTDevPie2_Devgendom_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgendom = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtTDevPie2_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtTDevPie2_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Clinom = value ;
   }

   public String getAlbref( )
   {
      return gxTv_SdtTDevPie2_Albref ;
   }

   public void setAlbref( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albref = value ;
   }

   public short getDevgentrn( )
   {
      return gxTv_SdtTDevPie2_Devgentrn ;
   }

   public void setDevgentrn( short value )
   {
      gxTv_SdtTDevPie2_Devgentrn_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgentrn = value ;
   }

   public String getDevtrnnom( )
   {
      return gxTv_SdtTDevPie2_Devtrnnom ;
   }

   public void setDevtrnnom( String value )
   {
      gxTv_SdtTDevPie2_Devtrnnom_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devtrnnom = value ;
   }

   public java.math.BigDecimal getAlbrunidis( )
   {
      return gxTv_SdtTDevPie2_Albrunidis ;
   }

   public void setAlbrunidis( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrunidis = value ;
   }

   public int getAlbrpiedis( )
   {
      return gxTv_SdtTDevPie2_Albrpiedis ;
   }

   public void setAlbrpiedis( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrpiedis = value ;
   }

   public String getAlbruni( )
   {
      return gxTv_SdtTDevPie2_Albruni ;
   }

   public void setAlbruni( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albruni = value ;
   }

   public java.math.BigDecimal getDevgenuni( )
   {
      return gxTv_SdtTDevPie2_Devgenuni ;
   }

   public void setDevgenuni( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_Devgenuni_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenuni = value ;
   }

   public short getDevgenpie( )
   {
      return gxTv_SdtTDevPie2_Devgenpie ;
   }

   public void setDevgenpie( short value )
   {
      gxTv_SdtTDevPie2_Devgenpie_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenpie = value ;
   }

   public java.math.BigDecimal getAlbruniuti( )
   {
      return gxTv_SdtTDevPie2_Albruniuti ;
   }

   public void setAlbruniuti( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albruniuti = value ;
   }

   public int getAlbrpieuti( )
   {
      return gxTv_SdtTDevPie2_Albrpieuti ;
   }

   public void setAlbrpieuti( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrpieuti = value ;
   }

   public int getAlbrpieent( )
   {
      return gxTv_SdtTDevPie2_Albrpieent ;
   }

   public void setAlbrpieent( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrpieent = value ;
   }

   public java.math.BigDecimal getAlbrunient( )
   {
      return gxTv_SdtTDevPie2_Albrunient ;
   }

   public void setAlbrunient( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrunient = value ;
   }

   public byte getAlbrest( )
   {
      return gxTv_SdtTDevPie2_Albrest ;
   }

   public void setAlbrest( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrest = value ;
   }

   public byte getDevgenest( )
   {
      return gxTv_SdtTDevPie2_Devgenest ;
   }

   public void setDevgenest( byte value )
   {
      gxTv_SdtTDevPie2_Devgenest_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenest = value ;
   }

   public java.math.BigDecimal getAlbdevpuni( )
   {
      return gxTv_SdtTDevPie2_Albdevpuni ;
   }

   public void setAlbdevpuni( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albdevpuni = value ;
   }

   public short getAlbdevppie( )
   {
      return gxTv_SdtTDevPie2_Albdevppie ;
   }

   public void setAlbdevppie( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albdevppie = value ;
   }

   public byte getDevulin( )
   {
      return gxTv_SdtTDevPie2_Devulin ;
   }

   public void setDevulin( byte value )
   {
      gxTv_SdtTDevPie2_Devulin_N = (byte)(0) ;
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devulin = value ;
   }

   public java.util.Vector<app.StructSdtTDevPie2_Level1Item> getLevel1( )
   {
      return gxTv_SdtTDevPie2_Level1 ;
   }

   public void setLevel1( java.util.Vector<app.StructSdtTDevPie2_Level1Item> value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Level1 = value ;
   }

   public String getMode( )
   {
      return gxTv_SdtTDevPie2_Mode ;
   }

   public void setMode( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Mode = value ;
   }

   public short getInitialized( )
   {
      return gxTv_SdtTDevPie2_Initialized ;
   }

   public void setInitialized( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Initialized = value ;
   }

   public String getEmprcod_Z( )
   {
      return gxTv_SdtTDevPie2_Emprcod_Z ;
   }

   public void setEmprcod_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Emprcod_Z = value ;
   }

   public String getEmprnom_Z( )
   {
      return gxTv_SdtTDevPie2_Emprnom_Z ;
   }

   public void setEmprnom_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Emprnom_Z = value ;
   }

   public int getDevgencod_Z( )
   {
      return gxTv_SdtTDevPie2_Devgencod_Z ;
   }

   public void setDevgencod_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgencod_Z = value ;
   }

   public java.util.Date getDevgenfec_Z( )
   {
      return gxTv_SdtTDevPie2_Devgenfec_Z ;
   }

   public void setDevgenfec_Z( java.util.Date value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenfec_Z = value ;
   }

   public int getAlbreccod_Z( )
   {
      return gxTv_SdtTDevPie2_Albreccod_Z ;
   }

   public void setAlbreccod_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albreccod_Z = value ;
   }

   public byte getDevgendom_Z( )
   {
      return gxTv_SdtTDevPie2_Devgendom_Z ;
   }

   public void setDevgendom_Z( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgendom_Z = value ;
   }

   public int getClicod_Z( )
   {
      return gxTv_SdtTDevPie2_Clicod_Z ;
   }

   public void setClicod_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Clicod_Z = value ;
   }

   public String getClinom_Z( )
   {
      return gxTv_SdtTDevPie2_Clinom_Z ;
   }

   public void setClinom_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Clinom_Z = value ;
   }

   public String getAlbref_Z( )
   {
      return gxTv_SdtTDevPie2_Albref_Z ;
   }

   public void setAlbref_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albref_Z = value ;
   }

   public short getDevgentrn_Z( )
   {
      return gxTv_SdtTDevPie2_Devgentrn_Z ;
   }

   public void setDevgentrn_Z( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgentrn_Z = value ;
   }

   public String getDevtrnnom_Z( )
   {
      return gxTv_SdtTDevPie2_Devtrnnom_Z ;
   }

   public void setDevtrnnom_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devtrnnom_Z = value ;
   }

   public java.math.BigDecimal getAlbrunidis_Z( )
   {
      return gxTv_SdtTDevPie2_Albrunidis_Z ;
   }

   public void setAlbrunidis_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrunidis_Z = value ;
   }

   public int getAlbrpiedis_Z( )
   {
      return gxTv_SdtTDevPie2_Albrpiedis_Z ;
   }

   public void setAlbrpiedis_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrpiedis_Z = value ;
   }

   public String getAlbruni_Z( )
   {
      return gxTv_SdtTDevPie2_Albruni_Z ;
   }

   public void setAlbruni_Z( String value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albruni_Z = value ;
   }

   public java.math.BigDecimal getDevgenuni_Z( )
   {
      return gxTv_SdtTDevPie2_Devgenuni_Z ;
   }

   public void setDevgenuni_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenuni_Z = value ;
   }

   public short getDevgenpie_Z( )
   {
      return gxTv_SdtTDevPie2_Devgenpie_Z ;
   }

   public void setDevgenpie_Z( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenpie_Z = value ;
   }

   public java.math.BigDecimal getAlbruniuti_Z( )
   {
      return gxTv_SdtTDevPie2_Albruniuti_Z ;
   }

   public void setAlbruniuti_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albruniuti_Z = value ;
   }

   public int getAlbrpieuti_Z( )
   {
      return gxTv_SdtTDevPie2_Albrpieuti_Z ;
   }

   public void setAlbrpieuti_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrpieuti_Z = value ;
   }

   public int getAlbrpieent_Z( )
   {
      return gxTv_SdtTDevPie2_Albrpieent_Z ;
   }

   public void setAlbrpieent_Z( int value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrpieent_Z = value ;
   }

   public java.math.BigDecimal getAlbrunient_Z( )
   {
      return gxTv_SdtTDevPie2_Albrunient_Z ;
   }

   public void setAlbrunient_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrunient_Z = value ;
   }

   public byte getAlbrest_Z( )
   {
      return gxTv_SdtTDevPie2_Albrest_Z ;
   }

   public void setAlbrest_Z( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albrest_Z = value ;
   }

   public byte getDevgenest_Z( )
   {
      return gxTv_SdtTDevPie2_Devgenest_Z ;
   }

   public void setDevgenest_Z( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenest_Z = value ;
   }

   public java.math.BigDecimal getAlbdevpuni_Z( )
   {
      return gxTv_SdtTDevPie2_Albdevpuni_Z ;
   }

   public void setAlbdevpuni_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albdevpuni_Z = value ;
   }

   public short getAlbdevppie_Z( )
   {
      return gxTv_SdtTDevPie2_Albdevppie_Z ;
   }

   public void setAlbdevppie_Z( short value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albdevppie_Z = value ;
   }

   public byte getDevulin_Z( )
   {
      return gxTv_SdtTDevPie2_Devulin_Z ;
   }

   public void setDevulin_Z( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devulin_Z = value ;
   }

   public byte getEmprnom_N( )
   {
      return gxTv_SdtTDevPie2_Emprnom_N ;
   }

   public void setEmprnom_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Emprnom_N = value ;
   }

   public byte getDevgenfec_N( )
   {
      return gxTv_SdtTDevPie2_Devgenfec_N ;
   }

   public void setDevgenfec_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenfec_N = value ;
   }

   public byte getAlbreccod_N( )
   {
      return gxTv_SdtTDevPie2_Albreccod_N ;
   }

   public void setAlbreccod_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Albreccod_N = value ;
   }

   public byte getDevgendom_N( )
   {
      return gxTv_SdtTDevPie2_Devgendom_N ;
   }

   public void setDevgendom_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgendom_N = value ;
   }

   public byte getClicod_N( )
   {
      return gxTv_SdtTDevPie2_Clicod_N ;
   }

   public void setClicod_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Clicod_N = value ;
   }

   public byte getDevgentrn_N( )
   {
      return gxTv_SdtTDevPie2_Devgentrn_N ;
   }

   public void setDevgentrn_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgentrn_N = value ;
   }

   public byte getDevtrnnom_N( )
   {
      return gxTv_SdtTDevPie2_Devtrnnom_N ;
   }

   public void setDevtrnnom_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devtrnnom_N = value ;
   }

   public byte getDevgenuni_N( )
   {
      return gxTv_SdtTDevPie2_Devgenuni_N ;
   }

   public void setDevgenuni_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenuni_N = value ;
   }

   public byte getDevgenpie_N( )
   {
      return gxTv_SdtTDevPie2_Devgenpie_N ;
   }

   public void setDevgenpie_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenpie_N = value ;
   }

   public byte getDevgenest_N( )
   {
      return gxTv_SdtTDevPie2_Devgenest_N ;
   }

   public void setDevgenest_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devgenest_N = value ;
   }

   public byte getDevulin_N( )
   {
      return gxTv_SdtTDevPie2_Devulin_N ;
   }

   public void setDevulin_N( byte value )
   {
      gxTv_SdtTDevPie2_N = (byte)(0) ;
      gxTv_SdtTDevPie2_Devulin_N = value ;
   }

   protected byte gxTv_SdtTDevPie2_Devgendom ;
   protected byte gxTv_SdtTDevPie2_Albrest ;
   protected byte gxTv_SdtTDevPie2_Devgenest ;
   protected byte gxTv_SdtTDevPie2_Devulin ;
   protected byte gxTv_SdtTDevPie2_Devgendom_Z ;
   protected byte gxTv_SdtTDevPie2_Albrest_Z ;
   protected byte gxTv_SdtTDevPie2_Devgenest_Z ;
   protected byte gxTv_SdtTDevPie2_Devulin_Z ;
   protected byte gxTv_SdtTDevPie2_Emprnom_N ;
   protected byte gxTv_SdtTDevPie2_Devgenfec_N ;
   protected byte gxTv_SdtTDevPie2_Albreccod_N ;
   protected byte gxTv_SdtTDevPie2_Devgendom_N ;
   protected byte gxTv_SdtTDevPie2_Clicod_N ;
   protected byte gxTv_SdtTDevPie2_Devgentrn_N ;
   protected byte gxTv_SdtTDevPie2_Devtrnnom_N ;
   protected byte gxTv_SdtTDevPie2_Devgenuni_N ;
   protected byte gxTv_SdtTDevPie2_Devgenpie_N ;
   protected byte gxTv_SdtTDevPie2_Devgenest_N ;
   protected byte gxTv_SdtTDevPie2_Devulin_N ;
   private byte gxTv_SdtTDevPie2_N ;
   protected short gxTv_SdtTDevPie2_Devgentrn ;
   protected short gxTv_SdtTDevPie2_Devgenpie ;
   protected short gxTv_SdtTDevPie2_Albdevppie ;
   protected short gxTv_SdtTDevPie2_Initialized ;
   protected short gxTv_SdtTDevPie2_Devgentrn_Z ;
   protected short gxTv_SdtTDevPie2_Devgenpie_Z ;
   protected short gxTv_SdtTDevPie2_Albdevppie_Z ;
   protected int gxTv_SdtTDevPie2_Devgencod ;
   protected int gxTv_SdtTDevPie2_Albreccod ;
   protected int gxTv_SdtTDevPie2_Clicod ;
   protected int gxTv_SdtTDevPie2_Albrpiedis ;
   protected int gxTv_SdtTDevPie2_Albrpieuti ;
   protected int gxTv_SdtTDevPie2_Albrpieent ;
   protected int gxTv_SdtTDevPie2_Devgencod_Z ;
   protected int gxTv_SdtTDevPie2_Albreccod_Z ;
   protected int gxTv_SdtTDevPie2_Clicod_Z ;
   protected int gxTv_SdtTDevPie2_Albrpiedis_Z ;
   protected int gxTv_SdtTDevPie2_Albrpieuti_Z ;
   protected int gxTv_SdtTDevPie2_Albrpieent_Z ;
   protected String gxTv_SdtTDevPie2_Emprcod ;
   protected String gxTv_SdtTDevPie2_Emprnom ;
   protected String gxTv_SdtTDevPie2_Clinom ;
   protected String gxTv_SdtTDevPie2_Albref ;
   protected String gxTv_SdtTDevPie2_Devtrnnom ;
   protected String gxTv_SdtTDevPie2_Albruni ;
   protected String gxTv_SdtTDevPie2_Mode ;
   protected String gxTv_SdtTDevPie2_Emprcod_Z ;
   protected String gxTv_SdtTDevPie2_Emprnom_Z ;
   protected String gxTv_SdtTDevPie2_Clinom_Z ;
   protected String gxTv_SdtTDevPie2_Albref_Z ;
   protected String gxTv_SdtTDevPie2_Devtrnnom_Z ;
   protected String gxTv_SdtTDevPie2_Albruni_Z ;
   protected java.util.Date gxTv_SdtTDevPie2_Devgenfec ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Albrunidis ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Devgenuni ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Albruniuti ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Albrunient ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Albdevpuni ;
   protected java.util.Date gxTv_SdtTDevPie2_Devgenfec_Z ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Albrunidis_Z ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Devgenuni_Z ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Albruniuti_Z ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Albrunient_Z ;
   protected java.math.BigDecimal gxTv_SdtTDevPie2_Albdevpuni_Z ;
   protected java.util.Vector<app.StructSdtTDevPie2_Level1Item> gxTv_SdtTDevPie2_Level1=null ;
}

