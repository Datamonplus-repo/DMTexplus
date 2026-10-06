package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class productoloaddvcombo extends GXProcedure
{
   public productoloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productoloaddvcombo.class ), "" );
   }

   public productoloaddvcombo( int remoteHandle ,
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
      productoloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      productoloaddvcombo.this.AV13ComboName = aP0;
      productoloaddvcombo.this.AV15TrnMode = aP1;
      productoloaddvcombo.this.AV17EmprCod = aP2;
      productoloaddvcombo.this.AV18PrdNum = aP3;
      productoloaddvcombo.this.aP4 = aP4;
      productoloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV13ComboName, "TipDtoCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPDTOCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "ValCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_VALCOD' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "PrdUniCom") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRDUNICOM' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "PrdUniCon") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRDUNICON' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "PrvNum") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRVNUM' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "PrdFabId") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRDFABID' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "PrdUMeFo") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRDUMEFO' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "PrdGruFamId") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PRDGRUFAMID' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "TipPrdCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPPRDCOD' */
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
      /* 'LOADCOMBOITEMS_TIPDTOCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09M52 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A837TipDtoDto = P09M52_A837TipDtoDto[0] ;
         n837TipDtoDto = P09M52_n837TipDtoDto[0] ;
         A13774TipDtoCDsc = P09M52_A13774TipDtoCDsc[0] ;
         A835TipDtoCod = P09M52_A835TipDtoCod[0] ;
         n835TipDtoCod = P09M52_n835TipDtoCod[0] ;
         A836TipDtoDsc = P09M52_A836TipDtoDsc[0] ;
         n836TipDtoDsc = P09M52_n836TipDtoDsc[0] ;
         A396EmprCod = P09M52_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A837TipDtoDto, 5, 2)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13774TipDtoCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M53 */
         pr_default.execute(1, new Object[] {AV17EmprCod, AV18PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P09M53_A719PrdNum[0] ;
            A396EmprCod = P09M53_A396EmprCod[0] ;
            A835TipDtoCod = P09M53_A835TipDtoCod[0] ;
            n835TipDtoCod = P09M53_n835TipDtoCod[0] ;
            AV12SelectedValue = ((0==A835TipDtoCod) ? "" : GXutil.trim( GXutil.str( A835TipDtoCod, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_VALCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09M54 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13773ValCDsc = P09M54_A13773ValCDsc[0] ;
         A856ValCod = P09M54_A856ValCod[0] ;
         A857ValDsc = P09M54_A857ValDsc[0] ;
         n857ValDsc = P09M54_n857ValDsc[0] ;
         A396EmprCod = P09M54_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A856ValCod, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13773ValCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M55 */
         pr_default.execute(3, new Object[] {AV17EmprCod, AV18PrdNum});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A719PrdNum = P09M55_A719PrdNum[0] ;
            A396EmprCod = P09M55_A396EmprCod[0] ;
            A856ValCod = P09M55_A856ValCod[0] ;
            AV12SelectedValue = ((0==A856ValCod) ? "" : GXutil.trim( GXutil.str( A856ValCod, 1, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_PRDUNICOM' Routine */
      returnInSub = false ;
      /* Using cursor P09M56 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13772UnidCDsc = P09M56_A13772UnidCDsc[0] ;
         A848UniCod = P09M56_A848UniCod[0] ;
         A849UniDsc = P09M56_A849UniDsc[0] ;
         n849UniDsc = P09M56_n849UniDsc[0] ;
         A396EmprCod = P09M56_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A848UniCod, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13772UnidCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M57 */
         pr_default.execute(5, new Object[] {AV17EmprCod, AV18PrdNum});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A719PrdNum = P09M57_A719PrdNum[0] ;
            A396EmprCod = P09M57_A396EmprCod[0] ;
            A742PrdUniCom = P09M57_A742PrdUniCom[0] ;
            AV12SelectedValue = ((0==A742PrdUniCom) ? "" : GXutil.trim( GXutil.str( A742PrdUniCom, 1, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_PRDUNICON' Routine */
      returnInSub = false ;
      /* Using cursor P09M58 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A849UniDsc = P09M58_A849UniDsc[0] ;
         n849UniDsc = P09M58_n849UniDsc[0] ;
         A848UniCod = P09M58_A848UniCod[0] ;
         A396EmprCod = P09M58_A396EmprCod[0] ;
         A13772UnidCDsc = GXutil.trim( GXutil.str( A848UniCod, 1, 0)) + "-" + GXutil.trim( A849UniDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A848UniCod, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13772UnidCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M59 */
         pr_default.execute(7, new Object[] {AV17EmprCod, AV18PrdNum});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A719PrdNum = P09M59_A719PrdNum[0] ;
            A396EmprCod = P09M59_A396EmprCod[0] ;
            A743PrdUniCon = P09M59_A743PrdUniCon[0] ;
            AV12SelectedValue = ((0==A743PrdUniCon) ? "" : GXutil.trim( GXutil.str( A743PrdUniCon, 1, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_PRVNUM' Routine */
      returnInSub = false ;
      /* Using cursor P09M510 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A14216PrvAct = P09M510_A14216PrvAct[0] ;
         A13719PrvNNom = P09M510_A13719PrvNNom[0] ;
         A795PrvNum = P09M510_A795PrvNum[0] ;
         A794PrvNom = P09M510_A794PrvNom[0] ;
         n794PrvNom = P09M510_n794PrvNom[0] ;
         A396EmprCod = P09M510_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A795PrvNum, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13719PrvNNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M511 */
         pr_default.execute(9, new Object[] {AV17EmprCod, AV18PrdNum});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A719PrdNum = P09M511_A719PrdNum[0] ;
            A396EmprCod = P09M511_A396EmprCod[0] ;
            A795PrvNum = P09M511_A795PrvNum[0] ;
            AV12SelectedValue = ((0==A795PrvNum) ? "" : GXutil.trim( GXutil.str( A795PrvNum, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
      }
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_PRDFABID' Routine */
      returnInSub = false ;
      /* Using cursor P09M512 */
      pr_default.execute(10);
      while ( (pr_default.getStatus(10) != 101) )
      {
         A13776PrdFabIDNm = P09M512_A13776PrdFabIDNm[0] ;
         A12714PrdFabId = P09M512_A12714PrdFabId[0] ;
         n12714PrdFabId = P09M512_n12714PrdFabId[0] ;
         A12715PrdFabNm = P09M512_A12715PrdFabNm[0] ;
         n12715PrdFabNm = P09M512_n12715PrdFabNm[0] ;
         A396EmprCod = P09M512_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A12714PrdFabId, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13776PrdFabIDNm );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M513 */
         pr_default.execute(11, new Object[] {AV17EmprCod, AV18PrdNum});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A719PrdNum = P09M513_A719PrdNum[0] ;
            A396EmprCod = P09M513_A396EmprCod[0] ;
            A12714PrdFabId = P09M513_A12714PrdFabId[0] ;
            n12714PrdFabId = P09M513_n12714PrdFabId[0] ;
            AV12SelectedValue = ((0==A12714PrdFabId) ? "" : GXutil.trim( GXutil.str( A12714PrdFabId, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
   }

   public void S171( )
   {
      /* 'LOADCOMBOITEMS_PRDUMEFO' Routine */
      returnInSub = false ;
      /* Using cursor P09M514 */
      pr_default.execute(12);
      while ( (pr_default.getStatus(12) != 101) )
      {
         A488ForPrdDsc = P09M514_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09M514_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P09M514_A490ForPrdUMe[0] ;
         A396EmprCod = P09M514_A396EmprCod[0] ;
         A13746ForPrdCDsc = GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)) + "-" + GXutil.trim( A488ForPrdDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A490ForPrdUMe, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13746ForPrdCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(12);
      }
      pr_default.close(12);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M515 */
         pr_default.execute(13, new Object[] {AV17EmprCod, AV18PrdNum});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A719PrdNum = P09M515_A719PrdNum[0] ;
            A396EmprCod = P09M515_A396EmprCod[0] ;
            A4338PrdUMeFo = P09M515_A4338PrdUMeFo[0] ;
            AV12SelectedValue = ((0==A4338PrdUMeFo) ? "" : GXutil.trim( GXutil.str( A4338PrdUMeFo, 1, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(13);
      }
   }

   public void S181( )
   {
      /* 'LOADCOMBOITEMS_PRDGRUFAMID' Routine */
      returnInSub = false ;
      /* Using cursor P09M516 */
      pr_default.execute(14);
      while ( (pr_default.getStatus(14) != 101) )
      {
         A13745GrpCDsc = P09M516_A13745GrpCDsc[0] ;
         A499GrpFamCod = P09M516_A499GrpFamCod[0] ;
         A500GrpFamDsc = P09M516_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P09M516_n500GrpFamDsc[0] ;
         A396EmprCod = P09M516_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A499GrpFamCod, 2, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13745GrpCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(14);
      }
      pr_default.close(14);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M517 */
         pr_default.execute(15, new Object[] {AV17EmprCod, AV18PrdNum});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A719PrdNum = P09M517_A719PrdNum[0] ;
            A396EmprCod = P09M517_A396EmprCod[0] ;
            A13969PrdGruFamI = P09M517_A13969PrdGruFamI[0] ;
            n13969PrdGruFamI = P09M517_n13969PrdGruFamI[0] ;
            AV12SelectedValue = ((0==A13969PrdGruFamI) ? "" : GXutil.trim( GXutil.str( A13969PrdGruFamI, 2, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(15);
      }
   }

   public void S191( )
   {
      /* 'LOADCOMBOITEMS_TIPPRDCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09M518 */
      pr_default.execute(16);
      while ( (pr_default.getStatus(16) != 101) )
      {
         A13777TipPrdCDsc = P09M518_A13777TipPrdCDsc[0] ;
         A6301TipPrdCod = P09M518_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09M518_n6301TipPrdCod[0] ;
         A6302TipPrdDsc = P09M518_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09M518_n6302TipPrdDsc[0] ;
         A396EmprCod = P09M518_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A6301TipPrdCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13777TipPrdCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(16);
      }
      pr_default.close(16);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09M519 */
         pr_default.execute(17, new Object[] {AV17EmprCod, AV18PrdNum});
         while ( (pr_default.getStatus(17) != 101) )
         {
            A719PrdNum = P09M519_A719PrdNum[0] ;
            A396EmprCod = P09M519_A396EmprCod[0] ;
            A6301TipPrdCod = P09M519_A6301TipPrdCod[0] ;
            n6301TipPrdCod = P09M519_n6301TipPrdCod[0] ;
            AV12SelectedValue = ((0==A6301TipPrdCod) ? "" : GXutil.trim( GXutil.str( A6301TipPrdCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(17);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = productoloaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = productoloaddvcombo.this.AV10Combo_Data;
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
      P09M52_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09M52_n837TipDtoDto = new boolean[] {false} ;
      P09M52_A13774TipDtoCDsc = new String[] {""} ;
      P09M52_A835TipDtoCod = new byte[1] ;
      P09M52_n835TipDtoCod = new boolean[] {false} ;
      P09M52_A836TipDtoDsc = new String[] {""} ;
      P09M52_n836TipDtoDsc = new boolean[] {false} ;
      P09M52_A396EmprCod = new String[] {""} ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      A13774TipDtoCDsc = "" ;
      A836TipDtoDsc = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09M53_A719PrdNum = new String[] {""} ;
      P09M53_A396EmprCod = new String[] {""} ;
      P09M53_A835TipDtoCod = new byte[1] ;
      P09M53_n835TipDtoCod = new boolean[] {false} ;
      A719PrdNum = "" ;
      P09M54_A13773ValCDsc = new String[] {""} ;
      P09M54_A856ValCod = new byte[1] ;
      P09M54_A857ValDsc = new String[] {""} ;
      P09M54_n857ValDsc = new boolean[] {false} ;
      P09M54_A396EmprCod = new String[] {""} ;
      A13773ValCDsc = "" ;
      A857ValDsc = "" ;
      P09M55_A719PrdNum = new String[] {""} ;
      P09M55_A396EmprCod = new String[] {""} ;
      P09M55_A856ValCod = new byte[1] ;
      P09M56_A13772UnidCDsc = new String[] {""} ;
      P09M56_A848UniCod = new byte[1] ;
      P09M56_A849UniDsc = new String[] {""} ;
      P09M56_n849UniDsc = new boolean[] {false} ;
      P09M56_A396EmprCod = new String[] {""} ;
      A13772UnidCDsc = "" ;
      A849UniDsc = "" ;
      P09M57_A719PrdNum = new String[] {""} ;
      P09M57_A396EmprCod = new String[] {""} ;
      P09M57_A742PrdUniCom = new byte[1] ;
      P09M58_A849UniDsc = new String[] {""} ;
      P09M58_n849UniDsc = new boolean[] {false} ;
      P09M58_A848UniCod = new byte[1] ;
      P09M58_A396EmprCod = new String[] {""} ;
      P09M59_A719PrdNum = new String[] {""} ;
      P09M59_A396EmprCod = new String[] {""} ;
      P09M59_A743PrdUniCon = new byte[1] ;
      P09M510_A14216PrvAct = new String[] {""} ;
      P09M510_A13719PrvNNom = new String[] {""} ;
      P09M510_A795PrvNum = new int[1] ;
      P09M510_A794PrvNom = new String[] {""} ;
      P09M510_n794PrvNom = new boolean[] {false} ;
      P09M510_A396EmprCod = new String[] {""} ;
      A14216PrvAct = "" ;
      A13719PrvNNom = "" ;
      A794PrvNom = "" ;
      P09M511_A719PrdNum = new String[] {""} ;
      P09M511_A396EmprCod = new String[] {""} ;
      P09M511_A795PrvNum = new int[1] ;
      P09M512_A13776PrdFabIDNm = new String[] {""} ;
      P09M512_A12714PrdFabId = new int[1] ;
      P09M512_n12714PrdFabId = new boolean[] {false} ;
      P09M512_A12715PrdFabNm = new String[] {""} ;
      P09M512_n12715PrdFabNm = new boolean[] {false} ;
      P09M512_A396EmprCod = new String[] {""} ;
      A13776PrdFabIDNm = "" ;
      A12715PrdFabNm = "" ;
      P09M513_A719PrdNum = new String[] {""} ;
      P09M513_A396EmprCod = new String[] {""} ;
      P09M513_A12714PrdFabId = new int[1] ;
      P09M513_n12714PrdFabId = new boolean[] {false} ;
      P09M514_A488ForPrdDsc = new String[] {""} ;
      P09M514_n488ForPrdDsc = new boolean[] {false} ;
      P09M514_A490ForPrdUMe = new byte[1] ;
      P09M514_A396EmprCod = new String[] {""} ;
      A488ForPrdDsc = "" ;
      A13746ForPrdCDsc = "" ;
      P09M515_A719PrdNum = new String[] {""} ;
      P09M515_A396EmprCod = new String[] {""} ;
      P09M515_A4338PrdUMeFo = new byte[1] ;
      P09M516_A13745GrpCDsc = new String[] {""} ;
      P09M516_A499GrpFamCod = new byte[1] ;
      P09M516_A500GrpFamDsc = new String[] {""} ;
      P09M516_n500GrpFamDsc = new boolean[] {false} ;
      P09M516_A396EmprCod = new String[] {""} ;
      A13745GrpCDsc = "" ;
      A500GrpFamDsc = "" ;
      P09M517_A719PrdNum = new String[] {""} ;
      P09M517_A396EmprCod = new String[] {""} ;
      P09M517_A13969PrdGruFamI = new byte[1] ;
      P09M517_n13969PrdGruFamI = new boolean[] {false} ;
      P09M518_A13777TipPrdCDsc = new String[] {""} ;
      P09M518_A6301TipPrdCod = new short[1] ;
      P09M518_n6301TipPrdCod = new boolean[] {false} ;
      P09M518_A6302TipPrdDsc = new String[] {""} ;
      P09M518_n6302TipPrdDsc = new boolean[] {false} ;
      P09M518_A396EmprCod = new String[] {""} ;
      A13777TipPrdCDsc = "" ;
      A6302TipPrdDsc = "" ;
      P09M519_A719PrdNum = new String[] {""} ;
      P09M519_A396EmprCod = new String[] {""} ;
      P09M519_A6301TipPrdCod = new short[1] ;
      P09M519_n6301TipPrdCod = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.productoloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09M52_A837TipDtoDto, P09M52_n837TipDtoDto, P09M52_A13774TipDtoCDsc, P09M52_A835TipDtoCod, P09M52_A836TipDtoDsc, P09M52_n836TipDtoDsc, P09M52_A396EmprCod
            }
            , new Object[] {
            P09M53_A719PrdNum, P09M53_A396EmprCod, P09M53_A835TipDtoCod, P09M53_n835TipDtoCod
            }
            , new Object[] {
            P09M54_A13773ValCDsc, P09M54_A856ValCod, P09M54_A857ValDsc, P09M54_n857ValDsc, P09M54_A396EmprCod
            }
            , new Object[] {
            P09M55_A719PrdNum, P09M55_A396EmprCod, P09M55_A856ValCod
            }
            , new Object[] {
            P09M56_A13772UnidCDsc, P09M56_A848UniCod, P09M56_A849UniDsc, P09M56_n849UniDsc, P09M56_A396EmprCod
            }
            , new Object[] {
            P09M57_A719PrdNum, P09M57_A396EmprCod, P09M57_A742PrdUniCom
            }
            , new Object[] {
            P09M58_A849UniDsc, P09M58_n849UniDsc, P09M58_A848UniCod, P09M58_A396EmprCod
            }
            , new Object[] {
            P09M59_A719PrdNum, P09M59_A396EmprCod, P09M59_A743PrdUniCon
            }
            , new Object[] {
            P09M510_A14216PrvAct, P09M510_A13719PrvNNom, P09M510_A795PrvNum, P09M510_A794PrvNom, P09M510_n794PrvNom, P09M510_A396EmprCod
            }
            , new Object[] {
            P09M511_A719PrdNum, P09M511_A396EmprCod, P09M511_A795PrvNum
            }
            , new Object[] {
            P09M512_A13776PrdFabIDNm, P09M512_A12714PrdFabId, P09M512_A12715PrdFabNm, P09M512_n12715PrdFabNm, P09M512_A396EmprCod
            }
            , new Object[] {
            P09M513_A719PrdNum, P09M513_A396EmprCod, P09M513_A12714PrdFabId, P09M513_n12714PrdFabId
            }
            , new Object[] {
            P09M514_A488ForPrdDsc, P09M514_n488ForPrdDsc, P09M514_A490ForPrdUMe, P09M514_A396EmprCod
            }
            , new Object[] {
            P09M515_A719PrdNum, P09M515_A396EmprCod, P09M515_A4338PrdUMeFo
            }
            , new Object[] {
            P09M516_A13745GrpCDsc, P09M516_A499GrpFamCod, P09M516_A500GrpFamDsc, P09M516_n500GrpFamDsc, P09M516_A396EmprCod
            }
            , new Object[] {
            P09M517_A719PrdNum, P09M517_A396EmprCod, P09M517_A13969PrdGruFamI, P09M517_n13969PrdGruFamI
            }
            , new Object[] {
            P09M518_A13777TipPrdCDsc, P09M518_A6301TipPrdCod, P09M518_A6302TipPrdDsc, P09M518_n6302TipPrdDsc, P09M518_A396EmprCod
            }
            , new Object[] {
            P09M519_A719PrdNum, P09M519_A396EmprCod, P09M519_A6301TipPrdCod, P09M519_n6301TipPrdCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A835TipDtoCod ;
   private byte A856ValCod ;
   private byte A848UniCod ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A490ForPrdUMe ;
   private byte A4338PrdUMeFo ;
   private byte A499GrpFamCod ;
   private byte A13969PrdGruFamI ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int A12714PrdFabId ;
   private java.math.BigDecimal A837TipDtoDto ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String AV18PrdNum ;
   private String scmdbuf ;
   private String A836TipDtoDsc ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A857ValDsc ;
   private String A849UniDsc ;
   private String A14216PrvAct ;
   private String A794PrvNom ;
   private String A12715PrdFabNm ;
   private String A488ForPrdDsc ;
   private String A500GrpFamDsc ;
   private String A6302TipPrdDsc ;
   private boolean returnInSub ;
   private boolean n837TipDtoDto ;
   private boolean n835TipDtoCod ;
   private boolean n836TipDtoDsc ;
   private boolean n857ValDsc ;
   private boolean n849UniDsc ;
   private boolean n794PrvNom ;
   private boolean n12714PrdFabId ;
   private boolean n12715PrdFabNm ;
   private boolean n488ForPrdDsc ;
   private boolean n500GrpFamDsc ;
   private boolean n13969PrdGruFamI ;
   private boolean n6301TipPrdCod ;
   private boolean n6302TipPrdDsc ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13774TipDtoCDsc ;
   private String A13773ValCDsc ;
   private String A13772UnidCDsc ;
   private String A13719PrvNNom ;
   private String A13776PrdFabIDNm ;
   private String A13746ForPrdCDsc ;
   private String A13745GrpCDsc ;
   private String A13777TipPrdCDsc ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P09M52_A837TipDtoDto ;
   private boolean[] P09M52_n837TipDtoDto ;
   private String[] P09M52_A13774TipDtoCDsc ;
   private byte[] P09M52_A835TipDtoCod ;
   private boolean[] P09M52_n835TipDtoCod ;
   private String[] P09M52_A836TipDtoDsc ;
   private boolean[] P09M52_n836TipDtoDsc ;
   private String[] P09M52_A396EmprCod ;
   private String[] P09M53_A719PrdNum ;
   private String[] P09M53_A396EmprCod ;
   private byte[] P09M53_A835TipDtoCod ;
   private boolean[] P09M53_n835TipDtoCod ;
   private String[] P09M54_A13773ValCDsc ;
   private byte[] P09M54_A856ValCod ;
   private String[] P09M54_A857ValDsc ;
   private boolean[] P09M54_n857ValDsc ;
   private String[] P09M54_A396EmprCod ;
   private String[] P09M55_A719PrdNum ;
   private String[] P09M55_A396EmprCod ;
   private byte[] P09M55_A856ValCod ;
   private String[] P09M56_A13772UnidCDsc ;
   private byte[] P09M56_A848UniCod ;
   private String[] P09M56_A849UniDsc ;
   private boolean[] P09M56_n849UniDsc ;
   private String[] P09M56_A396EmprCod ;
   private String[] P09M57_A719PrdNum ;
   private String[] P09M57_A396EmprCod ;
   private byte[] P09M57_A742PrdUniCom ;
   private String[] P09M58_A849UniDsc ;
   private boolean[] P09M58_n849UniDsc ;
   private byte[] P09M58_A848UniCod ;
   private String[] P09M58_A396EmprCod ;
   private String[] P09M59_A719PrdNum ;
   private String[] P09M59_A396EmprCod ;
   private byte[] P09M59_A743PrdUniCon ;
   private String[] P09M510_A14216PrvAct ;
   private String[] P09M510_A13719PrvNNom ;
   private int[] P09M510_A795PrvNum ;
   private String[] P09M510_A794PrvNom ;
   private boolean[] P09M510_n794PrvNom ;
   private String[] P09M510_A396EmprCod ;
   private String[] P09M511_A719PrdNum ;
   private String[] P09M511_A396EmprCod ;
   private int[] P09M511_A795PrvNum ;
   private String[] P09M512_A13776PrdFabIDNm ;
   private int[] P09M512_A12714PrdFabId ;
   private boolean[] P09M512_n12714PrdFabId ;
   private String[] P09M512_A12715PrdFabNm ;
   private boolean[] P09M512_n12715PrdFabNm ;
   private String[] P09M512_A396EmprCod ;
   private String[] P09M513_A719PrdNum ;
   private String[] P09M513_A396EmprCod ;
   private int[] P09M513_A12714PrdFabId ;
   private boolean[] P09M513_n12714PrdFabId ;
   private String[] P09M514_A488ForPrdDsc ;
   private boolean[] P09M514_n488ForPrdDsc ;
   private byte[] P09M514_A490ForPrdUMe ;
   private String[] P09M514_A396EmprCod ;
   private String[] P09M515_A719PrdNum ;
   private String[] P09M515_A396EmprCod ;
   private byte[] P09M515_A4338PrdUMeFo ;
   private String[] P09M516_A13745GrpCDsc ;
   private byte[] P09M516_A499GrpFamCod ;
   private String[] P09M516_A500GrpFamDsc ;
   private boolean[] P09M516_n500GrpFamDsc ;
   private String[] P09M516_A396EmprCod ;
   private String[] P09M517_A719PrdNum ;
   private String[] P09M517_A396EmprCod ;
   private byte[] P09M517_A13969PrdGruFamI ;
   private boolean[] P09M517_n13969PrdGruFamI ;
   private String[] P09M518_A13777TipPrdCDsc ;
   private short[] P09M518_A6301TipPrdCod ;
   private boolean[] P09M518_n6301TipPrdCod ;
   private String[] P09M518_A6302TipPrdDsc ;
   private boolean[] P09M518_n6302TipPrdDsc ;
   private String[] P09M518_A396EmprCod ;
   private String[] P09M519_A719PrdNum ;
   private String[] P09M519_A396EmprCod ;
   private short[] P09M519_A6301TipPrdCod ;
   private boolean[] P09M519_n6301TipPrdCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class productoloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09M52", "SELECT TipDtoDto, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDtoCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDtoDsc, ''))) AS TipDtoCDsc, TipDtoCod, TipDtoDsc, EmprCod FROM TXPTIPDTO ORDER BY TipDtoCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M53", "SELECT PrdNum, EmprCod, TipDtoCod FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M54", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ValCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ValDsc, ''))) AS ValCDsc, ValCod, ValDsc, EmprCod FROM TXPTIPVAL ORDER BY ValCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M55", "SELECT PrdNum, EmprCod, ValCod FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M56", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(UniCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( UniDsc, ''))) AS UnidCDsc, UniCod, UniDsc, EmprCod FROM TXPTIPUNI ORDER BY UnidCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M57", "SELECT PrdNum, EmprCod, PrdUniCom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M58", "SELECT UniDsc, UniCod, EmprCod FROM TXPTIPUNI ORDER BY EmprCod, UniCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M59", "SELECT PrdNum, EmprCod, PrdUniCon FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M510", "SELECT PrvAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, PrvNum, PrvNom, EmprCod FROM TXPPRVGEN WHERE PrvAct = 'S' ORDER BY PrvNNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M511", "SELECT PrdNum, EmprCod, PrvNum FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M512", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrdFabId,'999990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( PrdFabNm, ''))) AS PrdFabIDNm, PrdFabId, PrdFabNm, EmprCod FROM TXPPRDFAB ORDER BY PrdFabIDNm ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M513", "SELECT PrdNum, EmprCod, PrdFabId FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M514", "SELECT ForPrdDsc, ForPrdUMe, EmprCod FROM TXPUNMEPR ORDER BY EmprCod, ForPrdUMe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M515", "SELECT PrdNum, EmprCod, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M516", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(GrpFamCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( GrpFamDsc, ''))) AS GrpCDsc, GrpFamCod, GrpFamDsc, EmprCod FROM TXPGRUFAM ORDER BY GrpCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M517", "SELECT PrdNum, EmprCod, PrdGruFamI FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09M518", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipPrdDsc, ''))) AS TipPrdCDsc, TipPrdCod, TipPrdDsc, EmprCod FROM TXPTIPPRD ORDER BY TipPrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09M519", "SELECT PrdNum, EmprCod, TipPrdCod FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

