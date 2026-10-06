package app.datamon ;
import com.genexus.*;

public final  class StructSdtSdtProfileMenu_Menu implements Cloneable, java.io.Serializable
{
   public StructSdtSdtProfileMenu_Menu( )
   {
      this( -1, new ModelContext( StructSdtSdtProfileMenu_Menu.class ));
   }

   public StructSdtSdtProfileMenu_Menu( int remoteHandle ,
                                        ModelContext context )
   {
      gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle = "" ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon = "" ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl = "" ;
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

   public String getProfilemenutitle( )
   {
      return gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle ;
   }

   public void setProfilemenutitle( String value )
   {
      gxTv_SdtSdtProfileMenu_Menu_N = (byte)(0) ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle = value ;
   }

   public String getProfilemenuicon( )
   {
      return gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon ;
   }

   public void setProfilemenuicon( String value )
   {
      gxTv_SdtSdtProfileMenu_Menu_N = (byte)(0) ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon = value ;
   }

   public String getProfilemenuurl( )
   {
      return gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl ;
   }

   public void setProfilemenuurl( String value )
   {
      gxTv_SdtSdtProfileMenu_Menu_N = (byte)(0) ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl = value ;
   }

   protected byte gxTv_SdtSdtProfileMenu_Menu_N ;
   protected String gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle ;
   protected String gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon ;
   protected String gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl ;
}

