package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadesdelconti_maquinasgetfilterdata extends GXProcedure
{
   public consultadesdelconti_maquinasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadesdelconti_maquinasgetfilterdata.class ), "" );
   }

   public consultadesdelconti_maquinasgetfilterdata( int remoteHandle ,
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
      consultadesdelconti_maquinasgetfilterdata.this.aP5 = new String[] {""};
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
      consultadesdelconti_maquinasgetfilterdata.this.AV20DDOName = aP0;
      consultadesdelconti_maquinasgetfilterdata.this.AV18SearchTxt = aP1;
      consultadesdelconti_maquinasgetfilterdata.this.AV19SearchTxtTo = aP2;
      consultadesdelconti_maquinasgetfilterdata.this.aP3 = aP3;
      consultadesdelconti_maquinasgetfilterdata.this.aP4 = aP4;
      consultadesdelconti_maquinasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_HREMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADHREMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("FormulacionTinte.ConsultadesdeLconti_MaquinasGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ConsultadesdeLconti_MaquinasGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("FormulacionTinte.ConsultadesdeLconti_MaquinasGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV10TFHreMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV11TFHreMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV12TFHreVolPrd = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFHreVolPrd_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRENUMCIE") == 0 )
         {
            AV14TFHreNumCie = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFHreNumCie_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINMAQ") == 0 )
         {
            AV16TFHreLinMaq = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFHreLinMaq_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV37EmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV38HreBarCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV39HreBarReo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV40HreBarPar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREMAQCOD") == 0 )
         {
            AV41Hremaqcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ESTFECCIER") == 0 )
         {
            AV42EstFecCier = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFHreMaqCod = AV18SearchTxt ;
      AV11TFHreMaqCod_Sel = "" ;
      AV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = AV10TFHreMaqCod ;
      AV48Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = AV11TFHreMaqCod_Sel ;
      AV49Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd = AV12TFHreVolPrd ;
      AV50Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to = AV13TFHreVolPrd_To ;
      AV51Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie = AV14TFHreNumCie ;
      AV52Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to = AV15TFHreNumCie_To ;
      AV53Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq = AV16TFHreLinMaq ;
      AV54Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to = AV17TFHreLinMaq_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel ,
                                           AV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ,
                                           Integer.valueOf(AV49Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd) ,
                                           Integer.valueOf(AV50Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to) ,
                                           Byte.valueOf(AV51Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie) ,
                                           Byte.valueOf(AV52Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to) ,
                                           Short.valueOf(AV53Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq) ,
                                           Short.valueOf(AV54Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to) ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           A396EmprCod ,
                                           AV37EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV38HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV39HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV40HreBarPar ,
                                           A4529HreFecTin ,
                                           AV42EstFecCier ,
                                           AV41Hremaqcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      lV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod), 6, "%") ;
      /* Using cursor P09EZ2 */
      pr_default.execute(0, new Object[] {AV41Hremaqcod, AV37EmprCod, Integer.valueOf(AV38HreBarCod), Byte.valueOf(AV39HreBarReo), AV40HreBarPar, AV42EstFecCier, lV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod, AV48Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel, Integer.valueOf(AV49Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd), Integer.valueOf(AV50Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to), Byte.valueOf(AV51Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie), Byte.valueOf(AV52Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to), Short.valueOf(AV53Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq), Short.valueOf(AV54Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9EZ2 = false ;
         A396EmprCod = P09EZ2_A396EmprCod[0] ;
         A4492HreBarCod = P09EZ2_A4492HreBarCod[0] ;
         A4493HreBarReo = P09EZ2_A4493HreBarReo[0] ;
         A4494HreBarPar = P09EZ2_A4494HreBarPar[0] ;
         A4546HreMaqCod = P09EZ2_A4546HreMaqCod[0] ;
         n4546HreMaqCod = P09EZ2_n4546HreMaqCod[0] ;
         A4529HreFecTin = P09EZ2_A4529HreFecTin[0] ;
         n4529HreFecTin = P09EZ2_n4529HreFecTin[0] ;
         A4545HreLinMaq = P09EZ2_A4545HreLinMaq[0] ;
         A4495HreNumCie = P09EZ2_A4495HreNumCie[0] ;
         A4547HreVolPrd = P09EZ2_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P09EZ2_n4547HreVolPrd[0] ;
         A4529HreFecTin = P09EZ2_A4529HreFecTin[0] ;
         n4529HreFecTin = P09EZ2_n4529HreFecTin[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09EZ2_A4546HreMaqCod[0], A4546HreMaqCod) == 0 ) )
         {
            brk9EZ2 = false ;
            A396EmprCod = P09EZ2_A396EmprCod[0] ;
            A4492HreBarCod = P09EZ2_A4492HreBarCod[0] ;
            A4493HreBarReo = P09EZ2_A4493HreBarReo[0] ;
            A4494HreBarPar = P09EZ2_A4494HreBarPar[0] ;
            A4545HreLinMaq = P09EZ2_A4545HreLinMaq[0] ;
            A4495HreNumCie = P09EZ2_A4495HreNumCie[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9EZ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4546HreMaqCod)==0) )
         {
            AV22Option = A4546HreMaqCod ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EZ2 )
         {
            brk9EZ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadesdelconti_maquinasgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = consultadesdelconti_maquinasgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = consultadesdelconti_maquinasgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFHreMaqCod = "" ;
      AV11TFHreMaqCod_Sel = "" ;
      AV37EmprCod = "" ;
      AV40HreBarPar = "" ;
      AV41Hremaqcod = "" ;
      AV42EstFecCier = GXutil.nullDate() ;
      A4546HreMaqCod = "" ;
      AV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = "" ;
      AV48Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel = "" ;
      scmdbuf = "" ;
      lV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      P09EZ2_A396EmprCod = new String[] {""} ;
      P09EZ2_A4492HreBarCod = new int[1] ;
      P09EZ2_A4493HreBarReo = new byte[1] ;
      P09EZ2_A4494HreBarPar = new String[] {""} ;
      P09EZ2_A4546HreMaqCod = new String[] {""} ;
      P09EZ2_n4546HreMaqCod = new boolean[] {false} ;
      P09EZ2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P09EZ2_n4529HreFecTin = new boolean[] {false} ;
      P09EZ2_A4545HreLinMaq = new short[1] ;
      P09EZ2_A4495HreNumCie = new byte[1] ;
      P09EZ2_A4547HreVolPrd = new int[1] ;
      P09EZ2_n4547HreVolPrd = new boolean[] {false} ;
      AV22Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consultadesdelconti_maquinasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09EZ2_A396EmprCod, P09EZ2_A4492HreBarCod, P09EZ2_A4493HreBarReo, P09EZ2_A4494HreBarPar, P09EZ2_A4546HreMaqCod, P09EZ2_n4546HreMaqCod, P09EZ2_A4529HreFecTin, P09EZ2_n4529HreFecTin, P09EZ2_A4545HreLinMaq, P09EZ2_A4495HreNumCie,
            P09EZ2_A4547HreVolPrd, P09EZ2_n4547HreVolPrd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFHreNumCie ;
   private byte AV15TFHreNumCie_To ;
   private byte AV39HreBarReo ;
   private byte AV51Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie ;
   private byte AV52Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private short AV16TFHreLinMaq ;
   private short AV17TFHreLinMaq_To ;
   private short AV53Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq ;
   private short AV54Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV12TFHreVolPrd ;
   private int AV13TFHreVolPrd_To ;
   private int AV38HreBarCod ;
   private int AV49Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd ;
   private int AV50Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to ;
   private int A4547HreVolPrd ;
   private int A4492HreBarCod ;
   private long AV30count ;
   private String AV10TFHreMaqCod ;
   private String AV11TFHreMaqCod_Sel ;
   private String AV37EmprCod ;
   private String AV40HreBarPar ;
   private String AV41Hremaqcod ;
   private String A4546HreMaqCod ;
   private String AV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ;
   private String AV48Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel ;
   private String scmdbuf ;
   private String lV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private java.util.Date AV42EstFecCier ;
   private java.util.Date A4529HreFecTin ;
   private boolean returnInSub ;
   private boolean brk9EZ2 ;
   private boolean n4546HreMaqCod ;
   private boolean n4529HreFecTin ;
   private boolean n4547HreVolPrd ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09EZ2_A396EmprCod ;
   private int[] P09EZ2_A4492HreBarCod ;
   private byte[] P09EZ2_A4493HreBarReo ;
   private String[] P09EZ2_A4494HreBarPar ;
   private String[] P09EZ2_A4546HreMaqCod ;
   private boolean[] P09EZ2_n4546HreMaqCod ;
   private java.util.Date[] P09EZ2_A4529HreFecTin ;
   private boolean[] P09EZ2_n4529HreFecTin ;
   private short[] P09EZ2_A4545HreLinMaq ;
   private byte[] P09EZ2_A4495HreNumCie ;
   private int[] P09EZ2_A4547HreVolPrd ;
   private boolean[] P09EZ2_n4547HreVolPrd ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class consultadesdelconti_maquinasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel ,
                                          String AV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod ,
                                          int AV49Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd ,
                                          int AV50Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to ,
                                          byte AV51Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie ,
                                          byte AV52Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to ,
                                          short AV53Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq ,
                                          short AV54Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          String A396EmprCod ,
                                          String AV37EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV38HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV39HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV40HreBarPar ,
                                          java.util.Date A4529HreFecTin ,
                                          java.util.Date AV42EstFecCier ,
                                          String AV41Hremaqcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreMaqCod, T2.HreFecTin, T1.HreLinMaq, T1.HreNumCie, T1.HreVolPrd FROM (TXPHISREM T1 INNER JOIN TXPHISREH" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(T1.HreMaqCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.HreBarCod = ?)");
      addWhere(sWhereString, "(T1.HreBarReo = ?)");
      addWhere(sWhereString, "(T1.HreBarPar = ?)");
      addWhere(sWhereString, "(T2.HreFecTin = ?)");
      if ( (GXutil.strcmp("", AV48Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV47Formulaciontinte_consultadesdelconti_maquinasds_1_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_consultadesdelconti_maquinasds_2_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HreMaqCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_consultadesdelconti_maquinasds_3_tfhrevolprd) )
      {
         addWhere(sWhereString, "(T1.HreVolPrd >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_consultadesdelconti_maquinasds_4_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(T1.HreVolPrd <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_consultadesdelconti_maquinasds_5_tfhrenumcie) )
      {
         addWhere(sWhereString, "(T1.HreNumCie >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_consultadesdelconti_maquinasds_6_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(T1.HreNumCie <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_consultadesdelconti_maquinasds_7_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(T1.HreLinMaq >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_consultadesdelconti_maquinasds_8_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(T1.HreLinMaq <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HreMaqCod" ;
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
                  return conditional_P09EZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               return;
      }
   }

}

