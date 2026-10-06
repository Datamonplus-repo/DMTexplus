package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almacentejidoloaddvcombo extends GXProcedure
{
   public almacentejidoloaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoloaddvcombo.class ), "" );
   }

   public almacentejidoloaddvcombo( int remoteHandle ,
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
      almacentejidoloaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      almacentejidoloaddvcombo.this.AV13ComboName = aP0;
      almacentejidoloaddvcombo.this.AV15TrnMode = aP1;
      almacentejidoloaddvcombo.this.AV17EmprCod = aP2;
      almacentejidoloaddvcombo.this.AV18AlbRecCod = aP3;
      almacentejidoloaddvcombo.this.aP4 = aP4;
      almacentejidoloaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV13ComboName, "AlmCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_ALMCOD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "TipEntCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TIPENTCOD' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "TrnCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_TRNCOD' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "ProceCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PROCECOD' */
         S141 ();
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
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "AlbRef") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_ALBREF' */
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
      /* 'LOADCOMBOITEMS_ALMCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09J42 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13822AlmNomID = P09J42_A13822AlmNomID[0] ;
         A4793AlmNom = P09J42_A4793AlmNom[0] ;
         n4793AlmNom = P09J42_n4793AlmNom[0] ;
         A4792AlmCod = P09J42_A4792AlmCod[0] ;
         n4792AlmCod = P09J42_n4792AlmCod[0] ;
         A396EmprCod = P09J42_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4792AlmCod, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13822AlmNomID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09J43 */
         pr_default.execute(1, new Object[] {AV17EmprCod, Integer.valueOf(AV18AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P09J43_A44AlbRecCod[0] ;
            A396EmprCod = P09J43_A396EmprCod[0] ;
            A4792AlmCod = P09J43_A4792AlmCod[0] ;
            n4792AlmCod = P09J43_n4792AlmCod[0] ;
            AV12SelectedValue = ((0==A4792AlmCod) ? "" : GXutil.trim( GXutil.str( A4792AlmCod, 1, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_TIPENTCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09J44 */
      pr_default.execute(2, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P09J44_A396EmprCod[0] ;
         A1212TipEntNom = P09J44_A1212TipEntNom[0] ;
         n1212TipEntNom = P09J44_n1212TipEntNom[0] ;
         A1211TipEntCod = P09J44_A1211TipEntCod[0] ;
         n1211TipEntCod = P09J44_n1211TipEntCod[0] ;
         A13821TipEntNomI = GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) + "-" + GXutil.trim( A1212TipEntNom) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13821TipEntNomI );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09J45 */
         pr_default.execute(3, new Object[] {AV17EmprCod, Integer.valueOf(AV18AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A44AlbRecCod = P09J45_A44AlbRecCod[0] ;
            A396EmprCod = P09J45_A396EmprCod[0] ;
            A1211TipEntCod = P09J45_A1211TipEntCod[0] ;
            n1211TipEntCod = P09J45_n1211TipEntCod[0] ;
            AV12SelectedValue = ((0==A1211TipEntCod) ? "" : GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_TRNCOD' Routine */
      returnInSub = false ;
      /* Using cursor P09J46 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13738TrnCNom = P09J46_A13738TrnCNom[0] ;
         A840TrnCod = P09J46_A840TrnCod[0] ;
         n840TrnCod = P09J46_n840TrnCod[0] ;
         A841TrnNom = P09J46_A841TrnNom[0] ;
         n841TrnNom = P09J46_n841TrnNom[0] ;
         A396EmprCod = P09J46_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13738TrnCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09J47 */
         pr_default.execute(5, new Object[] {AV17EmprCod, Integer.valueOf(AV18AlbRecCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A44AlbRecCod = P09J47_A44AlbRecCod[0] ;
            A396EmprCod = P09J47_A396EmprCod[0] ;
            A840TrnCod = P09J47_A840TrnCod[0] ;
            n840TrnCod = P09J47_n840TrnCod[0] ;
            AV12SelectedValue = ((0==A840TrnCod) ? "" : GXutil.trim( GXutil.str( A840TrnCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_PROCECOD' Routine */
      returnInSub = false ;
      /* Using cursor P09J48 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A13820ProceNomID = P09J48_A13820ProceNomID[0] ;
         A970ProceCod = P09J48_A970ProceCod[0] ;
         n970ProceCod = P09J48_n970ProceCod[0] ;
         A971ProceNom = P09J48_A971ProceNom[0] ;
         n971ProceNom = P09J48_n971ProceNom[0] ;
         A396EmprCod = P09J48_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13820ProceNomID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09J49 */
         pr_default.execute(7, new Object[] {AV17EmprCod, Integer.valueOf(AV18AlbRecCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A44AlbRecCod = P09J49_A44AlbRecCod[0] ;
            A396EmprCod = P09J49_A396EmprCod[0] ;
            A970ProceCod = P09J49_A970ProceCod[0] ;
            n970ProceCod = P09J49_n970ProceCod[0] ;
            AV12SelectedValue = ((0==A970ProceCod) ? "" : GXutil.trim( GXutil.str( A970ProceCod, 4, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      /* Using cursor P09J410 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A10045CliAct = P09J410_A10045CliAct[0] ;
         A13735CliCNom = P09J410_A13735CliCNom[0] ;
         A252CliCod = P09J410_A252CliCod[0] ;
         A279CliNom = P09J410_A279CliNom[0] ;
         A396EmprCod = P09J410_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09J411 */
         pr_default.execute(9, new Object[] {AV17EmprCod, Integer.valueOf(AV18AlbRecCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A44AlbRecCod = P09J411_A44AlbRecCod[0] ;
            A396EmprCod = P09J411_A396EmprCod[0] ;
            A252CliCod = P09J411_A252CliCod[0] ;
            AV12SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(9);
      }
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_ALBREF' Routine */
      returnInSub = false ;
      AV19CliCod = (int)(GXutil.lval( AV20WebSession.getValue("CliCod"))) ;
      AV20WebSession.remove("CliCod");
      AV10Combo_Data.clear();
      /* Using cursor P09J412 */
      pr_default.execute(10, new Object[] {AV17EmprCod, Integer.valueOf(AV19CliCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A14295ArtActivo = P09J412_A14295ArtActivo[0] ;
         A252CliCod = P09J412_A252CliCod[0] ;
         A396EmprCod = P09J412_A396EmprCod[0] ;
         A69ArtDsc = P09J412_A69ArtDsc[0] ;
         n69ArtDsc = P09J412_n69ArtDsc[0] ;
         A65ArtCod = P09J412_A65ArtCod[0] ;
         A13751ArtCDsc = GXutil.trim( A65ArtCod) + "-" + GXutil.trim( A69ArtDsc) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13751ArtCDsc );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(10);
      }
      pr_default.close(10);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09J413 */
         pr_default.execute(11, new Object[] {AV17EmprCod, Integer.valueOf(AV18AlbRecCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A44AlbRecCod = P09J413_A44AlbRecCod[0] ;
            A396EmprCod = P09J413_A396EmprCod[0] ;
            A45AlbRef = P09J413_A45AlbRef[0] ;
            AV12SelectedValue = A45AlbRef ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
   }

   public void S171( )
   {
      /* 'LOADCOMBOITEMS_ALBRTARTC' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09J414 */
      pr_default.execute(12);
      while ( (pr_default.getStatus(12) != 101) )
      {
         A829TipArtCod = P09J414_A829TipArtCod[0] ;
         A830TipArtDsc = P09J414_A830TipArtDsc[0] ;
         n830TipArtDsc = P09J414_n830TipArtDsc[0] ;
         A396EmprCod = P09J414_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)), A830TipArtDsc, "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP4[0] = almacentejidoloaddvcombo.this.AV12SelectedValue;
      this.aP5[0] = almacentejidoloaddvcombo.this.AV10Combo_Data;
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
      P09J42_A13822AlmNomID = new String[] {""} ;
      P09J42_A4793AlmNom = new String[] {""} ;
      P09J42_n4793AlmNom = new boolean[] {false} ;
      P09J42_A4792AlmCod = new byte[1] ;
      P09J42_n4792AlmCod = new boolean[] {false} ;
      P09J42_A396EmprCod = new String[] {""} ;
      A13822AlmNomID = "" ;
      A4793AlmNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09J43_A44AlbRecCod = new int[1] ;
      P09J43_A396EmprCod = new String[] {""} ;
      P09J43_A4792AlmCod = new byte[1] ;
      P09J43_n4792AlmCod = new boolean[] {false} ;
      P09J44_A396EmprCod = new String[] {""} ;
      P09J44_A1212TipEntNom = new String[] {""} ;
      P09J44_n1212TipEntNom = new boolean[] {false} ;
      P09J44_A1211TipEntCod = new short[1] ;
      P09J44_n1211TipEntCod = new boolean[] {false} ;
      A1212TipEntNom = "" ;
      A13821TipEntNomI = "" ;
      P09J45_A44AlbRecCod = new int[1] ;
      P09J45_A396EmprCod = new String[] {""} ;
      P09J45_A1211TipEntCod = new short[1] ;
      P09J45_n1211TipEntCod = new boolean[] {false} ;
      P09J46_A13738TrnCNom = new String[] {""} ;
      P09J46_A840TrnCod = new short[1] ;
      P09J46_n840TrnCod = new boolean[] {false} ;
      P09J46_A841TrnNom = new String[] {""} ;
      P09J46_n841TrnNom = new boolean[] {false} ;
      P09J46_A396EmprCod = new String[] {""} ;
      A13738TrnCNom = "" ;
      A841TrnNom = "" ;
      P09J47_A44AlbRecCod = new int[1] ;
      P09J47_A396EmprCod = new String[] {""} ;
      P09J47_A840TrnCod = new short[1] ;
      P09J47_n840TrnCod = new boolean[] {false} ;
      P09J48_A13820ProceNomID = new String[] {""} ;
      P09J48_A970ProceCod = new short[1] ;
      P09J48_n970ProceCod = new boolean[] {false} ;
      P09J48_A971ProceNom = new String[] {""} ;
      P09J48_n971ProceNom = new boolean[] {false} ;
      P09J48_A396EmprCod = new String[] {""} ;
      A13820ProceNomID = "" ;
      A971ProceNom = "" ;
      P09J49_A44AlbRecCod = new int[1] ;
      P09J49_A396EmprCod = new String[] {""} ;
      P09J49_A970ProceCod = new short[1] ;
      P09J49_n970ProceCod = new boolean[] {false} ;
      P09J410_A10045CliAct = new String[] {""} ;
      P09J410_A13735CliCNom = new String[] {""} ;
      P09J410_A252CliCod = new int[1] ;
      P09J410_A279CliNom = new String[] {""} ;
      P09J410_A396EmprCod = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      P09J411_A44AlbRecCod = new int[1] ;
      P09J411_A396EmprCod = new String[] {""} ;
      P09J411_A252CliCod = new int[1] ;
      AV20WebSession = httpContext.getWebSession();
      P09J412_A14295ArtActivo = new String[] {""} ;
      P09J412_A252CliCod = new int[1] ;
      P09J412_A396EmprCod = new String[] {""} ;
      P09J412_A69ArtDsc = new String[] {""} ;
      P09J412_n69ArtDsc = new boolean[] {false} ;
      P09J412_A65ArtCod = new String[] {""} ;
      A14295ArtActivo = "" ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      A13751ArtCDsc = "" ;
      P09J413_A44AlbRecCod = new int[1] ;
      P09J413_A396EmprCod = new String[] {""} ;
      P09J413_A45AlbRef = new String[] {""} ;
      A45AlbRef = "" ;
      P09J414_A829TipArtCod = new short[1] ;
      P09J414_A830TipArtDsc = new String[] {""} ;
      P09J414_n830TipArtDsc = new boolean[] {false} ;
      P09J414_A396EmprCod = new String[] {""} ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidoloaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09J42_A13822AlmNomID, P09J42_A4793AlmNom, P09J42_n4793AlmNom, P09J42_A4792AlmCod, P09J42_A396EmprCod
            }
            , new Object[] {
            P09J43_A44AlbRecCod, P09J43_A396EmprCod, P09J43_A4792AlmCod, P09J43_n4792AlmCod
            }
            , new Object[] {
            P09J44_A396EmprCod, P09J44_A1212TipEntNom, P09J44_n1212TipEntNom, P09J44_A1211TipEntCod
            }
            , new Object[] {
            P09J45_A44AlbRecCod, P09J45_A396EmprCod, P09J45_A1211TipEntCod, P09J45_n1211TipEntCod
            }
            , new Object[] {
            P09J46_A13738TrnCNom, P09J46_A840TrnCod, P09J46_A841TrnNom, P09J46_n841TrnNom, P09J46_A396EmprCod
            }
            , new Object[] {
            P09J47_A44AlbRecCod, P09J47_A396EmprCod, P09J47_A840TrnCod, P09J47_n840TrnCod
            }
            , new Object[] {
            P09J48_A13820ProceNomID, P09J48_A970ProceCod, P09J48_A971ProceNom, P09J48_n971ProceNom, P09J48_A396EmprCod
            }
            , new Object[] {
            P09J49_A44AlbRecCod, P09J49_A396EmprCod, P09J49_A970ProceCod, P09J49_n970ProceCod
            }
            , new Object[] {
            P09J410_A10045CliAct, P09J410_A13735CliCNom, P09J410_A252CliCod, P09J410_A279CliNom, P09J410_A396EmprCod
            }
            , new Object[] {
            P09J411_A44AlbRecCod, P09J411_A396EmprCod, P09J411_A252CliCod
            }
            , new Object[] {
            P09J412_A14295ArtActivo, P09J412_A252CliCod, P09J412_A396EmprCod, P09J412_A69ArtDsc, P09J412_n69ArtDsc, P09J412_A65ArtCod
            }
            , new Object[] {
            P09J413_A44AlbRecCod, P09J413_A396EmprCod, P09J413_A45AlbRef
            }
            , new Object[] {
            P09J414_A829TipArtCod, P09J414_A830TipArtDsc, P09J414_n830TipArtDsc, P09J414_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4792AlmCod ;
   private short A1211TipEntCod ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV18AlbRecCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV19CliCod ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String scmdbuf ;
   private String A4793AlmNom ;
   private String A396EmprCod ;
   private String A1212TipEntNom ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A14295ArtActivo ;
   private String A69ArtDsc ;
   private String A65ArtCod ;
   private String A45AlbRef ;
   private String A830TipArtDsc ;
   private boolean returnInSub ;
   private boolean n4793AlmNom ;
   private boolean n4792AlmCod ;
   private boolean n1212TipEntNom ;
   private boolean n1211TipEntCod ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n69ArtDsc ;
   private boolean n830TipArtDsc ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private String A13822AlmNomID ;
   private String A13821TipEntNomI ;
   private String A13738TrnCNom ;
   private String A13820ProceNomID ;
   private String A13735CliCNom ;
   private String A13751ArtCDsc ;
   private com.genexus.webpanels.WebSession AV20WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09J42_A13822AlmNomID ;
   private String[] P09J42_A4793AlmNom ;
   private boolean[] P09J42_n4793AlmNom ;
   private byte[] P09J42_A4792AlmCod ;
   private boolean[] P09J42_n4792AlmCod ;
   private String[] P09J42_A396EmprCod ;
   private int[] P09J43_A44AlbRecCod ;
   private String[] P09J43_A396EmprCod ;
   private byte[] P09J43_A4792AlmCod ;
   private boolean[] P09J43_n4792AlmCod ;
   private String[] P09J44_A396EmprCod ;
   private String[] P09J44_A1212TipEntNom ;
   private boolean[] P09J44_n1212TipEntNom ;
   private short[] P09J44_A1211TipEntCod ;
   private boolean[] P09J44_n1211TipEntCod ;
   private int[] P09J45_A44AlbRecCod ;
   private String[] P09J45_A396EmprCod ;
   private short[] P09J45_A1211TipEntCod ;
   private boolean[] P09J45_n1211TipEntCod ;
   private String[] P09J46_A13738TrnCNom ;
   private short[] P09J46_A840TrnCod ;
   private boolean[] P09J46_n840TrnCod ;
   private String[] P09J46_A841TrnNom ;
   private boolean[] P09J46_n841TrnNom ;
   private String[] P09J46_A396EmprCod ;
   private int[] P09J47_A44AlbRecCod ;
   private String[] P09J47_A396EmprCod ;
   private short[] P09J47_A840TrnCod ;
   private boolean[] P09J47_n840TrnCod ;
   private String[] P09J48_A13820ProceNomID ;
   private short[] P09J48_A970ProceCod ;
   private boolean[] P09J48_n970ProceCod ;
   private String[] P09J48_A971ProceNom ;
   private boolean[] P09J48_n971ProceNom ;
   private String[] P09J48_A396EmprCod ;
   private int[] P09J49_A44AlbRecCod ;
   private String[] P09J49_A396EmprCod ;
   private short[] P09J49_A970ProceCod ;
   private boolean[] P09J49_n970ProceCod ;
   private String[] P09J410_A10045CliAct ;
   private String[] P09J410_A13735CliCNom ;
   private int[] P09J410_A252CliCod ;
   private String[] P09J410_A279CliNom ;
   private String[] P09J410_A396EmprCod ;
   private int[] P09J411_A44AlbRecCod ;
   private String[] P09J411_A396EmprCod ;
   private int[] P09J411_A252CliCod ;
   private String[] P09J412_A14295ArtActivo ;
   private int[] P09J412_A252CliCod ;
   private String[] P09J412_A396EmprCod ;
   private String[] P09J412_A69ArtDsc ;
   private boolean[] P09J412_n69ArtDsc ;
   private String[] P09J412_A65ArtCod ;
   private int[] P09J413_A44AlbRecCod ;
   private String[] P09J413_A396EmprCod ;
   private String[] P09J413_A45AlbRef ;
   private short[] P09J414_A829TipArtCod ;
   private String[] P09J414_A830TipArtDsc ;
   private boolean[] P09J414_n830TipArtDsc ;
   private String[] P09J414_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class almacentejidoloaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09J42", "SELECT RTRIM(LTRIM(COALESCE( AlmNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(AlmCod,'90'), 2))) || ')' AS AlmNomID, AlmNom, AlmCod, EmprCod FROM TXPAlmace ORDER BY AlmNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09J43", "SELECT AlbRecCod, EmprCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09J44", "SELECT EmprCod, TipEntNom, TipEntCod FROM TXPENTRAD WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09J45", "SELECT AlbRecCod, EmprCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09J46", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, TrnCod, TrnNom, EmprCod FROM TXPTRANSP ORDER BY TrnCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09J47", "SELECT AlbRecCod, EmprCod, TrnCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09J48", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ProceCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ProceNom, ''))) AS ProceNomID, ProceCod, ProceNom, EmprCod FROM TXPPROCED ORDER BY ProceNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09J49", "SELECT AlbRecCod, EmprCod, ProceCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09J410", "SELECT CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09J411", "SELECT AlbRecCod, EmprCod, CliCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09J412", "SELECT ArtActivo, CliCod, EmprCod, ArtDsc, ArtCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ?) AND (ArtActivo = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09J413", "SELECT AlbRecCod, EmprCod, AlbRef FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09J414", "SELECT TipArtCod, TipArtDsc, EmprCod FROM TXPTIPART ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

