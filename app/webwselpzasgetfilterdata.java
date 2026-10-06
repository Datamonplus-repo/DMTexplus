package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwselpzasgetfilterdata extends GXProcedure
{
   public webwselpzasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwselpzasgetfilterdata.class ), "" );
   }

   public webwselpzasgetfilterdata( int remoteHandle ,
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
      webwselpzasgetfilterdata.this.aP5 = new String[] {""};
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
      webwselpzasgetfilterdata.this.AV26DDOName = aP0;
      webwselpzasgetfilterdata.this.AV24SearchTxt = aP1;
      webwselpzasgetfilterdata.this.AV25SearchTxtTo = aP2;
      webwselpzasgetfilterdata.this.aP3 = aP3;
      webwselpzasgetfilterdata.this.aP4 = aP4;
      webwselpzasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ALBRECPIE") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRECPIEOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("WebWSelPzasGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWSelPzasGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("WebWSelPzasGridState"), null, null);
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECPIE") == 0 )
         {
            AV12TFAlbRecPie = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECPIE_SEL") == 0 )
         {
            AV13TFAlbRecPie_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECKGM") == 0 )
         {
            AV14TFAlbRecKgm = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFAlbRecKgm_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECKGMU") == 0 )
         {
            AV16TFAlbRecKgmU = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFAlbRecKgmU_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECMTR") == 0 )
         {
            AV18TFAlbRecMtr = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFAlbRecMtr_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECMTRU") == 0 )
         {
            AV20TFAlbRecMtrU = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFAlbRecMtrU_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV22TFAlbRUni_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV23TFAlbRUni_Sels.fromJSonString(AV22TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV59TFAlbRReo_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV60TFAlbRReo_Sels.fromJSonString(AV59TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV61EmprCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRECCOD") == 0 )
         {
            AV62AlbRecCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISCOD") == 0 )
         {
            AV63DisCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBRECPIEOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbRecPie = AV24SearchTxt ;
      AV13TFAlbRecPie_Sel = "" ;
      AV69Webwselpzasds_1_emprcod = AV61EmprCod ;
      AV70Webwselpzasds_2_albreccod = AV62AlbRecCod ;
      AV71Webwselpzasds_3_tfalbrecpie = AV12TFAlbRecPie ;
      AV72Webwselpzasds_4_tfalbrecpie_sel = AV13TFAlbRecPie_Sel ;
      AV73Webwselpzasds_5_tfalbreckgm = AV14TFAlbRecKgm ;
      AV74Webwselpzasds_6_tfalbreckgm_to = AV15TFAlbRecKgm_To ;
      AV75Webwselpzasds_7_tfalbreckgmu = AV16TFAlbRecKgmU ;
      AV76Webwselpzasds_8_tfalbreckgmu_to = AV17TFAlbRecKgmU_To ;
      AV77Webwselpzasds_9_tfalbrecmtr = AV18TFAlbRecMtr ;
      AV78Webwselpzasds_10_tfalbrecmtr_to = AV19TFAlbRecMtr_To ;
      AV79Webwselpzasds_11_tfalbrecmtru = AV20TFAlbRecMtrU ;
      AV80Webwselpzasds_12_tfalbrecmtru_to = AV21TFAlbRecMtrU_To ;
      AV81Webwselpzasds_13_tfalbruni_sels = AV23TFAlbRUni_Sels ;
      AV82Webwselpzasds_14_tfalbrreo_sels = AV60TFAlbRReo_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV81Webwselpzasds_13_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV82Webwselpzasds_14_tfalbrreo_sels ,
                                           AV72Webwselpzasds_4_tfalbrecpie_sel ,
                                           AV71Webwselpzasds_3_tfalbrecpie ,
                                           AV73Webwselpzasds_5_tfalbreckgm ,
                                           AV74Webwselpzasds_6_tfalbreckgm_to ,
                                           AV75Webwselpzasds_7_tfalbreckgmu ,
                                           AV76Webwselpzasds_8_tfalbreckgmu_to ,
                                           AV77Webwselpzasds_9_tfalbrecmtr ,
                                           AV78Webwselpzasds_10_tfalbrecmtr_to ,
                                           AV79Webwselpzasds_11_tfalbrecmtru ,
                                           AV80Webwselpzasds_12_tfalbrecmtru_to ,
                                           Integer.valueOf(AV81Webwselpzasds_13_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV82Webwselpzasds_14_tfalbrreo_sels.size()) ,
                                           A2159AlbRecPie ,
                                           A2155AlbRecKgm ,
                                           A2156AlbRecKgmU ,
                                           A2157AlbRecMtr ,
                                           A2158AlbRecMtrU ,
                                           A396EmprCod ,
                                           AV61EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV62AlbRecCod) ,
                                           AV69Webwselpzasds_1_emprcod ,
                                           Integer.valueOf(AV70Webwselpzasds_2_albreccod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV71Webwselpzasds_3_tfalbrecpie = GXutil.padr( GXutil.rtrim( AV71Webwselpzasds_3_tfalbrecpie), 9, "%") ;
      /* Using cursor P08EN2 */
      pr_default.execute(0, new Object[] {AV69Webwselpzasds_1_emprcod, Integer.valueOf(AV70Webwselpzasds_2_albreccod), AV61EmprCod, Integer.valueOf(AV62AlbRecCod), lV71Webwselpzasds_3_tfalbrecpie, AV72Webwselpzasds_4_tfalbrecpie_sel, AV73Webwselpzasds_5_tfalbreckgm, AV74Webwselpzasds_6_tfalbreckgm_to, AV75Webwselpzasds_7_tfalbreckgmu, AV76Webwselpzasds_8_tfalbreckgmu_to, AV77Webwselpzasds_9_tfalbrecmtr, AV78Webwselpzasds_10_tfalbrecmtr_to, AV79Webwselpzasds_11_tfalbrecmtru, AV80Webwselpzasds_12_tfalbrecmtru_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8EN2 = false ;
         A2159AlbRecPie = P08EN2_A2159AlbRecPie[0] ;
         A44AlbRecCod = P08EN2_A44AlbRecCod[0] ;
         A396EmprCod = P08EN2_A396EmprCod[0] ;
         A55AlbRReo = P08EN2_A55AlbRReo[0] ;
         A56AlbRUni = P08EN2_A56AlbRUni[0] ;
         A2158AlbRecMtrU = P08EN2_A2158AlbRecMtrU[0] ;
         A2157AlbRecMtr = P08EN2_A2157AlbRecMtr[0] ;
         A2156AlbRecKgmU = P08EN2_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = P08EN2_A2155AlbRecKgm[0] ;
         A55AlbRReo = P08EN2_A55AlbRReo[0] ;
         A56AlbRUni = P08EN2_A56AlbRUni[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08EN2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08EN2_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(P08EN2_A2159AlbRecPie[0], A2159AlbRecPie) == 0 ) )
         {
            brk8EN2 = false ;
            AV36count = (long)(AV36count+1) ;
            brk8EN2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2159AlbRecPie)==0) )
         {
            AV28Option = A2159AlbRecPie ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8EN2 )
         {
            brk8EN2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwselpzasgetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = webwselpzasgetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = webwselpzasgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFAlbRecPie = "" ;
      AV13TFAlbRecPie_Sel = "" ;
      AV14TFAlbRecKgm = DecimalUtil.ZERO ;
      AV15TFAlbRecKgm_To = DecimalUtil.ZERO ;
      AV16TFAlbRecKgmU = DecimalUtil.ZERO ;
      AV17TFAlbRecKgmU_To = DecimalUtil.ZERO ;
      AV18TFAlbRecMtr = DecimalUtil.ZERO ;
      AV19TFAlbRecMtr_To = DecimalUtil.ZERO ;
      AV20TFAlbRecMtrU = DecimalUtil.ZERO ;
      AV21TFAlbRecMtrU_To = DecimalUtil.ZERO ;
      AV22TFAlbRUni_SelsJson = "" ;
      AV23TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59TFAlbRReo_SelsJson = "" ;
      AV60TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV61EmprCod = "" ;
      A2159AlbRecPie = "" ;
      AV69Webwselpzasds_1_emprcod = "" ;
      AV71Webwselpzasds_3_tfalbrecpie = "" ;
      AV72Webwselpzasds_4_tfalbrecpie_sel = "" ;
      AV73Webwselpzasds_5_tfalbreckgm = DecimalUtil.ZERO ;
      AV74Webwselpzasds_6_tfalbreckgm_to = DecimalUtil.ZERO ;
      AV75Webwselpzasds_7_tfalbreckgmu = DecimalUtil.ZERO ;
      AV76Webwselpzasds_8_tfalbreckgmu_to = DecimalUtil.ZERO ;
      AV77Webwselpzasds_9_tfalbrecmtr = DecimalUtil.ZERO ;
      AV78Webwselpzasds_10_tfalbrecmtr_to = DecimalUtil.ZERO ;
      AV79Webwselpzasds_11_tfalbrecmtru = DecimalUtil.ZERO ;
      AV80Webwselpzasds_12_tfalbrecmtru_to = DecimalUtil.ZERO ;
      AV81Webwselpzasds_13_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV82Webwselpzasds_14_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV71Webwselpzasds_3_tfalbrecpie = "" ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08EN2_A2159AlbRecPie = new String[] {""} ;
      P08EN2_A44AlbRecCod = new int[1] ;
      P08EN2_A396EmprCod = new String[] {""} ;
      P08EN2_A55AlbRReo = new String[] {""} ;
      P08EN2_A56AlbRUni = new String[] {""} ;
      P08EN2_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08EN2_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08EN2_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08EN2_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV28Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwselpzasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08EN2_A2159AlbRecPie, P08EN2_A44AlbRecCod, P08EN2_A396EmprCod, P08EN2_A55AlbRReo, P08EN2_A56AlbRUni, P08EN2_A2158AlbRecMtrU, P08EN2_A2157AlbRecMtr, P08EN2_A2156AlbRecKgmU, P08EN2_A2155AlbRecKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV67GXV1 ;
   private int AV62AlbRecCod ;
   private int AV63DisCod ;
   private int AV70Webwselpzasds_2_albreccod ;
   private int AV81Webwselpzasds_13_tfalbruni_sels_size ;
   private int AV82Webwselpzasds_14_tfalbrreo_sels_size ;
   private int A44AlbRecCod ;
   private long AV36count ;
   private java.math.BigDecimal AV14TFAlbRecKgm ;
   private java.math.BigDecimal AV15TFAlbRecKgm_To ;
   private java.math.BigDecimal AV16TFAlbRecKgmU ;
   private java.math.BigDecimal AV17TFAlbRecKgmU_To ;
   private java.math.BigDecimal AV18TFAlbRecMtr ;
   private java.math.BigDecimal AV19TFAlbRecMtr_To ;
   private java.math.BigDecimal AV20TFAlbRecMtrU ;
   private java.math.BigDecimal AV21TFAlbRecMtrU_To ;
   private java.math.BigDecimal AV73Webwselpzasds_5_tfalbreckgm ;
   private java.math.BigDecimal AV74Webwselpzasds_6_tfalbreckgm_to ;
   private java.math.BigDecimal AV75Webwselpzasds_7_tfalbreckgmu ;
   private java.math.BigDecimal AV76Webwselpzasds_8_tfalbreckgmu_to ;
   private java.math.BigDecimal AV77Webwselpzasds_9_tfalbrecmtr ;
   private java.math.BigDecimal AV78Webwselpzasds_10_tfalbrecmtr_to ;
   private java.math.BigDecimal AV79Webwselpzasds_11_tfalbrecmtru ;
   private java.math.BigDecimal AV80Webwselpzasds_12_tfalbrecmtru_to ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private String AV12TFAlbRecPie ;
   private String AV13TFAlbRecPie_Sel ;
   private String AV61EmprCod ;
   private String A2159AlbRecPie ;
   private String AV69Webwselpzasds_1_emprcod ;
   private String AV71Webwselpzasds_3_tfalbrecpie ;
   private String AV72Webwselpzasds_4_tfalbrecpie_sel ;
   private String scmdbuf ;
   private String lV71Webwselpzasds_3_tfalbrecpie ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8EN2 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV22TFAlbRUni_SelsJson ;
   private String AV59TFAlbRReo_SelsJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV28Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08EN2_A2159AlbRecPie ;
   private int[] P08EN2_A44AlbRecCod ;
   private String[] P08EN2_A396EmprCod ;
   private String[] P08EN2_A55AlbRReo ;
   private String[] P08EN2_A56AlbRUni ;
   private java.math.BigDecimal[] P08EN2_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P08EN2_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P08EN2_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] P08EN2_A2155AlbRecKgm ;
   private GXSimpleCollection<String> AV23TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV60TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV81Webwselpzasds_13_tfalbruni_sels ;
   private GXSimpleCollection<String> AV82Webwselpzasds_14_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class webwselpzasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV81Webwselpzasds_13_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV82Webwselpzasds_14_tfalbrreo_sels ,
                                          String AV72Webwselpzasds_4_tfalbrecpie_sel ,
                                          String AV71Webwselpzasds_3_tfalbrecpie ,
                                          java.math.BigDecimal AV73Webwselpzasds_5_tfalbreckgm ,
                                          java.math.BigDecimal AV74Webwselpzasds_6_tfalbreckgm_to ,
                                          java.math.BigDecimal AV75Webwselpzasds_7_tfalbreckgmu ,
                                          java.math.BigDecimal AV76Webwselpzasds_8_tfalbreckgmu_to ,
                                          java.math.BigDecimal AV77Webwselpzasds_9_tfalbrecmtr ,
                                          java.math.BigDecimal AV78Webwselpzasds_10_tfalbrecmtr_to ,
                                          java.math.BigDecimal AV79Webwselpzasds_11_tfalbrecmtru ,
                                          java.math.BigDecimal AV80Webwselpzasds_12_tfalbrecmtru_to ,
                                          int AV81Webwselpzasds_13_tfalbruni_sels_size ,
                                          int AV82Webwselpzasds_14_tfalbrreo_sels_size ,
                                          String A2159AlbRecPie ,
                                          java.math.BigDecimal A2155AlbRecKgm ,
                                          java.math.BigDecimal A2156AlbRecKgmU ,
                                          java.math.BigDecimal A2157AlbRecMtr ,
                                          java.math.BigDecimal A2158AlbRecMtrU ,
                                          String A396EmprCod ,
                                          String AV61EmprCod ,
                                          int A44AlbRecCod ,
                                          int AV62AlbRecCod ,
                                          String AV69Webwselpzasds_1_emprcod ,
                                          int AV70Webwselpzasds_2_albreccod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecPie, T1.AlbRecCod, T1.EmprCod, T2.AlbRReo, T2.AlbRUni, T1.AlbRecMtrU, T1.AlbRecMtr, T1.AlbRecKgmU, T1.AlbRecKgm FROM (TXPALBDET T1 INNER JOIN TXPALBREC" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbRecCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV72Webwselpzasds_4_tfalbrecpie_sel)==0) && ( ! (GXutil.strcmp("", AV71Webwselpzasds_3_tfalbrecpie)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRecPie) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Webwselpzasds_4_tfalbrecpie_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecPie = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Webwselpzasds_5_tfalbreckgm)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgm >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Webwselpzasds_6_tfalbreckgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgm <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Webwselpzasds_7_tfalbreckgmu)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgmU >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Webwselpzasds_8_tfalbreckgmu_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecKgmU <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Webwselpzasds_9_tfalbrecmtr)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtr >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Webwselpzasds_10_tfalbrecmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtr <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Webwselpzasds_11_tfalbrecmtru)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtrU >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Webwselpzasds_12_tfalbrecmtru_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRecMtrU <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( AV81Webwselpzasds_13_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV81Webwselpzasds_13_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( AV82Webwselpzasds_14_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV82Webwselpzasds_14_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod, T1.AlbRecPie" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P08EN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               return;
      }
   }

}

