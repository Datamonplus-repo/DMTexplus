package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranguiafaseloaddvcombo extends GXProcedure
{
   public albaranguiafaseloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguiafaseloaddvcombo.class ), "" );
   }

   public albaranguiafaseloaddvcombo( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             boolean aP2 ,
                             String aP3 ,
                             long aP4 ,
                             int aP5 ,
                             byte aP6 ,
                             String aP7 ,
                             short aP8 ,
                             String aP9 ,
                             int aP10 ,
                             String aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      albaranguiafaseloaddvcombo.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        boolean aP2 ,
                        String aP3 ,
                        long aP4 ,
                        int aP5 ,
                        byte aP6 ,
                        String aP7 ,
                        short aP8 ,
                        String aP9 ,
                        int aP10 ,
                        String aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             boolean aP2 ,
                             String aP3 ,
                             long aP4 ,
                             int aP5 ,
                             byte aP6 ,
                             String aP7 ,
                             short aP8 ,
                             String aP9 ,
                             int aP10 ,
                             String aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      albaranguiafaseloaddvcombo.this.AV12ComboName = aP0;
      albaranguiafaseloaddvcombo.this.AV13TrnMode = aP1;
      albaranguiafaseloaddvcombo.this.AV25IsDynamicCall = aP2;
      albaranguiafaseloaddvcombo.this.AV14EmprCod = aP3;
      albaranguiafaseloaddvcombo.this.AV15AlbProCod = aP4;
      albaranguiafaseloaddvcombo.this.AV16BarCod = aP5;
      albaranguiafaseloaddvcombo.this.AV17BarCodReo = aP6;
      albaranguiafaseloaddvcombo.this.AV18BarCodPar = aP7;
      albaranguiafaseloaddvcombo.this.AV19GuiFasLin = aP8;
      albaranguiafaseloaddvcombo.this.AV29Cond_EmprCod = aP9;
      albaranguiafaseloaddvcombo.this.AV30Cond_CliCod = aP10;
      albaranguiafaseloaddvcombo.this.AV24SearchTxt = aP11;
      albaranguiafaseloaddvcombo.this.aP12 = aP12;
      albaranguiafaseloaddvcombo.this.aP13 = aP13;
      albaranguiafaseloaddvcombo.this.aP14 = aP14;
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
      AV23MaxItems = 100 ;
      if ( GXutil.strcmp(AV12ComboName, "FasCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FASCOD' */
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
      /* 'LOADCOMBOITEMS_FASCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09US2 */
      pr_default.execute(0, new Object[] {AV29Cond_EmprCod, Integer.valueOf(AV30Cond_CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09US2_A252CliCod[0] ;
         A396EmprCod = P09US2_A396EmprCod[0] ;
         A457FasCod = P09US2_A457FasCod[0] ;
         A460FasDsc = P09US2_A460FasDsc[0] ;
         A460FasDsc = P09US2_A460FasDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A457FasCod), A460FasDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV25IsDynamicCall )
      {
         AV10Combo_Data.sort("Title");
         AV27Combo_DataJson = AV10Combo_Data.toJSonString(false) ;
      }
      else
      {
         if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
         {
            /* Using cursor P09US3 */
            pr_default.execute(1, new Object[] {AV14EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV19GuiFasLin)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A1240GuiFasLin = P09US3_A1240GuiFasLin[0] ;
               A130BarCodPar = P09US3_A130BarCodPar[0] ;
               A132BarCodReo = P09US3_A132BarCodReo[0] ;
               A129BarCod = P09US3_A129BarCod[0] ;
               A30AlbProCod = P09US3_A30AlbProCod[0] ;
               A396EmprCod = P09US3_A396EmprCod[0] ;
               A457FasCod = P09US3_A457FasCod[0] ;
               AV20SelectedValue = A457FasCod ;
               AV26SelectedText = AV20SelectedValue ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
      }
   }

   protected void cleanup( )
   {
      this.aP12[0] = albaranguiafaseloaddvcombo.this.AV20SelectedValue;
      this.aP13[0] = albaranguiafaseloaddvcombo.this.AV26SelectedText;
      this.aP14[0] = albaranguiafaseloaddvcombo.this.AV27Combo_DataJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20SelectedValue = "" ;
      AV26SelectedText = "" ;
      AV27Combo_DataJson = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      scmdbuf = "" ;
      P09US2_A252CliCod = new int[1] ;
      P09US2_A396EmprCod = new String[] {""} ;
      P09US2_A457FasCod = new String[] {""} ;
      P09US2_A460FasDsc = new String[] {""} ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09US3_A1240GuiFasLin = new short[1] ;
      P09US3_A130BarCodPar = new String[] {""} ;
      P09US3_A132BarCodReo = new byte[1] ;
      P09US3_A129BarCod = new int[1] ;
      P09US3_A30AlbProCod = new long[1] ;
      P09US3_A396EmprCod = new String[] {""} ;
      P09US3_A457FasCod = new String[] {""} ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiafaseloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09US2_A252CliCod, P09US2_A396EmprCod, P09US2_A457FasCod, P09US2_A460FasDsc
            }
            , new Object[] {
            P09US3_A1240GuiFasLin, P09US3_A130BarCodPar, P09US3_A132BarCodReo, P09US3_A129BarCod, P09US3_A30AlbProCod, P09US3_A396EmprCod, P09US3_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private short AV19GuiFasLin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV30Cond_CliCod ;
   private int AV23MaxItems ;
   private int A252CliCod ;
   private int A129BarCod ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV18BarCodPar ;
   private String AV29Cond_EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A130BarCodPar ;
   private boolean AV25IsDynamicCall ;
   private boolean returnInSub ;
   private String AV27Combo_DataJson ;
   private String AV12ComboName ;
   private String AV24SearchTxt ;
   private String AV20SelectedValue ;
   private String AV26SelectedText ;
   private String[] aP14 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private int[] P09US2_A252CliCod ;
   private String[] P09US2_A396EmprCod ;
   private String[] P09US2_A457FasCod ;
   private String[] P09US2_A460FasDsc ;
   private short[] P09US3_A1240GuiFasLin ;
   private String[] P09US3_A130BarCodPar ;
   private byte[] P09US3_A132BarCodReo ;
   private int[] P09US3_A129BarCod ;
   private long[] P09US3_A30AlbProCod ;
   private String[] P09US3_A396EmprCod ;
   private String[] P09US3_A457FasCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class albaranguiafaseloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09US2", "SELECT T1.CliCod, T1.EmprCod, T1.FasCod, T2.FasDsc FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09US3", "SELECT GuiFasLin, BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, FasCod FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and GuiFasLin = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

