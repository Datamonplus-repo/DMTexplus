package app ;
import com.genexus.*;

public final  class StructSdtSdtPiezasPedido implements Cloneable, java.io.Serializable
{
   public StructSdtSdtPiezasPedido( )
   {
      this( -1, new ModelContext( StructSdtSdtPiezasPedido.class ));
   }

   public StructSdtSdtPiezasPedido( int remoteHandle ,
                                    ModelContext context )
   {
      gxTv_SdtSdtPiezasPedido_Dispiecod = "" ;
      gxTv_SdtSdtPiezasPedido_Dispiekil = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiemet = new java.math.BigDecimal(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieloc = "" ;
      gxTv_SdtSdtPiezasPedido_Dispieidpz = "" ;
      gxTv_SdtSdtPiezasPedido_Dispiecodb = "" ;
      gxTv_SdtSdtPiezasPedido_Dispiepda = new java.math.BigDecimal(0) ;
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

   public String getDispiecod( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiecod ;
   }

   public void setDispiecod( String value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiecod = value ;
   }

   public java.math.BigDecimal getDispiekil( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiekil ;
   }

   public void setDispiekil( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiekil = value ;
   }

   public java.math.BigDecimal getDispiemet( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiemet ;
   }

   public void setDispiemet( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiemet = value ;
   }

   public String getDispieloc( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieloc ;
   }

   public void setDispieloc( String value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieloc = value ;
   }

   public short getDispieanc( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieanc ;
   }

   public void setDispieanc( short value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieanc = value ;
   }

   public byte getDispieest( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieest ;
   }

   public void setDispieest( byte value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieest = value ;
   }

   public String getDispieidpz( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieidpz ;
   }

   public void setDispieidpz( String value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieidpz = value ;
   }

   public String getDispiecodb( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiecodb ;
   }

   public void setDispiecodb( String value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiecodb = value ;
   }

   public short getDispieancc( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispieancc ;
   }

   public void setDispieancc( short value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispieancc = value ;
   }

   public java.math.BigDecimal getDispiepda( )
   {
      return gxTv_SdtSdtPiezasPedido_Dispiepda ;
   }

   public void setDispiepda( java.math.BigDecimal value )
   {
      gxTv_SdtSdtPiezasPedido_N = (byte)(0) ;
      gxTv_SdtSdtPiezasPedido_Dispiepda = value ;
   }

   protected byte gxTv_SdtSdtPiezasPedido_Dispieest ;
   protected byte gxTv_SdtSdtPiezasPedido_N ;
   protected short gxTv_SdtSdtPiezasPedido_Dispieanc ;
   protected short gxTv_SdtSdtPiezasPedido_Dispieancc ;
   protected String gxTv_SdtSdtPiezasPedido_Dispiecod ;
   protected String gxTv_SdtSdtPiezasPedido_Dispieloc ;
   protected String gxTv_SdtSdtPiezasPedido_Dispieidpz ;
   protected String gxTv_SdtSdtPiezasPedido_Dispiecodb ;
   protected java.math.BigDecimal gxTv_SdtSdtPiezasPedido_Dispiekil ;
   protected java.math.BigDecimal gxTv_SdtSdtPiezasPedido_Dispiemet ;
   protected java.math.BigDecimal gxTv_SdtSdtPiezasPedido_Dispiepda ;
}

