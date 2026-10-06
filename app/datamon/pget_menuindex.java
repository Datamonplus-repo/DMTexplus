package app.datamon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_menuindex extends GXProcedure
{
   public pget_menuindex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_menuindex.class ), "" );
   }

   public pget_menuindex( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM> executeUdp( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> aP0 ,
                                                                       long aP1 )
   {
      pget_menuindex.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> aP0 ,
                        long aP1 ,
                        GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> aP0 ,
                             long aP1 ,
                             GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM>[] aP2 )
   {
      pget_menuindex.this.AV10SDTMenu = aP0;
      pget_menuindex.this.AV8index = aP1;
      pget_menuindex.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9isItems = false ;
      AV19GXV1 = 1 ;
      while ( AV19GXV1 <= AV10SDTMenu.size() )
      {
         AV12SdtMenuItem = (app.datamon.SdtSdtMenu_ITEM)((app.datamon.SdtSdtMenu_ITEM)AV10SDTMenu.elementAt(-1+AV19GXV1));
         AV13SdtMenuItemAux = (app.datamon.SdtSdtMenuAux_ITEM)new app.datamon.SdtSdtMenuAux_ITEM(remoteHandle, context);
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Id( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Id() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Url( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Url() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Title( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Title() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Description( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Description() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Fontawsome( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Fontawsome() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Badge( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Badge() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Color( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Color() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Image( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Image() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Image_gxi( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Image_gxi() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Favorito( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Favorito() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Window( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Window() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Exibir_favorito( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Exibir_favorito() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Info( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Info() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Info_text( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Info_text() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_display( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Mnu_display() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_update( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Mnu_update() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_insert( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Mnu_insert() );
         AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_delete( AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Mnu_delete() );
         AV11SdtMenuAux.add(AV13SdtMenuItemAux, 0);
         AV20GXV2 = 1 ;
         while ( AV20GXV2 <= AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Items().size() )
         {
            AV15SdtMenuItems = (app.datamon.SdtSdtMenu_ITEM)((app.datamon.SdtSdtMenu_ITEM)AV12SdtMenuItem.getgxTv_SdtSdtMenu_ITEM_Items().elementAt(-1+AV20GXV2));
            AV9isItems = true ;
            AV13SdtMenuItemAux = (app.datamon.SdtSdtMenuAux_ITEM)new app.datamon.SdtSdtMenuAux_ITEM(remoteHandle, context);
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Id( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Id() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Url( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Url() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Title( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Title() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Description( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Description() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Fontawsome( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Fontawsome() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Badge( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Badge() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Color( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Color() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Image( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Image() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Image_gxi( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Image_gxi() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Favorito( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Favorito() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Window( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Window() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Exibir_favorito( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Exibir_favorito() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Info( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Info() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Info_text( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Info_text() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_display( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Mnu_display() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_update( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Mnu_update() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_insert( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Mnu_insert() );
            AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_delete( AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Mnu_delete() );
            AV11SdtMenuAux.add(AV13SdtMenuItemAux, 0);
            AV21GXV3 = 1 ;
            while ( AV21GXV3 <= AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Items().size() )
            {
               AV16SdtMenuNivelItems = (app.datamon.SdtSdtMenu_ITEM)((app.datamon.SdtSdtMenu_ITEM)AV15SdtMenuItems.getgxTv_SdtSdtMenu_ITEM_Items().elementAt(-1+AV21GXV3));
               AV9isItems = true ;
               AV13SdtMenuItemAux = (app.datamon.SdtSdtMenuAux_ITEM)new app.datamon.SdtSdtMenuAux_ITEM(remoteHandle, context);
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Id( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Id() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Url( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Url() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Title( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Title() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Description( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Description() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Fontawsome( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Fontawsome() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Badge( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Badge() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Color( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Color() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Image( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Image() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Image_gxi( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Image_gxi() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Favorito( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Favorito() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Window( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Window() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Exibir_favorito( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Exibir_favorito() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Info( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Info() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Info_text( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Info_text() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_display( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Mnu_display() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_update( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Mnu_update() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_insert( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Mnu_insert() );
               AV13SdtMenuItemAux.setgxTv_SdtSdtMenuAux_ITEM_Mnu_delete( AV16SdtMenuNivelItems.getgxTv_SdtSdtMenu_ITEM_Mnu_delete() );
               AV11SdtMenuAux.add(AV13SdtMenuItemAux, 0);
               AV21GXV3 = (int)(AV21GXV3+1) ;
            }
            AV20GXV2 = (int)(AV20GXV2+1) ;
         }
         AV19GXV1 = (int)(AV19GXV1+1) ;
      }
      AV14SdtMenuItemReturn = new GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM>(app.datamon.SdtSdtMenuAux_ITEM.class, "ITEM", "TexplusNET", remoteHandle) ;
      AV14SdtMenuItemReturn.add(((app.datamon.SdtSdtMenuAux_ITEM)AV11SdtMenuAux.elementAt(-1+(int)(AV8index))), 0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pget_menuindex.this.AV14SdtMenuItemReturn;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14SdtMenuItemReturn = new GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM>(app.datamon.SdtSdtMenuAux_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
      AV12SdtMenuItem = new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
      AV13SdtMenuItemAux = new app.datamon.SdtSdtMenuAux_ITEM(remoteHandle, context);
      AV11SdtMenuAux = new GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM>(app.datamon.SdtSdtMenuAux_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
      AV15SdtMenuItems = new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
      AV16SdtMenuNivelItems = new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV19GXV1 ;
   private int AV20GXV2 ;
   private int AV21GXV3 ;
   private long AV8index ;
   private boolean AV9isItems ;
   private GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM>[] aP2 ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> AV10SDTMenu ;
   private GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM> AV14SdtMenuItemReturn ;
   private GXBaseCollection<app.datamon.SdtSdtMenuAux_ITEM> AV11SdtMenuAux ;
   private app.datamon.SdtSdtMenu_ITEM AV12SdtMenuItem ;
   private app.datamon.SdtSdtMenu_ITEM AV15SdtMenuItems ;
   private app.datamon.SdtSdtMenu_ITEM AV16SdtMenuNivelItems ;
   private app.datamon.SdtSdtMenuAux_ITEM AV13SdtMenuItemAux ;
}

