package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclimatwwgetfilterdata extends GXProcedure
{
   public tclimatwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclimatwwgetfilterdata.class ), "" );
   }

   public tclimatwwgetfilterdata( int remoteHandle ,
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
      tclimatwwgetfilterdata.this.aP5 = new String[] {""};
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
      tclimatwwgetfilterdata.this.AV18DDOName = aP0;
      tclimatwwgetfilterdata.this.AV16SearchTxt = aP1;
      tclimatwwgetfilterdata.this.AV17SearchTxtTo = aP2;
      tclimatwwgetfilterdata.this.aP3 = aP3;
      tclimatwwgetfilterdata.this.aP4 = aP4;
      tclimatwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_CLICOLAB") == 0 )
      {
         /* Execute user subroutine: 'LOADCLICOLABOPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("FormulacionTinte.TCLIMATWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TCLIMATWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FormulacionTinte.TCLIMATWWGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV45FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOLAB") == 0 )
         {
            AV14TFCliColAb = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOLAB_SEL") == 0 )
         {
            AV15TFCliColAb_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV16SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV50Formulaciontinte_tclimatwwds_1_filterfulltext = AV45FilterFullText ;
      AV51Formulaciontinte_tclimatwwds_2_tfclicod = AV10TFCliCod ;
      AV52Formulaciontinte_tclimatwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV53Formulaciontinte_tclimatwwds_4_tfclinom = AV12TFCliNom ;
      AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV55Formulaciontinte_tclimatwwds_6_tfclicolab = AV14TFCliColAb ;
      AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel = AV15TFCliColAb_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Formulaciontinte_tclimatwwds_1_filterfulltext ,
                                           Integer.valueOf(AV51Formulaciontinte_tclimatwwds_2_tfclicod) ,
                                           Integer.valueOf(AV52Formulaciontinte_tclimatwwds_3_tfclicod_to) ,
                                           AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel ,
                                           AV53Formulaciontinte_tclimatwwds_4_tfclinom ,
                                           AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel ,
                                           AV55Formulaciontinte_tclimatwwds_6_tfclicolab ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A13237CliColAb } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV50Formulaciontinte_tclimatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tclimatwwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tclimatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tclimatwwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tclimatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tclimatwwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_tclimatwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_tclimatwwds_4_tfclinom), 30, "%") ;
      lV55Formulaciontinte_tclimatwwds_6_tfclicolab = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_tclimatwwds_6_tfclicolab), 3, "%") ;
      /* Using cursor P08HD2 */
      pr_default.execute(0, new Object[] {lV50Formulaciontinte_tclimatwwds_1_filterfulltext, lV50Formulaciontinte_tclimatwwds_1_filterfulltext, lV50Formulaciontinte_tclimatwwds_1_filterfulltext, Integer.valueOf(AV51Formulaciontinte_tclimatwwds_2_tfclicod), Integer.valueOf(AV52Formulaciontinte_tclimatwwds_3_tfclicod_to), lV53Formulaciontinte_tclimatwwds_4_tfclinom, AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel, lV55Formulaciontinte_tclimatwwds_6_tfclicolab, AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8HD2 = false ;
         A279CliNom = P08HD2_A279CliNom[0] ;
         A13237CliColAb = P08HD2_A13237CliColAb[0] ;
         n13237CliColAb = P08HD2_n13237CliColAb[0] ;
         A252CliCod = P08HD2_A252CliCod[0] ;
         A396EmprCod = P08HD2_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08HD2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8HD2 = false ;
            A252CliCod = P08HD2_A252CliCod[0] ;
            A396EmprCod = P08HD2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8HD2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV20Option = A279CliNom ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HD2 )
         {
            brk8HD2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCLICOLABOPTIONS' Routine */
      returnInSub = false ;
      AV14TFCliColAb = AV16SearchTxt ;
      AV15TFCliColAb_Sel = "" ;
      AV50Formulaciontinte_tclimatwwds_1_filterfulltext = AV45FilterFullText ;
      AV51Formulaciontinte_tclimatwwds_2_tfclicod = AV10TFCliCod ;
      AV52Formulaciontinte_tclimatwwds_3_tfclicod_to = AV11TFCliCod_To ;
      AV53Formulaciontinte_tclimatwwds_4_tfclinom = AV12TFCliNom ;
      AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV55Formulaciontinte_tclimatwwds_6_tfclicolab = AV14TFCliColAb ;
      AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel = AV15TFCliColAb_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Formulaciontinte_tclimatwwds_1_filterfulltext ,
                                           Integer.valueOf(AV51Formulaciontinte_tclimatwwds_2_tfclicod) ,
                                           Integer.valueOf(AV52Formulaciontinte_tclimatwwds_3_tfclicod_to) ,
                                           AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel ,
                                           AV53Formulaciontinte_tclimatwwds_4_tfclinom ,
                                           AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel ,
                                           AV55Formulaciontinte_tclimatwwds_6_tfclicolab ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A13237CliColAb } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV50Formulaciontinte_tclimatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tclimatwwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tclimatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tclimatwwds_1_filterfulltext), "%", "") ;
      lV50Formulaciontinte_tclimatwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Formulaciontinte_tclimatwwds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_tclimatwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_tclimatwwds_4_tfclinom), 30, "%") ;
      lV55Formulaciontinte_tclimatwwds_6_tfclicolab = GXutil.padr( GXutil.rtrim( AV55Formulaciontinte_tclimatwwds_6_tfclicolab), 3, "%") ;
      /* Using cursor P08HD3 */
      pr_default.execute(1, new Object[] {lV50Formulaciontinte_tclimatwwds_1_filterfulltext, lV50Formulaciontinte_tclimatwwds_1_filterfulltext, lV50Formulaciontinte_tclimatwwds_1_filterfulltext, Integer.valueOf(AV51Formulaciontinte_tclimatwwds_2_tfclicod), Integer.valueOf(AV52Formulaciontinte_tclimatwwds_3_tfclicod_to), lV53Formulaciontinte_tclimatwwds_4_tfclinom, AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel, lV55Formulaciontinte_tclimatwwds_6_tfclicolab, AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8HD4 = false ;
         A13237CliColAb = P08HD3_A13237CliColAb[0] ;
         n13237CliColAb = P08HD3_n13237CliColAb[0] ;
         A279CliNom = P08HD3_A279CliNom[0] ;
         A252CliCod = P08HD3_A252CliCod[0] ;
         A396EmprCod = P08HD3_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08HD3_A13237CliColAb[0], A13237CliColAb) == 0 ) )
         {
            brk8HD4 = false ;
            A252CliCod = P08HD3_A252CliCod[0] ;
            A396EmprCod = P08HD3_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8HD4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13237CliColAb)==0) )
         {
            AV20Option = A13237CliColAb ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HD4 )
         {
            brk8HD4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tclimatwwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = tclimatwwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = tclimatwwgetfilterdata.this.AV27OptionIndexesJson;
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
      AV45FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFCliColAb = "" ;
      AV15TFCliColAb_Sel = "" ;
      A279CliNom = "" ;
      AV50Formulaciontinte_tclimatwwds_1_filterfulltext = "" ;
      AV53Formulaciontinte_tclimatwwds_4_tfclinom = "" ;
      AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel = "" ;
      AV55Formulaciontinte_tclimatwwds_6_tfclicolab = "" ;
      AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel = "" ;
      scmdbuf = "" ;
      lV50Formulaciontinte_tclimatwwds_1_filterfulltext = "" ;
      lV53Formulaciontinte_tclimatwwds_4_tfclinom = "" ;
      lV55Formulaciontinte_tclimatwwds_6_tfclicolab = "" ;
      A13237CliColAb = "" ;
      P08HD2_A279CliNom = new String[] {""} ;
      P08HD2_A13237CliColAb = new String[] {""} ;
      P08HD2_n13237CliColAb = new boolean[] {false} ;
      P08HD2_A252CliCod = new int[1] ;
      P08HD2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      P08HD3_A13237CliColAb = new String[] {""} ;
      P08HD3_n13237CliColAb = new boolean[] {false} ;
      P08HD3_A279CliNom = new String[] {""} ;
      P08HD3_A252CliCod = new int[1] ;
      P08HD3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tclimatwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08HD2_A279CliNom, P08HD2_A13237CliColAb, P08HD2_n13237CliColAb, P08HD2_A252CliCod, P08HD2_A396EmprCod
            }
            , new Object[] {
            P08HD3_A13237CliColAb, P08HD3_n13237CliColAb, P08HD3_A279CliNom, P08HD3_A252CliCod, P08HD3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV48GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV51Formulaciontinte_tclimatwwds_2_tfclicod ;
   private int AV52Formulaciontinte_tclimatwwds_3_tfclicod_to ;
   private int A252CliCod ;
   private long AV28count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFCliColAb ;
   private String AV15TFCliColAb_Sel ;
   private String A279CliNom ;
   private String AV53Formulaciontinte_tclimatwwds_4_tfclinom ;
   private String AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel ;
   private String AV55Formulaciontinte_tclimatwwds_6_tfclicolab ;
   private String AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel ;
   private String scmdbuf ;
   private String lV53Formulaciontinte_tclimatwwds_4_tfclinom ;
   private String lV55Formulaciontinte_tclimatwwds_6_tfclicolab ;
   private String A13237CliColAb ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8HD2 ;
   private boolean n13237CliColAb ;
   private boolean brk8HD4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV45FilterFullText ;
   private String AV50Formulaciontinte_tclimatwwds_1_filterfulltext ;
   private String lV50Formulaciontinte_tclimatwwds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08HD2_A279CliNom ;
   private String[] P08HD2_A13237CliColAb ;
   private boolean[] P08HD2_n13237CliColAb ;
   private int[] P08HD2_A252CliCod ;
   private String[] P08HD2_A396EmprCod ;
   private String[] P08HD3_A13237CliColAb ;
   private boolean[] P08HD3_n13237CliColAb ;
   private String[] P08HD3_A279CliNom ;
   private int[] P08HD3_A252CliCod ;
   private String[] P08HD3_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class tclimatwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08HD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Formulaciontinte_tclimatwwds_1_filterfulltext ,
                                          int AV51Formulaciontinte_tclimatwwds_2_tfclicod ,
                                          int AV52Formulaciontinte_tclimatwwds_3_tfclicod_to ,
                                          String AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel ,
                                          String AV53Formulaciontinte_tclimatwwds_4_tfclinom ,
                                          String AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel ,
                                          String AV55Formulaciontinte_tclimatwwds_6_tfclicolab ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A13237CliColAb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CliNom, CliColAb, CliCod, EmprCod FROM TXPCLIENT" ;
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_tclimatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CliCod,'999990'), 2) like '%' || ?) or ( UPPER(CliNom) like '%' || UPPER(?)) or ( UPPER(CliColAb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_tclimatwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_tclimatwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_tclimatwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(CliNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_tclimatwwds_6_tfclicolab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CliColAb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel)==0) )
      {
         addWhere(sWhereString, "(CliColAb = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08HD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Formulaciontinte_tclimatwwds_1_filterfulltext ,
                                          int AV51Formulaciontinte_tclimatwwds_2_tfclicod ,
                                          int AV52Formulaciontinte_tclimatwwds_3_tfclicod_to ,
                                          String AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel ,
                                          String AV53Formulaciontinte_tclimatwwds_4_tfclinom ,
                                          String AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel ,
                                          String AV55Formulaciontinte_tclimatwwds_6_tfclicolab ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A13237CliColAb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT CliColAb, CliNom, CliCod, EmprCod FROM TXPCLIENT" ;
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_tclimatwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CliCod,'999990'), 2) like '%' || ?) or ( UPPER(CliNom) like '%' || UPPER(?)) or ( UPPER(CliColAb) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_tclimatwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_tclimatwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_tclimatwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_tclimatwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(CliNom = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel)==0) && ( ! (GXutil.strcmp("", AV55Formulaciontinte_tclimatwwds_6_tfclicolab)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CliColAb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Formulaciontinte_tclimatwwds_7_tfclicolab_sel)==0) )
      {
         addWhere(sWhereString, "(CliColAb = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CliColAb" ;
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
                  return conditional_P08HD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P08HD3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08HD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08HD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
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
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               return;
      }
   }

}

