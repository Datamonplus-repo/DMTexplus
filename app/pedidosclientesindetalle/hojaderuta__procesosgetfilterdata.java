package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta__procesosgetfilterdata extends GXProcedure
{
   public hojaderuta__procesosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta__procesosgetfilterdata.class ), "" );
   }

   public hojaderuta__procesosgetfilterdata( int remoteHandle ,
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
      hojaderuta__procesosgetfilterdata.this.aP5 = new String[] {""};
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
      hojaderuta__procesosgetfilterdata.this.AV26DDOName = aP0;
      hojaderuta__procesosgetfilterdata.this.AV27SearchTxt = aP1;
      hojaderuta__procesosgetfilterdata.this.AV28SearchTxtTo = aP2;
      hojaderuta__procesosgetfilterdata.this.aP3 = aP3;
      hojaderuta__procesosgetfilterdata.this.aP4 = aP4;
      hojaderuta__procesosgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRODSCOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("PedidosClienteSinDetalle.HojadeRuta__ProcesosGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta__ProcesosGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("PedidosClienteSinDetalle.HojadeRuta__ProcesosGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV10TFProCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV11TFProCod_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC") == 0 )
         {
            AV12TFProDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRODSC_SEL") == 0 )
         {
            AV13TFProDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFASEST") == 0 )
         {
            AV37TFProFasEst = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFProFasEst_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFProCod = AV27SearchTxt ;
      AV11TFProCod_Sel = "" ;
      AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV10TFProCod ;
      AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV11TFProCod_Sel ;
      AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV12TFProDsc ;
      AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV37TFProFasEst ;
      AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV38TFProFasEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ,
                                           AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ,
                                           AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ,
                                           AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           Byte.valueOf(AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest) ,
                                           Byte.valueOf(A760ProFasEst) ,
                                           Byte.valueOf(AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV34BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV35BarCodReo) ,
                                           A130BarCodPar ,
                                           AV36BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod), 8, "%") ;
      lV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc), 40, "%") ;
      /* Using cursor P0A5P3 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest), Byte.valueOf(AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest), Byte.valueOf(AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to), Byte.valueOf(AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to), Integer.valueOf(AV34BarCod), Byte.valueOf(AV35BarCodReo), AV36BarCodPar, lV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod, AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel, lV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc, AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA5P2 = false ;
         A396EmprCod = P0A5P3_A396EmprCod[0] ;
         A129BarCod = P0A5P3_A129BarCod[0] ;
         A132BarCodReo = P0A5P3_A132BarCodReo[0] ;
         A130BarCodPar = P0A5P3_A130BarCodPar[0] ;
         A758ProCod = P0A5P3_A758ProCod[0] ;
         A759ProDsc = P0A5P3_A759ProDsc[0] ;
         A760ProFasEst = P0A5P3_A760ProFasEst[0] ;
         n760ProFasEst = P0A5P3_n760ProFasEst[0] ;
         A759ProDsc = P0A5P3_A759ProDsc[0] ;
         A760ProFasEst = P0A5P3_A760ProFasEst[0] ;
         n760ProFasEst = P0A5P3_n760ProFasEst[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A5P3_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brkA5P2 = false ;
            A396EmprCod = P0A5P3_A396EmprCod[0] ;
            A129BarCod = P0A5P3_A129BarCod[0] ;
            A132BarCodReo = P0A5P3_A132BarCodReo[0] ;
            A130BarCodPar = P0A5P3_A130BarCodPar[0] ;
            AV20count = (long)(AV20count+1) ;
            brkA5P2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV15Option = A758ProCod ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA5P2 )
         {
            brkA5P2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProDsc = AV27SearchTxt ;
      AV13TFProDsc_Sel = "" ;
      AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = AV10TFProCod ;
      AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = AV11TFProCod_Sel ;
      AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = AV12TFProDsc ;
      AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = AV13TFProDsc_Sel ;
      AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest = AV37TFProFasEst ;
      AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to = AV38TFProFasEst_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ,
                                           AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ,
                                           AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ,
                                           AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ,
                                           A758ProCod ,
                                           A759ProDsc ,
                                           Byte.valueOf(AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest) ,
                                           Byte.valueOf(A760ProFasEst) ,
                                           Byte.valueOf(AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV34BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV35BarCodReo) ,
                                           A130BarCodPar ,
                                           AV36BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = GXutil.padr( GXutil.rtrim( AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod), 8, "%") ;
      lV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = GXutil.padr( GXutil.rtrim( AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc), 40, "%") ;
      /* Using cursor P0A5P5 */
      pr_default.execute(1, new Object[] {Byte.valueOf(AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest), Byte.valueOf(AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest), Byte.valueOf(AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to), Byte.valueOf(AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to), Integer.valueOf(AV34BarCod), Byte.valueOf(AV35BarCodReo), AV36BarCodPar, lV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod, AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel, lV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc, AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA5P4 = false ;
         A758ProCod = P0A5P5_A758ProCod[0] ;
         A396EmprCod = P0A5P5_A396EmprCod[0] ;
         A130BarCodPar = P0A5P5_A130BarCodPar[0] ;
         A132BarCodReo = P0A5P5_A132BarCodReo[0] ;
         A129BarCod = P0A5P5_A129BarCod[0] ;
         A759ProDsc = P0A5P5_A759ProDsc[0] ;
         A760ProFasEst = P0A5P5_A760ProFasEst[0] ;
         n760ProFasEst = P0A5P5_n760ProFasEst[0] ;
         A759ProDsc = P0A5P5_A759ProDsc[0] ;
         A760ProFasEst = P0A5P5_A760ProFasEst[0] ;
         n760ProFasEst = P0A5P5_n760ProFasEst[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A5P5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A5P5_A758ProCod[0], A758ProCod) == 0 ) )
         {
            brkA5P4 = false ;
            A130BarCodPar = P0A5P5_A130BarCodPar[0] ;
            A132BarCodReo = P0A5P5_A132BarCodReo[0] ;
            A129BarCod = P0A5P5_A129BarCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkA5P4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A759ProDsc)==0) )
         {
            AV15Option = A759ProDsc ;
            AV14InsertIndex = 1 ;
            while ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) < 0 ) )
            {
               AV14InsertIndex = (int)(AV14InsertIndex+1) ;
            }
            AV16Options.add(AV15Option, AV14InsertIndex);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), AV14InsertIndex);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA5P4 )
         {
            brkA5P4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = hojaderuta__procesosgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = hojaderuta__procesosgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = hojaderuta__procesosgetfilterdata.this.AV31OptionIndexesJson;
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
      AV10TFProCod = "" ;
      AV11TFProCod_Sel = "" ;
      AV12TFProDsc = "" ;
      AV13TFProDsc_Sel = "" ;
      A758ProCod = "" ;
      AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = "" ;
      AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel = "" ;
      AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = "" ;
      AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel = "" ;
      scmdbuf = "" ;
      lV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod = "" ;
      lV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc = "" ;
      A759ProDsc = "" ;
      A130BarCodPar = "" ;
      AV36BarCodPar = "" ;
      P0A5P3_A396EmprCod = new String[] {""} ;
      P0A5P3_A129BarCod = new int[1] ;
      P0A5P3_A132BarCodReo = new byte[1] ;
      P0A5P3_A130BarCodPar = new String[] {""} ;
      P0A5P3_A758ProCod = new String[] {""} ;
      P0A5P3_A759ProDsc = new String[] {""} ;
      P0A5P3_A760ProFasEst = new byte[1] ;
      P0A5P3_n760ProFasEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV15Option = "" ;
      P0A5P5_A758ProCod = new String[] {""} ;
      P0A5P5_A396EmprCod = new String[] {""} ;
      P0A5P5_A130BarCodPar = new String[] {""} ;
      P0A5P5_A132BarCodReo = new byte[1] ;
      P0A5P5_A129BarCod = new int[1] ;
      P0A5P5_A759ProDsc = new String[] {""} ;
      P0A5P5_A760ProFasEst = new byte[1] ;
      P0A5P5_n760ProFasEst = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta__procesosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A5P3_A396EmprCod, P0A5P3_A129BarCod, P0A5P3_A132BarCodReo, P0A5P3_A130BarCodPar, P0A5P3_A758ProCod, P0A5P3_A759ProDsc, P0A5P3_A760ProFasEst, P0A5P3_n760ProFasEst
            }
            , new Object[] {
            P0A5P5_A758ProCod, P0A5P5_A396EmprCod, P0A5P5_A130BarCodPar, P0A5P5_A132BarCodReo, P0A5P5_A129BarCod, P0A5P5_A759ProDsc, P0A5P5_A760ProFasEst, P0A5P5_n760ProFasEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37TFProFasEst ;
   private byte AV38TFProFasEst_To ;
   private byte AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest ;
   private byte AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to ;
   private byte A760ProFasEst ;
   private byte A132BarCodReo ;
   private byte AV35BarCodReo ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private int A129BarCod ;
   private int AV34BarCod ;
   private int AV14InsertIndex ;
   private long AV20count ;
   private String AV10TFProCod ;
   private String AV11TFProCod_Sel ;
   private String AV12TFProDsc ;
   private String AV13TFProDsc_Sel ;
   private String A758ProCod ;
   private String AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ;
   private String AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ;
   private String AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ;
   private String AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ;
   private String scmdbuf ;
   private String lV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ;
   private String lV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ;
   private String A759ProDsc ;
   private String A130BarCodPar ;
   private String AV36BarCodPar ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA5P2 ;
   private boolean n760ProFasEst ;
   private boolean brkA5P4 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A5P3_A396EmprCod ;
   private int[] P0A5P3_A129BarCod ;
   private byte[] P0A5P3_A132BarCodReo ;
   private String[] P0A5P3_A130BarCodPar ;
   private String[] P0A5P3_A758ProCod ;
   private String[] P0A5P3_A759ProDsc ;
   private byte[] P0A5P3_A760ProFasEst ;
   private boolean[] P0A5P3_n760ProFasEst ;
   private String[] P0A5P5_A758ProCod ;
   private String[] P0A5P5_A396EmprCod ;
   private String[] P0A5P5_A130BarCodPar ;
   private byte[] P0A5P5_A132BarCodReo ;
   private int[] P0A5P5_A129BarCod ;
   private String[] P0A5P5_A759ProDsc ;
   private byte[] P0A5P5_A760ProFasEst ;
   private boolean[] P0A5P5_n760ProFasEst ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class hojaderuta__procesosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A5P3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ,
                                          String AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ,
                                          String AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ,
                                          String AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          byte AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest ,
                                          byte A760ProFasEst ,
                                          byte AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to ,
                                          int A129BarCod ,
                                          int AV34BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV35BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV36BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T2.ProDsc, COALESCE( T3.ProFasEst, 0) AS ProFasEst FROM ((TXPBARPRO T1 INNER JOIN TXPPROCES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS" ;
      scmdbuf += " WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ProFasEst, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ProFasEst, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A5P5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel ,
                                          String AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod ,
                                          String AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel ,
                                          String AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc ,
                                          String A758ProCod ,
                                          String A759ProDsc ,
                                          byte AV47Pedidosclientesindetalle_hojaderuta__procesosds_5_tfprofasest ,
                                          byte A760ProFasEst ,
                                          byte AV48Pedidosclientesindetalle_hojaderuta__procesosds_6_tfprofasest_to ,
                                          int A129BarCod ,
                                          int AV34BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV35BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV36BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[11];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ProDsc, COALESCE( T3.ProFasEst, 0) AS ProFasEst FROM ((TXPBARPRO T1 INNER JOIN TXPPROCES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS" ;
      scmdbuf += " WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ProFasEst, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ProFasEst, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV43Pedidosclientesindetalle_hojaderuta__procesosds_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Pedidosclientesindetalle_hojaderuta__procesosds_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV45Pedidosclientesindetalle_hojaderuta__procesosds_3_tfprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Pedidosclientesindetalle_hojaderuta__procesosds_4_tfprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProDsc = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProCod" ;
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
                  return conditional_P0A5P3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] );
            case 1 :
                  return conditional_P0A5P5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A5P3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5P5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 40);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 40);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 40);
               }
               return;
      }
   }

}

