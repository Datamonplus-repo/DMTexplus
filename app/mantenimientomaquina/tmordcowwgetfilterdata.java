package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmordcowwgetfilterdata extends GXProcedure
{
   public tmordcowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordcowwgetfilterdata.class ), "" );
   }

   public tmordcowwgetfilterdata( int remoteHandle ,
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
      tmordcowwgetfilterdata.this.aP5 = new String[] {""};
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
      tmordcowwgetfilterdata.this.AV28DDOName = aP0;
      tmordcowwgetfilterdata.this.AV26SearchTxt = aP1;
      tmordcowwgetfilterdata.this.AV27SearchTxtTo = aP2;
      tmordcowwgetfilterdata.this.aP3 = aP3;
      tmordcowwgetfilterdata.this.aP4 = aP4;
      tmordcowwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_OMOPENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADOMOPENOMOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV39Session.getValue("MantenimientoMaquina.TMOrdCoWWGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMOrdCoWWGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("MantenimientoMaquina.TMOrdCoWWGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV14TFOMCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFOMCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPECOD") == 0 )
         {
            AV16TFOMOpeCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFOMOpeCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPENOM") == 0 )
         {
            AV18TFOMOpeNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMOPENOM_SEL") == 0 )
         {
            AV19TFOMOpeNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMTPO_SEL") == 0 )
         {
            AV20TFOMMTpo_SelsJson = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV21TFOMMTpo_Sels.fromJSonString(AV20TFOMMTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCCNT") == 0 )
         {
            AV22TFOMMCCnt = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFOMMCCnt_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCULT") == 0 )
         {
            AV24TFOMMCUlt = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFOMMCUlt_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADOMOPENOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFOMOpeNom = AV26SearchTxt ;
      AV19TFOMOpeNom_Sel = "" ;
      AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext = AV44FilterFullText ;
      AV50Mantenimientomaquina_tmordcowwds_2_tfomcod = AV14TFOMCod ;
      AV51Mantenimientomaquina_tmordcowwds_3_tfomcod_to = AV15TFOMCod_To ;
      AV52Mantenimientomaquina_tmordcowwds_4_tfomopecod = AV16TFOMOpeCod ;
      AV53Mantenimientomaquina_tmordcowwds_5_tfomopecod_to = AV17TFOMOpeCod_To ;
      AV54Mantenimientomaquina_tmordcowwds_6_tfomopenom = AV18TFOMOpeNom ;
      AV55Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel = AV19TFOMOpeNom_Sel ;
      AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels = AV21TFOMMTpo_Sels ;
      AV57Mantenimientomaquina_tmordcowwds_9_tfommccnt = AV22TFOMMCCnt ;
      AV58Mantenimientomaquina_tmordcowwds_10_tfommccnt_to = AV23TFOMMCCnt_To ;
      AV59Mantenimientomaquina_tmordcowwds_11_tfommcult = AV24TFOMMCUlt ;
      AV60Mantenimientomaquina_tmordcowwds_12_tfommcult_to = AV25TFOMMCUlt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9458OMMTpo ,
                                           AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels ,
                                           Integer.valueOf(AV50Mantenimientomaquina_tmordcowwds_2_tfomcod) ,
                                           Integer.valueOf(AV51Mantenimientomaquina_tmordcowwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV52Mantenimientomaquina_tmordcowwds_4_tfomopecod) ,
                                           Integer.valueOf(AV53Mantenimientomaquina_tmordcowwds_5_tfomopecod_to) ,
                                           AV55Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel ,
                                           AV54Mantenimientomaquina_tmordcowwds_6_tfomopenom ,
                                           Integer.valueOf(AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels.size()) ,
                                           AV57Mantenimientomaquina_tmordcowwds_9_tfommccnt ,
                                           AV58Mantenimientomaquina_tmordcowwds_10_tfommccnt_to ,
                                           Short.valueOf(AV59Mantenimientomaquina_tmordcowwds_11_tfommcult) ,
                                           Short.valueOf(AV60Mantenimientomaquina_tmordcowwds_12_tfommcult_to) ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9455OMOpeCod) ,
                                           A9456OMOpeNom ,
                                           A9461OMMCCnt ,
                                           Short.valueOf(A9465OMMCUlt) ,
                                           AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV54Mantenimientomaquina_tmordcowwds_6_tfomopenom = GXutil.padr( GXutil.rtrim( AV54Mantenimientomaquina_tmordcowwds_6_tfomopenom), 30, "%") ;
      /* Using cursor P08XO2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV50Mantenimientomaquina_tmordcowwds_2_tfomcod), Integer.valueOf(AV51Mantenimientomaquina_tmordcowwds_3_tfomcod_to), Integer.valueOf(AV52Mantenimientomaquina_tmordcowwds_4_tfomopecod), Integer.valueOf(AV53Mantenimientomaquina_tmordcowwds_5_tfomopecod_to), lV54Mantenimientomaquina_tmordcowwds_6_tfomopenom, AV55Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel, AV57Mantenimientomaquina_tmordcowwds_9_tfommccnt, AV58Mantenimientomaquina_tmordcowwds_10_tfommccnt_to, Short.valueOf(AV59Mantenimientomaquina_tmordcowwds_11_tfommcult), Short.valueOf(AV60Mantenimientomaquina_tmordcowwds_12_tfommcult_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8XO2 = false ;
         A9455OMOpeCod = P08XO2_A9455OMOpeCod[0] ;
         A396EmprCod = P08XO2_A396EmprCod[0] ;
         A9465OMMCUlt = P08XO2_A9465OMMCUlt[0] ;
         n9465OMMCUlt = P08XO2_n9465OMMCUlt[0] ;
         A9461OMMCCnt = P08XO2_A9461OMMCCnt[0] ;
         A9456OMOpeNom = P08XO2_A9456OMOpeNom[0] ;
         n9456OMOpeNom = P08XO2_n9456OMOpeNom[0] ;
         A9425OMCod = P08XO2_A9425OMCod[0] ;
         A9458OMMTpo = P08XO2_A9458OMMTpo[0] ;
         A9456OMOpeNom = P08XO2_A9456OMOpeNom[0] ;
         n9456OMOpeNom = P08XO2_n9456OMOpeNom[0] ;
         if ( (GXutil.strcmp("", AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9455OMOpeCod, 6, 0) , GXutil.padr( "%" + AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9456OMOpeNom) , GXutil.padr( "%" + GXutil.upper( AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "reserva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "consumo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9458OMMTpo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A9461OMMCCnt, 12, 3) , GXutil.padr( "%" + AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9465OMMCUlt, 4, 0) , GXutil.padr( "%" + AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV38count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08XO2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08XO2_A9455OMOpeCod[0] == A9455OMOpeCod ) )
            {
               brk8XO2 = false ;
               A9425OMCod = P08XO2_A9425OMCod[0] ;
               A9458OMMTpo = P08XO2_A9458OMMTpo[0] ;
               AV38count = (long)(AV38count+1) ;
               brk8XO2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A9456OMOpeNom)==0) )
            {
               AV30Option = A9456OMOpeNom ;
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
         if ( ! brk8XO2 )
         {
            brk8XO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmordcowwgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = tmordcowwgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = tmordcowwgetfilterdata.this.AV37OptionIndexesJson;
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
      AV18TFOMOpeNom = "" ;
      AV19TFOMOpeNom_Sel = "" ;
      AV20TFOMMTpo_SelsJson = "" ;
      AV21TFOMMTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22TFOMMCCnt = DecimalUtil.ZERO ;
      AV23TFOMMCCnt_To = DecimalUtil.ZERO ;
      A9456OMOpeNom = "" ;
      AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext = "" ;
      AV54Mantenimientomaquina_tmordcowwds_6_tfomopenom = "" ;
      AV55Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel = "" ;
      AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV57Mantenimientomaquina_tmordcowwds_9_tfommccnt = DecimalUtil.ZERO ;
      AV58Mantenimientomaquina_tmordcowwds_10_tfommccnt_to = DecimalUtil.ZERO ;
      lV49Mantenimientomaquina_tmordcowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV54Mantenimientomaquina_tmordcowwds_6_tfomopenom = "" ;
      A9458OMMTpo = "" ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      P08XO2_A9455OMOpeCod = new int[1] ;
      P08XO2_A396EmprCod = new String[] {""} ;
      P08XO2_A9465OMMCUlt = new short[1] ;
      P08XO2_n9465OMMCUlt = new boolean[] {false} ;
      P08XO2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XO2_A9456OMOpeNom = new String[] {""} ;
      P08XO2_n9456OMOpeNom = new boolean[] {false} ;
      P08XO2_A9425OMCod = new int[1] ;
      P08XO2_A9458OMMTpo = new String[] {""} ;
      A396EmprCod = "" ;
      AV30Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordcowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08XO2_A9455OMOpeCod, P08XO2_A396EmprCod, P08XO2_A9465OMMCUlt, P08XO2_n9465OMMCUlt, P08XO2_A9461OMMCCnt, P08XO2_A9456OMOpeNom, P08XO2_n9456OMOpeNom, P08XO2_A9425OMCod, P08XO2_A9458OMMTpo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV24TFOMMCUlt ;
   private short AV25TFOMMCUlt_To ;
   private short AV59Mantenimientomaquina_tmordcowwds_11_tfommcult ;
   private short AV60Mantenimientomaquina_tmordcowwds_12_tfommcult_to ;
   private short A9465OMMCUlt ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV14TFOMCod ;
   private int AV15TFOMCod_To ;
   private int AV16TFOMOpeCod ;
   private int AV17TFOMOpeCod_To ;
   private int AV50Mantenimientomaquina_tmordcowwds_2_tfomcod ;
   private int AV51Mantenimientomaquina_tmordcowwds_3_tfomcod_to ;
   private int AV52Mantenimientomaquina_tmordcowwds_4_tfomopecod ;
   private int AV53Mantenimientomaquina_tmordcowwds_5_tfomopecod_to ;
   private int AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels_size ;
   private int A9425OMCod ;
   private int A9455OMOpeCod ;
   private int AV29InsertIndex ;
   private long AV38count ;
   private java.math.BigDecimal AV22TFOMMCCnt ;
   private java.math.BigDecimal AV23TFOMMCCnt_To ;
   private java.math.BigDecimal AV57Mantenimientomaquina_tmordcowwds_9_tfommccnt ;
   private java.math.BigDecimal AV58Mantenimientomaquina_tmordcowwds_10_tfommccnt_to ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private String AV18TFOMOpeNom ;
   private String AV19TFOMOpeNom_Sel ;
   private String A9456OMOpeNom ;
   private String AV54Mantenimientomaquina_tmordcowwds_6_tfomopenom ;
   private String AV55Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel ;
   private String scmdbuf ;
   private String lV54Mantenimientomaquina_tmordcowwds_6_tfomopenom ;
   private String A9458OMMTpo ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8XO2 ;
   private boolean n9465OMMCUlt ;
   private boolean n9456OMOpeNom ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV20TFOMMTpo_SelsJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext ;
   private String lV49Mantenimientomaquina_tmordcowwds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08XO2_A9455OMOpeCod ;
   private String[] P08XO2_A396EmprCod ;
   private short[] P08XO2_A9465OMMCUlt ;
   private boolean[] P08XO2_n9465OMMCUlt ;
   private java.math.BigDecimal[] P08XO2_A9461OMMCCnt ;
   private String[] P08XO2_A9456OMOpeNom ;
   private boolean[] P08XO2_n9456OMOpeNom ;
   private int[] P08XO2_A9425OMCod ;
   private String[] P08XO2_A9458OMMTpo ;
   private GXSimpleCollection<String> AV21TFOMMTpo_Sels ;
   private GXSimpleCollection<String> AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class tmordcowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08XO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9458OMMTpo ,
                                          GXSimpleCollection<String> AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels ,
                                          int AV50Mantenimientomaquina_tmordcowwds_2_tfomcod ,
                                          int AV51Mantenimientomaquina_tmordcowwds_3_tfomcod_to ,
                                          int AV52Mantenimientomaquina_tmordcowwds_4_tfomopecod ,
                                          int AV53Mantenimientomaquina_tmordcowwds_5_tfomopecod_to ,
                                          String AV55Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel ,
                                          String AV54Mantenimientomaquina_tmordcowwds_6_tfomopenom ,
                                          int AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels_size ,
                                          java.math.BigDecimal AV57Mantenimientomaquina_tmordcowwds_9_tfommccnt ,
                                          java.math.BigDecimal AV58Mantenimientomaquina_tmordcowwds_10_tfommccnt_to ,
                                          short AV59Mantenimientomaquina_tmordcowwds_11_tfommcult ,
                                          short AV60Mantenimientomaquina_tmordcowwds_12_tfommcult_to ,
                                          int A9425OMCod ,
                                          int A9455OMOpeCod ,
                                          String A9456OMOpeNom ,
                                          java.math.BigDecimal A9461OMMCCnt ,
                                          short A9465OMMCUlt ,
                                          String AV49Mantenimientomaquina_tmordcowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.OMOpeCod AS OMOpeCod, T1.EmprCod, T1.OMMCUlt, T1.OMMCCnt, T2.OpeNom AS OMOpeNom, T1.OMCod, T1.OMMTpo FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod)" ;
      if ( ! (0==AV50Mantenimientomaquina_tmordcowwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV51Mantenimientomaquina_tmordcowwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV52Mantenimientomaquina_tmordcowwds_4_tfomopecod) )
      {
         addWhere(sWhereString, "(T1.OMOpeCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Mantenimientomaquina_tmordcowwds_5_tfomopecod_to) )
      {
         addWhere(sWhereString, "(T1.OMOpeCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel)==0) && ( ! (GXutil.strcmp("", AV54Mantenimientomaquina_tmordcowwds_6_tfomopenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.OpeNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Mantenimientomaquina_tmordcowwds_7_tfomopenom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.OpeNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV56Mantenimientomaquina_tmordcowwds_8_tfommtpo_sels, "T1.OMMTpo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Mantenimientomaquina_tmordcowwds_9_tfommccnt)==0) )
      {
         addWhere(sWhereString, "(T1.OMMCCnt >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Mantenimientomaquina_tmordcowwds_10_tfommccnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.OMMCCnt <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV59Mantenimientomaquina_tmordcowwds_11_tfommcult) )
      {
         addWhere(sWhereString, "(T1.OMMCUlt >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV60Mantenimientomaquina_tmordcowwds_12_tfommcult_to) )
      {
         addWhere(sWhereString, "(T1.OMMCUlt <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.OMOpeCod" ;
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
                  return conditional_P08XO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               return;
      }
   }

}

