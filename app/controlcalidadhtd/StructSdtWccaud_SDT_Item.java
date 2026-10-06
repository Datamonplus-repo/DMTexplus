package app.controlcalidadhtd ;
import com.genexus.*;

public final  class StructSdtWccaud_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtWccaud_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtWccaud_SDT_Item.class ));
   }

   public StructSdtWccaud_SDT_Item( int remoteHandle ,
                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtWccaud_SDT_Item_Barcodpar = "" ;
      gxTv_SdtWccaud_SDT_Item_Procod = "" ;
      gxTv_SdtWccaud_SDT_Item_Prodsc = "" ;
      gxTv_SdtWccaud_SDT_Item_Fascod = "" ;
      gxTv_SdtWccaud_SDT_Item_Fasdsc = "" ;
      gxTv_SdtWccaud_SDT_Item_Ccfch = cal.getTime() ;
      gxTv_SdtWccaud_SDT_Item_Cctdsc = "" ;
      gxTv_SdtWccaud_SDT_Item_Openom = "" ;
      gxTv_SdtWccaud_SDT_Item_Barser = "" ;
      gxTv_SdtWccaud_SDT_Item_Barcolnom = "" ;
      gxTv_SdtWccaud_SDT_Item_Barenccli = "" ;
      gxTv_SdtWccaud_SDT_Item_Ccfch_N = (byte)(1) ;
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
      return gxTv_SdtWccaud_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Seleccionar = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barcodpar = value ;
   }

   public String getProcod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Procod ;
   }

   public void setProcod( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Procod = value ;
   }

   public String getProdsc( )
   {
      return gxTv_SdtWccaud_SDT_Item_Prodsc ;
   }

   public void setProdsc( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Prodsc = value ;
   }

   public short getBarordlin( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barordlin ;
   }

   public void setBarordlin( short value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barordlin = value ;
   }

   public String getFascod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Fascod ;
   }

   public void setFascod( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Fascod = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtWccaud_SDT_Item_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Fasdsc = value ;
   }

   public java.util.Date getCcfch( )
   {
      return gxTv_SdtWccaud_SDT_Item_Ccfch ;
   }

   public void setCcfch( java.util.Date value )
   {
      gxTv_SdtWccaud_SDT_Item_Ccfch_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Ccfch = value ;
   }

   public int getCctcod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Cctcod ;
   }

   public void setCctcod( int value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Cctcod = value ;
   }

   public String getCctdsc( )
   {
      return gxTv_SdtWccaud_SDT_Item_Cctdsc ;
   }

   public void setCctdsc( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Cctdsc = value ;
   }

   public int getCcopecod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Ccopecod ;
   }

   public void setCcopecod( int value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Ccopecod = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtWccaud_SDT_Item_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Openom = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barser = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barcolnom = value ;
   }

   public String getBarenccli( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barenccli ;
   }

   public void setBarenccli( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barenccli = value ;
   }

   public short getBartipart( )
   {
      return gxTv_SdtWccaud_SDT_Item_Bartipart ;
   }

   public void setBartipart( short value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Bartipart = value ;
   }

   public short getBargraaca( )
   {
      return gxTv_SdtWccaud_SDT_Item_Bargraaca ;
   }

   public void setBargraaca( short value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Bargraaca = value ;
   }

   public short getBarancaca1( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barancaca1 ;
   }

   public void setBarancaca1( short value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barancaca1 = value ;
   }

   public byte getCcfok( )
   {
      return gxTv_SdtWccaud_SDT_Item_Ccfok ;
   }

   public void setCcfok( byte value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Ccfok = value ;
   }

   protected byte gxTv_SdtWccaud_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtWccaud_SDT_Item_Ccfok ;
   protected byte gxTv_SdtWccaud_SDT_Item_Ccfch_N ;
   protected byte gxTv_SdtWccaud_SDT_Item_N ;
   protected short gxTv_SdtWccaud_SDT_Item_Barordlin ;
   protected short gxTv_SdtWccaud_SDT_Item_Bartipart ;
   protected short gxTv_SdtWccaud_SDT_Item_Bargraaca ;
   protected short gxTv_SdtWccaud_SDT_Item_Barancaca1 ;
   protected int gxTv_SdtWccaud_SDT_Item_Barcod ;
   protected int gxTv_SdtWccaud_SDT_Item_Cctcod ;
   protected int gxTv_SdtWccaud_SDT_Item_Ccopecod ;
   protected String gxTv_SdtWccaud_SDT_Item_Barcodpar ;
   protected String gxTv_SdtWccaud_SDT_Item_Procod ;
   protected String gxTv_SdtWccaud_SDT_Item_Prodsc ;
   protected String gxTv_SdtWccaud_SDT_Item_Fascod ;
   protected String gxTv_SdtWccaud_SDT_Item_Fasdsc ;
   protected String gxTv_SdtWccaud_SDT_Item_Cctdsc ;
   protected String gxTv_SdtWccaud_SDT_Item_Openom ;
   protected String gxTv_SdtWccaud_SDT_Item_Barser ;
   protected String gxTv_SdtWccaud_SDT_Item_Barcolnom ;
   protected String gxTv_SdtWccaud_SDT_Item_Barenccli ;
   protected boolean gxTv_SdtWccaud_SDT_Item_Seleccionar ;
   protected java.util.Date gxTv_SdtWccaud_SDT_Item_Ccfch ;
}

