package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcserpaugetfilterdata extends GXProcedure
{
   public wcserpaugetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcserpaugetfilterdata.class ), "" );
   }

   public wcserpaugetfilterdata( int remoteHandle ,
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
      wcserpaugetfilterdata.this.aP5 = new String[] {""};
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
      wcserpaugetfilterdata.this.AV18DDOName = aP0;
      wcserpaugetfilterdata.this.AV16SearchTxt = aP1;
      wcserpaugetfilterdata.this.AV17SearchTxtTo = aP2;
      wcserpaugetfilterdata.this.aP3 = aP3;
      wcserpaugetfilterdata.this.aP4 = aP4;
      wcserpaugetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV29Session.getValue("WCSerpauGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCSerpauGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WCSerpauGridState"), null, null);
      }
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMLIN") == 0 )
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
      AV77Wcserpauds_1_filterfulltext = AV42FilterFullText ;
      AV78Wcserpauds_2_tfpronumlin = AV10TFProNumLin ;
      AV79Wcserpauds_3_tfpronumlin_to = AV11TFProNumLin_To ;
      AV80Wcserpauds_4_tffascod = AV12TFFasCod ;
      AV81Wcserpauds_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV82Wcserpauds_6_tffasdsc = AV14TFFasDsc ;
      AV83Wcserpauds_7_tffasdsc_sel = AV15TFFasDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV77Wcserpauds_1_filterfulltext ,
                                           Short.valueOf(AV78Wcserpauds_2_tfpronumlin) ,
                                           Short.valueOf(AV79Wcserpauds_3_tfpronumlin_to) ,
                                           AV81Wcserpauds_5_tffascod_sel ,
                                           AV80Wcserpauds_4_tffascod ,
                                           AV83Wcserpauds_7_tffasdsc_sel ,
                                           AV82Wcserpauds_6_tffasdsc ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A758ProCod ,
                                           AV38Procod ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Wcserpauds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcserpauds_1_filterfulltext), "%", "") ;
      lV77Wcserpauds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcserpauds_1_filterfulltext), "%", "") ;
      lV77Wcserpauds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcserpauds_1_filterfulltext), "%", "") ;
      lV80Wcserpauds_4_tffascod = GXutil.padr( GXutil.rtrim( AV80Wcserpauds_4_tffascod), 8, "%") ;
      lV82Wcserpauds_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV82Wcserpauds_6_tffasdsc), 28, "%") ;
      /* Using cursor P08GO2 */
      pr_default.execute(0, new Object[] {AV34Emprcod, AV38Procod, lV77Wcserpauds_1_filterfulltext, lV77Wcserpauds_1_filterfulltext, lV77Wcserpauds_1_filterfulltext, Short.valueOf(AV78Wcserpauds_2_tfpronumlin), Short.valueOf(AV79Wcserpauds_3_tfpronumlin_to), lV80Wcserpauds_4_tffascod, AV81Wcserpauds_5_tffascod_sel, lV82Wcserpauds_6_tffasdsc, AV83Wcserpauds_7_tffasdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8GO2 = false ;
         A396EmprCod = P08GO2_A396EmprCod[0] ;
         A457FasCod = P08GO2_A457FasCod[0] ;
         A758ProCod = P08GO2_A758ProCod[0] ;
         A460FasDsc = P08GO2_A460FasDsc[0] ;
         A774ProNumLin = P08GO2_A774ProNumLin[0] ;
         A460FasDsc = P08GO2_A460FasDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08GO2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08GO2_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk8GO2 = false ;
            A758ProCod = P08GO2_A758ProCod[0] ;
            A774ProNumLin = P08GO2_A774ProNumLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8GO2 = true ;
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
         if ( ! brk8GO2 )
         {
            brk8GO2 = true ;
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
      AV77Wcserpauds_1_filterfulltext = AV42FilterFullText ;
      AV78Wcserpauds_2_tfpronumlin = AV10TFProNumLin ;
      AV79Wcserpauds_3_tfpronumlin_to = AV11TFProNumLin_To ;
      AV80Wcserpauds_4_tffascod = AV12TFFasCod ;
      AV81Wcserpauds_5_tffascod_sel = AV13TFFasCod_Sel ;
      AV82Wcserpauds_6_tffasdsc = AV14TFFasDsc ;
      AV83Wcserpauds_7_tffasdsc_sel = AV15TFFasDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV77Wcserpauds_1_filterfulltext ,
                                           Short.valueOf(AV78Wcserpauds_2_tfpronumlin) ,
                                           Short.valueOf(AV79Wcserpauds_3_tfpronumlin_to) ,
                                           AV81Wcserpauds_5_tffascod_sel ,
                                           AV80Wcserpauds_4_tffascod ,
                                           AV83Wcserpauds_7_tffasdsc_sel ,
                                           AV82Wcserpauds_6_tffasdsc ,
                                           Short.valueOf(A774ProNumLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A758ProCod ,
                                           AV38Procod ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV77Wcserpauds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcserpauds_1_filterfulltext), "%", "") ;
      lV77Wcserpauds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcserpauds_1_filterfulltext), "%", "") ;
      lV77Wcserpauds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Wcserpauds_1_filterfulltext), "%", "") ;
      lV80Wcserpauds_4_tffascod = GXutil.padr( GXutil.rtrim( AV80Wcserpauds_4_tffascod), 8, "%") ;
      lV82Wcserpauds_6_tffasdsc = GXutil.padr( GXutil.rtrim( AV82Wcserpauds_6_tffasdsc), 28, "%") ;
      /* Using cursor P08GO3 */
      pr_default.execute(1, new Object[] {AV34Emprcod, AV38Procod, lV77Wcserpauds_1_filterfulltext, lV77Wcserpauds_1_filterfulltext, lV77Wcserpauds_1_filterfulltext, Short.valueOf(AV78Wcserpauds_2_tfpronumlin), Short.valueOf(AV79Wcserpauds_3_tfpronumlin_to), lV80Wcserpauds_4_tffascod, AV81Wcserpauds_5_tffascod_sel, lV82Wcserpauds_6_tffasdsc, AV83Wcserpauds_7_tffasdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8GO4 = false ;
         A457FasCod = P08GO3_A457FasCod[0] ;
         A396EmprCod = P08GO3_A396EmprCod[0] ;
         A758ProCod = P08GO3_A758ProCod[0] ;
         A460FasDsc = P08GO3_A460FasDsc[0] ;
         A774ProNumLin = P08GO3_A774ProNumLin[0] ;
         A460FasDsc = P08GO3_A460FasDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08GO3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08GO3_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk8GO4 = false ;
            A758ProCod = P08GO3_A758ProCod[0] ;
            A774ProNumLin = P08GO3_A774ProNumLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8GO4 = true ;
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
         if ( ! brk8GO4 )
         {
            brk8GO4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcserpaugetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcserpaugetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcserpaugetfilterdata.this.AV27OptionIndexesJson;
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
      AV42FilterFullText = "" ;
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
      AV77Wcserpauds_1_filterfulltext = "" ;
      AV80Wcserpauds_4_tffascod = "" ;
      AV81Wcserpauds_5_tffascod_sel = "" ;
      AV82Wcserpauds_6_tffasdsc = "" ;
      AV83Wcserpauds_7_tffasdsc_sel = "" ;
      scmdbuf = "" ;
      lV77Wcserpauds_1_filterfulltext = "" ;
      lV80Wcserpauds_4_tffascod = "" ;
      lV82Wcserpauds_6_tffasdsc = "" ;
      A460FasDsc = "" ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      P08GO2_A396EmprCod = new String[] {""} ;
      P08GO2_A457FasCod = new String[] {""} ;
      P08GO2_A758ProCod = new String[] {""} ;
      P08GO2_A460FasDsc = new String[] {""} ;
      P08GO2_A774ProNumLin = new short[1] ;
      AV20Option = "" ;
      AV23OptionDesc = "" ;
      P08GO3_A457FasCod = new String[] {""} ;
      P08GO3_A396EmprCod = new String[] {""} ;
      P08GO3_A758ProCod = new String[] {""} ;
      P08GO3_A460FasDsc = new String[] {""} ;
      P08GO3_A774ProNumLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcserpaugetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08GO2_A396EmprCod, P08GO2_A457FasCod, P08GO2_A758ProCod, P08GO2_A460FasDsc, P08GO2_A774ProNumLin
            }
            , new Object[] {
            P08GO3_A457FasCod, P08GO3_A396EmprCod, P08GO3_A758ProCod, P08GO3_A460FasDsc, P08GO3_A774ProNumLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFProNumLin ;
   private short AV11TFProNumLin_To ;
   private short AV78Wcserpauds_2_tfpronumlin ;
   private short AV79Wcserpauds_3_tfpronumlin_to ;
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
   private String AV80Wcserpauds_4_tffascod ;
   private String AV81Wcserpauds_5_tffascod_sel ;
   private String AV82Wcserpauds_6_tffasdsc ;
   private String AV83Wcserpauds_7_tffasdsc_sel ;
   private String scmdbuf ;
   private String lV80Wcserpauds_4_tffascod ;
   private String lV82Wcserpauds_6_tffasdsc ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8GO2 ;
   private boolean brk8GO4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV77Wcserpauds_1_filterfulltext ;
   private String lV77Wcserpauds_1_filterfulltext ;
   private String AV20Option ;
   private String AV23OptionDesc ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08GO2_A396EmprCod ;
   private String[] P08GO2_A457FasCod ;
   private String[] P08GO2_A758ProCod ;
   private String[] P08GO2_A460FasDsc ;
   private short[] P08GO2_A774ProNumLin ;
   private String[] P08GO3_A457FasCod ;
   private String[] P08GO3_A396EmprCod ;
   private String[] P08GO3_A758ProCod ;
   private String[] P08GO3_A460FasDsc ;
   private short[] P08GO3_A774ProNumLin ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcserpaugetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Wcserpauds_1_filterfulltext ,
                                          short AV78Wcserpauds_2_tfpronumlin ,
                                          short AV79Wcserpauds_3_tfpronumlin_to ,
                                          String AV81Wcserpauds_5_tffascod_sel ,
                                          String AV80Wcserpauds_4_tffascod ,
                                          String AV83Wcserpauds_7_tffasdsc_sel ,
                                          String AV82Wcserpauds_6_tffasdsc ,
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
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.ProCod, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (GXutil.strcmp("", AV77Wcserpauds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcserpauds_2_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcserpauds_3_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcserpauds_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcserpauds_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcserpauds_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Wcserpauds_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Wcserpauds_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Wcserpauds_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08GO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Wcserpauds_1_filterfulltext ,
                                          short AV78Wcserpauds_2_tfpronumlin ,
                                          short AV79Wcserpauds_3_tfpronumlin_to ,
                                          String AV81Wcserpauds_5_tffascod_sel ,
                                          String AV80Wcserpauds_4_tffascod ,
                                          String AV83Wcserpauds_7_tffasdsc_sel ,
                                          String AV82Wcserpauds_6_tffasdsc ,
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
      byte[] GXv_int4 = new byte[11];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.FasCod, T1.EmprCod, T1.ProCod, T2.FasDsc, T1.ProNumLin FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      if ( ! (GXutil.strcmp("", AV77Wcserpauds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProNumLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcserpauds_2_tfpronumlin) )
      {
         addWhere(sWhereString, "(T1.ProNumLin >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcserpauds_3_tfpronumlin_to) )
      {
         addWhere(sWhereString, "(T1.ProNumLin <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcserpauds_5_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcserpauds_4_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcserpauds_5_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Wcserpauds_7_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Wcserpauds_6_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Wcserpauds_7_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
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
                  return conditional_P08GO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_P08GO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08GO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 28);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 28);
               }
               return;
      }
   }

}

