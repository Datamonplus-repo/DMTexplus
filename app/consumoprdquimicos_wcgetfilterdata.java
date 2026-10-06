package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consumoprdquimicos_wcgetfilterdata extends GXProcedure
{
   public consumoprdquimicos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consumoprdquimicos_wcgetfilterdata.class ), "" );
   }

   public consumoprdquimicos_wcgetfilterdata( int remoteHandle ,
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
      consumoprdquimicos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      consumoprdquimicos_wcgetfilterdata.this.AV34DDOName = aP0;
      consumoprdquimicos_wcgetfilterdata.this.AV32SearchTxt = aP1;
      consumoprdquimicos_wcgetfilterdata.this.AV33SearchTxtTo = aP2;
      consumoprdquimicos_wcgetfilterdata.this.aP3 = aP3;
      consumoprdquimicos_wcgetfilterdata.this.aP4 = aP4;
      consumoprdquimicos_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_EMPRCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV38OptionsJson = AV37Options.toJSonString(false) ;
      AV41OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV42OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("ConsumoPrdQuimicos_WCGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsumoPrdQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("ConsumoPrdQuimicos_WCGridState"), null, null);
      }
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV71TFEmprCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV72TFEmprCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDANY") == 0 )
         {
            AV51TFPrdAny = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFPrdAny_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUMMES") == 0 )
         {
            AV53TFPrdNumMes = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFPrdNumMes_To = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCPRA") == 0 )
         {
            AV73TFPrdAcuCprA = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFPrdAcuCprA_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDACUCONA") == 0 )
         {
            AV75TFPrdAcuConA = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV76TFPrdAcuConA_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCPRA") == 0 )
         {
            AV77TFPrdValCprA = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV78TFPrdValCprA_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDVALCONA") == 0 )
         {
            AV79TFPrdValConA = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV80TFPrdValConA_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFVALCONA") == 0 )
         {
            AV81TFDifValConA = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV82TFDifValConA_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV90GXV1 = (int)(AV90GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV71TFEmprCod = AV32SearchTxt ;
      AV72TFEmprCod_Sel = "" ;
      AV92Consumoprdquimicos_wcds_1_filterfulltext = AV50FilterFullText ;
      AV93Consumoprdquimicos_wcds_2_tfemprcod = AV71TFEmprCod ;
      AV94Consumoprdquimicos_wcds_3_tfemprcod_sel = AV72TFEmprCod_Sel ;
      AV95Consumoprdquimicos_wcds_4_tfprdnum = AV10TFPrdNum ;
      AV96Consumoprdquimicos_wcds_5_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV97Consumoprdquimicos_wcds_6_tfprdany = AV51TFPrdAny ;
      AV98Consumoprdquimicos_wcds_7_tfprdany_to = AV52TFPrdAny_To ;
      AV99Consumoprdquimicos_wcds_8_tfprdnummes = AV53TFPrdNumMes ;
      AV100Consumoprdquimicos_wcds_9_tfprdnummes_to = AV54TFPrdNumMes_To ;
      AV101Consumoprdquimicos_wcds_10_tfprdacucpra = AV73TFPrdAcuCprA ;
      AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV74TFPrdAcuCprA_To ;
      AV103Consumoprdquimicos_wcds_12_tfprdacucona = AV75TFPrdAcuConA ;
      AV104Consumoprdquimicos_wcds_13_tfprdacucona_to = AV76TFPrdAcuConA_To ;
      AV105Consumoprdquimicos_wcds_14_tfprdvalcpra = AV77TFPrdValCprA ;
      AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV78TFPrdValCprA_To ;
      AV107Consumoprdquimicos_wcds_16_tfprdvalcona = AV79TFPrdValConA ;
      AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV80TFPrdValConA_To ;
      AV109Consumoprdquimicos_wcds_18_tfdifvalcona = AV81TFDifValConA ;
      AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV82TFDifValConA_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV92Consumoprdquimicos_wcds_1_filterfulltext ,
                                           AV94Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                           AV93Consumoprdquimicos_wcds_2_tfemprcod ,
                                           AV96Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                           AV95Consumoprdquimicos_wcds_4_tfprdnum ,
                                           Short.valueOf(AV97Consumoprdquimicos_wcds_6_tfprdany) ,
                                           Short.valueOf(AV98Consumoprdquimicos_wcds_7_tfprdany_to) ,
                                           Byte.valueOf(AV99Consumoprdquimicos_wcds_8_tfprdnummes) ,
                                           Byte.valueOf(AV100Consumoprdquimicos_wcds_9_tfprdnummes_to) ,
                                           AV101Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                           AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                           AV103Consumoprdquimicos_wcds_12_tfprdacucona ,
                                           AV104Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                           AV105Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                           AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                           AV107Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                           AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                           AV109Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                           AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                           Short.valueOf(AV67Anyo) ,
                                           Byte.valueOf(AV68MesI) ,
                                           Byte.valueOf(AV69MesF) ,
                                           Byte.valueOf(AV87Opcion) ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Short.valueOf(A681PrdAny) ,
                                           Byte.valueOf(A720PrdNumMes) ,
                                           A677PrdAcuCprA ,
                                           A676PrdAcuConA ,
                                           A748PrdValCprA ,
                                           A746PrdValConA ,
                                           A331DifValConA ,
                                           AV85PrdNumFrom ,
                                           AV86PrdNumTo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV93Consumoprdquimicos_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV93Consumoprdquimicos_wcds_2_tfemprcod), 3, "%") ;
      lV95Consumoprdquimicos_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV95Consumoprdquimicos_wcds_4_tfprdnum), 6, "%") ;
      /* Using cursor P09G83 */
      pr_default.execute(0, new Object[] {lV93Consumoprdquimicos_wcds_2_tfemprcod, AV94Consumoprdquimicos_wcds_3_tfemprcod_sel, lV95Consumoprdquimicos_wcds_4_tfprdnum, AV96Consumoprdquimicos_wcds_5_tfprdnum_sel, Short.valueOf(AV97Consumoprdquimicos_wcds_6_tfprdany), Short.valueOf(AV98Consumoprdquimicos_wcds_7_tfprdany_to), AV101Consumoprdquimicos_wcds_10_tfprdacucpra, AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to, AV103Consumoprdquimicos_wcds_12_tfprdacucona, AV104Consumoprdquimicos_wcds_13_tfprdacucona_to, AV105Consumoprdquimicos_wcds_14_tfprdvalcpra, AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to, AV107Consumoprdquimicos_wcds_16_tfprdvalcona, AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to, AV109Consumoprdquimicos_wcds_18_tfdifvalcona, AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to, AV85PrdNumFrom, AV86PrdNumTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9G82 = false ;
         A396EmprCod = P09G83_A396EmprCod[0] ;
         A331DifValConA = P09G83_A331DifValConA[0] ;
         n331DifValConA = P09G83_n331DifValConA[0] ;
         A676PrdAcuConA = P09G83_A676PrdAcuConA[0] ;
         A681PrdAny = P09G83_A681PrdAny[0] ;
         A719PrdNum = P09G83_A719PrdNum[0] ;
         A746PrdValConA = P09G83_A746PrdValConA[0] ;
         A748PrdValCprA = P09G83_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09G83_A677PrdAcuCprA[0] ;
         A746PrdValConA = P09G83_A746PrdValConA[0] ;
         A748PrdValCprA = P09G83_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09G83_A677PrdAcuCprA[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09G83_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk9G82 = false ;
            A681PrdAny = P09G83_A681PrdAny[0] ;
            A719PrdNum = P09G83_A719PrdNum[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9G82 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV36Option = A396EmprCod ;
            AV39OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV37Options.add(AV36Option, 0);
            AV40OptionsDesc.add(AV39OptionDesc, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9G82 )
         {
            brk9G82 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV32SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV92Consumoprdquimicos_wcds_1_filterfulltext = AV50FilterFullText ;
      AV93Consumoprdquimicos_wcds_2_tfemprcod = AV71TFEmprCod ;
      AV94Consumoprdquimicos_wcds_3_tfemprcod_sel = AV72TFEmprCod_Sel ;
      AV95Consumoprdquimicos_wcds_4_tfprdnum = AV10TFPrdNum ;
      AV96Consumoprdquimicos_wcds_5_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV97Consumoprdquimicos_wcds_6_tfprdany = AV51TFPrdAny ;
      AV98Consumoprdquimicos_wcds_7_tfprdany_to = AV52TFPrdAny_To ;
      AV99Consumoprdquimicos_wcds_8_tfprdnummes = AV53TFPrdNumMes ;
      AV100Consumoprdquimicos_wcds_9_tfprdnummes_to = AV54TFPrdNumMes_To ;
      AV101Consumoprdquimicos_wcds_10_tfprdacucpra = AV73TFPrdAcuCprA ;
      AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to = AV74TFPrdAcuCprA_To ;
      AV103Consumoprdquimicos_wcds_12_tfprdacucona = AV75TFPrdAcuConA ;
      AV104Consumoprdquimicos_wcds_13_tfprdacucona_to = AV76TFPrdAcuConA_To ;
      AV105Consumoprdquimicos_wcds_14_tfprdvalcpra = AV77TFPrdValCprA ;
      AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to = AV78TFPrdValCprA_To ;
      AV107Consumoprdquimicos_wcds_16_tfprdvalcona = AV79TFPrdValConA ;
      AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to = AV80TFPrdValConA_To ;
      AV109Consumoprdquimicos_wcds_18_tfdifvalcona = AV81TFDifValConA ;
      AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to = AV82TFDifValConA_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV92Consumoprdquimicos_wcds_1_filterfulltext ,
                                           AV94Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                           AV93Consumoprdquimicos_wcds_2_tfemprcod ,
                                           AV96Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                           AV95Consumoprdquimicos_wcds_4_tfprdnum ,
                                           Short.valueOf(AV97Consumoprdquimicos_wcds_6_tfprdany) ,
                                           Short.valueOf(AV98Consumoprdquimicos_wcds_7_tfprdany_to) ,
                                           Byte.valueOf(AV99Consumoprdquimicos_wcds_8_tfprdnummes) ,
                                           Byte.valueOf(AV100Consumoprdquimicos_wcds_9_tfprdnummes_to) ,
                                           AV101Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                           AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                           AV103Consumoprdquimicos_wcds_12_tfprdacucona ,
                                           AV104Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                           AV105Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                           AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                           AV107Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                           AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                           AV109Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                           AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                           Short.valueOf(AV67Anyo) ,
                                           Byte.valueOf(AV68MesI) ,
                                           Byte.valueOf(AV69MesF) ,
                                           Byte.valueOf(AV87Opcion) ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Short.valueOf(A681PrdAny) ,
                                           Byte.valueOf(A720PrdNumMes) ,
                                           A677PrdAcuCprA ,
                                           A676PrdAcuConA ,
                                           A748PrdValCprA ,
                                           A746PrdValConA ,
                                           A331DifValConA ,
                                           AV85PrdNumFrom ,
                                           AV86PrdNumTo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV93Consumoprdquimicos_wcds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV93Consumoprdquimicos_wcds_2_tfemprcod), 3, "%") ;
      lV95Consumoprdquimicos_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV95Consumoprdquimicos_wcds_4_tfprdnum), 6, "%") ;
      /* Using cursor P09G85 */
      pr_default.execute(1, new Object[] {lV93Consumoprdquimicos_wcds_2_tfemprcod, AV94Consumoprdquimicos_wcds_3_tfemprcod_sel, lV95Consumoprdquimicos_wcds_4_tfprdnum, AV96Consumoprdquimicos_wcds_5_tfprdnum_sel, Short.valueOf(AV97Consumoprdquimicos_wcds_6_tfprdany), Short.valueOf(AV98Consumoprdquimicos_wcds_7_tfprdany_to), AV101Consumoprdquimicos_wcds_10_tfprdacucpra, AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to, AV103Consumoprdquimicos_wcds_12_tfprdacucona, AV104Consumoprdquimicos_wcds_13_tfprdacucona_to, AV105Consumoprdquimicos_wcds_14_tfprdvalcpra, AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to, AV107Consumoprdquimicos_wcds_16_tfprdvalcona, AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to, AV109Consumoprdquimicos_wcds_18_tfdifvalcona, AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to, AV85PrdNumFrom, AV86PrdNumTo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9G84 = false ;
         A719PrdNum = P09G85_A719PrdNum[0] ;
         A331DifValConA = P09G85_A331DifValConA[0] ;
         n331DifValConA = P09G85_n331DifValConA[0] ;
         A676PrdAcuConA = P09G85_A676PrdAcuConA[0] ;
         A681PrdAny = P09G85_A681PrdAny[0] ;
         A396EmprCod = P09G85_A396EmprCod[0] ;
         A746PrdValConA = P09G85_A746PrdValConA[0] ;
         A748PrdValCprA = P09G85_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09G85_A677PrdAcuCprA[0] ;
         A746PrdValConA = P09G85_A746PrdValConA[0] ;
         A748PrdValCprA = P09G85_A748PrdValCprA[0] ;
         A677PrdAcuCprA = P09G85_A677PrdAcuCprA[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09G85_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9G84 = false ;
            A681PrdAny = P09G85_A681PrdAny[0] ;
            A396EmprCod = P09G85_A396EmprCod[0] ;
            AV44count = (long)(AV44count+1) ;
            brk9G84 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV36Option = A719PrdNum ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9G84 )
         {
            brk9G84 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consumoprdquimicos_wcgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = consumoprdquimicos_wcgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = consumoprdquimicos_wcgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38OptionsJson = "" ;
      AV41OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV71TFEmprCod = "" ;
      AV72TFEmprCod_Sel = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV73TFPrdAcuCprA = DecimalUtil.ZERO ;
      AV74TFPrdAcuCprA_To = DecimalUtil.ZERO ;
      AV75TFPrdAcuConA = DecimalUtil.ZERO ;
      AV76TFPrdAcuConA_To = DecimalUtil.ZERO ;
      AV77TFPrdValCprA = DecimalUtil.ZERO ;
      AV78TFPrdValCprA_To = DecimalUtil.ZERO ;
      AV79TFPrdValConA = DecimalUtil.ZERO ;
      AV80TFPrdValConA_To = DecimalUtil.ZERO ;
      AV81TFDifValConA = DecimalUtil.ZERO ;
      AV82TFDifValConA_To = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV92Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      AV93Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      AV94Consumoprdquimicos_wcds_3_tfemprcod_sel = "" ;
      AV95Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      AV96Consumoprdquimicos_wcds_5_tfprdnum_sel = "" ;
      AV101Consumoprdquimicos_wcds_10_tfprdacucpra = DecimalUtil.ZERO ;
      AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to = DecimalUtil.ZERO ;
      AV103Consumoprdquimicos_wcds_12_tfprdacucona = DecimalUtil.ZERO ;
      AV104Consumoprdquimicos_wcds_13_tfprdacucona_to = DecimalUtil.ZERO ;
      AV105Consumoprdquimicos_wcds_14_tfprdvalcpra = DecimalUtil.ZERO ;
      AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to = DecimalUtil.ZERO ;
      AV107Consumoprdquimicos_wcds_16_tfprdvalcona = DecimalUtil.ZERO ;
      AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to = DecimalUtil.ZERO ;
      AV109Consumoprdquimicos_wcds_18_tfdifvalcona = DecimalUtil.ZERO ;
      AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV92Consumoprdquimicos_wcds_1_filterfulltext = "" ;
      lV93Consumoprdquimicos_wcds_2_tfemprcod = "" ;
      lV95Consumoprdquimicos_wcds_4_tfprdnum = "" ;
      A719PrdNum = "" ;
      A677PrdAcuCprA = DecimalUtil.ZERO ;
      A676PrdAcuConA = DecimalUtil.ZERO ;
      A748PrdValCprA = DecimalUtil.ZERO ;
      A746PrdValConA = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      AV85PrdNumFrom = "" ;
      AV86PrdNumTo = "" ;
      P09G83_A396EmprCod = new String[] {""} ;
      P09G83_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G83_n331DifValConA = new boolean[] {false} ;
      P09G83_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G83_A681PrdAny = new short[1] ;
      P09G83_A719PrdNum = new String[] {""} ;
      P09G83_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G83_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G83_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV36Option = "" ;
      AV39OptionDesc = "" ;
      P09G85_A719PrdNum = new String[] {""} ;
      P09G85_A331DifValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G85_n331DifValConA = new boolean[] {false} ;
      P09G85_A676PrdAcuConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G85_A681PrdAny = new short[1] ;
      P09G85_A396EmprCod = new String[] {""} ;
      P09G85_A746PrdValConA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G85_A748PrdValCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09G85_A677PrdAcuCprA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consumoprdquimicos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09G83_A396EmprCod, P09G83_A331DifValConA, P09G83_n331DifValConA, P09G83_A676PrdAcuConA, P09G83_A681PrdAny, P09G83_A719PrdNum, P09G83_A746PrdValConA, P09G83_A748PrdValCprA, P09G83_A677PrdAcuCprA
            }
            , new Object[] {
            P09G85_A719PrdNum, P09G85_A331DifValConA, P09G85_n331DifValConA, P09G85_A676PrdAcuConA, P09G85_A681PrdAny, P09G85_A396EmprCod, P09G85_A746PrdValConA, P09G85_A748PrdValCprA, P09G85_A677PrdAcuCprA
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV53TFPrdNumMes ;
   private byte AV54TFPrdNumMes_To ;
   private byte AV99Consumoprdquimicos_wcds_8_tfprdnummes ;
   private byte AV100Consumoprdquimicos_wcds_9_tfprdnummes_to ;
   private byte AV68MesI ;
   private byte AV69MesF ;
   private byte AV87Opcion ;
   private byte A720PrdNumMes ;
   private short AV51TFPrdAny ;
   private short AV52TFPrdAny_To ;
   private short AV97Consumoprdquimicos_wcds_6_tfprdany ;
   private short AV98Consumoprdquimicos_wcds_7_tfprdany_to ;
   private short AV67Anyo ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int AV90GXV1 ;
   private long AV44count ;
   private java.math.BigDecimal AV73TFPrdAcuCprA ;
   private java.math.BigDecimal AV74TFPrdAcuCprA_To ;
   private java.math.BigDecimal AV75TFPrdAcuConA ;
   private java.math.BigDecimal AV76TFPrdAcuConA_To ;
   private java.math.BigDecimal AV77TFPrdValCprA ;
   private java.math.BigDecimal AV78TFPrdValCprA_To ;
   private java.math.BigDecimal AV79TFPrdValConA ;
   private java.math.BigDecimal AV80TFPrdValConA_To ;
   private java.math.BigDecimal AV81TFDifValConA ;
   private java.math.BigDecimal AV82TFDifValConA_To ;
   private java.math.BigDecimal AV101Consumoprdquimicos_wcds_10_tfprdacucpra ;
   private java.math.BigDecimal AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to ;
   private java.math.BigDecimal AV103Consumoprdquimicos_wcds_12_tfprdacucona ;
   private java.math.BigDecimal AV104Consumoprdquimicos_wcds_13_tfprdacucona_to ;
   private java.math.BigDecimal AV105Consumoprdquimicos_wcds_14_tfprdvalcpra ;
   private java.math.BigDecimal AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to ;
   private java.math.BigDecimal AV107Consumoprdquimicos_wcds_16_tfprdvalcona ;
   private java.math.BigDecimal AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to ;
   private java.math.BigDecimal AV109Consumoprdquimicos_wcds_18_tfdifvalcona ;
   private java.math.BigDecimal AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to ;
   private java.math.BigDecimal A677PrdAcuCprA ;
   private java.math.BigDecimal A676PrdAcuConA ;
   private java.math.BigDecimal A748PrdValCprA ;
   private java.math.BigDecimal A746PrdValConA ;
   private java.math.BigDecimal A331DifValConA ;
   private String AV71TFEmprCod ;
   private String AV72TFEmprCod_Sel ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String A396EmprCod ;
   private String AV93Consumoprdquimicos_wcds_2_tfemprcod ;
   private String AV94Consumoprdquimicos_wcds_3_tfemprcod_sel ;
   private String AV95Consumoprdquimicos_wcds_4_tfprdnum ;
   private String AV96Consumoprdquimicos_wcds_5_tfprdnum_sel ;
   private String scmdbuf ;
   private String lV93Consumoprdquimicos_wcds_2_tfemprcod ;
   private String lV95Consumoprdquimicos_wcds_4_tfprdnum ;
   private String A719PrdNum ;
   private String AV85PrdNumFrom ;
   private String AV86PrdNumTo ;
   private boolean returnInSub ;
   private boolean brk9G82 ;
   private boolean n331DifValConA ;
   private boolean brk9G84 ;
   private String AV38OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV92Consumoprdquimicos_wcds_1_filterfulltext ;
   private String lV92Consumoprdquimicos_wcds_1_filterfulltext ;
   private String AV36Option ;
   private String AV39OptionDesc ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09G83_A396EmprCod ;
   private java.math.BigDecimal[] P09G83_A331DifValConA ;
   private boolean[] P09G83_n331DifValConA ;
   private java.math.BigDecimal[] P09G83_A676PrdAcuConA ;
   private short[] P09G83_A681PrdAny ;
   private String[] P09G83_A719PrdNum ;
   private java.math.BigDecimal[] P09G83_A746PrdValConA ;
   private java.math.BigDecimal[] P09G83_A748PrdValCprA ;
   private java.math.BigDecimal[] P09G83_A677PrdAcuCprA ;
   private String[] P09G85_A719PrdNum ;
   private java.math.BigDecimal[] P09G85_A331DifValConA ;
   private boolean[] P09G85_n331DifValConA ;
   private java.math.BigDecimal[] P09G85_A676PrdAcuConA ;
   private short[] P09G85_A681PrdAny ;
   private String[] P09G85_A396EmprCod ;
   private java.math.BigDecimal[] P09G85_A746PrdValConA ;
   private java.math.BigDecimal[] P09G85_A748PrdValCprA ;
   private java.math.BigDecimal[] P09G85_A677PrdAcuCprA ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class consumoprdquimicos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09G83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Consumoprdquimicos_wcds_1_filterfulltext ,
                                          String AV94Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                          String AV93Consumoprdquimicos_wcds_2_tfemprcod ,
                                          String AV96Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                          String AV95Consumoprdquimicos_wcds_4_tfprdnum ,
                                          short AV97Consumoprdquimicos_wcds_6_tfprdany ,
                                          short AV98Consumoprdquimicos_wcds_7_tfprdany_to ,
                                          byte AV99Consumoprdquimicos_wcds_8_tfprdnummes ,
                                          byte AV100Consumoprdquimicos_wcds_9_tfprdnummes_to ,
                                          java.math.BigDecimal AV101Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                          java.math.BigDecimal AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                          java.math.BigDecimal AV103Consumoprdquimicos_wcds_12_tfprdacucona ,
                                          java.math.BigDecimal AV104Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                          java.math.BigDecimal AV105Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                          java.math.BigDecimal AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                          java.math.BigDecimal AV107Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                          java.math.BigDecimal AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                          java.math.BigDecimal AV109Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                          java.math.BigDecimal AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                          short AV67Anyo ,
                                          byte AV68MesI ,
                                          byte AV69MesF ,
                                          byte AV87Opcion ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          short A681PrdAny ,
                                          byte A720PrdNumMes ,
                                          java.math.BigDecimal A677PrdAcuCprA ,
                                          java.math.BigDecimal A676PrdAcuConA ,
                                          java.math.BigDecimal A748PrdValCprA ,
                                          java.math.BigDecimal A746PrdValConA ,
                                          java.math.BigDecimal A331DifValConA ,
                                          String AV85PrdNumFrom ,
                                          String AV86PrdNumTo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DifValConA, T1.PrdAcuConA, T1.PrdAny, T1.PrdNum, COALESCE( T2.PrdValConA, 0) AS PrdValConA, COALESCE( T2.PrdValCprA, 0) AS PrdValCprA, COALESCE(" ;
      scmdbuf += " T2.PrdAcuCprA, 0) AS PrdAcuCprA FROM (TXPCPRDES T1 LEFT JOIN (SELECT SUM(PrdValConM) AS PrdValConA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdUniCprM)" ;
      scmdbuf += " AS PrdAcuCprA FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum AND T2.PrdAny = T1.PrdAny)" ;
      if ( (GXutil.strcmp("", AV94Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Consumoprdquimicos_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV95Consumoprdquimicos_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV97Consumoprdquimicos_wcds_6_tfprdany) )
      {
         addWhere(sWhereString, "(T1.PrdAny >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV98Consumoprdquimicos_wcds_7_tfprdany_to) )
      {
         addWhere(sWhereString, "(T1.PrdAny <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Consumoprdquimicos_wcds_10_tfprdacucpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Consumoprdquimicos_wcds_12_tfprdacucona)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Consumoprdquimicos_wcds_13_tfprdacucona_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Consumoprdquimicos_wcds_14_tfprdvalcpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Consumoprdquimicos_wcds_16_tfprdvalcona)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Consumoprdquimicos_wcds_18_tfdifvalcona)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( AV87Opcion > 1 )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ? and T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09G85( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Consumoprdquimicos_wcds_1_filterfulltext ,
                                          String AV94Consumoprdquimicos_wcds_3_tfemprcod_sel ,
                                          String AV93Consumoprdquimicos_wcds_2_tfemprcod ,
                                          String AV96Consumoprdquimicos_wcds_5_tfprdnum_sel ,
                                          String AV95Consumoprdquimicos_wcds_4_tfprdnum ,
                                          short AV97Consumoprdquimicos_wcds_6_tfprdany ,
                                          short AV98Consumoprdquimicos_wcds_7_tfprdany_to ,
                                          byte AV99Consumoprdquimicos_wcds_8_tfprdnummes ,
                                          byte AV100Consumoprdquimicos_wcds_9_tfprdnummes_to ,
                                          java.math.BigDecimal AV101Consumoprdquimicos_wcds_10_tfprdacucpra ,
                                          java.math.BigDecimal AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to ,
                                          java.math.BigDecimal AV103Consumoprdquimicos_wcds_12_tfprdacucona ,
                                          java.math.BigDecimal AV104Consumoprdquimicos_wcds_13_tfprdacucona_to ,
                                          java.math.BigDecimal AV105Consumoprdquimicos_wcds_14_tfprdvalcpra ,
                                          java.math.BigDecimal AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to ,
                                          java.math.BigDecimal AV107Consumoprdquimicos_wcds_16_tfprdvalcona ,
                                          java.math.BigDecimal AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to ,
                                          java.math.BigDecimal AV109Consumoprdquimicos_wcds_18_tfdifvalcona ,
                                          java.math.BigDecimal AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to ,
                                          short AV67Anyo ,
                                          byte AV68MesI ,
                                          byte AV69MesF ,
                                          byte AV87Opcion ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          short A681PrdAny ,
                                          byte A720PrdNumMes ,
                                          java.math.BigDecimal A677PrdAcuCprA ,
                                          java.math.BigDecimal A676PrdAcuConA ,
                                          java.math.BigDecimal A748PrdValCprA ,
                                          java.math.BigDecimal A746PrdValConA ,
                                          java.math.BigDecimal A331DifValConA ,
                                          String AV85PrdNumFrom ,
                                          String AV86PrdNumTo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.DifValConA, T1.PrdAcuConA, T1.PrdAny, T1.EmprCod, COALESCE( T2.PrdValConA, 0) AS PrdValConA, COALESCE( T2.PrdValCprA, 0) AS PrdValCprA, COALESCE(" ;
      scmdbuf += " T2.PrdAcuCprA, 0) AS PrdAcuCprA FROM (TXPCPRDES T1 LEFT JOIN (SELECT SUM(PrdValConM) AS PrdValConA, EmprCod, PrdNum, PrdAny, SUM(PrdValCprM) AS PrdValCprA, SUM(PrdUniCprM)" ;
      scmdbuf += " AS PrdAcuCprA FROM TXPLPRDES GROUP BY EmprCod, PrdNum, PrdAny ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum AND T2.PrdAny = T1.PrdAny)" ;
      if ( (GXutil.strcmp("", AV94Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Consumoprdquimicos_wcds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Consumoprdquimicos_wcds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV95Consumoprdquimicos_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Consumoprdquimicos_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV97Consumoprdquimicos_wcds_6_tfprdany) )
      {
         addWhere(sWhereString, "(T1.PrdAny >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV98Consumoprdquimicos_wcds_7_tfprdany_to) )
      {
         addWhere(sWhereString, "(T1.PrdAny <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Consumoprdquimicos_wcds_10_tfprdacucpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Consumoprdquimicos_wcds_11_tfprdacucpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdAcuCprA, 0) <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Consumoprdquimicos_wcds_12_tfprdacucona)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Consumoprdquimicos_wcds_13_tfprdacucona_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAcuConA <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Consumoprdquimicos_wcds_14_tfprdvalcpra)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Consumoprdquimicos_wcds_15_tfprdvalcpra_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValCprA, 0) <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Consumoprdquimicos_wcds_16_tfprdvalcona)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Consumoprdquimicos_wcds_17_tfprdvalcona_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.PrdValConA, 0) <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Consumoprdquimicos_wcds_18_tfdifvalcona)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Consumoprdquimicos_wcds_19_tfdifvalcona_to)==0) )
      {
         addWhere(sWhereString, "(T1.DifValConA <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( AV87Opcion > 1 )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ? and T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
         GXv_int4[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P09G83(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_P09G85(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09G83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09G85", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               return;
      }
   }

}

