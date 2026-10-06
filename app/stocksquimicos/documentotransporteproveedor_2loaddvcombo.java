package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_2loaddvcombo extends GXProcedure
{
   public documentotransporteproveedor_2loaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_2loaddvcombo.class ), "" );
   }

   public documentotransporteproveedor_2loaddvcombo( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    short aP4 ,
                                                                                    String[] aP5 )
   {
      documentotransporteproveedor_2loaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        short aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             short aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      documentotransporteproveedor_2loaddvcombo.this.AV12ComboName = aP0;
      documentotransporteproveedor_2loaddvcombo.this.AV13TrnMode = aP1;
      documentotransporteproveedor_2loaddvcombo.this.AV14EmprCod = aP2;
      documentotransporteproveedor_2loaddvcombo.this.AV15AlbProID = aP3;
      documentotransporteproveedor_2loaddvcombo.this.AV16AlbProLinea = aP4;
      documentotransporteproveedor_2loaddvcombo.this.aP5 = aP5;
      documentotransporteproveedor_2loaddvcombo.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09SU2 */
      pr_default.execute(0, new Object[] {AV14EmprCod, Integer.valueOf(AV15AlbProID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13418AlbProID = P09SU2_A13418AlbProID[0] ;
         A396EmprCod = P09SU2_A396EmprCod[0] ;
         A13419AlbProPrvI = P09SU2_A13419AlbProPrvI[0] ;
         AV20AlbProPrvI = A13419AlbProPrvI ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
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
      AV10Combo_Data.clear();
      /* Using cursor P09SU3 */
      pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV20AlbProPrvI)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6158PrdPrv = P09SU3_A6158PrdPrv[0] ;
         A396EmprCod = P09SU3_A396EmprCod[0] ;
         A718PrdNom = P09SU3_A718PrdNom[0] ;
         A719PrdNum = P09SU3_A719PrdNum[0] ;
         A718PrdNom = P09SU3_A718PrdNom[0] ;
         A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09SU4 */
         pr_default.execute(2, new Object[] {AV14EmprCod, Integer.valueOf(AV15AlbProID), Short.valueOf(AV16AlbProLinea)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A13442AlbProLine = P09SU4_A13442AlbProLine[0] ;
            A13418AlbProID = P09SU4_A13418AlbProID[0] ;
            A396EmprCod = P09SU4_A396EmprCod[0] ;
            A719PrdNum = P09SU4_A719PrdNum[0] ;
            AV17SelectedValue = A719PrdNum ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = documentotransporteproveedor_2loaddvcombo.this.AV17SelectedValue;
      this.aP6[0] = documentotransporteproveedor_2loaddvcombo.this.AV10Combo_Data;
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
      scmdbuf = "" ;
      P09SU2_A13418AlbProID = new int[1] ;
      P09SU2_A396EmprCod = new String[] {""} ;
      P09SU2_A13419AlbProPrvI = new int[1] ;
      A396EmprCod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      P09SU3_A6158PrdPrv = new int[1] ;
      P09SU3_A396EmprCod = new String[] {""} ;
      P09SU3_A718PrdNom = new String[] {""} ;
      P09SU3_A719PrdNum = new String[] {""} ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A13747PrdCDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09SU4_A13442AlbProLine = new short[1] ;
      P09SU4_A13418AlbProID = new int[1] ;
      P09SU4_A396EmprCod = new String[] {""} ;
      P09SU4_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_2loaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09SU2_A13418AlbProID, P09SU2_A396EmprCod, P09SU2_A13419AlbProPrvI
            }
            , new Object[] {
            P09SU3_A6158PrdPrv, P09SU3_A396EmprCod, P09SU3_A718PrdNom, P09SU3_A719PrdNum
            }
            , new Object[] {
            P09SU4_A13442AlbProLine, P09SU4_A13418AlbProID, P09SU4_A396EmprCod, P09SU4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16AlbProLinea ;
   private short A13442AlbProLine ;
   private short Gx_err ;
   private int AV15AlbProID ;
   private int A13418AlbProID ;
   private int A13419AlbProPrvI ;
   private int AV20AlbProPrvI ;
   private int A6158PrdPrv ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private String AV12ComboName ;
   private String AV17SelectedValue ;
   private String A13747PrdCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private int[] P09SU2_A13418AlbProID ;
   private String[] P09SU2_A396EmprCod ;
   private int[] P09SU2_A13419AlbProPrvI ;
   private int[] P09SU3_A6158PrdPrv ;
   private String[] P09SU3_A396EmprCod ;
   private String[] P09SU3_A718PrdNom ;
   private String[] P09SU3_A719PrdNum ;
   private short[] P09SU4_A13442AlbProLine ;
   private int[] P09SU4_A13418AlbProID ;
   private String[] P09SU4_A396EmprCod ;
   private String[] P09SU4_A719PrdNum ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class documentotransporteproveedor_2loaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SU2", "SELECT AlbProID, EmprCod, AlbProPrvI FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09SU3", "SELECT T1.PrdPrv, T1.EmprCod, T2.PrdNom, T1.PrdNum FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdPrv = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09SU4", "SELECT AlbProLine, AlbProID, EmprCod, PrdNum FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? and AlbProLine = ? ORDER BY EmprCod, AlbProID, AlbProLine ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

