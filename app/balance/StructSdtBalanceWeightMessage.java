package app.balance ;
import com.genexus.*;

public final  class StructSdtBalanceWeightMessage implements Cloneable, java.io.Serializable
{
   public StructSdtBalanceWeightMessage( )
   {
      this( -1, new ModelContext( StructSdtBalanceWeightMessage.class ));
   }

   public StructSdtBalanceWeightMessage( int remoteHandle ,
                                         ModelContext context )
   {
      gxTv_SdtBalanceWeightMessage_Type = "" ;
      gxTv_SdtBalanceWeightMessage_Device_id = "" ;
      gxTv_SdtBalanceWeightMessage_Weight = new java.math.BigDecimal(0) ;
      gxTv_SdtBalanceWeightMessage_Unit = "" ;
      gxTv_SdtBalanceWeightMessage_Raw = "" ;
      gxTv_SdtBalanceWeightMessage_Timestamp = new java.math.BigDecimal(0) ;
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

   public String getType( )
   {
      return gxTv_SdtBalanceWeightMessage_Type ;
   }

   public void setType( String value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Type = value ;
   }

   public String getDevice_id( )
   {
      return gxTv_SdtBalanceWeightMessage_Device_id ;
   }

   public void setDevice_id( String value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Device_id = value ;
   }

   public java.math.BigDecimal getWeight( )
   {
      return gxTv_SdtBalanceWeightMessage_Weight ;
   }

   public void setWeight( java.math.BigDecimal value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Weight = value ;
   }

   public String getUnit( )
   {
      return gxTv_SdtBalanceWeightMessage_Unit ;
   }

   public void setUnit( String value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Unit = value ;
   }

   public boolean getStable( )
   {
      return gxTv_SdtBalanceWeightMessage_Stable ;
   }

   public void setStable( boolean value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Stable = value ;
   }

   public String getRaw( )
   {
      return gxTv_SdtBalanceWeightMessage_Raw ;
   }

   public void setRaw( String value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Raw = value ;
   }

   public java.math.BigDecimal getTimestamp( )
   {
      return gxTv_SdtBalanceWeightMessage_Timestamp ;
   }

   public void setTimestamp( java.math.BigDecimal value )
   {
      gxTv_SdtBalanceWeightMessage_N = (byte)(0) ;
      gxTv_SdtBalanceWeightMessage_Timestamp = value ;
   }

   protected byte gxTv_SdtBalanceWeightMessage_N ;
   protected boolean gxTv_SdtBalanceWeightMessage_Stable ;
   protected String gxTv_SdtBalanceWeightMessage_Type ;
   protected String gxTv_SdtBalanceWeightMessage_Device_id ;
   protected String gxTv_SdtBalanceWeightMessage_Unit ;
   protected String gxTv_SdtBalanceWeightMessage_Raw ;
   protected java.math.BigDecimal gxTv_SdtBalanceWeightMessage_Weight ;
   protected java.math.BigDecimal gxTv_SdtBalanceWeightMessage_Timestamp ;
}

