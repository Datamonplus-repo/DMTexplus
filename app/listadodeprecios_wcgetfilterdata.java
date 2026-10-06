package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeprecios_wcgetfilterdata extends GXProcedure
{
   public listadodeprecios_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeprecios_wcgetfilterdata.class ), "" );
   }

   public listadodeprecios_wcgetfilterdata( int remoteHandle ,
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
      listadodeprecios_wcgetfilterdata.this.aP5 = new String[] {""};
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
      listadodeprecios_wcgetfilterdata.this.AV38DDOName = aP0;
      listadodeprecios_wcgetfilterdata.this.AV39SearchTxt = aP1;
      listadodeprecios_wcgetfilterdata.this.AV40SearchTxtTo = aP2;
      listadodeprecios_wcgetfilterdata.this.aP3 = aP3;
      listadodeprecios_wcgetfilterdata.this.aP4 = aP4;
      listadodeprecios_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV31OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRVNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRDREFPRV") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDREFPRVOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_VALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADVALDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV41OptionsJson = AV28Options.toJSonString(false) ;
      AV42OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV31OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("ListadodePrecios_WCGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListadodePrecios_WCGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("ListadodePrecios_WCGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV14TFPrvNum = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPrvNum_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV16TFPrvNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV17TFPrvNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV18TFPrdRefPrv = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV19TFPrdRefPrv_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV20TFPrdPreAct = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFPrdPreAct_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFECPRE") == 0 )
         {
            AV22TFPrdFecPre = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV24TFValDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV25TFValDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV46Prdnum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV47Prdnum_to = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV48PrvNum = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM_TO") == 0 )
         {
            AV49PrvNum_to = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV39SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV54Listadodeprecios_wcds_1_filterfulltext = AV44FilterFullText ;
      AV55Listadodeprecios_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV56Listadodeprecios_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV57Listadodeprecios_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV58Listadodeprecios_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV59Listadodeprecios_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV60Listadodeprecios_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV61Listadodeprecios_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV62Listadodeprecios_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV63Listadodeprecios_wcds_10_tfprdrefprv = AV18TFPrdRefPrv ;
      AV64Listadodeprecios_wcds_11_tfprdrefprv_sel = AV19TFPrdRefPrv_Sel ;
      AV65Listadodeprecios_wcds_12_tfprdpreact = AV20TFPrdPreAct ;
      AV66Listadodeprecios_wcds_13_tfprdpreact_to = AV21TFPrdPreAct_To ;
      AV67Listadodeprecios_wcds_14_tfprdfecpre = AV22TFPrdFecPre ;
      AV68Listadodeprecios_wcds_15_tfvaldsc = AV24TFValDsc ;
      AV69Listadodeprecios_wcds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Listadodeprecios_wcds_1_filterfulltext ,
                                           AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                           AV55Listadodeprecios_wcds_2_tfprdnum ,
                                           AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                           AV57Listadodeprecios_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to) ,
                                           AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                           AV61Listadodeprecios_wcds_8_tfprvnom ,
                                           AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                           AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                           AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                           AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                           AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                           AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                           AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A728PrdRefPrv ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A709PrdFecPre ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           Integer.valueOf(AV49PrvNum_to) ,
                                           AV45Emprcod ,
                                           AV46Prdnum ,
                                           A396EmprCod ,
                                           AV47Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV55Listadodeprecios_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Listadodeprecios_wcds_2_tfprdnum), 6, "%") ;
      lV57Listadodeprecios_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Listadodeprecios_wcds_4_tfprdnom), 26, "%") ;
      lV61Listadodeprecios_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV61Listadodeprecios_wcds_8_tfprvnom), 30, "%") ;
      lV63Listadodeprecios_wcds_10_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV63Listadodeprecios_wcds_10_tfprdrefprv), 30, "%") ;
      lV68Listadodeprecios_wcds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV68Listadodeprecios_wcds_15_tfvaldsc), 16, "%") ;
      /* Using cursor P09S02 */
      pr_default.execute(0, new Object[] {AV45Emprcod, AV46Prdnum, Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49PrvNum_to), AV47Prdnum_to, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV55Listadodeprecios_wcds_2_tfprdnum, AV56Listadodeprecios_wcds_3_tfprdnum_sel, lV57Listadodeprecios_wcds_4_tfprdnom, AV58Listadodeprecios_wcds_5_tfprdnom_sel, Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum), Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to), lV61Listadodeprecios_wcds_8_tfprvnom, AV62Listadodeprecios_wcds_9_tfprvnom_sel, lV63Listadodeprecios_wcds_10_tfprdrefprv, AV64Listadodeprecios_wcds_11_tfprdrefprv_sel, AV65Listadodeprecios_wcds_12_tfprdpreact, AV66Listadodeprecios_wcds_13_tfprdpreact_to, AV67Listadodeprecios_wcds_14_tfprdfecpre, lV68Listadodeprecios_wcds_15_tfvaldsc, AV69Listadodeprecios_wcds_16_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9S02 = false ;
         A856ValCod = P09S02_A856ValCod[0] ;
         A396EmprCod = P09S02_A396EmprCod[0] ;
         A719PrdNum = P09S02_A719PrdNum[0] ;
         A857ValDsc = P09S02_A857ValDsc[0] ;
         n857ValDsc = P09S02_n857ValDsc[0] ;
         A709PrdFecPre = P09S02_A709PrdFecPre[0] ;
         A724PrdPreAct = P09S02_A724PrdPreAct[0] ;
         A728PrdRefPrv = P09S02_A728PrdRefPrv[0] ;
         A794PrvNom = P09S02_A794PrvNom[0] ;
         n794PrvNom = P09S02_n794PrvNom[0] ;
         A795PrvNum = P09S02_A795PrvNum[0] ;
         A718PrdNom = P09S02_A718PrdNom[0] ;
         A857ValDsc = P09S02_A857ValDsc[0] ;
         n857ValDsc = P09S02_n857ValDsc[0] ;
         A794PrvNom = P09S02_A794PrvNom[0] ;
         n794PrvNom = P09S02_n794PrvNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09S02_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09S02_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9S02 = false ;
            AV32count = (long)(AV32count+1) ;
            brk9S02 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV27Option = A719PrdNum ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9S02 )
         {
            brk9S02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV39SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV54Listadodeprecios_wcds_1_filterfulltext = AV44FilterFullText ;
      AV55Listadodeprecios_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV56Listadodeprecios_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV57Listadodeprecios_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV58Listadodeprecios_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV59Listadodeprecios_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV60Listadodeprecios_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV61Listadodeprecios_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV62Listadodeprecios_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV63Listadodeprecios_wcds_10_tfprdrefprv = AV18TFPrdRefPrv ;
      AV64Listadodeprecios_wcds_11_tfprdrefprv_sel = AV19TFPrdRefPrv_Sel ;
      AV65Listadodeprecios_wcds_12_tfprdpreact = AV20TFPrdPreAct ;
      AV66Listadodeprecios_wcds_13_tfprdpreact_to = AV21TFPrdPreAct_To ;
      AV67Listadodeprecios_wcds_14_tfprdfecpre = AV22TFPrdFecPre ;
      AV68Listadodeprecios_wcds_15_tfvaldsc = AV24TFValDsc ;
      AV69Listadodeprecios_wcds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV54Listadodeprecios_wcds_1_filterfulltext ,
                                           AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                           AV55Listadodeprecios_wcds_2_tfprdnum ,
                                           AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                           AV57Listadodeprecios_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to) ,
                                           AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                           AV61Listadodeprecios_wcds_8_tfprvnom ,
                                           AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                           AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                           AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                           AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                           AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                           AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                           AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A728PrdRefPrv ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A709PrdFecPre ,
                                           AV46Prdnum ,
                                           AV47Prdnum_to ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           Integer.valueOf(AV49PrvNum_to) ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV55Listadodeprecios_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Listadodeprecios_wcds_2_tfprdnum), 6, "%") ;
      lV57Listadodeprecios_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Listadodeprecios_wcds_4_tfprdnom), 26, "%") ;
      lV61Listadodeprecios_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV61Listadodeprecios_wcds_8_tfprvnom), 30, "%") ;
      lV63Listadodeprecios_wcds_10_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV63Listadodeprecios_wcds_10_tfprdrefprv), 30, "%") ;
      lV68Listadodeprecios_wcds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV68Listadodeprecios_wcds_15_tfvaldsc), 16, "%") ;
      /* Using cursor P09S03 */
      pr_default.execute(1, new Object[] {AV45Emprcod, AV46Prdnum, AV47Prdnum_to, Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49PrvNum_to), lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV55Listadodeprecios_wcds_2_tfprdnum, AV56Listadodeprecios_wcds_3_tfprdnum_sel, lV57Listadodeprecios_wcds_4_tfprdnom, AV58Listadodeprecios_wcds_5_tfprdnom_sel, Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum), Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to), lV61Listadodeprecios_wcds_8_tfprvnom, AV62Listadodeprecios_wcds_9_tfprvnom_sel, lV63Listadodeprecios_wcds_10_tfprdrefprv, AV64Listadodeprecios_wcds_11_tfprdrefprv_sel, AV65Listadodeprecios_wcds_12_tfprdpreact, AV66Listadodeprecios_wcds_13_tfprdpreact_to, AV67Listadodeprecios_wcds_14_tfprdfecpre, lV68Listadodeprecios_wcds_15_tfvaldsc, AV69Listadodeprecios_wcds_16_tfvaldsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9S04 = false ;
         A856ValCod = P09S03_A856ValCod[0] ;
         A396EmprCod = P09S03_A396EmprCod[0] ;
         A718PrdNom = P09S03_A718PrdNom[0] ;
         A857ValDsc = P09S03_A857ValDsc[0] ;
         n857ValDsc = P09S03_n857ValDsc[0] ;
         A709PrdFecPre = P09S03_A709PrdFecPre[0] ;
         A724PrdPreAct = P09S03_A724PrdPreAct[0] ;
         A728PrdRefPrv = P09S03_A728PrdRefPrv[0] ;
         A794PrvNom = P09S03_A794PrvNom[0] ;
         n794PrvNom = P09S03_n794PrvNom[0] ;
         A795PrvNum = P09S03_A795PrvNum[0] ;
         A719PrdNum = P09S03_A719PrdNum[0] ;
         A857ValDsc = P09S03_A857ValDsc[0] ;
         n857ValDsc = P09S03_n857ValDsc[0] ;
         A794PrvNom = P09S03_A794PrvNom[0] ;
         n794PrvNom = P09S03_n794PrvNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09S03_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09S03_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk9S04 = false ;
            A719PrdNum = P09S03_A719PrdNum[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9S04 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV27Option = A718PrdNom ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9S04 )
         {
            brk9S04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrvNom = AV39SearchTxt ;
      AV17TFPrvNom_Sel = "" ;
      AV54Listadodeprecios_wcds_1_filterfulltext = AV44FilterFullText ;
      AV55Listadodeprecios_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV56Listadodeprecios_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV57Listadodeprecios_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV58Listadodeprecios_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV59Listadodeprecios_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV60Listadodeprecios_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV61Listadodeprecios_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV62Listadodeprecios_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV63Listadodeprecios_wcds_10_tfprdrefprv = AV18TFPrdRefPrv ;
      AV64Listadodeprecios_wcds_11_tfprdrefprv_sel = AV19TFPrdRefPrv_Sel ;
      AV65Listadodeprecios_wcds_12_tfprdpreact = AV20TFPrdPreAct ;
      AV66Listadodeprecios_wcds_13_tfprdpreact_to = AV21TFPrdPreAct_To ;
      AV67Listadodeprecios_wcds_14_tfprdfecpre = AV22TFPrdFecPre ;
      AV68Listadodeprecios_wcds_15_tfvaldsc = AV24TFValDsc ;
      AV69Listadodeprecios_wcds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV54Listadodeprecios_wcds_1_filterfulltext ,
                                           AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                           AV55Listadodeprecios_wcds_2_tfprdnum ,
                                           AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                           AV57Listadodeprecios_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to) ,
                                           AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                           AV61Listadodeprecios_wcds_8_tfprvnom ,
                                           AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                           AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                           AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                           AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                           AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                           AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                           AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A728PrdRefPrv ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A709PrdFecPre ,
                                           AV46Prdnum ,
                                           AV47Prdnum_to ,
                                           AV45Emprcod ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV49PrvNum_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV55Listadodeprecios_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Listadodeprecios_wcds_2_tfprdnum), 6, "%") ;
      lV57Listadodeprecios_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Listadodeprecios_wcds_4_tfprdnom), 26, "%") ;
      lV61Listadodeprecios_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV61Listadodeprecios_wcds_8_tfprvnom), 30, "%") ;
      lV63Listadodeprecios_wcds_10_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV63Listadodeprecios_wcds_10_tfprdrefprv), 30, "%") ;
      lV68Listadodeprecios_wcds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV68Listadodeprecios_wcds_15_tfvaldsc), 16, "%") ;
      /* Using cursor P09S04 */
      pr_default.execute(2, new Object[] {AV45Emprcod, Integer.valueOf(AV48PrvNum), AV46Prdnum, AV47Prdnum_to, Integer.valueOf(AV49PrvNum_to), lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV55Listadodeprecios_wcds_2_tfprdnum, AV56Listadodeprecios_wcds_3_tfprdnum_sel, lV57Listadodeprecios_wcds_4_tfprdnom, AV58Listadodeprecios_wcds_5_tfprdnom_sel, Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum), Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to), lV61Listadodeprecios_wcds_8_tfprvnom, AV62Listadodeprecios_wcds_9_tfprvnom_sel, lV63Listadodeprecios_wcds_10_tfprdrefprv, AV64Listadodeprecios_wcds_11_tfprdrefprv_sel, AV65Listadodeprecios_wcds_12_tfprdpreact, AV66Listadodeprecios_wcds_13_tfprdpreact_to, AV67Listadodeprecios_wcds_14_tfprdfecpre, lV68Listadodeprecios_wcds_15_tfvaldsc, AV69Listadodeprecios_wcds_16_tfvaldsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9S06 = false ;
         A856ValCod = P09S04_A856ValCod[0] ;
         A795PrvNum = P09S04_A795PrvNum[0] ;
         A396EmprCod = P09S04_A396EmprCod[0] ;
         A857ValDsc = P09S04_A857ValDsc[0] ;
         n857ValDsc = P09S04_n857ValDsc[0] ;
         A709PrdFecPre = P09S04_A709PrdFecPre[0] ;
         A724PrdPreAct = P09S04_A724PrdPreAct[0] ;
         A728PrdRefPrv = P09S04_A728PrdRefPrv[0] ;
         A794PrvNom = P09S04_A794PrvNom[0] ;
         n794PrvNom = P09S04_n794PrvNom[0] ;
         A718PrdNom = P09S04_A718PrdNom[0] ;
         A719PrdNum = P09S04_A719PrdNum[0] ;
         A794PrvNom = P09S04_A794PrvNom[0] ;
         n794PrvNom = P09S04_n794PrvNom[0] ;
         A857ValDsc = P09S04_A857ValDsc[0] ;
         n857ValDsc = P09S04_n857ValDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09S04_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09S04_A795PrvNum[0] == A795PrvNum ) )
         {
            brk9S06 = false ;
            A719PrdNum = P09S04_A719PrdNum[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9S06 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
         {
            AV27Option = A794PrvNom ;
            AV26InsertIndex = 1 ;
            while ( ( AV26InsertIndex <= AV28Options.size() ) && ( GXutil.strcmp((String)AV28Options.elementAt(-1+AV26InsertIndex), AV27Option) < 0 ) )
            {
               AV26InsertIndex = (int)(AV26InsertIndex+1) ;
            }
            AV28Options.add(AV27Option, AV26InsertIndex);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV26InsertIndex);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9S06 )
         {
            brk9S06 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDREFPRVOPTIONS' Routine */
      returnInSub = false ;
      AV18TFPrdRefPrv = AV39SearchTxt ;
      AV19TFPrdRefPrv_Sel = "" ;
      AV54Listadodeprecios_wcds_1_filterfulltext = AV44FilterFullText ;
      AV55Listadodeprecios_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV56Listadodeprecios_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV57Listadodeprecios_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV58Listadodeprecios_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV59Listadodeprecios_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV60Listadodeprecios_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV61Listadodeprecios_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV62Listadodeprecios_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV63Listadodeprecios_wcds_10_tfprdrefprv = AV18TFPrdRefPrv ;
      AV64Listadodeprecios_wcds_11_tfprdrefprv_sel = AV19TFPrdRefPrv_Sel ;
      AV65Listadodeprecios_wcds_12_tfprdpreact = AV20TFPrdPreAct ;
      AV66Listadodeprecios_wcds_13_tfprdpreact_to = AV21TFPrdPreAct_To ;
      AV67Listadodeprecios_wcds_14_tfprdfecpre = AV22TFPrdFecPre ;
      AV68Listadodeprecios_wcds_15_tfvaldsc = AV24TFValDsc ;
      AV69Listadodeprecios_wcds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV54Listadodeprecios_wcds_1_filterfulltext ,
                                           AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                           AV55Listadodeprecios_wcds_2_tfprdnum ,
                                           AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                           AV57Listadodeprecios_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to) ,
                                           AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                           AV61Listadodeprecios_wcds_8_tfprvnom ,
                                           AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                           AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                           AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                           AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                           AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                           AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                           AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A728PrdRefPrv ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A709PrdFecPre ,
                                           AV46Prdnum ,
                                           AV47Prdnum_to ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           Integer.valueOf(AV49PrvNum_to) ,
                                           A396EmprCod ,
                                           AV45Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV55Listadodeprecios_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Listadodeprecios_wcds_2_tfprdnum), 6, "%") ;
      lV57Listadodeprecios_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Listadodeprecios_wcds_4_tfprdnom), 26, "%") ;
      lV61Listadodeprecios_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV61Listadodeprecios_wcds_8_tfprvnom), 30, "%") ;
      lV63Listadodeprecios_wcds_10_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV63Listadodeprecios_wcds_10_tfprdrefprv), 30, "%") ;
      lV68Listadodeprecios_wcds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV68Listadodeprecios_wcds_15_tfvaldsc), 16, "%") ;
      /* Using cursor P09S05 */
      pr_default.execute(3, new Object[] {AV46Prdnum, AV47Prdnum_to, Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49PrvNum_to), AV45Emprcod, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV55Listadodeprecios_wcds_2_tfprdnum, AV56Listadodeprecios_wcds_3_tfprdnum_sel, lV57Listadodeprecios_wcds_4_tfprdnom, AV58Listadodeprecios_wcds_5_tfprdnom_sel, Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum), Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to), lV61Listadodeprecios_wcds_8_tfprvnom, AV62Listadodeprecios_wcds_9_tfprvnom_sel, lV63Listadodeprecios_wcds_10_tfprdrefprv, AV64Listadodeprecios_wcds_11_tfprdrefprv_sel, AV65Listadodeprecios_wcds_12_tfprdpreact, AV66Listadodeprecios_wcds_13_tfprdpreact_to, AV67Listadodeprecios_wcds_14_tfprdfecpre, lV68Listadodeprecios_wcds_15_tfvaldsc, AV69Listadodeprecios_wcds_16_tfvaldsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9S08 = false ;
         A856ValCod = P09S05_A856ValCod[0] ;
         A396EmprCod = P09S05_A396EmprCod[0] ;
         A728PrdRefPrv = P09S05_A728PrdRefPrv[0] ;
         A857ValDsc = P09S05_A857ValDsc[0] ;
         n857ValDsc = P09S05_n857ValDsc[0] ;
         A709PrdFecPre = P09S05_A709PrdFecPre[0] ;
         A724PrdPreAct = P09S05_A724PrdPreAct[0] ;
         A794PrvNom = P09S05_A794PrvNom[0] ;
         n794PrvNom = P09S05_n794PrvNom[0] ;
         A795PrvNum = P09S05_A795PrvNum[0] ;
         A718PrdNom = P09S05_A718PrdNom[0] ;
         A719PrdNum = P09S05_A719PrdNum[0] ;
         A857ValDsc = P09S05_A857ValDsc[0] ;
         n857ValDsc = P09S05_n857ValDsc[0] ;
         A794PrvNom = P09S05_A794PrvNom[0] ;
         n794PrvNom = P09S05_n794PrvNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09S05_A728PrdRefPrv[0], A728PrdRefPrv) == 0 ) )
         {
            brk9S08 = false ;
            A396EmprCod = P09S05_A396EmprCod[0] ;
            A719PrdNum = P09S05_A719PrdNum[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9S08 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A728PrdRefPrv)==0) )
         {
            AV27Option = A728PrdRefPrv ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9S08 )
         {
            brk9S08 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFValDsc = AV39SearchTxt ;
      AV25TFValDsc_Sel = "" ;
      AV54Listadodeprecios_wcds_1_filterfulltext = AV44FilterFullText ;
      AV55Listadodeprecios_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV56Listadodeprecios_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV57Listadodeprecios_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV58Listadodeprecios_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV59Listadodeprecios_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV60Listadodeprecios_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV61Listadodeprecios_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV62Listadodeprecios_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV63Listadodeprecios_wcds_10_tfprdrefprv = AV18TFPrdRefPrv ;
      AV64Listadodeprecios_wcds_11_tfprdrefprv_sel = AV19TFPrdRefPrv_Sel ;
      AV65Listadodeprecios_wcds_12_tfprdpreact = AV20TFPrdPreAct ;
      AV66Listadodeprecios_wcds_13_tfprdpreact_to = AV21TFPrdPreAct_To ;
      AV67Listadodeprecios_wcds_14_tfprdfecpre = AV22TFPrdFecPre ;
      AV68Listadodeprecios_wcds_15_tfvaldsc = AV24TFValDsc ;
      AV69Listadodeprecios_wcds_16_tfvaldsc_sel = AV25TFValDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV54Listadodeprecios_wcds_1_filterfulltext ,
                                           AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                           AV55Listadodeprecios_wcds_2_tfprdnum ,
                                           AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                           AV57Listadodeprecios_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to) ,
                                           AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                           AV61Listadodeprecios_wcds_8_tfprvnom ,
                                           AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                           AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                           AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                           AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                           AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                           AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                           AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A728PrdRefPrv ,
                                           A724PrdPreAct ,
                                           A857ValDsc ,
                                           A709PrdFecPre ,
                                           AV46Prdnum ,
                                           AV47Prdnum_to ,
                                           Integer.valueOf(AV48PrvNum) ,
                                           Integer.valueOf(AV49PrvNum_to) ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV54Listadodeprecios_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Listadodeprecios_wcds_1_filterfulltext), "%", "") ;
      lV55Listadodeprecios_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Listadodeprecios_wcds_2_tfprdnum), 6, "%") ;
      lV57Listadodeprecios_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Listadodeprecios_wcds_4_tfprdnom), 26, "%") ;
      lV61Listadodeprecios_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV61Listadodeprecios_wcds_8_tfprvnom), 30, "%") ;
      lV63Listadodeprecios_wcds_10_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV63Listadodeprecios_wcds_10_tfprdrefprv), 30, "%") ;
      lV68Listadodeprecios_wcds_15_tfvaldsc = GXutil.padr( GXutil.rtrim( AV68Listadodeprecios_wcds_15_tfvaldsc), 16, "%") ;
      /* Using cursor P09S06 */
      pr_default.execute(4, new Object[] {AV45Emprcod, AV46Prdnum, AV47Prdnum_to, Integer.valueOf(AV48PrvNum), Integer.valueOf(AV49PrvNum_to), lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV54Listadodeprecios_wcds_1_filterfulltext, lV55Listadodeprecios_wcds_2_tfprdnum, AV56Listadodeprecios_wcds_3_tfprdnum_sel, lV57Listadodeprecios_wcds_4_tfprdnom, AV58Listadodeprecios_wcds_5_tfprdnom_sel, Integer.valueOf(AV59Listadodeprecios_wcds_6_tfprvnum), Integer.valueOf(AV60Listadodeprecios_wcds_7_tfprvnum_to), lV61Listadodeprecios_wcds_8_tfprvnom, AV62Listadodeprecios_wcds_9_tfprvnom_sel, lV63Listadodeprecios_wcds_10_tfprdrefprv, AV64Listadodeprecios_wcds_11_tfprdrefprv_sel, AV65Listadodeprecios_wcds_12_tfprdpreact, AV66Listadodeprecios_wcds_13_tfprdpreact_to, AV67Listadodeprecios_wcds_14_tfprdfecpre, lV68Listadodeprecios_wcds_15_tfvaldsc, AV69Listadodeprecios_wcds_16_tfvaldsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9S010 = false ;
         A856ValCod = P09S06_A856ValCod[0] ;
         A396EmprCod = P09S06_A396EmprCod[0] ;
         A857ValDsc = P09S06_A857ValDsc[0] ;
         n857ValDsc = P09S06_n857ValDsc[0] ;
         A709PrdFecPre = P09S06_A709PrdFecPre[0] ;
         A724PrdPreAct = P09S06_A724PrdPreAct[0] ;
         A728PrdRefPrv = P09S06_A728PrdRefPrv[0] ;
         A794PrvNom = P09S06_A794PrvNom[0] ;
         n794PrvNom = P09S06_n794PrvNom[0] ;
         A795PrvNum = P09S06_A795PrvNum[0] ;
         A718PrdNom = P09S06_A718PrdNom[0] ;
         A719PrdNum = P09S06_A719PrdNum[0] ;
         A857ValDsc = P09S06_A857ValDsc[0] ;
         n857ValDsc = P09S06_n857ValDsc[0] ;
         A794PrvNom = P09S06_A794PrvNom[0] ;
         n794PrvNom = P09S06_n794PrvNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09S06_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09S06_A856ValCod[0] == A856ValCod ) )
         {
            brk9S010 = false ;
            A719PrdNum = P09S06_A719PrdNum[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9S010 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
         {
            AV27Option = A857ValDsc ;
            AV26InsertIndex = 1 ;
            while ( ( AV26InsertIndex <= AV28Options.size() ) && ( GXutil.strcmp((String)AV28Options.elementAt(-1+AV26InsertIndex), AV27Option) < 0 ) )
            {
               AV26InsertIndex = (int)(AV26InsertIndex+1) ;
            }
            AV28Options.add(AV27Option, AV26InsertIndex);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV26InsertIndex);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9S010 )
         {
            brk9S010 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = listadodeprecios_wcgetfilterdata.this.AV41OptionsJson;
      this.aP4[0] = listadodeprecios_wcgetfilterdata.this.AV42OptionsDescJson;
      this.aP5[0] = listadodeprecios_wcgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV41OptionsJson = "" ;
      AV42OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV28Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV31OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV16TFPrvNom = "" ;
      AV17TFPrvNom_Sel = "" ;
      AV18TFPrdRefPrv = "" ;
      AV19TFPrdRefPrv_Sel = "" ;
      AV20TFPrdPreAct = DecimalUtil.ZERO ;
      AV21TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV22TFPrdFecPre = GXutil.nullDate() ;
      AV24TFValDsc = "" ;
      AV25TFValDsc_Sel = "" ;
      AV45Emprcod = "" ;
      AV46Prdnum = "" ;
      AV47Prdnum_to = "" ;
      A719PrdNum = "" ;
      AV54Listadodeprecios_wcds_1_filterfulltext = "" ;
      AV55Listadodeprecios_wcds_2_tfprdnum = "" ;
      AV56Listadodeprecios_wcds_3_tfprdnum_sel = "" ;
      AV57Listadodeprecios_wcds_4_tfprdnom = "" ;
      AV58Listadodeprecios_wcds_5_tfprdnom_sel = "" ;
      AV61Listadodeprecios_wcds_8_tfprvnom = "" ;
      AV62Listadodeprecios_wcds_9_tfprvnom_sel = "" ;
      AV63Listadodeprecios_wcds_10_tfprdrefprv = "" ;
      AV64Listadodeprecios_wcds_11_tfprdrefprv_sel = "" ;
      AV65Listadodeprecios_wcds_12_tfprdpreact = DecimalUtil.ZERO ;
      AV66Listadodeprecios_wcds_13_tfprdpreact_to = DecimalUtil.ZERO ;
      AV67Listadodeprecios_wcds_14_tfprdfecpre = GXutil.nullDate() ;
      AV68Listadodeprecios_wcds_15_tfvaldsc = "" ;
      AV69Listadodeprecios_wcds_16_tfvaldsc_sel = "" ;
      scmdbuf = "" ;
      lV54Listadodeprecios_wcds_1_filterfulltext = "" ;
      lV55Listadodeprecios_wcds_2_tfprdnum = "" ;
      lV57Listadodeprecios_wcds_4_tfprdnom = "" ;
      lV61Listadodeprecios_wcds_8_tfprvnom = "" ;
      lV63Listadodeprecios_wcds_10_tfprdrefprv = "" ;
      lV68Listadodeprecios_wcds_15_tfvaldsc = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A728PrdRefPrv = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A709PrdFecPre = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09S02_A856ValCod = new byte[1] ;
      P09S02_A396EmprCod = new String[] {""} ;
      P09S02_A719PrdNum = new String[] {""} ;
      P09S02_A857ValDsc = new String[] {""} ;
      P09S02_n857ValDsc = new boolean[] {false} ;
      P09S02_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P09S02_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09S02_A728PrdRefPrv = new String[] {""} ;
      P09S02_A794PrvNom = new String[] {""} ;
      P09S02_n794PrvNom = new boolean[] {false} ;
      P09S02_A795PrvNum = new int[1] ;
      P09S02_A718PrdNom = new String[] {""} ;
      AV27Option = "" ;
      P09S03_A856ValCod = new byte[1] ;
      P09S03_A396EmprCod = new String[] {""} ;
      P09S03_A718PrdNom = new String[] {""} ;
      P09S03_A857ValDsc = new String[] {""} ;
      P09S03_n857ValDsc = new boolean[] {false} ;
      P09S03_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P09S03_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09S03_A728PrdRefPrv = new String[] {""} ;
      P09S03_A794PrvNom = new String[] {""} ;
      P09S03_n794PrvNom = new boolean[] {false} ;
      P09S03_A795PrvNum = new int[1] ;
      P09S03_A719PrdNum = new String[] {""} ;
      P09S04_A856ValCod = new byte[1] ;
      P09S04_A795PrvNum = new int[1] ;
      P09S04_A396EmprCod = new String[] {""} ;
      P09S04_A857ValDsc = new String[] {""} ;
      P09S04_n857ValDsc = new boolean[] {false} ;
      P09S04_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P09S04_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09S04_A728PrdRefPrv = new String[] {""} ;
      P09S04_A794PrvNom = new String[] {""} ;
      P09S04_n794PrvNom = new boolean[] {false} ;
      P09S04_A718PrdNom = new String[] {""} ;
      P09S04_A719PrdNum = new String[] {""} ;
      P09S05_A856ValCod = new byte[1] ;
      P09S05_A396EmprCod = new String[] {""} ;
      P09S05_A728PrdRefPrv = new String[] {""} ;
      P09S05_A857ValDsc = new String[] {""} ;
      P09S05_n857ValDsc = new boolean[] {false} ;
      P09S05_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P09S05_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09S05_A794PrvNom = new String[] {""} ;
      P09S05_n794PrvNom = new boolean[] {false} ;
      P09S05_A795PrvNum = new int[1] ;
      P09S05_A718PrdNom = new String[] {""} ;
      P09S05_A719PrdNum = new String[] {""} ;
      P09S06_A856ValCod = new byte[1] ;
      P09S06_A396EmprCod = new String[] {""} ;
      P09S06_A857ValDsc = new String[] {""} ;
      P09S06_n857ValDsc = new boolean[] {false} ;
      P09S06_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P09S06_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09S06_A728PrdRefPrv = new String[] {""} ;
      P09S06_A794PrvNom = new String[] {""} ;
      P09S06_n794PrvNom = new boolean[] {false} ;
      P09S06_A795PrvNum = new int[1] ;
      P09S06_A718PrdNom = new String[] {""} ;
      P09S06_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadodeprecios_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09S02_A856ValCod, P09S02_A396EmprCod, P09S02_A719PrdNum, P09S02_A857ValDsc, P09S02_n857ValDsc, P09S02_A709PrdFecPre, P09S02_A724PrdPreAct, P09S02_A728PrdRefPrv, P09S02_A794PrvNom, P09S02_n794PrvNom,
            P09S02_A795PrvNum, P09S02_A718PrdNom
            }
            , new Object[] {
            P09S03_A856ValCod, P09S03_A396EmprCod, P09S03_A718PrdNom, P09S03_A857ValDsc, P09S03_n857ValDsc, P09S03_A709PrdFecPre, P09S03_A724PrdPreAct, P09S03_A728PrdRefPrv, P09S03_A794PrvNom, P09S03_n794PrvNom,
            P09S03_A795PrvNum, P09S03_A719PrdNum
            }
            , new Object[] {
            P09S04_A856ValCod, P09S04_A795PrvNum, P09S04_A396EmprCod, P09S04_A857ValDsc, P09S04_n857ValDsc, P09S04_A709PrdFecPre, P09S04_A724PrdPreAct, P09S04_A728PrdRefPrv, P09S04_A794PrvNom, P09S04_n794PrvNom,
            P09S04_A718PrdNom, P09S04_A719PrdNum
            }
            , new Object[] {
            P09S05_A856ValCod, P09S05_A396EmprCod, P09S05_A728PrdRefPrv, P09S05_A857ValDsc, P09S05_n857ValDsc, P09S05_A709PrdFecPre, P09S05_A724PrdPreAct, P09S05_A794PrvNom, P09S05_n794PrvNom, P09S05_A795PrvNum,
            P09S05_A718PrdNom, P09S05_A719PrdNum
            }
            , new Object[] {
            P09S06_A856ValCod, P09S06_A396EmprCod, P09S06_A857ValDsc, P09S06_n857ValDsc, P09S06_A709PrdFecPre, P09S06_A724PrdPreAct, P09S06_A728PrdRefPrv, P09S06_A794PrvNom, P09S06_n794PrvNom, P09S06_A795PrvNum,
            P09S06_A718PrdNom, P09S06_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV14TFPrvNum ;
   private int AV15TFPrvNum_To ;
   private int AV48PrvNum ;
   private int AV49PrvNum_to ;
   private int AV59Listadodeprecios_wcds_6_tfprvnum ;
   private int AV60Listadodeprecios_wcds_7_tfprvnum_to ;
   private int A795PrvNum ;
   private int AV26InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV20TFPrdPreAct ;
   private java.math.BigDecimal AV21TFPrdPreAct_To ;
   private java.math.BigDecimal AV65Listadodeprecios_wcds_12_tfprdpreact ;
   private java.math.BigDecimal AV66Listadodeprecios_wcds_13_tfprdpreact_to ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV16TFPrvNom ;
   private String AV17TFPrvNom_Sel ;
   private String AV18TFPrdRefPrv ;
   private String AV19TFPrdRefPrv_Sel ;
   private String AV24TFValDsc ;
   private String AV25TFValDsc_Sel ;
   private String AV45Emprcod ;
   private String AV46Prdnum ;
   private String AV47Prdnum_to ;
   private String A719PrdNum ;
   private String AV55Listadodeprecios_wcds_2_tfprdnum ;
   private String AV56Listadodeprecios_wcds_3_tfprdnum_sel ;
   private String AV57Listadodeprecios_wcds_4_tfprdnom ;
   private String AV58Listadodeprecios_wcds_5_tfprdnom_sel ;
   private String AV61Listadodeprecios_wcds_8_tfprvnom ;
   private String AV62Listadodeprecios_wcds_9_tfprvnom_sel ;
   private String AV63Listadodeprecios_wcds_10_tfprdrefprv ;
   private String AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ;
   private String AV68Listadodeprecios_wcds_15_tfvaldsc ;
   private String AV69Listadodeprecios_wcds_16_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV55Listadodeprecios_wcds_2_tfprdnum ;
   private String lV57Listadodeprecios_wcds_4_tfprdnom ;
   private String lV61Listadodeprecios_wcds_8_tfprvnom ;
   private String lV63Listadodeprecios_wcds_10_tfprdrefprv ;
   private String lV68Listadodeprecios_wcds_15_tfvaldsc ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A728PrdRefPrv ;
   private String A857ValDsc ;
   private String A396EmprCod ;
   private java.util.Date AV22TFPrdFecPre ;
   private java.util.Date AV67Listadodeprecios_wcds_14_tfprdfecpre ;
   private java.util.Date A709PrdFecPre ;
   private boolean returnInSub ;
   private boolean brk9S02 ;
   private boolean n857ValDsc ;
   private boolean n794PrvNom ;
   private boolean brk9S04 ;
   private boolean brk9S06 ;
   private boolean brk9S08 ;
   private boolean brk9S010 ;
   private String AV41OptionsJson ;
   private String AV42OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV39SearchTxt ;
   private String AV40SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV54Listadodeprecios_wcds_1_filterfulltext ;
   private String lV54Listadodeprecios_wcds_1_filterfulltext ;
   private String AV27Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09S02_A856ValCod ;
   private String[] P09S02_A396EmprCod ;
   private String[] P09S02_A719PrdNum ;
   private String[] P09S02_A857ValDsc ;
   private boolean[] P09S02_n857ValDsc ;
   private java.util.Date[] P09S02_A709PrdFecPre ;
   private java.math.BigDecimal[] P09S02_A724PrdPreAct ;
   private String[] P09S02_A728PrdRefPrv ;
   private String[] P09S02_A794PrvNom ;
   private boolean[] P09S02_n794PrvNom ;
   private int[] P09S02_A795PrvNum ;
   private String[] P09S02_A718PrdNom ;
   private byte[] P09S03_A856ValCod ;
   private String[] P09S03_A396EmprCod ;
   private String[] P09S03_A718PrdNom ;
   private String[] P09S03_A857ValDsc ;
   private boolean[] P09S03_n857ValDsc ;
   private java.util.Date[] P09S03_A709PrdFecPre ;
   private java.math.BigDecimal[] P09S03_A724PrdPreAct ;
   private String[] P09S03_A728PrdRefPrv ;
   private String[] P09S03_A794PrvNom ;
   private boolean[] P09S03_n794PrvNom ;
   private int[] P09S03_A795PrvNum ;
   private String[] P09S03_A719PrdNum ;
   private byte[] P09S04_A856ValCod ;
   private int[] P09S04_A795PrvNum ;
   private String[] P09S04_A396EmprCod ;
   private String[] P09S04_A857ValDsc ;
   private boolean[] P09S04_n857ValDsc ;
   private java.util.Date[] P09S04_A709PrdFecPre ;
   private java.math.BigDecimal[] P09S04_A724PrdPreAct ;
   private String[] P09S04_A728PrdRefPrv ;
   private String[] P09S04_A794PrvNom ;
   private boolean[] P09S04_n794PrvNom ;
   private String[] P09S04_A718PrdNom ;
   private String[] P09S04_A719PrdNum ;
   private byte[] P09S05_A856ValCod ;
   private String[] P09S05_A396EmprCod ;
   private String[] P09S05_A728PrdRefPrv ;
   private String[] P09S05_A857ValDsc ;
   private boolean[] P09S05_n857ValDsc ;
   private java.util.Date[] P09S05_A709PrdFecPre ;
   private java.math.BigDecimal[] P09S05_A724PrdPreAct ;
   private String[] P09S05_A794PrvNom ;
   private boolean[] P09S05_n794PrvNom ;
   private int[] P09S05_A795PrvNum ;
   private String[] P09S05_A718PrdNom ;
   private String[] P09S05_A719PrdNum ;
   private byte[] P09S06_A856ValCod ;
   private String[] P09S06_A396EmprCod ;
   private String[] P09S06_A857ValDsc ;
   private boolean[] P09S06_n857ValDsc ;
   private java.util.Date[] P09S06_A709PrdFecPre ;
   private java.math.BigDecimal[] P09S06_A724PrdPreAct ;
   private String[] P09S06_A728PrdRefPrv ;
   private String[] P09S06_A794PrvNom ;
   private boolean[] P09S06_n794PrvNom ;
   private int[] P09S06_A795PrvNum ;
   private String[] P09S06_A718PrdNom ;
   private String[] P09S06_A719PrdNum ;
   private GXSimpleCollection<String> AV28Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV31OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class listadodeprecios_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09S02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Listadodeprecios_wcds_1_filterfulltext ,
                                          String AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                          String AV55Listadodeprecios_wcds_2_tfprdnum ,
                                          String AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                          String AV57Listadodeprecios_wcds_4_tfprdnom ,
                                          int AV59Listadodeprecios_wcds_6_tfprvnum ,
                                          int AV60Listadodeprecios_wcds_7_tfprvnum_to ,
                                          String AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                          String AV61Listadodeprecios_wcds_8_tfprvnom ,
                                          String AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                          String AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                          java.math.BigDecimal AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                          java.math.BigDecimal AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                          java.util.Date AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                          String AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                          String AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          java.util.Date A709PrdFecPre ,
                                          int AV48PrvNum ,
                                          int AV49PrvNum_to ,
                                          String AV45Emprcod ,
                                          String AV46Prdnum ,
                                          String A396EmprCod ,
                                          String AV47Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T1.PrdNum, T2.ValDsc, T1.PrdFecPre, T1.PrdPreAct, T1.PrdRefPrv, T3.PrvNom, T1.PrvNum, T1.PrdNom FROM ((TXPPRODUC T1 INNER JOIN TXPTIPVAL" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV54Listadodeprecios_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Listadodeprecios_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Listadodeprecios_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV59Listadodeprecios_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV60Listadodeprecios_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Listadodeprecios_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV63Listadodeprecios_wcds_10_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Listadodeprecios_wcds_12_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Listadodeprecios_wcds_13_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Listadodeprecios_wcds_14_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(T1.PrdFecPre >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Listadodeprecios_wcds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09S03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Listadodeprecios_wcds_1_filterfulltext ,
                                          String AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                          String AV55Listadodeprecios_wcds_2_tfprdnum ,
                                          String AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                          String AV57Listadodeprecios_wcds_4_tfprdnom ,
                                          int AV59Listadodeprecios_wcds_6_tfprvnum ,
                                          int AV60Listadodeprecios_wcds_7_tfprvnum_to ,
                                          String AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                          String AV61Listadodeprecios_wcds_8_tfprvnom ,
                                          String AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                          String AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                          java.math.BigDecimal AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                          java.math.BigDecimal AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                          java.util.Date AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                          String AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                          String AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          java.util.Date A709PrdFecPre ,
                                          String AV46Prdnum ,
                                          String AV47Prdnum_to ,
                                          int AV48PrvNum ,
                                          int AV49PrvNum_to ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[27];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T1.PrdNom, T2.ValDsc, T1.PrdFecPre, T1.PrdPreAct, T1.PrdRefPrv, T3.PrvNom, T1.PrvNum, T1.PrdNum FROM ((TXPPRODUC T1 INNER JOIN TXPTIPVAL" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      if ( ! (GXutil.strcmp("", AV54Listadodeprecios_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Listadodeprecios_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Listadodeprecios_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV59Listadodeprecios_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV60Listadodeprecios_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Listadodeprecios_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV63Listadodeprecios_wcds_10_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Listadodeprecios_wcds_12_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Listadodeprecios_wcds_13_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Listadodeprecios_wcds_14_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(T1.PrdFecPre >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Listadodeprecios_wcds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09S04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Listadodeprecios_wcds_1_filterfulltext ,
                                          String AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                          String AV55Listadodeprecios_wcds_2_tfprdnum ,
                                          String AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                          String AV57Listadodeprecios_wcds_4_tfprdnom ,
                                          int AV59Listadodeprecios_wcds_6_tfprvnum ,
                                          int AV60Listadodeprecios_wcds_7_tfprvnum_to ,
                                          String AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                          String AV61Listadodeprecios_wcds_8_tfprvnom ,
                                          String AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                          String AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                          java.math.BigDecimal AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                          java.math.BigDecimal AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                          java.util.Date AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                          String AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                          String AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          java.util.Date A709PrdFecPre ,
                                          String AV46Prdnum ,
                                          String AV47Prdnum_to ,
                                          String AV45Emprcod ,
                                          int AV48PrvNum ,
                                          String A396EmprCod ,
                                          int AV49PrvNum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.PrvNum, T1.EmprCod, T3.ValDsc, T1.PrdFecPre, T1.PrdPreAct, T1.PrdRefPrv, T2.PrvNom, T1.PrdNom, T1.PrdNum FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      if ( ! (GXutil.strcmp("", AV54Listadodeprecios_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T3.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Listadodeprecios_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Listadodeprecios_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV59Listadodeprecios_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV60Listadodeprecios_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Listadodeprecios_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV63Listadodeprecios_wcds_10_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Listadodeprecios_wcds_12_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Listadodeprecios_wcds_13_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Listadodeprecios_wcds_14_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(T1.PrdFecPre >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Listadodeprecios_wcds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09S05( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Listadodeprecios_wcds_1_filterfulltext ,
                                          String AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                          String AV55Listadodeprecios_wcds_2_tfprdnum ,
                                          String AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                          String AV57Listadodeprecios_wcds_4_tfprdnom ,
                                          int AV59Listadodeprecios_wcds_6_tfprvnum ,
                                          int AV60Listadodeprecios_wcds_7_tfprvnum_to ,
                                          String AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                          String AV61Listadodeprecios_wcds_8_tfprvnom ,
                                          String AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                          String AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                          java.math.BigDecimal AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                          java.math.BigDecimal AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                          java.util.Date AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                          String AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                          String AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          java.util.Date A709PrdFecPre ,
                                          String AV46Prdnum ,
                                          String AV47Prdnum_to ,
                                          int AV48PrvNum ,
                                          int AV49PrvNum_to ,
                                          String A396EmprCod ,
                                          String AV45Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T1.PrdRefPrv, T2.ValDsc, T1.PrdFecPre, T1.PrdPreAct, T3.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum FROM ((TXPPRODUC T1 INNER JOIN TXPTIPVAL" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV54Listadodeprecios_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Listadodeprecios_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Listadodeprecios_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV59Listadodeprecios_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV60Listadodeprecios_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Listadodeprecios_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV63Listadodeprecios_wcds_10_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Listadodeprecios_wcds_12_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Listadodeprecios_wcds_13_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Listadodeprecios_wcds_14_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(T1.PrdFecPre >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Listadodeprecios_wcds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09S06( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Listadodeprecios_wcds_1_filterfulltext ,
                                          String AV56Listadodeprecios_wcds_3_tfprdnum_sel ,
                                          String AV55Listadodeprecios_wcds_2_tfprdnum ,
                                          String AV58Listadodeprecios_wcds_5_tfprdnom_sel ,
                                          String AV57Listadodeprecios_wcds_4_tfprdnom ,
                                          int AV59Listadodeprecios_wcds_6_tfprvnum ,
                                          int AV60Listadodeprecios_wcds_7_tfprvnum_to ,
                                          String AV62Listadodeprecios_wcds_9_tfprvnom_sel ,
                                          String AV61Listadodeprecios_wcds_8_tfprvnom ,
                                          String AV64Listadodeprecios_wcds_11_tfprdrefprv_sel ,
                                          String AV63Listadodeprecios_wcds_10_tfprdrefprv ,
                                          java.math.BigDecimal AV65Listadodeprecios_wcds_12_tfprdpreact ,
                                          java.math.BigDecimal AV66Listadodeprecios_wcds_13_tfprdpreact_to ,
                                          java.util.Date AV67Listadodeprecios_wcds_14_tfprdfecpre ,
                                          String AV69Listadodeprecios_wcds_16_tfvaldsc_sel ,
                                          String AV68Listadodeprecios_wcds_15_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A728PrdRefPrv ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A857ValDsc ,
                                          java.util.Date A709PrdFecPre ,
                                          String AV46Prdnum ,
                                          String AV47Prdnum_to ,
                                          int AV48PrvNum ,
                                          int AV49PrvNum_to ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[27];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T2.ValDsc, T1.PrdFecPre, T1.PrdPreAct, T1.PrdRefPrv, T3.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum FROM ((TXPPRODUC T1 INNER JOIN TXPTIPVAL" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      if ( ! (GXutil.strcmp("", AV54Listadodeprecios_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( UPPER(T1.PrdRefPrv) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
         GXv_int10[10] = (byte)(1) ;
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Listadodeprecios_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Listadodeprecios_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Listadodeprecios_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Listadodeprecios_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV59Listadodeprecios_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV60Listadodeprecios_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV61Listadodeprecios_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Listadodeprecios_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV63Listadodeprecios_wcds_10_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Listadodeprecios_wcds_11_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Listadodeprecios_wcds_12_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Listadodeprecios_wcds_13_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Listadodeprecios_wcds_14_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(T1.PrdFecPre >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Listadodeprecios_wcds_15_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Listadodeprecios_wcds_16_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ValCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P09S02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 1 :
                  return conditional_P09S03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 2 :
                  return conditional_P09S04(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() );
            case 3 :
                  return conditional_P09S05(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
            case 4 :
                  return conditional_P09S06(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09S02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09S03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09S04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09S05", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09S06", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               return;
      }
   }

}

