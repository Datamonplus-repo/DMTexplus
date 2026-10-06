package app ;
import com.genexus.*;

public final  class StructSdtGeneracionHDRs_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtGeneracionHDRs_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtGeneracionHDRs_SDT_Item.class ));
   }

   public StructSdtGeneracionHDRs_SDT_Item( int remoteHandle ,
                                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtGeneracionHDRs_SDT_Item_Disfec = cal.getTime() ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Clinom = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr = new java.math.BigDecimal(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod = "" ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N = (byte)(1) ;
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
      return gxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar = value ;
   }

   public int getDiscod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Discod ;
   }

   public void setDiscod( int value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Discod = value ;
   }

   public java.util.Date getDisfec( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disfec ;
   }

   public void setDisfec( java.util.Date value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disfec = value ;
   }

   public int getMaccod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Maccod ;
   }

   public void setMaccod( int value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Maccod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Clinom = value ;
   }

   public String getDisenccli( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli ;
   }

   public void setDisenccli( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli = value ;
   }

   public short getDispart( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Dispart ;
   }

   public void setDispart( short value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispart = value ;
   }

   public String getDisartcod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod ;
   }

   public void setDisartcod( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod = value ;
   }

   public String getDisartdsc( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc ;
   }

   public void setDisartdsc( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc = value ;
   }

   public String getDiscolnom( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom ;
   }

   public void setDiscolnom( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom = value ;
   }

   public int getDiscolnum( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Discolnum ;
   }

   public void setDiscolnum( int value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Discolnum = value ;
   }

   public byte getDistipcol( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Distipcol ;
   }

   public void setDistipcol( byte value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Distipcol = value ;
   }

   public String getDisnomcli( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli ;
   }

   public void setDisnomcli( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli = value ;
   }

   public String getDisunimed( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed ;
   }

   public void setDisunimed( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed = value ;
   }

   public short getDispiepie( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie ;
   }

   public void setDispiepie( short value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie = value ;
   }

   public java.math.BigDecimal getDispiekgm( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm ;
   }

   public void setDispiekgm( java.math.BigDecimal value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm = value ;
   }

   public java.math.BigDecimal getDispiemtr( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr ;
   }

   public void setDispiemtr( java.math.BigDecimal value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr = value ;
   }

   public String getMaqcoddis( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis ;
   }

   public void setMaqcoddis( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis = value ;
   }

   public String getDisusrcod( )
   {
      return gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod ;
   }

   public void setDisusrcod( String value )
   {
      gxTv_SdtGeneracionHDRs_SDT_Item_N = (byte)(0) ;
      gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod = value ;
   }

   protected byte gxTv_SdtGeneracionHDRs_SDT_Item_Distipcol ;
   protected byte gxTv_SdtGeneracionHDRs_SDT_Item_Disfec_N ;
   protected byte gxTv_SdtGeneracionHDRs_SDT_Item_N ;
   protected short gxTv_SdtGeneracionHDRs_SDT_Item_Dispart ;
   protected short gxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie ;
   protected int gxTv_SdtGeneracionHDRs_SDT_Item_Discod ;
   protected int gxTv_SdtGeneracionHDRs_SDT_Item_Maccod ;
   protected int gxTv_SdtGeneracionHDRs_SDT_Item_Clicod ;
   protected int gxTv_SdtGeneracionHDRs_SDT_Item_Discolnum ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Clinom ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disenccli ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disartcod ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Discolnom ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disunimed ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis ;
   protected String gxTv_SdtGeneracionHDRs_SDT_Item_Disusrcod ;
   protected boolean gxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar ;
   protected java.util.Date gxTv_SdtGeneracionHDRs_SDT_Item_Disfec ;
   protected java.math.BigDecimal gxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm ;
   protected java.math.BigDecimal gxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr ;
}

