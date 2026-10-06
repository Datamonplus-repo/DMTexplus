package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tensprdwwgetfilterdata extends GXProcedure
{
   public tensprdwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tensprdwwgetfilterdata.class ), "" );
   }

   public tensprdwwgetfilterdata( int remoteHandle ,
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
      tensprdwwgetfilterdata.this.aP5 = new String[] {""};
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
      tensprdwwgetfilterdata.this.AV16DDOName = aP0;
      tensprdwwgetfilterdata.this.AV14SearchTxt = aP1;
      tensprdwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tensprdwwgetfilterdata.this.aP3 = aP3;
      tensprdwwgetfilterdata.this.aP4 = aP4;
      tensprdwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_LB_CODGRU") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_CODGRUOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_LB_DSCGRU") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_DSCGRUOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("GestionLaboratorio.TENSPRDWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.TENSPRDWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("GestionLaboratorio.TENSPRDWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CODGRU") == 0 )
         {
            AV12TFLb_CodGru = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CODGRU_SEL") == 0 )
         {
            AV13TFLb_CodGru_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_DSCGRU") == 0 )
         {
            AV10TFLb_DscGru = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_DSCGRU_SEL") == 0 )
         {
            AV11TFLb_DscGru_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLB_CODGRUOPTIONS' Routine */
      returnInSub = false ;
      AV12TFLb_CodGru = AV14SearchTxt ;
      AV13TFLb_CodGru_Sel = "" ;
      AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru = AV12TFLb_CodGru ;
      AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel = AV13TFLb_CodGru_Sel ;
      AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = AV10TFLb_DscGru ;
      AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel = AV11TFLb_DscGru_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext ,
                                           AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel ,
                                           AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru ,
                                           AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel ,
                                           AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ,
                                           A5612Lb_CodGru ,
                                           A5613Lb_DscGru } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext), "%", "") ;
      lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext), "%", "") ;
      lV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru = GXutil.padr( GXutil.rtrim( AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru), 2, "%") ;
      lV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = GXutil.padr( GXutil.rtrim( AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru), 40, "%") ;
      /* Using cursor P09692 */
      pr_default.execute(0, new Object[] {lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext, lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext, lV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru, AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel, lV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru, AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9692 = false ;
         A5612Lb_CodGru = P09692_A5612Lb_CodGru[0] ;
         A5613Lb_DscGru = P09692_A5613Lb_DscGru[0] ;
         n5613Lb_DscGru = P09692_n5613Lb_DscGru[0] ;
         A396EmprCod = P09692_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09692_A5612Lb_CodGru[0], A5612Lb_CodGru) == 0 ) )
         {
            brk9692 = false ;
            A396EmprCod = P09692_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9692 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5612Lb_CodGru)==0) )
         {
            AV18Option = A5612Lb_CodGru ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9692 )
         {
            brk9692 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_DSCGRUOPTIONS' Routine */
      returnInSub = false ;
      AV10TFLb_DscGru = AV14SearchTxt ;
      AV11TFLb_DscGru_Sel = "" ;
      AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru = AV12TFLb_CodGru ;
      AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel = AV13TFLb_CodGru_Sel ;
      AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = AV10TFLb_DscGru ;
      AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel = AV11TFLb_DscGru_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext ,
                                           AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel ,
                                           AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru ,
                                           AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel ,
                                           AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ,
                                           A5612Lb_CodGru ,
                                           A5613Lb_DscGru } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext), "%", "") ;
      lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext), "%", "") ;
      lV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru = GXutil.padr( GXutil.rtrim( AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru), 2, "%") ;
      lV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = GXutil.padr( GXutil.rtrim( AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru), 40, "%") ;
      /* Using cursor P09693 */
      pr_default.execute(1, new Object[] {lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext, lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext, lV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru, AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel, lV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru, AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9694 = false ;
         A5613Lb_DscGru = P09693_A5613Lb_DscGru[0] ;
         n5613Lb_DscGru = P09693_n5613Lb_DscGru[0] ;
         A5612Lb_CodGru = P09693_A5612Lb_CodGru[0] ;
         A396EmprCod = P09693_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09693_A5613Lb_DscGru[0], A5613Lb_DscGru) == 0 ) )
         {
            brk9694 = false ;
            A5612Lb_CodGru = P09693_A5612Lb_CodGru[0] ;
            A396EmprCod = P09693_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9694 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5613Lb_DscGru)==0) )
         {
            AV18Option = A5613Lb_DscGru ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9694 )
         {
            brk9694 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tensprdwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tensprdwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tensprdwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV32FilterFullText = "" ;
      AV12TFLb_CodGru = "" ;
      AV13TFLb_CodGru_Sel = "" ;
      AV10TFLb_DscGru = "" ;
      AV11TFLb_DscGru_Sel = "" ;
      A5612Lb_CodGru = "" ;
      AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext = "" ;
      AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru = "" ;
      AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel = "" ;
      AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = "" ;
      AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel = "" ;
      scmdbuf = "" ;
      lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext = "" ;
      lV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru = "" ;
      lV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru = "" ;
      A5613Lb_DscGru = "" ;
      P09692_A5612Lb_CodGru = new String[] {""} ;
      P09692_A5613Lb_DscGru = new String[] {""} ;
      P09692_n5613Lb_DscGru = new boolean[] {false} ;
      P09692_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P09693_A5613Lb_DscGru = new String[] {""} ;
      P09693_n5613Lb_DscGru = new boolean[] {false} ;
      P09693_A5612Lb_CodGru = new String[] {""} ;
      P09693_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tensprdwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09692_A5612Lb_CodGru, P09692_A5613Lb_DscGru, P09692_n5613Lb_DscGru, P09692_A396EmprCod
            }
            , new Object[] {
            P09693_A5613Lb_DscGru, P09693_n5613Lb_DscGru, P09693_A5612Lb_CodGru, P09693_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV12TFLb_CodGru ;
   private String AV13TFLb_CodGru_Sel ;
   private String AV10TFLb_DscGru ;
   private String AV11TFLb_DscGru_Sel ;
   private String A5612Lb_CodGru ;
   private String AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru ;
   private String AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel ;
   private String AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ;
   private String AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel ;
   private String scmdbuf ;
   private String lV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru ;
   private String lV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ;
   private String A5613Lb_DscGru ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9692 ;
   private boolean n5613Lb_DscGru ;
   private boolean brk9694 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext ;
   private String lV37Gestionlaboratorio_tensprdwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09692_A5612Lb_CodGru ;
   private String[] P09692_A5613Lb_DscGru ;
   private boolean[] P09692_n5613Lb_DscGru ;
   private String[] P09692_A396EmprCod ;
   private String[] P09693_A5613Lb_DscGru ;
   private boolean[] P09693_n5613Lb_DscGru ;
   private String[] P09693_A5612Lb_CodGru ;
   private String[] P09693_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tensprdwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09692( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext ,
                                          String AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel ,
                                          String AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru ,
                                          String AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel ,
                                          String AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ,
                                          String A5612Lb_CodGru ,
                                          String A5613Lb_DscGru )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Lb_CodGru, Lb_DscGru, EmprCod FROM TXPENSPRD" ;
      if ( ! (GXutil.strcmp("", AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(Lb_CodGru) like '%' || UPPER(?)) or ( UPPER(Lb_DscGru) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel)==0) && ( ! (GXutil.strcmp("", AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_CodGru) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_CodGru = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel)==0) && ( ! (GXutil.strcmp("", AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_DscGru) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_DscGru = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Lb_CodGru" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09693( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext ,
                                          String AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel ,
                                          String AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru ,
                                          String AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel ,
                                          String AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru ,
                                          String A5612Lb_CodGru ,
                                          String A5613Lb_DscGru )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT Lb_DscGru, Lb_CodGru, EmprCod FROM TXPENSPRD" ;
      if ( ! (GXutil.strcmp("", AV37Gestionlaboratorio_tensprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(Lb_CodGru) like '%' || UPPER(?)) or ( UPPER(Lb_DscGru) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel)==0) && ( ! (GXutil.strcmp("", AV38Gestionlaboratorio_tensprdwwds_2_tflb_codgru)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_CodGru) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Gestionlaboratorio_tensprdwwds_3_tflb_codgru_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_CodGru = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel)==0) && ( ! (GXutil.strcmp("", AV40Gestionlaboratorio_tensprdwwds_4_tflb_dscgru)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Lb_DscGru) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Gestionlaboratorio_tensprdwwds_5_tflb_dscgru_sel)==0) )
      {
         addWhere(sWhereString, "(Lb_DscGru = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Lb_DscGru" ;
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
                  return conditional_P09692(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P09693(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09692", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09693", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
      }
   }

}

