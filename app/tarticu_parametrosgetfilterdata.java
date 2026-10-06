package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tarticu_parametrosgetfilterdata extends GXProcedure
{
   public tarticu_parametrosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticu_parametrosgetfilterdata.class ), "" );
   }

   public tarticu_parametrosgetfilterdata( int remoteHandle ,
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
      tarticu_parametrosgetfilterdata.this.aP5 = new String[] {""};
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
      tarticu_parametrosgetfilterdata.this.AV18DDOName = aP0;
      tarticu_parametrosgetfilterdata.this.AV16SearchTxt = aP1;
      tarticu_parametrosgetfilterdata.this.AV17SearchTxtTo = aP2;
      tarticu_parametrosgetfilterdata.this.aP3 = aP3;
      tarticu_parametrosgetfilterdata.this.aP4 = aP4;
      tarticu_parametrosgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("Tarticu_ParametrosGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Tarticu_ParametrosGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("Tarticu_ParametrosGridState"), null, null);
      }
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMLIN") == 0 )
         {
            AV10TFProNumLin = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFProNumLin_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV35Clicod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV36CliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ARTCOD") == 0 )
         {
            AV37Artcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCOD") == 0 )
         {
            AV38Procod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRODSC") == 0 )
         {
            AV39Prodsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV16SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV77Tarticu_parametrosds_1_tfpronumlin = AV10TFProNumLin ;
      AV78Tarticu_parametrosds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV79Tarticu_parametrosds_3_tffascod = AV12TFFasCod ;
      AV80Tarticu_parametrosds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV81Tarticu_parametrosds_5_tffasdsc = AV14TFFasDsc ;
      AV82Tarticu_parametrosds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV77Tarticu_parametrosds_1_tfpronumlin) ,
                                           Short.valueOf(AV78Tarticu_parametrosds_2_tfpronumlin_to) ,
                                           AV80Tarticu_parametrosds_4_tffascod_sel ,
                                           AV79Tarticu_parametrosds_3_tffascod ,
                                           AV82Tarticu_parametrosds_6_tffasdsc_sel ,
                                           AV81Tarticu_parametrosds_5_tffasdsc ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A758ProCod ,
                                           AV38Procod ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Tarticu_parametrosds_3_tffascod = GXutil.padr( GXutil.rtrim( AV79Tarticu_parametrosds_3_tffascod), 8, "%") ;
      lV81Tarticu_parametrosds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tarticu_parametrosds_5_tffasdsc), 28, "%") ;
      /* Using cursor P0A9K2 */
      pr_default.execute(0, new Object[] {AV34Emprcod, AV38Procod, Short.valueOf(AV77Tarticu_parametrosds_1_tfpronumlin), Short.valueOf(AV78Tarticu_parametrosds_2_tfpronumlin_to), lV79Tarticu_parametrosds_3_tffascod, AV80Tarticu_parametrosds_4_tffascod_sel, lV81Tarticu_parametrosds_5_tffasdsc, AV82Tarticu_parametrosds_6_tffasdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA9K2 = false ;
         A396EmprCod = P0A9K2_A396EmprCod[0] ;
         A457FasCod = P0A9K2_A457FasCod[0] ;
         A758ProCod = P0A9K2_A758ProCod[0] ;
         A460FasDsc = P0A9K2_A460FasDsc[0] ;
         A774ProNumLin = P0A9K2_A774ProNumLin[0] ;
         A460FasDsc = P0A9K2_A460FasDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A9K2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A9K2_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkA9K2 = false ;
            A758ProCod = P0A9K2_A758ProCod[0] ;
            A774ProNumLin = P0A9K2_A774ProNumLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brkA9K2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV20Option = A457FasCod ;
            AV23OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV21Options.add(AV20Option, 0);
            AV24OptionsDesc.add(AV23OptionDesc, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9K2 )
         {
            brkA9K2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV16SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      AV77Tarticu_parametrosds_1_tfpronumlin = AV10TFProNumLin ;
      AV78Tarticu_parametrosds_2_tfpronumlin_to = AV11TFProNumLin_To ;
      AV79Tarticu_parametrosds_3_tffascod = AV12TFFasCod ;
      AV80Tarticu_parametrosds_4_tffascod_sel = AV13TFFasCod_Sel ;
      AV81Tarticu_parametrosds_5_tffasdsc = AV14TFFasDsc ;
      AV82Tarticu_parametrosds_6_tffasdsc_sel = AV15TFFasDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV77Tarticu_parametrosds_1_tfpronumlin) ,
                                           Short.valueOf(AV78Tarticu_parametrosds_2_tfpronumlin_to) ,
                                           AV80Tarticu_parametrosds_4_tffascod_sel ,
                                           AV79Tarticu_parametrosds_3_tffascod ,
                                           AV82Tarticu_parametrosds_6_tffasdsc_sel ,
                                           AV81Tarticu_parametrosds_5_tffasdsc ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A758ProCod ,
                                           AV38Procod ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Tarticu_parametrosds_3_tffascod = GXutil.padr( GXutil.rtrim( AV79Tarticu_parametrosds_3_tffascod), 8, "%") ;
      lV81Tarticu_parametrosds_5_tffasdsc = GXutil.padr( GXutil.rtrim( AV81Tarticu_parametrosds_5_tffasdsc), 28, "%") ;
      /* Using cursor P0A9K3 */
      pr_default.execute(1, new Object[] {AV34Emprcod, AV38Procod, Short.valueOf(AV77Tarticu_parametrosds_1_tfpronumlin), Short.valueOf(AV78Tarticu_parametrosds_2_tfpronumlin_to), lV79Tarticu_parametrosds_3_tffascod, AV80Tarticu_parametrosds_4_tffascod_sel, lV81Tarticu_parametrosds_5_tffasdsc, AV82Tarticu_parametrosds_6_tffasdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA9K4 = false ;
         A457FasCod = P0A9K3_A457FasCod[0] ;
         A396EmprCod = P0A9K3_A396EmprCod[0] ;
         A758ProCod = P0A9K3_A758ProCod[0] ;
         A460FasDsc = P0A9K3_A460FasDsc[0] ;
         A774ProNumLin = P0A9K3_A774ProNumLin[0] ;
         A460FasDsc = P0A9K3_A460FasDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A9K3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A9K3_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkA9K4 = false ;
            A758ProCod = P0A9K3_A758ProCod[0] ;
            A774ProNumLin = P0A9K3_A774ProNumLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brkA9K4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV20Option = A460FasDsc ;
            AV19InsertIndex = 1 ;
            while ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) < 0 ) )
            {
               AV19InsertIndex = (int)(AV19InsertIndex+1) ;
            }
            AV21Options.add(AV20Option, AV19InsertIndex);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV19InsertIndex);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA9K4 )
         {
            brkA9K4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tarticu_parametrosgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = tarticu_parametrosgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = tarticu_parametrosgetfilterdata.this.AV27OptionIndexesJson;
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
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV34Emprcod = "" ;
      AV36CliNom = "" ;
      AV37Artcod = "" ;
      AV38Procod = "" ;
      AV39Prodsc = "" ;
      A457FasCod = "" ;
      AV79Tarticu_parametrosds_3_tffascod = "" ;
      AV80Tarticu_parametrosds_4_tffascod_sel = "" ;
      AV81Tarticu_parametrosds_5_tffasdsc = "" ;
      AV82Tarticu_parametrosds_6_tffasdsc_sel = "" ;
      scmdbuf = "" ;
      lV79Tarticu_parametrosds_3_tffascod = "" ;
      lV81Tarticu_parametrosds_5_tffasdsc = "" ;
      A460FasDsc = "" ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      P0A9K2_A396EmprCod = new String[] {""} ;
      P0A9K2_A457FasCod = new String[] {""} ;
      P0A9K2_A758ProCod = new String[] {""} ;
      P0A9K2_A460FasDsc = new String[] {""} ;
      P0A9K2_A774ProNumLin = new short[1] ;
      AV20Option = "" ;
      AV23OptionDesc = "" ;
      P0A9K3_A457FasCod = new String[] {""} ;
      P0A9K3_A396EmprCod = new String[] {""} ;
      P0A9K3_A758ProCod = new String[] {""} ;
      P0A9K3_A460FasDsc = new String[] {""} ;
      P0A9K3_A774ProNumLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_parametrosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A9K2_A396EmprCod, P0A9K2_A457FasCod, P0A9K2_A758ProCod, P0A9K2_A460FasDsc, P0A9K2_A774ProNumLin
            }
            , new Object[] {
            P0A9K3_A457FasCod, P0A9K3_A396EmprCod, P0A9K3_A758ProCod, P0A9K3_A460FasDsc, P0A9K3_A774ProNumLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFProNumLin ;
   private short AV11TFProNumLin_To ;
   private short AV77Tarticu_parametrosds_1_tfpronumlin ;
   private short AV78Tarticu_parametrosds_2_tfpronumlin_to ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private int AV75GXV1 ;
   private int AV35Clicod ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV34Emprcod ;
   private String AV36CliNom ;
   private String AV37Artcod ;
   private String AV38Procod ;
   private String AV39Prodsc ;
   private String A457FasCod ;
   private String AV79Tarticu_parametrosds_3_tffascod ;
   private String AV80Tarticu_parametrosds_4_tffascod_sel ;
   private String AV81Tarticu_parametrosds_5_tffasdsc ;
   private String AV82Tarticu_parametrosds_6_tffasdsc_sel ;
   private String scmdbuf ;
   private String lV79Tarticu_parametrosds_3_tffascod ;
   private String lV81Tarticu_parametrosds_5_tffasdsc ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA9K2 ;
   private boolean brkA9K4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV20Option ;
   private String AV23OptionDesc ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A9K2_A396EmprCod ;
   private String[] P0A9K2_A457FasCod ;
   private String[] P0A9K2_A758ProCod ;
   private String[] P0A9K2_A460FasDsc ;
   private short[] P0A9K2_A774ProNumLin ;
   private String[] P0A9K3_A457FasCod ;
   private String[] P0A9K3_A396EmprCod ;
   private String[] P0A9K3_A758ProCod ;
   private String[] P0A9K3_A460FasDsc ;
   private short[] P0A9K3_A774ProNumLin ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class tarticu_parametrosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV77Tarticu_parametrosds_1_tfpronumlin ,
                                          short AV78Tarticu_parametrosds_2_tfpronumlin_to ,
                                          String AV80Tarticu_parametrosds_4_tffascod_sel ,
                                          String AV79Tarticu_parametrosds_3_tffascod ,
                                          String AV82Tarticu_parametrosds_6_tffasdsc_sel ,
                                          String AV81Tarticu_parametrosds_5_tffasdsc ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A758ProCod ,
                                          String AV38Procod ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.ProCod, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV77Tarticu_parametrosds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV78Tarticu_parametrosds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tarticu_parametrosds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tarticu_parametrosds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tarticu_parametrosds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tarticu_parametrosds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tarticu_parametrosds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tarticu_parametrosds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A9K3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV77Tarticu_parametrosds_1_tfpronumlin ,
                                          short AV78Tarticu_parametrosds_2_tfpronumlin_to ,
                                          String AV80Tarticu_parametrosds_4_tffascod_sel ,
                                          String AV79Tarticu_parametrosds_3_tffascod ,
                                          String AV82Tarticu_parametrosds_6_tffasdsc_sel ,
                                          String AV81Tarticu_parametrosds_5_tffasdsc ,
                                          short A774ProNumLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A758ProCod ,
                                          String AV38Procod ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[8];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.FasCod, T1.EmprCod, T1.ProCod, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (0==AV77Tarticu_parametrosds_1_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV78Tarticu_parametrosds_2_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Tarticu_parametrosds_4_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV79Tarticu_parametrosds_3_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Tarticu_parametrosds_4_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tarticu_parametrosds_6_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV81Tarticu_parametrosds_5_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tarticu_parametrosds_6_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
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
                  return conditional_P0A9K2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P0A9K3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A9K3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 28);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 28);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 28);
               }
               return;
      }
   }

}

