package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipartwwgetfilterdata extends GXProcedure
{
   public ttipartwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipartwwgetfilterdata.class ), "" );
   }

   public ttipartwwgetfilterdata( int remoteHandle ,
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
      ttipartwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipartwwgetfilterdata.this.AV22DDOName = aP0;
      ttipartwwgetfilterdata.this.AV20SearchTxt = aP1;
      ttipartwwgetfilterdata.this.AV21SearchTxtTo = aP2;
      ttipartwwgetfilterdata.this.aP3 = aP3;
      ttipartwwgetfilterdata.this.aP4 = aP4;
      ttipartwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_TIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPARTDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_TIPARTDSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPARTDSC2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("TTIPARTWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTIPARTWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("TTIPARTWWGridState"), null, null);
      }
      AV56GXV1 = 1 ;
      while ( AV56GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV56GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV49FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV10TFTipArtCod = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTipArtCod_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV12TFTipArtDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV13TFTipArtDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC2") == 0 )
         {
            AV14TFTipArtDsc2 = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC2_SEL") == 0 )
         {
            AV15TFTipArtDsc2_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTEST_SEL") == 0 )
         {
            AV53TFTipArtEst_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV56GXV1 = (int)(AV56GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipArtDsc = AV20SearchTxt ;
      AV13TFTipArtDsc_Sel = "" ;
      AV58Ttipartwwds_1_filterfulltext = AV49FilterFullText ;
      AV59Ttipartwwds_2_tftipartcod = AV10TFTipArtCod ;
      AV60Ttipartwwds_3_tftipartcod_to = AV11TFTipArtCod_To ;
      AV61Ttipartwwds_4_tftipartdsc = AV12TFTipArtDsc ;
      AV62Ttipartwwds_5_tftipartdsc_sel = AV13TFTipArtDsc_Sel ;
      AV63Ttipartwwds_6_tftipartdsc2 = AV14TFTipArtDsc2 ;
      AV64Ttipartwwds_7_tftipartdsc2_sel = AV15TFTipArtDsc2_Sel ;
      AV65Ttipartwwds_8_tftipartest_sel = AV53TFTipArtEst_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Ttipartwwds_1_filterfulltext ,
                                           Short.valueOf(AV59Ttipartwwds_2_tftipartcod) ,
                                           Short.valueOf(AV60Ttipartwwds_3_tftipartcod_to) ,
                                           AV62Ttipartwwds_5_tftipartdsc_sel ,
                                           AV61Ttipartwwds_4_tftipartdsc ,
                                           AV64Ttipartwwds_7_tftipartdsc2_sel ,
                                           AV63Ttipartwwds_6_tftipartdsc2 ,
                                           AV65Ttipartwwds_8_tftipartest_sel ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           A6014TipArtDsc2 ,
                                           A8713TipArtEst } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV58Ttipartwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ttipartwwds_1_filterfulltext), "%", "") ;
      lV58Ttipartwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ttipartwwds_1_filterfulltext), "%", "") ;
      lV58Ttipartwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ttipartwwds_1_filterfulltext), "%", "") ;
      lV61Ttipartwwds_4_tftipartdsc = GXutil.padr( GXutil.rtrim( AV61Ttipartwwds_4_tftipartdsc), 30, "%") ;
      lV63Ttipartwwds_6_tftipartdsc2 = GXutil.padr( GXutil.rtrim( AV63Ttipartwwds_6_tftipartdsc2), 80, "%") ;
      /* Using cursor P07ZZ2 */
      pr_default.execute(0, new Object[] {lV58Ttipartwwds_1_filterfulltext, lV58Ttipartwwds_1_filterfulltext, lV58Ttipartwwds_1_filterfulltext, Short.valueOf(AV59Ttipartwwds_2_tftipartcod), Short.valueOf(AV60Ttipartwwds_3_tftipartcod_to), lV61Ttipartwwds_4_tftipartdsc, AV62Ttipartwwds_5_tftipartdsc_sel, lV63Ttipartwwds_6_tftipartdsc2, AV64Ttipartwwds_7_tftipartdsc2_sel, AV65Ttipartwwds_8_tftipartest_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7ZZ2 = false ;
         A830TipArtDsc = P07ZZ2_A830TipArtDsc[0] ;
         n830TipArtDsc = P07ZZ2_n830TipArtDsc[0] ;
         A8713TipArtEst = P07ZZ2_A8713TipArtEst[0] ;
         n8713TipArtEst = P07ZZ2_n8713TipArtEst[0] ;
         A6014TipArtDsc2 = P07ZZ2_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = P07ZZ2_n6014TipArtDsc2[0] ;
         A829TipArtCod = P07ZZ2_A829TipArtCod[0] ;
         A396EmprCod = P07ZZ2_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07ZZ2_A830TipArtDsc[0], A830TipArtDsc) == 0 ) )
         {
            brk7ZZ2 = false ;
            A829TipArtCod = P07ZZ2_A829TipArtCod[0] ;
            A396EmprCod = P07ZZ2_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk7ZZ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A830TipArtDsc)==0) )
         {
            AV24Option = A830TipArtDsc ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7ZZ2 )
         {
            brk7ZZ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTIPARTDSC2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFTipArtDsc2 = AV20SearchTxt ;
      AV15TFTipArtDsc2_Sel = "" ;
      AV58Ttipartwwds_1_filterfulltext = AV49FilterFullText ;
      AV59Ttipartwwds_2_tftipartcod = AV10TFTipArtCod ;
      AV60Ttipartwwds_3_tftipartcod_to = AV11TFTipArtCod_To ;
      AV61Ttipartwwds_4_tftipartdsc = AV12TFTipArtDsc ;
      AV62Ttipartwwds_5_tftipartdsc_sel = AV13TFTipArtDsc_Sel ;
      AV63Ttipartwwds_6_tftipartdsc2 = AV14TFTipArtDsc2 ;
      AV64Ttipartwwds_7_tftipartdsc2_sel = AV15TFTipArtDsc2_Sel ;
      AV65Ttipartwwds_8_tftipartest_sel = AV53TFTipArtEst_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV58Ttipartwwds_1_filterfulltext ,
                                           Short.valueOf(AV59Ttipartwwds_2_tftipartcod) ,
                                           Short.valueOf(AV60Ttipartwwds_3_tftipartcod_to) ,
                                           AV62Ttipartwwds_5_tftipartdsc_sel ,
                                           AV61Ttipartwwds_4_tftipartdsc ,
                                           AV64Ttipartwwds_7_tftipartdsc2_sel ,
                                           AV63Ttipartwwds_6_tftipartdsc2 ,
                                           AV65Ttipartwwds_8_tftipartest_sel ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           A6014TipArtDsc2 ,
                                           A8713TipArtEst } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV58Ttipartwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ttipartwwds_1_filterfulltext), "%", "") ;
      lV58Ttipartwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ttipartwwds_1_filterfulltext), "%", "") ;
      lV58Ttipartwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Ttipartwwds_1_filterfulltext), "%", "") ;
      lV61Ttipartwwds_4_tftipartdsc = GXutil.padr( GXutil.rtrim( AV61Ttipartwwds_4_tftipartdsc), 30, "%") ;
      lV63Ttipartwwds_6_tftipartdsc2 = GXutil.padr( GXutil.rtrim( AV63Ttipartwwds_6_tftipartdsc2), 80, "%") ;
      /* Using cursor P07ZZ3 */
      pr_default.execute(1, new Object[] {lV58Ttipartwwds_1_filterfulltext, lV58Ttipartwwds_1_filterfulltext, lV58Ttipartwwds_1_filterfulltext, Short.valueOf(AV59Ttipartwwds_2_tftipartcod), Short.valueOf(AV60Ttipartwwds_3_tftipartcod_to), lV61Ttipartwwds_4_tftipartdsc, AV62Ttipartwwds_5_tftipartdsc_sel, lV63Ttipartwwds_6_tftipartdsc2, AV64Ttipartwwds_7_tftipartdsc2_sel, AV65Ttipartwwds_8_tftipartest_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk7ZZ4 = false ;
         A6014TipArtDsc2 = P07ZZ3_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = P07ZZ3_n6014TipArtDsc2[0] ;
         A8713TipArtEst = P07ZZ3_A8713TipArtEst[0] ;
         n8713TipArtEst = P07ZZ3_n8713TipArtEst[0] ;
         A830TipArtDsc = P07ZZ3_A830TipArtDsc[0] ;
         n830TipArtDsc = P07ZZ3_n830TipArtDsc[0] ;
         A829TipArtCod = P07ZZ3_A829TipArtCod[0] ;
         A396EmprCod = P07ZZ3_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07ZZ3_A6014TipArtDsc2[0], A6014TipArtDsc2) == 0 ) )
         {
            brk7ZZ4 = false ;
            A829TipArtCod = P07ZZ3_A829TipArtCod[0] ;
            A396EmprCod = P07ZZ3_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk7ZZ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A6014TipArtDsc2)==0) )
         {
            AV24Option = A6014TipArtDsc2 ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7ZZ4 )
         {
            brk7ZZ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipartwwgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = ttipartwwgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = ttipartwwgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49FilterFullText = "" ;
      AV12TFTipArtDsc = "" ;
      AV13TFTipArtDsc_Sel = "" ;
      AV14TFTipArtDsc2 = "" ;
      AV15TFTipArtDsc2_Sel = "" ;
      AV53TFTipArtEst_Sel = "" ;
      A830TipArtDsc = "" ;
      AV58Ttipartwwds_1_filterfulltext = "" ;
      AV61Ttipartwwds_4_tftipartdsc = "" ;
      AV62Ttipartwwds_5_tftipartdsc_sel = "" ;
      AV63Ttipartwwds_6_tftipartdsc2 = "" ;
      AV64Ttipartwwds_7_tftipartdsc2_sel = "" ;
      AV65Ttipartwwds_8_tftipartest_sel = "" ;
      scmdbuf = "" ;
      lV58Ttipartwwds_1_filterfulltext = "" ;
      lV61Ttipartwwds_4_tftipartdsc = "" ;
      lV63Ttipartwwds_6_tftipartdsc2 = "" ;
      A6014TipArtDsc2 = "" ;
      A8713TipArtEst = "" ;
      P07ZZ2_A830TipArtDsc = new String[] {""} ;
      P07ZZ2_n830TipArtDsc = new boolean[] {false} ;
      P07ZZ2_A8713TipArtEst = new String[] {""} ;
      P07ZZ2_n8713TipArtEst = new boolean[] {false} ;
      P07ZZ2_A6014TipArtDsc2 = new String[] {""} ;
      P07ZZ2_n6014TipArtDsc2 = new boolean[] {false} ;
      P07ZZ2_A829TipArtCod = new short[1] ;
      P07ZZ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV24Option = "" ;
      P07ZZ3_A6014TipArtDsc2 = new String[] {""} ;
      P07ZZ3_n6014TipArtDsc2 = new boolean[] {false} ;
      P07ZZ3_A8713TipArtEst = new String[] {""} ;
      P07ZZ3_n8713TipArtEst = new boolean[] {false} ;
      P07ZZ3_A830TipArtDsc = new String[] {""} ;
      P07ZZ3_n830TipArtDsc = new boolean[] {false} ;
      P07ZZ3_A829TipArtCod = new short[1] ;
      P07ZZ3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttipartwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07ZZ2_A830TipArtDsc, P07ZZ2_n830TipArtDsc, P07ZZ2_A8713TipArtEst, P07ZZ2_n8713TipArtEst, P07ZZ2_A6014TipArtDsc2, P07ZZ2_n6014TipArtDsc2, P07ZZ2_A829TipArtCod, P07ZZ2_A396EmprCod
            }
            , new Object[] {
            P07ZZ3_A6014TipArtDsc2, P07ZZ3_n6014TipArtDsc2, P07ZZ3_A8713TipArtEst, P07ZZ3_n8713TipArtEst, P07ZZ3_A830TipArtDsc, P07ZZ3_n830TipArtDsc, P07ZZ3_A829TipArtCod, P07ZZ3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFTipArtCod ;
   private short AV11TFTipArtCod_To ;
   private short AV59Ttipartwwds_2_tftipartcod ;
   private short AV60Ttipartwwds_3_tftipartcod_to ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV56GXV1 ;
   private long AV32count ;
   private String AV12TFTipArtDsc ;
   private String AV13TFTipArtDsc_Sel ;
   private String AV14TFTipArtDsc2 ;
   private String AV15TFTipArtDsc2_Sel ;
   private String AV53TFTipArtEst_Sel ;
   private String A830TipArtDsc ;
   private String AV61Ttipartwwds_4_tftipartdsc ;
   private String AV62Ttipartwwds_5_tftipartdsc_sel ;
   private String AV63Ttipartwwds_6_tftipartdsc2 ;
   private String AV64Ttipartwwds_7_tftipartdsc2_sel ;
   private String AV65Ttipartwwds_8_tftipartest_sel ;
   private String scmdbuf ;
   private String lV61Ttipartwwds_4_tftipartdsc ;
   private String lV63Ttipartwwds_6_tftipartdsc2 ;
   private String A6014TipArtDsc2 ;
   private String A8713TipArtEst ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk7ZZ2 ;
   private boolean n830TipArtDsc ;
   private boolean n8713TipArtEst ;
   private boolean n6014TipArtDsc2 ;
   private boolean brk7ZZ4 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV49FilterFullText ;
   private String AV58Ttipartwwds_1_filterfulltext ;
   private String lV58Ttipartwwds_1_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07ZZ2_A830TipArtDsc ;
   private boolean[] P07ZZ2_n830TipArtDsc ;
   private String[] P07ZZ2_A8713TipArtEst ;
   private boolean[] P07ZZ2_n8713TipArtEst ;
   private String[] P07ZZ2_A6014TipArtDsc2 ;
   private boolean[] P07ZZ2_n6014TipArtDsc2 ;
   private short[] P07ZZ2_A829TipArtCod ;
   private String[] P07ZZ2_A396EmprCod ;
   private String[] P07ZZ3_A6014TipArtDsc2 ;
   private boolean[] P07ZZ3_n6014TipArtDsc2 ;
   private String[] P07ZZ3_A8713TipArtEst ;
   private boolean[] P07ZZ3_n8713TipArtEst ;
   private String[] P07ZZ3_A830TipArtDsc ;
   private boolean[] P07ZZ3_n830TipArtDsc ;
   private short[] P07ZZ3_A829TipArtCod ;
   private String[] P07ZZ3_A396EmprCod ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class ttipartwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07ZZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Ttipartwwds_1_filterfulltext ,
                                          short AV59Ttipartwwds_2_tftipartcod ,
                                          short AV60Ttipartwwds_3_tftipartcod_to ,
                                          String AV62Ttipartwwds_5_tftipartdsc_sel ,
                                          String AV61Ttipartwwds_4_tftipartdsc ,
                                          String AV64Ttipartwwds_7_tftipartdsc2_sel ,
                                          String AV63Ttipartwwds_6_tftipartdsc2 ,
                                          String AV65Ttipartwwds_8_tftipartest_sel ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          String A6014TipArtDsc2 ,
                                          String A8713TipArtEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipArtDsc, TipArtEst, TipArtDsc2, TipArtCod, EmprCod FROM TXPTIPART" ;
      if ( ! (GXutil.strcmp("", AV58Ttipartwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(TipArtDsc) like '%' || UPPER(?)) or ( UPPER(TipArtDsc2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV59Ttipartwwds_2_tftipartcod) )
      {
         addWhere(sWhereString, "(TipArtCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV60Ttipartwwds_3_tftipartcod_to) )
      {
         addWhere(sWhereString, "(TipArtCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ttipartwwds_5_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Ttipartwwds_4_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ttipartwwds_5_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipArtDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Ttipartwwds_7_tftipartdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV63Ttipartwwds_6_tftipartdsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipArtDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Ttipartwwds_7_tftipartdsc2_sel)==0) )
      {
         addWhere(sWhereString, "(TipArtDsc2 = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ttipartwwds_8_tftipartest_sel)==0) )
      {
         addWhere(sWhereString, "(TipArtEst = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipArtDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P07ZZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Ttipartwwds_1_filterfulltext ,
                                          short AV59Ttipartwwds_2_tftipartcod ,
                                          short AV60Ttipartwwds_3_tftipartcod_to ,
                                          String AV62Ttipartwwds_5_tftipartdsc_sel ,
                                          String AV61Ttipartwwds_4_tftipartdsc ,
                                          String AV64Ttipartwwds_7_tftipartdsc2_sel ,
                                          String AV63Ttipartwwds_6_tftipartdsc2 ,
                                          String AV65Ttipartwwds_8_tftipartest_sel ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          String A6014TipArtDsc2 ,
                                          String A8713TipArtEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT TipArtDsc2, TipArtEst, TipArtDsc, TipArtCod, EmprCod FROM TXPTIPART" ;
      if ( ! (GXutil.strcmp("", AV58Ttipartwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TipArtCod,'9990'), 2) like '%' || ?) or ( UPPER(TipArtDsc) like '%' || UPPER(?)) or ( UPPER(TipArtDsc2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV59Ttipartwwds_2_tftipartcod) )
      {
         addWhere(sWhereString, "(TipArtCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV60Ttipartwwds_3_tftipartcod_to) )
      {
         addWhere(sWhereString, "(TipArtCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ttipartwwds_5_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Ttipartwwds_4_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ttipartwwds_5_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipArtDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Ttipartwwds_7_tftipartdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV63Ttipartwwds_6_tftipartdsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipArtDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Ttipartwwds_7_tftipartdsc2_sel)==0) )
      {
         addWhere(sWhereString, "(TipArtDsc2 = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Ttipartwwds_8_tftipartest_sel)==0) )
      {
         addWhere(sWhereString, "(TipArtEst = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipArtDsc2" ;
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
                  return conditional_P07ZZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 1 :
                  return conditional_P07ZZ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07ZZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07ZZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 80);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 80);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 80);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 80);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 80);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               return;
      }
   }

}

