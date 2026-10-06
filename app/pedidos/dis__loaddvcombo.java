package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dis__loaddvcombo extends GXProcedure
{
   public dis__loaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis__loaddvcombo.class ), "" );
   }

   public dis__loaddvcombo( int remoteHandle ,
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
      dis__loaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      dis__loaddvcombo.this.AV12ComboName = aP0;
      dis__loaddvcombo.this.AV13TrnMode = aP1;
      dis__loaddvcombo.this.AV14EmprCod = aP2;
      dis__loaddvcombo.this.AV15DisCod = aP3;
      dis__loaddvcombo.this.aP4 = aP4;
      dis__loaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "MaqCodDis") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MAQCODDIS' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "CpteId") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CPTEID' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DesaID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DESAID' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DptoID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DPTOID' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "Cod_Idtx") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_COD_IDTX' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DisIdtx2") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISIDTX2' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DisArtAca") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISARTACA' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DisArtCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISARTCOD' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "CliCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_CLICOD' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "MarcaId") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MARCAID' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DisCliDes") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISCLIDES' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "RevenID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_REVENID' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DisTipDis") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISTIPDIS' */
         S231 ();
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
      /* 'LOADCOMBOITEMS_MAQCODDIS' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13734MaqCDsc = P0A1W2_A13734MaqCDsc[0] ;
         A602MaqCod = P0A1W2_A602MaqCod[0] ;
         A606MaqDsc = P0A1W2_A606MaqDsc[0] ;
         n606MaqDsc = P0A1W2_n606MaqDsc[0] ;
         A396EmprCod = P0A1W2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A361DisCod = P0A1W3_A361DisCod[0] ;
            A396EmprCod = P0A1W3_A396EmprCod[0] ;
            A1122MaqCodDis = P0A1W3_A1122MaqCodDis[0] ;
            n1122MaqCodDis = P0A1W3_n1122MaqCodDis[0] ;
            AV16SelectedValue = A1122MaqCodDis ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_CPTEID' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14000Id_CpteDsc = P0A1W4_A14000Id_CpteDsc[0] ;
         A11860CpteId = P0A1W4_A11860CpteId[0] ;
         n11860CpteId = P0A1W4_n11860CpteId[0] ;
         A11865CpteDsc = P0A1W4_A11865CpteDsc[0] ;
         n11865CpteDsc = P0A1W4_n11865CpteDsc[0] ;
         A396EmprCod = P0A1W4_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11860CpteId, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14000Id_CpteDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A361DisCod = P0A1W5_A361DisCod[0] ;
            A396EmprCod = P0A1W5_A396EmprCod[0] ;
            A11860CpteId = P0A1W5_A11860CpteId[0] ;
            n11860CpteId = P0A1W5_n11860CpteId[0] ;
            AV16SelectedValue = ((0==A11860CpteId) ? "" : GXutil.trim( GXutil.str( A11860CpteId, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_DESAID' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13999Id_DesaDsc = P0A1W6_A13999Id_DesaDsc[0] ;
         A11862DesaID = P0A1W6_A11862DesaID[0] ;
         n11862DesaID = P0A1W6_n11862DesaID[0] ;
         A11866DesaDsc = P0A1W6_A11866DesaDsc[0] ;
         n11866DesaDsc = P0A1W6_n11866DesaDsc[0] ;
         A396EmprCod = P0A1W6_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11862DesaID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13999Id_DesaDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W7 */
         pr_default.execute(5, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A361DisCod = P0A1W7_A361DisCod[0] ;
            A396EmprCod = P0A1W7_A396EmprCod[0] ;
            A11862DesaID = P0A1W7_A11862DesaID[0] ;
            n11862DesaID = P0A1W7_n11862DesaID[0] ;
            AV16SelectedValue = ((0==A11862DesaID) ? "" : GXutil.trim( GXutil.str( A11862DesaID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_DPTOID' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A13998ID_DptoDsc = P0A1W8_A13998ID_DptoDsc[0] ;
         A11863DptoID = P0A1W8_A11863DptoID[0] ;
         n11863DptoID = P0A1W8_n11863DptoID[0] ;
         A11867DptoDsc = P0A1W8_A11867DptoDsc[0] ;
         n11867DptoDsc = P0A1W8_n11867DptoDsc[0] ;
         A396EmprCod = P0A1W8_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11863DptoID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13998ID_DptoDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W9 */
         pr_default.execute(7, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A361DisCod = P0A1W9_A361DisCod[0] ;
            A396EmprCod = P0A1W9_A396EmprCod[0] ;
            A11863DptoID = P0A1W9_A11863DptoID[0] ;
            n11863DptoID = P0A1W9_n11863DptoID[0] ;
            AV16SelectedValue = ((0==A11863DptoID) ? "" : GXutil.trim( GXutil.str( A11863DptoID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_COD_IDTX' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W10 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A13810Dsc_IdtxID = P0A1W10_A13810Dsc_IdtxID[0] ;
         A10887Cod_Idtx = P0A1W10_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = P0A1W10_n10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0A1W10_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0A1W10_n10888Dsc_Idtx[0] ;
         A396EmprCod = P0A1W10_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13810Dsc_IdtxID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W11 */
         pr_default.execute(9, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A361DisCod = P0A1W11_A361DisCod[0] ;
            A396EmprCod = P0A1W11_A396EmprCod[0] ;
            A10887Cod_Idtx = P0A1W11_A10887Cod_Idtx[0] ;
            n10887Cod_Idtx = P0A1W11_n10887Cod_Idtx[0] ;
            AV16SelectedValue = A10887Cod_Idtx ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
      }
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_DISIDTX2' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W12 */
      pr_default.execute(10);
      while ( (pr_default.getStatus(10) != 101) )
      {
         A13810Dsc_IdtxID = P0A1W12_A13810Dsc_IdtxID[0] ;
         A10887Cod_Idtx = P0A1W12_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = P0A1W12_n10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P0A1W12_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P0A1W12_n10888Dsc_Idtx[0] ;
         A396EmprCod = P0A1W12_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13810Dsc_IdtxID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W13 */
         pr_default.execute(11, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A361DisCod = P0A1W13_A361DisCod[0] ;
            A396EmprCod = P0A1W13_A396EmprCod[0] ;
            A13986DisIdtx2 = P0A1W13_A13986DisIdtx2[0] ;
            n13986DisIdtx2 = P0A1W13_n13986DisIdtx2[0] ;
            AV16SelectedValue = A13986DisIdtx2 ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
   }

   public void S171( )
   {
      /* 'LOADCOMBOITEMS_DISARTACA' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W14 */
      pr_default.execute(12);
      while ( (pr_default.getStatus(12) != 101) )
      {
         A13740ProFDsc = P0A1W14_A13740ProFDsc[0] ;
         A764ProForCod = P0A1W14_A764ProForCod[0] ;
         A766ProForDsc = P0A1W14_A766ProForDsc[0] ;
         A396EmprCod = P0A1W14_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(12);
      }
      pr_default.close(12);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W15 */
         pr_default.execute(13, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A361DisCod = P0A1W15_A361DisCod[0] ;
            A396EmprCod = P0A1W15_A396EmprCod[0] ;
            A333DisArtAca = P0A1W15_A333DisArtAca[0] ;
            AV16SelectedValue = A333DisArtAca ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
      }
   }

   public void S181( )
   {
      /* 'LOADCOMBOITEMS_DISARTCOD' Routine */
      returnInSub = false ;
      AV19CliCod = (int)(GXutil.lval( AV20WebSession.getValue("Dis_CliCod"))) ;
      AV10Combo_Data.clear();
      /* Using cursor P0A1W16 */
      pr_default.execute(14, new Object[] {AV14EmprCod, Integer.valueOf(AV19CliCod), Integer.valueOf(AV19CliCod)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A14295ArtActivo = P0A1W16_A14295ArtActivo[0] ;
         A252CliCod = P0A1W16_A252CliCod[0] ;
         A396EmprCod = P0A1W16_A396EmprCod[0] ;
         A69ArtDsc = P0A1W16_A69ArtDsc[0] ;
         n69ArtDsc = P0A1W16_n69ArtDsc[0] ;
         A65ArtCod = P0A1W16_A65ArtCod[0] ;
         A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13751ArtCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(14);
      }
      pr_default.close(14);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W17 */
         pr_default.execute(15, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A361DisCod = P0A1W17_A361DisCod[0] ;
            A396EmprCod = P0A1W17_A396EmprCod[0] ;
            A335DisArtCod = P0A1W17_A335DisArtCod[0] ;
            AV16SelectedValue = A335DisArtCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
      }
      System.out.println( AV16SelectedValue );
      if ( 1 == 2 )
      {
         AV10Combo_Data.sort("Title");
         if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
         {
            /* Using cursor P0A1W18 */
            pr_default.execute(16, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
            while ( (pr_default.getStatus(16) != 101) )
            {
               A361DisCod = P0A1W18_A361DisCod[0] ;
               A396EmprCod = P0A1W18_A396EmprCod[0] ;
               A335DisArtCod = P0A1W18_A335DisArtCod[0] ;
               AV16SelectedValue = A335DisArtCod ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(16);
         }
      }
   }

   public void S191( )
   {
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W19 */
      pr_default.execute(17);
      while ( (pr_default.getStatus(17) != 101) )
      {
         A10045CliAct = P0A1W19_A10045CliAct[0] ;
         A13735CliCNom = P0A1W19_A13735CliCNom[0] ;
         A252CliCod = P0A1W19_A252CliCod[0] ;
         A279CliNom = P0A1W19_A279CliNom[0] ;
         A396EmprCod = P0A1W19_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(17);
      }
      pr_default.close(17);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W20 */
         pr_default.execute(18, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(18) != 101) )
         {
            A361DisCod = P0A1W20_A361DisCod[0] ;
            A396EmprCod = P0A1W20_A396EmprCod[0] ;
            A252CliCod = P0A1W20_A252CliCod[0] ;
            AV16SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(18);
      }
   }

   public void S201( )
   {
      /* 'LOADCOMBOITEMS_MARCAID' Routine */
      returnInSub = false ;
      AV19CliCod = (int)(GXutil.lval( AV20WebSession.getValue("Dis_CliCod"))) ;
      AV10Combo_Data.clear();
      AV16SelectedValue = "" ;
      /* Using cursor P0A1W21 */
      pr_default.execute(19, new Object[] {AV14EmprCod, Integer.valueOf(AV19CliCod)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A252CliCod = P0A1W21_A252CliCod[0] ;
         A396EmprCod = P0A1W21_A396EmprCod[0] ;
         A12908CliMarcaDc = P0A1W21_A12908CliMarcaDc[0] ;
         n12908CliMarcaDc = P0A1W21_n12908CliMarcaDc[0] ;
         A12907CliMarcaID = P0A1W21_A12907CliMarcaID[0] ;
         A12908CliMarcaDc = P0A1W21_A12908CliMarcaDc[0] ;
         n12908CliMarcaDc = P0A1W21_n12908CliMarcaDc[0] ;
         A14004ID_CliMarc = GXutil.trim( A12907CliMarcaID) + "-" + GXutil.trim( A12908CliMarcaDc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A12907CliMarcaID );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14004ID_CliMarc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(19);
      }
      pr_default.close(19);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W22 */
         pr_default.execute(20, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(20) != 101) )
         {
            A361DisCod = P0A1W22_A361DisCod[0] ;
            A396EmprCod = P0A1W22_A396EmprCod[0] ;
            A11659MarcaId = P0A1W22_A11659MarcaId[0] ;
            n11659MarcaId = P0A1W22_n11659MarcaId[0] ;
            AV16SelectedValue = A11659MarcaId ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(20);
      }
   }

   public void S211( )
   {
      /* 'LOADCOMBOITEMS_DISCLIDES' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W23 */
      pr_default.execute(21);
      while ( (pr_default.getStatus(21) != 101) )
      {
         A10045CliAct = P0A1W23_A10045CliAct[0] ;
         A13735CliCNom = P0A1W23_A13735CliCNom[0] ;
         A252CliCod = P0A1W23_A252CliCod[0] ;
         A279CliNom = P0A1W23_A279CliNom[0] ;
         A396EmprCod = P0A1W23_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(21);
      }
      pr_default.close(21);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W24 */
         pr_default.execute(22, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(22) != 101) )
         {
            A361DisCod = P0A1W24_A361DisCod[0] ;
            A396EmprCod = P0A1W24_A396EmprCod[0] ;
            A2310DisCliDes = P0A1W24_A2310DisCliDes[0] ;
            AV16SelectedValue = ((0==A2310DisCliDes) ? "" : GXutil.trim( GXutil.str( A2310DisCliDes, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(22);
      }
   }

   public void S221( )
   {
      /* 'LOADCOMBOITEMS_REVENID' Routine */
      returnInSub = false ;
      /* Using cursor P0A1W25 */
      pr_default.execute(23);
      while ( (pr_default.getStatus(23) != 101) )
      {
         A14002ID_RevenNm = P0A1W25_A14002ID_RevenNm[0] ;
         A12328RevenID = P0A1W25_A12328RevenID[0] ;
         n12328RevenID = P0A1W25_n12328RevenID[0] ;
         A12327RevenNm = P0A1W25_A12327RevenNm[0] ;
         n12327RevenNm = P0A1W25_n12327RevenNm[0] ;
         A396EmprCod = P0A1W25_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A12328RevenID );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14002ID_RevenNm );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(23);
      }
      pr_default.close(23);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W26 */
         pr_default.execute(24, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(24) != 101) )
         {
            A361DisCod = P0A1W26_A361DisCod[0] ;
            A396EmprCod = P0A1W26_A396EmprCod[0] ;
            A12328RevenID = P0A1W26_A12328RevenID[0] ;
            n12328RevenID = P0A1W26_n12328RevenID[0] ;
            AV16SelectedValue = A12328RevenID ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(24);
      }
   }

   public void S231( )
   {
      /* 'LOADCOMBOITEMS_DISTIPDIS' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A1W27 */
      pr_default.execute(25);
      while ( (pr_default.getStatus(25) != 101) )
      {
         A5098TipDisCod = P0A1W27_A5098TipDisCod[0] ;
         A5097TipDisDsc = P0A1W27_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P0A1W27_n5097TipDisDsc[0] ;
         A396EmprCod = P0A1W27_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A5098TipDisCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A5098TipDisCod), GXutil.trim( A5097TipDisDsc), "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(25);
      }
      pr_default.close(25);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A1W28 */
         pr_default.execute(26, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(26) != 101) )
         {
            A361DisCod = P0A1W28_A361DisCod[0] ;
            A396EmprCod = P0A1W28_A396EmprCod[0] ;
            A2009DisTipDis = P0A1W28_A2009DisTipDis[0] ;
            n2009DisTipDis = P0A1W28_n2009DisTipDis[0] ;
            AV16SelectedValue = A2009DisTipDis ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(26);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = dis__loaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = dis__loaddvcombo.this.AV10Combo_Data;
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
      P0A1W2_A13734MaqCDsc = new String[] {""} ;
      P0A1W2_A602MaqCod = new String[] {""} ;
      P0A1W2_A606MaqDsc = new String[] {""} ;
      P0A1W2_n606MaqDsc = new boolean[] {false} ;
      P0A1W2_A396EmprCod = new String[] {""} ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A1W3_A361DisCod = new int[1] ;
      P0A1W3_A396EmprCod = new String[] {""} ;
      P0A1W3_A1122MaqCodDis = new String[] {""} ;
      P0A1W3_n1122MaqCodDis = new boolean[] {false} ;
      A1122MaqCodDis = "" ;
      P0A1W4_A14000Id_CpteDsc = new String[] {""} ;
      P0A1W4_A11860CpteId = new short[1] ;
      P0A1W4_n11860CpteId = new boolean[] {false} ;
      P0A1W4_A11865CpteDsc = new String[] {""} ;
      P0A1W4_n11865CpteDsc = new boolean[] {false} ;
      P0A1W4_A396EmprCod = new String[] {""} ;
      A14000Id_CpteDsc = "" ;
      A11865CpteDsc = "" ;
      P0A1W5_A361DisCod = new int[1] ;
      P0A1W5_A396EmprCod = new String[] {""} ;
      P0A1W5_A11860CpteId = new short[1] ;
      P0A1W5_n11860CpteId = new boolean[] {false} ;
      P0A1W6_A13999Id_DesaDsc = new String[] {""} ;
      P0A1W6_A11862DesaID = new short[1] ;
      P0A1W6_n11862DesaID = new boolean[] {false} ;
      P0A1W6_A11866DesaDsc = new String[] {""} ;
      P0A1W6_n11866DesaDsc = new boolean[] {false} ;
      P0A1W6_A396EmprCod = new String[] {""} ;
      A13999Id_DesaDsc = "" ;
      A11866DesaDsc = "" ;
      P0A1W7_A361DisCod = new int[1] ;
      P0A1W7_A396EmprCod = new String[] {""} ;
      P0A1W7_A11862DesaID = new short[1] ;
      P0A1W7_n11862DesaID = new boolean[] {false} ;
      P0A1W8_A13998ID_DptoDsc = new String[] {""} ;
      P0A1W8_A11863DptoID = new short[1] ;
      P0A1W8_n11863DptoID = new boolean[] {false} ;
      P0A1W8_A11867DptoDsc = new String[] {""} ;
      P0A1W8_n11867DptoDsc = new boolean[] {false} ;
      P0A1W8_A396EmprCod = new String[] {""} ;
      A13998ID_DptoDsc = "" ;
      A11867DptoDsc = "" ;
      P0A1W9_A361DisCod = new int[1] ;
      P0A1W9_A396EmprCod = new String[] {""} ;
      P0A1W9_A11863DptoID = new short[1] ;
      P0A1W9_n11863DptoID = new boolean[] {false} ;
      P0A1W10_A13810Dsc_IdtxID = new String[] {""} ;
      P0A1W10_A10887Cod_Idtx = new String[] {""} ;
      P0A1W10_n10887Cod_Idtx = new boolean[] {false} ;
      P0A1W10_A10888Dsc_Idtx = new String[] {""} ;
      P0A1W10_n10888Dsc_Idtx = new boolean[] {false} ;
      P0A1W10_A396EmprCod = new String[] {""} ;
      A13810Dsc_IdtxID = "" ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      P0A1W11_A361DisCod = new int[1] ;
      P0A1W11_A396EmprCod = new String[] {""} ;
      P0A1W11_A10887Cod_Idtx = new String[] {""} ;
      P0A1W11_n10887Cod_Idtx = new boolean[] {false} ;
      P0A1W12_A13810Dsc_IdtxID = new String[] {""} ;
      P0A1W12_A10887Cod_Idtx = new String[] {""} ;
      P0A1W12_n10887Cod_Idtx = new boolean[] {false} ;
      P0A1W12_A10888Dsc_Idtx = new String[] {""} ;
      P0A1W12_n10888Dsc_Idtx = new boolean[] {false} ;
      P0A1W12_A396EmprCod = new String[] {""} ;
      P0A1W13_A361DisCod = new int[1] ;
      P0A1W13_A396EmprCod = new String[] {""} ;
      P0A1W13_A13986DisIdtx2 = new String[] {""} ;
      P0A1W13_n13986DisIdtx2 = new boolean[] {false} ;
      A13986DisIdtx2 = "" ;
      P0A1W14_A13740ProFDsc = new String[] {""} ;
      P0A1W14_A764ProForCod = new String[] {""} ;
      P0A1W14_A766ProForDsc = new String[] {""} ;
      P0A1W14_A396EmprCod = new String[] {""} ;
      A13740ProFDsc = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      P0A1W15_A361DisCod = new int[1] ;
      P0A1W15_A396EmprCod = new String[] {""} ;
      P0A1W15_A333DisArtAca = new String[] {""} ;
      A333DisArtAca = "" ;
      AV20WebSession = httpContext.getWebSession();
      P0A1W16_A14295ArtActivo = new String[] {""} ;
      P0A1W16_A252CliCod = new int[1] ;
      P0A1W16_A396EmprCod = new String[] {""} ;
      P0A1W16_A69ArtDsc = new String[] {""} ;
      P0A1W16_n69ArtDsc = new boolean[] {false} ;
      P0A1W16_A65ArtCod = new String[] {""} ;
      A14295ArtActivo = "" ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      A13751ArtCDsc = "" ;
      P0A1W17_A361DisCod = new int[1] ;
      P0A1W17_A396EmprCod = new String[] {""} ;
      P0A1W17_A335DisArtCod = new String[] {""} ;
      A335DisArtCod = "" ;
      P0A1W18_A361DisCod = new int[1] ;
      P0A1W18_A396EmprCod = new String[] {""} ;
      P0A1W18_A335DisArtCod = new String[] {""} ;
      P0A1W19_A10045CliAct = new String[] {""} ;
      P0A1W19_A13735CliCNom = new String[] {""} ;
      P0A1W19_A252CliCod = new int[1] ;
      P0A1W19_A279CliNom = new String[] {""} ;
      P0A1W19_A396EmprCod = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      P0A1W20_A361DisCod = new int[1] ;
      P0A1W20_A396EmprCod = new String[] {""} ;
      P0A1W20_A252CliCod = new int[1] ;
      P0A1W21_A252CliCod = new int[1] ;
      P0A1W21_A396EmprCod = new String[] {""} ;
      P0A1W21_A12908CliMarcaDc = new String[] {""} ;
      P0A1W21_n12908CliMarcaDc = new boolean[] {false} ;
      P0A1W21_A12907CliMarcaID = new String[] {""} ;
      A12908CliMarcaDc = "" ;
      A12907CliMarcaID = "" ;
      A14004ID_CliMarc = "" ;
      P0A1W22_A361DisCod = new int[1] ;
      P0A1W22_A396EmprCod = new String[] {""} ;
      P0A1W22_A11659MarcaId = new String[] {""} ;
      P0A1W22_n11659MarcaId = new boolean[] {false} ;
      A11659MarcaId = "" ;
      P0A1W23_A10045CliAct = new String[] {""} ;
      P0A1W23_A13735CliCNom = new String[] {""} ;
      P0A1W23_A252CliCod = new int[1] ;
      P0A1W23_A279CliNom = new String[] {""} ;
      P0A1W23_A396EmprCod = new String[] {""} ;
      P0A1W24_A361DisCod = new int[1] ;
      P0A1W24_A396EmprCod = new String[] {""} ;
      P0A1W24_A2310DisCliDes = new int[1] ;
      P0A1W25_A14002ID_RevenNm = new String[] {""} ;
      P0A1W25_A12328RevenID = new String[] {""} ;
      P0A1W25_n12328RevenID = new boolean[] {false} ;
      P0A1W25_A12327RevenNm = new String[] {""} ;
      P0A1W25_n12327RevenNm = new boolean[] {false} ;
      P0A1W25_A396EmprCod = new String[] {""} ;
      A14002ID_RevenNm = "" ;
      A12328RevenID = "" ;
      A12327RevenNm = "" ;
      P0A1W26_A361DisCod = new int[1] ;
      P0A1W26_A396EmprCod = new String[] {""} ;
      P0A1W26_A12328RevenID = new String[] {""} ;
      P0A1W26_n12328RevenID = new boolean[] {false} ;
      P0A1W27_A5098TipDisCod = new String[] {""} ;
      P0A1W27_A5097TipDisDsc = new String[] {""} ;
      P0A1W27_n5097TipDisDsc = new boolean[] {false} ;
      P0A1W27_A396EmprCod = new String[] {""} ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      P0A1W28_A361DisCod = new int[1] ;
      P0A1W28_A396EmprCod = new String[] {""} ;
      P0A1W28_A2009DisTipDis = new String[] {""} ;
      P0A1W28_n2009DisTipDis = new boolean[] {false} ;
      A2009DisTipDis = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis__loaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A1W2_A13734MaqCDsc, P0A1W2_A602MaqCod, P0A1W2_A606MaqDsc, P0A1W2_n606MaqDsc, P0A1W2_A396EmprCod
            }
            , new Object[] {
            P0A1W3_A361DisCod, P0A1W3_A396EmprCod, P0A1W3_A1122MaqCodDis, P0A1W3_n1122MaqCodDis
            }
            , new Object[] {
            P0A1W4_A14000Id_CpteDsc, P0A1W4_A11860CpteId, P0A1W4_A11865CpteDsc, P0A1W4_n11865CpteDsc, P0A1W4_A396EmprCod
            }
            , new Object[] {
            P0A1W5_A361DisCod, P0A1W5_A396EmprCod, P0A1W5_A11860CpteId, P0A1W5_n11860CpteId
            }
            , new Object[] {
            P0A1W6_A13999Id_DesaDsc, P0A1W6_A11862DesaID, P0A1W6_A11866DesaDsc, P0A1W6_n11866DesaDsc, P0A1W6_A396EmprCod
            }
            , new Object[] {
            P0A1W7_A361DisCod, P0A1W7_A396EmprCod, P0A1W7_A11862DesaID, P0A1W7_n11862DesaID
            }
            , new Object[] {
            P0A1W8_A13998ID_DptoDsc, P0A1W8_A11863DptoID, P0A1W8_A11867DptoDsc, P0A1W8_n11867DptoDsc, P0A1W8_A396EmprCod
            }
            , new Object[] {
            P0A1W9_A361DisCod, P0A1W9_A396EmprCod, P0A1W9_A11863DptoID, P0A1W9_n11863DptoID
            }
            , new Object[] {
            P0A1W10_A13810Dsc_IdtxID, P0A1W10_A10887Cod_Idtx, P0A1W10_A10888Dsc_Idtx, P0A1W10_n10888Dsc_Idtx, P0A1W10_A396EmprCod
            }
            , new Object[] {
            P0A1W11_A361DisCod, P0A1W11_A396EmprCod, P0A1W11_A10887Cod_Idtx, P0A1W11_n10887Cod_Idtx
            }
            , new Object[] {
            P0A1W12_A13810Dsc_IdtxID, P0A1W12_A10887Cod_Idtx, P0A1W12_A10888Dsc_Idtx, P0A1W12_n10888Dsc_Idtx, P0A1W12_A396EmprCod
            }
            , new Object[] {
            P0A1W13_A361DisCod, P0A1W13_A396EmprCod, P0A1W13_A13986DisIdtx2, P0A1W13_n13986DisIdtx2
            }
            , new Object[] {
            P0A1W14_A13740ProFDsc, P0A1W14_A764ProForCod, P0A1W14_A766ProForDsc, P0A1W14_A396EmprCod
            }
            , new Object[] {
            P0A1W15_A361DisCod, P0A1W15_A396EmprCod, P0A1W15_A333DisArtAca
            }
            , new Object[] {
            P0A1W16_A14295ArtActivo, P0A1W16_A252CliCod, P0A1W16_A396EmprCod, P0A1W16_A69ArtDsc, P0A1W16_n69ArtDsc, P0A1W16_A65ArtCod
            }
            , new Object[] {
            P0A1W17_A361DisCod, P0A1W17_A396EmprCod, P0A1W17_A335DisArtCod
            }
            , new Object[] {
            P0A1W18_A361DisCod, P0A1W18_A396EmprCod, P0A1W18_A335DisArtCod
            }
            , new Object[] {
            P0A1W19_A10045CliAct, P0A1W19_A13735CliCNom, P0A1W19_A252CliCod, P0A1W19_A279CliNom, P0A1W19_A396EmprCod
            }
            , new Object[] {
            P0A1W20_A361DisCod, P0A1W20_A396EmprCod, P0A1W20_A252CliCod
            }
            , new Object[] {
            P0A1W21_A252CliCod, P0A1W21_A396EmprCod, P0A1W21_A12908CliMarcaDc, P0A1W21_n12908CliMarcaDc, P0A1W21_A12907CliMarcaID
            }
            , new Object[] {
            P0A1W22_A361DisCod, P0A1W22_A396EmprCod, P0A1W22_A11659MarcaId, P0A1W22_n11659MarcaId
            }
            , new Object[] {
            P0A1W23_A10045CliAct, P0A1W23_A13735CliCNom, P0A1W23_A252CliCod, P0A1W23_A279CliNom, P0A1W23_A396EmprCod
            }
            , new Object[] {
            P0A1W24_A361DisCod, P0A1W24_A396EmprCod, P0A1W24_A2310DisCliDes
            }
            , new Object[] {
            P0A1W25_A14002ID_RevenNm, P0A1W25_A12328RevenID, P0A1W25_A12327RevenNm, P0A1W25_n12327RevenNm, P0A1W25_A396EmprCod
            }
            , new Object[] {
            P0A1W26_A361DisCod, P0A1W26_A396EmprCod, P0A1W26_A12328RevenID, P0A1W26_n12328RevenID
            }
            , new Object[] {
            P0A1W27_A5098TipDisCod, P0A1W27_A5097TipDisDsc, P0A1W27_n5097TipDisDsc, P0A1W27_A396EmprCod
            }
            , new Object[] {
            P0A1W28_A361DisCod, P0A1W28_A396EmprCod, P0A1W28_A2009DisTipDis, P0A1W28_n2009DisTipDis
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A11860CpteId ;
   private short A11862DesaID ;
   private short A11863DptoID ;
   private short Gx_err ;
   private int AV15DisCod ;
   private int A361DisCod ;
   private int AV19CliCod ;
   private int A252CliCod ;
   private int A2310DisCliDes ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A396EmprCod ;
   private String A1122MaqCodDis ;
   private String A14000Id_CpteDsc ;
   private String A11865CpteDsc ;
   private String A13999Id_DesaDsc ;
   private String A11866DesaDsc ;
   private String A13998ID_DptoDsc ;
   private String A11867DptoDsc ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A13986DisIdtx2 ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A333DisArtAca ;
   private String A14295ArtActivo ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private String A335DisArtCod ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A12908CliMarcaDc ;
   private String A12907CliMarcaID ;
   private String A14004ID_CliMarc ;
   private String A11659MarcaId ;
   private String A14002ID_RevenNm ;
   private String A12328RevenID ;
   private String A12327RevenNm ;
   private String A5098TipDisCod ;
   private String A5097TipDisDsc ;
   private String A2009DisTipDis ;
   private boolean returnInSub ;
   private boolean n606MaqDsc ;
   private boolean n1122MaqCodDis ;
   private boolean n11860CpteId ;
   private boolean n11865CpteDsc ;
   private boolean n11862DesaID ;
   private boolean n11866DesaDsc ;
   private boolean n11863DptoID ;
   private boolean n11867DptoDsc ;
   private boolean n10887Cod_Idtx ;
   private boolean n10888Dsc_Idtx ;
   private boolean n13986DisIdtx2 ;
   private boolean n69ArtDsc ;
   private boolean n12908CliMarcaDc ;
   private boolean n11659MarcaId ;
   private boolean n12328RevenID ;
   private boolean n12327RevenNm ;
   private boolean n5097TipDisDsc ;
   private boolean n2009DisTipDis ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13734MaqCDsc ;
   private String A13810Dsc_IdtxID ;
   private String A13740ProFDsc ;
   private String A13751ArtCDsc ;
   private String A13735CliCNom ;
   private com.genexus.webpanels.WebSession AV20WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A1W2_A13734MaqCDsc ;
   private String[] P0A1W2_A602MaqCod ;
   private String[] P0A1W2_A606MaqDsc ;
   private boolean[] P0A1W2_n606MaqDsc ;
   private String[] P0A1W2_A396EmprCod ;
   private int[] P0A1W3_A361DisCod ;
   private String[] P0A1W3_A396EmprCod ;
   private String[] P0A1W3_A1122MaqCodDis ;
   private boolean[] P0A1W3_n1122MaqCodDis ;
   private String[] P0A1W4_A14000Id_CpteDsc ;
   private short[] P0A1W4_A11860CpteId ;
   private boolean[] P0A1W4_n11860CpteId ;
   private String[] P0A1W4_A11865CpteDsc ;
   private boolean[] P0A1W4_n11865CpteDsc ;
   private String[] P0A1W4_A396EmprCod ;
   private int[] P0A1W5_A361DisCod ;
   private String[] P0A1W5_A396EmprCod ;
   private short[] P0A1W5_A11860CpteId ;
   private boolean[] P0A1W5_n11860CpteId ;
   private String[] P0A1W6_A13999Id_DesaDsc ;
   private short[] P0A1W6_A11862DesaID ;
   private boolean[] P0A1W6_n11862DesaID ;
   private String[] P0A1W6_A11866DesaDsc ;
   private boolean[] P0A1W6_n11866DesaDsc ;
   private String[] P0A1W6_A396EmprCod ;
   private int[] P0A1W7_A361DisCod ;
   private String[] P0A1W7_A396EmprCod ;
   private short[] P0A1W7_A11862DesaID ;
   private boolean[] P0A1W7_n11862DesaID ;
   private String[] P0A1W8_A13998ID_DptoDsc ;
   private short[] P0A1W8_A11863DptoID ;
   private boolean[] P0A1W8_n11863DptoID ;
   private String[] P0A1W8_A11867DptoDsc ;
   private boolean[] P0A1W8_n11867DptoDsc ;
   private String[] P0A1W8_A396EmprCod ;
   private int[] P0A1W9_A361DisCod ;
   private String[] P0A1W9_A396EmprCod ;
   private short[] P0A1W9_A11863DptoID ;
   private boolean[] P0A1W9_n11863DptoID ;
   private String[] P0A1W10_A13810Dsc_IdtxID ;
   private String[] P0A1W10_A10887Cod_Idtx ;
   private boolean[] P0A1W10_n10887Cod_Idtx ;
   private String[] P0A1W10_A10888Dsc_Idtx ;
   private boolean[] P0A1W10_n10888Dsc_Idtx ;
   private String[] P0A1W10_A396EmprCod ;
   private int[] P0A1W11_A361DisCod ;
   private String[] P0A1W11_A396EmprCod ;
   private String[] P0A1W11_A10887Cod_Idtx ;
   private boolean[] P0A1W11_n10887Cod_Idtx ;
   private String[] P0A1W12_A13810Dsc_IdtxID ;
   private String[] P0A1W12_A10887Cod_Idtx ;
   private boolean[] P0A1W12_n10887Cod_Idtx ;
   private String[] P0A1W12_A10888Dsc_Idtx ;
   private boolean[] P0A1W12_n10888Dsc_Idtx ;
   private String[] P0A1W12_A396EmprCod ;
   private int[] P0A1W13_A361DisCod ;
   private String[] P0A1W13_A396EmprCod ;
   private String[] P0A1W13_A13986DisIdtx2 ;
   private boolean[] P0A1W13_n13986DisIdtx2 ;
   private String[] P0A1W14_A13740ProFDsc ;
   private String[] P0A1W14_A764ProForCod ;
   private String[] P0A1W14_A766ProForDsc ;
   private String[] P0A1W14_A396EmprCod ;
   private int[] P0A1W15_A361DisCod ;
   private String[] P0A1W15_A396EmprCod ;
   private String[] P0A1W15_A333DisArtAca ;
   private String[] P0A1W16_A14295ArtActivo ;
   private int[] P0A1W16_A252CliCod ;
   private String[] P0A1W16_A396EmprCod ;
   private String[] P0A1W16_A69ArtDsc ;
   private boolean[] P0A1W16_n69ArtDsc ;
   private String[] P0A1W16_A65ArtCod ;
   private int[] P0A1W17_A361DisCod ;
   private String[] P0A1W17_A396EmprCod ;
   private String[] P0A1W17_A335DisArtCod ;
   private int[] P0A1W18_A361DisCod ;
   private String[] P0A1W18_A396EmprCod ;
   private String[] P0A1W18_A335DisArtCod ;
   private String[] P0A1W19_A10045CliAct ;
   private String[] P0A1W19_A13735CliCNom ;
   private int[] P0A1W19_A252CliCod ;
   private String[] P0A1W19_A279CliNom ;
   private String[] P0A1W19_A396EmprCod ;
   private int[] P0A1W20_A361DisCod ;
   private String[] P0A1W20_A396EmprCod ;
   private int[] P0A1W20_A252CliCod ;
   private int[] P0A1W21_A252CliCod ;
   private String[] P0A1W21_A396EmprCod ;
   private String[] P0A1W21_A12908CliMarcaDc ;
   private boolean[] P0A1W21_n12908CliMarcaDc ;
   private String[] P0A1W21_A12907CliMarcaID ;
   private int[] P0A1W22_A361DisCod ;
   private String[] P0A1W22_A396EmprCod ;
   private String[] P0A1W22_A11659MarcaId ;
   private boolean[] P0A1W22_n11659MarcaId ;
   private String[] P0A1W23_A10045CliAct ;
   private String[] P0A1W23_A13735CliCNom ;
   private int[] P0A1W23_A252CliCod ;
   private String[] P0A1W23_A279CliNom ;
   private String[] P0A1W23_A396EmprCod ;
   private int[] P0A1W24_A361DisCod ;
   private String[] P0A1W24_A396EmprCod ;
   private int[] P0A1W24_A2310DisCliDes ;
   private String[] P0A1W25_A14002ID_RevenNm ;
   private String[] P0A1W25_A12328RevenID ;
   private boolean[] P0A1W25_n12328RevenID ;
   private String[] P0A1W25_A12327RevenNm ;
   private boolean[] P0A1W25_n12327RevenNm ;
   private String[] P0A1W25_A396EmprCod ;
   private int[] P0A1W26_A361DisCod ;
   private String[] P0A1W26_A396EmprCod ;
   private String[] P0A1W26_A12328RevenID ;
   private boolean[] P0A1W26_n12328RevenID ;
   private String[] P0A1W27_A5098TipDisCod ;
   private String[] P0A1W27_A5097TipDisDsc ;
   private boolean[] P0A1W27_n5097TipDisDsc ;
   private String[] P0A1W27_A396EmprCod ;
   private int[] P0A1W28_A361DisCod ;
   private String[] P0A1W28_A396EmprCod ;
   private String[] P0A1W28_A2009DisTipDis ;
   private boolean[] P0A1W28_n2009DisTipDis ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class dis__loaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1W2", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W3", "SELECT DisCod, EmprCod, MaqCodDis FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W4", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CpteId,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( CpteDsc, ''))) AS Id_CpteDsc, CpteId, CpteDsc, EmprCod FROM TXPNXT000 ORDER BY Id_CpteDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W5", "SELECT DisCod, EmprCod, CpteId FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W6", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(DesaID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DesaDsc, ''))) AS Id_DesaDsc, DesaID, DesaDsc, EmprCod FROM TXPNXT001 ORDER BY Id_DesaDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W7", "SELECT DisCod, EmprCod, DesaID FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(DptoID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DptoDsc, ''))) AS ID_DptoDsc, DptoID, DptoDsc, EmprCod FROM TXPNXT002 ORDER BY ID_DptoDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W9", "SELECT DisCod, EmprCod, DptoID FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W10", "SELECT RTRIM(LTRIM(Cod_Idtx)) || '-' || RTRIM(LTRIM(COALESCE( Dsc_Idtx, ''))) AS Dsc_IdtxID, Cod_Idtx, Dsc_Idtx, EmprCod FROM TXPINDITE ORDER BY Dsc_IdtxID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W11", "SELECT DisCod, EmprCod, Cod_Idtx FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W12", "SELECT RTRIM(LTRIM(Cod_Idtx)) || '-' || RTRIM(LTRIM(COALESCE( Dsc_Idtx, ''))) AS Dsc_IdtxID, Cod_Idtx, Dsc_Idtx, EmprCod FROM TXPINDITE ORDER BY Dsc_IdtxID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W13", "SELECT DisCod, EmprCod, DisIdtx2 FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W14", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, ProForCod, ProForDsc, EmprCod FROM TXPCPROFO ORDER BY ProFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W15", "SELECT DisCod, EmprCod, DisArtAca FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W16", "SELECT ArtActivo, CliCod, EmprCod, ArtDsc, ArtCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ?) AND (? > 0) AND (Not (rtrim(ArtCod) IS NULL AND NOT(ArtCod IS NULL))) AND (ArtActivo = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W17", "SELECT DisCod, EmprCod, DisArtCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W18", "SELECT DisCod, EmprCod, DisArtCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W19", "SELECT CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W20", "SELECT DisCod, EmprCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W21", "SELECT T1.CliCod, T1.EmprCod, T2.MarcaDsc AS CliMarcaDc, T1.CliMarcaID AS CliMarcaID FROM (TXPCLIMAR T1 INNER JOIN TXPMARCAS T2 ON T2.EmprCod = T1.EmprCod AND T2.MarcaId = T1.CliMarcaID) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W22", "SELECT DisCod, EmprCod, MarcaId FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W23", "SELECT CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W24", "SELECT DisCod, EmprCod, DisCliDes FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W25", "SELECT RTRIM(LTRIM(RevenID)) || '-' || RTRIM(LTRIM(COALESCE( RevenNm, ''))) AS ID_RevenNm, RevenID, RevenNm, EmprCod FROM TXPREVEND ORDER BY ID_RevenNm ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W26", "SELECT DisCod, EmprCod, RevenID FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A1W27", "SELECT TipDisCod, TipDisDsc, EmprCod FROM TXPTIPDIS ORDER BY EmprCod, TipDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1W28", "SELECT DisCod, EmprCod, DisTipDis FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 26 :
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

