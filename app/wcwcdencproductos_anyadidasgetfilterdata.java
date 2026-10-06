package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcdencproductos_anyadidasgetfilterdata extends GXProcedure
{
   public wcwcdencproductos_anyadidasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcdencproductos_anyadidasgetfilterdata.class ), "" );
   }

   public wcwcdencproductos_anyadidasgetfilterdata( int remoteHandle ,
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
      wcwcdencproductos_anyadidasgetfilterdata.this.aP5 = new String[] {""};
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
      wcwcdencproductos_anyadidasgetfilterdata.this.AV16DDOName = aP0;
      wcwcdencproductos_anyadidasgetfilterdata.this.AV14SearchTxt = aP1;
      wcwcdencproductos_anyadidasgetfilterdata.this.AV15SearchTxtTo = aP2;
      wcwcdencproductos_anyadidasgetfilterdata.this.aP3 = aP3;
      wcwcdencproductos_anyadidasgetfilterdata.this.aP4 = aP4;
      wcwcdencproductos_anyadidasgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_HRDPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADHRDPRDDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_HRELANYLOT") == 0 )
      {
         /* Execute user subroutine: 'LOADHRELANYLOTOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV27Session.getValue("WCWcdencproductos_AnyadidasGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcdencproductos_AnyadidasGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WCWcdencproductos_AnyadidasGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV37TFPrdNum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV38TFPrdNum_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC") == 0 )
         {
            AV39TFHrdPrdDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC_SEL") == 0 )
         {
            AV40TFHrdPrdDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYLOT") == 0 )
         {
            AV41TFHreLanyLot = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYLOT_SEL") == 0 )
         {
            AV42TFHreLanyLot_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV33Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TB1_COD") == 0 )
         {
            AV34Tb1_cod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREFECTIN") == 0 )
         {
            AV35HreFecTin = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREFECTIN_TO") == 0 )
         {
            AV36HreFecTin_to = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV37TFPrdNum = AV14SearchTxt ;
      AV38TFPrdNum_Sel = "" ;
      AV47Wcwcdencproductos_anyadidasds_1_filterfulltext = AV32FilterFullText ;
      AV48Wcwcdencproductos_anyadidasds_2_tfprdnum = AV37TFPrdNum ;
      AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel = AV38TFPrdNum_Sel ;
      AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = AV39TFHrdPrdDsc ;
      AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel = AV40TFHrdPrdDsc_Sel ;
      AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot = AV41TFHreLanyLot ;
      AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel = AV42TFHreLanyLot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                           AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                           AV48Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                           AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                           AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                           AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                           AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A5808HreLanyLot ,
                                           Short.valueOf(AV34Tb1_cod) ,
                                           A4529HreFecTin ,
                                           AV35HreFecTin ,
                                           AV36HreFecTin_to ,
                                           Short.valueOf(A12535HreCencId) ,
                                           AV33Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV48Wcwcdencproductos_anyadidasds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Wcwcdencproductos_anyadidasds_2_tfprdnum), 6, "%") ;
      lV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc), 26, "%") ;
      lV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot = GXutil.padr( GXutil.rtrim( AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot), 26, "%") ;
      /* Using cursor P095L2 */
      pr_default.execute(0, new Object[] {AV33Emprcod, Short.valueOf(AV34Tb1_cod), AV35HreFecTin, AV36HreFecTin_to, Short.valueOf(AV34Tb1_cod), lV47Wcwcdencproductos_anyadidasds_1_filterfulltext, lV47Wcwcdencproductos_anyadidasds_1_filterfulltext, lV47Wcwcdencproductos_anyadidasds_1_filterfulltext, lV48Wcwcdencproductos_anyadidasds_2_tfprdnum, AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel, lV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc, AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel, lV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot, AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk95L2 = false ;
         A4492HreBarCod = P095L2_A4492HreBarCod[0] ;
         A4493HreBarReo = P095L2_A4493HreBarReo[0] ;
         A4494HreBarPar = P095L2_A4494HreBarPar[0] ;
         A4495HreNumCie = P095L2_A4495HreNumCie[0] ;
         A396EmprCod = P095L2_A396EmprCod[0] ;
         A719PrdNum = P095L2_A719PrdNum[0] ;
         A4529HreFecTin = P095L2_A4529HreFecTin[0] ;
         n4529HreFecTin = P095L2_n4529HreFecTin[0] ;
         A12535HreCencId = P095L2_A12535HreCencId[0] ;
         n12535HreCencId = P095L2_n12535HreCencId[0] ;
         A5808HreLanyLot = P095L2_A5808HreLanyLot[0] ;
         n5808HreLanyLot = P095L2_n5808HreLanyLot[0] ;
         A4510HrdPrdDsc = P095L2_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P095L2_n4510HrdPrdDsc[0] ;
         A4508HreLinMAL = P095L2_A4508HreLinMAL[0] ;
         A4509HreNumAny = P095L2_A4509HreNumAny[0] ;
         A4529HreFecTin = P095L2_A4529HreFecTin[0] ;
         n4529HreFecTin = P095L2_n4529HreFecTin[0] ;
         A12535HreCencId = P095L2_A12535HreCencId[0] ;
         n12535HreCencId = P095L2_n12535HreCencId[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P095L2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P095L2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk95L2 = false ;
            A4492HreBarCod = P095L2_A4492HreBarCod[0] ;
            A4493HreBarReo = P095L2_A4493HreBarReo[0] ;
            A4494HreBarPar = P095L2_A4494HreBarPar[0] ;
            A4495HreNumCie = P095L2_A4495HreNumCie[0] ;
            A4508HreLinMAL = P095L2_A4508HreLinMAL[0] ;
            A4509HreNumAny = P095L2_A4509HreNumAny[0] ;
            AV26count = (long)(AV26count+1) ;
            brk95L2 = true ;
            pr_default.readNext(0);
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
         if ( ! brk95L2 )
         {
            brk95L2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHRDPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV39TFHrdPrdDsc = AV14SearchTxt ;
      AV40TFHrdPrdDsc_Sel = "" ;
      AV47Wcwcdencproductos_anyadidasds_1_filterfulltext = AV32FilterFullText ;
      AV48Wcwcdencproductos_anyadidasds_2_tfprdnum = AV37TFPrdNum ;
      AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel = AV38TFPrdNum_Sel ;
      AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = AV39TFHrdPrdDsc ;
      AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel = AV40TFHrdPrdDsc_Sel ;
      AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot = AV41TFHreLanyLot ;
      AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel = AV42TFHreLanyLot_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV47Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                           AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                           AV48Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                           AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                           AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                           AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                           AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A5808HreLanyLot ,
                                           Short.valueOf(AV34Tb1_cod) ,
                                           A4529HreFecTin ,
                                           AV35HreFecTin ,
                                           AV36HreFecTin_to ,
                                           A396EmprCod ,
                                           AV33Emprcod ,
                                           Short.valueOf(A12535HreCencId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV48Wcwcdencproductos_anyadidasds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Wcwcdencproductos_anyadidasds_2_tfprdnum), 6, "%") ;
      lV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc), 26, "%") ;
      lV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot = GXutil.padr( GXutil.rtrim( AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot), 26, "%") ;
      /* Using cursor P095L3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV34Tb1_cod), AV35HreFecTin, AV36HreFecTin_to, AV33Emprcod, Short.valueOf(AV34Tb1_cod), lV47Wcwcdencproductos_anyadidasds_1_filterfulltext, lV47Wcwcdencproductos_anyadidasds_1_filterfulltext, lV47Wcwcdencproductos_anyadidasds_1_filterfulltext, lV48Wcwcdencproductos_anyadidasds_2_tfprdnum, AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel, lV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc, AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel, lV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot, AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk95L4 = false ;
         A4492HreBarCod = P095L3_A4492HreBarCod[0] ;
         A4493HreBarReo = P095L3_A4493HreBarReo[0] ;
         A4494HreBarPar = P095L3_A4494HreBarPar[0] ;
         A4495HreNumCie = P095L3_A4495HreNumCie[0] ;
         A396EmprCod = P095L3_A396EmprCod[0] ;
         A12535HreCencId = P095L3_A12535HreCencId[0] ;
         n12535HreCencId = P095L3_n12535HreCencId[0] ;
         A4510HrdPrdDsc = P095L3_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P095L3_n4510HrdPrdDsc[0] ;
         A4529HreFecTin = P095L3_A4529HreFecTin[0] ;
         n4529HreFecTin = P095L3_n4529HreFecTin[0] ;
         A5808HreLanyLot = P095L3_A5808HreLanyLot[0] ;
         n5808HreLanyLot = P095L3_n5808HreLanyLot[0] ;
         A719PrdNum = P095L3_A719PrdNum[0] ;
         A4508HreLinMAL = P095L3_A4508HreLinMAL[0] ;
         A4509HreNumAny = P095L3_A4509HreNumAny[0] ;
         A12535HreCencId = P095L3_A12535HreCencId[0] ;
         n12535HreCencId = P095L3_n12535HreCencId[0] ;
         A4529HreFecTin = P095L3_A4529HreFecTin[0] ;
         n4529HreFecTin = P095L3_n4529HreFecTin[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P095L3_A4510HrdPrdDsc[0], A4510HrdPrdDsc) == 0 ) )
         {
            brk95L4 = false ;
            A4492HreBarCod = P095L3_A4492HreBarCod[0] ;
            A4493HreBarReo = P095L3_A4493HreBarReo[0] ;
            A4494HreBarPar = P095L3_A4494HreBarPar[0] ;
            A4495HreNumCie = P095L3_A4495HreNumCie[0] ;
            A396EmprCod = P095L3_A396EmprCod[0] ;
            A719PrdNum = P095L3_A719PrdNum[0] ;
            A4508HreLinMAL = P095L3_A4508HreLinMAL[0] ;
            A4509HreNumAny = P095L3_A4509HreNumAny[0] ;
            AV26count = (long)(AV26count+1) ;
            brk95L4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4510HrdPrdDsc)==0) )
         {
            AV18Option = A4510HrdPrdDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95L4 )
         {
            brk95L4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHRELANYLOTOPTIONS' Routine */
      returnInSub = false ;
      AV41TFHreLanyLot = AV14SearchTxt ;
      AV42TFHreLanyLot_Sel = "" ;
      AV47Wcwcdencproductos_anyadidasds_1_filterfulltext = AV32FilterFullText ;
      AV48Wcwcdencproductos_anyadidasds_2_tfprdnum = AV37TFPrdNum ;
      AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel = AV38TFPrdNum_Sel ;
      AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = AV39TFHrdPrdDsc ;
      AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel = AV40TFHrdPrdDsc_Sel ;
      AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot = AV41TFHreLanyLot ;
      AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel = AV42TFHreLanyLot_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV47Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                           AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                           AV48Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                           AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                           AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                           AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                           AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A5808HreLanyLot ,
                                           Short.valueOf(AV34Tb1_cod) ,
                                           A4529HreFecTin ,
                                           AV35HreFecTin ,
                                           AV36HreFecTin_to ,
                                           A396EmprCod ,
                                           AV33Emprcod ,
                                           Short.valueOf(A12535HreCencId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcdencproductos_anyadidasds_1_filterfulltext), "%", "") ;
      lV48Wcwcdencproductos_anyadidasds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Wcwcdencproductos_anyadidasds_2_tfprdnum), 6, "%") ;
      lV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc), 26, "%") ;
      lV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot = GXutil.padr( GXutil.rtrim( AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot), 26, "%") ;
      /* Using cursor P095L4 */
      pr_default.execute(2, new Object[] {Short.valueOf(AV34Tb1_cod), AV35HreFecTin, AV36HreFecTin_to, AV33Emprcod, Short.valueOf(AV34Tb1_cod), lV47Wcwcdencproductos_anyadidasds_1_filterfulltext, lV47Wcwcdencproductos_anyadidasds_1_filterfulltext, lV47Wcwcdencproductos_anyadidasds_1_filterfulltext, lV48Wcwcdencproductos_anyadidasds_2_tfprdnum, AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel, lV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc, AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel, lV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot, AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk95L6 = false ;
         A4492HreBarCod = P095L4_A4492HreBarCod[0] ;
         A4493HreBarReo = P095L4_A4493HreBarReo[0] ;
         A4494HreBarPar = P095L4_A4494HreBarPar[0] ;
         A4495HreNumCie = P095L4_A4495HreNumCie[0] ;
         A396EmprCod = P095L4_A396EmprCod[0] ;
         A12535HreCencId = P095L4_A12535HreCencId[0] ;
         n12535HreCencId = P095L4_n12535HreCencId[0] ;
         A5808HreLanyLot = P095L4_A5808HreLanyLot[0] ;
         n5808HreLanyLot = P095L4_n5808HreLanyLot[0] ;
         A4529HreFecTin = P095L4_A4529HreFecTin[0] ;
         n4529HreFecTin = P095L4_n4529HreFecTin[0] ;
         A4510HrdPrdDsc = P095L4_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P095L4_n4510HrdPrdDsc[0] ;
         A719PrdNum = P095L4_A719PrdNum[0] ;
         A4508HreLinMAL = P095L4_A4508HreLinMAL[0] ;
         A4509HreNumAny = P095L4_A4509HreNumAny[0] ;
         A12535HreCencId = P095L4_A12535HreCencId[0] ;
         n12535HreCencId = P095L4_n12535HreCencId[0] ;
         A4529HreFecTin = P095L4_A4529HreFecTin[0] ;
         n4529HreFecTin = P095L4_n4529HreFecTin[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P095L4_A5808HreLanyLot[0], A5808HreLanyLot) == 0 ) )
         {
            brk95L6 = false ;
            A4492HreBarCod = P095L4_A4492HreBarCod[0] ;
            A4493HreBarReo = P095L4_A4493HreBarReo[0] ;
            A4494HreBarPar = P095L4_A4494HreBarPar[0] ;
            A4495HreNumCie = P095L4_A4495HreNumCie[0] ;
            A396EmprCod = P095L4_A396EmprCod[0] ;
            A719PrdNum = P095L4_A719PrdNum[0] ;
            A4508HreLinMAL = P095L4_A4508HreLinMAL[0] ;
            A4509HreNumAny = P095L4_A4509HreNumAny[0] ;
            AV26count = (long)(AV26count+1) ;
            brk95L6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5808HreLanyLot)==0) )
         {
            AV18Option = A5808HreLanyLot ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95L6 )
         {
            brk95L6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwcdencproductos_anyadidasgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = wcwcdencproductos_anyadidasgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = wcwcdencproductos_anyadidasgetfilterdata.this.AV25OptionIndexesJson;
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
      AV37TFPrdNum = "" ;
      AV38TFPrdNum_Sel = "" ;
      AV39TFHrdPrdDsc = "" ;
      AV40TFHrdPrdDsc_Sel = "" ;
      AV41TFHreLanyLot = "" ;
      AV42TFHreLanyLot_Sel = "" ;
      AV33Emprcod = "" ;
      AV35HreFecTin = GXutil.nullDate() ;
      AV36HreFecTin_to = GXutil.nullDate() ;
      A719PrdNum = "" ;
      AV47Wcwcdencproductos_anyadidasds_1_filterfulltext = "" ;
      AV48Wcwcdencproductos_anyadidasds_2_tfprdnum = "" ;
      AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel = "" ;
      AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = "" ;
      AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel = "" ;
      AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot = "" ;
      AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel = "" ;
      scmdbuf = "" ;
      lV47Wcwcdencproductos_anyadidasds_1_filterfulltext = "" ;
      lV48Wcwcdencproductos_anyadidasds_2_tfprdnum = "" ;
      lV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc = "" ;
      lV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot = "" ;
      A4510HrdPrdDsc = "" ;
      A5808HreLanyLot = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P095L2_A4492HreBarCod = new int[1] ;
      P095L2_A4493HreBarReo = new byte[1] ;
      P095L2_A4494HreBarPar = new String[] {""} ;
      P095L2_A4495HreNumCie = new byte[1] ;
      P095L2_A396EmprCod = new String[] {""} ;
      P095L2_A719PrdNum = new String[] {""} ;
      P095L2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P095L2_n4529HreFecTin = new boolean[] {false} ;
      P095L2_A12535HreCencId = new short[1] ;
      P095L2_n12535HreCencId = new boolean[] {false} ;
      P095L2_A5808HreLanyLot = new String[] {""} ;
      P095L2_n5808HreLanyLot = new boolean[] {false} ;
      P095L2_A4510HrdPrdDsc = new String[] {""} ;
      P095L2_n4510HrdPrdDsc = new boolean[] {false} ;
      P095L2_A4508HreLinMAL = new short[1] ;
      P095L2_A4509HreNumAny = new byte[1] ;
      A4494HreBarPar = "" ;
      AV18Option = "" ;
      P095L3_A4492HreBarCod = new int[1] ;
      P095L3_A4493HreBarReo = new byte[1] ;
      P095L3_A4494HreBarPar = new String[] {""} ;
      P095L3_A4495HreNumCie = new byte[1] ;
      P095L3_A396EmprCod = new String[] {""} ;
      P095L3_A12535HreCencId = new short[1] ;
      P095L3_n12535HreCencId = new boolean[] {false} ;
      P095L3_A4510HrdPrdDsc = new String[] {""} ;
      P095L3_n4510HrdPrdDsc = new boolean[] {false} ;
      P095L3_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P095L3_n4529HreFecTin = new boolean[] {false} ;
      P095L3_A5808HreLanyLot = new String[] {""} ;
      P095L3_n5808HreLanyLot = new boolean[] {false} ;
      P095L3_A719PrdNum = new String[] {""} ;
      P095L3_A4508HreLinMAL = new short[1] ;
      P095L3_A4509HreNumAny = new byte[1] ;
      P095L4_A4492HreBarCod = new int[1] ;
      P095L4_A4493HreBarReo = new byte[1] ;
      P095L4_A4494HreBarPar = new String[] {""} ;
      P095L4_A4495HreNumCie = new byte[1] ;
      P095L4_A396EmprCod = new String[] {""} ;
      P095L4_A12535HreCencId = new short[1] ;
      P095L4_n12535HreCencId = new boolean[] {false} ;
      P095L4_A5808HreLanyLot = new String[] {""} ;
      P095L4_n5808HreLanyLot = new boolean[] {false} ;
      P095L4_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P095L4_n4529HreFecTin = new boolean[] {false} ;
      P095L4_A4510HrdPrdDsc = new String[] {""} ;
      P095L4_n4510HrdPrdDsc = new boolean[] {false} ;
      P095L4_A719PrdNum = new String[] {""} ;
      P095L4_A4508HreLinMAL = new short[1] ;
      P095L4_A4509HreNumAny = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcdencproductos_anyadidasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P095L2_A4492HreBarCod, P095L2_A4493HreBarReo, P095L2_A4494HreBarPar, P095L2_A4495HreNumCie, P095L2_A396EmprCod, P095L2_A719PrdNum, P095L2_A4529HreFecTin, P095L2_n4529HreFecTin, P095L2_A12535HreCencId, P095L2_n12535HreCencId,
            P095L2_A5808HreLanyLot, P095L2_n5808HreLanyLot, P095L2_A4510HrdPrdDsc, P095L2_n4510HrdPrdDsc, P095L2_A4508HreLinMAL, P095L2_A4509HreNumAny
            }
            , new Object[] {
            P095L3_A4492HreBarCod, P095L3_A4493HreBarReo, P095L3_A4494HreBarPar, P095L3_A4495HreNumCie, P095L3_A396EmprCod, P095L3_A12535HreCencId, P095L3_n12535HreCencId, P095L3_A4510HrdPrdDsc, P095L3_n4510HrdPrdDsc, P095L3_A4529HreFecTin,
            P095L3_n4529HreFecTin, P095L3_A5808HreLanyLot, P095L3_n5808HreLanyLot, P095L3_A719PrdNum, P095L3_A4508HreLinMAL, P095L3_A4509HreNumAny
            }
            , new Object[] {
            P095L4_A4492HreBarCod, P095L4_A4493HreBarReo, P095L4_A4494HreBarPar, P095L4_A4495HreNumCie, P095L4_A396EmprCod, P095L4_A12535HreCencId, P095L4_n12535HreCencId, P095L4_A5808HreLanyLot, P095L4_n5808HreLanyLot, P095L4_A4529HreFecTin,
            P095L4_n4529HreFecTin, P095L4_A4510HrdPrdDsc, P095L4_n4510HrdPrdDsc, P095L4_A719PrdNum, P095L4_A4508HreLinMAL, P095L4_A4509HreNumAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4509HreNumAny ;
   private short AV34Tb1_cod ;
   private short A12535HreCencId ;
   private short A4508HreLinMAL ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int A4492HreBarCod ;
   private long AV26count ;
   private String AV37TFPrdNum ;
   private String AV38TFPrdNum_Sel ;
   private String AV39TFHrdPrdDsc ;
   private String AV40TFHrdPrdDsc_Sel ;
   private String AV41TFHreLanyLot ;
   private String AV42TFHreLanyLot_Sel ;
   private String AV33Emprcod ;
   private String A719PrdNum ;
   private String AV48Wcwcdencproductos_anyadidasds_2_tfprdnum ;
   private String AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ;
   private String AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ;
   private String AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ;
   private String AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot ;
   private String AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ;
   private String scmdbuf ;
   private String lV48Wcwcdencproductos_anyadidasds_2_tfprdnum ;
   private String lV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ;
   private String lV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot ;
   private String A4510HrdPrdDsc ;
   private String A5808HreLanyLot ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private java.util.Date AV35HreFecTin ;
   private java.util.Date AV36HreFecTin_to ;
   private java.util.Date A4529HreFecTin ;
   private boolean returnInSub ;
   private boolean brk95L2 ;
   private boolean n4529HreFecTin ;
   private boolean n12535HreCencId ;
   private boolean n5808HreLanyLot ;
   private boolean n4510HrdPrdDsc ;
   private boolean brk95L4 ;
   private boolean brk95L6 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV47Wcwcdencproductos_anyadidasds_1_filterfulltext ;
   private String lV47Wcwcdencproductos_anyadidasds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P095L2_A4492HreBarCod ;
   private byte[] P095L2_A4493HreBarReo ;
   private String[] P095L2_A4494HreBarPar ;
   private byte[] P095L2_A4495HreNumCie ;
   private String[] P095L2_A396EmprCod ;
   private String[] P095L2_A719PrdNum ;
   private java.util.Date[] P095L2_A4529HreFecTin ;
   private boolean[] P095L2_n4529HreFecTin ;
   private short[] P095L2_A12535HreCencId ;
   private boolean[] P095L2_n12535HreCencId ;
   private String[] P095L2_A5808HreLanyLot ;
   private boolean[] P095L2_n5808HreLanyLot ;
   private String[] P095L2_A4510HrdPrdDsc ;
   private boolean[] P095L2_n4510HrdPrdDsc ;
   private short[] P095L2_A4508HreLinMAL ;
   private byte[] P095L2_A4509HreNumAny ;
   private int[] P095L3_A4492HreBarCod ;
   private byte[] P095L3_A4493HreBarReo ;
   private String[] P095L3_A4494HreBarPar ;
   private byte[] P095L3_A4495HreNumCie ;
   private String[] P095L3_A396EmprCod ;
   private short[] P095L3_A12535HreCencId ;
   private boolean[] P095L3_n12535HreCencId ;
   private String[] P095L3_A4510HrdPrdDsc ;
   private boolean[] P095L3_n4510HrdPrdDsc ;
   private java.util.Date[] P095L3_A4529HreFecTin ;
   private boolean[] P095L3_n4529HreFecTin ;
   private String[] P095L3_A5808HreLanyLot ;
   private boolean[] P095L3_n5808HreLanyLot ;
   private String[] P095L3_A719PrdNum ;
   private short[] P095L3_A4508HreLinMAL ;
   private byte[] P095L3_A4509HreNumAny ;
   private int[] P095L4_A4492HreBarCod ;
   private byte[] P095L4_A4493HreBarReo ;
   private String[] P095L4_A4494HreBarPar ;
   private byte[] P095L4_A4495HreNumCie ;
   private String[] P095L4_A396EmprCod ;
   private short[] P095L4_A12535HreCencId ;
   private boolean[] P095L4_n12535HreCencId ;
   private String[] P095L4_A5808HreLanyLot ;
   private boolean[] P095L4_n5808HreLanyLot ;
   private java.util.Date[] P095L4_A4529HreFecTin ;
   private boolean[] P095L4_n4529HreFecTin ;
   private String[] P095L4_A4510HrdPrdDsc ;
   private boolean[] P095L4_n4510HrdPrdDsc ;
   private String[] P095L4_A719PrdNum ;
   private short[] P095L4_A4508HreLinMAL ;
   private byte[] P095L4_A4509HreNumAny ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class wcwcdencproductos_anyadidasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                          String AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                          String AV48Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                          String AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                          String AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                          String AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                          String AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          String A5808HreLanyLot ,
                                          short AV34Tb1_cod ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV35HreFecTin ,
                                          java.util.Date AV36HreFecTin_to ,
                                          short A12535HreCencId ,
                                          String AV33Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.EmprCod, T1.PrdNum, T2.HreFecTin, T2.HreCencId, T1.HreLanyLot, T1.HrdPrdDsc, T1.HreLinMAL, T1.HreNumAny" ;
      scmdbuf += " FROM (TXPHISREA T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar" ;
      scmdbuf += " AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T2.HreFecTin >= ?)");
      addWhere(sWhereString, "(T2.HreFecTin <= ?)");
      addWhere(sWhereString, "(T2.HreCencId = ?)");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( ! (GXutil.strcmp("", AV47Wcwcdencproductos_anyadidasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrdPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.HreLanyLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwcdencproductos_anyadidasds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) && ( ! (GXutil.strcmp("", AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreLanyLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreLanyLot = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P095L3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                          String AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                          String AV48Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                          String AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                          String AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                          String AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                          String AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          String A5808HreLanyLot ,
                                          short AV34Tb1_cod ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV35HreFecTin ,
                                          java.util.Date AV36HreFecTin_to ,
                                          String A396EmprCod ,
                                          String AV33Emprcod ,
                                          short A12535HreCencId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[14];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.EmprCod, T2.HreCencId, T1.HrdPrdDsc, T2.HreFecTin, T1.HreLanyLot, T1.PrdNum, T1.HreLinMAL, T1.HreNumAny" ;
      scmdbuf += " FROM (TXPHISREA T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar" ;
      scmdbuf += " AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T2.HreFecTin >= ?)");
      addWhere(sWhereString, "(T2.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.HreCencId = ?)");
      if ( ! (GXutil.strcmp("", AV47Wcwcdencproductos_anyadidasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrdPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.HreLanyLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwcdencproductos_anyadidasds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) && ( ! (GXutil.strcmp("", AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreLanyLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreLanyLot = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HrdPrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P095L4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Wcwcdencproductos_anyadidasds_1_filterfulltext ,
                                          String AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel ,
                                          String AV48Wcwcdencproductos_anyadidasds_2_tfprdnum ,
                                          String AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel ,
                                          String AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc ,
                                          String AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel ,
                                          String AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          String A5808HreLanyLot ,
                                          short AV34Tb1_cod ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV35HreFecTin ,
                                          java.util.Date AV36HreFecTin_to ,
                                          String A396EmprCod ,
                                          String AV33Emprcod ,
                                          short A12535HreCencId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[14];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.EmprCod, T2.HreCencId, T1.HreLanyLot, T2.HreFecTin, T1.HrdPrdDsc, T1.PrdNum, T1.HreLinMAL, T1.HreNumAny" ;
      scmdbuf += " FROM (TXPHISREA T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar" ;
      scmdbuf += " AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T2.HreFecTin >= ?)");
      addWhere(sWhereString, "(T2.HreFecTin <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.HreCencId = ?)");
      if ( ! (GXutil.strcmp("", AV47Wcwcdencproductos_anyadidasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrdPrdDsc) like '%' || UPPER(?)) or ( UPPER(T1.HreLanyLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwcdencproductos_anyadidasds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwcdencproductos_anyadidasds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Wcwcdencproductos_anyadidasds_4_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Wcwcdencproductos_anyadidasds_5_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) && ( ! (GXutil.strcmp("", AV52Wcwcdencproductos_anyadidasds_6_tfhrelanylot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreLanyLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Wcwcdencproductos_anyadidasds_7_tfhrelanylot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreLanyLot = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HreLanyLot" ;
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
                  return conditional_P095L2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
            case 1 :
                  return conditional_P095L3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() );
            case 2 :
                  return conditional_P095L4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095L3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095L4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               return;
      }
   }

}

