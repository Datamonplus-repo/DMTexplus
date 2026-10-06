package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disalb__albreccod_promptgetfilterdata extends GXProcedure
{
   public disalb__albreccod_promptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disalb__albreccod_promptgetfilterdata.class ), "" );
   }

   public disalb__albreccod_promptgetfilterdata( int remoteHandle ,
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
      disalb__albreccod_promptgetfilterdata.this.aP5 = new String[] {""};
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
      disalb__albreccod_promptgetfilterdata.this.AV28DDOName = aP0;
      disalb__albreccod_promptgetfilterdata.this.AV29SearchTxt = aP1;
      disalb__albreccod_promptgetfilterdata.this.AV30SearchTxtTo = aP2;
      disalb__albreccod_promptgetfilterdata.this.aP3 = aP3;
      disalb__albreccod_promptgetfilterdata.this.aP4 = aP4;
      disalb__albreccod_promptgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_ALBRENT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRENTOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV23Session.getValue("Pedidos.DisAlb__AlbRecCod_PromptGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.DisAlb__AlbRecCod_PromptGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("Pedidos.DisAlb__AlbRecCod_PromptGridState"), null, null);
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV10TFAlbRecCod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbRecCod_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV12TFAlbREnt = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV13TFAlbREnt_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV14TFAlbRFen = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&NRECEP") == 0 )
         {
            AV34Nrecep = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&NREFER") == 0 )
         {
            AV35Nrefer = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&NENTRE") == 0 )
         {
            AV36Nentre = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&UNID") == 0 )
         {
            AV37Unid = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV38CliCod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPREO") == 0 )
         {
            AV39Opreo = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV51EmprCod = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREST") == 0 )
         {
            AV41AlbREst = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPENT") == 0 )
         {
            AV42TipEnt = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRLOC") == 0 )
         {
            AV43AlbRLoc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRDISCLI") == 0 )
         {
            AV44AlbRDisCli = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRFENI") == 0 )
         {
            AV45AlbRfeni = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRFENF") == 0 )
         {
            AV46Albrfenf = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRENT2I") == 0 )
         {
            AV47Albrent2i = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBRENTOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbREnt = AV29SearchTxt ;
      AV13TFAlbREnt_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV10TFAlbRecCod) ,
                                           Integer.valueOf(AV11TFAlbRecCod_To) ,
                                           AV13TFAlbREnt_Sel ,
                                           AV12TFAlbREnt ,
                                           AV14TFAlbRFen ,
                                           AV49Albref ,
                                           AV50ProceNom ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A971ProceNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV48CliCodd) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV51EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFAlbREnt = GXutil.padr( GXutil.rtrim( AV12TFAlbREnt), 8, "%") ;
      lV49Albref = GXutil.padr( GXutil.rtrim( AV49Albref), 16, "%") ;
      l971ProceNom = GXutil.padr( GXutil.rtrim( A971ProceNom), 30, "%") ;
      n971ProceNom = false ;
      /* Using cursor P09XR2 */
      pr_default.execute(0, new Object[] {AV51EmprCod, Integer.valueOf(AV48CliCodd), Integer.valueOf(AV10TFAlbRecCod), Integer.valueOf(AV11TFAlbRecCod_To), lV12TFAlbREnt, AV13TFAlbREnt_Sel, AV14TFAlbRFen, lV49Albref, l971ProceNom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9XR2 = false ;
         A970ProceCod = P09XR2_A970ProceCod[0] ;
         n970ProceCod = P09XR2_n970ProceCod[0] ;
         A396EmprCod = P09XR2_A396EmprCod[0] ;
         A46AlbREnt = P09XR2_A46AlbREnt[0] ;
         A47AlbREst = P09XR2_A47AlbREst[0] ;
         A971ProceNom = P09XR2_A971ProceNom[0] ;
         n971ProceNom = P09XR2_n971ProceNom[0] ;
         A45AlbRef = P09XR2_A45AlbRef[0] ;
         A252CliCod = P09XR2_A252CliCod[0] ;
         A49AlbRFen = P09XR2_A49AlbRFen[0] ;
         A44AlbRecCod = P09XR2_A44AlbRecCod[0] ;
         A971ProceNom = P09XR2_A971ProceNom[0] ;
         n971ProceNom = P09XR2_n971ProceNom[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09XR2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09XR2_A46AlbREnt[0], A46AlbREnt) == 0 ) )
         {
            brk9XR2 = false ;
            A44AlbRecCod = P09XR2_A44AlbRecCod[0] ;
            AV22count = (long)(AV22count+1) ;
            brk9XR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
         {
            AV17Option = A46AlbREnt ;
            AV18Options.add(AV17Option, 0);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9XR2 )
         {
            brk9XR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = disalb__albreccod_promptgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = disalb__albreccod_promptgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = disalb__albreccod_promptgetfilterdata.this.AV33OptionIndexesJson;
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
      AV12TFAlbREnt = "" ;
      AV13TFAlbREnt_Sel = "" ;
      AV14TFAlbRFen = GXutil.nullDate() ;
      AV35Nrefer = "" ;
      AV36Nentre = "" ;
      AV37Unid = "" ;
      AV39Opreo = "" ;
      AV51EmprCod = "" ;
      AV43AlbRLoc = "" ;
      AV44AlbRDisCli = "" ;
      AV45AlbRfeni = GXutil.nullDate() ;
      AV46Albrfenf = GXutil.nullDate() ;
      AV47Albrent2i = "" ;
      scmdbuf = "" ;
      lV12TFAlbREnt = "" ;
      lV49Albref = "" ;
      l971ProceNom = "" ;
      AV49Albref = "" ;
      AV50ProceNom = "" ;
      A46AlbREnt = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A971ProceNom = "" ;
      A396EmprCod = "" ;
      P09XR2_A970ProceCod = new short[1] ;
      P09XR2_n970ProceCod = new boolean[] {false} ;
      P09XR2_A396EmprCod = new String[] {""} ;
      P09XR2_A46AlbREnt = new String[] {""} ;
      P09XR2_A47AlbREst = new byte[1] ;
      P09XR2_A971ProceNom = new String[] {""} ;
      P09XR2_n971ProceNom = new boolean[] {false} ;
      P09XR2_A45AlbRef = new String[] {""} ;
      P09XR2_A252CliCod = new int[1] ;
      P09XR2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P09XR2_A44AlbRecCod = new int[1] ;
      AV17Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb__albreccod_promptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09XR2_A970ProceCod, P09XR2_n970ProceCod, P09XR2_A396EmprCod, P09XR2_A46AlbREnt, P09XR2_A47AlbREst, P09XR2_A971ProceNom, P09XR2_n971ProceNom, P09XR2_A45AlbRef, P09XR2_A252CliCod, P09XR2_A49AlbRFen,
            P09XR2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV41AlbREst ;
   private byte A47AlbREst ;
   private short AV42TipEnt ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int AV54GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV34Nrecep ;
   private int AV38CliCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV48CliCodd ;
   private long AV22count ;
   private String AV12TFAlbREnt ;
   private String AV13TFAlbREnt_Sel ;
   private String AV35Nrefer ;
   private String AV36Nentre ;
   private String AV37Unid ;
   private String AV39Opreo ;
   private String AV51EmprCod ;
   private String AV43AlbRLoc ;
   private String AV44AlbRDisCli ;
   private String AV47Albrent2i ;
   private String scmdbuf ;
   private String lV12TFAlbREnt ;
   private String lV49Albref ;
   private String l971ProceNom ;
   private String AV49Albref ;
   private String AV50ProceNom ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A971ProceNom ;
   private String A396EmprCod ;
   private java.util.Date AV14TFAlbRFen ;
   private java.util.Date AV45AlbRfeni ;
   private java.util.Date AV46Albrfenf ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean n971ProceNom ;
   private boolean brk9XR2 ;
   private boolean n970ProceCod ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV17Option ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09XR2_A970ProceCod ;
   private boolean[] P09XR2_n970ProceCod ;
   private String[] P09XR2_A396EmprCod ;
   private String[] P09XR2_A46AlbREnt ;
   private byte[] P09XR2_A47AlbREst ;
   private String[] P09XR2_A971ProceNom ;
   private boolean[] P09XR2_n971ProceNom ;
   private String[] P09XR2_A45AlbRef ;
   private int[] P09XR2_A252CliCod ;
   private java.util.Date[] P09XR2_A49AlbRFen ;
   private int[] P09XR2_A44AlbRecCod ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class disalb__albreccod_promptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09XR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV10TFAlbRecCod ,
                                          int AV11TFAlbRecCod_To ,
                                          String AV13TFAlbREnt_Sel ,
                                          String AV12TFAlbREnt ,
                                          java.util.Date AV14TFAlbRFen ,
                                          String AV49Albref ,
                                          String AV50ProceNom ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A971ProceNom ,
                                          int A252CliCod ,
                                          int AV48CliCodd ,
                                          byte A47AlbREst ,
                                          String AV51EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ProceCod, T1.EmprCod, T1.AlbREnt, T1.AlbREst, T2.ProceNom, T1.AlbRef, T1.CliCod, T1.AlbRFen, T1.AlbRecCod FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.AlbREst = 0)");
      if ( ! (0==AV10TFAlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV11TFAlbRecCod_To) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFAlbREnt_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFAlbREnt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFAlbREnt_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14TFAlbRFen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Albref)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef like ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50ProceNom)==0) )
      {
         addWhere(sWhereString, "(T2.ProceNom like ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbREnt" ;
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
                  return conditional_P09XR2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
      }
   }

}

