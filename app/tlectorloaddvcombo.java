package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tlectorloaddvcombo extends GXProcedure
{
   public tlectorloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlectorloaddvcombo.class ), "" );
   }

   public tlectorloaddvcombo( int remoteHandle ,
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
      tlectorloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tlectorloaddvcombo.this.AV12ComboName = aP0;
      tlectorloaddvcombo.this.AV13TrnMode = aP1;
      tlectorloaddvcombo.this.AV14EmprCod = aP2;
      tlectorloaddvcombo.this.AV15LecMaqCod = aP3;
      tlectorloaddvcombo.this.aP4 = aP4;
      tlectorloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "LecOpeCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LECOPECOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "LecParCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LECPARCOD' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "LecFasCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LECFASCOD' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "LecMaqCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LECMAQCOD' */
         S141 ();
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
      /* 'LOADCOMBOITEMS_LECOPECOD' Routine */
      returnInSub = false ;
      /* Using cursor P09YI2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13748OpeCNom = P09YI2_A13748OpeCNom[0] ;
         A652OpeCod = P09YI2_A652OpeCod[0] ;
         A653OpeNom = P09YI2_A653OpeNom[0] ;
         n653OpeNom = P09YI2_n653OpeNom[0] ;
         A396EmprCod = P09YI2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13748OpeCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09YI3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, AV15LecMaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1166LecMaqCod = P09YI3_A1166LecMaqCod[0] ;
            A396EmprCod = P09YI3_A396EmprCod[0] ;
            A1170LecOpeCod = P09YI3_A1170LecOpeCod[0] ;
            n1170LecOpeCod = P09YI3_n1170LecOpeCod[0] ;
            AV16SelectedValue = ((0==A1170LecOpeCod) ? "" : GXutil.trim( GXutil.str( A1170LecOpeCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_LECPARCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09YI4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13824ParCodNomI = P09YI4_A13824ParCodNomI[0] ;
         A656ParCod = P09YI4_A656ParCod[0] ;
         A867ParCodNom = P09YI4_A867ParCodNom[0] ;
         n867ParCodNom = P09YI4_n867ParCodNom[0] ;
         A396EmprCod = P09YI4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A656ParCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13824ParCodNomI );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09YI5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, AV15LecMaqCod});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1166LecMaqCod = P09YI5_A1166LecMaqCod[0] ;
            A396EmprCod = P09YI5_A396EmprCod[0] ;
            A1172LecParCod = P09YI5_A1172LecParCod[0] ;
            n1172LecParCod = P09YI5_n1172LecParCod[0] ;
            AV16SelectedValue = ((0==A1172LecParCod) ? "" : GXutil.trim( GXutil.str( A1172LecParCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_LECFASCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09YI6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13781FasCDsc = P09YI6_A13781FasCDsc[0] ;
         A457FasCod = P09YI6_A457FasCod[0] ;
         A460FasDsc = P09YI6_A460FasDsc[0] ;
         A396EmprCod = P09YI6_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13781FasCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09YI7 */
         pr_default.execute(5, new Object[] {AV14EmprCod, AV15LecMaqCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A1166LecMaqCod = P09YI7_A1166LecMaqCod[0] ;
            A396EmprCod = P09YI7_A396EmprCod[0] ;
            A1171LecFasCod = P09YI7_A1171LecFasCod[0] ;
            n1171LecFasCod = P09YI7_n1171LecFasCod[0] ;
            AV16SelectedValue = A1171LecFasCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_LECMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09YI8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A607MaqEst = P09YI8_A607MaqEst[0] ;
         n607MaqEst = P09YI8_n607MaqEst[0] ;
         A13734MaqCDsc = P09YI8_A13734MaqCDsc[0] ;
         A602MaqCod = P09YI8_A602MaqCod[0] ;
         A606MaqDsc = P09YI8_A606MaqDsc[0] ;
         n606MaqDsc = P09YI8_n606MaqDsc[0] ;
         A396EmprCod = P09YI8_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09YI9 */
         pr_default.execute(7, new Object[] {AV14EmprCod, AV15LecMaqCod});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A1166LecMaqCod = P09YI9_A1166LecMaqCod[0] ;
            A396EmprCod = P09YI9_A396EmprCod[0] ;
            AV16SelectedValue = A1166LecMaqCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV15LecMaqCod)==0) )
         {
            AV16SelectedValue = AV15LecMaqCod ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = tlectorloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tlectorloaddvcombo.this.AV10Combo_Data;
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
      P09YI2_A13748OpeCNom = new String[] {""} ;
      P09YI2_A652OpeCod = new int[1] ;
      P09YI2_A653OpeNom = new String[] {""} ;
      P09YI2_n653OpeNom = new boolean[] {false} ;
      P09YI2_A396EmprCod = new String[] {""} ;
      A13748OpeCNom = "" ;
      A653OpeNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09YI3_A1166LecMaqCod = new String[] {""} ;
      P09YI3_A396EmprCod = new String[] {""} ;
      P09YI3_A1170LecOpeCod = new int[1] ;
      P09YI3_n1170LecOpeCod = new boolean[] {false} ;
      A1166LecMaqCod = "" ;
      P09YI4_A13824ParCodNomI = new String[] {""} ;
      P09YI4_A656ParCod = new short[1] ;
      P09YI4_A867ParCodNom = new String[] {""} ;
      P09YI4_n867ParCodNom = new boolean[] {false} ;
      P09YI4_A396EmprCod = new String[] {""} ;
      A13824ParCodNomI = "" ;
      A867ParCodNom = "" ;
      P09YI5_A1166LecMaqCod = new String[] {""} ;
      P09YI5_A396EmprCod = new String[] {""} ;
      P09YI5_A1172LecParCod = new short[1] ;
      P09YI5_n1172LecParCod = new boolean[] {false} ;
      P09YI6_A13781FasCDsc = new String[] {""} ;
      P09YI6_A457FasCod = new String[] {""} ;
      P09YI6_A460FasDsc = new String[] {""} ;
      P09YI6_A396EmprCod = new String[] {""} ;
      A13781FasCDsc = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      P09YI7_A1166LecMaqCod = new String[] {""} ;
      P09YI7_A396EmprCod = new String[] {""} ;
      P09YI7_A1171LecFasCod = new String[] {""} ;
      P09YI7_n1171LecFasCod = new boolean[] {false} ;
      A1171LecFasCod = "" ;
      P09YI8_A607MaqEst = new String[] {""} ;
      P09YI8_n607MaqEst = new boolean[] {false} ;
      P09YI8_A13734MaqCDsc = new String[] {""} ;
      P09YI8_A602MaqCod = new String[] {""} ;
      P09YI8_A606MaqDsc = new String[] {""} ;
      P09YI8_n606MaqDsc = new boolean[] {false} ;
      P09YI8_A396EmprCod = new String[] {""} ;
      A607MaqEst = "" ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      P09YI9_A1166LecMaqCod = new String[] {""} ;
      P09YI9_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlectorloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09YI2_A13748OpeCNom, P09YI2_A652OpeCod, P09YI2_A653OpeNom, P09YI2_n653OpeNom, P09YI2_A396EmprCod
            }
            , new Object[] {
            P09YI3_A1166LecMaqCod, P09YI3_A396EmprCod, P09YI3_A1170LecOpeCod, P09YI3_n1170LecOpeCod
            }
            , new Object[] {
            P09YI4_A13824ParCodNomI, P09YI4_A656ParCod, P09YI4_A867ParCodNom, P09YI4_n867ParCodNom, P09YI4_A396EmprCod
            }
            , new Object[] {
            P09YI5_A1166LecMaqCod, P09YI5_A396EmprCod, P09YI5_A1172LecParCod, P09YI5_n1172LecParCod
            }
            , new Object[] {
            P09YI6_A13781FasCDsc, P09YI6_A457FasCod, P09YI6_A460FasDsc, P09YI6_A396EmprCod
            }
            , new Object[] {
            P09YI7_A1166LecMaqCod, P09YI7_A396EmprCod, P09YI7_A1171LecFasCod, P09YI7_n1171LecFasCod
            }
            , new Object[] {
            P09YI8_A607MaqEst, P09YI8_n607MaqEst, P09YI8_A13734MaqCDsc, P09YI8_A602MaqCod, P09YI8_A606MaqDsc, P09YI8_n606MaqDsc, P09YI8_A396EmprCod
            }
            , new Object[] {
            P09YI9_A1166LecMaqCod, P09YI9_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A656ParCod ;
   private short A1172LecParCod ;
   private short Gx_err ;
   private int A652OpeCod ;
   private int A1170LecOpeCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV15LecMaqCod ;
   private String scmdbuf ;
   private String A653OpeNom ;
   private String A396EmprCod ;
   private String A1166LecMaqCod ;
   private String A867ParCodNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A1171LecFasCod ;
   private String A607MaqEst ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private boolean returnInSub ;
   private boolean n653OpeNom ;
   private boolean n1170LecOpeCod ;
   private boolean n867ParCodNom ;
   private boolean n1172LecParCod ;
   private boolean n1171LecFasCod ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13748OpeCNom ;
   private String A13824ParCodNomI ;
   private String A13781FasCDsc ;
   private String A13734MaqCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09YI2_A13748OpeCNom ;
   private int[] P09YI2_A652OpeCod ;
   private String[] P09YI2_A653OpeNom ;
   private boolean[] P09YI2_n653OpeNom ;
   private String[] P09YI2_A396EmprCod ;
   private String[] P09YI3_A1166LecMaqCod ;
   private String[] P09YI3_A396EmprCod ;
   private int[] P09YI3_A1170LecOpeCod ;
   private boolean[] P09YI3_n1170LecOpeCod ;
   private String[] P09YI4_A13824ParCodNomI ;
   private short[] P09YI4_A656ParCod ;
   private String[] P09YI4_A867ParCodNom ;
   private boolean[] P09YI4_n867ParCodNom ;
   private String[] P09YI4_A396EmprCod ;
   private String[] P09YI5_A1166LecMaqCod ;
   private String[] P09YI5_A396EmprCod ;
   private short[] P09YI5_A1172LecParCod ;
   private boolean[] P09YI5_n1172LecParCod ;
   private String[] P09YI6_A13781FasCDsc ;
   private String[] P09YI6_A457FasCod ;
   private String[] P09YI6_A460FasDsc ;
   private String[] P09YI6_A396EmprCod ;
   private String[] P09YI7_A1166LecMaqCod ;
   private String[] P09YI7_A396EmprCod ;
   private String[] P09YI7_A1171LecFasCod ;
   private boolean[] P09YI7_n1171LecFasCod ;
   private String[] P09YI8_A607MaqEst ;
   private boolean[] P09YI8_n607MaqEst ;
   private String[] P09YI8_A13734MaqCDsc ;
   private String[] P09YI8_A602MaqCod ;
   private String[] P09YI8_A606MaqDsc ;
   private boolean[] P09YI8_n606MaqDsc ;
   private String[] P09YI8_A396EmprCod ;
   private String[] P09YI9_A1166LecMaqCod ;
   private String[] P09YI9_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tlectorloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YI2", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, OpeCod, OpeNom, EmprCod FROM TXPOPERAR ORDER BY OpeCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YI3", "SELECT LecMaqCod, EmprCod, LecOpeCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09YI4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ParCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ParCodNom, ''))) AS ParCodNomI, ParCod, ParCodNom, EmprCod FROM TXPCODPAR ORDER BY ParCodNomI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YI5", "SELECT LecMaqCod, EmprCod, LecParCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09YI6", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, FasCod, FasDsc, EmprCod FROM TXPFASPRO ORDER BY FasCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YI7", "SELECT LecMaqCod, EmprCod, LecFasCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09YI8", "SELECT MaqEst, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN WHERE MaqEst = 'A' ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09YI9", "SELECT LecMaqCod, EmprCod FROM TXPLECTOR WHERE EmprCod = ? and LecMaqCod = ? ORDER BY EmprCod, LecMaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

