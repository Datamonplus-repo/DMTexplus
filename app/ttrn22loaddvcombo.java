package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn22loaddvcombo extends GXProcedure
{
   public ttrn22loaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn22loaddvcombo.class ), "" );
   }

   public ttrn22loaddvcombo( int remoteHandle ,
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
      ttrn22loaddvcombo.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
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
      ttrn22loaddvcombo.this.AV12ComboName = aP0;
      ttrn22loaddvcombo.this.AV13TrnMode = aP1;
      ttrn22loaddvcombo.this.AV14EmprCod = aP2;
      ttrn22loaddvcombo.this.AV15AlbRecCod = aP3;
      ttrn22loaddvcombo.this.aP4 = aP4;
      ttrn22loaddvcombo.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV12ComboName, "AlmCod") == 0 )
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
      else if ( GXutil.strcmp(AV12ComboName, "TipEntCod") == 0 )
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
      else if ( GXutil.strcmp(AV12ComboName, "TrnCod") == 0 )
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
      else if ( GXutil.strcmp(AV12ComboName, "ProceCod") == 0 )
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
      else if ( GXutil.strcmp(AV12ComboName, "CliCod") == 0 )
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
      else if ( GXutil.strcmp(AV12ComboName, "AlbRef") == 0 )
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
      /* Using cursor P0ATM2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13822AlmNomID = P0ATM2_A13822AlmNomID[0] ;
         A4793AlmNom = P0ATM2_A4793AlmNom[0] ;
         n4793AlmNom = P0ATM2_n4793AlmNom[0] ;
         A4792AlmCod = P0ATM2_A4792AlmCod[0] ;
         n4792AlmCod = P0ATM2_n4792AlmCod[0] ;
         A396EmprCod = P0ATM2_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4792AlmCod, 1, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13822AlmNomID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ATM3 */
         pr_default.execute(1, new Object[] {AV14EmprCod, Integer.valueOf(AV15AlbRecCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P0ATM3_A44AlbRecCod[0] ;
            A396EmprCod = P0ATM3_A396EmprCod[0] ;
            A4792AlmCod = P0ATM3_A4792AlmCod[0] ;
            n4792AlmCod = P0ATM3_n4792AlmCod[0] ;
            AV16SelectedValue = ((0==A4792AlmCod) ? "" : GXutil.trim( GXutil.str( A4792AlmCod, 1, 0))) ;
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
      /* Using cursor P0ATM4 */
      pr_default.execute(2, new Object[] {AV14EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P0ATM4_A396EmprCod[0] ;
         A1212TipEntNom = P0ATM4_A1212TipEntNom[0] ;
         n1212TipEntNom = P0ATM4_n1212TipEntNom[0] ;
         A1211TipEntCod = P0ATM4_A1211TipEntCod[0] ;
         n1211TipEntCod = P0ATM4_n1211TipEntCod[0] ;
         A13821TipEntNomI = GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) + "-" + GXutil.trim( A1212TipEntNom) ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13821TipEntNomI );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ATM5 */
         pr_default.execute(3, new Object[] {AV14EmprCod, Integer.valueOf(AV15AlbRecCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A44AlbRecCod = P0ATM5_A44AlbRecCod[0] ;
            A396EmprCod = P0ATM5_A396EmprCod[0] ;
            A1211TipEntCod = P0ATM5_A1211TipEntCod[0] ;
            n1211TipEntCod = P0ATM5_n1211TipEntCod[0] ;
            AV16SelectedValue = ((0==A1211TipEntCod) ? "" : GXutil.trim( GXutil.str( A1211TipEntCod, 4, 0))) ;
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
      /* Using cursor P0ATM6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13738TrnCNom = P0ATM6_A13738TrnCNom[0] ;
         A840TrnCod = P0ATM6_A840TrnCod[0] ;
         n840TrnCod = P0ATM6_n840TrnCod[0] ;
         A841TrnNom = P0ATM6_A841TrnNom[0] ;
         n841TrnNom = P0ATM6_n841TrnNom[0] ;
         A396EmprCod = P0ATM6_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A840TrnCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13738TrnCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ATM7 */
         pr_default.execute(5, new Object[] {AV14EmprCod, Integer.valueOf(AV15AlbRecCod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A44AlbRecCod = P0ATM7_A44AlbRecCod[0] ;
            A396EmprCod = P0ATM7_A396EmprCod[0] ;
            A840TrnCod = P0ATM7_A840TrnCod[0] ;
            n840TrnCod = P0ATM7_n840TrnCod[0] ;
            AV16SelectedValue = ((0==A840TrnCod) ? "" : GXutil.trim( GXutil.str( A840TrnCod, 4, 0))) ;
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
      /* Using cursor P0ATM8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A13820ProceNomID = P0ATM8_A13820ProceNomID[0] ;
         A970ProceCod = P0ATM8_A970ProceCod[0] ;
         n970ProceCod = P0ATM8_n970ProceCod[0] ;
         A971ProceNom = P0ATM8_A971ProceNom[0] ;
         n971ProceNom = P0ATM8_n971ProceNom[0] ;
         A396EmprCod = P0ATM8_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13820ProceNomID );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ATM9 */
         pr_default.execute(7, new Object[] {AV14EmprCod, Integer.valueOf(AV15AlbRecCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A44AlbRecCod = P0ATM9_A44AlbRecCod[0] ;
            A396EmprCod = P0ATM9_A396EmprCod[0] ;
            A970ProceCod = P0ATM9_A970ProceCod[0] ;
            n970ProceCod = P0ATM9_n970ProceCod[0] ;
            AV16SelectedValue = ((0==A970ProceCod) ? "" : GXutil.trim( GXutil.str( A970ProceCod, 4, 0))) ;
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
      /* Using cursor P0ATM10 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A10045CliAct = P0ATM10_A10045CliAct[0] ;
         A13735CliCNom = P0ATM10_A13735CliCNom[0] ;
         A252CliCod = P0ATM10_A252CliCod[0] ;
         A279CliNom = P0ATM10_A279CliNom[0] ;
         A396EmprCod = P0ATM10_A396EmprCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ATM11 */
         pr_default.execute(9, new Object[] {AV14EmprCod, Integer.valueOf(AV15AlbRecCod)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A44AlbRecCod = P0ATM11_A44AlbRecCod[0] ;
            A396EmprCod = P0ATM11_A396EmprCod[0] ;
            A252CliCod = P0ATM11_A252CliCod[0] ;
            AV16SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
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
      /* Using cursor P0ATM12 */
      pr_default.execute(10, new Object[] {AV14EmprCod, Integer.valueOf(AV19CliCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A14295ArtActivo = P0ATM12_A14295ArtActivo[0] ;
         A252CliCod = P0ATM12_A252CliCod[0] ;
         A396EmprCod = P0ATM12_A396EmprCod[0] ;
         A69ArtDsc = P0ATM12_A69ArtDsc[0] ;
         n69ArtDsc = P0ATM12_n69ArtDsc[0] ;
         A65ArtCod = P0ATM12_A65ArtCod[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A65ArtCod)+"-"+GXutil.trim( A69ArtDsc) );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(10);
      }
      pr_default.close(10);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV13TrnMode, "INS") != 0 )
      {
         /* Using cursor P0ATM13 */
         pr_default.execute(11, new Object[] {AV14EmprCod, Integer.valueOf(AV15AlbRecCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A44AlbRecCod = P0ATM13_A44AlbRecCod[0] ;
            A396EmprCod = P0ATM13_A396EmprCod[0] ;
            A45AlbRef = P0ATM13_A45AlbRef[0] ;
            AV16SelectedValue = A45AlbRef ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(11);
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = ttrn22loaddvcombo.this.AV16SelectedValue;
      this.aP5[0] = ttrn22loaddvcombo.this.AV10Combo_Data;
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
      P0ATM2_A13822AlmNomID = new String[] {""} ;
      P0ATM2_A4793AlmNom = new String[] {""} ;
      P0ATM2_n4793AlmNom = new boolean[] {false} ;
      P0ATM2_A4792AlmCod = new byte[1] ;
      P0ATM2_n4792AlmCod = new boolean[] {false} ;
      P0ATM2_A396EmprCod = new String[] {""} ;
      A13822AlmNomID = "" ;
      A4793AlmNom = "" ;
      A396EmprCod = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P0ATM3_A44AlbRecCod = new int[1] ;
      P0ATM3_A396EmprCod = new String[] {""} ;
      P0ATM3_A4792AlmCod = new byte[1] ;
      P0ATM3_n4792AlmCod = new boolean[] {false} ;
      P0ATM4_A396EmprCod = new String[] {""} ;
      P0ATM4_A1212TipEntNom = new String[] {""} ;
      P0ATM4_n1212TipEntNom = new boolean[] {false} ;
      P0ATM4_A1211TipEntCod = new short[1] ;
      P0ATM4_n1211TipEntCod = new boolean[] {false} ;
      A1212TipEntNom = "" ;
      A13821TipEntNomI = "" ;
      P0ATM5_A44AlbRecCod = new int[1] ;
      P0ATM5_A396EmprCod = new String[] {""} ;
      P0ATM5_A1211TipEntCod = new short[1] ;
      P0ATM5_n1211TipEntCod = new boolean[] {false} ;
      P0ATM6_A13738TrnCNom = new String[] {""} ;
      P0ATM6_A840TrnCod = new short[1] ;
      P0ATM6_n840TrnCod = new boolean[] {false} ;
      P0ATM6_A841TrnNom = new String[] {""} ;
      P0ATM6_n841TrnNom = new boolean[] {false} ;
      P0ATM6_A396EmprCod = new String[] {""} ;
      A13738TrnCNom = "" ;
      A841TrnNom = "" ;
      P0ATM7_A44AlbRecCod = new int[1] ;
      P0ATM7_A396EmprCod = new String[] {""} ;
      P0ATM7_A840TrnCod = new short[1] ;
      P0ATM7_n840TrnCod = new boolean[] {false} ;
      P0ATM8_A13820ProceNomID = new String[] {""} ;
      P0ATM8_A970ProceCod = new short[1] ;
      P0ATM8_n970ProceCod = new boolean[] {false} ;
      P0ATM8_A971ProceNom = new String[] {""} ;
      P0ATM8_n971ProceNom = new boolean[] {false} ;
      P0ATM8_A396EmprCod = new String[] {""} ;
      A13820ProceNomID = "" ;
      A971ProceNom = "" ;
      P0ATM9_A44AlbRecCod = new int[1] ;
      P0ATM9_A396EmprCod = new String[] {""} ;
      P0ATM9_A970ProceCod = new short[1] ;
      P0ATM9_n970ProceCod = new boolean[] {false} ;
      P0ATM10_A10045CliAct = new String[] {""} ;
      P0ATM10_A13735CliCNom = new String[] {""} ;
      P0ATM10_A252CliCod = new int[1] ;
      P0ATM10_A279CliNom = new String[] {""} ;
      P0ATM10_A396EmprCod = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      P0ATM11_A44AlbRecCod = new int[1] ;
      P0ATM11_A396EmprCod = new String[] {""} ;
      P0ATM11_A252CliCod = new int[1] ;
      AV20WebSession = httpContext.getWebSession();
      P0ATM12_A14295ArtActivo = new String[] {""} ;
      P0ATM12_A252CliCod = new int[1] ;
      P0ATM12_A396EmprCod = new String[] {""} ;
      P0ATM12_A69ArtDsc = new String[] {""} ;
      P0ATM12_n69ArtDsc = new boolean[] {false} ;
      P0ATM12_A65ArtCod = new String[] {""} ;
      A14295ArtActivo = "" ;
      A69ArtDsc = "" ;
      A65ArtCod = "" ;
      P0ATM13_A44AlbRecCod = new int[1] ;
      P0ATM13_A396EmprCod = new String[] {""} ;
      P0ATM13_A45AlbRef = new String[] {""} ;
      A45AlbRef = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn22loaddvcombo__default(),
         new Object[] {
             new Object[] {
            P0ATM2_A13822AlmNomID, P0ATM2_A4793AlmNom, P0ATM2_n4793AlmNom, P0ATM2_A4792AlmCod, P0ATM2_A396EmprCod
            }
            , new Object[] {
            P0ATM3_A44AlbRecCod, P0ATM3_A396EmprCod, P0ATM3_A4792AlmCod, P0ATM3_n4792AlmCod
            }
            , new Object[] {
            P0ATM4_A396EmprCod, P0ATM4_A1212TipEntNom, P0ATM4_n1212TipEntNom, P0ATM4_A1211TipEntCod
            }
            , new Object[] {
            P0ATM5_A44AlbRecCod, P0ATM5_A396EmprCod, P0ATM5_A1211TipEntCod, P0ATM5_n1211TipEntCod
            }
            , new Object[] {
            P0ATM6_A13738TrnCNom, P0ATM6_A840TrnCod, P0ATM6_A841TrnNom, P0ATM6_n841TrnNom, P0ATM6_A396EmprCod
            }
            , new Object[] {
            P0ATM7_A44AlbRecCod, P0ATM7_A396EmprCod, P0ATM7_A840TrnCod, P0ATM7_n840TrnCod
            }
            , new Object[] {
            P0ATM8_A13820ProceNomID, P0ATM8_A970ProceCod, P0ATM8_A971ProceNom, P0ATM8_n971ProceNom, P0ATM8_A396EmprCod
            }
            , new Object[] {
            P0ATM9_A44AlbRecCod, P0ATM9_A396EmprCod, P0ATM9_A970ProceCod, P0ATM9_n970ProceCod
            }
            , new Object[] {
            P0ATM10_A10045CliAct, P0ATM10_A13735CliCNom, P0ATM10_A252CliCod, P0ATM10_A279CliNom, P0ATM10_A396EmprCod
            }
            , new Object[] {
            P0ATM11_A44AlbRecCod, P0ATM11_A396EmprCod, P0ATM11_A252CliCod
            }
            , new Object[] {
            P0ATM12_A14295ArtActivo, P0ATM12_A252CliCod, P0ATM12_A396EmprCod, P0ATM12_A69ArtDsc, P0ATM12_n69ArtDsc, P0ATM12_A65ArtCod
            }
            , new Object[] {
            P0ATM13_A44AlbRecCod, P0ATM13_A396EmprCod, P0ATM13_A45AlbRef
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
   private short Gx_err ;
   private int AV15AlbRecCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV19CliCod ;
   private String AV13TrnMode ;
   private String AV14EmprCod ;
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
   private String AV12ComboName ;
   private String AV16SelectedValue ;
   private String A13822AlmNomID ;
   private String A13821TipEntNomI ;
   private String A13738TrnCNom ;
   private String A13820ProceNomID ;
   private String A13735CliCNom ;
   private com.genexus.webpanels.WebSession AV20WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATM2_A13822AlmNomID ;
   private String[] P0ATM2_A4793AlmNom ;
   private boolean[] P0ATM2_n4793AlmNom ;
   private byte[] P0ATM2_A4792AlmCod ;
   private boolean[] P0ATM2_n4792AlmCod ;
   private String[] P0ATM2_A396EmprCod ;
   private int[] P0ATM3_A44AlbRecCod ;
   private String[] P0ATM3_A396EmprCod ;
   private byte[] P0ATM3_A4792AlmCod ;
   private boolean[] P0ATM3_n4792AlmCod ;
   private String[] P0ATM4_A396EmprCod ;
   private String[] P0ATM4_A1212TipEntNom ;
   private boolean[] P0ATM4_n1212TipEntNom ;
   private short[] P0ATM4_A1211TipEntCod ;
   private boolean[] P0ATM4_n1211TipEntCod ;
   private int[] P0ATM5_A44AlbRecCod ;
   private String[] P0ATM5_A396EmprCod ;
   private short[] P0ATM5_A1211TipEntCod ;
   private boolean[] P0ATM5_n1211TipEntCod ;
   private String[] P0ATM6_A13738TrnCNom ;
   private short[] P0ATM6_A840TrnCod ;
   private boolean[] P0ATM6_n840TrnCod ;
   private String[] P0ATM6_A841TrnNom ;
   private boolean[] P0ATM6_n841TrnNom ;
   private String[] P0ATM6_A396EmprCod ;
   private int[] P0ATM7_A44AlbRecCod ;
   private String[] P0ATM7_A396EmprCod ;
   private short[] P0ATM7_A840TrnCod ;
   private boolean[] P0ATM7_n840TrnCod ;
   private String[] P0ATM8_A13820ProceNomID ;
   private short[] P0ATM8_A970ProceCod ;
   private boolean[] P0ATM8_n970ProceCod ;
   private String[] P0ATM8_A971ProceNom ;
   private boolean[] P0ATM8_n971ProceNom ;
   private String[] P0ATM8_A396EmprCod ;
   private int[] P0ATM9_A44AlbRecCod ;
   private String[] P0ATM9_A396EmprCod ;
   private short[] P0ATM9_A970ProceCod ;
   private boolean[] P0ATM9_n970ProceCod ;
   private String[] P0ATM10_A10045CliAct ;
   private String[] P0ATM10_A13735CliCNom ;
   private int[] P0ATM10_A252CliCod ;
   private String[] P0ATM10_A279CliNom ;
   private String[] P0ATM10_A396EmprCod ;
   private int[] P0ATM11_A44AlbRecCod ;
   private String[] P0ATM11_A396EmprCod ;
   private int[] P0ATM11_A252CliCod ;
   private String[] P0ATM12_A14295ArtActivo ;
   private int[] P0ATM12_A252CliCod ;
   private String[] P0ATM12_A396EmprCod ;
   private String[] P0ATM12_A69ArtDsc ;
   private boolean[] P0ATM12_n69ArtDsc ;
   private String[] P0ATM12_A65ArtCod ;
   private int[] P0ATM13_A44AlbRecCod ;
   private String[] P0ATM13_A396EmprCod ;
   private String[] P0ATM13_A45AlbRef ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class ttrn22loaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATM2", "SELECT RTRIM(LTRIM(COALESCE( AlmNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(AlmCod,'90'), 2))) || ')' AS AlmNomID, AlmNom, AlmCod, EmprCod FROM TXPAlmace ORDER BY AlmNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATM3", "SELECT AlbRecCod, EmprCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATM4", "SELECT EmprCod, TipEntNom, TipEntCod FROM TXPENTRAD WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATM5", "SELECT AlbRecCod, EmprCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATM6", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, TrnCod, TrnNom, EmprCod FROM TXPTRANSP ORDER BY TrnCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATM7", "SELECT AlbRecCod, EmprCod, TrnCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATM8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ProceCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ProceNom, ''))) AS ProceNomID, ProceCod, ProceNom, EmprCod FROM TXPPROCED ORDER BY ProceNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATM9", "SELECT AlbRecCod, EmprCod, ProceCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATM10", "SELECT CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATM11", "SELECT AlbRecCod, EmprCod, CliCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ATM12", "SELECT ArtActivo, CliCod, EmprCod, ArtDsc, ArtCod FROM TXPARTICU WHERE (EmprCod = ? and CliCod = ?) AND (ArtActivo = 'S') ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ATM13", "SELECT AlbRecCod, EmprCod, AlbRef FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

