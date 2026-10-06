package app.datamon ;
import com.genexus.*;

public final  class StructSdtSdtMenu_ITEM implements Cloneable, java.io.Serializable
{
   public StructSdtSdtMenu_ITEM( )
   {
      this( -1, new ModelContext( StructSdtSdtMenu_ITEM.class ));
   }

   public StructSdtSdtMenu_ITEM( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtSdtMenu_ITEM_Url = "" ;
      gxTv_SdtSdtMenu_ITEM_Title = "" ;
      gxTv_SdtSdtMenu_ITEM_Description = "" ;
      gxTv_SdtSdtMenu_ITEM_Fontawsome = "" ;
      gxTv_SdtSdtMenu_ITEM_Color = "" ;
      gxTv_SdtSdtMenu_ITEM_Image = "" ;
      gxTv_SdtSdtMenu_ITEM_Image_gxi = "" ;
      gxTv_SdtSdtMenu_ITEM_Info_text = "" ;
      gxTv_SdtSdtMenu_ITEM_Mnu_display = "" ;
      gxTv_SdtSdtMenu_ITEM_Mnu_update = "" ;
      gxTv_SdtSdtMenu_ITEM_Mnu_insert = "" ;
      gxTv_SdtSdtMenu_ITEM_Mnu_delete = "" ;
      gxTv_SdtSdtMenu_ITEM_Items_N = (byte)(1) ;
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

   public short getId( )
   {
      return gxTv_SdtSdtMenu_ITEM_Id ;
   }

   public void setId( short value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Id = value ;
   }

   public String getUrl( )
   {
      return gxTv_SdtSdtMenu_ITEM_Url ;
   }

   public void setUrl( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Url = value ;
   }

   public String getTitle( )
   {
      return gxTv_SdtSdtMenu_ITEM_Title ;
   }

   public void setTitle( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Title = value ;
   }

   public String getDescription( )
   {
      return gxTv_SdtSdtMenu_ITEM_Description ;
   }

   public void setDescription( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Description = value ;
   }

   public String getFontawsome( )
   {
      return gxTv_SdtSdtMenu_ITEM_Fontawsome ;
   }

   public void setFontawsome( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Fontawsome = value ;
   }

   public short getBadge( )
   {
      return gxTv_SdtSdtMenu_ITEM_Badge ;
   }

   public void setBadge( short value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Badge = value ;
   }

   public String getColor( )
   {
      return gxTv_SdtSdtMenu_ITEM_Color ;
   }

   public void setColor( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Color = value ;
   }

   public String getImage( )
   {
      return gxTv_SdtSdtMenu_ITEM_Image ;
   }

   public void setImage( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Image = value ;
   }

   public String getImage_gxi( )
   {
      return gxTv_SdtSdtMenu_ITEM_Image_gxi ;
   }

   public void setImage_gxi( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Image_gxi = value ;
   }

   public boolean getFavorito( )
   {
      return gxTv_SdtSdtMenu_ITEM_Favorito ;
   }

   public void setFavorito( boolean value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Favorito = value ;
   }

   public boolean getWindow( )
   {
      return gxTv_SdtSdtMenu_ITEM_Window ;
   }

   public void setWindow( boolean value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Window = value ;
   }

   public boolean getExibir_favorito( )
   {
      return gxTv_SdtSdtMenu_ITEM_Exibir_favorito ;
   }

   public void setExibir_favorito( boolean value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Exibir_favorito = value ;
   }

   public boolean getInfo( )
   {
      return gxTv_SdtSdtMenu_ITEM_Info ;
   }

   public void setInfo( boolean value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Info = value ;
   }

   public String getInfo_text( )
   {
      return gxTv_SdtSdtMenu_ITEM_Info_text ;
   }

   public void setInfo_text( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Info_text = value ;
   }

   public String getMnu_display( )
   {
      return gxTv_SdtSdtMenu_ITEM_Mnu_display ;
   }

   public void setMnu_display( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Mnu_display = value ;
   }

   public String getMnu_update( )
   {
      return gxTv_SdtSdtMenu_ITEM_Mnu_update ;
   }

   public void setMnu_update( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Mnu_update = value ;
   }

   public String getMnu_insert( )
   {
      return gxTv_SdtSdtMenu_ITEM_Mnu_insert ;
   }

   public void setMnu_insert( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Mnu_insert = value ;
   }

   public String getMnu_delete( )
   {
      return gxTv_SdtSdtMenu_ITEM_Mnu_delete ;
   }

   public void setMnu_delete( String value )
   {
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Mnu_delete = value ;
   }

   public java.util.Vector<app.datamon.StructSdtSdtMenu_ITEM> getItems( )
   {
      return gxTv_SdtSdtMenu_ITEM_Items ;
   }

   public void setItems( java.util.Vector<app.datamon.StructSdtSdtMenu_ITEM> value )
   {
      gxTv_SdtSdtMenu_ITEM_Items_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_N = (byte)(0) ;
      gxTv_SdtSdtMenu_ITEM_Items = value ;
   }

   protected byte gxTv_SdtSdtMenu_ITEM_Items_N ;
   protected byte gxTv_SdtSdtMenu_ITEM_N ;
   protected short gxTv_SdtSdtMenu_ITEM_Id ;
   protected short gxTv_SdtSdtMenu_ITEM_Badge ;
   protected String gxTv_SdtSdtMenu_ITEM_Mnu_display ;
   protected String gxTv_SdtSdtMenu_ITEM_Mnu_update ;
   protected String gxTv_SdtSdtMenu_ITEM_Mnu_insert ;
   protected String gxTv_SdtSdtMenu_ITEM_Mnu_delete ;
   protected boolean gxTv_SdtSdtMenu_ITEM_Favorito ;
   protected boolean gxTv_SdtSdtMenu_ITEM_Window ;
   protected boolean gxTv_SdtSdtMenu_ITEM_Exibir_favorito ;
   protected boolean gxTv_SdtSdtMenu_ITEM_Info ;
   protected String gxTv_SdtSdtMenu_ITEM_Url ;
   protected String gxTv_SdtSdtMenu_ITEM_Title ;
   protected String gxTv_SdtSdtMenu_ITEM_Description ;
   protected String gxTv_SdtSdtMenu_ITEM_Fontawsome ;
   protected String gxTv_SdtSdtMenu_ITEM_Color ;
   protected String gxTv_SdtSdtMenu_ITEM_Image_gxi ;
   protected String gxTv_SdtSdtMenu_ITEM_Info_text ;
   protected String gxTv_SdtSdtMenu_ITEM_Image ;
   protected java.util.Vector<app.datamon.StructSdtSdtMenu_ITEM> gxTv_SdtSdtMenu_ITEM_Items=null ;
}

