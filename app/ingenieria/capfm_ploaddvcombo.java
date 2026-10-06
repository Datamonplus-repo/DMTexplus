package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class capfm_ploaddvcombo extends GXProcedure
{
   public capfm_ploaddvcombo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( capfm_ploaddvcombo.class ), "" );
   }

   public capfm_ploaddvcombo( int remoteHandle ,
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
                                                                                    String aP6 ,
                                                                                    String aP7 ,
                                                                                    String[] aP8 )
   {
      capfm_ploaddvcombo.this.aP9 = new GXBaseCollection[] {new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
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
                             String aP6 ,
                             String aP7 ,
                             String[] aP8 ,
                             GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 )
   {
      capfm_ploaddvcombo.this.AV13ComboName = aP0;
      capfm_ploaddvcombo.this.AV15TrnMode = aP1;
      capfm_ploaddvcombo.this.AV17EmprCod = aP2;
      capfm_ploaddvcombo.this.AV18CliCod = aP3;
      capfm_ploaddvcombo.this.AV19ArtCod = aP4;
      capfm_ploaddvcombo.this.AV20ProCod = aP5;
      capfm_ploaddvcombo.this.AV21FasCodM = aP6;
      capfm_ploaddvcombo.this.AV22MaqCodC = aP7;
      capfm_ploaddvcombo.this.aP8 = aP8;
      capfm_ploaddvcombo.this.aP9 = aP9;
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
      if ( GXutil.strcmp(AV13ComboName, "ParFasCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PARFASCOD' */
         S111 ();
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
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "ArtCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_ARTCOD' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "ProCod") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_PROCOD' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "FasCodM") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_FASCODM' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV13ComboName, "MaqCodC") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMBOITEMS_MAQCODC' */
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
      /* 'LOADCOMBOITEMS_PARFASCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09RH2 */
      pr_default.execute(0, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09RH2_A396EmprCod[0] ;
         A1664ParFasCod = P09RH2_A1664ParFasCod[0] ;
         A1665ParFasDsc = P09RH2_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P09RH2_n1665ParFasDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( A1664ParFasCod, 4, 0) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A1664ParFasCod, 4, 0)), GXutil.trim( A1665ParFasDsc), "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10Combo_Data.sort("Title");
   }

   public void S121( )
   {
      /* 'LOADCOMBOITEMS_CLICOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09RH3 */
      pr_default.execute(1, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P09RH3_A396EmprCod[0] ;
         A252CliCod = P09RH3_A252CliCod[0] ;
         A279CliNom = P09RH3_A279CliNom[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( A252CliCod, 6, 0) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), GXutil.trim( A279CliNom), "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09RH4 */
         pr_default.execute(2, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ArtCod, AV20ProCod, AV21FasCodM, AV22MaqCodC});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9830MaqCodC = P09RH4_A9830MaqCodC[0] ;
            A9836FasCodM = P09RH4_A9836FasCodM[0] ;
            A758ProCod = P09RH4_A758ProCod[0] ;
            A65ArtCod = P09RH4_A65ArtCod[0] ;
            A252CliCod = P09RH4_A252CliCod[0] ;
            A396EmprCod = P09RH4_A396EmprCod[0] ;
            AV12SelectedValue = ((0==A252CliCod) ? "" : GXutil.trim( GXutil.str( A252CliCod, 6, 0))) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      else
      {
         if ( ! (0==AV18CliCod) )
         {
            AV12SelectedValue = GXutil.trim( GXutil.str( AV18CliCod, 6, 0)) ;
         }
      }
   }

   public void S131( )
   {
      /* 'LOADCOMBOITEMS_ARTCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09RH5 */
      pr_default.execute(3, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = P09RH5_A252CliCod[0] ;
         A396EmprCod = P09RH5_A396EmprCod[0] ;
         A65ArtCod = P09RH5_A65ArtCod[0] ;
         A69ArtDsc = P09RH5_A69ArtDsc[0] ;
         n69ArtDsc = P09RH5_n69ArtDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A65ArtCod), GXutil.trim( A69ArtDsc), "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09RH6 */
         pr_default.execute(4, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ArtCod, AV20ProCod, AV21FasCodM, AV22MaqCodC});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A9830MaqCodC = P09RH6_A9830MaqCodC[0] ;
            A9836FasCodM = P09RH6_A9836FasCodM[0] ;
            A758ProCod = P09RH6_A758ProCod[0] ;
            A65ArtCod = P09RH6_A65ArtCod[0] ;
            A252CliCod = P09RH6_A252CliCod[0] ;
            A396EmprCod = P09RH6_A396EmprCod[0] ;
            AV12SelectedValue = A65ArtCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19ArtCod)==0) )
         {
            AV12SelectedValue = AV19ArtCod ;
         }
      }
   }

   public void S141( )
   {
      /* 'LOADCOMBOITEMS_PROCOD' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09RH7 */
      pr_default.execute(5, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = P09RH7_A396EmprCod[0] ;
         A758ProCod = P09RH7_A758ProCod[0] ;
         A759ProDsc = P09RH7_A759ProDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A758ProCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A758ProCod), GXutil.trim( A759ProDsc), "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09RH8 */
         pr_default.execute(6, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ArtCod, AV20ProCod, AV21FasCodM, AV22MaqCodC});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A9830MaqCodC = P09RH8_A9830MaqCodC[0] ;
            A9836FasCodM = P09RH8_A9836FasCodM[0] ;
            A758ProCod = P09RH8_A758ProCod[0] ;
            A65ArtCod = P09RH8_A65ArtCod[0] ;
            A252CliCod = P09RH8_A252CliCod[0] ;
            A396EmprCod = P09RH8_A396EmprCod[0] ;
            AV12SelectedValue = A758ProCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV20ProCod)==0) )
         {
            AV12SelectedValue = AV20ProCod ;
         }
      }
   }

   public void S151( )
   {
      /* 'LOADCOMBOITEMS_FASCODM' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09RH9 */
      pr_default.execute(7, new Object[] {AV17EmprCod, AV20ProCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A758ProCod = P09RH9_A758ProCod[0] ;
         A396EmprCod = P09RH9_A396EmprCod[0] ;
         A457FasCod = P09RH9_A457FasCod[0] ;
         A460FasDsc = P09RH9_A460FasDsc[0] ;
         A774ProNumLin = P09RH9_A774ProNumLin[0] ;
         A460FasDsc = P09RH9_A460FasDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A457FasCod), GXutil.trim( A460FasDsc), "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09RH10 */
         pr_default.execute(8, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ArtCod, AV20ProCod, AV21FasCodM, AV22MaqCodC});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A9830MaqCodC = P09RH10_A9830MaqCodC[0] ;
            A9836FasCodM = P09RH10_A9836FasCodM[0] ;
            A758ProCod = P09RH10_A758ProCod[0] ;
            A65ArtCod = P09RH10_A65ArtCod[0] ;
            A252CliCod = P09RH10_A252CliCod[0] ;
            A396EmprCod = P09RH10_A396EmprCod[0] ;
            AV12SelectedValue = A9836FasCodM ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21FasCodM)==0) )
         {
            AV12SelectedValue = AV21FasCodM ;
         }
      }
   }

   public void S161( )
   {
      /* 'LOADCOMBOITEMS_MAQCODC' Routine */
      returnInSub = false ;
      AV10Combo_Data.clear();
      /* Using cursor P09RH11 */
      pr_default.execute(9, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A396EmprCod = P09RH11_A396EmprCod[0] ;
         A602MaqCod = P09RH11_A602MaqCod[0] ;
         A606MaqDsc = P09RH11_A606MaqDsc[0] ;
         n606MaqDsc = P09RH11_n606MaqDsc[0] ;
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), GXutil.trim( A606MaqDsc), "", "", "", "", "", "", "") );
         AV10Combo_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      AV10Combo_Data.sort("Title");
      if ( GXutil.strcmp(AV15TrnMode, "INS") != 0 )
      {
         /* Using cursor P09RH12 */
         pr_default.execute(10, new Object[] {AV17EmprCod, Integer.valueOf(AV18CliCod), AV19ArtCod, AV20ProCod, AV21FasCodM, AV22MaqCodC});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A9830MaqCodC = P09RH12_A9830MaqCodC[0] ;
            A9836FasCodM = P09RH12_A9836FasCodM[0] ;
            A758ProCod = P09RH12_A758ProCod[0] ;
            A65ArtCod = P09RH12_A65ArtCod[0] ;
            A252CliCod = P09RH12_A252CliCod[0] ;
            A396EmprCod = P09RH12_A396EmprCod[0] ;
            AV12SelectedValue = A9830MaqCodC ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(10);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV22MaqCodC)==0) )
         {
            AV12SelectedValue = AV22MaqCodC ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP8[0] = capfm_ploaddvcombo.this.AV12SelectedValue;
      this.aP9[0] = capfm_ploaddvcombo.this.AV10Combo_Data;
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
      P09RH2_A396EmprCod = new String[] {""} ;
      P09RH2_A1664ParFasCod = new short[1] ;
      P09RH2_A1665ParFasDsc = new String[] {""} ;
      P09RH2_n1665ParFasDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A1665ParFasDsc = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      P09RH3_A396EmprCod = new String[] {""} ;
      P09RH3_A252CliCod = new int[1] ;
      P09RH3_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      P09RH4_A9830MaqCodC = new String[] {""} ;
      P09RH4_A9836FasCodM = new String[] {""} ;
      P09RH4_A758ProCod = new String[] {""} ;
      P09RH4_A65ArtCod = new String[] {""} ;
      P09RH4_A252CliCod = new int[1] ;
      P09RH4_A396EmprCod = new String[] {""} ;
      A9830MaqCodC = "" ;
      A9836FasCodM = "" ;
      A758ProCod = "" ;
      A65ArtCod = "" ;
      P09RH5_A252CliCod = new int[1] ;
      P09RH5_A396EmprCod = new String[] {""} ;
      P09RH5_A65ArtCod = new String[] {""} ;
      P09RH5_A69ArtDsc = new String[] {""} ;
      P09RH5_n69ArtDsc = new boolean[] {false} ;
      A69ArtDsc = "" ;
      P09RH6_A9830MaqCodC = new String[] {""} ;
      P09RH6_A9836FasCodM = new String[] {""} ;
      P09RH6_A758ProCod = new String[] {""} ;
      P09RH6_A65ArtCod = new String[] {""} ;
      P09RH6_A252CliCod = new int[1] ;
      P09RH6_A396EmprCod = new String[] {""} ;
      P09RH7_A396EmprCod = new String[] {""} ;
      P09RH7_A758ProCod = new String[] {""} ;
      P09RH7_A759ProDsc = new String[] {""} ;
      A759ProDsc = "" ;
      P09RH8_A9830MaqCodC = new String[] {""} ;
      P09RH8_A9836FasCodM = new String[] {""} ;
      P09RH8_A758ProCod = new String[] {""} ;
      P09RH8_A65ArtCod = new String[] {""} ;
      P09RH8_A252CliCod = new int[1] ;
      P09RH8_A396EmprCod = new String[] {""} ;
      P09RH9_A758ProCod = new String[] {""} ;
      P09RH9_A396EmprCod = new String[] {""} ;
      P09RH9_A457FasCod = new String[] {""} ;
      P09RH9_A460FasDsc = new String[] {""} ;
      P09RH9_A774ProNumLin = new short[1] ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      P09RH10_A9830MaqCodC = new String[] {""} ;
      P09RH10_A9836FasCodM = new String[] {""} ;
      P09RH10_A758ProCod = new String[] {""} ;
      P09RH10_A65ArtCod = new String[] {""} ;
      P09RH10_A252CliCod = new int[1] ;
      P09RH10_A396EmprCod = new String[] {""} ;
      P09RH11_A396EmprCod = new String[] {""} ;
      P09RH11_A602MaqCod = new String[] {""} ;
      P09RH11_A606MaqDsc = new String[] {""} ;
      P09RH11_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      P09RH12_A9830MaqCodC = new String[] {""} ;
      P09RH12_A9836FasCodM = new String[] {""} ;
      P09RH12_A758ProCod = new String[] {""} ;
      P09RH12_A65ArtCod = new String[] {""} ;
      P09RH12_A252CliCod = new int[1] ;
      P09RH12_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.capfm_ploaddvcombo__default(),
         new Object[] {
             new Object[] {
            P09RH2_A396EmprCod, P09RH2_A1664ParFasCod, P09RH2_A1665ParFasDsc, P09RH2_n1665ParFasDsc
            }
            , new Object[] {
            P09RH3_A396EmprCod, P09RH3_A252CliCod, P09RH3_A279CliNom
            }
            , new Object[] {
            P09RH4_A9830MaqCodC, P09RH4_A9836FasCodM, P09RH4_A758ProCod, P09RH4_A65ArtCod, P09RH4_A252CliCod, P09RH4_A396EmprCod
            }
            , new Object[] {
            P09RH5_A252CliCod, P09RH5_A396EmprCod, P09RH5_A65ArtCod, P09RH5_A69ArtDsc, P09RH5_n69ArtDsc
            }
            , new Object[] {
            P09RH6_A9830MaqCodC, P09RH6_A9836FasCodM, P09RH6_A758ProCod, P09RH6_A65ArtCod, P09RH6_A252CliCod, P09RH6_A396EmprCod
            }
            , new Object[] {
            P09RH7_A396EmprCod, P09RH7_A758ProCod, P09RH7_A759ProDsc
            }
            , new Object[] {
            P09RH8_A9830MaqCodC, P09RH8_A9836FasCodM, P09RH8_A758ProCod, P09RH8_A65ArtCod, P09RH8_A252CliCod, P09RH8_A396EmprCod
            }
            , new Object[] {
            P09RH9_A758ProCod, P09RH9_A396EmprCod, P09RH9_A457FasCod, P09RH9_A460FasDsc, P09RH9_A774ProNumLin
            }
            , new Object[] {
            P09RH10_A9830MaqCodC, P09RH10_A9836FasCodM, P09RH10_A758ProCod, P09RH10_A65ArtCod, P09RH10_A252CliCod, P09RH10_A396EmprCod
            }
            , new Object[] {
            P09RH11_A396EmprCod, P09RH11_A602MaqCod, P09RH11_A606MaqDsc, P09RH11_n606MaqDsc
            }
            , new Object[] {
            P09RH12_A9830MaqCodC, P09RH12_A9836FasCodM, P09RH12_A758ProCod, P09RH12_A65ArtCod, P09RH12_A252CliCod, P09RH12_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1664ParFasCod ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private int AV18CliCod ;
   private int A252CliCod ;
   private String AV15TrnMode ;
   private String AV17EmprCod ;
   private String AV19ArtCod ;
   private String AV20ProCod ;
   private String AV21FasCodM ;
   private String AV22MaqCodC ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A1665ParFasDsc ;
   private String A279CliNom ;
   private String A9830MaqCodC ;
   private String A9836FasCodM ;
   private String A758ProCod ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A759ProDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private boolean returnInSub ;
   private boolean n1665ParFasDsc ;
   private boolean n69ArtDsc ;
   private boolean n606MaqDsc ;
   private String AV13ComboName ;
   private String AV12SelectedValue ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>[] aP9 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P09RH2_A396EmprCod ;
   private short[] P09RH2_A1664ParFasCod ;
   private String[] P09RH2_A1665ParFasDsc ;
   private boolean[] P09RH2_n1665ParFasDsc ;
   private String[] P09RH3_A396EmprCod ;
   private int[] P09RH3_A252CliCod ;
   private String[] P09RH3_A279CliNom ;
   private String[] P09RH4_A9830MaqCodC ;
   private String[] P09RH4_A9836FasCodM ;
   private String[] P09RH4_A758ProCod ;
   private String[] P09RH4_A65ArtCod ;
   private int[] P09RH4_A252CliCod ;
   private String[] P09RH4_A396EmprCod ;
   private int[] P09RH5_A252CliCod ;
   private String[] P09RH5_A396EmprCod ;
   private String[] P09RH5_A65ArtCod ;
   private String[] P09RH5_A69ArtDsc ;
   private boolean[] P09RH5_n69ArtDsc ;
   private String[] P09RH6_A9830MaqCodC ;
   private String[] P09RH6_A9836FasCodM ;
   private String[] P09RH6_A758ProCod ;
   private String[] P09RH6_A65ArtCod ;
   private int[] P09RH6_A252CliCod ;
   private String[] P09RH6_A396EmprCod ;
   private String[] P09RH7_A396EmprCod ;
   private String[] P09RH7_A758ProCod ;
   private String[] P09RH7_A759ProDsc ;
   private String[] P09RH8_A9830MaqCodC ;
   private String[] P09RH8_A9836FasCodM ;
   private String[] P09RH8_A758ProCod ;
   private String[] P09RH8_A65ArtCod ;
   private int[] P09RH8_A252CliCod ;
   private String[] P09RH8_A396EmprCod ;
   private String[] P09RH9_A758ProCod ;
   private String[] P09RH9_A396EmprCod ;
   private String[] P09RH9_A457FasCod ;
   private String[] P09RH9_A460FasDsc ;
   private short[] P09RH9_A774ProNumLin ;
   private String[] P09RH10_A9830MaqCodC ;
   private String[] P09RH10_A9836FasCodM ;
   private String[] P09RH10_A758ProCod ;
   private String[] P09RH10_A65ArtCod ;
   private int[] P09RH10_A252CliCod ;
   private String[] P09RH10_A396EmprCod ;
   private String[] P09RH11_A396EmprCod ;
   private String[] P09RH11_A602MaqCod ;
   private String[] P09RH11_A606MaqDsc ;
   private boolean[] P09RH11_n606MaqDsc ;
   private String[] P09RH12_A9830MaqCodC ;
   private String[] P09RH12_A9836FasCodM ;
   private String[] P09RH12_A758ProCod ;
   private String[] P09RH12_A65ArtCod ;
   private int[] P09RH12_A252CliCod ;
   private String[] P09RH12_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10Combo_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
}

final  class capfm_ploaddvcombo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RH2", "SELECT EmprCod, ParFasCod, ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RH3", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RH4", "SELECT MaqCodC, FasCodM, ProCod, ArtCod, CliCod, EmprCod FROM TXPCAPFM1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09RH5", "SELECT CliCod, EmprCod, ArtCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RH6", "SELECT MaqCodC, FasCodM, ProCod, ArtCod, CliCod, EmprCod FROM TXPCAPFM1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09RH7", "SELECT EmprCod, ProCod, ProDsc FROM TXPPROCES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RH8", "SELECT MaqCodC, FasCodM, ProCod, ArtCod, CliCod, EmprCod FROM TXPCAPFM1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09RH9", "SELECT T1.ProCod, T1.EmprCod, T1.FasCod, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RH10", "SELECT MaqCodC, FasCodM, ProCod, ArtCod, CliCod, EmprCod FROM TXPCAPFM1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09RH11", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RH12", "SELECT MaqCodC, FasCodM, ProCod, ArtCod, CliCod, EmprCod FROM TXPCAPFM1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
      }
   }

}

