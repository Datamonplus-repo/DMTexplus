package app.devops ;
import com.genexus.*;

public final  class StructSdtResponseHeartBeat implements Cloneable, java.io.Serializable
{
   public StructSdtResponseHeartBeat( )
   {
      this( -1, new ModelContext( StructSdtResponseHeartBeat.class ));
   }

   public StructSdtResponseHeartBeat( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtResponseHeartBeat_Message = "" ;
      gxTv_SdtResponseHeartBeat_Error = "" ;
      gxTv_SdtResponseHeartBeat_Statuscode = new java.math.BigDecimal(0) ;
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

   public String getMessage( )
   {
      return gxTv_SdtResponseHeartBeat_Message ;
   }

   public void setMessage( String value )
   {
      gxTv_SdtResponseHeartBeat_N = (byte)(0) ;
      gxTv_SdtResponseHeartBeat_Message = value ;
   }

   public String getError( )
   {
      return gxTv_SdtResponseHeartBeat_Error ;
   }

   public void setError( String value )
   {
      gxTv_SdtResponseHeartBeat_N = (byte)(0) ;
      gxTv_SdtResponseHeartBeat_Error = value ;
   }

   public java.math.BigDecimal getStatuscode( )
   {
      return gxTv_SdtResponseHeartBeat_Statuscode ;
   }

   public void setStatuscode( java.math.BigDecimal value )
   {
      gxTv_SdtResponseHeartBeat_N = (byte)(0) ;
      gxTv_SdtResponseHeartBeat_Statuscode = value ;
   }

   protected byte gxTv_SdtResponseHeartBeat_N ;
   protected String gxTv_SdtResponseHeartBeat_Message ;
   protected String gxTv_SdtResponseHeartBeat_Error ;
   protected java.math.BigDecimal gxTv_SdtResponseHeartBeat_Statuscode ;
}

