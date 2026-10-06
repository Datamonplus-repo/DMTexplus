package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class seleccionequiposgetfilterdata extends GXProcedure
{
   public seleccionequiposgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seleccionequiposgetfilterdata.class ), "" );
   }

   public seleccionequiposgetfilterdata( int remoteHandle ,
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
      seleccionequiposgetfilterdata.this.aP5 = new String[] {""};
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
      seleccionequiposgetfilterdata.this.AV26DDOName = aP0;
      seleccionequiposgetfilterdata.this.AV27SearchTxt = aP1;
      seleccionequiposgetfilterdata.this.AV28SearchTxtTo = aP2;
      seleccionequiposgetfilterdata.this.aP3 = aP3;
      seleccionequiposgetfilterdata.this.aP4 = aP4;
      seleccionequiposgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MAQEQUCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQEQUCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MAQEQUDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQEQUDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("MantenimientoMaquina.SeleccionEquiposGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.SeleccionEquiposGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("MantenimientoMaquina.SeleccionEquiposGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEQUCOD") == 0 )
         {
            AV10TFMaqEquCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEQUCOD_SEL") == 0 )
         {
            AV11TFMaqEquCod_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEQUDSC") == 0 )
         {
            AV12TFMaqEquDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEQUDSC_SEL") == 0 )
         {
            AV13TFMaqEquDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INOUTEMPRCOD") == 0 )
         {
            AV35InOutEmprCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INOUTMAQCOD") == 0 )
         {
            AV36InOutMaqCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQEQUCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqEquCod = AV27SearchTxt ;
      AV11TFMaqEquCod_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV11TFMaqEquCod_Sel ,
                                           AV10TFMaqEquCod ,
                                           AV13TFMaqEquDsc_Sel ,
                                           AV12TFMaqEquDsc ,
                                           A11438MaqEquCod ,
                                           A11435MaqEquDsc ,
                                           Byte.valueOf(A11437MaqPieShw) ,
                                           AV35InOutEmprCod ,
                                           AV36InOutMaqCod ,
                                           A396EmprCod ,
                                           A602MaqCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV10TFMaqEquCod = GXutil.padr( GXutil.rtrim( AV10TFMaqEquCod), 10, "%") ;
      lV12TFMaqEquDsc = GXutil.padr( GXutil.rtrim( AV12TFMaqEquDsc), 100, "%") ;
      /* Using cursor P0AR12 */
      pr_default.execute(0, new Object[] {AV35InOutEmprCod, AV36InOutMaqCod, lV32FilterFullText, lV32FilterFullText, lV10TFMaqEquCod, AV11TFMaqEquCod_Sel, lV12TFMaqEquDsc, AV13TFMaqEquDsc_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAR12 = false ;
         A602MaqCod = P0AR12_A602MaqCod[0] ;
         A396EmprCod = P0AR12_A396EmprCod[0] ;
         A11438MaqEquCod = P0AR12_A11438MaqEquCod[0] ;
         A11437MaqPieShw = P0AR12_A11437MaqPieShw[0] ;
         A11435MaqEquDsc = P0AR12_A11435MaqEquDsc[0] ;
         A11439MaqSEqCod = P0AR12_A11439MaqSEqCod[0] ;
         A11440MaqPieCod = P0AR12_A11440MaqPieCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AR12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AR12_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(P0AR12_A11438MaqEquCod[0], A11438MaqEquCod) == 0 ) )
         {
            brkAR12 = false ;
            A11439MaqSEqCod = P0AR12_A11439MaqSEqCod[0] ;
            A11440MaqPieCod = P0AR12_A11440MaqPieCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAR12 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11438MaqEquCod)==0) )
         {
            AV15Option = A11438MaqEquCod ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAR12 )
         {
            brkAR12 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQEQUDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqEquDsc = AV27SearchTxt ;
      AV13TFMaqEquDsc_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV11TFMaqEquCod_Sel ,
                                           AV10TFMaqEquCod ,
                                           AV13TFMaqEquDsc_Sel ,
                                           AV12TFMaqEquDsc ,
                                           A11438MaqEquCod ,
                                           A11435MaqEquDsc ,
                                           A396EmprCod ,
                                           AV35InOutEmprCod ,
                                           A602MaqCod ,
                                           AV36InOutMaqCod ,
                                           Byte.valueOf(A11437MaqPieShw) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV10TFMaqEquCod = GXutil.padr( GXutil.rtrim( AV10TFMaqEquCod), 10, "%") ;
      lV12TFMaqEquDsc = GXutil.padr( GXutil.rtrim( AV12TFMaqEquDsc), 100, "%") ;
      /* Using cursor P0AR13 */
      pr_default.execute(1, new Object[] {AV35InOutEmprCod, AV36InOutMaqCod, lV32FilterFullText, lV32FilterFullText, lV10TFMaqEquCod, AV11TFMaqEquCod_Sel, lV12TFMaqEquDsc, AV13TFMaqEquDsc_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAR14 = false ;
         A396EmprCod = P0AR13_A396EmprCod[0] ;
         A602MaqCod = P0AR13_A602MaqCod[0] ;
         A11437MaqPieShw = P0AR13_A11437MaqPieShw[0] ;
         A11435MaqEquDsc = P0AR13_A11435MaqEquDsc[0] ;
         A11438MaqEquCod = P0AR13_A11438MaqEquCod[0] ;
         A11439MaqSEqCod = P0AR13_A11439MaqSEqCod[0] ;
         A11440MaqPieCod = P0AR13_A11440MaqPieCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AR13_A11435MaqEquDsc[0], A11435MaqEquDsc) == 0 ) )
         {
            brkAR14 = false ;
            A396EmprCod = P0AR13_A396EmprCod[0] ;
            A602MaqCod = P0AR13_A602MaqCod[0] ;
            A11438MaqEquCod = P0AR13_A11438MaqEquCod[0] ;
            A11439MaqSEqCod = P0AR13_A11439MaqSEqCod[0] ;
            A11440MaqPieCod = P0AR13_A11440MaqPieCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAR14 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A11435MaqEquDsc)==0) )
         {
            AV15Option = A11435MaqEquDsc ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAR14 )
         {
            brkAR14 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = seleccionequiposgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = seleccionequiposgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = seleccionequiposgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFMaqEquCod = "" ;
      AV11TFMaqEquCod_Sel = "" ;
      AV12TFMaqEquDsc = "" ;
      AV13TFMaqEquDsc_Sel = "" ;
      AV35InOutEmprCod = "" ;
      AV36InOutMaqCod = "" ;
      scmdbuf = "" ;
      lV32FilterFullText = "" ;
      lV10TFMaqEquCod = "" ;
      lV12TFMaqEquDsc = "" ;
      A11438MaqEquCod = "" ;
      A11435MaqEquDsc = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P0AR12_A602MaqCod = new String[] {""} ;
      P0AR12_A396EmprCod = new String[] {""} ;
      P0AR12_A11438MaqEquCod = new String[] {""} ;
      P0AR12_A11437MaqPieShw = new byte[1] ;
      P0AR12_A11435MaqEquDsc = new String[] {""} ;
      P0AR12_A11439MaqSEqCod = new String[] {""} ;
      P0AR12_A11440MaqPieCod = new String[] {""} ;
      A11439MaqSEqCod = "" ;
      A11440MaqPieCod = "" ;
      AV15Option = "" ;
      P0AR13_A396EmprCod = new String[] {""} ;
      P0AR13_A602MaqCod = new String[] {""} ;
      P0AR13_A11437MaqPieShw = new byte[1] ;
      P0AR13_A11435MaqEquDsc = new String[] {""} ;
      P0AR13_A11438MaqEquCod = new String[] {""} ;
      P0AR13_A11439MaqSEqCod = new String[] {""} ;
      P0AR13_A11440MaqPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.seleccionequiposgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AR12_A602MaqCod, P0AR12_A396EmprCod, P0AR12_A11438MaqEquCod, P0AR12_A11437MaqPieShw, P0AR12_A11435MaqEquDsc, P0AR12_A11439MaqSEqCod, P0AR12_A11440MaqPieCod
            }
            , new Object[] {
            P0AR13_A396EmprCod, P0AR13_A602MaqCod, P0AR13_A11437MaqPieShw, P0AR13_A11435MaqEquDsc, P0AR13_A11438MaqEquCod, P0AR13_A11439MaqSEqCod, P0AR13_A11440MaqPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11437MaqPieShw ;
   private short Gx_err ;
   private int AV39GXV1 ;
   private long AV20count ;
   private String AV10TFMaqEquCod ;
   private String AV11TFMaqEquCod_Sel ;
   private String AV12TFMaqEquDsc ;
   private String AV13TFMaqEquDsc_Sel ;
   private String AV35InOutEmprCod ;
   private String AV36InOutMaqCod ;
   private String scmdbuf ;
   private String lV10TFMaqEquCod ;
   private String lV12TFMaqEquDsc ;
   private String A11438MaqEquCod ;
   private String A11435MaqEquDsc ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A11439MaqSEqCod ;
   private String A11440MaqPieCod ;
   private boolean returnInSub ;
   private boolean brkAR12 ;
   private boolean brkAR14 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String lV32FilterFullText ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AR12_A602MaqCod ;
   private String[] P0AR12_A396EmprCod ;
   private String[] P0AR12_A11438MaqEquCod ;
   private byte[] P0AR12_A11437MaqPieShw ;
   private String[] P0AR12_A11435MaqEquDsc ;
   private String[] P0AR12_A11439MaqSEqCod ;
   private String[] P0AR12_A11440MaqPieCod ;
   private String[] P0AR13_A396EmprCod ;
   private String[] P0AR13_A602MaqCod ;
   private byte[] P0AR13_A11437MaqPieShw ;
   private String[] P0AR13_A11435MaqEquDsc ;
   private String[] P0AR13_A11438MaqEquCod ;
   private String[] P0AR13_A11439MaqSEqCod ;
   private String[] P0AR13_A11440MaqPieCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class seleccionequiposgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AR12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV11TFMaqEquCod_Sel ,
                                          String AV10TFMaqEquCod ,
                                          String AV13TFMaqEquDsc_Sel ,
                                          String AV12TFMaqEquDsc ,
                                          String A11438MaqEquCod ,
                                          String A11435MaqEquDsc ,
                                          byte A11437MaqPieShw ,
                                          String AV35InOutEmprCod ,
                                          String AV36InOutMaqCod ,
                                          String A396EmprCod ,
                                          String A602MaqCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MaqCod, EmprCod, MaqEquCod, MaqPieShw, MaqEquDsc, MaqSEqCod, MaqPieCod FROM TXPMaqPie" ;
      addWhere(sWhereString, "(EmprCod = ? and MaqCod = ?)");
      addWhere(sWhereString, "(MaqPieShw = 2)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MaqEquCod) like '%' || UPPER(?)) or ( UPPER(MaqEquDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqEquCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqEquCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqEquCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqEquCod_Sel)==0) )
      {
         addWhere(sWhereString, "(MaqEquCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFMaqEquDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFMaqEquDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqEquDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFMaqEquDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(MaqEquDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod, MaqEquCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AR13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV11TFMaqEquCod_Sel ,
                                          String AV10TFMaqEquCod ,
                                          String AV13TFMaqEquDsc_Sel ,
                                          String AV12TFMaqEquDsc ,
                                          String A11438MaqEquCod ,
                                          String A11435MaqEquDsc ,
                                          String A396EmprCod ,
                                          String AV35InOutEmprCod ,
                                          String A602MaqCod ,
                                          String AV36InOutMaqCod ,
                                          byte A11437MaqPieShw )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[8];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, MaqCod, MaqPieShw, MaqEquDsc, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MaqCod = ?)");
      addWhere(sWhereString, "(MaqPieShw = 2)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MaqEquCod) like '%' || UPPER(?)) or ( UPPER(MaqEquDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV11TFMaqEquCod_Sel)==0) && ( ! (GXutil.strcmp("", AV10TFMaqEquCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqEquCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11TFMaqEquCod_Sel)==0) )
      {
         addWhere(sWhereString, "(MaqEquCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFMaqEquDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFMaqEquDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqEquDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFMaqEquDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(MaqEquDsc = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MaqEquDsc" ;
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
                  return conditional_P0AR12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
            case 1 :
                  return conditional_P0AR13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AR12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AR13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 100);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 100);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 100);
               }
               return;
      }
   }

}

