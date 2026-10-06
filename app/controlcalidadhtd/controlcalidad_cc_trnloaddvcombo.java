package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_cc_trnloaddvcombo extends GXProcedure
{
   public controlcalidad_cc_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc_trnloaddvcombo.class ), "" );
   }

   public controlcalidad_cc_trnloaddvcombo( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    byte aP4 ,
                                                                                    String aP5 ,
                                                                                    String aP6 ,
                                                                                    short aP7 ,
                                                                                    int aP8 ,
                                                                                    String[] aP9 )
   {
      controlcalidad_cc_trnloaddvcombo.this.aP10 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        String aP5 ,
                        String aP6 ,
                        short aP7 ,
                        int aP8 ,
                        String[] aP9 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             String aP5 ,
                             String aP6 ,
                             short aP7 ,
                             int aP8 ,
                             String[] aP9 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP10 )
   {
      controlcalidad_cc_trnloaddvcombo.this.AV12ComboName = aP0;
      controlcalidad_cc_trnloaddvcombo.this.AV13TrnMode = aP1;
      controlcalidad_cc_trnloaddvcombo.this.AV14EmprCod = aP2;
      controlcalidad_cc_trnloaddvcombo.this.AV15BarCod = aP3;
      controlcalidad_cc_trnloaddvcombo.this.AV16BarCodReo = aP4;
      controlcalidad_cc_trnloaddvcombo.this.AV17BarCodPar = aP5;
      controlcalidad_cc_trnloaddvcombo.this.AV18ProCod = aP6;
      controlcalidad_cc_trnloaddvcombo.this.AV19BarOrdLin = aP7;
      controlcalidad_cc_trnloaddvcombo.this.AV20CCTCod = aP8;
      controlcalidad_cc_trnloaddvcombo.this.aP9 = aP9;
      controlcalidad_cc_trnloaddvcombo.this.aP10 = aP10;
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
      if ( GXutil.strcmp(AV12ComboName, "CCOpeCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CCOPECOD' */
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
      /* 'LOADCOMBOITEMS_CCOPECOD' Routine */
      returnInSub = false ;
      /* Using cursor P0APZ2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8482OpeAct = P0APZ2_A8482OpeAct[0] ;
         n8482OpeAct = P0APZ2_n8482OpeAct[0] ;
         A396EmprCod = P0APZ2_A396EmprCod[0] ;
         A653OpeNom = P0APZ2_A653OpeNom[0] ;
         n653OpeNom = P0APZ2_n653OpeNom[0] ;
         A652OpeCod = P0APZ2_A652OpeCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))+"-"+GXutil.trim( A653OpeNom) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0APZ3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar, AV18ProCod, Short.valueOf(AV19BarOrdLin), Integer.valueOf(AV20CCTCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4031CCTCod = P0APZ3_A4031CCTCod[0] ;
            A194BarOrdLin = P0APZ3_A194BarOrdLin[0] ;
            A758ProCod = P0APZ3_A758ProCod[0] ;
            A130BarCodPar = P0APZ3_A130BarCodPar[0] ;
            A132BarCodReo = P0APZ3_A132BarCodReo[0] ;
            A129BarCod = P0APZ3_A129BarCod[0] ;
            A396EmprCod = P0APZ3_A396EmprCod[0] ;
            A4032CCOpeCod = P0APZ3_A4032CCOpeCod[0] ;
            n4032CCOpeCod = P0APZ3_n4032CCOpeCod[0] ;
            AV21SelectedValue = ((0==A4032CCOpeCod) ? "" : GXutil.trim( GXutil.str( A4032CCOpeCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   protected void cleanup( )
   {
      this.aP9[0] = controlcalidad_cc_trnloaddvcombo.this.AV21SelectedValue;
      this.aP10[0] = controlcalidad_cc_trnloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0APZ2_A8482OpeAct = new String[] {""} ;
      P0APZ2_n8482OpeAct = new boolean[] {false} ;
      P0APZ2_A396EmprCod = new String[] {""} ;
      P0APZ2_A653OpeNom = new String[] {""} ;
      P0APZ2_n653OpeNom = new boolean[] {false} ;
      P0APZ2_A652OpeCod = new int[1] ;
      A8482OpeAct = "" ;
      A396EmprCod = "" ;
      A653OpeNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0APZ3_A4031CCTCod = new int[1] ;
      P0APZ3_A194BarOrdLin = new short[1] ;
      P0APZ3_A758ProCod = new String[] {""} ;
      P0APZ3_A130BarCodPar = new String[] {""} ;
      P0APZ3_A132BarCodReo = new byte[1] ;
      P0APZ3_A129BarCod = new int[1] ;
      P0APZ3_A396EmprCod = new String[] {""} ;
      P0APZ3_A4032CCOpeCod = new int[1] ;
      P0APZ3_n4032CCOpeCod = new boolean[] {false} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_cc_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0APZ2_A8482OpeAct, P0APZ2_n8482OpeAct, P0APZ2_A396EmprCod, P0APZ2_A653OpeNom, P0APZ2_n653OpeNom, P0APZ2_A652OpeCod
            }
            , new Object[] {
            P0APZ3_A4031CCTCod, P0APZ3_A194BarOrdLin, P0APZ3_A758ProCod, P0APZ3_A130BarCodPar, P0APZ3_A132BarCodReo, P0APZ3_A129BarCod, P0APZ3_A396EmprCod, P0APZ3_A4032CCOpeCod, P0APZ3_n4032CCOpeCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte A132BarCodReo ;
   private short AV19BarOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int AV20CCTCod ;
   private int A652OpeCod ;
   private int A4031CCTCod ;
   private int A129BarCod ;
   private int A4032CCOpeCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV17BarCodPar ;
   private String AV18ProCod ;
   private String scmdbuf ;
   private String A8482OpeAct ;
   private String A396EmprCod ;
   private String A653OpeNom ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private boolean n4032CCOpeCod ;
   private String AV12ComboName ;
   private String AV21SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP10 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0APZ2_A8482OpeAct ;
   private boolean[] P0APZ2_n8482OpeAct ;
   private String[] P0APZ2_A396EmprCod ;
   private String[] P0APZ2_A653OpeNom ;
   private boolean[] P0APZ2_n653OpeNom ;
   private int[] P0APZ2_A652OpeCod ;
   private int[] P0APZ3_A4031CCTCod ;
   private short[] P0APZ3_A194BarOrdLin ;
   private String[] P0APZ3_A758ProCod ;
   private String[] P0APZ3_A130BarCodPar ;
   private byte[] P0APZ3_A132BarCodReo ;
   private int[] P0APZ3_A129BarCod ;
   private String[] P0APZ3_A396EmprCod ;
   private int[] P0APZ3_A4032CCOpeCod ;
   private boolean[] P0APZ3_n4032CCOpeCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class controlcalidad_cc_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APZ2", "SELECT OpeAct, EmprCod, OpeNom, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeAct = 'A') ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0APZ3", "SELECT CCTCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, CCOpeCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
      }
   }

}

