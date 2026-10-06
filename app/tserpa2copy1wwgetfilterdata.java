package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tserpa2copy1wwgetfilterdata extends GXProcedure
{
   public tserpa2copy1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tserpa2copy1wwgetfilterdata.class ), "" );
   }

   public tserpa2copy1wwgetfilterdata( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      tserpa2copy1wwgetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      tserpa2copy1wwgetfilterdata.this.AV28DDOName = aP0;
      tserpa2copy1wwgetfilterdata.this.AV26SearchTxt = aP1;
      tserpa2copy1wwgetfilterdata.this.AV27SearchTxtTo = aP2;
      tserpa2copy1wwgetfilterdata.this.aP3 = aP3;
      tserpa2copy1wwgetfilterdata.this.aP4 = aP4;
      tserpa2copy1wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADARTCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADARTDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("TSERPA2Copy1WWGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TSERPA2Copy1WWGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("TSERPA2Copy1WWGridState"), null, null);
      }
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV14TFArtCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV15TFArtCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV16TFArtDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV17TFArtDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV18TFProCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV19TFProCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV20TFProDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV21TFProDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV22TFFasCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV23TFFasCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV24TFFasDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV25TFFasDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV26SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV60Tserpa2copy1wwds_1_filterfulltext = AV55FilterFullText ;
      AV61Tserpa2copy1wwds_2_tfclicod = AV10TFCliCod ;
      AV62Tserpa2copy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV63Tserpa2copy1wwds_4_tfclinom = AV12TFCliNom ;
      AV64Tserpa2copy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV65Tserpa2copy1wwds_6_tfartcod = AV14TFArtCod ;
      AV66Tserpa2copy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV67Tserpa2copy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV68Tserpa2copy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV69Tserpa2copy1wwds_10_tfprocod = AV18TFProCod ;
      AV70Tserpa2copy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Tserpa2copy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV72Tserpa2copy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV73Tserpa2copy1wwds_14_tffascod = AV22TFFasCod ;
      AV74Tserpa2copy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV75Tserpa2copy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV76Tserpa2copy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV60Tserpa2copy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to) ,
                                           AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                           AV63Tserpa2copy1wwds_4_tfclinom ,
                                           AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                           AV65Tserpa2copy1wwds_6_tfartcod ,
                                           AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                           AV67Tserpa2copy1wwds_8_tfartdsc ,
                                           AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                           AV69Tserpa2copy1wwds_10_tfprocod ,
                                           AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                           AV71Tserpa2copy1wwds_12_tfprodsc ,
                                           AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                           AV73Tserpa2copy1wwds_14_tffascod ,
                                           AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                           AV75Tserpa2copy1wwds_16_tffasdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV63Tserpa2copy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV63Tserpa2copy1wwds_4_tfclinom), 30, "%") ;
      lV65Tserpa2copy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV65Tserpa2copy1wwds_6_tfartcod), 16, "%") ;
      lV67Tserpa2copy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV67Tserpa2copy1wwds_8_tfartdsc), 26, "%") ;
      lV69Tserpa2copy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Tserpa2copy1wwds_10_tfprocod), 8, "%") ;
      lV71Tserpa2copy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Tserpa2copy1wwds_12_tfprodsc), 40, "%") ;
      lV73Tserpa2copy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV73Tserpa2copy1wwds_14_tffascod), 8, "%") ;
      lV75Tserpa2copy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV75Tserpa2copy1wwds_16_tffasdsc), 28, "%") ;
      /* Using cursor P08GP2 */
      pr_default.execute(0, new Object[] {lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod), Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to), lV63Tserpa2copy1wwds_4_tfclinom, AV64Tserpa2copy1wwds_5_tfclinom_sel, lV65Tserpa2copy1wwds_6_tfartcod, AV66Tserpa2copy1wwds_7_tfartcod_sel, lV67Tserpa2copy1wwds_8_tfartdsc, AV68Tserpa2copy1wwds_9_tfartdsc_sel, lV69Tserpa2copy1wwds_10_tfprocod, AV70Tserpa2copy1wwds_11_tfprocod_sel, lV71Tserpa2copy1wwds_12_tfprodsc, AV72Tserpa2copy1wwds_13_tfprodsc_sel, lV73Tserpa2copy1wwds_14_tffascod, AV74Tserpa2copy1wwds_15_tffascod_sel, lV75Tserpa2copy1wwds_16_tffasdsc, AV76Tserpa2copy1wwds_17_tffasdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8GP2 = false ;
         A396EmprCod = P08GP2_A396EmprCod[0] ;
         A279CliNom = P08GP2_A279CliNom[0] ;
         A460FasDsc = P08GP2_A460FasDsc[0] ;
         A457FasCod = P08GP2_A457FasCod[0] ;
         A759ProDsc = P08GP2_A759ProDsc[0] ;
         A758ProCod = P08GP2_A758ProCod[0] ;
         A69ArtDsc = P08GP2_A69ArtDsc[0] ;
         n69ArtDsc = P08GP2_n69ArtDsc[0] ;
         A65ArtCod = P08GP2_A65ArtCod[0] ;
         A252CliCod = P08GP2_A252CliCod[0] ;
         A460FasDsc = P08GP2_A460FasDsc[0] ;
         A759ProDsc = P08GP2_A759ProDsc[0] ;
         A279CliNom = P08GP2_A279CliNom[0] ;
         A69ArtDsc = P08GP2_A69ArtDsc[0] ;
         n69ArtDsc = P08GP2_n69ArtDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08GP2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8GP2 = false ;
            A396EmprCod = P08GP2_A396EmprCod[0] ;
            A457FasCod = P08GP2_A457FasCod[0] ;
            A758ProCod = P08GP2_A758ProCod[0] ;
            A65ArtCod = P08GP2_A65ArtCod[0] ;
            A252CliCod = P08GP2_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8GP2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV30Option = A279CliNom ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GP2 )
         {
            brk8GP2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFArtCod = AV26SearchTxt ;
      AV15TFArtCod_Sel = "" ;
      AV60Tserpa2copy1wwds_1_filterfulltext = AV55FilterFullText ;
      AV61Tserpa2copy1wwds_2_tfclicod = AV10TFCliCod ;
      AV62Tserpa2copy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV63Tserpa2copy1wwds_4_tfclinom = AV12TFCliNom ;
      AV64Tserpa2copy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV65Tserpa2copy1wwds_6_tfartcod = AV14TFArtCod ;
      AV66Tserpa2copy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV67Tserpa2copy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV68Tserpa2copy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV69Tserpa2copy1wwds_10_tfprocod = AV18TFProCod ;
      AV70Tserpa2copy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Tserpa2copy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV72Tserpa2copy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV73Tserpa2copy1wwds_14_tffascod = AV22TFFasCod ;
      AV74Tserpa2copy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV75Tserpa2copy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV76Tserpa2copy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV60Tserpa2copy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to) ,
                                           AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                           AV63Tserpa2copy1wwds_4_tfclinom ,
                                           AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                           AV65Tserpa2copy1wwds_6_tfartcod ,
                                           AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                           AV67Tserpa2copy1wwds_8_tfartdsc ,
                                           AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                           AV69Tserpa2copy1wwds_10_tfprocod ,
                                           AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                           AV71Tserpa2copy1wwds_12_tfprodsc ,
                                           AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                           AV73Tserpa2copy1wwds_14_tffascod ,
                                           AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                           AV75Tserpa2copy1wwds_16_tffasdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV63Tserpa2copy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV63Tserpa2copy1wwds_4_tfclinom), 30, "%") ;
      lV65Tserpa2copy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV65Tserpa2copy1wwds_6_tfartcod), 16, "%") ;
      lV67Tserpa2copy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV67Tserpa2copy1wwds_8_tfartdsc), 26, "%") ;
      lV69Tserpa2copy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Tserpa2copy1wwds_10_tfprocod), 8, "%") ;
      lV71Tserpa2copy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Tserpa2copy1wwds_12_tfprodsc), 40, "%") ;
      lV73Tserpa2copy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV73Tserpa2copy1wwds_14_tffascod), 8, "%") ;
      lV75Tserpa2copy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV75Tserpa2copy1wwds_16_tffasdsc), 28, "%") ;
      /* Using cursor P08GP3 */
      pr_default.execute(1, new Object[] {lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod), Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to), lV63Tserpa2copy1wwds_4_tfclinom, AV64Tserpa2copy1wwds_5_tfclinom_sel, lV65Tserpa2copy1wwds_6_tfartcod, AV66Tserpa2copy1wwds_7_tfartcod_sel, lV67Tserpa2copy1wwds_8_tfartdsc, AV68Tserpa2copy1wwds_9_tfartdsc_sel, lV69Tserpa2copy1wwds_10_tfprocod, AV70Tserpa2copy1wwds_11_tfprocod_sel, lV71Tserpa2copy1wwds_12_tfprodsc, AV72Tserpa2copy1wwds_13_tfprodsc_sel, lV73Tserpa2copy1wwds_14_tffascod, AV74Tserpa2copy1wwds_15_tffascod_sel, lV75Tserpa2copy1wwds_16_tffasdsc, AV76Tserpa2copy1wwds_17_tffasdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8GP4 = false ;
         A396EmprCod = P08GP3_A396EmprCod[0] ;
         A65ArtCod = P08GP3_A65ArtCod[0] ;
         A460FasDsc = P08GP3_A460FasDsc[0] ;
         A457FasCod = P08GP3_A457FasCod[0] ;
         A759ProDsc = P08GP3_A759ProDsc[0] ;
         A758ProCod = P08GP3_A758ProCod[0] ;
         A69ArtDsc = P08GP3_A69ArtDsc[0] ;
         n69ArtDsc = P08GP3_n69ArtDsc[0] ;
         A279CliNom = P08GP3_A279CliNom[0] ;
         A252CliCod = P08GP3_A252CliCod[0] ;
         A460FasDsc = P08GP3_A460FasDsc[0] ;
         A759ProDsc = P08GP3_A759ProDsc[0] ;
         A279CliNom = P08GP3_A279CliNom[0] ;
         A69ArtDsc = P08GP3_A69ArtDsc[0] ;
         n69ArtDsc = P08GP3_n69ArtDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08GP3_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brk8GP4 = false ;
            A396EmprCod = P08GP3_A396EmprCod[0] ;
            A457FasCod = P08GP3_A457FasCod[0] ;
            A758ProCod = P08GP3_A758ProCod[0] ;
            A252CliCod = P08GP3_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8GP4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV30Option = A65ArtCod ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GP4 )
         {
            brk8GP4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFArtDsc = AV26SearchTxt ;
      AV17TFArtDsc_Sel = "" ;
      AV60Tserpa2copy1wwds_1_filterfulltext = AV55FilterFullText ;
      AV61Tserpa2copy1wwds_2_tfclicod = AV10TFCliCod ;
      AV62Tserpa2copy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV63Tserpa2copy1wwds_4_tfclinom = AV12TFCliNom ;
      AV64Tserpa2copy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV65Tserpa2copy1wwds_6_tfartcod = AV14TFArtCod ;
      AV66Tserpa2copy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV67Tserpa2copy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV68Tserpa2copy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV69Tserpa2copy1wwds_10_tfprocod = AV18TFProCod ;
      AV70Tserpa2copy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Tserpa2copy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV72Tserpa2copy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV73Tserpa2copy1wwds_14_tffascod = AV22TFFasCod ;
      AV74Tserpa2copy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV75Tserpa2copy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV76Tserpa2copy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV60Tserpa2copy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to) ,
                                           AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                           AV63Tserpa2copy1wwds_4_tfclinom ,
                                           AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                           AV65Tserpa2copy1wwds_6_tfartcod ,
                                           AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                           AV67Tserpa2copy1wwds_8_tfartdsc ,
                                           AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                           AV69Tserpa2copy1wwds_10_tfprocod ,
                                           AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                           AV71Tserpa2copy1wwds_12_tfprodsc ,
                                           AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                           AV73Tserpa2copy1wwds_14_tffascod ,
                                           AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                           AV75Tserpa2copy1wwds_16_tffasdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV63Tserpa2copy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV63Tserpa2copy1wwds_4_tfclinom), 30, "%") ;
      lV65Tserpa2copy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV65Tserpa2copy1wwds_6_tfartcod), 16, "%") ;
      lV67Tserpa2copy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV67Tserpa2copy1wwds_8_tfartdsc), 26, "%") ;
      lV69Tserpa2copy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Tserpa2copy1wwds_10_tfprocod), 8, "%") ;
      lV71Tserpa2copy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Tserpa2copy1wwds_12_tfprodsc), 40, "%") ;
      lV73Tserpa2copy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV73Tserpa2copy1wwds_14_tffascod), 8, "%") ;
      lV75Tserpa2copy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV75Tserpa2copy1wwds_16_tffasdsc), 28, "%") ;
      /* Using cursor P08GP4 */
      pr_default.execute(2, new Object[] {lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod), Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to), lV63Tserpa2copy1wwds_4_tfclinom, AV64Tserpa2copy1wwds_5_tfclinom_sel, lV65Tserpa2copy1wwds_6_tfartcod, AV66Tserpa2copy1wwds_7_tfartcod_sel, lV67Tserpa2copy1wwds_8_tfartdsc, AV68Tserpa2copy1wwds_9_tfartdsc_sel, lV69Tserpa2copy1wwds_10_tfprocod, AV70Tserpa2copy1wwds_11_tfprocod_sel, lV71Tserpa2copy1wwds_12_tfprodsc, AV72Tserpa2copy1wwds_13_tfprodsc_sel, lV73Tserpa2copy1wwds_14_tffascod, AV74Tserpa2copy1wwds_15_tffascod_sel, lV75Tserpa2copy1wwds_16_tffasdsc, AV76Tserpa2copy1wwds_17_tffasdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8GP6 = false ;
         A396EmprCod = P08GP4_A396EmprCod[0] ;
         A69ArtDsc = P08GP4_A69ArtDsc[0] ;
         n69ArtDsc = P08GP4_n69ArtDsc[0] ;
         A460FasDsc = P08GP4_A460FasDsc[0] ;
         A457FasCod = P08GP4_A457FasCod[0] ;
         A759ProDsc = P08GP4_A759ProDsc[0] ;
         A758ProCod = P08GP4_A758ProCod[0] ;
         A65ArtCod = P08GP4_A65ArtCod[0] ;
         A279CliNom = P08GP4_A279CliNom[0] ;
         A252CliCod = P08GP4_A252CliCod[0] ;
         A460FasDsc = P08GP4_A460FasDsc[0] ;
         A759ProDsc = P08GP4_A759ProDsc[0] ;
         A279CliNom = P08GP4_A279CliNom[0] ;
         A69ArtDsc = P08GP4_A69ArtDsc[0] ;
         n69ArtDsc = P08GP4_n69ArtDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08GP4_A69ArtDsc[0], A69ArtDsc) == 0 ) )
         {
            brk8GP6 = false ;
            A396EmprCod = P08GP4_A396EmprCod[0] ;
            A457FasCod = P08GP4_A457FasCod[0] ;
            A758ProCod = P08GP4_A758ProCod[0] ;
            A65ArtCod = P08GP4_A65ArtCod[0] ;
            A252CliCod = P08GP4_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8GP6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV30Option = A69ArtDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GP6 )
         {
            brk8GP6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFProCod = AV26SearchTxt ;
      AV19TFProCod_Sel = "" ;
      AV60Tserpa2copy1wwds_1_filterfulltext = AV55FilterFullText ;
      AV61Tserpa2copy1wwds_2_tfclicod = AV10TFCliCod ;
      AV62Tserpa2copy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV63Tserpa2copy1wwds_4_tfclinom = AV12TFCliNom ;
      AV64Tserpa2copy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV65Tserpa2copy1wwds_6_tfartcod = AV14TFArtCod ;
      AV66Tserpa2copy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV67Tserpa2copy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV68Tserpa2copy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV69Tserpa2copy1wwds_10_tfprocod = AV18TFProCod ;
      AV70Tserpa2copy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Tserpa2copy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV72Tserpa2copy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV73Tserpa2copy1wwds_14_tffascod = AV22TFFasCod ;
      AV74Tserpa2copy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV75Tserpa2copy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV76Tserpa2copy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV60Tserpa2copy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to) ,
                                           AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                           AV63Tserpa2copy1wwds_4_tfclinom ,
                                           AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                           AV65Tserpa2copy1wwds_6_tfartcod ,
                                           AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                           AV67Tserpa2copy1wwds_8_tfartdsc ,
                                           AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                           AV69Tserpa2copy1wwds_10_tfprocod ,
                                           AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                           AV71Tserpa2copy1wwds_12_tfprodsc ,
                                           AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                           AV73Tserpa2copy1wwds_14_tffascod ,
                                           AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                           AV75Tserpa2copy1wwds_16_tffasdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV63Tserpa2copy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV63Tserpa2copy1wwds_4_tfclinom), 30, "%") ;
      lV65Tserpa2copy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV65Tserpa2copy1wwds_6_tfartcod), 16, "%") ;
      lV67Tserpa2copy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV67Tserpa2copy1wwds_8_tfartdsc), 26, "%") ;
      lV69Tserpa2copy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Tserpa2copy1wwds_10_tfprocod), 8, "%") ;
      lV71Tserpa2copy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Tserpa2copy1wwds_12_tfprodsc), 40, "%") ;
      lV73Tserpa2copy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV73Tserpa2copy1wwds_14_tffascod), 8, "%") ;
      lV75Tserpa2copy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV75Tserpa2copy1wwds_16_tffasdsc), 28, "%") ;
      /* Using cursor P08GP5 */
      pr_default.execute(3, new Object[] {lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod), Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to), lV63Tserpa2copy1wwds_4_tfclinom, AV64Tserpa2copy1wwds_5_tfclinom_sel, lV65Tserpa2copy1wwds_6_tfartcod, AV66Tserpa2copy1wwds_7_tfartcod_sel, lV67Tserpa2copy1wwds_8_tfartdsc, AV68Tserpa2copy1wwds_9_tfartdsc_sel, lV69Tserpa2copy1wwds_10_tfprocod, AV70Tserpa2copy1wwds_11_tfprocod_sel, lV71Tserpa2copy1wwds_12_tfprodsc, AV72Tserpa2copy1wwds_13_tfprodsc_sel, lV73Tserpa2copy1wwds_14_tffascod, AV74Tserpa2copy1wwds_15_tffascod_sel, lV75Tserpa2copy1wwds_16_tffasdsc, AV76Tserpa2copy1wwds_17_tffasdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8GP8 = false ;
         A396EmprCod = P08GP5_A396EmprCod[0] ;
         A758ProCod = P08GP5_A758ProCod[0] ;
         A460FasDsc = P08GP5_A460FasDsc[0] ;
         A457FasCod = P08GP5_A457FasCod[0] ;
         A759ProDsc = P08GP5_A759ProDsc[0] ;
         A69ArtDsc = P08GP5_A69ArtDsc[0] ;
         n69ArtDsc = P08GP5_n69ArtDsc[0] ;
         A65ArtCod = P08GP5_A65ArtCod[0] ;
         A279CliNom = P08GP5_A279CliNom[0] ;
         A252CliCod = P08GP5_A252CliCod[0] ;
         A759ProDsc = P08GP5_A759ProDsc[0] ;
         A460FasDsc = P08GP5_A460FasDsc[0] ;
         A279CliNom = P08GP5_A279CliNom[0] ;
         A69ArtDsc = P08GP5_A69ArtDsc[0] ;
         n69ArtDsc = P08GP5_n69ArtDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08GP5_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brk8GP8 = false ;
            A396EmprCod = P08GP5_A396EmprCod[0] ;
            A457FasCod = P08GP5_A457FasCod[0] ;
            A65ArtCod = P08GP5_A65ArtCod[0] ;
            A252CliCod = P08GP5_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8GP8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV30Option = A758ProCod ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GP8 )
         {
            brk8GP8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFProDsc = AV26SearchTxt ;
      AV21TFProDsc_Sel = "" ;
      AV60Tserpa2copy1wwds_1_filterfulltext = AV55FilterFullText ;
      AV61Tserpa2copy1wwds_2_tfclicod = AV10TFCliCod ;
      AV62Tserpa2copy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV63Tserpa2copy1wwds_4_tfclinom = AV12TFCliNom ;
      AV64Tserpa2copy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV65Tserpa2copy1wwds_6_tfartcod = AV14TFArtCod ;
      AV66Tserpa2copy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV67Tserpa2copy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV68Tserpa2copy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV69Tserpa2copy1wwds_10_tfprocod = AV18TFProCod ;
      AV70Tserpa2copy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Tserpa2copy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV72Tserpa2copy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV73Tserpa2copy1wwds_14_tffascod = AV22TFFasCod ;
      AV74Tserpa2copy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV75Tserpa2copy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV76Tserpa2copy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV60Tserpa2copy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to) ,
                                           AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                           AV63Tserpa2copy1wwds_4_tfclinom ,
                                           AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                           AV65Tserpa2copy1wwds_6_tfartcod ,
                                           AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                           AV67Tserpa2copy1wwds_8_tfartdsc ,
                                           AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                           AV69Tserpa2copy1wwds_10_tfprocod ,
                                           AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                           AV71Tserpa2copy1wwds_12_tfprodsc ,
                                           AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                           AV73Tserpa2copy1wwds_14_tffascod ,
                                           AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                           AV75Tserpa2copy1wwds_16_tffasdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV63Tserpa2copy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV63Tserpa2copy1wwds_4_tfclinom), 30, "%") ;
      lV65Tserpa2copy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV65Tserpa2copy1wwds_6_tfartcod), 16, "%") ;
      lV67Tserpa2copy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV67Tserpa2copy1wwds_8_tfartdsc), 26, "%") ;
      lV69Tserpa2copy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Tserpa2copy1wwds_10_tfprocod), 8, "%") ;
      lV71Tserpa2copy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Tserpa2copy1wwds_12_tfprodsc), 40, "%") ;
      lV73Tserpa2copy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV73Tserpa2copy1wwds_14_tffascod), 8, "%") ;
      lV75Tserpa2copy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV75Tserpa2copy1wwds_16_tffasdsc), 28, "%") ;
      /* Using cursor P08GP6 */
      pr_default.execute(4, new Object[] {lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod), Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to), lV63Tserpa2copy1wwds_4_tfclinom, AV64Tserpa2copy1wwds_5_tfclinom_sel, lV65Tserpa2copy1wwds_6_tfartcod, AV66Tserpa2copy1wwds_7_tfartcod_sel, lV67Tserpa2copy1wwds_8_tfartdsc, AV68Tserpa2copy1wwds_9_tfartdsc_sel, lV69Tserpa2copy1wwds_10_tfprocod, AV70Tserpa2copy1wwds_11_tfprocod_sel, lV71Tserpa2copy1wwds_12_tfprodsc, AV72Tserpa2copy1wwds_13_tfprodsc_sel, lV73Tserpa2copy1wwds_14_tffascod, AV74Tserpa2copy1wwds_15_tffascod_sel, lV75Tserpa2copy1wwds_16_tffasdsc, AV76Tserpa2copy1wwds_17_tffasdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8GP10 = false ;
         A396EmprCod = P08GP6_A396EmprCod[0] ;
         A759ProDsc = P08GP6_A759ProDsc[0] ;
         A460FasDsc = P08GP6_A460FasDsc[0] ;
         A457FasCod = P08GP6_A457FasCod[0] ;
         A758ProCod = P08GP6_A758ProCod[0] ;
         A69ArtDsc = P08GP6_A69ArtDsc[0] ;
         n69ArtDsc = P08GP6_n69ArtDsc[0] ;
         A65ArtCod = P08GP6_A65ArtCod[0] ;
         A279CliNom = P08GP6_A279CliNom[0] ;
         A252CliCod = P08GP6_A252CliCod[0] ;
         A460FasDsc = P08GP6_A460FasDsc[0] ;
         A759ProDsc = P08GP6_A759ProDsc[0] ;
         A279CliNom = P08GP6_A279CliNom[0] ;
         A69ArtDsc = P08GP6_A69ArtDsc[0] ;
         n69ArtDsc = P08GP6_n69ArtDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08GP6_A759ProDsc[0], A759ProDsc) == 0 ) )
         {
            brk8GP10 = false ;
            A396EmprCod = P08GP6_A396EmprCod[0] ;
            A457FasCod = P08GP6_A457FasCod[0] ;
            A758ProCod = P08GP6_A758ProCod[0] ;
            A65ArtCod = P08GP6_A65ArtCod[0] ;
            A252CliCod = P08GP6_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8GP10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
         {
            AV30Option = A759ProDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GP10 )
         {
            brk8GP10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV22TFFasCod = AV26SearchTxt ;
      AV23TFFasCod_Sel = "" ;
      AV60Tserpa2copy1wwds_1_filterfulltext = AV55FilterFullText ;
      AV61Tserpa2copy1wwds_2_tfclicod = AV10TFCliCod ;
      AV62Tserpa2copy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV63Tserpa2copy1wwds_4_tfclinom = AV12TFCliNom ;
      AV64Tserpa2copy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV65Tserpa2copy1wwds_6_tfartcod = AV14TFArtCod ;
      AV66Tserpa2copy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV67Tserpa2copy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV68Tserpa2copy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV69Tserpa2copy1wwds_10_tfprocod = AV18TFProCod ;
      AV70Tserpa2copy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Tserpa2copy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV72Tserpa2copy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV73Tserpa2copy1wwds_14_tffascod = AV22TFFasCod ;
      AV74Tserpa2copy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV75Tserpa2copy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV76Tserpa2copy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV60Tserpa2copy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to) ,
                                           AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                           AV63Tserpa2copy1wwds_4_tfclinom ,
                                           AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                           AV65Tserpa2copy1wwds_6_tfartcod ,
                                           AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                           AV67Tserpa2copy1wwds_8_tfartdsc ,
                                           AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                           AV69Tserpa2copy1wwds_10_tfprocod ,
                                           AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                           AV71Tserpa2copy1wwds_12_tfprodsc ,
                                           AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                           AV73Tserpa2copy1wwds_14_tffascod ,
                                           AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                           AV75Tserpa2copy1wwds_16_tffasdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV63Tserpa2copy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV63Tserpa2copy1wwds_4_tfclinom), 30, "%") ;
      lV65Tserpa2copy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV65Tserpa2copy1wwds_6_tfartcod), 16, "%") ;
      lV67Tserpa2copy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV67Tserpa2copy1wwds_8_tfartdsc), 26, "%") ;
      lV69Tserpa2copy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Tserpa2copy1wwds_10_tfprocod), 8, "%") ;
      lV71Tserpa2copy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Tserpa2copy1wwds_12_tfprodsc), 40, "%") ;
      lV73Tserpa2copy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV73Tserpa2copy1wwds_14_tffascod), 8, "%") ;
      lV75Tserpa2copy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV75Tserpa2copy1wwds_16_tffasdsc), 28, "%") ;
      /* Using cursor P08GP7 */
      pr_default.execute(5, new Object[] {lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod), Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to), lV63Tserpa2copy1wwds_4_tfclinom, AV64Tserpa2copy1wwds_5_tfclinom_sel, lV65Tserpa2copy1wwds_6_tfartcod, AV66Tserpa2copy1wwds_7_tfartcod_sel, lV67Tserpa2copy1wwds_8_tfartdsc, AV68Tserpa2copy1wwds_9_tfartdsc_sel, lV69Tserpa2copy1wwds_10_tfprocod, AV70Tserpa2copy1wwds_11_tfprocod_sel, lV71Tserpa2copy1wwds_12_tfprodsc, AV72Tserpa2copy1wwds_13_tfprodsc_sel, lV73Tserpa2copy1wwds_14_tffascod, AV74Tserpa2copy1wwds_15_tffascod_sel, lV75Tserpa2copy1wwds_16_tffasdsc, AV76Tserpa2copy1wwds_17_tffasdsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8GP12 = false ;
         A396EmprCod = P08GP7_A396EmprCod[0] ;
         A457FasCod = P08GP7_A457FasCod[0] ;
         A460FasDsc = P08GP7_A460FasDsc[0] ;
         A759ProDsc = P08GP7_A759ProDsc[0] ;
         A758ProCod = P08GP7_A758ProCod[0] ;
         A69ArtDsc = P08GP7_A69ArtDsc[0] ;
         n69ArtDsc = P08GP7_n69ArtDsc[0] ;
         A65ArtCod = P08GP7_A65ArtCod[0] ;
         A279CliNom = P08GP7_A279CliNom[0] ;
         A252CliCod = P08GP7_A252CliCod[0] ;
         A460FasDsc = P08GP7_A460FasDsc[0] ;
         A759ProDsc = P08GP7_A759ProDsc[0] ;
         A279CliNom = P08GP7_A279CliNom[0] ;
         A69ArtDsc = P08GP7_A69ArtDsc[0] ;
         n69ArtDsc = P08GP7_n69ArtDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08GP7_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk8GP12 = false ;
            A396EmprCod = P08GP7_A396EmprCod[0] ;
            A758ProCod = P08GP7_A758ProCod[0] ;
            A65ArtCod = P08GP7_A65ArtCod[0] ;
            A252CliCod = P08GP7_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8GP12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV30Option = A457FasCod ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV31Options.add(AV30Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GP12 )
         {
            brk8GP12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFFasDsc = AV26SearchTxt ;
      AV25TFFasDsc_Sel = "" ;
      AV60Tserpa2copy1wwds_1_filterfulltext = AV55FilterFullText ;
      AV61Tserpa2copy1wwds_2_tfclicod = AV10TFCliCod ;
      AV62Tserpa2copy1wwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV63Tserpa2copy1wwds_4_tfclinom = AV12TFCliNom ;
      AV64Tserpa2copy1wwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV65Tserpa2copy1wwds_6_tfartcod = AV14TFArtCod ;
      AV66Tserpa2copy1wwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV67Tserpa2copy1wwds_8_tfartdsc = AV16TFArtDsc ;
      AV68Tserpa2copy1wwds_9_tfartdsc_sel = AV17TFArtDsc_Sel ;
      AV69Tserpa2copy1wwds_10_tfprocod = AV18TFProCod ;
      AV70Tserpa2copy1wwds_11_tfprocod_sel = AV19TFProCod_Sel ;
      AV71Tserpa2copy1wwds_12_tfprodsc = AV20TFProDsc ;
      AV72Tserpa2copy1wwds_13_tfprodsc_sel = AV21TFProDsc_Sel ;
      AV73Tserpa2copy1wwds_14_tffascod = AV22TFFasCod ;
      AV74Tserpa2copy1wwds_15_tffascod_sel = AV23TFFasCod_Sel ;
      AV75Tserpa2copy1wwds_16_tffasdsc = AV24TFFasDsc ;
      AV76Tserpa2copy1wwds_17_tffasdsc_sel = AV25TFFasDsc_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV60Tserpa2copy1wwds_1_filterfulltext ,
                                           Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod) ,
                                           Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to) ,
                                           AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                           AV63Tserpa2copy1wwds_4_tfclinom ,
                                           AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                           AV65Tserpa2copy1wwds_6_tfartcod ,
                                           AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                           AV67Tserpa2copy1wwds_8_tfartdsc ,
                                           AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                           AV69Tserpa2copy1wwds_10_tfprocod ,
                                           AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                           AV71Tserpa2copy1wwds_12_tfprodsc ,
                                           AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                           AV73Tserpa2copy1wwds_14_tffascod ,
                                           AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                           AV75Tserpa2copy1wwds_16_tffasdsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV60Tserpa2copy1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV60Tserpa2copy1wwds_1_filterfulltext), "%", "") ;
      lV63Tserpa2copy1wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV63Tserpa2copy1wwds_4_tfclinom), 30, "%") ;
      lV65Tserpa2copy1wwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV65Tserpa2copy1wwds_6_tfartcod), 16, "%") ;
      lV67Tserpa2copy1wwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV67Tserpa2copy1wwds_8_tfartdsc), 26, "%") ;
      lV69Tserpa2copy1wwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV69Tserpa2copy1wwds_10_tfprocod), 8, "%") ;
      lV71Tserpa2copy1wwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV71Tserpa2copy1wwds_12_tfprodsc), 40, "%") ;
      lV73Tserpa2copy1wwds_14_tffascod = GXutil.padr( GXutil.rtrim( AV73Tserpa2copy1wwds_14_tffascod), 8, "%") ;
      lV75Tserpa2copy1wwds_16_tffasdsc = GXutil.padr( GXutil.rtrim( AV75Tserpa2copy1wwds_16_tffasdsc), 28, "%") ;
      /* Using cursor P08GP8 */
      pr_default.execute(6, new Object[] {lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, lV60Tserpa2copy1wwds_1_filterfulltext, Integer.valueOf(AV61Tserpa2copy1wwds_2_tfclicod), Integer.valueOf(AV62Tserpa2copy1wwds_3_tfclicod_to), lV63Tserpa2copy1wwds_4_tfclinom, AV64Tserpa2copy1wwds_5_tfclinom_sel, lV65Tserpa2copy1wwds_6_tfartcod, AV66Tserpa2copy1wwds_7_tfartcod_sel, lV67Tserpa2copy1wwds_8_tfartdsc, AV68Tserpa2copy1wwds_9_tfartdsc_sel, lV69Tserpa2copy1wwds_10_tfprocod, AV70Tserpa2copy1wwds_11_tfprocod_sel, lV71Tserpa2copy1wwds_12_tfprodsc, AV72Tserpa2copy1wwds_13_tfprodsc_sel, lV73Tserpa2copy1wwds_14_tffascod, AV74Tserpa2copy1wwds_15_tffascod_sel, lV75Tserpa2copy1wwds_16_tffasdsc, AV76Tserpa2copy1wwds_17_tffasdsc_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8GP14 = false ;
         A396EmprCod = P08GP8_A396EmprCod[0] ;
         A460FasDsc = P08GP8_A460FasDsc[0] ;
         A457FasCod = P08GP8_A457FasCod[0] ;
         A759ProDsc = P08GP8_A759ProDsc[0] ;
         A758ProCod = P08GP8_A758ProCod[0] ;
         A69ArtDsc = P08GP8_A69ArtDsc[0] ;
         n69ArtDsc = P08GP8_n69ArtDsc[0] ;
         A65ArtCod = P08GP8_A65ArtCod[0] ;
         A279CliNom = P08GP8_A279CliNom[0] ;
         A252CliCod = P08GP8_A252CliCod[0] ;
         A460FasDsc = P08GP8_A460FasDsc[0] ;
         A759ProDsc = P08GP8_A759ProDsc[0] ;
         A279CliNom = P08GP8_A279CliNom[0] ;
         A69ArtDsc = P08GP8_A69ArtDsc[0] ;
         n69ArtDsc = P08GP8_n69ArtDsc[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08GP8_A460FasDsc[0], A460FasDsc) == 0 ) )
         {
            brk8GP14 = false ;
            A396EmprCod = P08GP8_A396EmprCod[0] ;
            A457FasCod = P08GP8_A457FasCod[0] ;
            A758ProCod = P08GP8_A758ProCod[0] ;
            A65ArtCod = P08GP8_A65ArtCod[0] ;
            A252CliCod = P08GP8_A252CliCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8GP14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV30Option = A460FasDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GP14 )
         {
            brk8GP14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tserpa2copy1wwgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = tserpa2copy1wwgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = tserpa2copy1wwgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFArtCod = "" ;
      AV15TFArtCod_Sel = "" ;
      AV16TFArtDsc = "" ;
      AV17TFArtDsc_Sel = "" ;
      AV18TFProCod = "" ;
      AV19TFProCod_Sel = "" ;
      AV20TFProDsc = "" ;
      AV21TFProDsc_Sel = "" ;
      AV22TFFasCod = "" ;
      AV23TFFasCod_Sel = "" ;
      AV24TFFasDsc = "" ;
      AV25TFFasDsc_Sel = "" ;
      A279CliNom = "" ;
      AV60Tserpa2copy1wwds_1_filterfulltext = "" ;
      AV63Tserpa2copy1wwds_4_tfclinom = "" ;
      AV64Tserpa2copy1wwds_5_tfclinom_sel = "" ;
      AV65Tserpa2copy1wwds_6_tfartcod = "" ;
      AV66Tserpa2copy1wwds_7_tfartcod_sel = "" ;
      AV67Tserpa2copy1wwds_8_tfartdsc = "" ;
      AV68Tserpa2copy1wwds_9_tfartdsc_sel = "" ;
      AV69Tserpa2copy1wwds_10_tfprocod = "" ;
      AV70Tserpa2copy1wwds_11_tfprocod_sel = "" ;
      AV71Tserpa2copy1wwds_12_tfprodsc = "" ;
      AV72Tserpa2copy1wwds_13_tfprodsc_sel = "" ;
      AV73Tserpa2copy1wwds_14_tffascod = "" ;
      AV74Tserpa2copy1wwds_15_tffascod_sel = "" ;
      AV75Tserpa2copy1wwds_16_tffasdsc = "" ;
      AV76Tserpa2copy1wwds_17_tffasdsc_sel = "" ;
      scmdbuf = "" ;
      lV60Tserpa2copy1wwds_1_filterfulltext = "" ;
      lV63Tserpa2copy1wwds_4_tfclinom = "" ;
      lV65Tserpa2copy1wwds_6_tfartcod = "" ;
      lV67Tserpa2copy1wwds_8_tfartdsc = "" ;
      lV69Tserpa2copy1wwds_10_tfprocod = "" ;
      lV71Tserpa2copy1wwds_12_tfprodsc = "" ;
      lV73Tserpa2copy1wwds_14_tffascod = "" ;
      lV75Tserpa2copy1wwds_16_tffasdsc = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      P08GP2_A396EmprCod = new String[] {""} ;
      P08GP2_A279CliNom = new String[] {""} ;
      P08GP2_A460FasDsc = new String[] {""} ;
      P08GP2_A457FasCod = new String[] {""} ;
      P08GP2_A759ProDsc = new String[] {""} ;
      P08GP2_A758ProCod = new String[] {""} ;
      P08GP2_A69ArtDsc = new String[] {""} ;
      P08GP2_n69ArtDsc = new boolean[] {false} ;
      P08GP2_A65ArtCod = new String[] {""} ;
      P08GP2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV30Option = "" ;
      P08GP3_A396EmprCod = new String[] {""} ;
      P08GP3_A65ArtCod = new String[] {""} ;
      P08GP3_A460FasDsc = new String[] {""} ;
      P08GP3_A457FasCod = new String[] {""} ;
      P08GP3_A759ProDsc = new String[] {""} ;
      P08GP3_A758ProCod = new String[] {""} ;
      P08GP3_A69ArtDsc = new String[] {""} ;
      P08GP3_n69ArtDsc = new boolean[] {false} ;
      P08GP3_A279CliNom = new String[] {""} ;
      P08GP3_A252CliCod = new int[1] ;
      P08GP4_A396EmprCod = new String[] {""} ;
      P08GP4_A69ArtDsc = new String[] {""} ;
      P08GP4_n69ArtDsc = new boolean[] {false} ;
      P08GP4_A460FasDsc = new String[] {""} ;
      P08GP4_A457FasCod = new String[] {""} ;
      P08GP4_A759ProDsc = new String[] {""} ;
      P08GP4_A758ProCod = new String[] {""} ;
      P08GP4_A65ArtCod = new String[] {""} ;
      P08GP4_A279CliNom = new String[] {""} ;
      P08GP4_A252CliCod = new int[1] ;
      P08GP5_A396EmprCod = new String[] {""} ;
      P08GP5_A758ProCod = new String[] {""} ;
      P08GP5_A460FasDsc = new String[] {""} ;
      P08GP5_A457FasCod = new String[] {""} ;
      P08GP5_A759ProDsc = new String[] {""} ;
      P08GP5_A69ArtDsc = new String[] {""} ;
      P08GP5_n69ArtDsc = new boolean[] {false} ;
      P08GP5_A65ArtCod = new String[] {""} ;
      P08GP5_A279CliNom = new String[] {""} ;
      P08GP5_A252CliCod = new int[1] ;
      P08GP6_A396EmprCod = new String[] {""} ;
      P08GP6_A759ProDsc = new String[] {""} ;
      P08GP6_A460FasDsc = new String[] {""} ;
      P08GP6_A457FasCod = new String[] {""} ;
      P08GP6_A758ProCod = new String[] {""} ;
      P08GP6_A69ArtDsc = new String[] {""} ;
      P08GP6_n69ArtDsc = new boolean[] {false} ;
      P08GP6_A65ArtCod = new String[] {""} ;
      P08GP6_A279CliNom = new String[] {""} ;
      P08GP6_A252CliCod = new int[1] ;
      P08GP7_A396EmprCod = new String[] {""} ;
      P08GP7_A457FasCod = new String[] {""} ;
      P08GP7_A460FasDsc = new String[] {""} ;
      P08GP7_A759ProDsc = new String[] {""} ;
      P08GP7_A758ProCod = new String[] {""} ;
      P08GP7_A69ArtDsc = new String[] {""} ;
      P08GP7_n69ArtDsc = new boolean[] {false} ;
      P08GP7_A65ArtCod = new String[] {""} ;
      P08GP7_A279CliNom = new String[] {""} ;
      P08GP7_A252CliCod = new int[1] ;
      AV33OptionDesc = "" ;
      P08GP8_A396EmprCod = new String[] {""} ;
      P08GP8_A460FasDsc = new String[] {""} ;
      P08GP8_A457FasCod = new String[] {""} ;
      P08GP8_A759ProDsc = new String[] {""} ;
      P08GP8_A758ProCod = new String[] {""} ;
      P08GP8_A69ArtDsc = new String[] {""} ;
      P08GP8_n69ArtDsc = new boolean[] {false} ;
      P08GP8_A65ArtCod = new String[] {""} ;
      P08GP8_A279CliNom = new String[] {""} ;
      P08GP8_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tserpa2copy1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08GP2_A396EmprCod, P08GP2_A279CliNom, P08GP2_A460FasDsc, P08GP2_A457FasCod, P08GP2_A759ProDsc, P08GP2_A758ProCod, P08GP2_A69ArtDsc, P08GP2_n69ArtDsc, P08GP2_A65ArtCod, P08GP2_A252CliCod
            }
            , new Object[] {
            P08GP3_A396EmprCod, P08GP3_A65ArtCod, P08GP3_A460FasDsc, P08GP3_A457FasCod, P08GP3_A759ProDsc, P08GP3_A758ProCod, P08GP3_A69ArtDsc, P08GP3_n69ArtDsc, P08GP3_A279CliNom, P08GP3_A252CliCod
            }
            , new Object[] {
            P08GP4_A396EmprCod, P08GP4_A69ArtDsc, P08GP4_n69ArtDsc, P08GP4_A460FasDsc, P08GP4_A457FasCod, P08GP4_A759ProDsc, P08GP4_A758ProCod, P08GP4_A65ArtCod, P08GP4_A279CliNom, P08GP4_A252CliCod
            }
            , new Object[] {
            P08GP5_A396EmprCod, P08GP5_A758ProCod, P08GP5_A460FasDsc, P08GP5_A457FasCod, P08GP5_A759ProDsc, P08GP5_A69ArtDsc, P08GP5_n69ArtDsc, P08GP5_A65ArtCod, P08GP5_A279CliNom, P08GP5_A252CliCod
            }
            , new Object[] {
            P08GP6_A396EmprCod, P08GP6_A759ProDsc, P08GP6_A460FasDsc, P08GP6_A457FasCod, P08GP6_A758ProCod, P08GP6_A69ArtDsc, P08GP6_n69ArtDsc, P08GP6_A65ArtCod, P08GP6_A279CliNom, P08GP6_A252CliCod
            }
            , new Object[] {
            P08GP7_A396EmprCod, P08GP7_A457FasCod, P08GP7_A460FasDsc, P08GP7_A759ProDsc, P08GP7_A758ProCod, P08GP7_A69ArtDsc, P08GP7_n69ArtDsc, P08GP7_A65ArtCod, P08GP7_A279CliNom, P08GP7_A252CliCod
            }
            , new Object[] {
            P08GP8_A396EmprCod, P08GP8_A460FasDsc, P08GP8_A457FasCod, P08GP8_A759ProDsc, P08GP8_A758ProCod, P08GP8_A69ArtDsc, P08GP8_n69ArtDsc, P08GP8_A65ArtCod, P08GP8_A279CliNom, P08GP8_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV58GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV61Tserpa2copy1wwds_2_tfclicod ;
   private int AV62Tserpa2copy1wwds_3_tfclicod_to ;
   private int A252CliCod ;
   private long AV38count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFArtCod ;
   private String AV15TFArtCod_Sel ;
   private String AV16TFArtDsc ;
   private String AV17TFArtDsc_Sel ;
   private String AV18TFProCod ;
   private String AV19TFProCod_Sel ;
   private String AV20TFProDsc ;
   private String AV21TFProDsc_Sel ;
   private String AV22TFFasCod ;
   private String AV23TFFasCod_Sel ;
   private String AV24TFFasDsc ;
   private String AV25TFFasDsc_Sel ;
   private String A279CliNom ;
   private String AV63Tserpa2copy1wwds_4_tfclinom ;
   private String AV64Tserpa2copy1wwds_5_tfclinom_sel ;
   private String AV65Tserpa2copy1wwds_6_tfartcod ;
   private String AV66Tserpa2copy1wwds_7_tfartcod_sel ;
   private String AV67Tserpa2copy1wwds_8_tfartdsc ;
   private String AV68Tserpa2copy1wwds_9_tfartdsc_sel ;
   private String AV69Tserpa2copy1wwds_10_tfprocod ;
   private String AV70Tserpa2copy1wwds_11_tfprocod_sel ;
   private String AV71Tserpa2copy1wwds_12_tfprodsc ;
   private String AV72Tserpa2copy1wwds_13_tfprodsc_sel ;
   private String AV73Tserpa2copy1wwds_14_tffascod ;
   private String AV74Tserpa2copy1wwds_15_tffascod_sel ;
   private String AV75Tserpa2copy1wwds_16_tffasdsc ;
   private String AV76Tserpa2copy1wwds_17_tffasdsc_sel ;
   private String scmdbuf ;
   private String lV63Tserpa2copy1wwds_4_tfclinom ;
   private String lV65Tserpa2copy1wwds_6_tfartcod ;
   private String lV67Tserpa2copy1wwds_8_tfartdsc ;
   private String lV69Tserpa2copy1wwds_10_tfprocod ;
   private String lV71Tserpa2copy1wwds_12_tfprodsc ;
   private String lV73Tserpa2copy1wwds_14_tffascod ;
   private String lV75Tserpa2copy1wwds_16_tffasdsc ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8GP2 ;
   private boolean n69ArtDsc ;
   private boolean brk8GP4 ;
   private boolean brk8GP6 ;
   private boolean brk8GP8 ;
   private boolean brk8GP10 ;
   private boolean brk8GP12 ;
   private boolean brk8GP14 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV55FilterFullText ;
   private String AV60Tserpa2copy1wwds_1_filterfulltext ;
   private String lV60Tserpa2copy1wwds_1_filterfulltext ;
   private String AV30Option ;
   private String AV33OptionDesc ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08GP2_A396EmprCod ;
   private String[] P08GP2_A279CliNom ;
   private String[] P08GP2_A460FasDsc ;
   private String[] P08GP2_A457FasCod ;
   private String[] P08GP2_A759ProDsc ;
   private String[] P08GP2_A758ProCod ;
   private String[] P08GP2_A69ArtDsc ;
   private boolean[] P08GP2_n69ArtDsc ;
   private String[] P08GP2_A65ArtCod ;
   private int[] P08GP2_A252CliCod ;
   private String[] P08GP3_A396EmprCod ;
   private String[] P08GP3_A65ArtCod ;
   private String[] P08GP3_A460FasDsc ;
   private String[] P08GP3_A457FasCod ;
   private String[] P08GP3_A759ProDsc ;
   private String[] P08GP3_A758ProCod ;
   private String[] P08GP3_A69ArtDsc ;
   private boolean[] P08GP3_n69ArtDsc ;
   private String[] P08GP3_A279CliNom ;
   private int[] P08GP3_A252CliCod ;
   private String[] P08GP4_A396EmprCod ;
   private String[] P08GP4_A69ArtDsc ;
   private boolean[] P08GP4_n69ArtDsc ;
   private String[] P08GP4_A460FasDsc ;
   private String[] P08GP4_A457FasCod ;
   private String[] P08GP4_A759ProDsc ;
   private String[] P08GP4_A758ProCod ;
   private String[] P08GP4_A65ArtCod ;
   private String[] P08GP4_A279CliNom ;
   private int[] P08GP4_A252CliCod ;
   private String[] P08GP5_A396EmprCod ;
   private String[] P08GP5_A758ProCod ;
   private String[] P08GP5_A460FasDsc ;
   private String[] P08GP5_A457FasCod ;
   private String[] P08GP5_A759ProDsc ;
   private String[] P08GP5_A69ArtDsc ;
   private boolean[] P08GP5_n69ArtDsc ;
   private String[] P08GP5_A65ArtCod ;
   private String[] P08GP5_A279CliNom ;
   private int[] P08GP5_A252CliCod ;
   private String[] P08GP6_A396EmprCod ;
   private String[] P08GP6_A759ProDsc ;
   private String[] P08GP6_A460FasDsc ;
   private String[] P08GP6_A457FasCod ;
   private String[] P08GP6_A758ProCod ;
   private String[] P08GP6_A69ArtDsc ;
   private boolean[] P08GP6_n69ArtDsc ;
   private String[] P08GP6_A65ArtCod ;
   private String[] P08GP6_A279CliNom ;
   private int[] P08GP6_A252CliCod ;
   private String[] P08GP7_A396EmprCod ;
   private String[] P08GP7_A457FasCod ;
   private String[] P08GP7_A460FasDsc ;
   private String[] P08GP7_A759ProDsc ;
   private String[] P08GP7_A758ProCod ;
   private String[] P08GP7_A69ArtDsc ;
   private boolean[] P08GP7_n69ArtDsc ;
   private String[] P08GP7_A65ArtCod ;
   private String[] P08GP7_A279CliNom ;
   private int[] P08GP7_A252CliCod ;
   private String[] P08GP8_A396EmprCod ;
   private String[] P08GP8_A460FasDsc ;
   private String[] P08GP8_A457FasCod ;
   private String[] P08GP8_A759ProDsc ;
   private String[] P08GP8_A758ProCod ;
   private String[] P08GP8_A69ArtDsc ;
   private boolean[] P08GP8_n69ArtDsc ;
   private String[] P08GP8_A65ArtCod ;
   private String[] P08GP8_A279CliNom ;
   private int[] P08GP8_A252CliCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class tserpa2copy1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Tserpa2copy1wwds_1_filterfulltext ,
                                          int AV61Tserpa2copy1wwds_2_tfclicod ,
                                          int AV62Tserpa2copy1wwds_3_tfclicod_to ,
                                          String AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                          String AV63Tserpa2copy1wwds_4_tfclinom ,
                                          String AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                          String AV65Tserpa2copy1wwds_6_tfartcod ,
                                          String AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                          String AV67Tserpa2copy1wwds_8_tfartdsc ,
                                          String AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                          String AV69Tserpa2copy1wwds_10_tfprocod ,
                                          String AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                          String AV71Tserpa2copy1wwds_12_tfprodsc ,
                                          String AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                          String AV73Tserpa2copy1wwds_14_tffascod ,
                                          String AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                          String AV75Tserpa2copy1wwds_16_tffasdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T4.CliNom, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T5.ArtDsc, T1.ArtCod, T1.CliCod FROM ((((TXPSERPAU T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV60Tserpa2copy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV61Tserpa2copy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Tserpa2copy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Tserpa2copy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Tserpa2copy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tserpa2copy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tserpa2copy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Tserpa2copy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV73Tserpa2copy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tserpa2copy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08GP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Tserpa2copy1wwds_1_filterfulltext ,
                                          int AV61Tserpa2copy1wwds_2_tfclicod ,
                                          int AV62Tserpa2copy1wwds_3_tfclicod_to ,
                                          String AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                          String AV63Tserpa2copy1wwds_4_tfclinom ,
                                          String AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                          String AV65Tserpa2copy1wwds_6_tfartcod ,
                                          String AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                          String AV67Tserpa2copy1wwds_8_tfartdsc ,
                                          String AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                          String AV69Tserpa2copy1wwds_10_tfprocod ,
                                          String AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                          String AV71Tserpa2copy1wwds_12_tfprodsc ,
                                          String AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                          String AV73Tserpa2copy1wwds_14_tffascod ,
                                          String AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                          String AV75Tserpa2copy1wwds_16_tffasdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ArtCod, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T5.ArtDsc, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV60Tserpa2copy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV61Tserpa2copy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Tserpa2copy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Tserpa2copy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Tserpa2copy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tserpa2copy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tserpa2copy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Tserpa2copy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV73Tserpa2copy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tserpa2copy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08GP4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Tserpa2copy1wwds_1_filterfulltext ,
                                          int AV61Tserpa2copy1wwds_2_tfclicod ,
                                          int AV62Tserpa2copy1wwds_3_tfclicod_to ,
                                          String AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                          String AV63Tserpa2copy1wwds_4_tfclinom ,
                                          String AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                          String AV65Tserpa2copy1wwds_6_tfartcod ,
                                          String AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                          String AV67Tserpa2copy1wwds_8_tfartdsc ,
                                          String AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                          String AV69Tserpa2copy1wwds_10_tfprocod ,
                                          String AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                          String AV71Tserpa2copy1wwds_12_tfprodsc ,
                                          String AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                          String AV73Tserpa2copy1wwds_14_tffascod ,
                                          String AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                          String AV75Tserpa2copy1wwds_16_tffasdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T5.ArtDsc, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV60Tserpa2copy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV61Tserpa2copy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Tserpa2copy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Tserpa2copy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Tserpa2copy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tserpa2copy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tserpa2copy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Tserpa2copy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV73Tserpa2copy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tserpa2copy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T5.ArtDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08GP5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Tserpa2copy1wwds_1_filterfulltext ,
                                          int AV61Tserpa2copy1wwds_2_tfclicod ,
                                          int AV62Tserpa2copy1wwds_3_tfclicod_to ,
                                          String AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                          String AV63Tserpa2copy1wwds_4_tfclinom ,
                                          String AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                          String AV65Tserpa2copy1wwds_6_tfartcod ,
                                          String AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                          String AV67Tserpa2copy1wwds_8_tfartdsc ,
                                          String AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                          String AV69Tserpa2copy1wwds_10_tfprocod ,
                                          String AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                          String AV71Tserpa2copy1wwds_12_tfprodsc ,
                                          String AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                          String AV73Tserpa2copy1wwds_14_tffascod ,
                                          String AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                          String AV75Tserpa2copy1wwds_16_tffasdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T3.FasDsc, T1.FasCod, T2.ProDsc, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV60Tserpa2copy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T3.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV61Tserpa2copy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Tserpa2copy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Tserpa2copy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Tserpa2copy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tserpa2copy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tserpa2copy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Tserpa2copy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV73Tserpa2copy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tserpa2copy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08GP6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Tserpa2copy1wwds_1_filterfulltext ,
                                          int AV61Tserpa2copy1wwds_2_tfclicod ,
                                          int AV62Tserpa2copy1wwds_3_tfclicod_to ,
                                          String AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                          String AV63Tserpa2copy1wwds_4_tfclinom ,
                                          String AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                          String AV65Tserpa2copy1wwds_6_tfartcod ,
                                          String AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                          String AV67Tserpa2copy1wwds_8_tfartdsc ,
                                          String AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                          String AV69Tserpa2copy1wwds_10_tfprocod ,
                                          String AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                          String AV71Tserpa2copy1wwds_12_tfprodsc ,
                                          String AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                          String AV73Tserpa2copy1wwds_14_tffascod ,
                                          String AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                          String AV75Tserpa2copy1wwds_16_tffasdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[24];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.ProDsc, T2.FasDsc, T1.FasCod, T1.ProCod, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV60Tserpa2copy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (0==AV61Tserpa2copy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Tserpa2copy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Tserpa2copy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Tserpa2copy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tserpa2copy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tserpa2copy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Tserpa2copy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV73Tserpa2copy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tserpa2copy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.ProDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08GP7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Tserpa2copy1wwds_1_filterfulltext ,
                                          int AV61Tserpa2copy1wwds_2_tfclicod ,
                                          int AV62Tserpa2copy1wwds_3_tfclicod_to ,
                                          String AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                          String AV63Tserpa2copy1wwds_4_tfclinom ,
                                          String AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                          String AV65Tserpa2copy1wwds_6_tfartcod ,
                                          String AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                          String AV67Tserpa2copy1wwds_8_tfartdsc ,
                                          String AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                          String AV69Tserpa2copy1wwds_10_tfprocod ,
                                          String AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                          String AV71Tserpa2copy1wwds_12_tfprodsc ,
                                          String AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                          String AV73Tserpa2copy1wwds_14_tffascod ,
                                          String AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                          String AV75Tserpa2copy1wwds_16_tffasdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[24];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T2.FasDsc, T3.ProDsc, T1.ProCod, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV60Tserpa2copy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (0==AV61Tserpa2copy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Tserpa2copy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Tserpa2copy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Tserpa2copy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tserpa2copy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tserpa2copy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Tserpa2copy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV73Tserpa2copy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tserpa2copy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08GP8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60Tserpa2copy1wwds_1_filterfulltext ,
                                          int AV61Tserpa2copy1wwds_2_tfclicod ,
                                          int AV62Tserpa2copy1wwds_3_tfclicod_to ,
                                          String AV64Tserpa2copy1wwds_5_tfclinom_sel ,
                                          String AV63Tserpa2copy1wwds_4_tfclinom ,
                                          String AV66Tserpa2copy1wwds_7_tfartcod_sel ,
                                          String AV65Tserpa2copy1wwds_6_tfartcod ,
                                          String AV68Tserpa2copy1wwds_9_tfartdsc_sel ,
                                          String AV67Tserpa2copy1wwds_8_tfartdsc ,
                                          String AV70Tserpa2copy1wwds_11_tfprocod_sel ,
                                          String AV69Tserpa2copy1wwds_10_tfprocod ,
                                          String AV72Tserpa2copy1wwds_13_tfprodsc_sel ,
                                          String AV71Tserpa2copy1wwds_12_tfprodsc ,
                                          String AV74Tserpa2copy1wwds_15_tffascod_sel ,
                                          String AV73Tserpa2copy1wwds_14_tffascod ,
                                          String AV76Tserpa2copy1wwds_17_tffasdsc_sel ,
                                          String AV75Tserpa2copy1wwds_16_tffasdsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[24];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.FasDsc, T1.FasCod, T3.ProDsc, T1.ProCod, T5.ArtDsc, T1.ArtCod, T4.CliNom, T1.CliCod FROM ((((TXPSERPAU T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = T1.EmprCod AND T3.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod) INNER JOIN TXPARTICU T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod AND T5.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV60Tserpa2copy1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T5.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T3.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
         GXv_int14[1] = (byte)(1) ;
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV61Tserpa2copy1wwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV62Tserpa2copy1wwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV63Tserpa2copy1wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Tserpa2copy1wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Tserpa2copy1wwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Tserpa2copy1wwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tserpa2copy1wwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tserpa2copy1wwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ArtDsc = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV69Tserpa2copy1wwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tserpa2copy1wwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Tserpa2copy1wwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Tserpa2copy1wwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProDsc = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV73Tserpa2copy1wwds_14_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Tserpa2copy1wwds_15_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Tserpa2copy1wwds_16_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Tserpa2copy1wwds_17_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasDsc" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P08GP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P08GP3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P08GP4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 3 :
                  return conditional_P08GP5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 4 :
                  return conditional_P08GP6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 5 :
                  return conditional_P08GP7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 6 :
                  return conditional_P08GP8(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GP4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GP5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GP6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GP7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GP8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 28);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 28);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 28);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 28);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 28);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 28);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 28);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 28);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 28);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 28);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 28);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 28);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 40);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 40);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 28);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 28);
               }
               return;
      }
   }

}

