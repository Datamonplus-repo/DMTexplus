package app ;
import com.genexus.*;

public final  class StructSdtSdtQRCode implements Cloneable, java.io.Serializable
{
   public StructSdtSdtQRCode( )
   {
      this( -1, new ModelContext( StructSdtSdtQRCode.class ));
   }

   public StructSdtSdtQRCode( int remoteHandle ,
                              ModelContext context )
   {
      gxTv_SdtSdtQRCode_Shorturl = "" ;
      gxTv_SdtSdtQRCode_Qr = "" ;
      gxTv_SdtSdtQRCode_Url = "" ;
      gxTv_SdtSdtQRCode_Title = "" ;
      gxTv_SdtSdtQRCode_Description = "" ;
      gxTv_SdtSdtQRCode_Creationdate = "" ;
      gxTv_SdtSdtQRCode_Image = "" ;
      gxTv_SdtSdtQRCode_Gps = "" ;
      gxTv_SdtSdtQRCode_Sms = "" ;
      gxTv_SdtSdtQRCode_Notify = "" ;
      gxTv_SdtSdtQRCode_Medium = "" ;
      gxTv_SdtSdtQRCode_Folder = "" ;
      gxTv_SdtSdtQRCode_Color = "" ;
      gxTv_SdtSdtQRCode_Bgcolor = "" ;
      gxTv_SdtSdtQRCode_Location_N = (byte)(1) ;
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

   public String getShorturl( )
   {
      return gxTv_SdtSdtQRCode_Shorturl ;
   }

   public void setShorturl( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Shorturl = value ;
   }

   public String getQr( )
   {
      return gxTv_SdtSdtQRCode_Qr ;
   }

   public void setQr( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Qr = value ;
   }

   public String getUrl( )
   {
      return gxTv_SdtSdtQRCode_Url ;
   }

   public void setUrl( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Url = value ;
   }

   public String getTitle( )
   {
      return gxTv_SdtSdtQRCode_Title ;
   }

   public void setTitle( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Title = value ;
   }

   public String getDescription( )
   {
      return gxTv_SdtSdtQRCode_Description ;
   }

   public void setDescription( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Description = value ;
   }

   public String getCreationdate( )
   {
      return gxTv_SdtSdtQRCode_Creationdate ;
   }

   public void setCreationdate( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Creationdate = value ;
   }

   public String getImage( )
   {
      return gxTv_SdtSdtQRCode_Image ;
   }

   public void setImage( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Image = value ;
   }

   public String getGps( )
   {
      return gxTv_SdtSdtQRCode_Gps ;
   }

   public void setGps( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Gps = value ;
   }

   public String getSms( )
   {
      return gxTv_SdtSdtQRCode_Sms ;
   }

   public void setSms( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Sms = value ;
   }

   public String getNotify( )
   {
      return gxTv_SdtSdtQRCode_Notify ;
   }

   public void setNotify( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Notify = value ;
   }

   public String getMedium( )
   {
      return gxTv_SdtSdtQRCode_Medium ;
   }

   public void setMedium( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Medium = value ;
   }

   public String getFolder( )
   {
      return gxTv_SdtSdtQRCode_Folder ;
   }

   public void setFolder( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Folder = value ;
   }

   public String getColor( )
   {
      return gxTv_SdtSdtQRCode_Color ;
   }

   public void setColor( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Color = value ;
   }

   public String getBgcolor( )
   {
      return gxTv_SdtSdtQRCode_Bgcolor ;
   }

   public void setBgcolor( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Bgcolor = value ;
   }

   public app.StructSdtSdtQRCodeLocation getLocation( )
   {
      return gxTv_SdtSdtQRCode_Location ;
   }

   public void setLocation( app.StructSdtSdtQRCodeLocation value )
   {
      gxTv_SdtSdtQRCode_Location_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Location = value;
   }

   protected byte gxTv_SdtSdtQRCode_Location_N ;
   protected byte gxTv_SdtSdtQRCode_N ;
   protected String gxTv_SdtSdtQRCode_Shorturl ;
   protected String gxTv_SdtSdtQRCode_Qr ;
   protected String gxTv_SdtSdtQRCode_Url ;
   protected String gxTv_SdtSdtQRCode_Title ;
   protected String gxTv_SdtSdtQRCode_Description ;
   protected String gxTv_SdtSdtQRCode_Creationdate ;
   protected String gxTv_SdtSdtQRCode_Image ;
   protected String gxTv_SdtSdtQRCode_Gps ;
   protected String gxTv_SdtSdtQRCode_Sms ;
   protected String gxTv_SdtSdtQRCode_Notify ;
   protected String gxTv_SdtSdtQRCode_Medium ;
   protected String gxTv_SdtSdtQRCode_Folder ;
   protected String gxTv_SdtSdtQRCode_Color ;
   protected String gxTv_SdtSdtQRCode_Bgcolor ;
   protected app.StructSdtSdtQRCodeLocation gxTv_SdtSdtQRCode_Location=null ;
}

