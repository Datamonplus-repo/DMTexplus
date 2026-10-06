package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdformuloaddvcombo extends GXProcedure
{
   public tdformuloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdformuloaddvcombo.class ), "" );
   }

   public tdformuloaddvcombo( int remoteHandle ,
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
      tdformuloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tdformuloaddvcombo.this.AV13ComboName = aP0;
      tdformuloaddvcombo.this.AV15TrnMode = aP1;
      tdformuloaddvcombo.this.AV17EmprCod = aP2;
      tdformuloaddvcombo.this.AV18ForNumCol = aP3;
      tdformuloaddvcombo.this.aP4 = aP4;
      tdformuloaddvcombo.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(AV13ComboName, "Lb_fam1") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_FAM1' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "Lb_fam2") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_FAM2' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "Lb_fam3") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_FAM3' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "Lb_TaAuxC") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_TAAUXC' */
         S151 ();
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
      /* Using cursor P09MJ2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09MJ2_A856ValCod[0] ;
         A13747PrdCDsc = P09MJ2_A13747PrdCDsc[0] ;
         A719PrdNum = P09MJ2_A719PrdNum[0] ;
         A718PrdNom = P09MJ2_A718PrdNom[0] ;
         A396EmprCod = P09MJ2_A396EmprCod[0] ;
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
      /* 'LOADCOMBOITEMS_LB_FAM1' Routine */
      returnInSub = false ;
      /* Using cursor P09MJ3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13745GrpCDsc = P09MJ3_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09MJ3_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09MJ3_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09MJ3_n500GrpFamDsc[0] ;
         A396EmprCod = P09MJ3_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09MJ4 */
         pr_default.execute(2, new Object[] {AV17EmprCod, Integer.valueOf(AV18ForNumCol)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A486ForNumCol = P09MJ4_A486ForNumCol[0] ;
            A396EmprCod = P09MJ4_A396EmprCod[0] ;
            A6369Lb_fam1 = P09MJ4_A6369Lb_fam1[0] ;
            AV12SelectedValue = ((0==A6369Lb_fam1) ? "" : GXutil.trim( GXutil.str( A6369Lb_fam1, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_LB_FAM2' Routine */
      returnInSub = false ;
      /* Using cursor P09MJ5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13745GrpCDsc = P09MJ5_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09MJ5_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09MJ5_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09MJ5_n500GrpFamDsc[0] ;
         A396EmprCod = P09MJ5_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09MJ6 */
         pr_default.execute(4, new Object[] {AV17EmprCod, Integer.valueOf(AV18ForNumCol)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A486ForNumCol = P09MJ6_A486ForNumCol[0] ;
            A396EmprCod = P09MJ6_A396EmprCod[0] ;
            A6370Lb_fam2 = P09MJ6_A6370Lb_fam2[0] ;
            AV12SelectedValue = ((0==A6370Lb_fam2) ? "" : GXutil.trim( GXutil.str( A6370Lb_fam2, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_LB_FAM3' Routine */
      returnInSub = false ;
      /* Using cursor P09MJ7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A13745GrpCDsc = P09MJ7_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09MJ7_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09MJ7_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09MJ7_n500GrpFamDsc[0] ;
         A396EmprCod = P09MJ7_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09MJ8 */
         pr_default.execute(6, new Object[] {AV17EmprCod, Integer.valueOf(AV18ForNumCol)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A486ForNumCol = P09MJ8_A486ForNumCol[0] ;
            A396EmprCod = P09MJ8_A396EmprCod[0] ;
            A6371Lb_fam3 = P09MJ8_A6371Lb_fam3[0] ;
            AV12SelectedValue = ((0==A6371Lb_fam3) ? "" : GXutil.trim( GXutil.str( A6371Lb_fam3, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_LB_TAAUXC' Routine */
      returnInSub = false ;
      /* Using cursor P09MJ9 */
      pr_default.execute(7);
      while ( (pr_default.getStatus(7) != 101) )
      {
         A13756Lb_TaAuxCD = P09MJ9_A13756Lb_TaAuxCD[0] ;
         A6310Lb_TaAuxC = P09MJ9_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = P09MJ9_n6310Lb_TaAuxC[0] ;
         A6311Lb_TaAuxD = P09MJ9_A6311Lb_TaAuxD[0] ;
         A396EmprCod = P09MJ9_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A6310Lb_TaAuxC );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13756Lb_TaAuxCD );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09MJ10 */
         pr_default.execute(8, new Object[] {AV17EmprCod, Integer.valueOf(AV18ForNumCol)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A486ForNumCol = P09MJ10_A486ForNumCol[0] ;
            A396EmprCod = P09MJ10_A396EmprCod[0] ;
            A6310Lb_TaAuxC = P09MJ10_A6310Lb_TaAuxC[0] ;
            n6310Lb_TaAuxC = P09MJ10_n6310Lb_TaAuxC[0] ;
            AV12SelectedValue = A6310Lb_TaAuxC ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tdformuloaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = tdformuloaddvcombo.this.AV10Combo_Data;
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
      P09MJ2_A856ValCod = new byte[1] ;
      P09MJ2_A13747PrdCDsc = new String[] {""} ;
      P09MJ2_A719PrdNum = new String[] {""} ;
      P09MJ2_A718PrdNom = new String[] {""} ;
      P09MJ2_A396EmprCod = new String[] {""} ;
      A13747PrdCDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09MJ3_A13745GrpCDsc = new String[] {""} ;
      P09MJ3_A499GrpFamCod = new byte[1] ;
      P09MJ3_A500GrpFamDsc = new String[] {""} ;
      P09MJ3_n500GrpFamDsc = new boolean[] {false} ;
      P09MJ3_A396EmprCod = new String[] {""} ;
      A13745GrpCDsc = "" ;
      A500GrpFamDsc = "" ;
      P09MJ4_A486ForNumCol = new int[1] ;
      P09MJ4_A396EmprCod = new String[] {""} ;
      P09MJ4_A6369Lb_fam1 = new byte[1] ;
      P09MJ5_A13745GrpCDsc = new String[] {""} ;
      P09MJ5_A499GrpFamCod = new byte[1] ;
      P09MJ5_A500GrpFamDsc = new String[] {""} ;
      P09MJ5_n500GrpFamDsc = new boolean[] {false} ;
      P09MJ5_A396EmprCod = new String[] {""} ;
      P09MJ6_A486ForNumCol = new int[1] ;
      P09MJ6_A396EmprCod = new String[] {""} ;
      P09MJ6_A6370Lb_fam2 = new byte[1] ;
      P09MJ7_A13745GrpCDsc = new String[] {""} ;
      P09MJ7_A499GrpFamCod = new byte[1] ;
      P09MJ7_A500GrpFamDsc = new String[] {""} ;
      P09MJ7_n500GrpFamDsc = new boolean[] {false} ;
      P09MJ7_A396EmprCod = new String[] {""} ;
      P09MJ8_A486ForNumCol = new int[1] ;
      P09MJ8_A396EmprCod = new String[] {""} ;
      P09MJ8_A6371Lb_fam3 = new byte[1] ;
      P09MJ9_A13756Lb_TaAuxCD = new String[] {""} ;
      P09MJ9_A6310Lb_TaAuxC = new String[] {""} ;
      P09MJ9_n6310Lb_TaAuxC = new boolean[] {false} ;
      P09MJ9_A6311Lb_TaAuxD = new String[] {""} ;
      P09MJ9_A396EmprCod = new String[] {""} ;
      A13756Lb_TaAuxCD = "" ;
      A6310Lb_TaAuxC = "" ;
      A6311Lb_TaAuxD = "" ;
      P09MJ10_A486ForNumCol = new int[1] ;
      P09MJ10_A396EmprCod = new String[] {""} ;
      P09MJ10_A6310Lb_TaAuxC = new String[] {""} ;
      P09MJ10_n6310Lb_TaAuxC = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tdformuloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09MJ2_A856ValCod, P09MJ2_A13747PrdCDsc, P09MJ2_A719PrdNum, P09MJ2_A718PrdNom, P09MJ2_A396EmprCod
            }
            , new Object[] {
            P09MJ3_A13745GrpCDsc, P09MJ3_A499GrpFamCod, P09MJ3_A500GrpFamDsc, P09MJ3_n500GrpFamDsc, P09MJ3_A396EmprCod
            }
            , new Object[] {
            P09MJ4_A486ForNumCol, P09MJ4_A396EmprCod, P09MJ4_A6369Lb_fam1
            }
            , new Object[] {
            P09MJ5_A13745GrpCDsc, P09MJ5_A499GrpFamCod, P09MJ5_A500GrpFamDsc, P09MJ5_n500GrpFamDsc, P09MJ5_A396EmprCod
            }
            , new Object[] {
            P09MJ6_A486ForNumCol, P09MJ6_A396EmprCod, P09MJ6_A6370Lb_fam2
            }
            , new Object[] {
            P09MJ7_A13745GrpCDsc, P09MJ7_A499GrpFamCod, P09MJ7_A500GrpFamDsc, P09MJ7_n500GrpFamDsc, P09MJ7_A396EmprCod
            }
            , new Object[] {
            P09MJ8_A486ForNumCol, P09MJ8_A396EmprCod, P09MJ8_A6371Lb_fam3
            }
            , new Object[] {
            P09MJ9_A13756Lb_TaAuxCD, P09MJ9_A6310Lb_TaAuxC, P09MJ9_A6311Lb_TaAuxD, P09MJ9_A396EmprCod
            }
            , new Object[] {
            P09MJ10_A486ForNumCol, P09MJ10_A396EmprCod, P09MJ10_A6310Lb_TaAuxC, P09MJ10_n6310Lb_TaAuxC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A499GrpFamCod ;
   private byte A6369Lb_fam1 ;
   private byte A6370Lb_fam2 ;
   private byte A6371Lb_fam3 ;
   private short Gx_err ;
   private int AV18ForNumCol ;
   private int A486ForNumCol ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private String A500GrpFamDsc ;
   private String A6310Lb_TaAuxC ;
   private String A6311Lb_TaAuxD ;
   private boolean returnInSub ;
   private boolean n500GrpFamDsc ;
   private boolean n6310Lb_TaAuxC ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13747PrdCDsc ;
   private String A13745GrpCDsc ;
   private String A13756Lb_TaAuxCD ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09MJ2_A856ValCod ;
   private String[] P09MJ2_A13747PrdCDsc ;
   private String[] P09MJ2_A719PrdNum ;
   private String[] P09MJ2_A718PrdNom ;
   private String[] P09MJ2_A396EmprCod ;
   private String[] P09MJ3_A13745GrpCDsc ;
   private byte[] P09MJ3_A499GrpFamCod ;
   private String[] P09MJ3_A500GrpFamDsc ;
   private boolean[] P09MJ3_n500GrpFamDsc ;
   private String[] P09MJ3_A396EmprCod ;
   private int[] P09MJ4_A486ForNumCol ;
   private String[] P09MJ4_A396EmprCod ;
   private byte[] P09MJ4_A6369Lb_fam1 ;
   private String[] P09MJ5_A13745GrpCDsc ;
   private byte[] P09MJ5_A499GrpFamCod ;
   private String[] P09MJ5_A500GrpFamDsc ;
   private boolean[] P09MJ5_n500GrpFamDsc ;
   private String[] P09MJ5_A396EmprCod ;
   private int[] P09MJ6_A486ForNumCol ;
   private String[] P09MJ6_A396EmprCod ;
   private byte[] P09MJ6_A6370Lb_fam2 ;
   private String[] P09MJ7_A13745GrpCDsc ;
   private byte[] P09MJ7_A499GrpFamCod ;
   private String[] P09MJ7_A500GrpFamDsc ;
   private boolean[] P09MJ7_n500GrpFamDsc ;
   private String[] P09MJ7_A396EmprCod ;
   private int[] P09MJ8_A486ForNumCol ;
   private String[] P09MJ8_A396EmprCod ;
   private byte[] P09MJ8_A6371Lb_fam3 ;
   private String[] P09MJ9_A13756Lb_TaAuxCD ;
   private String[] P09MJ9_A6310Lb_TaAuxC ;
   private boolean[] P09MJ9_n6310Lb_TaAuxC ;
   private String[] P09MJ9_A6311Lb_TaAuxD ;
   private String[] P09MJ9_A396EmprCod ;
   private int[] P09MJ10_A486ForNumCol ;
   private String[] P09MJ10_A396EmprCod ;
   private String[] P09MJ10_A6310Lb_TaAuxC ;
   private boolean[] P09MJ10_n6310Lb_TaAuxC ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tdformuloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09MJ2", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE ValCod >= 1 and ValCod <= 2 and SUBSTR(PrdNum, 1, 1) <> '#' and SUBSTR(PrdNum, 1, 1) <> 'C' ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MJ3", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MJ4", "SELECT ForNumCol, EmprCod, Lb_fam1 FROM TXPCDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09MJ5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MJ6", "SELECT ForNumCol, EmprCod, Lb_fam2 FROM TXPCDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09MJ7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MJ8", "SELECT ForNumCol, EmprCod, Lb_fam3 FROM TXPCDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09MJ9", "SELECT RTRIM(LTRIM(Lb_TaAuxC)) || '-' || RTRIM(LTRIM(Lb_TaAuxD)) AS Lb_TaAuxCD, Lb_TaAuxC, Lb_TaAuxD, EmprCod FROM TXPENS005 ORDER BY Lb_TaAuxCD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MJ10", "SELECT ForNumCol, EmprCod, Lb_TaAuxC FROM TXPCDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

