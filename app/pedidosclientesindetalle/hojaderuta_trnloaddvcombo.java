package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta_trnloaddvcombo extends GXProcedure
{
   public hojaderuta_trnloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta_trnloaddvcombo.class ), "" );
   }

   public hojaderuta_trnloaddvcombo( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> executeUdp( String aP0 ,
                                                                                    String aP1 ,
                                                                                    String aP2 ,
                                                                                    int aP3 ,
                                                                                    byte aP4 ,
                                                                                    String aP5 ,
                                                                                    String[] aP6 )
   {
      hojaderuta_trnloaddvcombo.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        String aP5 ,
                        String[] aP6 ,
                        GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             String aP5 ,
                             String[] aP6 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP7 )
   {
      hojaderuta_trnloaddvcombo.this.AV13ComboName = aP0;
      hojaderuta_trnloaddvcombo.this.AV15TrnMode = aP1;
      hojaderuta_trnloaddvcombo.this.AV17EmprCod = aP2;
      hojaderuta_trnloaddvcombo.this.AV18BarCod = aP3;
      hojaderuta_trnloaddvcombo.this.AV19BarCodReo = aP4;
      hojaderuta_trnloaddvcombo.this.AV20BarCodPar = aP5;
      hojaderuta_trnloaddvcombo.this.aP6 = aP6;
      hojaderuta_trnloaddvcombo.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09KL2 */
      pr_default.execute(0, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09KL2_A130BarCodPar[0] ;
         A132BarCodReo = P09KL2_A132BarCodReo[0] ;
         A129BarCod = P09KL2_A129BarCod[0] ;
         A396EmprCod = P09KL2_A396EmprCod[0] ;
         A252CliCod = P09KL2_A252CliCod[0] ;
         n252CliCod = P09KL2_n252CliCod[0] ;
         AV22CliCod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      if ( GXutil.strcmp(AV13ComboName, "Nxt_cpeID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_NXT_CPEID' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "Nxt_desaID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_NXT_DESAID' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "Nxt_dpoID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_NXT_DPOID' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "BarProPer") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_BARPROPER' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "BarIdtx2") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_BARIDTX2' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "BarAcaAnh") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_BARACAANH' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "BarMaqPro") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_BARMAQPRO' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "BarAcaQui") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_BARACAQUI' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "BarSua") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_BARSUA' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "BarSer") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_BARSER' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "SubRevID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_SUBREVID' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "BarCliDes") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_BARCLIDES' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "BarTipDis") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_BARTIPDIS' */
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
      /* 'LOADCOMBOITEMS_NXT_CPEID' Routine */
      returnInSub = false ;
      /* Using cursor P09KL3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14000Id_CpteDsc = P09KL3_A14000Id_CpteDsc[0] ;
         A11860CpteId = P09KL3_A11860CpteId[0] ;
         A11865CpteDsc = P09KL3_A11865CpteDsc[0] ;
         n11865CpteDsc = P09KL3_n11865CpteDsc[0] ;
         A396EmprCod = P09KL3_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11860CpteId, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14000Id_CpteDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL4 */
         pr_default.execute(2, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P09KL4_A130BarCodPar[0] ;
            A132BarCodReo = P09KL4_A132BarCodReo[0] ;
            A129BarCod = P09KL4_A129BarCod[0] ;
            A396EmprCod = P09KL4_A396EmprCod[0] ;
            A11853Nxt_cpeID = P09KL4_A11853Nxt_cpeID[0] ;
            n11853Nxt_cpeID = P09KL4_n11853Nxt_cpeID[0] ;
            AV12SelectedValue = ((0==A11853Nxt_cpeID) ? "" : GXutil.trim( GXutil.str( A11853Nxt_cpeID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_NXT_DESAID' Routine */
      returnInSub = false ;
      /* Using cursor P09KL5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13999Id_DesaDsc = P09KL5_A13999Id_DesaDsc[0] ;
         A11862DesaID = P09KL5_A11862DesaID[0] ;
         A11866DesaDsc = P09KL5_A11866DesaDsc[0] ;
         n11866DesaDsc = P09KL5_n11866DesaDsc[0] ;
         A396EmprCod = P09KL5_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11862DesaID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13999Id_DesaDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL6 */
         pr_default.execute(4, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A130BarCodPar = P09KL6_A130BarCodPar[0] ;
            A132BarCodReo = P09KL6_A132BarCodReo[0] ;
            A129BarCod = P09KL6_A129BarCod[0] ;
            A396EmprCod = P09KL6_A396EmprCod[0] ;
            A11857Nxt_desaID = P09KL6_A11857Nxt_desaID[0] ;
            n11857Nxt_desaID = P09KL6_n11857Nxt_desaID[0] ;
            AV12SelectedValue = ((0==A11857Nxt_desaID) ? "" : GXutil.trim( GXutil.str( A11857Nxt_desaID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_NXT_DPOID' Routine */
      returnInSub = false ;
      /* Using cursor P09KL7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A13998ID_DptoDsc = P09KL7_A13998ID_DptoDsc[0] ;
         A11863DptoID = P09KL7_A11863DptoID[0] ;
         A11867DptoDsc = P09KL7_A11867DptoDsc[0] ;
         n11867DptoDsc = P09KL7_n11867DptoDsc[0] ;
         A396EmprCod = P09KL7_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11863DptoID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13998ID_DptoDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL8 */
         pr_default.execute(6, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A130BarCodPar = P09KL8_A130BarCodPar[0] ;
            A132BarCodReo = P09KL8_A132BarCodReo[0] ;
            A129BarCod = P09KL8_A129BarCod[0] ;
            A396EmprCod = P09KL8_A396EmprCod[0] ;
            A11855Nxt_dpoID = P09KL8_A11855Nxt_dpoID[0] ;
            n11855Nxt_dpoID = P09KL8_n11855Nxt_dpoID[0] ;
            AV12SelectedValue = ((0==A11855Nxt_dpoID) ? "" : GXutil.trim( GXutil.str( A11855Nxt_dpoID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_BARPROPER' Routine */
      returnInSub = false ;
      /* Using cursor P09KL9 */
      pr_default.execute(7);
      while ( (pr_default.getStatus(7) != 101) )
      {
         A13810Dsc_IdtxID = P09KL9_A13810Dsc_IdtxID[0] ;
         A10887Cod_Idtx = P09KL9_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P09KL9_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P09KL9_n10888Dsc_Idtx[0] ;
         A396EmprCod = P09KL9_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13810Dsc_IdtxID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL10 */
         pr_default.execute(8, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A130BarCodPar = P09KL10_A130BarCodPar[0] ;
            A132BarCodReo = P09KL10_A132BarCodReo[0] ;
            A129BarCod = P09KL10_A129BarCod[0] ;
            A396EmprCod = P09KL10_A396EmprCod[0] ;
            A2829BarProPer = P09KL10_A2829BarProPer[0] ;
            AV12SelectedValue = A2829BarProPer ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_BARIDTX2' Routine */
      returnInSub = false ;
      /* Using cursor P09KL11 */
      pr_default.execute(9);
      while ( (pr_default.getStatus(9) != 101) )
      {
         A13810Dsc_IdtxID = P09KL11_A13810Dsc_IdtxID[0] ;
         A10887Cod_Idtx = P09KL11_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P09KL11_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P09KL11_n10888Dsc_Idtx[0] ;
         A396EmprCod = P09KL11_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13810Dsc_IdtxID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL12 */
         pr_default.execute(10, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A130BarCodPar = P09KL12_A130BarCodPar[0] ;
            A132BarCodReo = P09KL12_A132BarCodReo[0] ;
            A129BarCod = P09KL12_A129BarCod[0] ;
            A396EmprCod = P09KL12_A396EmprCod[0] ;
            A13908BarIdtx2 = P09KL12_A13908BarIdtx2[0] ;
            n13908BarIdtx2 = P09KL12_n13908BarIdtx2[0] ;
            AV12SelectedValue = A13908BarIdtx2 ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
      }
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_BARACAANH' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09KL13 */
      pr_default.execute(11, new Object[] {AV17EmprCod, Integer.valueOf(AV22CliCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A252CliCod = P09KL13_A252CliCod[0] ;
         n252CliCod = P09KL13_n252CliCod[0] ;
         A396EmprCod = P09KL13_A396EmprCod[0] ;
         A9715Tb1_Dsc = P09KL13_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P09KL13_n9715Tb1_Dsc[0] ;
         A9713Tb1_Cod = P09KL13_A9713Tb1_Cod[0] ;
         A9715Tb1_Dsc = P09KL13_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P09KL13_n9715Tb1_Dsc[0] ;
         A13785Tb1_codDsc = GXutil.trim( GXutil.str( A9713Tb1_Cod, 4, 0)) + "-" + GXutil.trim( A9715Tb1_Dsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A9713Tb1_Cod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13785Tb1_codDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(11);
      }
      pr_default.close(11);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL14 */
         pr_default.execute(12, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A130BarCodPar = P09KL14_A130BarCodPar[0] ;
            A132BarCodReo = P09KL14_A132BarCodReo[0] ;
            A129BarCod = P09KL14_A129BarCod[0] ;
            A396EmprCod = P09KL14_A396EmprCod[0] ;
            A4466BarAcaAnh = P09KL14_A4466BarAcaAnh[0] ;
            AV12SelectedValue = ((0==A4466BarAcaAnh) ? "" : GXutil.trim( GXutil.str( A4466BarAcaAnh, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(12);
      }
   }

   public void S171( )
   {
      /* 'LOADCOMBOITEMS_BARMAQPRO' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09KL15 */
      pr_default.execute(13, new Object[] {AV17EmprCod, Integer.valueOf(AV22CliCod)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A252CliCod = P09KL15_A252CliCod[0] ;
         n252CliCod = P09KL15_n252CliCod[0] ;
         A396EmprCod = P09KL15_A396EmprCod[0] ;
         A12908CliMarcaDc = P09KL15_A12908CliMarcaDc[0] ;
         n12908CliMarcaDc = P09KL15_n12908CliMarcaDc[0] ;
         A12907CliMarcaID = P09KL15_A12907CliMarcaID[0] ;
         A12908CliMarcaDc = P09KL15_A12908CliMarcaDc[0] ;
         n12908CliMarcaDc = P09KL15_n12908CliMarcaDc[0] ;
         A14004ID_CliMarc = GXutil.trim( A12907CliMarcaID) + "-" + GXutil.trim( A12908CliMarcaDc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A12907CliMarcaID );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14004ID_CliMarc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(13);
      }
      pr_default.close(13);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL16 */
         pr_default.execute(14, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A130BarCodPar = P09KL16_A130BarCodPar[0] ;
            A132BarCodReo = P09KL16_A132BarCodReo[0] ;
            A129BarCod = P09KL16_A129BarCod[0] ;
            A396EmprCod = P09KL16_A396EmprCod[0] ;
            A181BarMaqPro = P09KL16_A181BarMaqPro[0] ;
            AV12SelectedValue = A181BarMaqPro ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(14);
      }
   }

   public void S181( )
   {
      /* 'LOADCOMBOITEMS_BARACAQUI' Routine */
      returnInSub = false ;
      /* Using cursor P09KL17 */
      pr_default.execute(15);
      while ( (pr_default.getStatus(15) != 101) )
      {
         A13740ProFDsc = P09KL17_A13740ProFDsc[0] ;
         A764ProForCod = P09KL17_A764ProForCod[0] ;
         A766ProForDsc = P09KL17_A766ProForDsc[0] ;
         A396EmprCod = P09KL17_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(15);
      }
      pr_default.close(15);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL18 */
         pr_default.execute(16, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(16) != 101) )
         {
            A130BarCodPar = P09KL18_A130BarCodPar[0] ;
            A132BarCodReo = P09KL18_A132BarCodReo[0] ;
            A129BarCod = P09KL18_A129BarCod[0] ;
            A396EmprCod = P09KL18_A396EmprCod[0] ;
            A118BarAcaQui = P09KL18_A118BarAcaQui[0] ;
            AV12SelectedValue = A118BarAcaQui ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(16);
      }
   }

   public void S191( )
   {
      /* 'LOADCOMBOITEMS_BARSUA' Routine */
      returnInSub = false ;
      /* Using cursor P09KL19 */
      pr_default.execute(17);
      while ( (pr_default.getStatus(17) != 101) )
      {
         A13740ProFDsc = P09KL19_A13740ProFDsc[0] ;
         A764ProForCod = P09KL19_A764ProForCod[0] ;
         A766ProForDsc = P09KL19_A766ProForDsc[0] ;
         A396EmprCod = P09KL19_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(17);
      }
      pr_default.close(17);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL20 */
         pr_default.execute(18, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(18) != 101) )
         {
            A130BarCodPar = P09KL20_A130BarCodPar[0] ;
            A132BarCodReo = P09KL20_A132BarCodReo[0] ;
            A129BarCod = P09KL20_A129BarCod[0] ;
            A396EmprCod = P09KL20_A396EmprCod[0] ;
            A214BarSua = P09KL20_A214BarSua[0] ;
            AV12SelectedValue = A214BarSua ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(18);
      }
   }

   public void S201( )
   {
      /* 'LOADCOMBOITEMS_BARSER' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09KL21 */
      pr_default.execute(19, new Object[] {AV17EmprCod, Integer.valueOf(AV22CliCod)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A252CliCod = P09KL21_A252CliCod[0] ;
         n252CliCod = P09KL21_n252CliCod[0] ;
         A396EmprCod = P09KL21_A396EmprCod[0] ;
         A69ArtDsc = P09KL21_A69ArtDsc[0] ;
         n69ArtDsc = P09KL21_n69ArtDsc[0] ;
         A65ArtCod = P09KL21_A65ArtCod[0] ;
         A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13751ArtCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(19);
      }
      pr_default.close(19);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL22 */
         pr_default.execute(20, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(20) != 101) )
         {
            A130BarCodPar = P09KL22_A130BarCodPar[0] ;
            A132BarCodReo = P09KL22_A132BarCodReo[0] ;
            A129BarCod = P09KL22_A129BarCod[0] ;
            A396EmprCod = P09KL22_A396EmprCod[0] ;
            A212BarSer = P09KL22_A212BarSer[0] ;
            AV12SelectedValue = A212BarSer ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(20);
      }
   }

   public void S211( )
   {
      /* 'LOADCOMBOITEMS_SUBREVID' Routine */
      returnInSub = false ;
      /* Using cursor P09KL23 */
      pr_default.execute(21);
      while ( (pr_default.getStatus(21) != 101) )
      {
         A14002ID_RevenNm = P09KL23_A14002ID_RevenNm[0] ;
         A12328RevenID = P09KL23_A12328RevenID[0] ;
         A12327RevenNm = P09KL23_A12327RevenNm[0] ;
         n12327RevenNm = P09KL23_n12327RevenNm[0] ;
         A396EmprCod = P09KL23_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A12328RevenID );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A14002ID_RevenNm );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(21);
      }
      pr_default.close(21);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL24 */
         pr_default.execute(22, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(22) != 101) )
         {
            A130BarCodPar = P09KL24_A130BarCodPar[0] ;
            A132BarCodReo = P09KL24_A132BarCodReo[0] ;
            A129BarCod = P09KL24_A129BarCod[0] ;
            A396EmprCod = P09KL24_A396EmprCod[0] ;
            A12329SubRevID = P09KL24_A12329SubRevID[0] ;
            n12329SubRevID = P09KL24_n12329SubRevID[0] ;
            AV12SelectedValue = A12329SubRevID ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(22);
      }
   }

   public void S221( )
   {
      /* 'LOADCOMBOITEMS_BARCLIDES' Routine */
      returnInSub = false ;
      /* Using cursor P09KL25 */
      pr_default.execute(23);
      while ( (pr_default.getStatus(23) != 101) )
      {
         A10045CliAct = P09KL25_A10045CliAct[0] ;
         A13735CliCNom = P09KL25_A13735CliCNom[0] ;
         A252CliCod = P09KL25_A252CliCod[0] ;
         n252CliCod = P09KL25_n252CliCod[0] ;
         A279CliNom = P09KL25_A279CliNom[0] ;
         A396EmprCod = P09KL25_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(23);
      }
      pr_default.close(23);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL26 */
         pr_default.execute(24, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(24) != 101) )
         {
            A130BarCodPar = P09KL26_A130BarCodPar[0] ;
            A132BarCodReo = P09KL26_A132BarCodReo[0] ;
            A129BarCod = P09KL26_A129BarCod[0] ;
            A396EmprCod = P09KL26_A396EmprCod[0] ;
            A2311BarCliDes = P09KL26_A2311BarCliDes[0] ;
            AV12SelectedValue = ((0==A2311BarCliDes) ? "" : GXutil.trim( GXutil.str( A2311BarCliDes, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(24);
      }
   }

   public void S231( )
   {
      /* 'LOADCOMBOITEMS_BARTIPDIS' Routine */
      returnInSub = false ;
      /* Using cursor P09KL27 */
      pr_default.execute(25);
      while ( (pr_default.getStatus(25) != 101) )
      {
         A13845TipDisDscI = P09KL27_A13845TipDisDscI[0] ;
         A5098TipDisCod = P09KL27_A5098TipDisCod[0] ;
         A5097TipDisDsc = P09KL27_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P09KL27_n5097TipDisDsc[0] ;
         A396EmprCod = P09KL27_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A5098TipDisCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13845TipDisDscI );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(25);
      }
      pr_default.close(25);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09KL28 */
         pr_default.execute(26, new Object[] {AV17EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(26) != 101) )
         {
            A130BarCodPar = P09KL28_A130BarCodPar[0] ;
            A132BarCodReo = P09KL28_A132BarCodReo[0] ;
            A129BarCod = P09KL28_A129BarCod[0] ;
            A396EmprCod = P09KL28_A396EmprCod[0] ;
            A2010BarTipDis = P09KL28_A2010BarTipDis[0] ;
            AV12SelectedValue = A2010BarTipDis ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(26);
      }
   }

   protected void cleanup( )
   {
      this.aP6[0] = hojaderuta_trnloaddvcombo.this.AV12SelectedValue;
      this.aP7[0] = hojaderuta_trnloaddvcombo.this.AV10Combo_Data;
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
      scmdbuf = "" ;
      P09KL2_A130BarCodPar = new String[] {""} ;
      P09KL2_A132BarCodReo = new byte[1] ;
      P09KL2_A129BarCod = new int[1] ;
      P09KL2_A396EmprCod = new String[] {""} ;
      P09KL2_A252CliCod = new int[1] ;
      P09KL2_n252CliCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      P09KL3_A14000Id_CpteDsc = new String[] {""} ;
      P09KL3_A11860CpteId = new short[1] ;
      P09KL3_A11865CpteDsc = new String[] {""} ;
      P09KL3_n11865CpteDsc = new boolean[] {false} ;
      P09KL3_A396EmprCod = new String[] {""} ;
      A14000Id_CpteDsc = "" ;
      A11865CpteDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09KL4_A130BarCodPar = new String[] {""} ;
      P09KL4_A132BarCodReo = new byte[1] ;
      P09KL4_A129BarCod = new int[1] ;
      P09KL4_A396EmprCod = new String[] {""} ;
      P09KL4_A11853Nxt_cpeID = new short[1] ;
      P09KL4_n11853Nxt_cpeID = new boolean[] {false} ;
      P09KL5_A13999Id_DesaDsc = new String[] {""} ;
      P09KL5_A11862DesaID = new short[1] ;
      P09KL5_A11866DesaDsc = new String[] {""} ;
      P09KL5_n11866DesaDsc = new boolean[] {false} ;
      P09KL5_A396EmprCod = new String[] {""} ;
      A13999Id_DesaDsc = "" ;
      A11866DesaDsc = "" ;
      P09KL6_A130BarCodPar = new String[] {""} ;
      P09KL6_A132BarCodReo = new byte[1] ;
      P09KL6_A129BarCod = new int[1] ;
      P09KL6_A396EmprCod = new String[] {""} ;
      P09KL6_A11857Nxt_desaID = new short[1] ;
      P09KL6_n11857Nxt_desaID = new boolean[] {false} ;
      P09KL7_A13998ID_DptoDsc = new String[] {""} ;
      P09KL7_A11863DptoID = new short[1] ;
      P09KL7_A11867DptoDsc = new String[] {""} ;
      P09KL7_n11867DptoDsc = new boolean[] {false} ;
      P09KL7_A396EmprCod = new String[] {""} ;
      A13998ID_DptoDsc = "" ;
      A11867DptoDsc = "" ;
      P09KL8_A130BarCodPar = new String[] {""} ;
      P09KL8_A132BarCodReo = new byte[1] ;
      P09KL8_A129BarCod = new int[1] ;
      P09KL8_A396EmprCod = new String[] {""} ;
      P09KL8_A11855Nxt_dpoID = new short[1] ;
      P09KL8_n11855Nxt_dpoID = new boolean[] {false} ;
      P09KL9_A13810Dsc_IdtxID = new String[] {""} ;
      P09KL9_A10887Cod_Idtx = new String[] {""} ;
      P09KL9_A10888Dsc_Idtx = new String[] {""} ;
      P09KL9_n10888Dsc_Idtx = new boolean[] {false} ;
      P09KL9_A396EmprCod = new String[] {""} ;
      A13810Dsc_IdtxID = "" ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      P09KL10_A130BarCodPar = new String[] {""} ;
      P09KL10_A132BarCodReo = new byte[1] ;
      P09KL10_A129BarCod = new int[1] ;
      P09KL10_A396EmprCod = new String[] {""} ;
      P09KL10_A2829BarProPer = new String[] {""} ;
      A2829BarProPer = "" ;
      P09KL11_A13810Dsc_IdtxID = new String[] {""} ;
      P09KL11_A10887Cod_Idtx = new String[] {""} ;
      P09KL11_A10888Dsc_Idtx = new String[] {""} ;
      P09KL11_n10888Dsc_Idtx = new boolean[] {false} ;
      P09KL11_A396EmprCod = new String[] {""} ;
      P09KL12_A130BarCodPar = new String[] {""} ;
      P09KL12_A132BarCodReo = new byte[1] ;
      P09KL12_A129BarCod = new int[1] ;
      P09KL12_A396EmprCod = new String[] {""} ;
      P09KL12_A13908BarIdtx2 = new String[] {""} ;
      P09KL12_n13908BarIdtx2 = new boolean[] {false} ;
      A13908BarIdtx2 = "" ;
      P09KL13_A252CliCod = new int[1] ;
      P09KL13_n252CliCod = new boolean[] {false} ;
      P09KL13_A396EmprCod = new String[] {""} ;
      P09KL13_A9715Tb1_Dsc = new String[] {""} ;
      P09KL13_n9715Tb1_Dsc = new boolean[] {false} ;
      P09KL13_A9713Tb1_Cod = new short[1] ;
      A9715Tb1_Dsc = "" ;
      A13785Tb1_codDsc = "" ;
      P09KL14_A130BarCodPar = new String[] {""} ;
      P09KL14_A132BarCodReo = new byte[1] ;
      P09KL14_A129BarCod = new int[1] ;
      P09KL14_A396EmprCod = new String[] {""} ;
      P09KL14_A4466BarAcaAnh = new short[1] ;
      P09KL15_A252CliCod = new int[1] ;
      P09KL15_n252CliCod = new boolean[] {false} ;
      P09KL15_A396EmprCod = new String[] {""} ;
      P09KL15_A12908CliMarcaDc = new String[] {""} ;
      P09KL15_n12908CliMarcaDc = new boolean[] {false} ;
      P09KL15_A12907CliMarcaID = new String[] {""} ;
      A12908CliMarcaDc = "" ;
      A12907CliMarcaID = "" ;
      A14004ID_CliMarc = "" ;
      P09KL16_A130BarCodPar = new String[] {""} ;
      P09KL16_A132BarCodReo = new byte[1] ;
      P09KL16_A129BarCod = new int[1] ;
      P09KL16_A396EmprCod = new String[] {""} ;
      P09KL16_A181BarMaqPro = new String[] {""} ;
      A181BarMaqPro = "" ;
      P09KL17_A13740ProFDsc = new String[] {""} ;
      P09KL17_A764ProForCod = new String[] {""} ;
      P09KL17_A766ProForDsc = new String[] {""} ;
      P09KL17_A396EmprCod = new String[] {""} ;
      A13740ProFDsc = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      P09KL18_A130BarCodPar = new String[] {""} ;
      P09KL18_A132BarCodReo = new byte[1] ;
      P09KL18_A129BarCod = new int[1] ;
      P09KL18_A396EmprCod = new String[] {""} ;
      P09KL18_A118BarAcaQui = new String[] {""} ;
      A118BarAcaQui = "" ;
      P09KL19_A13740ProFDsc = new String[] {""} ;
      P09KL19_A764ProForCod = new String[] {""} ;
      P09KL19_A766ProForDsc = new String[] {""} ;
      P09KL19_A396EmprCod = new String[] {""} ;
      P09KL20_A130BarCodPar = new String[] {""} ;
      P09KL20_A132BarCodReo = new byte[1] ;
      P09KL20_A129BarCod = new int[1] ;
      P09KL20_A396EmprCod = new String[] {""} ;
      P09KL20_A214BarSua = new String[] {""} ;
      A214BarSua = "" ;
      P09KL21_A252CliCod = new int[1] ;
      P09KL21_n252CliCod = new boolean[] {false} ;
      P09KL21_A396EmprCod = new String[] {""} ;
      P09KL21_A69ArtDsc = new String[] {""} ;
      P09KL21_n69ArtDsc = new boolean[] {false} ;
      P09KL21_A65ArtCod = new String[] {""} ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      A13751ArtCDsc = "" ;
      P09KL22_A130BarCodPar = new String[] {""} ;
      P09KL22_A132BarCodReo = new byte[1] ;
      P09KL22_A129BarCod = new int[1] ;
      P09KL22_A396EmprCod = new String[] {""} ;
      P09KL22_A212BarSer = new String[] {""} ;
      A212BarSer = "" ;
      P09KL23_A14002ID_RevenNm = new String[] {""} ;
      P09KL23_A12328RevenID = new String[] {""} ;
      P09KL23_A12327RevenNm = new String[] {""} ;
      P09KL23_n12327RevenNm = new boolean[] {false} ;
      P09KL23_A396EmprCod = new String[] {""} ;
      A14002ID_RevenNm = "" ;
      A12328RevenID = "" ;
      A12327RevenNm = "" ;
      P09KL24_A130BarCodPar = new String[] {""} ;
      P09KL24_A132BarCodReo = new byte[1] ;
      P09KL24_A129BarCod = new int[1] ;
      P09KL24_A396EmprCod = new String[] {""} ;
      P09KL24_A12329SubRevID = new String[] {""} ;
      P09KL24_n12329SubRevID = new boolean[] {false} ;
      A12329SubRevID = "" ;
      P09KL25_A10045CliAct = new String[] {""} ;
      P09KL25_A13735CliCNom = new String[] {""} ;
      P09KL25_A252CliCod = new int[1] ;
      P09KL25_n252CliCod = new boolean[] {false} ;
      P09KL25_A279CliNom = new String[] {""} ;
      P09KL25_A396EmprCod = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      P09KL26_A130BarCodPar = new String[] {""} ;
      P09KL26_A132BarCodReo = new byte[1] ;
      P09KL26_A129BarCod = new int[1] ;
      P09KL26_A396EmprCod = new String[] {""} ;
      P09KL26_A2311BarCliDes = new int[1] ;
      P09KL27_A13845TipDisDscI = new String[] {""} ;
      P09KL27_A5098TipDisCod = new String[] {""} ;
      P09KL27_A5097TipDisDsc = new String[] {""} ;
      P09KL27_n5097TipDisDsc = new boolean[] {false} ;
      P09KL27_A396EmprCod = new String[] {""} ;
      A13845TipDisDscI = "" ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      P09KL28_A130BarCodPar = new String[] {""} ;
      P09KL28_A132BarCodReo = new byte[1] ;
      P09KL28_A129BarCod = new int[1] ;
      P09KL28_A396EmprCod = new String[] {""} ;
      P09KL28_A2010BarTipDis = new String[] {""} ;
      A2010BarTipDis = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_trnloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09KL2_A130BarCodPar, P09KL2_A132BarCodReo, P09KL2_A129BarCod, P09KL2_A396EmprCod, P09KL2_A252CliCod, P09KL2_n252CliCod
            }
            , new Object[] {
            P09KL3_A14000Id_CpteDsc, P09KL3_A11860CpteId, P09KL3_A11865CpteDsc, P09KL3_n11865CpteDsc, P09KL3_A396EmprCod
            }
            , new Object[] {
            P09KL4_A130BarCodPar, P09KL4_A132BarCodReo, P09KL4_A129BarCod, P09KL4_A396EmprCod, P09KL4_A11853Nxt_cpeID, P09KL4_n11853Nxt_cpeID
            }
            , new Object[] {
            P09KL5_A13999Id_DesaDsc, P09KL5_A11862DesaID, P09KL5_A11866DesaDsc, P09KL5_n11866DesaDsc, P09KL5_A396EmprCod
            }
            , new Object[] {
            P09KL6_A130BarCodPar, P09KL6_A132BarCodReo, P09KL6_A129BarCod, P09KL6_A396EmprCod, P09KL6_A11857Nxt_desaID, P09KL6_n11857Nxt_desaID
            }
            , new Object[] {
            P09KL7_A13998ID_DptoDsc, P09KL7_A11863DptoID, P09KL7_A11867DptoDsc, P09KL7_n11867DptoDsc, P09KL7_A396EmprCod
            }
            , new Object[] {
            P09KL8_A130BarCodPar, P09KL8_A132BarCodReo, P09KL8_A129BarCod, P09KL8_A396EmprCod, P09KL8_A11855Nxt_dpoID, P09KL8_n11855Nxt_dpoID
            }
            , new Object[] {
            P09KL9_A13810Dsc_IdtxID, P09KL9_A10887Cod_Idtx, P09KL9_A10888Dsc_Idtx, P09KL9_n10888Dsc_Idtx, P09KL9_A396EmprCod
            }
            , new Object[] {
            P09KL10_A130BarCodPar, P09KL10_A132BarCodReo, P09KL10_A129BarCod, P09KL10_A396EmprCod, P09KL10_A2829BarProPer
            }
            , new Object[] {
            P09KL11_A13810Dsc_IdtxID, P09KL11_A10887Cod_Idtx, P09KL11_A10888Dsc_Idtx, P09KL11_n10888Dsc_Idtx, P09KL11_A396EmprCod
            }
            , new Object[] {
            P09KL12_A130BarCodPar, P09KL12_A132BarCodReo, P09KL12_A129BarCod, P09KL12_A396EmprCod, P09KL12_A13908BarIdtx2, P09KL12_n13908BarIdtx2
            }
            , new Object[] {
            P09KL13_A252CliCod, P09KL13_A396EmprCod, P09KL13_A9715Tb1_Dsc, P09KL13_n9715Tb1_Dsc, P09KL13_A9713Tb1_Cod
            }
            , new Object[] {
            P09KL14_A130BarCodPar, P09KL14_A132BarCodReo, P09KL14_A129BarCod, P09KL14_A396EmprCod, P09KL14_A4466BarAcaAnh
            }
            , new Object[] {
            P09KL15_A252CliCod, P09KL15_A396EmprCod, P09KL15_A12908CliMarcaDc, P09KL15_n12908CliMarcaDc, P09KL15_A12907CliMarcaID
            }
            , new Object[] {
            P09KL16_A130BarCodPar, P09KL16_A132BarCodReo, P09KL16_A129BarCod, P09KL16_A396EmprCod, P09KL16_A181BarMaqPro
            }
            , new Object[] {
            P09KL17_A13740ProFDsc, P09KL17_A764ProForCod, P09KL17_A766ProForDsc, P09KL17_A396EmprCod
            }
            , new Object[] {
            P09KL18_A130BarCodPar, P09KL18_A132BarCodReo, P09KL18_A129BarCod, P09KL18_A396EmprCod, P09KL18_A118BarAcaQui
            }
            , new Object[] {
            P09KL19_A13740ProFDsc, P09KL19_A764ProForCod, P09KL19_A766ProForDsc, P09KL19_A396EmprCod
            }
            , new Object[] {
            P09KL20_A130BarCodPar, P09KL20_A132BarCodReo, P09KL20_A129BarCod, P09KL20_A396EmprCod, P09KL20_A214BarSua
            }
            , new Object[] {
            P09KL21_A252CliCod, P09KL21_A396EmprCod, P09KL21_A69ArtDsc, P09KL21_n69ArtDsc, P09KL21_A65ArtCod
            }
            , new Object[] {
            P09KL22_A130BarCodPar, P09KL22_A132BarCodReo, P09KL22_A129BarCod, P09KL22_A396EmprCod, P09KL22_A212BarSer
            }
            , new Object[] {
            P09KL23_A14002ID_RevenNm, P09KL23_A12328RevenID, P09KL23_A12327RevenNm, P09KL23_n12327RevenNm, P09KL23_A396EmprCod
            }
            , new Object[] {
            P09KL24_A130BarCodPar, P09KL24_A132BarCodReo, P09KL24_A129BarCod, P09KL24_A396EmprCod, P09KL24_A12329SubRevID, P09KL24_n12329SubRevID
            }
            , new Object[] {
            P09KL25_A10045CliAct, P09KL25_A13735CliCNom, P09KL25_A252CliCod, P09KL25_A279CliNom, P09KL25_A396EmprCod
            }
            , new Object[] {
            P09KL26_A130BarCodPar, P09KL26_A132BarCodReo, P09KL26_A129BarCod, P09KL26_A396EmprCod, P09KL26_A2311BarCliDes
            }
            , new Object[] {
            P09KL27_A13845TipDisDscI, P09KL27_A5098TipDisCod, P09KL27_A5097TipDisDsc, P09KL27_n5097TipDisDsc, P09KL27_A396EmprCod
            }
            , new Object[] {
            P09KL28_A130BarCodPar, P09KL28_A132BarCodReo, P09KL28_A129BarCod, P09KL28_A396EmprCod, P09KL28_A2010BarTipDis
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19BarCodReo ;
   private byte A132BarCodReo ;
   private short A11860CpteId ;
   private short A11853Nxt_cpeID ;
   private short A11862DesaID ;
   private short A11857Nxt_desaID ;
   private short A11863DptoID ;
   private short A11855Nxt_dpoID ;
   private short A9713Tb1_Cod ;
   private short A4466BarAcaAnh ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV22CliCod ;
   private int A2311BarCliDes ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String AV20BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A14000Id_CpteDsc ;
   private String A11865CpteDsc ;
   private String A13999Id_DesaDsc ;
   private String A11866DesaDsc ;
   private String A13998ID_DptoDsc ;
   private String A11867DptoDsc ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A2829BarProPer ;
   private String A13908BarIdtx2 ;
   private String A9715Tb1_Dsc ;
   private String A12908CliMarcaDc ;
   private String A12907CliMarcaID ;
   private String A14004ID_CliMarc ;
   private String A181BarMaqPro ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A118BarAcaQui ;
   private String A214BarSua ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private String A212BarSer ;
   private String A14002ID_RevenNm ;
   private String A12328RevenID ;
   private String A12327RevenNm ;
   private String A12329SubRevID ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A5098TipDisCod ;
   private String A5097TipDisDsc ;
   private String A2010BarTipDis ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n11865CpteDsc ;
   private boolean n11853Nxt_cpeID ;
   private boolean n11866DesaDsc ;
   private boolean n11857Nxt_desaID ;
   private boolean n11867DptoDsc ;
   private boolean n11855Nxt_dpoID ;
   private boolean n10888Dsc_Idtx ;
   private boolean n13908BarIdtx2 ;
   private boolean n9715Tb1_Dsc ;
   private boolean n12908CliMarcaDc ;
   private boolean n69ArtDsc ;
   private boolean n12327RevenNm ;
   private boolean n12329SubRevID ;
   private boolean n5097TipDisDsc ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13810Dsc_IdtxID ;
   private String A13785Tb1_codDsc ;
   private String A13740ProFDsc ;
   private String A13751ArtCDsc ;
   private String A13735CliCNom ;
   private String A13845TipDisDscI ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP7 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P09KL2_A130BarCodPar ;
   private byte[] P09KL2_A132BarCodReo ;
   private int[] P09KL2_A129BarCod ;
   private String[] P09KL2_A396EmprCod ;
   private int[] P09KL2_A252CliCod ;
   private boolean[] P09KL2_n252CliCod ;
   private String[] P09KL3_A14000Id_CpteDsc ;
   private short[] P09KL3_A11860CpteId ;
   private String[] P09KL3_A11865CpteDsc ;
   private boolean[] P09KL3_n11865CpteDsc ;
   private String[] P09KL3_A396EmprCod ;
   private String[] P09KL4_A130BarCodPar ;
   private byte[] P09KL4_A132BarCodReo ;
   private int[] P09KL4_A129BarCod ;
   private String[] P09KL4_A396EmprCod ;
   private short[] P09KL4_A11853Nxt_cpeID ;
   private boolean[] P09KL4_n11853Nxt_cpeID ;
   private String[] P09KL5_A13999Id_DesaDsc ;
   private short[] P09KL5_A11862DesaID ;
   private String[] P09KL5_A11866DesaDsc ;
   private boolean[] P09KL5_n11866DesaDsc ;
   private String[] P09KL5_A396EmprCod ;
   private String[] P09KL6_A130BarCodPar ;
   private byte[] P09KL6_A132BarCodReo ;
   private int[] P09KL6_A129BarCod ;
   private String[] P09KL6_A396EmprCod ;
   private short[] P09KL6_A11857Nxt_desaID ;
   private boolean[] P09KL6_n11857Nxt_desaID ;
   private String[] P09KL7_A13998ID_DptoDsc ;
   private short[] P09KL7_A11863DptoID ;
   private String[] P09KL7_A11867DptoDsc ;
   private boolean[] P09KL7_n11867DptoDsc ;
   private String[] P09KL7_A396EmprCod ;
   private String[] P09KL8_A130BarCodPar ;
   private byte[] P09KL8_A132BarCodReo ;
   private int[] P09KL8_A129BarCod ;
   private String[] P09KL8_A396EmprCod ;
   private short[] P09KL8_A11855Nxt_dpoID ;
   private boolean[] P09KL8_n11855Nxt_dpoID ;
   private String[] P09KL9_A13810Dsc_IdtxID ;
   private String[] P09KL9_A10887Cod_Idtx ;
   private String[] P09KL9_A10888Dsc_Idtx ;
   private boolean[] P09KL9_n10888Dsc_Idtx ;
   private String[] P09KL9_A396EmprCod ;
   private String[] P09KL10_A130BarCodPar ;
   private byte[] P09KL10_A132BarCodReo ;
   private int[] P09KL10_A129BarCod ;
   private String[] P09KL10_A396EmprCod ;
   private String[] P09KL10_A2829BarProPer ;
   private String[] P09KL11_A13810Dsc_IdtxID ;
   private String[] P09KL11_A10887Cod_Idtx ;
   private String[] P09KL11_A10888Dsc_Idtx ;
   private boolean[] P09KL11_n10888Dsc_Idtx ;
   private String[] P09KL11_A396EmprCod ;
   private String[] P09KL12_A130BarCodPar ;
   private byte[] P09KL12_A132BarCodReo ;
   private int[] P09KL12_A129BarCod ;
   private String[] P09KL12_A396EmprCod ;
   private String[] P09KL12_A13908BarIdtx2 ;
   private boolean[] P09KL12_n13908BarIdtx2 ;
   private int[] P09KL13_A252CliCod ;
   private boolean[] P09KL13_n252CliCod ;
   private String[] P09KL13_A396EmprCod ;
   private String[] P09KL13_A9715Tb1_Dsc ;
   private boolean[] P09KL13_n9715Tb1_Dsc ;
   private short[] P09KL13_A9713Tb1_Cod ;
   private String[] P09KL14_A130BarCodPar ;
   private byte[] P09KL14_A132BarCodReo ;
   private int[] P09KL14_A129BarCod ;
   private String[] P09KL14_A396EmprCod ;
   private short[] P09KL14_A4466BarAcaAnh ;
   private int[] P09KL15_A252CliCod ;
   private boolean[] P09KL15_n252CliCod ;
   private String[] P09KL15_A396EmprCod ;
   private String[] P09KL15_A12908CliMarcaDc ;
   private boolean[] P09KL15_n12908CliMarcaDc ;
   private String[] P09KL15_A12907CliMarcaID ;
   private String[] P09KL16_A130BarCodPar ;
   private byte[] P09KL16_A132BarCodReo ;
   private int[] P09KL16_A129BarCod ;
   private String[] P09KL16_A396EmprCod ;
   private String[] P09KL16_A181BarMaqPro ;
   private String[] P09KL17_A13740ProFDsc ;
   private String[] P09KL17_A764ProForCod ;
   private String[] P09KL17_A766ProForDsc ;
   private String[] P09KL17_A396EmprCod ;
   private String[] P09KL18_A130BarCodPar ;
   private byte[] P09KL18_A132BarCodReo ;
   private int[] P09KL18_A129BarCod ;
   private String[] P09KL18_A396EmprCod ;
   private String[] P09KL18_A118BarAcaQui ;
   private String[] P09KL19_A13740ProFDsc ;
   private String[] P09KL19_A764ProForCod ;
   private String[] P09KL19_A766ProForDsc ;
   private String[] P09KL19_A396EmprCod ;
   private String[] P09KL20_A130BarCodPar ;
   private byte[] P09KL20_A132BarCodReo ;
   private int[] P09KL20_A129BarCod ;
   private String[] P09KL20_A396EmprCod ;
   private String[] P09KL20_A214BarSua ;
   private int[] P09KL21_A252CliCod ;
   private boolean[] P09KL21_n252CliCod ;
   private String[] P09KL21_A396EmprCod ;
   private String[] P09KL21_A69ArtDsc ;
   private boolean[] P09KL21_n69ArtDsc ;
   private String[] P09KL21_A65ArtCod ;
   private String[] P09KL22_A130BarCodPar ;
   private byte[] P09KL22_A132BarCodReo ;
   private int[] P09KL22_A129BarCod ;
   private String[] P09KL22_A396EmprCod ;
   private String[] P09KL22_A212BarSer ;
   private String[] P09KL23_A14002ID_RevenNm ;
   private String[] P09KL23_A12328RevenID ;
   private String[] P09KL23_A12327RevenNm ;
   private boolean[] P09KL23_n12327RevenNm ;
   private String[] P09KL23_A396EmprCod ;
   private String[] P09KL24_A130BarCodPar ;
   private byte[] P09KL24_A132BarCodReo ;
   private int[] P09KL24_A129BarCod ;
   private String[] P09KL24_A396EmprCod ;
   private String[] P09KL24_A12329SubRevID ;
   private boolean[] P09KL24_n12329SubRevID ;
   private String[] P09KL25_A10045CliAct ;
   private String[] P09KL25_A13735CliCNom ;
   private int[] P09KL25_A252CliCod ;
   private boolean[] P09KL25_n252CliCod ;
   private String[] P09KL25_A279CliNom ;
   private String[] P09KL25_A396EmprCod ;
   private String[] P09KL26_A130BarCodPar ;
   private byte[] P09KL26_A132BarCodReo ;
   private int[] P09KL26_A129BarCod ;
   private String[] P09KL26_A396EmprCod ;
   private int[] P09KL26_A2311BarCliDes ;
   private String[] P09KL27_A13845TipDisDscI ;
   private String[] P09KL27_A5098TipDisCod ;
   private String[] P09KL27_A5097TipDisDsc ;
   private boolean[] P09KL27_n5097TipDisDsc ;
   private String[] P09KL27_A396EmprCod ;
   private String[] P09KL28_A130BarCodPar ;
   private byte[] P09KL28_A132BarCodReo ;
   private int[] P09KL28_A129BarCod ;
   private String[] P09KL28_A396EmprCod ;
   private String[] P09KL28_A2010BarTipDis ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class hojaderuta_trnloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09KL2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL3", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CpteId,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( CpteDsc, ''))) AS Id_CpteDsc, CpteId, CpteDsc, EmprCod FROM TXPNXT000 ORDER BY Id_CpteDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL4", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, Nxt_cpeID FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL5", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(DesaID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DesaDsc, ''))) AS Id_DesaDsc, DesaID, DesaDsc, EmprCod FROM TXPNXT001 ORDER BY Id_DesaDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL6", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, Nxt_desaID FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL7", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(DptoID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( DptoDsc, ''))) AS ID_DptoDsc, DptoID, DptoDsc, EmprCod FROM TXPNXT002 ORDER BY ID_DptoDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL8", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, Nxt_dpoID FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL9", "SELECT RTRIM(LTRIM(Cod_Idtx)) || '-' || RTRIM(LTRIM(COALESCE( Dsc_Idtx, ''))) AS Dsc_IdtxID, Cod_Idtx, Dsc_Idtx, EmprCod FROM TXPINDITE ORDER BY Dsc_IdtxID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL10", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarProPer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL11", "SELECT RTRIM(LTRIM(Cod_Idtx)) || '-' || RTRIM(LTRIM(COALESCE( Dsc_Idtx, ''))) AS Dsc_IdtxID, Cod_Idtx, Dsc_Idtx, EmprCod FROM TXPINDITE ORDER BY Dsc_IdtxID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL12", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarIdtx2 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL13", "SELECT T1.CliCod, T1.EmprCod, T2.Tb1_Dsc, T1.Tb1_Cod FROM (TXPTABLA4 T1 INNER JOIN TXPTABLE1 T2 ON T2.EmprCod = T1.EmprCod AND T2.Tb1_Cod = T1.Tb1_Cod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL14", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAcaAnh FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL15", "SELECT T1.CliCod, T1.EmprCod, T2.MarcaDsc AS CliMarcaDc, T1.CliMarcaID AS CliMarcaID FROM (TXPCLIMAR T1 INNER JOIN TXPMARCAS T2 ON T2.EmprCod = T1.EmprCod AND T2.MarcaId = T1.CliMarcaID) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL16", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarMaqPro FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL17", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, ProForCod, ProForDsc, EmprCod FROM TXPCPROFO ORDER BY ProFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL18", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAcaQui FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL19", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, ProForCod, ProForDsc, EmprCod FROM TXPCPROFO ORDER BY ProFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL20", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSua FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL21", "SELECT CliCod, EmprCod, ArtDsc, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL22", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL23", "SELECT RTRIM(LTRIM(RevenID)) || '-' || RTRIM(LTRIM(COALESCE( RevenNm, ''))) AS ID_RevenNm, RevenID, RevenNm, EmprCod FROM TXPREVEND ORDER BY ID_RevenNm ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL24", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, SubRevID FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL25", "SELECT CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL26", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarCliDes FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09KL27", "SELECT RTRIM(LTRIM(TipDisCod)) || '-' || RTRIM(LTRIM(COALESCE( TipDisDsc, ''))) AS TipDisDscI, TipDisCod, TipDisDsc, EmprCod FROM TXPTIPDIS ORDER BY TipDisDscI ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09KL28", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarTipDis FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

