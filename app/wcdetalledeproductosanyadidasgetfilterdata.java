package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcdetalledeproductosanyadidasgetfilterdata extends GXProcedure
{
   public wcdetalledeproductosanyadidasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcdetalledeproductosanyadidasgetfilterdata.class ), "" );
   }

   public wcdetalledeproductosanyadidasgetfilterdata( int remoteHandle ,
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
      wcdetalledeproductosanyadidasgetfilterdata.this.aP5 = new String[] {""};
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
      wcdetalledeproductosanyadidasgetfilterdata.this.AV28DDOName = aP0;
      wcdetalledeproductosanyadidasgetfilterdata.this.AV26SearchTxt = aP1;
      wcdetalledeproductosanyadidasgetfilterdata.this.AV27SearchTxtTo = aP2;
      wcdetalledeproductosanyadidasgetfilterdata.this.aP3 = aP3;
      wcdetalledeproductosanyadidasgetfilterdata.this.aP4 = aP4;
      wcdetalledeproductosanyadidasgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_HRDPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_HRELANYUSR") == 0 )
      {
         /* Execute user subroutine: 'LOADHRELANYUSROPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV39Session.getValue("WCDetalledeProductosAnyadidasGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCDetalledeProductosAnyadidasGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("WCDetalledeProductosAnyadidasGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC") == 0 )
         {
            AV12TFHrdPrdDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRDPRDDSC_SEL") == 0 )
         {
            AV13TFHrdPrdDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYCAN") == 0 )
         {
            AV14TFHreLanyCan = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFHreLanyCan_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCFIN") == 0 )
         {
            AV16TFHrePrdCFin = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFHrePrdCFin_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYNRO") == 0 )
         {
            AV18TFHreLanyNro = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFHreLanyNro_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYTNQ") == 0 )
         {
            AV20TFHreLanyTnq = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFHreLanyTnq_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYUSR") == 0 )
         {
            AV22TFHreLanyUsr = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYUSR_SEL") == 0 )
         {
            AV23TFHreLanyUsr_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELANYFEC") == 0 )
         {
            AV24TFHreLanyFec = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45EmprCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV46HreBarCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV47HreBarReo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV48HreBarPar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV49HreNumCie = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV50HreLinMaq = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV26SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV55Wcdetalledeproductosanyadidasds_1_tfprdnum = AV10TFPrdNum ;
      AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV12TFHrdPrdDsc ;
      AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV13TFHrdPrdDsc_Sel ;
      AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV14TFHreLanyCan ;
      AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV15TFHreLanyCan_To ;
      AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV16TFHrePrdCFin ;
      AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV17TFHrePrdCFin_To ;
      AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV18TFHreLanyNro ;
      AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV19TFHreLanyNro_To ;
      AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV20TFHreLanyTnq ;
      AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV21TFHreLanyTnq_To ;
      AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV22TFHreLanyUsr ;
      AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV23TFHreLanyUsr_Sel ;
      AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV24TFHreLanyFec ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                           AV55Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                           AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                           AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                           AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                           AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                           AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                           AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                           Byte.valueOf(AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro) ,
                                           Byte.valueOf(AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) ,
                                           Byte.valueOf(AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) ,
                                           Byte.valueOf(AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) ,
                                           AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                           AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                           AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A4513HreLanyCan ,
                                           A4511HrePrdCFin ,
                                           Byte.valueOf(A4514HreLanyNro) ,
                                           Byte.valueOf(A4515HreLanyTnq) ,
                                           A4580HreLanyUsr ,
                                           A4581HreLanyFec ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV46HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV47HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV48HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV49HreNumCie) ,
                                           Short.valueOf(A4508HreLinMAL) ,
                                           Short.valueOf(AV50HreLinMaq) ,
                                           AV45EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Wcdetalledeproductosanyadidasds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Wcdetalledeproductosanyadidasds_1_tfprdnum), 6, "%") ;
      lV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc), 26, "%") ;
      lV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = GXutil.padr( GXutil.rtrim( AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr), 8, "%") ;
      /* Using cursor P08ZH2 */
      pr_default.execute(0, new Object[] {AV45EmprCod, Integer.valueOf(AV46HreBarCod), Byte.valueOf(AV47HreBarReo), AV48HreBarPar, Byte.valueOf(AV49HreNumCie), Short.valueOf(AV50HreLinMaq), lV55Wcdetalledeproductosanyadidasds_1_tfprdnum, AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel, lV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc, AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel, AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan, AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to, AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin, AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to, Byte.valueOf(AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro), Byte.valueOf(AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to), Byte.valueOf(AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq), Byte.valueOf(AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to), lV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr, AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel, AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8ZH2 = false ;
         A396EmprCod = P08ZH2_A396EmprCod[0] ;
         A719PrdNum = P08ZH2_A719PrdNum[0] ;
         A4508HreLinMAL = P08ZH2_A4508HreLinMAL[0] ;
         A4495HreNumCie = P08ZH2_A4495HreNumCie[0] ;
         A4494HreBarPar = P08ZH2_A4494HreBarPar[0] ;
         A4493HreBarReo = P08ZH2_A4493HreBarReo[0] ;
         A4492HreBarCod = P08ZH2_A4492HreBarCod[0] ;
         A4581HreLanyFec = P08ZH2_A4581HreLanyFec[0] ;
         n4581HreLanyFec = P08ZH2_n4581HreLanyFec[0] ;
         A4580HreLanyUsr = P08ZH2_A4580HreLanyUsr[0] ;
         n4580HreLanyUsr = P08ZH2_n4580HreLanyUsr[0] ;
         A4515HreLanyTnq = P08ZH2_A4515HreLanyTnq[0] ;
         n4515HreLanyTnq = P08ZH2_n4515HreLanyTnq[0] ;
         A4514HreLanyNro = P08ZH2_A4514HreLanyNro[0] ;
         n4514HreLanyNro = P08ZH2_n4514HreLanyNro[0] ;
         A4511HrePrdCFin = P08ZH2_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = P08ZH2_n4511HrePrdCFin[0] ;
         A4513HreLanyCan = P08ZH2_A4513HreLanyCan[0] ;
         n4513HreLanyCan = P08ZH2_n4513HreLanyCan[0] ;
         A4510HrdPrdDsc = P08ZH2_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P08ZH2_n4510HrdPrdDsc[0] ;
         A4509HreNumAny = P08ZH2_A4509HreNumAny[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08ZH2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08ZH2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8ZH2 = false ;
            A4508HreLinMAL = P08ZH2_A4508HreLinMAL[0] ;
            A4495HreNumCie = P08ZH2_A4495HreNumCie[0] ;
            A4494HreBarPar = P08ZH2_A4494HreBarPar[0] ;
            A4493HreBarReo = P08ZH2_A4493HreBarReo[0] ;
            A4492HreBarCod = P08ZH2_A4492HreBarCod[0] ;
            A4509HreNumAny = P08ZH2_A4509HreNumAny[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8ZH2 = true ;
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
         if ( ! brk8ZH2 )
         {
            brk8ZH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADHRDPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFHrdPrdDsc = AV26SearchTxt ;
      AV13TFHrdPrdDsc_Sel = "" ;
      AV55Wcdetalledeproductosanyadidasds_1_tfprdnum = AV10TFPrdNum ;
      AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV12TFHrdPrdDsc ;
      AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV13TFHrdPrdDsc_Sel ;
      AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV14TFHreLanyCan ;
      AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV15TFHreLanyCan_To ;
      AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV16TFHrePrdCFin ;
      AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV17TFHrePrdCFin_To ;
      AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV18TFHreLanyNro ;
      AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV19TFHreLanyNro_To ;
      AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV20TFHreLanyTnq ;
      AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV21TFHreLanyTnq_To ;
      AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV22TFHreLanyUsr ;
      AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV23TFHreLanyUsr_Sel ;
      AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV24TFHreLanyFec ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                           AV55Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                           AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                           AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                           AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                           AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                           AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                           AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                           Byte.valueOf(AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro) ,
                                           Byte.valueOf(AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) ,
                                           Byte.valueOf(AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) ,
                                           Byte.valueOf(AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) ,
                                           AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                           AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                           AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A4513HreLanyCan ,
                                           A4511HrePrdCFin ,
                                           Byte.valueOf(A4514HreLanyNro) ,
                                           Byte.valueOf(A4515HreLanyTnq) ,
                                           A4580HreLanyUsr ,
                                           A4581HreLanyFec ,
                                           A396EmprCod ,
                                           AV45EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV46HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV47HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV48HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV49HreNumCie) ,
                                           Short.valueOf(A4508HreLinMAL) ,
                                           Short.valueOf(AV50HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV55Wcdetalledeproductosanyadidasds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Wcdetalledeproductosanyadidasds_1_tfprdnum), 6, "%") ;
      lV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc), 26, "%") ;
      lV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = GXutil.padr( GXutil.rtrim( AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr), 8, "%") ;
      /* Using cursor P08ZH3 */
      pr_default.execute(1, new Object[] {AV45EmprCod, Integer.valueOf(AV46HreBarCod), Byte.valueOf(AV47HreBarReo), AV48HreBarPar, Byte.valueOf(AV49HreNumCie), Short.valueOf(AV50HreLinMaq), lV55Wcdetalledeproductosanyadidasds_1_tfprdnum, AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel, lV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc, AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel, AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan, AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to, AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin, AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to, Byte.valueOf(AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro), Byte.valueOf(AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to), Byte.valueOf(AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq), Byte.valueOf(AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to), lV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr, AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel, AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8ZH4 = false ;
         A396EmprCod = P08ZH3_A396EmprCod[0] ;
         A4492HreBarCod = P08ZH3_A4492HreBarCod[0] ;
         A4493HreBarReo = P08ZH3_A4493HreBarReo[0] ;
         A4494HreBarPar = P08ZH3_A4494HreBarPar[0] ;
         A4495HreNumCie = P08ZH3_A4495HreNumCie[0] ;
         A4508HreLinMAL = P08ZH3_A4508HreLinMAL[0] ;
         A4510HrdPrdDsc = P08ZH3_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P08ZH3_n4510HrdPrdDsc[0] ;
         A4581HreLanyFec = P08ZH3_A4581HreLanyFec[0] ;
         n4581HreLanyFec = P08ZH3_n4581HreLanyFec[0] ;
         A4580HreLanyUsr = P08ZH3_A4580HreLanyUsr[0] ;
         n4580HreLanyUsr = P08ZH3_n4580HreLanyUsr[0] ;
         A4515HreLanyTnq = P08ZH3_A4515HreLanyTnq[0] ;
         n4515HreLanyTnq = P08ZH3_n4515HreLanyTnq[0] ;
         A4514HreLanyNro = P08ZH3_A4514HreLanyNro[0] ;
         n4514HreLanyNro = P08ZH3_n4514HreLanyNro[0] ;
         A4511HrePrdCFin = P08ZH3_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = P08ZH3_n4511HrePrdCFin[0] ;
         A4513HreLanyCan = P08ZH3_A4513HreLanyCan[0] ;
         n4513HreLanyCan = P08ZH3_n4513HreLanyCan[0] ;
         A719PrdNum = P08ZH3_A719PrdNum[0] ;
         A4509HreNumAny = P08ZH3_A4509HreNumAny[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08ZH3_A4510HrdPrdDsc[0], A4510HrdPrdDsc) == 0 ) )
         {
            brk8ZH4 = false ;
            A396EmprCod = P08ZH3_A396EmprCod[0] ;
            A4492HreBarCod = P08ZH3_A4492HreBarCod[0] ;
            A4493HreBarReo = P08ZH3_A4493HreBarReo[0] ;
            A4494HreBarPar = P08ZH3_A4494HreBarPar[0] ;
            A4495HreNumCie = P08ZH3_A4495HreNumCie[0] ;
            A4508HreLinMAL = P08ZH3_A4508HreLinMAL[0] ;
            A719PrdNum = P08ZH3_A719PrdNum[0] ;
            A4509HreNumAny = P08ZH3_A4509HreNumAny[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8ZH4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4510HrdPrdDsc)==0) )
         {
            AV30Option = A4510HrdPrdDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZH4 )
         {
            brk8ZH4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADHRELANYUSROPTIONS' Routine */
      returnInSub = false ;
      AV22TFHreLanyUsr = AV26SearchTxt ;
      AV23TFHreLanyUsr_Sel = "" ;
      AV55Wcdetalledeproductosanyadidasds_1_tfprdnum = AV10TFPrdNum ;
      AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = AV12TFHrdPrdDsc ;
      AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = AV13TFHrdPrdDsc_Sel ;
      AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan = AV14TFHreLanyCan ;
      AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = AV15TFHreLanyCan_To ;
      AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = AV16TFHrePrdCFin ;
      AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = AV17TFHrePrdCFin_To ;
      AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro = AV18TFHreLanyNro ;
      AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to = AV19TFHreLanyNro_To ;
      AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq = AV20TFHreLanyTnq ;
      AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to = AV21TFHreLanyTnq_To ;
      AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = AV22TFHreLanyUsr ;
      AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = AV23TFHreLanyUsr_Sel ;
      AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = AV24TFHreLanyFec ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                           AV55Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                           AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                           AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                           AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                           AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                           AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                           AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                           Byte.valueOf(AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro) ,
                                           Byte.valueOf(AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) ,
                                           Byte.valueOf(AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) ,
                                           Byte.valueOf(AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) ,
                                           AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                           AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                           AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                           A719PrdNum ,
                                           A4510HrdPrdDsc ,
                                           A4513HreLanyCan ,
                                           A4511HrePrdCFin ,
                                           Byte.valueOf(A4514HreLanyNro) ,
                                           Byte.valueOf(A4515HreLanyTnq) ,
                                           A4580HreLanyUsr ,
                                           A4581HreLanyFec ,
                                           A396EmprCod ,
                                           AV45EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV46HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV47HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV48HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Byte.valueOf(AV49HreNumCie) ,
                                           Short.valueOf(A4508HreLinMAL) ,
                                           Short.valueOf(AV50HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV55Wcdetalledeproductosanyadidasds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Wcdetalledeproductosanyadidasds_1_tfprdnum), 6, "%") ;
      lV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = GXutil.padr( GXutil.rtrim( AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc), 26, "%") ;
      lV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = GXutil.padr( GXutil.rtrim( AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr), 8, "%") ;
      /* Using cursor P08ZH4 */
      pr_default.execute(2, new Object[] {AV45EmprCod, Integer.valueOf(AV46HreBarCod), Byte.valueOf(AV47HreBarReo), AV48HreBarPar, Byte.valueOf(AV49HreNumCie), Short.valueOf(AV50HreLinMaq), lV55Wcdetalledeproductosanyadidasds_1_tfprdnum, AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel, lV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc, AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel, AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan, AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to, AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin, AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to, Byte.valueOf(AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro), Byte.valueOf(AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to), Byte.valueOf(AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq), Byte.valueOf(AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to), lV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr, AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel, AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8ZH6 = false ;
         A396EmprCod = P08ZH4_A396EmprCod[0] ;
         A4492HreBarCod = P08ZH4_A4492HreBarCod[0] ;
         A4493HreBarReo = P08ZH4_A4493HreBarReo[0] ;
         A4494HreBarPar = P08ZH4_A4494HreBarPar[0] ;
         A4495HreNumCie = P08ZH4_A4495HreNumCie[0] ;
         A4508HreLinMAL = P08ZH4_A4508HreLinMAL[0] ;
         A4580HreLanyUsr = P08ZH4_A4580HreLanyUsr[0] ;
         n4580HreLanyUsr = P08ZH4_n4580HreLanyUsr[0] ;
         A4581HreLanyFec = P08ZH4_A4581HreLanyFec[0] ;
         n4581HreLanyFec = P08ZH4_n4581HreLanyFec[0] ;
         A4515HreLanyTnq = P08ZH4_A4515HreLanyTnq[0] ;
         n4515HreLanyTnq = P08ZH4_n4515HreLanyTnq[0] ;
         A4514HreLanyNro = P08ZH4_A4514HreLanyNro[0] ;
         n4514HreLanyNro = P08ZH4_n4514HreLanyNro[0] ;
         A4511HrePrdCFin = P08ZH4_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = P08ZH4_n4511HrePrdCFin[0] ;
         A4513HreLanyCan = P08ZH4_A4513HreLanyCan[0] ;
         n4513HreLanyCan = P08ZH4_n4513HreLanyCan[0] ;
         A4510HrdPrdDsc = P08ZH4_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = P08ZH4_n4510HrdPrdDsc[0] ;
         A719PrdNum = P08ZH4_A719PrdNum[0] ;
         A4509HreNumAny = P08ZH4_A4509HreNumAny[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08ZH4_A4580HreLanyUsr[0], A4580HreLanyUsr) == 0 ) )
         {
            brk8ZH6 = false ;
            A396EmprCod = P08ZH4_A396EmprCod[0] ;
            A4492HreBarCod = P08ZH4_A4492HreBarCod[0] ;
            A4493HreBarReo = P08ZH4_A4493HreBarReo[0] ;
            A4494HreBarPar = P08ZH4_A4494HreBarPar[0] ;
            A4495HreNumCie = P08ZH4_A4495HreNumCie[0] ;
            A4508HreLinMAL = P08ZH4_A4508HreLinMAL[0] ;
            A719PrdNum = P08ZH4_A719PrdNum[0] ;
            A4509HreNumAny = P08ZH4_A4509HreNumAny[0] ;
            AV38count = (long)(AV38count+1) ;
            brk8ZH6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4580HreLanyUsr)==0) )
         {
            AV30Option = A4580HreLanyUsr ;
            AV33OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4580HreLanyUsr, "@!"))) ;
            AV31Options.add(AV30Option, 0);
            AV34OptionsDesc.add(AV33OptionDesc, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZH6 )
         {
            brk8ZH6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcdetalledeproductosanyadidasgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = wcdetalledeproductosanyadidasgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = wcdetalledeproductosanyadidasgetfilterdata.this.AV37OptionIndexesJson;
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
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFHrdPrdDsc = "" ;
      AV13TFHrdPrdDsc_Sel = "" ;
      AV14TFHreLanyCan = DecimalUtil.ZERO ;
      AV15TFHreLanyCan_To = DecimalUtil.ZERO ;
      AV16TFHrePrdCFin = DecimalUtil.ZERO ;
      AV17TFHrePrdCFin_To = DecimalUtil.ZERO ;
      AV22TFHreLanyUsr = "" ;
      AV23TFHreLanyUsr_Sel = "" ;
      AV24TFHreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      AV45EmprCod = "" ;
      AV48HreBarPar = "" ;
      A719PrdNum = "" ;
      AV55Wcdetalledeproductosanyadidasds_1_tfprdnum = "" ;
      AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel = "" ;
      AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = "" ;
      AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel = "" ;
      AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan = DecimalUtil.ZERO ;
      AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to = DecimalUtil.ZERO ;
      AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin = DecimalUtil.ZERO ;
      AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to = DecimalUtil.ZERO ;
      AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = "" ;
      AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel = "" ;
      AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV55Wcdetalledeproductosanyadidasds_1_tfprdnum = "" ;
      lV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc = "" ;
      lV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr = "" ;
      A4510HrdPrdDsc = "" ;
      A4513HreLanyCan = DecimalUtil.ZERO ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A4580HreLanyUsr = "" ;
      A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      A4494HreBarPar = "" ;
      A396EmprCod = "" ;
      P08ZH2_A396EmprCod = new String[] {""} ;
      P08ZH2_A719PrdNum = new String[] {""} ;
      P08ZH2_A4508HreLinMAL = new short[1] ;
      P08ZH2_A4495HreNumCie = new byte[1] ;
      P08ZH2_A4494HreBarPar = new String[] {""} ;
      P08ZH2_A4493HreBarReo = new byte[1] ;
      P08ZH2_A4492HreBarCod = new int[1] ;
      P08ZH2_A4581HreLanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZH2_n4581HreLanyFec = new boolean[] {false} ;
      P08ZH2_A4580HreLanyUsr = new String[] {""} ;
      P08ZH2_n4580HreLanyUsr = new boolean[] {false} ;
      P08ZH2_A4515HreLanyTnq = new byte[1] ;
      P08ZH2_n4515HreLanyTnq = new boolean[] {false} ;
      P08ZH2_A4514HreLanyNro = new byte[1] ;
      P08ZH2_n4514HreLanyNro = new boolean[] {false} ;
      P08ZH2_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZH2_n4511HrePrdCFin = new boolean[] {false} ;
      P08ZH2_A4513HreLanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZH2_n4513HreLanyCan = new boolean[] {false} ;
      P08ZH2_A4510HrdPrdDsc = new String[] {""} ;
      P08ZH2_n4510HrdPrdDsc = new boolean[] {false} ;
      P08ZH2_A4509HreNumAny = new byte[1] ;
      AV30Option = "" ;
      P08ZH3_A396EmprCod = new String[] {""} ;
      P08ZH3_A4492HreBarCod = new int[1] ;
      P08ZH3_A4493HreBarReo = new byte[1] ;
      P08ZH3_A4494HreBarPar = new String[] {""} ;
      P08ZH3_A4495HreNumCie = new byte[1] ;
      P08ZH3_A4508HreLinMAL = new short[1] ;
      P08ZH3_A4510HrdPrdDsc = new String[] {""} ;
      P08ZH3_n4510HrdPrdDsc = new boolean[] {false} ;
      P08ZH3_A4581HreLanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZH3_n4581HreLanyFec = new boolean[] {false} ;
      P08ZH3_A4580HreLanyUsr = new String[] {""} ;
      P08ZH3_n4580HreLanyUsr = new boolean[] {false} ;
      P08ZH3_A4515HreLanyTnq = new byte[1] ;
      P08ZH3_n4515HreLanyTnq = new boolean[] {false} ;
      P08ZH3_A4514HreLanyNro = new byte[1] ;
      P08ZH3_n4514HreLanyNro = new boolean[] {false} ;
      P08ZH3_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZH3_n4511HrePrdCFin = new boolean[] {false} ;
      P08ZH3_A4513HreLanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZH3_n4513HreLanyCan = new boolean[] {false} ;
      P08ZH3_A719PrdNum = new String[] {""} ;
      P08ZH3_A4509HreNumAny = new byte[1] ;
      P08ZH4_A396EmprCod = new String[] {""} ;
      P08ZH4_A4492HreBarCod = new int[1] ;
      P08ZH4_A4493HreBarReo = new byte[1] ;
      P08ZH4_A4494HreBarPar = new String[] {""} ;
      P08ZH4_A4495HreNumCie = new byte[1] ;
      P08ZH4_A4508HreLinMAL = new short[1] ;
      P08ZH4_A4580HreLanyUsr = new String[] {""} ;
      P08ZH4_n4580HreLanyUsr = new boolean[] {false} ;
      P08ZH4_A4581HreLanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZH4_n4581HreLanyFec = new boolean[] {false} ;
      P08ZH4_A4515HreLanyTnq = new byte[1] ;
      P08ZH4_n4515HreLanyTnq = new boolean[] {false} ;
      P08ZH4_A4514HreLanyNro = new byte[1] ;
      P08ZH4_n4514HreLanyNro = new boolean[] {false} ;
      P08ZH4_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZH4_n4511HrePrdCFin = new boolean[] {false} ;
      P08ZH4_A4513HreLanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZH4_n4513HreLanyCan = new boolean[] {false} ;
      P08ZH4_A4510HrdPrdDsc = new String[] {""} ;
      P08ZH4_n4510HrdPrdDsc = new boolean[] {false} ;
      P08ZH4_A719PrdNum = new String[] {""} ;
      P08ZH4_A4509HreNumAny = new byte[1] ;
      AV33OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcdetalledeproductosanyadidasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08ZH2_A396EmprCod, P08ZH2_A719PrdNum, P08ZH2_A4508HreLinMAL, P08ZH2_A4495HreNumCie, P08ZH2_A4494HreBarPar, P08ZH2_A4493HreBarReo, P08ZH2_A4492HreBarCod, P08ZH2_A4581HreLanyFec, P08ZH2_n4581HreLanyFec, P08ZH2_A4580HreLanyUsr,
            P08ZH2_n4580HreLanyUsr, P08ZH2_A4515HreLanyTnq, P08ZH2_n4515HreLanyTnq, P08ZH2_A4514HreLanyNro, P08ZH2_n4514HreLanyNro, P08ZH2_A4511HrePrdCFin, P08ZH2_n4511HrePrdCFin, P08ZH2_A4513HreLanyCan, P08ZH2_n4513HreLanyCan, P08ZH2_A4510HrdPrdDsc,
            P08ZH2_n4510HrdPrdDsc, P08ZH2_A4509HreNumAny
            }
            , new Object[] {
            P08ZH3_A396EmprCod, P08ZH3_A4492HreBarCod, P08ZH3_A4493HreBarReo, P08ZH3_A4494HreBarPar, P08ZH3_A4495HreNumCie, P08ZH3_A4508HreLinMAL, P08ZH3_A4510HrdPrdDsc, P08ZH3_n4510HrdPrdDsc, P08ZH3_A4581HreLanyFec, P08ZH3_n4581HreLanyFec,
            P08ZH3_A4580HreLanyUsr, P08ZH3_n4580HreLanyUsr, P08ZH3_A4515HreLanyTnq, P08ZH3_n4515HreLanyTnq, P08ZH3_A4514HreLanyNro, P08ZH3_n4514HreLanyNro, P08ZH3_A4511HrePrdCFin, P08ZH3_n4511HrePrdCFin, P08ZH3_A4513HreLanyCan, P08ZH3_n4513HreLanyCan,
            P08ZH3_A719PrdNum, P08ZH3_A4509HreNumAny
            }
            , new Object[] {
            P08ZH4_A396EmprCod, P08ZH4_A4492HreBarCod, P08ZH4_A4493HreBarReo, P08ZH4_A4494HreBarPar, P08ZH4_A4495HreNumCie, P08ZH4_A4508HreLinMAL, P08ZH4_A4580HreLanyUsr, P08ZH4_n4580HreLanyUsr, P08ZH4_A4581HreLanyFec, P08ZH4_n4581HreLanyFec,
            P08ZH4_A4515HreLanyTnq, P08ZH4_n4515HreLanyTnq, P08ZH4_A4514HreLanyNro, P08ZH4_n4514HreLanyNro, P08ZH4_A4511HrePrdCFin, P08ZH4_n4511HrePrdCFin, P08ZH4_A4513HreLanyCan, P08ZH4_n4513HreLanyCan, P08ZH4_A4510HrdPrdDsc, P08ZH4_n4510HrdPrdDsc,
            P08ZH4_A719PrdNum, P08ZH4_A4509HreNumAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TFHreLanyNro ;
   private byte AV19TFHreLanyNro_To ;
   private byte AV20TFHreLanyTnq ;
   private byte AV21TFHreLanyTnq_To ;
   private byte AV47HreBarReo ;
   private byte AV49HreNumCie ;
   private byte AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro ;
   private byte AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ;
   private byte AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ;
   private byte AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ;
   private byte A4514HreLanyNro ;
   private byte A4515HreLanyTnq ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4509HreNumAny ;
   private short AV50HreLinMaq ;
   private short A4508HreLinMAL ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV46HreBarCod ;
   private int A4492HreBarCod ;
   private long AV38count ;
   private java.math.BigDecimal AV14TFHreLanyCan ;
   private java.math.BigDecimal AV15TFHreLanyCan_To ;
   private java.math.BigDecimal AV16TFHrePrdCFin ;
   private java.math.BigDecimal AV17TFHrePrdCFin_To ;
   private java.math.BigDecimal AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan ;
   private java.math.BigDecimal AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ;
   private java.math.BigDecimal AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ;
   private java.math.BigDecimal AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ;
   private java.math.BigDecimal A4513HreLanyCan ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFHrdPrdDsc ;
   private String AV13TFHrdPrdDsc_Sel ;
   private String AV22TFHreLanyUsr ;
   private String AV23TFHreLanyUsr_Sel ;
   private String AV45EmprCod ;
   private String AV48HreBarPar ;
   private String A719PrdNum ;
   private String AV55Wcdetalledeproductosanyadidasds_1_tfprdnum ;
   private String AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ;
   private String AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ;
   private String AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ;
   private String AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ;
   private String AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ;
   private String scmdbuf ;
   private String lV55Wcdetalledeproductosanyadidasds_1_tfprdnum ;
   private String lV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ;
   private String lV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ;
   private String A4510HrdPrdDsc ;
   private String A4580HreLanyUsr ;
   private String A4494HreBarPar ;
   private String A396EmprCod ;
   private java.util.Date AV24TFHreLanyFec ;
   private java.util.Date AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ;
   private java.util.Date A4581HreLanyFec ;
   private boolean returnInSub ;
   private boolean brk8ZH2 ;
   private boolean n4581HreLanyFec ;
   private boolean n4580HreLanyUsr ;
   private boolean n4515HreLanyTnq ;
   private boolean n4514HreLanyNro ;
   private boolean n4511HrePrdCFin ;
   private boolean n4513HreLanyCan ;
   private boolean n4510HrdPrdDsc ;
   private boolean brk8ZH4 ;
   private boolean brk8ZH6 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV30Option ;
   private String AV33OptionDesc ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08ZH2_A396EmprCod ;
   private String[] P08ZH2_A719PrdNum ;
   private short[] P08ZH2_A4508HreLinMAL ;
   private byte[] P08ZH2_A4495HreNumCie ;
   private String[] P08ZH2_A4494HreBarPar ;
   private byte[] P08ZH2_A4493HreBarReo ;
   private int[] P08ZH2_A4492HreBarCod ;
   private java.util.Date[] P08ZH2_A4581HreLanyFec ;
   private boolean[] P08ZH2_n4581HreLanyFec ;
   private String[] P08ZH2_A4580HreLanyUsr ;
   private boolean[] P08ZH2_n4580HreLanyUsr ;
   private byte[] P08ZH2_A4515HreLanyTnq ;
   private boolean[] P08ZH2_n4515HreLanyTnq ;
   private byte[] P08ZH2_A4514HreLanyNro ;
   private boolean[] P08ZH2_n4514HreLanyNro ;
   private java.math.BigDecimal[] P08ZH2_A4511HrePrdCFin ;
   private boolean[] P08ZH2_n4511HrePrdCFin ;
   private java.math.BigDecimal[] P08ZH2_A4513HreLanyCan ;
   private boolean[] P08ZH2_n4513HreLanyCan ;
   private String[] P08ZH2_A4510HrdPrdDsc ;
   private boolean[] P08ZH2_n4510HrdPrdDsc ;
   private byte[] P08ZH2_A4509HreNumAny ;
   private String[] P08ZH3_A396EmprCod ;
   private int[] P08ZH3_A4492HreBarCod ;
   private byte[] P08ZH3_A4493HreBarReo ;
   private String[] P08ZH3_A4494HreBarPar ;
   private byte[] P08ZH3_A4495HreNumCie ;
   private short[] P08ZH3_A4508HreLinMAL ;
   private String[] P08ZH3_A4510HrdPrdDsc ;
   private boolean[] P08ZH3_n4510HrdPrdDsc ;
   private java.util.Date[] P08ZH3_A4581HreLanyFec ;
   private boolean[] P08ZH3_n4581HreLanyFec ;
   private String[] P08ZH3_A4580HreLanyUsr ;
   private boolean[] P08ZH3_n4580HreLanyUsr ;
   private byte[] P08ZH3_A4515HreLanyTnq ;
   private boolean[] P08ZH3_n4515HreLanyTnq ;
   private byte[] P08ZH3_A4514HreLanyNro ;
   private boolean[] P08ZH3_n4514HreLanyNro ;
   private java.math.BigDecimal[] P08ZH3_A4511HrePrdCFin ;
   private boolean[] P08ZH3_n4511HrePrdCFin ;
   private java.math.BigDecimal[] P08ZH3_A4513HreLanyCan ;
   private boolean[] P08ZH3_n4513HreLanyCan ;
   private String[] P08ZH3_A719PrdNum ;
   private byte[] P08ZH3_A4509HreNumAny ;
   private String[] P08ZH4_A396EmprCod ;
   private int[] P08ZH4_A4492HreBarCod ;
   private byte[] P08ZH4_A4493HreBarReo ;
   private String[] P08ZH4_A4494HreBarPar ;
   private byte[] P08ZH4_A4495HreNumCie ;
   private short[] P08ZH4_A4508HreLinMAL ;
   private String[] P08ZH4_A4580HreLanyUsr ;
   private boolean[] P08ZH4_n4580HreLanyUsr ;
   private java.util.Date[] P08ZH4_A4581HreLanyFec ;
   private boolean[] P08ZH4_n4581HreLanyFec ;
   private byte[] P08ZH4_A4515HreLanyTnq ;
   private boolean[] P08ZH4_n4515HreLanyTnq ;
   private byte[] P08ZH4_A4514HreLanyNro ;
   private boolean[] P08ZH4_n4514HreLanyNro ;
   private java.math.BigDecimal[] P08ZH4_A4511HrePrdCFin ;
   private boolean[] P08ZH4_n4511HrePrdCFin ;
   private java.math.BigDecimal[] P08ZH4_A4513HreLanyCan ;
   private boolean[] P08ZH4_n4513HreLanyCan ;
   private String[] P08ZH4_A4510HrdPrdDsc ;
   private boolean[] P08ZH4_n4510HrdPrdDsc ;
   private String[] P08ZH4_A719PrdNum ;
   private byte[] P08ZH4_A4509HreNumAny ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class wcdetalledeproductosanyadidasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                          String AV55Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                          String AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                          String AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                          java.math.BigDecimal AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                          java.math.BigDecimal AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                          java.math.BigDecimal AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                          java.math.BigDecimal AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                          byte AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro ,
                                          byte AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ,
                                          byte AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ,
                                          byte AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ,
                                          String AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                          String AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                          java.util.Date AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          java.math.BigDecimal A4513HreLanyCan ,
                                          java.math.BigDecimal A4511HrePrdCFin ,
                                          byte A4514HreLanyNro ,
                                          byte A4515HreLanyTnq ,
                                          String A4580HreLanyUsr ,
                                          java.util.Date A4581HreLanyFec ,
                                          int A4492HreBarCod ,
                                          int AV46HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV47HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV48HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV49HreNumCie ,
                                          short A4508HreLinMAL ,
                                          short AV50HreLinMaq ,
                                          String AV45EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, HreLinMAL, HreNumCie, HreBarPar, HreBarReo, HreBarCod, HreLanyFec, HreLanyUsr, HreLanyTnq, HreLanyNro, HrePrdCFin, HreLanyCan, HrdPrdDsc," ;
      scmdbuf += " HreNumAny FROM TXPHISREA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMAL = ?)");
      if ( (GXutil.strcmp("", AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcdetalledeproductosanyadidasds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro) )
      {
         addWhere(sWhereString, "(HreLanyNro >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) )
      {
         addWhere(sWhereString, "(HreLanyNro <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) )
      {
         addWhere(sWhereString, "(HreLanyTnq >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) )
      {
         addWhere(sWhereString, "(HreLanyTnq <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLanyUsr = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec) )
      {
         addWhere(sWhereString, "(HreLanyFec >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08ZH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                          String AV55Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                          String AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                          String AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                          java.math.BigDecimal AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                          java.math.BigDecimal AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                          java.math.BigDecimal AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                          java.math.BigDecimal AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                          byte AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro ,
                                          byte AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ,
                                          byte AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ,
                                          byte AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ,
                                          String AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                          String AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                          java.util.Date AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          java.math.BigDecimal A4513HreLanyCan ,
                                          java.math.BigDecimal A4511HrePrdCFin ,
                                          byte A4514HreLanyNro ,
                                          byte A4515HreLanyTnq ,
                                          String A4580HreLanyUsr ,
                                          java.util.Date A4581HreLanyFec ,
                                          String A396EmprCod ,
                                          String AV45EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV46HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV47HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV48HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV49HreNumCie ,
                                          short A4508HreLinMAL ,
                                          short AV50HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[21];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HrdPrdDsc, HreLanyFec, HreLanyUsr, HreLanyTnq, HreLanyNro, HrePrdCFin, HreLanyCan, PrdNum," ;
      scmdbuf += " HreNumAny FROM TXPHISREA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMAL = ?)");
      if ( (GXutil.strcmp("", AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcdetalledeproductosanyadidasds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro) )
      {
         addWhere(sWhereString, "(HreLanyNro >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) )
      {
         addWhere(sWhereString, "(HreLanyNro <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) )
      {
         addWhere(sWhereString, "(HreLanyTnq >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) )
      {
         addWhere(sWhereString, "(HreLanyTnq <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLanyUsr = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec) )
      {
         addWhere(sWhereString, "(HreLanyFec >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HrdPrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08ZH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel ,
                                          String AV55Wcdetalledeproductosanyadidasds_1_tfprdnum ,
                                          String AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel ,
                                          String AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc ,
                                          java.math.BigDecimal AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan ,
                                          java.math.BigDecimal AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to ,
                                          java.math.BigDecimal AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin ,
                                          java.math.BigDecimal AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to ,
                                          byte AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro ,
                                          byte AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to ,
                                          byte AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq ,
                                          byte AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to ,
                                          String AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel ,
                                          String AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr ,
                                          java.util.Date AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec ,
                                          String A719PrdNum ,
                                          String A4510HrdPrdDsc ,
                                          java.math.BigDecimal A4513HreLanyCan ,
                                          java.math.BigDecimal A4511HrePrdCFin ,
                                          byte A4514HreLanyNro ,
                                          byte A4515HreLanyTnq ,
                                          String A4580HreLanyUsr ,
                                          java.util.Date A4581HreLanyFec ,
                                          String A396EmprCod ,
                                          String AV45EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV46HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV47HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV48HreBarPar ,
                                          byte A4495HreNumCie ,
                                          byte AV49HreNumCie ,
                                          short A4508HreLinMAL ,
                                          short AV50HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreLanyUsr, HreLanyFec, HreLanyTnq, HreLanyNro, HrePrdCFin, HreLanyCan, HrdPrdDsc, PrdNum," ;
      scmdbuf += " HreNumAny FROM TXPHISREA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(HreNumCie = ?)");
      addWhere(sWhereString, "(HreLinMAL = ?)");
      if ( (GXutil.strcmp("", AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcdetalledeproductosanyadidasds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcdetalledeproductosanyadidasds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcdetalledeproductosanyadidasds_3_tfhrdprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrdPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcdetalledeproductosanyadidasds_4_tfhrdprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(HrdPrdDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wcdetalledeproductosanyadidasds_5_tfhrelanycan)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wcdetalledeproductosanyadidasds_6_tfhrelanycan_to)==0) )
      {
         addWhere(sWhereString, "(HreLanyCan <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcdetalledeproductosanyadidasds_7_tfhreprdcfin)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcdetalledeproductosanyadidasds_8_tfhreprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCFin <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV63Wcdetalledeproductosanyadidasds_9_tfhrelanynro) )
      {
         addWhere(sWhereString, "(HreLanyNro >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcdetalledeproductosanyadidasds_10_tfhrelanynro_to) )
      {
         addWhere(sWhereString, "(HreLanyNro <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcdetalledeproductosanyadidasds_11_tfhrelanytnq) )
      {
         addWhere(sWhereString, "(HreLanyTnq >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcdetalledeproductosanyadidasds_12_tfhrelanytnq_to) )
      {
         addWhere(sWhereString, "(HreLanyTnq <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV67Wcdetalledeproductosanyadidasds_13_tfhrelanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Wcdetalledeproductosanyadidasds_14_tfhrelanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(HreLanyUsr = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Wcdetalledeproductosanyadidasds_15_tfhrelanyfec) )
      {
         addWhere(sWhereString, "(HreLanyFec >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreLanyUsr" ;
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
                  return conditional_P08ZH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_P08ZH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() );
            case 2 :
                  return conditional_P08ZH4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,3);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 6);
               ((byte[]) buf[21])[0] = rslt.getByte(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 6);
               ((byte[]) buf[21])[0] = rslt.getByte(15);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               return;
      }
   }

}

