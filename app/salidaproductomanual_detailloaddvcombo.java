package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class salidaproductomanual_detailloaddvcombo extends GXProcedure
{
   public salidaproductomanual_detailloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidaproductomanual_detailloaddvcombo.class ), "" );
   }

   public salidaproductomanual_detailloaddvcombo( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String aP4 ,
                                                                                    String[] aP5 )
   {
      salidaproductomanual_detailloaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      salidaproductomanual_detailloaddvcombo.this.AV12ComboName = aP0;
      salidaproductomanual_detailloaddvcombo.this.AV13TrnMode = aP1;
      salidaproductomanual_detailloaddvcombo.this.AV14EmprCod = aP2;
      salidaproductomanual_detailloaddvcombo.this.AV15CumCodCont = aP3;
      salidaproductomanual_detailloaddvcombo.this.AV16PrdNum = aP4;
      salidaproductomanual_detailloaddvcombo.this.aP5 = aP5;
      salidaproductomanual_detailloaddvcombo.this.aP6 = aP6;
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
      /* Using cursor P09RB2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09RB2_A856ValCod[0] ;
         A13747PrdCDsc = P09RB2_A13747PrdCDsc[0] ;
         A719PrdNum = P09RB2_A719PrdNum[0] ;
         A718PrdNom = P09RB2_A718PrdNom[0] ;
         A396EmprCod = P09RB2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09RB3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15CumCodCont), AV16PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P09RB3_A719PrdNum[0] ;
            A859CumCodCont = P09RB3_A859CumCodCont[0] ;
            A396EmprCod = P09RB3_A396EmprCod[0] ;
            AV17SelectedValue = A719PrdNum ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV16PrdNum)==0) )
         {
            AV17SelectedValue = AV16PrdNum ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = salidaproductomanual_detailloaddvcombo.this.AV17SelectedValue;
      this.aP6[0] = salidaproductomanual_detailloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P09RB2_A856ValCod = new byte[1] ;
      P09RB2_A13747PrdCDsc = new String[] {""} ;
      P09RB2_A719PrdNum = new String[] {""} ;
      P09RB2_A718PrdNom = new String[] {""} ;
      P09RB2_A396EmprCod = new String[] {""} ;
      A13747PrdCDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09RB3_A719PrdNum = new String[] {""} ;
      P09RB3_A859CumCodCont = new int[1] ;
      P09RB3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_detailloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09RB2_A856ValCod, P09RB2_A13747PrdCDsc, P09RB2_A719PrdNum, P09RB2_A718PrdNom, P09RB2_A396EmprCod
            }
            , new Object[] {
            P09RB3_A719PrdNum, P09RB3_A859CumCodCont, P09RB3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private int AV15CumCodCont ;
   private int A859CumCodCont ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV16PrdNum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV17SelectedValue ;
   private String A13747PrdCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09RB2_A856ValCod ;
   private String[] P09RB2_A13747PrdCDsc ;
   private String[] P09RB2_A719PrdNum ;
   private String[] P09RB2_A718PrdNom ;
   private String[] P09RB2_A396EmprCod ;
   private String[] P09RB3_A719PrdNum ;
   private int[] P09RB3_A859CumCodCont ;
   private String[] P09RB3_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class salidaproductomanual_detailloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RB2", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE PrdNum >= '100000' and PrdNum <= '999999' and ValCod < 3 ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RB3", "SELECT PrdNum, CumCodCont, EmprCod FROM TXPLCUMCO WHERE EmprCod = ? and CumCodCont = ? and PrdNum = ? ORDER BY EmprCod, CumCodCont, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

