package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmarcaswwgetfilterdata extends GXProcedure
{
   public tmarcaswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmarcaswwgetfilterdata.class ), "" );
   }

   public tmarcaswwgetfilterdata( int remoteHandle ,
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
      tmarcaswwgetfilterdata.this.aP5 = new String[] {""};
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
      tmarcaswwgetfilterdata.this.AV32DDOName = aP0;
      tmarcaswwgetfilterdata.this.AV33SearchTxt = aP1;
      tmarcaswwgetfilterdata.this.AV34SearchTxtTo = aP2;
      tmarcaswwgetfilterdata.this.aP3 = aP3;
      tmarcaswwgetfilterdata.this.aP4 = aP4;
      tmarcaswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_MARCAID") == 0 )
      {
         /* Execute user subroutine: 'LOADMARCAIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_MARCADSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMARCADSCOPTIONS' */
         S131 ();
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TMARCASWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TMARCASWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TMARCASWWGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMARCAID") == 0 )
         {
            AV14TFMarcaId = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMARCAID_SEL") == 0 )
         {
            AV15TFMarcaId_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMARCADSC") == 0 )
         {
            AV16TFMarcaDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMARCADSC_SEL") == 0 )
         {
            AV17TFMarcaDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMARCAIDOPTIONS' Routine */
      returnInSub = false ;
      AV14TFMarcaId = AV33SearchTxt ;
      AV15TFMarcaId_Sel = "" ;
      AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext = AV38FilterFullText ;
      AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid = AV14TFMarcaId ;
      AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel = AV15TFMarcaId_Sel ;
      AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc = AV16TFMarcaDsc ;
      AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel = AV17TFMarcaDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext ,
                                           AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel ,
                                           AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid ,
                                           AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel ,
                                           AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc ,
                                           A11659MarcaId ,
                                           A11660MarcaDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext), "%", "") ;
      lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext), "%", "") ;
      lV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid = GXutil.padr( GXutil.rtrim( AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid), 6, "%") ;
      lV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc = GXutil.padr( GXutil.rtrim( AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc), 60, "%") ;
      /* Using cursor P0A0U2 */
      pr_default.execute(0, new Object[] {lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext, lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext, lV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid, AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel, lV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc, AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA0U2 = false ;
         A11659MarcaId = P0A0U2_A11659MarcaId[0] ;
         A11660MarcaDsc = P0A0U2_A11660MarcaDsc[0] ;
         n11660MarcaDsc = P0A0U2_n11660MarcaDsc[0] ;
         A396EmprCod = P0A0U2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A0U2_A11659MarcaId[0], A11659MarcaId) == 0 ) )
         {
            brkA0U2 = false ;
            A396EmprCod = P0A0U2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkA0U2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11659MarcaId)==0) )
         {
            AV21Option = A11659MarcaId ;
            AV23OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A11659MarcaId, "@!"))) ;
            AV22Options.add(AV21Option, 0);
            AV24OptionsDesc.add(AV23OptionDesc, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA0U2 )
         {
            brkA0U2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMARCADSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMarcaDsc = AV33SearchTxt ;
      AV17TFMarcaDsc_Sel = "" ;
      AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext = AV38FilterFullText ;
      AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid = AV14TFMarcaId ;
      AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel = AV15TFMarcaId_Sel ;
      AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc = AV16TFMarcaDsc ;
      AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel = AV17TFMarcaDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext ,
                                           AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel ,
                                           AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid ,
                                           AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel ,
                                           AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc ,
                                           A11659MarcaId ,
                                           A11660MarcaDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext), "%", "") ;
      lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext), "%", "") ;
      lV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid = GXutil.padr( GXutil.rtrim( AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid), 6, "%") ;
      lV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc = GXutil.padr( GXutil.rtrim( AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc), 60, "%") ;
      /* Using cursor P0A0U3 */
      pr_default.execute(1, new Object[] {lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext, lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext, lV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid, AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel, lV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc, AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA0U4 = false ;
         A11660MarcaDsc = P0A0U3_A11660MarcaDsc[0] ;
         n11660MarcaDsc = P0A0U3_n11660MarcaDsc[0] ;
         A11659MarcaId = P0A0U3_A11659MarcaId[0] ;
         A396EmprCod = P0A0U3_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A0U3_A11660MarcaDsc[0], A11660MarcaDsc) == 0 ) )
         {
            brkA0U4 = false ;
            A11659MarcaId = P0A0U3_A11659MarcaId[0] ;
            A396EmprCod = P0A0U3_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkA0U4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A11660MarcaDsc)==0) )
         {
            AV21Option = A11660MarcaDsc ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA0U4 )
         {
            brkA0U4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmarcaswwgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = tmarcaswwgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = tmarcaswwgetfilterdata.this.AV37OptionIndexesJson;
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
      AV38FilterFullText = "" ;
      AV14TFMarcaId = "" ;
      AV15TFMarcaId_Sel = "" ;
      AV16TFMarcaDsc = "" ;
      AV17TFMarcaDsc_Sel = "" ;
      A11659MarcaId = "" ;
      AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext = "" ;
      AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid = "" ;
      AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel = "" ;
      AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc = "" ;
      AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel = "" ;
      scmdbuf = "" ;
      lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext = "" ;
      lV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid = "" ;
      lV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc = "" ;
      A11660MarcaDsc = "" ;
      P0A0U2_A11659MarcaId = new String[] {""} ;
      P0A0U2_A11660MarcaDsc = new String[] {""} ;
      P0A0U2_n11660MarcaDsc = new boolean[] {false} ;
      P0A0U2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV21Option = "" ;
      AV23OptionDesc = "" ;
      P0A0U3_A11660MarcaDsc = new String[] {""} ;
      P0A0U3_n11660MarcaDsc = new boolean[] {false} ;
      P0A0U3_A11659MarcaId = new String[] {""} ;
      P0A0U3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tmarcaswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A0U2_A11659MarcaId, P0A0U2_A11660MarcaDsc, P0A0U2_n11660MarcaDsc, P0A0U2_A396EmprCod
            }
            , new Object[] {
            P0A0U3_A11660MarcaDsc, P0A0U3_n11660MarcaDsc, P0A0U3_A11659MarcaId, P0A0U3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV41GXV1 ;
   private long AV26count ;
   private String AV14TFMarcaId ;
   private String AV15TFMarcaId_Sel ;
   private String AV16TFMarcaDsc ;
   private String AV17TFMarcaDsc_Sel ;
   private String A11659MarcaId ;
   private String AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid ;
   private String AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel ;
   private String AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc ;
   private String AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel ;
   private String scmdbuf ;
   private String lV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid ;
   private String lV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc ;
   private String A11660MarcaDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA0U2 ;
   private boolean n11660MarcaDsc ;
   private boolean brkA0U4 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext ;
   private String lV43Ficherosbasicos_tmarcaswwds_1_filterfulltext ;
   private String AV21Option ;
   private String AV23OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A0U2_A11659MarcaId ;
   private String[] P0A0U2_A11660MarcaDsc ;
   private boolean[] P0A0U2_n11660MarcaDsc ;
   private String[] P0A0U2_A396EmprCod ;
   private String[] P0A0U3_A11660MarcaDsc ;
   private boolean[] P0A0U3_n11660MarcaDsc ;
   private String[] P0A0U3_A11659MarcaId ;
   private String[] P0A0U3_A396EmprCod ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tmarcaswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A0U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext ,
                                          String AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel ,
                                          String AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid ,
                                          String AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel ,
                                          String AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc ,
                                          String A11659MarcaId ,
                                          String A11660MarcaDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MarcaId, MarcaDsc, EmprCod FROM TXPMARCAS" ;
      if ( ! (GXutil.strcmp("", AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MarcaId) like '%' || UPPER(?)) or ( UPPER(MarcaDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel)==0) && ( ! (GXutil.strcmp("", AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MarcaId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel)==0) )
      {
         addWhere(sWhereString, "(MarcaId = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MarcaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel)==0) )
      {
         addWhere(sWhereString, "(MarcaDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MarcaId" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A0U3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext ,
                                          String AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel ,
                                          String AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid ,
                                          String AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel ,
                                          String AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc ,
                                          String A11659MarcaId ,
                                          String A11660MarcaDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT MarcaDsc, MarcaId, EmprCod FROM TXPMARCAS" ;
      if ( ! (GXutil.strcmp("", AV43Ficherosbasicos_tmarcaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MarcaId) like '%' || UPPER(?)) or ( UPPER(MarcaDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel)==0) && ( ! (GXutil.strcmp("", AV44Ficherosbasicos_tmarcaswwds_2_tfmarcaid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MarcaId) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Ficherosbasicos_tmarcaswwds_3_tfmarcaid_sel)==0) )
      {
         addWhere(sWhereString, "(MarcaId = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Ficherosbasicos_tmarcaswwds_4_tfmarcadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MarcaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Ficherosbasicos_tmarcaswwds_5_tfmarcadsc_sel)==0) )
      {
         addWhere(sWhereString, "(MarcaDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MarcaDsc" ;
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
                  return conditional_P0A0U2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P0A0U3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A0U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A0U3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
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
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 60);
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
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 60);
               }
               return;
      }
   }

}

