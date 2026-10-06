package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlproductossinmovimientos_wcgetfilterdata extends GXProcedure
{
   public controlproductossinmovimientos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlproductossinmovimientos_wcgetfilterdata.class ), "" );
   }

   public controlproductossinmovimientos_wcgetfilterdata( int remoteHandle ,
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
      controlproductossinmovimientos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      controlproductossinmovimientos_wcgetfilterdata.this.AV28DDOName = aP0;
      controlproductossinmovimientos_wcgetfilterdata.this.AV26SearchTxt = aP1;
      controlproductossinmovimientos_wcgetfilterdata.this.AV27SearchTxtTo = aP2;
      controlproductossinmovimientos_wcgetfilterdata.this.aP3 = aP3;
      controlproductossinmovimientos_wcgetfilterdata.this.aP4 = aP4;
      controlproductossinmovimientos_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PRVNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PRDUCPDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDUCPDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PRDLASTTIPMOVCC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDLASTTIPMOVCCOPTIONS' */
         S161 ();
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
      if ( GXutil.strcmp(AV39Session.getValue("ControlProductossinMovimientos_WCGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlProductossinMovimientos_WCGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("ControlProductossinMovimientos_WCGridState"), null, null);
      }
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV14TFPrvNum = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPrvNum_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV16TFPrvNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV17TFPrvNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV18TFPrdExiAlm = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFPrdExiAlm_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC") == 0 )
         {
            AV61TFPrdUcpDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC_SEL") == 0 )
         {
            AV62TFPrdUcpDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV59TFPrdPreAct = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFPrdPreAct_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDIASINACTIVO") == 0 )
         {
            AV24TFPrdDiasInactivo = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFPrdDiasInactivo_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLASTFECHCC") == 0 )
         {
            AV53TFPrdLastFechCC = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLASTTIPMOVCC") == 0 )
         {
            AV57TFPrdLastTipMovCC = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLASTTIPMOVCC_SEL") == 0 )
         {
            AV58TFPrdLastTipMovCC_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV46Prdnum = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV47Prdnum_to = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV48PrvNum = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM_TO") == 0 )
         {
            AV49Prvnum_to = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DIAS") == 0 )
         {
            AV50Dias = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV26SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV11TFPrdNum_Sel ,
                                           AV10TFPrdNum ,
                                           AV13TFPrdNom_Sel ,
                                           AV12TFPrdNom ,
                                           Integer.valueOf(AV14TFPrvNum) ,
                                           Integer.valueOf(AV15TFPrvNum_To) ,
                                           AV17TFPrvNom_Sel ,
                                           AV16TFPrvNom ,
                                           AV18TFPrdExiAlm ,
                                           AV19TFPrdExiAlm_To ,
                                           AV62TFPrdUcpDsc_Sel ,
                                           AV61TFPrdUcpDsc ,
                                           AV59TFPrdPreAct ,
                                           AV60TFPrdPreAct_To ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A704PrdExiAlm ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           AV44FilterFullText ,
                                           Short.valueOf(A13871PrdDiasIna) ,
                                           A13877PrdLastTip ,
                                           Short.valueOf(AV24TFPrdDiasInactivo) ,
                                           Short.valueOf(AV25TFPrdDiasInactivo_To) ,
                                           AV53TFPrdLastFechCC ,
                                           A13876PrdLastFec ,
                                           AV58TFPrdLastTipMovCC_Sel ,
                                           AV57TFPrdLastTipMovCC ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           Integer.valueOf(AV49Prvnum_to) ,
                                           Short.valueOf(AV50Dias) ,
                                           AV45Emprcod ,
                                           AV46Prdnum ,
                                           A396EmprCod ,
                                           AV47Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFPrdNum = GXutil.padr( GXutil.rtrim( AV10TFPrdNum), 6, "%") ;
      lV12TFPrdNom = GXutil.padr( GXutil.rtrim( AV12TFPrdNom), 26, "%") ;
      lV16TFPrvNom = GXutil.padr( GXutil.rtrim( AV16TFPrvNom), 30, "%") ;
      lV61TFPrdUcpDsc = GXutil.padr( GXutil.rtrim( AV61TFPrdUcpDsc), 8, "%") ;
      /* Using cursor P09732 */
      pr_default.execute(0, new Object[] {AV45Emprcod, AV46Prdnum, Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49Prvnum_to), AV47Prdnum_to, lV10TFPrdNum, AV11TFPrdNum_Sel, lV12TFPrdNom, AV13TFPrdNom_Sel, Integer.valueOf(AV14TFPrvNum), Integer.valueOf(AV15TFPrvNum_To), lV16TFPrvNom, AV17TFPrvNom_Sel, AV18TFPrdExiAlm, AV19TFPrdExiAlm_To, lV61TFPrdUcpDsc, AV62TFPrdUcpDsc_Sel, AV59TFPrdPreAct, AV60TFPrdPreAct_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9732 = false ;
         A742PrdUniCom = P09732_A742PrdUniCom[0] ;
         A724PrdPreAct = P09732_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P09732_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09732_n737PrdUcpDsc[0] ;
         A704PrdExiAlm = P09732_A704PrdExiAlm[0] ;
         A794PrvNom = P09732_A794PrvNom[0] ;
         n794PrvNom = P09732_n794PrvNom[0] ;
         A795PrvNum = P09732_A795PrvNum[0] ;
         A718PrdNom = P09732_A718PrdNom[0] ;
         A719PrdNum = P09732_A719PrdNum[0] ;
         A396EmprCod = P09732_A396EmprCod[0] ;
         A794PrvNom = P09732_A794PrvNom[0] ;
         n794PrvNom = P09732_n794PrvNom[0] ;
         A737PrdUcpDsc = P09732_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09732_n737PrdUcpDsc[0] ;
         GXt_int2 = A13871PrdDiasIna ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_int5[0] = GXt_int2 ;
         new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_int5) ;
         controlproductossinmovimientos_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A13871PrdDiasIna = GXt_int2 ;
         if ( (0==AV24TFPrdDiasInactivo) || ( ( A13871PrdDiasIna >= AV24TFPrdDiasInactivo ) ) )
         {
            if ( (0==AV25TFPrdDiasInactivo_To) || ( ( A13871PrdDiasIna <= AV25TFPrdDiasInactivo_To ) ) )
            {
               if ( ( A13871PrdDiasIna >= AV50Dias ) || (0==AV50Dias) )
               {
                  GXt_int6 = A13873PrdUltMovC ;
                  GXv_int7[0] = GXt_int6 ;
                  new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int7) ;
                  controlproductossinmovimientos_wcgetfilterdata.this.GXt_int6 = GXv_int7[0] ;
                  A13873PrdUltMovC = GXt_int6 ;
                  A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                  if ( (GXutil.strcmp("", AV44FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13871PrdDiasIna, 4, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                  {
                     if ( ! ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFPrdLastTipMovCC)==0) ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV57TFPrdLastTipMovCC) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) || ( ( GXutil.strcmp(A13877PrdLastTip, AV58TFPrdLastTipMovCC_Sel) == 0 ) ) )
                        {
                           A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                           if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFPrdLastFechCC)) || ( (( GXutil.resetTime(A13876PrdLastFec).after( GXutil.resetTime( AV53TFPrdLastFechCC )) ) || ( GXutil.dateCompare(GXutil.resetTime(A13876PrdLastFec), GXutil.resetTime(AV53TFPrdLastFechCC)) )) ) )
                           {
                              AV38count = 0 ;
                              while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09732_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09732_A719PrdNum[0], A719PrdNum) == 0 ) )
                              {
                                 brk9732 = false ;
                                 AV38count = (long)(AV38count+1) ;
                                 brk9732 = true ;
                                 pr_default.readNext(0);
                              }
                              if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
                              {
                                 AV30Option = A719PrdNum ;
                                 AV31Options.add(AV30Option, 0);
                                 AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV31Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9732 )
         {
            brk9732 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV26SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV11TFPrdNum_Sel ,
                                           AV10TFPrdNum ,
                                           AV13TFPrdNom_Sel ,
                                           AV12TFPrdNom ,
                                           Integer.valueOf(AV14TFPrvNum) ,
                                           Integer.valueOf(AV15TFPrvNum_To) ,
                                           AV17TFPrvNom_Sel ,
                                           AV16TFPrvNom ,
                                           AV18TFPrdExiAlm ,
                                           AV19TFPrdExiAlm_To ,
                                           AV62TFPrdUcpDsc_Sel ,
                                           AV61TFPrdUcpDsc ,
                                           AV59TFPrdPreAct ,
                                           AV60TFPrdPreAct_To ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A704PrdExiAlm ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           AV44FilterFullText ,
                                           Short.valueOf(A13871PrdDiasIna) ,
                                           A13877PrdLastTip ,
                                           Short.valueOf(AV24TFPrdDiasInactivo) ,
                                           Short.valueOf(AV25TFPrdDiasInactivo_To) ,
                                           AV53TFPrdLastFechCC ,
                                           A13876PrdLastFec ,
                                           AV58TFPrdLastTipMovCC_Sel ,
                                           AV57TFPrdLastTipMovCC ,
                                           AV46Prdnum ,
                                           AV47Prdnum_to ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           Integer.valueOf(AV49Prvnum_to) ,
                                           Short.valueOf(AV50Dias) ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFPrdNum = GXutil.padr( GXutil.rtrim( AV10TFPrdNum), 6, "%") ;
      lV12TFPrdNom = GXutil.padr( GXutil.rtrim( AV12TFPrdNom), 26, "%") ;
      lV16TFPrvNom = GXutil.padr( GXutil.rtrim( AV16TFPrvNom), 30, "%") ;
      lV61TFPrdUcpDsc = GXutil.padr( GXutil.rtrim( AV61TFPrdUcpDsc), 8, "%") ;
      /* Using cursor P09733 */
      pr_default.execute(1, new Object[] {AV45Emprcod, AV46Prdnum, AV47Prdnum_to, Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49Prvnum_to), lV10TFPrdNum, AV11TFPrdNum_Sel, lV12TFPrdNom, AV13TFPrdNom_Sel, Integer.valueOf(AV14TFPrvNum), Integer.valueOf(AV15TFPrvNum_To), lV16TFPrvNom, AV17TFPrvNom_Sel, AV18TFPrdExiAlm, AV19TFPrdExiAlm_To, lV61TFPrdUcpDsc, AV62TFPrdUcpDsc_Sel, AV59TFPrdPreAct, AV60TFPrdPreAct_To});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9734 = false ;
         A742PrdUniCom = P09733_A742PrdUniCom[0] ;
         A718PrdNom = P09733_A718PrdNom[0] ;
         A724PrdPreAct = P09733_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P09733_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09733_n737PrdUcpDsc[0] ;
         A704PrdExiAlm = P09733_A704PrdExiAlm[0] ;
         A794PrvNom = P09733_A794PrvNom[0] ;
         n794PrvNom = P09733_n794PrvNom[0] ;
         A795PrvNum = P09733_A795PrvNum[0] ;
         A719PrdNum = P09733_A719PrdNum[0] ;
         A396EmprCod = P09733_A396EmprCod[0] ;
         A794PrvNom = P09733_A794PrvNom[0] ;
         n794PrvNom = P09733_n794PrvNom[0] ;
         A737PrdUcpDsc = P09733_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09733_n737PrdUcpDsc[0] ;
         GXt_int2 = A13871PrdDiasIna ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int5[0] = GXt_int2 ;
         new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
         controlproductossinmovimientos_wcgetfilterdata.this.A396EmprCod = GXv_char4[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.A719PrdNum = GXv_char3[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A13871PrdDiasIna = GXt_int2 ;
         if ( (0==AV24TFPrdDiasInactivo) || ( ( A13871PrdDiasIna >= AV24TFPrdDiasInactivo ) ) )
         {
            if ( (0==AV25TFPrdDiasInactivo_To) || ( ( A13871PrdDiasIna <= AV25TFPrdDiasInactivo_To ) ) )
            {
               if ( ( A13871PrdDiasIna >= AV50Dias ) || (0==AV50Dias) )
               {
                  GXt_int6 = A13873PrdUltMovC ;
                  GXv_int7[0] = GXt_int6 ;
                  new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int7) ;
                  controlproductossinmovimientos_wcgetfilterdata.this.GXt_int6 = GXv_int7[0] ;
                  A13873PrdUltMovC = GXt_int6 ;
                  A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                  if ( (GXutil.strcmp("", AV44FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13871PrdDiasIna, 4, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                  {
                     if ( ! ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFPrdLastTipMovCC)==0) ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV57TFPrdLastTipMovCC) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) || ( ( GXutil.strcmp(A13877PrdLastTip, AV58TFPrdLastTipMovCC_Sel) == 0 ) ) )
                        {
                           A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                           if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFPrdLastFechCC)) || ( (( GXutil.resetTime(A13876PrdLastFec).after( GXutil.resetTime( AV53TFPrdLastFechCC )) ) || ( GXutil.dateCompare(GXutil.resetTime(A13876PrdLastFec), GXutil.resetTime(AV53TFPrdLastFechCC)) )) ) )
                           {
                              AV38count = 0 ;
                              while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09733_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09733_A718PrdNom[0], A718PrdNom) == 0 ) )
                              {
                                 brk9734 = false ;
                                 A719PrdNum = P09733_A719PrdNum[0] ;
                                 AV38count = (long)(AV38count+1) ;
                                 brk9734 = true ;
                                 pr_default.readNext(1);
                              }
                              if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
                              {
                                 AV30Option = A718PrdNom ;
                                 AV31Options.add(AV30Option, 0);
                                 AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV31Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9734 )
         {
            brk9734 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrvNom = AV26SearchTxt ;
      AV17TFPrvNom_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV11TFPrdNum_Sel ,
                                           AV10TFPrdNum ,
                                           AV13TFPrdNom_Sel ,
                                           AV12TFPrdNom ,
                                           Integer.valueOf(AV14TFPrvNum) ,
                                           Integer.valueOf(AV15TFPrvNum_To) ,
                                           AV17TFPrvNom_Sel ,
                                           AV16TFPrvNom ,
                                           AV18TFPrdExiAlm ,
                                           AV19TFPrdExiAlm_To ,
                                           AV62TFPrdUcpDsc_Sel ,
                                           AV61TFPrdUcpDsc ,
                                           AV59TFPrdPreAct ,
                                           AV60TFPrdPreAct_To ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A704PrdExiAlm ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           AV44FilterFullText ,
                                           Short.valueOf(A13871PrdDiasIna) ,
                                           A13877PrdLastTip ,
                                           Short.valueOf(AV24TFPrdDiasInactivo) ,
                                           Short.valueOf(AV25TFPrdDiasInactivo_To) ,
                                           AV53TFPrdLastFechCC ,
                                           A13876PrdLastFec ,
                                           AV58TFPrdLastTipMovCC_Sel ,
                                           AV57TFPrdLastTipMovCC ,
                                           AV46Prdnum ,
                                           AV47Prdnum_to ,
                                           Short.valueOf(AV50Dias) ,
                                           AV45Emprcod ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV49Prvnum_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV10TFPrdNum = GXutil.padr( GXutil.rtrim( AV10TFPrdNum), 6, "%") ;
      lV12TFPrdNom = GXutil.padr( GXutil.rtrim( AV12TFPrdNom), 26, "%") ;
      lV16TFPrvNom = GXutil.padr( GXutil.rtrim( AV16TFPrvNom), 30, "%") ;
      lV61TFPrdUcpDsc = GXutil.padr( GXutil.rtrim( AV61TFPrdUcpDsc), 8, "%") ;
      /* Using cursor P09734 */
      pr_default.execute(2, new Object[] {AV45Emprcod, Integer.valueOf(AV48PrvNum), AV46Prdnum, AV47Prdnum_to, Integer.valueOf(AV49Prvnum_to), lV10TFPrdNum, AV11TFPrdNum_Sel, lV12TFPrdNom, AV13TFPrdNom_Sel, Integer.valueOf(AV14TFPrvNum), Integer.valueOf(AV15TFPrvNum_To), lV16TFPrvNom, AV17TFPrvNom_Sel, AV18TFPrdExiAlm, AV19TFPrdExiAlm_To, lV61TFPrdUcpDsc, AV62TFPrdUcpDsc_Sel, AV59TFPrdPreAct, AV60TFPrdPreAct_To});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9736 = false ;
         A742PrdUniCom = P09734_A742PrdUniCom[0] ;
         A795PrvNum = P09734_A795PrvNum[0] ;
         A724PrdPreAct = P09734_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P09734_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09734_n737PrdUcpDsc[0] ;
         A704PrdExiAlm = P09734_A704PrdExiAlm[0] ;
         A794PrvNom = P09734_A794PrvNom[0] ;
         n794PrvNom = P09734_n794PrvNom[0] ;
         A718PrdNom = P09734_A718PrdNom[0] ;
         A719PrdNum = P09734_A719PrdNum[0] ;
         A396EmprCod = P09734_A396EmprCod[0] ;
         A794PrvNom = P09734_A794PrvNom[0] ;
         n794PrvNom = P09734_n794PrvNom[0] ;
         A737PrdUcpDsc = P09734_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09734_n737PrdUcpDsc[0] ;
         GXt_int2 = A13871PrdDiasIna ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int5[0] = GXt_int2 ;
         new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
         controlproductossinmovimientos_wcgetfilterdata.this.A396EmprCod = GXv_char4[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.A719PrdNum = GXv_char3[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A13871PrdDiasIna = GXt_int2 ;
         if ( (0==AV24TFPrdDiasInactivo) || ( ( A13871PrdDiasIna >= AV24TFPrdDiasInactivo ) ) )
         {
            if ( (0==AV25TFPrdDiasInactivo_To) || ( ( A13871PrdDiasIna <= AV25TFPrdDiasInactivo_To ) ) )
            {
               if ( ( A13871PrdDiasIna >= AV50Dias ) || (0==AV50Dias) )
               {
                  GXt_int6 = A13873PrdUltMovC ;
                  GXv_int7[0] = GXt_int6 ;
                  new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int7) ;
                  controlproductossinmovimientos_wcgetfilterdata.this.GXt_int6 = GXv_int7[0] ;
                  A13873PrdUltMovC = GXt_int6 ;
                  A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                  if ( (GXutil.strcmp("", AV44FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13871PrdDiasIna, 4, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                  {
                     if ( ! ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFPrdLastTipMovCC)==0) ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV57TFPrdLastTipMovCC) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) || ( ( GXutil.strcmp(A13877PrdLastTip, AV58TFPrdLastTipMovCC_Sel) == 0 ) ) )
                        {
                           A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                           if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFPrdLastFechCC)) || ( (( GXutil.resetTime(A13876PrdLastFec).after( GXutil.resetTime( AV53TFPrdLastFechCC )) ) || ( GXutil.dateCompare(GXutil.resetTime(A13876PrdLastFec), GXutil.resetTime(AV53TFPrdLastFechCC)) )) ) )
                           {
                              AV38count = 0 ;
                              while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09734_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09734_A795PrvNum[0] == A795PrvNum ) )
                              {
                                 brk9736 = false ;
                                 A719PrdNum = P09734_A719PrdNum[0] ;
                                 AV38count = (long)(AV38count+1) ;
                                 brk9736 = true ;
                                 pr_default.readNext(2);
                              }
                              if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
                              {
                                 AV30Option = A794PrvNom ;
                                 AV29InsertIndex = 1 ;
                                 while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
                                 {
                                    AV29InsertIndex = (int)(AV29InsertIndex+1) ;
                                 }
                                 AV31Options.add(AV30Option, AV29InsertIndex);
                                 AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
                              }
                              if ( AV31Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9736 )
         {
            brk9736 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDUCPDSCOPTIONS' Routine */
      returnInSub = false ;
      AV61TFPrdUcpDsc = AV26SearchTxt ;
      AV62TFPrdUcpDsc_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV11TFPrdNum_Sel ,
                                           AV10TFPrdNum ,
                                           AV13TFPrdNom_Sel ,
                                           AV12TFPrdNom ,
                                           Integer.valueOf(AV14TFPrvNum) ,
                                           Integer.valueOf(AV15TFPrvNum_To) ,
                                           AV17TFPrvNom_Sel ,
                                           AV16TFPrvNom ,
                                           AV18TFPrdExiAlm ,
                                           AV19TFPrdExiAlm_To ,
                                           AV62TFPrdUcpDsc_Sel ,
                                           AV61TFPrdUcpDsc ,
                                           AV59TFPrdPreAct ,
                                           AV60TFPrdPreAct_To ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A704PrdExiAlm ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           AV44FilterFullText ,
                                           Short.valueOf(A13871PrdDiasIna) ,
                                           A13877PrdLastTip ,
                                           Short.valueOf(AV24TFPrdDiasInactivo) ,
                                           Short.valueOf(AV25TFPrdDiasInactivo_To) ,
                                           AV53TFPrdLastFechCC ,
                                           A13876PrdLastFec ,
                                           AV58TFPrdLastTipMovCC_Sel ,
                                           AV57TFPrdLastTipMovCC ,
                                           AV46Prdnum ,
                                           AV47Prdnum_to ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           Integer.valueOf(AV49Prvnum_to) ,
                                           Short.valueOf(AV50Dias) ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFPrdNum = GXutil.padr( GXutil.rtrim( AV10TFPrdNum), 6, "%") ;
      lV12TFPrdNom = GXutil.padr( GXutil.rtrim( AV12TFPrdNom), 26, "%") ;
      lV16TFPrvNom = GXutil.padr( GXutil.rtrim( AV16TFPrvNom), 30, "%") ;
      lV61TFPrdUcpDsc = GXutil.padr( GXutil.rtrim( AV61TFPrdUcpDsc), 8, "%") ;
      /* Using cursor P09735 */
      pr_default.execute(3, new Object[] {AV45Emprcod, AV46Prdnum, AV47Prdnum_to, Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49Prvnum_to), lV10TFPrdNum, AV11TFPrdNum_Sel, lV12TFPrdNom, AV13TFPrdNom_Sel, Integer.valueOf(AV14TFPrvNum), Integer.valueOf(AV15TFPrvNum_To), lV16TFPrvNom, AV17TFPrvNom_Sel, AV18TFPrdExiAlm, AV19TFPrdExiAlm_To, lV61TFPrdUcpDsc, AV62TFPrdUcpDsc_Sel, AV59TFPrdPreAct, AV60TFPrdPreAct_To});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9738 = false ;
         A742PrdUniCom = P09735_A742PrdUniCom[0] ;
         A724PrdPreAct = P09735_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P09735_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09735_n737PrdUcpDsc[0] ;
         A704PrdExiAlm = P09735_A704PrdExiAlm[0] ;
         A794PrvNom = P09735_A794PrvNom[0] ;
         n794PrvNom = P09735_n794PrvNom[0] ;
         A795PrvNum = P09735_A795PrvNum[0] ;
         A718PrdNom = P09735_A718PrdNom[0] ;
         A719PrdNum = P09735_A719PrdNum[0] ;
         A396EmprCod = P09735_A396EmprCod[0] ;
         A794PrvNom = P09735_A794PrvNom[0] ;
         n794PrvNom = P09735_n794PrvNom[0] ;
         A737PrdUcpDsc = P09735_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09735_n737PrdUcpDsc[0] ;
         GXt_int2 = A13871PrdDiasIna ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int5[0] = GXt_int2 ;
         new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
         controlproductossinmovimientos_wcgetfilterdata.this.A396EmprCod = GXv_char4[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.A719PrdNum = GXv_char3[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A13871PrdDiasIna = GXt_int2 ;
         if ( (0==AV24TFPrdDiasInactivo) || ( ( A13871PrdDiasIna >= AV24TFPrdDiasInactivo ) ) )
         {
            if ( (0==AV25TFPrdDiasInactivo_To) || ( ( A13871PrdDiasIna <= AV25TFPrdDiasInactivo_To ) ) )
            {
               if ( ( A13871PrdDiasIna >= AV50Dias ) || (0==AV50Dias) )
               {
                  GXt_int6 = A13873PrdUltMovC ;
                  GXv_int7[0] = GXt_int6 ;
                  new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int7) ;
                  controlproductossinmovimientos_wcgetfilterdata.this.GXt_int6 = GXv_int7[0] ;
                  A13873PrdUltMovC = GXt_int6 ;
                  A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                  if ( (GXutil.strcmp("", AV44FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13871PrdDiasIna, 4, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                  {
                     if ( ! ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFPrdLastTipMovCC)==0) ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV57TFPrdLastTipMovCC) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) || ( ( GXutil.strcmp(A13877PrdLastTip, AV58TFPrdLastTipMovCC_Sel) == 0 ) ) )
                        {
                           A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                           if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFPrdLastFechCC)) || ( (( GXutil.resetTime(A13876PrdLastFec).after( GXutil.resetTime( AV53TFPrdLastFechCC )) ) || ( GXutil.dateCompare(GXutil.resetTime(A13876PrdLastFec), GXutil.resetTime(AV53TFPrdLastFechCC)) )) ) )
                           {
                              AV38count = 0 ;
                              while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09735_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09735_A742PrdUniCom[0] == A742PrdUniCom ) )
                              {
                                 brk9738 = false ;
                                 A719PrdNum = P09735_A719PrdNum[0] ;
                                 AV38count = (long)(AV38count+1) ;
                                 brk9738 = true ;
                                 pr_default.readNext(3);
                              }
                              if ( ! (GXutil.strcmp("", A737PrdUcpDsc)==0) )
                              {
                                 AV30Option = A737PrdUcpDsc ;
                                 AV29InsertIndex = 1 ;
                                 while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
                                 {
                                    AV29InsertIndex = (int)(AV29InsertIndex+1) ;
                                 }
                                 AV31Options.add(AV30Option, AV29InsertIndex);
                                 AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
                              }
                              if ( AV31Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk9738 )
         {
            brk9738 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRDLASTTIPMOVCCOPTIONS' Routine */
      returnInSub = false ;
      AV57TFPrdLastTipMovCC = AV26SearchTxt ;
      AV58TFPrdLastTipMovCC_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV11TFPrdNum_Sel ,
                                           AV10TFPrdNum ,
                                           AV13TFPrdNom_Sel ,
                                           AV12TFPrdNom ,
                                           Integer.valueOf(AV14TFPrvNum) ,
                                           Integer.valueOf(AV15TFPrvNum_To) ,
                                           AV17TFPrvNom_Sel ,
                                           AV16TFPrvNom ,
                                           AV18TFPrdExiAlm ,
                                           AV19TFPrdExiAlm_To ,
                                           AV62TFPrdUcpDsc_Sel ,
                                           AV61TFPrdUcpDsc ,
                                           AV59TFPrdPreAct ,
                                           AV60TFPrdPreAct_To ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A704PrdExiAlm ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           AV44FilterFullText ,
                                           Short.valueOf(A13871PrdDiasIna) ,
                                           A13877PrdLastTip ,
                                           Short.valueOf(AV24TFPrdDiasInactivo) ,
                                           Short.valueOf(AV25TFPrdDiasInactivo_To) ,
                                           AV53TFPrdLastFechCC ,
                                           A13876PrdLastFec ,
                                           AV58TFPrdLastTipMovCC_Sel ,
                                           AV57TFPrdLastTipMovCC ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           Integer.valueOf(AV49Prvnum_to) ,
                                           Short.valueOf(AV50Dias) ,
                                           AV45Emprcod ,
                                           AV46Prdnum ,
                                           A396EmprCod ,
                                           AV47Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV10TFPrdNum = GXutil.padr( GXutil.rtrim( AV10TFPrdNum), 6, "%") ;
      lV12TFPrdNom = GXutil.padr( GXutil.rtrim( AV12TFPrdNom), 26, "%") ;
      lV16TFPrvNom = GXutil.padr( GXutil.rtrim( AV16TFPrvNom), 30, "%") ;
      lV61TFPrdUcpDsc = GXutil.padr( GXutil.rtrim( AV61TFPrdUcpDsc), 8, "%") ;
      /* Using cursor P09736 */
      pr_default.execute(4, new Object[] {AV45Emprcod, AV46Prdnum, Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49Prvnum_to), AV47Prdnum_to, lV10TFPrdNum, AV11TFPrdNum_Sel, lV12TFPrdNom, AV13TFPrdNom_Sel, Integer.valueOf(AV14TFPrvNum), Integer.valueOf(AV15TFPrvNum_To), lV16TFPrvNom, AV17TFPrvNom_Sel, AV18TFPrdExiAlm, AV19TFPrdExiAlm_To, lV61TFPrdUcpDsc, AV62TFPrdUcpDsc_Sel, AV59TFPrdPreAct, AV60TFPrdPreAct_To});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A742PrdUniCom = P09736_A742PrdUniCom[0] ;
         A724PrdPreAct = P09736_A724PrdPreAct[0] ;
         A737PrdUcpDsc = P09736_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09736_n737PrdUcpDsc[0] ;
         A704PrdExiAlm = P09736_A704PrdExiAlm[0] ;
         A794PrvNom = P09736_A794PrvNom[0] ;
         n794PrvNom = P09736_n794PrvNom[0] ;
         A795PrvNum = P09736_A795PrvNum[0] ;
         A718PrdNom = P09736_A718PrdNom[0] ;
         A719PrdNum = P09736_A719PrdNum[0] ;
         A396EmprCod = P09736_A396EmprCod[0] ;
         A794PrvNom = P09736_A794PrvNom[0] ;
         n794PrvNom = P09736_n794PrvNom[0] ;
         A737PrdUcpDsc = P09736_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = P09736_n737PrdUcpDsc[0] ;
         GXt_int2 = A13871PrdDiasIna ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int5[0] = GXt_int2 ;
         new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
         controlproductossinmovimientos_wcgetfilterdata.this.A396EmprCod = GXv_char4[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.A719PrdNum = GXv_char3[0] ;
         controlproductossinmovimientos_wcgetfilterdata.this.GXt_int2 = GXv_int5[0] ;
         A13871PrdDiasIna = GXt_int2 ;
         if ( (0==AV24TFPrdDiasInactivo) || ( ( A13871PrdDiasIna >= AV24TFPrdDiasInactivo ) ) )
         {
            if ( (0==AV25TFPrdDiasInactivo_To) || ( ( A13871PrdDiasIna <= AV25TFPrdDiasInactivo_To ) ) )
            {
               if ( ( A13871PrdDiasIna >= AV50Dias ) || (0==AV50Dias) )
               {
                  GXt_int6 = A13873PrdUltMovC ;
                  GXv_int7[0] = GXt_int6 ;
                  new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int7) ;
                  controlproductossinmovimientos_wcgetfilterdata.this.GXt_int6 = GXv_int7[0] ;
                  A13873PrdUltMovC = GXt_int6 ;
                  A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                  if ( (GXutil.strcmp("", AV44FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13871PrdDiasIna, 4, 0) , GXutil.padr( "%" + AV44FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV44FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                  {
                     if ( ! ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) && ( ! (GXutil.strcmp("", AV57TFPrdLastTipMovCC)==0) ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV57TFPrdLastTipMovCC) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV58TFPrdLastTipMovCC_Sel)==0) || ( ( GXutil.strcmp(A13877PrdLastTip, AV58TFPrdLastTipMovCC_Sel) == 0 ) ) )
                        {
                           A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                           if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFPrdLastFechCC)) || ( (( GXutil.resetTime(A13876PrdLastFec).after( GXutil.resetTime( AV53TFPrdLastFechCC )) ) || ( GXutil.dateCompare(GXutil.resetTime(A13876PrdLastFec), GXutil.resetTime(AV53TFPrdLastFechCC)) )) ) )
                           {
                              if ( ! (GXutil.strcmp("", A13877PrdLastTip)==0) )
                              {
                                 AV30Option = A13877PrdLastTip ;
                                 AV29InsertIndex = 1 ;
                                 while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
                                 {
                                    AV29InsertIndex = (int)(AV29InsertIndex+1) ;
                                 }
                                 if ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) == 0 ) )
                                 {
                                    AV38count = GXutil.lval( (String)AV36OptionIndexes.elementAt(-1+AV29InsertIndex)) ;
                                    AV38count = (long)(AV38count+1) ;
                                    AV36OptionIndexes.removeItem(AV29InsertIndex);
                                    AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
                                 }
                                 else
                                 {
                                    AV31Options.add(AV30Option, AV29InsertIndex);
                                    AV36OptionIndexes.add("1", AV29InsertIndex);
                                 }
                              }
                              if ( AV31Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlproductossinmovimientos_wcgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = controlproductossinmovimientos_wcgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = controlproductossinmovimientos_wcgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public java.util.Date getPrdLastFec0( String E396EmprCod ,
                                         String E719PrdNum ,
                                         long E13873PrdUltMovC )
   {
      X3348CCStkFec = GXutil.nullDate() ;
      Gx_first = true ;
      /* Using cursor P09737 */
      pr_default.execute(5, new Object[] {E396EmprCod, E719PrdNum, Long.valueOf(E13873PrdUltMovC)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E719PrdNum, E719PrdNum) == 0 ) && ( P09737_A3342CCStkLin[0] == E13873PrdUltMovC ) )
         {
            X3348CCStkFec = P09737_A3348CCStkFec[0] ;
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      return X3348CCStkFec ;
   }

   public String getPrdLastTip0( String E396EmprCod ,
                                 String E719PrdNum ,
                                 long E13873PrdUltMovC )
   {
      X3345TipMovCc = "" ;
      Gx_first = true ;
      /* Using cursor P09738 */
      pr_default.execute(6, new Object[] {E396EmprCod, E719PrdNum, Long.valueOf(E13873PrdUltMovC)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         if ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E719PrdNum, E719PrdNum) == 0 ) && ( P09738_A3342CCStkLin[0] == E13873PrdUltMovC ) )
         {
            X3345TipMovCc = P09738_A3345TipMovCc[0] ;
            if (true) break;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      return X3345TipMovCc ;
   }

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
      AV44FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV16TFPrvNom = "" ;
      AV17TFPrvNom_Sel = "" ;
      AV18TFPrdExiAlm = DecimalUtil.ZERO ;
      AV19TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV61TFPrdUcpDsc = "" ;
      AV62TFPrdUcpDsc_Sel = "" ;
      AV59TFPrdPreAct = DecimalUtil.ZERO ;
      AV60TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV53TFPrdLastFechCC = GXutil.nullDate() ;
      AV57TFPrdLastTipMovCC = "" ;
      AV58TFPrdLastTipMovCC_Sel = "" ;
      AV45Emprcod = "" ;
      AV46Prdnum = "" ;
      AV47Prdnum_to = "" ;
      scmdbuf = "" ;
      lV10TFPrdNum = "" ;
      lV12TFPrdNom = "" ;
      lV16TFPrvNom = "" ;
      lV61TFPrdUcpDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A737PrdUcpDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A13877PrdLastTip = "" ;
      A13876PrdLastFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09732_A742PrdUniCom = new byte[1] ;
      P09732_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09732_A737PrdUcpDsc = new String[] {""} ;
      P09732_n737PrdUcpDsc = new boolean[] {false} ;
      P09732_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09732_A794PrvNom = new String[] {""} ;
      P09732_n794PrvNom = new boolean[] {false} ;
      P09732_A795PrvNum = new int[1] ;
      P09732_A718PrdNom = new String[] {""} ;
      P09732_A719PrdNum = new String[] {""} ;
      P09732_A396EmprCod = new String[] {""} ;
      AV30Option = "" ;
      P09733_A742PrdUniCom = new byte[1] ;
      P09733_A718PrdNom = new String[] {""} ;
      P09733_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09733_A737PrdUcpDsc = new String[] {""} ;
      P09733_n737PrdUcpDsc = new boolean[] {false} ;
      P09733_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09733_A794PrvNom = new String[] {""} ;
      P09733_n794PrvNom = new boolean[] {false} ;
      P09733_A795PrvNum = new int[1] ;
      P09733_A719PrdNum = new String[] {""} ;
      P09733_A396EmprCod = new String[] {""} ;
      P09734_A742PrdUniCom = new byte[1] ;
      P09734_A795PrvNum = new int[1] ;
      P09734_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09734_A737PrdUcpDsc = new String[] {""} ;
      P09734_n737PrdUcpDsc = new boolean[] {false} ;
      P09734_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09734_A794PrvNom = new String[] {""} ;
      P09734_n794PrvNom = new boolean[] {false} ;
      P09734_A718PrdNom = new String[] {""} ;
      P09734_A719PrdNum = new String[] {""} ;
      P09734_A396EmprCod = new String[] {""} ;
      P09735_A742PrdUniCom = new byte[1] ;
      P09735_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09735_A737PrdUcpDsc = new String[] {""} ;
      P09735_n737PrdUcpDsc = new boolean[] {false} ;
      P09735_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09735_A794PrvNom = new String[] {""} ;
      P09735_n794PrvNom = new boolean[] {false} ;
      P09735_A795PrvNum = new int[1] ;
      P09735_A718PrdNom = new String[] {""} ;
      P09735_A719PrdNum = new String[] {""} ;
      P09735_A396EmprCod = new String[] {""} ;
      P09736_A742PrdUniCom = new byte[1] ;
      P09736_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09736_A737PrdUcpDsc = new String[] {""} ;
      P09736_n737PrdUcpDsc = new boolean[] {false} ;
      P09736_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09736_A794PrvNom = new String[] {""} ;
      P09736_n794PrvNom = new boolean[] {false} ;
      P09736_A795PrvNum = new int[1] ;
      P09736_A718PrdNom = new String[] {""} ;
      P09736_A719PrdNum = new String[] {""} ;
      P09736_A396EmprCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_int7 = new long[1] ;
      X3348CCStkFec = GXutil.nullDate() ;
      E396EmprCod = "" ;
      E719PrdNum = "" ;
      P09737_A396EmprCod = new String[] {""} ;
      P09737_A719PrdNum = new String[] {""} ;
      P09737_A3342CCStkLin = new long[1] ;
      P09737_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      X3345TipMovCc = "" ;
      P09738_A396EmprCod = new String[] {""} ;
      P09738_A719PrdNum = new String[] {""} ;
      P09738_A3342CCStkLin = new long[1] ;
      P09738_A3345TipMovCc = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlproductossinmovimientos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09732_A742PrdUniCom, P09732_A724PrdPreAct, P09732_A737PrdUcpDsc, P09732_n737PrdUcpDsc, P09732_A704PrdExiAlm, P09732_A794PrvNom, P09732_n794PrvNom, P09732_A795PrvNum, P09732_A718PrdNom, P09732_A719PrdNum,
            P09732_A396EmprCod
            }
            , new Object[] {
            P09733_A742PrdUniCom, P09733_A718PrdNom, P09733_A724PrdPreAct, P09733_A737PrdUcpDsc, P09733_n737PrdUcpDsc, P09733_A704PrdExiAlm, P09733_A794PrvNom, P09733_n794PrvNom, P09733_A795PrvNum, P09733_A719PrdNum,
            P09733_A396EmprCod
            }
            , new Object[] {
            P09734_A742PrdUniCom, P09734_A795PrvNum, P09734_A724PrdPreAct, P09734_A737PrdUcpDsc, P09734_n737PrdUcpDsc, P09734_A704PrdExiAlm, P09734_A794PrvNom, P09734_n794PrvNom, P09734_A718PrdNom, P09734_A719PrdNum,
            P09734_A396EmprCod
            }
            , new Object[] {
            P09735_A742PrdUniCom, P09735_A724PrdPreAct, P09735_A737PrdUcpDsc, P09735_n737PrdUcpDsc, P09735_A704PrdExiAlm, P09735_A794PrvNom, P09735_n794PrvNom, P09735_A795PrvNum, P09735_A718PrdNom, P09735_A719PrdNum,
            P09735_A396EmprCod
            }
            , new Object[] {
            P09736_A742PrdUniCom, P09736_A724PrdPreAct, P09736_A737PrdUcpDsc, P09736_n737PrdUcpDsc, P09736_A704PrdExiAlm, P09736_A794PrvNom, P09736_n794PrvNom, P09736_A795PrvNum, P09736_A718PrdNom, P09736_A719PrdNum,
            P09736_A396EmprCod
            }
            , new Object[] {
            P09737_A396EmprCod, P09737_A719PrdNum, P09737_A3342CCStkLin, P09737_A3348CCStkFec
            }
            , new Object[] {
            P09738_A396EmprCod, P09738_A719PrdNum, P09738_A3342CCStkLin, P09738_A3345TipMovCc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A742PrdUniCom ;
   private short AV24TFPrdDiasInactivo ;
   private short AV25TFPrdDiasInactivo_To ;
   private short AV50Dias ;
   private short A13871PrdDiasIna ;
   private short GXt_int2 ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV65GXV1 ;
   private int AV14TFPrvNum ;
   private int AV15TFPrvNum_To ;
   private int AV48PrvNum ;
   private int AV49Prvnum_to ;
   private int A795PrvNum ;
   private int AV29InsertIndex ;
   private long A13873PrdUltMovC ;
   private long AV38count ;
   private long GXt_int6 ;
   private long GXv_int7[] ;
   private long E13873PrdUltMovC ;
   private java.math.BigDecimal AV18TFPrdExiAlm ;
   private java.math.BigDecimal AV19TFPrdExiAlm_To ;
   private java.math.BigDecimal AV59TFPrdPreAct ;
   private java.math.BigDecimal AV60TFPrdPreAct_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV16TFPrvNom ;
   private String AV17TFPrvNom_Sel ;
   private String AV61TFPrdUcpDsc ;
   private String AV62TFPrdUcpDsc_Sel ;
   private String AV57TFPrdLastTipMovCC ;
   private String AV58TFPrdLastTipMovCC_Sel ;
   private String AV45Emprcod ;
   private String AV46Prdnum ;
   private String AV47Prdnum_to ;
   private String scmdbuf ;
   private String lV10TFPrdNum ;
   private String lV12TFPrdNom ;
   private String lV16TFPrvNom ;
   private String lV61TFPrdUcpDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A737PrdUcpDsc ;
   private String A13877PrdLastTip ;
   private String A396EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String E396EmprCod ;
   private String E719PrdNum ;
   private String X3345TipMovCc ;
   private java.util.Date AV53TFPrdLastFechCC ;
   private java.util.Date A13876PrdLastFec ;
   private java.util.Date X3348CCStkFec ;
   private boolean returnInSub ;
   private boolean brk9732 ;
   private boolean n737PrdUcpDsc ;
   private boolean n794PrvNom ;
   private boolean brk9734 ;
   private boolean brk9736 ;
   private boolean brk9738 ;
   private boolean Gx_first ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09732_A742PrdUniCom ;
   private java.math.BigDecimal[] P09732_A724PrdPreAct ;
   private String[] P09732_A737PrdUcpDsc ;
   private boolean[] P09732_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P09732_A704PrdExiAlm ;
   private String[] P09732_A794PrvNom ;
   private boolean[] P09732_n794PrvNom ;
   private int[] P09732_A795PrvNum ;
   private String[] P09732_A718PrdNom ;
   private String[] P09732_A719PrdNum ;
   private String[] P09732_A396EmprCod ;
   private byte[] P09733_A742PrdUniCom ;
   private String[] P09733_A718PrdNom ;
   private java.math.BigDecimal[] P09733_A724PrdPreAct ;
   private String[] P09733_A737PrdUcpDsc ;
   private boolean[] P09733_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P09733_A704PrdExiAlm ;
   private String[] P09733_A794PrvNom ;
   private boolean[] P09733_n794PrvNom ;
   private int[] P09733_A795PrvNum ;
   private String[] P09733_A719PrdNum ;
   private String[] P09733_A396EmprCod ;
   private byte[] P09734_A742PrdUniCom ;
   private int[] P09734_A795PrvNum ;
   private java.math.BigDecimal[] P09734_A724PrdPreAct ;
   private String[] P09734_A737PrdUcpDsc ;
   private boolean[] P09734_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P09734_A704PrdExiAlm ;
   private String[] P09734_A794PrvNom ;
   private boolean[] P09734_n794PrvNom ;
   private String[] P09734_A718PrdNom ;
   private String[] P09734_A719PrdNum ;
   private String[] P09734_A396EmprCod ;
   private byte[] P09735_A742PrdUniCom ;
   private java.math.BigDecimal[] P09735_A724PrdPreAct ;
   private String[] P09735_A737PrdUcpDsc ;
   private boolean[] P09735_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P09735_A704PrdExiAlm ;
   private String[] P09735_A794PrvNom ;
   private boolean[] P09735_n794PrvNom ;
   private int[] P09735_A795PrvNum ;
   private String[] P09735_A718PrdNom ;
   private String[] P09735_A719PrdNum ;
   private String[] P09735_A396EmprCod ;
   private byte[] P09736_A742PrdUniCom ;
   private java.math.BigDecimal[] P09736_A724PrdPreAct ;
   private String[] P09736_A737PrdUcpDsc ;
   private boolean[] P09736_n737PrdUcpDsc ;
   private java.math.BigDecimal[] P09736_A704PrdExiAlm ;
   private String[] P09736_A794PrvNom ;
   private boolean[] P09736_n794PrvNom ;
   private int[] P09736_A795PrvNum ;
   private String[] P09736_A718PrdNom ;
   private String[] P09736_A719PrdNum ;
   private String[] P09736_A396EmprCod ;
   private String[] P09737_A396EmprCod ;
   private String[] P09737_A719PrdNum ;
   private long[] P09737_A3342CCStkLin ;
   private java.util.Date[] P09737_A3348CCStkFec ;
   private String[] P09738_A396EmprCod ;
   private String[] P09738_A719PrdNum ;
   private long[] P09738_A3342CCStkLin ;
   private String[] P09738_A3345TipMovCc ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class controlproductossinmovimientos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09732( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFPrdNum_Sel ,
                                          String AV10TFPrdNum ,
                                          String AV13TFPrdNom_Sel ,
                                          String AV12TFPrdNom ,
                                          int AV14TFPrvNum ,
                                          int AV15TFPrvNum_To ,
                                          String AV17TFPrvNom_Sel ,
                                          String AV16TFPrvNom ,
                                          java.math.BigDecimal AV18TFPrdExiAlm ,
                                          java.math.BigDecimal AV19TFPrdExiAlm_To ,
                                          String AV62TFPrdUcpDsc_Sel ,
                                          String AV61TFPrdUcpDsc ,
                                          java.math.BigDecimal AV59TFPrdPreAct ,
                                          java.math.BigDecimal AV60TFPrdPreAct_To ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String AV44FilterFullText ,
                                          short A13871PrdDiasIna ,
                                          String A13877PrdLastTip ,
                                          short AV24TFPrdDiasInactivo ,
                                          short AV25TFPrdDiasInactivo_To ,
                                          java.util.Date AV53TFPrdLastFechCC ,
                                          java.util.Date A13876PrdLastFec ,
                                          String AV58TFPrdLastTipMovCC_Sel ,
                                          String AV57TFPrdLastTipMovCC ,
                                          int AV48PrvNum ,
                                          int AV49Prvnum_to ,
                                          short AV50Dias ,
                                          String AV45Emprcod ,
                                          String AV46Prdnum ,
                                          String A396EmprCod ,
                                          String AV47Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[19];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdExiAlm, T2.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T1.EmprCod FROM ((TXPPRODUC T1" ;
      scmdbuf += " INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdExiAlm > 0)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV14TFPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV15TFPrvNum_To) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFPrvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18TFPrdExiAlm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19TFPrdExiAlm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFPrdUcpDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPrdPreAct)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrdPreAct_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09733( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFPrdNum_Sel ,
                                          String AV10TFPrdNum ,
                                          String AV13TFPrdNom_Sel ,
                                          String AV12TFPrdNom ,
                                          int AV14TFPrvNum ,
                                          int AV15TFPrvNum_To ,
                                          String AV17TFPrvNom_Sel ,
                                          String AV16TFPrvNom ,
                                          java.math.BigDecimal AV18TFPrdExiAlm ,
                                          java.math.BigDecimal AV19TFPrdExiAlm_To ,
                                          String AV62TFPrdUcpDsc_Sel ,
                                          String AV61TFPrdUcpDsc ,
                                          java.math.BigDecimal AV59TFPrdPreAct ,
                                          java.math.BigDecimal AV60TFPrdPreAct_To ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String AV44FilterFullText ,
                                          short A13871PrdDiasIna ,
                                          String A13877PrdLastTip ,
                                          short AV24TFPrdDiasInactivo ,
                                          short AV25TFPrdDiasInactivo_To ,
                                          java.util.Date AV53TFPrdLastFechCC ,
                                          java.util.Date A13876PrdLastFec ,
                                          String AV58TFPrdLastTipMovCC_Sel ,
                                          String AV57TFPrdLastTipMovCC ,
                                          String AV46Prdnum ,
                                          String AV47Prdnum_to ,
                                          int AV48PrvNum ,
                                          int AV49Prvnum_to ,
                                          short AV50Dias ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[19];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdNom, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdExiAlm, T2.PrvNom, T1.PrvNum, T1.PrdNum, T1.EmprCod FROM ((TXPPRODUC T1" ;
      scmdbuf += " INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdExiAlm > 0)");
      if ( (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV14TFPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV15TFPrvNum_To) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFPrvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18TFPrdExiAlm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19TFPrdExiAlm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFPrdUcpDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPrdPreAct)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrdPreAct_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09734( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFPrdNum_Sel ,
                                          String AV10TFPrdNum ,
                                          String AV13TFPrdNom_Sel ,
                                          String AV12TFPrdNom ,
                                          int AV14TFPrvNum ,
                                          int AV15TFPrvNum_To ,
                                          String AV17TFPrvNom_Sel ,
                                          String AV16TFPrvNom ,
                                          java.math.BigDecimal AV18TFPrdExiAlm ,
                                          java.math.BigDecimal AV19TFPrdExiAlm_To ,
                                          String AV62TFPrdUcpDsc_Sel ,
                                          String AV61TFPrdUcpDsc ,
                                          java.math.BigDecimal AV59TFPrdPreAct ,
                                          java.math.BigDecimal AV60TFPrdPreAct_To ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String AV44FilterFullText ,
                                          short A13871PrdDiasIna ,
                                          String A13877PrdLastTip ,
                                          short AV24TFPrdDiasInactivo ,
                                          short AV25TFPrdDiasInactivo_To ,
                                          java.util.Date AV53TFPrdLastFechCC ,
                                          java.util.Date A13876PrdLastFec ,
                                          String AV58TFPrdLastTipMovCC_Sel ,
                                          String AV57TFPrdLastTipMovCC ,
                                          String AV46Prdnum ,
                                          String AV47Prdnum_to ,
                                          short AV50Dias ,
                                          String AV45Emprcod ,
                                          int AV48PrvNum ,
                                          String A396EmprCod ,
                                          int AV49Prvnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[19];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrvNum, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdExiAlm, T2.PrvNom, T1.PrdNom, T1.PrdNum, T1.EmprCod FROM ((TXPPRODUC T1" ;
      scmdbuf += " INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(T1.PrdExiAlm > 0)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      if ( (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV14TFPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV15TFPrvNum_To) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFPrvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18TFPrdExiAlm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19TFPrdExiAlm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFPrdUcpDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPrdPreAct)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrdPreAct_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09735( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFPrdNum_Sel ,
                                          String AV10TFPrdNum ,
                                          String AV13TFPrdNom_Sel ,
                                          String AV12TFPrdNom ,
                                          int AV14TFPrvNum ,
                                          int AV15TFPrvNum_To ,
                                          String AV17TFPrvNom_Sel ,
                                          String AV16TFPrvNom ,
                                          java.math.BigDecimal AV18TFPrdExiAlm ,
                                          java.math.BigDecimal AV19TFPrdExiAlm_To ,
                                          String AV62TFPrdUcpDsc_Sel ,
                                          String AV61TFPrdUcpDsc ,
                                          java.math.BigDecimal AV59TFPrdPreAct ,
                                          java.math.BigDecimal AV60TFPrdPreAct_To ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String AV44FilterFullText ,
                                          short A13871PrdDiasIna ,
                                          String A13877PrdLastTip ,
                                          short AV24TFPrdDiasInactivo ,
                                          short AV25TFPrdDiasInactivo_To ,
                                          java.util.Date AV53TFPrdLastFechCC ,
                                          java.util.Date A13876PrdLastFec ,
                                          String AV58TFPrdLastTipMovCC_Sel ,
                                          String AV57TFPrdLastTipMovCC ,
                                          String AV46Prdnum ,
                                          String AV47Prdnum_to ,
                                          int AV48PrvNum ,
                                          int AV49Prvnum_to ,
                                          short AV50Dias ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[19];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdExiAlm, T2.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T1.EmprCod FROM ((TXPPRODUC T1" ;
      scmdbuf += " INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdExiAlm > 0)");
      if ( (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV14TFPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV15TFPrvNum_To) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFPrvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18TFPrdExiAlm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19TFPrdExiAlm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFPrdUcpDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPrdPreAct)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrdPreAct_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdUniCom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09736( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11TFPrdNum_Sel ,
                                          String AV10TFPrdNum ,
                                          String AV13TFPrdNom_Sel ,
                                          String AV12TFPrdNom ,
                                          int AV14TFPrvNum ,
                                          int AV15TFPrvNum_To ,
                                          String AV17TFPrvNom_Sel ,
                                          String AV16TFPrvNom ,
                                          java.math.BigDecimal AV18TFPrdExiAlm ,
                                          java.math.BigDecimal AV19TFPrdExiAlm_To ,
                                          String AV62TFPrdUcpDsc_Sel ,
                                          String AV61TFPrdUcpDsc ,
                                          java.math.BigDecimal AV59TFPrdPreAct ,
                                          java.math.BigDecimal AV60TFPrdPreAct_To ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String AV44FilterFullText ,
                                          short A13871PrdDiasIna ,
                                          String A13877PrdLastTip ,
                                          short AV24TFPrdDiasInactivo ,
                                          short AV25TFPrdDiasInactivo_To ,
                                          java.util.Date AV53TFPrdLastFechCC ,
                                          java.util.Date A13876PrdLastFec ,
                                          String AV58TFPrdLastTipMovCC_Sel ,
                                          String AV57TFPrdLastTipMovCC ,
                                          int AV48PrvNum ,
                                          int AV49Prvnum_to ,
                                          short AV50Dias ,
                                          String AV45Emprcod ,
                                          String AV46Prdnum ,
                                          String A396EmprCod ,
                                          String AV47Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[19];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdExiAlm, T2.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T1.EmprCod FROM ((TXPPRODUC T1" ;
      scmdbuf += " INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdExiAlm > 0)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV14TFPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (0==AV15TFPrvNum_To) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFPrvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFPrvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18TFPrdExiAlm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19TFPrdExiAlm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFPrdUcpDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFPrdUcpDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPrdPreAct)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFPrdPreAct_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P09732(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 1 :
                  return conditional_P09733(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 2 :
                  return conditional_P09734(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() );
            case 3 :
                  return conditional_P09735(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 4 :
                  return conditional_P09736(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09732", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09733", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09734", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09735", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09736", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09737", "SELECT EmprCod, PrdNum, CCStkLin, CCStkFec FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09738", "SELECT EmprCod, PrdNum, CCStkLin, TipMovCc FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

