package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tempparwwgetfilterdata extends GXProcedure
{
   public tempparwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tempparwwgetfilterdata.class ), "" );
   }

   public tempparwwgetfilterdata( int remoteHandle ,
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
      tempparwwgetfilterdata.this.aP5 = new String[] {""};
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
      tempparwwgetfilterdata.this.AV28DDOName = aP0;
      tempparwwgetfilterdata.this.AV29SearchTxt = aP1;
      tempparwwgetfilterdata.this.AV30SearchTxtTo = aP2;
      tempparwwgetfilterdata.this.aP3 = aP3;
      tempparwwgetfilterdata.this.aP4 = aP4;
      tempparwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV23Session.getValue("TEMPPARWWGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TEMPPARWWGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("TEMPPARWWGridState"), null, null);
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
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPNUMDEC") == 0 )
         {
            AV14TFEmpNumDec = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFEmpNumDec_To = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
      AV39Tempparwwds_1_filterfulltext = AV34FilterFullText ;
      AV40Tempparwwds_2_tfemprcod = AV10TFEmprCod ;
      AV41Tempparwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV42Tempparwwds_4_tfemprnom = AV12TFEmprNom ;
      AV43Tempparwwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV44Tempparwwds_6_tfempnumdec = AV14TFEmpNumDec ;
      AV45Tempparwwds_7_tfempnumdec_to = AV15TFEmpNumDec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Tempparwwds_1_filterfulltext ,
                                           AV41Tempparwwds_3_tfemprcod_sel ,
                                           AV40Tempparwwds_2_tfemprcod ,
                                           AV43Tempparwwds_5_tfemprnom_sel ,
                                           AV42Tempparwwds_4_tfemprnom ,
                                           Byte.valueOf(AV44Tempparwwds_6_tfempnumdec) ,
                                           Byte.valueOf(AV45Tempparwwds_7_tfempnumdec_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Byte.valueOf(A3915EmpNumDec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV39Tempparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Tempparwwds_1_filterfulltext), "%", "") ;
      lV39Tempparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Tempparwwds_1_filterfulltext), "%", "") ;
      lV39Tempparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Tempparwwds_1_filterfulltext), "%", "") ;
      lV40Tempparwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV40Tempparwwds_2_tfemprcod), 3, "%") ;
      lV42Tempparwwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV42Tempparwwds_4_tfemprnom), 30, "%") ;
      /* Using cursor P08P02 */
      pr_default.execute(0, new Object[] {lV39Tempparwwds_1_filterfulltext, lV39Tempparwwds_1_filterfulltext, lV39Tempparwwds_1_filterfulltext, lV40Tempparwwds_2_tfemprcod, AV41Tempparwwds_3_tfemprcod_sel, lV42Tempparwwds_4_tfemprnom, AV43Tempparwwds_5_tfemprnom_sel, Byte.valueOf(AV44Tempparwwds_6_tfempnumdec), Byte.valueOf(AV45Tempparwwds_7_tfempnumdec_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P08P02_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P08P02_n3915EmpNumDec[0] ;
         A407EmprNom = P08P02_A407EmprNom[0] ;
         n407EmprNom = P08P02_n407EmprNom[0] ;
         A396EmprCod = P08P02_A396EmprCod[0] ;
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV17Option = A396EmprCod ;
            AV19OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV18Options.add(AV17Option, 0);
            AV20OptionsDesc.add(AV19OptionDesc, 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADEMPRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprNom = AV29SearchTxt ;
      AV13TFEmprNom_Sel = "" ;
      AV39Tempparwwds_1_filterfulltext = AV34FilterFullText ;
      AV40Tempparwwds_2_tfemprcod = AV10TFEmprCod ;
      AV41Tempparwwds_3_tfemprcod_sel = AV11TFEmprCod_Sel ;
      AV42Tempparwwds_4_tfemprnom = AV12TFEmprNom ;
      AV43Tempparwwds_5_tfemprnom_sel = AV13TFEmprNom_Sel ;
      AV44Tempparwwds_6_tfempnumdec = AV14TFEmpNumDec ;
      AV45Tempparwwds_7_tfempnumdec_to = AV15TFEmpNumDec_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV39Tempparwwds_1_filterfulltext ,
                                           AV41Tempparwwds_3_tfemprcod_sel ,
                                           AV40Tempparwwds_2_tfemprcod ,
                                           AV43Tempparwwds_5_tfemprnom_sel ,
                                           AV42Tempparwwds_4_tfemprnom ,
                                           Byte.valueOf(AV44Tempparwwds_6_tfempnumdec) ,
                                           Byte.valueOf(AV45Tempparwwds_7_tfempnumdec_to) ,
                                           A396EmprCod ,
                                           A407EmprNom ,
                                           Byte.valueOf(A3915EmpNumDec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN
                                           }
      });
      lV39Tempparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Tempparwwds_1_filterfulltext), "%", "") ;
      lV39Tempparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Tempparwwds_1_filterfulltext), "%", "") ;
      lV39Tempparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Tempparwwds_1_filterfulltext), "%", "") ;
      lV40Tempparwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV40Tempparwwds_2_tfemprcod), 3, "%") ;
      lV42Tempparwwds_4_tfemprnom = GXutil.padr( GXutil.rtrim( AV42Tempparwwds_4_tfemprnom), 30, "%") ;
      /* Using cursor P08P03 */
      pr_default.execute(1, new Object[] {lV39Tempparwwds_1_filterfulltext, lV39Tempparwwds_1_filterfulltext, lV39Tempparwwds_1_filterfulltext, lV40Tempparwwds_2_tfemprcod, AV41Tempparwwds_3_tfemprcod_sel, lV42Tempparwwds_4_tfemprnom, AV43Tempparwwds_5_tfemprnom_sel, Byte.valueOf(AV44Tempparwwds_6_tfempnumdec), Byte.valueOf(AV45Tempparwwds_7_tfempnumdec_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8P03 = false ;
         A407EmprNom = P08P03_A407EmprNom[0] ;
         n407EmprNom = P08P03_n407EmprNom[0] ;
         A3915EmpNumDec = P08P03_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P08P03_n3915EmpNumDec[0] ;
         A396EmprCod = P08P03_A396EmprCod[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08P03_A407EmprNom[0], A407EmprNom) == 0 ) )
         {
            brk8P03 = false ;
            A396EmprCod = P08P03_A396EmprCod[0] ;
            AV22count = (long)(AV22count+1) ;
            brk8P03 = true ;
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
         if ( ! brk8P03 )
         {
            brk8P03 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tempparwwgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = tempparwwgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = tempparwwgetfilterdata.this.AV33OptionIndexesJson;
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
      AV39Tempparwwds_1_filterfulltext = "" ;
      AV40Tempparwwds_2_tfemprcod = "" ;
      AV41Tempparwwds_3_tfemprcod_sel = "" ;
      AV42Tempparwwds_4_tfemprnom = "" ;
      AV43Tempparwwds_5_tfemprnom_sel = "" ;
      scmdbuf = "" ;
      lV39Tempparwwds_1_filterfulltext = "" ;
      lV40Tempparwwds_2_tfemprcod = "" ;
      lV42Tempparwwds_4_tfemprnom = "" ;
      A407EmprNom = "" ;
      P08P02_A3915EmpNumDec = new byte[1] ;
      P08P02_n3915EmpNumDec = new boolean[] {false} ;
      P08P02_A407EmprNom = new String[] {""} ;
      P08P02_n407EmprNom = new boolean[] {false} ;
      P08P02_A396EmprCod = new String[] {""} ;
      AV17Option = "" ;
      AV19OptionDesc = "" ;
      P08P03_A407EmprNom = new String[] {""} ;
      P08P03_n407EmprNom = new boolean[] {false} ;
      P08P03_A3915EmpNumDec = new byte[1] ;
      P08P03_n3915EmpNumDec = new boolean[] {false} ;
      P08P03_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tempparwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08P02_A3915EmpNumDec, P08P02_n3915EmpNumDec, P08P02_A407EmprNom, P08P02_n407EmprNom, P08P02_A396EmprCod
            }
            , new Object[] {
            P08P03_A407EmprNom, P08P03_n407EmprNom, P08P03_A3915EmpNumDec, P08P03_n3915EmpNumDec, P08P03_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFEmpNumDec ;
   private byte AV15TFEmpNumDec_To ;
   private byte AV44Tempparwwds_6_tfempnumdec ;
   private byte AV45Tempparwwds_7_tfempnumdec_to ;
   private byte A3915EmpNumDec ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV22count ;
   private String AV10TFEmprCod ;
   private String AV11TFEmprCod_Sel ;
   private String AV12TFEmprNom ;
   private String AV13TFEmprNom_Sel ;
   private String A396EmprCod ;
   private String AV40Tempparwwds_2_tfemprcod ;
   private String AV41Tempparwwds_3_tfemprcod_sel ;
   private String AV42Tempparwwds_4_tfemprnom ;
   private String AV43Tempparwwds_5_tfemprnom_sel ;
   private String scmdbuf ;
   private String lV40Tempparwwds_2_tfemprcod ;
   private String lV42Tempparwwds_4_tfemprnom ;
   private String A407EmprNom ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private boolean n407EmprNom ;
   private boolean brk8P03 ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV39Tempparwwds_1_filterfulltext ;
   private String lV39Tempparwwds_1_filterfulltext ;
   private String AV17Option ;
   private String AV19OptionDesc ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08P02_A3915EmpNumDec ;
   private boolean[] P08P02_n3915EmpNumDec ;
   private String[] P08P02_A407EmprNom ;
   private boolean[] P08P02_n407EmprNom ;
   private String[] P08P02_A396EmprCod ;
   private String[] P08P03_A407EmprNom ;
   private boolean[] P08P03_n407EmprNom ;
   private byte[] P08P03_A3915EmpNumDec ;
   private boolean[] P08P03_n3915EmpNumDec ;
   private String[] P08P03_A396EmprCod ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class tempparwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08P02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Tempparwwds_1_filterfulltext ,
                                          String AV41Tempparwwds_3_tfemprcod_sel ,
                                          String AV40Tempparwwds_2_tfemprcod ,
                                          String AV43Tempparwwds_5_tfemprnom_sel ,
                                          String AV42Tempparwwds_4_tfemprnom ,
                                          byte AV44Tempparwwds_6_tfempnumdec ,
                                          byte AV45Tempparwwds_7_tfempnumdec_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          byte A3915EmpNumDec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS EmpNumDec, NULL AS EmprNom, EmprCod FROM ( SELECT EmpNumDec, EmprNom, EmprCod FROM TXPEMPRES" ;
      if ( ! (GXutil.strcmp("", AV39Tempparwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( UPPER(EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(EmpNumDec,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Tempparwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV40Tempparwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Tempparwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Tempparwwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV42Tempparwwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Tempparwwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(EmprNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV44Tempparwwds_6_tfempnumdec) )
      {
         addWhere(sWhereString, "(EmpNumDec >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV45Tempparwwds_7_tfempnumdec_to) )
      {
         addWhere(sWhereString, "(EmpNumDec <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08P03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Tempparwwds_1_filterfulltext ,
                                          String AV41Tempparwwds_3_tfemprcod_sel ,
                                          String AV40Tempparwwds_2_tfemprcod ,
                                          String AV43Tempparwwds_5_tfemprnom_sel ,
                                          String AV42Tempparwwds_4_tfemprnom ,
                                          byte AV44Tempparwwds_6_tfempnumdec ,
                                          byte AV45Tempparwwds_7_tfempnumdec_to ,
                                          String A396EmprCod ,
                                          String A407EmprNom ,
                                          byte A3915EmpNumDec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprNom, EmpNumDec, EmprCod FROM TXPEMPRES" ;
      if ( ! (GXutil.strcmp("", AV39Tempparwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( UPPER(EmprNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(EmpNumDec,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Tempparwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV40Tempparwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Tempparwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Tempparwwds_5_tfemprnom_sel)==0) && ( ! (GXutil.strcmp("", AV42Tempparwwds_4_tfemprnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Tempparwwds_5_tfemprnom_sel)==0) )
      {
         addWhere(sWhereString, "(EmprNom = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV44Tempparwwds_6_tfempnumdec) )
      {
         addWhere(sWhereString, "(EmpNumDec >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV45Tempparwwds_7_tfempnumdec_to) )
      {
         addWhere(sWhereString, "(EmpNumDec <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprNom" ;
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
                  return conditional_P08P02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() );
            case 1 :
                  return conditional_P08P03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08P02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08P03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
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
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               return;
      }
   }

}

