package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwlisalcgetfilterdata extends GXProcedure
{
   public webwlisalcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwlisalcgetfilterdata.class ), "" );
   }

   public webwlisalcgetfilterdata( int remoteHandle ,
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
      webwlisalcgetfilterdata.this.aP5 = new String[] {""};
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
      webwlisalcgetfilterdata.this.AV22DDOName = aP0;
      webwlisalcgetfilterdata.this.AV20SearchTxt = aP1;
      webwlisalcgetfilterdata.this.AV21SearchTxtTo = aP2;
      webwlisalcgetfilterdata.this.aP3 = aP3;
      webwlisalcgetfilterdata.this.aP4 = aP4;
      webwlisalcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_CLINOM") == 0 )
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
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("WebWLISALCGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWLISALCGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WebWLISALCGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMPRI") == 0 )
         {
            AV38AlbComPri = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBCOMFCH") == 0 )
         {
            AV39AlbComFch = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV40AlbComFch_To = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLICOD") == 0 )
         {
            AV41CliCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42CliCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV43FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV10TFAlbComCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbComCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV12TFAlbComFch = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV20SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV48Webwlisalcds_1_albcompri = AV38AlbComPri ;
      AV49Webwlisalcds_2_albcomfch = AV39AlbComFch ;
      AV50Webwlisalcds_3_albcomfch_to = AV40AlbComFch_To ;
      AV51Webwlisalcds_4_clicod = AV41CliCod ;
      AV52Webwlisalcds_5_clicod_to = AV42CliCod_To ;
      AV53Webwlisalcds_6_filterfulltext = AV43FilterFullText ;
      AV54Webwlisalcds_7_tfalbcomcod = AV10TFAlbComCod ;
      AV55Webwlisalcds_8_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV56Webwlisalcds_9_tfalbcomfch = AV12TFAlbComFch ;
      AV57Webwlisalcds_10_tfclicod = AV14TFCliCod ;
      AV58Webwlisalcds_11_tfclicod_to = AV15TFCliCod_To ;
      AV59Webwlisalcds_12_tfclinom = AV16TFCliNom ;
      AV60Webwlisalcds_13_tfclinom_sel = AV17TFCliNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Webwlisalcds_2_albcomfch ,
                                           AV50Webwlisalcds_3_albcomfch_to ,
                                           Integer.valueOf(AV51Webwlisalcds_4_clicod) ,
                                           Integer.valueOf(AV52Webwlisalcds_5_clicod_to) ,
                                           AV53Webwlisalcds_6_filterfulltext ,
                                           Integer.valueOf(AV54Webwlisalcds_7_tfalbcomcod) ,
                                           Integer.valueOf(AV55Webwlisalcds_8_tfalbcomcod_to) ,
                                           AV56Webwlisalcds_9_tfalbcomfch ,
                                           Integer.valueOf(AV57Webwlisalcds_10_tfclicod) ,
                                           Integer.valueOf(AV58Webwlisalcds_11_tfclicod_to) ,
                                           AV60Webwlisalcds_13_tfclinom_sel ,
                                           AV59Webwlisalcds_12_tfclinom ,
                                           A17AlbComFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A279CliNom ,
                                           A22AlbComPri ,
                                           AV48Webwlisalcds_1_albcompri } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Webwlisalcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Webwlisalcds_6_filterfulltext), "%", "") ;
      lV53Webwlisalcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Webwlisalcds_6_filterfulltext), "%", "") ;
      lV53Webwlisalcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Webwlisalcds_6_filterfulltext), "%", "") ;
      lV59Webwlisalcds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV59Webwlisalcds_12_tfclinom), 30, "%") ;
      /* Using cursor P08GE2 */
      pr_default.execute(0, new Object[] {AV48Webwlisalcds_1_albcompri, AV49Webwlisalcds_2_albcomfch, AV50Webwlisalcds_3_albcomfch_to, Integer.valueOf(AV51Webwlisalcds_4_clicod), Integer.valueOf(AV52Webwlisalcds_5_clicod_to), lV53Webwlisalcds_6_filterfulltext, lV53Webwlisalcds_6_filterfulltext, lV53Webwlisalcds_6_filterfulltext, Integer.valueOf(AV54Webwlisalcds_7_tfalbcomcod), Integer.valueOf(AV55Webwlisalcds_8_tfalbcomcod_to), AV56Webwlisalcds_9_tfalbcomfch, Integer.valueOf(AV57Webwlisalcds_10_tfclicod), Integer.valueOf(AV58Webwlisalcds_11_tfclicod_to), lV59Webwlisalcds_12_tfclinom, AV60Webwlisalcds_13_tfclinom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8GE2 = false ;
         A396EmprCod = P08GE2_A396EmprCod[0] ;
         A22AlbComPri = P08GE2_A22AlbComPri[0] ;
         A279CliNom = P08GE2_A279CliNom[0] ;
         A14AlbComCod = P08GE2_A14AlbComCod[0] ;
         A252CliCod = P08GE2_A252CliCod[0] ;
         A17AlbComFch = P08GE2_A17AlbComFch[0] ;
         A279CliNom = P08GE2_A279CliNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08GE2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8GE2 = false ;
            A396EmprCod = P08GE2_A396EmprCod[0] ;
            A14AlbComCod = P08GE2_A14AlbComCod[0] ;
            A252CliCod = P08GE2_A252CliCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk8GE2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV24Option = A279CliNom ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8GE2 )
         {
            brk8GE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwlisalcgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = webwlisalcgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = webwlisalcgetfilterdata.this.AV31OptionIndexesJson;
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
      AV38AlbComPri = "" ;
      AV39AlbComFch = GXutil.nullDate() ;
      AV40AlbComFch_To = GXutil.nullDate() ;
      AV43FilterFullText = "" ;
      AV12TFAlbComFch = GXutil.nullDate() ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      A279CliNom = "" ;
      AV48Webwlisalcds_1_albcompri = "" ;
      AV49Webwlisalcds_2_albcomfch = GXutil.nullDate() ;
      AV50Webwlisalcds_3_albcomfch_to = GXutil.nullDate() ;
      AV53Webwlisalcds_6_filterfulltext = "" ;
      AV56Webwlisalcds_9_tfalbcomfch = GXutil.nullDate() ;
      AV59Webwlisalcds_12_tfclinom = "" ;
      AV60Webwlisalcds_13_tfclinom_sel = "" ;
      scmdbuf = "" ;
      lV53Webwlisalcds_6_filterfulltext = "" ;
      lV59Webwlisalcds_12_tfclinom = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A22AlbComPri = "" ;
      P08GE2_A396EmprCod = new String[] {""} ;
      P08GE2_A22AlbComPri = new String[] {""} ;
      P08GE2_A279CliNom = new String[] {""} ;
      P08GE2_A14AlbComCod = new int[1] ;
      P08GE2_A252CliCod = new int[1] ;
      P08GE2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      AV24Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwlisalcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08GE2_A396EmprCod, P08GE2_A22AlbComPri, P08GE2_A279CliNom, P08GE2_A14AlbComCod, P08GE2_A252CliCod, P08GE2_A17AlbComFch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV46GXV1 ;
   private int AV41CliCod ;
   private int AV42CliCod_To ;
   private int AV10TFAlbComCod ;
   private int AV11TFAlbComCod_To ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV51Webwlisalcds_4_clicod ;
   private int AV52Webwlisalcds_5_clicod_to ;
   private int AV54Webwlisalcds_7_tfalbcomcod ;
   private int AV55Webwlisalcds_8_tfalbcomcod_to ;
   private int AV57Webwlisalcds_10_tfclicod ;
   private int AV58Webwlisalcds_11_tfclicod_to ;
   private int A252CliCod ;
   private int A14AlbComCod ;
   private long AV32count ;
   private String AV38AlbComPri ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String A279CliNom ;
   private String AV48Webwlisalcds_1_albcompri ;
   private String AV59Webwlisalcds_12_tfclinom ;
   private String AV60Webwlisalcds_13_tfclinom_sel ;
   private String scmdbuf ;
   private String lV59Webwlisalcds_12_tfclinom ;
   private String A22AlbComPri ;
   private String A396EmprCod ;
   private java.util.Date AV39AlbComFch ;
   private java.util.Date AV40AlbComFch_To ;
   private java.util.Date AV12TFAlbComFch ;
   private java.util.Date AV49Webwlisalcds_2_albcomfch ;
   private java.util.Date AV50Webwlisalcds_3_albcomfch_to ;
   private java.util.Date AV56Webwlisalcds_9_tfalbcomfch ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean brk8GE2 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV43FilterFullText ;
   private String AV53Webwlisalcds_6_filterfulltext ;
   private String lV53Webwlisalcds_6_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08GE2_A396EmprCod ;
   private String[] P08GE2_A22AlbComPri ;
   private String[] P08GE2_A279CliNom ;
   private int[] P08GE2_A14AlbComCod ;
   private int[] P08GE2_A252CliCod ;
   private java.util.Date[] P08GE2_A17AlbComFch ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class webwlisalcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08GE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV49Webwlisalcds_2_albcomfch ,
                                          java.util.Date AV50Webwlisalcds_3_albcomfch_to ,
                                          int AV51Webwlisalcds_4_clicod ,
                                          int AV52Webwlisalcds_5_clicod_to ,
                                          String AV53Webwlisalcds_6_filterfulltext ,
                                          int AV54Webwlisalcds_7_tfalbcomcod ,
                                          int AV55Webwlisalcds_8_tfalbcomcod_to ,
                                          java.util.Date AV56Webwlisalcds_9_tfalbcomfch ,
                                          int AV57Webwlisalcds_10_tfclicod ,
                                          int AV58Webwlisalcds_11_tfclicod_to ,
                                          String AV60Webwlisalcds_13_tfclinom_sel ,
                                          String AV59Webwlisalcds_12_tfclinom ,
                                          java.util.Date A17AlbComFch ,
                                          int A252CliCod ,
                                          int A14AlbComCod ,
                                          String A279CliNom ,
                                          String A22AlbComPri ,
                                          String AV48Webwlisalcds_1_albcompri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T2.CliNom, T1.AlbComCod, T1.CliCod, T1.AlbComFch FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod" ;
      scmdbuf += " = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49Webwlisalcds_2_albcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50Webwlisalcds_3_albcomfch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Webwlisalcds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Webwlisalcds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Webwlisalcds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV54Webwlisalcds_7_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV55Webwlisalcds_8_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Webwlisalcds_9_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV57Webwlisalcds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV58Webwlisalcds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Webwlisalcds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV59Webwlisalcds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Webwlisalcds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
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
                  return conditional_P08GE2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08GE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               return;
      }
   }

}

