package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwlpedpengetfilterdata extends GXProcedure
{
   public wcwlpedpengetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwlpedpengetfilterdata.class ), "" );
   }

   public wcwlpedpengetfilterdata( int remoteHandle ,
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
      wcwlpedpengetfilterdata.this.aP5 = new String[] {""};
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
      wcwlpedpengetfilterdata.this.AV32DDOName = aP0;
      wcwlpedpengetfilterdata.this.AV30SearchTxt = aP1;
      wcwlpedpengetfilterdata.this.AV31SearchTxtTo = aP2;
      wcwlpedpengetfilterdata.this.aP3 = aP3;
      wcwlpedpengetfilterdata.this.aP4 = aP4;
      wcwlpedpengetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("WCWLPEDPENGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWLPEDPENGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("WCWLPEDPENGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV10TFPrvNum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPrvNum_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV12TFPrvNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV13TFPrvNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV14TFPedCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPedCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV16TFPedFec = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV18TFPedFecEnt = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV20TFPrdNum = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV21TFPrdNum_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV22TFPrdNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV23TFPrdNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDUNI") == 0 )
         {
            AV24TFPedUni = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPedUni_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCANENT") == 0 )
         {
            AV26TFPedCanEnt = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFPedCanEnt_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCANTPDTE") == 0 )
         {
            AV55TFCantPdte = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFCantPdte_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDPRE") == 0 )
         {
            AV28TFPedPre = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFPedPre_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDFEC") == 0 )
         {
            AV49PedFec = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDFEC_TO") == 0 )
         {
            AV50PedFec_to = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV51PrvNum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM_TO") == 0 )
         {
            AV52PrvNum_to = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LINDSDO0") == 0 )
         {
            AV53Lindsdo0 = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrvNom = AV30SearchTxt ;
      AV13TFPrvNom_Sel = "" ;
      AV63Wcwlpedpends_1_filterfulltext = AV54FilterFullText ;
      AV64Wcwlpedpends_2_tfprvnum = AV10TFPrvNum ;
      AV65Wcwlpedpends_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV66Wcwlpedpends_4_tfprvnom = AV12TFPrvNom ;
      AV67Wcwlpedpends_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV68Wcwlpedpends_6_tfpedcod = AV14TFPedCod ;
      AV69Wcwlpedpends_7_tfpedcod_to = AV15TFPedCod_To ;
      AV70Wcwlpedpends_8_tfpedfec = AV16TFPedFec ;
      AV71Wcwlpedpends_9_tfpedfecent = AV18TFPedFecEnt ;
      AV72Wcwlpedpends_10_tfprdnum = AV20TFPrdNum ;
      AV73Wcwlpedpends_11_tfprdnum_sel = AV21TFPrdNum_Sel ;
      AV74Wcwlpedpends_12_tfprdnom = AV22TFPrdNom ;
      AV75Wcwlpedpends_13_tfprdnom_sel = AV23TFPrdNom_Sel ;
      AV76Wcwlpedpends_14_tfpeduni = AV24TFPedUni ;
      AV77Wcwlpedpends_15_tfpeduni_to = AV25TFPedUni_To ;
      AV78Wcwlpedpends_16_tfpedcanent = AV26TFPedCanEnt ;
      AV79Wcwlpedpends_17_tfpedcanent_to = AV27TFPedCanEnt_To ;
      AV80Wcwlpedpends_18_tfcantpdte = AV55TFCantPdte ;
      AV81Wcwlpedpends_19_tfcantpdte_to = AV56TFCantPdte_To ;
      AV82Wcwlpedpends_20_tfpedpre = AV28TFPedPre ;
      AV83Wcwlpedpends_21_tfpedpre_to = AV29TFPedPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Wcwlpedpends_1_filterfulltext ,
                                           Integer.valueOf(AV64Wcwlpedpends_2_tfprvnum) ,
                                           Integer.valueOf(AV65Wcwlpedpends_3_tfprvnum_to) ,
                                           AV67Wcwlpedpends_5_tfprvnom_sel ,
                                           AV66Wcwlpedpends_4_tfprvnom ,
                                           Integer.valueOf(AV68Wcwlpedpends_6_tfpedcod) ,
                                           Integer.valueOf(AV69Wcwlpedpends_7_tfpedcod_to) ,
                                           AV70Wcwlpedpends_8_tfpedfec ,
                                           AV71Wcwlpedpends_9_tfpedfecent ,
                                           AV73Wcwlpedpends_11_tfprdnum_sel ,
                                           AV72Wcwlpedpends_10_tfprdnum ,
                                           AV75Wcwlpedpends_13_tfprdnom_sel ,
                                           AV74Wcwlpedpends_12_tfprdnom ,
                                           AV76Wcwlpedpends_14_tfpeduni ,
                                           AV77Wcwlpedpends_15_tfpeduni_to ,
                                           AV78Wcwlpedpends_16_tfpedcanent ,
                                           AV79Wcwlpedpends_17_tfpedcanent_to ,
                                           AV80Wcwlpedpends_18_tfcantpdte ,
                                           AV81Wcwlpedpends_19_tfcantpdte_to ,
                                           AV82Wcwlpedpends_20_tfpedpre ,
                                           AV83Wcwlpedpends_21_tfpedpre_to ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A665PedPre ,
                                           A661PedFec ,
                                           A662PedFecEnt ,
                                           AV49PedFec ,
                                           AV50PedFec_to ,
                                           Integer.valueOf(AV51PrvNum) ,
                                           Integer.valueOf(AV52PrvNum_to) ,
                                           A396EmprCod ,
                                           AV48Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV66Wcwlpedpends_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV66Wcwlpedpends_4_tfprvnom), 30, "%") ;
      lV72Wcwlpedpends_10_tfprdnum = GXutil.padr( GXutil.rtrim( AV72Wcwlpedpends_10_tfprdnum), 6, "%") ;
      lV74Wcwlpedpends_12_tfprdnom = GXutil.padr( GXutil.rtrim( AV74Wcwlpedpends_12_tfprdnom), 26, "%") ;
      /* Using cursor P08Q72 */
      pr_default.execute(0, new Object[] {AV49PedFec, AV50PedFec_to, Integer.valueOf(AV51PrvNum), Integer.valueOf(AV52PrvNum_to), AV48Emprcod, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, Integer.valueOf(AV64Wcwlpedpends_2_tfprvnum), Integer.valueOf(AV65Wcwlpedpends_3_tfprvnum_to), lV66Wcwlpedpends_4_tfprvnom, AV67Wcwlpedpends_5_tfprvnom_sel, Integer.valueOf(AV68Wcwlpedpends_6_tfpedcod), Integer.valueOf(AV69Wcwlpedpends_7_tfpedcod_to), AV70Wcwlpedpends_8_tfpedfec, AV71Wcwlpedpends_9_tfpedfecent, lV72Wcwlpedpends_10_tfprdnum, AV73Wcwlpedpends_11_tfprdnum_sel, lV74Wcwlpedpends_12_tfprdnom, AV75Wcwlpedpends_13_tfprdnom_sel, AV76Wcwlpedpends_14_tfpeduni, AV77Wcwlpedpends_15_tfpeduni_to, AV78Wcwlpedpends_16_tfpedcanent, AV79Wcwlpedpends_17_tfpedcanent_to, AV80Wcwlpedpends_18_tfcantpdte, AV81Wcwlpedpends_19_tfcantpdte_to, AV82Wcwlpedpends_20_tfpedpre, AV83Wcwlpedpends_21_tfpedpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8Q72 = false ;
         A396EmprCod = P08Q72_A396EmprCod[0] ;
         A794PrvNom = P08Q72_A794PrvNom[0] ;
         n794PrvNom = P08Q72_n794PrvNom[0] ;
         A665PedPre = P08Q72_A665PedPre[0] ;
         A718PrdNom = P08Q72_A718PrdNom[0] ;
         A719PrdNum = P08Q72_A719PrdNum[0] ;
         A662PedFecEnt = P08Q72_A662PedFecEnt[0] ;
         A661PedFec = P08Q72_A661PedFec[0] ;
         A658PedCod = P08Q72_A658PedCod[0] ;
         A795PrvNum = P08Q72_A795PrvNum[0] ;
         A657PedCanEnt = P08Q72_A657PedCanEnt[0] ;
         A669PedUni = P08Q72_A669PedUni[0] ;
         A718PrdNom = P08Q72_A718PrdNom[0] ;
         A795PrvNum = P08Q72_A795PrvNum[0] ;
         A794PrvNom = P08Q72_A794PrvNom[0] ;
         n794PrvNom = P08Q72_n794PrvNom[0] ;
         A662PedFecEnt = P08Q72_A662PedFecEnt[0] ;
         A661PedFec = P08Q72_A661PedFec[0] ;
         A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08Q72_A794PrvNom[0], A794PrvNom) == 0 ) )
         {
            brk8Q72 = false ;
            A396EmprCod = P08Q72_A396EmprCod[0] ;
            A719PrdNum = P08Q72_A719PrdNum[0] ;
            A658PedCod = P08Q72_A658PedCod[0] ;
            A795PrvNum = P08Q72_A795PrvNum[0] ;
            A795PrvNum = P08Q72_A795PrvNum[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8Q72 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
         {
            AV34Option = A794PrvNom ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8Q72 )
         {
            brk8Q72 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFPrdNum = AV30SearchTxt ;
      AV21TFPrdNum_Sel = "" ;
      AV63Wcwlpedpends_1_filterfulltext = AV54FilterFullText ;
      AV64Wcwlpedpends_2_tfprvnum = AV10TFPrvNum ;
      AV65Wcwlpedpends_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV66Wcwlpedpends_4_tfprvnom = AV12TFPrvNom ;
      AV67Wcwlpedpends_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV68Wcwlpedpends_6_tfpedcod = AV14TFPedCod ;
      AV69Wcwlpedpends_7_tfpedcod_to = AV15TFPedCod_To ;
      AV70Wcwlpedpends_8_tfpedfec = AV16TFPedFec ;
      AV71Wcwlpedpends_9_tfpedfecent = AV18TFPedFecEnt ;
      AV72Wcwlpedpends_10_tfprdnum = AV20TFPrdNum ;
      AV73Wcwlpedpends_11_tfprdnum_sel = AV21TFPrdNum_Sel ;
      AV74Wcwlpedpends_12_tfprdnom = AV22TFPrdNom ;
      AV75Wcwlpedpends_13_tfprdnom_sel = AV23TFPrdNom_Sel ;
      AV76Wcwlpedpends_14_tfpeduni = AV24TFPedUni ;
      AV77Wcwlpedpends_15_tfpeduni_to = AV25TFPedUni_To ;
      AV78Wcwlpedpends_16_tfpedcanent = AV26TFPedCanEnt ;
      AV79Wcwlpedpends_17_tfpedcanent_to = AV27TFPedCanEnt_To ;
      AV80Wcwlpedpends_18_tfcantpdte = AV55TFCantPdte ;
      AV81Wcwlpedpends_19_tfcantpdte_to = AV56TFCantPdte_To ;
      AV82Wcwlpedpends_20_tfpedpre = AV28TFPedPre ;
      AV83Wcwlpedpends_21_tfpedpre_to = AV29TFPedPre_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV63Wcwlpedpends_1_filterfulltext ,
                                           Integer.valueOf(AV64Wcwlpedpends_2_tfprvnum) ,
                                           Integer.valueOf(AV65Wcwlpedpends_3_tfprvnum_to) ,
                                           AV67Wcwlpedpends_5_tfprvnom_sel ,
                                           AV66Wcwlpedpends_4_tfprvnom ,
                                           Integer.valueOf(AV68Wcwlpedpends_6_tfpedcod) ,
                                           Integer.valueOf(AV69Wcwlpedpends_7_tfpedcod_to) ,
                                           AV70Wcwlpedpends_8_tfpedfec ,
                                           AV71Wcwlpedpends_9_tfpedfecent ,
                                           AV73Wcwlpedpends_11_tfprdnum_sel ,
                                           AV72Wcwlpedpends_10_tfprdnum ,
                                           AV75Wcwlpedpends_13_tfprdnom_sel ,
                                           AV74Wcwlpedpends_12_tfprdnom ,
                                           AV76Wcwlpedpends_14_tfpeduni ,
                                           AV77Wcwlpedpends_15_tfpeduni_to ,
                                           AV78Wcwlpedpends_16_tfpedcanent ,
                                           AV79Wcwlpedpends_17_tfpedcanent_to ,
                                           AV80Wcwlpedpends_18_tfcantpdte ,
                                           AV81Wcwlpedpends_19_tfcantpdte_to ,
                                           AV82Wcwlpedpends_20_tfpedpre ,
                                           AV83Wcwlpedpends_21_tfpedpre_to ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A665PedPre ,
                                           A661PedFec ,
                                           A662PedFecEnt ,
                                           AV49PedFec ,
                                           AV50PedFec_to ,
                                           Integer.valueOf(AV51PrvNum) ,
                                           Integer.valueOf(AV52PrvNum_to) ,
                                           AV48Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV66Wcwlpedpends_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV66Wcwlpedpends_4_tfprvnom), 30, "%") ;
      lV72Wcwlpedpends_10_tfprdnum = GXutil.padr( GXutil.rtrim( AV72Wcwlpedpends_10_tfprdnum), 6, "%") ;
      lV74Wcwlpedpends_12_tfprdnom = GXutil.padr( GXutil.rtrim( AV74Wcwlpedpends_12_tfprdnom), 26, "%") ;
      /* Using cursor P08Q73 */
      pr_default.execute(1, new Object[] {AV48Emprcod, AV49PedFec, AV50PedFec_to, Integer.valueOf(AV51PrvNum), Integer.valueOf(AV52PrvNum_to), lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, Integer.valueOf(AV64Wcwlpedpends_2_tfprvnum), Integer.valueOf(AV65Wcwlpedpends_3_tfprvnum_to), lV66Wcwlpedpends_4_tfprvnom, AV67Wcwlpedpends_5_tfprvnom_sel, Integer.valueOf(AV68Wcwlpedpends_6_tfpedcod), Integer.valueOf(AV69Wcwlpedpends_7_tfpedcod_to), AV70Wcwlpedpends_8_tfpedfec, AV71Wcwlpedpends_9_tfpedfecent, lV72Wcwlpedpends_10_tfprdnum, AV73Wcwlpedpends_11_tfprdnum_sel, lV74Wcwlpedpends_12_tfprdnom, AV75Wcwlpedpends_13_tfprdnom_sel, AV76Wcwlpedpends_14_tfpeduni, AV77Wcwlpedpends_15_tfpeduni_to, AV78Wcwlpedpends_16_tfpedcanent, AV79Wcwlpedpends_17_tfpedcanent_to, AV80Wcwlpedpends_18_tfcantpdte, AV81Wcwlpedpends_19_tfcantpdte_to, AV82Wcwlpedpends_20_tfpedpre, AV83Wcwlpedpends_21_tfpedpre_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8Q74 = false ;
         A396EmprCod = P08Q73_A396EmprCod[0] ;
         A719PrdNum = P08Q73_A719PrdNum[0] ;
         A665PedPre = P08Q73_A665PedPre[0] ;
         A718PrdNom = P08Q73_A718PrdNom[0] ;
         A662PedFecEnt = P08Q73_A662PedFecEnt[0] ;
         A661PedFec = P08Q73_A661PedFec[0] ;
         A658PedCod = P08Q73_A658PedCod[0] ;
         A794PrvNom = P08Q73_A794PrvNom[0] ;
         n794PrvNom = P08Q73_n794PrvNom[0] ;
         A795PrvNum = P08Q73_A795PrvNum[0] ;
         A657PedCanEnt = P08Q73_A657PedCanEnt[0] ;
         A669PedUni = P08Q73_A669PedUni[0] ;
         A718PrdNom = P08Q73_A718PrdNom[0] ;
         A795PrvNum = P08Q73_A795PrvNum[0] ;
         A794PrvNom = P08Q73_A794PrvNom[0] ;
         n794PrvNom = P08Q73_n794PrvNom[0] ;
         A662PedFecEnt = P08Q73_A662PedFecEnt[0] ;
         A661PedFec = P08Q73_A661PedFec[0] ;
         A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08Q73_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08Q73_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8Q74 = false ;
            A658PedCod = P08Q73_A658PedCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8Q74 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV34Option = A719PrdNum ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8Q74 )
         {
            brk8Q74 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFPrdNom = AV30SearchTxt ;
      AV23TFPrdNom_Sel = "" ;
      AV63Wcwlpedpends_1_filterfulltext = AV54FilterFullText ;
      AV64Wcwlpedpends_2_tfprvnum = AV10TFPrvNum ;
      AV65Wcwlpedpends_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV66Wcwlpedpends_4_tfprvnom = AV12TFPrvNom ;
      AV67Wcwlpedpends_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV68Wcwlpedpends_6_tfpedcod = AV14TFPedCod ;
      AV69Wcwlpedpends_7_tfpedcod_to = AV15TFPedCod_To ;
      AV70Wcwlpedpends_8_tfpedfec = AV16TFPedFec ;
      AV71Wcwlpedpends_9_tfpedfecent = AV18TFPedFecEnt ;
      AV72Wcwlpedpends_10_tfprdnum = AV20TFPrdNum ;
      AV73Wcwlpedpends_11_tfprdnum_sel = AV21TFPrdNum_Sel ;
      AV74Wcwlpedpends_12_tfprdnom = AV22TFPrdNom ;
      AV75Wcwlpedpends_13_tfprdnom_sel = AV23TFPrdNom_Sel ;
      AV76Wcwlpedpends_14_tfpeduni = AV24TFPedUni ;
      AV77Wcwlpedpends_15_tfpeduni_to = AV25TFPedUni_To ;
      AV78Wcwlpedpends_16_tfpedcanent = AV26TFPedCanEnt ;
      AV79Wcwlpedpends_17_tfpedcanent_to = AV27TFPedCanEnt_To ;
      AV80Wcwlpedpends_18_tfcantpdte = AV55TFCantPdte ;
      AV81Wcwlpedpends_19_tfcantpdte_to = AV56TFCantPdte_To ;
      AV82Wcwlpedpends_20_tfpedpre = AV28TFPedPre ;
      AV83Wcwlpedpends_21_tfpedpre_to = AV29TFPedPre_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV63Wcwlpedpends_1_filterfulltext ,
                                           Integer.valueOf(AV64Wcwlpedpends_2_tfprvnum) ,
                                           Integer.valueOf(AV65Wcwlpedpends_3_tfprvnum_to) ,
                                           AV67Wcwlpedpends_5_tfprvnom_sel ,
                                           AV66Wcwlpedpends_4_tfprvnom ,
                                           Integer.valueOf(AV68Wcwlpedpends_6_tfpedcod) ,
                                           Integer.valueOf(AV69Wcwlpedpends_7_tfpedcod_to) ,
                                           AV70Wcwlpedpends_8_tfpedfec ,
                                           AV71Wcwlpedpends_9_tfpedfecent ,
                                           AV73Wcwlpedpends_11_tfprdnum_sel ,
                                           AV72Wcwlpedpends_10_tfprdnum ,
                                           AV75Wcwlpedpends_13_tfprdnom_sel ,
                                           AV74Wcwlpedpends_12_tfprdnom ,
                                           AV76Wcwlpedpends_14_tfpeduni ,
                                           AV77Wcwlpedpends_15_tfpeduni_to ,
                                           AV78Wcwlpedpends_16_tfpedcanent ,
                                           AV79Wcwlpedpends_17_tfpedcanent_to ,
                                           AV80Wcwlpedpends_18_tfcantpdte ,
                                           AV81Wcwlpedpends_19_tfcantpdte_to ,
                                           AV82Wcwlpedpends_20_tfpedpre ,
                                           AV83Wcwlpedpends_21_tfpedpre_to ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A665PedPre ,
                                           A661PedFec ,
                                           A662PedFecEnt ,
                                           AV49PedFec ,
                                           AV50PedFec_to ,
                                           Integer.valueOf(AV51PrvNum) ,
                                           Integer.valueOf(AV52PrvNum_to) ,
                                           AV48Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV63Wcwlpedpends_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV63Wcwlpedpends_1_filterfulltext), "%", "") ;
      lV66Wcwlpedpends_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV66Wcwlpedpends_4_tfprvnom), 30, "%") ;
      lV72Wcwlpedpends_10_tfprdnum = GXutil.padr( GXutil.rtrim( AV72Wcwlpedpends_10_tfprdnum), 6, "%") ;
      lV74Wcwlpedpends_12_tfprdnom = GXutil.padr( GXutil.rtrim( AV74Wcwlpedpends_12_tfprdnom), 26, "%") ;
      /* Using cursor P08Q74 */
      pr_default.execute(2, new Object[] {AV48Emprcod, AV49PedFec, AV50PedFec_to, Integer.valueOf(AV51PrvNum), Integer.valueOf(AV52PrvNum_to), lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, lV63Wcwlpedpends_1_filterfulltext, Integer.valueOf(AV64Wcwlpedpends_2_tfprvnum), Integer.valueOf(AV65Wcwlpedpends_3_tfprvnum_to), lV66Wcwlpedpends_4_tfprvnom, AV67Wcwlpedpends_5_tfprvnom_sel, Integer.valueOf(AV68Wcwlpedpends_6_tfpedcod), Integer.valueOf(AV69Wcwlpedpends_7_tfpedcod_to), AV70Wcwlpedpends_8_tfpedfec, AV71Wcwlpedpends_9_tfpedfecent, lV72Wcwlpedpends_10_tfprdnum, AV73Wcwlpedpends_11_tfprdnum_sel, lV74Wcwlpedpends_12_tfprdnom, AV75Wcwlpedpends_13_tfprdnom_sel, AV76Wcwlpedpends_14_tfpeduni, AV77Wcwlpedpends_15_tfpeduni_to, AV78Wcwlpedpends_16_tfpedcanent, AV79Wcwlpedpends_17_tfpedcanent_to, AV80Wcwlpedpends_18_tfcantpdte, AV81Wcwlpedpends_19_tfcantpdte_to, AV82Wcwlpedpends_20_tfpedpre, AV83Wcwlpedpends_21_tfpedpre_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8Q76 = false ;
         A719PrdNum = P08Q74_A719PrdNum[0] ;
         A396EmprCod = P08Q74_A396EmprCod[0] ;
         A665PedPre = P08Q74_A665PedPre[0] ;
         A718PrdNom = P08Q74_A718PrdNom[0] ;
         A662PedFecEnt = P08Q74_A662PedFecEnt[0] ;
         A661PedFec = P08Q74_A661PedFec[0] ;
         A658PedCod = P08Q74_A658PedCod[0] ;
         A794PrvNom = P08Q74_A794PrvNom[0] ;
         n794PrvNom = P08Q74_n794PrvNom[0] ;
         A795PrvNum = P08Q74_A795PrvNum[0] ;
         A657PedCanEnt = P08Q74_A657PedCanEnt[0] ;
         A669PedUni = P08Q74_A669PedUni[0] ;
         A718PrdNom = P08Q74_A718PrdNom[0] ;
         A795PrvNum = P08Q74_A795PrvNum[0] ;
         A794PrvNom = P08Q74_A794PrvNom[0] ;
         n794PrvNom = P08Q74_n794PrvNom[0] ;
         A662PedFecEnt = P08Q74_A662PedFecEnt[0] ;
         A661PedFec = P08Q74_A661PedFec[0] ;
         A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08Q74_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08Q74_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8Q76 = false ;
            A658PedCod = P08Q74_A658PedCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8Q76 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV34Option = A718PrdNom ;
            AV33InsertIndex = 1 ;
            while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
            {
               AV33InsertIndex = (int)(AV33InsertIndex+1) ;
            }
            AV35Options.add(AV34Option, AV33InsertIndex);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8Q76 )
         {
            brk8Q76 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwlpedpengetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = wcwlpedpengetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = wcwlpedpengetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54FilterFullText = "" ;
      AV12TFPrvNom = "" ;
      AV13TFPrvNom_Sel = "" ;
      AV16TFPedFec = GXutil.nullDate() ;
      AV18TFPedFecEnt = GXutil.nullDate() ;
      AV20TFPrdNum = "" ;
      AV21TFPrdNum_Sel = "" ;
      AV22TFPrdNom = "" ;
      AV23TFPrdNom_Sel = "" ;
      AV24TFPedUni = DecimalUtil.ZERO ;
      AV25TFPedUni_To = DecimalUtil.ZERO ;
      AV26TFPedCanEnt = DecimalUtil.ZERO ;
      AV27TFPedCanEnt_To = DecimalUtil.ZERO ;
      AV55TFCantPdte = DecimalUtil.ZERO ;
      AV56TFCantPdte_To = DecimalUtil.ZERO ;
      AV28TFPedPre = DecimalUtil.ZERO ;
      AV29TFPedPre_To = DecimalUtil.ZERO ;
      AV48Emprcod = "" ;
      AV49PedFec = GXutil.nullDate() ;
      AV50PedFec_to = GXutil.nullDate() ;
      AV53Lindsdo0 = "" ;
      A794PrvNom = "" ;
      AV63Wcwlpedpends_1_filterfulltext = "" ;
      AV66Wcwlpedpends_4_tfprvnom = "" ;
      AV67Wcwlpedpends_5_tfprvnom_sel = "" ;
      AV70Wcwlpedpends_8_tfpedfec = GXutil.nullDate() ;
      AV71Wcwlpedpends_9_tfpedfecent = GXutil.nullDate() ;
      AV72Wcwlpedpends_10_tfprdnum = "" ;
      AV73Wcwlpedpends_11_tfprdnum_sel = "" ;
      AV74Wcwlpedpends_12_tfprdnom = "" ;
      AV75Wcwlpedpends_13_tfprdnom_sel = "" ;
      AV76Wcwlpedpends_14_tfpeduni = DecimalUtil.ZERO ;
      AV77Wcwlpedpends_15_tfpeduni_to = DecimalUtil.ZERO ;
      AV78Wcwlpedpends_16_tfpedcanent = DecimalUtil.ZERO ;
      AV79Wcwlpedpends_17_tfpedcanent_to = DecimalUtil.ZERO ;
      AV80Wcwlpedpends_18_tfcantpdte = DecimalUtil.ZERO ;
      AV81Wcwlpedpends_19_tfcantpdte_to = DecimalUtil.ZERO ;
      AV82Wcwlpedpends_20_tfpedpre = DecimalUtil.ZERO ;
      AV83Wcwlpedpends_21_tfpedpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV63Wcwlpedpends_1_filterfulltext = "" ;
      lV66Wcwlpedpends_4_tfprvnom = "" ;
      lV72Wcwlpedpends_10_tfprdnum = "" ;
      lV74Wcwlpedpends_12_tfprdnom = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P08Q72_A396EmprCod = new String[] {""} ;
      P08Q72_A794PrvNom = new String[] {""} ;
      P08Q72_n794PrvNom = new boolean[] {false} ;
      P08Q72_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q72_A718PrdNom = new String[] {""} ;
      P08Q72_A719PrdNum = new String[] {""} ;
      P08Q72_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q72_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q72_A658PedCod = new int[1] ;
      P08Q72_A795PrvNum = new int[1] ;
      P08Q72_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q72_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A13833CantPdte = DecimalUtil.ZERO ;
      AV34Option = "" ;
      P08Q73_A396EmprCod = new String[] {""} ;
      P08Q73_A719PrdNum = new String[] {""} ;
      P08Q73_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q73_A718PrdNom = new String[] {""} ;
      P08Q73_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q73_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q73_A658PedCod = new int[1] ;
      P08Q73_A794PrvNom = new String[] {""} ;
      P08Q73_n794PrvNom = new boolean[] {false} ;
      P08Q73_A795PrvNum = new int[1] ;
      P08Q73_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q73_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q74_A719PrdNum = new String[] {""} ;
      P08Q74_A396EmprCod = new String[] {""} ;
      P08Q74_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q74_A718PrdNom = new String[] {""} ;
      P08Q74_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q74_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q74_A658PedCod = new int[1] ;
      P08Q74_A794PrvNom = new String[] {""} ;
      P08Q74_n794PrvNom = new boolean[] {false} ;
      P08Q74_A795PrvNum = new int[1] ;
      P08Q74_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q74_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwlpedpengetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08Q72_A396EmprCod, P08Q72_A794PrvNom, P08Q72_n794PrvNom, P08Q72_A665PedPre, P08Q72_A718PrdNom, P08Q72_A719PrdNum, P08Q72_A662PedFecEnt, P08Q72_A661PedFec, P08Q72_A658PedCod, P08Q72_A795PrvNum,
            P08Q72_A657PedCanEnt, P08Q72_A669PedUni
            }
            , new Object[] {
            P08Q73_A396EmprCod, P08Q73_A719PrdNum, P08Q73_A665PedPre, P08Q73_A718PrdNom, P08Q73_A662PedFecEnt, P08Q73_A661PedFec, P08Q73_A658PedCod, P08Q73_A794PrvNom, P08Q73_n794PrvNom, P08Q73_A795PrvNum,
            P08Q73_A657PedCanEnt, P08Q73_A669PedUni
            }
            , new Object[] {
            P08Q74_A719PrdNum, P08Q74_A396EmprCod, P08Q74_A665PedPre, P08Q74_A718PrdNom, P08Q74_A662PedFecEnt, P08Q74_A661PedFec, P08Q74_A658PedCod, P08Q74_A794PrvNom, P08Q74_n794PrvNom, P08Q74_A795PrvNum,
            P08Q74_A657PedCanEnt, P08Q74_A669PedUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV10TFPrvNum ;
   private int AV11TFPrvNum_To ;
   private int AV14TFPedCod ;
   private int AV15TFPedCod_To ;
   private int AV51PrvNum ;
   private int AV52PrvNum_to ;
   private int AV64Wcwlpedpends_2_tfprvnum ;
   private int AV65Wcwlpedpends_3_tfprvnum_to ;
   private int AV68Wcwlpedpends_6_tfpedcod ;
   private int AV69Wcwlpedpends_7_tfpedcod_to ;
   private int A795PrvNum ;
   private int A658PedCod ;
   private int AV33InsertIndex ;
   private long AV42count ;
   private java.math.BigDecimal AV24TFPedUni ;
   private java.math.BigDecimal AV25TFPedUni_To ;
   private java.math.BigDecimal AV26TFPedCanEnt ;
   private java.math.BigDecimal AV27TFPedCanEnt_To ;
   private java.math.BigDecimal AV55TFCantPdte ;
   private java.math.BigDecimal AV56TFCantPdte_To ;
   private java.math.BigDecimal AV28TFPedPre ;
   private java.math.BigDecimal AV29TFPedPre_To ;
   private java.math.BigDecimal AV76Wcwlpedpends_14_tfpeduni ;
   private java.math.BigDecimal AV77Wcwlpedpends_15_tfpeduni_to ;
   private java.math.BigDecimal AV78Wcwlpedpends_16_tfpedcanent ;
   private java.math.BigDecimal AV79Wcwlpedpends_17_tfpedcanent_to ;
   private java.math.BigDecimal AV80Wcwlpedpends_18_tfcantpdte ;
   private java.math.BigDecimal AV81Wcwlpedpends_19_tfcantpdte_to ;
   private java.math.BigDecimal AV82Wcwlpedpends_20_tfpedpre ;
   private java.math.BigDecimal AV83Wcwlpedpends_21_tfpedpre_to ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A13833CantPdte ;
   private String AV12TFPrvNom ;
   private String AV13TFPrvNom_Sel ;
   private String AV20TFPrdNum ;
   private String AV21TFPrdNum_Sel ;
   private String AV22TFPrdNom ;
   private String AV23TFPrdNom_Sel ;
   private String AV48Emprcod ;
   private String AV53Lindsdo0 ;
   private String A794PrvNom ;
   private String AV66Wcwlpedpends_4_tfprvnom ;
   private String AV67Wcwlpedpends_5_tfprvnom_sel ;
   private String AV72Wcwlpedpends_10_tfprdnum ;
   private String AV73Wcwlpedpends_11_tfprdnum_sel ;
   private String AV74Wcwlpedpends_12_tfprdnom ;
   private String AV75Wcwlpedpends_13_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV66Wcwlpedpends_4_tfprvnom ;
   private String lV72Wcwlpedpends_10_tfprdnum ;
   private String lV74Wcwlpedpends_12_tfprdnom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private java.util.Date AV16TFPedFec ;
   private java.util.Date AV18TFPedFecEnt ;
   private java.util.Date AV49PedFec ;
   private java.util.Date AV50PedFec_to ;
   private java.util.Date AV70Wcwlpedpends_8_tfpedfec ;
   private java.util.Date AV71Wcwlpedpends_9_tfpedfecent ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private boolean returnInSub ;
   private boolean brk8Q72 ;
   private boolean n794PrvNom ;
   private boolean brk8Q74 ;
   private boolean brk8Q76 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV54FilterFullText ;
   private String AV63Wcwlpedpends_1_filterfulltext ;
   private String lV63Wcwlpedpends_1_filterfulltext ;
   private String AV34Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08Q72_A396EmprCod ;
   private String[] P08Q72_A794PrvNom ;
   private boolean[] P08Q72_n794PrvNom ;
   private java.math.BigDecimal[] P08Q72_A665PedPre ;
   private String[] P08Q72_A718PrdNom ;
   private String[] P08Q72_A719PrdNum ;
   private java.util.Date[] P08Q72_A662PedFecEnt ;
   private java.util.Date[] P08Q72_A661PedFec ;
   private int[] P08Q72_A658PedCod ;
   private int[] P08Q72_A795PrvNum ;
   private java.math.BigDecimal[] P08Q72_A657PedCanEnt ;
   private java.math.BigDecimal[] P08Q72_A669PedUni ;
   private String[] P08Q73_A396EmprCod ;
   private String[] P08Q73_A719PrdNum ;
   private java.math.BigDecimal[] P08Q73_A665PedPre ;
   private String[] P08Q73_A718PrdNom ;
   private java.util.Date[] P08Q73_A662PedFecEnt ;
   private java.util.Date[] P08Q73_A661PedFec ;
   private int[] P08Q73_A658PedCod ;
   private String[] P08Q73_A794PrvNom ;
   private boolean[] P08Q73_n794PrvNom ;
   private int[] P08Q73_A795PrvNum ;
   private java.math.BigDecimal[] P08Q73_A657PedCanEnt ;
   private java.math.BigDecimal[] P08Q73_A669PedUni ;
   private String[] P08Q74_A719PrdNum ;
   private String[] P08Q74_A396EmprCod ;
   private java.math.BigDecimal[] P08Q74_A665PedPre ;
   private String[] P08Q74_A718PrdNom ;
   private java.util.Date[] P08Q74_A662PedFecEnt ;
   private java.util.Date[] P08Q74_A661PedFec ;
   private int[] P08Q74_A658PedCod ;
   private String[] P08Q74_A794PrvNom ;
   private boolean[] P08Q74_n794PrvNom ;
   private int[] P08Q74_A795PrvNum ;
   private java.math.BigDecimal[] P08Q74_A657PedCanEnt ;
   private java.math.BigDecimal[] P08Q74_A669PedUni ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class wcwlpedpengetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Q72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Wcwlpedpends_1_filterfulltext ,
                                          int AV64Wcwlpedpends_2_tfprvnum ,
                                          int AV65Wcwlpedpends_3_tfprvnum_to ,
                                          String AV67Wcwlpedpends_5_tfprvnom_sel ,
                                          String AV66Wcwlpedpends_4_tfprvnom ,
                                          int AV68Wcwlpedpends_6_tfpedcod ,
                                          int AV69Wcwlpedpends_7_tfpedcod_to ,
                                          java.util.Date AV70Wcwlpedpends_8_tfpedfec ,
                                          java.util.Date AV71Wcwlpedpends_9_tfpedfecent ,
                                          String AV73Wcwlpedpends_11_tfprdnum_sel ,
                                          String AV72Wcwlpedpends_10_tfprdnum ,
                                          String AV75Wcwlpedpends_13_tfprdnom_sel ,
                                          String AV74Wcwlpedpends_12_tfprdnom ,
                                          java.math.BigDecimal AV76Wcwlpedpends_14_tfpeduni ,
                                          java.math.BigDecimal AV77Wcwlpedpends_15_tfpeduni_to ,
                                          java.math.BigDecimal AV78Wcwlpedpends_16_tfpedcanent ,
                                          java.math.BigDecimal AV79Wcwlpedpends_17_tfpedcanent_to ,
                                          java.math.BigDecimal AV80Wcwlpedpends_18_tfcantpdte ,
                                          java.math.BigDecimal AV81Wcwlpedpends_19_tfcantpdte_to ,
                                          java.math.BigDecimal AV82Wcwlpedpends_20_tfpedpre ,
                                          java.math.BigDecimal AV83Wcwlpedpends_21_tfpedpre_to ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          int A658PedCod ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date AV49PedFec ,
                                          java.util.Date AV50PedFec_to ,
                                          int AV51PrvNum ,
                                          int AV52PrvNum_to ,
                                          String A396EmprCod ,
                                          String AV48Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[34];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T3.PrvNom, T1.PedPre, T2.PrdNom, T1.PrdNum, T4.PedFecEnt, T4.PedFec, T1.PedCod, T2.PrvNum, T1.PedCanEnt, T1.PedUni FROM (((TXPLPEDID T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T2.PrvNum) INNER JOIN" ;
      scmdbuf += " TXPCPEDID T4 ON T4.EmprCod = T1.EmprCod AND T4.PedCod = T1.PedCod)" ;
      addWhere(sWhereString, "(T4.PedFec >= ?)");
      addWhere(sWhereString, "(T4.PedFec <= ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV63Wcwlpedpends_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T2.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedUni,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCanEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(( T1.PedUni - T1.PedCanEnt),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedPre,'99999990.99999'), 2) like '%' || ?))");
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
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcwlpedpends_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T2.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcwlpedpends_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T2.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwlpedpends_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwlpedpends_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwlpedpends_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcwlpedpends_6_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcwlpedpends_7_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70Wcwlpedpends_8_tfpedfec)) )
      {
         addWhere(sWhereString, "(T4.PedFec >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71Wcwlpedpends_9_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T4.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcwlpedpends_11_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcwlpedpends_10_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcwlpedpends_11_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Wcwlpedpends_13_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcwlpedpends_12_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcwlpedpends_13_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcwlpedpends_14_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcwlpedpends_15_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Wcwlpedpends_16_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Wcwlpedpends_17_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Wcwlpedpends_18_tfcantpdte)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Wcwlpedpends_19_tfcantpdte_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Wcwlpedpends_20_tfpedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Wcwlpedpends_21_tfpedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.PrvNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08Q73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Wcwlpedpends_1_filterfulltext ,
                                          int AV64Wcwlpedpends_2_tfprvnum ,
                                          int AV65Wcwlpedpends_3_tfprvnum_to ,
                                          String AV67Wcwlpedpends_5_tfprvnom_sel ,
                                          String AV66Wcwlpedpends_4_tfprvnom ,
                                          int AV68Wcwlpedpends_6_tfpedcod ,
                                          int AV69Wcwlpedpends_7_tfpedcod_to ,
                                          java.util.Date AV70Wcwlpedpends_8_tfpedfec ,
                                          java.util.Date AV71Wcwlpedpends_9_tfpedfecent ,
                                          String AV73Wcwlpedpends_11_tfprdnum_sel ,
                                          String AV72Wcwlpedpends_10_tfprdnum ,
                                          String AV75Wcwlpedpends_13_tfprdnom_sel ,
                                          String AV74Wcwlpedpends_12_tfprdnom ,
                                          java.math.BigDecimal AV76Wcwlpedpends_14_tfpeduni ,
                                          java.math.BigDecimal AV77Wcwlpedpends_15_tfpeduni_to ,
                                          java.math.BigDecimal AV78Wcwlpedpends_16_tfpedcanent ,
                                          java.math.BigDecimal AV79Wcwlpedpends_17_tfpedcanent_to ,
                                          java.math.BigDecimal AV80Wcwlpedpends_18_tfcantpdte ,
                                          java.math.BigDecimal AV81Wcwlpedpends_19_tfcantpdte_to ,
                                          java.math.BigDecimal AV82Wcwlpedpends_20_tfpedpre ,
                                          java.math.BigDecimal AV83Wcwlpedpends_21_tfpedpre_to ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          int A658PedCod ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date AV49PedFec ,
                                          java.util.Date AV50PedFec_to ,
                                          int AV51PrvNum ,
                                          int AV52PrvNum_to ,
                                          String AV48Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[34];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.PedPre, T2.PrdNom, T4.PedFecEnt, T4.PedFec, T1.PedCod, T3.PrvNom, T2.PrvNum, T1.PedCanEnt, T1.PedUni FROM (((TXPLPEDID T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T2.PrvNum) INNER JOIN" ;
      scmdbuf += " TXPCPEDID T4 ON T4.EmprCod = T1.EmprCod AND T4.PedCod = T1.PedCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T4.PedFec >= ?)");
      addWhere(sWhereString, "(T4.PedFec <= ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      if ( ! (GXutil.strcmp("", AV63Wcwlpedpends_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T2.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedUni,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCanEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(( T1.PedUni - T1.PedCanEnt),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedPre,'99999990.99999'), 2) like '%' || ?))");
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
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcwlpedpends_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T2.PrvNum >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcwlpedpends_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T2.PrvNum <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwlpedpends_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwlpedpends_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwlpedpends_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcwlpedpends_6_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcwlpedpends_7_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70Wcwlpedpends_8_tfpedfec)) )
      {
         addWhere(sWhereString, "(T4.PedFec >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71Wcwlpedpends_9_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T4.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcwlpedpends_11_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcwlpedpends_10_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcwlpedpends_11_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Wcwlpedpends_13_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcwlpedpends_12_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcwlpedpends_13_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcwlpedpends_14_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcwlpedpends_15_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Wcwlpedpends_16_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Wcwlpedpends_17_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Wcwlpedpends_18_tfcantpdte)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Wcwlpedpends_19_tfcantpdte_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Wcwlpedpends_20_tfpedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Wcwlpedpends_21_tfpedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre <= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08Q74( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Wcwlpedpends_1_filterfulltext ,
                                          int AV64Wcwlpedpends_2_tfprvnum ,
                                          int AV65Wcwlpedpends_3_tfprvnum_to ,
                                          String AV67Wcwlpedpends_5_tfprvnom_sel ,
                                          String AV66Wcwlpedpends_4_tfprvnom ,
                                          int AV68Wcwlpedpends_6_tfpedcod ,
                                          int AV69Wcwlpedpends_7_tfpedcod_to ,
                                          java.util.Date AV70Wcwlpedpends_8_tfpedfec ,
                                          java.util.Date AV71Wcwlpedpends_9_tfpedfecent ,
                                          String AV73Wcwlpedpends_11_tfprdnum_sel ,
                                          String AV72Wcwlpedpends_10_tfprdnum ,
                                          String AV75Wcwlpedpends_13_tfprdnom_sel ,
                                          String AV74Wcwlpedpends_12_tfprdnom ,
                                          java.math.BigDecimal AV76Wcwlpedpends_14_tfpeduni ,
                                          java.math.BigDecimal AV77Wcwlpedpends_15_tfpeduni_to ,
                                          java.math.BigDecimal AV78Wcwlpedpends_16_tfpedcanent ,
                                          java.math.BigDecimal AV79Wcwlpedpends_17_tfpedcanent_to ,
                                          java.math.BigDecimal AV80Wcwlpedpends_18_tfcantpdte ,
                                          java.math.BigDecimal AV81Wcwlpedpends_19_tfcantpdte_to ,
                                          java.math.BigDecimal AV82Wcwlpedpends_20_tfpedpre ,
                                          java.math.BigDecimal AV83Wcwlpedpends_21_tfpedpre_to ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          int A658PedCod ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt ,
                                          java.util.Date AV49PedFec ,
                                          java.util.Date AV50PedFec_to ,
                                          int AV51PrvNum ,
                                          int AV52PrvNum_to ,
                                          String AV48Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[34];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.PedPre, T2.PrdNom, T4.PedFecEnt, T4.PedFec, T1.PedCod, T3.PrvNom, T2.PrvNum, T1.PedCanEnt, T1.PedUni FROM (((TXPLPEDID T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T2.PrvNum) INNER JOIN" ;
      scmdbuf += " TXPCPEDID T4 ON T4.EmprCod = T1.EmprCod AND T4.PedCod = T1.PedCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T4.PedFec >= ?)");
      addWhere(sWhereString, "(T4.PedFec <= ?)");
      addWhere(sWhereString, "(T2.PrvNum >= ?)");
      addWhere(sWhereString, "(T2.PrvNum <= ?)");
      if ( ! (GXutil.strcmp("", AV63Wcwlpedpends_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T2.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedUni,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCanEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(( T1.PedUni - T1.PedCanEnt),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedPre,'99999990.99999'), 2) like '%' || ?))");
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
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcwlpedpends_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T2.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcwlpedpends_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T2.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcwlpedpends_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcwlpedpends_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcwlpedpends_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcwlpedpends_6_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcwlpedpends_7_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70Wcwlpedpends_8_tfpedfec)) )
      {
         addWhere(sWhereString, "(T4.PedFec >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71Wcwlpedpends_9_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T4.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcwlpedpends_11_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcwlpedpends_10_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcwlpedpends_11_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Wcwlpedpends_13_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcwlpedpends_12_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcwlpedpends_13_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcwlpedpends_14_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcwlpedpends_15_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Wcwlpedpends_16_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Wcwlpedpends_17_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Wcwlpedpends_18_tfcantpdte)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Wcwlpedpends_19_tfcantpdte_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PedUni - T1.PedCanEnt) <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Wcwlpedpends_20_tfpedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Wcwlpedpends_21_tfpedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedPre <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
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
                  return conditional_P08Q72(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 1 :
                  return conditional_P08Q73(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 2 :
                  return conditional_P08Q74(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Q72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Q73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Q74", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 5);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[36]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 5);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[36]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 5);
               }
               return;
      }
   }

}

