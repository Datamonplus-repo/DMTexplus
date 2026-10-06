package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorioloaddvcombo extends GXProcedure
{
   public entradaensayolaboratorioloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorioloaddvcombo.class ), "" );
   }

   public entradaensayolaboratorioloaddvcombo( int remoteHandle ,
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
      entradaensayolaboratorioloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      entradaensayolaboratorioloaddvcombo.this.AV13ComboName = aP0;
      entradaensayolaboratorioloaddvcombo.this.AV15TrnMode = aP1;
      entradaensayolaboratorioloaddvcombo.this.AV17EmprCod = aP2;
      entradaensayolaboratorioloaddvcombo.this.AV18Lb_numero = aP3;
      entradaensayolaboratorioloaddvcombo.this.aP4 = aP4;
      entradaensayolaboratorioloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV13ComboName, "Lb_ForCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_FORCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "MacProCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MACPROCOD' */
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
      else if ( GXutil.strcmp(AV13ComboName, "TipColCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPCOLCOD' */
         S161 ();
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
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "Lb_ArtCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_LB_ARTCOD' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "TipDisCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPDISCOD' */
         S191 ();
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
      /* 'LOADCOMBOITEMS_LB_FORCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09OE2 */
      pr_default.execute(0, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13133ProForAct = P09OE2_A13133ProForAct[0] ;
         A396EmprCod = P09OE2_A396EmprCod[0] ;
         A766ProForDsc = P09OE2_A766ProForDsc[0] ;
         A764ProForCod = P09OE2_A764ProForCod[0] ;
         A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_MACPROCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09OE3 */
      pr_default.execute(1, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P09OE3_A396EmprCod[0] ;
         A1515MacProDsc = P09OE3_A1515MacProDsc[0] ;
         A1514MacProCod = P09OE3_A1514MacProCod[0] ;
         n1514MacProCod = P09OE3_n1514MacProCod[0] ;
         A13755MacProCDsc = GXutil.trim( A1514MacProCod) + "-" + GXutil.trim( A1515MacProDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A1514MacProCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13755MacProCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09OE4 */
         pr_default.execute(2, new Object[] {AV17EmprCod, Integer.valueOf(AV18Lb_numero)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5532Lb_numero = P09OE4_A5532Lb_numero[0] ;
            A396EmprCod = P09OE4_A396EmprCod[0] ;
            A1514MacProCod = P09OE4_A1514MacProCod[0] ;
            n1514MacProCod = P09OE4_n1514MacProCod[0] ;
            AV12SelectedValue = A1514MacProCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_INTCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09OE5 */
      pr_default.execute(3, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14255IntAct = P09OE5_A14255IntAct[0] ;
         A396EmprCod = P09OE5_A396EmprCod[0] ;
         A584IntDsc = P09OE5_A584IntDsc[0] ;
         n584IntDsc = P09OE5_n584IntDsc[0] ;
         A583IntCod = P09OE5_A583IntCod[0] ;
         n583IntCod = P09OE5_n583IntCod[0] ;
         A13744IntCDsc = GXutil.trim( GXutil.str( A583IntCod, 2, 0)) + "-" + GXutil.trim( A584IntDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A583IntCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13744IntCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09OE6 */
         pr_default.execute(4, new Object[] {AV17EmprCod, Integer.valueOf(AV18Lb_numero)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A5532Lb_numero = P09OE6_A5532Lb_numero[0] ;
            A396EmprCod = P09OE6_A396EmprCod[0] ;
            A583IntCod = P09OE6_A583IntCod[0] ;
            n583IntCod = P09OE6_n583IntCod[0] ;
            AV12SelectedValue = ((0==A583IntCod) ? "" : GXutil.trim( GXutil.str( A583IntCod, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_MATCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09OE7 */
      pr_default.execute(5, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = P09OE7_A396EmprCod[0] ;
         A627MatDsc = P09OE7_A627MatDsc[0] ;
         n627MatDsc = P09OE7_n627MatDsc[0] ;
         A626MatCod = P09OE7_A626MatCod[0] ;
         n626MatCod = P09OE7_n626MatCod[0] ;
         A13743MatCDsc = GXutil.trim( GXutil.str( A626MatCod, 3, 0)) + "-" + GXutil.trim( A627MatDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A626MatCod, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13743MatCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09OE8 */
         pr_default.execute(6, new Object[] {AV17EmprCod, Integer.valueOf(AV18Lb_numero)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A5532Lb_numero = P09OE8_A5532Lb_numero[0] ;
            A396EmprCod = P09OE8_A396EmprCod[0] ;
            A626MatCod = P09OE8_A626MatCod[0] ;
            n626MatCod = P09OE8_n626MatCod[0] ;
            AV12SelectedValue = ((0==A626MatCod) ? "" : GXutil.trim( GXutil.str( A626MatCod, 3, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_CODSOL' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09OE9 */
      pr_default.execute(7, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A396EmprCod = P09OE9_A396EmprCod[0] ;
         A3317DscSol = P09OE9_A3317DscSol[0] ;
         n3317DscSol = P09OE9_n3317DscSol[0] ;
         A3316CodSol = P09OE9_A3316CodSol[0] ;
         n3316CodSol = P09OE9_n3316CodSol[0] ;
         A13752CodSDsc = GXutil.trim( GXutil.str( A3316CodSol, 3, 0)) + "-" + GXutil.trim( A3317DscSol) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A3316CodSol, 3, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13752CodSDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09OE10 */
         pr_default.execute(8, new Object[] {AV17EmprCod, Integer.valueOf(AV18Lb_numero)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A5532Lb_numero = P09OE10_A5532Lb_numero[0] ;
            A396EmprCod = P09OE10_A396EmprCod[0] ;
            A3316CodSol = P09OE10_A3316CodSol[0] ;
            n3316CodSol = P09OE10_n3316CodSol[0] ;
            AV12SelectedValue = ((0==A3316CodSol) ? "" : GXutil.trim( GXutil.str( A3316CodSol, 3, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_TIPCOLCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09OE11 */
      pr_default.execute(9, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A396EmprCod = P09OE11_A396EmprCod[0] ;
         A832TipColDsc = P09OE11_A832TipColDsc[0] ;
         n832TipColDsc = P09OE11_n832TipColDsc[0] ;
         A831TipColCod = P09OE11_A831TipColCod[0] ;
         n831TipColCod = P09OE11_n831TipColCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A831TipColCod, 2, 0))+"-"+GXutil.trim( A832TipColDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      if ( 1 == 0 )
      {
         AV10Combo_Data.sort("Title");
         if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
         {
            /* Using cursor P09OE12 */
            pr_default.execute(10, new Object[] {AV17EmprCod, Integer.valueOf(AV18Lb_numero)});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A5532Lb_numero = P09OE12_A5532Lb_numero[0] ;
               A396EmprCod = P09OE12_A396EmprCod[0] ;
               A831TipColCod = P09OE12_A831TipColCod[0] ;
               n831TipColCod = P09OE12_n831TipColCod[0] ;
               AV12SelectedValue = ((0==A831TipColCod) ? "" : GXutil.trim( GXutil.str( A831TipColCod, 2, 0))) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(10);
         }
      }
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09OE13 */
         pr_default.execute(11, new Object[] {AV17EmprCod, Integer.valueOf(AV18Lb_numero)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A5532Lb_numero = P09OE13_A5532Lb_numero[0] ;
            A396EmprCod = P09OE13_A396EmprCod[0] ;
            A831TipColCod = P09OE13_A831TipColCod[0] ;
            n831TipColCod = P09OE13_n831TipColCod[0] ;
            AV12SelectedValue = ((0==A831TipColCod) ? "" : GXutil.trim( GXutil.str( A831TipColCod, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
   }

   public void S171( )
   {
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09OE14 */
      pr_default.execute(12, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A10045CliAct = P09OE14_A10045CliAct[0] ;
         A396EmprCod = P09OE14_A396EmprCod[0] ;
         A279CliNom = P09OE14_A279CliNom[0] ;
         A252CliCod = P09OE14_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(12);
      }
      pr_default.close(12);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09OE15 */
         pr_default.execute(13, new Object[] {AV17EmprCod, Integer.valueOf(AV18Lb_numero)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A5532Lb_numero = P09OE15_A5532Lb_numero[0] ;
            A396EmprCod = P09OE15_A396EmprCod[0] ;
            A252CliCod = P09OE15_A252CliCod[0] ;
            AV12SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
      }
   }

   public void S181( )
   {
      /* 'LOADCOMBOITEMS_LB_ARTCOD' Routine */
      returnInSub = false ;
      AV28CliCod = (int)(GXutil.lval( AV26WebSession.getValue("CliCod"))) ;
      System.out.println( "-------------------------" );
      System.out.println( httpContext.getMessage( "CliCod : ", "")+GXutil.str( AV28CliCod, 6, 0) );
      System.out.println( "-------------------------" );
      AV10Combo_Data.clear();
      /* Using cursor P09OE16 */
      pr_default.execute(14, new Object[] {AV17EmprCod, Integer.valueOf(AV28CliCod)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A14295ArtActivo = P09OE16_A14295ArtActivo[0] ;
         A252CliCod = P09OE16_A252CliCod[0] ;
         A396EmprCod = P09OE16_A396EmprCod[0] ;
         A69ArtDsc = P09OE16_A69ArtDsc[0] ;
         n69ArtDsc = P09OE16_n69ArtDsc[0] ;
         A65ArtCod = P09OE16_A65ArtCod[0] ;
         A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13751ArtCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(14);
      }
      pr_default.close(14);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09OE17 */
         pr_default.execute(15, new Object[] {AV17EmprCod, Integer.valueOf(AV18Lb_numero)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A5532Lb_numero = P09OE17_A5532Lb_numero[0] ;
            A396EmprCod = P09OE17_A396EmprCod[0] ;
            A5533Lb_ArtCod = P09OE17_A5533Lb_ArtCod[0] ;
            AV12SelectedValue = A5533Lb_ArtCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
      }
      if ( AV23IsDynamicCall )
      {
         AV10Combo_Data.sort("Title");
         AV21Combo_DataJson = AV10Combo_Data.toJSonString(false) ;
      }
   }

   public void S191( )
   {
      /* 'LOADCOMBOITEMS_TIPDISCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09OE18 */
      pr_default.execute(16, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A396EmprCod = P09OE18_A396EmprCod[0] ;
         A5097TipDisDsc = P09OE18_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P09OE18_n5097TipDisDsc[0] ;
         A5098TipDisCod = P09OE18_A5098TipDisCod[0] ;
         n5098TipDisCod = P09OE18_n5098TipDisCod[0] ;
         A13845TipDisDscI = GXutil.trim( A5098TipDisCod) + "-" + GXutil.trim( A5097TipDisDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A5098TipDisCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13845TipDisDscI );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(16);
      }
      pr_default.close(16);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09OE19 */
         pr_default.execute(17, new Object[] {AV17EmprCod, Integer.valueOf(AV18Lb_numero)});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A5532Lb_numero = P09OE19_A5532Lb_numero[0] ;
            A396EmprCod = P09OE19_A396EmprCod[0] ;
            A5098TipDisCod = P09OE19_A5098TipDisCod[0] ;
            n5098TipDisCod = P09OE19_n5098TipDisCod[0] ;
            AV12SelectedValue = A5098TipDisCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(17);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = entradaensayolaboratorioloaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = entradaensayolaboratorioloaddvcombo.this.AV10Combo_Data;
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
      P09OE2_A13133ProForAct = new String[] {""} ;
      P09OE2_A396EmprCod = new String[] {""} ;
      P09OE2_A766ProForDsc = new String[] {""} ;
      P09OE2_A764ProForCod = new String[] {""} ;
      A13133ProForAct = "" ;
      A396EmprCod = "" ;
      A766ProForDsc = "" ;
      A764ProForCod = "" ;
      A13740ProFDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09OE3_A396EmprCod = new String[] {""} ;
      P09OE3_A1515MacProDsc = new String[] {""} ;
      P09OE3_A1514MacProCod = new String[] {""} ;
      P09OE3_n1514MacProCod = new boolean[] {false} ;
      A1515MacProDsc = "" ;
      A1514MacProCod = "" ;
      A13755MacProCDsc = "" ;
      P09OE4_A5532Lb_numero = new int[1] ;
      P09OE4_A396EmprCod = new String[] {""} ;
      P09OE4_A1514MacProCod = new String[] {""} ;
      P09OE4_n1514MacProCod = new boolean[] {false} ;
      P09OE5_A14255IntAct = new String[] {""} ;
      P09OE5_A396EmprCod = new String[] {""} ;
      P09OE5_A584IntDsc = new String[] {""} ;
      P09OE5_n584IntDsc = new boolean[] {false} ;
      P09OE5_A583IntCod = new byte[1] ;
      P09OE5_n583IntCod = new boolean[] {false} ;
      A14255IntAct = "" ;
      A584IntDsc = "" ;
      A13744IntCDsc = "" ;
      P09OE6_A5532Lb_numero = new int[1] ;
      P09OE6_A396EmprCod = new String[] {""} ;
      P09OE6_A583IntCod = new byte[1] ;
      P09OE6_n583IntCod = new boolean[] {false} ;
      P09OE7_A396EmprCod = new String[] {""} ;
      P09OE7_A627MatDsc = new String[] {""} ;
      P09OE7_n627MatDsc = new boolean[] {false} ;
      P09OE7_A626MatCod = new short[1] ;
      P09OE7_n626MatCod = new boolean[] {false} ;
      A627MatDsc = "" ;
      A13743MatCDsc = "" ;
      P09OE8_A5532Lb_numero = new int[1] ;
      P09OE8_A396EmprCod = new String[] {""} ;
      P09OE8_A626MatCod = new short[1] ;
      P09OE8_n626MatCod = new boolean[] {false} ;
      P09OE9_A396EmprCod = new String[] {""} ;
      P09OE9_A3317DscSol = new String[] {""} ;
      P09OE9_n3317DscSol = new boolean[] {false} ;
      P09OE9_A3316CodSol = new short[1] ;
      P09OE9_n3316CodSol = new boolean[] {false} ;
      A3317DscSol = "" ;
      A13752CodSDsc = "" ;
      P09OE10_A5532Lb_numero = new int[1] ;
      P09OE10_A396EmprCod = new String[] {""} ;
      P09OE10_A3316CodSol = new short[1] ;
      P09OE10_n3316CodSol = new boolean[] {false} ;
      P09OE11_A396EmprCod = new String[] {""} ;
      P09OE11_A832TipColDsc = new String[] {""} ;
      P09OE11_n832TipColDsc = new boolean[] {false} ;
      P09OE11_A831TipColCod = new byte[1] ;
      P09OE11_n831TipColCod = new boolean[] {false} ;
      A832TipColDsc = "" ;
      P09OE12_A5532Lb_numero = new int[1] ;
      P09OE12_A396EmprCod = new String[] {""} ;
      P09OE12_A831TipColCod = new byte[1] ;
      P09OE12_n831TipColCod = new boolean[] {false} ;
      P09OE13_A5532Lb_numero = new int[1] ;
      P09OE13_A396EmprCod = new String[] {""} ;
      P09OE13_A831TipColCod = new byte[1] ;
      P09OE13_n831TipColCod = new boolean[] {false} ;
      P09OE14_A10045CliAct = new String[] {""} ;
      P09OE14_A396EmprCod = new String[] {""} ;
      P09OE14_A279CliNom = new String[] {""} ;
      P09OE14_A252CliCod = new int[1] ;
      A10045CliAct = "" ;
      A279CliNom = "" ;
      A13735CliCNom = "" ;
      P09OE15_A5532Lb_numero = new int[1] ;
      P09OE15_A396EmprCod = new String[] {""} ;
      P09OE15_A252CliCod = new int[1] ;
      AV26WebSession = httpContext.getWebSession();
      P09OE16_A14295ArtActivo = new String[] {""} ;
      P09OE16_A252CliCod = new int[1] ;
      P09OE16_A396EmprCod = new String[] {""} ;
      P09OE16_A69ArtDsc = new String[] {""} ;
      P09OE16_n69ArtDsc = new boolean[] {false} ;
      P09OE16_A65ArtCod = new String[] {""} ;
      A14295ArtActivo = "" ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      A13751ArtCDsc = "" ;
      P09OE17_A5532Lb_numero = new int[1] ;
      P09OE17_A396EmprCod = new String[] {""} ;
      P09OE17_A5533Lb_ArtCod = new String[] {""} ;
      A5533Lb_ArtCod = "" ;
      AV21Combo_DataJson = "" ;
      P09OE18_A396EmprCod = new String[] {""} ;
      P09OE18_A5097TipDisDsc = new String[] {""} ;
      P09OE18_n5097TipDisDsc = new boolean[] {false} ;
      P09OE18_A5098TipDisCod = new String[] {""} ;
      P09OE18_n5098TipDisCod = new boolean[] {false} ;
      A5097TipDisDsc = "" ;
      A5098TipDisCod = "" ;
      A13845TipDisDscI = "" ;
      P09OE19_A5532Lb_numero = new int[1] ;
      P09OE19_A396EmprCod = new String[] {""} ;
      P09OE19_A5098TipDisCod = new String[] {""} ;
      P09OE19_n5098TipDisCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorioloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09OE2_A13133ProForAct, P09OE2_A396EmprCod, P09OE2_A766ProForDsc, P09OE2_A764ProForCod
            }
            , new Object[] {
            P09OE3_A396EmprCod, P09OE3_A1515MacProDsc, P09OE3_A1514MacProCod
            }
            , new Object[] {
            P09OE4_A5532Lb_numero, P09OE4_A396EmprCod, P09OE4_A1514MacProCod, P09OE4_n1514MacProCod
            }
            , new Object[] {
            P09OE5_A14255IntAct, P09OE5_A396EmprCod, P09OE5_A584IntDsc, P09OE5_n584IntDsc, P09OE5_A583IntCod
            }
            , new Object[] {
            P09OE6_A5532Lb_numero, P09OE6_A396EmprCod, P09OE6_A583IntCod, P09OE6_n583IntCod
            }
            , new Object[] {
            P09OE7_A396EmprCod, P09OE7_A627MatDsc, P09OE7_n627MatDsc, P09OE7_A626MatCod
            }
            , new Object[] {
            P09OE8_A5532Lb_numero, P09OE8_A396EmprCod, P09OE8_A626MatCod, P09OE8_n626MatCod
            }
            , new Object[] {
            P09OE9_A396EmprCod, P09OE9_A3317DscSol, P09OE9_n3317DscSol, P09OE9_A3316CodSol
            }
            , new Object[] {
            P09OE10_A5532Lb_numero, P09OE10_A396EmprCod, P09OE10_A3316CodSol, P09OE10_n3316CodSol
            }
            , new Object[] {
            P09OE11_A396EmprCod, P09OE11_A832TipColDsc, P09OE11_n832TipColDsc, P09OE11_A831TipColCod
            }
            , new Object[] {
            P09OE12_A5532Lb_numero, P09OE12_A396EmprCod, P09OE12_A831TipColCod, P09OE12_n831TipColCod
            }
            , new Object[] {
            P09OE13_A5532Lb_numero, P09OE13_A396EmprCod, P09OE13_A831TipColCod, P09OE13_n831TipColCod
            }
            , new Object[] {
            P09OE14_A10045CliAct, P09OE14_A396EmprCod, P09OE14_A279CliNom, P09OE14_A252CliCod
            }
            , new Object[] {
            P09OE15_A5532Lb_numero, P09OE15_A396EmprCod, P09OE15_A252CliCod
            }
            , new Object[] {
            P09OE16_A14295ArtActivo, P09OE16_A252CliCod, P09OE16_A396EmprCod, P09OE16_A69ArtDsc, P09OE16_n69ArtDsc, P09OE16_A65ArtCod
            }
            , new Object[] {
            P09OE17_A5532Lb_numero, P09OE17_A396EmprCod, P09OE17_A5533Lb_ArtCod
            }
            , new Object[] {
            P09OE18_A396EmprCod, P09OE18_A5097TipDisDsc, P09OE18_n5097TipDisDsc, P09OE18_A5098TipDisCod
            }
            , new Object[] {
            P09OE19_A5532Lb_numero, P09OE19_A396EmprCod, P09OE19_A5098TipDisCod, P09OE19_n5098TipDisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short Gx_err ;
   private int AV18Lb_numero ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int AV28CliCod ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String scmdbuf ;
   private String A13133ProForAct ;
   private String A396EmprCod ;
   private String A766ProForDsc ;
   private String A764ProForCod ;
   private String A1515MacProDsc ;
   private String A1514MacProCod ;
   private String A14255IntAct ;
   private String A584IntDsc ;
   private String A627MatDsc ;
   private String A3317DscSol ;
   private String A832TipColDsc ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A14295ArtActivo ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private String A5533Lb_ArtCod ;
   private String A5097TipDisDsc ;
   private String A5098TipDisCod ;
   private boolean returnInSub ;
   private boolean n1514MacProCod ;
   private boolean n584IntDsc ;
   private boolean n583IntCod ;
   private boolean n627MatDsc ;
   private boolean n626MatCod ;
   private boolean n3317DscSol ;
   private boolean n3316CodSol ;
   private boolean n832TipColDsc ;
   private boolean n831TipColCod ;
   private boolean n69ArtDsc ;
   private boolean AV23IsDynamicCall ;
   private boolean n5097TipDisDsc ;
   private boolean n5098TipDisCod ;
   private String AV21Combo_DataJson ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13740ProFDsc ;
   private String A13755MacProCDsc ;
   private String A13744IntCDsc ;
   private String A13743MatCDsc ;
   private String A13752CodSDsc ;
   private String A13735CliCNom ;
   private String A13751ArtCDsc ;
   private String A13845TipDisDscI ;
   private com.genexus.webpanels.WebSession AV26WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09OE2_A13133ProForAct ;
   private String[] P09OE2_A396EmprCod ;
   private String[] P09OE2_A766ProForDsc ;
   private String[] P09OE2_A764ProForCod ;
   private String[] P09OE3_A396EmprCod ;
   private String[] P09OE3_A1515MacProDsc ;
   private String[] P09OE3_A1514MacProCod ;
   private boolean[] P09OE3_n1514MacProCod ;
   private int[] P09OE4_A5532Lb_numero ;
   private String[] P09OE4_A396EmprCod ;
   private String[] P09OE4_A1514MacProCod ;
   private boolean[] P09OE4_n1514MacProCod ;
   private String[] P09OE5_A14255IntAct ;
   private String[] P09OE5_A396EmprCod ;
   private String[] P09OE5_A584IntDsc ;
   private boolean[] P09OE5_n584IntDsc ;
   private byte[] P09OE5_A583IntCod ;
   private boolean[] P09OE5_n583IntCod ;
   private int[] P09OE6_A5532Lb_numero ;
   private String[] P09OE6_A396EmprCod ;
   private byte[] P09OE6_A583IntCod ;
   private boolean[] P09OE6_n583IntCod ;
   private String[] P09OE7_A396EmprCod ;
   private String[] P09OE7_A627MatDsc ;
   private boolean[] P09OE7_n627MatDsc ;
   private short[] P09OE7_A626MatCod ;
   private boolean[] P09OE7_n626MatCod ;
   private int[] P09OE8_A5532Lb_numero ;
   private String[] P09OE8_A396EmprCod ;
   private short[] P09OE8_A626MatCod ;
   private boolean[] P09OE8_n626MatCod ;
   private String[] P09OE9_A396EmprCod ;
   private String[] P09OE9_A3317DscSol ;
   private boolean[] P09OE9_n3317DscSol ;
   private short[] P09OE9_A3316CodSol ;
   private boolean[] P09OE9_n3316CodSol ;
   private int[] P09OE10_A5532Lb_numero ;
   private String[] P09OE10_A396EmprCod ;
   private short[] P09OE10_A3316CodSol ;
   private boolean[] P09OE10_n3316CodSol ;
   private String[] P09OE11_A396EmprCod ;
   private String[] P09OE11_A832TipColDsc ;
   private boolean[] P09OE11_n832TipColDsc ;
   private byte[] P09OE11_A831TipColCod ;
   private boolean[] P09OE11_n831TipColCod ;
   private int[] P09OE12_A5532Lb_numero ;
   private String[] P09OE12_A396EmprCod ;
   private byte[] P09OE12_A831TipColCod ;
   private boolean[] P09OE12_n831TipColCod ;
   private int[] P09OE13_A5532Lb_numero ;
   private String[] P09OE13_A396EmprCod ;
   private byte[] P09OE13_A831TipColCod ;
   private boolean[] P09OE13_n831TipColCod ;
   private String[] P09OE14_A10045CliAct ;
   private String[] P09OE14_A396EmprCod ;
   private String[] P09OE14_A279CliNom ;
   private int[] P09OE14_A252CliCod ;
   private int[] P09OE15_A5532Lb_numero ;
   private String[] P09OE15_A396EmprCod ;
   private int[] P09OE15_A252CliCod ;
   private String[] P09OE16_A14295ArtActivo ;
   private int[] P09OE16_A252CliCod ;
   private String[] P09OE16_A396EmprCod ;
   private String[] P09OE16_A69ArtDsc ;
   private boolean[] P09OE16_n69ArtDsc ;
   private String[] P09OE16_A65ArtCod ;
   private int[] P09OE17_A5532Lb_numero ;
   private String[] P09OE17_A396EmprCod ;
   private String[] P09OE17_A5533Lb_ArtCod ;
   private String[] P09OE18_A396EmprCod ;
   private String[] P09OE18_A5097TipDisDsc ;
   private boolean[] P09OE18_n5097TipDisDsc ;
   private String[] P09OE18_A5098TipDisCod ;
   private boolean[] P09OE18_n5098TipDisCod ;
   private int[] P09OE19_A5532Lb_numero ;
   private String[] P09OE19_A396EmprCod ;
   private String[] P09OE19_A5098TipDisCod ;
   private boolean[] P09OE19_n5098TipDisCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class entradaensayolaboratorioloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09OE2", "SELECT ProForAct, EmprCod, ProForDsc, ProForCod FROM TXPCPROFO WHERE (EmprCod = ?) AND (ProForAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OE3", "SELECT EmprCod, MacProDsc, MacProCod FROM TXPCMACPR WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OE4", "SELECT Lb_numero, EmprCod, MacProCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OE5", "SELECT IntAct, EmprCod, IntDsc, IntCod FROM TXPINTENS WHERE (EmprCod = ?) AND (IntAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OE6", "SELECT Lb_numero, EmprCod, IntCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OE7", "SELECT EmprCod, MatDsc, MatCod FROM TXPMATICE WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OE8", "SELECT Lb_numero, EmprCod, MatCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OE9", "SELECT EmprCod, DscSol, CodSol FROM TXPSOLIDE WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OE10", "SELECT Lb_numero, EmprCod, CodSol FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OE11", "SELECT EmprCod, TipColDsc, TipColCod FROM TXPTIPCOL WHERE EmprCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OE12", "SELECT Lb_numero, EmprCod, TipColCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OE13", "SELECT Lb_numero, EmprCod, TipColCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OE14", "SELECT CliAct, EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OE15", "SELECT Lb_numero, EmprCod, CliCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OE16", "SELECT ArtActivo, CliCod, EmprCod, ArtDsc, ArtCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ?) AND (ArtActivo = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OE17", "SELECT Lb_numero, EmprCod, Lb_ArtCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09OE18", "SELECT EmprCod, TipDisDsc, TipDisCod FROM TXPTIPDIS WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09OE19", "SELECT Lb_numero, EmprCod, TipDisCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

