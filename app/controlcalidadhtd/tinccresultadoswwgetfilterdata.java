package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tinccresultadoswwgetfilterdata extends GXProcedure
{
   public tinccresultadoswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tinccresultadoswwgetfilterdata.class ), "" );
   }

   public tinccresultadoswwgetfilterdata( int remoteHandle ,
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
      tinccresultadoswwgetfilterdata.this.aP5 = new String[] {""};
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
      tinccresultadoswwgetfilterdata.this.AV72DDOName = aP0;
      tinccresultadoswwgetfilterdata.this.AV73SearchTxt = aP1;
      tinccresultadoswwgetfilterdata.this.AV74SearchTxtTo = aP2;
      tinccresultadoswwgetfilterdata.this.aP3 = aP3;
      tinccresultadoswwgetfilterdata.this.aP4 = aP4;
      tinccresultadoswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV62Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV65OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_BARCODPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCODPAROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV75OptionsJson = AV62Options.toJSonString(false) ;
      AV76OptionsDescJson = AV64OptionsDesc.toJSonString(false) ;
      AV77OptionIndexesJson = AV65OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV67Session.getValue("ControlCalidadHTD.TINCCResultadosWWGridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.TINCCResultadosWWGridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV67Session.getValue("ControlCalidadHTD.TINCCResultadosWWGridState"), null, null);
      }
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV14TFBarCod = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFBarCod_To = (int)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV16TFBarCodReo = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFBarCodReo_To = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV18TFBarCodPar = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV19TFBarCodPar_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV20TFProCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV21TFProCod_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV22TFBarOrdLin = (short)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFBarOrdLin_To = (short)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarCodPar = AV73SearchTxt ;
      AV19TFBarCodPar_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV14TFBarCod) ,
                                           Integer.valueOf(AV15TFBarCod_To) ,
                                           Byte.valueOf(AV16TFBarCodReo) ,
                                           Byte.valueOf(AV17TFBarCodReo_To) ,
                                           AV19TFBarCodPar_Sel ,
                                           AV18TFBarCodPar ,
                                           AV21TFProCod_Sel ,
                                           AV20TFProCod ,
                                           Short.valueOf(AV22TFBarOrdLin) ,
                                           Short.valueOf(AV23TFBarOrdLin_To) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV18TFBarCodPar = GXutil.padr( GXutil.rtrim( AV18TFBarCodPar), 1, "%") ;
      lV20TFProCod = GXutil.padr( GXutil.rtrim( AV20TFProCod), 8, "%") ;
      /* Using cursor P09P62 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV14TFBarCod), Integer.valueOf(AV15TFBarCod_To), Byte.valueOf(AV16TFBarCodReo), Byte.valueOf(AV17TFBarCodReo_To), lV18TFBarCodPar, AV19TFBarCodPar_Sel, lV20TFProCod, AV21TFProCod_Sel, Short.valueOf(AV22TFBarOrdLin), Short.valueOf(AV23TFBarOrdLin_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9P62 = false ;
         A130BarCodPar = P09P62_A130BarCodPar[0] ;
         A194BarOrdLin = P09P62_A194BarOrdLin[0] ;
         A758ProCod = P09P62_A758ProCod[0] ;
         A132BarCodReo = P09P62_A132BarCodReo[0] ;
         A129BarCod = P09P62_A129BarCod[0] ;
         A396EmprCod = P09P62_A396EmprCod[0] ;
         A4031CCTCod = P09P62_A4031CCTCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09P62_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brk9P62 = false ;
            A194BarOrdLin = P09P62_A194BarOrdLin[0] ;
            A758ProCod = P09P62_A758ProCod[0] ;
            A132BarCodReo = P09P62_A132BarCodReo[0] ;
            A129BarCod = P09P62_A129BarCod[0] ;
            A396EmprCod = P09P62_A396EmprCod[0] ;
            A4031CCTCod = P09P62_A4031CCTCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk9P62 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A130BarCodPar)==0) )
         {
            AV61Option = A130BarCodPar ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9P62 )
         {
            brk9P62 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV20TFProCod = AV73SearchTxt ;
      AV21TFProCod_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV14TFBarCod) ,
                                           Integer.valueOf(AV15TFBarCod_To) ,
                                           Byte.valueOf(AV16TFBarCodReo) ,
                                           Byte.valueOf(AV17TFBarCodReo_To) ,
                                           AV19TFBarCodPar_Sel ,
                                           AV18TFBarCodPar ,
                                           AV21TFProCod_Sel ,
                                           AV20TFProCod ,
                                           Short.valueOf(AV22TFBarOrdLin) ,
                                           Short.valueOf(AV23TFBarOrdLin_To) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV18TFBarCodPar = GXutil.padr( GXutil.rtrim( AV18TFBarCodPar), 1, "%") ;
      lV20TFProCod = GXutil.padr( GXutil.rtrim( AV20TFProCod), 8, "%") ;
      /* Using cursor P09P63 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV14TFBarCod), Integer.valueOf(AV15TFBarCod_To), Byte.valueOf(AV16TFBarCodReo), Byte.valueOf(AV17TFBarCodReo_To), lV18TFBarCodPar, AV19TFBarCodPar_Sel, lV20TFProCod, AV21TFProCod_Sel, Short.valueOf(AV22TFBarOrdLin), Short.valueOf(AV23TFBarOrdLin_To)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9P64 = false ;
         A758ProCod = P09P63_A758ProCod[0] ;
         A194BarOrdLin = P09P63_A194BarOrdLin[0] ;
         A130BarCodPar = P09P63_A130BarCodPar[0] ;
         A132BarCodReo = P09P63_A132BarCodReo[0] ;
         A129BarCod = P09P63_A129BarCod[0] ;
         A396EmprCod = P09P63_A396EmprCod[0] ;
         A4031CCTCod = P09P63_A4031CCTCod[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09P63_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brk9P64 = false ;
            A194BarOrdLin = P09P63_A194BarOrdLin[0] ;
            A130BarCodPar = P09P63_A130BarCodPar[0] ;
            A132BarCodReo = P09P63_A132BarCodReo[0] ;
            A129BarCod = P09P63_A129BarCod[0] ;
            A396EmprCod = P09P63_A396EmprCod[0] ;
            A4031CCTCod = P09P63_A4031CCTCod[0] ;
            AV66count = (long)(AV66count+1) ;
            brk9P64 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV61Option = A758ProCod ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9P64 )
         {
            brk9P64 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tinccresultadoswwgetfilterdata.this.AV75OptionsJson;
      this.aP4[0] = tinccresultadoswwgetfilterdata.this.AV76OptionsDescJson;
      this.aP5[0] = tinccresultadoswwgetfilterdata.this.AV77OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV75OptionsJson = "" ;
      AV76OptionsDescJson = "" ;
      AV77OptionIndexesJson = "" ;
      AV62Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV65OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV67Session = httpContext.getWebSession();
      AV69GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV70GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV18TFBarCodPar = "" ;
      AV19TFBarCodPar_Sel = "" ;
      AV20TFProCod = "" ;
      AV21TFProCod_Sel = "" ;
      scmdbuf = "" ;
      lV18TFBarCodPar = "" ;
      lV20TFProCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      P09P62_A130BarCodPar = new String[] {""} ;
      P09P62_A194BarOrdLin = new short[1] ;
      P09P62_A758ProCod = new String[] {""} ;
      P09P62_A132BarCodReo = new byte[1] ;
      P09P62_A129BarCod = new int[1] ;
      P09P62_A396EmprCod = new String[] {""} ;
      P09P62_A4031CCTCod = new int[1] ;
      A396EmprCod = "" ;
      AV61Option = "" ;
      P09P63_A758ProCod = new String[] {""} ;
      P09P63_A194BarOrdLin = new short[1] ;
      P09P63_A130BarCodPar = new String[] {""} ;
      P09P63_A132BarCodReo = new byte[1] ;
      P09P63_A129BarCod = new int[1] ;
      P09P63_A396EmprCod = new String[] {""} ;
      P09P63_A4031CCTCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.tinccresultadoswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09P62_A130BarCodPar, P09P62_A194BarOrdLin, P09P62_A758ProCod, P09P62_A132BarCodReo, P09P62_A129BarCod, P09P62_A396EmprCod, P09P62_A4031CCTCod
            }
            , new Object[] {
            P09P63_A758ProCod, P09P63_A194BarOrdLin, P09P63_A130BarCodPar, P09P63_A132BarCodReo, P09P63_A129BarCod, P09P63_A396EmprCod, P09P63_A4031CCTCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFBarCodReo ;
   private byte AV17TFBarCodReo_To ;
   private byte A132BarCodReo ;
   private short AV22TFBarOrdLin ;
   private short AV23TFBarOrdLin_To ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV81GXV1 ;
   private int AV14TFBarCod ;
   private int AV15TFBarCod_To ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private long AV66count ;
   private String AV18TFBarCodPar ;
   private String AV19TFBarCodPar_Sel ;
   private String AV20TFProCod ;
   private String AV21TFProCod_Sel ;
   private String scmdbuf ;
   private String lV18TFBarCodPar ;
   private String lV20TFProCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9P62 ;
   private boolean brk9P64 ;
   private String AV75OptionsJson ;
   private String AV76OptionsDescJson ;
   private String AV77OptionIndexesJson ;
   private String AV72DDOName ;
   private String AV73SearchTxt ;
   private String AV74SearchTxtTo ;
   private String AV61Option ;
   private com.genexus.webpanels.WebSession AV67Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09P62_A130BarCodPar ;
   private short[] P09P62_A194BarOrdLin ;
   private String[] P09P62_A758ProCod ;
   private byte[] P09P62_A132BarCodReo ;
   private int[] P09P62_A129BarCod ;
   private String[] P09P62_A396EmprCod ;
   private int[] P09P62_A4031CCTCod ;
   private String[] P09P63_A758ProCod ;
   private short[] P09P63_A194BarOrdLin ;
   private String[] P09P63_A130BarCodPar ;
   private byte[] P09P63_A132BarCodReo ;
   private int[] P09P63_A129BarCod ;
   private String[] P09P63_A396EmprCod ;
   private int[] P09P63_A4031CCTCod ;
   private GXSimpleCollection<String> AV62Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV65OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
}

final  class tinccresultadoswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09P62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV14TFBarCod ,
                                          int AV15TFBarCod_To ,
                                          byte AV16TFBarCodReo ,
                                          byte AV17TFBarCodReo_To ,
                                          String AV19TFBarCodPar_Sel ,
                                          String AV18TFBarCodPar ,
                                          String AV21TFProCod_Sel ,
                                          String AV20TFProCod ,
                                          short AV22TFBarOrdLin ,
                                          short AV23TFBarOrdLin_To ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarOrdLin, ProCod, BarCodReo, BarCod, EmprCod, CCTCod FROM TXPCC" ;
      if ( ! (0==AV14TFBarCod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV15TFBarCod_To) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV16TFBarCodReo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV17TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV22TFBarOrdLin) )
      {
         addWhere(sWhereString, "(BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV23TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09P63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV14TFBarCod ,
                                          int AV15TFBarCod_To ,
                                          byte AV16TFBarCodReo ,
                                          byte AV17TFBarCodReo_To ,
                                          String AV19TFBarCodPar_Sel ,
                                          String AV18TFBarCodPar ,
                                          String AV21TFProCod_Sel ,
                                          String AV20TFProCod ,
                                          short AV22TFBarOrdLin ,
                                          short AV23TFBarOrdLin_To ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT ProCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, CCTCod FROM TXPCC" ;
      if ( ! (0==AV14TFBarCod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (0==AV15TFBarCod_To) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (0==AV16TFBarCodReo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV17TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFProCod_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFProCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFProCod_Sel)==0) )
      {
         addWhere(sWhereString, "(ProCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV22TFBarOrdLin) )
      {
         addWhere(sWhereString, "(BarOrdLin >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV23TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(BarOrdLin <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProCod" ;
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
                  return conditional_P09P62(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() );
            case 1 :
                  return conditional_P09P63(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09P62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09P63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               return;
      }
   }

}

