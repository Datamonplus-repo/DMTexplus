package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfacvtowwgetfilterdata extends GXProcedure
{
   public tfacvtowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfacvtowwgetfilterdata.class ), "" );
   }

   public tfacvtowwgetfilterdata( int remoteHandle ,
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
      tfacvtowwgetfilterdata.this.aP5 = new String[] {""};
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
      tfacvtowwgetfilterdata.this.AV28DDOName = aP0;
      tfacvtowwgetfilterdata.this.AV29SearchTxt = aP1;
      tfacvtowwgetfilterdata.this.AV30SearchTxtTo = aP2;
      tfacvtowwgetfilterdata.this.aP3 = aP3;
      tfacvtowwgetfilterdata.this.aP4 = aP4;
      tfacvtowwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_EMPRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV31OptionsJson = AV18Options.toJSonString(false) ;
      AV32OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV21OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("Facturacion.TFACVTOWWGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TFACVTOWWGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("Facturacion.TFACVTOWWGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV10TFEmprCod = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV11TFEmprCod_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM") == 0 )
         {
            AV12TFEmprNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRNOM_SEL") == 0 )
         {
            AV13TFEmprNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCOD") == 0 )
         {
            AV14TFFacCod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFFacCod_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFEmprCod = AV29SearchTxt ;
      AV11TFEmprCod_Sel = "" ;
      AV39Facturacion_tfacvtowwds_1_filterfulltext = AV34FilterFullText ;
      AV40Facturacion_tfacvtowwds_2_tfemprcod = AV10TFEmprCod ;
      AV41Facturacion_tfacvtowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV42Facturacion_tfacvtowwds_4_tfemprnom = AV12TFEmprNom ;
      AV43Facturacion_tfacvtowwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV44Facturacion_tfacvtowwds_6_tffaccod = AV14TFFacCod ;
      AV45Facturacion_tfacvtowwds_7_tffaccod_to = AV15TFFacCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Facturacion_tfacvtowwds_1_filterfulltext ,
                                           AV41Facturacion_tfacvtowwds_3_tfemprcod_sel ,
                                           AV40Facturacion_tfacvtowwds_2_tfemprcod ,
                                           AV43Facturacion_tfacvtowwds_5_tfemprnom_sel ,
                                           AV42Facturacion_tfacvtowwds_4_tfemprnom ,
                                           Integer.valueOf(AV44Facturacion_tfacvtowwds_6_tffaccod) ,
                                           Integer.valueOf(AV45Facturacion_tfacvtowwds_7_tffaccod_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A430FacCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT
                                           }
      });
      lV39Facturacion_tfacvtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tfacvtowwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tfacvtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tfacvtowwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tfacvtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tfacvtowwds_1_filterfulltext), "%", "") ;
      lV40Facturacion_tfacvtowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV40Facturacion_tfacvtowwds_2_tfemprcod), 3, "%") ;
      lV42Facturacion_tfacvtowwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV42Facturacion_tfacvtowwds_4_tfemprnom), 30, "%") ;
      /* Using cursor P09Z72 */
      pr_default.execute(0, new Object[] {lV39Facturacion_tfacvtowwds_1_filterfulltext, lV39Facturacion_tfacvtowwds_1_filterfulltext, lV39Facturacion_tfacvtowwds_1_filterfulltext, lV40Facturacion_tfacvtowwds_2_tfemprcod, AV41Facturacion_tfacvtowwds_3_tfemprcod_sel, lV42Facturacion_tfacvtowwds_4_tfemprnom, AV43Facturacion_tfacvtowwds_5_tfemprnom_sel, Integer.valueOf(AV44Facturacion_tfacvtowwds_6_tffaccod), Integer.valueOf(AV45Facturacion_tfacvtowwds_7_tffaccod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9Z72 = false ;
         A396EmprCod = P09Z72_A396EmprCod[0] ;
         A430FacCod = P09Z72_A430FacCod[0] ;
         A407EmprNom = P09Z72_A407EmprNom[0] ;
         n407EmprNom = P09Z72_n407EmprNom[0] ;
         A407EmprNom = P09Z72_A407EmprNom[0] ;
         n407EmprNom = P09Z72_n407EmprNom[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09Z72_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk9Z72 = false ;
            A430FacCod = P09Z72_A430FacCod[0] ;
            AV22count = (long)(AV22count+1) ;
            brk9Z72 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV17Option = A396EmprCod ;
            AV19OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV18Options.add(AV17Option, 0);
            AV20OptionsDesc.add(AV19OptionDesc, 0);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9Z72 )
         {
            brk9Z72 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV29SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      AV39Facturacion_tfacvtowwds_1_filterfulltext = AV34FilterFullText ;
      AV40Facturacion_tfacvtowwds_2_tfemprcod = AV10TFEmprCod ;
      AV41Facturacion_tfacvtowwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV42Facturacion_tfacvtowwds_4_tfemprnom = AV12TFEmprNom ;
      AV43Facturacion_tfacvtowwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV44Facturacion_tfacvtowwds_6_tffaccod = AV14TFFacCod ;
      AV45Facturacion_tfacvtowwds_7_tffaccod_to = AV15TFFacCod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV39Facturacion_tfacvtowwds_1_filterfulltext ,
                                           AV41Facturacion_tfacvtowwds_3_tfemprcod_sel ,
                                           AV40Facturacion_tfacvtowwds_2_tfemprcod ,
                                           AV43Facturacion_tfacvtowwds_5_tfemprnom_sel ,
                                           AV42Facturacion_tfacvtowwds_4_tfemprnom ,
                                           Integer.valueOf(AV44Facturacion_tfacvtowwds_6_tffaccod) ,
                                           Integer.valueOf(AV45Facturacion_tfacvtowwds_7_tffaccod_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Integer.valueOf(A430FacCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT
                                           }
      });
      lV39Facturacion_tfacvtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tfacvtowwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tfacvtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tfacvtowwds_1_filterfulltext), "%", "") ;
      lV39Facturacion_tfacvtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Facturacion_tfacvtowwds_1_filterfulltext), "%", "") ;
      lV40Facturacion_tfacvtowwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV40Facturacion_tfacvtowwds_2_tfemprcod), 3, "%") ;
      lV42Facturacion_tfacvtowwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV42Facturacion_tfacvtowwds_4_tfemprnom), 30, "%") ;
      /* Using cursor P09Z73 */
      pr_default.execute(1, new Object[] {lV39Facturacion_tfacvtowwds_1_filterfulltext, lV39Facturacion_tfacvtowwds_1_filterfulltext, lV39Facturacion_tfacvtowwds_1_filterfulltext, lV40Facturacion_tfacvtowwds_2_tfemprcod, AV41Facturacion_tfacvtowwds_3_tfemprcod_sel, lV42Facturacion_tfacvtowwds_4_tfemprnom, AV43Facturacion_tfacvtowwds_5_tfemprnom_sel, Integer.valueOf(AV44Facturacion_tfacvtowwds_6_tffaccod), Integer.valueOf(AV45Facturacion_tfacvtowwds_7_tffaccod_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9Z74 = false ;
         A407EmprNom = P09Z73_A407EmprNom[0] ;
         n407EmprNom = P09Z73_n407EmprNom[0] ;
         A430FacCod = P09Z73_A430FacCod[0] ;
         A396EmprCod = P09Z73_A396EmprCod[0] ;
         A407EmprNom = P09Z73_A407EmprNom[0] ;
         n407EmprNom = P09Z73_n407EmprNom[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09Z73_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk9Z74 = false ;
            A430FacCod = P09Z73_A430FacCod[0] ;
            A396EmprCod = P09Z73_A396EmprCod[0] ;
            AV22count = (long)(AV22count+1) ;
            brk9Z74 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A407EmprNom)==0) )
         {
            AV17Option = A407EmprNom ;
            AV18Options.add(AV17Option, 0);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9Z74 )
         {
            brk9Z74 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tfacvtowwgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = tfacvtowwgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = tfacvtowwgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31OptionsJson = "" ;
      AV32OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34FilterFullText = "" ;
      AV10TFEmprCod = "" ;
      AV11TFEmprCod_Sel = "" ;
      AV12TFEmprNom = "" ;
      AV13TFEmprNom_Sel = "" ;
      A396EmprCod = "" ;
      AV39Facturacion_tfacvtowwds_1_filterfulltext = "" ;
      AV40Facturacion_tfacvtowwds_2_tfemprcod = "" ;
      AV41Facturacion_tfacvtowwds_3_tfemprcod_sel = "" ;
      AV42Facturacion_tfacvtowwds_4_tfemprnom = "" ;
      AV43Facturacion_tfacvtowwds_5_tfemprnom_sel = "" ;
      scmdbuf = "" ;
      lV39Facturacion_tfacvtowwds_1_filterfulltext = "" ;
      lV40Facturacion_tfacvtowwds_2_tfemprcod = "" ;
      lV42Facturacion_tfacvtowwds_4_tfemprnom = "" ;
      A407EmprNom = "" ;
      P09Z72_A396EmprCod = new String[] {""} ;
      P09Z72_A430FacCod = new int[1] ;
      P09Z72_A407EmprNom = new String[] {""} ;
      P09Z72_n407EmprNom = new boolean[] {false} ;
      AV17Option = "" ;
      AV19OptionDesc = "" ;
      P09Z73_A407EmprNom = new String[] {""} ;
      P09Z73_n407EmprNom = new boolean[] {false} ;
      P09Z73_A430FacCod = new int[1] ;
      P09Z73_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacvtowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09Z72_A396EmprCod, P09Z72_A430FacCod, P09Z72_A407EmprNom, P09Z72_n407EmprNom
            }
            , new Object[] {
            P09Z73_A407EmprNom, P09Z73_n407EmprNom, P09Z73_A430FacCod, P09Z73_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV37GXV1 ;
   private int AV14TFFacCod ;
   private int AV15TFFacCod_To ;
   private int AV44Facturacion_tfacvtowwds_6_tffaccod ;
   private int AV45Facturacion_tfacvtowwds_7_tffaccod_to ;
   private int A430FacCod ;
   private long AV22count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String A396EmprCod ;
   private String AV40Facturacion_tfacvtowwds_2_tfemprcod ;
   private String AV41Facturacion_tfacvtowwds_3_tfemprcod_sel ;
   private String AV42Facturacion_tfacvtowwds_4_tfemprnom ;
   private String AV43Facturacion_tfacvtowwds_5_tfemprnom_sel ;
   private String scmdbuf ;
   private String lV40Facturacion_tfacvtowwds_2_tfemprcod ;
   private String lV42Facturacion_tfacvtowwds_4_tfemprnom ;
   private String A407EmprNom ;
   private boolean returnInSub ;
   private boolean brk9Z72 ;
   private boolean n407EmprNom ;
   private boolean brk9Z74 ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV39Facturacion_tfacvtowwds_1_filterfulltext ;
   private String lV39Facturacion_tfacvtowwds_1_filterfulltext ;
   private String AV17Option ;
   private String AV19OptionDesc ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09Z72_A396EmprCod ;
   private int[] P09Z72_A430FacCod ;
   private String[] P09Z72_A407EmprNom ;
   private boolean[] P09Z72_n407EmprNom ;
   private String[] P09Z73_A407EmprNom ;
   private boolean[] P09Z73_n407EmprNom ;
   private int[] P09Z73_A430FacCod ;
   private String[] P09Z73_A396EmprCod ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class tfacvtowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09Z72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Facturacion_tfacvtowwds_1_filterfulltext ,
                                          String AV41Facturacion_tfacvtowwds_3_tfemprcod_sel ,
                                          String AV40Facturacion_tfacvtowwds_2_tfemprcod ,
                                          String AV43Facturacion_tfacvtowwds_5_tfemprnom_sel ,
                                          String AV42Facturacion_tfacvtowwds_4_tfemprnom ,
                                          int AV44Facturacion_tfacvtowwds_6_tffaccod ,
                                          int AV45Facturacion_tfacvtowwds_7_tffaccod_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A430FacCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FacCod, T2.EmprNom FROM (TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV39Facturacion_tfacvtowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Facturacion_tfacvtowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV40Facturacion_tfacvtowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Facturacion_tfacvtowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Facturacion_tfacvtowwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV42Facturacion_tfacvtowwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Facturacion_tfacvtowwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV44Facturacion_tfacvtowwds_6_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV45Facturacion_tfacvtowwds_7_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09Z73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Facturacion_tfacvtowwds_1_filterfulltext ,
                                          String AV41Facturacion_tfacvtowwds_3_tfemprcod_sel ,
                                          String AV40Facturacion_tfacvtowwds_2_tfemprcod ,
                                          String AV43Facturacion_tfacvtowwds_5_tfemprnom_sel ,
                                          String AV42Facturacion_tfacvtowwds_4_tfemprnom ,
                                          int AV44Facturacion_tfacvtowwds_6_tffaccod ,
                                          int AV45Facturacion_tfacvtowwds_7_tffaccod_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          int A430FacCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T2.EmprNom, T1.FacCod, T1.EmprCod FROM (TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ! (GXutil.strcmp("", AV39Facturacion_tfacvtowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T2.EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Facturacion_tfacvtowwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV40Facturacion_tfacvtowwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Facturacion_tfacvtowwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Facturacion_tfacvtowwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV42Facturacion_tfacvtowwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Facturacion_tfacvtowwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.EmprNom = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV44Facturacion_tfacvtowwds_6_tffaccod) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV45Facturacion_tfacvtowwds_7_tffaccod_to) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.EmprNom" ;
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
                  return conditional_P09Z72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() );
            case 1 :
                  return conditional_P09Z73(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09Z72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09Z73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
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
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
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
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
      }
   }

}

