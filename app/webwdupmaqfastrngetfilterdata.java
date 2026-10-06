package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwdupmaqfastrngetfilterdata extends GXProcedure
{
   public webwdupmaqfastrngetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwdupmaqfastrngetfilterdata.class ), "" );
   }

   public webwdupmaqfastrngetfilterdata( int remoteHandle ,
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
      webwdupmaqfastrngetfilterdata.this.aP5 = new String[] {""};
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
      webwdupmaqfastrngetfilterdata.this.AV20DDOName = aP0;
      webwdupmaqfastrngetfilterdata.this.AV18SearchTxt = aP1;
      webwdupmaqfastrngetfilterdata.this.AV19SearchTxtTo = aP2;
      webwdupmaqfastrngetfilterdata.this.aP3 = aP3;
      webwdupmaqfastrngetfilterdata.this.aP4 = aP4;
      webwdupmaqfastrngetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQDSCOPTIONS' */
         S131 ();
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
         S141 ();
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
         S151 ();
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
      if ( GXutil.strcmp(AV31Session.getValue("WebWdupMaqFasTrnGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWdupMaqFasTrnGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WebWdupMaqFasTrnGridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV18SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV61Webwdupmaqfastrnds_1_filterfulltext = AV50FilterFullText ;
      AV62Webwdupmaqfastrnds_2_tfmaqcod = AV10TFMaqCod ;
      AV63Webwdupmaqfastrnds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV64Webwdupmaqfastrnds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV66Webwdupmaqfastrnds_6_tfmaqfcod = AV14TFMaqFCod ;
      AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel = AV15TFMaqFCod_Sel ;
      AV68Webwdupmaqfastrnds_8_tfmaqfdsc = AV16TFMaqFDsc ;
      AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Webwdupmaqfastrnds_1_filterfulltext ,
                                           AV63Webwdupmaqfastrnds_3_tfmaqcod_sel ,
                                           AV62Webwdupmaqfastrnds_2_tfmaqcod ,
                                           AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel ,
                                           AV64Webwdupmaqfastrnds_4_tfmaqdsc ,
                                           AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel ,
                                           AV66Webwdupmaqfastrnds_6_tfmaqfcod ,
                                           AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel ,
                                           AV68Webwdupmaqfastrnds_8_tfmaqfdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV62Webwdupmaqfastrnds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV62Webwdupmaqfastrnds_2_tfmaqcod), 6, "%") ;
      lV64Webwdupmaqfastrnds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV64Webwdupmaqfastrnds_4_tfmaqdsc), 16, "%") ;
      lV66Webwdupmaqfastrnds_6_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV66Webwdupmaqfastrnds_6_tfmaqfcod), 8, "%") ;
      lV68Webwdupmaqfastrnds_8_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV68Webwdupmaqfastrnds_8_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08CO2 */
      pr_default.execute(0, new Object[] {lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV62Webwdupmaqfastrnds_2_tfmaqcod, AV63Webwdupmaqfastrnds_3_tfmaqcod_sel, lV64Webwdupmaqfastrnds_4_tfmaqdsc, AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel, lV66Webwdupmaqfastrnds_6_tfmaqfcod, AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel, lV68Webwdupmaqfastrnds_8_tfmaqfdsc, AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8CO2 = false ;
         A396EmprCod = P08CO2_A396EmprCod[0] ;
         A602MaqCod = P08CO2_A602MaqCod[0] ;
         A1143MaqFDsc = P08CO2_A1143MaqFDsc[0] ;
         A1142MaqFCod = P08CO2_A1142MaqFCod[0] ;
         A606MaqDsc = P08CO2_A606MaqDsc[0] ;
         n606MaqDsc = P08CO2_n606MaqDsc[0] ;
         A606MaqDsc = P08CO2_A606MaqDsc[0] ;
         n606MaqDsc = P08CO2_n606MaqDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08CO2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8CO2 = false ;
            A396EmprCod = P08CO2_A396EmprCod[0] ;
            A1142MaqFCod = P08CO2_A1142MaqFCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8CO2 = true ;
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
         if ( ! brk8CO2 )
         {
            brk8CO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqDsc = AV18SearchTxt ;
      AV13TFMaqDsc_Sel = "" ;
      AV61Webwdupmaqfastrnds_1_filterfulltext = AV50FilterFullText ;
      AV62Webwdupmaqfastrnds_2_tfmaqcod = AV10TFMaqCod ;
      AV63Webwdupmaqfastrnds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV64Webwdupmaqfastrnds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV66Webwdupmaqfastrnds_6_tfmaqfcod = AV14TFMaqFCod ;
      AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel = AV15TFMaqFCod_Sel ;
      AV68Webwdupmaqfastrnds_8_tfmaqfdsc = AV16TFMaqFDsc ;
      AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Webwdupmaqfastrnds_1_filterfulltext ,
                                           AV63Webwdupmaqfastrnds_3_tfmaqcod_sel ,
                                           AV62Webwdupmaqfastrnds_2_tfmaqcod ,
                                           AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel ,
                                           AV64Webwdupmaqfastrnds_4_tfmaqdsc ,
                                           AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel ,
                                           AV66Webwdupmaqfastrnds_6_tfmaqfcod ,
                                           AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel ,
                                           AV68Webwdupmaqfastrnds_8_tfmaqfdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV62Webwdupmaqfastrnds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV62Webwdupmaqfastrnds_2_tfmaqcod), 6, "%") ;
      lV64Webwdupmaqfastrnds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV64Webwdupmaqfastrnds_4_tfmaqdsc), 16, "%") ;
      lV66Webwdupmaqfastrnds_6_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV66Webwdupmaqfastrnds_6_tfmaqfcod), 8, "%") ;
      lV68Webwdupmaqfastrnds_8_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV68Webwdupmaqfastrnds_8_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08CO3 */
      pr_default.execute(1, new Object[] {lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV62Webwdupmaqfastrnds_2_tfmaqcod, AV63Webwdupmaqfastrnds_3_tfmaqcod_sel, lV64Webwdupmaqfastrnds_4_tfmaqdsc, AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel, lV66Webwdupmaqfastrnds_6_tfmaqfcod, AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel, lV68Webwdupmaqfastrnds_8_tfmaqfdsc, AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8CO4 = false ;
         A396EmprCod = P08CO3_A396EmprCod[0] ;
         A606MaqDsc = P08CO3_A606MaqDsc[0] ;
         n606MaqDsc = P08CO3_n606MaqDsc[0] ;
         A1143MaqFDsc = P08CO3_A1143MaqFDsc[0] ;
         A1142MaqFCod = P08CO3_A1142MaqFCod[0] ;
         A602MaqCod = P08CO3_A602MaqCod[0] ;
         A606MaqDsc = P08CO3_A606MaqDsc[0] ;
         n606MaqDsc = P08CO3_n606MaqDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08CO3_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8CO4 = false ;
            A396EmprCod = P08CO3_A396EmprCod[0] ;
            A1142MaqFCod = P08CO3_A1142MaqFCod[0] ;
            A602MaqCod = P08CO3_A602MaqCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8CO4 = true ;
            pr_default.readNext(1);
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
         if ( ! brk8CO4 )
         {
            brk8CO4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMAQFCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMaqFCod = AV18SearchTxt ;
      AV15TFMaqFCod_Sel = "" ;
      AV61Webwdupmaqfastrnds_1_filterfulltext = AV50FilterFullText ;
      AV62Webwdupmaqfastrnds_2_tfmaqcod = AV10TFMaqCod ;
      AV63Webwdupmaqfastrnds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV64Webwdupmaqfastrnds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV66Webwdupmaqfastrnds_6_tfmaqfcod = AV14TFMaqFCod ;
      AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel = AV15TFMaqFCod_Sel ;
      AV68Webwdupmaqfastrnds_8_tfmaqfdsc = AV16TFMaqFDsc ;
      AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV61Webwdupmaqfastrnds_1_filterfulltext ,
                                           AV63Webwdupmaqfastrnds_3_tfmaqcod_sel ,
                                           AV62Webwdupmaqfastrnds_2_tfmaqcod ,
                                           AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel ,
                                           AV64Webwdupmaqfastrnds_4_tfmaqdsc ,
                                           AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel ,
                                           AV66Webwdupmaqfastrnds_6_tfmaqfcod ,
                                           AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel ,
                                           AV68Webwdupmaqfastrnds_8_tfmaqfdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV62Webwdupmaqfastrnds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV62Webwdupmaqfastrnds_2_tfmaqcod), 6, "%") ;
      lV64Webwdupmaqfastrnds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV64Webwdupmaqfastrnds_4_tfmaqdsc), 16, "%") ;
      lV66Webwdupmaqfastrnds_6_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV66Webwdupmaqfastrnds_6_tfmaqfcod), 8, "%") ;
      lV68Webwdupmaqfastrnds_8_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV68Webwdupmaqfastrnds_8_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08CO4 */
      pr_default.execute(2, new Object[] {lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV62Webwdupmaqfastrnds_2_tfmaqcod, AV63Webwdupmaqfastrnds_3_tfmaqcod_sel, lV64Webwdupmaqfastrnds_4_tfmaqdsc, AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel, lV66Webwdupmaqfastrnds_6_tfmaqfcod, AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel, lV68Webwdupmaqfastrnds_8_tfmaqfdsc, AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8CO6 = false ;
         A396EmprCod = P08CO4_A396EmprCod[0] ;
         A1142MaqFCod = P08CO4_A1142MaqFCod[0] ;
         A1143MaqFDsc = P08CO4_A1143MaqFDsc[0] ;
         A606MaqDsc = P08CO4_A606MaqDsc[0] ;
         n606MaqDsc = P08CO4_n606MaqDsc[0] ;
         A602MaqCod = P08CO4_A602MaqCod[0] ;
         A606MaqDsc = P08CO4_A606MaqDsc[0] ;
         n606MaqDsc = P08CO4_n606MaqDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08CO4_A1142MaqFCod[0], A1142MaqFCod) == 0 ) )
         {
            brk8CO6 = false ;
            A396EmprCod = P08CO4_A396EmprCod[0] ;
            A602MaqCod = P08CO4_A602MaqCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8CO6 = true ;
            pr_default.readNext(2);
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
         if ( ! brk8CO6 )
         {
            brk8CO6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMAQFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqFDsc = AV18SearchTxt ;
      AV17TFMaqFDsc_Sel = "" ;
      AV61Webwdupmaqfastrnds_1_filterfulltext = AV50FilterFullText ;
      AV62Webwdupmaqfastrnds_2_tfmaqcod = AV10TFMaqCod ;
      AV63Webwdupmaqfastrnds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV64Webwdupmaqfastrnds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      AV66Webwdupmaqfastrnds_6_tfmaqfcod = AV14TFMaqFCod ;
      AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel = AV15TFMaqFCod_Sel ;
      AV68Webwdupmaqfastrnds_8_tfmaqfdsc = AV16TFMaqFDsc ;
      AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel = AV17TFMaqFDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV61Webwdupmaqfastrnds_1_filterfulltext ,
                                           AV63Webwdupmaqfastrnds_3_tfmaqcod_sel ,
                                           AV62Webwdupmaqfastrnds_2_tfmaqcod ,
                                           AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel ,
                                           AV64Webwdupmaqfastrnds_4_tfmaqdsc ,
                                           AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel ,
                                           AV66Webwdupmaqfastrnds_6_tfmaqfcod ,
                                           AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel ,
                                           AV68Webwdupmaqfastrnds_8_tfmaqfdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A1142MaqFCod ,
                                           A1143MaqFDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Webwdupmaqfastrnds_1_filterfulltext), "%", "") ;
      lV62Webwdupmaqfastrnds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV62Webwdupmaqfastrnds_2_tfmaqcod), 6, "%") ;
      lV64Webwdupmaqfastrnds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV64Webwdupmaqfastrnds_4_tfmaqdsc), 16, "%") ;
      lV66Webwdupmaqfastrnds_6_tfmaqfcod = GXutil.padr( GXutil.rtrim( AV66Webwdupmaqfastrnds_6_tfmaqfcod), 8, "%") ;
      lV68Webwdupmaqfastrnds_8_tfmaqfdsc = GXutil.padr( GXutil.rtrim( AV68Webwdupmaqfastrnds_8_tfmaqfdsc), 28, "%") ;
      /* Using cursor P08CO5 */
      pr_default.execute(3, new Object[] {lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV61Webwdupmaqfastrnds_1_filterfulltext, lV62Webwdupmaqfastrnds_2_tfmaqcod, AV63Webwdupmaqfastrnds_3_tfmaqcod_sel, lV64Webwdupmaqfastrnds_4_tfmaqdsc, AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel, lV66Webwdupmaqfastrnds_6_tfmaqfcod, AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel, lV68Webwdupmaqfastrnds_8_tfmaqfdsc, AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8CO8 = false ;
         A396EmprCod = P08CO5_A396EmprCod[0] ;
         A1143MaqFDsc = P08CO5_A1143MaqFDsc[0] ;
         A1142MaqFCod = P08CO5_A1142MaqFCod[0] ;
         A606MaqDsc = P08CO5_A606MaqDsc[0] ;
         n606MaqDsc = P08CO5_n606MaqDsc[0] ;
         A602MaqCod = P08CO5_A602MaqCod[0] ;
         A606MaqDsc = P08CO5_A606MaqDsc[0] ;
         n606MaqDsc = P08CO5_n606MaqDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08CO5_A1143MaqFDsc[0], A1143MaqFDsc) == 0 ) )
         {
            brk8CO8 = false ;
            A396EmprCod = P08CO5_A396EmprCod[0] ;
            A1142MaqFCod = P08CO5_A1142MaqFCod[0] ;
            A602MaqCod = P08CO5_A602MaqCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8CO8 = true ;
            pr_default.readNext(3);
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
         if ( ! brk8CO8 )
         {
            brk8CO8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwdupmaqfastrngetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = webwdupmaqfastrngetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = webwdupmaqfastrngetfilterdata.this.AV29OptionIndexesJson;
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
      AV50FilterFullText = "" ;
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV12TFMaqDsc = "" ;
      AV13TFMaqDsc_Sel = "" ;
      AV14TFMaqFCod = "" ;
      AV15TFMaqFCod_Sel = "" ;
      AV16TFMaqFDsc = "" ;
      AV17TFMaqFDsc_Sel = "" ;
      A602MaqCod = "" ;
      AV61Webwdupmaqfastrnds_1_filterfulltext = "" ;
      AV62Webwdupmaqfastrnds_2_tfmaqcod = "" ;
      AV63Webwdupmaqfastrnds_3_tfmaqcod_sel = "" ;
      AV64Webwdupmaqfastrnds_4_tfmaqdsc = "" ;
      AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel = "" ;
      AV66Webwdupmaqfastrnds_6_tfmaqfcod = "" ;
      AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel = "" ;
      AV68Webwdupmaqfastrnds_8_tfmaqfdsc = "" ;
      AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel = "" ;
      scmdbuf = "" ;
      lV61Webwdupmaqfastrnds_1_filterfulltext = "" ;
      lV62Webwdupmaqfastrnds_2_tfmaqcod = "" ;
      lV64Webwdupmaqfastrnds_4_tfmaqdsc = "" ;
      lV66Webwdupmaqfastrnds_6_tfmaqfcod = "" ;
      lV68Webwdupmaqfastrnds_8_tfmaqfdsc = "" ;
      A606MaqDsc = "" ;
      A1142MaqFCod = "" ;
      A1143MaqFDsc = "" ;
      P08CO2_A396EmprCod = new String[] {""} ;
      P08CO2_A602MaqCod = new String[] {""} ;
      P08CO2_A1143MaqFDsc = new String[] {""} ;
      P08CO2_A1142MaqFCod = new String[] {""} ;
      P08CO2_A606MaqDsc = new String[] {""} ;
      P08CO2_n606MaqDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      P08CO3_A396EmprCod = new String[] {""} ;
      P08CO3_A606MaqDsc = new String[] {""} ;
      P08CO3_n606MaqDsc = new boolean[] {false} ;
      P08CO3_A1143MaqFDsc = new String[] {""} ;
      P08CO3_A1142MaqFCod = new String[] {""} ;
      P08CO3_A602MaqCod = new String[] {""} ;
      P08CO4_A396EmprCod = new String[] {""} ;
      P08CO4_A1142MaqFCod = new String[] {""} ;
      P08CO4_A1143MaqFDsc = new String[] {""} ;
      P08CO4_A606MaqDsc = new String[] {""} ;
      P08CO4_n606MaqDsc = new boolean[] {false} ;
      P08CO4_A602MaqCod = new String[] {""} ;
      P08CO5_A396EmprCod = new String[] {""} ;
      P08CO5_A1143MaqFDsc = new String[] {""} ;
      P08CO5_A1142MaqFCod = new String[] {""} ;
      P08CO5_A606MaqDsc = new String[] {""} ;
      P08CO5_n606MaqDsc = new boolean[] {false} ;
      P08CO5_A602MaqCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwdupmaqfastrngetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08CO2_A396EmprCod, P08CO2_A602MaqCod, P08CO2_A1143MaqFDsc, P08CO2_A1142MaqFCod, P08CO2_A606MaqDsc, P08CO2_n606MaqDsc
            }
            , new Object[] {
            P08CO3_A396EmprCod, P08CO3_A606MaqDsc, P08CO3_n606MaqDsc, P08CO3_A1143MaqFDsc, P08CO3_A1142MaqFCod, P08CO3_A602MaqCod
            }
            , new Object[] {
            P08CO4_A396EmprCod, P08CO4_A1142MaqFCod, P08CO4_A1143MaqFDsc, P08CO4_A606MaqDsc, P08CO4_n606MaqDsc, P08CO4_A602MaqCod
            }
            , new Object[] {
            P08CO5_A396EmprCod, P08CO5_A1143MaqFDsc, P08CO5_A1142MaqFCod, P08CO5_A606MaqDsc, P08CO5_n606MaqDsc, P08CO5_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV59GXV1 ;
   private long AV30count ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV12TFMaqDsc ;
   private String AV13TFMaqDsc_Sel ;
   private String AV14TFMaqFCod ;
   private String AV15TFMaqFCod_Sel ;
   private String AV16TFMaqFDsc ;
   private String AV17TFMaqFDsc_Sel ;
   private String A602MaqCod ;
   private String AV62Webwdupmaqfastrnds_2_tfmaqcod ;
   private String AV63Webwdupmaqfastrnds_3_tfmaqcod_sel ;
   private String AV64Webwdupmaqfastrnds_4_tfmaqdsc ;
   private String AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel ;
   private String AV66Webwdupmaqfastrnds_6_tfmaqfcod ;
   private String AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel ;
   private String AV68Webwdupmaqfastrnds_8_tfmaqfdsc ;
   private String AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel ;
   private String scmdbuf ;
   private String lV62Webwdupmaqfastrnds_2_tfmaqcod ;
   private String lV64Webwdupmaqfastrnds_4_tfmaqdsc ;
   private String lV66Webwdupmaqfastrnds_6_tfmaqfcod ;
   private String lV68Webwdupmaqfastrnds_8_tfmaqfdsc ;
   private String A606MaqDsc ;
   private String A1142MaqFCod ;
   private String A1143MaqFDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8CO2 ;
   private boolean n606MaqDsc ;
   private boolean brk8CO4 ;
   private boolean brk8CO6 ;
   private boolean brk8CO8 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV61Webwdupmaqfastrnds_1_filterfulltext ;
   private String lV61Webwdupmaqfastrnds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08CO2_A396EmprCod ;
   private String[] P08CO2_A602MaqCod ;
   private String[] P08CO2_A1143MaqFDsc ;
   private String[] P08CO2_A1142MaqFCod ;
   private String[] P08CO2_A606MaqDsc ;
   private boolean[] P08CO2_n606MaqDsc ;
   private String[] P08CO3_A396EmprCod ;
   private String[] P08CO3_A606MaqDsc ;
   private boolean[] P08CO3_n606MaqDsc ;
   private String[] P08CO3_A1143MaqFDsc ;
   private String[] P08CO3_A1142MaqFCod ;
   private String[] P08CO3_A602MaqCod ;
   private String[] P08CO4_A396EmprCod ;
   private String[] P08CO4_A1142MaqFCod ;
   private String[] P08CO4_A1143MaqFDsc ;
   private String[] P08CO4_A606MaqDsc ;
   private boolean[] P08CO4_n606MaqDsc ;
   private String[] P08CO4_A602MaqCod ;
   private String[] P08CO5_A396EmprCod ;
   private String[] P08CO5_A1143MaqFDsc ;
   private String[] P08CO5_A1142MaqFCod ;
   private String[] P08CO5_A606MaqDsc ;
   private boolean[] P08CO5_n606MaqDsc ;
   private String[] P08CO5_A602MaqCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class webwdupmaqfastrngetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08CO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Webwdupmaqfastrnds_1_filterfulltext ,
                                          String AV63Webwdupmaqfastrnds_3_tfmaqcod_sel ,
                                          String AV62Webwdupmaqfastrnds_2_tfmaqcod ,
                                          String AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel ,
                                          String AV64Webwdupmaqfastrnds_4_tfmaqdsc ,
                                          String AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel ,
                                          String AV66Webwdupmaqfastrnds_6_tfmaqfcod ,
                                          String AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel ,
                                          String AV68Webwdupmaqfastrnds_8_tfmaqfdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.MaqFDsc, T1.MaqFCod, T2.MaqDsc FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV61Webwdupmaqfastrnds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqFCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Webwdupmaqfastrnds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Webwdupmaqfastrnds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Webwdupmaqfastrnds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Webwdupmaqfastrnds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Webwdupmaqfastrnds_6_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Webwdupmaqfastrnds_8_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08CO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Webwdupmaqfastrnds_1_filterfulltext ,
                                          String AV63Webwdupmaqfastrnds_3_tfmaqcod_sel ,
                                          String AV62Webwdupmaqfastrnds_2_tfmaqcod ,
                                          String AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel ,
                                          String AV64Webwdupmaqfastrnds_4_tfmaqdsc ,
                                          String AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel ,
                                          String AV66Webwdupmaqfastrnds_6_tfmaqfcod ,
                                          String AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel ,
                                          String AV68Webwdupmaqfastrnds_8_tfmaqfdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.MaqDsc, T1.MaqFDsc, T1.MaqFCod, T1.MaqCod FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV61Webwdupmaqfastrnds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqFCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Webwdupmaqfastrnds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Webwdupmaqfastrnds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Webwdupmaqfastrnds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Webwdupmaqfastrnds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Webwdupmaqfastrnds_6_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Webwdupmaqfastrnds_8_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.MaqDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08CO4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Webwdupmaqfastrnds_1_filterfulltext ,
                                          String AV63Webwdupmaqfastrnds_3_tfmaqcod_sel ,
                                          String AV62Webwdupmaqfastrnds_2_tfmaqcod ,
                                          String AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel ,
                                          String AV64Webwdupmaqfastrnds_4_tfmaqdsc ,
                                          String AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel ,
                                          String AV66Webwdupmaqfastrnds_6_tfmaqfcod ,
                                          String AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel ,
                                          String AV68Webwdupmaqfastrnds_8_tfmaqfdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqFCod, T1.MaqFDsc, T2.MaqDsc, T1.MaqCod FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV61Webwdupmaqfastrnds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqFCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Webwdupmaqfastrnds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Webwdupmaqfastrnds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Webwdupmaqfastrnds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Webwdupmaqfastrnds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Webwdupmaqfastrnds_6_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Webwdupmaqfastrnds_8_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqFCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08CO5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Webwdupmaqfastrnds_1_filterfulltext ,
                                          String AV63Webwdupmaqfastrnds_3_tfmaqcod_sel ,
                                          String AV62Webwdupmaqfastrnds_2_tfmaqcod ,
                                          String AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel ,
                                          String AV64Webwdupmaqfastrnds_4_tfmaqdsc ,
                                          String AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel ,
                                          String AV66Webwdupmaqfastrnds_6_tfmaqfcod ,
                                          String AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel ,
                                          String AV68Webwdupmaqfastrnds_8_tfmaqfdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A1142MaqFCod ,
                                          String A1143MaqFDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[12];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqFDsc, T1.MaqFCod, T2.MaqDsc, T1.MaqCod FROM (TXPMAQFAS T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV61Webwdupmaqfastrnds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T2.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqFCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqFDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Webwdupmaqfastrnds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV62Webwdupmaqfastrnds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Webwdupmaqfastrnds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Webwdupmaqfastrnds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Webwdupmaqfastrnds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Webwdupmaqfastrnds_6_tfmaqfcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Webwdupmaqfastrnds_7_tfmaqfcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFCod = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Webwdupmaqfastrnds_8_tfmaqfdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqFDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Webwdupmaqfastrnds_9_tfmaqfdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqFDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqFDsc" ;
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
                  return conditional_P08CO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P08CO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P08CO4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 3 :
                  return conditional_P08CO5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08CO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CO4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CO5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 28);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 28);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 28);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 28);
               }
               return;
      }
   }

}

