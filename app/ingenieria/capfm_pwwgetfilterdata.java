package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class capfm_pwwgetfilterdata extends GXProcedure
{
   public capfm_pwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( capfm_pwwgetfilterdata.class ), "" );
   }

   public capfm_pwwgetfilterdata( int remoteHandle ,
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
      capfm_pwwgetfilterdata.this.aP5 = new String[] {""};
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
      capfm_pwwgetfilterdata.this.AV38DDOName = aP0;
      capfm_pwwgetfilterdata.this.AV36SearchTxt = aP1;
      capfm_pwwgetfilterdata.this.AV37SearchTxtTo = aP2;
      capfm_pwwgetfilterdata.this.aP3 = aP3;
      capfm_pwwgetfilterdata.this.aP4 = aP4;
      capfm_pwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_ARTCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_ARTDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRODSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FASCODM") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_MAQCODC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV42OptionsJson = AV41Options.toJSonString(false) ;
      AV45OptionsDescJson = AV44OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV46OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("Ingenieria.CAPFM_PWWGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.CAPFM_PWWGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("Ingenieria.CAPFM_PWWGridState"), null, null);
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV18TFArtCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV19TFArtCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV20TFArtDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV21TFArtDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV22TFProCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV23TFProCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV24TFProDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV25TFProDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODM") == 0 )
         {
            AV26TFFasCodM = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODM_SEL") == 0 )
         {
            AV27TFFasCodM_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODC") == 0 )
         {
            AV30TFMaqCodC = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODC_SEL") == 0 )
         {
            AV31TFMaqCodC_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV36SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV59Ingenieria_capfm_pwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Ingenieria_capfm_pwwds_2_tfclicod = AV14TFCliCod ;
      AV61Ingenieria_capfm_pwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV62Ingenieria_capfm_pwwds_4_tfclinom = AV16TFCliNom ;
      AV63Ingenieria_capfm_pwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV64Ingenieria_capfm_pwwds_6_tfartcod = AV18TFArtCod ;
      AV65Ingenieria_capfm_pwwds_7_tfartcod_sel = AV19TFArtCod_Sel ;
      AV66Ingenieria_capfm_pwwds_8_tfartdsc = AV20TFArtDsc ;
      AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel = AV21TFArtDsc_Sel ;
      AV68Ingenieria_capfm_pwwds_10_tfprocod = AV22TFProCod ;
      AV69Ingenieria_capfm_pwwds_11_tfprocod_sel = AV23TFProCod_Sel ;
      AV70Ingenieria_capfm_pwwds_12_tfprodsc = AV24TFProDsc ;
      AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel = AV25TFProDsc_Sel ;
      AV72Ingenieria_capfm_pwwds_14_tffascodm = AV26TFFasCodM ;
      AV73Ingenieria_capfm_pwwds_15_tffascodm_sel = AV27TFFasCodM_Sel ;
      AV74Ingenieria_capfm_pwwds_16_tfmaqcodc = AV30TFMaqCodC ;
      AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = AV31TFMaqCodC_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                           Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod) ,
                                           Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to) ,
                                           AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                           AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                           AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                           AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                           AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                           AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                           AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                           AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                           AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                           AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                           AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                           AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                           AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                           AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A9836FasCodM ,
                                           A9830MaqCodC } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV62Ingenieria_capfm_pwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV62Ingenieria_capfm_pwwds_4_tfclinom), 30, "%") ;
      lV64Ingenieria_capfm_pwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV64Ingenieria_capfm_pwwds_6_tfartcod), 16, "%") ;
      lV66Ingenieria_capfm_pwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV66Ingenieria_capfm_pwwds_8_tfartdsc), 26, "%") ;
      lV68Ingenieria_capfm_pwwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV68Ingenieria_capfm_pwwds_10_tfprocod), 8, "%") ;
      lV70Ingenieria_capfm_pwwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV70Ingenieria_capfm_pwwds_12_tfprodsc), 40, "%") ;
      lV72Ingenieria_capfm_pwwds_14_tffascodm = GXutil.padr( GXutil.rtrim( AV72Ingenieria_capfm_pwwds_14_tffascodm), 8, "%") ;
      lV74Ingenieria_capfm_pwwds_16_tfmaqcodc = GXutil.padr( GXutil.rtrim( AV74Ingenieria_capfm_pwwds_16_tfmaqcodc), 6, "%") ;
      /* Using cursor P09RG2 */
      pr_default.execute(0, new Object[] {lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod), Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to), lV62Ingenieria_capfm_pwwds_4_tfclinom, AV63Ingenieria_capfm_pwwds_5_tfclinom_sel, lV64Ingenieria_capfm_pwwds_6_tfartcod, AV65Ingenieria_capfm_pwwds_7_tfartcod_sel, lV66Ingenieria_capfm_pwwds_8_tfartdsc, AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel, lV68Ingenieria_capfm_pwwds_10_tfprocod, AV69Ingenieria_capfm_pwwds_11_tfprocod_sel, lV70Ingenieria_capfm_pwwds_12_tfprodsc, AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel, lV72Ingenieria_capfm_pwwds_14_tffascodm, AV73Ingenieria_capfm_pwwds_15_tffascodm_sel, lV74Ingenieria_capfm_pwwds_16_tfmaqcodc, AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9RG2 = false ;
         A396EmprCod = P09RG2_A396EmprCod[0] ;
         A279CliNom = P09RG2_A279CliNom[0] ;
         A9830MaqCodC = P09RG2_A9830MaqCodC[0] ;
         A9836FasCodM = P09RG2_A9836FasCodM[0] ;
         A759ProDsc = P09RG2_A759ProDsc[0] ;
         A758ProCod = P09RG2_A758ProCod[0] ;
         A69ArtDsc = P09RG2_A69ArtDsc[0] ;
         n69ArtDsc = P09RG2_n69ArtDsc[0] ;
         A65ArtCod = P09RG2_A65ArtCod[0] ;
         A252CliCod = P09RG2_A252CliCod[0] ;
         A759ProDsc = P09RG2_A759ProDsc[0] ;
         A279CliNom = P09RG2_A279CliNom[0] ;
         A69ArtDsc = P09RG2_A69ArtDsc[0] ;
         n69ArtDsc = P09RG2_n69ArtDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09RG2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9RG2 = false ;
            A396EmprCod = P09RG2_A396EmprCod[0] ;
            A9830MaqCodC = P09RG2_A9830MaqCodC[0] ;
            A9836FasCodM = P09RG2_A9836FasCodM[0] ;
            A758ProCod = P09RG2_A758ProCod[0] ;
            A65ArtCod = P09RG2_A65ArtCod[0] ;
            A252CliCod = P09RG2_A252CliCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9RG2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV40Option = A279CliNom ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RG2 )
         {
            brk9RG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFArtCod = AV36SearchTxt ;
      AV19TFArtCod_Sel = "" ;
      AV59Ingenieria_capfm_pwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Ingenieria_capfm_pwwds_2_tfclicod = AV14TFCliCod ;
      AV61Ingenieria_capfm_pwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV62Ingenieria_capfm_pwwds_4_tfclinom = AV16TFCliNom ;
      AV63Ingenieria_capfm_pwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV64Ingenieria_capfm_pwwds_6_tfartcod = AV18TFArtCod ;
      AV65Ingenieria_capfm_pwwds_7_tfartcod_sel = AV19TFArtCod_Sel ;
      AV66Ingenieria_capfm_pwwds_8_tfartdsc = AV20TFArtDsc ;
      AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel = AV21TFArtDsc_Sel ;
      AV68Ingenieria_capfm_pwwds_10_tfprocod = AV22TFProCod ;
      AV69Ingenieria_capfm_pwwds_11_tfprocod_sel = AV23TFProCod_Sel ;
      AV70Ingenieria_capfm_pwwds_12_tfprodsc = AV24TFProDsc ;
      AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel = AV25TFProDsc_Sel ;
      AV72Ingenieria_capfm_pwwds_14_tffascodm = AV26TFFasCodM ;
      AV73Ingenieria_capfm_pwwds_15_tffascodm_sel = AV27TFFasCodM_Sel ;
      AV74Ingenieria_capfm_pwwds_16_tfmaqcodc = AV30TFMaqCodC ;
      AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = AV31TFMaqCodC_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                           Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod) ,
                                           Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to) ,
                                           AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                           AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                           AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                           AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                           AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                           AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                           AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                           AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                           AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                           AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                           AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                           AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                           AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                           AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A9836FasCodM ,
                                           A9830MaqCodC } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV62Ingenieria_capfm_pwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV62Ingenieria_capfm_pwwds_4_tfclinom), 30, "%") ;
      lV64Ingenieria_capfm_pwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV64Ingenieria_capfm_pwwds_6_tfartcod), 16, "%") ;
      lV66Ingenieria_capfm_pwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV66Ingenieria_capfm_pwwds_8_tfartdsc), 26, "%") ;
      lV68Ingenieria_capfm_pwwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV68Ingenieria_capfm_pwwds_10_tfprocod), 8, "%") ;
      lV70Ingenieria_capfm_pwwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV70Ingenieria_capfm_pwwds_12_tfprodsc), 40, "%") ;
      lV72Ingenieria_capfm_pwwds_14_tffascodm = GXutil.padr( GXutil.rtrim( AV72Ingenieria_capfm_pwwds_14_tffascodm), 8, "%") ;
      lV74Ingenieria_capfm_pwwds_16_tfmaqcodc = GXutil.padr( GXutil.rtrim( AV74Ingenieria_capfm_pwwds_16_tfmaqcodc), 6, "%") ;
      /* Using cursor P09RG3 */
      pr_default.execute(1, new Object[] {lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod), Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to), lV62Ingenieria_capfm_pwwds_4_tfclinom, AV63Ingenieria_capfm_pwwds_5_tfclinom_sel, lV64Ingenieria_capfm_pwwds_6_tfartcod, AV65Ingenieria_capfm_pwwds_7_tfartcod_sel, lV66Ingenieria_capfm_pwwds_8_tfartdsc, AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel, lV68Ingenieria_capfm_pwwds_10_tfprocod, AV69Ingenieria_capfm_pwwds_11_tfprocod_sel, lV70Ingenieria_capfm_pwwds_12_tfprodsc, AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel, lV72Ingenieria_capfm_pwwds_14_tffascodm, AV73Ingenieria_capfm_pwwds_15_tffascodm_sel, lV74Ingenieria_capfm_pwwds_16_tfmaqcodc, AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9RG4 = false ;
         A396EmprCod = P09RG3_A396EmprCod[0] ;
         A65ArtCod = P09RG3_A65ArtCod[0] ;
         A9830MaqCodC = P09RG3_A9830MaqCodC[0] ;
         A9836FasCodM = P09RG3_A9836FasCodM[0] ;
         A759ProDsc = P09RG3_A759ProDsc[0] ;
         A758ProCod = P09RG3_A758ProCod[0] ;
         A69ArtDsc = P09RG3_A69ArtDsc[0] ;
         n69ArtDsc = P09RG3_n69ArtDsc[0] ;
         A279CliNom = P09RG3_A279CliNom[0] ;
         A252CliCod = P09RG3_A252CliCod[0] ;
         A759ProDsc = P09RG3_A759ProDsc[0] ;
         A279CliNom = P09RG3_A279CliNom[0] ;
         A69ArtDsc = P09RG3_A69ArtDsc[0] ;
         n69ArtDsc = P09RG3_n69ArtDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09RG3_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brk9RG4 = false ;
            A396EmprCod = P09RG3_A396EmprCod[0] ;
            A9830MaqCodC = P09RG3_A9830MaqCodC[0] ;
            A9836FasCodM = P09RG3_A9836FasCodM[0] ;
            A758ProCod = P09RG3_A758ProCod[0] ;
            A252CliCod = P09RG3_A252CliCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9RG4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV40Option = A65ArtCod ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RG4 )
         {
            brk9RG4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFArtDsc = AV36SearchTxt ;
      AV21TFArtDsc_Sel = "" ;
      AV59Ingenieria_capfm_pwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Ingenieria_capfm_pwwds_2_tfclicod = AV14TFCliCod ;
      AV61Ingenieria_capfm_pwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV62Ingenieria_capfm_pwwds_4_tfclinom = AV16TFCliNom ;
      AV63Ingenieria_capfm_pwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV64Ingenieria_capfm_pwwds_6_tfartcod = AV18TFArtCod ;
      AV65Ingenieria_capfm_pwwds_7_tfartcod_sel = AV19TFArtCod_Sel ;
      AV66Ingenieria_capfm_pwwds_8_tfartdsc = AV20TFArtDsc ;
      AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel = AV21TFArtDsc_Sel ;
      AV68Ingenieria_capfm_pwwds_10_tfprocod = AV22TFProCod ;
      AV69Ingenieria_capfm_pwwds_11_tfprocod_sel = AV23TFProCod_Sel ;
      AV70Ingenieria_capfm_pwwds_12_tfprodsc = AV24TFProDsc ;
      AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel = AV25TFProDsc_Sel ;
      AV72Ingenieria_capfm_pwwds_14_tffascodm = AV26TFFasCodM ;
      AV73Ingenieria_capfm_pwwds_15_tffascodm_sel = AV27TFFasCodM_Sel ;
      AV74Ingenieria_capfm_pwwds_16_tfmaqcodc = AV30TFMaqCodC ;
      AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = AV31TFMaqCodC_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                           Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod) ,
                                           Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to) ,
                                           AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                           AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                           AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                           AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                           AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                           AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                           AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                           AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                           AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                           AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                           AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                           AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                           AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                           AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A9836FasCodM ,
                                           A9830MaqCodC } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV62Ingenieria_capfm_pwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV62Ingenieria_capfm_pwwds_4_tfclinom), 30, "%") ;
      lV64Ingenieria_capfm_pwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV64Ingenieria_capfm_pwwds_6_tfartcod), 16, "%") ;
      lV66Ingenieria_capfm_pwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV66Ingenieria_capfm_pwwds_8_tfartdsc), 26, "%") ;
      lV68Ingenieria_capfm_pwwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV68Ingenieria_capfm_pwwds_10_tfprocod), 8, "%") ;
      lV70Ingenieria_capfm_pwwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV70Ingenieria_capfm_pwwds_12_tfprodsc), 40, "%") ;
      lV72Ingenieria_capfm_pwwds_14_tffascodm = GXutil.padr( GXutil.rtrim( AV72Ingenieria_capfm_pwwds_14_tffascodm), 8, "%") ;
      lV74Ingenieria_capfm_pwwds_16_tfmaqcodc = GXutil.padr( GXutil.rtrim( AV74Ingenieria_capfm_pwwds_16_tfmaqcodc), 6, "%") ;
      /* Using cursor P09RG4 */
      pr_default.execute(2, new Object[] {lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod), Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to), lV62Ingenieria_capfm_pwwds_4_tfclinom, AV63Ingenieria_capfm_pwwds_5_tfclinom_sel, lV64Ingenieria_capfm_pwwds_6_tfartcod, AV65Ingenieria_capfm_pwwds_7_tfartcod_sel, lV66Ingenieria_capfm_pwwds_8_tfartdsc, AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel, lV68Ingenieria_capfm_pwwds_10_tfprocod, AV69Ingenieria_capfm_pwwds_11_tfprocod_sel, lV70Ingenieria_capfm_pwwds_12_tfprodsc, AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel, lV72Ingenieria_capfm_pwwds_14_tffascodm, AV73Ingenieria_capfm_pwwds_15_tffascodm_sel, lV74Ingenieria_capfm_pwwds_16_tfmaqcodc, AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9RG6 = false ;
         A396EmprCod = P09RG4_A396EmprCod[0] ;
         A69ArtDsc = P09RG4_A69ArtDsc[0] ;
         n69ArtDsc = P09RG4_n69ArtDsc[0] ;
         A9830MaqCodC = P09RG4_A9830MaqCodC[0] ;
         A9836FasCodM = P09RG4_A9836FasCodM[0] ;
         A759ProDsc = P09RG4_A759ProDsc[0] ;
         A758ProCod = P09RG4_A758ProCod[0] ;
         A65ArtCod = P09RG4_A65ArtCod[0] ;
         A279CliNom = P09RG4_A279CliNom[0] ;
         A252CliCod = P09RG4_A252CliCod[0] ;
         A759ProDsc = P09RG4_A759ProDsc[0] ;
         A279CliNom = P09RG4_A279CliNom[0] ;
         A69ArtDsc = P09RG4_A69ArtDsc[0] ;
         n69ArtDsc = P09RG4_n69ArtDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09RG4_A69ArtDsc[0], A69ArtDsc) == 0 ) )
         {
            brk9RG6 = false ;
            A396EmprCod = P09RG4_A396EmprCod[0] ;
            A9830MaqCodC = P09RG4_A9830MaqCodC[0] ;
            A9836FasCodM = P09RG4_A9836FasCodM[0] ;
            A758ProCod = P09RG4_A758ProCod[0] ;
            A65ArtCod = P09RG4_A65ArtCod[0] ;
            A252CliCod = P09RG4_A252CliCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9RG6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV40Option = A69ArtDsc ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RG6 )
         {
            brk9RG6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV22TFProCod = AV36SearchTxt ;
      AV23TFProCod_Sel = "" ;
      AV59Ingenieria_capfm_pwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Ingenieria_capfm_pwwds_2_tfclicod = AV14TFCliCod ;
      AV61Ingenieria_capfm_pwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV62Ingenieria_capfm_pwwds_4_tfclinom = AV16TFCliNom ;
      AV63Ingenieria_capfm_pwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV64Ingenieria_capfm_pwwds_6_tfartcod = AV18TFArtCod ;
      AV65Ingenieria_capfm_pwwds_7_tfartcod_sel = AV19TFArtCod_Sel ;
      AV66Ingenieria_capfm_pwwds_8_tfartdsc = AV20TFArtDsc ;
      AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel = AV21TFArtDsc_Sel ;
      AV68Ingenieria_capfm_pwwds_10_tfprocod = AV22TFProCod ;
      AV69Ingenieria_capfm_pwwds_11_tfprocod_sel = AV23TFProCod_Sel ;
      AV70Ingenieria_capfm_pwwds_12_tfprodsc = AV24TFProDsc ;
      AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel = AV25TFProDsc_Sel ;
      AV72Ingenieria_capfm_pwwds_14_tffascodm = AV26TFFasCodM ;
      AV73Ingenieria_capfm_pwwds_15_tffascodm_sel = AV27TFFasCodM_Sel ;
      AV74Ingenieria_capfm_pwwds_16_tfmaqcodc = AV30TFMaqCodC ;
      AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = AV31TFMaqCodC_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                           Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod) ,
                                           Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to) ,
                                           AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                           AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                           AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                           AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                           AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                           AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                           AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                           AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                           AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                           AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                           AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                           AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                           AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                           AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A9836FasCodM ,
                                           A9830MaqCodC } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV62Ingenieria_capfm_pwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV62Ingenieria_capfm_pwwds_4_tfclinom), 30, "%") ;
      lV64Ingenieria_capfm_pwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV64Ingenieria_capfm_pwwds_6_tfartcod), 16, "%") ;
      lV66Ingenieria_capfm_pwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV66Ingenieria_capfm_pwwds_8_tfartdsc), 26, "%") ;
      lV68Ingenieria_capfm_pwwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV68Ingenieria_capfm_pwwds_10_tfprocod), 8, "%") ;
      lV70Ingenieria_capfm_pwwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV70Ingenieria_capfm_pwwds_12_tfprodsc), 40, "%") ;
      lV72Ingenieria_capfm_pwwds_14_tffascodm = GXutil.padr( GXutil.rtrim( AV72Ingenieria_capfm_pwwds_14_tffascodm), 8, "%") ;
      lV74Ingenieria_capfm_pwwds_16_tfmaqcodc = GXutil.padr( GXutil.rtrim( AV74Ingenieria_capfm_pwwds_16_tfmaqcodc), 6, "%") ;
      /* Using cursor P09RG5 */
      pr_default.execute(3, new Object[] {lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod), Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to), lV62Ingenieria_capfm_pwwds_4_tfclinom, AV63Ingenieria_capfm_pwwds_5_tfclinom_sel, lV64Ingenieria_capfm_pwwds_6_tfartcod, AV65Ingenieria_capfm_pwwds_7_tfartcod_sel, lV66Ingenieria_capfm_pwwds_8_tfartdsc, AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel, lV68Ingenieria_capfm_pwwds_10_tfprocod, AV69Ingenieria_capfm_pwwds_11_tfprocod_sel, lV70Ingenieria_capfm_pwwds_12_tfprodsc, AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel, lV72Ingenieria_capfm_pwwds_14_tffascodm, AV73Ingenieria_capfm_pwwds_15_tffascodm_sel, lV74Ingenieria_capfm_pwwds_16_tfmaqcodc, AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9RG8 = false ;
         A396EmprCod = P09RG5_A396EmprCod[0] ;
         A758ProCod = P09RG5_A758ProCod[0] ;
         A9830MaqCodC = P09RG5_A9830MaqCodC[0] ;
         A9836FasCodM = P09RG5_A9836FasCodM[0] ;
         A759ProDsc = P09RG5_A759ProDsc[0] ;
         A69ArtDsc = P09RG5_A69ArtDsc[0] ;
         n69ArtDsc = P09RG5_n69ArtDsc[0] ;
         A65ArtCod = P09RG5_A65ArtCod[0] ;
         A279CliNom = P09RG5_A279CliNom[0] ;
         A252CliCod = P09RG5_A252CliCod[0] ;
         A759ProDsc = P09RG5_A759ProDsc[0] ;
         A279CliNom = P09RG5_A279CliNom[0] ;
         A69ArtDsc = P09RG5_A69ArtDsc[0] ;
         n69ArtDsc = P09RG5_n69ArtDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09RG5_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brk9RG8 = false ;
            A396EmprCod = P09RG5_A396EmprCod[0] ;
            A9830MaqCodC = P09RG5_A9830MaqCodC[0] ;
            A9836FasCodM = P09RG5_A9836FasCodM[0] ;
            A65ArtCod = P09RG5_A65ArtCod[0] ;
            A252CliCod = P09RG5_A252CliCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9RG8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV40Option = A758ProCod ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RG8 )
         {
            brk9RG8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFProDsc = AV36SearchTxt ;
      AV25TFProDsc_Sel = "" ;
      AV59Ingenieria_capfm_pwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Ingenieria_capfm_pwwds_2_tfclicod = AV14TFCliCod ;
      AV61Ingenieria_capfm_pwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV62Ingenieria_capfm_pwwds_4_tfclinom = AV16TFCliNom ;
      AV63Ingenieria_capfm_pwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV64Ingenieria_capfm_pwwds_6_tfartcod = AV18TFArtCod ;
      AV65Ingenieria_capfm_pwwds_7_tfartcod_sel = AV19TFArtCod_Sel ;
      AV66Ingenieria_capfm_pwwds_8_tfartdsc = AV20TFArtDsc ;
      AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel = AV21TFArtDsc_Sel ;
      AV68Ingenieria_capfm_pwwds_10_tfprocod = AV22TFProCod ;
      AV69Ingenieria_capfm_pwwds_11_tfprocod_sel = AV23TFProCod_Sel ;
      AV70Ingenieria_capfm_pwwds_12_tfprodsc = AV24TFProDsc ;
      AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel = AV25TFProDsc_Sel ;
      AV72Ingenieria_capfm_pwwds_14_tffascodm = AV26TFFasCodM ;
      AV73Ingenieria_capfm_pwwds_15_tffascodm_sel = AV27TFFasCodM_Sel ;
      AV74Ingenieria_capfm_pwwds_16_tfmaqcodc = AV30TFMaqCodC ;
      AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = AV31TFMaqCodC_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                           Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod) ,
                                           Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to) ,
                                           AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                           AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                           AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                           AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                           AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                           AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                           AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                           AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                           AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                           AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                           AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                           AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                           AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                           AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A9836FasCodM ,
                                           A9830MaqCodC } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV62Ingenieria_capfm_pwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV62Ingenieria_capfm_pwwds_4_tfclinom), 30, "%") ;
      lV64Ingenieria_capfm_pwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV64Ingenieria_capfm_pwwds_6_tfartcod), 16, "%") ;
      lV66Ingenieria_capfm_pwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV66Ingenieria_capfm_pwwds_8_tfartdsc), 26, "%") ;
      lV68Ingenieria_capfm_pwwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV68Ingenieria_capfm_pwwds_10_tfprocod), 8, "%") ;
      lV70Ingenieria_capfm_pwwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV70Ingenieria_capfm_pwwds_12_tfprodsc), 40, "%") ;
      lV72Ingenieria_capfm_pwwds_14_tffascodm = GXutil.padr( GXutil.rtrim( AV72Ingenieria_capfm_pwwds_14_tffascodm), 8, "%") ;
      lV74Ingenieria_capfm_pwwds_16_tfmaqcodc = GXutil.padr( GXutil.rtrim( AV74Ingenieria_capfm_pwwds_16_tfmaqcodc), 6, "%") ;
      /* Using cursor P09RG6 */
      pr_default.execute(4, new Object[] {lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod), Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to), lV62Ingenieria_capfm_pwwds_4_tfclinom, AV63Ingenieria_capfm_pwwds_5_tfclinom_sel, lV64Ingenieria_capfm_pwwds_6_tfartcod, AV65Ingenieria_capfm_pwwds_7_tfartcod_sel, lV66Ingenieria_capfm_pwwds_8_tfartdsc, AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel, lV68Ingenieria_capfm_pwwds_10_tfprocod, AV69Ingenieria_capfm_pwwds_11_tfprocod_sel, lV70Ingenieria_capfm_pwwds_12_tfprodsc, AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel, lV72Ingenieria_capfm_pwwds_14_tffascodm, AV73Ingenieria_capfm_pwwds_15_tffascodm_sel, lV74Ingenieria_capfm_pwwds_16_tfmaqcodc, AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9RG10 = false ;
         A396EmprCod = P09RG6_A396EmprCod[0] ;
         A759ProDsc = P09RG6_A759ProDsc[0] ;
         A9830MaqCodC = P09RG6_A9830MaqCodC[0] ;
         A9836FasCodM = P09RG6_A9836FasCodM[0] ;
         A758ProCod = P09RG6_A758ProCod[0] ;
         A69ArtDsc = P09RG6_A69ArtDsc[0] ;
         n69ArtDsc = P09RG6_n69ArtDsc[0] ;
         A65ArtCod = P09RG6_A65ArtCod[0] ;
         A279CliNom = P09RG6_A279CliNom[0] ;
         A252CliCod = P09RG6_A252CliCod[0] ;
         A759ProDsc = P09RG6_A759ProDsc[0] ;
         A279CliNom = P09RG6_A279CliNom[0] ;
         A69ArtDsc = P09RG6_A69ArtDsc[0] ;
         n69ArtDsc = P09RG6_n69ArtDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09RG6_A759ProDsc[0], A759ProDsc) == 0 ) )
         {
            brk9RG10 = false ;
            A396EmprCod = P09RG6_A396EmprCod[0] ;
            A9830MaqCodC = P09RG6_A9830MaqCodC[0] ;
            A9836FasCodM = P09RG6_A9836FasCodM[0] ;
            A758ProCod = P09RG6_A758ProCod[0] ;
            A65ArtCod = P09RG6_A65ArtCod[0] ;
            A252CliCod = P09RG6_A252CliCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9RG10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
         {
            AV40Option = A759ProDsc ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RG10 )
         {
            brk9RG10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADFASCODMOPTIONS' Routine */
      returnInSub = false ;
      AV26TFFasCodM = AV36SearchTxt ;
      AV27TFFasCodM_Sel = "" ;
      AV59Ingenieria_capfm_pwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Ingenieria_capfm_pwwds_2_tfclicod = AV14TFCliCod ;
      AV61Ingenieria_capfm_pwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV62Ingenieria_capfm_pwwds_4_tfclinom = AV16TFCliNom ;
      AV63Ingenieria_capfm_pwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV64Ingenieria_capfm_pwwds_6_tfartcod = AV18TFArtCod ;
      AV65Ingenieria_capfm_pwwds_7_tfartcod_sel = AV19TFArtCod_Sel ;
      AV66Ingenieria_capfm_pwwds_8_tfartdsc = AV20TFArtDsc ;
      AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel = AV21TFArtDsc_Sel ;
      AV68Ingenieria_capfm_pwwds_10_tfprocod = AV22TFProCod ;
      AV69Ingenieria_capfm_pwwds_11_tfprocod_sel = AV23TFProCod_Sel ;
      AV70Ingenieria_capfm_pwwds_12_tfprodsc = AV24TFProDsc ;
      AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel = AV25TFProDsc_Sel ;
      AV72Ingenieria_capfm_pwwds_14_tffascodm = AV26TFFasCodM ;
      AV73Ingenieria_capfm_pwwds_15_tffascodm_sel = AV27TFFasCodM_Sel ;
      AV74Ingenieria_capfm_pwwds_16_tfmaqcodc = AV30TFMaqCodC ;
      AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = AV31TFMaqCodC_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                           Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod) ,
                                           Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to) ,
                                           AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                           AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                           AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                           AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                           AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                           AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                           AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                           AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                           AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                           AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                           AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                           AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                           AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                           AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A9836FasCodM ,
                                           A9830MaqCodC } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV62Ingenieria_capfm_pwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV62Ingenieria_capfm_pwwds_4_tfclinom), 30, "%") ;
      lV64Ingenieria_capfm_pwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV64Ingenieria_capfm_pwwds_6_tfartcod), 16, "%") ;
      lV66Ingenieria_capfm_pwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV66Ingenieria_capfm_pwwds_8_tfartdsc), 26, "%") ;
      lV68Ingenieria_capfm_pwwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV68Ingenieria_capfm_pwwds_10_tfprocod), 8, "%") ;
      lV70Ingenieria_capfm_pwwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV70Ingenieria_capfm_pwwds_12_tfprodsc), 40, "%") ;
      lV72Ingenieria_capfm_pwwds_14_tffascodm = GXutil.padr( GXutil.rtrim( AV72Ingenieria_capfm_pwwds_14_tffascodm), 8, "%") ;
      lV74Ingenieria_capfm_pwwds_16_tfmaqcodc = GXutil.padr( GXutil.rtrim( AV74Ingenieria_capfm_pwwds_16_tfmaqcodc), 6, "%") ;
      /* Using cursor P09RG7 */
      pr_default.execute(5, new Object[] {lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod), Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to), lV62Ingenieria_capfm_pwwds_4_tfclinom, AV63Ingenieria_capfm_pwwds_5_tfclinom_sel, lV64Ingenieria_capfm_pwwds_6_tfartcod, AV65Ingenieria_capfm_pwwds_7_tfartcod_sel, lV66Ingenieria_capfm_pwwds_8_tfartdsc, AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel, lV68Ingenieria_capfm_pwwds_10_tfprocod, AV69Ingenieria_capfm_pwwds_11_tfprocod_sel, lV70Ingenieria_capfm_pwwds_12_tfprodsc, AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel, lV72Ingenieria_capfm_pwwds_14_tffascodm, AV73Ingenieria_capfm_pwwds_15_tffascodm_sel, lV74Ingenieria_capfm_pwwds_16_tfmaqcodc, AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9RG12 = false ;
         A396EmprCod = P09RG7_A396EmprCod[0] ;
         A9836FasCodM = P09RG7_A9836FasCodM[0] ;
         A9830MaqCodC = P09RG7_A9830MaqCodC[0] ;
         A759ProDsc = P09RG7_A759ProDsc[0] ;
         A758ProCod = P09RG7_A758ProCod[0] ;
         A69ArtDsc = P09RG7_A69ArtDsc[0] ;
         n69ArtDsc = P09RG7_n69ArtDsc[0] ;
         A65ArtCod = P09RG7_A65ArtCod[0] ;
         A279CliNom = P09RG7_A279CliNom[0] ;
         A252CliCod = P09RG7_A252CliCod[0] ;
         A759ProDsc = P09RG7_A759ProDsc[0] ;
         A279CliNom = P09RG7_A279CliNom[0] ;
         A69ArtDsc = P09RG7_A69ArtDsc[0] ;
         n69ArtDsc = P09RG7_n69ArtDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09RG7_A9836FasCodM[0], A9836FasCodM) == 0 ) )
         {
            brk9RG12 = false ;
            A396EmprCod = P09RG7_A396EmprCod[0] ;
            A9830MaqCodC = P09RG7_A9830MaqCodC[0] ;
            A758ProCod = P09RG7_A758ProCod[0] ;
            A65ArtCod = P09RG7_A65ArtCod[0] ;
            A252CliCod = P09RG7_A252CliCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9RG12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A9836FasCodM)==0) )
         {
            AV40Option = A9836FasCodM ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RG12 )
         {
            brk9RG12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADMAQCODCOPTIONS' Routine */
      returnInSub = false ;
      AV30TFMaqCodC = AV36SearchTxt ;
      AV31TFMaqCodC_Sel = "" ;
      AV59Ingenieria_capfm_pwwds_1_filterfulltext = AV54FilterFullText ;
      AV60Ingenieria_capfm_pwwds_2_tfclicod = AV14TFCliCod ;
      AV61Ingenieria_capfm_pwwds_3_tfclicod_to = AV15TFCliCod_To ;
      AV62Ingenieria_capfm_pwwds_4_tfclinom = AV16TFCliNom ;
      AV63Ingenieria_capfm_pwwds_5_tfclinom_sel = AV17TFCliNom_Sel ;
      AV64Ingenieria_capfm_pwwds_6_tfartcod = AV18TFArtCod ;
      AV65Ingenieria_capfm_pwwds_7_tfartcod_sel = AV19TFArtCod_Sel ;
      AV66Ingenieria_capfm_pwwds_8_tfartdsc = AV20TFArtDsc ;
      AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel = AV21TFArtDsc_Sel ;
      AV68Ingenieria_capfm_pwwds_10_tfprocod = AV22TFProCod ;
      AV69Ingenieria_capfm_pwwds_11_tfprocod_sel = AV23TFProCod_Sel ;
      AV70Ingenieria_capfm_pwwds_12_tfprodsc = AV24TFProDsc ;
      AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel = AV25TFProDsc_Sel ;
      AV72Ingenieria_capfm_pwwds_14_tffascodm = AV26TFFasCodM ;
      AV73Ingenieria_capfm_pwwds_15_tffascodm_sel = AV27TFFasCodM_Sel ;
      AV74Ingenieria_capfm_pwwds_16_tfmaqcodc = AV30TFMaqCodC ;
      AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = AV31TFMaqCodC_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                           Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod) ,
                                           Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to) ,
                                           AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                           AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                           AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                           AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                           AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                           AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                           AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                           AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                           AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                           AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                           AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                           AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                           AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                           AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           A9836FasCodM ,
                                           A9830MaqCodC } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Ingenieria_capfm_pwwds_1_filterfulltext), "%", "") ;
      lV62Ingenieria_capfm_pwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV62Ingenieria_capfm_pwwds_4_tfclinom), 30, "%") ;
      lV64Ingenieria_capfm_pwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV64Ingenieria_capfm_pwwds_6_tfartcod), 16, "%") ;
      lV66Ingenieria_capfm_pwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV66Ingenieria_capfm_pwwds_8_tfartdsc), 26, "%") ;
      lV68Ingenieria_capfm_pwwds_10_tfprocod = GXutil.padr( GXutil.rtrim( AV68Ingenieria_capfm_pwwds_10_tfprocod), 8, "%") ;
      lV70Ingenieria_capfm_pwwds_12_tfprodsc = GXutil.padr( GXutil.rtrim( AV70Ingenieria_capfm_pwwds_12_tfprodsc), 40, "%") ;
      lV72Ingenieria_capfm_pwwds_14_tffascodm = GXutil.padr( GXutil.rtrim( AV72Ingenieria_capfm_pwwds_14_tffascodm), 8, "%") ;
      lV74Ingenieria_capfm_pwwds_16_tfmaqcodc = GXutil.padr( GXutil.rtrim( AV74Ingenieria_capfm_pwwds_16_tfmaqcodc), 6, "%") ;
      /* Using cursor P09RG8 */
      pr_default.execute(6, new Object[] {lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, lV59Ingenieria_capfm_pwwds_1_filterfulltext, Integer.valueOf(AV60Ingenieria_capfm_pwwds_2_tfclicod), Integer.valueOf(AV61Ingenieria_capfm_pwwds_3_tfclicod_to), lV62Ingenieria_capfm_pwwds_4_tfclinom, AV63Ingenieria_capfm_pwwds_5_tfclinom_sel, lV64Ingenieria_capfm_pwwds_6_tfartcod, AV65Ingenieria_capfm_pwwds_7_tfartcod_sel, lV66Ingenieria_capfm_pwwds_8_tfartdsc, AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel, lV68Ingenieria_capfm_pwwds_10_tfprocod, AV69Ingenieria_capfm_pwwds_11_tfprocod_sel, lV70Ingenieria_capfm_pwwds_12_tfprodsc, AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel, lV72Ingenieria_capfm_pwwds_14_tffascodm, AV73Ingenieria_capfm_pwwds_15_tffascodm_sel, lV74Ingenieria_capfm_pwwds_16_tfmaqcodc, AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9RG14 = false ;
         A396EmprCod = P09RG8_A396EmprCod[0] ;
         A9830MaqCodC = P09RG8_A9830MaqCodC[0] ;
         A9836FasCodM = P09RG8_A9836FasCodM[0] ;
         A759ProDsc = P09RG8_A759ProDsc[0] ;
         A758ProCod = P09RG8_A758ProCod[0] ;
         A69ArtDsc = P09RG8_A69ArtDsc[0] ;
         n69ArtDsc = P09RG8_n69ArtDsc[0] ;
         A65ArtCod = P09RG8_A65ArtCod[0] ;
         A279CliNom = P09RG8_A279CliNom[0] ;
         A252CliCod = P09RG8_A252CliCod[0] ;
         A759ProDsc = P09RG8_A759ProDsc[0] ;
         A279CliNom = P09RG8_A279CliNom[0] ;
         A69ArtDsc = P09RG8_A69ArtDsc[0] ;
         n69ArtDsc = P09RG8_n69ArtDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09RG8_A9830MaqCodC[0], A9830MaqCodC) == 0 ) )
         {
            brk9RG14 = false ;
            A396EmprCod = P09RG8_A396EmprCod[0] ;
            A9836FasCodM = P09RG8_A9836FasCodM[0] ;
            A758ProCod = P09RG8_A758ProCod[0] ;
            A65ArtCod = P09RG8_A65ArtCod[0] ;
            A252CliCod = P09RG8_A252CliCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9RG14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A9830MaqCodC)==0) )
         {
            AV40Option = A9830MaqCodC ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RG14 )
         {
            brk9RG14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = capfm_pwwgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = capfm_pwwgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = capfm_pwwgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54FilterFullText = "" ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV18TFArtCod = "" ;
      AV19TFArtCod_Sel = "" ;
      AV20TFArtDsc = "" ;
      AV21TFArtDsc_Sel = "" ;
      AV22TFProCod = "" ;
      AV23TFProCod_Sel = "" ;
      AV24TFProDsc = "" ;
      AV25TFProDsc_Sel = "" ;
      AV26TFFasCodM = "" ;
      AV27TFFasCodM_Sel = "" ;
      AV30TFMaqCodC = "" ;
      AV31TFMaqCodC_Sel = "" ;
      A279CliNom = "" ;
      AV59Ingenieria_capfm_pwwds_1_filterfulltext = "" ;
      AV62Ingenieria_capfm_pwwds_4_tfclinom = "" ;
      AV63Ingenieria_capfm_pwwds_5_tfclinom_sel = "" ;
      AV64Ingenieria_capfm_pwwds_6_tfartcod = "" ;
      AV65Ingenieria_capfm_pwwds_7_tfartcod_sel = "" ;
      AV66Ingenieria_capfm_pwwds_8_tfartdsc = "" ;
      AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel = "" ;
      AV68Ingenieria_capfm_pwwds_10_tfprocod = "" ;
      AV69Ingenieria_capfm_pwwds_11_tfprocod_sel = "" ;
      AV70Ingenieria_capfm_pwwds_12_tfprodsc = "" ;
      AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel = "" ;
      AV72Ingenieria_capfm_pwwds_14_tffascodm = "" ;
      AV73Ingenieria_capfm_pwwds_15_tffascodm_sel = "" ;
      AV74Ingenieria_capfm_pwwds_16_tfmaqcodc = "" ;
      AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel = "" ;
      scmdbuf = "" ;
      lV59Ingenieria_capfm_pwwds_1_filterfulltext = "" ;
      lV62Ingenieria_capfm_pwwds_4_tfclinom = "" ;
      lV64Ingenieria_capfm_pwwds_6_tfartcod = "" ;
      lV66Ingenieria_capfm_pwwds_8_tfartdsc = "" ;
      lV68Ingenieria_capfm_pwwds_10_tfprocod = "" ;
      lV70Ingenieria_capfm_pwwds_12_tfprodsc = "" ;
      lV72Ingenieria_capfm_pwwds_14_tffascodm = "" ;
      lV74Ingenieria_capfm_pwwds_16_tfmaqcodc = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A9836FasCodM = "" ;
      A9830MaqCodC = "" ;
      P09RG2_A396EmprCod = new String[] {""} ;
      P09RG2_A279CliNom = new String[] {""} ;
      P09RG2_A9830MaqCodC = new String[] {""} ;
      P09RG2_A9836FasCodM = new String[] {""} ;
      P09RG2_A759ProDsc = new String[] {""} ;
      P09RG2_A758ProCod = new String[] {""} ;
      P09RG2_A69ArtDsc = new String[] {""} ;
      P09RG2_n69ArtDsc = new boolean[] {false} ;
      P09RG2_A65ArtCod = new String[] {""} ;
      P09RG2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV40Option = "" ;
      P09RG3_A396EmprCod = new String[] {""} ;
      P09RG3_A65ArtCod = new String[] {""} ;
      P09RG3_A9830MaqCodC = new String[] {""} ;
      P09RG3_A9836FasCodM = new String[] {""} ;
      P09RG3_A759ProDsc = new String[] {""} ;
      P09RG3_A758ProCod = new String[] {""} ;
      P09RG3_A69ArtDsc = new String[] {""} ;
      P09RG3_n69ArtDsc = new boolean[] {false} ;
      P09RG3_A279CliNom = new String[] {""} ;
      P09RG3_A252CliCod = new int[1] ;
      P09RG4_A396EmprCod = new String[] {""} ;
      P09RG4_A69ArtDsc = new String[] {""} ;
      P09RG4_n69ArtDsc = new boolean[] {false} ;
      P09RG4_A9830MaqCodC = new String[] {""} ;
      P09RG4_A9836FasCodM = new String[] {""} ;
      P09RG4_A759ProDsc = new String[] {""} ;
      P09RG4_A758ProCod = new String[] {""} ;
      P09RG4_A65ArtCod = new String[] {""} ;
      P09RG4_A279CliNom = new String[] {""} ;
      P09RG4_A252CliCod = new int[1] ;
      P09RG5_A396EmprCod = new String[] {""} ;
      P09RG5_A758ProCod = new String[] {""} ;
      P09RG5_A9830MaqCodC = new String[] {""} ;
      P09RG5_A9836FasCodM = new String[] {""} ;
      P09RG5_A759ProDsc = new String[] {""} ;
      P09RG5_A69ArtDsc = new String[] {""} ;
      P09RG5_n69ArtDsc = new boolean[] {false} ;
      P09RG5_A65ArtCod = new String[] {""} ;
      P09RG5_A279CliNom = new String[] {""} ;
      P09RG5_A252CliCod = new int[1] ;
      P09RG6_A396EmprCod = new String[] {""} ;
      P09RG6_A759ProDsc = new String[] {""} ;
      P09RG6_A9830MaqCodC = new String[] {""} ;
      P09RG6_A9836FasCodM = new String[] {""} ;
      P09RG6_A758ProCod = new String[] {""} ;
      P09RG6_A69ArtDsc = new String[] {""} ;
      P09RG6_n69ArtDsc = new boolean[] {false} ;
      P09RG6_A65ArtCod = new String[] {""} ;
      P09RG6_A279CliNom = new String[] {""} ;
      P09RG6_A252CliCod = new int[1] ;
      P09RG7_A396EmprCod = new String[] {""} ;
      P09RG7_A9836FasCodM = new String[] {""} ;
      P09RG7_A9830MaqCodC = new String[] {""} ;
      P09RG7_A759ProDsc = new String[] {""} ;
      P09RG7_A758ProCod = new String[] {""} ;
      P09RG7_A69ArtDsc = new String[] {""} ;
      P09RG7_n69ArtDsc = new boolean[] {false} ;
      P09RG7_A65ArtCod = new String[] {""} ;
      P09RG7_A279CliNom = new String[] {""} ;
      P09RG7_A252CliCod = new int[1] ;
      P09RG8_A396EmprCod = new String[] {""} ;
      P09RG8_A9830MaqCodC = new String[] {""} ;
      P09RG8_A9836FasCodM = new String[] {""} ;
      P09RG8_A759ProDsc = new String[] {""} ;
      P09RG8_A758ProCod = new String[] {""} ;
      P09RG8_A69ArtDsc = new String[] {""} ;
      P09RG8_n69ArtDsc = new boolean[] {false} ;
      P09RG8_A65ArtCod = new String[] {""} ;
      P09RG8_A279CliNom = new String[] {""} ;
      P09RG8_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.capfm_pwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09RG2_A396EmprCod, P09RG2_A279CliNom, P09RG2_A9830MaqCodC, P09RG2_A9836FasCodM, P09RG2_A759ProDsc, P09RG2_A758ProCod, P09RG2_A69ArtDsc, P09RG2_n69ArtDsc, P09RG2_A65ArtCod, P09RG2_A252CliCod
            }
            , new Object[] {
            P09RG3_A396EmprCod, P09RG3_A65ArtCod, P09RG3_A9830MaqCodC, P09RG3_A9836FasCodM, P09RG3_A759ProDsc, P09RG3_A758ProCod, P09RG3_A69ArtDsc, P09RG3_n69ArtDsc, P09RG3_A279CliNom, P09RG3_A252CliCod
            }
            , new Object[] {
            P09RG4_A396EmprCod, P09RG4_A69ArtDsc, P09RG4_n69ArtDsc, P09RG4_A9830MaqCodC, P09RG4_A9836FasCodM, P09RG4_A759ProDsc, P09RG4_A758ProCod, P09RG4_A65ArtCod, P09RG4_A279CliNom, P09RG4_A252CliCod
            }
            , new Object[] {
            P09RG5_A396EmprCod, P09RG5_A758ProCod, P09RG5_A9830MaqCodC, P09RG5_A9836FasCodM, P09RG5_A759ProDsc, P09RG5_A69ArtDsc, P09RG5_n69ArtDsc, P09RG5_A65ArtCod, P09RG5_A279CliNom, P09RG5_A252CliCod
            }
            , new Object[] {
            P09RG6_A396EmprCod, P09RG6_A759ProDsc, P09RG6_A9830MaqCodC, P09RG6_A9836FasCodM, P09RG6_A758ProCod, P09RG6_A69ArtDsc, P09RG6_n69ArtDsc, P09RG6_A65ArtCod, P09RG6_A279CliNom, P09RG6_A252CliCod
            }
            , new Object[] {
            P09RG7_A396EmprCod, P09RG7_A9836FasCodM, P09RG7_A9830MaqCodC, P09RG7_A759ProDsc, P09RG7_A758ProCod, P09RG7_A69ArtDsc, P09RG7_n69ArtDsc, P09RG7_A65ArtCod, P09RG7_A279CliNom, P09RG7_A252CliCod
            }
            , new Object[] {
            P09RG8_A396EmprCod, P09RG8_A9830MaqCodC, P09RG8_A9836FasCodM, P09RG8_A759ProDsc, P09RG8_A758ProCod, P09RG8_A69ArtDsc, P09RG8_n69ArtDsc, P09RG8_A65ArtCod, P09RG8_A279CliNom, P09RG8_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV57GXV1 ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV60Ingenieria_capfm_pwwds_2_tfclicod ;
   private int AV61Ingenieria_capfm_pwwds_3_tfclicod_to ;
   private int A252CliCod ;
   private long AV48count ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV18TFArtCod ;
   private String AV19TFArtCod_Sel ;
   private String AV20TFArtDsc ;
   private String AV21TFArtDsc_Sel ;
   private String AV22TFProCod ;
   private String AV23TFProCod_Sel ;
   private String AV24TFProDsc ;
   private String AV25TFProDsc_Sel ;
   private String AV26TFFasCodM ;
   private String AV27TFFasCodM_Sel ;
   private String AV30TFMaqCodC ;
   private String AV31TFMaqCodC_Sel ;
   private String A279CliNom ;
   private String AV62Ingenieria_capfm_pwwds_4_tfclinom ;
   private String AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ;
   private String AV64Ingenieria_capfm_pwwds_6_tfartcod ;
   private String AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ;
   private String AV66Ingenieria_capfm_pwwds_8_tfartdsc ;
   private String AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ;
   private String AV68Ingenieria_capfm_pwwds_10_tfprocod ;
   private String AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ;
   private String AV70Ingenieria_capfm_pwwds_12_tfprodsc ;
   private String AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ;
   private String AV72Ingenieria_capfm_pwwds_14_tffascodm ;
   private String AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ;
   private String AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ;
   private String AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ;
   private String scmdbuf ;
   private String lV62Ingenieria_capfm_pwwds_4_tfclinom ;
   private String lV64Ingenieria_capfm_pwwds_6_tfartcod ;
   private String lV66Ingenieria_capfm_pwwds_8_tfartdsc ;
   private String lV68Ingenieria_capfm_pwwds_10_tfprocod ;
   private String lV70Ingenieria_capfm_pwwds_12_tfprodsc ;
   private String lV72Ingenieria_capfm_pwwds_14_tffascodm ;
   private String lV74Ingenieria_capfm_pwwds_16_tfmaqcodc ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String A9836FasCodM ;
   private String A9830MaqCodC ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9RG2 ;
   private boolean n69ArtDsc ;
   private boolean brk9RG4 ;
   private boolean brk9RG6 ;
   private boolean brk9RG8 ;
   private boolean brk9RG10 ;
   private boolean brk9RG12 ;
   private boolean brk9RG14 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV54FilterFullText ;
   private String AV59Ingenieria_capfm_pwwds_1_filterfulltext ;
   private String lV59Ingenieria_capfm_pwwds_1_filterfulltext ;
   private String AV40Option ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09RG2_A396EmprCod ;
   private String[] P09RG2_A279CliNom ;
   private String[] P09RG2_A9830MaqCodC ;
   private String[] P09RG2_A9836FasCodM ;
   private String[] P09RG2_A759ProDsc ;
   private String[] P09RG2_A758ProCod ;
   private String[] P09RG2_A69ArtDsc ;
   private boolean[] P09RG2_n69ArtDsc ;
   private String[] P09RG2_A65ArtCod ;
   private int[] P09RG2_A252CliCod ;
   private String[] P09RG3_A396EmprCod ;
   private String[] P09RG3_A65ArtCod ;
   private String[] P09RG3_A9830MaqCodC ;
   private String[] P09RG3_A9836FasCodM ;
   private String[] P09RG3_A759ProDsc ;
   private String[] P09RG3_A758ProCod ;
   private String[] P09RG3_A69ArtDsc ;
   private boolean[] P09RG3_n69ArtDsc ;
   private String[] P09RG3_A279CliNom ;
   private int[] P09RG3_A252CliCod ;
   private String[] P09RG4_A396EmprCod ;
   private String[] P09RG4_A69ArtDsc ;
   private boolean[] P09RG4_n69ArtDsc ;
   private String[] P09RG4_A9830MaqCodC ;
   private String[] P09RG4_A9836FasCodM ;
   private String[] P09RG4_A759ProDsc ;
   private String[] P09RG4_A758ProCod ;
   private String[] P09RG4_A65ArtCod ;
   private String[] P09RG4_A279CliNom ;
   private int[] P09RG4_A252CliCod ;
   private String[] P09RG5_A396EmprCod ;
   private String[] P09RG5_A758ProCod ;
   private String[] P09RG5_A9830MaqCodC ;
   private String[] P09RG5_A9836FasCodM ;
   private String[] P09RG5_A759ProDsc ;
   private String[] P09RG5_A69ArtDsc ;
   private boolean[] P09RG5_n69ArtDsc ;
   private String[] P09RG5_A65ArtCod ;
   private String[] P09RG5_A279CliNom ;
   private int[] P09RG5_A252CliCod ;
   private String[] P09RG6_A396EmprCod ;
   private String[] P09RG6_A759ProDsc ;
   private String[] P09RG6_A9830MaqCodC ;
   private String[] P09RG6_A9836FasCodM ;
   private String[] P09RG6_A758ProCod ;
   private String[] P09RG6_A69ArtDsc ;
   private boolean[] P09RG6_n69ArtDsc ;
   private String[] P09RG6_A65ArtCod ;
   private String[] P09RG6_A279CliNom ;
   private int[] P09RG6_A252CliCod ;
   private String[] P09RG7_A396EmprCod ;
   private String[] P09RG7_A9836FasCodM ;
   private String[] P09RG7_A9830MaqCodC ;
   private String[] P09RG7_A759ProDsc ;
   private String[] P09RG7_A758ProCod ;
   private String[] P09RG7_A69ArtDsc ;
   private boolean[] P09RG7_n69ArtDsc ;
   private String[] P09RG7_A65ArtCod ;
   private String[] P09RG7_A279CliNom ;
   private int[] P09RG7_A252CliCod ;
   private String[] P09RG8_A396EmprCod ;
   private String[] P09RG8_A9830MaqCodC ;
   private String[] P09RG8_A9836FasCodM ;
   private String[] P09RG8_A759ProDsc ;
   private String[] P09RG8_A758ProCod ;
   private String[] P09RG8_A69ArtDsc ;
   private boolean[] P09RG8_n69ArtDsc ;
   private String[] P09RG8_A65ArtCod ;
   private String[] P09RG8_A279CliNom ;
   private int[] P09RG8_A252CliCod ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class capfm_pwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                          int AV60Ingenieria_capfm_pwwds_2_tfclicod ,
                                          int AV61Ingenieria_capfm_pwwds_3_tfclicod_to ,
                                          String AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                          String AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                          String AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                          String AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                          String AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                          String AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                          String AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                          String AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                          String AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                          String AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                          String AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                          String AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                          String AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                          String AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A9836FasCodM ,
                                          String A9830MaqCodC )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.CliNom, T1.MaqCodC, T1.FasCodM, T2.ProDsc, T1.ProCod, T4.ArtDsc, T1.ArtCod, T1.CliCod FROM (((TXPCAPFM1 T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV59Ingenieria_capfm_pwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T4.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCodM) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodC) like '%' || UPPER(?)))");
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
      if ( ! (0==AV60Ingenieria_capfm_pwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV61Ingenieria_capfm_pwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Ingenieria_capfm_pwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Ingenieria_capfm_pwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ingenieria_capfm_pwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ArtDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV68Ingenieria_capfm_pwwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_capfm_pwwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_capfm_pwwds_14_tffascodm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodM = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_capfm_pwwds_16_tfmaqcodc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodC = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09RG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                          int AV60Ingenieria_capfm_pwwds_2_tfclicod ,
                                          int AV61Ingenieria_capfm_pwwds_3_tfclicod_to ,
                                          String AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                          String AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                          String AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                          String AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                          String AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                          String AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                          String AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                          String AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                          String AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                          String AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                          String AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                          String AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                          String AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                          String AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A9836FasCodM ,
                                          String A9830MaqCodC )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ArtCod, T1.MaqCodC, T1.FasCodM, T2.ProDsc, T1.ProCod, T4.ArtDsc, T3.CliNom, T1.CliCod FROM (((TXPCAPFM1 T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV59Ingenieria_capfm_pwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T4.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCodM) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodC) like '%' || UPPER(?)))");
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
      if ( ! (0==AV60Ingenieria_capfm_pwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV61Ingenieria_capfm_pwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Ingenieria_capfm_pwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Ingenieria_capfm_pwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ingenieria_capfm_pwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ArtDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV68Ingenieria_capfm_pwwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_capfm_pwwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_capfm_pwwds_14_tffascodm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodM = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_capfm_pwwds_16_tfmaqcodc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodC = ?)");
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

   protected Object[] conditional_P09RG4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                          int AV60Ingenieria_capfm_pwwds_2_tfclicod ,
                                          int AV61Ingenieria_capfm_pwwds_3_tfclicod_to ,
                                          String AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                          String AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                          String AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                          String AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                          String AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                          String AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                          String AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                          String AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                          String AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                          String AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                          String AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                          String AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                          String AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                          String AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A9836FasCodM ,
                                          String A9830MaqCodC )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T4.ArtDsc, T1.MaqCodC, T1.FasCodM, T2.ProDsc, T1.ProCod, T1.ArtCod, T3.CliNom, T1.CliCod FROM (((TXPCAPFM1 T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV59Ingenieria_capfm_pwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T4.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCodM) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodC) like '%' || UPPER(?)))");
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
      if ( ! (0==AV60Ingenieria_capfm_pwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV61Ingenieria_capfm_pwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Ingenieria_capfm_pwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Ingenieria_capfm_pwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ingenieria_capfm_pwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV68Ingenieria_capfm_pwwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_capfm_pwwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_capfm_pwwds_14_tffascodm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodM = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_capfm_pwwds_16_tfmaqcodc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodC = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.ArtDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09RG5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                          int AV60Ingenieria_capfm_pwwds_2_tfclicod ,
                                          int AV61Ingenieria_capfm_pwwds_3_tfclicod_to ,
                                          String AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                          String AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                          String AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                          String AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                          String AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                          String AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                          String AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                          String AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                          String AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                          String AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                          String AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                          String AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                          String AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                          String AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A9836FasCodM ,
                                          String A9830MaqCodC )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T1.MaqCodC, T1.FasCodM, T2.ProDsc, T4.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod FROM (((TXPCAPFM1 T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV59Ingenieria_capfm_pwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T4.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCodM) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodC) like '%' || UPPER(?)))");
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
      if ( ! (0==AV60Ingenieria_capfm_pwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV61Ingenieria_capfm_pwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Ingenieria_capfm_pwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Ingenieria_capfm_pwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ingenieria_capfm_pwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ArtDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV68Ingenieria_capfm_pwwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_capfm_pwwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_capfm_pwwds_14_tffascodm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodM = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_capfm_pwwds_16_tfmaqcodc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodC = ?)");
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

   protected Object[] conditional_P09RG6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                          int AV60Ingenieria_capfm_pwwds_2_tfclicod ,
                                          int AV61Ingenieria_capfm_pwwds_3_tfclicod_to ,
                                          String AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                          String AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                          String AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                          String AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                          String AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                          String AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                          String AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                          String AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                          String AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                          String AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                          String AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                          String AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                          String AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                          String AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A9836FasCodM ,
                                          String A9830MaqCodC )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[24];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ProDsc, T1.MaqCodC, T1.FasCodM, T1.ProCod, T4.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod FROM (((TXPCAPFM1 T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV59Ingenieria_capfm_pwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T4.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCodM) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodC) like '%' || UPPER(?)))");
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
      if ( ! (0==AV60Ingenieria_capfm_pwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV61Ingenieria_capfm_pwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Ingenieria_capfm_pwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Ingenieria_capfm_pwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ingenieria_capfm_pwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ArtDsc = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV68Ingenieria_capfm_pwwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_capfm_pwwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_capfm_pwwds_14_tffascodm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodM = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_capfm_pwwds_16_tfmaqcodc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodC = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.ProDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09RG7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                          int AV60Ingenieria_capfm_pwwds_2_tfclicod ,
                                          int AV61Ingenieria_capfm_pwwds_3_tfclicod_to ,
                                          String AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                          String AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                          String AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                          String AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                          String AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                          String AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                          String AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                          String AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                          String AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                          String AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                          String AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                          String AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                          String AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                          String AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A9836FasCodM ,
                                          String A9830MaqCodC )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[24];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCodM, T1.MaqCodC, T2.ProDsc, T1.ProCod, T4.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod FROM (((TXPCAPFM1 T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV59Ingenieria_capfm_pwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T4.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCodM) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodC) like '%' || UPPER(?)))");
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
      if ( ! (0==AV60Ingenieria_capfm_pwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV61Ingenieria_capfm_pwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Ingenieria_capfm_pwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Ingenieria_capfm_pwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ingenieria_capfm_pwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ArtDsc = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV68Ingenieria_capfm_pwwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_capfm_pwwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_capfm_pwwds_14_tffascodm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodM = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_capfm_pwwds_16_tfmaqcodc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodC = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FasCodM" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09RG8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Ingenieria_capfm_pwwds_1_filterfulltext ,
                                          int AV60Ingenieria_capfm_pwwds_2_tfclicod ,
                                          int AV61Ingenieria_capfm_pwwds_3_tfclicod_to ,
                                          String AV63Ingenieria_capfm_pwwds_5_tfclinom_sel ,
                                          String AV62Ingenieria_capfm_pwwds_4_tfclinom ,
                                          String AV65Ingenieria_capfm_pwwds_7_tfartcod_sel ,
                                          String AV64Ingenieria_capfm_pwwds_6_tfartcod ,
                                          String AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel ,
                                          String AV66Ingenieria_capfm_pwwds_8_tfartdsc ,
                                          String AV69Ingenieria_capfm_pwwds_11_tfprocod_sel ,
                                          String AV68Ingenieria_capfm_pwwds_10_tfprocod ,
                                          String AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel ,
                                          String AV70Ingenieria_capfm_pwwds_12_tfprodsc ,
                                          String AV73Ingenieria_capfm_pwwds_15_tffascodm_sel ,
                                          String AV72Ingenieria_capfm_pwwds_14_tffascodm ,
                                          String AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel ,
                                          String AV74Ingenieria_capfm_pwwds_16_tfmaqcodc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          String A9836FasCodM ,
                                          String A9830MaqCodC )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[24];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCodC, T1.FasCodM, T2.ProDsc, T1.ProCod, T4.ArtDsc, T1.ArtCod, T3.CliNom, T1.CliCod FROM (((TXPCAPFM1 T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.CliCod = T1.CliCod AND T4.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV59Ingenieria_capfm_pwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T4.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.ProCod) like '%' || UPPER(?)) or ( UPPER(T2.ProDsc) like '%' || UPPER(?)) or ( UPPER(T1.FasCodM) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodC) like '%' || UPPER(?)))");
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
      if ( ! (0==AV60Ingenieria_capfm_pwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV61Ingenieria_capfm_pwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Ingenieria_capfm_pwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Ingenieria_capfm_pwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV64Ingenieria_capfm_pwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ingenieria_capfm_pwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Ingenieria_capfm_pwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Ingenieria_capfm_pwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ArtDsc = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV68Ingenieria_capfm_pwwds_10_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Ingenieria_capfm_pwwds_11_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV70Ingenieria_capfm_pwwds_12_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Ingenieria_capfm_pwwds_13_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) && ( ! (GXutil.strcmp("", AV72Ingenieria_capfm_pwwds_14_tffascodm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodM) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Ingenieria_capfm_pwwds_15_tffascodm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodM = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ingenieria_capfm_pwwds_16_tfmaqcodc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ingenieria_capfm_pwwds_17_tfmaqcodc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodC = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqCodC" ;
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
                  return conditional_P09RG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P09RG3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P09RG4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 3 :
                  return conditional_P09RG5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 4 :
                  return conditional_P09RG6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 5 :
                  return conditional_P09RG7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 6 :
                  return conditional_P09RG8(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RG4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RG5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RG6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RG7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RG8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               return;
      }
   }

}

