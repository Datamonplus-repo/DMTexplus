package app.datamon ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getmenu extends GXProcedure
{
   public getmenu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getmenu.class ), "" );
   }

   public getmenu( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> executeUdp( )
   {
      getmenu.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>[] aP0 )
   {
      getmenu.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gxm1sdtmenu = (app.datamon.SdtSdtMenu_ITEM)new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sdtmenu, 0);
      Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Id( (short)(1) );
      Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Url( "#" );
      Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Title( httpContext.getMessage( "SISTEMA", "") );
      Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Description( httpContext.getMessage( "SISTEMA B", "") );
      Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Fontawsome( "" );
      Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Window( false );
      Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Exibir_favorito( false );
      Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Info( false );
      Gxm1sdtmenu.setgxTv_SdtSdtMenu_ITEM_Info_text( "" );
      Gxm3sdtmenu_items = (app.datamon.SdtSdtMenu_ITEM)new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
      Gxm1sdtmenu.getgxTv_SdtSdtMenu_ITEM_Items().add(Gxm3sdtmenu_items, 0);
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Id( (short)(2) );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Url( httpContext.getMessage( "main.aspx", "") );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Title( httpContext.getMessage( "MAIN", "") );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Description( httpContext.getMessage( "MAIN", "") );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Fontawsome( "" );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Window( true );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Info( true );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Info_text( httpContext.getMessage( "fa fa-circle-info", "") );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Exibir_favorito( false );
      GXt_objcol_SdtSdtMenu_ITEM1 = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>() ;
      GXv_objcol_SdtSdtMenu_ITEM2[0] = GXt_objcol_SdtSdtMenu_ITEM1 ;
      new app.datamon.pget_menufake(remoteHandle, context).execute( GXv_objcol_SdtSdtMenu_ITEM2) ;
      GXt_objcol_SdtSdtMenu_ITEM1 = GXv_objcol_SdtSdtMenu_ITEM2[0] ;
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Items( GXt_objcol_SdtSdtMenu_ITEM1 );
      Gxm3sdtmenu_items = (app.datamon.SdtSdtMenu_ITEM)new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
      Gxm1sdtmenu.getgxTv_SdtSdtMenu_ITEM_Items().add(Gxm3sdtmenu_items, 0);
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Id( (short)(3) );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Url( httpContext.getMessage( "MENU 2", "") );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Title( httpContext.getMessage( "Usuario", "") );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Description( httpContext.getMessage( "Usuario", "") );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Fontawsome( "" );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Window( true );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Exibir_favorito( false );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Info( false );
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Info_text( "" );
      GXt_objcol_SdtSdtMenu_ITEM1 = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>() ;
      GXv_objcol_SdtSdtMenu_ITEM2[0] = GXt_objcol_SdtSdtMenu_ITEM1 ;
      new app.datamon.pget_menufake(remoteHandle, context).execute( GXv_objcol_SdtSdtMenu_ITEM2) ;
      GXt_objcol_SdtSdtMenu_ITEM1 = GXv_objcol_SdtSdtMenu_ITEM2[0] ;
      Gxm3sdtmenu_items.setgxTv_SdtSdtMenu_ITEM_Items( GXt_objcol_SdtSdtMenu_ITEM1 );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = getmenu.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>(app.datamon.SdtSdtMenu_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
      Gxm1sdtmenu = new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
      Gxm3sdtmenu_items = new app.datamon.SdtSdtMenu_ITEM(remoteHandle, context);
      GXt_objcol_SdtSdtMenu_ITEM1 = new GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>(app.datamon.SdtSdtMenu_ITEM.class, "ITEM", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSdtMenu_ITEM2 = new GXBaseCollection[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM>[] aP0 ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> Gxm2rootcol ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> GXt_objcol_SdtSdtMenu_ITEM1 ;
   private GXBaseCollection<app.datamon.SdtSdtMenu_ITEM> GXv_objcol_SdtSdtMenu_ITEM2[] ;
   private app.datamon.SdtSdtMenu_ITEM Gxm1sdtmenu ;
   private app.datamon.SdtSdtMenu_ITEM Gxm3sdtmenu_items ;
}

