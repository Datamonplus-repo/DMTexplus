package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcwuti118_comprasgetfilterdata extends GXProcedure
{
   public wcwcwuti118_comprasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcwuti118_comprasgetfilterdata.class ), "" );
   }

   public wcwcwuti118_comprasgetfilterdata( int remoteHandle ,
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
      wcwcwuti118_comprasgetfilterdata.this.aP5 = new String[] {""};
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
      wcwcwuti118_comprasgetfilterdata.this.AV18DDOName = aP0;
      wcwcwuti118_comprasgetfilterdata.this.AV16SearchTxt = aP1;
      wcwcwuti118_comprasgetfilterdata.this.AV17SearchTxtTo = aP2;
      wcwcwuti118_comprasgetfilterdata.this.aP3 = aP3;
      wcwcwuti118_comprasgetfilterdata.this.aP4 = aP4;
      wcwcwuti118_comprasgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_ENTNALBAR") == 0 )
      {
         /* Execute user subroutine: 'LOADENTNALBAROPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV29Session.getValue("WCWCWUti118_ComprasGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWCWUti118_ComprasGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WCWCWUti118_ComprasGridState"), null, null);
      }
      AV86GXV1 = 1 ;
      while ( AV86GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV86GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV10TFPedCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPedCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTNALBAR") == 0 )
         {
            AV12TFEntNAlbar = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTNALBAR_SEL") == 0 )
         {
            AV13TFEntNAlbar_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV14TFEntUniEnt = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFEntUniEnt_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV40TFEntFecEnt = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV36Prdnum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELOTE") == 0 )
         {
            AV37Hrelote = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV38Fec1 = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV39Fec2 = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV86GXV1 = (int)(AV86GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADENTNALBAROPTIONS' Routine */
      returnInSub = false ;
      AV12TFEntNAlbar = AV16SearchTxt ;
      AV13TFEntNAlbar_Sel = "" ;
      AV88Wcwcwuti118_comprasds_1_filterfulltext = AV34FilterFullText ;
      AV89Wcwcwuti118_comprasds_2_tfpedcod = AV10TFPedCod ;
      AV90Wcwcwuti118_comprasds_3_tfpedcod_to = AV11TFPedCod_To ;
      AV91Wcwcwuti118_comprasds_4_tfentnalbar = AV12TFEntNAlbar ;
      AV92Wcwcwuti118_comprasds_5_tfentnalbar_sel = AV13TFEntNAlbar_Sel ;
      AV93Wcwcwuti118_comprasds_6_tfentunient = AV14TFEntUniEnt ;
      AV94Wcwcwuti118_comprasds_7_tfentunient_to = AV15TFEntUniEnt_To ;
      AV95Wcwcwuti118_comprasds_8_tfentfecent = AV40TFEntFecEnt ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV88Wcwcwuti118_comprasds_1_filterfulltext ,
                                           Integer.valueOf(AV89Wcwcwuti118_comprasds_2_tfpedcod) ,
                                           Integer.valueOf(AV90Wcwcwuti118_comprasds_3_tfpedcod_to) ,
                                           AV92Wcwcwuti118_comprasds_5_tfentnalbar_sel ,
                                           AV91Wcwcwuti118_comprasds_4_tfentnalbar ,
                                           AV93Wcwcwuti118_comprasds_6_tfentunient ,
                                           AV94Wcwcwuti118_comprasds_7_tfentunient_to ,
                                           AV95Wcwcwuti118_comprasds_8_tfentfecent ,
                                           Integer.valueOf(A658PedCod) ,
                                           A12857EntNAlbar ,
                                           A418EntUniEnt ,
                                           A415EntFecEnt ,
                                           AV38Fec1 ,
                                           AV39Fec2 ,
                                           A11Albaran ,
                                           A396EmprCod ,
                                           AV35Emprcod ,
                                           A719PrdNum ,
                                           AV36Prdnum ,
                                           A5686EntLotN ,
                                           AV37Hrelote } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV88Wcwcwuti118_comprasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcwcwuti118_comprasds_1_filterfulltext), "%", "") ;
      lV88Wcwcwuti118_comprasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcwcwuti118_comprasds_1_filterfulltext), "%", "") ;
      lV88Wcwcwuti118_comprasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcwcwuti118_comprasds_1_filterfulltext), "%", "") ;
      lV91Wcwcwuti118_comprasds_4_tfentnalbar = GXutil.padr( GXutil.rtrim( AV91Wcwcwuti118_comprasds_4_tfentnalbar), 20, "%") ;
      /* Using cursor P08XG2 */
      pr_default.execute(0, new Object[] {AV38Fec1, AV39Fec2, AV35Emprcod, AV36Prdnum, AV37Hrelote, lV88Wcwcwuti118_comprasds_1_filterfulltext, lV88Wcwcwuti118_comprasds_1_filterfulltext, lV88Wcwcwuti118_comprasds_1_filterfulltext, Integer.valueOf(AV89Wcwcwuti118_comprasds_2_tfpedcod), Integer.valueOf(AV90Wcwcwuti118_comprasds_3_tfpedcod_to), lV91Wcwcwuti118_comprasds_4_tfentnalbar, AV92Wcwcwuti118_comprasds_5_tfentnalbar_sel, AV93Wcwcwuti118_comprasds_6_tfentunient, AV94Wcwcwuti118_comprasds_7_tfentunient_to, AV95Wcwcwuti118_comprasds_8_tfentfecent});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8XG2 = false ;
         A396EmprCod = P08XG2_A396EmprCod[0] ;
         A719PrdNum = P08XG2_A719PrdNum[0] ;
         A5686EntLotN = P08XG2_A5686EntLotN[0] ;
         A12857EntNAlbar = P08XG2_A12857EntNAlbar[0] ;
         A11Albaran = P08XG2_A11Albaran[0] ;
         A415EntFecEnt = P08XG2_A415EntFecEnt[0] ;
         A418EntUniEnt = P08XG2_A418EntUniEnt[0] ;
         A658PedCod = P08XG2_A658PedCod[0] ;
         n658PedCod = P08XG2_n658PedCod[0] ;
         A597LinEnt = P08XG2_A597LinEnt[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08XG2_A12857EntNAlbar[0], A12857EntNAlbar) == 0 ) )
         {
            brk8XG2 = false ;
            A396EmprCod = P08XG2_A396EmprCod[0] ;
            A719PrdNum = P08XG2_A719PrdNum[0] ;
            A597LinEnt = P08XG2_A597LinEnt[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8XG2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A12857EntNAlbar)==0) )
         {
            AV20Option = A12857EntNAlbar ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8XG2 )
         {
            brk8XG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwcwuti118_comprasgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcwcwuti118_comprasgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcwcwuti118_comprasgetfilterdata.this.AV27OptionIndexesJson;
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
      AV34FilterFullText = "" ;
      AV12TFEntNAlbar = "" ;
      AV13TFEntNAlbar_Sel = "" ;
      AV14TFEntUniEnt = DecimalUtil.ZERO ;
      AV15TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV40TFEntFecEnt = GXutil.nullDate() ;
      AV35Emprcod = "" ;
      AV36Prdnum = "" ;
      AV37Hrelote = "" ;
      AV38Fec1 = GXutil.nullDate() ;
      AV39Fec2 = GXutil.nullDate() ;
      A12857EntNAlbar = "" ;
      AV88Wcwcwuti118_comprasds_1_filterfulltext = "" ;
      AV91Wcwcwuti118_comprasds_4_tfentnalbar = "" ;
      AV92Wcwcwuti118_comprasds_5_tfentnalbar_sel = "" ;
      AV93Wcwcwuti118_comprasds_6_tfentunient = DecimalUtil.ZERO ;
      AV94Wcwcwuti118_comprasds_7_tfentunient_to = DecimalUtil.ZERO ;
      AV95Wcwcwuti118_comprasds_8_tfentfecent = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV88Wcwcwuti118_comprasds_1_filterfulltext = "" ;
      lV91Wcwcwuti118_comprasds_4_tfentnalbar = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A415EntFecEnt = GXutil.nullDate() ;
      A11Albaran = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A5686EntLotN = "" ;
      P08XG2_A396EmprCod = new String[] {""} ;
      P08XG2_A719PrdNum = new String[] {""} ;
      P08XG2_A5686EntLotN = new String[] {""} ;
      P08XG2_A12857EntNAlbar = new String[] {""} ;
      P08XG2_A11Albaran = new String[] {""} ;
      P08XG2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08XG2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XG2_A658PedCod = new int[1] ;
      P08XG2_n658PedCod = new boolean[] {false} ;
      P08XG2_A597LinEnt = new short[1] ;
      AV20Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcwuti118_comprasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08XG2_A396EmprCod, P08XG2_A719PrdNum, P08XG2_A5686EntLotN, P08XG2_A12857EntNAlbar, P08XG2_A11Albaran, P08XG2_A415EntFecEnt, P08XG2_A418EntUniEnt, P08XG2_A658PedCod, P08XG2_n658PedCod, P08XG2_A597LinEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A597LinEnt ;
   private short Gx_err ;
   private int AV86GXV1 ;
   private int AV10TFPedCod ;
   private int AV11TFPedCod_To ;
   private int AV89Wcwcwuti118_comprasds_2_tfpedcod ;
   private int AV90Wcwcwuti118_comprasds_3_tfpedcod_to ;
   private int A658PedCod ;
   private long AV28count ;
   private java.math.BigDecimal AV14TFEntUniEnt ;
   private java.math.BigDecimal AV15TFEntUniEnt_To ;
   private java.math.BigDecimal AV93Wcwcwuti118_comprasds_6_tfentunient ;
   private java.math.BigDecimal AV94Wcwcwuti118_comprasds_7_tfentunient_to ;
   private java.math.BigDecimal A418EntUniEnt ;
   private String AV12TFEntNAlbar ;
   private String AV13TFEntNAlbar_Sel ;
   private String AV35Emprcod ;
   private String AV36Prdnum ;
   private String AV37Hrelote ;
   private String A12857EntNAlbar ;
   private String AV91Wcwcwuti118_comprasds_4_tfentnalbar ;
   private String AV92Wcwcwuti118_comprasds_5_tfentnalbar_sel ;
   private String scmdbuf ;
   private String lV91Wcwcwuti118_comprasds_4_tfentnalbar ;
   private String A11Albaran ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A5686EntLotN ;
   private java.util.Date AV40TFEntFecEnt ;
   private java.util.Date AV38Fec1 ;
   private java.util.Date AV39Fec2 ;
   private java.util.Date AV95Wcwcwuti118_comprasds_8_tfentfecent ;
   private java.util.Date A415EntFecEnt ;
   private boolean returnInSub ;
   private boolean brk8XG2 ;
   private boolean n658PedCod ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV88Wcwcwuti118_comprasds_1_filterfulltext ;
   private String lV88Wcwcwuti118_comprasds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08XG2_A396EmprCod ;
   private String[] P08XG2_A719PrdNum ;
   private String[] P08XG2_A5686EntLotN ;
   private String[] P08XG2_A12857EntNAlbar ;
   private String[] P08XG2_A11Albaran ;
   private java.util.Date[] P08XG2_A415EntFecEnt ;
   private java.math.BigDecimal[] P08XG2_A418EntUniEnt ;
   private int[] P08XG2_A658PedCod ;
   private boolean[] P08XG2_n658PedCod ;
   private short[] P08XG2_A597LinEnt ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcwcwuti118_comprasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08XG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV88Wcwcwuti118_comprasds_1_filterfulltext ,
                                          int AV89Wcwcwuti118_comprasds_2_tfpedcod ,
                                          int AV90Wcwcwuti118_comprasds_3_tfpedcod_to ,
                                          String AV92Wcwcwuti118_comprasds_5_tfentnalbar_sel ,
                                          String AV91Wcwcwuti118_comprasds_4_tfentnalbar ,
                                          java.math.BigDecimal AV93Wcwcwuti118_comprasds_6_tfentunient ,
                                          java.math.BigDecimal AV94Wcwcwuti118_comprasds_7_tfentunient_to ,
                                          java.util.Date AV95Wcwcwuti118_comprasds_8_tfentfecent ,
                                          int A658PedCod ,
                                          String A12857EntNAlbar ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.util.Date A415EntFecEnt ,
                                          java.util.Date AV38Fec1 ,
                                          java.util.Date AV39Fec2 ,
                                          String A11Albaran ,
                                          String A396EmprCod ,
                                          String AV35Emprcod ,
                                          String A719PrdNum ,
                                          String AV36Prdnum ,
                                          String A5686EntLotN ,
                                          String AV37Hrelote )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, EntLotN, EntNAlbar, Albaran, EntFecEnt, EntUniEnt, PedCod, LinEnt FROM TXPENTALM" ;
      addWhere(sWhereString, "(EntFecEnt >= ?)");
      addWhere(sWhereString, "(EntFecEnt <= ?)");
      addWhere(sWhereString, "(SUBSTR(Albaran, 1, 3) <> 'REC')");
      addWhere(sWhereString, "(SUBSTR(Albaran, 1, 3) <> 'INV')");
      addWhere(sWhereString, "(SUBSTR(Albaran, 1, 2) <> 'AD')");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(EntLotN = ?)");
      if ( ! (GXutil.strcmp("", AV88Wcwcwuti118_comprasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(PedCod,'99999990'), 2) like '%' || ?) or ( UPPER(EntNAlbar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(EntUniEnt,'999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV89Wcwcwuti118_comprasds_2_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV90Wcwcwuti118_comprasds_3_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Wcwcwuti118_comprasds_5_tfentnalbar_sel)==0) && ( ! (GXutil.strcmp("", AV91Wcwcwuti118_comprasds_4_tfentnalbar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntNAlbar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Wcwcwuti118_comprasds_5_tfentnalbar_sel)==0) )
      {
         addWhere(sWhereString, "(EntNAlbar = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wcwcwuti118_comprasds_6_tfentunient)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Wcwcwuti118_comprasds_7_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Wcwcwuti118_comprasds_8_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EntNAlbar" ;
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
                  return conditional_P08XG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
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
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               return;
      }
   }

}

