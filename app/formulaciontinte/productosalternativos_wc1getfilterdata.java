package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class productosalternativos_wc1getfilterdata extends GXProcedure
{
   public productosalternativos_wc1getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosalternativos_wc1getfilterdata.class ), "" );
   }

   public productosalternativos_wc1getfilterdata( int remoteHandle ,
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
      productosalternativos_wc1getfilterdata.this.aP5 = new String[] {""};
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
      productosalternativos_wc1getfilterdata.this.AV28DDOName = aP0;
      productosalternativos_wc1getfilterdata.this.AV26SearchTxt = aP1;
      productosalternativos_wc1getfilterdata.this.AV27SearchTxtTo = aP2;
      productosalternativos_wc1getfilterdata.this.aP3 = aP3;
      productosalternativos_wc1getfilterdata.this.aP4 = aP4;
      productosalternativos_wc1getfilterdata.this.aP5 = aP5;
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
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("FormulacionTinte.ProductosAlternativos_WC1GridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProductosAlternativos_WC1GridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("FormulacionTinte.ProductosAlternativos_WC1GridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
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
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM") == 0 )
         {
            AV14TFPrdAltNum = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNUM_SEL") == 0 )
         {
            AV15TFPrdAltNum_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM") == 0 )
         {
            AV16TFPrdAltNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTNOM_SEL") == 0 )
         {
            AV17TFPrdAltNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNUM") == 0 )
         {
            AV18TFPrvAltNum = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFPrvAltNum_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM") == 0 )
         {
            AV20TFPrvAltNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVALTNOM_SEL") == 0 )
         {
            AV21TFPrvAltNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTFAC") == 0 )
         {
            AV22TFPrdAltFac = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPrdAltFac_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDALTCAM_SEL") == 0 )
         {
            AV48TFPrdAltCam_Sel = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV46Prdnumfrom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV47prdnumto = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV26SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = AV44FilterFullText ;
      AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = AV10TFPrdNum ;
      AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = AV12TFPrdNom ;
      AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = AV14TFPrdAltNum ;
      AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = AV15TFPrdAltNum_Sel ;
      AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = AV16TFPrdAltNom ;
      AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = AV17TFPrdAltNom_Sel ;
      AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum = AV18TFPrvAltNum ;
      AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to = AV19TFPrvAltNum_To ;
      AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = AV20TFPrvAltNom ;
      AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = AV21TFPrvAltNom_Sel ;
      AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = AV22TFPrdAltFac ;
      AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = AV23TFPrdAltFac_To ;
      AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel = AV48TFPrdAltCam_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                           AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                           AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                           AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                           AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                           AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                           AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                           AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                           Byte.valueOf(AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel) ,
                                           AV46Prdnumfrom ,
                                           AV47prdnumto ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           Byte.valueOf(A11718PrdAltCam) ,
                                           AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                           AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                           Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to) ,
                                           AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                           AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom), 26, "%") ;
      lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum), 6, "%") ;
      lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom), 26, "%") ;
      lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum), 6, "%") ;
      /* Using cursor P09EH2 */
      pr_default.execute(0, new Object[] {AV45Emprcod, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum, AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel, lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom, AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel, lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum, AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to, AV46Prdnumfrom, AV47prdnumto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9EH2 = false ;
         A719PrdNum = P09EH2_A719PrdNum[0] ;
         A11718PrdAltCam = P09EH2_A11718PrdAltCam[0] ;
         A678PrdAltFac = P09EH2_A678PrdAltFac[0] ;
         A680PrdAltNum = P09EH2_A680PrdAltNum[0] ;
         A718PrdNom = P09EH2_A718PrdNom[0] ;
         A679PrdAltNom = P09EH2_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH2_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH2_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH2_n778PrvAltNum[0] ;
         A396EmprCod = P09EH2_A396EmprCod[0] ;
         A718PrdNom = P09EH2_A718PrdNom[0] ;
         A679PrdAltNom = P09EH2_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH2_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH2_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH2_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char5[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         productosalternativos_wc1getfilterdata.this.A396EmprCod = GXv_char3[0] ;
         productosalternativos_wc1getfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_wc1getfilterdata.this.GXt_char2 = GXv_char5[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  AV38count = 0 ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09EH2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09EH2_A719PrdNum[0], A719PrdNum) == 0 ) )
                  {
                     brk9EH2 = false ;
                     A680PrdAltNum = P09EH2_A680PrdAltNum[0] ;
                     AV38count = (long)(AV38count+1) ;
                     brk9EH2 = true ;
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
         if ( ! brk9EH2 )
         {
            brk9EH2 = true ;
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
      AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = AV44FilterFullText ;
      AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = AV10TFPrdNum ;
      AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = AV12TFPrdNom ;
      AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = AV14TFPrdAltNum ;
      AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = AV15TFPrdAltNum_Sel ;
      AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = AV16TFPrdAltNom ;
      AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = AV17TFPrdAltNom_Sel ;
      AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum = AV18TFPrvAltNum ;
      AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to = AV19TFPrvAltNum_To ;
      AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = AV20TFPrvAltNom ;
      AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = AV21TFPrvAltNom_Sel ;
      AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = AV22TFPrdAltFac ;
      AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = AV23TFPrdAltFac_To ;
      AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel = AV48TFPrdAltCam_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                           AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                           AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                           AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                           AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                           AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                           AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                           AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                           Byte.valueOf(AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel) ,
                                           AV46Prdnumfrom ,
                                           AV47prdnumto ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           Byte.valueOf(A11718PrdAltCam) ,
                                           AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                           AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                           Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to) ,
                                           AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                           AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom), 26, "%") ;
      lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum), 6, "%") ;
      lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom), 26, "%") ;
      lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum), 6, "%") ;
      /* Using cursor P09EH3 */
      pr_default.execute(1, new Object[] {AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), AV45Emprcod, lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum, AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel, lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom, AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel, lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum, AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to, AV46Prdnumfrom, AV47prdnumto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9EH4 = false ;
         A718PrdNom = P09EH3_A718PrdNom[0] ;
         A11718PrdAltCam = P09EH3_A11718PrdAltCam[0] ;
         A678PrdAltFac = P09EH3_A678PrdAltFac[0] ;
         A680PrdAltNum = P09EH3_A680PrdAltNum[0] ;
         A719PrdNum = P09EH3_A719PrdNum[0] ;
         A679PrdAltNom = P09EH3_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH3_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH3_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH3_n778PrvAltNum[0] ;
         A396EmprCod = P09EH3_A396EmprCod[0] ;
         A718PrdNom = P09EH3_A718PrdNom[0] ;
         A679PrdAltNom = P09EH3_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH3_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH3_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH3_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         productosalternativos_wc1getfilterdata.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_wc1getfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  AV38count = 0 ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09EH3_A718PrdNom[0], A718PrdNom) == 0 ) )
                  {
                     brk9EH4 = false ;
                     A680PrdAltNum = P09EH3_A680PrdAltNum[0] ;
                     A719PrdNum = P09EH3_A719PrdNum[0] ;
                     A396EmprCod = P09EH3_A396EmprCod[0] ;
                     AV38count = (long)(AV38count+1) ;
                     brk9EH4 = true ;
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
         if ( ! brk9EH4 )
         {
            brk9EH4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDALTNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdAltNum = AV26SearchTxt ;
      AV15TFPrdAltNum_Sel = "" ;
      AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = AV44FilterFullText ;
      AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = AV10TFPrdNum ;
      AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = AV12TFPrdNom ;
      AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = AV14TFPrdAltNum ;
      AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = AV15TFPrdAltNum_Sel ;
      AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = AV16TFPrdAltNom ;
      AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = AV17TFPrdAltNom_Sel ;
      AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum = AV18TFPrvAltNum ;
      AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to = AV19TFPrvAltNum_To ;
      AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = AV20TFPrvAltNom ;
      AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = AV21TFPrvAltNom_Sel ;
      AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = AV22TFPrdAltFac ;
      AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = AV23TFPrdAltFac_To ;
      AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel = AV48TFPrdAltCam_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                           AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                           AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                           AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                           AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                           AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                           AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                           AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                           Byte.valueOf(AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel) ,
                                           AV46Prdnumfrom ,
                                           AV47prdnumto ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           Byte.valueOf(A11718PrdAltCam) ,
                                           AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                           AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                           Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to) ,
                                           AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                           AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom), 26, "%") ;
      lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum), 6, "%") ;
      lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom), 26, "%") ;
      lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum), 6, "%") ;
      /* Using cursor P09EH4 */
      pr_default.execute(2, new Object[] {AV45Emprcod, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum, AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel, lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom, AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel, lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum, AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to, AV46Prdnumfrom, AV47prdnumto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9EH6 = false ;
         A680PrdAltNum = P09EH4_A680PrdAltNum[0] ;
         A11718PrdAltCam = P09EH4_A11718PrdAltCam[0] ;
         A678PrdAltFac = P09EH4_A678PrdAltFac[0] ;
         A718PrdNom = P09EH4_A718PrdNom[0] ;
         A719PrdNum = P09EH4_A719PrdNum[0] ;
         A679PrdAltNom = P09EH4_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH4_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH4_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH4_n778PrvAltNum[0] ;
         A396EmprCod = P09EH4_A396EmprCod[0] ;
         A718PrdNom = P09EH4_A718PrdNom[0] ;
         A679PrdAltNom = P09EH4_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH4_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH4_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH4_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         productosalternativos_wc1getfilterdata.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_wc1getfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  AV38count = 0 ;
                  while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09EH4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09EH4_A680PrdAltNum[0], A680PrdAltNum) == 0 ) )
                  {
                     brk9EH6 = false ;
                     A719PrdNum = P09EH4_A719PrdNum[0] ;
                     AV38count = (long)(AV38count+1) ;
                     brk9EH6 = true ;
                     pr_default.readNext(2);
                  }
                  if ( ! (GXutil.strcmp("", A680PrdAltNum)==0) )
                  {
                     AV30Option = A680PrdAltNum ;
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
         if ( ! brk9EH6 )
         {
            brk9EH6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDALTNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdAltNom = AV26SearchTxt ;
      AV17TFPrdAltNom_Sel = "" ;
      AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = AV44FilterFullText ;
      AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = AV10TFPrdNum ;
      AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = AV12TFPrdNom ;
      AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = AV14TFPrdAltNum ;
      AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = AV15TFPrdAltNum_Sel ;
      AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = AV16TFPrdAltNom ;
      AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = AV17TFPrdAltNom_Sel ;
      AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum = AV18TFPrvAltNum ;
      AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to = AV19TFPrvAltNum_To ;
      AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = AV20TFPrvAltNom ;
      AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = AV21TFPrvAltNom_Sel ;
      AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = AV22TFPrdAltFac ;
      AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = AV23TFPrdAltFac_To ;
      AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel = AV48TFPrdAltCam_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                           AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                           AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                           AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                           AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                           AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                           AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                           AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                           Byte.valueOf(AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel) ,
                                           AV46Prdnumfrom ,
                                           AV47prdnumto ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           Byte.valueOf(A11718PrdAltCam) ,
                                           AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                           AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                           Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to) ,
                                           AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                           AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom), 26, "%") ;
      lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum), 6, "%") ;
      lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom), 26, "%") ;
      lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum), 6, "%") ;
      /* Using cursor P09EH5 */
      pr_default.execute(3, new Object[] {AV45Emprcod, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum, AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel, lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom, AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel, lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum, AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to, AV46Prdnumfrom, AV47prdnumto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A11718PrdAltCam = P09EH5_A11718PrdAltCam[0] ;
         A678PrdAltFac = P09EH5_A678PrdAltFac[0] ;
         A680PrdAltNum = P09EH5_A680PrdAltNum[0] ;
         A718PrdNom = P09EH5_A718PrdNom[0] ;
         A719PrdNum = P09EH5_A719PrdNum[0] ;
         A679PrdAltNom = P09EH5_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH5_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH5_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH5_n778PrvAltNum[0] ;
         A396EmprCod = P09EH5_A396EmprCod[0] ;
         A718PrdNom = P09EH5_A718PrdNom[0] ;
         A679PrdAltNom = P09EH5_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH5_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH5_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH5_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         productosalternativos_wc1getfilterdata.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_wc1getfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A679PrdAltNom)==0) )
                  {
                     AV30Option = A679PrdAltNom ;
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
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRVALTNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFPrvAltNom = AV26SearchTxt ;
      AV21TFPrvAltNom_Sel = "" ;
      AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = AV44FilterFullText ;
      AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = AV10TFPrdNum ;
      AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = AV12TFPrdNom ;
      AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = AV14TFPrdAltNum ;
      AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = AV15TFPrdAltNum_Sel ;
      AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = AV16TFPrdAltNom ;
      AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = AV17TFPrdAltNom_Sel ;
      AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum = AV18TFPrvAltNum ;
      AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to = AV19TFPrvAltNum_To ;
      AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = AV20TFPrvAltNom ;
      AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = AV21TFPrvAltNom_Sel ;
      AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = AV22TFPrdAltFac ;
      AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = AV23TFPrdAltFac_To ;
      AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel = AV48TFPrdAltCam_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                           AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                           AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                           AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                           AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                           AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                           AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                           AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                           Byte.valueOf(AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel) ,
                                           AV46Prdnumfrom ,
                                           AV47prdnumto ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A680PrdAltNum ,
                                           A678PrdAltFac ,
                                           Byte.valueOf(A11718PrdAltCam) ,
                                           AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                           A679PrdAltNom ,
                                           Integer.valueOf(A778PrvAltNum) ,
                                           A777PrvAltNom ,
                                           AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                           AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                           Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum) ,
                                           Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to) ,
                                           AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                           AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom), 26, "%") ;
      lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum), 6, "%") ;
      lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom), 26, "%") ;
      lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum), 6, "%") ;
      /* Using cursor P09EH6 */
      pr_default.execute(4, new Object[] {AV45Emprcod, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel, Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), Integer.valueOf(AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to), lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum, AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel, lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom, AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel, lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum, AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to, AV46Prdnumfrom, AV47prdnumto});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A11718PrdAltCam = P09EH6_A11718PrdAltCam[0] ;
         A678PrdAltFac = P09EH6_A678PrdAltFac[0] ;
         A680PrdAltNum = P09EH6_A680PrdAltNum[0] ;
         A718PrdNom = P09EH6_A718PrdNom[0] ;
         A719PrdNum = P09EH6_A719PrdNum[0] ;
         A679PrdAltNom = P09EH6_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH6_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH6_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH6_n778PrvAltNum[0] ;
         A396EmprCod = P09EH6_A396EmprCod[0] ;
         A718PrdNom = P09EH6_A718PrdNom[0] ;
         A679PrdAltNom = P09EH6_A679PrdAltNom[0] ;
         n679PrdAltNom = P09EH6_n679PrdAltNom[0] ;
         A778PrvAltNum = P09EH6_A778PrvAltNum[0] ;
         n778PrvAltNum = P09EH6_n778PrvAltNum[0] ;
         GXt_char2 = A777PrvAltNom ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A778PrvAltNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3) ;
         productosalternativos_wc1getfilterdata.this.A396EmprCod = GXv_char5[0] ;
         productosalternativos_wc1getfilterdata.this.A778PrvAltNum = GXv_int4[0] ;
         productosalternativos_wc1getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A777PrvAltNom = GXt_char2 ;
         if ( (GXutil.strcmp("", AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A680PrdAltNum) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A679PrdAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A778PrvAltNum, 6, 0) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A678PrdAltFac, 7, 4) , GXutil.padr( "%" + AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom)==0) ) ) || ( GXutil.like( GXutil.upper( A777PrvAltNom) , GXutil.padr( "%" + GXutil.upper( AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel)==0) || ( ( GXutil.strcmp(A777PrvAltNom, AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A777PrvAltNom)==0) )
                  {
                     AV30Option = A777PrvAltNom ;
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
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = productosalternativos_wc1getfilterdata.this.AV32OptionsJson;
      this.aP4[0] = productosalternativos_wc1getfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = productosalternativos_wc1getfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
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
      AV14TFPrdAltNum = "" ;
      AV15TFPrdAltNum_Sel = "" ;
      AV16TFPrdAltNom = "" ;
      AV17TFPrdAltNom_Sel = "" ;
      AV20TFPrvAltNom = "" ;
      AV21TFPrvAltNom_Sel = "" ;
      AV22TFPrdAltFac = DecimalUtil.ZERO ;
      AV23TFPrdAltFac_To = DecimalUtil.ZERO ;
      AV45Emprcod = "" ;
      AV46Prdnumfrom = "" ;
      AV47prdnumto = "" ;
      A719PrdNum = "" ;
      AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = "" ;
      AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = "" ;
      AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel = "" ;
      AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = "" ;
      AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel = "" ;
      AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = "" ;
      AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel = "" ;
      AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = "" ;
      AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel = "" ;
      AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom = "" ;
      AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel = "" ;
      AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac = DecimalUtil.ZERO ;
      AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to = DecimalUtil.ZERO ;
      lV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom = "" ;
      lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum = "" ;
      lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom = "" ;
      lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum = "" ;
      A718PrdNom = "" ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      A679PrdAltNom = "" ;
      A777PrvAltNom = "" ;
      A396EmprCod = "" ;
      P09EH2_A719PrdNum = new String[] {""} ;
      P09EH2_A11718PrdAltCam = new byte[1] ;
      P09EH2_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EH2_A680PrdAltNum = new String[] {""} ;
      P09EH2_A718PrdNom = new String[] {""} ;
      P09EH2_A679PrdAltNom = new String[] {""} ;
      P09EH2_n679PrdAltNom = new boolean[] {false} ;
      P09EH2_A778PrvAltNum = new int[1] ;
      P09EH2_n778PrvAltNum = new boolean[] {false} ;
      P09EH2_A396EmprCod = new String[] {""} ;
      AV30Option = "" ;
      P09EH3_A718PrdNom = new String[] {""} ;
      P09EH3_A11718PrdAltCam = new byte[1] ;
      P09EH3_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EH3_A680PrdAltNum = new String[] {""} ;
      P09EH3_A719PrdNum = new String[] {""} ;
      P09EH3_A679PrdAltNom = new String[] {""} ;
      P09EH3_n679PrdAltNom = new boolean[] {false} ;
      P09EH3_A778PrvAltNum = new int[1] ;
      P09EH3_n778PrvAltNum = new boolean[] {false} ;
      P09EH3_A396EmprCod = new String[] {""} ;
      P09EH4_A680PrdAltNum = new String[] {""} ;
      P09EH4_A11718PrdAltCam = new byte[1] ;
      P09EH4_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EH4_A718PrdNom = new String[] {""} ;
      P09EH4_A719PrdNum = new String[] {""} ;
      P09EH4_A679PrdAltNom = new String[] {""} ;
      P09EH4_n679PrdAltNom = new boolean[] {false} ;
      P09EH4_A778PrvAltNum = new int[1] ;
      P09EH4_n778PrvAltNum = new boolean[] {false} ;
      P09EH4_A396EmprCod = new String[] {""} ;
      P09EH5_A11718PrdAltCam = new byte[1] ;
      P09EH5_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EH5_A680PrdAltNum = new String[] {""} ;
      P09EH5_A718PrdNom = new String[] {""} ;
      P09EH5_A719PrdNum = new String[] {""} ;
      P09EH5_A679PrdAltNom = new String[] {""} ;
      P09EH5_n679PrdAltNom = new boolean[] {false} ;
      P09EH5_A778PrvAltNum = new int[1] ;
      P09EH5_n778PrvAltNum = new boolean[] {false} ;
      P09EH5_A396EmprCod = new String[] {""} ;
      P09EH6_A11718PrdAltCam = new byte[1] ;
      P09EH6_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EH6_A680PrdAltNum = new String[] {""} ;
      P09EH6_A718PrdNom = new String[] {""} ;
      P09EH6_A719PrdNum = new String[] {""} ;
      P09EH6_A679PrdAltNom = new String[] {""} ;
      P09EH6_n679PrdAltNom = new boolean[] {false} ;
      P09EH6_A778PrvAltNum = new int[1] ;
      P09EH6_n778PrvAltNum = new boolean[] {false} ;
      P09EH6_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.productosalternativos_wc1getfilterdata__default(),
         new Object[] {
             new Object[] {
            P09EH2_A719PrdNum, P09EH2_A11718PrdAltCam, P09EH2_A678PrdAltFac, P09EH2_A680PrdAltNum, P09EH2_A718PrdNom, P09EH2_A679PrdAltNom, P09EH2_n679PrdAltNom, P09EH2_A778PrvAltNum, P09EH2_n778PrvAltNum, P09EH2_A396EmprCod
            }
            , new Object[] {
            P09EH3_A718PrdNom, P09EH3_A11718PrdAltCam, P09EH3_A678PrdAltFac, P09EH3_A680PrdAltNum, P09EH3_A719PrdNum, P09EH3_A679PrdAltNom, P09EH3_n679PrdAltNom, P09EH3_A778PrvAltNum, P09EH3_n778PrvAltNum, P09EH3_A396EmprCod
            }
            , new Object[] {
            P09EH4_A680PrdAltNum, P09EH4_A11718PrdAltCam, P09EH4_A678PrdAltFac, P09EH4_A718PrdNom, P09EH4_A719PrdNum, P09EH4_A679PrdAltNom, P09EH4_n679PrdAltNom, P09EH4_A778PrvAltNum, P09EH4_n778PrvAltNum, P09EH4_A396EmprCod
            }
            , new Object[] {
            P09EH5_A11718PrdAltCam, P09EH5_A678PrdAltFac, P09EH5_A680PrdAltNum, P09EH5_A718PrdNom, P09EH5_A719PrdNum, P09EH5_A679PrdAltNom, P09EH5_n679PrdAltNom, P09EH5_A778PrvAltNum, P09EH5_n778PrvAltNum, P09EH5_A396EmprCod
            }
            , new Object[] {
            P09EH6_A11718PrdAltCam, P09EH6_A678PrdAltFac, P09EH6_A680PrdAltNum, P09EH6_A718PrdNom, P09EH6_A719PrdNum, P09EH6_A679PrdAltNom, P09EH6_n679PrdAltNom, P09EH6_A778PrvAltNum, P09EH6_n778PrvAltNum, P09EH6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV48TFPrdAltCam_Sel ;
   private byte AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ;
   private byte A11718PrdAltCam ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV18TFPrvAltNum ;
   private int AV19TFPrvAltNum_To ;
   private int AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ;
   private int AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ;
   private int A778PrvAltNum ;
   private int AV29InsertIndex ;
   private int GXv_int4[] ;
   private long AV38count ;
   private java.math.BigDecimal AV22TFPrdAltFac ;
   private java.math.BigDecimal AV23TFPrdAltFac_To ;
   private java.math.BigDecimal AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ;
   private java.math.BigDecimal AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ;
   private java.math.BigDecimal A678PrdAltFac ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV14TFPrdAltNum ;
   private String AV15TFPrdAltNum_Sel ;
   private String AV16TFPrdAltNom ;
   private String AV17TFPrdAltNom_Sel ;
   private String AV20TFPrvAltNom ;
   private String AV21TFPrvAltNom_Sel ;
   private String AV45Emprcod ;
   private String AV46Prdnumfrom ;
   private String AV47prdnumto ;
   private String A719PrdNum ;
   private String AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ;
   private String AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ;
   private String AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ;
   private String AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ;
   private String AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ;
   private String AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ;
   private String AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ;
   private String AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ;
   private String AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ;
   private String AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ;
   private String scmdbuf ;
   private String lV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ;
   private String lV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ;
   private String lV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ;
   private String lV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ;
   private String A718PrdNom ;
   private String A680PrdAltNum ;
   private String A679PrdAltNom ;
   private String A777PrvAltNom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean brk9EH2 ;
   private boolean n679PrdAltNom ;
   private boolean n778PrvAltNum ;
   private boolean brk9EH4 ;
   private boolean brk9EH6 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ;
   private String lV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09EH2_A719PrdNum ;
   private byte[] P09EH2_A11718PrdAltCam ;
   private java.math.BigDecimal[] P09EH2_A678PrdAltFac ;
   private String[] P09EH2_A680PrdAltNum ;
   private String[] P09EH2_A718PrdNom ;
   private String[] P09EH2_A679PrdAltNom ;
   private boolean[] P09EH2_n679PrdAltNom ;
   private int[] P09EH2_A778PrvAltNum ;
   private boolean[] P09EH2_n778PrvAltNum ;
   private String[] P09EH2_A396EmprCod ;
   private String[] P09EH3_A718PrdNom ;
   private byte[] P09EH3_A11718PrdAltCam ;
   private java.math.BigDecimal[] P09EH3_A678PrdAltFac ;
   private String[] P09EH3_A680PrdAltNum ;
   private String[] P09EH3_A719PrdNum ;
   private String[] P09EH3_A679PrdAltNom ;
   private boolean[] P09EH3_n679PrdAltNom ;
   private int[] P09EH3_A778PrvAltNum ;
   private boolean[] P09EH3_n778PrvAltNum ;
   private String[] P09EH3_A396EmprCod ;
   private String[] P09EH4_A680PrdAltNum ;
   private byte[] P09EH4_A11718PrdAltCam ;
   private java.math.BigDecimal[] P09EH4_A678PrdAltFac ;
   private String[] P09EH4_A718PrdNom ;
   private String[] P09EH4_A719PrdNum ;
   private String[] P09EH4_A679PrdAltNom ;
   private boolean[] P09EH4_n679PrdAltNom ;
   private int[] P09EH4_A778PrvAltNum ;
   private boolean[] P09EH4_n778PrvAltNum ;
   private String[] P09EH4_A396EmprCod ;
   private byte[] P09EH5_A11718PrdAltCam ;
   private java.math.BigDecimal[] P09EH5_A678PrdAltFac ;
   private String[] P09EH5_A680PrdAltNum ;
   private String[] P09EH5_A718PrdNom ;
   private String[] P09EH5_A719PrdNum ;
   private String[] P09EH5_A679PrdAltNom ;
   private boolean[] P09EH5_n679PrdAltNom ;
   private int[] P09EH5_A778PrvAltNum ;
   private boolean[] P09EH5_n778PrvAltNum ;
   private String[] P09EH5_A396EmprCod ;
   private byte[] P09EH6_A11718PrdAltCam ;
   private java.math.BigDecimal[] P09EH6_A678PrdAltFac ;
   private String[] P09EH6_A680PrdAltNum ;
   private String[] P09EH6_A718PrdNom ;
   private String[] P09EH6_A719PrdNum ;
   private String[] P09EH6_A679PrdAltNom ;
   private boolean[] P09EH6_n679PrdAltNom ;
   private int[] P09EH6_A778PrvAltNum ;
   private boolean[] P09EH6_n778PrvAltNum ;
   private String[] P09EH6_A396EmprCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class productosalternativos_wc1getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                          String AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                          String AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                          String AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                          String AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                          String AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                          byte AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ,
                                          String AV46Prdnumfrom ,
                                          String AV47prdnumto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          byte A11718PrdAltCam ,
                                          String AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                          String AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                          int AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ,
                                          int AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ,
                                          String AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                          String AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.PrdAltCam, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, COALESCE( T3.PrdNom, ' ') AS PrdAltNom, COALESCE( T3.PrvNum, 0) AS PrvAltNum, T1.EmprCod FROM" ;
      scmdbuf += " ((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      scmdbuf += " = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) <= ?))");
      if ( (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 1 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 1)");
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 2 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 0)");
      }
      if ( ! (GXutil.strcmp("", AV46Prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09EH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                          String AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                          String AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                          String AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                          String AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                          String AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                          byte AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ,
                                          String AV46Prdnumfrom ,
                                          String AV47prdnumto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          byte A11718PrdAltCam ,
                                          String AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                          String AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                          int AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ,
                                          int AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ,
                                          String AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                          String AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.PrdNom, T1.PrdAltCam, T1.PrdAltFac, T1.PrdAltNum, T1.PrdNum, COALESCE( T3.PrdNom, ' ') AS PrdAltNom, COALESCE( T3.PrvNum, 0) AS PrvAltNum, T1.EmprCod FROM" ;
      scmdbuf += " ((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      scmdbuf += " = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 1 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 1)");
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 2 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 0)");
      }
      if ( ! (GXutil.strcmp("", AV46Prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09EH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                          String AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                          String AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                          String AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                          String AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                          String AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                          byte AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ,
                                          String AV46Prdnumfrom ,
                                          String AV47prdnumto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          byte A11718PrdAltCam ,
                                          String AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                          String AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                          int AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ,
                                          int AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ,
                                          String AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                          String AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[20];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.PrdAltNum, T1.PrdAltCam, T1.PrdAltFac, T2.PrdNom, T1.PrdNum, COALESCE( T3.PrdNom, ' ') AS PrdAltNom, COALESCE( T3.PrvNum, 0) AS PrvAltNum, T1.EmprCod FROM" ;
      scmdbuf += " ((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      scmdbuf += " = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) <= ?))");
      if ( (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 1 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 1)");
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 2 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 0)");
      }
      if ( ! (GXutil.strcmp("", AV46Prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdAltNum" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09EH5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                          String AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                          String AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                          String AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                          String AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                          String AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                          byte AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ,
                                          String AV46Prdnumfrom ,
                                          String AV47prdnumto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          byte A11718PrdAltCam ,
                                          String AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                          String AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                          int AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ,
                                          int AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ,
                                          String AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                          String AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[20];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.PrdAltCam, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T3.PrdNom, ' ') AS PrdAltNom, COALESCE( T3.PrvNum, 0) AS PrvAltNum, T1.EmprCod FROM" ;
      scmdbuf += " ((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      scmdbuf += " = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) <= ?))");
      if ( (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 1 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 1)");
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 2 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 0)");
      }
      if ( ! (GXutil.strcmp("", AV46Prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09EH6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel ,
                                          String AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum ,
                                          String AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel ,
                                          String AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom ,
                                          String AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel ,
                                          String AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum ,
                                          java.math.BigDecimal AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac ,
                                          java.math.BigDecimal AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to ,
                                          byte AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel ,
                                          String AV46Prdnumfrom ,
                                          String AV47prdnumto ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A680PrdAltNum ,
                                          java.math.BigDecimal A678PrdAltFac ,
                                          byte A11718PrdAltCam ,
                                          String AV53Formulaciontinte_productosalternativos_wc1ds_1_filterfulltext ,
                                          String A679PrdAltNom ,
                                          int A778PrvAltNum ,
                                          String A777PrvAltNom ,
                                          String AV61Formulaciontinte_productosalternativos_wc1ds_9_tfprdaltnom_sel ,
                                          String AV60Formulaciontinte_productosalternativos_wc1ds_8_tfprdaltnom ,
                                          int AV62Formulaciontinte_productosalternativos_wc1ds_10_tfprvaltnum ,
                                          int AV63Formulaciontinte_productosalternativos_wc1ds_11_tfprvaltnum_to ,
                                          String AV65Formulaciontinte_productosalternativos_wc1ds_13_tfprvaltnom_sel ,
                                          String AV64Formulaciontinte_productosalternativos_wc1ds_12_tfprvaltnom ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[20];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.PrdAltCam, T1.PrdAltFac, T1.PrdAltNum, T2.PrdNom, T1.PrdNum, COALESCE( T3.PrdNom, ' ') AS PrdAltNom, COALESCE( T3.PrvNum, 0) AS PrvAltNum, T1.EmprCod FROM" ;
      scmdbuf += " ((TXPPRDALT T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdAltNum) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      scmdbuf += " = T1.PrdAltNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T3.PrdNom, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T3.PrdNom, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.PrvNum, 0) <= ?))");
      if ( (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_productosalternativos_wc1ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_productosalternativos_wc1ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_productosalternativos_wc1ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_productosalternativos_wc1ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_productosalternativos_wc1ds_6_tfprdaltnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdAltNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_productosalternativos_wc1ds_7_tfprdaltnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltNum = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Formulaciontinte_productosalternativos_wc1ds_14_tfprdaltfac)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Formulaciontinte_productosalternativos_wc1ds_15_tfprdaltfac_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAltFac <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 1 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 1)");
      }
      if ( AV68Formulaciontinte_productosalternativos_wc1ds_16_tfprdaltcam_sel == 2 )
      {
         addWhere(sWhereString, "(T1.PrdAltCam = 0)");
      }
      if ( ! (GXutil.strcmp("", AV46Prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
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
                  return conditional_P09EH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 1 :
                  return conditional_P09EH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 2 :
                  return conditional_P09EH4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 3 :
                  return conditional_P09EH5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 4 :
                  return conditional_P09EH6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EH5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EH6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
      }
   }

}

