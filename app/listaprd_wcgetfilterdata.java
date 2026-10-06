package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listaprd_wcgetfilterdata extends GXProcedure
{
   public listaprd_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listaprd_wcgetfilterdata.class ), "" );
   }

   public listaprd_wcgetfilterdata( int remoteHandle ,
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
      listaprd_wcgetfilterdata.this.aP5 = new String[] {""};
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
      listaprd_wcgetfilterdata.this.AV20DDOName = aP0;
      listaprd_wcgetfilterdata.this.AV18SearchTxt = aP1;
      listaprd_wcgetfilterdata.this.AV19SearchTxtTo = aP2;
      listaprd_wcgetfilterdata.this.aP3 = aP3;
      listaprd_wcgetfilterdata.this.aP4 = aP4;
      listaprd_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV31Session.getValue("ListaPrd_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListaPrd_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("ListaPrd_WCGridState"), null, null);
      }
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV44GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV14TFPrvNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPrvNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV16TFPrvNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV17TFPrvNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV18SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV46Listaprd_wcds_1_filterfulltext = AV36FilterFullText ;
      AV47Listaprd_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV48Listaprd_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV49Listaprd_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV50Listaprd_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV51Listaprd_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV52Listaprd_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV53Listaprd_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV54Listaprd_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Listaprd_wcds_3_tfprdnum_sel ,
                                           AV47Listaprd_wcds_2_tfprdnum ,
                                           AV50Listaprd_wcds_5_tfprdnom_sel ,
                                           AV49Listaprd_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV51Listaprd_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV52Listaprd_wcds_7_tfprvnum_to) ,
                                           AV54Listaprd_wcds_9_tfprvnom_sel ,
                                           AV53Listaprd_wcds_8_tfprvnom ,
                                           AV37EmprCod ,
                                           AV38PrdNumFrom ,
                                           AV39PrdNumTo ,
                                           Integer.valueOf(AV40PrvNumFrom) ,
                                           Integer.valueOf(AV41PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A396EmprCod ,
                                           AV46Listaprd_wcds_1_filterfulltext ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A728PrdRefPrv ,
                                           A685PrdCanRes ,
                                           Byte.valueOf(A4338PrdUMeFo) ,
                                           A737PrdUcpDsc ,
                                           A736PrdUcoDsc ,
                                           A707PrdFacCon ,
                                           A857ValDsc ,
                                           A4693PrdNum2 ,
                                           A724PrdPreAct ,
                                           A9739PrdFT ,
                                           A9741PrdHS ,
                                           A5887PrdReach ,
                                           A5888PrdOkotex ,
                                           A11363PrdGots ,
                                           A11364PrdHm ,
                                           Short.valueOf(A1644PrdDqo) ,
                                           A9733PrdAox ,
                                           A10119PrdColIdx ,
                                           Short.valueOf(A6301TipPrdCod) ,
                                           A6302TipPrdDsc ,
                                           A11196PrdNroCAS ,
                                           A10935PrdRTM ,
                                           A10936PrdCtw1 ,
                                           A10937PrdCtw2 ,
                                           A10938PrdCtw3 ,
                                           A11663PrdCtw4 ,
                                           A11687PrdList ,
                                           A11614PrdEINECS ,
                                           A11615PrdFuncion ,
                                           A11616PrdNmQu ,
                                           A5416PrdDensS ,
                                           Byte.valueOf(A3273PrdTnq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE
                                           }
      });
      lV47Listaprd_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV47Listaprd_wcds_2_tfprdnum), 6, "%") ;
      lV49Listaprd_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV49Listaprd_wcds_4_tfprdnom), 26, "%") ;
      lV53Listaprd_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV53Listaprd_wcds_8_tfprvnom), 30, "%") ;
      /* Using cursor P09FC2 */
      pr_default.execute(0, new Object[] {lV47Listaprd_wcds_2_tfprdnum, AV48Listaprd_wcds_3_tfprdnum_sel, lV49Listaprd_wcds_4_tfprdnom, AV50Listaprd_wcds_5_tfprdnom_sel, Integer.valueOf(AV51Listaprd_wcds_6_tfprvnum), Integer.valueOf(AV52Listaprd_wcds_7_tfprvnum_to), lV53Listaprd_wcds_8_tfprvnom, AV54Listaprd_wcds_9_tfprvnom_sel, AV37EmprCod, AV38PrdNumFrom, AV39PrdNumTo, Integer.valueOf(AV40PrvNumFrom), Integer.valueOf(AV41PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9FC2 = false ;
         A742PrdUniCom = P09FC2_A742PrdUniCom[0] ;
         A743PrdUniCon = P09FC2_A743PrdUniCon[0] ;
         A856ValCod = P09FC2_A856ValCod[0] ;
         A719PrdNum = P09FC2_A719PrdNum[0] ;
         A396EmprCod = P09FC2_A396EmprCod[0] ;
         A3273PrdTnq = P09FC2_A3273PrdTnq[0] ;
         A5416PrdDensS = P09FC2_A5416PrdDensS[0] ;
         A11616PrdNmQu = P09FC2_A11616PrdNmQu[0] ;
         A11615PrdFuncion = P09FC2_A11615PrdFuncion[0] ;
         A11614PrdEINECS = P09FC2_A11614PrdEINECS[0] ;
         A11663PrdCtw4 = P09FC2_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = P09FC2_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = P09FC2_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = P09FC2_A10936PrdCtw1[0] ;
         A10935PrdRTM = P09FC2_A10935PrdRTM[0] ;
         A11196PrdNroCAS = P09FC2_A11196PrdNroCAS[0] ;
         A6302TipPrdDsc = P09FC2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FC2_n6302TipPrdDsc[0] ;
         A6301TipPrdCod = P09FC2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09FC2_n6301TipPrdCod[0] ;
         A10119PrdColIdx = P09FC2_A10119PrdColIdx[0] ;
         A9733PrdAox = P09FC2_A9733PrdAox[0] ;
         A1644PrdDqo = P09FC2_A1644PrdDqo[0] ;
         A11364PrdHm = P09FC2_A11364PrdHm[0] ;
         A11363PrdGots = P09FC2_A11363PrdGots[0] ;
         A5887PrdReach = P09FC2_A5887PrdReach[0] ;
         A9741PrdHS = P09FC2_A9741PrdHS[0] ;
         A9739PrdFT = P09FC2_A9739PrdFT[0] ;
         A724PrdPreAct = P09FC2_A724PrdPreAct[0] ;
         A4693PrdNum2 = P09FC2_A4693PrdNum2[0] ;
         A857ValDsc = P09FC2_A857ValDsc[0] ;
         n857ValDsc = P09FC2_n857ValDsc[0] ;
         A707PrdFacCon = P09FC2_A707PrdFacCon[0] ;
         A736PrdUcoDsc = P09FC2_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FC2_n736PrdUcoDsc[0] ;
         A737PrdUcpDsc = P09FC2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FC2_n737PrdUcpDsc[0] ;
         A4338PrdUMeFo = P09FC2_A4338PrdUMeFo[0] ;
         A685PrdCanRes = P09FC2_A685PrdCanRes[0] ;
         A728PrdRefPrv = P09FC2_A728PrdRefPrv[0] ;
         A705PrdExiCC = P09FC2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09FC2_A704PrdExiAlm[0] ;
         A794PrvNom = P09FC2_A794PrvNom[0] ;
         n794PrvNom = P09FC2_n794PrvNom[0] ;
         A795PrvNum = P09FC2_A795PrvNum[0] ;
         A718PrdNom = P09FC2_A718PrdNom[0] ;
         A11687PrdList = P09FC2_A11687PrdList[0] ;
         A5888PrdOkotex = P09FC2_A5888PrdOkotex[0] ;
         A737PrdUcpDsc = P09FC2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FC2_n737PrdUcpDsc[0] ;
         A736PrdUcoDsc = P09FC2_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FC2_n736PrdUcoDsc[0] ;
         A857ValDsc = P09FC2_A857ValDsc[0] ;
         n857ValDsc = P09FC2_n857ValDsc[0] ;
         A6302TipPrdDsc = P09FC2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FC2_n6302TipPrdDsc[0] ;
         A794PrvNom = P09FC2_A794PrvNom[0] ;
         n794PrvNom = P09FC2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV46Listaprd_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A705PrdExiCC, 12, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4338PrdUMeFo, 1, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A736PrdUcoDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A707PrdFacCon, 7, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9739PrdFT) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1644PrdDqo, 4, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10119PrdColIdx) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6301TipPrdCod, 4, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11196PrdNroCAS) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10935PrdRTM) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10936PrdCtw1) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10937PrdCtw2) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10938PrdCtw3) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11663PrdCtw4) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11616PrdNmQu) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5416PrdDensS, 7, 3) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3273PrdTnq, 2, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV30count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09FC2_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk9FC2 = false ;
               A396EmprCod = P09FC2_A396EmprCod[0] ;
               AV30count = (long)(AV30count+1) ;
               brk9FC2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
            {
               AV22Option = A719PrdNum ;
               AV23Options.add(AV22Option, 0);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV23Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9FC2 )
         {
            brk9FC2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV18SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV46Listaprd_wcds_1_filterfulltext = AV36FilterFullText ;
      AV47Listaprd_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV48Listaprd_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV49Listaprd_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV50Listaprd_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV51Listaprd_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV52Listaprd_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV53Listaprd_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV54Listaprd_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV48Listaprd_wcds_3_tfprdnum_sel ,
                                           AV47Listaprd_wcds_2_tfprdnum ,
                                           AV50Listaprd_wcds_5_tfprdnom_sel ,
                                           AV49Listaprd_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV51Listaprd_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV52Listaprd_wcds_7_tfprvnum_to) ,
                                           AV54Listaprd_wcds_9_tfprvnom_sel ,
                                           AV53Listaprd_wcds_8_tfprvnom ,
                                           AV37EmprCod ,
                                           AV38PrdNumFrom ,
                                           AV39PrdNumTo ,
                                           Integer.valueOf(AV40PrvNumFrom) ,
                                           Integer.valueOf(AV41PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A396EmprCod ,
                                           AV46Listaprd_wcds_1_filterfulltext ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A728PrdRefPrv ,
                                           A685PrdCanRes ,
                                           Byte.valueOf(A4338PrdUMeFo) ,
                                           A737PrdUcpDsc ,
                                           A736PrdUcoDsc ,
                                           A707PrdFacCon ,
                                           A857ValDsc ,
                                           A4693PrdNum2 ,
                                           A724PrdPreAct ,
                                           A9739PrdFT ,
                                           A9741PrdHS ,
                                           A5887PrdReach ,
                                           A5888PrdOkotex ,
                                           A11363PrdGots ,
                                           A11364PrdHm ,
                                           Short.valueOf(A1644PrdDqo) ,
                                           A9733PrdAox ,
                                           A10119PrdColIdx ,
                                           Short.valueOf(A6301TipPrdCod) ,
                                           A6302TipPrdDsc ,
                                           A11196PrdNroCAS ,
                                           A10935PrdRTM ,
                                           A10936PrdCtw1 ,
                                           A10937PrdCtw2 ,
                                           A10938PrdCtw3 ,
                                           A11663PrdCtw4 ,
                                           A11687PrdList ,
                                           A11614PrdEINECS ,
                                           A11615PrdFuncion ,
                                           A11616PrdNmQu ,
                                           A5416PrdDensS ,
                                           Byte.valueOf(A3273PrdTnq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE
                                           }
      });
      lV47Listaprd_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV47Listaprd_wcds_2_tfprdnum), 6, "%") ;
      lV49Listaprd_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV49Listaprd_wcds_4_tfprdnom), 26, "%") ;
      lV53Listaprd_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV53Listaprd_wcds_8_tfprvnom), 30, "%") ;
      /* Using cursor P09FC3 */
      pr_default.execute(1, new Object[] {lV47Listaprd_wcds_2_tfprdnum, AV48Listaprd_wcds_3_tfprdnum_sel, lV49Listaprd_wcds_4_tfprdnom, AV50Listaprd_wcds_5_tfprdnom_sel, Integer.valueOf(AV51Listaprd_wcds_6_tfprvnum), Integer.valueOf(AV52Listaprd_wcds_7_tfprvnum_to), lV53Listaprd_wcds_8_tfprvnom, AV54Listaprd_wcds_9_tfprvnom_sel, AV37EmprCod, AV38PrdNumFrom, AV39PrdNumTo, Integer.valueOf(AV40PrvNumFrom), Integer.valueOf(AV41PrvNumTo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9FC4 = false ;
         A742PrdUniCom = P09FC3_A742PrdUniCom[0] ;
         A743PrdUniCon = P09FC3_A743PrdUniCon[0] ;
         A856ValCod = P09FC3_A856ValCod[0] ;
         A718PrdNom = P09FC3_A718PrdNom[0] ;
         A396EmprCod = P09FC3_A396EmprCod[0] ;
         A3273PrdTnq = P09FC3_A3273PrdTnq[0] ;
         A5416PrdDensS = P09FC3_A5416PrdDensS[0] ;
         A11616PrdNmQu = P09FC3_A11616PrdNmQu[0] ;
         A11615PrdFuncion = P09FC3_A11615PrdFuncion[0] ;
         A11614PrdEINECS = P09FC3_A11614PrdEINECS[0] ;
         A11663PrdCtw4 = P09FC3_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = P09FC3_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = P09FC3_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = P09FC3_A10936PrdCtw1[0] ;
         A10935PrdRTM = P09FC3_A10935PrdRTM[0] ;
         A11196PrdNroCAS = P09FC3_A11196PrdNroCAS[0] ;
         A6302TipPrdDsc = P09FC3_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FC3_n6302TipPrdDsc[0] ;
         A6301TipPrdCod = P09FC3_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09FC3_n6301TipPrdCod[0] ;
         A10119PrdColIdx = P09FC3_A10119PrdColIdx[0] ;
         A9733PrdAox = P09FC3_A9733PrdAox[0] ;
         A1644PrdDqo = P09FC3_A1644PrdDqo[0] ;
         A11364PrdHm = P09FC3_A11364PrdHm[0] ;
         A11363PrdGots = P09FC3_A11363PrdGots[0] ;
         A5887PrdReach = P09FC3_A5887PrdReach[0] ;
         A9741PrdHS = P09FC3_A9741PrdHS[0] ;
         A9739PrdFT = P09FC3_A9739PrdFT[0] ;
         A724PrdPreAct = P09FC3_A724PrdPreAct[0] ;
         A4693PrdNum2 = P09FC3_A4693PrdNum2[0] ;
         A857ValDsc = P09FC3_A857ValDsc[0] ;
         n857ValDsc = P09FC3_n857ValDsc[0] ;
         A707PrdFacCon = P09FC3_A707PrdFacCon[0] ;
         A736PrdUcoDsc = P09FC3_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FC3_n736PrdUcoDsc[0] ;
         A737PrdUcpDsc = P09FC3_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FC3_n737PrdUcpDsc[0] ;
         A4338PrdUMeFo = P09FC3_A4338PrdUMeFo[0] ;
         A685PrdCanRes = P09FC3_A685PrdCanRes[0] ;
         A728PrdRefPrv = P09FC3_A728PrdRefPrv[0] ;
         A705PrdExiCC = P09FC3_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09FC3_A704PrdExiAlm[0] ;
         A794PrvNom = P09FC3_A794PrvNom[0] ;
         n794PrvNom = P09FC3_n794PrvNom[0] ;
         A795PrvNum = P09FC3_A795PrvNum[0] ;
         A719PrdNum = P09FC3_A719PrdNum[0] ;
         A11687PrdList = P09FC3_A11687PrdList[0] ;
         A5888PrdOkotex = P09FC3_A5888PrdOkotex[0] ;
         A737PrdUcpDsc = P09FC3_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FC3_n737PrdUcpDsc[0] ;
         A736PrdUcoDsc = P09FC3_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FC3_n736PrdUcoDsc[0] ;
         A857ValDsc = P09FC3_A857ValDsc[0] ;
         n857ValDsc = P09FC3_n857ValDsc[0] ;
         A6302TipPrdDsc = P09FC3_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FC3_n6302TipPrdDsc[0] ;
         A794PrvNom = P09FC3_A794PrvNom[0] ;
         n794PrvNom = P09FC3_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV46Listaprd_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A705PrdExiCC, 12, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4338PrdUMeFo, 1, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A736PrdUcoDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A707PrdFacCon, 7, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9739PrdFT) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1644PrdDqo, 4, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10119PrdColIdx) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6301TipPrdCod, 4, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11196PrdNroCAS) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10935PrdRTM) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10936PrdCtw1) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10937PrdCtw2) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10938PrdCtw3) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11663PrdCtw4) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11616PrdNmQu) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5416PrdDensS, 7, 3) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3273PrdTnq, 2, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV30count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09FC3_A718PrdNom[0], A718PrdNom) == 0 ) )
            {
               brk9FC4 = false ;
               A396EmprCod = P09FC3_A396EmprCod[0] ;
               A719PrdNum = P09FC3_A719PrdNum[0] ;
               AV30count = (long)(AV30count+1) ;
               brk9FC4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
            {
               AV22Option = A718PrdNom ;
               AV23Options.add(AV22Option, 0);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV23Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9FC4 )
         {
            brk9FC4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrvNom = AV18SearchTxt ;
      AV17TFPrvNom_Sel = "" ;
      AV46Listaprd_wcds_1_filterfulltext = AV36FilterFullText ;
      AV47Listaprd_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV48Listaprd_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV49Listaprd_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV50Listaprd_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV51Listaprd_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV52Listaprd_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV53Listaprd_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV54Listaprd_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV48Listaprd_wcds_3_tfprdnum_sel ,
                                           AV47Listaprd_wcds_2_tfprdnum ,
                                           AV50Listaprd_wcds_5_tfprdnom_sel ,
                                           AV49Listaprd_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV51Listaprd_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV52Listaprd_wcds_7_tfprvnum_to) ,
                                           AV54Listaprd_wcds_9_tfprvnom_sel ,
                                           AV53Listaprd_wcds_8_tfprvnom ,
                                           AV37EmprCod ,
                                           AV38PrdNumFrom ,
                                           AV39PrdNumTo ,
                                           Integer.valueOf(AV40PrvNumFrom) ,
                                           Integer.valueOf(AV41PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A396EmprCod ,
                                           AV46Listaprd_wcds_1_filterfulltext ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A728PrdRefPrv ,
                                           A685PrdCanRes ,
                                           Byte.valueOf(A4338PrdUMeFo) ,
                                           A737PrdUcpDsc ,
                                           A736PrdUcoDsc ,
                                           A707PrdFacCon ,
                                           A857ValDsc ,
                                           A4693PrdNum2 ,
                                           A724PrdPreAct ,
                                           A9739PrdFT ,
                                           A9741PrdHS ,
                                           A5887PrdReach ,
                                           A5888PrdOkotex ,
                                           A11363PrdGots ,
                                           A11364PrdHm ,
                                           Short.valueOf(A1644PrdDqo) ,
                                           A9733PrdAox ,
                                           A10119PrdColIdx ,
                                           Short.valueOf(A6301TipPrdCod) ,
                                           A6302TipPrdDsc ,
                                           A11196PrdNroCAS ,
                                           A10935PrdRTM ,
                                           A10936PrdCtw1 ,
                                           A10937PrdCtw2 ,
                                           A10938PrdCtw3 ,
                                           A11663PrdCtw4 ,
                                           A11687PrdList ,
                                           A11614PrdEINECS ,
                                           A11615PrdFuncion ,
                                           A11616PrdNmQu ,
                                           A5416PrdDensS ,
                                           Byte.valueOf(A3273PrdTnq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE
                                           }
      });
      lV47Listaprd_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV47Listaprd_wcds_2_tfprdnum), 6, "%") ;
      lV49Listaprd_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV49Listaprd_wcds_4_tfprdnom), 26, "%") ;
      lV53Listaprd_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV53Listaprd_wcds_8_tfprvnom), 30, "%") ;
      /* Using cursor P09FC4 */
      pr_default.execute(2, new Object[] {lV47Listaprd_wcds_2_tfprdnum, AV48Listaprd_wcds_3_tfprdnum_sel, lV49Listaprd_wcds_4_tfprdnom, AV50Listaprd_wcds_5_tfprdnom_sel, Integer.valueOf(AV51Listaprd_wcds_6_tfprvnum), Integer.valueOf(AV52Listaprd_wcds_7_tfprvnum_to), lV53Listaprd_wcds_8_tfprvnom, AV54Listaprd_wcds_9_tfprvnom_sel, AV37EmprCod, AV38PrdNumFrom, AV39PrdNumTo, Integer.valueOf(AV40PrvNumFrom), Integer.valueOf(AV41PrvNumTo)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9FC6 = false ;
         A742PrdUniCom = P09FC4_A742PrdUniCom[0] ;
         A743PrdUniCon = P09FC4_A743PrdUniCon[0] ;
         A856ValCod = P09FC4_A856ValCod[0] ;
         A795PrvNum = P09FC4_A795PrvNum[0] ;
         A396EmprCod = P09FC4_A396EmprCod[0] ;
         A3273PrdTnq = P09FC4_A3273PrdTnq[0] ;
         A5416PrdDensS = P09FC4_A5416PrdDensS[0] ;
         A11616PrdNmQu = P09FC4_A11616PrdNmQu[0] ;
         A11615PrdFuncion = P09FC4_A11615PrdFuncion[0] ;
         A11614PrdEINECS = P09FC4_A11614PrdEINECS[0] ;
         A11663PrdCtw4 = P09FC4_A11663PrdCtw4[0] ;
         A10938PrdCtw3 = P09FC4_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = P09FC4_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = P09FC4_A10936PrdCtw1[0] ;
         A10935PrdRTM = P09FC4_A10935PrdRTM[0] ;
         A11196PrdNroCAS = P09FC4_A11196PrdNroCAS[0] ;
         A6302TipPrdDsc = P09FC4_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FC4_n6302TipPrdDsc[0] ;
         A6301TipPrdCod = P09FC4_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09FC4_n6301TipPrdCod[0] ;
         A10119PrdColIdx = P09FC4_A10119PrdColIdx[0] ;
         A9733PrdAox = P09FC4_A9733PrdAox[0] ;
         A1644PrdDqo = P09FC4_A1644PrdDqo[0] ;
         A11364PrdHm = P09FC4_A11364PrdHm[0] ;
         A11363PrdGots = P09FC4_A11363PrdGots[0] ;
         A5887PrdReach = P09FC4_A5887PrdReach[0] ;
         A9741PrdHS = P09FC4_A9741PrdHS[0] ;
         A9739PrdFT = P09FC4_A9739PrdFT[0] ;
         A724PrdPreAct = P09FC4_A724PrdPreAct[0] ;
         A4693PrdNum2 = P09FC4_A4693PrdNum2[0] ;
         A857ValDsc = P09FC4_A857ValDsc[0] ;
         n857ValDsc = P09FC4_n857ValDsc[0] ;
         A707PrdFacCon = P09FC4_A707PrdFacCon[0] ;
         A736PrdUcoDsc = P09FC4_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FC4_n736PrdUcoDsc[0] ;
         A737PrdUcpDsc = P09FC4_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FC4_n737PrdUcpDsc[0] ;
         A4338PrdUMeFo = P09FC4_A4338PrdUMeFo[0] ;
         A685PrdCanRes = P09FC4_A685PrdCanRes[0] ;
         A728PrdRefPrv = P09FC4_A728PrdRefPrv[0] ;
         A705PrdExiCC = P09FC4_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09FC4_A704PrdExiAlm[0] ;
         A794PrvNom = P09FC4_A794PrvNom[0] ;
         n794PrvNom = P09FC4_n794PrvNom[0] ;
         A718PrdNom = P09FC4_A718PrdNom[0] ;
         A719PrdNum = P09FC4_A719PrdNum[0] ;
         A11687PrdList = P09FC4_A11687PrdList[0] ;
         A5888PrdOkotex = P09FC4_A5888PrdOkotex[0] ;
         A794PrvNom = P09FC4_A794PrvNom[0] ;
         n794PrvNom = P09FC4_n794PrvNom[0] ;
         A737PrdUcpDsc = P09FC4_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09FC4_n737PrdUcpDsc[0] ;
         A736PrdUcoDsc = P09FC4_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = P09FC4_n736PrdUcoDsc[0] ;
         A857ValDsc = P09FC4_A857ValDsc[0] ;
         n857ValDsc = P09FC4_n857ValDsc[0] ;
         A6302TipPrdDsc = P09FC4_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09FC4_n6302TipPrdDsc[0] ;
         if ( (GXutil.strcmp("", AV46Listaprd_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A705PrdExiCC, 12, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4338PrdUMeFo, 1, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A736PrdUcoDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A707PrdFacCon, 7, 4) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9739PrdFT) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1644PrdDqo, 4, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10119PrdColIdx) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6301TipPrdCod, 4, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11196PrdNroCAS) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10935PrdRTM) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10936PrdCtw1) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10937PrdCtw2) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10938PrdCtw3) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11663PrdCtw4) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11616PrdNmQu) , GXutil.padr( "%" + GXutil.upper( AV46Listaprd_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5416PrdDensS, 7, 3) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3273PrdTnq, 2, 0) , GXutil.padr( "%" + AV46Listaprd_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV30count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09FC4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09FC4_A795PrvNum[0] == A795PrvNum ) )
            {
               brk9FC6 = false ;
               A719PrdNum = P09FC4_A719PrdNum[0] ;
               AV30count = (long)(AV30count+1) ;
               brk9FC6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
            {
               AV22Option = A794PrvNom ;
               AV21InsertIndex = 1 ;
               while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
               {
                  AV21InsertIndex = (int)(AV21InsertIndex+1) ;
               }
               AV23Options.add(AV22Option, AV21InsertIndex);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
            }
            if ( AV23Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9FC6 )
         {
            brk9FC6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = listaprd_wcgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = listaprd_wcgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = listaprd_wcgetfilterdata.this.AV29OptionIndexesJson;
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
      AV36FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV16TFPrvNom = "" ;
      AV17TFPrvNom_Sel = "" ;
      A719PrdNum = "" ;
      AV46Listaprd_wcds_1_filterfulltext = "" ;
      AV47Listaprd_wcds_2_tfprdnum = "" ;
      AV48Listaprd_wcds_3_tfprdnum_sel = "" ;
      AV49Listaprd_wcds_4_tfprdnom = "" ;
      AV50Listaprd_wcds_5_tfprdnom_sel = "" ;
      AV53Listaprd_wcds_8_tfprvnom = "" ;
      AV54Listaprd_wcds_9_tfprvnom_sel = "" ;
      lV46Listaprd_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV47Listaprd_wcds_2_tfprdnum = "" ;
      lV49Listaprd_wcds_4_tfprdnom = "" ;
      lV53Listaprd_wcds_8_tfprvnom = "" ;
      AV37EmprCod = "" ;
      AV38PrdNumFrom = "" ;
      AV39PrdNumTo = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A396EmprCod = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A728PrdRefPrv = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A737PrdUcpDsc = "" ;
      A736PrdUcoDsc = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A4693PrdNum2 = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A9739PrdFT = "" ;
      A9741PrdHS = "" ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11363PrdGots = "" ;
      A11364PrdHm = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A10119PrdColIdx = "" ;
      A6302TipPrdDsc = "" ;
      A11196PrdNroCAS = "" ;
      A10935PrdRTM = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      A11687PrdList = "" ;
      A11614PrdEINECS = "" ;
      A11615PrdFuncion = "" ;
      A11616PrdNmQu = "" ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      P09FC2_A742PrdUniCom = new byte[1] ;
      P09FC2_A743PrdUniCon = new byte[1] ;
      P09FC2_A856ValCod = new byte[1] ;
      P09FC2_A719PrdNum = new String[] {""} ;
      P09FC2_A396EmprCod = new String[] {""} ;
      P09FC2_A3273PrdTnq = new byte[1] ;
      P09FC2_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC2_A11616PrdNmQu = new String[] {""} ;
      P09FC2_A11615PrdFuncion = new String[] {""} ;
      P09FC2_A11614PrdEINECS = new String[] {""} ;
      P09FC2_A11663PrdCtw4 = new String[] {""} ;
      P09FC2_A10938PrdCtw3 = new String[] {""} ;
      P09FC2_A10937PrdCtw2 = new String[] {""} ;
      P09FC2_A10936PrdCtw1 = new String[] {""} ;
      P09FC2_A10935PrdRTM = new String[] {""} ;
      P09FC2_A11196PrdNroCAS = new String[] {""} ;
      P09FC2_A6302TipPrdDsc = new String[] {""} ;
      P09FC2_n6302TipPrdDsc = new boolean[] {false} ;
      P09FC2_A6301TipPrdCod = new short[1] ;
      P09FC2_n6301TipPrdCod = new boolean[] {false} ;
      P09FC2_A10119PrdColIdx = new String[] {""} ;
      P09FC2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC2_A1644PrdDqo = new short[1] ;
      P09FC2_A11364PrdHm = new String[] {""} ;
      P09FC2_A11363PrdGots = new String[] {""} ;
      P09FC2_A5887PrdReach = new String[] {""} ;
      P09FC2_A9741PrdHS = new String[] {""} ;
      P09FC2_A9739PrdFT = new String[] {""} ;
      P09FC2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC2_A4693PrdNum2 = new String[] {""} ;
      P09FC2_A857ValDsc = new String[] {""} ;
      P09FC2_n857ValDsc = new boolean[] {false} ;
      P09FC2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC2_A736PrdUcoDsc = new String[] {""} ;
      P09FC2_n736PrdUcoDsc = new boolean[] {false} ;
      P09FC2_A737PrdUcpDsc = new String[] {""} ;
      P09FC2_n737PrdUcpDsc = new boolean[] {false} ;
      P09FC2_A4338PrdUMeFo = new byte[1] ;
      P09FC2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC2_A728PrdRefPrv = new String[] {""} ;
      P09FC2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC2_A794PrvNom = new String[] {""} ;
      P09FC2_n794PrvNom = new boolean[] {false} ;
      P09FC2_A795PrvNum = new int[1] ;
      P09FC2_A718PrdNom = new String[] {""} ;
      P09FC2_A11687PrdList = new String[] {""} ;
      P09FC2_A5888PrdOkotex = new String[] {""} ;
      AV22Option = "" ;
      P09FC3_A742PrdUniCom = new byte[1] ;
      P09FC3_A743PrdUniCon = new byte[1] ;
      P09FC3_A856ValCod = new byte[1] ;
      P09FC3_A718PrdNom = new String[] {""} ;
      P09FC3_A396EmprCod = new String[] {""} ;
      P09FC3_A3273PrdTnq = new byte[1] ;
      P09FC3_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC3_A11616PrdNmQu = new String[] {""} ;
      P09FC3_A11615PrdFuncion = new String[] {""} ;
      P09FC3_A11614PrdEINECS = new String[] {""} ;
      P09FC3_A11663PrdCtw4 = new String[] {""} ;
      P09FC3_A10938PrdCtw3 = new String[] {""} ;
      P09FC3_A10937PrdCtw2 = new String[] {""} ;
      P09FC3_A10936PrdCtw1 = new String[] {""} ;
      P09FC3_A10935PrdRTM = new String[] {""} ;
      P09FC3_A11196PrdNroCAS = new String[] {""} ;
      P09FC3_A6302TipPrdDsc = new String[] {""} ;
      P09FC3_n6302TipPrdDsc = new boolean[] {false} ;
      P09FC3_A6301TipPrdCod = new short[1] ;
      P09FC3_n6301TipPrdCod = new boolean[] {false} ;
      P09FC3_A10119PrdColIdx = new String[] {""} ;
      P09FC3_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC3_A1644PrdDqo = new short[1] ;
      P09FC3_A11364PrdHm = new String[] {""} ;
      P09FC3_A11363PrdGots = new String[] {""} ;
      P09FC3_A5887PrdReach = new String[] {""} ;
      P09FC3_A9741PrdHS = new String[] {""} ;
      P09FC3_A9739PrdFT = new String[] {""} ;
      P09FC3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC3_A4693PrdNum2 = new String[] {""} ;
      P09FC3_A857ValDsc = new String[] {""} ;
      P09FC3_n857ValDsc = new boolean[] {false} ;
      P09FC3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC3_A736PrdUcoDsc = new String[] {""} ;
      P09FC3_n736PrdUcoDsc = new boolean[] {false} ;
      P09FC3_A737PrdUcpDsc = new String[] {""} ;
      P09FC3_n737PrdUcpDsc = new boolean[] {false} ;
      P09FC3_A4338PrdUMeFo = new byte[1] ;
      P09FC3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC3_A728PrdRefPrv = new String[] {""} ;
      P09FC3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC3_A794PrvNom = new String[] {""} ;
      P09FC3_n794PrvNom = new boolean[] {false} ;
      P09FC3_A795PrvNum = new int[1] ;
      P09FC3_A719PrdNum = new String[] {""} ;
      P09FC3_A11687PrdList = new String[] {""} ;
      P09FC3_A5888PrdOkotex = new String[] {""} ;
      P09FC4_A742PrdUniCom = new byte[1] ;
      P09FC4_A743PrdUniCon = new byte[1] ;
      P09FC4_A856ValCod = new byte[1] ;
      P09FC4_A795PrvNum = new int[1] ;
      P09FC4_A396EmprCod = new String[] {""} ;
      P09FC4_A3273PrdTnq = new byte[1] ;
      P09FC4_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC4_A11616PrdNmQu = new String[] {""} ;
      P09FC4_A11615PrdFuncion = new String[] {""} ;
      P09FC4_A11614PrdEINECS = new String[] {""} ;
      P09FC4_A11663PrdCtw4 = new String[] {""} ;
      P09FC4_A10938PrdCtw3 = new String[] {""} ;
      P09FC4_A10937PrdCtw2 = new String[] {""} ;
      P09FC4_A10936PrdCtw1 = new String[] {""} ;
      P09FC4_A10935PrdRTM = new String[] {""} ;
      P09FC4_A11196PrdNroCAS = new String[] {""} ;
      P09FC4_A6302TipPrdDsc = new String[] {""} ;
      P09FC4_n6302TipPrdDsc = new boolean[] {false} ;
      P09FC4_A6301TipPrdCod = new short[1] ;
      P09FC4_n6301TipPrdCod = new boolean[] {false} ;
      P09FC4_A10119PrdColIdx = new String[] {""} ;
      P09FC4_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC4_A1644PrdDqo = new short[1] ;
      P09FC4_A11364PrdHm = new String[] {""} ;
      P09FC4_A11363PrdGots = new String[] {""} ;
      P09FC4_A5887PrdReach = new String[] {""} ;
      P09FC4_A9741PrdHS = new String[] {""} ;
      P09FC4_A9739PrdFT = new String[] {""} ;
      P09FC4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC4_A4693PrdNum2 = new String[] {""} ;
      P09FC4_A857ValDsc = new String[] {""} ;
      P09FC4_n857ValDsc = new boolean[] {false} ;
      P09FC4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC4_A736PrdUcoDsc = new String[] {""} ;
      P09FC4_n736PrdUcoDsc = new boolean[] {false} ;
      P09FC4_A737PrdUcpDsc = new String[] {""} ;
      P09FC4_n737PrdUcpDsc = new boolean[] {false} ;
      P09FC4_A4338PrdUMeFo = new byte[1] ;
      P09FC4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC4_A728PrdRefPrv = new String[] {""} ;
      P09FC4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FC4_A794PrvNom = new String[] {""} ;
      P09FC4_n794PrvNom = new boolean[] {false} ;
      P09FC4_A718PrdNom = new String[] {""} ;
      P09FC4_A719PrdNum = new String[] {""} ;
      P09FC4_A11687PrdList = new String[] {""} ;
      P09FC4_A5888PrdOkotex = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listaprd_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09FC2_A742PrdUniCom, P09FC2_A743PrdUniCon, P09FC2_A856ValCod, P09FC2_A719PrdNum, P09FC2_A396EmprCod, P09FC2_A3273PrdTnq, P09FC2_A5416PrdDensS, P09FC2_A11616PrdNmQu, P09FC2_A11615PrdFuncion, P09FC2_A11614PrdEINECS,
            P09FC2_A11663PrdCtw4, P09FC2_A10938PrdCtw3, P09FC2_A10937PrdCtw2, P09FC2_A10936PrdCtw1, P09FC2_A10935PrdRTM, P09FC2_A11196PrdNroCAS, P09FC2_A6302TipPrdDsc, P09FC2_n6302TipPrdDsc, P09FC2_A6301TipPrdCod, P09FC2_n6301TipPrdCod,
            P09FC2_A10119PrdColIdx, P09FC2_A9733PrdAox, P09FC2_A1644PrdDqo, P09FC2_A11364PrdHm, P09FC2_A11363PrdGots, P09FC2_A5887PrdReach, P09FC2_A9741PrdHS, P09FC2_A9739PrdFT, P09FC2_A724PrdPreAct, P09FC2_A4693PrdNum2,
            P09FC2_A857ValDsc, P09FC2_n857ValDsc, P09FC2_A707PrdFacCon, P09FC2_A736PrdUcoDsc, P09FC2_n736PrdUcoDsc, P09FC2_A737PrdUcpDsc, P09FC2_n737PrdUcpDsc, P09FC2_A4338PrdUMeFo, P09FC2_A685PrdCanRes, P09FC2_A728PrdRefPrv,
            P09FC2_A705PrdExiCC, P09FC2_A704PrdExiAlm, P09FC2_A794PrvNom, P09FC2_n794PrvNom, P09FC2_A795PrvNum, P09FC2_A718PrdNom, P09FC2_A11687PrdList, P09FC2_A5888PrdOkotex
            }
            , new Object[] {
            P09FC3_A742PrdUniCom, P09FC3_A743PrdUniCon, P09FC3_A856ValCod, P09FC3_A718PrdNom, P09FC3_A396EmprCod, P09FC3_A3273PrdTnq, P09FC3_A5416PrdDensS, P09FC3_A11616PrdNmQu, P09FC3_A11615PrdFuncion, P09FC3_A11614PrdEINECS,
            P09FC3_A11663PrdCtw4, P09FC3_A10938PrdCtw3, P09FC3_A10937PrdCtw2, P09FC3_A10936PrdCtw1, P09FC3_A10935PrdRTM, P09FC3_A11196PrdNroCAS, P09FC3_A6302TipPrdDsc, P09FC3_n6302TipPrdDsc, P09FC3_A6301TipPrdCod, P09FC3_n6301TipPrdCod,
            P09FC3_A10119PrdColIdx, P09FC3_A9733PrdAox, P09FC3_A1644PrdDqo, P09FC3_A11364PrdHm, P09FC3_A11363PrdGots, P09FC3_A5887PrdReach, P09FC3_A9741PrdHS, P09FC3_A9739PrdFT, P09FC3_A724PrdPreAct, P09FC3_A4693PrdNum2,
            P09FC3_A857ValDsc, P09FC3_n857ValDsc, P09FC3_A707PrdFacCon, P09FC3_A736PrdUcoDsc, P09FC3_n736PrdUcoDsc, P09FC3_A737PrdUcpDsc, P09FC3_n737PrdUcpDsc, P09FC3_A4338PrdUMeFo, P09FC3_A685PrdCanRes, P09FC3_A728PrdRefPrv,
            P09FC3_A705PrdExiCC, P09FC3_A704PrdExiAlm, P09FC3_A794PrvNom, P09FC3_n794PrvNom, P09FC3_A795PrvNum, P09FC3_A719PrdNum, P09FC3_A11687PrdList, P09FC3_A5888PrdOkotex
            }
            , new Object[] {
            P09FC4_A742PrdUniCom, P09FC4_A743PrdUniCon, P09FC4_A856ValCod, P09FC4_A795PrvNum, P09FC4_A396EmprCod, P09FC4_A3273PrdTnq, P09FC4_A5416PrdDensS, P09FC4_A11616PrdNmQu, P09FC4_A11615PrdFuncion, P09FC4_A11614PrdEINECS,
            P09FC4_A11663PrdCtw4, P09FC4_A10938PrdCtw3, P09FC4_A10937PrdCtw2, P09FC4_A10936PrdCtw1, P09FC4_A10935PrdRTM, P09FC4_A11196PrdNroCAS, P09FC4_A6302TipPrdDsc, P09FC4_n6302TipPrdDsc, P09FC4_A6301TipPrdCod, P09FC4_n6301TipPrdCod,
            P09FC4_A10119PrdColIdx, P09FC4_A9733PrdAox, P09FC4_A1644PrdDqo, P09FC4_A11364PrdHm, P09FC4_A11363PrdGots, P09FC4_A5887PrdReach, P09FC4_A9741PrdHS, P09FC4_A9739PrdFT, P09FC4_A724PrdPreAct, P09FC4_A4693PrdNum2,
            P09FC4_A857ValDsc, P09FC4_n857ValDsc, P09FC4_A707PrdFacCon, P09FC4_A736PrdUcoDsc, P09FC4_n736PrdUcoDsc, P09FC4_A737PrdUcpDsc, P09FC4_n737PrdUcpDsc, P09FC4_A4338PrdUMeFo, P09FC4_A685PrdCanRes, P09FC4_A728PrdRefPrv,
            P09FC4_A705PrdExiCC, P09FC4_A704PrdExiAlm, P09FC4_A794PrvNom, P09FC4_n794PrvNom, P09FC4_A718PrdNom, P09FC4_A719PrdNum, P09FC4_A11687PrdList, P09FC4_A5888PrdOkotex
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4338PrdUMeFo ;
   private byte A3273PrdTnq ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A856ValCod ;
   private short A1644PrdDqo ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int AV44GXV1 ;
   private int AV14TFPrvNum ;
   private int AV15TFPrvNum_To ;
   private int AV51Listaprd_wcds_6_tfprvnum ;
   private int AV52Listaprd_wcds_7_tfprvnum_to ;
   private int AV40PrvNumFrom ;
   private int AV41PrvNumTo ;
   private int A795PrvNum ;
   private int AV21InsertIndex ;
   private long AV30count ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal A5416PrdDensS ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV16TFPrvNom ;
   private String AV17TFPrvNom_Sel ;
   private String A719PrdNum ;
   private String AV47Listaprd_wcds_2_tfprdnum ;
   private String AV48Listaprd_wcds_3_tfprdnum_sel ;
   private String AV49Listaprd_wcds_4_tfprdnom ;
   private String AV50Listaprd_wcds_5_tfprdnom_sel ;
   private String AV53Listaprd_wcds_8_tfprvnom ;
   private String AV54Listaprd_wcds_9_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV47Listaprd_wcds_2_tfprdnum ;
   private String lV49Listaprd_wcds_4_tfprdnom ;
   private String lV53Listaprd_wcds_8_tfprvnom ;
   private String AV37EmprCod ;
   private String AV38PrdNumFrom ;
   private String AV39PrdNumTo ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A396EmprCod ;
   private String A728PrdRefPrv ;
   private String A737PrdUcpDsc ;
   private String A736PrdUcoDsc ;
   private String A857ValDsc ;
   private String A4693PrdNum2 ;
   private String A9739PrdFT ;
   private String A9741PrdHS ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String A11363PrdGots ;
   private String A11364PrdHm ;
   private String A10119PrdColIdx ;
   private String A6302TipPrdDsc ;
   private String A11196PrdNroCAS ;
   private String A10935PrdRTM ;
   private String A10936PrdCtw1 ;
   private String A10937PrdCtw2 ;
   private String A10938PrdCtw3 ;
   private String A11663PrdCtw4 ;
   private String A11687PrdList ;
   private String A11614PrdEINECS ;
   private String A11615PrdFuncion ;
   private boolean returnInSub ;
   private boolean brk9FC2 ;
   private boolean n6302TipPrdDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n857ValDsc ;
   private boolean n736PrdUcoDsc ;
   private boolean n737PrdUcpDsc ;
   private boolean n794PrvNom ;
   private boolean brk9FC4 ;
   private boolean brk9FC6 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV46Listaprd_wcds_1_filterfulltext ;
   private String lV46Listaprd_wcds_1_filterfulltext ;
   private String A11616PrdNmQu ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09FC2_A742PrdUniCom ;
   private byte[] P09FC2_A743PrdUniCon ;
   private byte[] P09FC2_A856ValCod ;
   private String[] P09FC2_A719PrdNum ;
   private String[] P09FC2_A396EmprCod ;
   private byte[] P09FC2_A3273PrdTnq ;
   private java.math.BigDecimal[] P09FC2_A5416PrdDensS ;
   private String[] P09FC2_A11616PrdNmQu ;
   private String[] P09FC2_A11615PrdFuncion ;
   private String[] P09FC2_A11614PrdEINECS ;
   private String[] P09FC2_A11663PrdCtw4 ;
   private String[] P09FC2_A10938PrdCtw3 ;
   private String[] P09FC2_A10937PrdCtw2 ;
   private String[] P09FC2_A10936PrdCtw1 ;
   private String[] P09FC2_A10935PrdRTM ;
   private String[] P09FC2_A11196PrdNroCAS ;
   private String[] P09FC2_A6302TipPrdDsc ;
   private boolean[] P09FC2_n6302TipPrdDsc ;
   private short[] P09FC2_A6301TipPrdCod ;
   private boolean[] P09FC2_n6301TipPrdCod ;
   private String[] P09FC2_A10119PrdColIdx ;
   private java.math.BigDecimal[] P09FC2_A9733PrdAox ;
   private short[] P09FC2_A1644PrdDqo ;
   private String[] P09FC2_A11364PrdHm ;
   private String[] P09FC2_A11363PrdGots ;
   private String[] P09FC2_A5887PrdReach ;
   private String[] P09FC2_A9741PrdHS ;
   private String[] P09FC2_A9739PrdFT ;
   private java.math.BigDecimal[] P09FC2_A724PrdPreAct ;
   private String[] P09FC2_A4693PrdNum2 ;
   private String[] P09FC2_A857ValDsc ;
   private boolean[] P09FC2_n857ValDsc ;
   private java.math.BigDecimal[] P09FC2_A707PrdFacCon ;
   private String[] P09FC2_A736PrdUcoDsc ;
   private boolean[] P09FC2_n736PrdUcoDsc ;
   private String[] P09FC2_A737PrdUcpDsc ;
   private boolean[] P09FC2_n737PrdUcpDsc ;
   private byte[] P09FC2_A4338PrdUMeFo ;
   private java.math.BigDecimal[] P09FC2_A685PrdCanRes ;
   private String[] P09FC2_A728PrdRefPrv ;
   private java.math.BigDecimal[] P09FC2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09FC2_A704PrdExiAlm ;
   private String[] P09FC2_A794PrvNom ;
   private boolean[] P09FC2_n794PrvNom ;
   private int[] P09FC2_A795PrvNum ;
   private String[] P09FC2_A718PrdNom ;
   private String[] P09FC2_A11687PrdList ;
   private String[] P09FC2_A5888PrdOkotex ;
   private byte[] P09FC3_A742PrdUniCom ;
   private byte[] P09FC3_A743PrdUniCon ;
   private byte[] P09FC3_A856ValCod ;
   private String[] P09FC3_A718PrdNom ;
   private String[] P09FC3_A396EmprCod ;
   private byte[] P09FC3_A3273PrdTnq ;
   private java.math.BigDecimal[] P09FC3_A5416PrdDensS ;
   private String[] P09FC3_A11616PrdNmQu ;
   private String[] P09FC3_A11615PrdFuncion ;
   private String[] P09FC3_A11614PrdEINECS ;
   private String[] P09FC3_A11663PrdCtw4 ;
   private String[] P09FC3_A10938PrdCtw3 ;
   private String[] P09FC3_A10937PrdCtw2 ;
   private String[] P09FC3_A10936PrdCtw1 ;
   private String[] P09FC3_A10935PrdRTM ;
   private String[] P09FC3_A11196PrdNroCAS ;
   private String[] P09FC3_A6302TipPrdDsc ;
   private boolean[] P09FC3_n6302TipPrdDsc ;
   private short[] P09FC3_A6301TipPrdCod ;
   private boolean[] P09FC3_n6301TipPrdCod ;
   private String[] P09FC3_A10119PrdColIdx ;
   private java.math.BigDecimal[] P09FC3_A9733PrdAox ;
   private short[] P09FC3_A1644PrdDqo ;
   private String[] P09FC3_A11364PrdHm ;
   private String[] P09FC3_A11363PrdGots ;
   private String[] P09FC3_A5887PrdReach ;
   private String[] P09FC3_A9741PrdHS ;
   private String[] P09FC3_A9739PrdFT ;
   private java.math.BigDecimal[] P09FC3_A724PrdPreAct ;
   private String[] P09FC3_A4693PrdNum2 ;
   private String[] P09FC3_A857ValDsc ;
   private boolean[] P09FC3_n857ValDsc ;
   private java.math.BigDecimal[] P09FC3_A707PrdFacCon ;
   private String[] P09FC3_A736PrdUcoDsc ;
   private boolean[] P09FC3_n736PrdUcoDsc ;
   private String[] P09FC3_A737PrdUcpDsc ;
   private boolean[] P09FC3_n737PrdUcpDsc ;
   private byte[] P09FC3_A4338PrdUMeFo ;
   private java.math.BigDecimal[] P09FC3_A685PrdCanRes ;
   private String[] P09FC3_A728PrdRefPrv ;
   private java.math.BigDecimal[] P09FC3_A705PrdExiCC ;
   private java.math.BigDecimal[] P09FC3_A704PrdExiAlm ;
   private String[] P09FC3_A794PrvNom ;
   private boolean[] P09FC3_n794PrvNom ;
   private int[] P09FC3_A795PrvNum ;
   private String[] P09FC3_A719PrdNum ;
   private String[] P09FC3_A11687PrdList ;
   private String[] P09FC3_A5888PrdOkotex ;
   private byte[] P09FC4_A742PrdUniCom ;
   private byte[] P09FC4_A743PrdUniCon ;
   private byte[] P09FC4_A856ValCod ;
   private int[] P09FC4_A795PrvNum ;
   private String[] P09FC4_A396EmprCod ;
   private byte[] P09FC4_A3273PrdTnq ;
   private java.math.BigDecimal[] P09FC4_A5416PrdDensS ;
   private String[] P09FC4_A11616PrdNmQu ;
   private String[] P09FC4_A11615PrdFuncion ;
   private String[] P09FC4_A11614PrdEINECS ;
   private String[] P09FC4_A11663PrdCtw4 ;
   private String[] P09FC4_A10938PrdCtw3 ;
   private String[] P09FC4_A10937PrdCtw2 ;
   private String[] P09FC4_A10936PrdCtw1 ;
   private String[] P09FC4_A10935PrdRTM ;
   private String[] P09FC4_A11196PrdNroCAS ;
   private String[] P09FC4_A6302TipPrdDsc ;
   private boolean[] P09FC4_n6302TipPrdDsc ;
   private short[] P09FC4_A6301TipPrdCod ;
   private boolean[] P09FC4_n6301TipPrdCod ;
   private String[] P09FC4_A10119PrdColIdx ;
   private java.math.BigDecimal[] P09FC4_A9733PrdAox ;
   private short[] P09FC4_A1644PrdDqo ;
   private String[] P09FC4_A11364PrdHm ;
   private String[] P09FC4_A11363PrdGots ;
   private String[] P09FC4_A5887PrdReach ;
   private String[] P09FC4_A9741PrdHS ;
   private String[] P09FC4_A9739PrdFT ;
   private java.math.BigDecimal[] P09FC4_A724PrdPreAct ;
   private String[] P09FC4_A4693PrdNum2 ;
   private String[] P09FC4_A857ValDsc ;
   private boolean[] P09FC4_n857ValDsc ;
   private java.math.BigDecimal[] P09FC4_A707PrdFacCon ;
   private String[] P09FC4_A736PrdUcoDsc ;
   private boolean[] P09FC4_n736PrdUcoDsc ;
   private String[] P09FC4_A737PrdUcpDsc ;
   private boolean[] P09FC4_n737PrdUcpDsc ;
   private byte[] P09FC4_A4338PrdUMeFo ;
   private java.math.BigDecimal[] P09FC4_A685PrdCanRes ;
   private String[] P09FC4_A728PrdRefPrv ;
   private java.math.BigDecimal[] P09FC4_A705PrdExiCC ;
   private java.math.BigDecimal[] P09FC4_A704PrdExiAlm ;
   private String[] P09FC4_A794PrvNom ;
   private boolean[] P09FC4_n794PrvNom ;
   private String[] P09FC4_A718PrdNom ;
   private String[] P09FC4_A719PrdNum ;
   private String[] P09FC4_A11687PrdList ;
   private String[] P09FC4_A5888PrdOkotex ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class listaprd_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09FC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Listaprd_wcds_3_tfprdnum_sel ,
                                          String AV47Listaprd_wcds_2_tfprdnum ,
                                          String AV50Listaprd_wcds_5_tfprdnom_sel ,
                                          String AV49Listaprd_wcds_4_tfprdnom ,
                                          int AV51Listaprd_wcds_6_tfprvnum ,
                                          int AV52Listaprd_wcds_7_tfprvnum_to ,
                                          String AV54Listaprd_wcds_9_tfprvnom_sel ,
                                          String AV53Listaprd_wcds_8_tfprvnom ,
                                          String AV37EmprCod ,
                                          String AV38PrdNumFrom ,
                                          String AV39PrdNumTo ,
                                          int AV40PrvNumFrom ,
                                          int AV41PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod ,
                                          String AV46Listaprd_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          byte A4338PrdUMeFo ,
                                          String A737PrdUcpDsc ,
                                          String A736PrdUcoDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A857ValDsc ,
                                          String A4693PrdNum2 ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A9739PrdFT ,
                                          String A9741PrdHS ,
                                          String A5887PrdReach ,
                                          String A5888PrdOkotex ,
                                          String A11363PrdGots ,
                                          String A11364PrdHm ,
                                          short A1644PrdDqo ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A10119PrdColIdx ,
                                          short A6301TipPrdCod ,
                                          String A6302TipPrdDsc ,
                                          String A11196PrdNroCAS ,
                                          String A10935PrdRTM ,
                                          String A10936PrdCtw1 ,
                                          String A10937PrdCtw2 ,
                                          String A10938PrdCtw3 ,
                                          String A11663PrdCtw4 ,
                                          String A11687PrdList ,
                                          String A11614PrdEINECS ,
                                          String A11615PrdFuncion ,
                                          String A11616PrdNmQu ,
                                          java.math.BigDecimal A5416PrdDensS ,
                                          byte A3273PrdTnq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdUniCon AS PrdUniCon, T1.ValCod, T1.PrdNum, T1.EmprCod, T1.PrdTnq, T1.PrdDensS, T1.PrdNmQu, T1.PrdFuncion, T1.PrdEINECS, T1.PrdCtw4," ;
      scmdbuf += " T1.PrdCtw3, T1.PrdCtw2, T1.PrdCtw1, T1.PrdRTM, T1.PrdNroCAS, T5.TipPrdDsc, T1.TipPrdCod, T1.PrdColIdx, T1.PrdAox, T1.PrdDqo, T1.PrdHm, T1.PrdGots, T1.PrdReach," ;
      scmdbuf += " T1.PrdHS, T1.PrdFT, T1.PrdPreAct, T1.PrdNum2, T4.ValDsc, T1.PrdFacCon, T3.UniDsc AS PrdUcoDsc, T2.UniDsc AS PrdUcpDsc, T1.PrdUMeFo, T1.PrdCanRes, T1.PrdRefPrv," ;
      scmdbuf += " T1.PrdExiCC, T1.PrdExiAlm, T6.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdList, T1.PrdOkotex FROM (((((TXPPRODUC T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.UniCod = T1.PrdUniCom) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCon) INNER JOIN TXPTIPVAL T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T6 ON T6.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T6.PrvNum = T1.PrvNum)" ;
      if ( (GXutil.strcmp("", AV48Listaprd_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV47Listaprd_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Listaprd_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Listaprd_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV49Listaprd_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Listaprd_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV51Listaprd_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV52Listaprd_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Listaprd_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Listaprd_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Listaprd_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.PrvNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV40PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV41PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09FC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Listaprd_wcds_3_tfprdnum_sel ,
                                          String AV47Listaprd_wcds_2_tfprdnum ,
                                          String AV50Listaprd_wcds_5_tfprdnom_sel ,
                                          String AV49Listaprd_wcds_4_tfprdnom ,
                                          int AV51Listaprd_wcds_6_tfprvnum ,
                                          int AV52Listaprd_wcds_7_tfprvnum_to ,
                                          String AV54Listaprd_wcds_9_tfprvnom_sel ,
                                          String AV53Listaprd_wcds_8_tfprvnom ,
                                          String AV37EmprCod ,
                                          String AV38PrdNumFrom ,
                                          String AV39PrdNumTo ,
                                          int AV40PrvNumFrom ,
                                          int AV41PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod ,
                                          String AV46Listaprd_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          byte A4338PrdUMeFo ,
                                          String A737PrdUcpDsc ,
                                          String A736PrdUcoDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A857ValDsc ,
                                          String A4693PrdNum2 ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A9739PrdFT ,
                                          String A9741PrdHS ,
                                          String A5887PrdReach ,
                                          String A5888PrdOkotex ,
                                          String A11363PrdGots ,
                                          String A11364PrdHm ,
                                          short A1644PrdDqo ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A10119PrdColIdx ,
                                          short A6301TipPrdCod ,
                                          String A6302TipPrdDsc ,
                                          String A11196PrdNroCAS ,
                                          String A10935PrdRTM ,
                                          String A10936PrdCtw1 ,
                                          String A10937PrdCtw2 ,
                                          String A10938PrdCtw3 ,
                                          String A11663PrdCtw4 ,
                                          String A11687PrdList ,
                                          String A11614PrdEINECS ,
                                          String A11615PrdFuncion ,
                                          String A11616PrdNmQu ,
                                          java.math.BigDecimal A5416PrdDensS ,
                                          byte A3273PrdTnq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdUniCon AS PrdUniCon, T1.ValCod, T1.PrdNom, T1.EmprCod, T1.PrdTnq, T1.PrdDensS, T1.PrdNmQu, T1.PrdFuncion, T1.PrdEINECS, T1.PrdCtw4," ;
      scmdbuf += " T1.PrdCtw3, T1.PrdCtw2, T1.PrdCtw1, T1.PrdRTM, T1.PrdNroCAS, T5.TipPrdDsc, T1.TipPrdCod, T1.PrdColIdx, T1.PrdAox, T1.PrdDqo, T1.PrdHm, T1.PrdGots, T1.PrdReach," ;
      scmdbuf += " T1.PrdHS, T1.PrdFT, T1.PrdPreAct, T1.PrdNum2, T4.ValDsc, T1.PrdFacCon, T3.UniDsc AS PrdUcoDsc, T2.UniDsc AS PrdUcpDsc, T1.PrdUMeFo, T1.PrdCanRes, T1.PrdRefPrv," ;
      scmdbuf += " T1.PrdExiCC, T1.PrdExiAlm, T6.PrvNom, T1.PrvNum, T1.PrdNum, T1.PrdList, T1.PrdOkotex FROM (((((TXPPRODUC T1 INNER JOIN TXPTIPUNI T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.UniCod = T1.PrdUniCom) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCon) INNER JOIN TXPTIPVAL T4 ON T4.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T4.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T6 ON T6.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T6.PrvNum = T1.PrvNum)" ;
      if ( (GXutil.strcmp("", AV48Listaprd_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV47Listaprd_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Listaprd_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Listaprd_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV49Listaprd_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Listaprd_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV51Listaprd_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV52Listaprd_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Listaprd_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Listaprd_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Listaprd_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.PrvNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV40PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV41PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09FC4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Listaprd_wcds_3_tfprdnum_sel ,
                                          String AV47Listaprd_wcds_2_tfprdnum ,
                                          String AV50Listaprd_wcds_5_tfprdnom_sel ,
                                          String AV49Listaprd_wcds_4_tfprdnom ,
                                          int AV51Listaprd_wcds_6_tfprvnum ,
                                          int AV52Listaprd_wcds_7_tfprvnum_to ,
                                          String AV54Listaprd_wcds_9_tfprvnom_sel ,
                                          String AV53Listaprd_wcds_8_tfprvnom ,
                                          String AV37EmprCod ,
                                          String AV38PrdNumFrom ,
                                          String AV39PrdNumTo ,
                                          int AV40PrvNumFrom ,
                                          int AV41PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A396EmprCod ,
                                          String AV46Listaprd_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          byte A4338PrdUMeFo ,
                                          String A737PrdUcpDsc ,
                                          String A736PrdUcoDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          String A857ValDsc ,
                                          String A4693PrdNum2 ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A9739PrdFT ,
                                          String A9741PrdHS ,
                                          String A5887PrdReach ,
                                          String A5888PrdOkotex ,
                                          String A11363PrdGots ,
                                          String A11364PrdHm ,
                                          short A1644PrdDqo ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A10119PrdColIdx ,
                                          short A6301TipPrdCod ,
                                          String A6302TipPrdDsc ,
                                          String A11196PrdNroCAS ,
                                          String A10935PrdRTM ,
                                          String A10936PrdCtw1 ,
                                          String A10937PrdCtw2 ,
                                          String A10938PrdCtw3 ,
                                          String A11663PrdCtw4 ,
                                          String A11687PrdList ,
                                          String A11614PrdEINECS ,
                                          String A11615PrdFuncion ,
                                          String A11616PrdNmQu ,
                                          java.math.BigDecimal A5416PrdDensS ,
                                          byte A3273PrdTnq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[13];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdUniCon AS PrdUniCon, T1.ValCod, T1.PrvNum, T1.EmprCod, T1.PrdTnq, T1.PrdDensS, T1.PrdNmQu, T1.PrdFuncion, T1.PrdEINECS, T1.PrdCtw4," ;
      scmdbuf += " T1.PrdCtw3, T1.PrdCtw2, T1.PrdCtw1, T1.PrdRTM, T1.PrdNroCAS, T6.TipPrdDsc, T1.TipPrdCod, T1.PrdColIdx, T1.PrdAox, T1.PrdDqo, T1.PrdHm, T1.PrdGots, T1.PrdReach," ;
      scmdbuf += " T1.PrdHS, T1.PrdFT, T1.PrdPreAct, T1.PrdNum2, T5.ValDsc, T1.PrdFacCon, T4.UniDsc AS PrdUcoDsc, T3.UniDsc AS PrdUcpDsc, T1.PrdUMeFo, T1.PrdCanRes, T1.PrdRefPrv," ;
      scmdbuf += " T1.PrdExiCC, T1.PrdExiAlm, T2.PrvNom, T1.PrdNom, T1.PrdNum, T1.PrdList, T1.PrdOkotex FROM (((((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom) INNER JOIN TXPTIPUNI T4 ON T4.EmprCod = T1.EmprCod AND T4.UniCod" ;
      scmdbuf += " = T1.PrdUniCon) INNER JOIN TXPTIPVAL T5 ON T5.EmprCod = T1.EmprCod AND T5.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T6 ON T6.EmprCod = T1.EmprCod AND T6.TipPrdCod" ;
      scmdbuf += " = T1.TipPrdCod)" ;
      if ( (GXutil.strcmp("", AV48Listaprd_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV47Listaprd_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Listaprd_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Listaprd_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV49Listaprd_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Listaprd_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV51Listaprd_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV52Listaprd_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Listaprd_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Listaprd_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Listaprd_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV40PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV41PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P09FC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() );
            case 1 :
                  return conditional_P09FC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() );
            case 2 :
                  return conditional_P09FC4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FC4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 50);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((String[]) buf[15])[0] = rslt.getString(16, 40);
               ((String[]) buf[16])[0] = rslt.getString(17, 40);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 10);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((String[]) buf[27])[0] = rslt.getString(26, 1);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(27,5);
               ((String[]) buf[29])[0] = rslt.getString(28, 16);
               ((String[]) buf[30])[0] = rslt.getString(29, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(30,4);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(32, 8);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(33);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(34,4);
               ((String[]) buf[39])[0] = rslt.getString(35, 30);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(36,4);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(37,4);
               ((String[]) buf[42])[0] = rslt.getString(38, 30);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((int[]) buf[44])[0] = rslt.getInt(39);
               ((String[]) buf[45])[0] = rslt.getString(40, 26);
               ((String[]) buf[46])[0] = rslt.getString(41, 1);
               ((String[]) buf[47])[0] = rslt.getString(42, 1);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 50);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((String[]) buf[15])[0] = rslt.getString(16, 40);
               ((String[]) buf[16])[0] = rslt.getString(17, 40);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 10);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((String[]) buf[27])[0] = rslt.getString(26, 1);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(27,5);
               ((String[]) buf[29])[0] = rslt.getString(28, 16);
               ((String[]) buf[30])[0] = rslt.getString(29, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(30,4);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(32, 8);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(33);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(34,4);
               ((String[]) buf[39])[0] = rslt.getString(35, 30);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(36,4);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(37,4);
               ((String[]) buf[42])[0] = rslt.getString(38, 30);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((int[]) buf[44])[0] = rslt.getInt(39);
               ((String[]) buf[45])[0] = rslt.getString(40, 6);
               ((String[]) buf[46])[0] = rslt.getString(41, 1);
               ((String[]) buf[47])[0] = rslt.getString(42, 1);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 50);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((String[]) buf[15])[0] = rslt.getString(16, 40);
               ((String[]) buf[16])[0] = rslt.getString(17, 40);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 10);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((String[]) buf[27])[0] = rslt.getString(26, 1);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(27,5);
               ((String[]) buf[29])[0] = rslt.getString(28, 16);
               ((String[]) buf[30])[0] = rslt.getString(29, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(30,4);
               ((String[]) buf[33])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(32, 8);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(33);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(34,4);
               ((String[]) buf[39])[0] = rslt.getString(35, 30);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(36,4);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(37,4);
               ((String[]) buf[42])[0] = rslt.getString(38, 30);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(39, 26);
               ((String[]) buf[45])[0] = rslt.getString(40, 6);
               ((String[]) buf[46])[0] = rslt.getString(41, 1);
               ((String[]) buf[47])[0] = rslt.getString(42, 1);
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
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               return;
      }
   }

}

