package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmpreveloaddvcombo extends GXProcedure
{
   public tmpreveloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmpreveloaddvcombo.class ), "" );
   }

   public tmpreveloaddvcombo( int remoteHandle ,
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
      tmpreveloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      tmpreveloaddvcombo.this.AV12ComboName = aP0;
      tmpreveloaddvcombo.this.AV13TrnMode = aP1;
      tmpreveloaddvcombo.this.AV14EmprCod = aP2;
      tmpreveloaddvcombo.this.AV15PMCod = aP3;
      tmpreveloaddvcombo.this.aP4 = aP4;
      tmpreveloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "PMRepCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PMREPCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "PMTCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PMTCOD' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "PMMEquCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PMMEQUCOD' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "PMMSEqCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PMMSEQCOD' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "PMMPieCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PMMPIECOD' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "PMTipoID") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PMTIPOID' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV12ComboName, "PMMaqCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PMMAQCOD' */
         S171 ();
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
      /* 'LOADCOMBOITEMS_PMREPCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A572 */
      pr_default.execute(0, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0A572_A396EmprCod[0] ;
         A9492MRCod = P0A572_A9492MRCod[0] ;
         A9493MRNom = P0A572_A9493MRNom[0] ;
         n9493MRNom = P0A572_n9493MRNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A9492MRCod, 8, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A9492MRCod, 8, 0))+"-"+A9493MRNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_PMTCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A573 */
      pr_default.execute(1, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P0A573_A396EmprCod[0] ;
         A9430TMCod = P0A573_A9430TMCod[0] ;
         A9431TMDsc = P0A573_A9431TMDsc[0] ;
         n9431TMDsc = P0A573_n9431TMDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A9430TMCod, 8, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A9430TMCod, 8, 0))+"-"+A9431TMDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV10Combo_Data.sort("Title");
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_PMMEQUCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A574 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A11438MaqEquCod = P0A574_A11438MaqEquCod[0] ;
         A11435MaqEquDsc = P0A574_A11435MaqEquDsc[0] ;
         A396EmprCod = P0A574_A396EmprCod[0] ;
         A602MaqCod = P0A574_A602MaqCod[0] ;
         A11439MaqSEqCod = P0A574_A11439MaqSEqCod[0] ;
         A11440MaqPieCod = P0A574_A11440MaqPieCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11438MaqEquCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A11438MaqEquCod)+"-"+A11435MaqEquDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_PMMSEQCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A575 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A11451PMMSEqCod = P0A575_A11451PMMSEqCod[0] ;
         A396EmprCod = P0A575_A396EmprCod[0] ;
         A9429PMCod = P0A575_A9429PMCod[0] ;
         A11450PMMEquCod = P0A575_A11450PMMEquCod[0] ;
         A11452PMMPieCod = P0A575_A11452PMMPieCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11451PMMSEqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A11451PMMSEqCod)+"-"+A11451PMMSEqCod );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV10Combo_Data.sort("Title");
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_PMMPIECOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A576 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = P0A576_A396EmprCod[0] ;
         A9429PMCod = P0A576_A9429PMCod[0] ;
         A9476PMMaqCod = P0A576_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P0A576_n9476PMMaqCod[0] ;
         A11450PMMEquCod = P0A576_A11450PMMEquCod[0] ;
         A11451PMMSEqCod = P0A576_A11451PMMSEqCod[0] ;
         A11452PMMPieCod = P0A576_A11452PMMPieCod[0] ;
         A11453PMMPieDsc = P0A576_A11453PMMPieDsc[0] ;
         n11453PMMPieDsc = P0A576_n11453PMMPieDsc[0] ;
         A9476PMMaqCod = P0A576_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P0A576_n9476PMMaqCod[0] ;
         A11453PMMPieDsc = P0A576_A11453PMMPieDsc[0] ;
         n11453PMMPieDsc = P0A576_n11453PMMPieDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A11452PMMPieCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A11452PMMPieCod)+"-"+A11453PMMPieDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV10Combo_Data.sort("Title");
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_PMTIPOID' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P0A577 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A14271PMTipoID = P0A577_A14271PMTipoID[0] ;
         A14272PMTipoDsc = P0A577_A14272PMTipoDsc[0] ;
         A396EmprCod = P0A577_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A14271PMTipoID, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A14271PMTipoID, 4, 0))+"-"+A14272PMTipoDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0A578 */
         pr_default.execute(6, new Object[] {AV14EmprCod, Integer.valueOf(AV15PMCod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A9429PMCod = P0A578_A9429PMCod[0] ;
            A396EmprCod = P0A578_A396EmprCod[0] ;
            A14271PMTipoID = P0A578_A14271PMTipoID[0] ;
            AV16SelectedValue = ((0==A14271PMTipoID) ? "" : GXutil.trim( GXutil.str( A14271PMTipoID, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
   }

   public void S171( )
   {
      /* 'LOADCOMBOITEMS_PMMAQCOD' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV10Combo_Data.sort("Title");
         if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
         {
            /* Using cursor P0A579 */
            pr_default.execute(7, new Object[] {AV14EmprCod, Integer.valueOf(AV15PMCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A9429PMCod = P0A579_A9429PMCod[0] ;
               A396EmprCod = P0A579_A396EmprCod[0] ;
               A9476PMMaqCod = P0A579_A9476PMMaqCod[0] ;
               n9476PMMaqCod = P0A579_n9476PMMaqCod[0] ;
               AV16SelectedValue = A9476PMMaqCod ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(7);
         }
      }
      AV10Combo_Data.sort("Title");
      AV10Combo_Data.clear();
      /* Using cursor P0A5710 */
      pr_default.execute(8, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A607MaqEst = P0A5710_A607MaqEst[0] ;
         n607MaqEst = P0A5710_n607MaqEst[0] ;
         A396EmprCod = P0A5710_A396EmprCod[0] ;
         A606MaqDsc = P0A5710_A606MaqDsc[0] ;
         n606MaqDsc = P0A5710_n606MaqDsc[0] ;
         A602MaqCod = P0A5710_A602MaqCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A606MaqDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      /* Using cursor P0A5711 */
      pr_default.execute(9, new Object[] {AV14EmprCod, Integer.valueOf(AV15PMCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A9476PMMaqCod = P0A5711_A9476PMMaqCod[0] ;
         n9476PMMaqCod = P0A5711_n9476PMMaqCod[0] ;
         A9429PMCod = P0A5711_A9429PMCod[0] ;
         A396EmprCod = P0A5711_A396EmprCod[0] ;
         AV16SelectedValue = A9476PMMaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP4[0] = tmpreveloaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = tmpreveloaddvcombo.this.AV10Combo_Data;
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
      P0A572_A396EmprCod = new String[] {""} ;
      P0A572_A9492MRCod = new int[1] ;
      P0A572_A9493MRNom = new String[] {""} ;
      P0A572_n9493MRNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A9493MRNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0A573_A396EmprCod = new String[] {""} ;
      P0A573_A9430TMCod = new int[1] ;
      P0A573_A9431TMDsc = new String[] {""} ;
      P0A573_n9431TMDsc = new boolean[] {false} ;
      A9431TMDsc = "" ;
      P0A574_A11438MaqEquCod = new String[] {""} ;
      P0A574_A11435MaqEquDsc = new String[] {""} ;
      P0A574_A396EmprCod = new String[] {""} ;
      P0A574_A602MaqCod = new String[] {""} ;
      P0A574_A11439MaqSEqCod = new String[] {""} ;
      P0A574_A11440MaqPieCod = new String[] {""} ;
      A11438MaqEquCod = "" ;
      A11435MaqEquDsc = "" ;
      A602MaqCod = "" ;
      A11439MaqSEqCod = "" ;
      A11440MaqPieCod = "" ;
      P0A575_A11451PMMSEqCod = new String[] {""} ;
      P0A575_A396EmprCod = new String[] {""} ;
      P0A575_A9429PMCod = new int[1] ;
      P0A575_A11450PMMEquCod = new String[] {""} ;
      P0A575_A11452PMMPieCod = new String[] {""} ;
      A11451PMMSEqCod = "" ;
      A11450PMMEquCod = "" ;
      A11452PMMPieCod = "" ;
      P0A576_A396EmprCod = new String[] {""} ;
      P0A576_A9429PMCod = new int[1] ;
      P0A576_A9476PMMaqCod = new String[] {""} ;
      P0A576_n9476PMMaqCod = new boolean[] {false} ;
      P0A576_A11450PMMEquCod = new String[] {""} ;
      P0A576_A11451PMMSEqCod = new String[] {""} ;
      P0A576_A11452PMMPieCod = new String[] {""} ;
      P0A576_A11453PMMPieDsc = new String[] {""} ;
      P0A576_n11453PMMPieDsc = new boolean[] {false} ;
      A9476PMMaqCod = "" ;
      A11453PMMPieDsc = "" ;
      P0A577_A14271PMTipoID = new short[1] ;
      P0A577_A14272PMTipoDsc = new String[] {""} ;
      P0A577_A396EmprCod = new String[] {""} ;
      A14272PMTipoDsc = "" ;
      P0A578_A9429PMCod = new int[1] ;
      P0A578_A396EmprCod = new String[] {""} ;
      P0A578_A14271PMTipoID = new short[1] ;
      P0A579_A9429PMCod = new int[1] ;
      P0A579_A396EmprCod = new String[] {""} ;
      P0A579_A9476PMMaqCod = new String[] {""} ;
      P0A579_n9476PMMaqCod = new boolean[] {false} ;
      P0A5710_A607MaqEst = new String[] {""} ;
      P0A5710_n607MaqEst = new boolean[] {false} ;
      P0A5710_A396EmprCod = new String[] {""} ;
      P0A5710_A606MaqDsc = new String[] {""} ;
      P0A5710_n606MaqDsc = new boolean[] {false} ;
      P0A5710_A602MaqCod = new String[] {""} ;
      A607MaqEst = "" ;
      A606MaqDsc = "" ;
      P0A5711_A9476PMMaqCod = new String[] {""} ;
      P0A5711_n9476PMMaqCod = new boolean[] {false} ;
      P0A5711_A9429PMCod = new int[1] ;
      P0A5711_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmpreveloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0A572_A396EmprCod, P0A572_A9492MRCod, P0A572_A9493MRNom, P0A572_n9493MRNom
            }
            , new Object[] {
            P0A573_A396EmprCod, P0A573_A9430TMCod, P0A573_A9431TMDsc, P0A573_n9431TMDsc
            }
            , new Object[] {
            P0A574_A11438MaqEquCod, P0A574_A11435MaqEquDsc, P0A574_A396EmprCod, P0A574_A602MaqCod, P0A574_A11439MaqSEqCod, P0A574_A11440MaqPieCod
            }
            , new Object[] {
            P0A575_A11451PMMSEqCod, P0A575_A396EmprCod, P0A575_A9429PMCod, P0A575_A11450PMMEquCod, P0A575_A11452PMMPieCod
            }
            , new Object[] {
            P0A576_A396EmprCod, P0A576_A9429PMCod, P0A576_A9476PMMaqCod, P0A576_n9476PMMaqCod, P0A576_A11450PMMEquCod, P0A576_A11451PMMSEqCod, P0A576_A11452PMMPieCod, P0A576_A11453PMMPieDsc, P0A576_n11453PMMPieDsc
            }
            , new Object[] {
            P0A577_A14271PMTipoID, P0A577_A14272PMTipoDsc, P0A577_A396EmprCod
            }
            , new Object[] {
            P0A578_A9429PMCod, P0A578_A396EmprCod, P0A578_A14271PMTipoID
            }
            , new Object[] {
            P0A579_A9429PMCod, P0A579_A396EmprCod, P0A579_A9476PMMaqCod, P0A579_n9476PMMaqCod
            }
            , new Object[] {
            P0A5710_A607MaqEst, P0A5710_n607MaqEst, P0A5710_A396EmprCod, P0A5710_A606MaqDsc, P0A5710_n606MaqDsc, P0A5710_A602MaqCod
            }
            , new Object[] {
            P0A5711_A9476PMMaqCod, P0A5711_n9476PMMaqCod, P0A5711_A9429PMCod, P0A5711_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A14271PMTipoID ;
   private short Gx_err ;
   private int AV15PMCod ;
   private int A9492MRCod ;
   private int A9430TMCod ;
   private int A9429PMCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9493MRNom ;
   private String A9431TMDsc ;
   private String A11438MaqEquCod ;
   private String A11435MaqEquDsc ;
   private String A602MaqCod ;
   private String A11439MaqSEqCod ;
   private String A11440MaqPieCod ;
   private String A11451PMMSEqCod ;
   private String A11450PMMEquCod ;
   private String A11452PMMPieCod ;
   private String A9476PMMaqCod ;
   private String A11453PMMPieDsc ;
   private String A14272PMTipoDsc ;
   private String A607MaqEst ;
   private String A606MaqDsc ;
   private boolean returnInSub ;
   private boolean n9493MRNom ;
   private boolean n9431TMDsc ;
   private boolean n9476PMMaqCod ;
   private boolean n11453PMMPieDsc ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A572_A396EmprCod ;
   private int[] P0A572_A9492MRCod ;
   private String[] P0A572_A9493MRNom ;
   private boolean[] P0A572_n9493MRNom ;
   private String[] P0A573_A396EmprCod ;
   private int[] P0A573_A9430TMCod ;
   private String[] P0A573_A9431TMDsc ;
   private boolean[] P0A573_n9431TMDsc ;
   private String[] P0A574_A11438MaqEquCod ;
   private String[] P0A574_A11435MaqEquDsc ;
   private String[] P0A574_A396EmprCod ;
   private String[] P0A574_A602MaqCod ;
   private String[] P0A574_A11439MaqSEqCod ;
   private String[] P0A574_A11440MaqPieCod ;
   private String[] P0A575_A11451PMMSEqCod ;
   private String[] P0A575_A396EmprCod ;
   private int[] P0A575_A9429PMCod ;
   private String[] P0A575_A11450PMMEquCod ;
   private String[] P0A575_A11452PMMPieCod ;
   private String[] P0A576_A396EmprCod ;
   private int[] P0A576_A9429PMCod ;
   private String[] P0A576_A9476PMMaqCod ;
   private boolean[] P0A576_n9476PMMaqCod ;
   private String[] P0A576_A11450PMMEquCod ;
   private String[] P0A576_A11451PMMSEqCod ;
   private String[] P0A576_A11452PMMPieCod ;
   private String[] P0A576_A11453PMMPieDsc ;
   private boolean[] P0A576_n11453PMMPieDsc ;
   private short[] P0A577_A14271PMTipoID ;
   private String[] P0A577_A14272PMTipoDsc ;
   private String[] P0A577_A396EmprCod ;
   private int[] P0A578_A9429PMCod ;
   private String[] P0A578_A396EmprCod ;
   private short[] P0A578_A14271PMTipoID ;
   private int[] P0A579_A9429PMCod ;
   private String[] P0A579_A396EmprCod ;
   private String[] P0A579_A9476PMMaqCod ;
   private boolean[] P0A579_n9476PMMaqCod ;
   private String[] P0A5710_A607MaqEst ;
   private boolean[] P0A5710_n607MaqEst ;
   private String[] P0A5710_A396EmprCod ;
   private String[] P0A5710_A606MaqDsc ;
   private boolean[] P0A5710_n606MaqDsc ;
   private String[] P0A5710_A602MaqCod ;
   private String[] P0A5711_A9476PMMaqCod ;
   private boolean[] P0A5711_n9476PMMaqCod ;
   private int[] P0A5711_A9429PMCod ;
   private String[] P0A5711_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class tmpreveloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A572", "SELECT EmprCod, MRCod, MRNom FROM TXPMREPUE WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A573", "SELECT EmprCod, TMCod, TMDsc FROM TXPMTAREA WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A574", "SELECT MaqEquCod, MaqEquDsc, EmprCod, MaqCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie ORDER BY EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A575", "SELECT PMMSEqCod, EmprCod, PMCod, PMMEquCod, PMMPieCod FROM TXPMPrev2 ORDER BY EmprCod, PMCod, PMMEquCod, PMMSEqCod, PMMPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A576", "SELECT T1.EmprCod, T1.PMCod, T2.PMMaqCod AS PMMaqCod, T1.PMMEquCod AS PMMEquCod, T1.PMMSEqCod AS PMMSEqCod, T1.PMMPieCod AS PMMPieCod, T3.MaqPieDsc AS PMMPieDsc FROM ((TXPMPrev2 T1 INNER JOIN TXPMPREVE T2 ON T2.EmprCod = T1.EmprCod AND T2.PMCod = T1.PMCod) LEFT JOIN TXPMaqPie T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T2.PMMaqCod AND T3.MaqEquCod = T1.PMMEquCod AND T3.MaqSEqCod = T1.PMMSEqCod AND T3.MaqPieCod = T1.PMMPieCod) ORDER BY T1.EmprCod, T1.PMCod, T1.PMMEquCod, T1.PMMSEqCod, T1.PMMPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A577", "SELECT PMTipoID, PMTipoDsc, EmprCod FROM TXPTIPPRV ORDER BY EmprCod, PMTipoID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A578", "SELECT PMCod, EmprCod, PMTipoID FROM TXPMPREVE WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A579", "SELECT PMCod, EmprCod, PMMaqCod FROM TXPMPREVE WHERE EmprCod = ? and PMCod = ? ORDER BY EmprCod, PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A5710", "SELECT MaqEst, EmprCod, MaqDsc, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqEst = 'A') ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5711", "SELECT PMMaqCod, PMCod, EmprCod FROM TXPMPREVE WHERE (EmprCod = ? and PMCod = ?) AND (Not (rtrim(PMMaqCod) IS NULL AND NOT(PMMaqCod IS NULL))) ORDER BY EmprCod, PMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((String[]) buf[7])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
      }
   }

}

