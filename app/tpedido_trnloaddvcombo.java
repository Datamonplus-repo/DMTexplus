package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpedido_trnloaddvcombo extends GXProcedure
{
   public tpedido_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedido_trnloaddvcombo.class ), "" );
   }

   public tpedido_trnloaddvcombo( int remoteHandle ,
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
      tpedido_trnloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tpedido_trnloaddvcombo.this.AV12ComboName = aP0;
      tpedido_trnloaddvcombo.this.AV13TrnMode = aP1;
      tpedido_trnloaddvcombo.this.AV14EmprCod = aP2;
      tpedido_trnloaddvcombo.this.AV15PedCod = aP3;
      tpedido_trnloaddvcombo.this.aP4 = aP4;
      tpedido_trnloaddvcombo.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV19Proprv) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV14EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int2) ;
      tpedido_trnloaddvcombo.this.GXt_int1 = GXv_int2[0] ;
      AV19Proprv = GXt_int1 ;
      /* Using cursor P09XN2 */
      pr_default.execute(0, new Object[] {AV14EmprCod, Integer.valueOf(AV15PedCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A658PedCod = P09XN2_A658PedCod[0] ;
         A396EmprCod = P09XN2_A396EmprCod[0] ;
         A795PrvNum = P09XN2_A795PrvNum[0] ;
         AV20PrvNum = A795PrvNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_SdtWWPContext3[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext3) ;
      AV9WWPContext = GXv_SdtWWPContext3[0] ;
      if ( GXutil.strcmp(AV12ComboName, "PrdNum") == 0 )
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
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADCOMBOITEMS_PRDNUM' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      if ( (0==AV19Proprv) )
      {
         /* Using cursor P09XN3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV20PrvNum)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A856ValCod = P09XN3_A856ValCod[0] ;
            A795PrvNum = P09XN3_A795PrvNum[0] ;
            A396EmprCod = P09XN3_A396EmprCod[0] ;
            A718PrdNom = P09XN3_A718PrdNom[0] ;
            A719PrdNum = P09XN3_A719PrdNum[0] ;
            A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
            AV10Combo_Data.add(AV11Combo_DataItem, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P09XN4 */
         pr_default.execute(2, new Object[] {AV14EmprCod, Integer.valueOf(AV20PrvNum)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A856ValCod = P09XN4_A856ValCod[0] ;
            A6158PrdPrv = P09XN4_A6158PrdPrv[0] ;
            A396EmprCod = P09XN4_A396EmprCod[0] ;
            A718PrdNom = P09XN4_A718PrdNom[0] ;
            A719PrdNum = P09XN4_A719PrdNum[0] ;
            A856ValCod = P09XN4_A856ValCod[0] ;
            A718PrdNom = P09XN4_A718PrdNom[0] ;
            A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
            AV10Combo_Data.add(AV11Combo_DataItem, 0);
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      AV10Combo_Data.sort("Title");
   }

   protected void cleanup( )
   {
      this.aP4[0] = tpedido_trnloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tpedido_trnloaddvcombo.this.AV10Combo_Data;
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
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P09XN2_A658PedCod = new int[1] ;
      P09XN2_A396EmprCod = new String[] {""} ;
      P09XN2_A795PrvNum = new int[1] ;
      A396EmprCod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext3 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      P09XN3_A856ValCod = new byte[1] ;
      P09XN3_A795PrvNum = new int[1] ;
      P09XN3_A396EmprCod = new String[] {""} ;
      P09XN3_A718PrdNom = new String[] {""} ;
      P09XN3_A719PrdNum = new String[] {""} ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A13747PrdCDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09XN4_A856ValCod = new byte[1] ;
      P09XN4_A6158PrdPrv = new int[1] ;
      P09XN4_A396EmprCod = new String[] {""} ;
      P09XN4_A718PrdNom = new String[] {""} ;
      P09XN4_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedido_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09XN2_A658PedCod, P09XN2_A396EmprCod, P09XN2_A795PrvNum
            }
            , new Object[] {
            P09XN3_A856ValCod, P09XN3_A795PrvNum, P09XN3_A396EmprCod, P09XN3_A718PrdNom, P09XN3_A719PrdNum
            }
            , new Object[] {
            P09XN4_A856ValCod, P09XN4_A6158PrdPrv, P09XN4_A396EmprCod, P09XN4_A718PrdNom, P09XN4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A856ValCod ;
   private short AV19Proprv ;
   private short Gx_err ;
   private int AV15PedCod ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int AV20PrvNum ;
   private int A6158PrdPrv ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13747PrdCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09XN2_A658PedCod ;
   private String[] P09XN2_A396EmprCod ;
   private int[] P09XN2_A795PrvNum ;
   private byte[] P09XN3_A856ValCod ;
   private int[] P09XN3_A795PrvNum ;
   private String[] P09XN3_A396EmprCod ;
   private String[] P09XN3_A718PrdNom ;
   private String[] P09XN3_A719PrdNum ;
   private byte[] P09XN4_A856ValCod ;
   private int[] P09XN4_A6158PrdPrv ;
   private String[] P09XN4_A396EmprCod ;
   private String[] P09XN4_A718PrdNom ;
   private String[] P09XN4_A719PrdNum ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext3[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tpedido_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XN2", "SELECT PedCod, EmprCod, PrvNum FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09XN3", "SELECT ValCod, PrvNum, EmprCod, PrdNom, PrdNum FROM TXPPRODUC WHERE (EmprCod = ? and PrvNum = ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5) AND (ValCod <= 2) ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09XN4", "SELECT T2.ValCod, T1.PrdPrv, T1.EmprCod, T2.PrdNom, T1.PrdNum FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5) AND (T2.ValCod <= 2) AND (T1.PrdPrv = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

