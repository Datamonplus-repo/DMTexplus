package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_dvelopsubmenu extends GXProcedure
{
   public pget_dvelopsubmenu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_dvelopsubmenu.class ), "" );
   }

   public pget_dvelopsubmenu( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> executeUdp( String aP0 ,
                                                                               String[] aP1 ,
                                                                               String aP2 ,
                                                                               long[] aP3 )
   {
      pget_dvelopsubmenu.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String aP2 ,
                        long[] aP3 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String aP2 ,
                             long[] aP3 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>[] aP4 )
   {
      pget_dvelopsubmenu.this.AV16MnuId = aP0;
      pget_dvelopsubmenu.this.AV18MnuPgmTpo = aP1[0];
      this.aP1 = aP1;
      pget_dvelopsubmenu.this.AV13UsurCod = aP2;
      pget_dvelopsubmenu.this.AV12id = aP3[0];
      this.aP3 = aP3;
      pget_dvelopsubmenu.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DVelop_Menu = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>(app.wwpbaseobjects.SdtDVelop_Menu_Item.class, "Item", "TexplusNET", remoteHandle) ;
      /* Using cursor P0A982 */
      pr_default.execute(0, new Object[] {AV16MnuId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14294MnuSit = P0A982_A14294MnuSit[0] ;
         A945MnuId = P0A982_A945MnuId[0] ;
         A948MnuPgmTpo = P0A982_A948MnuPgmTpo[0] ;
         A949MnuPgmTxt = P0A982_A949MnuPgmTxt[0] ;
         A14286MnuPgmWeb = P0A982_A14286MnuPgmWeb[0] ;
         A14293MnuIcon = P0A982_A14293MnuIcon[0] ;
         n14293MnuIcon = P0A982_n14293MnuIcon[0] ;
         A947MnuPgm = P0A982_A947MnuPgm[0] ;
         A946MnuOp = P0A982_A946MnuOp[0] ;
         GXv_char1[0] = A945MnuId ;
         GXv_int2[0] = A946MnuOp ;
         GXv_char3[0] = AV13UsurCod ;
         if ( GXutil.strcmp(new app.ppermisos(remoteHandle, context).executeUdp( GXv_char1, GXv_int2, GXv_char3), "S") == 0 )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         pget_dvelopsubmenu.this.A945MnuId = GXv_char1[0] ;
         pget_dvelopsubmenu.this.A946MnuOp = GXv_int2[0] ;
         pget_dvelopsubmenu.this.AV13UsurCod = GXv_char3[0] ;
         if ( Cond_result )
         {
            if ( GXutil.strcmp(A948MnuPgmTpo, "N") == 0 )
            {
               AV12id = (long)(AV12id+1) ;
               AV11DVelop_MenuSubItem = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.trim( GXutil.str( AV12id, 15, 0)) );
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Tooltip( GXutil.trim( A949MnuPgmTxt) );
               AV20Link = ((GXutil.strcmp("", A14286MnuPgmWeb)==0) ? ((GXutil.strcmp(AV13UsurCod, "ADMIN")==0) ? formatLink("app.menus.mnuop", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A945MnuId))}, new String[] {"Mode","MnuId"})  : "#") : GXutil.lower( GXutil.trim( A14286MnuPgmWeb))) ;
               AV21Linkc = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV20Link,"[\\\\?]")) ;
               if ( AV21Linkc.size() <= 1 )
               {
                  AV20Link += "?" + GXutil.trim( GXutil.str( AV12id, 15, 0)) ;
               }
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Link( AV20Link );
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Iconclass( "fas fa-circle circle-xs" );
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Caption( " "+GXutil.trim( A949MnuPgmTxt) );
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Authorizationkey( GXutil.lower( GXutil.trim( A949MnuPgmTxt)) );
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Additionaldata( "" );
            }
            else if ( GXutil.strcmp(A948MnuPgmTpo, "S") == 0 )
            {
               AV12id = (long)(AV12id+1) ;
               AV11DVelop_MenuSubItem = (app.wwpbaseobjects.SdtDVelop_Menu_Item)new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Id( GXutil.trim( GXutil.str( AV12id, 15, 0)) );
               if ( ! (GXutil.strcmp("", A14293MnuIcon)==0) )
               {
                  AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Iconclass( "menu-icon "+A14293MnuIcon );
               }
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Caption( GXutil.upper( GXutil.trim( A949MnuPgmTxt)) );
               GXt_objcol_SdtDVelop_Menu_Item4 = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>() ;
               GXv_char3[0] = A948MnuPgmTpo ;
               GXv_int5[0] = AV12id ;
               GXv_objcol_SdtDVelop_Menu_Item6[0] = GXt_objcol_SdtDVelop_Menu_Item4 ;
               new app.pget_dvelopsubmenu(remoteHandle, context).execute( A947MnuPgm, GXv_char3, AV13UsurCod, GXv_int5, GXv_objcol_SdtDVelop_Menu_Item6) ;
               pget_dvelopsubmenu.this.A948MnuPgmTpo = GXv_char3[0] ;
               pget_dvelopsubmenu.this.AV12id = GXv_int5[0] ;
               GXt_objcol_SdtDVelop_Menu_Item4 = GXv_objcol_SdtDVelop_Menu_Item6[0] ;
               AV11DVelop_MenuSubItem.setgxTv_SdtDVelop_Menu_Item_Subitems( GXt_objcol_SdtDVelop_Menu_Item4 );
            }
            AV8DVelop_Menu.add(AV11DVelop_MenuSubItem, 0);
         }
         AV19LastMnuPgmTpo = A948MnuPgmTpo ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pget_dvelopsubmenu.this.AV18MnuPgmTpo;
      this.aP3[0] = pget_dvelopsubmenu.this.AV12id;
      this.aP4[0] = pget_dvelopsubmenu.this.AV8DVelop_Menu;
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
      scmdbuf = "" ;
      P0A982_A14294MnuSit = new String[] {""} ;
      P0A982_A945MnuId = new String[] {""} ;
      P0A982_A948MnuPgmTpo = new String[] {""} ;
      P0A982_A949MnuPgmTxt = new String[] {""} ;
      P0A982_A14286MnuPgmWeb = new String[] {""} ;
      P0A982_A14293MnuIcon = new String[] {""} ;
      P0A982_n14293MnuIcon = new boolean[] {false} ;
      P0A982_A947MnuPgm = new String[] {""} ;
      P0A982_A946MnuOp = new byte[1] ;
      A14294MnuSit = "" ;
      A945MnuId = "" ;
      A948MnuPgmTpo = "" ;
      A949MnuPgmTxt = "" ;
      A14286MnuPgmWeb = "" ;
      A14293MnuIcon = "" ;
      A947MnuPgm = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new byte[1] ;
      AV11DVelop_MenuSubItem = new app.wwpbaseobjects.SdtDVelop_Menu_Item(remoteHandle, context);
      AV20Link = "" ;
      AV21Linkc = new GXSimpleCollection<String>(String.class, "internal", "");
      GXt_objcol_SdtDVelop_Menu_Item4 = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>(app.wwpbaseobjects.SdtDVelop_Menu_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_char3 = new String[1] ;
      GXv_int5 = new long[1] ;
      GXv_objcol_SdtDVelop_Menu_Item6 = new GXBaseCollection[1] ;
      AV19LastMnuPgmTpo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pget_dvelopsubmenu__default(),
         new Object[] {
             new Object[] {
            P0A982_A14294MnuSit, P0A982_A945MnuId, P0A982_A948MnuPgmTpo, P0A982_A949MnuPgmTxt, P0A982_A14286MnuPgmWeb, P0A982_A14293MnuIcon, P0A982_n14293MnuIcon, P0A982_A947MnuPgm, P0A982_A946MnuOp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A946MnuOp ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private long AV12id ;
   private long GXv_int5[] ;
   private String AV16MnuId ;
   private String AV18MnuPgmTpo ;
   private String AV13UsurCod ;
   private String scmdbuf ;
   private String A14294MnuSit ;
   private String A945MnuId ;
   private String A948MnuPgmTpo ;
   private String A949MnuPgmTxt ;
   private String A947MnuPgm ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String AV19LastMnuPgmTpo ;
   private boolean n14293MnuIcon ;
   private boolean Cond_result ;
   private String A14286MnuPgmWeb ;
   private String A14293MnuIcon ;
   private String AV20Link ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>[] aP4 ;
   private String[] aP1 ;
   private long[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A982_A14294MnuSit ;
   private String[] P0A982_A945MnuId ;
   private String[] P0A982_A948MnuPgmTpo ;
   private String[] P0A982_A949MnuPgmTxt ;
   private String[] P0A982_A14286MnuPgmWeb ;
   private String[] P0A982_A14293MnuIcon ;
   private boolean[] P0A982_n14293MnuIcon ;
   private String[] P0A982_A947MnuPgm ;
   private byte[] P0A982_A946MnuOp ;
   private GXSimpleCollection<String> AV21Linkc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> AV8DVelop_Menu ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> GXt_objcol_SdtDVelop_Menu_Item4 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> GXv_objcol_SdtDVelop_Menu_Item6[] ;
   private app.wwpbaseobjects.SdtDVelop_Menu_Item AV11DVelop_MenuSubItem ;
}

final  class pget_dvelopsubmenu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A982", "SELECT MnuSit, MnuId, MnuPgmTpo, MnuPgmTxt, MnuPgmWeb, MnuIcon, MnuPgm, MnuOp FROM TXPMNUOP WHERE (MnuId = ?) AND (MnuSit = 'T') ORDER BY MnuId, MnuOp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
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
            case 0 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

