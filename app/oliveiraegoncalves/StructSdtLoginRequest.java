package app.oliveiraegoncalves ;
import com.genexus.*;

public final  class StructSdtLoginRequest implements Cloneable, java.io.Serializable
{
   public StructSdtLoginRequest( )
   {
      this( -1, new ModelContext( StructSdtLoginRequest.class ));
   }

   public StructSdtLoginRequest( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtLoginRequest_Username = "" ;
      gxTv_SdtLoginRequest_Password = "" ;
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

   public String getUsername( )
   {
      return gxTv_SdtLoginRequest_Username ;
   }

   public void setUsername( String value )
   {
      gxTv_SdtLoginRequest_N = (byte)(0) ;
      gxTv_SdtLoginRequest_Username = value ;
   }

   public String getPassword( )
   {
      return gxTv_SdtLoginRequest_Password ;
   }

   public void setPassword( String value )
   {
      gxTv_SdtLoginRequest_N = (byte)(0) ;
      gxTv_SdtLoginRequest_Password = value ;
   }

   protected byte gxTv_SdtLoginRequest_N ;
   protected String gxTv_SdtLoginRequest_Username ;
   protected String gxTv_SdtLoginRequest_Password ;
}

