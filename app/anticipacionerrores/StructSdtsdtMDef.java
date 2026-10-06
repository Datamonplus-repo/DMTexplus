package app.anticipacionerrores ;
import com.genexus.*;

public final  class StructSdtsdtMDef implements Cloneable, java.io.Serializable
{
   public StructSdtsdtMDef( )
   {
      this( -1, new ModelContext( StructSdtsdtMDef.class ));
   }

   public StructSdtsdtMDef( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtsdtMDef_Mdefemprcod = "" ;
      gxTv_SdtsdtMDef_Mdefclinom = "" ;
      gxTv_SdtsdtMDef_Mdefartcod = "" ;
      gxTv_SdtsdtMDef_Mdefartdsc = "" ;
      gxTv_SdtsdtMDef_Mdefcolnom = "" ;
      gxTv_SdtsdtMDef_Mdefmaqcod = "" ;
      gxTv_SdtsdtMDef_Mdefmaqdsc = "" ;
      gxTv_SdtsdtMDef_Mdeftipmco = "" ;
      gxTv_SdtsdtMDef_Mdeftipmds = "" ;
      gxTv_SdtsdtMDef_Mdefdefdsc = "" ;
      gxTv_SdtsdtMDef_Mdefcatdsc = "" ;
      gxTv_SdtsdtMDef_Mdefkiltot = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtMDef_Mdefkilpro = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtMDef_Mdefkilreo = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtMDef_Mdefporc = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtMDef_Mdefusu = "" ;
      gxTv_SdtsdtMDef_Mdeftkn = "" ;
      gxTv_SdtsdtMDef_Mdefmettot = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtMDef_Mdefmetpro = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtMDef_Mdefmetreo = new java.math.BigDecimal(0) ;
      gxTv_SdtsdtMDef_Mdefmetpor = new java.math.BigDecimal(0) ;
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

   public long getMdefid( )
   {
      return gxTv_SdtsdtMDef_Mdefid ;
   }

   public void setMdefid( long value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefid = value ;
   }

   public String getMdefemprcod( )
   {
      return gxTv_SdtsdtMDef_Mdefemprcod ;
   }

   public void setMdefemprcod( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefemprcod = value ;
   }

   public int getMdefclicod( )
   {
      return gxTv_SdtsdtMDef_Mdefclicod ;
   }

   public void setMdefclicod( int value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefclicod = value ;
   }

   public String getMdefclinom( )
   {
      return gxTv_SdtsdtMDef_Mdefclinom ;
   }

   public void setMdefclinom( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefclinom = value ;
   }

   public String getMdefartcod( )
   {
      return gxTv_SdtsdtMDef_Mdefartcod ;
   }

   public void setMdefartcod( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefartcod = value ;
   }

   public String getMdefartdsc( )
   {
      return gxTv_SdtsdtMDef_Mdefartdsc ;
   }

   public void setMdefartdsc( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefartdsc = value ;
   }

   public int getMdefcolnum( )
   {
      return gxTv_SdtsdtMDef_Mdefcolnum ;
   }

   public void setMdefcolnum( int value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcolnum = value ;
   }

   public byte getMdefcolcod( )
   {
      return gxTv_SdtsdtMDef_Mdefcolcod ;
   }

   public void setMdefcolcod( byte value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcolcod = value ;
   }

   public String getMdefcolnom( )
   {
      return gxTv_SdtsdtMDef_Mdefcolnom ;
   }

   public void setMdefcolnom( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcolnom = value ;
   }

   public String getMdefmaqcod( )
   {
      return gxTv_SdtsdtMDef_Mdefmaqcod ;
   }

   public void setMdefmaqcod( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmaqcod = value ;
   }

   public String getMdefmaqdsc( )
   {
      return gxTv_SdtsdtMDef_Mdefmaqdsc ;
   }

   public void setMdefmaqdsc( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmaqdsc = value ;
   }

   public String getMdeftipmco( )
   {
      return gxTv_SdtsdtMDef_Mdeftipmco ;
   }

   public void setMdeftipmco( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdeftipmco = value ;
   }

   public String getMdeftipmds( )
   {
      return gxTv_SdtsdtMDef_Mdeftipmds ;
   }

   public void setMdeftipmds( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdeftipmds = value ;
   }

   public short getMdefdefcod( )
   {
      return gxTv_SdtsdtMDef_Mdefdefcod ;
   }

   public void setMdefdefcod( short value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefdefcod = value ;
   }

   public String getMdefdefdsc( )
   {
      return gxTv_SdtsdtMDef_Mdefdefdsc ;
   }

   public void setMdefdefdsc( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefdefdsc = value ;
   }

   public short getMdefcatcod( )
   {
      return gxTv_SdtsdtMDef_Mdefcatcod ;
   }

   public void setMdefcatcod( short value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcatcod = value ;
   }

   public String getMdefcatdsc( )
   {
      return gxTv_SdtsdtMDef_Mdefcatdsc ;
   }

   public void setMdefcatdsc( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefcatdsc = value ;
   }

   public java.math.BigDecimal getMdefkiltot( )
   {
      return gxTv_SdtsdtMDef_Mdefkiltot ;
   }

   public void setMdefkiltot( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefkiltot = value ;
   }

   public java.math.BigDecimal getMdefkilpro( )
   {
      return gxTv_SdtsdtMDef_Mdefkilpro ;
   }

   public void setMdefkilpro( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefkilpro = value ;
   }

   public java.math.BigDecimal getMdefkilreo( )
   {
      return gxTv_SdtsdtMDef_Mdefkilreo ;
   }

   public void setMdefkilreo( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefkilreo = value ;
   }

   public java.math.BigDecimal getMdefporc( )
   {
      return gxTv_SdtsdtMDef_Mdefporc ;
   }

   public void setMdefporc( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefporc = value ;
   }

   public String getMdefusu( )
   {
      return gxTv_SdtsdtMDef_Mdefusu ;
   }

   public void setMdefusu( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefusu = value ;
   }

   public String getMdeftkn( )
   {
      return gxTv_SdtsdtMDef_Mdeftkn ;
   }

   public void setMdeftkn( String value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdeftkn = value ;
   }

   public java.math.BigDecimal getMdefmettot( )
   {
      return gxTv_SdtsdtMDef_Mdefmettot ;
   }

   public void setMdefmettot( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmettot = value ;
   }

   public java.math.BigDecimal getMdefmetpro( )
   {
      return gxTv_SdtsdtMDef_Mdefmetpro ;
   }

   public void setMdefmetpro( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmetpro = value ;
   }

   public java.math.BigDecimal getMdefmetreo( )
   {
      return gxTv_SdtsdtMDef_Mdefmetreo ;
   }

   public void setMdefmetreo( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmetreo = value ;
   }

   public java.math.BigDecimal getMdefmetpor( )
   {
      return gxTv_SdtsdtMDef_Mdefmetpor ;
   }

   public void setMdefmetpor( java.math.BigDecimal value )
   {
      gxTv_SdtsdtMDef_N = (byte)(0) ;
      gxTv_SdtsdtMDef_Mdefmetpor = value ;
   }

   protected byte gxTv_SdtsdtMDef_Mdefcolcod ;
   protected byte gxTv_SdtsdtMDef_N ;
   protected short gxTv_SdtsdtMDef_Mdefdefcod ;
   protected short gxTv_SdtsdtMDef_Mdefcatcod ;
   protected int gxTv_SdtsdtMDef_Mdefclicod ;
   protected int gxTv_SdtsdtMDef_Mdefcolnum ;
   protected long gxTv_SdtsdtMDef_Mdefid ;
   protected String gxTv_SdtsdtMDef_Mdefemprcod ;
   protected String gxTv_SdtsdtMDef_Mdefartcod ;
   protected String gxTv_SdtsdtMDef_Mdefcolnom ;
   protected String gxTv_SdtsdtMDef_Mdefmaqcod ;
   protected String gxTv_SdtsdtMDef_Mdeftipmco ;
   protected String gxTv_SdtsdtMDef_Mdefusu ;
   protected String gxTv_SdtsdtMDef_Mdefclinom ;
   protected String gxTv_SdtsdtMDef_Mdefartdsc ;
   protected String gxTv_SdtsdtMDef_Mdefmaqdsc ;
   protected String gxTv_SdtsdtMDef_Mdeftipmds ;
   protected String gxTv_SdtsdtMDef_Mdefdefdsc ;
   protected String gxTv_SdtsdtMDef_Mdefcatdsc ;
   protected String gxTv_SdtsdtMDef_Mdeftkn ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefkiltot ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefkilpro ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefkilreo ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefporc ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefmettot ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefmetpro ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefmetreo ;
   protected java.math.BigDecimal gxTv_SdtsdtMDef_Mdefmetpor ;
}

