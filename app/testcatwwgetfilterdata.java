package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class testcatwwgetfilterdata extends GXProcedure
{
   public testcatwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( testcatwwgetfilterdata.class ), "" );
   }

   public testcatwwgetfilterdata( int remoteHandle ,
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
      testcatwwgetfilterdata.this.aP5 = new String[] {""};
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
      testcatwwgetfilterdata.this.AV42DDOName = aP0;
      testcatwwgetfilterdata.this.AV43SearchTxt = aP1;
      testcatwwgetfilterdata.this.AV44SearchTxtTo = aP2;
      testcatwwgetfilterdata.this.aP3 = aP3;
      testcatwwgetfilterdata.this.aP4 = aP4;
      testcatwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_ARTCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_ESTCATSER") == 0 )
      {
         /* Execute user subroutine: 'LOADESTCATSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_ESTCATDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADESTCATDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV45OptionsJson = AV32Options.toJSonString(false) ;
      AV46OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV35OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("TESTCATWWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TESTCATWWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TESTCATWWGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV14TFArtCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV15TFArtCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATANY") == 0 )
         {
            AV16TFEstCatAny = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFEstCatAny_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER") == 0 )
         {
            AV18TFEstCatSer = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATSER_SEL") == 0 )
         {
            AV19TFEstCatSer_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATTIP") == 0 )
         {
            AV20TFEstCatTip = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFEstCatTip_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC") == 0 )
         {
            AV22TFEstCatDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATDSC_SEL") == 0 )
         {
            AV23TFEstCatDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM0") == 0 )
         {
            AV24TFEstCatAIm0 = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFEstCatAIm0_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATAIM1") == 0 )
         {
            AV26TFEstCatAIm1 = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFEstCatAIm1_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCATORD0") == 0 )
         {
            AV28TFEstCatOrd0 = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFEstCatOrd0_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV43SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV53Testcatwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Testcatwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Testcatwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Testcatwwds_4_tfclicod = AV12TFCliCod ;
      AV57Testcatwwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Testcatwwds_6_tfartcod = AV14TFArtCod ;
      AV59Testcatwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV60Testcatwwds_8_tfestcatany = AV16TFEstCatAny ;
      AV61Testcatwwds_9_tfestcatany_to = AV17TFEstCatAny_To ;
      AV62Testcatwwds_10_tfestcatser = AV18TFEstCatSer ;
      AV63Testcatwwds_11_tfestcatser_sel = AV19TFEstCatSer_Sel ;
      AV64Testcatwwds_12_tfestcattip = AV20TFEstCatTip ;
      AV65Testcatwwds_13_tfestcattip_to = AV21TFEstCatTip_To ;
      AV66Testcatwwds_14_tfestcatdsc = AV22TFEstCatDsc ;
      AV67Testcatwwds_15_tfestcatdsc_sel = AV23TFEstCatDsc_Sel ;
      AV68Testcatwwds_16_tfestcataim0 = AV24TFEstCatAIm0 ;
      AV69Testcatwwds_17_tfestcataim0_to = AV25TFEstCatAIm0_To ;
      AV70Testcatwwds_18_tfestcataim1 = AV26TFEstCatAIm1 ;
      AV71Testcatwwds_19_tfestcataim1_to = AV27TFEstCatAIm1_To ;
      AV72Testcatwwds_20_tfestcatord0 = AV28TFEstCatOrd0 ;
      AV73Testcatwwds_21_tfestcatord0_to = AV29TFEstCatOrd0_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Testcatwwds_1_filterfulltext ,
                                           AV55Testcatwwds_3_tfemprcod_sel ,
                                           AV54Testcatwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Testcatwwds_4_tfclicod) ,
                                           Integer.valueOf(AV57Testcatwwds_5_tfclicod_to) ,
                                           AV59Testcatwwds_7_tfartcod_sel ,
                                           AV58Testcatwwds_6_tfartcod ,
                                           Short.valueOf(AV60Testcatwwds_8_tfestcatany) ,
                                           Short.valueOf(AV61Testcatwwds_9_tfestcatany_to) ,
                                           AV63Testcatwwds_11_tfestcatser_sel ,
                                           AV62Testcatwwds_10_tfestcatser ,
                                           Short.valueOf(AV64Testcatwwds_12_tfestcattip) ,
                                           Short.valueOf(AV65Testcatwwds_13_tfestcattip_to) ,
                                           AV67Testcatwwds_15_tfestcatdsc_sel ,
                                           AV66Testcatwwds_14_tfestcatdsc ,
                                           AV68Testcatwwds_16_tfestcataim0 ,
                                           AV69Testcatwwds_17_tfestcataim0_to ,
                                           AV70Testcatwwds_18_tfestcataim1 ,
                                           AV71Testcatwwds_19_tfestcataim1_to ,
                                           AV72Testcatwwds_20_tfestcatord0 ,
                                           AV73Testcatwwds_21_tfestcatord0_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           Short.valueOf(A5382EstCatAny) ,
                                           A5383EstCatSer ,
                                           Short.valueOf(A5384EstCatTip) ,
                                           A5385EstCatDsc ,
                                           A5386EstCatAIm0 ,
                                           A5387EstCatAIm1 ,
                                           A5388EstCatOrd0 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV54Testcatwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Testcatwwds_2_tfemprcod), 3, "%") ;
      lV58Testcatwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV58Testcatwwds_6_tfartcod), 16, "%") ;
      lV62Testcatwwds_10_tfestcatser = GXutil.padr( GXutil.rtrim( AV62Testcatwwds_10_tfestcatser), 3, "%") ;
      lV66Testcatwwds_14_tfestcatdsc = GXutil.padr( GXutil.rtrim( AV66Testcatwwds_14_tfestcatdsc), 30, "%") ;
      /* Using cursor P0AL83 */
      pr_default.execute(0, new Object[] {lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV54Testcatwwds_2_tfemprcod, AV55Testcatwwds_3_tfemprcod_sel, Integer.valueOf(AV56Testcatwwds_4_tfclicod), Integer.valueOf(AV57Testcatwwds_5_tfclicod_to), lV58Testcatwwds_6_tfartcod, AV59Testcatwwds_7_tfartcod_sel, Short.valueOf(AV60Testcatwwds_8_tfestcatany), Short.valueOf(AV61Testcatwwds_9_tfestcatany_to), lV62Testcatwwds_10_tfestcatser, AV63Testcatwwds_11_tfestcatser_sel, Short.valueOf(AV64Testcatwwds_12_tfestcattip), Short.valueOf(AV65Testcatwwds_13_tfestcattip_to), lV66Testcatwwds_14_tfestcatdsc, AV67Testcatwwds_15_tfestcatdsc_sel, AV68Testcatwwds_16_tfestcataim0, AV69Testcatwwds_17_tfestcataim0_to, AV70Testcatwwds_18_tfestcataim1, AV71Testcatwwds_19_tfestcataim1_to, AV72Testcatwwds_20_tfestcatord0, AV73Testcatwwds_21_tfestcatord0_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAL82 = false ;
         A396EmprCod = P0AL83_A396EmprCod[0] ;
         A5388EstCatOrd0 = P0AL83_A5388EstCatOrd0[0] ;
         n5388EstCatOrd0 = P0AL83_n5388EstCatOrd0[0] ;
         A5385EstCatDsc = P0AL83_A5385EstCatDsc[0] ;
         n5385EstCatDsc = P0AL83_n5385EstCatDsc[0] ;
         A5384EstCatTip = P0AL83_A5384EstCatTip[0] ;
         A5383EstCatSer = P0AL83_A5383EstCatSer[0] ;
         A5382EstCatAny = P0AL83_A5382EstCatAny[0] ;
         A65ArtCod = P0AL83_A65ArtCod[0] ;
         A252CliCod = P0AL83_A252CliCod[0] ;
         A5387EstCatAIm1 = P0AL83_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL83_A5386EstCatAIm0[0] ;
         A5387EstCatAIm1 = P0AL83_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL83_A5386EstCatAIm0[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AL83_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brkAL82 = false ;
            A5384EstCatTip = P0AL83_A5384EstCatTip[0] ;
            A5383EstCatSer = P0AL83_A5383EstCatSer[0] ;
            A5382EstCatAny = P0AL83_A5382EstCatAny[0] ;
            A65ArtCod = P0AL83_A65ArtCod[0] ;
            A252CliCod = P0AL83_A252CliCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAL82 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV31Option = A396EmprCod ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV32Options.add(AV31Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAL82 )
         {
            brkAL82 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFArtCod = AV43SearchTxt ;
      AV15TFArtCod_Sel = "" ;
      AV53Testcatwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Testcatwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Testcatwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Testcatwwds_4_tfclicod = AV12TFCliCod ;
      AV57Testcatwwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Testcatwwds_6_tfartcod = AV14TFArtCod ;
      AV59Testcatwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV60Testcatwwds_8_tfestcatany = AV16TFEstCatAny ;
      AV61Testcatwwds_9_tfestcatany_to = AV17TFEstCatAny_To ;
      AV62Testcatwwds_10_tfestcatser = AV18TFEstCatSer ;
      AV63Testcatwwds_11_tfestcatser_sel = AV19TFEstCatSer_Sel ;
      AV64Testcatwwds_12_tfestcattip = AV20TFEstCatTip ;
      AV65Testcatwwds_13_tfestcattip_to = AV21TFEstCatTip_To ;
      AV66Testcatwwds_14_tfestcatdsc = AV22TFEstCatDsc ;
      AV67Testcatwwds_15_tfestcatdsc_sel = AV23TFEstCatDsc_Sel ;
      AV68Testcatwwds_16_tfestcataim0 = AV24TFEstCatAIm0 ;
      AV69Testcatwwds_17_tfestcataim0_to = AV25TFEstCatAIm0_To ;
      AV70Testcatwwds_18_tfestcataim1 = AV26TFEstCatAIm1 ;
      AV71Testcatwwds_19_tfestcataim1_to = AV27TFEstCatAIm1_To ;
      AV72Testcatwwds_20_tfestcatord0 = AV28TFEstCatOrd0 ;
      AV73Testcatwwds_21_tfestcatord0_to = AV29TFEstCatOrd0_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV53Testcatwwds_1_filterfulltext ,
                                           AV55Testcatwwds_3_tfemprcod_sel ,
                                           AV54Testcatwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Testcatwwds_4_tfclicod) ,
                                           Integer.valueOf(AV57Testcatwwds_5_tfclicod_to) ,
                                           AV59Testcatwwds_7_tfartcod_sel ,
                                           AV58Testcatwwds_6_tfartcod ,
                                           Short.valueOf(AV60Testcatwwds_8_tfestcatany) ,
                                           Short.valueOf(AV61Testcatwwds_9_tfestcatany_to) ,
                                           AV63Testcatwwds_11_tfestcatser_sel ,
                                           AV62Testcatwwds_10_tfestcatser ,
                                           Short.valueOf(AV64Testcatwwds_12_tfestcattip) ,
                                           Short.valueOf(AV65Testcatwwds_13_tfestcattip_to) ,
                                           AV67Testcatwwds_15_tfestcatdsc_sel ,
                                           AV66Testcatwwds_14_tfestcatdsc ,
                                           AV68Testcatwwds_16_tfestcataim0 ,
                                           AV69Testcatwwds_17_tfestcataim0_to ,
                                           AV70Testcatwwds_18_tfestcataim1 ,
                                           AV71Testcatwwds_19_tfestcataim1_to ,
                                           AV72Testcatwwds_20_tfestcatord0 ,
                                           AV73Testcatwwds_21_tfestcatord0_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           Short.valueOf(A5382EstCatAny) ,
                                           A5383EstCatSer ,
                                           Short.valueOf(A5384EstCatTip) ,
                                           A5385EstCatDsc ,
                                           A5386EstCatAIm0 ,
                                           A5387EstCatAIm1 ,
                                           A5388EstCatOrd0 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV54Testcatwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Testcatwwds_2_tfemprcod), 3, "%") ;
      lV58Testcatwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV58Testcatwwds_6_tfartcod), 16, "%") ;
      lV62Testcatwwds_10_tfestcatser = GXutil.padr( GXutil.rtrim( AV62Testcatwwds_10_tfestcatser), 3, "%") ;
      lV66Testcatwwds_14_tfestcatdsc = GXutil.padr( GXutil.rtrim( AV66Testcatwwds_14_tfestcatdsc), 30, "%") ;
      /* Using cursor P0AL85 */
      pr_default.execute(1, new Object[] {lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV54Testcatwwds_2_tfemprcod, AV55Testcatwwds_3_tfemprcod_sel, Integer.valueOf(AV56Testcatwwds_4_tfclicod), Integer.valueOf(AV57Testcatwwds_5_tfclicod_to), lV58Testcatwwds_6_tfartcod, AV59Testcatwwds_7_tfartcod_sel, Short.valueOf(AV60Testcatwwds_8_tfestcatany), Short.valueOf(AV61Testcatwwds_9_tfestcatany_to), lV62Testcatwwds_10_tfestcatser, AV63Testcatwwds_11_tfestcatser_sel, Short.valueOf(AV64Testcatwwds_12_tfestcattip), Short.valueOf(AV65Testcatwwds_13_tfestcattip_to), lV66Testcatwwds_14_tfestcatdsc, AV67Testcatwwds_15_tfestcatdsc_sel, AV68Testcatwwds_16_tfestcataim0, AV69Testcatwwds_17_tfestcataim0_to, AV70Testcatwwds_18_tfestcataim1, AV71Testcatwwds_19_tfestcataim1_to, AV72Testcatwwds_20_tfestcatord0, AV73Testcatwwds_21_tfestcatord0_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAL84 = false ;
         A65ArtCod = P0AL85_A65ArtCod[0] ;
         A5388EstCatOrd0 = P0AL85_A5388EstCatOrd0[0] ;
         n5388EstCatOrd0 = P0AL85_n5388EstCatOrd0[0] ;
         A5385EstCatDsc = P0AL85_A5385EstCatDsc[0] ;
         n5385EstCatDsc = P0AL85_n5385EstCatDsc[0] ;
         A5384EstCatTip = P0AL85_A5384EstCatTip[0] ;
         A5383EstCatSer = P0AL85_A5383EstCatSer[0] ;
         A5382EstCatAny = P0AL85_A5382EstCatAny[0] ;
         A252CliCod = P0AL85_A252CliCod[0] ;
         A396EmprCod = P0AL85_A396EmprCod[0] ;
         A5387EstCatAIm1 = P0AL85_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL85_A5386EstCatAIm0[0] ;
         A5387EstCatAIm1 = P0AL85_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL85_A5386EstCatAIm0[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AL85_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brkAL84 = false ;
            A5384EstCatTip = P0AL85_A5384EstCatTip[0] ;
            A5383EstCatSer = P0AL85_A5383EstCatSer[0] ;
            A5382EstCatAny = P0AL85_A5382EstCatAny[0] ;
            A252CliCod = P0AL85_A252CliCod[0] ;
            A396EmprCod = P0AL85_A396EmprCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAL84 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV31Option = A65ArtCod ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAL84 )
         {
            brkAL84 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADESTCATSEROPTIONS' Routine */
      returnInSub = false ;
      AV18TFEstCatSer = AV43SearchTxt ;
      AV19TFEstCatSer_Sel = "" ;
      AV53Testcatwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Testcatwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Testcatwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Testcatwwds_4_tfclicod = AV12TFCliCod ;
      AV57Testcatwwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Testcatwwds_6_tfartcod = AV14TFArtCod ;
      AV59Testcatwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV60Testcatwwds_8_tfestcatany = AV16TFEstCatAny ;
      AV61Testcatwwds_9_tfestcatany_to = AV17TFEstCatAny_To ;
      AV62Testcatwwds_10_tfestcatser = AV18TFEstCatSer ;
      AV63Testcatwwds_11_tfestcatser_sel = AV19TFEstCatSer_Sel ;
      AV64Testcatwwds_12_tfestcattip = AV20TFEstCatTip ;
      AV65Testcatwwds_13_tfestcattip_to = AV21TFEstCatTip_To ;
      AV66Testcatwwds_14_tfestcatdsc = AV22TFEstCatDsc ;
      AV67Testcatwwds_15_tfestcatdsc_sel = AV23TFEstCatDsc_Sel ;
      AV68Testcatwwds_16_tfestcataim0 = AV24TFEstCatAIm0 ;
      AV69Testcatwwds_17_tfestcataim0_to = AV25TFEstCatAIm0_To ;
      AV70Testcatwwds_18_tfestcataim1 = AV26TFEstCatAIm1 ;
      AV71Testcatwwds_19_tfestcataim1_to = AV27TFEstCatAIm1_To ;
      AV72Testcatwwds_20_tfestcatord0 = AV28TFEstCatOrd0 ;
      AV73Testcatwwds_21_tfestcatord0_to = AV29TFEstCatOrd0_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV53Testcatwwds_1_filterfulltext ,
                                           AV55Testcatwwds_3_tfemprcod_sel ,
                                           AV54Testcatwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Testcatwwds_4_tfclicod) ,
                                           Integer.valueOf(AV57Testcatwwds_5_tfclicod_to) ,
                                           AV59Testcatwwds_7_tfartcod_sel ,
                                           AV58Testcatwwds_6_tfartcod ,
                                           Short.valueOf(AV60Testcatwwds_8_tfestcatany) ,
                                           Short.valueOf(AV61Testcatwwds_9_tfestcatany_to) ,
                                           AV63Testcatwwds_11_tfestcatser_sel ,
                                           AV62Testcatwwds_10_tfestcatser ,
                                           Short.valueOf(AV64Testcatwwds_12_tfestcattip) ,
                                           Short.valueOf(AV65Testcatwwds_13_tfestcattip_to) ,
                                           AV67Testcatwwds_15_tfestcatdsc_sel ,
                                           AV66Testcatwwds_14_tfestcatdsc ,
                                           AV68Testcatwwds_16_tfestcataim0 ,
                                           AV69Testcatwwds_17_tfestcataim0_to ,
                                           AV70Testcatwwds_18_tfestcataim1 ,
                                           AV71Testcatwwds_19_tfestcataim1_to ,
                                           AV72Testcatwwds_20_tfestcatord0 ,
                                           AV73Testcatwwds_21_tfestcatord0_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           Short.valueOf(A5382EstCatAny) ,
                                           A5383EstCatSer ,
                                           Short.valueOf(A5384EstCatTip) ,
                                           A5385EstCatDsc ,
                                           A5386EstCatAIm0 ,
                                           A5387EstCatAIm1 ,
                                           A5388EstCatOrd0 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV54Testcatwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Testcatwwds_2_tfemprcod), 3, "%") ;
      lV58Testcatwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV58Testcatwwds_6_tfartcod), 16, "%") ;
      lV62Testcatwwds_10_tfestcatser = GXutil.padr( GXutil.rtrim( AV62Testcatwwds_10_tfestcatser), 3, "%") ;
      lV66Testcatwwds_14_tfestcatdsc = GXutil.padr( GXutil.rtrim( AV66Testcatwwds_14_tfestcatdsc), 30, "%") ;
      /* Using cursor P0AL87 */
      pr_default.execute(2, new Object[] {lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV54Testcatwwds_2_tfemprcod, AV55Testcatwwds_3_tfemprcod_sel, Integer.valueOf(AV56Testcatwwds_4_tfclicod), Integer.valueOf(AV57Testcatwwds_5_tfclicod_to), lV58Testcatwwds_6_tfartcod, AV59Testcatwwds_7_tfartcod_sel, Short.valueOf(AV60Testcatwwds_8_tfestcatany), Short.valueOf(AV61Testcatwwds_9_tfestcatany_to), lV62Testcatwwds_10_tfestcatser, AV63Testcatwwds_11_tfestcatser_sel, Short.valueOf(AV64Testcatwwds_12_tfestcattip), Short.valueOf(AV65Testcatwwds_13_tfestcattip_to), lV66Testcatwwds_14_tfestcatdsc, AV67Testcatwwds_15_tfestcatdsc_sel, AV68Testcatwwds_16_tfestcataim0, AV69Testcatwwds_17_tfestcataim0_to, AV70Testcatwwds_18_tfestcataim1, AV71Testcatwwds_19_tfestcataim1_to, AV72Testcatwwds_20_tfestcatord0, AV73Testcatwwds_21_tfestcatord0_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAL86 = false ;
         A5383EstCatSer = P0AL87_A5383EstCatSer[0] ;
         A5388EstCatOrd0 = P0AL87_A5388EstCatOrd0[0] ;
         n5388EstCatOrd0 = P0AL87_n5388EstCatOrd0[0] ;
         A5385EstCatDsc = P0AL87_A5385EstCatDsc[0] ;
         n5385EstCatDsc = P0AL87_n5385EstCatDsc[0] ;
         A5384EstCatTip = P0AL87_A5384EstCatTip[0] ;
         A5382EstCatAny = P0AL87_A5382EstCatAny[0] ;
         A65ArtCod = P0AL87_A65ArtCod[0] ;
         A252CliCod = P0AL87_A252CliCod[0] ;
         A396EmprCod = P0AL87_A396EmprCod[0] ;
         A5387EstCatAIm1 = P0AL87_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL87_A5386EstCatAIm0[0] ;
         A5387EstCatAIm1 = P0AL87_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL87_A5386EstCatAIm0[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AL87_A5383EstCatSer[0], A5383EstCatSer) == 0 ) )
         {
            brkAL86 = false ;
            A5384EstCatTip = P0AL87_A5384EstCatTip[0] ;
            A5382EstCatAny = P0AL87_A5382EstCatAny[0] ;
            A65ArtCod = P0AL87_A65ArtCod[0] ;
            A252CliCod = P0AL87_A252CliCod[0] ;
            A396EmprCod = P0AL87_A396EmprCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAL86 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5383EstCatSer)==0) )
         {
            AV31Option = A5383EstCatSer ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAL86 )
         {
            brkAL86 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADESTCATDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFEstCatDsc = AV43SearchTxt ;
      AV23TFEstCatDsc_Sel = "" ;
      AV53Testcatwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Testcatwwds_2_tfemprcod = AV10TFEmprCod ;
      AV55Testcatwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV56Testcatwwds_4_tfclicod = AV12TFCliCod ;
      AV57Testcatwwds_5_tfclicod_to = AV13TFCliCod_To ;
      AV58Testcatwwds_6_tfartcod = AV14TFArtCod ;
      AV59Testcatwwds_7_tfartcod_sel = AV15TFArtCod_Sel ;
      AV60Testcatwwds_8_tfestcatany = AV16TFEstCatAny ;
      AV61Testcatwwds_9_tfestcatany_to = AV17TFEstCatAny_To ;
      AV62Testcatwwds_10_tfestcatser = AV18TFEstCatSer ;
      AV63Testcatwwds_11_tfestcatser_sel = AV19TFEstCatSer_Sel ;
      AV64Testcatwwds_12_tfestcattip = AV20TFEstCatTip ;
      AV65Testcatwwds_13_tfestcattip_to = AV21TFEstCatTip_To ;
      AV66Testcatwwds_14_tfestcatdsc = AV22TFEstCatDsc ;
      AV67Testcatwwds_15_tfestcatdsc_sel = AV23TFEstCatDsc_Sel ;
      AV68Testcatwwds_16_tfestcataim0 = AV24TFEstCatAIm0 ;
      AV69Testcatwwds_17_tfestcataim0_to = AV25TFEstCatAIm0_To ;
      AV70Testcatwwds_18_tfestcataim1 = AV26TFEstCatAIm1 ;
      AV71Testcatwwds_19_tfestcataim1_to = AV27TFEstCatAIm1_To ;
      AV72Testcatwwds_20_tfestcatord0 = AV28TFEstCatOrd0 ;
      AV73Testcatwwds_21_tfestcatord0_to = AV29TFEstCatOrd0_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV53Testcatwwds_1_filterfulltext ,
                                           AV55Testcatwwds_3_tfemprcod_sel ,
                                           AV54Testcatwwds_2_tfemprcod ,
                                           Integer.valueOf(AV56Testcatwwds_4_tfclicod) ,
                                           Integer.valueOf(AV57Testcatwwds_5_tfclicod_to) ,
                                           AV59Testcatwwds_7_tfartcod_sel ,
                                           AV58Testcatwwds_6_tfartcod ,
                                           Short.valueOf(AV60Testcatwwds_8_tfestcatany) ,
                                           Short.valueOf(AV61Testcatwwds_9_tfestcatany_to) ,
                                           AV63Testcatwwds_11_tfestcatser_sel ,
                                           AV62Testcatwwds_10_tfestcatser ,
                                           Short.valueOf(AV64Testcatwwds_12_tfestcattip) ,
                                           Short.valueOf(AV65Testcatwwds_13_tfestcattip_to) ,
                                           AV67Testcatwwds_15_tfestcatdsc_sel ,
                                           AV66Testcatwwds_14_tfestcatdsc ,
                                           AV68Testcatwwds_16_tfestcataim0 ,
                                           AV69Testcatwwds_17_tfestcataim0_to ,
                                           AV70Testcatwwds_18_tfestcataim1 ,
                                           AV71Testcatwwds_19_tfestcataim1_to ,
                                           AV72Testcatwwds_20_tfestcatord0 ,
                                           AV73Testcatwwds_21_tfestcatord0_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A65ArtCod ,
                                           Short.valueOf(A5382EstCatAny) ,
                                           A5383EstCatSer ,
                                           Short.valueOf(A5384EstCatTip) ,
                                           A5385EstCatDsc ,
                                           A5386EstCatAIm0 ,
                                           A5387EstCatAIm1 ,
                                           A5388EstCatOrd0 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV53Testcatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Testcatwwds_1_filterfulltext), "%", "") ;
      lV54Testcatwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV54Testcatwwds_2_tfemprcod), 3, "%") ;
      lV58Testcatwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV58Testcatwwds_6_tfartcod), 16, "%") ;
      lV62Testcatwwds_10_tfestcatser = GXutil.padr( GXutil.rtrim( AV62Testcatwwds_10_tfestcatser), 3, "%") ;
      lV66Testcatwwds_14_tfestcatdsc = GXutil.padr( GXutil.rtrim( AV66Testcatwwds_14_tfestcatdsc), 30, "%") ;
      /* Using cursor P0AL89 */
      pr_default.execute(3, new Object[] {lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV53Testcatwwds_1_filterfulltext, lV54Testcatwwds_2_tfemprcod, AV55Testcatwwds_3_tfemprcod_sel, Integer.valueOf(AV56Testcatwwds_4_tfclicod), Integer.valueOf(AV57Testcatwwds_5_tfclicod_to), lV58Testcatwwds_6_tfartcod, AV59Testcatwwds_7_tfartcod_sel, Short.valueOf(AV60Testcatwwds_8_tfestcatany), Short.valueOf(AV61Testcatwwds_9_tfestcatany_to), lV62Testcatwwds_10_tfestcatser, AV63Testcatwwds_11_tfestcatser_sel, Short.valueOf(AV64Testcatwwds_12_tfestcattip), Short.valueOf(AV65Testcatwwds_13_tfestcattip_to), lV66Testcatwwds_14_tfestcatdsc, AV67Testcatwwds_15_tfestcatdsc_sel, AV68Testcatwwds_16_tfestcataim0, AV69Testcatwwds_17_tfestcataim0_to, AV70Testcatwwds_18_tfestcataim1, AV71Testcatwwds_19_tfestcataim1_to, AV72Testcatwwds_20_tfestcatord0, AV73Testcatwwds_21_tfestcatord0_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAL88 = false ;
         A5385EstCatDsc = P0AL89_A5385EstCatDsc[0] ;
         n5385EstCatDsc = P0AL89_n5385EstCatDsc[0] ;
         A5388EstCatOrd0 = P0AL89_A5388EstCatOrd0[0] ;
         n5388EstCatOrd0 = P0AL89_n5388EstCatOrd0[0] ;
         A5384EstCatTip = P0AL89_A5384EstCatTip[0] ;
         A5383EstCatSer = P0AL89_A5383EstCatSer[0] ;
         A5382EstCatAny = P0AL89_A5382EstCatAny[0] ;
         A65ArtCod = P0AL89_A65ArtCod[0] ;
         A252CliCod = P0AL89_A252CliCod[0] ;
         A396EmprCod = P0AL89_A396EmprCod[0] ;
         A5387EstCatAIm1 = P0AL89_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL89_A5386EstCatAIm0[0] ;
         A5387EstCatAIm1 = P0AL89_A5387EstCatAIm1[0] ;
         A5386EstCatAIm0 = P0AL89_A5386EstCatAIm0[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AL89_A5385EstCatDsc[0], A5385EstCatDsc) == 0 ) )
         {
            brkAL88 = false ;
            A5384EstCatTip = P0AL89_A5384EstCatTip[0] ;
            A5383EstCatSer = P0AL89_A5383EstCatSer[0] ;
            A5382EstCatAny = P0AL89_A5382EstCatAny[0] ;
            A65ArtCod = P0AL89_A65ArtCod[0] ;
            A252CliCod = P0AL89_A252CliCod[0] ;
            A396EmprCod = P0AL89_A396EmprCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brkAL88 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5385EstCatDsc)==0) )
         {
            AV31Option = A5385EstCatDsc ;
            AV32Options.add(AV31Option, 0);
            AV35OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV32Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAL88 )
         {
            brkAL88 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = testcatwwgetfilterdata.this.AV45OptionsJson;
      this.aP4[0] = testcatwwgetfilterdata.this.AV46OptionsDescJson;
      this.aP5[0] = testcatwwgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV45OptionsJson = "" ;
      AV46OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV32Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV35OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV14TFArtCod = "" ;
      AV15TFArtCod_Sel = "" ;
      AV18TFEstCatSer = "" ;
      AV19TFEstCatSer_Sel = "" ;
      AV22TFEstCatDsc = "" ;
      AV23TFEstCatDsc_Sel = "" ;
      AV24TFEstCatAIm0 = DecimalUtil.ZERO ;
      AV25TFEstCatAIm0_To = DecimalUtil.ZERO ;
      AV26TFEstCatAIm1 = DecimalUtil.ZERO ;
      AV27TFEstCatAIm1_To = DecimalUtil.ZERO ;
      AV28TFEstCatOrd0 = DecimalUtil.ZERO ;
      AV29TFEstCatOrd0_To = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV53Testcatwwds_1_filterfulltext = "" ;
      AV54Testcatwwds_2_tfemprcod = "" ;
      AV55Testcatwwds_3_tfemprcod_sel = "" ;
      AV58Testcatwwds_6_tfartcod = "" ;
      AV59Testcatwwds_7_tfartcod_sel = "" ;
      AV62Testcatwwds_10_tfestcatser = "" ;
      AV63Testcatwwds_11_tfestcatser_sel = "" ;
      AV66Testcatwwds_14_tfestcatdsc = "" ;
      AV67Testcatwwds_15_tfestcatdsc_sel = "" ;
      AV68Testcatwwds_16_tfestcataim0 = DecimalUtil.ZERO ;
      AV69Testcatwwds_17_tfestcataim0_to = DecimalUtil.ZERO ;
      AV70Testcatwwds_18_tfestcataim1 = DecimalUtil.ZERO ;
      AV71Testcatwwds_19_tfestcataim1_to = DecimalUtil.ZERO ;
      AV72Testcatwwds_20_tfestcatord0 = DecimalUtil.ZERO ;
      AV73Testcatwwds_21_tfestcatord0_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV53Testcatwwds_1_filterfulltext = "" ;
      lV54Testcatwwds_2_tfemprcod = "" ;
      lV58Testcatwwds_6_tfartcod = "" ;
      lV62Testcatwwds_10_tfestcatser = "" ;
      lV66Testcatwwds_14_tfestcatdsc = "" ;
      A65ArtCod = "" ;
      A5383EstCatSer = "" ;
      A5385EstCatDsc = "" ;
      A5386EstCatAIm0 = DecimalUtil.ZERO ;
      A5387EstCatAIm1 = DecimalUtil.ZERO ;
      A5388EstCatOrd0 = DecimalUtil.ZERO ;
      P0AL83_A396EmprCod = new String[] {""} ;
      P0AL83_A5388EstCatOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL83_n5388EstCatOrd0 = new boolean[] {false} ;
      P0AL83_A5385EstCatDsc = new String[] {""} ;
      P0AL83_n5385EstCatDsc = new boolean[] {false} ;
      P0AL83_A5384EstCatTip = new short[1] ;
      P0AL83_A5383EstCatSer = new String[] {""} ;
      P0AL83_A5382EstCatAny = new short[1] ;
      P0AL83_A65ArtCod = new String[] {""} ;
      P0AL83_A252CliCod = new int[1] ;
      P0AL83_A5387EstCatAIm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL83_A5386EstCatAIm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV31Option = "" ;
      AV33OptionDesc = "" ;
      P0AL85_A65ArtCod = new String[] {""} ;
      P0AL85_A5388EstCatOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL85_n5388EstCatOrd0 = new boolean[] {false} ;
      P0AL85_A5385EstCatDsc = new String[] {""} ;
      P0AL85_n5385EstCatDsc = new boolean[] {false} ;
      P0AL85_A5384EstCatTip = new short[1] ;
      P0AL85_A5383EstCatSer = new String[] {""} ;
      P0AL85_A5382EstCatAny = new short[1] ;
      P0AL85_A252CliCod = new int[1] ;
      P0AL85_A396EmprCod = new String[] {""} ;
      P0AL85_A5387EstCatAIm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL85_A5386EstCatAIm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL87_A5383EstCatSer = new String[] {""} ;
      P0AL87_A5388EstCatOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL87_n5388EstCatOrd0 = new boolean[] {false} ;
      P0AL87_A5385EstCatDsc = new String[] {""} ;
      P0AL87_n5385EstCatDsc = new boolean[] {false} ;
      P0AL87_A5384EstCatTip = new short[1] ;
      P0AL87_A5382EstCatAny = new short[1] ;
      P0AL87_A65ArtCod = new String[] {""} ;
      P0AL87_A252CliCod = new int[1] ;
      P0AL87_A396EmprCod = new String[] {""} ;
      P0AL87_A5387EstCatAIm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL87_A5386EstCatAIm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL89_A5385EstCatDsc = new String[] {""} ;
      P0AL89_n5385EstCatDsc = new boolean[] {false} ;
      P0AL89_A5388EstCatOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL89_n5388EstCatOrd0 = new boolean[] {false} ;
      P0AL89_A5384EstCatTip = new short[1] ;
      P0AL89_A5383EstCatSer = new String[] {""} ;
      P0AL89_A5382EstCatAny = new short[1] ;
      P0AL89_A65ArtCod = new String[] {""} ;
      P0AL89_A252CliCod = new int[1] ;
      P0AL89_A396EmprCod = new String[] {""} ;
      P0AL89_A5387EstCatAIm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AL89_A5386EstCatAIm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testcatwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AL83_A396EmprCod, P0AL83_A5388EstCatOrd0, P0AL83_n5388EstCatOrd0, P0AL83_A5385EstCatDsc, P0AL83_n5385EstCatDsc, P0AL83_A5384EstCatTip, P0AL83_A5383EstCatSer, P0AL83_A5382EstCatAny, P0AL83_A65ArtCod, P0AL83_A252CliCod,
            P0AL83_A5387EstCatAIm1, P0AL83_A5386EstCatAIm0
            }
            , new Object[] {
            P0AL85_A65ArtCod, P0AL85_A5388EstCatOrd0, P0AL85_n5388EstCatOrd0, P0AL85_A5385EstCatDsc, P0AL85_n5385EstCatDsc, P0AL85_A5384EstCatTip, P0AL85_A5383EstCatSer, P0AL85_A5382EstCatAny, P0AL85_A252CliCod, P0AL85_A396EmprCod,
            P0AL85_A5387EstCatAIm1, P0AL85_A5386EstCatAIm0
            }
            , new Object[] {
            P0AL87_A5383EstCatSer, P0AL87_A5388EstCatOrd0, P0AL87_n5388EstCatOrd0, P0AL87_A5385EstCatDsc, P0AL87_n5385EstCatDsc, P0AL87_A5384EstCatTip, P0AL87_A5382EstCatAny, P0AL87_A65ArtCod, P0AL87_A252CliCod, P0AL87_A396EmprCod,
            P0AL87_A5387EstCatAIm1, P0AL87_A5386EstCatAIm0
            }
            , new Object[] {
            P0AL89_A5385EstCatDsc, P0AL89_n5385EstCatDsc, P0AL89_A5388EstCatOrd0, P0AL89_n5388EstCatOrd0, P0AL89_A5384EstCatTip, P0AL89_A5383EstCatSer, P0AL89_A5382EstCatAny, P0AL89_A65ArtCod, P0AL89_A252CliCod, P0AL89_A396EmprCod,
            P0AL89_A5387EstCatAIm1, P0AL89_A5386EstCatAIm0
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16TFEstCatAny ;
   private short AV17TFEstCatAny_To ;
   private short AV20TFEstCatTip ;
   private short AV21TFEstCatTip_To ;
   private short AV60Testcatwwds_8_tfestcatany ;
   private short AV61Testcatwwds_9_tfestcatany_to ;
   private short AV64Testcatwwds_12_tfestcattip ;
   private short AV65Testcatwwds_13_tfestcattip_to ;
   private short A5382EstCatAny ;
   private short A5384EstCatTip ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV56Testcatwwds_4_tfclicod ;
   private int AV57Testcatwwds_5_tfclicod_to ;
   private int A252CliCod ;
   private long AV36count ;
   private java.math.BigDecimal AV24TFEstCatAIm0 ;
   private java.math.BigDecimal AV25TFEstCatAIm0_To ;
   private java.math.BigDecimal AV26TFEstCatAIm1 ;
   private java.math.BigDecimal AV27TFEstCatAIm1_To ;
   private java.math.BigDecimal AV28TFEstCatOrd0 ;
   private java.math.BigDecimal AV29TFEstCatOrd0_To ;
   private java.math.BigDecimal AV68Testcatwwds_16_tfestcataim0 ;
   private java.math.BigDecimal AV69Testcatwwds_17_tfestcataim0_to ;
   private java.math.BigDecimal AV70Testcatwwds_18_tfestcataim1 ;
   private java.math.BigDecimal AV71Testcatwwds_19_tfestcataim1_to ;
   private java.math.BigDecimal AV72Testcatwwds_20_tfestcatord0 ;
   private java.math.BigDecimal AV73Testcatwwds_21_tfestcatord0_to ;
   private java.math.BigDecimal A5386EstCatAIm0 ;
   private java.math.BigDecimal A5387EstCatAIm1 ;
   private java.math.BigDecimal A5388EstCatOrd0 ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV14TFArtCod ;
   private String AV15TFArtCod_Sel ;
   private String AV18TFEstCatSer ;
   private String AV19TFEstCatSer_Sel ;
   private String AV22TFEstCatDsc ;
   private String AV23TFEstCatDsc_Sel ;
   private String A396EmprCod ;
   private String AV54Testcatwwds_2_tfemprcod ;
   private String AV55Testcatwwds_3_tfemprcod_sel ;
   private String AV58Testcatwwds_6_tfartcod ;
   private String AV59Testcatwwds_7_tfartcod_sel ;
   private String AV62Testcatwwds_10_tfestcatser ;
   private String AV63Testcatwwds_11_tfestcatser_sel ;
   private String AV66Testcatwwds_14_tfestcatdsc ;
   private String AV67Testcatwwds_15_tfestcatdsc_sel ;
   private String scmdbuf ;
   private String lV54Testcatwwds_2_tfemprcod ;
   private String lV58Testcatwwds_6_tfartcod ;
   private String lV62Testcatwwds_10_tfestcatser ;
   private String lV66Testcatwwds_14_tfestcatdsc ;
   private String A65ArtCod ;
   private String A5383EstCatSer ;
   private String A5385EstCatDsc ;
   private boolean returnInSub ;
   private boolean brkAL82 ;
   private boolean n5388EstCatOrd0 ;
   private boolean n5385EstCatDsc ;
   private boolean brkAL84 ;
   private boolean brkAL86 ;
   private boolean brkAL88 ;
   private String AV45OptionsJson ;
   private String AV46OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV43SearchTxt ;
   private String AV44SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV53Testcatwwds_1_filterfulltext ;
   private String lV53Testcatwwds_1_filterfulltext ;
   private String AV31Option ;
   private String AV33OptionDesc ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AL83_A396EmprCod ;
   private java.math.BigDecimal[] P0AL83_A5388EstCatOrd0 ;
   private boolean[] P0AL83_n5388EstCatOrd0 ;
   private String[] P0AL83_A5385EstCatDsc ;
   private boolean[] P0AL83_n5385EstCatDsc ;
   private short[] P0AL83_A5384EstCatTip ;
   private String[] P0AL83_A5383EstCatSer ;
   private short[] P0AL83_A5382EstCatAny ;
   private String[] P0AL83_A65ArtCod ;
   private int[] P0AL83_A252CliCod ;
   private java.math.BigDecimal[] P0AL83_A5387EstCatAIm1 ;
   private java.math.BigDecimal[] P0AL83_A5386EstCatAIm0 ;
   private String[] P0AL85_A65ArtCod ;
   private java.math.BigDecimal[] P0AL85_A5388EstCatOrd0 ;
   private boolean[] P0AL85_n5388EstCatOrd0 ;
   private String[] P0AL85_A5385EstCatDsc ;
   private boolean[] P0AL85_n5385EstCatDsc ;
   private short[] P0AL85_A5384EstCatTip ;
   private String[] P0AL85_A5383EstCatSer ;
   private short[] P0AL85_A5382EstCatAny ;
   private int[] P0AL85_A252CliCod ;
   private String[] P0AL85_A396EmprCod ;
   private java.math.BigDecimal[] P0AL85_A5387EstCatAIm1 ;
   private java.math.BigDecimal[] P0AL85_A5386EstCatAIm0 ;
   private String[] P0AL87_A5383EstCatSer ;
   private java.math.BigDecimal[] P0AL87_A5388EstCatOrd0 ;
   private boolean[] P0AL87_n5388EstCatOrd0 ;
   private String[] P0AL87_A5385EstCatDsc ;
   private boolean[] P0AL87_n5385EstCatDsc ;
   private short[] P0AL87_A5384EstCatTip ;
   private short[] P0AL87_A5382EstCatAny ;
   private String[] P0AL87_A65ArtCod ;
   private int[] P0AL87_A252CliCod ;
   private String[] P0AL87_A396EmprCod ;
   private java.math.BigDecimal[] P0AL87_A5387EstCatAIm1 ;
   private java.math.BigDecimal[] P0AL87_A5386EstCatAIm0 ;
   private String[] P0AL89_A5385EstCatDsc ;
   private boolean[] P0AL89_n5385EstCatDsc ;
   private java.math.BigDecimal[] P0AL89_A5388EstCatOrd0 ;
   private boolean[] P0AL89_n5388EstCatOrd0 ;
   private short[] P0AL89_A5384EstCatTip ;
   private String[] P0AL89_A5383EstCatSer ;
   private short[] P0AL89_A5382EstCatAny ;
   private String[] P0AL89_A65ArtCod ;
   private int[] P0AL89_A252CliCod ;
   private String[] P0AL89_A396EmprCod ;
   private java.math.BigDecimal[] P0AL89_A5387EstCatAIm1 ;
   private java.math.BigDecimal[] P0AL89_A5386EstCatAIm0 ;
   private GXSimpleCollection<String> AV32Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV35OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class testcatwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AL83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Testcatwwds_1_filterfulltext ,
                                          String AV55Testcatwwds_3_tfemprcod_sel ,
                                          String AV54Testcatwwds_2_tfemprcod ,
                                          int AV56Testcatwwds_4_tfclicod ,
                                          int AV57Testcatwwds_5_tfclicod_to ,
                                          String AV59Testcatwwds_7_tfartcod_sel ,
                                          String AV58Testcatwwds_6_tfartcod ,
                                          short AV60Testcatwwds_8_tfestcatany ,
                                          short AV61Testcatwwds_9_tfestcatany_to ,
                                          String AV63Testcatwwds_11_tfestcatser_sel ,
                                          String AV62Testcatwwds_10_tfestcatser ,
                                          short AV64Testcatwwds_12_tfestcattip ,
                                          short AV65Testcatwwds_13_tfestcattip_to ,
                                          String AV67Testcatwwds_15_tfestcatdsc_sel ,
                                          String AV66Testcatwwds_14_tfestcatdsc ,
                                          java.math.BigDecimal AV68Testcatwwds_16_tfestcataim0 ,
                                          java.math.BigDecimal AV69Testcatwwds_17_tfestcataim0_to ,
                                          java.math.BigDecimal AV70Testcatwwds_18_tfestcataim1 ,
                                          java.math.BigDecimal AV71Testcatwwds_19_tfestcataim1_to ,
                                          java.math.BigDecimal AV72Testcatwwds_20_tfestcatord0 ,
                                          java.math.BigDecimal AV73Testcatwwds_21_tfestcatord0_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          short A5382EstCatAny ,
                                          String A5383EstCatSer ,
                                          short A5384EstCatTip ,
                                          String A5385EstCatDsc ,
                                          java.math.BigDecimal A5386EstCatAIm0 ,
                                          java.math.BigDecimal A5387EstCatAIm1 ,
                                          java.math.BigDecimal A5388EstCatOrd0 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.EstCatOrd0, T1.EstCatDsc, T1.EstCatTip, T1.EstCatSer, T1.EstCatAny, T1.ArtCod, T1.CliCod, COALESCE( T2.EstCatAIm1, 0) AS EstCatAIm1, COALESCE(" ;
      scmdbuf += " T2.EstCatAIm0, 0) AS EstCatAIm0 FROM (TXPESTCAT T1 LEFT JOIN (SELECT SUM(EstCatImp1) AS EstCatAIm1, EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, SUM(EstCatImp0)" ;
      scmdbuf += " AS EstCatAIm0 FROM TXPESTCA1 GROUP BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod" ;
      scmdbuf += " = T1.ArtCod AND T2.EstCatAny = T1.EstCatAny AND T2.EstCatSer = T1.EstCatSer AND T2.EstCatTip = T1.EstCatTip)" ;
      if ( ! (GXutil.strcmp("", AV53Testcatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatAny,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatSer) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatTip,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm0, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm1, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EstCatOrd0,'999999990.99'), 2) like '%' || ?))");
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
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testcatwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Testcatwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testcatwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Testcatwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Testcatwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testcatwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Testcatwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testcatwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV60Testcatwwds_8_tfestcatany) )
      {
         addWhere(sWhereString, "(T1.EstCatAny >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV61Testcatwwds_9_tfestcatany_to) )
      {
         addWhere(sWhereString, "(T1.EstCatAny <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Testcatwwds_11_tfestcatser_sel)==0) && ( ! (GXutil.strcmp("", AV62Testcatwwds_10_tfestcatser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Testcatwwds_11_tfestcatser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatSer = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Testcatwwds_12_tfestcattip) )
      {
         addWhere(sWhereString, "(T1.EstCatTip >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV65Testcatwwds_13_tfestcattip_to) )
      {
         addWhere(sWhereString, "(T1.EstCatTip <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Testcatwwds_15_tfestcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Testcatwwds_14_tfestcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Testcatwwds_15_tfestcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Testcatwwds_16_tfestcataim0)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Testcatwwds_17_tfestcataim0_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Testcatwwds_18_tfestcataim1)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Testcatwwds_19_tfestcataim1_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Testcatwwds_20_tfestcatord0)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Testcatwwds_21_tfestcatord0_to)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AL85( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Testcatwwds_1_filterfulltext ,
                                          String AV55Testcatwwds_3_tfemprcod_sel ,
                                          String AV54Testcatwwds_2_tfemprcod ,
                                          int AV56Testcatwwds_4_tfclicod ,
                                          int AV57Testcatwwds_5_tfclicod_to ,
                                          String AV59Testcatwwds_7_tfartcod_sel ,
                                          String AV58Testcatwwds_6_tfartcod ,
                                          short AV60Testcatwwds_8_tfestcatany ,
                                          short AV61Testcatwwds_9_tfestcatany_to ,
                                          String AV63Testcatwwds_11_tfestcatser_sel ,
                                          String AV62Testcatwwds_10_tfestcatser ,
                                          short AV64Testcatwwds_12_tfestcattip ,
                                          short AV65Testcatwwds_13_tfestcattip_to ,
                                          String AV67Testcatwwds_15_tfestcatdsc_sel ,
                                          String AV66Testcatwwds_14_tfestcatdsc ,
                                          java.math.BigDecimal AV68Testcatwwds_16_tfestcataim0 ,
                                          java.math.BigDecimal AV69Testcatwwds_17_tfestcataim0_to ,
                                          java.math.BigDecimal AV70Testcatwwds_18_tfestcataim1 ,
                                          java.math.BigDecimal AV71Testcatwwds_19_tfestcataim1_to ,
                                          java.math.BigDecimal AV72Testcatwwds_20_tfestcatord0 ,
                                          java.math.BigDecimal AV73Testcatwwds_21_tfestcatord0_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          short A5382EstCatAny ,
                                          String A5383EstCatSer ,
                                          short A5384EstCatTip ,
                                          String A5385EstCatDsc ,
                                          java.math.BigDecimal A5386EstCatAIm0 ,
                                          java.math.BigDecimal A5387EstCatAIm1 ,
                                          java.math.BigDecimal A5388EstCatOrd0 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[30];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ArtCod, T1.EstCatOrd0, T1.EstCatDsc, T1.EstCatTip, T1.EstCatSer, T1.EstCatAny, T1.CliCod, T1.EmprCod, COALESCE( T2.EstCatAIm1, 0) AS EstCatAIm1, COALESCE(" ;
      scmdbuf += " T2.EstCatAIm0, 0) AS EstCatAIm0 FROM (TXPESTCAT T1 LEFT JOIN (SELECT SUM(EstCatImp1) AS EstCatAIm1, EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, SUM(EstCatImp0)" ;
      scmdbuf += " AS EstCatAIm0 FROM TXPESTCA1 GROUP BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod" ;
      scmdbuf += " = T1.ArtCod AND T2.EstCatAny = T1.EstCatAny AND T2.EstCatSer = T1.EstCatSer AND T2.EstCatTip = T1.EstCatTip)" ;
      if ( ! (GXutil.strcmp("", AV53Testcatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatAny,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatSer) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatTip,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm0, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm1, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EstCatOrd0,'999999990.99'), 2) like '%' || ?))");
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
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testcatwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Testcatwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testcatwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Testcatwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Testcatwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testcatwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Testcatwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testcatwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV60Testcatwwds_8_tfestcatany) )
      {
         addWhere(sWhereString, "(T1.EstCatAny >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV61Testcatwwds_9_tfestcatany_to) )
      {
         addWhere(sWhereString, "(T1.EstCatAny <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Testcatwwds_11_tfestcatser_sel)==0) && ( ! (GXutil.strcmp("", AV62Testcatwwds_10_tfestcatser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Testcatwwds_11_tfestcatser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatSer = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Testcatwwds_12_tfestcattip) )
      {
         addWhere(sWhereString, "(T1.EstCatTip >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV65Testcatwwds_13_tfestcattip_to) )
      {
         addWhere(sWhereString, "(T1.EstCatTip <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Testcatwwds_15_tfestcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Testcatwwds_14_tfestcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Testcatwwds_15_tfestcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatDsc = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Testcatwwds_16_tfestcataim0)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Testcatwwds_17_tfestcataim0_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Testcatwwds_18_tfestcataim1)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Testcatwwds_19_tfestcataim1_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Testcatwwds_20_tfestcatord0)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Testcatwwds_21_tfestcatord0_to)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ArtCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AL87( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Testcatwwds_1_filterfulltext ,
                                          String AV55Testcatwwds_3_tfemprcod_sel ,
                                          String AV54Testcatwwds_2_tfemprcod ,
                                          int AV56Testcatwwds_4_tfclicod ,
                                          int AV57Testcatwwds_5_tfclicod_to ,
                                          String AV59Testcatwwds_7_tfartcod_sel ,
                                          String AV58Testcatwwds_6_tfartcod ,
                                          short AV60Testcatwwds_8_tfestcatany ,
                                          short AV61Testcatwwds_9_tfestcatany_to ,
                                          String AV63Testcatwwds_11_tfestcatser_sel ,
                                          String AV62Testcatwwds_10_tfestcatser ,
                                          short AV64Testcatwwds_12_tfestcattip ,
                                          short AV65Testcatwwds_13_tfestcattip_to ,
                                          String AV67Testcatwwds_15_tfestcatdsc_sel ,
                                          String AV66Testcatwwds_14_tfestcatdsc ,
                                          java.math.BigDecimal AV68Testcatwwds_16_tfestcataim0 ,
                                          java.math.BigDecimal AV69Testcatwwds_17_tfestcataim0_to ,
                                          java.math.BigDecimal AV70Testcatwwds_18_tfestcataim1 ,
                                          java.math.BigDecimal AV71Testcatwwds_19_tfestcataim1_to ,
                                          java.math.BigDecimal AV72Testcatwwds_20_tfestcatord0 ,
                                          java.math.BigDecimal AV73Testcatwwds_21_tfestcatord0_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          short A5382EstCatAny ,
                                          String A5383EstCatSer ,
                                          short A5384EstCatTip ,
                                          String A5385EstCatDsc ,
                                          java.math.BigDecimal A5386EstCatAIm0 ,
                                          java.math.BigDecimal A5387EstCatAIm1 ,
                                          java.math.BigDecimal A5388EstCatOrd0 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EstCatSer, T1.EstCatOrd0, T1.EstCatDsc, T1.EstCatTip, T1.EstCatAny, T1.ArtCod, T1.CliCod, T1.EmprCod, COALESCE( T2.EstCatAIm1, 0) AS EstCatAIm1, COALESCE(" ;
      scmdbuf += " T2.EstCatAIm0, 0) AS EstCatAIm0 FROM (TXPESTCAT T1 LEFT JOIN (SELECT SUM(EstCatImp1) AS EstCatAIm1, EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, SUM(EstCatImp0)" ;
      scmdbuf += " AS EstCatAIm0 FROM TXPESTCA1 GROUP BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod" ;
      scmdbuf += " = T1.ArtCod AND T2.EstCatAny = T1.EstCatAny AND T2.EstCatSer = T1.EstCatSer AND T2.EstCatTip = T1.EstCatTip)" ;
      if ( ! (GXutil.strcmp("", AV53Testcatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatAny,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatSer) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatTip,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm0, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm1, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EstCatOrd0,'999999990.99'), 2) like '%' || ?))");
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
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testcatwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Testcatwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testcatwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Testcatwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Testcatwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testcatwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Testcatwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testcatwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV60Testcatwwds_8_tfestcatany) )
      {
         addWhere(sWhereString, "(T1.EstCatAny >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV61Testcatwwds_9_tfestcatany_to) )
      {
         addWhere(sWhereString, "(T1.EstCatAny <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Testcatwwds_11_tfestcatser_sel)==0) && ( ! (GXutil.strcmp("", AV62Testcatwwds_10_tfestcatser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Testcatwwds_11_tfestcatser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatSer = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Testcatwwds_12_tfestcattip) )
      {
         addWhere(sWhereString, "(T1.EstCatTip >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV65Testcatwwds_13_tfestcattip_to) )
      {
         addWhere(sWhereString, "(T1.EstCatTip <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Testcatwwds_15_tfestcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Testcatwwds_14_tfestcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Testcatwwds_15_tfestcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatDsc = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Testcatwwds_16_tfestcataim0)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Testcatwwds_17_tfestcataim0_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Testcatwwds_18_tfestcataim1)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Testcatwwds_19_tfestcataim1_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Testcatwwds_20_tfestcatord0)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Testcatwwds_21_tfestcatord0_to)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EstCatSer" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AL89( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Testcatwwds_1_filterfulltext ,
                                          String AV55Testcatwwds_3_tfemprcod_sel ,
                                          String AV54Testcatwwds_2_tfemprcod ,
                                          int AV56Testcatwwds_4_tfclicod ,
                                          int AV57Testcatwwds_5_tfclicod_to ,
                                          String AV59Testcatwwds_7_tfartcod_sel ,
                                          String AV58Testcatwwds_6_tfartcod ,
                                          short AV60Testcatwwds_8_tfestcatany ,
                                          short AV61Testcatwwds_9_tfestcatany_to ,
                                          String AV63Testcatwwds_11_tfestcatser_sel ,
                                          String AV62Testcatwwds_10_tfestcatser ,
                                          short AV64Testcatwwds_12_tfestcattip ,
                                          short AV65Testcatwwds_13_tfestcattip_to ,
                                          String AV67Testcatwwds_15_tfestcatdsc_sel ,
                                          String AV66Testcatwwds_14_tfestcatdsc ,
                                          java.math.BigDecimal AV68Testcatwwds_16_tfestcataim0 ,
                                          java.math.BigDecimal AV69Testcatwwds_17_tfestcataim0_to ,
                                          java.math.BigDecimal AV70Testcatwwds_18_tfestcataim1 ,
                                          java.math.BigDecimal AV71Testcatwwds_19_tfestcataim1_to ,
                                          java.math.BigDecimal AV72Testcatwwds_20_tfestcatord0 ,
                                          java.math.BigDecimal AV73Testcatwwds_21_tfestcatord0_to ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A65ArtCod ,
                                          short A5382EstCatAny ,
                                          String A5383EstCatSer ,
                                          short A5384EstCatTip ,
                                          String A5385EstCatDsc ,
                                          java.math.BigDecimal A5386EstCatAIm0 ,
                                          java.math.BigDecimal A5387EstCatAIm1 ,
                                          java.math.BigDecimal A5388EstCatOrd0 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EstCatDsc, T1.EstCatOrd0, T1.EstCatTip, T1.EstCatSer, T1.EstCatAny, T1.ArtCod, T1.CliCod, T1.EmprCod, COALESCE( T2.EstCatAIm1, 0) AS EstCatAIm1, COALESCE(" ;
      scmdbuf += " T2.EstCatAIm0, 0) AS EstCatAIm0 FROM (TXPESTCAT T1 LEFT JOIN (SELECT SUM(EstCatImp1) AS EstCatAIm1, EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip, SUM(EstCatImp0)" ;
      scmdbuf += " AS EstCatAIm0 FROM TXPESTCA1 GROUP BY EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.ArtCod" ;
      scmdbuf += " = T1.ArtCod AND T2.EstCatAny = T1.EstCatAny AND T2.EstCatSer = T1.EstCatSer AND T2.EstCatTip = T1.EstCatTip)" ;
      if ( ! (GXutil.strcmp("", AV53Testcatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatAny,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatSer) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EstCatTip,'9990'), 2) like '%' || ?) or ( UPPER(T1.EstCatDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm0, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.EstCatAIm1, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EstCatOrd0,'999999990.99'), 2) like '%' || ?))");
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
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Testcatwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Testcatwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Testcatwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Testcatwwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Testcatwwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testcatwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Testcatwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testcatwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV60Testcatwwds_8_tfestcatany) )
      {
         addWhere(sWhereString, "(T1.EstCatAny >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV61Testcatwwds_9_tfestcatany_to) )
      {
         addWhere(sWhereString, "(T1.EstCatAny <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Testcatwwds_11_tfestcatser_sel)==0) && ( ! (GXutil.strcmp("", AV62Testcatwwds_10_tfestcatser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Testcatwwds_11_tfestcatser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatSer = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Testcatwwds_12_tfestcattip) )
      {
         addWhere(sWhereString, "(T1.EstCatTip >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV65Testcatwwds_13_tfestcattip_to) )
      {
         addWhere(sWhereString, "(T1.EstCatTip <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Testcatwwds_15_tfestcatdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Testcatwwds_14_tfestcatdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCatDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Testcatwwds_15_tfestcatdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Testcatwwds_16_tfestcataim0)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Testcatwwds_17_tfestcataim0_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm0, 0) <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Testcatwwds_18_tfestcataim1)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Testcatwwds_19_tfestcataim1_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.EstCatAIm1, 0) <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Testcatwwds_20_tfestcatord0)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Testcatwwds_21_tfestcatord0_to)==0) )
      {
         addWhere(sWhereString, "(T1.EstCatOrd0 <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EstCatDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P0AL83(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] );
            case 1 :
                  return conditional_P0AL85(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] );
            case 2 :
                  return conditional_P0AL87(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] );
            case 3 :
                  return conditional_P0AL89(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AL83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AL85", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AL87", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AL89", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
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
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               return;
      }
   }

}

