package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tablaalcalisysulfatos_1loaddvcombo extends GXProcedure
{
   public tablaalcalisysulfatos_1loaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tablaalcalisysulfatos_1loaddvcombo.class ), "" );
   }

   public tablaalcalisysulfatos_1loaddvcombo( int remoteHandle ,
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
      tablaalcalisysulfatos_1loaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tablaalcalisysulfatos_1loaddvcombo.this.AV13ComboName = aP0;
      tablaalcalisysulfatos_1loaddvcombo.this.AV15TrnMode = aP1;
      tablaalcalisysulfatos_1loaddvcombo.this.AV17EmprCod = aP2;
      tablaalcalisysulfatos_1loaddvcombo.this.AV18Lb_TaAuxC = aP3;
      tablaalcalisysulfatos_1loaddvcombo.this.aP4 = aP4;
      tablaalcalisysulfatos_1loaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV13ComboName, "Lb_TaAuxf1") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_TAAUXF1' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "Lb_TaAuxf2") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_TAAUXF2' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "Lb_TaAuxf3") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_TAAUXF3' */
         S131 ();
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
      /* 'LOADCOMBOITEMS_LB_TAAUXF1' Routine */
      returnInSub = false ;
      /* Using cursor P09O52 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13745GrpCDsc = P09O52_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09O52_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09O52_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09O52_n500GrpFamDsc[0] ;
         A396EmprCod = P09O52_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09O53 */
         pr_default.execute(1, new Object[] {AV17EmprCod, AV18Lb_TaAuxC});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6310Lb_TaAuxC = P09O53_A6310Lb_TaAuxC[0] ;
            A396EmprCod = P09O53_A396EmprCod[0] ;
            A6596Lb_TaAuxf1 = P09O53_A6596Lb_TaAuxf1[0] ;
            AV12SelectedValue = ((0==A6596Lb_TaAuxf1) ? "" : GXutil.trim( GXutil.str( A6596Lb_TaAuxf1, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_LB_TAAUXF2' Routine */
      returnInSub = false ;
      /* Using cursor P09O54 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13745GrpCDsc = P09O54_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09O54_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09O54_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09O54_n500GrpFamDsc[0] ;
         A396EmprCod = P09O54_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09O55 */
         pr_default.execute(3, new Object[] {AV17EmprCod, AV18Lb_TaAuxC});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A6310Lb_TaAuxC = P09O55_A6310Lb_TaAuxC[0] ;
            A396EmprCod = P09O55_A396EmprCod[0] ;
            A6597Lb_TaAuxf2 = P09O55_A6597Lb_TaAuxf2[0] ;
            AV12SelectedValue = ((0==A6597Lb_TaAuxf2) ? "" : GXutil.trim( GXutil.str( A6597Lb_TaAuxf2, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_LB_TAAUXF3' Routine */
      returnInSub = false ;
      /* Using cursor P09O56 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13745GrpCDsc = P09O56_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09O56_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09O56_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09O56_n500GrpFamDsc[0] ;
         A396EmprCod = P09O56_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09O57 */
         pr_default.execute(5, new Object[] {AV17EmprCod, AV18Lb_TaAuxC});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A6310Lb_TaAuxC = P09O57_A6310Lb_TaAuxC[0] ;
            A396EmprCod = P09O57_A396EmprCod[0] ;
            A6598Lb_TaAuxf3 = P09O57_A6598Lb_TaAuxf3[0] ;
            AV12SelectedValue = ((0==A6598Lb_TaAuxf3) ? "" : GXutil.trim( GXutil.str( A6598Lb_TaAuxf3, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tablaalcalisysulfatos_1loaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = tablaalcalisysulfatos_1loaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P09O52_A13745GrpCDsc = new String[] {""} ;
      P09O52_A499GrpFamCod = new byte[1] ;
      P09O52_A500GrpFamDsc = new String[] {""} ;
      P09O52_n500GrpFamDsc = new boolean[] {false} ;
      P09O52_A396EmprCod = new String[] {""} ;
      A13745GrpCDsc = "" ;
      A500GrpFamDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09O53_A6310Lb_TaAuxC = new String[] {""} ;
      P09O53_A396EmprCod = new String[] {""} ;
      P09O53_A6596Lb_TaAuxf1 = new byte[1] ;
      A6310Lb_TaAuxC = "" ;
      P09O54_A13745GrpCDsc = new String[] {""} ;
      P09O54_A499GrpFamCod = new byte[1] ;
      P09O54_A500GrpFamDsc = new String[] {""} ;
      P09O54_n500GrpFamDsc = new boolean[] {false} ;
      P09O54_A396EmprCod = new String[] {""} ;
      P09O55_A6310Lb_TaAuxC = new String[] {""} ;
      P09O55_A396EmprCod = new String[] {""} ;
      P09O55_A6597Lb_TaAuxf2 = new byte[1] ;
      P09O56_A13745GrpCDsc = new String[] {""} ;
      P09O56_A499GrpFamCod = new byte[1] ;
      P09O56_A500GrpFamDsc = new String[] {""} ;
      P09O56_n500GrpFamDsc = new boolean[] {false} ;
      P09O56_A396EmprCod = new String[] {""} ;
      P09O57_A6310Lb_TaAuxC = new String[] {""} ;
      P09O57_A396EmprCod = new String[] {""} ;
      P09O57_A6598Lb_TaAuxf3 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tablaalcalisysulfatos_1loaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09O52_A13745GrpCDsc, P09O52_A499GrpFamCod, P09O52_A500GrpFamDsc, P09O52_n500GrpFamDsc, P09O52_A396EmprCod
            }
            , new Object[] {
            P09O53_A6310Lb_TaAuxC, P09O53_A396EmprCod, P09O53_A6596Lb_TaAuxf1
            }
            , new Object[] {
            P09O54_A13745GrpCDsc, P09O54_A499GrpFamCod, P09O54_A500GrpFamDsc, P09O54_n500GrpFamDsc, P09O54_A396EmprCod
            }
            , new Object[] {
            P09O55_A6310Lb_TaAuxC, P09O55_A396EmprCod, P09O55_A6597Lb_TaAuxf2
            }
            , new Object[] {
            P09O56_A13745GrpCDsc, P09O56_A499GrpFamCod, P09O56_A500GrpFamDsc, P09O56_n500GrpFamDsc, P09O56_A396EmprCod
            }
            , new Object[] {
            P09O57_A6310Lb_TaAuxC, P09O57_A396EmprCod, P09O57_A6598Lb_TaAuxf3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A499GrpFamCod ;
   private byte A6596Lb_TaAuxf1 ;
   private byte A6597Lb_TaAuxf2 ;
   private byte A6598Lb_TaAuxf3 ;
   private short Gx_err ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String AV18Lb_TaAuxC ;
   private String scmdbuf ;
   private String A500GrpFamDsc ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private boolean returnInSub ;
   private boolean n500GrpFamDsc ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13745GrpCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09O52_A13745GrpCDsc ;
   private byte[] P09O52_A499GrpFamCod ;
   private String[] P09O52_A500GrpFamDsc ;
   private boolean[] P09O52_n500GrpFamDsc ;
   private String[] P09O52_A396EmprCod ;
   private String[] P09O53_A6310Lb_TaAuxC ;
   private String[] P09O53_A396EmprCod ;
   private byte[] P09O53_A6596Lb_TaAuxf1 ;
   private String[] P09O54_A13745GrpCDsc ;
   private byte[] P09O54_A499GrpFamCod ;
   private String[] P09O54_A500GrpFamDsc ;
   private boolean[] P09O54_n500GrpFamDsc ;
   private String[] P09O54_A396EmprCod ;
   private String[] P09O55_A6310Lb_TaAuxC ;
   private String[] P09O55_A396EmprCod ;
   private byte[] P09O55_A6597Lb_TaAuxf2 ;
   private String[] P09O56_A13745GrpCDsc ;
   private byte[] P09O56_A499GrpFamCod ;
   private String[] P09O56_A500GrpFamDsc ;
   private boolean[] P09O56_n500GrpFamDsc ;
   private String[] P09O56_A396EmprCod ;
   private String[] P09O57_A6310Lb_TaAuxC ;
   private String[] P09O57_A396EmprCod ;
   private byte[] P09O57_A6598Lb_TaAuxf3 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tablaalcalisysulfatos_1loaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09O52", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O53", "SELECT Lb_TaAuxC, EmprCod, Lb_TaAuxf1 FROM TXPENS005 WHERE EmprCod = ? and Lb_TaAuxC = ? ORDER BY EmprCod, Lb_TaAuxC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09O54", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O55", "SELECT Lb_TaAuxC, EmprCod, Lb_TaAuxf2 FROM TXPENS005 WHERE EmprCod = ? and Lb_TaAuxC = ? ORDER BY EmprCod, Lb_TaAuxC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09O56", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09O57", "SELECT Lb_TaAuxC, EmprCod, Lb_TaAuxf3 FROM TXPENS005 WHERE EmprCod = ? and Lb_TaAuxC = ? ORDER BY EmprCod, Lb_TaAuxC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
      }
   }

}

