package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwwkp64_2getfilterdata extends GXProcedure
{
   public wcwwkp64_2getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwwkp64_2getfilterdata.class ), "" );
   }

   public wcwwkp64_2getfilterdata( int remoteHandle ,
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
      wcwwkp64_2getfilterdata.this.aP5 = new String[] {""};
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
      wcwwkp64_2getfilterdata.this.AV16DDOName = aP0;
      wcwwkp64_2getfilterdata.this.AV14SearchTxt = aP1;
      wcwwkp64_2getfilterdata.this.AV15SearchTxtTo = aP2;
      wcwwkp64_2getfilterdata.this.aP3 = aP3;
      wcwwkp64_2getfilterdata.this.aP4 = aP4;
      wcwwkp64_2getfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNOM") == 0 )
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
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("WCWwkp64_2GridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWwkp64_2GridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WCWwkp64_2GridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV39TFPrdDisponible = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFPrdDisponible_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV32Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TB1_CODINOUT") == 0 )
         {
            AV33Tb1_Codinout = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV35Prdnum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV36PrvNum = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV14SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV45Wcwwkp64_2ds_1_filterfulltext = AV34FilterFullText ;
      AV46Wcwwkp64_2ds_2_tfprdnum = AV10TFPrdNum ;
      AV47Wcwwkp64_2ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV48Wcwwkp64_2ds_4_tfprdnom = AV12TFPrdNom ;
      AV49Wcwwkp64_2ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV50Wcwwkp64_2ds_6_tfprddisponible = AV39TFPrdDisponible ;
      AV51Wcwwkp64_2ds_7_tfprddisponible_to = AV40TFPrdDisponible_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV45Wcwwkp64_2ds_1_filterfulltext ,
                                           AV47Wcwwkp64_2ds_3_tfprdnum_sel ,
                                           AV46Wcwwkp64_2ds_2_tfprdnum ,
                                           AV49Wcwwkp64_2ds_5_tfprdnom_sel ,
                                           AV48Wcwwkp64_2ds_4_tfprdnom ,
                                           AV50Wcwwkp64_2ds_6_tfprddisponible ,
                                           AV51Wcwwkp64_2ds_7_tfprddisponible_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           AV35Prdnum ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV36PrvNum) ,
                                           AV32Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV35Prdnum = GXutil.padr( GXutil.rtrim( AV35Prdnum), 6, "%") ;
      lV45Wcwwkp64_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwwkp64_2ds_1_filterfulltext), "%", "") ;
      lV45Wcwwkp64_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwwkp64_2ds_1_filterfulltext), "%", "") ;
      lV45Wcwwkp64_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwwkp64_2ds_1_filterfulltext), "%", "") ;
      lV46Wcwwkp64_2ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Wcwwkp64_2ds_2_tfprdnum), 6, "%") ;
      lV48Wcwwkp64_2ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Wcwwkp64_2ds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08QX2 */
      pr_default.execute(0, new Object[] {AV32Emprcod, lV35Prdnum, AV35Prdnum, Integer.valueOf(AV36PrvNum), Integer.valueOf(AV36PrvNum), lV45Wcwwkp64_2ds_1_filterfulltext, lV45Wcwwkp64_2ds_1_filterfulltext, lV45Wcwwkp64_2ds_1_filterfulltext, lV46Wcwwkp64_2ds_2_tfprdnum, AV47Wcwwkp64_2ds_3_tfprdnum_sel, lV48Wcwwkp64_2ds_4_tfprdnom, AV49Wcwwkp64_2ds_5_tfprdnom_sel, AV50Wcwwkp64_2ds_6_tfprddisponible, AV51Wcwwkp64_2ds_7_tfprddisponible_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8QX2 = false ;
         A396EmprCod = P08QX2_A396EmprCod[0] ;
         A719PrdNum = P08QX2_A719PrdNum[0] ;
         A795PrvNum = P08QX2_A795PrvNum[0] ;
         A856ValCod = P08QX2_A856ValCod[0] ;
         A718PrdNom = P08QX2_A718PrdNom[0] ;
         A685PrdCanRes = P08QX2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08QX2_A704PrdExiAlm[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08QX2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08QX2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8QX2 = false ;
            AV26count = (long)(AV26count+1) ;
            brk8QX2 = true ;
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
         if ( ! brk8QX2 )
         {
            brk8QX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV14SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV45Wcwwkp64_2ds_1_filterfulltext = AV34FilterFullText ;
      AV46Wcwwkp64_2ds_2_tfprdnum = AV10TFPrdNum ;
      AV47Wcwwkp64_2ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV48Wcwwkp64_2ds_4_tfprdnom = AV12TFPrdNom ;
      AV49Wcwwkp64_2ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV50Wcwwkp64_2ds_6_tfprddisponible = AV39TFPrdDisponible ;
      AV51Wcwwkp64_2ds_7_tfprddisponible_to = AV40TFPrdDisponible_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV45Wcwwkp64_2ds_1_filterfulltext ,
                                           AV47Wcwwkp64_2ds_3_tfprdnum_sel ,
                                           AV46Wcwwkp64_2ds_2_tfprdnum ,
                                           AV49Wcwwkp64_2ds_5_tfprdnom_sel ,
                                           AV48Wcwwkp64_2ds_4_tfprdnom ,
                                           AV50Wcwwkp64_2ds_6_tfprddisponible ,
                                           AV51Wcwwkp64_2ds_7_tfprddisponible_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           AV35Prdnum ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV36PrvNum) ,
                                           AV32Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV35Prdnum = GXutil.padr( GXutil.rtrim( AV35Prdnum), 6, "%") ;
      lV45Wcwwkp64_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwwkp64_2ds_1_filterfulltext), "%", "") ;
      lV45Wcwwkp64_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwwkp64_2ds_1_filterfulltext), "%", "") ;
      lV45Wcwwkp64_2ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwwkp64_2ds_1_filterfulltext), "%", "") ;
      lV46Wcwwkp64_2ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Wcwwkp64_2ds_2_tfprdnum), 6, "%") ;
      lV48Wcwwkp64_2ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Wcwwkp64_2ds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08QX3 */
      pr_default.execute(1, new Object[] {AV32Emprcod, lV35Prdnum, AV35Prdnum, Integer.valueOf(AV36PrvNum), Integer.valueOf(AV36PrvNum), lV45Wcwwkp64_2ds_1_filterfulltext, lV45Wcwwkp64_2ds_1_filterfulltext, lV45Wcwwkp64_2ds_1_filterfulltext, lV46Wcwwkp64_2ds_2_tfprdnum, AV47Wcwwkp64_2ds_3_tfprdnum_sel, lV48Wcwwkp64_2ds_4_tfprdnom, AV49Wcwwkp64_2ds_5_tfprdnom_sel, AV50Wcwwkp64_2ds_6_tfprddisponible, AV51Wcwwkp64_2ds_7_tfprddisponible_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8QX4 = false ;
         A396EmprCod = P08QX3_A396EmprCod[0] ;
         A718PrdNom = P08QX3_A718PrdNom[0] ;
         A795PrvNum = P08QX3_A795PrvNum[0] ;
         A856ValCod = P08QX3_A856ValCod[0] ;
         A719PrdNum = P08QX3_A719PrdNum[0] ;
         A685PrdCanRes = P08QX3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08QX3_A704PrdExiAlm[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08QX3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08QX3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8QX4 = false ;
            A719PrdNum = P08QX3_A719PrdNum[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8QX4 = true ;
            pr_default.readNext(1);
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
         if ( ! brk8QX4 )
         {
            brk8QX4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwwkp64_2getfilterdata.this.AV20OptionsJson;
      this.aP4[0] = wcwwkp64_2getfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = wcwwkp64_2getfilterdata.this.AV25OptionIndexesJson;
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
      AV34FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV39TFPrdDisponible = DecimalUtil.ZERO ;
      AV40TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV32Emprcod = "" ;
      AV35Prdnum = "" ;
      A719PrdNum = "" ;
      AV45Wcwwkp64_2ds_1_filterfulltext = "" ;
      AV46Wcwwkp64_2ds_2_tfprdnum = "" ;
      AV47Wcwwkp64_2ds_3_tfprdnum_sel = "" ;
      AV48Wcwwkp64_2ds_4_tfprdnom = "" ;
      AV49Wcwwkp64_2ds_5_tfprdnom_sel = "" ;
      AV50Wcwwkp64_2ds_6_tfprddisponible = DecimalUtil.ZERO ;
      AV51Wcwwkp64_2ds_7_tfprddisponible_to = DecimalUtil.ZERO ;
      lV35Prdnum = "" ;
      scmdbuf = "" ;
      lV45Wcwwkp64_2ds_1_filterfulltext = "" ;
      lV46Wcwwkp64_2ds_2_tfprdnum = "" ;
      lV48Wcwwkp64_2ds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08QX2_A396EmprCod = new String[] {""} ;
      P08QX2_A719PrdNum = new String[] {""} ;
      P08QX2_A795PrvNum = new int[1] ;
      P08QX2_A856ValCod = new byte[1] ;
      P08QX2_A718PrdNom = new String[] {""} ;
      P08QX2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QX2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      AV18Option = "" ;
      P08QX3_A396EmprCod = new String[] {""} ;
      P08QX3_A718PrdNom = new String[] {""} ;
      P08QX3_A795PrvNum = new int[1] ;
      P08QX3_A856ValCod = new byte[1] ;
      P08QX3_A719PrdNum = new String[] {""} ;
      P08QX3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QX3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwwkp64_2getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08QX2_A396EmprCod, P08QX2_A719PrdNum, P08QX2_A795PrvNum, P08QX2_A856ValCod, P08QX2_A718PrdNom, P08QX2_A685PrdCanRes, P08QX2_A704PrdExiAlm
            }
            , new Object[] {
            P08QX3_A396EmprCod, P08QX3_A718PrdNom, P08QX3_A795PrvNum, P08QX3_A856ValCod, P08QX3_A719PrdNum, P08QX3_A685PrdCanRes, P08QX3_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short AV33Tb1_Codinout ;
   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV36PrvNum ;
   private int A795PrvNum ;
   private long AV26count ;
   private java.math.BigDecimal AV39TFPrdDisponible ;
   private java.math.BigDecimal AV40TFPrdDisponible_To ;
   private java.math.BigDecimal AV50Wcwwkp64_2ds_6_tfprddisponible ;
   private java.math.BigDecimal AV51Wcwwkp64_2ds_7_tfprddisponible_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV32Emprcod ;
   private String AV35Prdnum ;
   private String A719PrdNum ;
   private String AV46Wcwwkp64_2ds_2_tfprdnum ;
   private String AV47Wcwwkp64_2ds_3_tfprdnum_sel ;
   private String AV48Wcwwkp64_2ds_4_tfprdnom ;
   private String AV49Wcwwkp64_2ds_5_tfprdnom_sel ;
   private String lV35Prdnum ;
   private String scmdbuf ;
   private String lV46Wcwwkp64_2ds_2_tfprdnum ;
   private String lV48Wcwwkp64_2ds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8QX2 ;
   private boolean brk8QX4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV45Wcwwkp64_2ds_1_filterfulltext ;
   private String lV45Wcwwkp64_2ds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08QX2_A396EmprCod ;
   private String[] P08QX2_A719PrdNum ;
   private int[] P08QX2_A795PrvNum ;
   private byte[] P08QX2_A856ValCod ;
   private String[] P08QX2_A718PrdNom ;
   private java.math.BigDecimal[] P08QX2_A685PrdCanRes ;
   private java.math.BigDecimal[] P08QX2_A704PrdExiAlm ;
   private String[] P08QX3_A396EmprCod ;
   private String[] P08QX3_A718PrdNom ;
   private int[] P08QX3_A795PrvNum ;
   private byte[] P08QX3_A856ValCod ;
   private String[] P08QX3_A719PrdNum ;
   private java.math.BigDecimal[] P08QX3_A685PrdCanRes ;
   private java.math.BigDecimal[] P08QX3_A704PrdExiAlm ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class wcwwkp64_2getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08QX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Wcwwkp64_2ds_1_filterfulltext ,
                                          String AV47Wcwwkp64_2ds_3_tfprdnum_sel ,
                                          String AV46Wcwwkp64_2ds_2_tfprdnum ,
                                          String AV49Wcwwkp64_2ds_5_tfprdnom_sel ,
                                          String AV48Wcwwkp64_2ds_4_tfprdnom ,
                                          java.math.BigDecimal AV50Wcwwkp64_2ds_6_tfprddisponible ,
                                          java.math.BigDecimal AV51Wcwwkp64_2ds_7_tfprddisponible_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String AV35Prdnum ,
                                          byte A856ValCod ,
                                          int A795PrvNum ,
                                          int AV36PrvNum ,
                                          String AV32Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, PrvNum, ValCod, PrdNom, PrdCanRes, PrdExiAlm FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5)");
      addWhere(sWhereString, "(ValCod < 3)");
      addWhere(sWhereString, "(PrvNum = ? or (? = 0))");
      if ( ! (GXutil.strcmp("", AV45Wcwwkp64_2ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(( PrdExiAlm - PrdCanRes),'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Wcwwkp64_2ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Wcwwkp64_2ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Wcwwkp64_2ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwwkp64_2ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwwkp64_2ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwwkp64_2ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50Wcwwkp64_2ds_6_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( PrdExiAlm - PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Wcwwkp64_2ds_7_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( PrdExiAlm - PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08QX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Wcwwkp64_2ds_1_filterfulltext ,
                                          String AV47Wcwwkp64_2ds_3_tfprdnum_sel ,
                                          String AV46Wcwwkp64_2ds_2_tfprdnum ,
                                          String AV49Wcwwkp64_2ds_5_tfprdnom_sel ,
                                          String AV48Wcwwkp64_2ds_4_tfprdnom ,
                                          java.math.BigDecimal AV50Wcwwkp64_2ds_6_tfprddisponible ,
                                          java.math.BigDecimal AV51Wcwwkp64_2ds_7_tfprddisponible_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String AV35Prdnum ,
                                          byte A856ValCod ,
                                          int A795PrvNum ,
                                          int AV36PrvNum ,
                                          String AV32Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[14];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNom, PrvNum, ValCod, PrdNum, PrdCanRes, PrdExiAlm FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5)");
      addWhere(sWhereString, "(ValCod < 3)");
      addWhere(sWhereString, "(PrvNum = ? or (? = 0))");
      if ( ! (GXutil.strcmp("", AV45Wcwwkp64_2ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(( PrdExiAlm - PrdCanRes),'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Wcwwkp64_2ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Wcwwkp64_2ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Wcwwkp64_2ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwwkp64_2ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwwkp64_2ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwwkp64_2ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50Wcwwkp64_2ds_6_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( PrdExiAlm - PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Wcwwkp64_2ds_7_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( PrdExiAlm - PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P08QX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
            case 1 :
                  return conditional_P08QX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08QX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08QX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
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
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               return;
      }
   }

}

