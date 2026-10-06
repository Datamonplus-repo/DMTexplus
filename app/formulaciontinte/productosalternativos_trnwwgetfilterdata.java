package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class productosalternativos_trnwwgetfilterdata extends GXProcedure
{
   public productosalternativos_trnwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosalternativos_trnwwgetfilterdata.class ), "" );
   }

   public productosalternativos_trnwwgetfilterdata( int remoteHandle ,
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
      productosalternativos_trnwwgetfilterdata.this.aP5 = new String[] {""};
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
      productosalternativos_trnwwgetfilterdata.this.AV28DDOName = aP0;
      productosalternativos_trnwwgetfilterdata.this.AV29SearchTxt = aP1;
      productosalternativos_trnwwgetfilterdata.this.AV30SearchTxtTo = aP2;
      productosalternativos_trnwwgetfilterdata.this.aP3 = aP3;
      productosalternativos_trnwwgetfilterdata.this.aP4 = aP4;
      productosalternativos_trnwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PRDALTNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDALTNUMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PRDALTNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDALTNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PRVALTNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVALTNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_VALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADVALDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV31OptionsJson = AV18Options.toJSonString(false) ;
      AV32OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV21OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProductosAlternativos_TRNWWGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("FormulacionTinte.ProductosAlternativos_TRNWWGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM") == 0 )
         {
            AV36TFPrdAltNum = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM_SEL") == 0 )
         {
            AV37TFPrdAltNum_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM") == 0 )
         {
            AV38TFPrdAltNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM_SEL") == 0 )
         {
            AV39TFPrdAltNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNUM") == 0 )
         {
            AV42TFPrvAltNum = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFPrvAltNum_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM") == 0 )
         {
            AV44TFPrvAltNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM_SEL") == 0 )
         {
            AV45TFPrvAltNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTFAC") == 0 )
         {
            AV40TFPrdAltFac = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFPrdAltFac_To = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV14TFValDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV15TFValDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV29SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV34FilterFullText ;
      AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV10TFPrdNum ;
      AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV12TFPrdNom ;
      AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV36TFPrdAltNum ;
      AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV37TFPrdAltNum_Sel ;
      AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV38TFPrdAltNom ;
      AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV39TFPrdAltNom_Sel ;
      AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV42TFPrvAltNum ;
      AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV43TFPrvAltNum_To ;
      AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV44TFPrvAltNom ;
      AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV45TFPrvAltNom_Sel ;
      AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV40TFPrdAltFac ;
      AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV41TFPrdAltFac_To ;
      AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV14TFValDsc ;
      AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV15TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                           AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                           AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                           AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                           AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                           AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                           AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                           AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                           AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                           AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           A857ValDsc ,
                                           AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                           AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                           Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                           AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                           AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
      lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
      lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
      lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
      lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
      /* Using cursor P09E32 */
      pr_default.execute(0, new Object[] {AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9E32 = false ;
         A856ValCod = P09E32_A856ValCod[0] ;
         A719PrdNum = P09E32_A719PrdNum[0] ;
         A857ValDsc = P09E32_A857ValDsc[0] ;
         n857ValDsc = P09E32_n857ValDsc[0] ;
         A678PrdAltFac = P09E32_A678PrdAltFac[0] ;
         A680PrdAltNum = P09E32_A680PrdAltNum[0] ;
         A718PrdNom = P09E32_A718PrdNom[0] ;
         A679PrdAltNom = P09E32_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E32_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E32_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E32_n778PrvAltNum[0] ;
         A396EmprCod = P09E32_A396EmprCod[0] ;
         A856ValCod = P09E32_A856ValCod[0] ;
         A718PrdNom = P09E32_A718PrdNom[0] ;
         A857ValDsc = P09E32_A857ValDsc[0] ;
         n857ValDsc = P09E32_n857ValDsc[0] ;
         A679PrdAltNom = P09E32_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E32_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E32_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E32_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char5[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         productosalternativos_trnwwgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         productosalternativos_trnwwgetfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_trnwwgetfilterdata.this.GXt_char2 = GXv_char5[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  AV22count = 0 ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09E32_A719PrdNum[0], A719PrdNum) == 0 ) )
                  {
                     brk9E32 = false ;
                     A680PrdAltNum = P09E32_A680PrdAltNum[0] ;
                     A396EmprCod = P09E32_A396EmprCod[0] ;
                     AV22count = (long)(AV22count+1) ;
                     brk9E32 = true ;
                     pr_default.readNext(0);
                  }
                  if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
                  {
                     AV17Option = A719PrdNum ;
                     AV18Options.add(AV17Option, 0);
                     AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV18Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9E32 )
         {
            brk9E32 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV29SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV34FilterFullText ;
      AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV10TFPrdNum ;
      AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV12TFPrdNom ;
      AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV36TFPrdAltNum ;
      AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV37TFPrdAltNum_Sel ;
      AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV38TFPrdAltNom ;
      AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV39TFPrdAltNom_Sel ;
      AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV42TFPrvAltNum ;
      AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV43TFPrvAltNum_To ;
      AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV44TFPrvAltNom ;
      AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV45TFPrvAltNom_Sel ;
      AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV40TFPrdAltFac ;
      AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV41TFPrdAltFac_To ;
      AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV14TFValDsc ;
      AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV15TFValDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                           AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                           AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                           AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                           AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                           AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                           AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                           AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                           AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                           AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           A857ValDsc ,
                                           AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                           AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                           Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                           AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                           AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
      lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
      lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
      lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
      lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
      /* Using cursor P09E33 */
      pr_default.execute(1, new Object[] {AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9E34 = false ;
         A856ValCod = P09E33_A856ValCod[0] ;
         A718PrdNom = P09E33_A718PrdNom[0] ;
         A857ValDsc = P09E33_A857ValDsc[0] ;
         n857ValDsc = P09E33_n857ValDsc[0] ;
         A678PrdAltFac = P09E33_A678PrdAltFac[0] ;
         A680PrdAltNum = P09E33_A680PrdAltNum[0] ;
         A719PrdNum = P09E33_A719PrdNum[0] ;
         A679PrdAltNom = P09E33_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E33_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E33_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E33_n778PrvAltNum[0] ;
         A396EmprCod = P09E33_A396EmprCod[0] ;
         A856ValCod = P09E33_A856ValCod[0] ;
         A718PrdNom = P09E33_A718PrdNom[0] ;
         A857ValDsc = P09E33_A857ValDsc[0] ;
         n857ValDsc = P09E33_n857ValDsc[0] ;
         A679PrdAltNom = P09E33_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E33_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E33_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E33_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         productosalternativos_trnwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_trnwwgetfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  AV22count = 0 ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09E33_A718PrdNom[0], A718PrdNom) == 0 ) )
                  {
                     brk9E34 = false ;
                     A680PrdAltNum = P09E33_A680PrdAltNum[0] ;
                     A719PrdNum = P09E33_A719PrdNum[0] ;
                     A396EmprCod = P09E33_A396EmprCod[0] ;
                     AV22count = (long)(AV22count+1) ;
                     brk9E34 = true ;
                     pr_default.readNext(1);
                  }
                  if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
                  {
                     AV17Option = A718PrdNom ;
                     AV18Options.add(AV17Option, 0);
                     AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV18Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9E34 )
         {
            brk9E34 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDALTNUMOPTIONS' Routine */
      returnInSub = false ;
      AV36TFPrdAltNum = AV29SearchTxt ;
      AV37TFPrdAltNum_Sel = "" ;
      AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV34FilterFullText ;
      AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV10TFPrdNum ;
      AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV12TFPrdNom ;
      AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV36TFPrdAltNum ;
      AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV37TFPrdAltNum_Sel ;
      AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV38TFPrdAltNom ;
      AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV39TFPrdAltNom_Sel ;
      AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV42TFPrvAltNum ;
      AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV43TFPrvAltNum_To ;
      AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV44TFPrvAltNom ;
      AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV45TFPrvAltNom_Sel ;
      AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV40TFPrdAltFac ;
      AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV41TFPrdAltFac_To ;
      AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV14TFValDsc ;
      AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV15TFValDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                           AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                           AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                           AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                           AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                           AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                           AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                           AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                           AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                           AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           A857ValDsc ,
                                           AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                           AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                           Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                           AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                           AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
      lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
      lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
      lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
      lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
      /* Using cursor P09E34 */
      pr_default.execute(2, new Object[] {AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9E36 = false ;
         A856ValCod = P09E34_A856ValCod[0] ;
         A680PrdAltNum = P09E34_A680PrdAltNum[0] ;
         A857ValDsc = P09E34_A857ValDsc[0] ;
         n857ValDsc = P09E34_n857ValDsc[0] ;
         A678PrdAltFac = P09E34_A678PrdAltFac[0] ;
         A718PrdNom = P09E34_A718PrdNom[0] ;
         A719PrdNum = P09E34_A719PrdNum[0] ;
         A679PrdAltNom = P09E34_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E34_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E34_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E34_n778PrvAltNum[0] ;
         A396EmprCod = P09E34_A396EmprCod[0] ;
         A856ValCod = P09E34_A856ValCod[0] ;
         A718PrdNom = P09E34_A718PrdNom[0] ;
         A857ValDsc = P09E34_A857ValDsc[0] ;
         n857ValDsc = P09E34_n857ValDsc[0] ;
         A679PrdAltNom = P09E34_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E34_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E34_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E34_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         productosalternativos_trnwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_trnwwgetfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  AV22count = 0 ;
                  while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09E34_A680PrdAltNum[0], A680PrdAltNum) == 0 ) )
                  {
                     brk9E36 = false ;
                     A719PrdNum = P09E34_A719PrdNum[0] ;
                     A396EmprCod = P09E34_A396EmprCod[0] ;
                     AV22count = (long)(AV22count+1) ;
                     brk9E36 = true ;
                     pr_default.readNext(2);
                  }
                  if ( ! (GXutil.strcmp("", A680PrdAltNum)==0) )
                  {
                     AV17Option = A680PrdAltNum ;
                     AV18Options.add(AV17Option, 0);
                     AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV18Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9E36 )
         {
            brk9E36 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDALTNOMOPTIONS' Routine */
      returnInSub = false ;
      AV38TFPrdAltNom = AV29SearchTxt ;
      AV39TFPrdAltNom_Sel = "" ;
      AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV34FilterFullText ;
      AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV10TFPrdNum ;
      AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV12TFPrdNom ;
      AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV36TFPrdAltNum ;
      AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV37TFPrdAltNum_Sel ;
      AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV38TFPrdAltNom ;
      AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV39TFPrdAltNom_Sel ;
      AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV42TFPrvAltNum ;
      AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV43TFPrvAltNum_To ;
      AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV44TFPrvAltNom ;
      AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV45TFPrvAltNom_Sel ;
      AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV40TFPrdAltFac ;
      AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV41TFPrdAltFac_To ;
      AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV14TFValDsc ;
      AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV15TFValDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                           AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                           AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                           AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                           AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                           AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                           AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                           AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                           AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                           AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           A857ValDsc ,
                                           AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                           AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                           Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                           AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                           AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
      lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
      lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
      lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
      lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
      /* Using cursor P09E35 */
      pr_default.execute(3, new Object[] {AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A856ValCod = P09E35_A856ValCod[0] ;
         A857ValDsc = P09E35_A857ValDsc[0] ;
         n857ValDsc = P09E35_n857ValDsc[0] ;
         A678PrdAltFac = P09E35_A678PrdAltFac[0] ;
         A680PrdAltNum = P09E35_A680PrdAltNum[0] ;
         A718PrdNom = P09E35_A718PrdNom[0] ;
         A719PrdNum = P09E35_A719PrdNum[0] ;
         A679PrdAltNom = P09E35_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E35_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E35_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E35_n778PrvAltNum[0] ;
         A396EmprCod = P09E35_A396EmprCod[0] ;
         A856ValCod = P09E35_A856ValCod[0] ;
         A718PrdNom = P09E35_A718PrdNom[0] ;
         A857ValDsc = P09E35_A857ValDsc[0] ;
         n857ValDsc = P09E35_n857ValDsc[0] ;
         A679PrdAltNom = P09E35_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E35_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E35_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E35_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         productosalternativos_trnwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_trnwwgetfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A679PrdAltNom)==0) )
                  {
                     AV17Option = A679PrdAltNom ;
                     AV16InsertIndex = 1 ;
                     while ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) < 0 ) )
                     {
                        AV16InsertIndex = (int)(AV16InsertIndex+1) ;
                     }
                     if ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) == 0 ) )
                     {
                        AV22count = GXutil.lval( (String)AV21OptionIndexes.elementAt(-1+AV16InsertIndex)) ;
                        AV22count = (long)(AV22count+1) ;
                        AV21OptionIndexes.removeItem(AV16InsertIndex);
                        AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), AV16InsertIndex);
                     }
                     else
                     {
                        AV18Options.add(AV17Option, AV16InsertIndex);
                        AV21OptionIndexes.add("1", AV16InsertIndex);
                     }
                  }
                  if ( AV18Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRVALTNOMOPTIONS' Routine */
      returnInSub = false ;
      AV44TFPrvAltNom = AV29SearchTxt ;
      AV45TFPrvAltNom_Sel = "" ;
      AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV34FilterFullText ;
      AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV10TFPrdNum ;
      AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV12TFPrdNom ;
      AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV36TFPrdAltNum ;
      AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV37TFPrdAltNum_Sel ;
      AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV38TFPrdAltNom ;
      AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV39TFPrdAltNom_Sel ;
      AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV42TFPrvAltNum ;
      AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV43TFPrvAltNum_To ;
      AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV44TFPrvAltNom ;
      AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV45TFPrvAltNom_Sel ;
      AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV40TFPrdAltFac ;
      AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV41TFPrdAltFac_To ;
      AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV14TFValDsc ;
      AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV15TFValDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                           AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                           AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                           AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                           AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                           AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                           AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                           AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                           AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                           AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           A857ValDsc ,
                                           AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                           AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                           Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                           AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                           AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
      lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
      lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
      lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
      lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
      /* Using cursor P09E36 */
      pr_default.execute(4, new Object[] {AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A856ValCod = P09E36_A856ValCod[0] ;
         A857ValDsc = P09E36_A857ValDsc[0] ;
         n857ValDsc = P09E36_n857ValDsc[0] ;
         A678PrdAltFac = P09E36_A678PrdAltFac[0] ;
         A680PrdAltNum = P09E36_A680PrdAltNum[0] ;
         A718PrdNom = P09E36_A718PrdNom[0] ;
         A719PrdNum = P09E36_A719PrdNum[0] ;
         A679PrdAltNom = P09E36_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E36_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E36_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E36_n778PrvAltNum[0] ;
         A396EmprCod = P09E36_A396EmprCod[0] ;
         A856ValCod = P09E36_A856ValCod[0] ;
         A718PrdNom = P09E36_A718PrdNom[0] ;
         A857ValDsc = P09E36_A857ValDsc[0] ;
         n857ValDsc = P09E36_n857ValDsc[0] ;
         A679PrdAltNom = P09E36_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E36_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E36_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E36_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         productosalternativos_trnwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_trnwwgetfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A777PrvAltNom)==0) )
                  {
                     AV17Option = A777PrvAltNom ;
                     AV16InsertIndex = 1 ;
                     while ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) < 0 ) )
                     {
                        AV16InsertIndex = (int)(AV16InsertIndex+1) ;
                     }
                     if ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) == 0 ) )
                     {
                        AV22count = GXutil.lval( (String)AV21OptionIndexes.elementAt(-1+AV16InsertIndex)) ;
                        AV22count = (long)(AV22count+1) ;
                        AV21OptionIndexes.removeItem(AV16InsertIndex);
                        AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), AV16InsertIndex);
                     }
                     else
                     {
                        AV18Options.add(AV17Option, AV16InsertIndex);
                        AV21OptionIndexes.add("1", AV16InsertIndex);
                     }
                  }
                  if ( AV18Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFValDsc = AV29SearchTxt ;
      AV15TFValDsc_Sel = "" ;
      AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = AV34FilterFullText ;
      AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = AV10TFPrdNum ;
      AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = AV12TFPrdNom ;
      AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = AV36TFPrdAltNum ;
      AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = AV37TFPrdAltNum_Sel ;
      AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = AV38TFPrdAltNom ;
      AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = AV39TFPrdAltNom_Sel ;
      AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum = AV42TFPrvAltNum ;
      AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to = AV43TFPrvAltNum_To ;
      AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = AV44TFPrvAltNom ;
      AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = AV45TFPrvAltNom_Sel ;
      AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = AV40TFPrdAltFac ;
      AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = AV41TFPrdAltFac_To ;
      AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = AV14TFValDsc ;
      AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = AV15TFValDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                           AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                           AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                           AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                           AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                           AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                           AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                           AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                           AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                           AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           A857ValDsc ,
                                           AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                           AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                           Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to) ,
                                           AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                           AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom), 26, "%") ;
      lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum), 6, "%") ;
      lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom), 26, "%") ;
      lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum), 6, "%") ;
      lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc), 16, "%") ;
      /* Using cursor P09E37 */
      pr_default.execute(5, new Object[] {AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel, Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), Integer.valueOf(AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to), lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum, AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel, lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom, AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel, lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum, AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to, lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc, AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9E310 = false ;
         A856ValCod = P09E37_A856ValCod[0] ;
         A857ValDsc = P09E37_A857ValDsc[0] ;
         n857ValDsc = P09E37_n857ValDsc[0] ;
         A678PrdAltFac = P09E37_A678PrdAltFac[0] ;
         A680PrdAltNum = P09E37_A680PrdAltNum[0] ;
         A718PrdNom = P09E37_A718PrdNom[0] ;
         A719PrdNum = P09E37_A719PrdNum[0] ;
         A679PrdAltNom = P09E37_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E37_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E37_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E37_n778PrvAltNum[0] ;
         A396EmprCod = P09E37_A396EmprCod[0] ;
         A856ValCod = P09E37_A856ValCod[0] ;
         A718PrdNom = P09E37_A718PrdNom[0] ;
         A857ValDsc = P09E37_A857ValDsc[0] ;
         n857ValDsc = P09E37_n857ValDsc[0] ;
         A679PrdAltNom = P09E37_A679PrdAltNom[0] ;
         n679PrdAltNom = P09E37_n679PrdAltNom[0] ;
         A778PrvAltNum = P09E37_A778PrvAltNum[0] ;
         n778PrvAltNum = P09E37_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         productosalternativos_trnwwgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_trnwwgetfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_trnwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  AV22count = 0 ;
                  while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09E37_A857ValDsc[0], A857ValDsc) == 0 ) )
                  {
                     brk9E310 = false ;
                     A856ValCod = P09E37_A856ValCod[0] ;
                     A680PrdAltNum = P09E37_A680PrdAltNum[0] ;
                     A719PrdNum = P09E37_A719PrdNum[0] ;
                     A396EmprCod = P09E37_A396EmprCod[0] ;
                     A856ValCod = P09E37_A856ValCod[0] ;
                     AV22count = (long)(AV22count+1) ;
                     brk9E310 = true ;
                     pr_default.readNext(5);
                  }
                  if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
                  {
                     AV17Option = A857ValDsc ;
                     AV18Options.add(AV17Option, 0);
                     AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV18Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9E310 )
         {
            brk9E310 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = productosalternativos_trnwwgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = productosalternativos_trnwwgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = productosalternativos_trnwwgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31OptionsJson = "" ;
      AV32OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV36TFPrdAltNum = "" ;
      AV37TFPrdAltNum_Sel = "" ;
      AV38TFPrdAltNom = "" ;
      AV39TFPrdAltNom_Sel = "" ;
      AV44TFPrvAltNom = "" ;
      AV45TFPrvAltNom_Sel = "" ;
      AV40TFPrdAltFac = DecimalUtil.ZERO ;
      AV41TFPrdAltFac_To = DecimalUtil.ZERO ;
      AV14TFValDsc = "" ;
      AV15TFValDsc_Sel = "" ;
      A719PrdNum = "" ;
      AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = "" ;
      AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = "" ;
      AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel = "" ;
      AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = "" ;
      AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel = "" ;
      AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = "" ;
      AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel = "" ;
      AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = "" ;
      AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel = "" ;
      AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom = "" ;
      AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel = "" ;
      AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac = DecimalUtil.ZERO ;
      AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to = DecimalUtil.ZERO ;
      AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = "" ;
      AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel = "" ;
      lV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom = "" ;
      lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum = "" ;
      lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom = "" ;
      lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum = "" ;
      lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc = "" ;
      A718PrdNom = "" ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A679PrdAltNom = "" ;
      A777PrvAltNom = "" ;
      P09E32_A856ValCod = new byte[1] ;
      P09E32_A719PrdNum = new String[] {""} ;
      P09E32_A857ValDsc = new String[] {""} ;
      P09E32_n857ValDsc = new boolean[] {false} ;
      P09E32_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09E32_A680PrdAltNum = new String[] {""} ;
      P09E32_A718PrdNom = new String[] {""} ;
      P09E32_A679PrdAltNom = new String[] {""} ;
      P09E32_n679PrdAltNom = new boolean[] {false} ;
      P09E32_A778PrvAltNum = new int[1] ;
      P09E32_n778PrvAltNum = new boolean[] {false} ;
      P09E32_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV17Option = "" ;
      P09E33_A856ValCod = new byte[1] ;
      P09E33_A718PrdNom = new String[] {""} ;
      P09E33_A857ValDsc = new String[] {""} ;
      P09E33_n857ValDsc = new boolean[] {false} ;
      P09E33_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09E33_A680PrdAltNum = new String[] {""} ;
      P09E33_A719PrdNum = new String[] {""} ;
      P09E33_A679PrdAltNom = new String[] {""} ;
      P09E33_n679PrdAltNom = new boolean[] {false} ;
      P09E33_A778PrvAltNum = new int[1] ;
      P09E33_n778PrvAltNum = new boolean[] {false} ;
      P09E33_A396EmprCod = new String[] {""} ;
      P09E34_A856ValCod = new byte[1] ;
      P09E34_A680PrdAltNum = new String[] {""} ;
      P09E34_A857ValDsc = new String[] {""} ;
      P09E34_n857ValDsc = new boolean[] {false} ;
      P09E34_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09E34_A718PrdNom = new String[] {""} ;
      P09E34_A719PrdNum = new String[] {""} ;
      P09E34_A679PrdAltNom = new String[] {""} ;
      P09E34_n679PrdAltNom = new boolean[] {false} ;
      P09E34_A778PrvAltNum = new int[1] ;
      P09E34_n778PrvAltNum = new boolean[] {false} ;
      P09E34_A396EmprCod = new String[] {""} ;
      P09E35_A856ValCod = new byte[1] ;
      P09E35_A857ValDsc = new String[] {""} ;
      P09E35_n857ValDsc = new boolean[] {false} ;
      P09E35_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09E35_A680PrdAltNum = new String[] {""} ;
      P09E35_A718PrdNom = new String[] {""} ;
      P09E35_A719PrdNum = new String[] {""} ;
      P09E35_A679PrdAltNom = new String[] {""} ;
      P09E35_n679PrdAltNom = new boolean[] {false} ;
      P09E35_A778PrvAltNum = new int[1] ;
      P09E35_n778PrvAltNum = new boolean[] {false} ;
      P09E35_A396EmprCod = new String[] {""} ;
      P09E36_A856ValCod = new byte[1] ;
      P09E36_A857ValDsc = new String[] {""} ;
      P09E36_n857ValDsc = new boolean[] {false} ;
      P09E36_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09E36_A680PrdAltNum = new String[] {""} ;
      P09E36_A718PrdNom = new String[] {""} ;
      P09E36_A719PrdNum = new String[] {""} ;
      P09E36_A679PrdAltNom = new String[] {""} ;
      P09E36_n679PrdAltNom = new boolean[] {false} ;
      P09E36_A778PrvAltNum = new int[1] ;
      P09E36_n778PrvAltNum = new boolean[] {false} ;
      P09E36_A396EmprCod = new String[] {""} ;
      P09E37_A856ValCod = new byte[1] ;
      P09E37_A857ValDsc = new String[] {""} ;
      P09E37_n857ValDsc = new boolean[] {false} ;
      P09E37_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09E37_A680PrdAltNum = new String[] {""} ;
      P09E37_A718PrdNom = new String[] {""} ;
      P09E37_A719PrdNum = new String[] {""} ;
      P09E37_A679PrdAltNom = new String[] {""} ;
      P09E37_n679PrdAltNom = new boolean[] {false} ;
      P09E37_A778PrvAltNum = new int[1] ;
      P09E37_n778PrvAltNum = new boolean[] {false} ;
      P09E37_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_trnwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09E32_A856ValCod, P09E32_A719PrdNum, P09E32_A857ValDsc, P09E32_n857ValDsc, P09E32_A678PrdAltFac, P09E32_A680PrdAltNum, P09E32_A718PrdNom, P09E32_A679PrdAltNom, P09E32_n679PrdAltNom, P09E32_A778PrvAltNum,
            P09E32_n778PrvAltNum, P09E32_A396EmprCod
            }
            , new Object[] {
            P09E33_A856ValCod, P09E33_A718PrdNom, P09E33_A857ValDsc, P09E33_n857ValDsc, P09E33_A678PrdAltFac, P09E33_A680PrdAltNum, P09E33_A719PrdNum, P09E33_A679PrdAltNom, P09E33_n679PrdAltNom, P09E33_A778PrvAltNum,
            P09E33_n778PrvAltNum, P09E33_A396EmprCod
            }
            , new Object[] {
            P09E34_A856ValCod, P09E34_A680PrdAltNum, P09E34_A857ValDsc, P09E34_n857ValDsc, P09E34_A678PrdAltFac, P09E34_A718PrdNom, P09E34_A719PrdNum, P09E34_A679PrdAltNom, P09E34_n679PrdAltNom, P09E34_A778PrvAltNum,
            P09E34_n778PrvAltNum, P09E34_A396EmprCod
            }
            , new Object[] {
            P09E35_A856ValCod, P09E35_A857ValDsc, P09E35_n857ValDsc, P09E35_A678PrdAltFac, P09E35_A680PrdAltNum, P09E35_A718PrdNom, P09E35_A719PrdNum, P09E35_A679PrdAltNom, P09E35_n679PrdAltNom, P09E35_A778PrvAltNum,
            P09E35_n778PrvAltNum, P09E35_A396EmprCod
            }
            , new Object[] {
            P09E36_A856ValCod, P09E36_A857ValDsc, P09E36_n857ValDsc, P09E36_A678PrdAltFac, P09E36_A680PrdAltNum, P09E36_A718PrdNom, P09E36_A719PrdNum, P09E36_A679PrdAltNom, P09E36_n679PrdAltNom, P09E36_A778PrvAltNum,
            P09E36_n778PrvAltNum, P09E36_A396EmprCod
            }
            , new Object[] {
            P09E37_A856ValCod, P09E37_A857ValDsc, P09E37_n857ValDsc, P09E37_A678PrdAltFac, P09E37_A680PrdAltNum, P09E37_A718PrdNom, P09E37_A719PrdNum, P09E37_A679PrdAltNom, P09E37_n679PrdAltNom, P09E37_A778PrvAltNum,
            P09E37_n778PrvAltNum, P09E37_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private int AV42TFPrvAltNum ;
   private int AV43TFPrvAltNum_To ;
   private int AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ;
   private int AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ;
   private int A778PrvAltNum ;
   private int AV16InsertIndex ;
   private int GXv_int4[] ;
   private long AV22count ;
   private java.math.BigDecimal AV40TFPrdAltFac ;
   private java.math.BigDecimal AV41TFPrdAltFac_To ;
   private java.math.BigDecimal AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ;
   private java.math.BigDecimal AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ;
   private java.math.BigDecimal A678PrdAltFac ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV36TFPrdAltNum ;
   private String AV37TFPrdAltNum_Sel ;
   private String AV38TFPrdAltNom ;
   private String AV39TFPrdAltNom_Sel ;
   private String AV44TFPrvAltNom ;
   private String AV45TFPrvAltNom_Sel ;
   private String AV14TFValDsc ;
   private String AV15TFValDsc_Sel ;
   private String A719PrdNum ;
   private String AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ;
   private String AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ;
   private String AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ;
   private String AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ;
   private String AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ;
   private String AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ;
   private String AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ;
   private String AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ;
   private String AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom ;
   private String AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ;
   private String AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ;
   private String AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ;
   private String lV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ;
   private String lV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ;
   private String lV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ;
   private String lV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ;
   private String A718PrdNom ;
   private String A680PrdAltNum ;
   private String A857ValDsc ;
   private String A679PrdAltNom ;
   private String A777PrvAltNom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean brk9E32 ;
   private boolean n857ValDsc ;
   private boolean n679PrdAltNom ;
   private boolean n778PrvAltNum ;
   private boolean brk9E34 ;
   private boolean brk9E36 ;
   private boolean brk9E310 ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ;
   private String lV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ;
   private String AV17Option ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09E32_A856ValCod ;
   private String[] P09E32_A719PrdNum ;
   private String[] P09E32_A857ValDsc ;
   private boolean[] P09E32_n857ValDsc ;
   private java.math.BigDecimal[] P09E32_A678PrdAltFac ;
   private String[] P09E32_A680PrdAltNum ;
   private String[] P09E32_A718PrdNom ;
   private String[] P09E32_A679PrdAltNom ;
   private boolean[] P09E32_n679PrdAltNom ;
   private int[] P09E32_A778PrvAltNum ;
   private boolean[] P09E32_n778PrvAltNum ;
   private String[] P09E32_A396EmprCod ;
   private byte[] P09E33_A856ValCod ;
   private String[] P09E33_A718PrdNom ;
   private String[] P09E33_A857ValDsc ;
   private boolean[] P09E33_n857ValDsc ;
   private java.math.BigDecimal[] P09E33_A678PrdAltFac ;
   private String[] P09E33_A680PrdAltNum ;
   private String[] P09E33_A719PrdNum ;
   private String[] P09E33_A679PrdAltNom ;
   private boolean[] P09E33_n679PrdAltNom ;
   private int[] P09E33_A778PrvAltNum ;
   private boolean[] P09E33_n778PrvAltNum ;
   private String[] P09E33_A396EmprCod ;
   private byte[] P09E34_A856ValCod ;
   private String[] P09E34_A680PrdAltNum ;
   private String[] P09E34_A857ValDsc ;
   private boolean[] P09E34_n857ValDsc ;
   private java.math.BigDecimal[] P09E34_A678PrdAltFac ;
   private String[] P09E34_A718PrdNom ;
   private String[] P09E34_A719PrdNum ;
   private String[] P09E34_A679PrdAltNom ;
   private boolean[] P09E34_n679PrdAltNom ;
   private int[] P09E34_A778PrvAltNum ;
   private boolean[] P09E34_n778PrvAltNum ;
   private String[] P09E34_A396EmprCod ;
   private byte[] P09E35_A856ValCod ;
   private String[] P09E35_A857ValDsc ;
   private boolean[] P09E35_n857ValDsc ;
   private java.math.BigDecimal[] P09E35_A678PrdAltFac ;
   private String[] P09E35_A680PrdAltNum ;
   private String[] P09E35_A718PrdNom ;
   private String[] P09E35_A719PrdNum ;
   private String[] P09E35_A679PrdAltNom ;
   private boolean[] P09E35_n679PrdAltNom ;
   private int[] P09E35_A778PrvAltNum ;
   private boolean[] P09E35_n778PrvAltNum ;
   private String[] P09E35_A396EmprCod ;
   private byte[] P09E36_A856ValCod ;
   private String[] P09E36_A857ValDsc ;
   private boolean[] P09E36_n857ValDsc ;
   private java.math.BigDecimal[] P09E36_A678PrdAltFac ;
   private String[] P09E36_A680PrdAltNum ;
   private String[] P09E36_A718PrdNom ;
   private String[] P09E36_A719PrdNum ;
   private String[] P09E36_A679PrdAltNom ;
   private boolean[] P09E36_n679PrdAltNom ;
   private int[] P09E36_A778PrvAltNum ;
   private boolean[] P09E36_n778PrvAltNum ;
   private String[] P09E36_A396EmprCod ;
   private byte[] P09E37_A856ValCod ;
   private String[] P09E37_A857ValDsc ;
   private boolean[] P09E37_n857ValDsc ;
   private java.math.BigDecimal[] P09E37_A678PrdAltFac ;
   private String[] P09E37_A680PrdAltNum ;
   private String[] P09E37_A718PrdNom ;
   private String[] P09E37_A719PrdNum ;
   private String[] P09E37_A679PrdAltNom ;
   private boolean[] P09E37_n679PrdAltNom ;
   private int[] P09E37_A778PrvAltNum ;
   private boolean[] P09E37_n778PrvAltNum ;
   private String[] P09E37_A396EmprCod ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class productosalternativos_trnwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09E32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          String AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[19];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T1.PrdNum, T3.ValDsc, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum, T1.EmprCod" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09E33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          String AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[19];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T2.PrdNom, T3.ValDsc, T1.PrdAltFac, T1.PrdAltNum, T1.PrdNum, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum, T1.EmprCod" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09E34( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          String AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[19];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T1.PrdAltNum, T3.ValDsc, T1.PrdAltFac, T2.PrdNom, T1.PrdNum, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum, T1.EmprCod" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdAltNum" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09E35( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          String AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[19];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T3.ValDsc, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum, T1.EmprCod" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAltNum" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09E36( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          String AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[19];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T3.ValDsc, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum, T1.EmprCod" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdAltNum" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09E37( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel ,
                                          String AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum ,
                                          String AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel ,
                                          String AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom ,
                                          String AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel ,
                                          String AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to ,
                                          String AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel ,
                                          String AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          String A857ValDsc ,
                                          String AV50Formulaciontinte_productosalternativos_trnwwds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV58Formulaciontinte_productosalternativos_trnwwds_9_tfprdaltnom_sel ,
                                          String AV57Formulaciontinte_productosalternativos_trnwwds_8_tfprdaltnom ,
                                          int AV59Formulaciontinte_productosalternativos_trnwwds_10_tfprvaltnum ,
                                          int AV60Formulaciontinte_productosalternativos_trnwwds_11_tfprvaltnum_to ,
                                          String AV62Formulaciontinte_productosalternativos_trnwwds_13_tfprvaltnom_sel ,
                                          String AV61Formulaciontinte_productosalternativos_trnwwds_12_tfprvaltnom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[19];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T2.ValCod, T3.ValDsc, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T4.PrdNom, ' ') AS PrdAltNom, COALESCE( T4.PrvNum, 0) AS PrvAltNum, T1.EmprCod" ;
      scmdbuf += " FROM (((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      scmdbuf += " = T2.ValCod) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_productosalternativos_trnwwds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_productosalternativos_trnwwds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_trnwwds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_trnwwds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_trnwwds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_trnwwds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_productosalternativos_trnwwds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Formulaciontinte_productosalternativos_trnwwds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_trnwwds_16_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_productosalternativos_trnwwds_17_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.ValDsc" ;
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
                  return conditional_P09E32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P09E33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P09E34(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 3 :
                  return conditional_P09E35(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 4 :
                  return conditional_P09E36(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 5 :
                  return conditional_P09E37(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09E32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09E33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09E34", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09E35", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09E36", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09E37", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
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
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               return;
      }
   }

}

