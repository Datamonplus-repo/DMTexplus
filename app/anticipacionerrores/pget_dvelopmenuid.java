package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_dvelopmenuid extends GXProcedure
{
   public pget_dvelopmenuid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_dvelopmenuid.class ), "" );
   }

   public pget_dvelopmenuid( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> executeUdp( String aP0 )
   {
      pget_dvelopmenuid.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>[] aP1 )
   {
      pget_dvelopmenuid.this.AV14UsurCod = aP0;
      pget_dvelopmenuid.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15id = (long)(AV15id+1) ;
      AV8DVelop_Menu = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>(app.wwpbaseobjects.SdtDVelop_Menu_Item.class, "Item", "TexplusNET", remoteHandle) ;
      AV9DVelop_MenuItem = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.trim( GXutil.str( AV15id, 15, 0)) );
      AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
      AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Link( formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {})  );
      AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
      AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Iconclass( httpContext.getMessage( "menu-icon fa fa-home", "") );
      AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Caption( httpContext.getMessage( "WWP_HomeTitle", "") );
      AV8DVelop_Menu.add(AV9DVelop_MenuItem, 0);
      /* Using cursor P0AUP2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A945MnuId = P0AUP2_A945MnuId[0] ;
         AV17mNUiD = A945MnuId ;
         AV15id = (long)(AV15id+1) ;
         AV9DVelop_MenuItem = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.trim( GXutil.str( AV15id, 15, 0)) );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Link( "" );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Iconclass( "menu-icon fas fa-tasks" );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Caption( "Texplus WEB" );
         AV13MnuPgm = A947MnuPgm ;
         /* Execute user subroutine: 'MENU CAB' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P0AUP3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A945MnuId = P0AUP3_A945MnuId[0] ;
         AV17mNUiD = A945MnuId ;
         AV15id = (long)(AV15id+1) ;
         AV9DVelop_MenuItem = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.trim( GXutil.str( AV15id, 15, 0)) );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Tooltip( "" );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Link( "" );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Linktarget( "" );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Iconclass( "menu-icon fas fa-tasks" );
         AV9DVelop_MenuItem.setgxTv_SdtDVelop_Menu_Item_Caption( "Innovacion" );
         /* Execute user subroutine: 'MENU CAB' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV16HTTPResponse.addHeader(httpContext.getMessage( "Access-Control-Allow-Origin", ""), "*");
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV16HTTPResponse.addHeader(httpContext.getMessage( "Access-Control-Allow-Methods", ""), httpContext.getMessage( "GET, POST, OPTIONS", ""));
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV16HTTPResponse.addHeader(httpContext.getMessage( "Access-Control-Allow-Headers", ""), httpContext.getMessage( "Origin, Content-Type, Accept", ""));
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'MENU CAB' Routine */
      returnInSub = false ;
      /* Using cursor P0AUP4 */
      pr_default.execute(2, new Object[] {AV17mNUiD});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14294MnuSit = P0AUP4_A14294MnuSit[0] ;
         A945MnuId = P0AUP4_A945MnuId[0] ;
         A14293MnuIcon = P0AUP4_A14293MnuIcon[0] ;
         n14293MnuIcon = P0AUP4_n14293MnuIcon[0] ;
         A949MnuPgmTxt = P0AUP4_A949MnuPgmTxt[0] ;
         A947MnuPgm = P0AUP4_A947MnuPgm[0] ;
         A946MnuOp = P0AUP4_A946MnuOp[0] ;
         GXv_char1[0] = A945MnuId ;
         GXv_int2[0] = A946MnuOp ;
         GXv_char3[0] = AV14UsurCod ;
         if ( GXutil.strcmp(new app.ppermisos(remoteHandle, context).executeUdp( GXv_char1, GXv_int2, GXv_char3), "S") == 0 )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         pget_dvelopmenuid.this.A945MnuId = GXv_char1[0] ;
         pget_dvelopmenuid.this.A946MnuOp = GXv_int2[0] ;
         pget_dvelopmenuid.this.AV14UsurCod = GXv_char3[0] ;
         if ( Cond_result )
         {
            AV15id = (long)(AV15id+1) ;
            AV10DVelop_MenuSubItem = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
            AV10DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.trim( GXutil.str( AV15id, 15, 0)) );
            AV10DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Iconclass( "menu-icon "+A14293MnuIcon );
            AV10DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Caption( GXutil.upper( GXutil.trim( A949MnuPgmTxt)) );
            AV13MnuPgm = A947MnuPgm ;
            /* Execute user subroutine: 'SUBMENU' */
            S124 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            AV9DVelop_MenuItem.getgxTv_SdtDVelop_Menu_Item_Subitems().add(AV10DVelop_MenuSubItem, 0);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV8DVelop_Menu.add(AV9DVelop_MenuItem, 0);
   }

   public void S124( )
   {
      /* 'SUBMENU' Routine */
      returnInSub = false ;
      /* Using cursor P0AUP5 */
      pr_default.execute(3, new Object[] {AV13MnuPgm});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14294MnuSit = P0AUP5_A14294MnuSit[0] ;
         A945MnuId = P0AUP5_A945MnuId[0] ;
         A948MnuPgmTpo = P0AUP5_A948MnuPgmTpo[0] ;
         A949MnuPgmTxt = P0AUP5_A949MnuPgmTxt[0] ;
         A14286MnuPgmWeb = P0AUP5_A14286MnuPgmWeb[0] ;
         A14293MnuIcon = P0AUP5_A14293MnuIcon[0] ;
         n14293MnuIcon = P0AUP5_n14293MnuIcon[0] ;
         A947MnuPgm = P0AUP5_A947MnuPgm[0] ;
         A946MnuOp = P0AUP5_A946MnuOp[0] ;
         GXv_char3[0] = A945MnuId ;
         GXv_int2[0] = A946MnuOp ;
         GXv_char1[0] = AV14UsurCod ;
         if ( GXutil.strcmp(new app.ppermisos(remoteHandle, context).executeUdp( GXv_char3, GXv_int2, GXv_char1), "S") == 0 )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         pget_dvelopmenuid.this.A945MnuId = GXv_char3[0] ;
         pget_dvelopmenuid.this.A946MnuOp = GXv_int2[0] ;
         pget_dvelopmenuid.this.AV14UsurCod = GXv_char1[0] ;
         if ( Cond_result )
         {
            if ( GXutil.strcmp(A948MnuPgmTpo, "N") == 0 )
            {
               AV15id = (long)(AV15id+1) ;
               AV11DVelop_MenuSubItemLevel = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.trim( GXutil.str( AV15id, 15, 0)) );
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Tooltip( GXutil.trim( A949MnuPgmTxt) );
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Link( ((GXutil.strcmp("", A14286MnuPgmWeb)==0) ? ((GXutil.strcmp(AV14UsurCod, "ADMIN")==0) ? formatLink("app.menus.mnuop", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A945MnuId))}, new String[] {"Mode","MnuId"})  : "#") : GXutil.lower( GXutil.trim( A14286MnuPgmWeb))+"?"+GXutil.trim( GXutil.str( AV15id, 15, 0))) );
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Iconclass( A14293MnuIcon );
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Caption( " "+GXutil.upper( GXutil.trim( A949MnuPgmTxt)) );
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( GXutil.trim( A949MnuPgmTxt) );
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Additionaldata( "" );
               AV10DVelop_MenuSubItem.getgxTv_SdtDVelop_Menu_Item_Subitems().add(AV11DVelop_MenuSubItemLevel, 0);
            }
            else if ( GXutil.strcmp(A948MnuPgmTpo, "S") == 0 )
            {
               AV15id = (long)(AV15id+1) ;
               AV11DVelop_MenuSubItemLevel = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.trim( GXutil.str( AV15id, 15, 0)) );
               if ( ! (GXutil.strcmp("", A14293MnuIcon)==0) )
               {
                  AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Iconclass( "menu-icon "+A14293MnuIcon );
               }
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Caption( GXutil.upper( GXutil.trim( A949MnuPgmTxt)) );
               GXt_objcol_SdtDVelop_Menu_Item4 = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>() ;
               GXv_char3[0] = A948MnuPgmTpo ;
               GXv_int5[0] = AV15id ;
               GXv_objcol_SdtDVelop_Menu_Item6[0] = GXt_objcol_SdtDVelop_Menu_Item4 ;
               new app.pget_dvelopsubmenu(remoteHandle, context).execute( A947MnuPgm, GXv_char3, AV14UsurCod, GXv_int5, GXv_objcol_SdtDVelop_Menu_Item6) ;
               pget_dvelopmenuid.this.A948MnuPgmTpo = GXv_char3[0] ;
               pget_dvelopmenuid.this.AV15id = GXv_int5[0] ;
               GXt_objcol_SdtDVelop_Menu_Item4 = GXv_objcol_SdtDVelop_Menu_Item6[0] ;
               AV11DVelop_MenuSubItemLevel.setgxTv_SdtDVelop_Menu_Item_Subitems( GXt_objcol_SdtDVelop_Menu_Item4 );
               AV10DVelop_MenuSubItem.getgxTv_SdtDVelop_Menu_Item_Subitems().add(AV11DVelop_MenuSubItemLevel, 0);
            }
            AV12LastMnuPgmTpo = A948MnuPgmTpo ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP1[0] = pget_dvelopmenuid.this.AV8DVelop_Menu;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8DVelop_Menu = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>(app.wwpbaseobjects.SdtDVelop_Menu_Item.class, "Item", "TexplusNET", remoteHandle);
      AV9DVelop_MenuItem = new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      scmdbuf = "" ;
      P0AUP2_A945MnuId = new String[] {""} ;
      A945MnuId = "" ;
      AV17mNUiD = "" ;
      AV13MnuPgm = "" ;
      A947MnuPgm = "" ;
      P0AUP3_A945MnuId = new String[] {""} ;
      AV16HTTPResponse = httpContext.getHttpResponse();
      P0AUP4_A14294MnuSit = new String[] {""} ;
      P0AUP4_A945MnuId = new String[] {""} ;
      P0AUP4_A14293MnuIcon = new String[] {""} ;
      P0AUP4_n14293MnuIcon = new boolean[] {false} ;
      P0AUP4_A949MnuPgmTxt = new String[] {""} ;
      P0AUP4_A947MnuPgm = new String[] {""} ;
      P0AUP4_A946MnuOp = new byte[1] ;
      A14294MnuSit = "" ;
      A14293MnuIcon = "" ;
      A949MnuPgmTxt = "" ;
      AV10DVelop_MenuSubItem = new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      P0AUP5_A14294MnuSit = new String[] {""} ;
      P0AUP5_A945MnuId = new String[] {""} ;
      P0AUP5_A948MnuPgmTpo = new String[] {""} ;
      P0AUP5_A949MnuPgmTxt = new String[] {""} ;
      P0AUP5_A14286MnuPgmWeb = new String[] {""} ;
      P0AUP5_A14293MnuIcon = new String[] {""} ;
      P0AUP5_n14293MnuIcon = new boolean[] {false} ;
      P0AUP5_A947MnuPgm = new String[] {""} ;
      P0AUP5_A946MnuOp = new byte[1] ;
      A948MnuPgmTpo = "" ;
      A14286MnuPgmWeb = "" ;
      GXv_int2 = new byte[1] ;
      GXv_char1 = new String[1] ;
      AV11DVelop_MenuSubItemLevel = new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      GXt_objcol_SdtDVelop_Menu_Item4 = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>(app.wwpbaseobjects.SdtDVelop_Menu_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_char3 = new String[1] ;
      GXv_int5 = new long[1] ;
      GXv_objcol_SdtDVelop_Menu_Item6 = new GXBaseCollection[1] ;
      AV12LastMnuPgmTpo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.pget_dvelopmenuid__default(),
         new Object[] {
             new Object[] {
            P0AUP2_A945MnuId
            }
            , new Object[] {
            P0AUP3_A945MnuId
            }
            , new Object[] {
            P0AUP4_A14294MnuSit, P0AUP4_A945MnuId, P0AUP4_A14293MnuIcon, P0AUP4_n14293MnuIcon, P0AUP4_A949MnuPgmTxt, P0AUP4_A947MnuPgm, P0AUP4_A946MnuOp
            }
            , new Object[] {
            P0AUP5_A14294MnuSit, P0AUP5_A945MnuId, P0AUP5_A948MnuPgmTpo, P0AUP5_A949MnuPgmTxt, P0AUP5_A14286MnuPgmWeb, P0AUP5_A14293MnuIcon, P0AUP5_n14293MnuIcon, P0AUP5_A947MnuPgm, P0AUP5_A946MnuOp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A946MnuOp ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private long AV15id ;
   private long GXv_int5[] ;
   private String AV14UsurCod ;
   private String scmdbuf ;
   private String A945MnuId ;
   private String AV17mNUiD ;
   private String AV13MnuPgm ;
   private String A947MnuPgm ;
   private String A14294MnuSit ;
   private String A949MnuPgmTxt ;
   private String A948MnuPgmTpo ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String AV12LastMnuPgmTpo ;
   private boolean returnInSub ;
   private boolean n14293MnuIcon ;
   private boolean Cond_result ;
   private String A14293MnuIcon ;
   private String A14286MnuPgmWeb ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AUP2_A945MnuId ;
   private String[] P0AUP3_A945MnuId ;
   private String[] P0AUP4_A14294MnuSit ;
   private String[] P0AUP4_A945MnuId ;
   private String[] P0AUP4_A14293MnuIcon ;
   private boolean[] P0AUP4_n14293MnuIcon ;
   private String[] P0AUP4_A949MnuPgmTxt ;
   private String[] P0AUP4_A947MnuPgm ;
   private byte[] P0AUP4_A946MnuOp ;
   private String[] P0AUP5_A14294MnuSit ;
   private String[] P0AUP5_A945MnuId ;
   private String[] P0AUP5_A948MnuPgmTpo ;
   private String[] P0AUP5_A949MnuPgmTxt ;
   private String[] P0AUP5_A14286MnuPgmWeb ;
   private String[] P0AUP5_A14293MnuIcon ;
   private boolean[] P0AUP5_n14293MnuIcon ;
   private String[] P0AUP5_A947MnuPgm ;
   private byte[] P0AUP5_A946MnuOp ;
   private com.genexus.internet.HttpResponse AV16HTTPResponse ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> AV8DVelop_Menu ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> GXt_objcol_SdtDVelop_Menu_Item4 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> GXv_objcol_SdtDVelop_Menu_Item6[] ;
   private app.wwpbaseobjects.SdtDVelop_Menu_Item AV9DVelop_MenuItem ;
   private app.wwpbaseobjects.SdtDVelop_Menu_Item AV10DVelop_MenuSubItem ;
   private app.wwpbaseobjects.SdtDVelop_Menu_Item AV11DVelop_MenuSubItemLevel ;
}

final  class pget_dvelopmenuid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUP2", "SELECT MnuId FROM TXPMNUCAB WHERE MnuId = 'MPRINCIP' ORDER BY MnuId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AUP3", "SELECT MnuId FROM TXPMNUCAB WHERE MnuId = 'INNOVA' ORDER BY MnuId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AUP4", "SELECT MnuSit, MnuId, MnuIcon, MnuPgmTxt, MnuPgm, MnuOp FROM TXPMNUOP WHERE (MnuId = ?) AND (MnuSit = 'T') ORDER BY MnuId, MnuOp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUP5", "SELECT MnuSit, MnuId, MnuPgmTpo, MnuPgmTxt, MnuPgmWeb, MnuIcon, MnuPgm, MnuOp FROM TXPMNUOP WHERE (MnuId = ?) AND (MnuSit = 'T') ORDER BY MnuId, MnuOp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

