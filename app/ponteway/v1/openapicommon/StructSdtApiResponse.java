package app.ponteway.v1.openapicommon ;
import com.genexus.*;

public final  class StructSdtApiResponse implements Cloneable, java.io.Serializable
{
   public StructSdtApiResponse( )
   {
      this( -1, new ModelContext( StructSdtApiResponse.class ));
   }

   public StructSdtApiResponse( int remoteHandle ,
                                ModelContext context )
   {
      gxTv_SdtApiResponse_Content = "" ;
      gxTv_SdtApiResponse_Errormessage = "" ;
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

   public int getStatuscode( )
   {
      return gxTv_SdtApiResponse_Statuscode ;
   }

   public void setStatuscode( int value )
   {
      gxTv_SdtApiResponse_N = (byte)(0) ;
      gxTv_SdtApiResponse_Statuscode = value ;
   }

   public String getContent( )
   {
      return gxTv_SdtApiResponse_Content ;
   }

   public void setContent( String value )
   {
      gxTv_SdtApiResponse_N = (byte)(0) ;
      gxTv_SdtApiResponse_Content = value ;
   }

   public short getErrorcode( )
   {
      return gxTv_SdtApiResponse_Errorcode ;
   }

   public void setErrorcode( short value )
   {
      gxTv_SdtApiResponse_N = (byte)(0) ;
      gxTv_SdtApiResponse_Errorcode = value ;
   }

   public String getErrormessage( )
   {
      return gxTv_SdtApiResponse_Errormessage ;
   }

   public void setErrormessage( String value )
   {
      gxTv_SdtApiResponse_N = (byte)(0) ;
      gxTv_SdtApiResponse_Errormessage = value ;
   }

   protected byte gxTv_SdtApiResponse_N ;
   protected short gxTv_SdtApiResponse_Errorcode ;
   protected int gxTv_SdtApiResponse_Statuscode ;
   protected String gxTv_SdtApiResponse_Errormessage ;
   protected String gxTv_SdtApiResponse_Content ;
}

