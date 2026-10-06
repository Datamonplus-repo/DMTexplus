package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccseriloaddvcombo extends GXProcedure
{
   public controlcalidad_ccseriloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccseriloaddvcombo.class ), "" );
   }

   public controlcalidad_ccseriloaddvcombo( int remoteHandle ,
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
                                                                                    String aP5 ,
                                                                                    int aP6 ,
                                                                                    String[] aP7 )
   {
      controlcalidad_ccseriloaddvcombo.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String aP5 ,
                        int aP6 ,
                        String[] aP7 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String aP5 ,
                             int aP6 ,
                             String[] aP7 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP8 )
   {
      controlcalidad_ccseriloaddvcombo.this.AV12ComboName = aP0;
      controlcalidad_ccseriloaddvcombo.this.AV13TrnMode = aP1;
      controlcalidad_ccseriloaddvcombo.this.AV14EmprCod = aP2;
      controlcalidad_ccseriloaddvcombo.this.AV15CliCod = aP3;
      controlcalidad_ccseriloaddvcombo.this.AV16ArtCod = aP4;
      controlcalidad_ccseriloaddvcombo.this.AV17CCFColNom = aP5;
      controlcalidad_ccseriloaddvcombo.this.AV18CCFColNum = aP6;
      controlcalidad_ccseriloaddvcombo.this.aP7 = aP7;
      controlcalidad_ccseriloaddvcombo.this.aP8 = aP8;
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
      if ( GXutil.strcmp(AV12ComboName, "CliCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLICOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "ArtCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_ARTCOD' */
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
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0AOH2 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = P0AOH2_A10045CliAct[0] ;
         A396EmprCod = P0AOH2_A396EmprCod[0] ;
         A279CliNom = P0AOH2_A279CliNom[0] ;
         A252CliCod = P0AOH2_A252CliCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A252CliCod, 6, 0))+"-"+GXutil.trim( A279CliNom) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0AOH3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15CliCod), AV16ArtCod, AV17CCFColNom, Integer.valueOf(AV18CCFColNum)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4059CCFColNum = P0AOH3_A4059CCFColNum[0] ;
            A4058CCFColNom = P0AOH3_A4058CCFColNom[0] ;
            A65ArtCod = P0AOH3_A65ArtCod[0] ;
            A252CliCod = P0AOH3_A252CliCod[0] ;
            A396EmprCod = P0AOH3_A396EmprCod[0] ;
            AV19SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         if ( ! (0==AV15CliCod) )
         {
            AV19SelectedValue = GXutil.trim( GXutil.str( AV15CliCod, 6, 0)) ;
         }
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_ARTCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0AOH4 */
      pr_default.execute(2, new Object[] {AV14EmprCod, Integer.valueOf(AV15CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14295ArtActivo = P0AOH4_A14295ArtActivo[0] ;
         A252CliCod = P0AOH4_A252CliCod[0] ;
         A396EmprCod = P0AOH4_A396EmprCod[0] ;
         A69ArtDsc = P0AOH4_A69ArtDsc[0] ;
         n69ArtDsc = P0AOH4_n69ArtDsc[0] ;
         A65ArtCod = P0AOH4_A65ArtCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A65ArtCod) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A65ArtCod)+"-"+GXutil.trim( A69ArtDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0AOH5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15CliCod), AV16ArtCod, AV17CCFColNom, Integer.valueOf(AV18CCFColNum)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A4059CCFColNum = P0AOH5_A4059CCFColNum[0] ;
            A4058CCFColNom = P0AOH5_A4058CCFColNom[0] ;
            A65ArtCod = P0AOH5_A65ArtCod[0] ;
            A252CliCod = P0AOH5_A252CliCod[0] ;
            A396EmprCod = P0AOH5_A396EmprCod[0] ;
            AV19SelectedValue = A65ArtCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV16ArtCod)==0) )
         {
            AV19SelectedValue = AV16ArtCod ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP7[0] = controlcalidad_ccseriloaddvcombo.this.AV19SelectedValue;
      this.aP8[0] = controlcalidad_ccseriloaddvcombo.this.AV10Combo_Data;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19SelectedValue = "" ;
      AV10Combo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      P0AOH2_A10045CliAct = new String[] {""} ;
      P0AOH2_A396EmprCod = new String[] {""} ;
      P0AOH2_A279CliNom = new String[] {""} ;
      P0AOH2_A252CliCod = new int[1] ;
      A10045CliAct = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0AOH3_A4059CCFColNum = new int[1] ;
      P0AOH3_A4058CCFColNom = new String[] {""} ;
      P0AOH3_A65ArtCod = new String[] {""} ;
      P0AOH3_A252CliCod = new int[1] ;
      P0AOH3_A396EmprCod = new String[] {""} ;
      A4058CCFColNom = "" ;
      A65ArtCod = "" ;
      P0AOH4_A14295ArtActivo = new String[] {""} ;
      P0AOH4_A252CliCod = new int[1] ;
      P0AOH4_A396EmprCod = new String[] {""} ;
      P0AOH4_A69ArtDsc = new String[] {""} ;
      P0AOH4_n69ArtDsc = new boolean[] {false} ;
      P0AOH4_A65ArtCod = new String[] {""} ;
      A14295ArtActivo = "" ;
      A69ArtDsc = "" ;
      P0AOH5_A4059CCFColNum = new int[1] ;
      P0AOH5_A4058CCFColNom = new String[] {""} ;
      P0AOH5_A65ArtCod = new String[] {""} ;
      P0AOH5_A252CliCod = new int[1] ;
      P0AOH5_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccseriloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0AOH2_A10045CliAct, P0AOH2_A396EmprCod, P0AOH2_A279CliNom, P0AOH2_A252CliCod
            }
            , new Object[] {
            P0AOH3_A4059CCFColNum, P0AOH3_A4058CCFColNom, P0AOH3_A65ArtCod, P0AOH3_A252CliCod, P0AOH3_A396EmprCod
            }
            , new Object[] {
            P0AOH4_A14295ArtActivo, P0AOH4_A252CliCod, P0AOH4_A396EmprCod, P0AOH4_A69ArtDsc, P0AOH4_n69ArtDsc, P0AOH4_A65ArtCod
            }
            , new Object[] {
            P0AOH5_A4059CCFColNum, P0AOH5_A4058CCFColNom, P0AOH5_A65ArtCod, P0AOH5_A252CliCod, P0AOH5_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15CliCod ;
   private int AV18CCFColNum ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV16ArtCod ;
   private String AV17CCFColNom ;
   private String scmdbuf ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A4058CCFColNom ;
   private String A65ArtCod ;
   private String A14295ArtActivo ;
   private String A69ArtDsc ;
   private boolean returnInSub ;
   private boolean n69ArtDsc ;
   private String AV12ComboName ;
   private String AV19SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP8 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOH2_A10045CliAct ;
   private String[] P0AOH2_A396EmprCod ;
   private String[] P0AOH2_A279CliNom ;
   private int[] P0AOH2_A252CliCod ;
   private int[] P0AOH3_A4059CCFColNum ;
   private String[] P0AOH3_A4058CCFColNom ;
   private String[] P0AOH3_A65ArtCod ;
   private int[] P0AOH3_A252CliCod ;
   private String[] P0AOH3_A396EmprCod ;
   private String[] P0AOH4_A14295ArtActivo ;
   private int[] P0AOH4_A252CliCod ;
   private String[] P0AOH4_A396EmprCod ;
   private String[] P0AOH4_A69ArtDsc ;
   private boolean[] P0AOH4_n69ArtDsc ;
   private String[] P0AOH4_A65ArtCod ;
   private int[] P0AOH5_A4059CCFColNum ;
   private String[] P0AOH5_A4058CCFColNom ;
   private String[] P0AOH5_A65ArtCod ;
   private int[] P0AOH5_A252CliCod ;
   private String[] P0AOH5_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class controlcalidad_ccseriloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOH2", "SELECT CliAct, EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOH3", "SELECT CCFColNum, CCFColNom, ArtCod, CliCod, EmprCod FROM TXPCCSeri WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AOH4", "SELECT ArtActivo, CliCod, EmprCod, ArtDsc, ArtCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ?) AND (ArtActivo = 'S') ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AOH5", "SELECT CCFColNum, CCFColNom, ArtCod, CliCod, EmprCod FROM TXPCCSeri WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and CCFColNom = ? and CCFColNum = ? ORDER BY EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

