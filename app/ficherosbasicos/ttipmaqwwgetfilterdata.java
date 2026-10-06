package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipmaqwwgetfilterdata extends GXProcedure
{
   public ttipmaqwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipmaqwwgetfilterdata.class ), "" );
   }

   public ttipmaqwwgetfilterdata( int remoteHandle ,
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
      ttipmaqwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipmaqwwgetfilterdata.this.AV18DDOName = aP0;
      ttipmaqwwgetfilterdata.this.AV16SearchTxt = aP1;
      ttipmaqwwgetfilterdata.this.AV17SearchTxtTo = aP2;
      ttipmaqwwgetfilterdata.this.aP3 = aP3;
      ttipmaqwwgetfilterdata.this.aP4 = aP4;
      ttipmaqwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_TIPMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_TIPMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMAQDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("FicherosBasicos.TTIPMAQWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTIPMAQWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FicherosBasicos.TTIPMAQWWGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV10TFTipMaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV11TFTipMaqCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV12TFTipMaqDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV13TFTipMaqDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQC24") == 0 )
         {
            AV14TFTipMaqC24 = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFTipMaqC24_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFTipMaqCod = AV16SearchTxt ;
      AV11TFTipMaqCod_Sel = "" ;
      AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = AV10TFTipMaqCod ;
      AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel = AV11TFTipMaqCod_Sel ;
      AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = AV12TFTipMaqDsc ;
      AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel = AV13TFTipMaqDsc_Sel ;
      AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 = AV14TFTipMaqC24 ;
      AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to = AV15TFTipMaqC24_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                           AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                           AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                           AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                           AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                           AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                           AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           A12447TipMaqC24 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod), 4, "%") ;
      lV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc), 30, "%") ;
      /* Using cursor P080B2 */
      pr_default.execute(0, new Object[] {lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod, AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel, lV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc, AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel, AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24, AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk80B2 = false ;
         A1011TipMaqCod = P080B2_A1011TipMaqCod[0] ;
         A12447TipMaqC24 = P080B2_A12447TipMaqC24[0] ;
         n12447TipMaqC24 = P080B2_n12447TipMaqC24[0] ;
         A1012TipMaqDsc = P080B2_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P080B2_n1012TipMaqDsc[0] ;
         A396EmprCod = P080B2_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P080B2_A1011TipMaqCod[0], A1011TipMaqCod) == 0 ) )
         {
            brk80B2 = false ;
            A396EmprCod = P080B2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk80B2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1011TipMaqCod)==0) )
         {
            AV20Option = A1011TipMaqCod ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk80B2 )
         {
            brk80B2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTIPMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipMaqDsc = AV16SearchTxt ;
      AV13TFTipMaqDsc_Sel = "" ;
      AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = AV10TFTipMaqCod ;
      AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel = AV11TFTipMaqCod_Sel ;
      AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = AV12TFTipMaqDsc ;
      AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel = AV13TFTipMaqDsc_Sel ;
      AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 = AV14TFTipMaqC24 ;
      AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to = AV15TFTipMaqC24_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                           AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                           AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                           AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                           AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                           AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                           AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           A12447TipMaqC24 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext), "%", "") ;
      lV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod), 4, "%") ;
      lV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc), 30, "%") ;
      /* Using cursor P080B3 */
      pr_default.execute(1, new Object[] {lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext, lV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod, AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel, lV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc, AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel, AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24, AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk80B4 = false ;
         A1012TipMaqDsc = P080B3_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = P080B3_n1012TipMaqDsc[0] ;
         A12447TipMaqC24 = P080B3_A12447TipMaqC24[0] ;
         n12447TipMaqC24 = P080B3_n12447TipMaqC24[0] ;
         A1011TipMaqCod = P080B3_A1011TipMaqCod[0] ;
         A396EmprCod = P080B3_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P080B3_A1012TipMaqDsc[0], A1012TipMaqDsc) == 0 ) )
         {
            brk80B4 = false ;
            A1011TipMaqCod = P080B3_A1011TipMaqCod[0] ;
            A396EmprCod = P080B3_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk80B4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A1012TipMaqDsc)==0) )
         {
            AV20Option = A1012TipMaqDsc ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk80B4 )
         {
            brk80B4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipmaqwwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = ttipmaqwwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = ttipmaqwwgetfilterdata.this.AV27OptionIndexesJson;
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
      AV48FilterFullText = "" ;
      AV10TFTipMaqCod = "" ;
      AV11TFTipMaqCod_Sel = "" ;
      AV12TFTipMaqDsc = "" ;
      AV13TFTipMaqDsc_Sel = "" ;
      AV14TFTipMaqC24 = DecimalUtil.ZERO ;
      AV15TFTipMaqC24_To = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = "" ;
      AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = "" ;
      AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel = "" ;
      AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = "" ;
      AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel = "" ;
      AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 = DecimalUtil.ZERO ;
      AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext = "" ;
      lV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod = "" ;
      lV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc = "" ;
      A1012TipMaqDsc = "" ;
      A12447TipMaqC24 = DecimalUtil.ZERO ;
      P080B2_A1011TipMaqCod = new String[] {""} ;
      P080B2_A12447TipMaqC24 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P080B2_n12447TipMaqC24 = new boolean[] {false} ;
      P080B2_A1012TipMaqDsc = new String[] {""} ;
      P080B2_n1012TipMaqDsc = new boolean[] {false} ;
      P080B2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      P080B3_A1012TipMaqDsc = new String[] {""} ;
      P080B3_n1012TipMaqDsc = new boolean[] {false} ;
      P080B3_A12447TipMaqC24 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P080B3_n12447TipMaqC24 = new boolean[] {false} ;
      P080B3_A1011TipMaqCod = new String[] {""} ;
      P080B3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipmaqwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P080B2_A1011TipMaqCod, P080B2_A12447TipMaqC24, P080B2_n12447TipMaqC24, P080B2_A1012TipMaqDsc, P080B2_n1012TipMaqDsc, P080B2_A396EmprCod
            }
            , new Object[] {
            P080B3_A1012TipMaqDsc, P080B3_n1012TipMaqDsc, P080B3_A12447TipMaqC24, P080B3_n12447TipMaqC24, P080B3_A1011TipMaqCod, P080B3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV51GXV1 ;
   private long AV28count ;
   private java.math.BigDecimal AV14TFTipMaqC24 ;
   private java.math.BigDecimal AV15TFTipMaqC24_To ;
   private java.math.BigDecimal AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ;
   private java.math.BigDecimal AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ;
   private java.math.BigDecimal A12447TipMaqC24 ;
   private String AV10TFTipMaqCod ;
   private String AV11TFTipMaqCod_Sel ;
   private String AV12TFTipMaqDsc ;
   private String AV13TFTipMaqDsc_Sel ;
   private String A1011TipMaqCod ;
   private String AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ;
   private String AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ;
   private String AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ;
   private String AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ;
   private String scmdbuf ;
   private String lV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ;
   private String lV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ;
   private String A1012TipMaqDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk80B2 ;
   private boolean n12447TipMaqC24 ;
   private boolean n1012TipMaqDsc ;
   private boolean brk80B4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext ;
   private String lV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P080B2_A1011TipMaqCod ;
   private java.math.BigDecimal[] P080B2_A12447TipMaqC24 ;
   private boolean[] P080B2_n12447TipMaqC24 ;
   private String[] P080B2_A1012TipMaqDsc ;
   private boolean[] P080B2_n1012TipMaqDsc ;
   private String[] P080B2_A396EmprCod ;
   private String[] P080B3_A1012TipMaqDsc ;
   private boolean[] P080B3_n1012TipMaqDsc ;
   private java.math.BigDecimal[] P080B3_A12447TipMaqC24 ;
   private boolean[] P080B3_n12447TipMaqC24 ;
   private String[] P080B3_A1011TipMaqCod ;
   private String[] P080B3_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class ttipmaqwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                          String AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                          String AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                          String AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                          String AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                          java.math.BigDecimal AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                          java.math.BigDecimal AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          java.math.BigDecimal A12447TipMaqC24 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipMaqCod, TipMaqC24, TipMaqDsc, EmprCod FROM TXPTIPMAQ" ;
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipMaqCod) like '%' || UPPER(?)) or ( UPPER(TipMaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TipMaqC24,'9999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqCod = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipMaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P080B3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext ,
                                          String AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel ,
                                          String AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod ,
                                          String AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel ,
                                          String AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc ,
                                          java.math.BigDecimal AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24 ,
                                          java.math.BigDecimal AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          java.math.BigDecimal A12447TipMaqC24 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT TipMaqDsc, TipMaqC24, TipMaqCod, EmprCod FROM TXPTIPMAQ" ;
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_ttipmaqwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipMaqCod) like '%' || UPPER(?)) or ( UPPER(TipMaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TipMaqC24,'9999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Ficherosbasicos_ttipmaqwwds_2_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_ttipmaqwwds_3_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqCod = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Ficherosbasicos_ttipmaqwwds_4_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Ficherosbasicos_ttipmaqwwds_5_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMaqDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Ficherosbasicos_ttipmaqwwds_6_tftipmaqc24)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Ficherosbasicos_ttipmaqwwds_7_tftipmaqc24_to)==0) )
      {
         addWhere(sWhereString, "(TipMaqC24 <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipMaqDsc" ;
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
                  return conditional_P080B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] );
            case 1 :
                  return conditional_P080B3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P080B3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 4);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               return;
      }
   }

}

