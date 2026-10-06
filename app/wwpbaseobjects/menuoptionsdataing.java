package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class menuoptionsdataing extends GXProcedure
{
   public menuoptionsdataing( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( menuoptionsdataing.class ), "" );
   }

   public menuoptionsdataing( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> executeUdp( )
   {
      menuoptionsdataing.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>[] aP0 )
   {
      menuoptionsdataing.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV5id = (short)(0) ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      menuoptionsdataing.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXt_char1 = AV8Emprcod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      menuoptionsdataing.this.GXt_char1 = GXv_char2[0] ;
      AV8Emprcod = GXt_char1 ;
      Gxm1dvelop_menu = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1dvelop_menu, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Link( formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {})  );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "fa fa-home", "") );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Iconclass( "menu-icon fas fa-home" );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "  WWP_HomeTitle", "") );
      Gxm1dvelop_menu = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm2rootcol.add(Gxm1dvelop_menu, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Link( "" );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Iconclass( "menu-icon fas fa-tasks" );
      Gxm1dvelop_menu.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( " Ingenieria (4.0)", "") );
      Gxm3dvelop_menu_subitems = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm1dvelop_menu.getgxTv_SdtDVelop_Menu_Item_Subitems().add(Gxm3dvelop_menu_subitems, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm3dvelop_menu_subitems.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm3dvelop_menu_subitems.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm3dvelop_menu_subitems.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm3dvelop_menu_subitems.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "menu-icon fas fa-pie-chart", "") );
      Gxm3dvelop_menu_subitems.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "  Ingenieria (4.0)", "") );
      Gxm3dvelop_menu_subitems.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( "" );
      Gxm4dvelop_menu_subitems_subitems = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm3dvelop_menu_subitems.getgxTv_SdtDVelop_Menu_Item_Subitems().add(Gxm4dvelop_menu_subitems_subitems, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Link( formatLink("app.ingenieria.capfm_pww", new String[] {}, new String[] {})  );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "fas fa-circle", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "  Máquinas y sus parámetros", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( "" );
      Gxm4dvelop_menu_subitems_subitems = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm3dvelop_menu_subitems.getgxTv_SdtDVelop_Menu_Item_Subitems().add(Gxm4dvelop_menu_subitems_subitems, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Link( formatLink("app.ingenieria.menvww", new String[] {}, new String[] {})  );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "fas fa-circle", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "  Envíos datos a máquinas", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( "" );
      Gxm4dvelop_menu_subitems_subitems = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm3dvelop_menu_subitems.getgxTv_SdtDVelop_Menu_Item_Subitems().add(Gxm4dvelop_menu_subitems_subitems, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Link( formatLink("app.ingenieria.mrec_simular", new String[] {}, new String[] {})  );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "fas fa-circle", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "  Simular recepción de datos", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( "" );
      Gxm4dvelop_menu_subitems_subitems = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm3dvelop_menu_subitems.getgxTv_SdtDVelop_Menu_Item_Subitems().add(Gxm4dvelop_menu_subitems_subitems, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Link( formatLink("app.ingenieria.mrec_evaluar", new String[] {}, new String[] {})  );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "fas fa-circle", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "  Evaluar recepción de datos", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( "" );
      Gxm4dvelop_menu_subitems_subitems = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm3dvelop_menu_subitems.getgxTv_SdtDVelop_Menu_Item_Subitems().add(Gxm4dvelop_menu_subitems_subitems, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Link( formatLink("app.ingenieria.mrec_alerta", new String[] {}, new String[] {})  );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "fas fa-circle", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "  Alertas ", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( "" );
      Gxm4dvelop_menu_subitems_subitems = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm3dvelop_menu_subitems.getgxTv_SdtDVelop_Menu_Item_Subitems().add(Gxm4dvelop_menu_subitems_subitems, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Link( formatLink("app.ingenieria.mrec_analisis", new String[] {}, new String[] {})  );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "fas fa-circle", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "  Análisis", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( "" );
      Gxm4dvelop_menu_subitems_subitems = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm3dvelop_menu_subitems.getgxTv_SdtDVelop_Menu_Item_Subitems().add(Gxm4dvelop_menu_subitems_subitems, 0);
      AV5id = (short)(AV5id+1) ;
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.str( AV5id, 4, 0) );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Link( formatLink("app.ingenieria.incfgww", new String[] {}, new String[] {})  );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "fa fa-cog", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "  Configuración", "") );
      Gxm4dvelop_menu_subitems_subitems.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = menuoptionsdataing.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>(app.wwpbaseobjects.SdtDVelop_Menu_Item.class, "Item", "TexplusNET", remoteHandle);
      AV7Station = "" ;
      AV8Emprcod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      Gxm1dvelop_menu = new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm3dvelop_menu_subitems = new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      Gxm4dvelop_menu_subitems_subitems = new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV5id ;
   private short Gx_err ;
   private String AV7Station ;
   private String AV8Emprcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>[] aP0 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> Gxm2rootcol ;
   private app.wwpbaseobjects.SdtDVelop_Menu_Item Gxm1dvelop_menu ;
   private app.wwpbaseobjects.SdtDVelop_Menu_Item Gxm3dvelop_menu_subitems ;
   private app.wwpbaseobjects.SdtDVelop_Menu_Item Gxm4dvelop_menu_subitems_subitems ;
}

