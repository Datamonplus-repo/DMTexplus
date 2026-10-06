package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class defectos_trnloaddvcombo extends GXProcedure
{
   public defectos_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( defectos_trnloaddvcombo.class ), "" );
   }

   public defectos_trnloaddvcombo( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String[] aP4 )
   {
      defectos_trnloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      defectos_trnloaddvcombo.this.AV12ComboName = aP0;
      defectos_trnloaddvcombo.this.AV13TrnMode = aP1;
      defectos_trnloaddvcombo.this.AV14EmprCod = aP2;
      defectos_trnloaddvcombo.this.AV15DisCod = aP3;
      defectos_trnloaddvcombo.this.aP4 = aP4;
      defectos_trnloaddvcombo.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      if ( GXutil.strcmp(AV12ComboName, "TipDefCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPDEFCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DefMaqcod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DEFMAQCOD' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DefCausa") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DEFCAUSA' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DefResp") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DEFRESP' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADCOMBOITEMS_TIPDEFCOD' Routine */
      returnInSub = false ;
      AV14EmprCod = AV9WWPContext.getgxTv_SdtWWPContext_Emprcod() ;
      AV10Combo_Data.clear();
      /* Using cursor P0AEJ2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AEJ2_A396EmprCod[0] ;
         A13003TipDefAct = P0AEJ2_A13003TipDefAct[0] ;
         n13003TipDefAct = P0AEJ2_n13003TipDefAct[0] ;
         A834TipDefDsc = P0AEJ2_A834TipDefDsc[0] ;
         n834TipDefDsc = P0AEJ2_n834TipDefDsc[0] ;
         A833TipDefCod = P0AEJ2_A833TipDefCod[0] ;
         A13819TipdefDscI = GXutil.trim( GXutil.str( A833TipDefCod, 4, 0)) + "-" + GXutil.trim( A834TipDefDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A833TipDefCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13819TipdefDscI );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(AV10Combo_Data.toJSonString(false), httpContext.getMessage( "LoadComboItems_TipDefCod", ""), (short)(10)) ;
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_DEFMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0AEJ3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13734MaqCDsc = P0AEJ3_A13734MaqCDsc[0] ;
         A602MaqCod = P0AEJ3_A602MaqCod[0] ;
         A606MaqDsc = P0AEJ3_A606MaqDsc[0] ;
         n606MaqDsc = P0AEJ3_n606MaqDsc[0] ;
         A396EmprCod = P0AEJ3_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_DEFCAUSA' Routine */
      returnInSub = false ;
      /* Using cursor P0AEJ4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13816DscCausaID = P0AEJ4_A13816DscCausaID[0] ;
         A5085CodCausa = P0AEJ4_A5085CodCausa[0] ;
         A5086DscCausa = P0AEJ4_A5086DscCausa[0] ;
         n5086DscCausa = P0AEJ4_n5086DscCausa[0] ;
         A396EmprCod = P0AEJ4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A5085CodCausa, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13816DscCausaID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_DEFRESP' Routine */
      returnInSub = false ;
      /* Using cursor P0AEJ5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13817Rps_DscID = P0AEJ5_A13817Rps_DscID[0] ;
         A7000Rps_Cod = P0AEJ5_A7000Rps_Cod[0] ;
         A7001Rps_Dsc = P0AEJ5_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P0AEJ5_n7001Rps_Dsc[0] ;
         A396EmprCod = P0AEJ5_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A7000Rps_Cod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13817Rps_DscID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP4[0] = defectos_trnloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = defectos_trnloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0AEJ2_A396EmprCod = new String[] {""} ;
      P0AEJ2_A13003TipDefAct = new String[] {""} ;
      P0AEJ2_n13003TipDefAct = new boolean[] {false} ;
      P0AEJ2_A834TipDefDsc = new String[] {""} ;
      P0AEJ2_n834TipDefDsc = new boolean[] {false} ;
      P0AEJ2_A833TipDefCod = new short[1] ;
      A396EmprCod = "" ;
      A13003TipDefAct = "" ;
      A834TipDefDsc = "" ;
      A13819TipdefDscI = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0AEJ3_A13734MaqCDsc = new String[] {""} ;
      P0AEJ3_A602MaqCod = new String[] {""} ;
      P0AEJ3_A606MaqDsc = new String[] {""} ;
      P0AEJ3_n606MaqDsc = new boolean[] {false} ;
      P0AEJ3_A396EmprCod = new String[] {""} ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      P0AEJ4_A13816DscCausaID = new String[] {""} ;
      P0AEJ4_A5085CodCausa = new short[1] ;
      P0AEJ4_A5086DscCausa = new String[] {""} ;
      P0AEJ4_n5086DscCausa = new boolean[] {false} ;
      P0AEJ4_A396EmprCod = new String[] {""} ;
      A13816DscCausaID = "" ;
      A5086DscCausa = "" ;
      P0AEJ5_A13817Rps_DscID = new String[] {""} ;
      P0AEJ5_A7000Rps_Cod = new short[1] ;
      P0AEJ5_A7001Rps_Dsc = new String[] {""} ;
      P0AEJ5_n7001Rps_Dsc = new boolean[] {false} ;
      P0AEJ5_A396EmprCod = new String[] {""} ;
      A13817Rps_DscID = "" ;
      A7001Rps_Dsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.defectos_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0AEJ2_A396EmprCod, P0AEJ2_A13003TipDefAct, P0AEJ2_n13003TipDefAct, P0AEJ2_A834TipDefDsc, P0AEJ2_n834TipDefDsc, P0AEJ2_A833TipDefCod
            }
            , new Object[] {
            P0AEJ3_A13734MaqCDsc, P0AEJ3_A602MaqCod, P0AEJ3_A606MaqDsc, P0AEJ3_n606MaqDsc, P0AEJ3_A396EmprCod
            }
            , new Object[] {
            P0AEJ4_A13816DscCausaID, P0AEJ4_A5085CodCausa, P0AEJ4_A5086DscCausa, P0AEJ4_n5086DscCausa, P0AEJ4_A396EmprCod
            }
            , new Object[] {
            P0AEJ5_A13817Rps_DscID, P0AEJ5_A7000Rps_Cod, P0AEJ5_A7001Rps_Dsc, P0AEJ5_n7001Rps_Dsc, P0AEJ5_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private int AV15DisCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A13003TipDefAct ;
   private String A834TipDefDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private boolean returnInSub ;
   private boolean n13003TipDefAct ;
   private boolean n834TipDefDsc ;
   private boolean n606MaqDsc ;
   private boolean n5086DscCausa ;
   private boolean n7001Rps_Dsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13819TipdefDscI ;
   private String A13734MaqCDsc ;
   private String A13816DscCausaID ;
   private String A13817Rps_DscID ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEJ2_A396EmprCod ;
   private String[] P0AEJ2_A13003TipDefAct ;
   private boolean[] P0AEJ2_n13003TipDefAct ;
   private String[] P0AEJ2_A834TipDefDsc ;
   private boolean[] P0AEJ2_n834TipDefDsc ;
   private short[] P0AEJ2_A833TipDefCod ;
   private String[] P0AEJ3_A13734MaqCDsc ;
   private String[] P0AEJ3_A602MaqCod ;
   private String[] P0AEJ3_A606MaqDsc ;
   private boolean[] P0AEJ3_n606MaqDsc ;
   private String[] P0AEJ3_A396EmprCod ;
   private String[] P0AEJ4_A13816DscCausaID ;
   private short[] P0AEJ4_A5085CodCausa ;
   private String[] P0AEJ4_A5086DscCausa ;
   private boolean[] P0AEJ4_n5086DscCausa ;
   private String[] P0AEJ4_A396EmprCod ;
   private String[] P0AEJ5_A13817Rps_DscID ;
   private short[] P0AEJ5_A7000Rps_Cod ;
   private String[] P0AEJ5_A7001Rps_Dsc ;
   private boolean[] P0AEJ5_n7001Rps_Dsc ;
   private String[] P0AEJ5_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class defectos_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEJ2", "SELECT EmprCod, TipDefAct, TipDefDsc, TipDefCod FROM TXPTIPDEF WHERE (EmprCod = ?) AND (TipDefAct = 'S') ORDER BY TipDefCod, TipDefDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AEJ3", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AEJ4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodCausa,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscCausa, ''))) AS DscCausaID, CodCausa, DscCausa, EmprCod FROM TXPTIPCAU ORDER BY DscCausaID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AEJ5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Rps_Dsc, ''))) AS Rps_DscID, Rps_Cod, Rps_Dsc, EmprCod FROM TXPCODRPS ORDER BY Rps_DscID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

