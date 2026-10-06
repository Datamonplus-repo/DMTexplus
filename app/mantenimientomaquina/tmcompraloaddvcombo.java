package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmcompraloaddvcombo extends GXProcedure
{
   public tmcompraloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmcompraloaddvcombo.class ), "" );
   }

   public tmcompraloaddvcombo( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    long aP3 ,
                                                                                    String[] aP4 )
   {
      tmcompraloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        long aP3 ,
                        String[] aP4 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             long aP3 ,
                             String[] aP4 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 )
   {
      tmcompraloaddvcombo.this.AV12ComboName = aP0;
      tmcompraloaddvcombo.this.AV13TrnMode = aP1;
      tmcompraloaddvcombo.this.AV14EmprCod = aP2;
      tmcompraloaddvcombo.this.AV15MComCod = aP3;
      tmcompraloaddvcombo.this.aP4 = aP4;
      tmcompraloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "MRCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MRCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "PrvNum") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRVNUM' */
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
      /* 'LOADCOMBOITEMS_MRCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A4H2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12850MRActivo = P0A4H2_A12850MRActivo[0] ;
         n12850MRActivo = P0A4H2_n12850MRActivo[0] ;
         A396EmprCod = P0A4H2_A396EmprCod[0] ;
         A9493MRNom = P0A4H2_A9493MRNom[0] ;
         n9493MRNom = P0A4H2_n9493MRNom[0] ;
         A9492MRCod = P0A4H2_A9492MRCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A9492MRCod), "ZZZZZZZ9"))+"-"+GXutil.trim( A9493MRNom) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_PRVNUM' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV10Combo_Data.sort("Title");
         if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
         {
            /* Using cursor P0A4H3 */
            pr_default.execute(1, new Object[] {AV14EmprCod, Long.valueOf(AV15MComCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A11055MComCod = P0A4H3_A11055MComCod[0] ;
               A396EmprCod = P0A4H3_A396EmprCod[0] ;
               A795PrvNum = P0A4H3_A795PrvNum[0] ;
               n795PrvNum = P0A4H3_n795PrvNum[0] ;
               AV16SelectedValue = ((0==A795PrvNum) ? "" : GXutil.trim( GXutil.str( A795PrvNum, 6, 0))) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
         }
      }
      AV10Combo_Data.sort("Title");
      AV10Combo_Data.clear();
      /* Using cursor P0A4H4 */
      pr_default.execute(2, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14216PrvAct = P0A4H4_A14216PrvAct[0] ;
         A396EmprCod = P0A4H4_A396EmprCod[0] ;
         A794PrvNom = P0A4H4_A794PrvNom[0] ;
         n794PrvNom = P0A4H4_n794PrvNom[0] ;
         A795PrvNum = P0A4H4_A795PrvNum[0] ;
         n795PrvNum = P0A4H4_n795PrvNum[0] ;
         A13719PrvNNom = GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) + " - " + GXutil.trim( A794PrvNom) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( A795PrvNum, 6, 0) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13719PrvNNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P0A4H5 */
      pr_default.execute(3, new Object[] {AV14EmprCod, Long.valueOf(AV15MComCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A795PrvNum = P0A4H5_A795PrvNum[0] ;
         n795PrvNum = P0A4H5_n795PrvNum[0] ;
         A11055MComCod = P0A4H5_A11055MComCod[0] ;
         A396EmprCod = P0A4H5_A396EmprCod[0] ;
         AV16SelectedValue = ((0==A795PrvNum) ? "" : GXutil.trim( GXutil.str( A795PrvNum, 6, 0))) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP4[0] = tmcompraloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tmcompraloaddvcombo.this.AV10Combo_Data;
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
      P0A4H2_A12850MRActivo = new String[] {""} ;
      P0A4H2_n12850MRActivo = new boolean[] {false} ;
      P0A4H2_A396EmprCod = new String[] {""} ;
      P0A4H2_A9493MRNom = new String[] {""} ;
      P0A4H2_n9493MRNom = new boolean[] {false} ;
      P0A4H2_A9492MRCod = new int[1] ;
      A12850MRActivo = "" ;
      A396EmprCod = "" ;
      A9493MRNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A4H3_A11055MComCod = new long[1] ;
      P0A4H3_A396EmprCod = new String[] {""} ;
      P0A4H3_A795PrvNum = new int[1] ;
      P0A4H3_n795PrvNum = new boolean[] {false} ;
      P0A4H4_A14216PrvAct = new String[] {""} ;
      P0A4H4_A396EmprCod = new String[] {""} ;
      P0A4H4_A794PrvNom = new String[] {""} ;
      P0A4H4_n794PrvNom = new boolean[] {false} ;
      P0A4H4_A795PrvNum = new int[1] ;
      P0A4H4_n795PrvNum = new boolean[] {false} ;
      A14216PrvAct = "" ;
      A794PrvNom = "" ;
      A13719PrvNNom = "" ;
      P0A4H5_A795PrvNum = new int[1] ;
      P0A4H5_n795PrvNum = new boolean[] {false} ;
      P0A4H5_A11055MComCod = new long[1] ;
      P0A4H5_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcompraloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A4H2_A12850MRActivo, P0A4H2_n12850MRActivo, P0A4H2_A396EmprCod, P0A4H2_A9493MRNom, P0A4H2_n9493MRNom, P0A4H2_A9492MRCod
            }
            , new Object[] {
            P0A4H3_A11055MComCod, P0A4H3_A396EmprCod, P0A4H3_A795PrvNum, P0A4H3_n795PrvNum
            }
            , new Object[] {
            P0A4H4_A14216PrvAct, P0A4H4_A396EmprCod, P0A4H4_A794PrvNom, P0A4H4_n794PrvNom, P0A4H4_A795PrvNum
            }
            , new Object[] {
            P0A4H5_A795PrvNum, P0A4H5_n795PrvNum, P0A4H5_A11055MComCod, P0A4H5_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A9492MRCod ;
   private int A795PrvNum ;
   private long AV15MComCod ;
   private long A11055MComCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A12850MRActivo ;
   private String A396EmprCod ;
   private String A9493MRNom ;
   private String A14216PrvAct ;
   private String A794PrvNom ;
   private boolean returnInSub ;
   private boolean n12850MRActivo ;
   private boolean n9493MRNom ;
   private boolean n795PrvNum ;
   private boolean n794PrvNom ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13719PrvNNom ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A4H2_A12850MRActivo ;
   private boolean[] P0A4H2_n12850MRActivo ;
   private String[] P0A4H2_A396EmprCod ;
   private String[] P0A4H2_A9493MRNom ;
   private boolean[] P0A4H2_n9493MRNom ;
   private int[] P0A4H2_A9492MRCod ;
   private long[] P0A4H3_A11055MComCod ;
   private String[] P0A4H3_A396EmprCod ;
   private int[] P0A4H3_A795PrvNum ;
   private boolean[] P0A4H3_n795PrvNum ;
   private String[] P0A4H4_A14216PrvAct ;
   private String[] P0A4H4_A396EmprCod ;
   private String[] P0A4H4_A794PrvNom ;
   private boolean[] P0A4H4_n794PrvNom ;
   private int[] P0A4H4_A795PrvNum ;
   private boolean[] P0A4H4_n795PrvNum ;
   private int[] P0A4H5_A795PrvNum ;
   private boolean[] P0A4H5_n795PrvNum ;
   private long[] P0A4H5_A11055MComCod ;
   private String[] P0A4H5_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmcompraloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A4H2", "SELECT MRActivo, EmprCod, MRNom, MRCod FROM TXPMREPUE WHERE (EmprCod = ?) AND (MRActivo = 'S') ORDER BY EmprCod, MRCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A4H3", "SELECT MComCod, EmprCod, PrvNum FROM TXPMRepCo WHERE EmprCod = ? and MComCod = ? ORDER BY EmprCod, MComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A4H4", "SELECT PrvAct, EmprCod, PrvNom, PrvNum FROM TXPPRVGEN WHERE (EmprCod = ?) AND (PrvAct = 'S') ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A4H5", "SELECT PrvNum, MComCod, EmprCod FROM TXPMRepCo WHERE (EmprCod = ? and MComCod = ?) AND (Not (PrvNum = 0)) ORDER BY EmprCod, MComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

