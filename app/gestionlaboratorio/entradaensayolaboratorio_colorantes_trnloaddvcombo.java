package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorio_colorantes_trnloaddvcombo extends GXProcedure
{
   public entradaensayolaboratorio_colorantes_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorio_colorantes_trnloaddvcombo.class ), "" );
   }

   public entradaensayolaboratorio_colorantes_trnloaddvcombo( int remoteHandle ,
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
      entradaensayolaboratorio_colorantes_trnloaddvcombo.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      entradaensayolaboratorio_colorantes_trnloaddvcombo.this.AV12ComboName = aP0;
      entradaensayolaboratorio_colorantes_trnloaddvcombo.this.AV13TrnMode = aP1;
      entradaensayolaboratorio_colorantes_trnloaddvcombo.this.AV14EmprCod = aP2;
      entradaensayolaboratorio_colorantes_trnloaddvcombo.this.AV15Lb_numero = aP3;
      entradaensayolaboratorio_colorantes_trnloaddvcombo.this.AV16Lb_opcion = aP4;
      entradaensayolaboratorio_colorantes_trnloaddvcombo.this.aP5 = aP5;
      entradaensayolaboratorio_colorantes_trnloaddvcombo.this.aP6 = aP6;
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
      else if ( GXutil.strcmp(AV12ComboName, "ForPrdUMe") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FORPRDUME' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "Lb_TaAuxC") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_TAAUXC' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "Lb_famc1") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_FAMC1' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "Lb_famc2") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_FAMC2' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "Lb_famc3") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_FAMC3' */
         S161 ();
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
      if ( 1 == 2 )
      {
         /* Using cursor P09PG2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A856ValCod = P09PG2_A856ValCod[0] ;
            A13747PrdCDsc = P09PG2_A13747PrdCDsc[0] ;
            A719PrdNum = P09PG2_A719PrdNum[0] ;
            A718PrdNom = P09PG2_A718PrdNom[0] ;
            A396EmprCod = P09PG2_A396EmprCod[0] ;
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
            AV10Combo_Data.add(AV11Combo_DataItem, 0);
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      /* Using cursor P09PG3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A856ValCod = P09PG3_A856ValCod[0] ;
         A13747PrdCDsc = P09PG3_A13747PrdCDsc[0] ;
         A719PrdNum = P09PG3_A719PrdNum[0] ;
         A718PrdNom = P09PG3_A718PrdNom[0] ;
         A396EmprCod = P09PG3_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         GXt_int2 = (byte)(0) ;
         GXv_int3[0] = GXt_int2 ;
         new app.getprocutosituacionvalidez(remoteHandle, context).execute( AV14EmprCod, A719PrdNum, GXv_int3) ;
         entradaensayolaboratorio_colorantes_trnloaddvcombo.this.GXt_int2 = GXv_int3[0] ;
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( ((GXt_int2==3) ? GXutil.format( "%1 (%2)", A13747PrdCDsc, httpContext.getMessage( "SUPRIMIDO", ""), "", "", "", "", "", "", "") : A13747PrdCDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_FORPRDUME' Routine */
      returnInSub = false ;
      /* Using cursor P09PG4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13746ForPrdCDsc = P09PG4_A13746ForPrdCDsc[0] ;
         A490ForPrdUMe = P09PG4_A490ForPrdUMe[0] ;
         A488ForPrdDsc = P09PG4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09PG4_n488ForPrdDsc[0] ;
         A396EmprCod = P09PG4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13746ForPrdCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_LB_TAAUXC' Routine */
      returnInSub = false ;
      /* Using cursor P09PG5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13756Lb_TaAuxCD = P09PG5_A13756Lb_TaAuxCD[0] ;
         A6310Lb_TaAuxC = P09PG5_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = P09PG5_n6310Lb_TaAuxC[0] ;
         A6311Lb_TaAuxD = P09PG5_A6311Lb_TaAuxD[0] ;
         A396EmprCod = P09PG5_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A6310Lb_TaAuxC );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13756Lb_TaAuxCD );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09PG6 */
         pr_default.execute(4, new Object[] {AV14EmprCod, Integer.valueOf(AV15Lb_numero), AV16Lb_opcion});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A5555Lb_opcion = P09PG6_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09PG6_A5532Lb_numero[0] ;
            A396EmprCod = P09PG6_A396EmprCod[0] ;
            A6310Lb_TaAuxC = P09PG6_A6310Lb_TaAuxC[0] ;
            n6310Lb_TaAuxC = P09PG6_n6310Lb_TaAuxC[0] ;
            AV17SelectedValue = A6310Lb_TaAuxC ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_LB_FAMC1' Routine */
      returnInSub = false ;
      /* Using cursor P09PG7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A13745GrpCDsc = P09PG7_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09PG7_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09PG7_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09PG7_n500GrpFamDsc[0] ;
         A396EmprCod = P09PG7_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09PG8 */
         pr_default.execute(6, new Object[] {AV14EmprCod, Integer.valueOf(AV15Lb_numero), AV16Lb_opcion});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A5555Lb_opcion = P09PG8_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09PG8_A5532Lb_numero[0] ;
            A396EmprCod = P09PG8_A396EmprCod[0] ;
            A6373Lb_famc1 = P09PG8_A6373Lb_famc1[0] ;
            AV17SelectedValue = ((0==A6373Lb_famc1) ? "" : GXutil.trim( GXutil.str( A6373Lb_famc1, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_LB_FAMC2' Routine */
      returnInSub = false ;
      /* Using cursor P09PG9 */
      pr_default.execute(7);
      while ( (pr_default.getStatus(7) != 101) )
      {
         A13745GrpCDsc = P09PG9_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09PG9_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09PG9_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09PG9_n500GrpFamDsc[0] ;
         A396EmprCod = P09PG9_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09PG10 */
         pr_default.execute(8, new Object[] {AV14EmprCod, Integer.valueOf(AV15Lb_numero), AV16Lb_opcion});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A5555Lb_opcion = P09PG10_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09PG10_A5532Lb_numero[0] ;
            A396EmprCod = P09PG10_A396EmprCod[0] ;
            A6374Lb_famc2 = P09PG10_A6374Lb_famc2[0] ;
            AV17SelectedValue = ((0==A6374Lb_famc2) ? "" : GXutil.trim( GXutil.str( A6374Lb_famc2, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_LB_FAMC3' Routine */
      returnInSub = false ;
      /* Using cursor P09PG11 */
      pr_default.execute(9);
      while ( (pr_default.getStatus(9) != 101) )
      {
         A13745GrpCDsc = P09PG11_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09PG11_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09PG11_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09PG11_n500GrpFamDsc[0] ;
         A396EmprCod = P09PG11_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09PG12 */
         pr_default.execute(10, new Object[] {AV14EmprCod, Integer.valueOf(AV15Lb_numero), AV16Lb_opcion});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A5555Lb_opcion = P09PG12_A5555Lb_opcion[0] ;
            A5532Lb_numero = P09PG12_A5532Lb_numero[0] ;
            A396EmprCod = P09PG12_A396EmprCod[0] ;
            A6375Lb_famc3 = P09PG12_A6375Lb_famc3[0] ;
            AV17SelectedValue = ((0==A6375Lb_famc3) ? "" : GXutil.trim( GXutil.str( A6375Lb_famc3, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
      }
   }

   protected void cleanup( )
   {
      this.aP5[0] = entradaensayolaboratorio_colorantes_trnloaddvcombo.this.AV17SelectedValue;
      this.aP6[0] = entradaensayolaboratorio_colorantes_trnloaddvcombo.this.AV10Combo_Data;
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
      P09PG2_A856ValCod = new byte[1] ;
      P09PG2_A13747PrdCDsc = new String[] {""} ;
      P09PG2_A719PrdNum = new String[] {""} ;
      P09PG2_A718PrdNom = new String[] {""} ;
      P09PG2_A396EmprCod = new String[] {""} ;
      A13747PrdCDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09PG3_A856ValCod = new byte[1] ;
      P09PG3_A13747PrdCDsc = new String[] {""} ;
      P09PG3_A719PrdNum = new String[] {""} ;
      P09PG3_A718PrdNom = new String[] {""} ;
      P09PG3_A396EmprCod = new String[] {""} ;
      GXv_int3 = new byte[1] ;
      P09PG4_A13746ForPrdCDsc = new String[] {""} ;
      P09PG4_A490ForPrdUMe = new byte[1] ;
      P09PG4_A488ForPrdDsc = new String[] {""} ;
      P09PG4_n488ForPrdDsc = new boolean[] {false} ;
      P09PG4_A396EmprCod = new String[] {""} ;
      A13746ForPrdCDsc = "" ;
      A488ForPrdDsc = "" ;
      P09PG5_A13756Lb_TaAuxCD = new String[] {""} ;
      P09PG5_A6310Lb_TaAuxC = new String[] {""} ;
      P09PG5_n6310Lb_TaAuxC = new boolean[] {false} ;
      P09PG5_A6311Lb_TaAuxD = new String[] {""} ;
      P09PG5_A396EmprCod = new String[] {""} ;
      A13756Lb_TaAuxCD = "" ;
      A6310Lb_TaAuxC = "" ;
      A6311Lb_TaAuxD = "" ;
      P09PG6_A5555Lb_opcion = new String[] {""} ;
      P09PG6_A5532Lb_numero = new int[1] ;
      P09PG6_A396EmprCod = new String[] {""} ;
      P09PG6_A6310Lb_TaAuxC = new String[] {""} ;
      P09PG6_n6310Lb_TaAuxC = new boolean[] {false} ;
      A5555Lb_opcion = "" ;
      P09PG7_A13745GrpCDsc = new String[] {""} ;
      P09PG7_A499GrpFamCod = new byte[1] ;
      P09PG7_A500GrpFamDsc = new String[] {""} ;
      P09PG7_n500GrpFamDsc = new boolean[] {false} ;
      P09PG7_A396EmprCod = new String[] {""} ;
      A13745GrpCDsc = "" ;
      A500GrpFamDsc = "" ;
      P09PG8_A5555Lb_opcion = new String[] {""} ;
      P09PG8_A5532Lb_numero = new int[1] ;
      P09PG8_A396EmprCod = new String[] {""} ;
      P09PG8_A6373Lb_famc1 = new byte[1] ;
      P09PG9_A13745GrpCDsc = new String[] {""} ;
      P09PG9_A499GrpFamCod = new byte[1] ;
      P09PG9_A500GrpFamDsc = new String[] {""} ;
      P09PG9_n500GrpFamDsc = new boolean[] {false} ;
      P09PG9_A396EmprCod = new String[] {""} ;
      P09PG10_A5555Lb_opcion = new String[] {""} ;
      P09PG10_A5532Lb_numero = new int[1] ;
      P09PG10_A396EmprCod = new String[] {""} ;
      P09PG10_A6374Lb_famc2 = new byte[1] ;
      P09PG11_A13745GrpCDsc = new String[] {""} ;
      P09PG11_A499GrpFamCod = new byte[1] ;
      P09PG11_A500GrpFamDsc = new String[] {""} ;
      P09PG11_n500GrpFamDsc = new boolean[] {false} ;
      P09PG11_A396EmprCod = new String[] {""} ;
      P09PG12_A5555Lb_opcion = new String[] {""} ;
      P09PG12_A5532Lb_numero = new int[1] ;
      P09PG12_A396EmprCod = new String[] {""} ;
      P09PG12_A6375Lb_famc3 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_colorantes_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09PG2_A856ValCod, P09PG2_A13747PrdCDsc, P09PG2_A719PrdNum, P09PG2_A718PrdNom, P09PG2_A396EmprCod
            }
            , new Object[] {
            P09PG3_A856ValCod, P09PG3_A13747PrdCDsc, P09PG3_A719PrdNum, P09PG3_A718PrdNom, P09PG3_A396EmprCod
            }
            , new Object[] {
            P09PG4_A13746ForPrdCDsc, P09PG4_A490ForPrdUMe, P09PG4_A488ForPrdDsc, P09PG4_n488ForPrdDsc, P09PG4_A396EmprCod
            }
            , new Object[] {
            P09PG5_A13756Lb_TaAuxCD, P09PG5_A6310Lb_TaAuxC, P09PG5_A6311Lb_TaAuxD, P09PG5_A396EmprCod
            }
            , new Object[] {
            P09PG6_A5555Lb_opcion, P09PG6_A5532Lb_numero, P09PG6_A396EmprCod, P09PG6_A6310Lb_TaAuxC, P09PG6_n6310Lb_TaAuxC
            }
            , new Object[] {
            P09PG7_A13745GrpCDsc, P09PG7_A499GrpFamCod, P09PG7_A500GrpFamDsc, P09PG7_n500GrpFamDsc, P09PG7_A396EmprCod
            }
            , new Object[] {
            P09PG8_A5555Lb_opcion, P09PG8_A5532Lb_numero, P09PG8_A396EmprCod, P09PG8_A6373Lb_famc1
            }
            , new Object[] {
            P09PG9_A13745GrpCDsc, P09PG9_A499GrpFamCod, P09PG9_A500GrpFamDsc, P09PG9_n500GrpFamDsc, P09PG9_A396EmprCod
            }
            , new Object[] {
            P09PG10_A5555Lb_opcion, P09PG10_A5532Lb_numero, P09PG10_A396EmprCod, P09PG10_A6374Lb_famc2
            }
            , new Object[] {
            P09PG11_A13745GrpCDsc, P09PG11_A499GrpFamCod, P09PG11_A500GrpFamDsc, P09PG11_n500GrpFamDsc, P09PG11_A396EmprCod
            }
            , new Object[] {
            P09PG12_A5555Lb_opcion, P09PG12_A5532Lb_numero, P09PG12_A396EmprCod, P09PG12_A6375Lb_famc3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private byte A490ForPrdUMe ;
   private byte A499GrpFamCod ;
   private byte A6373Lb_famc1 ;
   private byte A6374Lb_famc2 ;
   private byte A6375Lb_famc3 ;
   private short Gx_err ;
   private int AV15Lb_numero ;
   private int A5532Lb_numero ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String AV16Lb_opcion ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private String A488ForPrdDsc ;
   private String A6310Lb_TaAuxC ;
   private String A6311Lb_TaAuxD ;
   private String A5555Lb_opcion ;
   private String A500GrpFamDsc ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private boolean n6310Lb_TaAuxC ;
   private boolean n500GrpFamDsc ;
   private String AV12ComboName ;
   private String AV17SelectedValue ;
   private String A13747PrdCDsc ;
   private String A13746ForPrdCDsc ;
   private String A13756Lb_TaAuxCD ;
   private String A13745GrpCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP6 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09PG2_A856ValCod ;
   private String[] P09PG2_A13747PrdCDsc ;
   private String[] P09PG2_A719PrdNum ;
   private String[] P09PG2_A718PrdNom ;
   private String[] P09PG2_A396EmprCod ;
   private byte[] P09PG3_A856ValCod ;
   private String[] P09PG3_A13747PrdCDsc ;
   private String[] P09PG3_A719PrdNum ;
   private String[] P09PG3_A718PrdNom ;
   private String[] P09PG3_A396EmprCod ;
   private String[] P09PG4_A13746ForPrdCDsc ;
   private byte[] P09PG4_A490ForPrdUMe ;
   private String[] P09PG4_A488ForPrdDsc ;
   private boolean[] P09PG4_n488ForPrdDsc ;
   private String[] P09PG4_A396EmprCod ;
   private String[] P09PG5_A13756Lb_TaAuxCD ;
   private String[] P09PG5_A6310Lb_TaAuxC ;
   private boolean[] P09PG5_n6310Lb_TaAuxC ;
   private String[] P09PG5_A6311Lb_TaAuxD ;
   private String[] P09PG5_A396EmprCod ;
   private String[] P09PG6_A5555Lb_opcion ;
   private int[] P09PG6_A5532Lb_numero ;
   private String[] P09PG6_A396EmprCod ;
   private String[] P09PG6_A6310Lb_TaAuxC ;
   private boolean[] P09PG6_n6310Lb_TaAuxC ;
   private String[] P09PG7_A13745GrpCDsc ;
   private byte[] P09PG7_A499GrpFamCod ;
   private String[] P09PG7_A500GrpFamDsc ;
   private boolean[] P09PG7_n500GrpFamDsc ;
   private String[] P09PG7_A396EmprCod ;
   private String[] P09PG8_A5555Lb_opcion ;
   private int[] P09PG8_A5532Lb_numero ;
   private String[] P09PG8_A396EmprCod ;
   private byte[] P09PG8_A6373Lb_famc1 ;
   private String[] P09PG9_A13745GrpCDsc ;
   private byte[] P09PG9_A499GrpFamCod ;
   private String[] P09PG9_A500GrpFamDsc ;
   private boolean[] P09PG9_n500GrpFamDsc ;
   private String[] P09PG9_A396EmprCod ;
   private String[] P09PG10_A5555Lb_opcion ;
   private int[] P09PG10_A5532Lb_numero ;
   private String[] P09PG10_A396EmprCod ;
   private byte[] P09PG10_A6374Lb_famc2 ;
   private String[] P09PG11_A13745GrpCDsc ;
   private byte[] P09PG11_A499GrpFamCod ;
   private String[] P09PG11_A500GrpFamDsc ;
   private boolean[] P09PG11_n500GrpFamDsc ;
   private String[] P09PG11_A396EmprCod ;
   private String[] P09PG12_A5555Lb_opcion ;
   private int[] P09PG12_A5532Lb_numero ;
   private String[] P09PG12_A396EmprCod ;
   private byte[] P09PG12_A6375Lb_famc3 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class entradaensayolaboratorio_colorantes_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PG2", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE ValCod >= 1 and ValCod <= 2 and SUBSTR(PrdNum, 1, 1) <> '#' and SUBSTR(PrdNum, 1, 1) <> 'C' ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PG3", "SELECT ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE ValCod >= 1 and ValCod <= 2 and SUBSTR(PrdNum, 1, 1) <> '#' and SUBSTR(PrdNum, 1, 1) <> 'C' ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PG4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, ForPrdUMe, ForPrdDsc, EmprCod FROM TXPUNMEPR ORDER BY ForPrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PG5", "SELECT RTRIM(LTRIM(Lb_TaAuxC)) || '-' || RTRIM(LTRIM(Lb_TaAuxD)) AS Lb_TaAuxCD, Lb_TaAuxC, Lb_TaAuxD, EmprCod FROM TXPENS005 ORDER BY Lb_TaAuxCD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PG6", "SELECT Lb_opcion, Lb_numero, EmprCod, Lb_TaAuxC FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09PG7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PG8", "SELECT Lb_opcion, Lb_numero, EmprCod, Lb_famc1 FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09PG9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PG10", "SELECT Lb_opcion, Lb_numero, EmprCod, Lb_famc2 FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09PG11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09PG12", "SELECT Lb_opcion, Lb_numero, EmprCod, Lb_famc3 FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

