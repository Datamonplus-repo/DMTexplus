package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procesoquimico_1wwgetfilterdata extends GXProcedure
{
   public procesoquimico_1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesoquimico_1wwgetfilterdata.class ), "" );
   }

   public procesoquimico_1wwgetfilterdata( int remoteHandle ,
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
      procesoquimico_1wwgetfilterdata.this.aP5 = new String[] {""};
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
      procesoquimico_1wwgetfilterdata.this.AV29DDOName = aP0;
      procesoquimico_1wwgetfilterdata.this.AV30SearchTxt = aP1;
      procesoquimico_1wwgetfilterdata.this.AV31SearchTxtTo = aP2;
      procesoquimico_1wwgetfilterdata.this.aP3 = aP3;
      procesoquimico_1wwgetfilterdata.this.aP4 = aP4;
      procesoquimico_1wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV29DDOName), "DDO_PROFORDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV29DDOName), "DDO_PROFORDSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSC2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV19Options.toJSonString(false) ;
      AV33OptionsDescJson = AV21OptionsDesc.toJSonString(false) ;
      AV34OptionIndexesJson = AV22OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue("FormulacionTinte.ProcesoQuimico_1WWGridState"), "") == 0 )
      {
         AV26GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProcesoQuimico_1WWGridState"), null, null);
      }
      else
      {
         AV26GridState.fromxml(AV24Session.getValue("FormulacionTinte.ProcesoQuimico_1WWGridState"), null, null);
      }
      AV38GXV1 = 1 ;
      while ( AV38GXV1 <= AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV38GXV1));
         if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV35FilterFullText = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV10TFProForCod = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV12TFProForDsc = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV13TFProForDsc_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC2") == 0 )
         {
            AV14TFProForDsc2 = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC2_SEL") == 0 )
         {
            AV15TFProForDsc2_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORACT_SEL") == 0 )
         {
            AV16TFProForAct_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV38GXV1 = (int)(AV38GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForDsc = AV30SearchTxt ;
      AV13TFProForDsc_Sel = "" ;
      AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = AV35FilterFullText ;
      AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = AV10TFProForCod ;
      AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = AV12TFProForDsc ;
      AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = AV14TFProForDsc2 ;
      AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel = AV15TFProForDsc2_Sel ;
      AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel = AV16TFProForAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ,
                                           AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ,
                                           AV11TFProForCod_Sel ,
                                           AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel ,
                                           AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ,
                                           AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel ,
                                           AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ,
                                           AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A4715ProForDsc2 ,
                                           A13133ProForAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext), "%", "") ;
      lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext), "%", "") ;
      lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext), "%", "") ;
      lV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod), 6, "%") ;
      lV11TFProForCod_Sel = GXutil.padr( GXutil.rtrim( AV11TFProForCod_Sel), 6, "%") ;
      lV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = GXutil.padr( GXutil.rtrim( AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc), 30, "%") ;
      lV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = GXutil.padr( GXutil.rtrim( AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2), 40, "%") ;
      /* Using cursor P09T42 */
      pr_default.execute(0, new Object[] {lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext, lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext, lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext, lV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod, lV11TFProForCod_Sel, lV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc, AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel, lV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2, AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel, AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9T42 = false ;
         A766ProForDsc = P09T42_A766ProForDsc[0] ;
         A764ProForCod = P09T42_A764ProForCod[0] ;
         A13133ProForAct = P09T42_A13133ProForAct[0] ;
         A4715ProForDsc2 = P09T42_A4715ProForDsc2[0] ;
         A396EmprCod = P09T42_A396EmprCod[0] ;
         AV23count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09T42_A766ProForDsc[0], A766ProForDsc) == 0 ) )
         {
            brk9T42 = false ;
            A764ProForCod = P09T42_A764ProForCod[0] ;
            A396EmprCod = P09T42_A396EmprCod[0] ;
            AV23count = (long)(AV23count+1) ;
            brk9T42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV18Option = A766ProForDsc ;
            AV19Options.add(AV18Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV23count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9T42 )
         {
            brk9T42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSC2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFProForDsc2 = AV30SearchTxt ;
      AV15TFProForDsc2_Sel = "" ;
      AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = AV35FilterFullText ;
      AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = AV10TFProForCod ;
      AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = AV12TFProForDsc ;
      AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = AV14TFProForDsc2 ;
      AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel = AV15TFProForDsc2_Sel ;
      AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel = AV16TFProForAct_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ,
                                           AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ,
                                           AV11TFProForCod_Sel ,
                                           AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel ,
                                           AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ,
                                           AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel ,
                                           AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ,
                                           AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A4715ProForDsc2 ,
                                           A13133ProForAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext), "%", "") ;
      lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext), "%", "") ;
      lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext), "%", "") ;
      lV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod), 6, "%") ;
      lV11TFProForCod_Sel = GXutil.padr( GXutil.rtrim( AV11TFProForCod_Sel), 6, "%") ;
      lV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = GXutil.padr( GXutil.rtrim( AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc), 30, "%") ;
      lV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = GXutil.padr( GXutil.rtrim( AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2), 40, "%") ;
      /* Using cursor P09T43 */
      pr_default.execute(1, new Object[] {lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext, lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext, lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext, lV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod, lV11TFProForCod_Sel, lV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc, AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel, lV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2, AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel, AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9T44 = false ;
         A4715ProForDsc2 = P09T43_A4715ProForDsc2[0] ;
         A764ProForCod = P09T43_A764ProForCod[0] ;
         A13133ProForAct = P09T43_A13133ProForAct[0] ;
         A766ProForDsc = P09T43_A766ProForDsc[0] ;
         A396EmprCod = P09T43_A396EmprCod[0] ;
         AV23count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09T43_A4715ProForDsc2[0], A4715ProForDsc2) == 0 ) )
         {
            brk9T44 = false ;
            A764ProForCod = P09T43_A764ProForCod[0] ;
            A396EmprCod = P09T43_A396EmprCod[0] ;
            AV23count = (long)(AV23count+1) ;
            brk9T44 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4715ProForDsc2)==0) )
         {
            AV18Option = A4715ProForDsc2 ;
            AV19Options.add(AV18Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV23count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9T44 )
         {
            brk9T44 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = procesoquimico_1wwgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = procesoquimico_1wwgetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = procesoquimico_1wwgetfilterdata.this.AV34OptionIndexesJson;
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
      AV33OptionsDescJson = "" ;
      AV34OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24Session = httpContext.getWebSession();
      AV26GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV27GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV35FilterFullText = "" ;
      AV10TFProForCod = "" ;
      AV12TFProForDsc = "" ;
      AV13TFProForDsc_Sel = "" ;
      AV14TFProForDsc2 = "" ;
      AV15TFProForDsc2_Sel = "" ;
      AV16TFProForAct_Sel = "" ;
      A766ProForDsc = "" ;
      AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = "" ;
      AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = "" ;
      AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = "" ;
      AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel = "" ;
      AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = "" ;
      AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel = "" ;
      AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel = "" ;
      scmdbuf = "" ;
      lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext = "" ;
      lV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod = "" ;
      lV11TFProForCod_Sel = "" ;
      lV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc = "" ;
      lV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 = "" ;
      AV11TFProForCod_Sel = "" ;
      A764ProForCod = "" ;
      A4715ProForDsc2 = "" ;
      A13133ProForAct = "" ;
      P09T42_A766ProForDsc = new String[] {""} ;
      P09T42_A764ProForCod = new String[] {""} ;
      P09T42_A13133ProForAct = new String[] {""} ;
      P09T42_A4715ProForDsc2 = new String[] {""} ;
      P09T42_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P09T43_A4715ProForDsc2 = new String[] {""} ;
      P09T43_A764ProForCod = new String[] {""} ;
      P09T43_A13133ProForAct = new String[] {""} ;
      P09T43_A766ProForDsc = new String[] {""} ;
      P09T43_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09T42_A766ProForDsc, P09T42_A764ProForCod, P09T42_A13133ProForAct, P09T42_A4715ProForDsc2, P09T42_A396EmprCod
            }
            , new Object[] {
            P09T43_A4715ProForDsc2, P09T43_A764ProForCod, P09T43_A13133ProForAct, P09T43_A766ProForDsc, P09T43_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV38GXV1 ;
   private long AV23count ;
   private String AV10TFProForCod ;
   private String AV12TFProForDsc ;
   private String AV13TFProForDsc_Sel ;
   private String AV14TFProForDsc2 ;
   private String AV15TFProForDsc2_Sel ;
   private String AV16TFProForAct_Sel ;
   private String A766ProForDsc ;
   private String AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ;
   private String AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ;
   private String AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel ;
   private String AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ;
   private String AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel ;
   private String AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel ;
   private String scmdbuf ;
   private String lV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ;
   private String lV11TFProForCod_Sel ;
   private String lV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ;
   private String lV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ;
   private String AV11TFProForCod_Sel ;
   private String A764ProForCod ;
   private String A4715ProForDsc2 ;
   private String A13133ProForAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9T42 ;
   private boolean brk9T44 ;
   private String AV32OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV34OptionIndexesJson ;
   private String AV29DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV35FilterFullText ;
   private String AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ;
   private String lV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09T42_A766ProForDsc ;
   private String[] P09T42_A764ProForCod ;
   private String[] P09T42_A13133ProForAct ;
   private String[] P09T42_A4715ProForDsc2 ;
   private String[] P09T42_A396EmprCod ;
   private String[] P09T43_A4715ProForDsc2 ;
   private String[] P09T43_A764ProForCod ;
   private String[] P09T43_A13133ProForAct ;
   private String[] P09T43_A766ProForDsc ;
   private String[] P09T43_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV21OptionsDesc ;
   private GXSimpleCollection<String> AV22OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV26GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV27GridStateFilterValue ;
}

final  class procesoquimico_1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09T42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ,
                                          String AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ,
                                          String AV11TFProForCod_Sel ,
                                          String AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel ,
                                          String AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ,
                                          String AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel ,
                                          String AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ,
                                          String AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A4715ProForDsc2 ,
                                          String A13133ProForAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ProForDsc, ProForCod, ProForAct, ProForDsc2, EmprCod FROM TXPCPROFO" ;
      if ( ! (GXutil.strcmp("", AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForDsc2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(ProForCod))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFProForCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(ProForCod))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel)==0) && ( ! (GXutil.strcmp("", AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc2 = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel)==0) )
      {
         addWhere(sWhereString, "(ProForAct = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProForDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09T43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext ,
                                          String AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod ,
                                          String AV11TFProForCod_Sel ,
                                          String AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel ,
                                          String AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc ,
                                          String AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel ,
                                          String AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2 ,
                                          String AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A4715ProForDsc2 ,
                                          String A13133ProForAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT ProForDsc2, ProForCod, ProForAct, ProForDsc, EmprCod FROM TXPCPROFO" ;
      if ( ! (GXutil.strcmp("", AV40Formulaciontinte_procesoquimico_1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForDsc2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Formulaciontinte_procesoquimico_1wwds_2_tfproforcod)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(ProForCod))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFProForCod_Sel)==0) )
      {
         addWhere(sWhereString, "(LOWER(RTRIM(LTRIM(ProForCod))) like '%' || LOWER(RTRIM(LTRIM(?))))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV42Formulaciontinte_procesoquimico_1wwds_3_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Formulaciontinte_procesoquimico_1wwds_4_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel)==0) && ( ! (GXutil.strcmp("", AV44Formulaciontinte_procesoquimico_1wwds_5_tfprofordsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Formulaciontinte_procesoquimico_1wwds_6_tfprofordsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc2 = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Formulaciontinte_procesoquimico_1wwds_7_tfproforact_sel)==0) )
      {
         addWhere(sWhereString, "(ProForAct = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProForDsc2" ;
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
                  return conditional_P09T42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 1 :
                  return conditional_P09T43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09T42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09T43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
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
                  stmt.setString(sIdx, (String)parms[17], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
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
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
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
                  stmt.setString(sIdx, (String)parms[17], 40);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 40);
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

