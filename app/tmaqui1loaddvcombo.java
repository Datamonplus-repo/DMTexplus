package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmaqui1loaddvcombo extends GXProcedure
{
   public tmaqui1loaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqui1loaddvcombo.class ), "" );
   }

   public tmaqui1loaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    String aP3 ,
                                                                                    String[] aP4 )
   {
      tmaqui1loaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tmaqui1loaddvcombo.this.AV12ComboName = aP0;
      tmaqui1loaddvcombo.this.AV13TrnMode = aP1;
      tmaqui1loaddvcombo.this.AV14EmprCod = aP2;
      tmaqui1loaddvcombo.this.AV15MaqCod = aP3;
      tmaqui1loaddvcombo.this.aP4 = aP4;
      tmaqui1loaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "MaqOgtId") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MAQOGTID' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "TipMaqCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPMAQCOD' */
         S121 ();
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
      /* 'LOADCOMBOITEMS_MAQOGTID' Routine */
      returnInSub = false ;
      /* Using cursor P0A3C2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11726MaqOgtId = P0A3C2_A11726MaqOgtId[0] ;
         n11726MaqOgtId = P0A3C2_n11726MaqOgtId[0] ;
         A11727MaqOgtDsc = P0A3C2_A11727MaqOgtDsc[0] ;
         A396EmprCod = P0A3C2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11726MaqOgtId );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A11727MaqOgtDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A3C3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, AV15MaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A602MaqCod = P0A3C3_A602MaqCod[0] ;
            A396EmprCod = P0A3C3_A396EmprCod[0] ;
            A11726MaqOgtId = P0A3C3_A11726MaqOgtId[0] ;
            n11726MaqOgtId = P0A3C3_n11726MaqOgtId[0] ;
            AV16SelectedValue = A11726MaqOgtId ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_TIPMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A3C4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13805TipMaqDscI = P0A3C4_A13805TipMaqDscI[0] ;
         A1012TipMaqDsc = P0A3C4_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P0A3C4_n1012TipMaqDsc[0] ;
         A1011TipMaqCod = P0A3C4_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P0A3C4_n1011TipMaqCod[0] ;
         A396EmprCod = P0A3C4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A1011TipMaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13805TipMaqDscI );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A3C5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, AV15MaqCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A602MaqCod = P0A3C5_A602MaqCod[0] ;
            A396EmprCod = P0A3C5_A396EmprCod[0] ;
            A1011TipMaqCod = P0A3C5_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P0A3C5_n1011TipMaqCod[0] ;
            AV16SelectedValue = A1011TipMaqCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tmaqui1loaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tmaqui1loaddvcombo.this.AV10Combo_Data;
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
      P0A3C2_A11726MaqOgtId = new String[] {""} ;
      P0A3C2_n11726MaqOgtId = new boolean[] {false} ;
      P0A3C2_A11727MaqOgtDsc = new String[] {""} ;
      P0A3C2_A396EmprCod = new String[] {""} ;
      A11726MaqOgtId = "" ;
      A11727MaqOgtDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A3C3_A602MaqCod = new String[] {""} ;
      P0A3C3_A396EmprCod = new String[] {""} ;
      P0A3C3_A11726MaqOgtId = new String[] {""} ;
      P0A3C3_n11726MaqOgtId = new boolean[] {false} ;
      A602MaqCod = "" ;
      P0A3C4_A13805TipMaqDscI = new String[] {""} ;
      P0A3C4_A1012TipMaqDsc = new String[] {""} ;
      P0A3C4_n1012TipMaqDsc = new boolean[] {false} ;
      P0A3C4_A1011TipMaqCod = new String[] {""} ;
      P0A3C4_n1011TipMaqCod = new boolean[] {false} ;
      P0A3C4_A396EmprCod = new String[] {""} ;
      A13805TipMaqDscI = "" ;
      A1012TipMaqDsc = "" ;
      A1011TipMaqCod = "" ;
      P0A3C5_A602MaqCod = new String[] {""} ;
      P0A3C5_A396EmprCod = new String[] {""} ;
      P0A3C5_A1011TipMaqCod = new String[] {""} ;
      P0A3C5_n1011TipMaqCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqui1loaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A3C2_A11726MaqOgtId, P0A3C2_A11727MaqOgtDsc, P0A3C2_A396EmprCod
            }
            , new Object[] {
            P0A3C3_A602MaqCod, P0A3C3_A396EmprCod, P0A3C3_A11726MaqOgtId, P0A3C3_n11726MaqOgtId
            }
            , new Object[] {
            P0A3C4_A13805TipMaqDscI, P0A3C4_A1012TipMaqDsc, P0A3C4_n1012TipMaqDsc, P0A3C4_A1011TipMaqCod, P0A3C4_A396EmprCod
            }
            , new Object[] {
            P0A3C5_A602MaqCod, P0A3C5_A396EmprCod, P0A3C5_A1011TipMaqCod, P0A3C5_n1011TipMaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15MaqCod ;
   private String scmdbuf ;
   private String A11726MaqOgtId ;
   private String A11727MaqOgtDsc ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A1012TipMaqDsc ;
   private String A1011TipMaqCod ;
   private boolean returnInSub ;
   private boolean n11726MaqOgtId ;
   private boolean n1012TipMaqDsc ;
   private boolean n1011TipMaqCod ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13805TipMaqDscI ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A3C2_A11726MaqOgtId ;
   private boolean[] P0A3C2_n11726MaqOgtId ;
   private String[] P0A3C2_A11727MaqOgtDsc ;
   private String[] P0A3C2_A396EmprCod ;
   private String[] P0A3C3_A602MaqCod ;
   private String[] P0A3C3_A396EmprCod ;
   private String[] P0A3C3_A11726MaqOgtId ;
   private boolean[] P0A3C3_n11726MaqOgtId ;
   private String[] P0A3C4_A13805TipMaqDscI ;
   private String[] P0A3C4_A1012TipMaqDsc ;
   private boolean[] P0A3C4_n1012TipMaqDsc ;
   private String[] P0A3C4_A1011TipMaqCod ;
   private boolean[] P0A3C4_n1011TipMaqCod ;
   private String[] P0A3C4_A396EmprCod ;
   private String[] P0A3C5_A602MaqCod ;
   private String[] P0A3C5_A396EmprCod ;
   private String[] P0A3C5_A1011TipMaqCod ;
   private boolean[] P0A3C5_n1011TipMaqCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmaqui1loaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A3C2", "SELECT MaqOgtId, MaqOgtDsc, EmprCod FROM TXPMAQOGT ORDER BY MaqOgtDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3C3", "SELECT MaqCod, EmprCod, MaqOgtId FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A3C4", "SELECT RTRIM(LTRIM(COALESCE( TipMaqDsc, ''))) || '(' || RTRIM(LTRIM(TipMaqCod)) || ')' AS TipMaqDscI, TipMaqDsc, TipMaqCod, EmprCod FROM TXPTIPMAQ ORDER BY TipMaqDscI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A3C5", "SELECT MaqCod, EmprCod, TipMaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

