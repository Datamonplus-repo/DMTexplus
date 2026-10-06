package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiarestadoalbarancomercialgetfilterdata extends GXProcedure
{
   public cambiarestadoalbarancomercialgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiarestadoalbarancomercialgetfilterdata.class ), "" );
   }

   public cambiarestadoalbarancomercialgetfilterdata( int remoteHandle ,
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
      cambiarestadoalbarancomercialgetfilterdata.this.aP5 = new String[] {""};
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
      cambiarestadoalbarancomercialgetfilterdata.this.AV24DDOName = aP0;
      cambiarestadoalbarancomercialgetfilterdata.this.AV22SearchTxt = aP1;
      cambiarestadoalbarancomercialgetfilterdata.this.AV23SearchTxtTo = aP2;
      cambiarestadoalbarancomercialgetfilterdata.this.aP3 = aP3;
      cambiarestadoalbarancomercialgetfilterdata.this.aP4 = aP4;
      cambiarestadoalbarancomercialgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_CLINOM") == 0 )
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
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("CambiarEstadoAlbaranComercialGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CambiarEstadoAlbaranComercialGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("CambiarEstadoAlbaranComercialGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV10TFAlbComCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbComCod_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFCH") == 0 )
         {
            AV12TFAlbComFch = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEST") == 0 )
         {
            AV18TFAlbComEst = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFAlbComEst_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMCOD") == 0 )
         {
            AV42AlbComCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMCOD_TO") == 0 )
         {
            AV43AlbComCod_to = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMFCH") == 0 )
         {
            AV44AlbComFch = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMFCH_TO") == 0 )
         {
            AV45AlbComFch_to = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBCOMPRI") == 0 )
         {
            AV46AlbComPri = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV22SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV51Cambiarestadoalbarancomercialds_1_filterfulltext = AV40FilterFullText ;
      AV52Cambiarestadoalbarancomercialds_2_tfalbcomcod = AV10TFAlbComCod ;
      AV53Cambiarestadoalbarancomercialds_3_tfalbcomcod_to = AV11TFAlbComCod_To ;
      AV54Cambiarestadoalbarancomercialds_4_tfalbcomfch = AV12TFAlbComFch ;
      AV55Cambiarestadoalbarancomercialds_5_tfclicod = AV14TFCliCod ;
      AV56Cambiarestadoalbarancomercialds_6_tfclicod_to = AV15TFCliCod_To ;
      AV57Cambiarestadoalbarancomercialds_7_tfclinom = AV16TFCliNom ;
      AV58Cambiarestadoalbarancomercialds_8_tfclinom_sel = AV17TFCliNom_Sel ;
      AV59Cambiarestadoalbarancomercialds_9_tfalbcomest = AV18TFAlbComEst ;
      AV60Cambiarestadoalbarancomercialds_10_tfalbcomest_to = AV19TFAlbComEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Cambiarestadoalbarancomercialds_1_filterfulltext ,
                                           Integer.valueOf(AV52Cambiarestadoalbarancomercialds_2_tfalbcomcod) ,
                                           Integer.valueOf(AV53Cambiarestadoalbarancomercialds_3_tfalbcomcod_to) ,
                                           AV54Cambiarestadoalbarancomercialds_4_tfalbcomfch ,
                                           Integer.valueOf(AV55Cambiarestadoalbarancomercialds_5_tfclicod) ,
                                           Integer.valueOf(AV56Cambiarestadoalbarancomercialds_6_tfclicod_to) ,
                                           AV58Cambiarestadoalbarancomercialds_8_tfclinom_sel ,
                                           AV57Cambiarestadoalbarancomercialds_7_tfclinom ,
                                           Byte.valueOf(AV59Cambiarestadoalbarancomercialds_9_tfalbcomest) ,
                                           Byte.valueOf(AV60Cambiarestadoalbarancomercialds_10_tfalbcomest_to) ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Byte.valueOf(A16AlbComEst) ,
                                           A17AlbComFch ,
                                           Integer.valueOf(AV42AlbComCod) ,
                                           Integer.valueOf(AV43AlbComCod_to) ,
                                           AV44AlbComFch ,
                                           AV45AlbComFch_to ,
                                           A396EmprCod ,
                                           AV41Emprcod ,
                                           A22AlbComPri ,
                                           AV46AlbComPri } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Cambiarestadoalbarancomercialds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Cambiarestadoalbarancomercialds_1_filterfulltext), "%", "") ;
      lV51Cambiarestadoalbarancomercialds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Cambiarestadoalbarancomercialds_1_filterfulltext), "%", "") ;
      lV51Cambiarestadoalbarancomercialds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Cambiarestadoalbarancomercialds_1_filterfulltext), "%", "") ;
      lV51Cambiarestadoalbarancomercialds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Cambiarestadoalbarancomercialds_1_filterfulltext), "%", "") ;
      lV57Cambiarestadoalbarancomercialds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV57Cambiarestadoalbarancomercialds_7_tfclinom), 30, "%") ;
      /* Using cursor P094Z2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV42AlbComCod), Integer.valueOf(AV43AlbComCod_to), AV44AlbComFch, AV45AlbComFch_to, AV41Emprcod, AV46AlbComPri, lV51Cambiarestadoalbarancomercialds_1_filterfulltext, lV51Cambiarestadoalbarancomercialds_1_filterfulltext, lV51Cambiarestadoalbarancomercialds_1_filterfulltext, lV51Cambiarestadoalbarancomercialds_1_filterfulltext, Integer.valueOf(AV52Cambiarestadoalbarancomercialds_2_tfalbcomcod), Integer.valueOf(AV53Cambiarestadoalbarancomercialds_3_tfalbcomcod_to), AV54Cambiarestadoalbarancomercialds_4_tfalbcomfch, Integer.valueOf(AV55Cambiarestadoalbarancomercialds_5_tfclicod), Integer.valueOf(AV56Cambiarestadoalbarancomercialds_6_tfclicod_to), lV57Cambiarestadoalbarancomercialds_7_tfclinom, AV58Cambiarestadoalbarancomercialds_8_tfclinom_sel, Byte.valueOf(AV59Cambiarestadoalbarancomercialds_9_tfalbcomest), Byte.valueOf(AV60Cambiarestadoalbarancomercialds_10_tfalbcomest_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk94Z2 = false ;
         A396EmprCod = P094Z2_A396EmprCod[0] ;
         A22AlbComPri = P094Z2_A22AlbComPri[0] ;
         A16AlbComEst = P094Z2_A16AlbComEst[0] ;
         A279CliNom = P094Z2_A279CliNom[0] ;
         A252CliCod = P094Z2_A252CliCod[0] ;
         A17AlbComFch = P094Z2_A17AlbComFch[0] ;
         A14AlbComCod = P094Z2_A14AlbComCod[0] ;
         A279CliNom = P094Z2_A279CliNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P094Z2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk94Z2 = false ;
            A396EmprCod = P094Z2_A396EmprCod[0] ;
            A252CliCod = P094Z2_A252CliCod[0] ;
            A14AlbComCod = P094Z2_A14AlbComCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk94Z2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV26Option = A279CliNom ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94Z2 )
         {
            brk94Z2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cambiarestadoalbarancomercialgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = cambiarestadoalbarancomercialgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = cambiarestadoalbarancomercialgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV12TFAlbComFch = GXutil.nullDate() ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV41Emprcod = "" ;
      AV44AlbComFch = GXutil.nullDate() ;
      AV45AlbComFch_to = GXutil.nullDate() ;
      AV46AlbComPri = "" ;
      A279CliNom = "" ;
      AV51Cambiarestadoalbarancomercialds_1_filterfulltext = "" ;
      AV54Cambiarestadoalbarancomercialds_4_tfalbcomfch = GXutil.nullDate() ;
      AV57Cambiarestadoalbarancomercialds_7_tfclinom = "" ;
      AV58Cambiarestadoalbarancomercialds_8_tfclinom_sel = "" ;
      scmdbuf = "" ;
      lV51Cambiarestadoalbarancomercialds_1_filterfulltext = "" ;
      lV57Cambiarestadoalbarancomercialds_7_tfclinom = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A22AlbComPri = "" ;
      P094Z2_A396EmprCod = new String[] {""} ;
      P094Z2_A22AlbComPri = new String[] {""} ;
      P094Z2_A16AlbComEst = new byte[1] ;
      P094Z2_A279CliNom = new String[] {""} ;
      P094Z2_A252CliCod = new int[1] ;
      P094Z2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P094Z2_A14AlbComCod = new int[1] ;
      AV26Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cambiarestadoalbarancomercialgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P094Z2_A396EmprCod, P094Z2_A22AlbComPri, P094Z2_A16AlbComEst, P094Z2_A279CliNom, P094Z2_A252CliCod, P094Z2_A17AlbComFch, P094Z2_A14AlbComCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TFAlbComEst ;
   private byte AV19TFAlbComEst_To ;
   private byte AV59Cambiarestadoalbarancomercialds_9_tfalbcomest ;
   private byte AV60Cambiarestadoalbarancomercialds_10_tfalbcomest_to ;
   private byte A16AlbComEst ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV10TFAlbComCod ;
   private int AV11TFAlbComCod_To ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV42AlbComCod ;
   private int AV43AlbComCod_to ;
   private int AV52Cambiarestadoalbarancomercialds_2_tfalbcomcod ;
   private int AV53Cambiarestadoalbarancomercialds_3_tfalbcomcod_to ;
   private int AV55Cambiarestadoalbarancomercialds_5_tfclicod ;
   private int AV56Cambiarestadoalbarancomercialds_6_tfclicod_to ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private long AV34count ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV41Emprcod ;
   private String AV46AlbComPri ;
   private String A279CliNom ;
   private String AV57Cambiarestadoalbarancomercialds_7_tfclinom ;
   private String AV58Cambiarestadoalbarancomercialds_8_tfclinom_sel ;
   private String scmdbuf ;
   private String lV57Cambiarestadoalbarancomercialds_7_tfclinom ;
   private String A396EmprCod ;
   private String A22AlbComPri ;
   private java.util.Date AV12TFAlbComFch ;
   private java.util.Date AV44AlbComFch ;
   private java.util.Date AV45AlbComFch_to ;
   private java.util.Date AV54Cambiarestadoalbarancomercialds_4_tfalbcomfch ;
   private java.util.Date A17AlbComFch ;
   private boolean returnInSub ;
   private boolean brk94Z2 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV51Cambiarestadoalbarancomercialds_1_filterfulltext ;
   private String lV51Cambiarestadoalbarancomercialds_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P094Z2_A396EmprCod ;
   private String[] P094Z2_A22AlbComPri ;
   private byte[] P094Z2_A16AlbComEst ;
   private String[] P094Z2_A279CliNom ;
   private int[] P094Z2_A252CliCod ;
   private java.util.Date[] P094Z2_A17AlbComFch ;
   private int[] P094Z2_A14AlbComCod ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class cambiarestadoalbarancomercialgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Cambiarestadoalbarancomercialds_1_filterfulltext ,
                                          int AV52Cambiarestadoalbarancomercialds_2_tfalbcomcod ,
                                          int AV53Cambiarestadoalbarancomercialds_3_tfalbcomcod_to ,
                                          java.util.Date AV54Cambiarestadoalbarancomercialds_4_tfalbcomfch ,
                                          int AV55Cambiarestadoalbarancomercialds_5_tfclicod ,
                                          int AV56Cambiarestadoalbarancomercialds_6_tfclicod_to ,
                                          String AV58Cambiarestadoalbarancomercialds_8_tfclinom_sel ,
                                          String AV57Cambiarestadoalbarancomercialds_7_tfclinom ,
                                          byte AV59Cambiarestadoalbarancomercialds_9_tfalbcomest ,
                                          byte AV60Cambiarestadoalbarancomercialds_10_tfalbcomest_to ,
                                          int A14AlbComCod ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          byte A16AlbComEst ,
                                          java.util.Date A17AlbComFch ,
                                          int AV42AlbComCod ,
                                          int AV43AlbComCod_to ,
                                          java.util.Date AV44AlbComFch ,
                                          java.util.Date AV45AlbComFch_to ,
                                          String A396EmprCod ,
                                          String AV41Emprcod ,
                                          String A22AlbComPri ,
                                          String AV46AlbComPri )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[19];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbComPri, T1.AlbComEst, T2.CliNom, T1.CliCod, T1.AlbComFch, T1.AlbComCod FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      addWhere(sWhereString, "(T1.AlbComEst = 0)");
      if ( ! (GXutil.strcmp("", AV51Cambiarestadoalbarancomercialds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbComCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.AlbComEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV52Cambiarestadoalbarancomercialds_2_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV53Cambiarestadoalbarancomercialds_3_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54Cambiarestadoalbarancomercialds_4_tfalbcomfch)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV55Cambiarestadoalbarancomercialds_5_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV56Cambiarestadoalbarancomercialds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Cambiarestadoalbarancomercialds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV57Cambiarestadoalbarancomercialds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Cambiarestadoalbarancomercialds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV59Cambiarestadoalbarancomercialds_9_tfalbcomest) )
      {
         addWhere(sWhereString, "(T1.AlbComEst >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV60Cambiarestadoalbarancomercialds_10_tfalbcomest_to) )
      {
         addWhere(sWhereString, "(T1.AlbComEst <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
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
                  return conditional_P094Z2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               return;
      }
   }

}

