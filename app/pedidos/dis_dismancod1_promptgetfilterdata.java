package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dis_dismancod1_promptgetfilterdata extends GXProcedure
{
   public dis_dismancod1_promptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis_dismancod1_promptgetfilterdata.class ), "" );
   }

   public dis_dismancod1_promptgetfilterdata( int remoteHandle ,
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
      dis_dismancod1_promptgetfilterdata.this.aP5 = new String[] {""};
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
      dis_dismancod1_promptgetfilterdata.this.AV48DDOName = aP0;
      dis_dismancod1_promptgetfilterdata.this.AV49SearchTxt = aP1;
      dis_dismancod1_promptgetfilterdata.this.AV50SearchTxtTo = aP2;
      dis_dismancod1_promptgetfilterdata.this.aP3 = aP3;
      dis_dismancod1_promptgetfilterdata.this.aP4 = aP4;
      dis_dismancod1_promptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV41OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_PMDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_PMDCOLCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDCOLCLIOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_PMDCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDCOLNOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV51OptionsJson = AV38Options.toJSonString(false) ;
      AV52OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV53OptionIndexesJson = AV41OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("Pedidos.Dis_DisManCod1_PromptGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.Dis_DisManCod1_PromptGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("Pedidos.Dis_DisManCod1_PromptGridState"), null, null);
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOD") == 0 )
         {
            AV10TFPMDCod = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPMDCod_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC") == 0 )
         {
            AV12TFPMDDsc = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC_SEL") == 0 )
         {
            AV13TFPMDDsc_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNUM") == 0 )
         {
            AV14TFPMDColNum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPMDColNum_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLCLI") == 0 )
         {
            AV16TFPMDColCli = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLCLI_SEL") == 0 )
         {
            AV17TFPMDColCli_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCONCOD") == 0 )
         {
            AV18TFPMDConCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFPMDConCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM") == 0 )
         {
            AV20TFPMDColNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM_SEL") == 0 )
         {
            AV21TFPMDColNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREKGM") == 0 )
         {
            AV22TFPMDPreKgm = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPMDPreKgm_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDENTKGM") == 0 )
         {
            AV24TFPMDEntKgm = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPMDEntKgm_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOTIN") == 0 )
         {
            AV26TFPMDDtoTin = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFPMDDtoTin_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOACA") == 0 )
         {
            AV28TFPMDDtoAca = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFPMDDtoAca_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREUNI") == 0 )
         {
            AV30TFPMDPreUni = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFPMDPreUni_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDVALFCH") == 0 )
         {
            AV32TFPMDValFch = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCliCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPMDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPMDDsc = AV49SearchTxt ;
      AV13TFPMDDsc_Sel = "" ;
      AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV54FilterFullText ;
      AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV10TFPMDCod ;
      AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV11TFPMDCod_To ;
      AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV12TFPMDDsc ;
      AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV13TFPMDDsc_Sel ;
      AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV14TFPMDColNum ;
      AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV15TFPMDColNum_To ;
      AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV16TFPMDColCli ;
      AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV17TFPMDColCli_Sel ;
      AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV18TFPMDConCod ;
      AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV19TFPMDConCod_To ;
      AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV20TFPMDColNom ;
      AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV21TFPMDColNom_Sel ;
      AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV22TFPMDPreKgm ;
      AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV23TFPMDPreKgm_To ;
      AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV24TFPMDEntKgm ;
      AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV25TFPMDEntKgm_To ;
      AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV26TFPMDDtoTin ;
      AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV27TFPMDDtoTin_To ;
      AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV28TFPMDDtoAca ;
      AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV29TFPMDDtoAca_To ;
      AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV30TFPMDPreUni ;
      AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV31TFPMDPreUni_To ;
      AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV32TFPMDValFch ;
      AV83Pedidos_dis_dismancod1_promptds_25_tfclicod = AV34TFCliCod ;
      AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV35TFCliCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod) ,
                                           Short.valueOf(AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) ,
                                           AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                           AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                           Integer.valueOf(AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) ,
                                           Integer.valueOf(AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) ,
                                           AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                           AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                           Integer.valueOf(AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) ,
                                           Integer.valueOf(AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) ,
                                           AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                           AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                           AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                           AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                           AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                           AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                           AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                           AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                           AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                           AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                           AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                           Integer.valueOf(AV83Pedidos_dis_dismancod1_promptds_25_tfclicod) ,
                                           Integer.valueOf(AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to) ,
                                           Short.valueOf(A8391PMDCod) ,
                                           A8392PMDDsc ,
                                           Integer.valueOf(A8393PMDColNum) ,
                                           A8530PMDColCli ,
                                           Integer.valueOf(A8531PMDConCod) ,
                                           A8395PMDPreKgm ,
                                           A8396PMDEntKgm ,
                                           A8397PMDDtoTin ,
                                           A8398PMDDtoAca ,
                                           A8532PMDPreUni ,
                                           A8399PMDValFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                           A8394PMDColNom ,
                                           AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                           AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc = GXutil.padr( GXutil.rtrim( AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc), 30, "%") ;
      lV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = GXutil.padr( GXutil.rtrim( AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli), 13, "%") ;
      /* Using cursor P09X52 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod), Short.valueOf(AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to), lV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc, AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel, Integer.valueOf(AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum), Integer.valueOf(AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to), lV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli, AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel, Integer.valueOf(AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod), Integer.valueOf(AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to), AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm, AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to, AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm, AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to, AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin, AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to, AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca, AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to, AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni, AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to, AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch, Integer.valueOf(AV83Pedidos_dis_dismancod1_promptds_25_tfclicod), Integer.valueOf(AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9X52 = false ;
         A8391PMDCod = P09X52_A8391PMDCod[0] ;
         A8399PMDValFch = P09X52_A8399PMDValFch[0] ;
         A8532PMDPreUni = P09X52_A8532PMDPreUni[0] ;
         A8398PMDDtoAca = P09X52_A8398PMDDtoAca[0] ;
         A8397PMDDtoTin = P09X52_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = P09X52_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = P09X52_A8395PMDPreKgm[0] ;
         A8530PMDColCli = P09X52_A8530PMDColCli[0] ;
         A8393PMDColNum = P09X52_A8393PMDColNum[0] ;
         A8392PMDDsc = P09X52_A8392PMDDsc[0] ;
         n8392PMDDsc = P09X52_n8392PMDDsc[0] ;
         A8531PMDConCod = P09X52_A8531PMDConCod[0] ;
         A252CliCod = P09X52_A252CliCod[0] ;
         A396EmprCod = P09X52_A396EmprCod[0] ;
         A8392PMDDsc = P09X52_A8392PMDDsc[0] ;
         n8392PMDDsc = P09X52_n8392PMDDsc[0] ;
         GXt_char2 = A8394PMDColNom ;
         GXv_char3[0] = GXt_char2 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char3) ;
         dis_dismancod1_promptgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A8394PMDColNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A8391PMDCod, 4, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8392PMDDsc) , GXutil.padr( "%" + GXutil.upper( AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8393PMDColNum, 6, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8530PMDColCli) , GXutil.padr( "%" + GXutil.upper( AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8531PMDConCod, 6, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8395PMDPreKgm, 9, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8396PMDEntKgm, 9, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8397PMDDtoTin, 6, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8398PMDDtoAca, 6, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8532PMDPreUni, 14, 5) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel) == 0 ) ) )
               {
                  AV42count = 0 ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09X52_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09X52_A252CliCod[0] == A252CliCod ) && ( P09X52_A8391PMDCod[0] == A8391PMDCod ) )
                  {
                     brk9X52 = false ;
                     A8393PMDColNum = P09X52_A8393PMDColNum[0] ;
                     AV42count = (long)(AV42count+1) ;
                     brk9X52 = true ;
                     pr_default.readNext(0);
                  }
                  if ( ! (GXutil.strcmp("", A8392PMDDsc)==0) )
                  {
                     AV37Option = A8392PMDDsc ;
                     AV36InsertIndex = 1 ;
                     while ( ( AV36InsertIndex <= AV38Options.size() ) && ( GXutil.strcmp((String)AV38Options.elementAt(-1+AV36InsertIndex), AV37Option) < 0 ) )
                     {
                        AV36InsertIndex = (int)(AV36InsertIndex+1) ;
                     }
                     AV38Options.add(AV37Option, AV36InsertIndex);
                     AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV36InsertIndex);
                  }
                  if ( AV38Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9X52 )
         {
            brk9X52 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPMDCOLCLIOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPMDColCli = AV49SearchTxt ;
      AV17TFPMDColCli_Sel = "" ;
      AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV54FilterFullText ;
      AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV10TFPMDCod ;
      AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV11TFPMDCod_To ;
      AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV12TFPMDDsc ;
      AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV13TFPMDDsc_Sel ;
      AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV14TFPMDColNum ;
      AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV15TFPMDColNum_To ;
      AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV16TFPMDColCli ;
      AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV17TFPMDColCli_Sel ;
      AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV18TFPMDConCod ;
      AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV19TFPMDConCod_To ;
      AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV20TFPMDColNom ;
      AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV21TFPMDColNom_Sel ;
      AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV22TFPMDPreKgm ;
      AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV23TFPMDPreKgm_To ;
      AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV24TFPMDEntKgm ;
      AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV25TFPMDEntKgm_To ;
      AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV26TFPMDDtoTin ;
      AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV27TFPMDDtoTin_To ;
      AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV28TFPMDDtoAca ;
      AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV29TFPMDDtoAca_To ;
      AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV30TFPMDPreUni ;
      AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV31TFPMDPreUni_To ;
      AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV32TFPMDValFch ;
      AV83Pedidos_dis_dismancod1_promptds_25_tfclicod = AV34TFCliCod ;
      AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV35TFCliCod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod) ,
                                           Short.valueOf(AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) ,
                                           AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                           AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                           Integer.valueOf(AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) ,
                                           Integer.valueOf(AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) ,
                                           AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                           AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                           Integer.valueOf(AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) ,
                                           Integer.valueOf(AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) ,
                                           AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                           AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                           AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                           AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                           AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                           AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                           AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                           AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                           AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                           AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                           AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                           Integer.valueOf(AV83Pedidos_dis_dismancod1_promptds_25_tfclicod) ,
                                           Integer.valueOf(AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to) ,
                                           Short.valueOf(A8391PMDCod) ,
                                           A8392PMDDsc ,
                                           Integer.valueOf(A8393PMDColNum) ,
                                           A8530PMDColCli ,
                                           Integer.valueOf(A8531PMDConCod) ,
                                           A8395PMDPreKgm ,
                                           A8396PMDEntKgm ,
                                           A8397PMDDtoTin ,
                                           A8398PMDDtoAca ,
                                           A8532PMDPreUni ,
                                           A8399PMDValFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                           A8394PMDColNom ,
                                           AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                           AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc = GXutil.padr( GXutil.rtrim( AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc), 30, "%") ;
      lV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = GXutil.padr( GXutil.rtrim( AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli), 13, "%") ;
      /* Using cursor P09X53 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod), Short.valueOf(AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to), lV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc, AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel, Integer.valueOf(AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum), Integer.valueOf(AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to), lV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli, AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel, Integer.valueOf(AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod), Integer.valueOf(AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to), AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm, AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to, AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm, AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to, AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin, AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to, AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca, AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to, AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni, AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to, AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch, Integer.valueOf(AV83Pedidos_dis_dismancod1_promptds_25_tfclicod), Integer.valueOf(AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9X54 = false ;
         A8530PMDColCli = P09X53_A8530PMDColCli[0] ;
         A8399PMDValFch = P09X53_A8399PMDValFch[0] ;
         A8532PMDPreUni = P09X53_A8532PMDPreUni[0] ;
         A8398PMDDtoAca = P09X53_A8398PMDDtoAca[0] ;
         A8397PMDDtoTin = P09X53_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = P09X53_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = P09X53_A8395PMDPreKgm[0] ;
         A8393PMDColNum = P09X53_A8393PMDColNum[0] ;
         A8392PMDDsc = P09X53_A8392PMDDsc[0] ;
         n8392PMDDsc = P09X53_n8392PMDDsc[0] ;
         A8391PMDCod = P09X53_A8391PMDCod[0] ;
         A8531PMDConCod = P09X53_A8531PMDConCod[0] ;
         A252CliCod = P09X53_A252CliCod[0] ;
         A396EmprCod = P09X53_A396EmprCod[0] ;
         A8392PMDDsc = P09X53_A8392PMDDsc[0] ;
         n8392PMDDsc = P09X53_n8392PMDDsc[0] ;
         GXt_char2 = A8394PMDColNom ;
         GXv_char3[0] = GXt_char2 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char3) ;
         dis_dismancod1_promptgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A8394PMDColNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A8391PMDCod, 4, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8392PMDDsc) , GXutil.padr( "%" + GXutil.upper( AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8393PMDColNum, 6, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8530PMDColCli) , GXutil.padr( "%" + GXutil.upper( AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8531PMDConCod, 6, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8395PMDPreKgm, 9, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8396PMDEntKgm, 9, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8397PMDDtoTin, 6, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8398PMDDtoAca, 6, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8532PMDPreUni, 14, 5) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel) == 0 ) ) )
               {
                  AV42count = 0 ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09X53_A8530PMDColCli[0], A8530PMDColCli) == 0 ) )
                  {
                     brk9X54 = false ;
                     A8393PMDColNum = P09X53_A8393PMDColNum[0] ;
                     A8391PMDCod = P09X53_A8391PMDCod[0] ;
                     A252CliCod = P09X53_A252CliCod[0] ;
                     A396EmprCod = P09X53_A396EmprCod[0] ;
                     AV42count = (long)(AV42count+1) ;
                     brk9X54 = true ;
                     pr_default.readNext(1);
                  }
                  if ( ! (GXutil.strcmp("", A8530PMDColCli)==0) )
                  {
                     AV37Option = A8530PMDColCli ;
                     AV38Options.add(AV37Option, 0);
                     AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV38Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9X54 )
         {
            brk9X54 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPMDCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFPMDColNom = AV49SearchTxt ;
      AV21TFPMDColNom_Sel = "" ;
      AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext = AV54FilterFullText ;
      AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod = AV10TFPMDCod ;
      AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to = AV11TFPMDCod_To ;
      AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc = AV12TFPMDDsc ;
      AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = AV13TFPMDDsc_Sel ;
      AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum = AV14TFPMDColNum ;
      AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to = AV15TFPMDColNum_To ;
      AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = AV16TFPMDColCli ;
      AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = AV17TFPMDColCli_Sel ;
      AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod = AV18TFPMDConCod ;
      AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to = AV19TFPMDConCod_To ;
      AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = AV20TFPMDColNom ;
      AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = AV21TFPMDColNom_Sel ;
      AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = AV22TFPMDPreKgm ;
      AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = AV23TFPMDPreKgm_To ;
      AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = AV24TFPMDEntKgm ;
      AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = AV25TFPMDEntKgm_To ;
      AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = AV26TFPMDDtoTin ;
      AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = AV27TFPMDDtoTin_To ;
      AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = AV28TFPMDDtoAca ;
      AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = AV29TFPMDDtoAca_To ;
      AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = AV30TFPMDPreUni ;
      AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = AV31TFPMDPreUni_To ;
      AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = AV32TFPMDValFch ;
      AV83Pedidos_dis_dismancod1_promptds_25_tfclicod = AV34TFCliCod ;
      AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to = AV35TFCliCod_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod) ,
                                           Short.valueOf(AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) ,
                                           AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                           AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                           Integer.valueOf(AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) ,
                                           Integer.valueOf(AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) ,
                                           AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                           AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                           Integer.valueOf(AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) ,
                                           Integer.valueOf(AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) ,
                                           AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                           AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                           AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                           AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                           AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                           AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                           AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                           AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                           AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                           AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                           AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                           Integer.valueOf(AV83Pedidos_dis_dismancod1_promptds_25_tfclicod) ,
                                           Integer.valueOf(AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to) ,
                                           Short.valueOf(A8391PMDCod) ,
                                           A8392PMDDsc ,
                                           Integer.valueOf(A8393PMDColNum) ,
                                           A8530PMDColCli ,
                                           Integer.valueOf(A8531PMDConCod) ,
                                           A8395PMDPreKgm ,
                                           A8396PMDEntKgm ,
                                           A8397PMDDtoTin ,
                                           A8398PMDDtoAca ,
                                           A8532PMDPreUni ,
                                           A8399PMDValFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                           A8394PMDColNom ,
                                           AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                           AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc = GXutil.padr( GXutil.rtrim( AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc), 30, "%") ;
      lV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = GXutil.padr( GXutil.rtrim( AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli), 13, "%") ;
      /* Using cursor P09X54 */
      pr_default.execute(2, new Object[] {Short.valueOf(AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod), Short.valueOf(AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to), lV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc, AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel, Integer.valueOf(AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum), Integer.valueOf(AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to), lV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli, AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel, Integer.valueOf(AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod), Integer.valueOf(AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to), AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm, AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to, AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm, AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to, AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin, AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to, AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca, AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to, AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni, AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to, AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch, Integer.valueOf(AV83Pedidos_dis_dismancod1_promptds_25_tfclicod), Integer.valueOf(AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A8399PMDValFch = P09X54_A8399PMDValFch[0] ;
         A8532PMDPreUni = P09X54_A8532PMDPreUni[0] ;
         A8398PMDDtoAca = P09X54_A8398PMDDtoAca[0] ;
         A8397PMDDtoTin = P09X54_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = P09X54_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = P09X54_A8395PMDPreKgm[0] ;
         A8530PMDColCli = P09X54_A8530PMDColCli[0] ;
         A8393PMDColNum = P09X54_A8393PMDColNum[0] ;
         A8392PMDDsc = P09X54_A8392PMDDsc[0] ;
         n8392PMDDsc = P09X54_n8392PMDDsc[0] ;
         A8391PMDCod = P09X54_A8391PMDCod[0] ;
         A8531PMDConCod = P09X54_A8531PMDConCod[0] ;
         A252CliCod = P09X54_A252CliCod[0] ;
         A396EmprCod = P09X54_A396EmprCod[0] ;
         A8392PMDDsc = P09X54_A8392PMDDsc[0] ;
         n8392PMDDsc = P09X54_n8392PMDDsc[0] ;
         GXt_char2 = A8394PMDColNom ;
         GXv_char3[0] = GXt_char2 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char3) ;
         dis_dismancod1_promptgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A8394PMDColNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A8391PMDCod, 4, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8392PMDDsc) , GXutil.padr( "%" + GXutil.upper( AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8393PMDColNum, 6, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8530PMDColCli) , GXutil.padr( "%" + GXutil.upper( AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8531PMDConCod, 6, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8395PMDPreKgm, 9, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8396PMDEntKgm, 9, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8397PMDDtoTin, 6, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8398PMDDtoAca, 6, 2) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A8532PMDPreUni, 14, 5) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A8394PMDColNom)==0) )
                  {
                     AV37Option = A8394PMDColNom ;
                     AV36InsertIndex = 1 ;
                     while ( ( AV36InsertIndex <= AV38Options.size() ) && ( GXutil.strcmp((String)AV38Options.elementAt(-1+AV36InsertIndex), AV37Option) < 0 ) )
                     {
                        AV36InsertIndex = (int)(AV36InsertIndex+1) ;
                     }
                     if ( ( AV36InsertIndex <= AV38Options.size() ) && ( GXutil.strcmp((String)AV38Options.elementAt(-1+AV36InsertIndex), AV37Option) == 0 ) )
                     {
                        AV42count = GXutil.lval( (String)AV41OptionIndexes.elementAt(-1+AV36InsertIndex)) ;
                        AV42count = (long)(AV42count+1) ;
                        AV41OptionIndexes.removeItem(AV36InsertIndex);
                        AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV36InsertIndex);
                     }
                     else
                     {
                        AV38Options.add(AV37Option, AV36InsertIndex);
                        AV41OptionIndexes.add("1", AV36InsertIndex);
                     }
                  }
                  if ( AV38Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = dis_dismancod1_promptgetfilterdata.this.AV51OptionsJson;
      this.aP4[0] = dis_dismancod1_promptgetfilterdata.this.AV52OptionsDescJson;
      this.aP5[0] = dis_dismancod1_promptgetfilterdata.this.AV53OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV51OptionsJson = "" ;
      AV52OptionsDescJson = "" ;
      AV53OptionIndexesJson = "" ;
      AV38Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV41OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54FilterFullText = "" ;
      AV12TFPMDDsc = "" ;
      AV13TFPMDDsc_Sel = "" ;
      AV16TFPMDColCli = "" ;
      AV17TFPMDColCli_Sel = "" ;
      AV20TFPMDColNom = "" ;
      AV21TFPMDColNom_Sel = "" ;
      AV22TFPMDPreKgm = DecimalUtil.ZERO ;
      AV23TFPMDPreKgm_To = DecimalUtil.ZERO ;
      AV24TFPMDEntKgm = DecimalUtil.ZERO ;
      AV25TFPMDEntKgm_To = DecimalUtil.ZERO ;
      AV26TFPMDDtoTin = DecimalUtil.ZERO ;
      AV27TFPMDDtoTin_To = DecimalUtil.ZERO ;
      AV28TFPMDDtoAca = DecimalUtil.ZERO ;
      AV29TFPMDDtoAca_To = DecimalUtil.ZERO ;
      AV30TFPMDPreUni = DecimalUtil.ZERO ;
      AV31TFPMDPreUni_To = DecimalUtil.ZERO ;
      AV32TFPMDValFch = GXutil.nullDate() ;
      A8392PMDDsc = "" ;
      AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext = "" ;
      AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc = "" ;
      AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel = "" ;
      AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = "" ;
      AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel = "" ;
      AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom = "" ;
      AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel = "" ;
      AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm = DecimalUtil.ZERO ;
      AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to = DecimalUtil.ZERO ;
      AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm = DecimalUtil.ZERO ;
      AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to = DecimalUtil.ZERO ;
      AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin = DecimalUtil.ZERO ;
      AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to = DecimalUtil.ZERO ;
      AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca = DecimalUtil.ZERO ;
      AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to = DecimalUtil.ZERO ;
      AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni = DecimalUtil.ZERO ;
      AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to = DecimalUtil.ZERO ;
      AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch = GXutil.nullDate() ;
      lV59Pedidos_dis_dismancod1_promptds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc = "" ;
      lV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli = "" ;
      A8530PMDColCli = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      A8394PMDColNom = "" ;
      P09X52_A8391PMDCod = new short[1] ;
      P09X52_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09X52_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X52_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X52_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X52_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X52_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X52_A8530PMDColCli = new String[] {""} ;
      P09X52_A8393PMDColNum = new int[1] ;
      P09X52_A8392PMDDsc = new String[] {""} ;
      P09X52_n8392PMDDsc = new boolean[] {false} ;
      P09X52_A8531PMDConCod = new int[1] ;
      P09X52_A252CliCod = new int[1] ;
      P09X52_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV37Option = "" ;
      P09X53_A8530PMDColCli = new String[] {""} ;
      P09X53_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09X53_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X53_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X53_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X53_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X53_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X53_A8393PMDColNum = new int[1] ;
      P09X53_A8392PMDDsc = new String[] {""} ;
      P09X53_n8392PMDDsc = new boolean[] {false} ;
      P09X53_A8391PMDCod = new short[1] ;
      P09X53_A8531PMDConCod = new int[1] ;
      P09X53_A252CliCod = new int[1] ;
      P09X53_A396EmprCod = new String[] {""} ;
      P09X54_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09X54_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X54_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X54_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X54_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X54_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X54_A8530PMDColCli = new String[] {""} ;
      P09X54_A8393PMDColNum = new int[1] ;
      P09X54_A8392PMDDsc = new String[] {""} ;
      P09X54_n8392PMDDsc = new boolean[] {false} ;
      P09X54_A8391PMDCod = new short[1] ;
      P09X54_A8531PMDConCod = new int[1] ;
      P09X54_A252CliCod = new int[1] ;
      P09X54_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis_dismancod1_promptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09X52_A8391PMDCod, P09X52_A8399PMDValFch, P09X52_A8532PMDPreUni, P09X52_A8398PMDDtoAca, P09X52_A8397PMDDtoTin, P09X52_A8396PMDEntKgm, P09X52_A8395PMDPreKgm, P09X52_A8530PMDColCli, P09X52_A8393PMDColNum, P09X52_A8392PMDDsc,
            P09X52_n8392PMDDsc, P09X52_A8531PMDConCod, P09X52_A252CliCod, P09X52_A396EmprCod
            }
            , new Object[] {
            P09X53_A8530PMDColCli, P09X53_A8399PMDValFch, P09X53_A8532PMDPreUni, P09X53_A8398PMDDtoAca, P09X53_A8397PMDDtoTin, P09X53_A8396PMDEntKgm, P09X53_A8395PMDPreKgm, P09X53_A8393PMDColNum, P09X53_A8392PMDDsc, P09X53_n8392PMDDsc,
            P09X53_A8391PMDCod, P09X53_A8531PMDConCod, P09X53_A252CliCod, P09X53_A396EmprCod
            }
            , new Object[] {
            P09X54_A8399PMDValFch, P09X54_A8532PMDPreUni, P09X54_A8398PMDDtoAca, P09X54_A8397PMDDtoTin, P09X54_A8396PMDEntKgm, P09X54_A8395PMDPreKgm, P09X54_A8530PMDColCli, P09X54_A8393PMDColNum, P09X54_A8392PMDDsc, P09X54_n8392PMDDsc,
            P09X54_A8391PMDCod, P09X54_A8531PMDConCod, P09X54_A252CliCod, P09X54_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFPMDCod ;
   private short AV11TFPMDCod_To ;
   private short AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod ;
   private short AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to ;
   private short A8391PMDCod ;
   private short Gx_err ;
   private int AV57GXV1 ;
   private int AV14TFPMDColNum ;
   private int AV15TFPMDColNum_To ;
   private int AV18TFPMDConCod ;
   private int AV19TFPMDConCod_To ;
   private int AV34TFCliCod ;
   private int AV35TFCliCod_To ;
   private int AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum ;
   private int AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to ;
   private int AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod ;
   private int AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to ;
   private int AV83Pedidos_dis_dismancod1_promptds_25_tfclicod ;
   private int AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to ;
   private int A8393PMDColNum ;
   private int A8531PMDConCod ;
   private int A252CliCod ;
   private int AV36InsertIndex ;
   private long AV42count ;
   private java.math.BigDecimal AV22TFPMDPreKgm ;
   private java.math.BigDecimal AV23TFPMDPreKgm_To ;
   private java.math.BigDecimal AV24TFPMDEntKgm ;
   private java.math.BigDecimal AV25TFPMDEntKgm_To ;
   private java.math.BigDecimal AV26TFPMDDtoTin ;
   private java.math.BigDecimal AV27TFPMDDtoTin_To ;
   private java.math.BigDecimal AV28TFPMDDtoAca ;
   private java.math.BigDecimal AV29TFPMDDtoAca_To ;
   private java.math.BigDecimal AV30TFPMDPreUni ;
   private java.math.BigDecimal AV31TFPMDPreUni_To ;
   private java.math.BigDecimal AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ;
   private java.math.BigDecimal AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ;
   private java.math.BigDecimal AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ;
   private java.math.BigDecimal AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ;
   private java.math.BigDecimal AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ;
   private java.math.BigDecimal AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ;
   private java.math.BigDecimal AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ;
   private java.math.BigDecimal AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ;
   private java.math.BigDecimal AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ;
   private java.math.BigDecimal AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private String AV12TFPMDDsc ;
   private String AV13TFPMDDsc_Sel ;
   private String AV16TFPMDColCli ;
   private String AV17TFPMDColCli_Sel ;
   private String AV20TFPMDColNom ;
   private String AV21TFPMDColNom_Sel ;
   private String A8392PMDDsc ;
   private String AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc ;
   private String AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ;
   private String AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ;
   private String AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ;
   private String AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom ;
   private String AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ;
   private String scmdbuf ;
   private String lV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc ;
   private String lV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ;
   private String A8530PMDColCli ;
   private String A8394PMDColNom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV32TFPMDValFch ;
   private java.util.Date AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ;
   private java.util.Date A8399PMDValFch ;
   private boolean returnInSub ;
   private boolean brk9X52 ;
   private boolean n8392PMDDsc ;
   private boolean brk9X54 ;
   private String AV51OptionsJson ;
   private String AV52OptionsDescJson ;
   private String AV53OptionIndexesJson ;
   private String AV48DDOName ;
   private String AV49SearchTxt ;
   private String AV50SearchTxtTo ;
   private String AV54FilterFullText ;
   private String AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext ;
   private String lV59Pedidos_dis_dismancod1_promptds_1_filterfulltext ;
   private String AV37Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09X52_A8391PMDCod ;
   private java.util.Date[] P09X52_A8399PMDValFch ;
   private java.math.BigDecimal[] P09X52_A8532PMDPreUni ;
   private java.math.BigDecimal[] P09X52_A8398PMDDtoAca ;
   private java.math.BigDecimal[] P09X52_A8397PMDDtoTin ;
   private java.math.BigDecimal[] P09X52_A8396PMDEntKgm ;
   private java.math.BigDecimal[] P09X52_A8395PMDPreKgm ;
   private String[] P09X52_A8530PMDColCli ;
   private int[] P09X52_A8393PMDColNum ;
   private String[] P09X52_A8392PMDDsc ;
   private boolean[] P09X52_n8392PMDDsc ;
   private int[] P09X52_A8531PMDConCod ;
   private int[] P09X52_A252CliCod ;
   private String[] P09X52_A396EmprCod ;
   private String[] P09X53_A8530PMDColCli ;
   private java.util.Date[] P09X53_A8399PMDValFch ;
   private java.math.BigDecimal[] P09X53_A8532PMDPreUni ;
   private java.math.BigDecimal[] P09X53_A8398PMDDtoAca ;
   private java.math.BigDecimal[] P09X53_A8397PMDDtoTin ;
   private java.math.BigDecimal[] P09X53_A8396PMDEntKgm ;
   private java.math.BigDecimal[] P09X53_A8395PMDPreKgm ;
   private int[] P09X53_A8393PMDColNum ;
   private String[] P09X53_A8392PMDDsc ;
   private boolean[] P09X53_n8392PMDDsc ;
   private short[] P09X53_A8391PMDCod ;
   private int[] P09X53_A8531PMDConCod ;
   private int[] P09X53_A252CliCod ;
   private String[] P09X53_A396EmprCod ;
   private java.util.Date[] P09X54_A8399PMDValFch ;
   private java.math.BigDecimal[] P09X54_A8532PMDPreUni ;
   private java.math.BigDecimal[] P09X54_A8398PMDDtoAca ;
   private java.math.BigDecimal[] P09X54_A8397PMDDtoTin ;
   private java.math.BigDecimal[] P09X54_A8396PMDEntKgm ;
   private java.math.BigDecimal[] P09X54_A8395PMDPreKgm ;
   private String[] P09X54_A8530PMDColCli ;
   private int[] P09X54_A8393PMDColNum ;
   private String[] P09X54_A8392PMDDsc ;
   private boolean[] P09X54_n8392PMDDsc ;
   private short[] P09X54_A8391PMDCod ;
   private int[] P09X54_A8531PMDConCod ;
   private int[] P09X54_A252CliCod ;
   private String[] P09X54_A396EmprCod ;
   private GXSimpleCollection<String> AV38Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV41OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class dis_dismancod1_promptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09X52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod ,
                                          short AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to ,
                                          String AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                          String AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                          int AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum ,
                                          int AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to ,
                                          String AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                          String AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                          int AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod ,
                                          int AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to ,
                                          java.math.BigDecimal AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                          java.math.BigDecimal AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                          java.math.BigDecimal AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                          java.math.BigDecimal AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                          java.math.BigDecimal AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                          java.math.BigDecimal AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                          java.math.BigDecimal AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                          java.math.BigDecimal AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                          java.math.BigDecimal AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                          java.math.BigDecimal AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                          java.util.Date AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                          int AV83Pedidos_dis_dismancod1_promptds_25_tfclicod ,
                                          int AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to ,
                                          short A8391PMDCod ,
                                          String A8392PMDDsc ,
                                          int A8393PMDColNum ,
                                          String A8530PMDColCli ,
                                          int A8531PMDConCod ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          int A252CliCod ,
                                          String AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                          String A8394PMDColNom ,
                                          String AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                          String AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[23];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PMDCod, T1.PMDValFch, T1.PMDPreUni, T1.PMDDtoAca, T1.PMDDtoTin, T1.PMDEntKgm, T1.PMDPreKgm, T1.PMDColCli, T1.PMDColNum, T2.PMDDsc, T1.PMDConCod, T1.CliCod," ;
      scmdbuf += " T1.EmprCod FROM (TXPProMD1 T1 INNER JOIN TXPProMD T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.PMDCod = T1.PMDCod)" ;
      if ( ! (0==AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod) )
      {
         addWhere(sWhereString, "(T1.PMDCod >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (0==AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDCod <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PMDDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PMDDsc = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) )
      {
         addWhere(sWhereString, "(T1.PMDColNum >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) )
      {
         addWhere(sWhereString, "(T1.PMDColNum <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDColCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDColCli = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) )
      {
         addWhere(sWhereString, "(T1.PMDConCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDConCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch)) )
      {
         addWhere(sWhereString, "(T1.PMDValFch >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV83Pedidos_dis_dismancod1_promptds_25_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.PMDCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09X53( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod ,
                                          short AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to ,
                                          String AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                          String AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                          int AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum ,
                                          int AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to ,
                                          String AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                          String AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                          int AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod ,
                                          int AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to ,
                                          java.math.BigDecimal AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                          java.math.BigDecimal AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                          java.math.BigDecimal AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                          java.math.BigDecimal AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                          java.math.BigDecimal AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                          java.math.BigDecimal AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                          java.math.BigDecimal AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                          java.math.BigDecimal AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                          java.math.BigDecimal AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                          java.math.BigDecimal AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                          java.util.Date AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                          int AV83Pedidos_dis_dismancod1_promptds_25_tfclicod ,
                                          int AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to ,
                                          short A8391PMDCod ,
                                          String A8392PMDDsc ,
                                          int A8393PMDColNum ,
                                          String A8530PMDColCli ,
                                          int A8531PMDConCod ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          int A252CliCod ,
                                          String AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                          String A8394PMDColNom ,
                                          String AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                          String AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PMDColCli, T1.PMDValFch, T1.PMDPreUni, T1.PMDDtoAca, T1.PMDDtoTin, T1.PMDEntKgm, T1.PMDPreKgm, T1.PMDColNum, T2.PMDDsc, T1.PMDCod, T1.PMDConCod, T1.CliCod," ;
      scmdbuf += " T1.EmprCod FROM (TXPProMD1 T1 INNER JOIN TXPProMD T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.PMDCod = T1.PMDCod)" ;
      if ( ! (0==AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod) )
      {
         addWhere(sWhereString, "(T1.PMDCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PMDDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PMDDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) )
      {
         addWhere(sWhereString, "(T1.PMDColNum >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) )
      {
         addWhere(sWhereString, "(T1.PMDColNum <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDColCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDColCli = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) )
      {
         addWhere(sWhereString, "(T1.PMDConCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDConCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch)) )
      {
         addWhere(sWhereString, "(T1.PMDValFch >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV83Pedidos_dis_dismancod1_promptds_25_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PMDColCli" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09X54( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod ,
                                          short AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to ,
                                          String AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel ,
                                          String AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc ,
                                          int AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum ,
                                          int AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to ,
                                          String AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel ,
                                          String AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli ,
                                          int AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod ,
                                          int AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to ,
                                          java.math.BigDecimal AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm ,
                                          java.math.BigDecimal AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to ,
                                          java.math.BigDecimal AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm ,
                                          java.math.BigDecimal AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to ,
                                          java.math.BigDecimal AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin ,
                                          java.math.BigDecimal AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to ,
                                          java.math.BigDecimal AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca ,
                                          java.math.BigDecimal AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to ,
                                          java.math.BigDecimal AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni ,
                                          java.math.BigDecimal AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to ,
                                          java.util.Date AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch ,
                                          int AV83Pedidos_dis_dismancod1_promptds_25_tfclicod ,
                                          int AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to ,
                                          short A8391PMDCod ,
                                          String A8392PMDDsc ,
                                          int A8393PMDColNum ,
                                          String A8530PMDColCli ,
                                          int A8531PMDConCod ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          int A252CliCod ,
                                          String AV59Pedidos_dis_dismancod1_promptds_1_filterfulltext ,
                                          String A8394PMDColNom ,
                                          String AV71Pedidos_dis_dismancod1_promptds_13_tfpmdcolnom_sel ,
                                          String AV70Pedidos_dis_dismancod1_promptds_12_tfpmdcolnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[23];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PMDValFch, T1.PMDPreUni, T1.PMDDtoAca, T1.PMDDtoTin, T1.PMDEntKgm, T1.PMDPreKgm, T1.PMDColCli, T1.PMDColNum, T2.PMDDsc, T1.PMDCod, T1.PMDConCod, T1.CliCod," ;
      scmdbuf += " T1.EmprCod FROM (TXPProMD1 T1 INNER JOIN TXPProMD T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.PMDCod = T1.PMDCod)" ;
      if ( ! (0==AV60Pedidos_dis_dismancod1_promptds_2_tfpmdcod) )
      {
         addWhere(sWhereString, "(T1.PMDCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV61Pedidos_dis_dismancod1_promptds_3_tfpmdcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidos_dis_dismancod1_promptds_4_tfpmddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PMDDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidos_dis_dismancod1_promptds_5_tfpmddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PMDDsc = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV64Pedidos_dis_dismancod1_promptds_6_tfpmdcolnum) )
      {
         addWhere(sWhereString, "(T1.PMDColNum >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidos_dis_dismancod1_promptds_7_tfpmdcolnum_to) )
      {
         addWhere(sWhereString, "(T1.PMDColNum <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidos_dis_dismancod1_promptds_8_tfpmdcolcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDColCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidos_dis_dismancod1_promptds_9_tfpmdcolcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDColCli = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidos_dis_dismancod1_promptds_10_tfpmdconcod) )
      {
         addWhere(sWhereString, "(T1.PMDConCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidos_dis_dismancod1_promptds_11_tfpmdconcod_to) )
      {
         addWhere(sWhereString, "(T1.PMDConCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidos_dis_dismancod1_promptds_14_tfpmdprekgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidos_dis_dismancod1_promptds_15_tfpmdprekgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidos_dis_dismancod1_promptds_16_tfpmdentkgm)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidos_dis_dismancod1_promptds_17_tfpmdentkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Pedidos_dis_dismancod1_promptds_18_tfpmddtotin)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Pedidos_dis_dismancod1_promptds_19_tfpmddtotin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidos_dis_dismancod1_promptds_20_tfpmddtoaca)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Pedidos_dis_dismancod1_promptds_21_tfpmddtoaca_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Pedidos_dis_dismancod1_promptds_22_tfpmdpreuni)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_dis_dismancod1_promptds_23_tfpmdpreuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMDPreUni <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Pedidos_dis_dismancod1_promptds_24_tfpmdvalfch)) )
      {
         addWhere(sWhereString, "(T1.PMDValFch >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV83Pedidos_dis_dismancod1_promptds_25_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV84Pedidos_dis_dismancod1_promptds_26_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.PMDCod, T1.PMDColNum" ;
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
                  return conditional_P09X52(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 1 :
                  return conditional_P09X53(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 2 :
                  return conditional_P09X54(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09X52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09X53", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09X54", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
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
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
      }
   }

}

