package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdivisawwgetfilterdata extends GXProcedure
{
   public tdivisawwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdivisawwgetfilterdata.class ), "" );
   }

   public tdivisawwgetfilterdata( int remoteHandle ,
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
      tdivisawwgetfilterdata.this.aP5 = new String[] {""};
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
      tdivisawwgetfilterdata.this.AV30DDOName = aP0;
      tdivisawwgetfilterdata.this.AV28SearchTxt = aP1;
      tdivisawwgetfilterdata.this.AV29SearchTxtTo = aP2;
      tdivisawwgetfilterdata.this.aP3 = aP3;
      tdivisawwgetfilterdata.this.aP4 = aP4;
      tdivisawwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_DIVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADDIVNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_DIVABR") == 0 )
      {
         /* Execute user subroutine: 'LOADDIVABROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("FicherosBasicos.TDIVISAWWGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TDIVISAWWGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("FicherosBasicos.TDIVISAWWGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV57FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIVCOD") == 0 )
         {
            AV10TFDivCod = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDivCod_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIVNOM") == 0 )
         {
            AV12TFDivNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIVNOM_SEL") == 0 )
         {
            AV13TFDivNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIVABR") == 0 )
         {
            AV14TFDivAbr = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIVABR_SEL") == 0 )
         {
            AV15TFDivAbr_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDIVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFDivNom = AV28SearchTxt ;
      AV13TFDivNom_Sel = "" ;
      AV62Ficherosbasicos_tdivisawwds_1_filterfulltext = AV57FilterFullText ;
      AV63Ficherosbasicos_tdivisawwds_2_tfdivcod = AV10TFDivCod ;
      AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to = AV11TFDivCod_To ;
      AV65Ficherosbasicos_tdivisawwds_4_tfdivnom = AV12TFDivNom ;
      AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel = AV13TFDivNom_Sel ;
      AV67Ficherosbasicos_tdivisawwds_6_tfdivabr = AV14TFDivAbr ;
      AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel = AV15TFDivAbr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV62Ficherosbasicos_tdivisawwds_1_filterfulltext ,
                                           Byte.valueOf(AV63Ficherosbasicos_tdivisawwds_2_tfdivcod) ,
                                           Byte.valueOf(AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to) ,
                                           AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel ,
                                           AV65Ficherosbasicos_tdivisawwds_4_tfdivnom ,
                                           AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel ,
                                           AV67Ficherosbasicos_tdivisawwds_6_tfdivabr ,
                                           Byte.valueOf(A3099DivCod) ,
                                           A3100DivNom ,
                                           A3101DivAbr } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV62Ficherosbasicos_tdivisawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Ficherosbasicos_tdivisawwds_1_filterfulltext), "%", "") ;
      lV62Ficherosbasicos_tdivisawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Ficherosbasicos_tdivisawwds_1_filterfulltext), "%", "") ;
      lV62Ficherosbasicos_tdivisawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Ficherosbasicos_tdivisawwds_1_filterfulltext), "%", "") ;
      lV65Ficherosbasicos_tdivisawwds_4_tfdivnom = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tdivisawwds_4_tfdivnom), 30, "%") ;
      lV67Ficherosbasicos_tdivisawwds_6_tfdivabr = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tdivisawwds_6_tfdivabr), 6, "%") ;
      /* Using cursor P07Z32 */
      pr_default.execute(0, new Object[] {lV62Ficherosbasicos_tdivisawwds_1_filterfulltext, lV62Ficherosbasicos_tdivisawwds_1_filterfulltext, lV62Ficherosbasicos_tdivisawwds_1_filterfulltext, Byte.valueOf(AV63Ficherosbasicos_tdivisawwds_2_tfdivcod), Byte.valueOf(AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to), lV65Ficherosbasicos_tdivisawwds_4_tfdivnom, AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel, lV67Ficherosbasicos_tdivisawwds_6_tfdivabr, AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7Z32 = false ;
         A3100DivNom = P07Z32_A3100DivNom[0] ;
         n3100DivNom = P07Z32_n3100DivNom[0] ;
         A3101DivAbr = P07Z32_A3101DivAbr[0] ;
         n3101DivAbr = P07Z32_n3101DivAbr[0] ;
         A3099DivCod = P07Z32_A3099DivCod[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07Z32_A3100DivNom[0], A3100DivNom) == 0 ) )
         {
            brk7Z32 = false ;
            A3099DivCod = P07Z32_A3099DivCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk7Z32 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A3100DivNom)==0) )
         {
            AV32Option = A3100DivNom ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7Z32 )
         {
            brk7Z32 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDIVABROPTIONS' Routine */
      returnInSub = false ;
      AV14TFDivAbr = AV28SearchTxt ;
      AV15TFDivAbr_Sel = "" ;
      AV62Ficherosbasicos_tdivisawwds_1_filterfulltext = AV57FilterFullText ;
      AV63Ficherosbasicos_tdivisawwds_2_tfdivcod = AV10TFDivCod ;
      AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to = AV11TFDivCod_To ;
      AV65Ficherosbasicos_tdivisawwds_4_tfdivnom = AV12TFDivNom ;
      AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel = AV13TFDivNom_Sel ;
      AV67Ficherosbasicos_tdivisawwds_6_tfdivabr = AV14TFDivAbr ;
      AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel = AV15TFDivAbr_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV62Ficherosbasicos_tdivisawwds_1_filterfulltext ,
                                           Byte.valueOf(AV63Ficherosbasicos_tdivisawwds_2_tfdivcod) ,
                                           Byte.valueOf(AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to) ,
                                           AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel ,
                                           AV65Ficherosbasicos_tdivisawwds_4_tfdivnom ,
                                           AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel ,
                                           AV67Ficherosbasicos_tdivisawwds_6_tfdivabr ,
                                           Byte.valueOf(A3099DivCod) ,
                                           A3100DivNom ,
                                           A3101DivAbr } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV62Ficherosbasicos_tdivisawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Ficherosbasicos_tdivisawwds_1_filterfulltext), "%", "") ;
      lV62Ficherosbasicos_tdivisawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Ficherosbasicos_tdivisawwds_1_filterfulltext), "%", "") ;
      lV62Ficherosbasicos_tdivisawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Ficherosbasicos_tdivisawwds_1_filterfulltext), "%", "") ;
      lV65Ficherosbasicos_tdivisawwds_4_tfdivnom = GXutil.padr( GXutil.rtrim( AV65Ficherosbasicos_tdivisawwds_4_tfdivnom), 30, "%") ;
      lV67Ficherosbasicos_tdivisawwds_6_tfdivabr = GXutil.padr( GXutil.rtrim( AV67Ficherosbasicos_tdivisawwds_6_tfdivabr), 6, "%") ;
      /* Using cursor P07Z33 */
      pr_default.execute(1, new Object[] {lV62Ficherosbasicos_tdivisawwds_1_filterfulltext, lV62Ficherosbasicos_tdivisawwds_1_filterfulltext, lV62Ficherosbasicos_tdivisawwds_1_filterfulltext, Byte.valueOf(AV63Ficherosbasicos_tdivisawwds_2_tfdivcod), Byte.valueOf(AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to), lV65Ficherosbasicos_tdivisawwds_4_tfdivnom, AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel, lV67Ficherosbasicos_tdivisawwds_6_tfdivabr, AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk7Z34 = false ;
         A3101DivAbr = P07Z33_A3101DivAbr[0] ;
         n3101DivAbr = P07Z33_n3101DivAbr[0] ;
         A3100DivNom = P07Z33_A3100DivNom[0] ;
         n3100DivNom = P07Z33_n3100DivNom[0] ;
         A3099DivCod = P07Z33_A3099DivCod[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07Z33_A3101DivAbr[0], A3101DivAbr) == 0 ) )
         {
            brk7Z34 = false ;
            A3099DivCod = P07Z33_A3099DivCod[0] ;
            AV40count = (long)(AV40count+1) ;
            brk7Z34 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A3101DivAbr)==0) )
         {
            AV32Option = A3101DivAbr ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7Z34 )
         {
            brk7Z34 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tdivisawwgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = tdivisawwgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = tdivisawwgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV57FilterFullText = "" ;
      AV12TFDivNom = "" ;
      AV13TFDivNom_Sel = "" ;
      AV14TFDivAbr = "" ;
      AV15TFDivAbr_Sel = "" ;
      A3100DivNom = "" ;
      AV62Ficherosbasicos_tdivisawwds_1_filterfulltext = "" ;
      AV65Ficherosbasicos_tdivisawwds_4_tfdivnom = "" ;
      AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel = "" ;
      AV67Ficherosbasicos_tdivisawwds_6_tfdivabr = "" ;
      AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel = "" ;
      scmdbuf = "" ;
      lV62Ficherosbasicos_tdivisawwds_1_filterfulltext = "" ;
      lV65Ficherosbasicos_tdivisawwds_4_tfdivnom = "" ;
      lV67Ficherosbasicos_tdivisawwds_6_tfdivabr = "" ;
      A3101DivAbr = "" ;
      P07Z32_A3100DivNom = new String[] {""} ;
      P07Z32_n3100DivNom = new boolean[] {false} ;
      P07Z32_A3101DivAbr = new String[] {""} ;
      P07Z32_n3101DivAbr = new boolean[] {false} ;
      P07Z32_A3099DivCod = new byte[1] ;
      AV32Option = "" ;
      P07Z33_A3101DivAbr = new String[] {""} ;
      P07Z33_n3101DivAbr = new boolean[] {false} ;
      P07Z33_A3100DivNom = new String[] {""} ;
      P07Z33_n3100DivNom = new boolean[] {false} ;
      P07Z33_A3099DivCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tdivisawwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07Z32_A3100DivNom, P07Z32_n3100DivNom, P07Z32_A3101DivAbr, P07Z32_n3101DivAbr, P07Z32_A3099DivCod
            }
            , new Object[] {
            P07Z33_A3101DivAbr, P07Z33_n3101DivAbr, P07Z33_A3100DivNom, P07Z33_n3100DivNom, P07Z33_A3099DivCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFDivCod ;
   private byte AV11TFDivCod_To ;
   private byte AV63Ficherosbasicos_tdivisawwds_2_tfdivcod ;
   private byte AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to ;
   private byte A3099DivCod ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private long AV40count ;
   private String AV12TFDivNom ;
   private String AV13TFDivNom_Sel ;
   private String AV14TFDivAbr ;
   private String AV15TFDivAbr_Sel ;
   private String A3100DivNom ;
   private String AV65Ficherosbasicos_tdivisawwds_4_tfdivnom ;
   private String AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel ;
   private String AV67Ficherosbasicos_tdivisawwds_6_tfdivabr ;
   private String AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel ;
   private String scmdbuf ;
   private String lV65Ficherosbasicos_tdivisawwds_4_tfdivnom ;
   private String lV67Ficherosbasicos_tdivisawwds_6_tfdivabr ;
   private String A3101DivAbr ;
   private boolean returnInSub ;
   private boolean brk7Z32 ;
   private boolean n3100DivNom ;
   private boolean n3101DivAbr ;
   private boolean brk7Z34 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV57FilterFullText ;
   private String AV62Ficherosbasicos_tdivisawwds_1_filterfulltext ;
   private String lV62Ficherosbasicos_tdivisawwds_1_filterfulltext ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07Z32_A3100DivNom ;
   private boolean[] P07Z32_n3100DivNom ;
   private String[] P07Z32_A3101DivAbr ;
   private boolean[] P07Z32_n3101DivAbr ;
   private byte[] P07Z32_A3099DivCod ;
   private String[] P07Z33_A3101DivAbr ;
   private boolean[] P07Z33_n3101DivAbr ;
   private String[] P07Z33_A3100DivNom ;
   private boolean[] P07Z33_n3100DivNom ;
   private byte[] P07Z33_A3099DivCod ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class tdivisawwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07Z32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Ficherosbasicos_tdivisawwds_1_filterfulltext ,
                                          byte AV63Ficherosbasicos_tdivisawwds_2_tfdivcod ,
                                          byte AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to ,
                                          String AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel ,
                                          String AV65Ficherosbasicos_tdivisawwds_4_tfdivnom ,
                                          String AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel ,
                                          String AV67Ficherosbasicos_tdivisawwds_6_tfdivabr ,
                                          byte A3099DivCod ,
                                          String A3100DivNom ,
                                          String A3101DivAbr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DivNom, DivAbr, DivCod FROM TXPDIVISA" ;
      if ( ! (GXutil.strcmp("", AV62Ficherosbasicos_tdivisawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(DivCod,'90'), 2) like '%' || ?) or ( UPPER(DivNom) like '%' || UPPER(?)) or ( UPPER(DivAbr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV63Ficherosbasicos_tdivisawwds_2_tfdivcod) )
      {
         addWhere(sWhereString, "(DivCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to) )
      {
         addWhere(sWhereString, "(DivCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tdivisawwds_4_tfdivnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DivNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel)==0) )
      {
         addWhere(sWhereString, "(DivNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tdivisawwds_6_tfdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(DivAbr = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DivNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P07Z33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Ficherosbasicos_tdivisawwds_1_filterfulltext ,
                                          byte AV63Ficherosbasicos_tdivisawwds_2_tfdivcod ,
                                          byte AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to ,
                                          String AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel ,
                                          String AV65Ficherosbasicos_tdivisawwds_4_tfdivnom ,
                                          String AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel ,
                                          String AV67Ficherosbasicos_tdivisawwds_6_tfdivabr ,
                                          byte A3099DivCod ,
                                          String A3100DivNom ,
                                          String A3101DivAbr )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT DivAbr, DivNom, DivCod FROM TXPDIVISA" ;
      if ( ! (GXutil.strcmp("", AV62Ficherosbasicos_tdivisawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(DivCod,'90'), 2) like '%' || ?) or ( UPPER(DivNom) like '%' || UPPER(?)) or ( UPPER(DivAbr) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV63Ficherosbasicos_tdivisawwds_2_tfdivcod) )
      {
         addWhere(sWhereString, "(DivCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV64Ficherosbasicos_tdivisawwds_3_tfdivcod_to) )
      {
         addWhere(sWhereString, "(DivCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel)==0) && ( ! (GXutil.strcmp("", AV65Ficherosbasicos_tdivisawwds_4_tfdivnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DivNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Ficherosbasicos_tdivisawwds_5_tfdivnom_sel)==0) )
      {
         addWhere(sWhereString, "(DivNom = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel)==0) && ( ! (GXutil.strcmp("", AV67Ficherosbasicos_tdivisawwds_6_tfdivabr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DivAbr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Ficherosbasicos_tdivisawwds_7_tfdivabr_sel)==0) )
      {
         addWhere(sWhereString, "(DivAbr = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DivAbr" ;
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
                  return conditional_P07Z32(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P07Z33(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07Z32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07Z33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
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
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
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
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
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
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
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
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               return;
      }
   }

}

