package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprvgenloaddvcombo extends GXProcedure
{
   public tprvgenloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprvgenloaddvcombo.class ), "" );
   }

   public tprvgenloaddvcombo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    String[] aP4 ,
                                                                                    String[] aP5 )
   {
      tprvgenloaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 )
   {
      tprvgenloaddvcombo.this.AV13ComboName = aP0;
      tprvgenloaddvcombo.this.AV15TrnMode = aP1;
      tprvgenloaddvcombo.this.AV18EmprCod = aP2;
      tprvgenloaddvcombo.this.AV19PrvNum = aP3;
      tprvgenloaddvcombo.this.aP4 = aP4;
      tprvgenloaddvcombo.this.aP5 = aP5;
      tprvgenloaddvcombo.this.aP6 = aP6;
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
      if ( GXutil.strcmp(AV13ComboName, "Cod_Clas") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_COD_CLAS' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "PrvClasID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRVCLASID' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "FpgCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FPGCOD' */
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
      /* 'LOADCOMBOITEMS_COD_CLAS' Routine */
      returnInSub = false ;
      /* Using cursor P09M42 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14032Id_Des_Cla = P09M42_A14032Id_Des_Cla[0] ;
         A9728Cod_Clas = P09M42_A9728Cod_Clas[0] ;
         n9728Cod_Clas = P09M42_n9728Cod_Clas[0] ;
         A9729Des_Clas = P09M42_A9729Des_Clas[0] ;
         n9729Des_Clas = P09M42_n9729Des_Clas[0] ;
         A396EmprCod = P09M42_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14032Id_Des_Cla );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M43 */
         pr_default.execute(1, new Object[] {AV18EmprCod, Integer.valueOf(AV19PrvNum)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A795PrvNum = P09M43_A795PrvNum[0] ;
            A396EmprCod = P09M43_A396EmprCod[0] ;
            A9728Cod_Clas = P09M43_A9728Cod_Clas[0] ;
            n9728Cod_Clas = P09M43_n9728Cod_Clas[0] ;
            AV12SelectedValue = ((0==A9728Cod_Clas) ? "" : GXutil.trim( GXutil.str( A9728Cod_Clas, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_PRVCLASID' Routine */
      returnInSub = false ;
      /* Using cursor P09M44 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14033ID_PrvClas = P09M44_A14033ID_PrvClas[0] ;
         A14030PrvClasID = P09M44_A14030PrvClasID[0] ;
         n14030PrvClasID = P09M44_n14030PrvClasID[0] ;
         A14031PrvClasDsc = P09M44_A14031PrvClasDsc[0] ;
         A396EmprCod = P09M44_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A14030PrvClasID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14033ID_PrvClas );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M45 */
         pr_default.execute(3, new Object[] {AV18EmprCod, Integer.valueOf(AV19PrvNum)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A795PrvNum = P09M45_A795PrvNum[0] ;
            A396EmprCod = P09M45_A396EmprCod[0] ;
            A14030PrvClasID = P09M45_A14030PrvClasID[0] ;
            n14030PrvClasID = P09M45_n14030PrvClasID[0] ;
            AV12SelectedValue = ((0==A14030PrvClasID) ? "" : GXutil.trim( GXutil.str( A14030PrvClasID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_FPGCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item2 = AV10Combo_Data ;
      GXv_objcol_SdtDVB_SDTComboData_Item3[0] = GXt_objcol_SdtDVB_SDTComboData_Item2 ;
      new app.tforpag_dp(remoteHandle, context).execute( AV18EmprCod, GXv_objcol_SdtDVB_SDTComboData_Item3) ;
      GXt_objcol_SdtDVB_SDTComboData_Item2 = GXv_objcol_SdtDVB_SDTComboData_Item3[0] ;
      AV10Combo_Data = GXt_objcol_SdtDVB_SDTComboData_Item2 ;
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M46 */
         pr_default.execute(4, new Object[] {AV18EmprCod, Integer.valueOf(AV19PrvNum)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A795PrvNum = P09M46_A795PrvNum[0] ;
            A396EmprCod = P09M46_A396EmprCod[0] ;
            A497FpgCod = P09M46_A497FpgCod[0] ;
            n497FpgCod = P09M46_n497FpgCod[0] ;
            AV12SelectedValue = A497FpgCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         if ( GXutil.strcmp(AV15TrnMode, "GET_DSC") == 0 )
         {
            AV27GXV1 = 1 ;
            while ( AV27GXV1 <= AV10Combo_Data.size() )
            {
               AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)((app.wwpbaseobjects.SdtDVB_SDTComboData_Item)AV10Combo_Data.elementAt(-1+AV27GXV1));
               if ( GXutil.strcmp(AV11Combo_DataItem.getgxTv_SdtDVB_SDTComboData_Item_Id(), AV12SelectedValue) == 0 )
               {
                  AV17SelectedText = AV11Combo_DataItem.getgxTv_SdtDVB_SDTComboData_Item_Title() ;
                  if (true) break;
               }
               AV27GXV1 = (int)(AV27GXV1+1) ;
            }
         }
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tprvgenloaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = tprvgenloaddvcombo.this.AV17SelectedText;
      this.aP6[0] = tprvgenloaddvcombo.this.AV10Combo_Data;
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
      AV17SelectedText = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P09M42_A14032Id_Des_Cla = new String[] {""} ;
      P09M42_A9728Cod_Clas = new short[1] ;
      P09M42_n9728Cod_Clas = new boolean[] {false} ;
      P09M42_A9729Des_Clas = new String[] {""} ;
      P09M42_n9729Des_Clas = new boolean[] {false} ;
      P09M42_A396EmprCod = new String[] {""} ;
      A14032Id_Des_Cla = "" ;
      A9729Des_Clas = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09M43_A795PrvNum = new int[1] ;
      P09M43_A396EmprCod = new String[] {""} ;
      P09M43_A9728Cod_Clas = new short[1] ;
      P09M43_n9728Cod_Clas = new boolean[] {false} ;
      P09M44_A14033ID_PrvClas = new String[] {""} ;
      P09M44_A14030PrvClasID = new short[1] ;
      P09M44_n14030PrvClasID = new boolean[] {false} ;
      P09M44_A14031PrvClasDsc = new String[] {""} ;
      P09M44_A396EmprCod = new String[] {""} ;
      A14033ID_PrvClas = "" ;
      A14031PrvClasDsc = "" ;
      P09M45_A795PrvNum = new int[1] ;
      P09M45_A396EmprCod = new String[] {""} ;
      P09M45_A14030PrvClasID = new short[1] ;
      P09M45_n14030PrvClasID = new boolean[] {false} ;
      GXt_objcol_SdtDVB_SDTComboData_Item2 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item3 = new GXBaseCollection[1] ;
      P09M46_A795PrvNum = new int[1] ;
      P09M46_A396EmprCod = new String[] {""} ;
      P09M46_A497FpgCod = new String[] {""} ;
      P09M46_n497FpgCod = new boolean[] {false} ;
      A497FpgCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprvgenloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09M42_A14032Id_Des_Cla, P09M42_A9728Cod_Clas, P09M42_A9729Des_Clas, P09M42_n9729Des_Clas, P09M42_A396EmprCod
            }
            , new Object[] {
            P09M43_A795PrvNum, P09M43_A396EmprCod, P09M43_A9728Cod_Clas, P09M43_n9728Cod_Clas
            }
            , new Object[] {
            P09M44_A14033ID_PrvClas, P09M44_A14030PrvClasID, P09M44_A14031PrvClasDsc, P09M44_A396EmprCod
            }
            , new Object[] {
            P09M45_A795PrvNum, P09M45_A396EmprCod, P09M45_A14030PrvClasID, P09M45_n14030PrvClasID
            }
            , new Object[] {
            P09M46_A795PrvNum, P09M46_A396EmprCod, P09M46_A497FpgCod, P09M46_n497FpgCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A9728Cod_Clas ;
   private short A14030PrvClasID ;
   private short Gx_err ;
   private int AV19PrvNum ;
   private int A795PrvNum ;
   private int AV27GXV1 ;
   private String AV15TrnMode ;
   private String AV18EmprCod ;
   private String scmdbuf ;
   private String A14032Id_Des_Cla ;
   private String A9729Des_Clas ;
   private String A396EmprCod ;
   private String A14033ID_PrvClas ;
   private String A14031PrvClasDsc ;
   private String A497FpgCod ;
   private boolean returnInSub ;
   private boolean n9728Cod_Clas ;
   private boolean n9729Des_Clas ;
   private boolean n14030PrvClasID ;
   private boolean n497FpgCod ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String AV17SelectedText ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P09M42_A14032Id_Des_Cla ;
   private short[] P09M42_A9728Cod_Clas ;
   private boolean[] P09M42_n9728Cod_Clas ;
   private String[] P09M42_A9729Des_Clas ;
   private boolean[] P09M42_n9729Des_Clas ;
   private String[] P09M42_A396EmprCod ;
   private int[] P09M43_A795PrvNum ;
   private String[] P09M43_A396EmprCod ;
   private short[] P09M43_A9728Cod_Clas ;
   private boolean[] P09M43_n9728Cod_Clas ;
   private String[] P09M44_A14033ID_PrvClas ;
   private short[] P09M44_A14030PrvClasID ;
   private boolean[] P09M44_n14030PrvClasID ;
   private String[] P09M44_A14031PrvClasDsc ;
   private String[] P09M44_A396EmprCod ;
   private int[] P09M45_A795PrvNum ;
   private String[] P09M45_A396EmprCod ;
   private short[] P09M45_A14030PrvClasID ;
   private boolean[] P09M45_n14030PrvClasID ;
   private int[] P09M46_A795PrvNum ;
   private String[] P09M46_A396EmprCod ;
   private String[] P09M46_A497FpgCod ;
   private boolean[] P09M46_n497FpgCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item2 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item3[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tprvgenloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09M42", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(Cod_Clas,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Des_Clas, ''))) AS Id_Des_Cla, Cod_Clas, Des_Clas, EmprCod FROM TXPISOTB1 ORDER BY Id_Des_Cla ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M43", "SELECT PrvNum, EmprCod, Cod_Clas FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M44", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvClasID,'9990'), 2))) || '-' || RTRIM(LTRIM(PrvClasDsc)) AS ID_PrvClas, PrvClasID, PrvClasDsc, EmprCod FROM TXPCLAPRV ORDER BY ID_PrvClas ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M45", "SELECT PrvNum, EmprCod, PrvClasID FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M46", "SELECT PrvNum, EmprCod, FpgCod FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 65);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
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

