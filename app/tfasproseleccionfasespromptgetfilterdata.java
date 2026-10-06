package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfasproseleccionfasespromptgetfilterdata extends GXProcedure
{
   public tfasproseleccionfasespromptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasproseleccionfasespromptgetfilterdata.class ), "" );
   }

   public tfasproseleccionfasespromptgetfilterdata( int remoteHandle ,
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
      tfasproseleccionfasespromptgetfilterdata.this.aP5 = new String[] {""};
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
      tfasproseleccionfasespromptgetfilterdata.this.AV16DDOName = aP0;
      tfasproseleccionfasespromptgetfilterdata.this.AV14SearchTxt = aP1;
      tfasproseleccionfasespromptgetfilterdata.this.AV15SearchTxtTo = aP2;
      tfasproseleccionfasespromptgetfilterdata.this.aP3 = aP3;
      tfasproseleccionfasespromptgetfilterdata.this.aP4 = aP4;
      tfasproseleccionfasespromptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_FASTIP") == 0 )
      {
         /* Execute user subroutine: 'LOADFASTIPOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_FASDSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSC2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("TFASPROSeleccionFasesPromptGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TFASPROSeleccionFasesPromptGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TFASPROSeleccionFasesPromptGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASTIP") == 0 )
         {
            AV10TFFasTip = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASTIP_SEL") == 0 )
         {
            AV11TFFasTip_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC2") == 0 )
         {
            AV12TFFasDsc2 = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC2_SEL") == 0 )
         {
            AV13TFFasDsc2_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASTIPOPTIONS' Routine */
      returnInSub = false ;
      AV10TFFasTip = AV14SearchTxt ;
      AV11TFFasTip_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV11TFFasTip_Sel ,
                                           AV10TFFasTip ,
                                           AV13TFFasDsc2_Sel ,
                                           AV12TFFasDsc2 ,
                                           A6011FasTip ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4642FasDsc2 ,
                                           A4286FasForMul ,
                                           A14042FasActiva ,
                                           AV34FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV10TFFasTip = GXutil.padr( GXutil.rtrim( AV10TFFasTip), 1, "%") ;
      lV12TFFasDsc2 = GXutil.padr( GXutil.rtrim( AV12TFFasDsc2), 60, "%") ;
      /* Using cursor P09P22 */
      pr_default.execute(0, new Object[] {AV34FasActiva, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV10TFFasTip, AV11TFFasTip_Sel, lV12TFFasDsc2, AV13TFFasDsc2_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9P22 = false ;
         A14042FasActiva = P09P22_A14042FasActiva[0] ;
         A6011FasTip = P09P22_A6011FasTip[0] ;
         n6011FasTip = P09P22_n6011FasTip[0] ;
         A4286FasForMul = P09P22_A4286FasForMul[0] ;
         n4286FasForMul = P09P22_n4286FasForMul[0] ;
         A4642FasDsc2 = P09P22_A4642FasDsc2[0] ;
         n4642FasDsc2 = P09P22_n4642FasDsc2[0] ;
         A460FasDsc = P09P22_A460FasDsc[0] ;
         A457FasCod = P09P22_A457FasCod[0] ;
         A396EmprCod = P09P22_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09P22_A6011FasTip[0], A6011FasTip) == 0 ) )
         {
            brk9P22 = false ;
            A457FasCod = P09P22_A457FasCod[0] ;
            A396EmprCod = P09P22_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9P22 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A6011FasTip)==0) )
         {
            AV18Option = A6011FasTip ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9P22 )
         {
            brk9P22 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSC2OPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasDsc2 = AV14SearchTxt ;
      AV13TFFasDsc2_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV11TFFasTip_Sel ,
                                           AV10TFFasTip ,
                                           AV13TFFasDsc2_Sel ,
                                           AV12TFFasDsc2 ,
                                           A6011FasTip ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A4642FasDsc2 ,
                                           A4286FasForMul ,
                                           A14042FasActiva ,
                                           AV34FasActiva } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV10TFFasTip = GXutil.padr( GXutil.rtrim( AV10TFFasTip), 1, "%") ;
      lV12TFFasDsc2 = GXutil.padr( GXutil.rtrim( AV12TFFasDsc2), 60, "%") ;
      /* Using cursor P09P23 */
      pr_default.execute(1, new Object[] {AV34FasActiva, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV10TFFasTip, AV11TFFasTip_Sel, lV12TFFasDsc2, AV13TFFasDsc2_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9P24 = false ;
         A14042FasActiva = P09P23_A14042FasActiva[0] ;
         A4642FasDsc2 = P09P23_A4642FasDsc2[0] ;
         n4642FasDsc2 = P09P23_n4642FasDsc2[0] ;
         A4286FasForMul = P09P23_A4286FasForMul[0] ;
         n4286FasForMul = P09P23_n4286FasForMul[0] ;
         A460FasDsc = P09P23_A460FasDsc[0] ;
         A457FasCod = P09P23_A457FasCod[0] ;
         A6011FasTip = P09P23_A6011FasTip[0] ;
         n6011FasTip = P09P23_n6011FasTip[0] ;
         A396EmprCod = P09P23_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09P23_A4642FasDsc2[0], A4642FasDsc2) == 0 ) )
         {
            brk9P24 = false ;
            A457FasCod = P09P23_A457FasCod[0] ;
            A396EmprCod = P09P23_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9P24 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4642FasDsc2)==0) )
         {
            AV18Option = A4642FasDsc2 ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9P24 )
         {
            brk9P24 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tfasproseleccionfasespromptgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tfasproseleccionfasespromptgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tfasproseleccionfasespromptgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFFasTip = "" ;
      AV11TFFasTip_Sel = "" ;
      AV12TFFasDsc2 = "" ;
      AV13TFFasDsc2_Sel = "" ;
      scmdbuf = "" ;
      lV32FilterFullText = "" ;
      lV10TFFasTip = "" ;
      lV12TFFasDsc2 = "" ;
      A6011FasTip = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4642FasDsc2 = "" ;
      A4286FasForMul = "" ;
      A14042FasActiva = "" ;
      AV34FasActiva = "" ;
      P09P22_A14042FasActiva = new String[] {""} ;
      P09P22_A6011FasTip = new String[] {""} ;
      P09P22_n6011FasTip = new boolean[] {false} ;
      P09P22_A4286FasForMul = new String[] {""} ;
      P09P22_n4286FasForMul = new boolean[] {false} ;
      P09P22_A4642FasDsc2 = new String[] {""} ;
      P09P22_n4642FasDsc2 = new boolean[] {false} ;
      P09P22_A460FasDsc = new String[] {""} ;
      P09P22_A457FasCod = new String[] {""} ;
      P09P22_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P09P23_A14042FasActiva = new String[] {""} ;
      P09P23_A4642FasDsc2 = new String[] {""} ;
      P09P23_n4642FasDsc2 = new boolean[] {false} ;
      P09P23_A4286FasForMul = new String[] {""} ;
      P09P23_n4286FasForMul = new boolean[] {false} ;
      P09P23_A460FasDsc = new String[] {""} ;
      P09P23_A457FasCod = new String[] {""} ;
      P09P23_A6011FasTip = new String[] {""} ;
      P09P23_n6011FasTip = new boolean[] {false} ;
      P09P23_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasproseleccionfasespromptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09P22_A14042FasActiva, P09P22_A6011FasTip, P09P22_n6011FasTip, P09P22_A4286FasForMul, P09P22_n4286FasForMul, P09P22_A4642FasDsc2, P09P22_n4642FasDsc2, P09P22_A460FasDsc, P09P22_A457FasCod, P09P22_A396EmprCod
            }
            , new Object[] {
            P09P23_A14042FasActiva, P09P23_A4642FasDsc2, P09P23_n4642FasDsc2, P09P23_A4286FasForMul, P09P23_n4286FasForMul, P09P23_A460FasDsc, P09P23_A457FasCod, P09P23_A6011FasTip, P09P23_n6011FasTip, P09P23_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV26count ;
   private String AV10TFFasTip ;
   private String AV11TFFasTip_Sel ;
   private String AV12TFFasDsc2 ;
   private String AV13TFFasDsc2_Sel ;
   private String scmdbuf ;
   private String lV10TFFasTip ;
   private String lV12TFFasDsc2 ;
   private String A6011FasTip ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A4642FasDsc2 ;
   private String A4286FasForMul ;
   private String A14042FasActiva ;
   private String AV34FasActiva ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9P22 ;
   private boolean n6011FasTip ;
   private boolean n4286FasForMul ;
   private boolean n4642FasDsc2 ;
   private boolean brk9P24 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String lV32FilterFullText ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09P22_A14042FasActiva ;
   private String[] P09P22_A6011FasTip ;
   private boolean[] P09P22_n6011FasTip ;
   private String[] P09P22_A4286FasForMul ;
   private boolean[] P09P22_n4286FasForMul ;
   private String[] P09P22_A4642FasDsc2 ;
   private boolean[] P09P22_n4642FasDsc2 ;
   private String[] P09P22_A460FasDsc ;
   private String[] P09P22_A457FasCod ;
   private String[] P09P22_A396EmprCod ;
   private String[] P09P23_A14042FasActiva ;
   private String[] P09P23_A4642FasDsc2 ;
   private boolean[] P09P23_n4642FasDsc2 ;
   private String[] P09P23_A4286FasForMul ;
   private boolean[] P09P23_n4286FasForMul ;
   private String[] P09P23_A460FasDsc ;
   private String[] P09P23_A457FasCod ;
   private String[] P09P23_A6011FasTip ;
   private boolean[] P09P23_n6011FasTip ;
   private String[] P09P23_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tfasproseleccionfasespromptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09P22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV11TFFasTip_Sel ,
                                          String AV10TFFasTip ,
                                          String AV13TFFasDsc2_Sel ,
                                          String AV12TFFasDsc2 ,
                                          String A6011FasTip ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4642FasDsc2 ,
                                          String A4286FasForMul ,
                                          String A14042FasActiva ,
                                          String AV34FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT FasActiva, FasTip, FasForMul, FasDsc2, FasDsc, FasCod, EmprCod FROM TXPFASPRO" ;
      addWhere(sWhereString, "(FasActiva = ?)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(FasTip) like '%' || UPPER(?)) or ( UPPER(FasCod) like '%' || UPPER(?)) or ( UPPER(FasDsc) like '%' || UPPER(?)) or ( UPPER(FasDsc2) like '%' || UPPER(?)) or ( UPPER(FasForMul) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFFasTip_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFFasTip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFFasTip_Sel)==0) )
      {
         addWhere(sWhereString, "(FasTip = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFFasDsc2_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFFasDsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFFasDsc2_Sel)==0) )
      {
         addWhere(sWhereString, "(FasDsc2 = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FasTip" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09P23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV11TFFasTip_Sel ,
                                          String AV10TFFasTip ,
                                          String AV13TFFasDsc2_Sel ,
                                          String AV12TFFasDsc2 ,
                                          String A6011FasTip ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A4642FasDsc2 ,
                                          String A4286FasForMul ,
                                          String A14042FasActiva ,
                                          String AV34FasActiva )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT FasActiva, FasDsc2, FasForMul, FasDsc, FasCod, FasTip, EmprCod FROM TXPFASPRO" ;
      addWhere(sWhereString, "(FasActiva = ?)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(FasTip) like '%' || UPPER(?)) or ( UPPER(FasCod) like '%' || UPPER(?)) or ( UPPER(FasDsc) like '%' || UPPER(?)) or ( UPPER(FasDsc2) like '%' || UPPER(?)) or ( UPPER(FasForMul) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFFasTip_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFFasTip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFFasTip_Sel)==0) )
      {
         addWhere(sWhereString, "(FasTip = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFFasDsc2_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFFasDsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFFasDsc2_Sel)==0) )
      {
         addWhere(sWhereString, "(FasDsc2 = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FasDsc2" ;
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
                  return conditional_P09P22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 1 :
                  return conditional_P09P23(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09P22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09P23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 28);
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 28);
               ((String[]) buf[6])[0] = rslt.getString(5, 8);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
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
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 60);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 60);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 60);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 60);
               }
               return;
      }
   }

}

