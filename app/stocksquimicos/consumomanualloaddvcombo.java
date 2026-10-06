package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consumomanualloaddvcombo extends GXProcedure
{
   public consumomanualloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consumomanualloaddvcombo.class ), "" );
   }

   public consumomanualloaddvcombo( int remoteHandle ,
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
      consumomanualloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      consumomanualloaddvcombo.this.AV13ComboName = aP0;
      consumomanualloaddvcombo.this.AV15TrnMode = aP1;
      consumomanualloaddvcombo.this.AV17EmprCod = aP2;
      consumomanualloaddvcombo.this.AV18CumCodCont = aP3;
      consumomanualloaddvcombo.this.aP4 = aP4;
      consumomanualloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV13ComboName, "PrdNum") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRDNUM' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "CC_AlmCd") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CC_ALMCD' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "CumCCos") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CUMCCOS' */
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
      /* 'LOADCOMBOITEMS_PRDNUM' Routine */
      returnInSub = false ;
      /* Using cursor P09MG2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09MG2_A856ValCod[0] ;
         A13747PrdCDsc = P09MG2_A13747PrdCDsc[0] ;
         A719PrdNum = P09MG2_A719PrdNum[0] ;
         A718PrdNom = P09MG2_A718PrdNom[0] ;
         A396EmprCod = P09MG2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_CC_ALMCD' Routine */
      returnInSub = false ;
      /* Using cursor P09MG3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13782CC_AlmCDsc = P09MG3_A13782CC_AlmCDsc[0] ;
         A8908CC_AlmCod = P09MG3_A8908CC_AlmCod[0] ;
         A8909CC_AlmDsc = P09MG3_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = P09MG3_n8909CC_AlmDsc[0] ;
         A396EmprCod = P09MG3_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A8908CC_AlmCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13782CC_AlmCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09MG4 */
         pr_default.execute(2, new Object[] {AV17EmprCod, Integer.valueOf(AV18CumCodCont)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A859CumCodCont = P09MG4_A859CumCodCont[0] ;
            A396EmprCod = P09MG4_A396EmprCod[0] ;
            A8925CC_AlmCd = P09MG4_A8925CC_AlmCd[0] ;
            n8925CC_AlmCd = P09MG4_n8925CC_AlmCd[0] ;
            AV12SelectedValue = ((0==A8925CC_AlmCd) ? "" : GXutil.trim( GXutil.str( A8925CC_AlmCd, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_CUMCCOS' Routine */
      returnInSub = false ;
      /* Using cursor P09MG5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13780CcoCDsc = P09MG5_A13780CcoCDsc[0] ;
         A3839CcoCod = P09MG5_A3839CcoCod[0] ;
         A3840CcoDsc = P09MG5_A3840CcoDsc[0] ;
         n3840CcoDsc = P09MG5_n3840CcoDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A3839CcoCod, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13780CcoCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09MG6 */
         pr_default.execute(4, new Object[] {AV17EmprCod, Integer.valueOf(AV18CumCodCont)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A859CumCodCont = P09MG6_A859CumCodCont[0] ;
            A396EmprCod = P09MG6_A396EmprCod[0] ;
            A10777CumCCos = P09MG6_A10777CumCCos[0] ;
            AV12SelectedValue = ((0==A10777CumCCos) ? "" : GXutil.trim( GXutil.str( A10777CumCCos, 3, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = consumomanualloaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = consumomanualloaddvcombo.this.AV10Combo_Data;
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
      P09MG2_A856ValCod = new byte[1] ;
      P09MG2_A13747PrdCDsc = new String[] {""} ;
      P09MG2_A719PrdNum = new String[] {""} ;
      P09MG2_A718PrdNom = new String[] {""} ;
      P09MG2_A396EmprCod = new String[] {""} ;
      A13747PrdCDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09MG3_A13782CC_AlmCDsc = new String[] {""} ;
      P09MG3_A8908CC_AlmCod = new byte[1] ;
      P09MG3_A8909CC_AlmDsc = new String[] {""} ;
      P09MG3_n8909CC_AlmDsc = new boolean[] {false} ;
      P09MG3_A396EmprCod = new String[] {""} ;
      A13782CC_AlmCDsc = "" ;
      A8909CC_AlmDsc = "" ;
      P09MG4_A859CumCodCont = new int[1] ;
      P09MG4_A396EmprCod = new String[] {""} ;
      P09MG4_A8925CC_AlmCd = new byte[1] ;
      P09MG4_n8925CC_AlmCd = new boolean[] {false} ;
      P09MG5_A13780CcoCDsc = new String[] {""} ;
      P09MG5_A3839CcoCod = new short[1] ;
      P09MG5_A3840CcoDsc = new String[] {""} ;
      P09MG5_n3840CcoDsc = new boolean[] {false} ;
      A13780CcoCDsc = "" ;
      A3840CcoDsc = "" ;
      P09MG6_A859CumCodCont = new int[1] ;
      P09MG6_A396EmprCod = new String[] {""} ;
      P09MG6_A10777CumCCos = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.consumomanualloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09MG2_A856ValCod, P09MG2_A13747PrdCDsc, P09MG2_A719PrdNum, P09MG2_A718PrdNom, P09MG2_A396EmprCod
            }
            , new Object[] {
            P09MG3_A13782CC_AlmCDsc, P09MG3_A8908CC_AlmCod, P09MG3_A8909CC_AlmDsc, P09MG3_n8909CC_AlmDsc, P09MG3_A396EmprCod
            }
            , new Object[] {
            P09MG4_A859CumCodCont, P09MG4_A396EmprCod, P09MG4_A8925CC_AlmCd, P09MG4_n8925CC_AlmCd
            }
            , new Object[] {
            P09MG5_A13780CcoCDsc, P09MG5_A3839CcoCod, P09MG5_A3840CcoDsc, P09MG5_n3840CcoDsc
            }
            , new Object[] {
            P09MG6_A859CumCodCont, P09MG6_A396EmprCod, P09MG6_A10777CumCCos
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A8908CC_AlmCod ;
   private byte A8925CC_AlmCd ;
   private short A3839CcoCod ;
   private short A10777CumCCos ;
   private short Gx_err ;
   private int AV18CumCodCont ;
   private int A859CumCodCont ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private String A8909CC_AlmDsc ;
   private String A3840CcoDsc ;
   private boolean returnInSub ;
   private boolean n8909CC_AlmDsc ;
   private boolean n8925CC_AlmCd ;
   private boolean n3840CcoDsc ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13747PrdCDsc ;
   private String A13782CC_AlmCDsc ;
   private String A13780CcoCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09MG2_A856ValCod ;
   private String[] P09MG2_A13747PrdCDsc ;
   private String[] P09MG2_A719PrdNum ;
   private String[] P09MG2_A718PrdNom ;
   private String[] P09MG2_A396EmprCod ;
   private String[] P09MG3_A13782CC_AlmCDsc ;
   private byte[] P09MG3_A8908CC_AlmCod ;
   private String[] P09MG3_A8909CC_AlmDsc ;
   private boolean[] P09MG3_n8909CC_AlmDsc ;
   private String[] P09MG3_A396EmprCod ;
   private int[] P09MG4_A859CumCodCont ;
   private String[] P09MG4_A396EmprCod ;
   private byte[] P09MG4_A8925CC_AlmCd ;
   private boolean[] P09MG4_n8925CC_AlmCd ;
   private String[] P09MG5_A13780CcoCDsc ;
   private short[] P09MG5_A3839CcoCod ;
   private String[] P09MG5_A3840CcoDsc ;
   private boolean[] P09MG5_n3840CcoDsc ;
   private int[] P09MG6_A859CumCodCont ;
   private String[] P09MG6_A396EmprCod ;
   private short[] P09MG6_A10777CumCCos ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class consumomanualloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09MG2", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE PrdNum >= '100000' and PrdNum <= '999999' and ValCod < 3 ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MG3", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CC_AlmCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( CC_AlmDsc, ''))) AS CC_AlmCDsc, CC_AlmCod, CC_AlmDsc, EmprCod FROM TXPALMCCS ORDER BY CC_AlmCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MG4", "SELECT CumCodCont, EmprCod, CC_AlmCd FROM TXPCCUMCO WHERE EmprCod = ? and CumCodCont = ? ORDER BY EmprCod, CumCodCont ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09MG5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CcoCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( CcoDsc, ''))) AS CcoCDsc, CcoCod, CcoDsc FROM TXPCENTCO ORDER BY CcoCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MG6", "SELECT CumCodCont, EmprCod, CumCCos FROM TXPCCUMCO WHERE EmprCod = ? and CumCodCont = ? ORDER BY EmprCod, CumCodCont ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

