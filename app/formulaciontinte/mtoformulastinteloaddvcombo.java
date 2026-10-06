package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mtoformulastinteloaddvcombo extends GXProcedure
{
   public mtoformulastinteloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtoformulastinteloaddvcombo.class ), "" );
   }

   public mtoformulastinteloaddvcombo( int remoteHandle ,
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
                                                                                    byte aP7 ,
                                                                                    String[] aP8 )
   {
      mtoformulastinteloaddvcombo.this.aP9 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String aP5 ,
                        int aP6 ,
                        byte aP7 ,
                        String[] aP8 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             String aP5 ,
                             int aP6 ,
                             byte aP7 ,
                             String[] aP8 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 )
   {
      mtoformulastinteloaddvcombo.this.AV13ComboName = aP0;
      mtoformulastinteloaddvcombo.this.AV15TrnMode = aP1;
      mtoformulastinteloaddvcombo.this.AV17EmprCod = aP2;
      mtoformulastinteloaddvcombo.this.AV18CliCod = aP3;
      mtoformulastinteloaddvcombo.this.AV19ForSer = aP4;
      mtoformulastinteloaddvcombo.this.AV20ForColNom = aP5;
      mtoformulastinteloaddvcombo.this.AV21ForColNum = aP6;
      mtoformulastinteloaddvcombo.this.AV22TipColCod = aP7;
      mtoformulastinteloaddvcombo.this.aP8 = aP8;
      mtoformulastinteloaddvcombo.this.aP9 = aP9;
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
      if ( GXutil.strcmp(AV13ComboName, "MacProCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MACPROCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "IntCodF") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_INTCODF' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "IntCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_INTCOD' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "MatCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MATCOD' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "CodSol") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CODSOL' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "CliCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLICOD' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "ForSer") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FORSER' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "TipColCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPCOLCOD' */
         S181 ();
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
      /* 'LOADCOMBOITEMS_MACPROCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09ME2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13755MacProCDsc = P09ME2_A13755MacProCDsc[0] ;
         A1514MacProCod = P09ME2_A1514MacProCod[0] ;
         n1514MacProCod = P09ME2_n1514MacProCod[0] ;
         A1515MacProDsc = P09ME2_A1515MacProDsc[0] ;
         A396EmprCod = P09ME2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A1514MacProCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13755MacProCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09ME3 */
         pr_default.execute(1, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ForSer, AV20ForColNom, Integer.valueOf(AV21ForColNum), Byte.valueOf(AV22TipColCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A831TipColCod = P09ME3_A831TipColCod[0] ;
            A483ForColNum = P09ME3_A483ForColNum[0] ;
            A482ForColNom = P09ME3_A482ForColNom[0] ;
            A494ForSer = P09ME3_A494ForSer[0] ;
            A252CliCod = P09ME3_A252CliCod[0] ;
            A396EmprCod = P09ME3_A396EmprCod[0] ;
            A1514MacProCod = P09ME3_A1514MacProCod[0] ;
            n1514MacProCod = P09ME3_n1514MacProCod[0] ;
            AV12SelectedValue = A1514MacProCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_INTCODF' Routine */
      returnInSub = false ;
      /* Using cursor P09ME4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13753IntCFDsc = P09ME4_A13753IntCFDsc[0] ;
         A5362IntCodF = P09ME4_A5362IntCodF[0] ;
         n5362IntCodF = P09ME4_n5362IntCodF[0] ;
         A5363IntDscF = P09ME4_A5363IntDscF[0] ;
         n5363IntDscF = P09ME4_n5363IntDscF[0] ;
         A396EmprCod = P09ME4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A5362IntCodF, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13753IntCFDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09ME5 */
         pr_default.execute(3, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ForSer, AV20ForColNom, Integer.valueOf(AV21ForColNum), Byte.valueOf(AV22TipColCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A831TipColCod = P09ME5_A831TipColCod[0] ;
            A483ForColNum = P09ME5_A483ForColNum[0] ;
            A482ForColNom = P09ME5_A482ForColNom[0] ;
            A494ForSer = P09ME5_A494ForSer[0] ;
            A252CliCod = P09ME5_A252CliCod[0] ;
            A396EmprCod = P09ME5_A396EmprCod[0] ;
            A5362IntCodF = P09ME5_A5362IntCodF[0] ;
            n5362IntCodF = P09ME5_n5362IntCodF[0] ;
            AV12SelectedValue = ((0==A5362IntCodF) ? "" : GXutil.trim( GXutil.str( A5362IntCodF, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_INTCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09ME6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A14255IntAct = P09ME6_A14255IntAct[0] ;
         A13744IntCDsc = P09ME6_A13744IntCDsc[0] ;
         A583IntCod = P09ME6_A583IntCod[0] ;
         A584IntDsc = P09ME6_A584IntDsc[0] ;
         n584IntDsc = P09ME6_n584IntDsc[0] ;
         A396EmprCod = P09ME6_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A583IntCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13744IntCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09ME7 */
         pr_default.execute(5, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ForSer, AV20ForColNom, Integer.valueOf(AV21ForColNum), Byte.valueOf(AV22TipColCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A831TipColCod = P09ME7_A831TipColCod[0] ;
            A483ForColNum = P09ME7_A483ForColNum[0] ;
            A482ForColNom = P09ME7_A482ForColNom[0] ;
            A494ForSer = P09ME7_A494ForSer[0] ;
            A252CliCod = P09ME7_A252CliCod[0] ;
            A396EmprCod = P09ME7_A396EmprCod[0] ;
            A583IntCod = P09ME7_A583IntCod[0] ;
            AV12SelectedValue = ((0==A583IntCod) ? "" : GXutil.trim( GXutil.str( A583IntCod, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_MATCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09ME8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A13743MatCDsc = P09ME8_A13743MatCDsc[0] ;
         A626MatCod = P09ME8_A626MatCod[0] ;
         A627MatDsc = P09ME8_A627MatDsc[0] ;
         n627MatDsc = P09ME8_n627MatDsc[0] ;
         A396EmprCod = P09ME8_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A626MatCod, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13743MatCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09ME9 */
         pr_default.execute(7, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ForSer, AV20ForColNom, Integer.valueOf(AV21ForColNum), Byte.valueOf(AV22TipColCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A831TipColCod = P09ME9_A831TipColCod[0] ;
            A483ForColNum = P09ME9_A483ForColNum[0] ;
            A482ForColNom = P09ME9_A482ForColNom[0] ;
            A494ForSer = P09ME9_A494ForSer[0] ;
            A252CliCod = P09ME9_A252CliCod[0] ;
            A396EmprCod = P09ME9_A396EmprCod[0] ;
            A626MatCod = P09ME9_A626MatCod[0] ;
            AV12SelectedValue = ((0==A626MatCod) ? "" : GXutil.trim( GXutil.str( A626MatCod, 3, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_CODSOL' Routine */
      returnInSub = false ;
      /* Using cursor P09ME10 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A13752CodSDsc = P09ME10_A13752CodSDsc[0] ;
         A3316CodSol = P09ME10_A3316CodSol[0] ;
         n3316CodSol = P09ME10_n3316CodSol[0] ;
         A3317DscSol = P09ME10_A3317DscSol[0] ;
         n3317DscSol = P09ME10_n3317DscSol[0] ;
         A396EmprCod = P09ME10_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A3316CodSol, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13752CodSDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09ME11 */
         pr_default.execute(9, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ForSer, AV20ForColNom, Integer.valueOf(AV21ForColNum), Byte.valueOf(AV22TipColCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A831TipColCod = P09ME11_A831TipColCod[0] ;
            A483ForColNum = P09ME11_A483ForColNum[0] ;
            A482ForColNom = P09ME11_A482ForColNom[0] ;
            A494ForSer = P09ME11_A494ForSer[0] ;
            A252CliCod = P09ME11_A252CliCod[0] ;
            A396EmprCod = P09ME11_A396EmprCod[0] ;
            A3316CodSol = P09ME11_A3316CodSol[0] ;
            n3316CodSol = P09ME11_n3316CodSol[0] ;
            AV12SelectedValue = ((0==A3316CodSol) ? "" : GXutil.trim( GXutil.str( A3316CodSol, 3, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
      }
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      /* Using cursor P09ME12 */
      pr_default.execute(10);
      while ( (pr_default.getStatus(10) != 101) )
      {
         A10045CliAct = P09ME12_A10045CliAct[0] ;
         A13735CliCNom = P09ME12_A13735CliCNom[0] ;
         A252CliCod = P09ME12_A252CliCod[0] ;
         A279CliNom = P09ME12_A279CliNom[0] ;
         A396EmprCod = P09ME12_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09ME13 */
         pr_default.execute(11, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ForSer, AV20ForColNom, Integer.valueOf(AV21ForColNum), Byte.valueOf(AV22TipColCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A831TipColCod = P09ME13_A831TipColCod[0] ;
            A483ForColNum = P09ME13_A483ForColNum[0] ;
            A482ForColNom = P09ME13_A482ForColNom[0] ;
            A494ForSer = P09ME13_A494ForSer[0] ;
            A252CliCod = P09ME13_A252CliCod[0] ;
            A396EmprCod = P09ME13_A396EmprCod[0] ;
            AV12SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
      else
      {
         if ( ! (0==AV18CliCod) )
         {
            AV12SelectedValue = GXutil.trim( GXutil.str( AV18CliCod, 6, 0)) ;
         }
      }
   }

   public void S171( )
   {
      /* 'LOADCOMBOITEMS_FORSER' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09ME14 */
      pr_default.execute(12, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A252CliCod = P09ME14_A252CliCod[0] ;
         A396EmprCod = P09ME14_A396EmprCod[0] ;
         A69ArtDsc = P09ME14_A69ArtDsc[0] ;
         n69ArtDsc = P09ME14_n69ArtDsc[0] ;
         A65ArtCod = P09ME14_A65ArtCod[0] ;
         A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13751ArtCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(12);
      }
      pr_default.close(12);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09ME15 */
         pr_default.execute(13, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ForSer, AV20ForColNom, Integer.valueOf(AV21ForColNum), Byte.valueOf(AV22TipColCod)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A831TipColCod = P09ME15_A831TipColCod[0] ;
            A483ForColNum = P09ME15_A483ForColNum[0] ;
            A482ForColNom = P09ME15_A482ForColNom[0] ;
            A494ForSer = P09ME15_A494ForSer[0] ;
            A252CliCod = P09ME15_A252CliCod[0] ;
            A396EmprCod = P09ME15_A396EmprCod[0] ;
            AV12SelectedValue = A494ForSer ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19ForSer)==0) )
         {
            AV12SelectedValue = AV19ForSer ;
         }
      }
   }

   public void S181( )
   {
      /* 'LOADCOMBOITEMS_TIPCOLCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09ME16 */
      pr_default.execute(14);
      while ( (pr_default.getStatus(14) != 101) )
      {
         A13731TipColCDsc = P09ME16_A13731TipColCDsc[0] ;
         A831TipColCod = P09ME16_A831TipColCod[0] ;
         A832TipColDsc = P09ME16_A832TipColDsc[0] ;
         n832TipColDsc = P09ME16_n832TipColDsc[0] ;
         A396EmprCod = P09ME16_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13731TipColCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(14);
      }
      pr_default.close(14);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09ME17 */
         pr_default.execute(15, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ForSer, AV20ForColNom, Integer.valueOf(AV21ForColNum), Byte.valueOf(AV22TipColCod)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A831TipColCod = P09ME17_A831TipColCod[0] ;
            A483ForColNum = P09ME17_A483ForColNum[0] ;
            A482ForColNom = P09ME17_A482ForColNom[0] ;
            A494ForSer = P09ME17_A494ForSer[0] ;
            A252CliCod = P09ME17_A252CliCod[0] ;
            A396EmprCod = P09ME17_A396EmprCod[0] ;
            AV12SelectedValue = ((0==A831TipColCod) ? "" : GXutil.trim( GXutil.str( A831TipColCod, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
      }
      else
      {
         if ( ! (0==AV22TipColCod) )
         {
            AV12SelectedValue = GXutil.trim( GXutil.str( AV22TipColCod, 2, 0)) ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP8[0] = mtoformulastinteloaddvcombo.this.AV12SelectedValue;
      this.aP9[0] = mtoformulastinteloaddvcombo.this.AV10Combo_Data;
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
      P09ME2_A13755MacProCDsc = new String[] {""} ;
      P09ME2_A1514MacProCod = new String[] {""} ;
      P09ME2_n1514MacProCod = new boolean[] {false} ;
      P09ME2_A1515MacProDsc = new String[] {""} ;
      P09ME2_A396EmprCod = new String[] {""} ;
      A13755MacProCDsc = "" ;
      A1514MacProCod = "" ;
      A1515MacProDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09ME3_A831TipColCod = new byte[1] ;
      P09ME3_A483ForColNum = new int[1] ;
      P09ME3_A482ForColNom = new String[] {""} ;
      P09ME3_A494ForSer = new String[] {""} ;
      P09ME3_A252CliCod = new int[1] ;
      P09ME3_A396EmprCod = new String[] {""} ;
      P09ME3_A1514MacProCod = new String[] {""} ;
      P09ME3_n1514MacProCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P09ME4_A13753IntCFDsc = new String[] {""} ;
      P09ME4_A5362IntCodF = new byte[1] ;
      P09ME4_n5362IntCodF = new boolean[] {false} ;
      P09ME4_A5363IntDscF = new String[] {""} ;
      P09ME4_n5363IntDscF = new boolean[] {false} ;
      P09ME4_A396EmprCod = new String[] {""} ;
      A13753IntCFDsc = "" ;
      A5363IntDscF = "" ;
      P09ME5_A831TipColCod = new byte[1] ;
      P09ME5_A483ForColNum = new int[1] ;
      P09ME5_A482ForColNom = new String[] {""} ;
      P09ME5_A494ForSer = new String[] {""} ;
      P09ME5_A252CliCod = new int[1] ;
      P09ME5_A396EmprCod = new String[] {""} ;
      P09ME5_A5362IntCodF = new byte[1] ;
      P09ME5_n5362IntCodF = new boolean[] {false} ;
      P09ME6_A14255IntAct = new String[] {""} ;
      P09ME6_A13744IntCDsc = new String[] {""} ;
      P09ME6_A583IntCod = new byte[1] ;
      P09ME6_A584IntDsc = new String[] {""} ;
      P09ME6_n584IntDsc = new boolean[] {false} ;
      P09ME6_A396EmprCod = new String[] {""} ;
      A14255IntAct = "" ;
      A13744IntCDsc = "" ;
      A584IntDsc = "" ;
      P09ME7_A831TipColCod = new byte[1] ;
      P09ME7_A483ForColNum = new int[1] ;
      P09ME7_A482ForColNom = new String[] {""} ;
      P09ME7_A494ForSer = new String[] {""} ;
      P09ME7_A252CliCod = new int[1] ;
      P09ME7_A396EmprCod = new String[] {""} ;
      P09ME7_A583IntCod = new byte[1] ;
      P09ME8_A13743MatCDsc = new String[] {""} ;
      P09ME8_A626MatCod = new short[1] ;
      P09ME8_A627MatDsc = new String[] {""} ;
      P09ME8_n627MatDsc = new boolean[] {false} ;
      P09ME8_A396EmprCod = new String[] {""} ;
      A13743MatCDsc = "" ;
      A627MatDsc = "" ;
      P09ME9_A831TipColCod = new byte[1] ;
      P09ME9_A483ForColNum = new int[1] ;
      P09ME9_A482ForColNom = new String[] {""} ;
      P09ME9_A494ForSer = new String[] {""} ;
      P09ME9_A252CliCod = new int[1] ;
      P09ME9_A396EmprCod = new String[] {""} ;
      P09ME9_A626MatCod = new short[1] ;
      P09ME10_A13752CodSDsc = new String[] {""} ;
      P09ME10_A3316CodSol = new short[1] ;
      P09ME10_n3316CodSol = new boolean[] {false} ;
      P09ME10_A3317DscSol = new String[] {""} ;
      P09ME10_n3317DscSol = new boolean[] {false} ;
      P09ME10_A396EmprCod = new String[] {""} ;
      A13752CodSDsc = "" ;
      A3317DscSol = "" ;
      P09ME11_A831TipColCod = new byte[1] ;
      P09ME11_A483ForColNum = new int[1] ;
      P09ME11_A482ForColNom = new String[] {""} ;
      P09ME11_A494ForSer = new String[] {""} ;
      P09ME11_A252CliCod = new int[1] ;
      P09ME11_A396EmprCod = new String[] {""} ;
      P09ME11_A3316CodSol = new short[1] ;
      P09ME11_n3316CodSol = new boolean[] {false} ;
      P09ME12_A10045CliAct = new String[] {""} ;
      P09ME12_A13735CliCNom = new String[] {""} ;
      P09ME12_A252CliCod = new int[1] ;
      P09ME12_A279CliNom = new String[] {""} ;
      P09ME12_A396EmprCod = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      P09ME13_A831TipColCod = new byte[1] ;
      P09ME13_A483ForColNum = new int[1] ;
      P09ME13_A482ForColNom = new String[] {""} ;
      P09ME13_A494ForSer = new String[] {""} ;
      P09ME13_A252CliCod = new int[1] ;
      P09ME13_A396EmprCod = new String[] {""} ;
      P09ME14_A252CliCod = new int[1] ;
      P09ME14_A396EmprCod = new String[] {""} ;
      P09ME14_A69ArtDsc = new String[] {""} ;
      P09ME14_n69ArtDsc = new boolean[] {false} ;
      P09ME14_A65ArtCod = new String[] {""} ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      A13751ArtCDsc = "" ;
      P09ME15_A831TipColCod = new byte[1] ;
      P09ME15_A483ForColNum = new int[1] ;
      P09ME15_A482ForColNom = new String[] {""} ;
      P09ME15_A494ForSer = new String[] {""} ;
      P09ME15_A252CliCod = new int[1] ;
      P09ME15_A396EmprCod = new String[] {""} ;
      P09ME16_A13731TipColCDsc = new String[] {""} ;
      P09ME16_A831TipColCod = new byte[1] ;
      P09ME16_A832TipColDsc = new String[] {""} ;
      P09ME16_n832TipColDsc = new boolean[] {false} ;
      P09ME16_A396EmprCod = new String[] {""} ;
      A13731TipColCDsc = "" ;
      A832TipColDsc = "" ;
      P09ME17_A831TipColCod = new byte[1] ;
      P09ME17_A483ForColNum = new int[1] ;
      P09ME17_A482ForColNom = new String[] {""} ;
      P09ME17_A494ForSer = new String[] {""} ;
      P09ME17_A252CliCod = new int[1] ;
      P09ME17_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinteloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09ME2_A13755MacProCDsc, P09ME2_A1514MacProCod, P09ME2_A1515MacProDsc, P09ME2_A396EmprCod
            }
            , new Object[] {
            P09ME3_A831TipColCod, P09ME3_A483ForColNum, P09ME3_A482ForColNom, P09ME3_A494ForSer, P09ME3_A252CliCod, P09ME3_A396EmprCod, P09ME3_A1514MacProCod, P09ME3_n1514MacProCod
            }
            , new Object[] {
            P09ME4_A13753IntCFDsc, P09ME4_A5362IntCodF, P09ME4_A5363IntDscF, P09ME4_n5363IntDscF, P09ME4_A396EmprCod
            }
            , new Object[] {
            P09ME5_A831TipColCod, P09ME5_A483ForColNum, P09ME5_A482ForColNom, P09ME5_A494ForSer, P09ME5_A252CliCod, P09ME5_A396EmprCod, P09ME5_A5362IntCodF, P09ME5_n5362IntCodF
            }
            , new Object[] {
            P09ME6_A14255IntAct, P09ME6_A13744IntCDsc, P09ME6_A583IntCod, P09ME6_A584IntDsc, P09ME6_n584IntDsc, P09ME6_A396EmprCod
            }
            , new Object[] {
            P09ME7_A831TipColCod, P09ME7_A483ForColNum, P09ME7_A482ForColNom, P09ME7_A494ForSer, P09ME7_A252CliCod, P09ME7_A396EmprCod, P09ME7_A583IntCod
            }
            , new Object[] {
            P09ME8_A13743MatCDsc, P09ME8_A626MatCod, P09ME8_A627MatDsc, P09ME8_n627MatDsc, P09ME8_A396EmprCod
            }
            , new Object[] {
            P09ME9_A831TipColCod, P09ME9_A483ForColNum, P09ME9_A482ForColNom, P09ME9_A494ForSer, P09ME9_A252CliCod, P09ME9_A396EmprCod, P09ME9_A626MatCod
            }
            , new Object[] {
            P09ME10_A13752CodSDsc, P09ME10_A3316CodSol, P09ME10_A3317DscSol, P09ME10_n3317DscSol, P09ME10_A396EmprCod
            }
            , new Object[] {
            P09ME11_A831TipColCod, P09ME11_A483ForColNum, P09ME11_A482ForColNom, P09ME11_A494ForSer, P09ME11_A252CliCod, P09ME11_A396EmprCod, P09ME11_A3316CodSol, P09ME11_n3316CodSol
            }
            , new Object[] {
            P09ME12_A10045CliAct, P09ME12_A13735CliCNom, P09ME12_A252CliCod, P09ME12_A279CliNom, P09ME12_A396EmprCod
            }
            , new Object[] {
            P09ME13_A831TipColCod, P09ME13_A483ForColNum, P09ME13_A482ForColNom, P09ME13_A494ForSer, P09ME13_A252CliCod, P09ME13_A396EmprCod
            }
            , new Object[] {
            P09ME14_A252CliCod, P09ME14_A396EmprCod, P09ME14_A69ArtDsc, P09ME14_n69ArtDsc, P09ME14_A65ArtCod
            }
            , new Object[] {
            P09ME15_A831TipColCod, P09ME15_A483ForColNum, P09ME15_A482ForColNom, P09ME15_A494ForSer, P09ME15_A252CliCod, P09ME15_A396EmprCod
            }
            , new Object[] {
            P09ME16_A13731TipColCDsc, P09ME16_A831TipColCod, P09ME16_A832TipColDsc, P09ME16_n832TipColDsc, P09ME16_A396EmprCod
            }
            , new Object[] {
            P09ME17_A831TipColCod, P09ME17_A483ForColNum, P09ME17_A482ForColNom, P09ME17_A494ForSer, P09ME17_A252CliCod, P09ME17_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TipColCod ;
   private byte A831TipColCod ;
   private byte A5362IntCodF ;
   private byte A583IntCod ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short Gx_err ;
   private int AV18CliCod ;
   private int AV21ForColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String AV19ForSer ;
   private String AV20ForColNom ;
   private String scmdbuf ;
   private String A1514MacProCod ;
   private String A1515MacProDsc ;
   private String A396EmprCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A5363IntDscF ;
   private String A14255IntAct ;
   private String A584IntDsc ;
   private String A627MatDsc ;
   private String A3317DscSol ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private String A832TipColDsc ;
   private boolean returnInSub ;
   private boolean n1514MacProCod ;
   private boolean n5362IntCodF ;
   private boolean n5363IntDscF ;
   private boolean n584IntDsc ;
   private boolean n627MatDsc ;
   private boolean n3316CodSol ;
   private boolean n3317DscSol ;
   private boolean n69ArtDsc ;
   private boolean n832TipColDsc ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13755MacProCDsc ;
   private String A13753IntCFDsc ;
   private String A13744IntCDsc ;
   private String A13743MatCDsc ;
   private String A13752CodSDsc ;
   private String A13735CliCNom ;
   private String A13751ArtCDsc ;
   private String A13731TipColCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ME2_A13755MacProCDsc ;
   private String[] P09ME2_A1514MacProCod ;
   private boolean[] P09ME2_n1514MacProCod ;
   private String[] P09ME2_A1515MacProDsc ;
   private String[] P09ME2_A396EmprCod ;
   private byte[] P09ME3_A831TipColCod ;
   private int[] P09ME3_A483ForColNum ;
   private String[] P09ME3_A482ForColNom ;
   private String[] P09ME3_A494ForSer ;
   private int[] P09ME3_A252CliCod ;
   private String[] P09ME3_A396EmprCod ;
   private String[] P09ME3_A1514MacProCod ;
   private boolean[] P09ME3_n1514MacProCod ;
   private String[] P09ME4_A13753IntCFDsc ;
   private byte[] P09ME4_A5362IntCodF ;
   private boolean[] P09ME4_n5362IntCodF ;
   private String[] P09ME4_A5363IntDscF ;
   private boolean[] P09ME4_n5363IntDscF ;
   private String[] P09ME4_A396EmprCod ;
   private byte[] P09ME5_A831TipColCod ;
   private int[] P09ME5_A483ForColNum ;
   private String[] P09ME5_A482ForColNom ;
   private String[] P09ME5_A494ForSer ;
   private int[] P09ME5_A252CliCod ;
   private String[] P09ME5_A396EmprCod ;
   private byte[] P09ME5_A5362IntCodF ;
   private boolean[] P09ME5_n5362IntCodF ;
   private String[] P09ME6_A14255IntAct ;
   private String[] P09ME6_A13744IntCDsc ;
   private byte[] P09ME6_A583IntCod ;
   private String[] P09ME6_A584IntDsc ;
   private boolean[] P09ME6_n584IntDsc ;
   private String[] P09ME6_A396EmprCod ;
   private byte[] P09ME7_A831TipColCod ;
   private int[] P09ME7_A483ForColNum ;
   private String[] P09ME7_A482ForColNom ;
   private String[] P09ME7_A494ForSer ;
   private int[] P09ME7_A252CliCod ;
   private String[] P09ME7_A396EmprCod ;
   private byte[] P09ME7_A583IntCod ;
   private String[] P09ME8_A13743MatCDsc ;
   private short[] P09ME8_A626MatCod ;
   private String[] P09ME8_A627MatDsc ;
   private boolean[] P09ME8_n627MatDsc ;
   private String[] P09ME8_A396EmprCod ;
   private byte[] P09ME9_A831TipColCod ;
   private int[] P09ME9_A483ForColNum ;
   private String[] P09ME9_A482ForColNom ;
   private String[] P09ME9_A494ForSer ;
   private int[] P09ME9_A252CliCod ;
   private String[] P09ME9_A396EmprCod ;
   private short[] P09ME9_A626MatCod ;
   private String[] P09ME10_A13752CodSDsc ;
   private short[] P09ME10_A3316CodSol ;
   private boolean[] P09ME10_n3316CodSol ;
   private String[] P09ME10_A3317DscSol ;
   private boolean[] P09ME10_n3317DscSol ;
   private String[] P09ME10_A396EmprCod ;
   private byte[] P09ME11_A831TipColCod ;
   private int[] P09ME11_A483ForColNum ;
   private String[] P09ME11_A482ForColNom ;
   private String[] P09ME11_A494ForSer ;
   private int[] P09ME11_A252CliCod ;
   private String[] P09ME11_A396EmprCod ;
   private short[] P09ME11_A3316CodSol ;
   private boolean[] P09ME11_n3316CodSol ;
   private String[] P09ME12_A10045CliAct ;
   private String[] P09ME12_A13735CliCNom ;
   private int[] P09ME12_A252CliCod ;
   private String[] P09ME12_A279CliNom ;
   private String[] P09ME12_A396EmprCod ;
   private byte[] P09ME13_A831TipColCod ;
   private int[] P09ME13_A483ForColNum ;
   private String[] P09ME13_A482ForColNom ;
   private String[] P09ME13_A494ForSer ;
   private int[] P09ME13_A252CliCod ;
   private String[] P09ME13_A396EmprCod ;
   private int[] P09ME14_A252CliCod ;
   private String[] P09ME14_A396EmprCod ;
   private String[] P09ME14_A69ArtDsc ;
   private boolean[] P09ME14_n69ArtDsc ;
   private String[] P09ME14_A65ArtCod ;
   private byte[] P09ME15_A831TipColCod ;
   private int[] P09ME15_A483ForColNum ;
   private String[] P09ME15_A482ForColNom ;
   private String[] P09ME15_A494ForSer ;
   private int[] P09ME15_A252CliCod ;
   private String[] P09ME15_A396EmprCod ;
   private String[] P09ME16_A13731TipColCDsc ;
   private byte[] P09ME16_A831TipColCod ;
   private String[] P09ME16_A832TipColDsc ;
   private boolean[] P09ME16_n832TipColDsc ;
   private String[] P09ME16_A396EmprCod ;
   private byte[] P09ME17_A831TipColCod ;
   private int[] P09ME17_A483ForColNum ;
   private String[] P09ME17_A482ForColNom ;
   private String[] P09ME17_A494ForSer ;
   private int[] P09ME17_A252CliCod ;
   private String[] P09ME17_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class mtoformulastinteloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ME2", "SELECT RTRIM(LTRIM(MacProCod)) || '-' || RTRIM(LTRIM(MacProDsc)) AS MacProCDsc, MacProCod, MacProDsc, EmprCod FROM TXPCMACPR ORDER BY MacProCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ME3", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, MacProCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09ME4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCodF,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDscF, ''))) AS IntCFDsc, IntCodF, IntDscF, EmprCod FROM TXPINTFAC ORDER BY IntCFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ME5", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCodF FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09ME6", "SELECT IntAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, IntCod, IntDsc, EmprCod FROM TXPINTENS WHERE IntAct = 'S' ORDER BY IntCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ME7", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09ME8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) AS MatCDsc, MatCod, MatDsc, EmprCod FROM TXPMATICE ORDER BY MatCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ME9", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, MatCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09ME10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CodSol,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DscSol, ''))) AS CodSDsc, CodSol, DscSol, EmprCod FROM TXPSOLIDE ORDER BY CodSDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ME11", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, CodSol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09ME12", "SELECT CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ME13", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09ME14", "SELECT CliCod, EmprCod, ArtDsc, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ME15", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09ME16", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, TipColCod, TipColDsc, EmprCod FROM TXPTIPCOL ORDER BY TipColCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ME17", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               return;
            case 13 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 15 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

