package app.comprasquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpedidowwgetfilterdata extends GXProcedure
{
   public tpedidowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedidowwgetfilterdata.class ), "" );
   }

   public tpedidowwgetfilterdata( int remoteHandle ,
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
      tpedidowwgetfilterdata.this.aP5 = new String[] {""};
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
      tpedidowwgetfilterdata.this.AV62DDOName = aP0;
      tpedidowwgetfilterdata.this.AV60SearchTxt = aP1;
      tpedidowwgetfilterdata.this.AV61SearchTxtTo = aP2;
      tpedidowwgetfilterdata.this.aP3 = aP3;
      tpedidowwgetfilterdata.this.aP4 = aP4;
      tpedidowwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV62DDOName), "DDO_PRVNOM") == 0 )
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
      AV66OptionsJson = AV65Options.toJSonString(false) ;
      AV69OptionsDescJson = AV68OptionsDesc.toJSonString(false) ;
      AV71OptionIndexesJson = AV70OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV73Session.getValue("ComprasQuimicos.TPEDIDOWWGridState"), "") == 0 )
      {
         AV75GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ComprasQuimicos.TPEDIDOWWGridState"), null, null);
      }
      else
      {
         AV75GridState.fromxml(AV73Session.getValue("ComprasQuimicos.TPEDIDOWWGridState"), null, null);
      }
      AV104GXV1 = 1 ;
      while ( AV104GXV1 <= AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV76GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV75GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV104GXV1));
         if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PEDSIT") == 0 )
         {
            AV95PedSit = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV100FilterFullText = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV12TFPedCod = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFPedCod_To = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV14TFPrvNum = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPrvNum_To = (int)(GXutil.lval( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV16TFPrvNom = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV17TFPrvNom_Sel = AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFEC") == 0 )
         {
            AV24TFPedFec = localUtil.ctod( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV25TFPedFec_To = localUtil.ctod( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDFECENT") == 0 )
         {
            AV26TFPedFecEnt = localUtil.ctod( AV76GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV104GXV1 = (int)(AV104GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrvNom = AV60SearchTxt ;
      AV17TFPrvNom_Sel = "" ;
      AV106Comprasquimicos_tpedidowwds_1_pedsit = AV95PedSit ;
      AV107Comprasquimicos_tpedidowwds_2_filterfulltext = AV100FilterFullText ;
      AV108Comprasquimicos_tpedidowwds_3_tfpedcod = AV12TFPedCod ;
      AV109Comprasquimicos_tpedidowwds_4_tfpedcod_to = AV13TFPedCod_To ;
      AV110Comprasquimicos_tpedidowwds_5_tfprvnum = AV14TFPrvNum ;
      AV111Comprasquimicos_tpedidowwds_6_tfprvnum_to = AV15TFPrvNum_To ;
      AV112Comprasquimicos_tpedidowwds_7_tfprvnom = AV16TFPrvNom ;
      AV113Comprasquimicos_tpedidowwds_8_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV114Comprasquimicos_tpedidowwds_9_tfpedfec = AV24TFPedFec ;
      AV115Comprasquimicos_tpedidowwds_10_tfpedfec_to = AV25TFPedFec_To ;
      AV116Comprasquimicos_tpedidowwds_11_tfpedfecent = AV26TFPedFecEnt ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV106Comprasquimicos_tpedidowwds_1_pedsit ,
                                           AV107Comprasquimicos_tpedidowwds_2_filterfulltext ,
                                           Integer.valueOf(AV108Comprasquimicos_tpedidowwds_3_tfpedcod) ,
                                           Integer.valueOf(AV109Comprasquimicos_tpedidowwds_4_tfpedcod_to) ,
                                           Integer.valueOf(AV110Comprasquimicos_tpedidowwds_5_tfprvnum) ,
                                           Integer.valueOf(AV111Comprasquimicos_tpedidowwds_6_tfprvnum_to) ,
                                           AV113Comprasquimicos_tpedidowwds_8_tfprvnom_sel ,
                                           AV112Comprasquimicos_tpedidowwds_7_tfprvnom ,
                                           AV114Comprasquimicos_tpedidowwds_9_tfpedfec ,
                                           AV115Comprasquimicos_tpedidowwds_10_tfpedfec_to ,
                                           AV116Comprasquimicos_tpedidowwds_11_tfpedfecent ,
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
      lV106Comprasquimicos_tpedidowwds_1_pedsit = GXutil.padr( GXutil.rtrim( AV106Comprasquimicos_tpedidowwds_1_pedsit), 1, "%") ;
      lV107Comprasquimicos_tpedidowwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Comprasquimicos_tpedidowwds_2_filterfulltext), "%", "") ;
      lV107Comprasquimicos_tpedidowwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Comprasquimicos_tpedidowwds_2_filterfulltext), "%", "") ;
      lV107Comprasquimicos_tpedidowwds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV107Comprasquimicos_tpedidowwds_2_filterfulltext), "%", "") ;
      lV112Comprasquimicos_tpedidowwds_7_tfprvnom = GXutil.padr( GXutil.rtrim( AV112Comprasquimicos_tpedidowwds_7_tfprvnom), 30, "%") ;
      /* Using cursor P08OL2 */
      pr_default.execute(0, new Object[] {lV106Comprasquimicos_tpedidowwds_1_pedsit, lV107Comprasquimicos_tpedidowwds_2_filterfulltext, lV107Comprasquimicos_tpedidowwds_2_filterfulltext, lV107Comprasquimicos_tpedidowwds_2_filterfulltext, Integer.valueOf(AV108Comprasquimicos_tpedidowwds_3_tfpedcod), Integer.valueOf(AV109Comprasquimicos_tpedidowwds_4_tfpedcod_to), Integer.valueOf(AV110Comprasquimicos_tpedidowwds_5_tfprvnum), Integer.valueOf(AV111Comprasquimicos_tpedidowwds_6_tfprvnum_to), lV112Comprasquimicos_tpedidowwds_7_tfprvnom, AV113Comprasquimicos_tpedidowwds_8_tfprvnom_sel, AV114Comprasquimicos_tpedidowwds_9_tfpedfec, AV115Comprasquimicos_tpedidowwds_10_tfpedfec_to, AV116Comprasquimicos_tpedidowwds_11_tfpedfecent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8OL2 = false ;
         A795PrvNum = P08OL2_A795PrvNum[0] ;
         A396EmprCod = P08OL2_A396EmprCod[0] ;
         A667PedSit = P08OL2_A667PedSit[0] ;
         A662PedFecEnt = P08OL2_A662PedFecEnt[0] ;
         A661PedFec = P08OL2_A661PedFec[0] ;
         A794PrvNom = P08OL2_A794PrvNom[0] ;
         n794PrvNom = P08OL2_n794PrvNom[0] ;
         A658PedCod = P08OL2_A658PedCod[0] ;
         A794PrvNom = P08OL2_A794PrvNom[0] ;
         n794PrvNom = P08OL2_n794PrvNom[0] ;
         AV72count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08OL2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08OL2_A795PrvNum[0] == A795PrvNum ) )
         {
            brk8OL2 = false ;
            A658PedCod = P08OL2_A658PedCod[0] ;
            AV72count = (long)(AV72count+1) ;
            brk8OL2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
         {
            AV64Option = A794PrvNom ;
            AV63InsertIndex = 1 ;
            while ( ( AV63InsertIndex <= AV65Options.size() ) && ( GXutil.strcmp((String)AV65Options.elementAt(-1+AV63InsertIndex), AV64Option) < 0 ) )
            {
               AV63InsertIndex = (int)(AV63InsertIndex+1) ;
            }
            AV65Options.add(AV64Option, AV63InsertIndex);
            AV70OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV72count), "Z,ZZZ,ZZZ,ZZ9")), AV63InsertIndex);
         }
         if ( AV65Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OL2 )
         {
            brk8OL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tpedidowwgetfilterdata.this.AV66OptionsJson;
      this.aP4[0] = tpedidowwgetfilterdata.this.AV69OptionsDescJson;
      this.aP5[0] = tpedidowwgetfilterdata.this.AV71OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV66OptionsJson = "" ;
      AV69OptionsDescJson = "" ;
      AV71OptionIndexesJson = "" ;
      AV65Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV73Session = httpContext.getWebSession();
      AV75GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV76GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV95PedSit = "" ;
      AV100FilterFullText = "" ;
      AV16TFPrvNom = "" ;
      AV17TFPrvNom_Sel = "" ;
      AV24TFPedFec = GXutil.nullDate() ;
      AV25TFPedFec_To = GXutil.nullDate() ;
      AV26TFPedFecEnt = GXutil.nullDate() ;
      A794PrvNom = "" ;
      AV106Comprasquimicos_tpedidowwds_1_pedsit = "" ;
      AV107Comprasquimicos_tpedidowwds_2_filterfulltext = "" ;
      AV112Comprasquimicos_tpedidowwds_7_tfprvnom = "" ;
      AV113Comprasquimicos_tpedidowwds_8_tfprvnom_sel = "" ;
      AV114Comprasquimicos_tpedidowwds_9_tfpedfec = GXutil.nullDate() ;
      AV115Comprasquimicos_tpedidowwds_10_tfpedfec_to = GXutil.nullDate() ;
      AV116Comprasquimicos_tpedidowwds_11_tfpedfecent = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV106Comprasquimicos_tpedidowwds_1_pedsit = "" ;
      lV107Comprasquimicos_tpedidowwds_2_filterfulltext = "" ;
      lV112Comprasquimicos_tpedidowwds_7_tfprvnom = "" ;
      A667PedSit = "" ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      P08OL2_A795PrvNum = new int[1] ;
      P08OL2_A396EmprCod = new String[] {""} ;
      P08OL2_A667PedSit = new String[] {""} ;
      P08OL2_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08OL2_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08OL2_A794PrvNom = new String[] {""} ;
      P08OL2_n794PrvNom = new boolean[] {false} ;
      P08OL2_A658PedCod = new int[1] ;
      A396EmprCod = "" ;
      AV64Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.comprasquimicos.tpedidowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08OL2_A795PrvNum, P08OL2_A396EmprCod, P08OL2_A667PedSit, P08OL2_A662PedFecEnt, P08OL2_A661PedFec, P08OL2_A794PrvNom, P08OL2_n794PrvNom, P08OL2_A658PedCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV104GXV1 ;
   private int AV12TFPedCod ;
   private int AV13TFPedCod_To ;
   private int AV14TFPrvNum ;
   private int AV15TFPrvNum_To ;
   private int AV108Comprasquimicos_tpedidowwds_3_tfpedcod ;
   private int AV109Comprasquimicos_tpedidowwds_4_tfpedcod_to ;
   private int AV110Comprasquimicos_tpedidowwds_5_tfprvnum ;
   private int AV111Comprasquimicos_tpedidowwds_6_tfprvnum_to ;
   private int A658PedCod ;
   private int A795PrvNum ;
   private int AV63InsertIndex ;
   private long AV72count ;
   private String AV95PedSit ;
   private String AV16TFPrvNom ;
   private String AV17TFPrvNom_Sel ;
   private String A794PrvNom ;
   private String AV106Comprasquimicos_tpedidowwds_1_pedsit ;
   private String AV112Comprasquimicos_tpedidowwds_7_tfprvnom ;
   private String AV113Comprasquimicos_tpedidowwds_8_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV106Comprasquimicos_tpedidowwds_1_pedsit ;
   private String lV112Comprasquimicos_tpedidowwds_7_tfprvnom ;
   private String A667PedSit ;
   private String A396EmprCod ;
   private java.util.Date AV24TFPedFec ;
   private java.util.Date AV25TFPedFec_To ;
   private java.util.Date AV26TFPedFecEnt ;
   private java.util.Date AV114Comprasquimicos_tpedidowwds_9_tfpedfec ;
   private java.util.Date AV115Comprasquimicos_tpedidowwds_10_tfpedfec_to ;
   private java.util.Date AV116Comprasquimicos_tpedidowwds_11_tfpedfecent ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private boolean returnInSub ;
   private boolean brk8OL2 ;
   private boolean n794PrvNom ;
   private String AV66OptionsJson ;
   private String AV69OptionsDescJson ;
   private String AV71OptionIndexesJson ;
   private String AV62DDOName ;
   private String AV60SearchTxt ;
   private String AV61SearchTxtTo ;
   private String AV100FilterFullText ;
   private String AV107Comprasquimicos_tpedidowwds_2_filterfulltext ;
   private String lV107Comprasquimicos_tpedidowwds_2_filterfulltext ;
   private String AV64Option ;
   private com.genexus.webpanels.WebSession AV73Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08OL2_A795PrvNum ;
   private String[] P08OL2_A396EmprCod ;
   private String[] P08OL2_A667PedSit ;
   private java.util.Date[] P08OL2_A662PedFecEnt ;
   private java.util.Date[] P08OL2_A661PedFec ;
   private String[] P08OL2_A794PrvNom ;
   private boolean[] P08OL2_n794PrvNom ;
   private int[] P08OL2_A658PedCod ;
   private GXSimpleCollection<String> AV65Options ;
   private GXSimpleCollection<String> AV68OptionsDesc ;
   private GXSimpleCollection<String> AV70OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV75GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV76GridStateFilterValue ;
}

final  class tpedidowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08OL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV106Comprasquimicos_tpedidowwds_1_pedsit ,
                                          String AV107Comprasquimicos_tpedidowwds_2_filterfulltext ,
                                          int AV108Comprasquimicos_tpedidowwds_3_tfpedcod ,
                                          int AV109Comprasquimicos_tpedidowwds_4_tfpedcod_to ,
                                          int AV110Comprasquimicos_tpedidowwds_5_tfprvnum ,
                                          int AV111Comprasquimicos_tpedidowwds_6_tfprvnum_to ,
                                          String AV113Comprasquimicos_tpedidowwds_8_tfprvnom_sel ,
                                          String AV112Comprasquimicos_tpedidowwds_7_tfprvnom ,
                                          java.util.Date AV114Comprasquimicos_tpedidowwds_9_tfpedfec ,
                                          java.util.Date AV115Comprasquimicos_tpedidowwds_10_tfpedfec_to ,
                                          java.util.Date AV116Comprasquimicos_tpedidowwds_11_tfpedfecent ,
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
      if ( ! (GXutil.strcmp("", AV106Comprasquimicos_tpedidowwds_1_pedsit)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.PedSit) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Comprasquimicos_tpedidowwds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV108Comprasquimicos_tpedidowwds_3_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV109Comprasquimicos_tpedidowwds_4_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV110Comprasquimicos_tpedidowwds_5_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV111Comprasquimicos_tpedidowwds_6_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Comprasquimicos_tpedidowwds_8_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV112Comprasquimicos_tpedidowwds_7_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Comprasquimicos_tpedidowwds_8_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114Comprasquimicos_tpedidowwds_9_tfpedfec)) )
      {
         addWhere(sWhereString, "(T1.PedFec >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Comprasquimicos_tpedidowwds_10_tfpedfec_to)) )
      {
         addWhere(sWhereString, "(T1.PedFec <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV116Comprasquimicos_tpedidowwds_11_tfpedfecent)) )
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
                  return conditional_P08OL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

