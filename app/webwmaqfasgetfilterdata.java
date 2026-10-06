package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwmaqfasgetfilterdata extends GXProcedure
{
   public webwmaqfasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwmaqfasgetfilterdata.class ), "" );
   }

   public webwmaqfasgetfilterdata( int remoteHandle ,
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
      webwmaqfasgetfilterdata.this.aP5 = new String[] {""};
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
      webwmaqfasgetfilterdata.this.AV20DDOName = aP0;
      webwmaqfasgetfilterdata.this.AV18SearchTxt = aP1;
      webwmaqfasgetfilterdata.this.AV19SearchTxtTo = aP2;
      webwmaqfasgetfilterdata.this.aP3 = aP3;
      webwmaqfasgetfilterdata.this.aP4 = aP4;
      webwmaqfasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MAQEST") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQESTOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MAQFCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQFCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MAQFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQFDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("WebWmaqfasGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWmaqfasGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WebWmaqfasGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV37FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST") == 0 )
         {
            AV44TFMaqEst = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST_SEL") == 0 )
         {
            AV45TFMaqEst_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV12TFMaqDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV13TFMaqDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFCOD") == 0 )
         {
            AV14TFMaqFCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFCOD_SEL") == 0 )
         {
            AV15TFMaqFCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFDSC") == 0 )
         {
            AV16TFMaqFDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQFDSC_SEL") == 0 )
         {
            AV17TFMaqFDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV18SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV50Webwmaqfasds_1_filterfulltext = AV37FilterFullText ;
      AV51Webwmaqfasds_2_tfmaqcod = AV10TFMaqCod ;
      AV52Webwmaqfasds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV53Webwmaqfasds_4_tfmaqest = AV44TFMaqEst ;
      AV54Webwmaqfasds_5_tfmaqest_sel = AV45TFMaqEst_Sel ;
      AV55Webwmaqfasds_6_tfmaqdsc = AV12TFMaqDsc ;
      AV56Webwmaqfasds_7_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV57Webwmaqfasds_8_tfmaqfcod = AV14TFMaqFCod ;
      AV58Webwmaqfasds_9_tfmaqfcod_sel = AV15TFMaqFCod_Sel ;
      AV59Webwmaqfasds_10_tfmaqfdsc = AV16TFMaqFDsc ;
      AV60Webwmaqfasds_11_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Webwmaqfasds_1_filterfulltext ,
                                           AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                           AV51Webwmaqfasds_2_tfmaqcod ,
                                           AV54Webwmaqfasds_5_tfmaqest_sel ,
                                           AV53Webwmaqfasds_4_tfmaqest ,
                                           AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                           AV55Webwmaqfasds_6_tfmaqdsc ,
                                           AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                           AV57Webwmaqfasds_8_tfmaqfcod ,
                                           AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                           AV59Webwmaqfasds_10_tfmaqfdsc ,
                                           A602MaqCod ,
                                           A607MaqEst ,
                                           A606MaqDsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV51Webwmaqfasds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV51Webwmaqfasds_2_tfmaqcod), 6, "%") ;
      lV53Webwmaqfasds_4_tfmaqest = GXutil.padr( GXutil.rtrim( AV53Webwmaqfasds_4_tfmaqest), 1, "%") ;
      lV55Webwmaqfasds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV55Webwmaqfasds_6_tfmaqdsc), 16, "%") ;
      lV57Webwmaqfasds_8_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV57Webwmaqfasds_8_tfmaqfcod), 8, "%") ;
      lV59Webwmaqfasds_10_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV59Webwmaqfasds_10_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08BQ2 */
      pr_default.execute(0, new Object[] {lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV51Webwmaqfasds_2_tfmaqcod, AV52Webwmaqfasds_3_tfmaqcod_sel, lV53Webwmaqfasds_4_tfmaqest, AV54Webwmaqfasds_5_tfmaqest_sel, lV55Webwmaqfasds_6_tfmaqdsc, AV56Webwmaqfasds_7_tfmaqdsc_sel, lV57Webwmaqfasds_8_tfmaqfcod, AV58Webwmaqfasds_9_tfmaqfcod_sel, lV59Webwmaqfasds_10_tfmaqfdsc, AV60Webwmaqfasds_11_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8BQ2 = false ;
         A396EmprCod = P08BQ2_A396EmprCod[0] ;
         A602MaqCod = P08BQ2_A602MaqCod[0] ;
         A1143MaqFDsc = P08BQ2_A1143MaqFDsc[0] ;
         A1142MaqFCod = P08BQ2_A1142MaqFCod[0] ;
         A606MaqDsc = P08BQ2_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ2_n606MaqDsc[0] ;
         A607MaqEst = P08BQ2_A607MaqEst[0] ;
         n607MaqEst = P08BQ2_n607MaqEst[0] ;
         A606MaqDsc = P08BQ2_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ2_n606MaqDsc[0] ;
         A607MaqEst = P08BQ2_A607MaqEst[0] ;
         n607MaqEst = P08BQ2_n607MaqEst[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08BQ2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8BQ2 = false ;
            A396EmprCod = P08BQ2_A396EmprCod[0] ;
            A1142MaqFCod = P08BQ2_A1142MaqFCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8BQ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV22Option = A602MaqCod ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BQ2 )
         {
            brk8BQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQESTOPTIONS' Routine */
      returnInSub = false ;
      AV44TFMaqEst = AV18SearchTxt ;
      AV45TFMaqEst_Sel = "" ;
      AV50Webwmaqfasds_1_filterfulltext = AV37FilterFullText ;
      AV51Webwmaqfasds_2_tfmaqcod = AV10TFMaqCod ;
      AV52Webwmaqfasds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV53Webwmaqfasds_4_tfmaqest = AV44TFMaqEst ;
      AV54Webwmaqfasds_5_tfmaqest_sel = AV45TFMaqEst_Sel ;
      AV55Webwmaqfasds_6_tfmaqdsc = AV12TFMaqDsc ;
      AV56Webwmaqfasds_7_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV57Webwmaqfasds_8_tfmaqfcod = AV14TFMaqFCod ;
      AV58Webwmaqfasds_9_tfmaqfcod_sel = AV15TFMaqFCod_Sel ;
      AV59Webwmaqfasds_10_tfmaqfdsc = AV16TFMaqFDsc ;
      AV60Webwmaqfasds_11_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Webwmaqfasds_1_filterfulltext ,
                                           AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                           AV51Webwmaqfasds_2_tfmaqcod ,
                                           AV54Webwmaqfasds_5_tfmaqest_sel ,
                                           AV53Webwmaqfasds_4_tfmaqest ,
                                           AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                           AV55Webwmaqfasds_6_tfmaqdsc ,
                                           AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                           AV57Webwmaqfasds_8_tfmaqfcod ,
                                           AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                           AV59Webwmaqfasds_10_tfmaqfdsc ,
                                           A602MaqCod ,
                                           A607MaqEst ,
                                           A606MaqDsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV51Webwmaqfasds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV51Webwmaqfasds_2_tfmaqcod), 6, "%") ;
      lV53Webwmaqfasds_4_tfmaqest = GXutil.padr( GXutil.rtrim( AV53Webwmaqfasds_4_tfmaqest), 1, "%") ;
      lV55Webwmaqfasds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV55Webwmaqfasds_6_tfmaqdsc), 16, "%") ;
      lV57Webwmaqfasds_8_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV57Webwmaqfasds_8_tfmaqfcod), 8, "%") ;
      lV59Webwmaqfasds_10_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV59Webwmaqfasds_10_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08BQ3 */
      pr_default.execute(1, new Object[] {lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV51Webwmaqfasds_2_tfmaqcod, AV52Webwmaqfasds_3_tfmaqcod_sel, lV53Webwmaqfasds_4_tfmaqest, AV54Webwmaqfasds_5_tfmaqest_sel, lV55Webwmaqfasds_6_tfmaqdsc, AV56Webwmaqfasds_7_tfmaqdsc_sel, lV57Webwmaqfasds_8_tfmaqfcod, AV58Webwmaqfasds_9_tfmaqfcod_sel, lV59Webwmaqfasds_10_tfmaqfdsc, AV60Webwmaqfasds_11_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8BQ4 = false ;
         A396EmprCod = P08BQ3_A396EmprCod[0] ;
         A607MaqEst = P08BQ3_A607MaqEst[0] ;
         n607MaqEst = P08BQ3_n607MaqEst[0] ;
         A1143MaqFDsc = P08BQ3_A1143MaqFDsc[0] ;
         A1142MaqFCod = P08BQ3_A1142MaqFCod[0] ;
         A606MaqDsc = P08BQ3_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ3_n606MaqDsc[0] ;
         A602MaqCod = P08BQ3_A602MaqCod[0] ;
         A607MaqEst = P08BQ3_A607MaqEst[0] ;
         n607MaqEst = P08BQ3_n607MaqEst[0] ;
         A606MaqDsc = P08BQ3_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ3_n606MaqDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08BQ3_A607MaqEst[0], A607MaqEst) == 0 ) )
         {
            brk8BQ4 = false ;
            A396EmprCod = P08BQ3_A396EmprCod[0] ;
            A1142MaqFCod = P08BQ3_A1142MaqFCod[0] ;
            A602MaqCod = P08BQ3_A602MaqCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8BQ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A607MaqEst)==0) )
         {
            AV22Option = A607MaqEst ;
            AV25OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A607MaqEst, "@!"))) ;
            AV23Options.add(AV22Option, 0);
            AV26OptionsDesc.add(AV25OptionDesc, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BQ4 )
         {
            brk8BQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqDsc = AV18SearchTxt ;
      AV13TFMaqDsc_Sel = "" ;
      AV50Webwmaqfasds_1_filterfulltext = AV37FilterFullText ;
      AV51Webwmaqfasds_2_tfmaqcod = AV10TFMaqCod ;
      AV52Webwmaqfasds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV53Webwmaqfasds_4_tfmaqest = AV44TFMaqEst ;
      AV54Webwmaqfasds_5_tfmaqest_sel = AV45TFMaqEst_Sel ;
      AV55Webwmaqfasds_6_tfmaqdsc = AV12TFMaqDsc ;
      AV56Webwmaqfasds_7_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV57Webwmaqfasds_8_tfmaqfcod = AV14TFMaqFCod ;
      AV58Webwmaqfasds_9_tfmaqfcod_sel = AV15TFMaqFCod_Sel ;
      AV59Webwmaqfasds_10_tfmaqfdsc = AV16TFMaqFDsc ;
      AV60Webwmaqfasds_11_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV50Webwmaqfasds_1_filterfulltext ,
                                           AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                           AV51Webwmaqfasds_2_tfmaqcod ,
                                           AV54Webwmaqfasds_5_tfmaqest_sel ,
                                           AV53Webwmaqfasds_4_tfmaqest ,
                                           AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                           AV55Webwmaqfasds_6_tfmaqdsc ,
                                           AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                           AV57Webwmaqfasds_8_tfmaqfcod ,
                                           AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                           AV59Webwmaqfasds_10_tfmaqfdsc ,
                                           A602MaqCod ,
                                           A607MaqEst ,
                                           A606MaqDsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV51Webwmaqfasds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV51Webwmaqfasds_2_tfmaqcod), 6, "%") ;
      lV53Webwmaqfasds_4_tfmaqest = GXutil.padr( GXutil.rtrim( AV53Webwmaqfasds_4_tfmaqest), 1, "%") ;
      lV55Webwmaqfasds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV55Webwmaqfasds_6_tfmaqdsc), 16, "%") ;
      lV57Webwmaqfasds_8_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV57Webwmaqfasds_8_tfmaqfcod), 8, "%") ;
      lV59Webwmaqfasds_10_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV59Webwmaqfasds_10_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08BQ4 */
      pr_default.execute(2, new Object[] {lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV51Webwmaqfasds_2_tfmaqcod, AV52Webwmaqfasds_3_tfmaqcod_sel, lV53Webwmaqfasds_4_tfmaqest, AV54Webwmaqfasds_5_tfmaqest_sel, lV55Webwmaqfasds_6_tfmaqdsc, AV56Webwmaqfasds_7_tfmaqdsc_sel, lV57Webwmaqfasds_8_tfmaqfcod, AV58Webwmaqfasds_9_tfmaqfcod_sel, lV59Webwmaqfasds_10_tfmaqfdsc, AV60Webwmaqfasds_11_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8BQ6 = false ;
         A396EmprCod = P08BQ4_A396EmprCod[0] ;
         A606MaqDsc = P08BQ4_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ4_n606MaqDsc[0] ;
         A1143MaqFDsc = P08BQ4_A1143MaqFDsc[0] ;
         A1142MaqFCod = P08BQ4_A1142MaqFCod[0] ;
         A607MaqEst = P08BQ4_A607MaqEst[0] ;
         n607MaqEst = P08BQ4_n607MaqEst[0] ;
         A602MaqCod = P08BQ4_A602MaqCod[0] ;
         A606MaqDsc = P08BQ4_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ4_n606MaqDsc[0] ;
         A607MaqEst = P08BQ4_A607MaqEst[0] ;
         n607MaqEst = P08BQ4_n607MaqEst[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08BQ4_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8BQ6 = false ;
            A396EmprCod = P08BQ4_A396EmprCod[0] ;
            A1142MaqFCod = P08BQ4_A1142MaqFCod[0] ;
            A602MaqCod = P08BQ4_A602MaqCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8BQ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
         {
            AV22Option = A606MaqDsc ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BQ6 )
         {
            brk8BQ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMAQFCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMaqFCod = AV18SearchTxt ;
      AV15TFMaqFCod_Sel = "" ;
      AV50Webwmaqfasds_1_filterfulltext = AV37FilterFullText ;
      AV51Webwmaqfasds_2_tfmaqcod = AV10TFMaqCod ;
      AV52Webwmaqfasds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV53Webwmaqfasds_4_tfmaqest = AV44TFMaqEst ;
      AV54Webwmaqfasds_5_tfmaqest_sel = AV45TFMaqEst_Sel ;
      AV55Webwmaqfasds_6_tfmaqdsc = AV12TFMaqDsc ;
      AV56Webwmaqfasds_7_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV57Webwmaqfasds_8_tfmaqfcod = AV14TFMaqFCod ;
      AV58Webwmaqfasds_9_tfmaqfcod_sel = AV15TFMaqFCod_Sel ;
      AV59Webwmaqfasds_10_tfmaqfdsc = AV16TFMaqFDsc ;
      AV60Webwmaqfasds_11_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV50Webwmaqfasds_1_filterfulltext ,
                                           AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                           AV51Webwmaqfasds_2_tfmaqcod ,
                                           AV54Webwmaqfasds_5_tfmaqest_sel ,
                                           AV53Webwmaqfasds_4_tfmaqest ,
                                           AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                           AV55Webwmaqfasds_6_tfmaqdsc ,
                                           AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                           AV57Webwmaqfasds_8_tfmaqfcod ,
                                           AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                           AV59Webwmaqfasds_10_tfmaqfdsc ,
                                           A602MaqCod ,
                                           A607MaqEst ,
                                           A606MaqDsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV51Webwmaqfasds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV51Webwmaqfasds_2_tfmaqcod), 6, "%") ;
      lV53Webwmaqfasds_4_tfmaqest = GXutil.padr( GXutil.rtrim( AV53Webwmaqfasds_4_tfmaqest), 1, "%") ;
      lV55Webwmaqfasds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV55Webwmaqfasds_6_tfmaqdsc), 16, "%") ;
      lV57Webwmaqfasds_8_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV57Webwmaqfasds_8_tfmaqfcod), 8, "%") ;
      lV59Webwmaqfasds_10_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV59Webwmaqfasds_10_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08BQ5 */
      pr_default.execute(3, new Object[] {lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV51Webwmaqfasds_2_tfmaqcod, AV52Webwmaqfasds_3_tfmaqcod_sel, lV53Webwmaqfasds_4_tfmaqest, AV54Webwmaqfasds_5_tfmaqest_sel, lV55Webwmaqfasds_6_tfmaqdsc, AV56Webwmaqfasds_7_tfmaqdsc_sel, lV57Webwmaqfasds_8_tfmaqfcod, AV58Webwmaqfasds_9_tfmaqfcod_sel, lV59Webwmaqfasds_10_tfmaqfdsc, AV60Webwmaqfasds_11_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8BQ8 = false ;
         A396EmprCod = P08BQ5_A396EmprCod[0] ;
         A1142MaqFCod = P08BQ5_A1142MaqFCod[0] ;
         A1143MaqFDsc = P08BQ5_A1143MaqFDsc[0] ;
         A606MaqDsc = P08BQ5_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ5_n606MaqDsc[0] ;
         A607MaqEst = P08BQ5_A607MaqEst[0] ;
         n607MaqEst = P08BQ5_n607MaqEst[0] ;
         A602MaqCod = P08BQ5_A602MaqCod[0] ;
         A606MaqDsc = P08BQ5_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ5_n606MaqDsc[0] ;
         A607MaqEst = P08BQ5_A607MaqEst[0] ;
         n607MaqEst = P08BQ5_n607MaqEst[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08BQ5_A1142MaqFCod[0], A1142MaqFCod) == 0 ) )
         {
            brk8BQ8 = false ;
            A396EmprCod = P08BQ5_A396EmprCod[0] ;
            A602MaqCod = P08BQ5_A602MaqCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8BQ8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1142MaqFCod)==0) )
         {
            AV22Option = A1142MaqFCod ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BQ8 )
         {
            brk8BQ8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADMAQFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqFDsc = AV18SearchTxt ;
      AV17TFMaqFDsc_Sel = "" ;
      AV50Webwmaqfasds_1_filterfulltext = AV37FilterFullText ;
      AV51Webwmaqfasds_2_tfmaqcod = AV10TFMaqCod ;
      AV52Webwmaqfasds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV53Webwmaqfasds_4_tfmaqest = AV44TFMaqEst ;
      AV54Webwmaqfasds_5_tfmaqest_sel = AV45TFMaqEst_Sel ;
      AV55Webwmaqfasds_6_tfmaqdsc = AV12TFMaqDsc ;
      AV56Webwmaqfasds_7_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV57Webwmaqfasds_8_tfmaqfcod = AV14TFMaqFCod ;
      AV58Webwmaqfasds_9_tfmaqfcod_sel = AV15TFMaqFCod_Sel ;
      AV59Webwmaqfasds_10_tfmaqfdsc = AV16TFMaqFDsc ;
      AV60Webwmaqfasds_11_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV50Webwmaqfasds_1_filterfulltext ,
                                           AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                           AV51Webwmaqfasds_2_tfmaqcod ,
                                           AV54Webwmaqfasds_5_tfmaqest_sel ,
                                           AV53Webwmaqfasds_4_tfmaqest ,
                                           AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                           AV55Webwmaqfasds_6_tfmaqdsc ,
                                           AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                           AV57Webwmaqfasds_8_tfmaqfcod ,
                                           AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                           AV59Webwmaqfasds_10_tfmaqfdsc ,
                                           A602MaqCod ,
                                           A607MaqEst ,
                                           A606MaqDsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV50Webwmaqfasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Webwmaqfasds_1_filterfulltext), "%", "") ;
      lV51Webwmaqfasds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV51Webwmaqfasds_2_tfmaqcod), 6, "%") ;
      lV53Webwmaqfasds_4_tfmaqest = GXutil.padr( GXutil.rtrim( AV53Webwmaqfasds_4_tfmaqest), 1, "%") ;
      lV55Webwmaqfasds_6_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV55Webwmaqfasds_6_tfmaqdsc), 16, "%") ;
      lV57Webwmaqfasds_8_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV57Webwmaqfasds_8_tfmaqfcod), 8, "%") ;
      lV59Webwmaqfasds_10_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV59Webwmaqfasds_10_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08BQ6 */
      pr_default.execute(4, new Object[] {lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV50Webwmaqfasds_1_filterfulltext, lV51Webwmaqfasds_2_tfmaqcod, AV52Webwmaqfasds_3_tfmaqcod_sel, lV53Webwmaqfasds_4_tfmaqest, AV54Webwmaqfasds_5_tfmaqest_sel, lV55Webwmaqfasds_6_tfmaqdsc, AV56Webwmaqfasds_7_tfmaqdsc_sel, lV57Webwmaqfasds_8_tfmaqfcod, AV58Webwmaqfasds_9_tfmaqfcod_sel, lV59Webwmaqfasds_10_tfmaqfdsc, AV60Webwmaqfasds_11_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8BQ10 = false ;
         A396EmprCod = P08BQ6_A396EmprCod[0] ;
         A1143MaqFDsc = P08BQ6_A1143MaqFDsc[0] ;
         A1142MaqFCod = P08BQ6_A1142MaqFCod[0] ;
         A606MaqDsc = P08BQ6_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ6_n606MaqDsc[0] ;
         A607MaqEst = P08BQ6_A607MaqEst[0] ;
         n607MaqEst = P08BQ6_n607MaqEst[0] ;
         A602MaqCod = P08BQ6_A602MaqCod[0] ;
         A606MaqDsc = P08BQ6_A606MaqDsc[0] ;
         n606MaqDsc = P08BQ6_n606MaqDsc[0] ;
         A607MaqEst = P08BQ6_A607MaqEst[0] ;
         n607MaqEst = P08BQ6_n607MaqEst[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08BQ6_A1143MaqFDsc[0], A1143MaqFDsc) == 0 ) )
         {
            brk8BQ10 = false ;
            A396EmprCod = P08BQ6_A396EmprCod[0] ;
            A1142MaqFCod = P08BQ6_A1142MaqFCod[0] ;
            A602MaqCod = P08BQ6_A602MaqCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8BQ10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1143MaqFDsc)==0) )
         {
            AV22Option = A1143MaqFDsc ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BQ10 )
         {
            brk8BQ10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwmaqfasgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = webwmaqfasgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = webwmaqfasgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV37FilterFullText = "" ;
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV44TFMaqEst = "" ;
      AV45TFMaqEst_Sel = "" ;
      AV12TFMaqDsc = "" ;
      AV13TFMaqDsc_Sel = "" ;
      AV14TFMaqFCod = "" ;
      AV15TFMaqFCod_Sel = "" ;
      AV16TFMaqFDsc = "" ;
      AV17TFMaqFDsc_Sel = "" ;
      A602MaqCod = "" ;
      AV50Webwmaqfasds_1_filterfulltext = "" ;
      AV51Webwmaqfasds_2_tfmaqcod = "" ;
      AV52Webwmaqfasds_3_tfmaqcod_sel = "" ;
      AV53Webwmaqfasds_4_tfmaqest = "" ;
      AV54Webwmaqfasds_5_tfmaqest_sel = "" ;
      AV55Webwmaqfasds_6_tfmaqdsc = "" ;
      AV56Webwmaqfasds_7_tfmaqdsc_sel = "" ;
      AV57Webwmaqfasds_8_tfmaqfcod = "" ;
      AV58Webwmaqfasds_9_tfmaqfcod_sel = "" ;
      AV59Webwmaqfasds_10_tfmaqfdsc = "" ;
      AV60Webwmaqfasds_11_tfmaqfdsc_sel = "" ;
      scmdbuf = "" ;
      lV50Webwmaqfasds_1_filterfulltext = "" ;
      lV51Webwmaqfasds_2_tfmaqcod = "" ;
      lV53Webwmaqfasds_4_tfmaqest = "" ;
      lV55Webwmaqfasds_6_tfmaqdsc = "" ;
      lV57Webwmaqfasds_8_tfmaqfcod = "" ;
      lV59Webwmaqfasds_10_tfmaqfdsc = "" ;
      A607MaqEst = "" ;
      A606MaqDsc = "" ;
      A1142MaqFCod = "" ;
      A1143MaqFDsc = "" ;
      P08BQ2_A396EmprCod = new String[] {""} ;
      P08BQ2_A602MaqCod = new String[] {""} ;
      P08BQ2_A1143MaqFDsc = new String[] {""} ;
      P08BQ2_A1142MaqFCod = new String[] {""} ;
      P08BQ2_A606MaqDsc = new String[] {""} ;
      P08BQ2_n606MaqDsc = new boolean[] {false} ;
      P08BQ2_A607MaqEst = new String[] {""} ;
      P08BQ2_n607MaqEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      P08BQ3_A396EmprCod = new String[] {""} ;
      P08BQ3_A607MaqEst = new String[] {""} ;
      P08BQ3_n607MaqEst = new boolean[] {false} ;
      P08BQ3_A1143MaqFDsc = new String[] {""} ;
      P08BQ3_A1142MaqFCod = new String[] {""} ;
      P08BQ3_A606MaqDsc = new String[] {""} ;
      P08BQ3_n606MaqDsc = new boolean[] {false} ;
      P08BQ3_A602MaqCod = new String[] {""} ;
      AV25OptionDesc = "" ;
      P08BQ4_A396EmprCod = new String[] {""} ;
      P08BQ4_A606MaqDsc = new String[] {""} ;
      P08BQ4_n606MaqDsc = new boolean[] {false} ;
      P08BQ4_A1143MaqFDsc = new String[] {""} ;
      P08BQ4_A1142MaqFCod = new String[] {""} ;
      P08BQ4_A607MaqEst = new String[] {""} ;
      P08BQ4_n607MaqEst = new boolean[] {false} ;
      P08BQ4_A602MaqCod = new String[] {""} ;
      P08BQ5_A396EmprCod = new String[] {""} ;
      P08BQ5_A1142MaqFCod = new String[] {""} ;
      P08BQ5_A1143MaqFDsc = new String[] {""} ;
      P08BQ5_A606MaqDsc = new String[] {""} ;
      P08BQ5_n606MaqDsc = new boolean[] {false} ;
      P08BQ5_A607MaqEst = new String[] {""} ;
      P08BQ5_n607MaqEst = new boolean[] {false} ;
      P08BQ5_A602MaqCod = new String[] {""} ;
      P08BQ6_A396EmprCod = new String[] {""} ;
      P08BQ6_A1143MaqFDsc = new String[] {""} ;
      P08BQ6_A1142MaqFCod = new String[] {""} ;
      P08BQ6_A606MaqDsc = new String[] {""} ;
      P08BQ6_n606MaqDsc = new boolean[] {false} ;
      P08BQ6_A607MaqEst = new String[] {""} ;
      P08BQ6_n607MaqEst = new boolean[] {false} ;
      P08BQ6_A602MaqCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwmaqfasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08BQ2_A396EmprCod, P08BQ2_A602MaqCod, P08BQ2_A1143MaqFDsc, P08BQ2_A1142MaqFCod, P08BQ2_A606MaqDsc, P08BQ2_n606MaqDsc, P08BQ2_A607MaqEst, P08BQ2_n607MaqEst
            }
            , new Object[] {
            P08BQ3_A396EmprCod, P08BQ3_A607MaqEst, P08BQ3_n607MaqEst, P08BQ3_A1143MaqFDsc, P08BQ3_A1142MaqFCod, P08BQ3_A606MaqDsc, P08BQ3_n606MaqDsc, P08BQ3_A602MaqCod
            }
            , new Object[] {
            P08BQ4_A396EmprCod, P08BQ4_A606MaqDsc, P08BQ4_n606MaqDsc, P08BQ4_A1143MaqFDsc, P08BQ4_A1142MaqFCod, P08BQ4_A607MaqEst, P08BQ4_n607MaqEst, P08BQ4_A602MaqCod
            }
            , new Object[] {
            P08BQ5_A396EmprCod, P08BQ5_A1142MaqFCod, P08BQ5_A1143MaqFDsc, P08BQ5_A606MaqDsc, P08BQ5_n606MaqDsc, P08BQ5_A607MaqEst, P08BQ5_n607MaqEst, P08BQ5_A602MaqCod
            }
            , new Object[] {
            P08BQ6_A396EmprCod, P08BQ6_A1143MaqFDsc, P08BQ6_A1142MaqFCod, P08BQ6_A606MaqDsc, P08BQ6_n606MaqDsc, P08BQ6_A607MaqEst, P08BQ6_n607MaqEst, P08BQ6_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV48GXV1 ;
   private long AV30count ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV44TFMaqEst ;
   private String AV45TFMaqEst_Sel ;
   private String AV12TFMaqDsc ;
   private String AV13TFMaqDsc_Sel ;
   private String AV14TFMaqFCod ;
   private String AV15TFMaqFCod_Sel ;
   private String AV16TFMaqFDsc ;
   private String AV17TFMaqFDsc_Sel ;
   private String A602MaqCod ;
   private String AV51Webwmaqfasds_2_tfmaqcod ;
   private String AV52Webwmaqfasds_3_tfmaqcod_sel ;
   private String AV53Webwmaqfasds_4_tfmaqest ;
   private String AV54Webwmaqfasds_5_tfmaqest_sel ;
   private String AV55Webwmaqfasds_6_tfmaqdsc ;
   private String AV56Webwmaqfasds_7_tfmaqdsc_sel ;
   private String AV57Webwmaqfasds_8_tfmaqfcod ;
   private String AV58Webwmaqfasds_9_tfmaqfcod_sel ;
   private String AV59Webwmaqfasds_10_tfmaqfdsc ;
   private String AV60Webwmaqfasds_11_tfmaqfdsc_sel ;
   private String scmdbuf ;
   private String lV51Webwmaqfasds_2_tfmaqcod ;
   private String lV53Webwmaqfasds_4_tfmaqest ;
   private String lV55Webwmaqfasds_6_tfmaqdsc ;
   private String lV57Webwmaqfasds_8_tfmaqfcod ;
   private String lV59Webwmaqfasds_10_tfmaqfdsc ;
   private String A607MaqEst ;
   private String A606MaqDsc ;
   private String A1142MaqFCod ;
   private String A1143MaqFDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8BQ2 ;
   private boolean n606MaqDsc ;
   private boolean n607MaqEst ;
   private boolean brk8BQ4 ;
   private boolean brk8BQ6 ;
   private boolean brk8BQ8 ;
   private boolean brk8BQ10 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV37FilterFullText ;
   private String AV50Webwmaqfasds_1_filterfulltext ;
   private String lV50Webwmaqfasds_1_filterfulltext ;
   private String AV22Option ;
   private String AV25OptionDesc ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08BQ2_A396EmprCod ;
   private String[] P08BQ2_A602MaqCod ;
   private String[] P08BQ2_A1143MaqFDsc ;
   private String[] P08BQ2_A1142MaqFCod ;
   private String[] P08BQ2_A606MaqDsc ;
   private boolean[] P08BQ2_n606MaqDsc ;
   private String[] P08BQ2_A607MaqEst ;
   private boolean[] P08BQ2_n607MaqEst ;
   private String[] P08BQ3_A396EmprCod ;
   private String[] P08BQ3_A607MaqEst ;
   private boolean[] P08BQ3_n607MaqEst ;
   private String[] P08BQ3_A1143MaqFDsc ;
   private String[] P08BQ3_A1142MaqFCod ;
   private String[] P08BQ3_A606MaqDsc ;
   private boolean[] P08BQ3_n606MaqDsc ;
   private String[] P08BQ3_A602MaqCod ;
   private String[] P08BQ4_A396EmprCod ;
   private String[] P08BQ4_A606MaqDsc ;
   private boolean[] P08BQ4_n606MaqDsc ;
   private String[] P08BQ4_A1143MaqFDsc ;
   private String[] P08BQ4_A1142MaqFCod ;
   private String[] P08BQ4_A607MaqEst ;
   private boolean[] P08BQ4_n607MaqEst ;
   private String[] P08BQ4_A602MaqCod ;
   private String[] P08BQ5_A396EmprCod ;
   private String[] P08BQ5_A1142MaqFCod ;
   private String[] P08BQ5_A1143MaqFDsc ;
   private String[] P08BQ5_A606MaqDsc ;
   private boolean[] P08BQ5_n606MaqDsc ;
   private String[] P08BQ5_A607MaqEst ;
   private boolean[] P08BQ5_n607MaqEst ;
   private String[] P08BQ5_A602MaqCod ;
   private String[] P08BQ6_A396EmprCod ;
   private String[] P08BQ6_A1143MaqFDsc ;
   private String[] P08BQ6_A1142MaqFCod ;
   private String[] P08BQ6_A606MaqDsc ;
   private boolean[] P08BQ6_n606MaqDsc ;
   private String[] P08BQ6_A607MaqEst ;
   private boolean[] P08BQ6_n607MaqEst ;
   private String[] P08BQ6_A602MaqCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class webwmaqfasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Webwmaqfasds_1_filterfulltext ,
                                          String AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                          String AV51Webwmaqfasds_2_tfmaqcod ,
                                          String AV54Webwmaqfasds_5_tfmaqest_sel ,
                                          String AV53Webwmaqfasds_4_tfmaqest ,
                                          String AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                          String AV55Webwmaqfasds_6_tfmaqdsc ,
                                          String AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                          String AV57Webwmaqfasds_8_tfmaqfcod ,
                                          String AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                          String AV59Webwmaqfasds_10_tfmaqfdsc ,
                                          String A602MaqCod ,
                                          String A607MaqEst ,
                                          String A606MaqDsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.MaqFDsc, T1.MaqFCod, T2.MaqDsc, T2.MaqEst FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod =" ;
      scmdbuf += " T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV50Webwmaqfasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqEst) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqFCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV51Webwmaqfasds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV53Webwmaqfasds_4_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqEst = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Webwmaqfasds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Webwmaqfasds_8_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Webwmaqfasds_10_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08BQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Webwmaqfasds_1_filterfulltext ,
                                          String AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                          String AV51Webwmaqfasds_2_tfmaqcod ,
                                          String AV54Webwmaqfasds_5_tfmaqest_sel ,
                                          String AV53Webwmaqfasds_4_tfmaqest ,
                                          String AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                          String AV55Webwmaqfasds_6_tfmaqdsc ,
                                          String AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                          String AV57Webwmaqfasds_8_tfmaqfcod ,
                                          String AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                          String AV59Webwmaqfasds_10_tfmaqfdsc ,
                                          String A602MaqCod ,
                                          String A607MaqEst ,
                                          String A606MaqDsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[15];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.MaqEst, T1.MaqFDsc, T1.MaqFCod, T2.MaqDsc, T1.MaqCod FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod =" ;
      scmdbuf += " T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV50Webwmaqfasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqEst) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqFCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV51Webwmaqfasds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV53Webwmaqfasds_4_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqEst = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Webwmaqfasds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Webwmaqfasds_8_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFCod = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Webwmaqfasds_10_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.MaqEst" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08BQ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Webwmaqfasds_1_filterfulltext ,
                                          String AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                          String AV51Webwmaqfasds_2_tfmaqcod ,
                                          String AV54Webwmaqfasds_5_tfmaqest_sel ,
                                          String AV53Webwmaqfasds_4_tfmaqest ,
                                          String AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                          String AV55Webwmaqfasds_6_tfmaqdsc ,
                                          String AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                          String AV57Webwmaqfasds_8_tfmaqfcod ,
                                          String AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                          String AV59Webwmaqfasds_10_tfmaqfdsc ,
                                          String A602MaqCod ,
                                          String A607MaqEst ,
                                          String A606MaqDsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.MaqDsc, T1.MaqFDsc, T1.MaqFCod, T2.MaqEst, T1.MaqCod FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod =" ;
      scmdbuf += " T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV50Webwmaqfasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqEst) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqFCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV51Webwmaqfasds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV53Webwmaqfasds_4_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqEst = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Webwmaqfasds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Webwmaqfasds_8_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFCod = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Webwmaqfasds_10_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.MaqDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08BQ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Webwmaqfasds_1_filterfulltext ,
                                          String AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                          String AV51Webwmaqfasds_2_tfmaqcod ,
                                          String AV54Webwmaqfasds_5_tfmaqest_sel ,
                                          String AV53Webwmaqfasds_4_tfmaqest ,
                                          String AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                          String AV55Webwmaqfasds_6_tfmaqdsc ,
                                          String AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                          String AV57Webwmaqfasds_8_tfmaqfcod ,
                                          String AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                          String AV59Webwmaqfasds_10_tfmaqfdsc ,
                                          String A602MaqCod ,
                                          String A607MaqEst ,
                                          String A606MaqDsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[15];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqFCod, T1.MaqFDsc, T2.MaqDsc, T2.MaqEst, T1.MaqCod FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod =" ;
      scmdbuf += " T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV50Webwmaqfasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqEst) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqFCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV51Webwmaqfasds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV53Webwmaqfasds_4_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqEst = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Webwmaqfasds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Webwmaqfasds_8_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFCod = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Webwmaqfasds_10_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqFCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08BQ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Webwmaqfasds_1_filterfulltext ,
                                          String AV52Webwmaqfasds_3_tfmaqcod_sel ,
                                          String AV51Webwmaqfasds_2_tfmaqcod ,
                                          String AV54Webwmaqfasds_5_tfmaqest_sel ,
                                          String AV53Webwmaqfasds_4_tfmaqest ,
                                          String AV56Webwmaqfasds_7_tfmaqdsc_sel ,
                                          String AV55Webwmaqfasds_6_tfmaqdsc ,
                                          String AV58Webwmaqfasds_9_tfmaqfcod_sel ,
                                          String AV57Webwmaqfasds_8_tfmaqfcod ,
                                          String AV60Webwmaqfasds_11_tfmaqfdsc_sel ,
                                          String AV59Webwmaqfasds_10_tfmaqfdsc ,
                                          String A602MaqCod ,
                                          String A607MaqEst ,
                                          String A606MaqDsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[15];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqFDsc, T1.MaqFCod, T2.MaqDsc, T2.MaqEst, T1.MaqCod FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod =" ;
      scmdbuf += " T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV50Webwmaqfasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqEst) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqFCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV51Webwmaqfasds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Webwmaqfasds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV53Webwmaqfasds_4_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Webwmaqfasds_5_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqEst = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Webwmaqfasds_6_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Webwmaqfasds_7_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV57Webwmaqfasds_8_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Webwmaqfasds_9_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFCod = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Webwmaqfasds_10_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Webwmaqfasds_11_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqFDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P08BQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P08BQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 2 :
                  return conditional_P08BQ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 3 :
                  return conditional_P08BQ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 4 :
                  return conditional_P08BQ6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BQ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BQ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08BQ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 28);
               }
               return;
      }
   }

}

