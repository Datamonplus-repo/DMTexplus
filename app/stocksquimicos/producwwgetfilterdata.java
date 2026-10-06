package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class producwwgetfilterdata extends GXProcedure
{
   public producwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( producwwgetfilterdata.class ), "" );
   }

   public producwwgetfilterdata( int remoteHandle ,
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
      producwwgetfilterdata.this.aP5 = new String[] {""};
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
      producwwgetfilterdata.this.AV16DDOName = aP0;
      producwwgetfilterdata.this.AV14SearchTxt = aP1;
      producwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      producwwgetfilterdata.this.aP3 = aP3;
      producwwgetfilterdata.this.aP4 = aP4;
      producwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDGOTS") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDGOTSOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDREACH") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDREACHOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDHM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDHMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDTHELIST") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDTHELISTOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDHS") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDHSOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.PRODUCWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.PRODUCWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.PRODUCWWGridState"), null, null);
      }
      AV56GXV1 = 1 ;
      while ( AV56GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV56GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV10TFPrdNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV11TFPrdNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV33TFPrdAox = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV34TFPrdAox_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV35TFPrdGots = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV36TFPrdGots_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV37TFPrdReach = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV38TFPrdReach_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV39TFPrdOkotex_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV40TFPrdOkotex_Sels.fromJSonString(AV39TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV41TFPrdHm = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV42TFPrdHm_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV43TFPrdZDHC_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV44TFPrdZDHC_Sels.fromJSonString(AV43TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV45TFPrdList_SelsJson = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV46TFPrdList_Sels.fromJSonString(AV45TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV47TFPrdTHELIST = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV48TFPrdTHELIST_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV49TFPrdHS = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV50TFPrdHS_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV51TFPrdFHS = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDESCOMPUESTO_SEL") == 0 )
         {
            AV53TFPrdEsCompuesto_Sel = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV56GXV1 = (int)(AV56GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNom = AV14SearchTxt ;
      AV11TFPrdNom_Sel = "" ;
      AV58Stocksquimicos_producwwds_1_filterfulltext = AV32FilterFullText ;
      AV59Stocksquimicos_producwwds_2_tfprdnom = AV10TFPrdNom ;
      AV60Stocksquimicos_producwwds_3_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV61Stocksquimicos_producwwds_4_tfprdnum = AV12TFPrdNum ;
      AV62Stocksquimicos_producwwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV63Stocksquimicos_producwwds_6_tfprdaox = AV33TFPrdAox ;
      AV64Stocksquimicos_producwwds_7_tfprdaox_to = AV34TFPrdAox_To ;
      AV65Stocksquimicos_producwwds_8_tfprdgots = AV35TFPrdGots ;
      AV66Stocksquimicos_producwwds_9_tfprdgots_sel = AV36TFPrdGots_Sel ;
      AV67Stocksquimicos_producwwds_10_tfprdreach = AV37TFPrdReach ;
      AV68Stocksquimicos_producwwds_11_tfprdreach_sel = AV38TFPrdReach_Sel ;
      AV69Stocksquimicos_producwwds_12_tfprdokotex_sels = AV40TFPrdOkotex_Sels ;
      AV70Stocksquimicos_producwwds_13_tfprdhm = AV41TFPrdHm ;
      AV71Stocksquimicos_producwwds_14_tfprdhm_sel = AV42TFPrdHm_Sel ;
      AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV44TFPrdZDHC_Sels ;
      AV73Stocksquimicos_producwwds_16_tfprdlist_sels = AV46TFPrdList_Sels ;
      AV74Stocksquimicos_producwwds_17_tfprdthelist = AV47TFPrdTHELIST ;
      AV75Stocksquimicos_producwwds_18_tfprdthelist_sel = AV48TFPrdTHELIST_Sel ;
      AV76Stocksquimicos_producwwds_19_tfprdhs = AV49TFPrdHS ;
      AV77Stocksquimicos_producwwds_20_tfprdhs_sel = AV50TFPrdHS_Sel ;
      AV78Stocksquimicos_producwwds_21_tfprdfhs = AV51TFPrdFHS ;
      AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV53TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV69Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV73Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           AV58Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV59Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV61Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV65Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV67Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV70Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV74Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV76Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV76Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VF2 */
      pr_default.execute(0, new Object[] {lV59Stocksquimicos_producwwds_2_tfprdnom, AV60Stocksquimicos_producwwds_3_tfprdnom_sel, lV61Stocksquimicos_producwwds_4_tfprdnum, AV62Stocksquimicos_producwwds_5_tfprdnum_sel, AV63Stocksquimicos_producwwds_6_tfprdaox, AV64Stocksquimicos_producwwds_7_tfprdaox_to, lV65Stocksquimicos_producwwds_8_tfprdgots, AV66Stocksquimicos_producwwds_9_tfprdgots_sel, lV67Stocksquimicos_producwwds_10_tfprdreach, AV68Stocksquimicos_producwwds_11_tfprdreach_sel, lV70Stocksquimicos_producwwds_13_tfprdhm, AV71Stocksquimicos_producwwds_14_tfprdhm_sel, lV74Stocksquimicos_producwwds_17_tfprdthelist, AV75Stocksquimicos_producwwds_18_tfprdthelist_sel, lV76Stocksquimicos_producwwds_19_tfprdhs, AV77Stocksquimicos_producwwds_20_tfprdhs_sel, AV78Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8VF2 = false ;
         A718PrdNom = P08VF2_A718PrdNom[0] ;
         A9742PrdFHS = P08VF2_A9742PrdFHS[0] ;
         A9741PrdHS = P08VF2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08VF2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VF2_n13302PrdTHELIST[0] ;
         A11364PrdHm = P08VF2_A11364PrdHm[0] ;
         A5887PrdReach = P08VF2_A5887PrdReach[0] ;
         A11363PrdGots = P08VF2_A11363PrdGots[0] ;
         A9733PrdAox = P08VF2_A9733PrdAox[0] ;
         A11687PrdList = P08VF2_A11687PrdList[0] ;
         A13301PrdZDHC = P08VF2_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VF2_A5888PrdOkotex[0] ;
         A719PrdNum = P08VF2_A719PrdNum[0] ;
         A396EmprCod = P08VF2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV58Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
            AV26count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08VF2_A718PrdNom[0], A718PrdNom) == 0 ) )
            {
               brk8VF2 = false ;
               A719PrdNum = P08VF2_A719PrdNum[0] ;
               A396EmprCod = P08VF2_A396EmprCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8VF2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
            {
               AV18Option = A718PrdNom ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8VF2 )
         {
            brk8VF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV14SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV58Stocksquimicos_producwwds_1_filterfulltext = AV32FilterFullText ;
      AV59Stocksquimicos_producwwds_2_tfprdnom = AV10TFPrdNom ;
      AV60Stocksquimicos_producwwds_3_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV61Stocksquimicos_producwwds_4_tfprdnum = AV12TFPrdNum ;
      AV62Stocksquimicos_producwwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV63Stocksquimicos_producwwds_6_tfprdaox = AV33TFPrdAox ;
      AV64Stocksquimicos_producwwds_7_tfprdaox_to = AV34TFPrdAox_To ;
      AV65Stocksquimicos_producwwds_8_tfprdgots = AV35TFPrdGots ;
      AV66Stocksquimicos_producwwds_9_tfprdgots_sel = AV36TFPrdGots_Sel ;
      AV67Stocksquimicos_producwwds_10_tfprdreach = AV37TFPrdReach ;
      AV68Stocksquimicos_producwwds_11_tfprdreach_sel = AV38TFPrdReach_Sel ;
      AV69Stocksquimicos_producwwds_12_tfprdokotex_sels = AV40TFPrdOkotex_Sels ;
      AV70Stocksquimicos_producwwds_13_tfprdhm = AV41TFPrdHm ;
      AV71Stocksquimicos_producwwds_14_tfprdhm_sel = AV42TFPrdHm_Sel ;
      AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV44TFPrdZDHC_Sels ;
      AV73Stocksquimicos_producwwds_16_tfprdlist_sels = AV46TFPrdList_Sels ;
      AV74Stocksquimicos_producwwds_17_tfprdthelist = AV47TFPrdTHELIST ;
      AV75Stocksquimicos_producwwds_18_tfprdthelist_sel = AV48TFPrdTHELIST_Sel ;
      AV76Stocksquimicos_producwwds_19_tfprdhs = AV49TFPrdHS ;
      AV77Stocksquimicos_producwwds_20_tfprdhs_sel = AV50TFPrdHS_Sel ;
      AV78Stocksquimicos_producwwds_21_tfprdfhs = AV51TFPrdFHS ;
      AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV53TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV69Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV73Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           AV58Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV59Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV61Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV65Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV67Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV70Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV74Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV76Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV76Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VF3 */
      pr_default.execute(1, new Object[] {lV59Stocksquimicos_producwwds_2_tfprdnom, AV60Stocksquimicos_producwwds_3_tfprdnom_sel, lV61Stocksquimicos_producwwds_4_tfprdnum, AV62Stocksquimicos_producwwds_5_tfprdnum_sel, AV63Stocksquimicos_producwwds_6_tfprdaox, AV64Stocksquimicos_producwwds_7_tfprdaox_to, lV65Stocksquimicos_producwwds_8_tfprdgots, AV66Stocksquimicos_producwwds_9_tfprdgots_sel, lV67Stocksquimicos_producwwds_10_tfprdreach, AV68Stocksquimicos_producwwds_11_tfprdreach_sel, lV70Stocksquimicos_producwwds_13_tfprdhm, AV71Stocksquimicos_producwwds_14_tfprdhm_sel, lV74Stocksquimicos_producwwds_17_tfprdthelist, AV75Stocksquimicos_producwwds_18_tfprdthelist_sel, lV76Stocksquimicos_producwwds_19_tfprdhs, AV77Stocksquimicos_producwwds_20_tfprdhs_sel, AV78Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8VF4 = false ;
         A9742PrdFHS = P08VF3_A9742PrdFHS[0] ;
         A9741PrdHS = P08VF3_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08VF3_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VF3_n13302PrdTHELIST[0] ;
         A11364PrdHm = P08VF3_A11364PrdHm[0] ;
         A5887PrdReach = P08VF3_A5887PrdReach[0] ;
         A11363PrdGots = P08VF3_A11363PrdGots[0] ;
         A9733PrdAox = P08VF3_A9733PrdAox[0] ;
         A718PrdNom = P08VF3_A718PrdNom[0] ;
         A11687PrdList = P08VF3_A11687PrdList[0] ;
         A13301PrdZDHC = P08VF3_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VF3_A5888PrdOkotex[0] ;
         A719PrdNum = P08VF3_A719PrdNum[0] ;
         A396EmprCod = P08VF3_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV58Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
            AV26count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08VF3_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk8VF4 = false ;
               A396EmprCod = P08VF3_A396EmprCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8VF4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
            {
               AV18Option = A719PrdNum ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8VF4 )
         {
            brk8VF4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDGOTSOPTIONS' Routine */
      returnInSub = false ;
      AV35TFPrdGots = AV14SearchTxt ;
      AV36TFPrdGots_Sel = "" ;
      AV58Stocksquimicos_producwwds_1_filterfulltext = AV32FilterFullText ;
      AV59Stocksquimicos_producwwds_2_tfprdnom = AV10TFPrdNom ;
      AV60Stocksquimicos_producwwds_3_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV61Stocksquimicos_producwwds_4_tfprdnum = AV12TFPrdNum ;
      AV62Stocksquimicos_producwwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV63Stocksquimicos_producwwds_6_tfprdaox = AV33TFPrdAox ;
      AV64Stocksquimicos_producwwds_7_tfprdaox_to = AV34TFPrdAox_To ;
      AV65Stocksquimicos_producwwds_8_tfprdgots = AV35TFPrdGots ;
      AV66Stocksquimicos_producwwds_9_tfprdgots_sel = AV36TFPrdGots_Sel ;
      AV67Stocksquimicos_producwwds_10_tfprdreach = AV37TFPrdReach ;
      AV68Stocksquimicos_producwwds_11_tfprdreach_sel = AV38TFPrdReach_Sel ;
      AV69Stocksquimicos_producwwds_12_tfprdokotex_sels = AV40TFPrdOkotex_Sels ;
      AV70Stocksquimicos_producwwds_13_tfprdhm = AV41TFPrdHm ;
      AV71Stocksquimicos_producwwds_14_tfprdhm_sel = AV42TFPrdHm_Sel ;
      AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV44TFPrdZDHC_Sels ;
      AV73Stocksquimicos_producwwds_16_tfprdlist_sels = AV46TFPrdList_Sels ;
      AV74Stocksquimicos_producwwds_17_tfprdthelist = AV47TFPrdTHELIST ;
      AV75Stocksquimicos_producwwds_18_tfprdthelist_sel = AV48TFPrdTHELIST_Sel ;
      AV76Stocksquimicos_producwwds_19_tfprdhs = AV49TFPrdHS ;
      AV77Stocksquimicos_producwwds_20_tfprdhs_sel = AV50TFPrdHS_Sel ;
      AV78Stocksquimicos_producwwds_21_tfprdfhs = AV51TFPrdFHS ;
      AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV53TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV69Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV73Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           AV58Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV59Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV61Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV65Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV67Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV70Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV74Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV76Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV76Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VF4 */
      pr_default.execute(2, new Object[] {lV59Stocksquimicos_producwwds_2_tfprdnom, AV60Stocksquimicos_producwwds_3_tfprdnom_sel, lV61Stocksquimicos_producwwds_4_tfprdnum, AV62Stocksquimicos_producwwds_5_tfprdnum_sel, AV63Stocksquimicos_producwwds_6_tfprdaox, AV64Stocksquimicos_producwwds_7_tfprdaox_to, lV65Stocksquimicos_producwwds_8_tfprdgots, AV66Stocksquimicos_producwwds_9_tfprdgots_sel, lV67Stocksquimicos_producwwds_10_tfprdreach, AV68Stocksquimicos_producwwds_11_tfprdreach_sel, lV70Stocksquimicos_producwwds_13_tfprdhm, AV71Stocksquimicos_producwwds_14_tfprdhm_sel, lV74Stocksquimicos_producwwds_17_tfprdthelist, AV75Stocksquimicos_producwwds_18_tfprdthelist_sel, lV76Stocksquimicos_producwwds_19_tfprdhs, AV77Stocksquimicos_producwwds_20_tfprdhs_sel, AV78Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8VF6 = false ;
         A11363PrdGots = P08VF4_A11363PrdGots[0] ;
         A9742PrdFHS = P08VF4_A9742PrdFHS[0] ;
         A9741PrdHS = P08VF4_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08VF4_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VF4_n13302PrdTHELIST[0] ;
         A11364PrdHm = P08VF4_A11364PrdHm[0] ;
         A5887PrdReach = P08VF4_A5887PrdReach[0] ;
         A9733PrdAox = P08VF4_A9733PrdAox[0] ;
         A718PrdNom = P08VF4_A718PrdNom[0] ;
         A11687PrdList = P08VF4_A11687PrdList[0] ;
         A13301PrdZDHC = P08VF4_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VF4_A5888PrdOkotex[0] ;
         A719PrdNum = P08VF4_A719PrdNum[0] ;
         A396EmprCod = P08VF4_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV58Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
            AV26count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08VF4_A11363PrdGots[0], A11363PrdGots) == 0 ) )
            {
               brk8VF6 = false ;
               A719PrdNum = P08VF4_A719PrdNum[0] ;
               A396EmprCod = P08VF4_A396EmprCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8VF6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A11363PrdGots)==0) )
            {
               AV18Option = A11363PrdGots ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8VF6 )
         {
            brk8VF6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDREACHOPTIONS' Routine */
      returnInSub = false ;
      AV37TFPrdReach = AV14SearchTxt ;
      AV38TFPrdReach_Sel = "" ;
      AV58Stocksquimicos_producwwds_1_filterfulltext = AV32FilterFullText ;
      AV59Stocksquimicos_producwwds_2_tfprdnom = AV10TFPrdNom ;
      AV60Stocksquimicos_producwwds_3_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV61Stocksquimicos_producwwds_4_tfprdnum = AV12TFPrdNum ;
      AV62Stocksquimicos_producwwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV63Stocksquimicos_producwwds_6_tfprdaox = AV33TFPrdAox ;
      AV64Stocksquimicos_producwwds_7_tfprdaox_to = AV34TFPrdAox_To ;
      AV65Stocksquimicos_producwwds_8_tfprdgots = AV35TFPrdGots ;
      AV66Stocksquimicos_producwwds_9_tfprdgots_sel = AV36TFPrdGots_Sel ;
      AV67Stocksquimicos_producwwds_10_tfprdreach = AV37TFPrdReach ;
      AV68Stocksquimicos_producwwds_11_tfprdreach_sel = AV38TFPrdReach_Sel ;
      AV69Stocksquimicos_producwwds_12_tfprdokotex_sels = AV40TFPrdOkotex_Sels ;
      AV70Stocksquimicos_producwwds_13_tfprdhm = AV41TFPrdHm ;
      AV71Stocksquimicos_producwwds_14_tfprdhm_sel = AV42TFPrdHm_Sel ;
      AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV44TFPrdZDHC_Sels ;
      AV73Stocksquimicos_producwwds_16_tfprdlist_sels = AV46TFPrdList_Sels ;
      AV74Stocksquimicos_producwwds_17_tfprdthelist = AV47TFPrdTHELIST ;
      AV75Stocksquimicos_producwwds_18_tfprdthelist_sel = AV48TFPrdTHELIST_Sel ;
      AV76Stocksquimicos_producwwds_19_tfprdhs = AV49TFPrdHS ;
      AV77Stocksquimicos_producwwds_20_tfprdhs_sel = AV50TFPrdHS_Sel ;
      AV78Stocksquimicos_producwwds_21_tfprdfhs = AV51TFPrdFHS ;
      AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV53TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV69Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV73Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           AV58Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV59Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV61Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV65Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV67Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV70Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV74Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV76Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV76Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VF5 */
      pr_default.execute(3, new Object[] {lV59Stocksquimicos_producwwds_2_tfprdnom, AV60Stocksquimicos_producwwds_3_tfprdnom_sel, lV61Stocksquimicos_producwwds_4_tfprdnum, AV62Stocksquimicos_producwwds_5_tfprdnum_sel, AV63Stocksquimicos_producwwds_6_tfprdaox, AV64Stocksquimicos_producwwds_7_tfprdaox_to, lV65Stocksquimicos_producwwds_8_tfprdgots, AV66Stocksquimicos_producwwds_9_tfprdgots_sel, lV67Stocksquimicos_producwwds_10_tfprdreach, AV68Stocksquimicos_producwwds_11_tfprdreach_sel, lV70Stocksquimicos_producwwds_13_tfprdhm, AV71Stocksquimicos_producwwds_14_tfprdhm_sel, lV74Stocksquimicos_producwwds_17_tfprdthelist, AV75Stocksquimicos_producwwds_18_tfprdthelist_sel, lV76Stocksquimicos_producwwds_19_tfprdhs, AV77Stocksquimicos_producwwds_20_tfprdhs_sel, AV78Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8VF8 = false ;
         A5887PrdReach = P08VF5_A5887PrdReach[0] ;
         A9742PrdFHS = P08VF5_A9742PrdFHS[0] ;
         A9741PrdHS = P08VF5_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08VF5_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VF5_n13302PrdTHELIST[0] ;
         A11364PrdHm = P08VF5_A11364PrdHm[0] ;
         A11363PrdGots = P08VF5_A11363PrdGots[0] ;
         A9733PrdAox = P08VF5_A9733PrdAox[0] ;
         A718PrdNom = P08VF5_A718PrdNom[0] ;
         A11687PrdList = P08VF5_A11687PrdList[0] ;
         A13301PrdZDHC = P08VF5_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VF5_A5888PrdOkotex[0] ;
         A719PrdNum = P08VF5_A719PrdNum[0] ;
         A396EmprCod = P08VF5_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV58Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
            AV26count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08VF5_A5887PrdReach[0], A5887PrdReach) == 0 ) )
            {
               brk8VF8 = false ;
               A719PrdNum = P08VF5_A719PrdNum[0] ;
               A396EmprCod = P08VF5_A396EmprCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8VF8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A5887PrdReach)==0) )
            {
               AV18Option = A5887PrdReach ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8VF8 )
         {
            brk8VF8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRDHMOPTIONS' Routine */
      returnInSub = false ;
      AV41TFPrdHm = AV14SearchTxt ;
      AV42TFPrdHm_Sel = "" ;
      AV58Stocksquimicos_producwwds_1_filterfulltext = AV32FilterFullText ;
      AV59Stocksquimicos_producwwds_2_tfprdnom = AV10TFPrdNom ;
      AV60Stocksquimicos_producwwds_3_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV61Stocksquimicos_producwwds_4_tfprdnum = AV12TFPrdNum ;
      AV62Stocksquimicos_producwwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV63Stocksquimicos_producwwds_6_tfprdaox = AV33TFPrdAox ;
      AV64Stocksquimicos_producwwds_7_tfprdaox_to = AV34TFPrdAox_To ;
      AV65Stocksquimicos_producwwds_8_tfprdgots = AV35TFPrdGots ;
      AV66Stocksquimicos_producwwds_9_tfprdgots_sel = AV36TFPrdGots_Sel ;
      AV67Stocksquimicos_producwwds_10_tfprdreach = AV37TFPrdReach ;
      AV68Stocksquimicos_producwwds_11_tfprdreach_sel = AV38TFPrdReach_Sel ;
      AV69Stocksquimicos_producwwds_12_tfprdokotex_sels = AV40TFPrdOkotex_Sels ;
      AV70Stocksquimicos_producwwds_13_tfprdhm = AV41TFPrdHm ;
      AV71Stocksquimicos_producwwds_14_tfprdhm_sel = AV42TFPrdHm_Sel ;
      AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV44TFPrdZDHC_Sels ;
      AV73Stocksquimicos_producwwds_16_tfprdlist_sels = AV46TFPrdList_Sels ;
      AV74Stocksquimicos_producwwds_17_tfprdthelist = AV47TFPrdTHELIST ;
      AV75Stocksquimicos_producwwds_18_tfprdthelist_sel = AV48TFPrdTHELIST_Sel ;
      AV76Stocksquimicos_producwwds_19_tfprdhs = AV49TFPrdHS ;
      AV77Stocksquimicos_producwwds_20_tfprdhs_sel = AV50TFPrdHS_Sel ;
      AV78Stocksquimicos_producwwds_21_tfprdfhs = AV51TFPrdFHS ;
      AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV53TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV69Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV73Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           AV58Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV59Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV61Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV65Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV67Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV70Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV74Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV76Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV76Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VF6 */
      pr_default.execute(4, new Object[] {lV59Stocksquimicos_producwwds_2_tfprdnom, AV60Stocksquimicos_producwwds_3_tfprdnom_sel, lV61Stocksquimicos_producwwds_4_tfprdnum, AV62Stocksquimicos_producwwds_5_tfprdnum_sel, AV63Stocksquimicos_producwwds_6_tfprdaox, AV64Stocksquimicos_producwwds_7_tfprdaox_to, lV65Stocksquimicos_producwwds_8_tfprdgots, AV66Stocksquimicos_producwwds_9_tfprdgots_sel, lV67Stocksquimicos_producwwds_10_tfprdreach, AV68Stocksquimicos_producwwds_11_tfprdreach_sel, lV70Stocksquimicos_producwwds_13_tfprdhm, AV71Stocksquimicos_producwwds_14_tfprdhm_sel, lV74Stocksquimicos_producwwds_17_tfprdthelist, AV75Stocksquimicos_producwwds_18_tfprdthelist_sel, lV76Stocksquimicos_producwwds_19_tfprdhs, AV77Stocksquimicos_producwwds_20_tfprdhs_sel, AV78Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8VF10 = false ;
         A11364PrdHm = P08VF6_A11364PrdHm[0] ;
         A9742PrdFHS = P08VF6_A9742PrdFHS[0] ;
         A9741PrdHS = P08VF6_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08VF6_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VF6_n13302PrdTHELIST[0] ;
         A5887PrdReach = P08VF6_A5887PrdReach[0] ;
         A11363PrdGots = P08VF6_A11363PrdGots[0] ;
         A9733PrdAox = P08VF6_A9733PrdAox[0] ;
         A718PrdNom = P08VF6_A718PrdNom[0] ;
         A11687PrdList = P08VF6_A11687PrdList[0] ;
         A13301PrdZDHC = P08VF6_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VF6_A5888PrdOkotex[0] ;
         A719PrdNum = P08VF6_A719PrdNum[0] ;
         A396EmprCod = P08VF6_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV58Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
            AV26count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08VF6_A11364PrdHm[0], A11364PrdHm) == 0 ) )
            {
               brk8VF10 = false ;
               A719PrdNum = P08VF6_A719PrdNum[0] ;
               A396EmprCod = P08VF6_A396EmprCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8VF10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A11364PrdHm)==0) )
            {
               AV18Option = A11364PrdHm ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8VF10 )
         {
            brk8VF10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPRDTHELISTOPTIONS' Routine */
      returnInSub = false ;
      AV47TFPrdTHELIST = AV14SearchTxt ;
      AV48TFPrdTHELIST_Sel = "" ;
      AV58Stocksquimicos_producwwds_1_filterfulltext = AV32FilterFullText ;
      AV59Stocksquimicos_producwwds_2_tfprdnom = AV10TFPrdNom ;
      AV60Stocksquimicos_producwwds_3_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV61Stocksquimicos_producwwds_4_tfprdnum = AV12TFPrdNum ;
      AV62Stocksquimicos_producwwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV63Stocksquimicos_producwwds_6_tfprdaox = AV33TFPrdAox ;
      AV64Stocksquimicos_producwwds_7_tfprdaox_to = AV34TFPrdAox_To ;
      AV65Stocksquimicos_producwwds_8_tfprdgots = AV35TFPrdGots ;
      AV66Stocksquimicos_producwwds_9_tfprdgots_sel = AV36TFPrdGots_Sel ;
      AV67Stocksquimicos_producwwds_10_tfprdreach = AV37TFPrdReach ;
      AV68Stocksquimicos_producwwds_11_tfprdreach_sel = AV38TFPrdReach_Sel ;
      AV69Stocksquimicos_producwwds_12_tfprdokotex_sels = AV40TFPrdOkotex_Sels ;
      AV70Stocksquimicos_producwwds_13_tfprdhm = AV41TFPrdHm ;
      AV71Stocksquimicos_producwwds_14_tfprdhm_sel = AV42TFPrdHm_Sel ;
      AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV44TFPrdZDHC_Sels ;
      AV73Stocksquimicos_producwwds_16_tfprdlist_sels = AV46TFPrdList_Sels ;
      AV74Stocksquimicos_producwwds_17_tfprdthelist = AV47TFPrdTHELIST ;
      AV75Stocksquimicos_producwwds_18_tfprdthelist_sel = AV48TFPrdTHELIST_Sel ;
      AV76Stocksquimicos_producwwds_19_tfprdhs = AV49TFPrdHS ;
      AV77Stocksquimicos_producwwds_20_tfprdhs_sel = AV50TFPrdHS_Sel ;
      AV78Stocksquimicos_producwwds_21_tfprdfhs = AV51TFPrdFHS ;
      AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV53TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV69Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV73Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           AV58Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV59Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV61Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV65Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV67Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV70Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV74Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV76Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV76Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VF7 */
      pr_default.execute(5, new Object[] {lV59Stocksquimicos_producwwds_2_tfprdnom, AV60Stocksquimicos_producwwds_3_tfprdnom_sel, lV61Stocksquimicos_producwwds_4_tfprdnum, AV62Stocksquimicos_producwwds_5_tfprdnum_sel, AV63Stocksquimicos_producwwds_6_tfprdaox, AV64Stocksquimicos_producwwds_7_tfprdaox_to, lV65Stocksquimicos_producwwds_8_tfprdgots, AV66Stocksquimicos_producwwds_9_tfprdgots_sel, lV67Stocksquimicos_producwwds_10_tfprdreach, AV68Stocksquimicos_producwwds_11_tfprdreach_sel, lV70Stocksquimicos_producwwds_13_tfprdhm, AV71Stocksquimicos_producwwds_14_tfprdhm_sel, lV74Stocksquimicos_producwwds_17_tfprdthelist, AV75Stocksquimicos_producwwds_18_tfprdthelist_sel, lV76Stocksquimicos_producwwds_19_tfprdhs, AV77Stocksquimicos_producwwds_20_tfprdhs_sel, AV78Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8VF12 = false ;
         A13302PrdTHELIST = P08VF7_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VF7_n13302PrdTHELIST[0] ;
         A9742PrdFHS = P08VF7_A9742PrdFHS[0] ;
         A9741PrdHS = P08VF7_A9741PrdHS[0] ;
         A11364PrdHm = P08VF7_A11364PrdHm[0] ;
         A5887PrdReach = P08VF7_A5887PrdReach[0] ;
         A11363PrdGots = P08VF7_A11363PrdGots[0] ;
         A9733PrdAox = P08VF7_A9733PrdAox[0] ;
         A718PrdNom = P08VF7_A718PrdNom[0] ;
         A11687PrdList = P08VF7_A11687PrdList[0] ;
         A13301PrdZDHC = P08VF7_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VF7_A5888PrdOkotex[0] ;
         A719PrdNum = P08VF7_A719PrdNum[0] ;
         A396EmprCod = P08VF7_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV58Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
            AV26count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08VF7_A13302PrdTHELIST[0], A13302PrdTHELIST) == 0 ) )
            {
               brk8VF12 = false ;
               A719PrdNum = P08VF7_A719PrdNum[0] ;
               A396EmprCod = P08VF7_A396EmprCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8VF12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A13302PrdTHELIST)==0) )
            {
               AV18Option = A13302PrdTHELIST ;
               AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!"))) ;
               AV19Options.add(AV18Option, 0);
               AV22OptionsDesc.add(AV21OptionDesc, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8VF12 )
         {
            brk8VF12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPRDHSOPTIONS' Routine */
      returnInSub = false ;
      AV49TFPrdHS = AV14SearchTxt ;
      AV50TFPrdHS_Sel = "" ;
      AV58Stocksquimicos_producwwds_1_filterfulltext = AV32FilterFullText ;
      AV59Stocksquimicos_producwwds_2_tfprdnom = AV10TFPrdNom ;
      AV60Stocksquimicos_producwwds_3_tfprdnom_sel = AV11TFPrdNom_Sel ;
      AV61Stocksquimicos_producwwds_4_tfprdnum = AV12TFPrdNum ;
      AV62Stocksquimicos_producwwds_5_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV63Stocksquimicos_producwwds_6_tfprdaox = AV33TFPrdAox ;
      AV64Stocksquimicos_producwwds_7_tfprdaox_to = AV34TFPrdAox_To ;
      AV65Stocksquimicos_producwwds_8_tfprdgots = AV35TFPrdGots ;
      AV66Stocksquimicos_producwwds_9_tfprdgots_sel = AV36TFPrdGots_Sel ;
      AV67Stocksquimicos_producwwds_10_tfprdreach = AV37TFPrdReach ;
      AV68Stocksquimicos_producwwds_11_tfprdreach_sel = AV38TFPrdReach_Sel ;
      AV69Stocksquimicos_producwwds_12_tfprdokotex_sels = AV40TFPrdOkotex_Sels ;
      AV70Stocksquimicos_producwwds_13_tfprdhm = AV41TFPrdHm ;
      AV71Stocksquimicos_producwwds_14_tfprdhm_sel = AV42TFPrdHm_Sel ;
      AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV44TFPrdZDHC_Sels ;
      AV73Stocksquimicos_producwwds_16_tfprdlist_sels = AV46TFPrdList_Sels ;
      AV74Stocksquimicos_producwwds_17_tfprdthelist = AV47TFPrdTHELIST ;
      AV75Stocksquimicos_producwwds_18_tfprdthelist_sel = AV48TFPrdTHELIST_Sel ;
      AV76Stocksquimicos_producwwds_19_tfprdhs = AV49TFPrdHS ;
      AV77Stocksquimicos_producwwds_20_tfprdhs_sel = AV50TFPrdHS_Sel ;
      AV78Stocksquimicos_producwwds_21_tfprdfhs = AV51TFPrdFHS ;
      AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV53TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV69Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV73Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           AV58Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV59Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV61Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV61Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV65Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV67Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV67Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV70Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV74Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV76Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV76Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VF8 */
      pr_default.execute(6, new Object[] {lV59Stocksquimicos_producwwds_2_tfprdnom, AV60Stocksquimicos_producwwds_3_tfprdnom_sel, lV61Stocksquimicos_producwwds_4_tfprdnum, AV62Stocksquimicos_producwwds_5_tfprdnum_sel, AV63Stocksquimicos_producwwds_6_tfprdaox, AV64Stocksquimicos_producwwds_7_tfprdaox_to, lV65Stocksquimicos_producwwds_8_tfprdgots, AV66Stocksquimicos_producwwds_9_tfprdgots_sel, lV67Stocksquimicos_producwwds_10_tfprdreach, AV68Stocksquimicos_producwwds_11_tfprdreach_sel, lV70Stocksquimicos_producwwds_13_tfprdhm, AV71Stocksquimicos_producwwds_14_tfprdhm_sel, lV74Stocksquimicos_producwwds_17_tfprdthelist, AV75Stocksquimicos_producwwds_18_tfprdthelist_sel, lV76Stocksquimicos_producwwds_19_tfprdhs, AV77Stocksquimicos_producwwds_20_tfprdhs_sel, AV78Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8VF14 = false ;
         A9741PrdHS = P08VF8_A9741PrdHS[0] ;
         A9742PrdFHS = P08VF8_A9742PrdFHS[0] ;
         A13302PrdTHELIST = P08VF8_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VF8_n13302PrdTHELIST[0] ;
         A11364PrdHm = P08VF8_A11364PrdHm[0] ;
         A5887PrdReach = P08VF8_A5887PrdReach[0] ;
         A11363PrdGots = P08VF8_A11363PrdGots[0] ;
         A9733PrdAox = P08VF8_A9733PrdAox[0] ;
         A718PrdNom = P08VF8_A718PrdNom[0] ;
         A11687PrdList = P08VF8_A11687PrdList[0] ;
         A13301PrdZDHC = P08VF8_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VF8_A5888PrdOkotex[0] ;
         A719PrdNum = P08VF8_A719PrdNum[0] ;
         A396EmprCod = P08VF8_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV58Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV58Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV58Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
            AV26count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08VF8_A9741PrdHS[0], A9741PrdHS) == 0 ) )
            {
               brk8VF14 = false ;
               A719PrdNum = P08VF8_A719PrdNum[0] ;
               A396EmprCod = P08VF8_A396EmprCod[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8VF14 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A9741PrdHS)==0) )
            {
               AV18Option = A9741PrdHS ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8VF14 )
         {
            brk8VF14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = producwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = producwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = producwwgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFPrdNom = "" ;
      AV11TFPrdNom_Sel = "" ;
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV33TFPrdAox = DecimalUtil.ZERO ;
      AV34TFPrdAox_To = DecimalUtil.ZERO ;
      AV35TFPrdGots = "" ;
      AV36TFPrdGots_Sel = "" ;
      AV37TFPrdReach = "" ;
      AV38TFPrdReach_Sel = "" ;
      AV39TFPrdOkotex_SelsJson = "" ;
      AV40TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV41TFPrdHm = "" ;
      AV42TFPrdHm_Sel = "" ;
      AV43TFPrdZDHC_SelsJson = "" ;
      AV44TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45TFPrdList_SelsJson = "" ;
      AV46TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47TFPrdTHELIST = "" ;
      AV48TFPrdTHELIST_Sel = "" ;
      AV49TFPrdHS = "" ;
      AV50TFPrdHS_Sel = "" ;
      AV51TFPrdFHS = GXutil.nullDate() ;
      A718PrdNom = "" ;
      AV58Stocksquimicos_producwwds_1_filterfulltext = "" ;
      AV59Stocksquimicos_producwwds_2_tfprdnom = "" ;
      AV60Stocksquimicos_producwwds_3_tfprdnom_sel = "" ;
      AV61Stocksquimicos_producwwds_4_tfprdnum = "" ;
      AV62Stocksquimicos_producwwds_5_tfprdnum_sel = "" ;
      AV63Stocksquimicos_producwwds_6_tfprdaox = DecimalUtil.ZERO ;
      AV64Stocksquimicos_producwwds_7_tfprdaox_to = DecimalUtil.ZERO ;
      AV65Stocksquimicos_producwwds_8_tfprdgots = "" ;
      AV66Stocksquimicos_producwwds_9_tfprdgots_sel = "" ;
      AV67Stocksquimicos_producwwds_10_tfprdreach = "" ;
      AV68Stocksquimicos_producwwds_11_tfprdreach_sel = "" ;
      AV69Stocksquimicos_producwwds_12_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70Stocksquimicos_producwwds_13_tfprdhm = "" ;
      AV71Stocksquimicos_producwwds_14_tfprdhm_sel = "" ;
      AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV73Stocksquimicos_producwwds_16_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV74Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      AV75Stocksquimicos_producwwds_18_tfprdthelist_sel = "" ;
      AV76Stocksquimicos_producwwds_19_tfprdhs = "" ;
      AV77Stocksquimicos_producwwds_20_tfprdhs_sel = "" ;
      AV78Stocksquimicos_producwwds_21_tfprdfhs = GXutil.nullDate() ;
      lV58Stocksquimicos_producwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV59Stocksquimicos_producwwds_2_tfprdnom = "" ;
      lV61Stocksquimicos_producwwds_4_tfprdnum = "" ;
      lV65Stocksquimicos_producwwds_8_tfprdgots = "" ;
      lV67Stocksquimicos_producwwds_10_tfprdreach = "" ;
      lV70Stocksquimicos_producwwds_13_tfprdhm = "" ;
      lV74Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      lV76Stocksquimicos_producwwds_19_tfprdhs = "" ;
      A5888PrdOkotex = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A719PrdNum = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A11364PrdHm = "" ;
      A13302PrdTHELIST = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      P08VF2_A718PrdNom = new String[] {""} ;
      P08VF2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VF2_A9741PrdHS = new String[] {""} ;
      P08VF2_A13302PrdTHELIST = new String[] {""} ;
      P08VF2_n13302PrdTHELIST = new boolean[] {false} ;
      P08VF2_A11364PrdHm = new String[] {""} ;
      P08VF2_A5887PrdReach = new String[] {""} ;
      P08VF2_A11363PrdGots = new String[] {""} ;
      P08VF2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VF2_A11687PrdList = new String[] {""} ;
      P08VF2_A13301PrdZDHC = new String[] {""} ;
      P08VF2_A5888PrdOkotex = new String[] {""} ;
      P08VF2_A719PrdNum = new String[] {""} ;
      P08VF2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P08VF3_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VF3_A9741PrdHS = new String[] {""} ;
      P08VF3_A13302PrdTHELIST = new String[] {""} ;
      P08VF3_n13302PrdTHELIST = new boolean[] {false} ;
      P08VF3_A11364PrdHm = new String[] {""} ;
      P08VF3_A5887PrdReach = new String[] {""} ;
      P08VF3_A11363PrdGots = new String[] {""} ;
      P08VF3_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VF3_A718PrdNom = new String[] {""} ;
      P08VF3_A11687PrdList = new String[] {""} ;
      P08VF3_A13301PrdZDHC = new String[] {""} ;
      P08VF3_A5888PrdOkotex = new String[] {""} ;
      P08VF3_A719PrdNum = new String[] {""} ;
      P08VF3_A396EmprCod = new String[] {""} ;
      P08VF4_A11363PrdGots = new String[] {""} ;
      P08VF4_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VF4_A9741PrdHS = new String[] {""} ;
      P08VF4_A13302PrdTHELIST = new String[] {""} ;
      P08VF4_n13302PrdTHELIST = new boolean[] {false} ;
      P08VF4_A11364PrdHm = new String[] {""} ;
      P08VF4_A5887PrdReach = new String[] {""} ;
      P08VF4_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VF4_A718PrdNom = new String[] {""} ;
      P08VF4_A11687PrdList = new String[] {""} ;
      P08VF4_A13301PrdZDHC = new String[] {""} ;
      P08VF4_A5888PrdOkotex = new String[] {""} ;
      P08VF4_A719PrdNum = new String[] {""} ;
      P08VF4_A396EmprCod = new String[] {""} ;
      P08VF5_A5887PrdReach = new String[] {""} ;
      P08VF5_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VF5_A9741PrdHS = new String[] {""} ;
      P08VF5_A13302PrdTHELIST = new String[] {""} ;
      P08VF5_n13302PrdTHELIST = new boolean[] {false} ;
      P08VF5_A11364PrdHm = new String[] {""} ;
      P08VF5_A11363PrdGots = new String[] {""} ;
      P08VF5_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VF5_A718PrdNom = new String[] {""} ;
      P08VF5_A11687PrdList = new String[] {""} ;
      P08VF5_A13301PrdZDHC = new String[] {""} ;
      P08VF5_A5888PrdOkotex = new String[] {""} ;
      P08VF5_A719PrdNum = new String[] {""} ;
      P08VF5_A396EmprCod = new String[] {""} ;
      P08VF6_A11364PrdHm = new String[] {""} ;
      P08VF6_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VF6_A9741PrdHS = new String[] {""} ;
      P08VF6_A13302PrdTHELIST = new String[] {""} ;
      P08VF6_n13302PrdTHELIST = new boolean[] {false} ;
      P08VF6_A5887PrdReach = new String[] {""} ;
      P08VF6_A11363PrdGots = new String[] {""} ;
      P08VF6_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VF6_A718PrdNom = new String[] {""} ;
      P08VF6_A11687PrdList = new String[] {""} ;
      P08VF6_A13301PrdZDHC = new String[] {""} ;
      P08VF6_A5888PrdOkotex = new String[] {""} ;
      P08VF6_A719PrdNum = new String[] {""} ;
      P08VF6_A396EmprCod = new String[] {""} ;
      P08VF7_A13302PrdTHELIST = new String[] {""} ;
      P08VF7_n13302PrdTHELIST = new boolean[] {false} ;
      P08VF7_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VF7_A9741PrdHS = new String[] {""} ;
      P08VF7_A11364PrdHm = new String[] {""} ;
      P08VF7_A5887PrdReach = new String[] {""} ;
      P08VF7_A11363PrdGots = new String[] {""} ;
      P08VF7_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VF7_A718PrdNom = new String[] {""} ;
      P08VF7_A11687PrdList = new String[] {""} ;
      P08VF7_A13301PrdZDHC = new String[] {""} ;
      P08VF7_A5888PrdOkotex = new String[] {""} ;
      P08VF7_A719PrdNum = new String[] {""} ;
      P08VF7_A396EmprCod = new String[] {""} ;
      AV21OptionDesc = "" ;
      P08VF8_A9741PrdHS = new String[] {""} ;
      P08VF8_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VF8_A13302PrdTHELIST = new String[] {""} ;
      P08VF8_n13302PrdTHELIST = new boolean[] {false} ;
      P08VF8_A11364PrdHm = new String[] {""} ;
      P08VF8_A5887PrdReach = new String[] {""} ;
      P08VF8_A11363PrdGots = new String[] {""} ;
      P08VF8_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VF8_A718PrdNom = new String[] {""} ;
      P08VF8_A11687PrdList = new String[] {""} ;
      P08VF8_A13301PrdZDHC = new String[] {""} ;
      P08VF8_A5888PrdOkotex = new String[] {""} ;
      P08VF8_A719PrdNum = new String[] {""} ;
      P08VF8_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.producwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08VF2_A718PrdNom, P08VF2_A9742PrdFHS, P08VF2_A9741PrdHS, P08VF2_A13302PrdTHELIST, P08VF2_n13302PrdTHELIST, P08VF2_A11364PrdHm, P08VF2_A5887PrdReach, P08VF2_A11363PrdGots, P08VF2_A9733PrdAox, P08VF2_A11687PrdList,
            P08VF2_A13301PrdZDHC, P08VF2_A5888PrdOkotex, P08VF2_A719PrdNum, P08VF2_A396EmprCod
            }
            , new Object[] {
            P08VF3_A9742PrdFHS, P08VF3_A9741PrdHS, P08VF3_A13302PrdTHELIST, P08VF3_n13302PrdTHELIST, P08VF3_A11364PrdHm, P08VF3_A5887PrdReach, P08VF3_A11363PrdGots, P08VF3_A9733PrdAox, P08VF3_A718PrdNom, P08VF3_A11687PrdList,
            P08VF3_A13301PrdZDHC, P08VF3_A5888PrdOkotex, P08VF3_A719PrdNum, P08VF3_A396EmprCod
            }
            , new Object[] {
            P08VF4_A11363PrdGots, P08VF4_A9742PrdFHS, P08VF4_A9741PrdHS, P08VF4_A13302PrdTHELIST, P08VF4_n13302PrdTHELIST, P08VF4_A11364PrdHm, P08VF4_A5887PrdReach, P08VF4_A9733PrdAox, P08VF4_A718PrdNom, P08VF4_A11687PrdList,
            P08VF4_A13301PrdZDHC, P08VF4_A5888PrdOkotex, P08VF4_A719PrdNum, P08VF4_A396EmprCod
            }
            , new Object[] {
            P08VF5_A5887PrdReach, P08VF5_A9742PrdFHS, P08VF5_A9741PrdHS, P08VF5_A13302PrdTHELIST, P08VF5_n13302PrdTHELIST, P08VF5_A11364PrdHm, P08VF5_A11363PrdGots, P08VF5_A9733PrdAox, P08VF5_A718PrdNom, P08VF5_A11687PrdList,
            P08VF5_A13301PrdZDHC, P08VF5_A5888PrdOkotex, P08VF5_A719PrdNum, P08VF5_A396EmprCod
            }
            , new Object[] {
            P08VF6_A11364PrdHm, P08VF6_A9742PrdFHS, P08VF6_A9741PrdHS, P08VF6_A13302PrdTHELIST, P08VF6_n13302PrdTHELIST, P08VF6_A5887PrdReach, P08VF6_A11363PrdGots, P08VF6_A9733PrdAox, P08VF6_A718PrdNom, P08VF6_A11687PrdList,
            P08VF6_A13301PrdZDHC, P08VF6_A5888PrdOkotex, P08VF6_A719PrdNum, P08VF6_A396EmprCod
            }
            , new Object[] {
            P08VF7_A13302PrdTHELIST, P08VF7_n13302PrdTHELIST, P08VF7_A9742PrdFHS, P08VF7_A9741PrdHS, P08VF7_A11364PrdHm, P08VF7_A5887PrdReach, P08VF7_A11363PrdGots, P08VF7_A9733PrdAox, P08VF7_A718PrdNom, P08VF7_A11687PrdList,
            P08VF7_A13301PrdZDHC, P08VF7_A5888PrdOkotex, P08VF7_A719PrdNum, P08VF7_A396EmprCod
            }
            , new Object[] {
            P08VF8_A9741PrdHS, P08VF8_A9742PrdFHS, P08VF8_A13302PrdTHELIST, P08VF8_n13302PrdTHELIST, P08VF8_A11364PrdHm, P08VF8_A5887PrdReach, P08VF8_A11363PrdGots, P08VF8_A9733PrdAox, P08VF8_A718PrdNom, P08VF8_A11687PrdList,
            P08VF8_A13301PrdZDHC, P08VF8_A5888PrdOkotex, P08VF8_A719PrdNum, P08VF8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV53TFPrdEsCompuesto_Sel ;
   private byte AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel ;
   private short Gx_err ;
   private int AV56GXV1 ;
   private int AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size ;
   private int AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ;
   private int AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size ;
   private long AV26count ;
   private java.math.BigDecimal AV33TFPrdAox ;
   private java.math.BigDecimal AV34TFPrdAox_To ;
   private java.math.BigDecimal AV63Stocksquimicos_producwwds_6_tfprdaox ;
   private java.math.BigDecimal AV64Stocksquimicos_producwwds_7_tfprdaox_to ;
   private java.math.BigDecimal A9733PrdAox ;
   private String AV10TFPrdNom ;
   private String AV11TFPrdNom_Sel ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV35TFPrdGots ;
   private String AV36TFPrdGots_Sel ;
   private String AV37TFPrdReach ;
   private String AV38TFPrdReach_Sel ;
   private String AV41TFPrdHm ;
   private String AV42TFPrdHm_Sel ;
   private String AV47TFPrdTHELIST ;
   private String AV48TFPrdTHELIST_Sel ;
   private String AV49TFPrdHS ;
   private String AV50TFPrdHS_Sel ;
   private String A718PrdNom ;
   private String AV59Stocksquimicos_producwwds_2_tfprdnom ;
   private String AV60Stocksquimicos_producwwds_3_tfprdnom_sel ;
   private String AV61Stocksquimicos_producwwds_4_tfprdnum ;
   private String AV62Stocksquimicos_producwwds_5_tfprdnum_sel ;
   private String AV65Stocksquimicos_producwwds_8_tfprdgots ;
   private String AV66Stocksquimicos_producwwds_9_tfprdgots_sel ;
   private String AV67Stocksquimicos_producwwds_10_tfprdreach ;
   private String AV68Stocksquimicos_producwwds_11_tfprdreach_sel ;
   private String AV70Stocksquimicos_producwwds_13_tfprdhm ;
   private String AV71Stocksquimicos_producwwds_14_tfprdhm_sel ;
   private String AV74Stocksquimicos_producwwds_17_tfprdthelist ;
   private String AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ;
   private String AV76Stocksquimicos_producwwds_19_tfprdhs ;
   private String AV77Stocksquimicos_producwwds_20_tfprdhs_sel ;
   private String scmdbuf ;
   private String lV59Stocksquimicos_producwwds_2_tfprdnom ;
   private String lV61Stocksquimicos_producwwds_4_tfprdnum ;
   private String lV65Stocksquimicos_producwwds_8_tfprdgots ;
   private String lV67Stocksquimicos_producwwds_10_tfprdreach ;
   private String lV70Stocksquimicos_producwwds_13_tfprdhm ;
   private String lV74Stocksquimicos_producwwds_17_tfprdthelist ;
   private String lV76Stocksquimicos_producwwds_19_tfprdhs ;
   private String A5888PrdOkotex ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A719PrdNum ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A11364PrdHm ;
   private String A13302PrdTHELIST ;
   private String A9741PrdHS ;
   private String A396EmprCod ;
   private java.util.Date AV51TFPrdFHS ;
   private java.util.Date AV78Stocksquimicos_producwwds_21_tfprdfhs ;
   private java.util.Date A9742PrdFHS ;
   private boolean returnInSub ;
   private boolean brk8VF2 ;
   private boolean n13302PrdTHELIST ;
   private boolean A13881PrdEsCompu ;
   private boolean brk8VF4 ;
   private boolean brk8VF6 ;
   private boolean brk8VF8 ;
   private boolean brk8VF10 ;
   private boolean brk8VF12 ;
   private boolean brk8VF14 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV39TFPrdOkotex_SelsJson ;
   private String AV43TFPrdZDHC_SelsJson ;
   private String AV45TFPrdList_SelsJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV58Stocksquimicos_producwwds_1_filterfulltext ;
   private String lV58Stocksquimicos_producwwds_1_filterfulltext ;
   private String AV18Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08VF2_A718PrdNom ;
   private java.util.Date[] P08VF2_A9742PrdFHS ;
   private String[] P08VF2_A9741PrdHS ;
   private String[] P08VF2_A13302PrdTHELIST ;
   private boolean[] P08VF2_n13302PrdTHELIST ;
   private String[] P08VF2_A11364PrdHm ;
   private String[] P08VF2_A5887PrdReach ;
   private String[] P08VF2_A11363PrdGots ;
   private java.math.BigDecimal[] P08VF2_A9733PrdAox ;
   private String[] P08VF2_A11687PrdList ;
   private String[] P08VF2_A13301PrdZDHC ;
   private String[] P08VF2_A5888PrdOkotex ;
   private String[] P08VF2_A719PrdNum ;
   private String[] P08VF2_A396EmprCod ;
   private java.util.Date[] P08VF3_A9742PrdFHS ;
   private String[] P08VF3_A9741PrdHS ;
   private String[] P08VF3_A13302PrdTHELIST ;
   private boolean[] P08VF3_n13302PrdTHELIST ;
   private String[] P08VF3_A11364PrdHm ;
   private String[] P08VF3_A5887PrdReach ;
   private String[] P08VF3_A11363PrdGots ;
   private java.math.BigDecimal[] P08VF3_A9733PrdAox ;
   private String[] P08VF3_A718PrdNom ;
   private String[] P08VF3_A11687PrdList ;
   private String[] P08VF3_A13301PrdZDHC ;
   private String[] P08VF3_A5888PrdOkotex ;
   private String[] P08VF3_A719PrdNum ;
   private String[] P08VF3_A396EmprCod ;
   private String[] P08VF4_A11363PrdGots ;
   private java.util.Date[] P08VF4_A9742PrdFHS ;
   private String[] P08VF4_A9741PrdHS ;
   private String[] P08VF4_A13302PrdTHELIST ;
   private boolean[] P08VF4_n13302PrdTHELIST ;
   private String[] P08VF4_A11364PrdHm ;
   private String[] P08VF4_A5887PrdReach ;
   private java.math.BigDecimal[] P08VF4_A9733PrdAox ;
   private String[] P08VF4_A718PrdNom ;
   private String[] P08VF4_A11687PrdList ;
   private String[] P08VF4_A13301PrdZDHC ;
   private String[] P08VF4_A5888PrdOkotex ;
   private String[] P08VF4_A719PrdNum ;
   private String[] P08VF4_A396EmprCod ;
   private String[] P08VF5_A5887PrdReach ;
   private java.util.Date[] P08VF5_A9742PrdFHS ;
   private String[] P08VF5_A9741PrdHS ;
   private String[] P08VF5_A13302PrdTHELIST ;
   private boolean[] P08VF5_n13302PrdTHELIST ;
   private String[] P08VF5_A11364PrdHm ;
   private String[] P08VF5_A11363PrdGots ;
   private java.math.BigDecimal[] P08VF5_A9733PrdAox ;
   private String[] P08VF5_A718PrdNom ;
   private String[] P08VF5_A11687PrdList ;
   private String[] P08VF5_A13301PrdZDHC ;
   private String[] P08VF5_A5888PrdOkotex ;
   private String[] P08VF5_A719PrdNum ;
   private String[] P08VF5_A396EmprCod ;
   private String[] P08VF6_A11364PrdHm ;
   private java.util.Date[] P08VF6_A9742PrdFHS ;
   private String[] P08VF6_A9741PrdHS ;
   private String[] P08VF6_A13302PrdTHELIST ;
   private boolean[] P08VF6_n13302PrdTHELIST ;
   private String[] P08VF6_A5887PrdReach ;
   private String[] P08VF6_A11363PrdGots ;
   private java.math.BigDecimal[] P08VF6_A9733PrdAox ;
   private String[] P08VF6_A718PrdNom ;
   private String[] P08VF6_A11687PrdList ;
   private String[] P08VF6_A13301PrdZDHC ;
   private String[] P08VF6_A5888PrdOkotex ;
   private String[] P08VF6_A719PrdNum ;
   private String[] P08VF6_A396EmprCod ;
   private String[] P08VF7_A13302PrdTHELIST ;
   private boolean[] P08VF7_n13302PrdTHELIST ;
   private java.util.Date[] P08VF7_A9742PrdFHS ;
   private String[] P08VF7_A9741PrdHS ;
   private String[] P08VF7_A11364PrdHm ;
   private String[] P08VF7_A5887PrdReach ;
   private String[] P08VF7_A11363PrdGots ;
   private java.math.BigDecimal[] P08VF7_A9733PrdAox ;
   private String[] P08VF7_A718PrdNom ;
   private String[] P08VF7_A11687PrdList ;
   private String[] P08VF7_A13301PrdZDHC ;
   private String[] P08VF7_A5888PrdOkotex ;
   private String[] P08VF7_A719PrdNum ;
   private String[] P08VF7_A396EmprCod ;
   private String[] P08VF8_A9741PrdHS ;
   private java.util.Date[] P08VF8_A9742PrdFHS ;
   private String[] P08VF8_A13302PrdTHELIST ;
   private boolean[] P08VF8_n13302PrdTHELIST ;
   private String[] P08VF8_A11364PrdHm ;
   private String[] P08VF8_A5887PrdReach ;
   private String[] P08VF8_A11363PrdGots ;
   private java.math.BigDecimal[] P08VF8_A9733PrdAox ;
   private String[] P08VF8_A718PrdNom ;
   private String[] P08VF8_A11687PrdList ;
   private String[] P08VF8_A13301PrdZDHC ;
   private String[] P08VF8_A5888PrdOkotex ;
   private String[] P08VF8_A719PrdNum ;
   private String[] P08VF8_A396EmprCod ;
   private GXSimpleCollection<String> AV40TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV44TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV46TFPrdList_Sels ;
   private GXSimpleCollection<String> AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV73Stocksquimicos_producwwds_16_tfprdlist_sels ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class producwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String AV58Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdNom, PrdFHS, PrdHS, PrdTHELIST, PrdHm, PrdReach, PrdGots, PrdAox, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV76Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08VF3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String AV58Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[17];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT PrdFHS, PrdHS, PrdTHELIST, PrdHm, PrdReach, PrdGots, PrdAox, PrdNom, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV76Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdNum" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P08VF4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String AV58Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT PrdGots, PrdFHS, PrdHS, PrdTHELIST, PrdHm, PrdReach, PrdAox, PrdNom, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV76Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdGots" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08VF5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String AV58Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[17];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT PrdReach, PrdFHS, PrdHS, PrdTHELIST, PrdHm, PrdGots, PrdAox, PrdNom, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV76Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdReach" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P08VF6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String AV58Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[17];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT PrdHm, PrdFHS, PrdHS, PrdTHELIST, PrdReach, PrdGots, PrdAox, PrdNom, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV76Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdHm" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08VF7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String AV58Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[17];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT PrdTHELIST, PrdFHS, PrdHS, PrdHm, PrdReach, PrdGots, PrdAox, PrdNom, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV76Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdTHELIST" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P08VF8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV69Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV73Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV60Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV59Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV62Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV61Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV63Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV64Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV66Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV65Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV68Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV67Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV71Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV70Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV75Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV74Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV77Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV76Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV78Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String AV58Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[17];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT PrdHS, PrdFHS, PrdTHELIST, PrdHm, PrdReach, PrdGots, PrdAox, PrdNom, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV61Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV67Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( AV69Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV72Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV73Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV76Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV79Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdHS" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P08VF2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] );
            case 1 :
                  return conditional_P08VF3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] );
            case 2 :
                  return conditional_P08VF4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] );
            case 3 :
                  return conditional_P08VF5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] );
            case 4 :
                  return conditional_P08VF6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] );
            case 5 :
                  return conditional_P08VF7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] );
            case 6 :
                  return conditional_P08VF8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08VF3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08VF4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08VF5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08VF6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08VF7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08VF8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
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
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
      }
   }

}

