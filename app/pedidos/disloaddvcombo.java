package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disloaddvcombo extends GXProcedure
{
   public disloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disloaddvcombo.class ), "" );
   }

   public disloaddvcombo( int remoteHandle ,
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
      disloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      disloaddvcombo.this.AV12ComboName = aP0;
      disloaddvcombo.this.AV13TrnMode = aP1;
      disloaddvcombo.this.AV14EmprCod = aP2;
      disloaddvcombo.this.AV15DisCod = aP3;
      disloaddvcombo.this.aP4 = aP4;
      disloaddvcombo.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(AV12ComboName, "DisIdtx2") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISIDTX2' */
         S121 ();
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
         S131 ();
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
         S141 ();
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
         S151 ();
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
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DisAcaAnh") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISACAANH' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "DisTipCol") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISTIPCOL' */
         S181 ();
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
      else if ( GXutil.strcmp(AV12ComboName, "DisArtTip") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_DISARTTIP' */
         S211 ();
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
         S221 ();
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
         S231 ();
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
         S241 ();
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
         S251 ();
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
         S261 ();
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
      AV10Combo_Data.clear();
      /* Using cursor P09V52 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09V52_A396EmprCod[0] ;
         A602MaqCod = P09V52_A602MaqCod[0] ;
         A606MaqDsc = P09V52_A606MaqDsc[0] ;
         n606MaqDsc = P09V52_n606MaqDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A606MaqDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V53 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A361DisCod = P09V53_A361DisCod[0] ;
            A396EmprCod = P09V53_A396EmprCod[0] ;
            A1122MaqCodDis = P09V53_A1122MaqCodDis[0] ;
            n1122MaqCodDis = P09V53_n1122MaqCodDis[0] ;
            AV16SelectedValue = A1122MaqCodDis ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_DISIDTX2' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V54 */
      pr_default.execute(2, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P09V54_A396EmprCod[0] ;
         A10887Cod_Idtx = P09V54_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = P09V54_n10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P09V54_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P09V54_n10888Dsc_Idtx[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A10887Cod_Idtx), A10888Dsc_Idtx, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V55 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A361DisCod = P09V55_A361DisCod[0] ;
            A396EmprCod = P09V55_A396EmprCod[0] ;
            A13986DisIdtx2 = P09V55_A13986DisIdtx2[0] ;
            n13986DisIdtx2 = P09V55_n13986DisIdtx2[0] ;
            AV16SelectedValue = A13986DisIdtx2 ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_CPTEID' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V56 */
      pr_default.execute(4, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P09V56_A396EmprCod[0] ;
         A11860CpteId = P09V56_A11860CpteId[0] ;
         n11860CpteId = P09V56_n11860CpteId[0] ;
         A11865CpteDsc = P09V56_A11865CpteDsc[0] ;
         n11865CpteDsc = P09V56_n11865CpteDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11860CpteId, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A11860CpteId, 4, 0)), A11865CpteDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V57 */
         pr_default.execute(5, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A361DisCod = P09V57_A361DisCod[0] ;
            A396EmprCod = P09V57_A396EmprCod[0] ;
            A11860CpteId = P09V57_A11860CpteId[0] ;
            n11860CpteId = P09V57_n11860CpteId[0] ;
            AV16SelectedValue = ((0==A11860CpteId) ? "" : GXutil.trim( GXutil.str( A11860CpteId, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_DESAID' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V58 */
      pr_default.execute(6, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A396EmprCod = P09V58_A396EmprCod[0] ;
         A11862DesaID = P09V58_A11862DesaID[0] ;
         n11862DesaID = P09V58_n11862DesaID[0] ;
         A11866DesaDsc = P09V58_A11866DesaDsc[0] ;
         n11866DesaDsc = P09V58_n11866DesaDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11862DesaID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A11862DesaID, 4, 0)), A11866DesaDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V59 */
         pr_default.execute(7, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A361DisCod = P09V59_A361DisCod[0] ;
            A396EmprCod = P09V59_A396EmprCod[0] ;
            A11862DesaID = P09V59_A11862DesaID[0] ;
            n11862DesaID = P09V59_n11862DesaID[0] ;
            AV16SelectedValue = ((0==A11862DesaID) ? "" : GXutil.trim( GXutil.str( A11862DesaID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_DPTOID' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V510 */
      pr_default.execute(8, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A396EmprCod = P09V510_A396EmprCod[0] ;
         A11863DptoID = P09V510_A11863DptoID[0] ;
         n11863DptoID = P09V510_n11863DptoID[0] ;
         A11867DptoDsc = P09V510_A11867DptoDsc[0] ;
         n11867DptoDsc = P09V510_n11867DptoDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A11863DptoID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A11863DptoID, 4, 0)), A11867DptoDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V511 */
         pr_default.execute(9, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A361DisCod = P09V511_A361DisCod[0] ;
            A396EmprCod = P09V511_A396EmprCod[0] ;
            A11863DptoID = P09V511_A11863DptoID[0] ;
            n11863DptoID = P09V511_n11863DptoID[0] ;
            AV16SelectedValue = ((0==A11863DptoID) ? "" : GXutil.trim( GXutil.str( A11863DptoID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
      }
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_COD_IDTX' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V512 */
      pr_default.execute(10, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A396EmprCod = P09V512_A396EmprCod[0] ;
         A10887Cod_Idtx = P09V512_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = P09V512_n10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P09V512_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P09V512_n10888Dsc_Idtx[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A10887Cod_Idtx), A10888Dsc_Idtx, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(10);
      }
      pr_default.close(10);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V513 */
         pr_default.execute(11, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A361DisCod = P09V513_A361DisCod[0] ;
            A396EmprCod = P09V513_A396EmprCod[0] ;
            A10887Cod_Idtx = P09V513_A10887Cod_Idtx[0] ;
            n10887Cod_Idtx = P09V513_n10887Cod_Idtx[0] ;
            AV16SelectedValue = A10887Cod_Idtx ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
   }

   public void S171( )
   {
      /* 'LOADCOMBOITEMS_DISACAANH' Routine */
      returnInSub = false ;
      AV28CliCod = (int)(GXutil.lval( AV27WebSession.getValue("Dis_CliCod"))) ;
      AV10Combo_Data.clear();
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( AV28CliCod, 6, 0) );
      AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( httpContext.getMessage( "&EmprCod ", "")+AV14EmprCod+httpContext.getMessage( "&CliCod ", "")+GXutil.str( AV28CliCod, 6, 0) );
      AV10Combo_Data.add(AV11Combo_DataItem, 0);
      /* Using cursor P09V514 */
      pr_default.execute(12, new Object[] {AV14EmprCod, Integer.valueOf(AV28CliCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A252CliCod = P09V514_A252CliCod[0] ;
         A396EmprCod = P09V514_A396EmprCod[0] ;
         A9713Tb1_Cod = P09V514_A9713Tb1_Cod[0] ;
         A9715Tb1_Dsc = P09V514_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P09V514_n9715Tb1_Dsc[0] ;
         A9715Tb1_Dsc = P09V514_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P09V514_n9715Tb1_Dsc[0] ;
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A9713Tb1_Cod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A9713Tb1_Cod, 4, 0)), A9715Tb1_Dsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(12);
      }
      pr_default.close(12);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V515 */
         pr_default.execute(13, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A361DisCod = P09V515_A361DisCod[0] ;
            A396EmprCod = P09V515_A396EmprCod[0] ;
            A4478DisAcaAnh = P09V515_A4478DisAcaAnh[0] ;
            AV16SelectedValue = ((0==A4478DisAcaAnh) ? "" : GXutil.trim( GXutil.str( A4478DisAcaAnh, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
      }
   }

   public void S181( )
   {
      /* 'LOADCOMBOITEMS_DISTIPCOL' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V516 */
      pr_default.execute(14, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A396EmprCod = P09V516_A396EmprCod[0] ;
         A831TipColCod = P09V516_A831TipColCod[0] ;
         A832TipColDsc = P09V516_A832TipColDsc[0] ;
         n832TipColDsc = P09V516_n832TipColDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A831TipColCod, 2, 0)), A832TipColDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(14);
      }
      pr_default.close(14);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V517 */
         pr_default.execute(15, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A361DisCod = P09V517_A361DisCod[0] ;
            A396EmprCod = P09V517_A396EmprCod[0] ;
            A390DisTipCol = P09V517_A390DisTipCol[0] ;
            n390DisTipCol = P09V517_n390DisTipCol[0] ;
            AV16SelectedValue = ((0==A390DisTipCol) ? "" : GXutil.trim( GXutil.str( A390DisTipCol, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
      }
   }

   public void S191( )
   {
      /* 'LOADCOMBOITEMS_REVENID' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V518 */
      pr_default.execute(16, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A396EmprCod = P09V518_A396EmprCod[0] ;
         A12328RevenID = P09V518_A12328RevenID[0] ;
         n12328RevenID = P09V518_n12328RevenID[0] ;
         A12327RevenNm = P09V518_A12327RevenNm[0] ;
         n12327RevenNm = P09V518_n12327RevenNm[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A12328RevenID );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A12328RevenID), A12327RevenNm, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(16);
      }
      pr_default.close(16);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V519 */
         pr_default.execute(17, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A361DisCod = P09V519_A361DisCod[0] ;
            A396EmprCod = P09V519_A396EmprCod[0] ;
            A12328RevenID = P09V519_A12328RevenID[0] ;
            n12328RevenID = P09V519_n12328RevenID[0] ;
            AV16SelectedValue = A12328RevenID ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(17);
      }
   }

   public void S201( )
   {
      /* 'LOADCOMBOITEMS_MARCAID' Routine */
      returnInSub = false ;
      AV28CliCod = (int)(GXutil.lval( AV27WebSession.getValue("Dis_CliCod"))) ;
      AV10Combo_Data.clear();
      /* Using cursor P09V520 */
      pr_default.execute(18, new Object[] {AV14EmprCod, Integer.valueOf(AV28CliCod)});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A252CliCod = P09V520_A252CliCod[0] ;
         A396EmprCod = P09V520_A396EmprCod[0] ;
         A12907CliMarcaID = P09V520_A12907CliMarcaID[0] ;
         A12908CliMarcaDc = P09V520_A12908CliMarcaDc[0] ;
         n12908CliMarcaDc = P09V520_n12908CliMarcaDc[0] ;
         A12908CliMarcaDc = P09V520_A12908CliMarcaDc[0] ;
         n12908CliMarcaDc = P09V520_n12908CliMarcaDc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A12907CliMarcaID );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A12907CliMarcaID), A12908CliMarcaDc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(18);
      }
      pr_default.close(18);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V521 */
         pr_default.execute(19, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(19) != 101) )
         {
            A361DisCod = P09V521_A361DisCod[0] ;
            A396EmprCod = P09V521_A396EmprCod[0] ;
            A11659MarcaId = P09V521_A11659MarcaId[0] ;
            n11659MarcaId = P09V521_n11659MarcaId[0] ;
            AV16SelectedValue = A11659MarcaId ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(19);
      }
   }

   public void S211( )
   {
      /* 'LOADCOMBOITEMS_DISARTTIP' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V522 */
      pr_default.execute(20, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A396EmprCod = P09V522_A396EmprCod[0] ;
         A829TipArtCod = P09V522_A829TipArtCod[0] ;
         A830TipArtDsc = P09V522_A830TipArtDsc[0] ;
         n830TipArtDsc = P09V522_n830TipArtDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)), A830TipArtDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(20);
      }
      pr_default.close(20);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V523 */
         pr_default.execute(21, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(21) != 101) )
         {
            A361DisCod = P09V523_A361DisCod[0] ;
            A396EmprCod = P09V523_A396EmprCod[0] ;
            A352DisArtTip = P09V523_A352DisArtTip[0] ;
            AV16SelectedValue = ((0==A352DisArtTip) ? "" : GXutil.trim( GXutil.str( A352DisArtTip, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(21);
      }
   }

   public void S221( )
   {
      /* 'LOADCOMBOITEMS_DISARTCOD' Routine */
      returnInSub = false ;
      AV28CliCod = (int)(GXutil.lval( AV27WebSession.getValue("Dis_CliCod"))) ;
      AV10Combo_Data.clear();
      /* Using cursor P09V524 */
      pr_default.execute(22, new Object[] {AV14EmprCod, Integer.valueOf(AV28CliCod)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A252CliCod = P09V524_A252CliCod[0] ;
         A396EmprCod = P09V524_A396EmprCod[0] ;
         A65ArtCod = P09V524_A65ArtCod[0] ;
         A69ArtDsc = P09V524_A69ArtDsc[0] ;
         n69ArtDsc = P09V524_n69ArtDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A65ArtCod) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A65ArtCod), A69ArtDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(22);
      }
      pr_default.close(22);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V525 */
         pr_default.execute(23, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(23) != 101) )
         {
            A361DisCod = P09V525_A361DisCod[0] ;
            A396EmprCod = P09V525_A396EmprCod[0] ;
            A335DisArtCod = P09V525_A335DisArtCod[0] ;
            AV16SelectedValue = A335DisArtCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(23);
      }
   }

   public void S231( )
   {
      /* 'LOADCOMBOITEMS_DISARTACA' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V526 */
      pr_default.execute(24, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A13133ProForAct = P09V526_A13133ProForAct[0] ;
         A396EmprCod = P09V526_A396EmprCod[0] ;
         A764ProForCod = P09V526_A764ProForCod[0] ;
         A766ProForDsc = P09V526_A766ProForDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A764ProForCod), A766ProForDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(24);
      }
      pr_default.close(24);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V527 */
         pr_default.execute(25, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(25) != 101) )
         {
            A361DisCod = P09V527_A361DisCod[0] ;
            A396EmprCod = P09V527_A396EmprCod[0] ;
            A333DisArtAca = P09V527_A333DisArtAca[0] ;
            AV16SelectedValue = A333DisArtAca ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(25);
      }
   }

   public void S241( )
   {
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V528 */
      pr_default.execute(26, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A10045CliAct = P09V528_A10045CliAct[0] ;
         A396EmprCod = P09V528_A396EmprCod[0] ;
         A252CliCod = P09V528_A252CliCod[0] ;
         A279CliNom = P09V528_A279CliNom[0] ;
         if ( GXutil.strcmp(A10045CliAct, httpContext.getMessage( "S", "")) == 0 )
         {
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, "", "", "", "", "", "", "") );
            AV10Combo_Data.add(AV11Combo_DataItem, 0);
         }
         pr_default.readNext(26);
      }
      pr_default.close(26);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V529 */
         pr_default.execute(27, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(27) != 101) )
         {
            A361DisCod = P09V529_A361DisCod[0] ;
            A396EmprCod = P09V529_A396EmprCod[0] ;
            A252CliCod = P09V529_A252CliCod[0] ;
            AV16SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(27);
      }
   }

   public void S251( )
   {
      /* 'LOADCOMBOITEMS_DISCLIDES' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09V530 */
      pr_default.execute(28, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(28) != 101) )
      {
         A10045CliAct = P09V530_A10045CliAct[0] ;
         A396EmprCod = P09V530_A396EmprCod[0] ;
         A252CliCod = P09V530_A252CliCod[0] ;
         A279CliNom = P09V530_A279CliNom[0] ;
         if ( GXutil.strcmp(A10045CliAct, httpContext.getMessage( "S", "")) == 0 )
         {
            AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
            AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, "", "", "", "", "", "", "") );
            AV10Combo_Data.add(AV11Combo_DataItem, 0);
         }
         pr_default.readNext(28);
      }
      pr_default.close(28);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V531 */
         pr_default.execute(29, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(29) != 101) )
         {
            A361DisCod = P09V531_A361DisCod[0] ;
            A396EmprCod = P09V531_A396EmprCod[0] ;
            A2310DisCliDes = P09V531_A2310DisCliDes[0] ;
            AV16SelectedValue = ((0==A2310DisCliDes) ? "" : GXutil.trim( GXutil.str( A2310DisCliDes, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(29);
      }
   }

   public void S261( )
   {
      /* 'LOADCOMBOITEMS_DISTIPDIS' Routine */
      returnInSub = false ;
      /* Using cursor P09V532 */
      pr_default.execute(30, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(30) != 101) )
      {
         A396EmprCod = P09V532_A396EmprCod[0] ;
         A5098TipDisCod = P09V532_A5098TipDisCod[0] ;
         A5097TipDisDsc = P09V532_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P09V532_n5097TipDisDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A5098TipDisCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A5098TipDisCod), A5097TipDisDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(30);
      }
      pr_default.close(30);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P09V533 */
         pr_default.execute(31, new Object[] {AV14EmprCod, Integer.valueOf(AV15DisCod)});
         while ( (pr_default.getStatus(31) != 101) )
         {
            A361DisCod = P09V533_A361DisCod[0] ;
            A396EmprCod = P09V533_A396EmprCod[0] ;
            A2009DisTipDis = P09V533_A2009DisTipDis[0] ;
            n2009DisTipDis = P09V533_n2009DisTipDis[0] ;
            AV16SelectedValue = A2009DisTipDis ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(31);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = disloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = disloaddvcombo.this.AV10Combo_Data;
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
      P09V52_A396EmprCod = new String[] {""} ;
      P09V52_A602MaqCod = new String[] {""} ;
      P09V52_A606MaqDsc = new String[] {""} ;
      P09V52_n606MaqDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09V53_A361DisCod = new int[1] ;
      P09V53_A396EmprCod = new String[] {""} ;
      P09V53_A1122MaqCodDis = new String[] {""} ;
      P09V53_n1122MaqCodDis = new boolean[] {false} ;
      A1122MaqCodDis = "" ;
      P09V54_A396EmprCod = new String[] {""} ;
      P09V54_A10887Cod_Idtx = new String[] {""} ;
      P09V54_n10887Cod_Idtx = new boolean[] {false} ;
      P09V54_A10888Dsc_Idtx = new String[] {""} ;
      P09V54_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      P09V55_A361DisCod = new int[1] ;
      P09V55_A396EmprCod = new String[] {""} ;
      P09V55_A13986DisIdtx2 = new String[] {""} ;
      P09V55_n13986DisIdtx2 = new boolean[] {false} ;
      A13986DisIdtx2 = "" ;
      P09V56_A396EmprCod = new String[] {""} ;
      P09V56_A11860CpteId = new short[1] ;
      P09V56_n11860CpteId = new boolean[] {false} ;
      P09V56_A11865CpteDsc = new String[] {""} ;
      P09V56_n11865CpteDsc = new boolean[] {false} ;
      A11865CpteDsc = "" ;
      P09V57_A361DisCod = new int[1] ;
      P09V57_A396EmprCod = new String[] {""} ;
      P09V57_A11860CpteId = new short[1] ;
      P09V57_n11860CpteId = new boolean[] {false} ;
      P09V58_A396EmprCod = new String[] {""} ;
      P09V58_A11862DesaID = new short[1] ;
      P09V58_n11862DesaID = new boolean[] {false} ;
      P09V58_A11866DesaDsc = new String[] {""} ;
      P09V58_n11866DesaDsc = new boolean[] {false} ;
      A11866DesaDsc = "" ;
      P09V59_A361DisCod = new int[1] ;
      P09V59_A396EmprCod = new String[] {""} ;
      P09V59_A11862DesaID = new short[1] ;
      P09V59_n11862DesaID = new boolean[] {false} ;
      P09V510_A396EmprCod = new String[] {""} ;
      P09V510_A11863DptoID = new short[1] ;
      P09V510_n11863DptoID = new boolean[] {false} ;
      P09V510_A11867DptoDsc = new String[] {""} ;
      P09V510_n11867DptoDsc = new boolean[] {false} ;
      A11867DptoDsc = "" ;
      P09V511_A361DisCod = new int[1] ;
      P09V511_A396EmprCod = new String[] {""} ;
      P09V511_A11863DptoID = new short[1] ;
      P09V511_n11863DptoID = new boolean[] {false} ;
      P09V512_A396EmprCod = new String[] {""} ;
      P09V512_A10887Cod_Idtx = new String[] {""} ;
      P09V512_n10887Cod_Idtx = new boolean[] {false} ;
      P09V512_A10888Dsc_Idtx = new String[] {""} ;
      P09V512_n10888Dsc_Idtx = new boolean[] {false} ;
      P09V513_A361DisCod = new int[1] ;
      P09V513_A396EmprCod = new String[] {""} ;
      P09V513_A10887Cod_Idtx = new String[] {""} ;
      P09V513_n10887Cod_Idtx = new boolean[] {false} ;
      AV27WebSession = httpContext.getWebSession();
      P09V514_A252CliCod = new int[1] ;
      P09V514_A396EmprCod = new String[] {""} ;
      P09V514_A9713Tb1_Cod = new short[1] ;
      P09V514_A9715Tb1_Dsc = new String[] {""} ;
      P09V514_n9715Tb1_Dsc = new boolean[] {false} ;
      A9715Tb1_Dsc = "" ;
      P09V515_A361DisCod = new int[1] ;
      P09V515_A396EmprCod = new String[] {""} ;
      P09V515_A4478DisAcaAnh = new short[1] ;
      P09V516_A396EmprCod = new String[] {""} ;
      P09V516_A831TipColCod = new byte[1] ;
      P09V516_A832TipColDsc = new String[] {""} ;
      P09V516_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      P09V517_A361DisCod = new int[1] ;
      P09V517_A396EmprCod = new String[] {""} ;
      P09V517_A390DisTipCol = new byte[1] ;
      P09V517_n390DisTipCol = new boolean[] {false} ;
      P09V518_A396EmprCod = new String[] {""} ;
      P09V518_A12328RevenID = new String[] {""} ;
      P09V518_n12328RevenID = new boolean[] {false} ;
      P09V518_A12327RevenNm = new String[] {""} ;
      P09V518_n12327RevenNm = new boolean[] {false} ;
      A12328RevenID = "" ;
      A12327RevenNm = "" ;
      P09V519_A361DisCod = new int[1] ;
      P09V519_A396EmprCod = new String[] {""} ;
      P09V519_A12328RevenID = new String[] {""} ;
      P09V519_n12328RevenID = new boolean[] {false} ;
      P09V520_A252CliCod = new int[1] ;
      P09V520_A396EmprCod = new String[] {""} ;
      P09V520_A12907CliMarcaID = new String[] {""} ;
      P09V520_A12908CliMarcaDc = new String[] {""} ;
      P09V520_n12908CliMarcaDc = new boolean[] {false} ;
      A12907CliMarcaID = "" ;
      A12908CliMarcaDc = "" ;
      P09V521_A361DisCod = new int[1] ;
      P09V521_A396EmprCod = new String[] {""} ;
      P09V521_A11659MarcaId = new String[] {""} ;
      P09V521_n11659MarcaId = new boolean[] {false} ;
      A11659MarcaId = "" ;
      P09V522_A396EmprCod = new String[] {""} ;
      P09V522_A829TipArtCod = new short[1] ;
      P09V522_A830TipArtDsc = new String[] {""} ;
      P09V522_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P09V523_A361DisCod = new int[1] ;
      P09V523_A396EmprCod = new String[] {""} ;
      P09V523_A352DisArtTip = new short[1] ;
      P09V524_A252CliCod = new int[1] ;
      P09V524_A396EmprCod = new String[] {""} ;
      P09V524_A65ArtCod = new String[] {""} ;
      P09V524_A69ArtDsc = new String[] {""} ;
      P09V524_n69ArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      P09V525_A361DisCod = new int[1] ;
      P09V525_A396EmprCod = new String[] {""} ;
      P09V525_A335DisArtCod = new String[] {""} ;
      A335DisArtCod = "" ;
      P09V526_A13133ProForAct = new String[] {""} ;
      P09V526_A396EmprCod = new String[] {""} ;
      P09V526_A764ProForCod = new String[] {""} ;
      P09V526_A766ProForDsc = new String[] {""} ;
      A13133ProForAct = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      P09V527_A361DisCod = new int[1] ;
      P09V527_A396EmprCod = new String[] {""} ;
      P09V527_A333DisArtAca = new String[] {""} ;
      A333DisArtAca = "" ;
      P09V528_A10045CliAct = new String[] {""} ;
      P09V528_A396EmprCod = new String[] {""} ;
      P09V528_A252CliCod = new int[1] ;
      P09V528_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A279CliNom = "" ;
      P09V529_A361DisCod = new int[1] ;
      P09V529_A396EmprCod = new String[] {""} ;
      P09V529_A252CliCod = new int[1] ;
      P09V530_A10045CliAct = new String[] {""} ;
      P09V530_A396EmprCod = new String[] {""} ;
      P09V530_A252CliCod = new int[1] ;
      P09V530_A279CliNom = new String[] {""} ;
      P09V531_A361DisCod = new int[1] ;
      P09V531_A396EmprCod = new String[] {""} ;
      P09V531_A2310DisCliDes = new int[1] ;
      P09V532_A396EmprCod = new String[] {""} ;
      P09V532_A5098TipDisCod = new String[] {""} ;
      P09V532_A5097TipDisDsc = new String[] {""} ;
      P09V532_n5097TipDisDsc = new boolean[] {false} ;
      A5098TipDisCod = "" ;
      A5097TipDisDsc = "" ;
      P09V533_A361DisCod = new int[1] ;
      P09V533_A396EmprCod = new String[] {""} ;
      P09V533_A2009DisTipDis = new String[] {""} ;
      P09V533_n2009DisTipDis = new boolean[] {false} ;
      A2009DisTipDis = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09V52_A396EmprCod, P09V52_A602MaqCod, P09V52_A606MaqDsc, P09V52_n606MaqDsc
            }
            , new Object[] {
            P09V53_A361DisCod, P09V53_A396EmprCod, P09V53_A1122MaqCodDis, P09V53_n1122MaqCodDis
            }
            , new Object[] {
            P09V54_A396EmprCod, P09V54_A10887Cod_Idtx, P09V54_A10888Dsc_Idtx, P09V54_n10888Dsc_Idtx
            }
            , new Object[] {
            P09V55_A361DisCod, P09V55_A396EmprCod, P09V55_A13986DisIdtx2, P09V55_n13986DisIdtx2
            }
            , new Object[] {
            P09V56_A396EmprCod, P09V56_A11860CpteId, P09V56_A11865CpteDsc, P09V56_n11865CpteDsc
            }
            , new Object[] {
            P09V57_A361DisCod, P09V57_A396EmprCod, P09V57_A11860CpteId, P09V57_n11860CpteId
            }
            , new Object[] {
            P09V58_A396EmprCod, P09V58_A11862DesaID, P09V58_A11866DesaDsc, P09V58_n11866DesaDsc
            }
            , new Object[] {
            P09V59_A361DisCod, P09V59_A396EmprCod, P09V59_A11862DesaID, P09V59_n11862DesaID
            }
            , new Object[] {
            P09V510_A396EmprCod, P09V510_A11863DptoID, P09V510_A11867DptoDsc, P09V510_n11867DptoDsc
            }
            , new Object[] {
            P09V511_A361DisCod, P09V511_A396EmprCod, P09V511_A11863DptoID, P09V511_n11863DptoID
            }
            , new Object[] {
            P09V512_A396EmprCod, P09V512_A10887Cod_Idtx, P09V512_A10888Dsc_Idtx, P09V512_n10888Dsc_Idtx
            }
            , new Object[] {
            P09V513_A361DisCod, P09V513_A396EmprCod, P09V513_A10887Cod_Idtx, P09V513_n10887Cod_Idtx
            }
            , new Object[] {
            P09V514_A252CliCod, P09V514_A396EmprCod, P09V514_A9713Tb1_Cod, P09V514_A9715Tb1_Dsc, P09V514_n9715Tb1_Dsc
            }
            , new Object[] {
            P09V515_A361DisCod, P09V515_A396EmprCod, P09V515_A4478DisAcaAnh
            }
            , new Object[] {
            P09V516_A396EmprCod, P09V516_A831TipColCod, P09V516_A832TipColDsc, P09V516_n832TipColDsc
            }
            , new Object[] {
            P09V517_A361DisCod, P09V517_A396EmprCod, P09V517_A390DisTipCol, P09V517_n390DisTipCol
            }
            , new Object[] {
            P09V518_A396EmprCod, P09V518_A12328RevenID, P09V518_A12327RevenNm, P09V518_n12327RevenNm
            }
            , new Object[] {
            P09V519_A361DisCod, P09V519_A396EmprCod, P09V519_A12328RevenID, P09V519_n12328RevenID
            }
            , new Object[] {
            P09V520_A252CliCod, P09V520_A396EmprCod, P09V520_A12907CliMarcaID, P09V520_A12908CliMarcaDc, P09V520_n12908CliMarcaDc
            }
            , new Object[] {
            P09V521_A361DisCod, P09V521_A396EmprCod, P09V521_A11659MarcaId, P09V521_n11659MarcaId
            }
            , new Object[] {
            P09V522_A396EmprCod, P09V522_A829TipArtCod, P09V522_A830TipArtDsc, P09V522_n830TipArtDsc
            }
            , new Object[] {
            P09V523_A361DisCod, P09V523_A396EmprCod, P09V523_A352DisArtTip
            }
            , new Object[] {
            P09V524_A252CliCod, P09V524_A396EmprCod, P09V524_A65ArtCod, P09V524_A69ArtDsc, P09V524_n69ArtDsc
            }
            , new Object[] {
            P09V525_A361DisCod, P09V525_A396EmprCod, P09V525_A335DisArtCod
            }
            , new Object[] {
            P09V526_A13133ProForAct, P09V526_A396EmprCod, P09V526_A764ProForCod, P09V526_A766ProForDsc
            }
            , new Object[] {
            P09V527_A361DisCod, P09V527_A396EmprCod, P09V527_A333DisArtAca
            }
            , new Object[] {
            P09V528_A10045CliAct, P09V528_A396EmprCod, P09V528_A252CliCod, P09V528_A279CliNom
            }
            , new Object[] {
            P09V529_A361DisCod, P09V529_A396EmprCod, P09V529_A252CliCod
            }
            , new Object[] {
            P09V530_A10045CliAct, P09V530_A396EmprCod, P09V530_A252CliCod, P09V530_A279CliNom
            }
            , new Object[] {
            P09V531_A361DisCod, P09V531_A396EmprCod, P09V531_A2310DisCliDes
            }
            , new Object[] {
            P09V532_A396EmprCod, P09V532_A5098TipDisCod, P09V532_A5097TipDisDsc, P09V532_n5097TipDisDsc
            }
            , new Object[] {
            P09V533_A361DisCod, P09V533_A396EmprCod, P09V533_A2009DisTipDis, P09V533_n2009DisTipDis
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte A390DisTipCol ;
   private short A11860CpteId ;
   private short A11862DesaID ;
   private short A11863DptoID ;
   private short A9713Tb1_Cod ;
   private short A4478DisAcaAnh ;
   private short A829TipArtCod ;
   private short A352DisArtTip ;
   private short Gx_err ;
   private int AV15DisCod ;
   private int A361DisCod ;
   private int AV28CliCod ;
   private int A252CliCod ;
   private int A2310DisCliDes ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A1122MaqCodDis ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A13986DisIdtx2 ;
   private String A11865CpteDsc ;
   private String A11866DesaDsc ;
   private String A11867DptoDsc ;
   private String A9715Tb1_Dsc ;
   private String A832TipColDsc ;
   private String A12328RevenID ;
   private String A12327RevenNm ;
   private String A12907CliMarcaID ;
   private String A12908CliMarcaDc ;
   private String A11659MarcaId ;
   private String A830TipArtDsc ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A335DisArtCod ;
   private String A13133ProForAct ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A333DisArtAca ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A5098TipDisCod ;
   private String A5097TipDisDsc ;
   private String A2009DisTipDis ;
   private boolean returnInSub ;
   private boolean n606MaqDsc ;
   private boolean n1122MaqCodDis ;
   private boolean n10887Cod_Idtx ;
   private boolean n10888Dsc_Idtx ;
   private boolean n13986DisIdtx2 ;
   private boolean n11860CpteId ;
   private boolean n11865CpteDsc ;
   private boolean n11862DesaID ;
   private boolean n11866DesaDsc ;
   private boolean n11863DptoID ;
   private boolean n11867DptoDsc ;
   private boolean n9715Tb1_Dsc ;
   private boolean n832TipColDsc ;
   private boolean n390DisTipCol ;
   private boolean n12328RevenID ;
   private boolean n12327RevenNm ;
   private boolean n12908CliMarcaDc ;
   private boolean n11659MarcaId ;
   private boolean n830TipArtDsc ;
   private boolean n69ArtDsc ;
   private boolean n5097TipDisDsc ;
   private boolean n2009DisTipDis ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private com.genexus.webpanels.WebSession AV27WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09V52_A396EmprCod ;
   private String[] P09V52_A602MaqCod ;
   private String[] P09V52_A606MaqDsc ;
   private boolean[] P09V52_n606MaqDsc ;
   private int[] P09V53_A361DisCod ;
   private String[] P09V53_A396EmprCod ;
   private String[] P09V53_A1122MaqCodDis ;
   private boolean[] P09V53_n1122MaqCodDis ;
   private String[] P09V54_A396EmprCod ;
   private String[] P09V54_A10887Cod_Idtx ;
   private boolean[] P09V54_n10887Cod_Idtx ;
   private String[] P09V54_A10888Dsc_Idtx ;
   private boolean[] P09V54_n10888Dsc_Idtx ;
   private int[] P09V55_A361DisCod ;
   private String[] P09V55_A396EmprCod ;
   private String[] P09V55_A13986DisIdtx2 ;
   private boolean[] P09V55_n13986DisIdtx2 ;
   private String[] P09V56_A396EmprCod ;
   private short[] P09V56_A11860CpteId ;
   private boolean[] P09V56_n11860CpteId ;
   private String[] P09V56_A11865CpteDsc ;
   private boolean[] P09V56_n11865CpteDsc ;
   private int[] P09V57_A361DisCod ;
   private String[] P09V57_A396EmprCod ;
   private short[] P09V57_A11860CpteId ;
   private boolean[] P09V57_n11860CpteId ;
   private String[] P09V58_A396EmprCod ;
   private short[] P09V58_A11862DesaID ;
   private boolean[] P09V58_n11862DesaID ;
   private String[] P09V58_A11866DesaDsc ;
   private boolean[] P09V58_n11866DesaDsc ;
   private int[] P09V59_A361DisCod ;
   private String[] P09V59_A396EmprCod ;
   private short[] P09V59_A11862DesaID ;
   private boolean[] P09V59_n11862DesaID ;
   private String[] P09V510_A396EmprCod ;
   private short[] P09V510_A11863DptoID ;
   private boolean[] P09V510_n11863DptoID ;
   private String[] P09V510_A11867DptoDsc ;
   private boolean[] P09V510_n11867DptoDsc ;
   private int[] P09V511_A361DisCod ;
   private String[] P09V511_A396EmprCod ;
   private short[] P09V511_A11863DptoID ;
   private boolean[] P09V511_n11863DptoID ;
   private String[] P09V512_A396EmprCod ;
   private String[] P09V512_A10887Cod_Idtx ;
   private boolean[] P09V512_n10887Cod_Idtx ;
   private String[] P09V512_A10888Dsc_Idtx ;
   private boolean[] P09V512_n10888Dsc_Idtx ;
   private int[] P09V513_A361DisCod ;
   private String[] P09V513_A396EmprCod ;
   private String[] P09V513_A10887Cod_Idtx ;
   private boolean[] P09V513_n10887Cod_Idtx ;
   private int[] P09V514_A252CliCod ;
   private String[] P09V514_A396EmprCod ;
   private short[] P09V514_A9713Tb1_Cod ;
   private String[] P09V514_A9715Tb1_Dsc ;
   private boolean[] P09V514_n9715Tb1_Dsc ;
   private int[] P09V515_A361DisCod ;
   private String[] P09V515_A396EmprCod ;
   private short[] P09V515_A4478DisAcaAnh ;
   private String[] P09V516_A396EmprCod ;
   private byte[] P09V516_A831TipColCod ;
   private String[] P09V516_A832TipColDsc ;
   private boolean[] P09V516_n832TipColDsc ;
   private int[] P09V517_A361DisCod ;
   private String[] P09V517_A396EmprCod ;
   private byte[] P09V517_A390DisTipCol ;
   private boolean[] P09V517_n390DisTipCol ;
   private String[] P09V518_A396EmprCod ;
   private String[] P09V518_A12328RevenID ;
   private boolean[] P09V518_n12328RevenID ;
   private String[] P09V518_A12327RevenNm ;
   private boolean[] P09V518_n12327RevenNm ;
   private int[] P09V519_A361DisCod ;
   private String[] P09V519_A396EmprCod ;
   private String[] P09V519_A12328RevenID ;
   private boolean[] P09V519_n12328RevenID ;
   private int[] P09V520_A252CliCod ;
   private String[] P09V520_A396EmprCod ;
   private String[] P09V520_A12907CliMarcaID ;
   private String[] P09V520_A12908CliMarcaDc ;
   private boolean[] P09V520_n12908CliMarcaDc ;
   private int[] P09V521_A361DisCod ;
   private String[] P09V521_A396EmprCod ;
   private String[] P09V521_A11659MarcaId ;
   private boolean[] P09V521_n11659MarcaId ;
   private String[] P09V522_A396EmprCod ;
   private short[] P09V522_A829TipArtCod ;
   private String[] P09V522_A830TipArtDsc ;
   private boolean[] P09V522_n830TipArtDsc ;
   private int[] P09V523_A361DisCod ;
   private String[] P09V523_A396EmprCod ;
   private short[] P09V523_A352DisArtTip ;
   private int[] P09V524_A252CliCod ;
   private String[] P09V524_A396EmprCod ;
   private String[] P09V524_A65ArtCod ;
   private String[] P09V524_A69ArtDsc ;
   private boolean[] P09V524_n69ArtDsc ;
   private int[] P09V525_A361DisCod ;
   private String[] P09V525_A396EmprCod ;
   private String[] P09V525_A335DisArtCod ;
   private String[] P09V526_A13133ProForAct ;
   private String[] P09V526_A396EmprCod ;
   private String[] P09V526_A764ProForCod ;
   private String[] P09V526_A766ProForDsc ;
   private int[] P09V527_A361DisCod ;
   private String[] P09V527_A396EmprCod ;
   private String[] P09V527_A333DisArtAca ;
   private String[] P09V528_A10045CliAct ;
   private String[] P09V528_A396EmprCod ;
   private int[] P09V528_A252CliCod ;
   private String[] P09V528_A279CliNom ;
   private int[] P09V529_A361DisCod ;
   private String[] P09V529_A396EmprCod ;
   private int[] P09V529_A252CliCod ;
   private String[] P09V530_A10045CliAct ;
   private String[] P09V530_A396EmprCod ;
   private int[] P09V530_A252CliCod ;
   private String[] P09V530_A279CliNom ;
   private int[] P09V531_A361DisCod ;
   private String[] P09V531_A396EmprCod ;
   private int[] P09V531_A2310DisCliDes ;
   private String[] P09V532_A396EmprCod ;
   private String[] P09V532_A5098TipDisCod ;
   private String[] P09V532_A5097TipDisDsc ;
   private boolean[] P09V532_n5097TipDisDsc ;
   private int[] P09V533_A361DisCod ;
   private String[] P09V533_A396EmprCod ;
   private String[] P09V533_A2009DisTipDis ;
   private boolean[] P09V533_n2009DisTipDis ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class disloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09V52", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V53", "SELECT DisCod, EmprCod, MaqCodDis FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V54", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V55", "SELECT DisCod, EmprCod, DisIdtx2 FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V56", "SELECT EmprCod, CpteId, CpteDsc FROM TXPNXT000 WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V57", "SELECT DisCod, EmprCod, CpteId FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V58", "SELECT EmprCod, DesaID, DesaDsc FROM TXPNXT001 WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V59", "SELECT DisCod, EmprCod, DesaID FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V510", "SELECT EmprCod, DptoID, DptoDsc FROM TXPNXT002 WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V511", "SELECT DisCod, EmprCod, DptoID FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V512", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V513", "SELECT DisCod, EmprCod, Cod_Idtx FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V514", "SELECT T1.CliCod, T1.EmprCod, T1.Tb1_Cod, T2.Tb1_Dsc FROM (TXPTABLA4 T1 INNER JOIN TXPTABLE1 T2 ON T2.EmprCod = T1.EmprCod AND T2.Tb1_Cod = T1.Tb1_Cod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V515", "SELECT DisCod, EmprCod, DisAcaAnh FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V516", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V517", "SELECT DisCod, EmprCod, DisTipCol FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V518", "SELECT EmprCod, RevenID, RevenNm FROM TXPREVEND WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V519", "SELECT DisCod, EmprCod, RevenID FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V520", "SELECT T1.CliCod, T1.EmprCod, T1.CliMarcaID AS CliMarcaID, T2.MarcaDsc AS CliMarcaDc FROM (TXPCLIMAR T1 INNER JOIN TXPMARCAS T2 ON T2.EmprCod = T1.EmprCod AND T2.MarcaId = T1.CliMarcaID) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V521", "SELECT DisCod, EmprCod, MarcaId FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V522", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V523", "SELECT DisCod, EmprCod, DisArtTip FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V524", "SELECT CliCod, EmprCod, ArtCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V525", "SELECT DisCod, EmprCod, DisArtCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V526", "SELECT ProForAct, EmprCod, ProForCod, ProForDsc FROM TXPCPROFO WHERE (EmprCod = ?) AND (ProForAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V527", "SELECT DisCod, EmprCod, DisArtAca FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V528", "SELECT CliAct, EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V529", "SELECT DisCod, EmprCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V530", "SELECT CliAct, EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V531", "SELECT DisCod, EmprCod, DisCliDes FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09V532", "SELECT EmprCod, TipDisCod, TipDisDsc FROM TXPTIPDIS WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09V533", "SELECT DisCod, EmprCod, DisTipDis FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 31 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

