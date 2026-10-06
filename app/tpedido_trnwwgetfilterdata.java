package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpedido_trnwwgetfilterdata extends GXProcedure
{
   public tpedido_trnwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedido_trnwwgetfilterdata.class ), "" );
   }

   public tpedido_trnwwgetfilterdata( int remoteHandle ,
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
      tpedido_trnwwgetfilterdata.this.aP5 = new String[] {""};
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
      tpedido_trnwwgetfilterdata.this.AV32DDOName = aP0;
      tpedido_trnwwgetfilterdata.this.AV33SearchTxt = aP1;
      tpedido_trnwwgetfilterdata.this.AV34SearchTxtTo = aP2;
      tpedido_trnwwgetfilterdata.this.aP3 = aP3;
      tpedido_trnwwgetfilterdata.this.aP4 = aP4;
      tpedido_trnwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV35OptionsJson = AV22Options.toJSonString(false) ;
      AV36OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV25OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("TPEDIDO_TrnWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPEDIDO_TrnWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TPEDIDO_TrnWWGridState"), null, null);
      }
      AV42GXV1 = 1 ;
      while ( AV42GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV42GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PEDSIT") == 0 )
         {
            AV38PedSit = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV39FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV10TFPedCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPedCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV12TFPrvNum = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFPrvNum_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV14TFPrvNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV15TFPrvNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV16TFPedFec = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV17TFPedFec_To = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV18TFPedFecEnt = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV42GXV1 = (int)(AV42GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrvNom = AV33SearchTxt ;
      AV15TFPrvNom_Sel = "" ;
      AV44Tpedido_trnwwds_1_pedsit = AV38PedSit ;
      AV45Tpedido_trnwwds_2_filterfulltext = AV39FilterFullText ;
      AV46Tpedido_trnwwds_3_tfpedcod = AV10TFPedCod ;
      AV47Tpedido_trnwwds_4_tfpedcod_to = AV11TFPedCod_To ;
      AV48Tpedido_trnwwds_5_tfprvnum = AV12TFPrvNum ;
      AV49Tpedido_trnwwds_6_tfprvnum_to = AV13TFPrvNum_To ;
      AV50Tpedido_trnwwds_7_tfprvnom = AV14TFPrvNom ;
      AV51Tpedido_trnwwds_8_tfprvnom_sel = AV15TFPrvNom_Sel ;
      AV52Tpedido_trnwwds_9_tfpedfec = AV16TFPedFec ;
      AV53Tpedido_trnwwds_10_tfpedfec_to = AV17TFPedFec_To ;
      AV54Tpedido_trnwwds_11_tfpedfecent = AV18TFPedFecEnt ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Tpedido_trnwwds_1_pedsit ,
                                           AV45Tpedido_trnwwds_2_filterfulltext ,
                                           Integer.valueOf(AV46Tpedido_trnwwds_3_tfpedcod) ,
                                           Integer.valueOf(AV47Tpedido_trnwwds_4_tfpedcod_to) ,
                                           Integer.valueOf(AV48Tpedido_trnwwds_5_tfprvnum) ,
                                           Integer.valueOf(AV49Tpedido_trnwwds_6_tfprvnum_to) ,
                                           AV51Tpedido_trnwwds_8_tfprvnom_sel ,
                                           AV50Tpedido_trnwwds_7_tfprvnom ,
                                           AV52Tpedido_trnwwds_9_tfpedfec ,
                                           AV53Tpedido_trnwwds_10_tfpedfec_to ,
                                           AV54Tpedido_trnwwds_11_tfpedfecent ,
                                           A667PedSit ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A661PedFec ,
                                           A662PedFecEnt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV44Tpedido_trnwwds_1_pedsit = GXutil.padr( GXutil.rtrim( AV44Tpedido_trnwwds_1_pedsit), 1, "%") ;
      lV45Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tpedido_trnwwds_2_filterfulltext), "%", "") ;
      lV45Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tpedido_trnwwds_2_filterfulltext), "%", "") ;
      lV45Tpedido_trnwwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Tpedido_trnwwds_2_filterfulltext), "%", "") ;
      lV50Tpedido_trnwwds_7_tfprvnom = GXutil.padr( GXutil.rtrim( AV50Tpedido_trnwwds_7_tfprvnom), 30, "%") ;
      /* Using cursor P09XJ2 */
      pr_default.execute(0, new Object[] {lV44Tpedido_trnwwds_1_pedsit, lV45Tpedido_trnwwds_2_filterfulltext, lV45Tpedido_trnwwds_2_filterfulltext, lV45Tpedido_trnwwds_2_filterfulltext, Integer.valueOf(AV46Tpedido_trnwwds_3_tfpedcod), Integer.valueOf(AV47Tpedido_trnwwds_4_tfpedcod_to), Integer.valueOf(AV48Tpedido_trnwwds_5_tfprvnum), Integer.valueOf(AV49Tpedido_trnwwds_6_tfprvnum_to), lV50Tpedido_trnwwds_7_tfprvnom, AV51Tpedido_trnwwds_8_tfprvnom_sel, AV52Tpedido_trnwwds_9_tfpedfec, AV53Tpedido_trnwwds_10_tfpedfec_to, AV54Tpedido_trnwwds_11_tfpedfecent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9XJ2 = false ;
         A795PrvNum = P09XJ2_A795PrvNum[0] ;
         A396EmprCod = P09XJ2_A396EmprCod[0] ;
         A667PedSit = P09XJ2_A667PedSit[0] ;
         A662PedFecEnt = P09XJ2_A662PedFecEnt[0] ;
         A661PedFec = P09XJ2_A661PedFec[0] ;
         A794PrvNom = P09XJ2_A794PrvNom[0] ;
         n794PrvNom = P09XJ2_n794PrvNom[0] ;
         A658PedCod = P09XJ2_A658PedCod[0] ;
         A794PrvNom = P09XJ2_A794PrvNom[0] ;
         n794PrvNom = P09XJ2_n794PrvNom[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09XJ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09XJ2_A795PrvNum[0] == A795PrvNum ) )
         {
            brk9XJ2 = false ;
            A658PedCod = P09XJ2_A658PedCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9XJ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
         {
            AV21Option = A794PrvNom ;
            AV20InsertIndex = 1 ;
            while ( ( AV20InsertIndex <= AV22Options.size() ) && ( GXutil.strcmp((String)AV22Options.elementAt(-1+AV20InsertIndex), AV21Option) < 0 ) )
            {
               AV20InsertIndex = (int)(AV20InsertIndex+1) ;
            }
            AV22Options.add(AV21Option, AV20InsertIndex);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), AV20InsertIndex);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9XJ2 )
         {
            brk9XJ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tpedido_trnwwgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = tpedido_trnwwgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = tpedido_trnwwgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35OptionsJson = "" ;
      AV36OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38PedSit = "" ;
      AV39FilterFullText = "" ;
      AV14TFPrvNom = "" ;
      AV15TFPrvNom_Sel = "" ;
      AV16TFPedFec = GXutil.nullDate() ;
      AV17TFPedFec_To = GXutil.nullDate() ;
      AV18TFPedFecEnt = GXutil.nullDate() ;
      A794PrvNom = "" ;
      AV44Tpedido_trnwwds_1_pedsit = "" ;
      AV45Tpedido_trnwwds_2_filterfulltext = "" ;
      AV50Tpedido_trnwwds_7_tfprvnom = "" ;
      AV51Tpedido_trnwwds_8_tfprvnom_sel = "" ;
      AV52Tpedido_trnwwds_9_tfpedfec = GXutil.nullDate() ;
      AV53Tpedido_trnwwds_10_tfpedfec_to = GXutil.nullDate() ;
      AV54Tpedido_trnwwds_11_tfpedfecent = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV44Tpedido_trnwwds_1_pedsit = "" ;
      lV45Tpedido_trnwwds_2_filterfulltext = "" ;
      lV50Tpedido_trnwwds_7_tfprvnom = "" ;
      A667PedSit = "" ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      P09XJ2_A795PrvNum = new int[1] ;
      P09XJ2_A396EmprCod = new String[] {""} ;
      P09XJ2_A667PedSit = new String[] {""} ;
      P09XJ2_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09XJ2_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09XJ2_A794PrvNom = new String[] {""} ;
      P09XJ2_n794PrvNom = new boolean[] {false} ;
      P09XJ2_A658PedCod = new int[1] ;
      A396EmprCod = "" ;
      AV21Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedido_trnwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09XJ2_A795PrvNum, P09XJ2_A396EmprCod, P09XJ2_A667PedSit, P09XJ2_A662PedFecEnt, P09XJ2_A661PedFec, P09XJ2_A794PrvNom, P09XJ2_n794PrvNom, P09XJ2_A658PedCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV42GXV1 ;
   private int AV10TFPedCod ;
   private int AV11TFPedCod_To ;
   private int AV12TFPrvNum ;
   private int AV13TFPrvNum_To ;
   private int AV46Tpedido_trnwwds_3_tfpedcod ;
   private int AV47Tpedido_trnwwds_4_tfpedcod_to ;
   private int AV48Tpedido_trnwwds_5_tfprvnum ;
   private int AV49Tpedido_trnwwds_6_tfprvnum_to ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int AV20InsertIndex ;
   private long AV26count ;
   private String AV38PedSit ;
   private String AV14TFPrvNom ;
   private String AV15TFPrvNom_Sel ;
   private String A794PrvNom ;
   private String AV44Tpedido_trnwwds_1_pedsit ;
   private String AV50Tpedido_trnwwds_7_tfprvnom ;
   private String AV51Tpedido_trnwwds_8_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV44Tpedido_trnwwds_1_pedsit ;
   private String lV50Tpedido_trnwwds_7_tfprvnom ;
   private String A667PedSit ;
   private String A396EmprCod ;
   private java.util.Date AV16TFPedFec ;
   private java.util.Date AV17TFPedFec_To ;
   private java.util.Date AV18TFPedFecEnt ;
   private java.util.Date AV52Tpedido_trnwwds_9_tfpedfec ;
   private java.util.Date AV53Tpedido_trnwwds_10_tfpedfec_to ;
   private java.util.Date AV54Tpedido_trnwwds_11_tfpedfecent ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private boolean returnInSub ;
   private boolean brk9XJ2 ;
   private boolean n794PrvNom ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV39FilterFullText ;
   private String AV45Tpedido_trnwwds_2_filterfulltext ;
   private String lV45Tpedido_trnwwds_2_filterfulltext ;
   private String AV21Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09XJ2_A795PrvNum ;
   private String[] P09XJ2_A396EmprCod ;
   private String[] P09XJ2_A667PedSit ;
   private java.util.Date[] P09XJ2_A662PedFecEnt ;
   private java.util.Date[] P09XJ2_A661PedFec ;
   private String[] P09XJ2_A794PrvNom ;
   private boolean[] P09XJ2_n794PrvNom ;
   private int[] P09XJ2_A658PedCod ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tpedido_trnwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09XJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Tpedido_trnwwds_1_pedsit ,
                                          String AV45Tpedido_trnwwds_2_filterfulltext ,
                                          int AV46Tpedido_trnwwds_3_tfpedcod ,
                                          int AV47Tpedido_trnwwds_4_tfpedcod_to ,
                                          int AV48Tpedido_trnwwds_5_tfprvnum ,
                                          int AV49Tpedido_trnwwds_6_tfprvnum_to ,
                                          String AV51Tpedido_trnwwds_8_tfprvnom_sel ,
                                          String AV50Tpedido_trnwwds_7_tfprvnom ,
                                          java.util.Date AV52Tpedido_trnwwds_9_tfpedfec ,
                                          java.util.Date AV53Tpedido_trnwwds_10_tfpedfec_to ,
                                          java.util.Date AV54Tpedido_trnwwds_11_tfpedfecent ,
                                          String A667PedSit ,
                                          int A658PedCod ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.util.Date A661PedFec ,
                                          java.util.Date A662PedFecEnt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.EmprCod, T1.PedSit, T1.PedFecEnt, T1.PedFec, T2.PrvNom, T1.PedCod FROM (TXPCPEDID T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV44Tpedido_trnwwds_1_pedsit)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedSit) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Tpedido_trnwwds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV46Tpedido_trnwwds_3_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV47Tpedido_trnwwds_4_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV48Tpedido_trnwwds_5_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV49Tpedido_trnwwds_6_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Tpedido_trnwwds_8_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Tpedido_trnwwds_7_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Tpedido_trnwwds_8_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52Tpedido_trnwwds_9_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Tpedido_trnwwds_10_tfpedfec_to)) )
      {
         addWhere(sWhereString, "(T1.PedFec <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Tpedido_trnwwds_11_tfpedfecent)) )
      {
         addWhere(sWhereString, "(T1.PedFecEnt >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum" ;
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
                  return conditional_P09XJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
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
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               return;
      }
   }

}

