package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tparfasloaddvcombo extends GXProcedure
{
   public tparfasloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tparfasloaddvcombo.class ), "" );
   }

   public tparfasloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    short aP3 ,
                                                                                    String[] aP4 )
   {
      tparfasloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        short aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tparfasloaddvcombo.this.AV12ComboName = aP0;
      tparfasloaddvcombo.this.AV13TrnMode = aP1;
      tparfasloaddvcombo.this.AV14EmprCod = aP2;
      tparfasloaddvcombo.this.AV15ParFasCod = aP3;
      tparfasloaddvcombo.this.aP4 = aP4;
      tparfasloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "ParUndID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PARUNDID' */
         S111 ();
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
      /* 'LOADCOMBOITEMS_PARUNDID' Routine */
      returnInSub = false ;
      /* Using cursor P0A1N2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13742ParIdDsc = P0A1N2_A13742ParIdDsc[0] ;
         A13203ParUndID = P0A1N2_A13203ParUndID[0] ;
         n13203ParUndID = P0A1N2_n13203ParUndID[0] ;
         A13204ParUndDsc = P0A1N2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P0A1N2_n13204ParUndDsc[0] ;
         A396EmprCod = P0A1N2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A13203ParUndID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13742ParIdDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1N3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Short.valueOf(AV15ParFasCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1664ParFasCod = P0A1N3_A1664ParFasCod[0] ;
            A396EmprCod = P0A1N3_A396EmprCod[0] ;
            A13203ParUndID = P0A1N3_A13203ParUndID[0] ;
            n13203ParUndID = P0A1N3_n13203ParUndID[0] ;
            AV16SelectedValue = ((0==A13203ParUndID) ? "" : GXutil.trim( GXutil.str( A13203ParUndID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tparfasloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tparfasloaddvcombo.this.AV10Combo_Data;
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
      P0A1N2_A13742ParIdDsc = new String[] {""} ;
      P0A1N2_A13203ParUndID = new short[1] ;
      P0A1N2_n13203ParUndID = new boolean[] {false} ;
      P0A1N2_A13204ParUndDsc = new String[] {""} ;
      P0A1N2_n13204ParUndDsc = new boolean[] {false} ;
      P0A1N2_A396EmprCod = new String[] {""} ;
      A13742ParIdDsc = "" ;
      A13204ParUndDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A1N3_A1664ParFasCod = new short[1] ;
      P0A1N3_A396EmprCod = new String[] {""} ;
      P0A1N3_A13203ParUndID = new short[1] ;
      P0A1N3_n13203ParUndID = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfasloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A1N2_A13742ParIdDsc, P0A1N2_A13203ParUndID, P0A1N2_A13204ParUndDsc, P0A1N2_n13204ParUndDsc, P0A1N2_A396EmprCod
            }
            , new Object[] {
            P0A1N3_A1664ParFasCod, P0A1N3_A396EmprCod, P0A1N3_A13203ParUndID, P0A1N3_n13203ParUndID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15ParFasCod ;
   private short A13203ParUndID ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A13204ParUndDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n13203ParUndID ;
   private boolean n13204ParUndDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13742ParIdDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A1N2_A13742ParIdDsc ;
   private short[] P0A1N2_A13203ParUndID ;
   private boolean[] P0A1N2_n13203ParUndID ;
   private String[] P0A1N2_A13204ParUndDsc ;
   private boolean[] P0A1N2_n13204ParUndDsc ;
   private String[] P0A1N2_A396EmprCod ;
   private short[] P0A1N3_A1664ParFasCod ;
   private String[] P0A1N3_A396EmprCod ;
   private short[] P0A1N3_A13203ParUndID ;
   private boolean[] P0A1N3_n13203ParUndID ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tparfasloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1N2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ParUndID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ParUndDsc, ''))) AS ParIdDsc, ParUndID, ParUndDsc, EmprCod FROM TXPPARUND ORDER BY ParIdDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1N3", "SELECT ParFasCod, EmprCod, ParUndID FROM TXPPARFAS WHERE EmprCod = ? and ParFasCod = ? ORDER BY EmprCod, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

