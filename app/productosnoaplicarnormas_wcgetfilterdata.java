package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class productosnoaplicarnormas_wcgetfilterdata extends GXProcedure
{
   public productosnoaplicarnormas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosnoaplicarnormas_wcgetfilterdata.class ), "" );
   }

   public productosnoaplicarnormas_wcgetfilterdata( int remoteHandle ,
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
      productosnoaplicarnormas_wcgetfilterdata.this.aP5 = new String[] {""};
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
      productosnoaplicarnormas_wcgetfilterdata.this.AV18DDOName = aP0;
      productosnoaplicarnormas_wcgetfilterdata.this.AV16SearchTxt = aP1;
      productosnoaplicarnormas_wcgetfilterdata.this.AV17SearchTxtTo = aP2;
      productosnoaplicarnormas_wcgetfilterdata.this.aP3 = aP3;
      productosnoaplicarnormas_wcgetfilterdata.this.aP4 = aP4;
      productosnoaplicarnormas_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PRDNOM") == 0 )
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
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("ProductosNOaplicarNormas_WCGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ProductosNOaplicarNormas_WCGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("ProductosNOaplicarNormas_WCGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV14TFPrdDisponible = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPrdDisponible_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV36Prdnum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV37PrvNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&NORMAID") == 0 )
         {
            AV38NormaID = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV16SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV43Productosnoaplicarnormas_wcds_1_filterfulltext = AV34FilterFullText ;
      AV44Productosnoaplicarnormas_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV46Productosnoaplicarnormas_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV48Productosnoaplicarnormas_wcds_6_tfprddisponible = AV14TFPrdDisponible ;
      AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to = AV15TFPrdDisponible_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Productosnoaplicarnormas_wcds_1_filterfulltext ,
                                           AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel ,
                                           AV44Productosnoaplicarnormas_wcds_2_tfprdnum ,
                                           AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel ,
                                           AV46Productosnoaplicarnormas_wcds_4_tfprdnom ,
                                           AV48Productosnoaplicarnormas_wcds_6_tfprddisponible ,
                                           AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           AV36Prdnum ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV37PrvNum) ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36Prdnum = GXutil.padr( GXutil.rtrim( AV36Prdnum), 6, "%") ;
      lV43Productosnoaplicarnormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Productosnoaplicarnormas_wcds_1_filterfulltext), "%", "") ;
      lV43Productosnoaplicarnormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Productosnoaplicarnormas_wcds_1_filterfulltext), "%", "") ;
      lV43Productosnoaplicarnormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Productosnoaplicarnormas_wcds_1_filterfulltext), "%", "") ;
      lV44Productosnoaplicarnormas_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV44Productosnoaplicarnormas_wcds_2_tfprdnum), 6, "%") ;
      lV46Productosnoaplicarnormas_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV46Productosnoaplicarnormas_wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P095W2 */
      pr_default.execute(0, new Object[] {AV35Emprcod, lV36Prdnum, AV36Prdnum, Integer.valueOf(AV37PrvNum), Integer.valueOf(AV37PrvNum), lV43Productosnoaplicarnormas_wcds_1_filterfulltext, lV43Productosnoaplicarnormas_wcds_1_filterfulltext, lV43Productosnoaplicarnormas_wcds_1_filterfulltext, lV44Productosnoaplicarnormas_wcds_2_tfprdnum, AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel, lV46Productosnoaplicarnormas_wcds_4_tfprdnom, AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel, AV48Productosnoaplicarnormas_wcds_6_tfprddisponible, AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk95W2 = false ;
         A396EmprCod = P095W2_A396EmprCod[0] ;
         A719PrdNum = P095W2_A719PrdNum[0] ;
         A795PrvNum = P095W2_A795PrvNum[0] ;
         A856ValCod = P095W2_A856ValCod[0] ;
         A718PrdNom = P095W2_A718PrdNom[0] ;
         A685PrdCanRes = P095W2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P095W2_A704PrdExiAlm[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P095W2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P095W2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk95W2 = false ;
            AV28count = (long)(AV28count+1) ;
            brk95W2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV20Option = A719PrdNum ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95W2 )
         {
            brk95W2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV16SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV43Productosnoaplicarnormas_wcds_1_filterfulltext = AV34FilterFullText ;
      AV44Productosnoaplicarnormas_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV46Productosnoaplicarnormas_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV48Productosnoaplicarnormas_wcds_6_tfprddisponible = AV14TFPrdDisponible ;
      AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to = AV15TFPrdDisponible_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV43Productosnoaplicarnormas_wcds_1_filterfulltext ,
                                           AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel ,
                                           AV44Productosnoaplicarnormas_wcds_2_tfprdnum ,
                                           AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel ,
                                           AV46Productosnoaplicarnormas_wcds_4_tfprdnom ,
                                           AV48Productosnoaplicarnormas_wcds_6_tfprddisponible ,
                                           AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           AV36Prdnum ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV37PrvNum) ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV36Prdnum = GXutil.padr( GXutil.rtrim( AV36Prdnum), 6, "%") ;
      lV43Productosnoaplicarnormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Productosnoaplicarnormas_wcds_1_filterfulltext), "%", "") ;
      lV43Productosnoaplicarnormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Productosnoaplicarnormas_wcds_1_filterfulltext), "%", "") ;
      lV43Productosnoaplicarnormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Productosnoaplicarnormas_wcds_1_filterfulltext), "%", "") ;
      lV44Productosnoaplicarnormas_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV44Productosnoaplicarnormas_wcds_2_tfprdnum), 6, "%") ;
      lV46Productosnoaplicarnormas_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV46Productosnoaplicarnormas_wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P095W3 */
      pr_default.execute(1, new Object[] {AV35Emprcod, lV36Prdnum, AV36Prdnum, Integer.valueOf(AV37PrvNum), Integer.valueOf(AV37PrvNum), lV43Productosnoaplicarnormas_wcds_1_filterfulltext, lV43Productosnoaplicarnormas_wcds_1_filterfulltext, lV43Productosnoaplicarnormas_wcds_1_filterfulltext, lV44Productosnoaplicarnormas_wcds_2_tfprdnum, AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel, lV46Productosnoaplicarnormas_wcds_4_tfprdnom, AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel, AV48Productosnoaplicarnormas_wcds_6_tfprddisponible, AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk95W4 = false ;
         A396EmprCod = P095W3_A396EmprCod[0] ;
         A718PrdNom = P095W3_A718PrdNom[0] ;
         A795PrvNum = P095W3_A795PrvNum[0] ;
         A856ValCod = P095W3_A856ValCod[0] ;
         A719PrdNum = P095W3_A719PrdNum[0] ;
         A685PrdCanRes = P095W3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P095W3_A704PrdExiAlm[0] ;
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P095W3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P095W3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk95W4 = false ;
            A719PrdNum = P095W3_A719PrdNum[0] ;
            AV28count = (long)(AV28count+1) ;
            brk95W4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV20Option = A718PrdNom ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk95W4 )
         {
            brk95W4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = productosnoaplicarnormas_wcgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = productosnoaplicarnormas_wcgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = productosnoaplicarnormas_wcgetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPrdDisponible = DecimalUtil.ZERO ;
      AV15TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV35Emprcod = "" ;
      AV36Prdnum = "" ;
      AV38NormaID = "" ;
      A719PrdNum = "" ;
      AV43Productosnoaplicarnormas_wcds_1_filterfulltext = "" ;
      AV44Productosnoaplicarnormas_wcds_2_tfprdnum = "" ;
      AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel = "" ;
      AV46Productosnoaplicarnormas_wcds_4_tfprdnom = "" ;
      AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel = "" ;
      AV48Productosnoaplicarnormas_wcds_6_tfprddisponible = DecimalUtil.ZERO ;
      AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to = DecimalUtil.ZERO ;
      lV36Prdnum = "" ;
      scmdbuf = "" ;
      lV43Productosnoaplicarnormas_wcds_1_filterfulltext = "" ;
      lV44Productosnoaplicarnormas_wcds_2_tfprdnum = "" ;
      lV46Productosnoaplicarnormas_wcds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P095W2_A396EmprCod = new String[] {""} ;
      P095W2_A719PrdNum = new String[] {""} ;
      P095W2_A795PrvNum = new int[1] ;
      P095W2_A856ValCod = new byte[1] ;
      P095W2_A718PrdNom = new String[] {""} ;
      P095W2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P095W2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      AV20Option = "" ;
      P095W3_A396EmprCod = new String[] {""} ;
      P095W3_A718PrdNom = new String[] {""} ;
      P095W3_A795PrvNum = new int[1] ;
      P095W3_A856ValCod = new byte[1] ;
      P095W3_A719PrdNum = new String[] {""} ;
      P095W3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P095W3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.productosnoaplicarnormas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P095W2_A396EmprCod, P095W2_A719PrdNum, P095W2_A795PrvNum, P095W2_A856ValCod, P095W2_A718PrdNom, P095W2_A685PrdCanRes, P095W2_A704PrdExiAlm
            }
            , new Object[] {
            P095W3_A396EmprCod, P095W3_A718PrdNom, P095W3_A795PrvNum, P095W3_A856ValCod, P095W3_A719PrdNum, P095W3_A685PrdCanRes, P095W3_A704PrdExiAlm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private int AV37PrvNum ;
   private int A795PrvNum ;
   private long AV28count ;
   private java.math.BigDecimal AV14TFPrdDisponible ;
   private java.math.BigDecimal AV15TFPrdDisponible_To ;
   private java.math.BigDecimal AV48Productosnoaplicarnormas_wcds_6_tfprddisponible ;
   private java.math.BigDecimal AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV35Emprcod ;
   private String AV36Prdnum ;
   private String AV38NormaID ;
   private String A719PrdNum ;
   private String AV44Productosnoaplicarnormas_wcds_2_tfprdnum ;
   private String AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel ;
   private String AV46Productosnoaplicarnormas_wcds_4_tfprdnom ;
   private String AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel ;
   private String lV36Prdnum ;
   private String scmdbuf ;
   private String lV44Productosnoaplicarnormas_wcds_2_tfprdnum ;
   private String lV46Productosnoaplicarnormas_wcds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk95W2 ;
   private boolean brk95W4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV43Productosnoaplicarnormas_wcds_1_filterfulltext ;
   private String lV43Productosnoaplicarnormas_wcds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P095W2_A396EmprCod ;
   private String[] P095W2_A719PrdNum ;
   private int[] P095W2_A795PrvNum ;
   private byte[] P095W2_A856ValCod ;
   private String[] P095W2_A718PrdNom ;
   private java.math.BigDecimal[] P095W2_A685PrdCanRes ;
   private java.math.BigDecimal[] P095W2_A704PrdExiAlm ;
   private String[] P095W3_A396EmprCod ;
   private String[] P095W3_A718PrdNom ;
   private int[] P095W3_A795PrvNum ;
   private byte[] P095W3_A856ValCod ;
   private String[] P095W3_A719PrdNum ;
   private java.math.BigDecimal[] P095W3_A685PrdCanRes ;
   private java.math.BigDecimal[] P095W3_A704PrdExiAlm ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class productosnoaplicarnormas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Productosnoaplicarnormas_wcds_1_filterfulltext ,
                                          String AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel ,
                                          String AV44Productosnoaplicarnormas_wcds_2_tfprdnum ,
                                          String AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel ,
                                          String AV46Productosnoaplicarnormas_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV48Productosnoaplicarnormas_wcds_6_tfprddisponible ,
                                          java.math.BigDecimal AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String AV36Prdnum ,
                                          byte A856ValCod ,
                                          int A795PrvNum ,
                                          int AV37PrvNum ,
                                          String AV35Emprcod ,
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
      if ( ! (GXutil.strcmp("", AV43Productosnoaplicarnormas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(( PrdExiAlm - PrdCanRes),'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV44Productosnoaplicarnormas_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV46Productosnoaplicarnormas_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48Productosnoaplicarnormas_wcds_6_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( PrdExiAlm - PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to)==0) )
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

   protected Object[] conditional_P095W3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Productosnoaplicarnormas_wcds_1_filterfulltext ,
                                          String AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel ,
                                          String AV44Productosnoaplicarnormas_wcds_2_tfprdnum ,
                                          String AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel ,
                                          String AV46Productosnoaplicarnormas_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV48Productosnoaplicarnormas_wcds_6_tfprddisponible ,
                                          java.math.BigDecimal AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String AV36Prdnum ,
                                          byte A856ValCod ,
                                          int A795PrvNum ,
                                          int AV37PrvNum ,
                                          String AV35Emprcod ,
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
      if ( ! (GXutil.strcmp("", AV43Productosnoaplicarnormas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(( PrdExiAlm - PrdCanRes),'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV44Productosnoaplicarnormas_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Productosnoaplicarnormas_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV46Productosnoaplicarnormas_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Productosnoaplicarnormas_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48Productosnoaplicarnormas_wcds_6_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( PrdExiAlm - PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49Productosnoaplicarnormas_wcds_7_tfprddisponible_to)==0) )
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
                  return conditional_P095W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
            case 1 :
                  return conditional_P095W3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

