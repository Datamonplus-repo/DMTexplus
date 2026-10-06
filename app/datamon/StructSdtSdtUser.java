package app.datamon ;
import com.genexus.*;

public final  class StructSdtSdtUser implements Cloneable, java.io.Serializable
{
   public StructSdtSdtUser( )
   {
      this( -1, new ModelContext( StructSdtSdtUser.class ));
   }

   public StructSdtSdtUser( int remoteHandle ,
                            ModelContext context )
   {
      gxTv_SdtSdtUser_User_image = "" ;
      gxTv_SdtSdtUser_User_image_gxi = "" ;
      gxTv_SdtSdtUser_User_name = "" ;
      gxTv_SdtSdtUser_User_profile = "" ;
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

   public String getUser_image( )
   {
      return gxTv_SdtSdtUser_User_image ;
   }

   public void setUser_image( String value )
   {
      gxTv_SdtSdtUser_N = (byte)(0) ;
      gxTv_SdtSdtUser_User_image = value ;
   }

   public String getUser_image_gxi( )
   {
      return gxTv_SdtSdtUser_User_image_gxi ;
   }

   public void setUser_image_gxi( String value )
   {
      gxTv_SdtSdtUser_N = (byte)(0) ;
      gxTv_SdtSdtUser_User_image_gxi = value ;
   }

   public String getUser_name( )
   {
      return gxTv_SdtSdtUser_User_name ;
   }

   public void setUser_name( String value )
   {
      gxTv_SdtSdtUser_N = (byte)(0) ;
      gxTv_SdtSdtUser_User_name = value ;
   }

   public String getUser_profile( )
   {
      return gxTv_SdtSdtUser_User_profile ;
   }

   public void setUser_profile( String value )
   {
      gxTv_SdtSdtUser_N = (byte)(0) ;
      gxTv_SdtSdtUser_User_profile = value ;
   }

   protected byte gxTv_SdtSdtUser_N ;
   protected String gxTv_SdtSdtUser_User_image_gxi ;
   protected String gxTv_SdtSdtUser_User_name ;
   protected String gxTv_SdtSdtUser_User_profile ;
   protected String gxTv_SdtSdtUser_User_image ;
}

