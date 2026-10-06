package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresionhdrscvdetalle_wcgetfilterdata extends GXProcedure
{
   public impresionhdrscvdetalle_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionhdrscvdetalle_wcgetfilterdata.class ), "" );
   }

   public impresionhdrscvdetalle_wcgetfilterdata( int remoteHandle ,
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
      impresionhdrscvdetalle_wcgetfilterdata.this.aP5 = new String[] {""};
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
      impresionhdrscvdetalle_wcgetfilterdata.this.AV16DDOName = aP0;
      impresionhdrscvdetalle_wcgetfilterdata.this.AV14SearchTxt = aP1;
      impresionhdrscvdetalle_wcgetfilterdata.this.AV15SearchTxtTo = aP2;
      impresionhdrscvdetalle_wcgetfilterdata.this.aP3 = aP3;
      impresionhdrscvdetalle_wcgetfilterdata.this.aP4 = aP4;
      impresionhdrscvdetalle_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARENCCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARENCCLIOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("PedidosClienteSinDetalle.ImpresionHDRsCvDetalle_WCGridState"), null, null);
      }
      AV38GXV1 = 1 ;
      while ( AV38GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV38GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV12TFBarEncCli = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV13TFBarEncCli_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV38GXV1 = (int)(AV38GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV14SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = AV32FilterFullText ;
      AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = AV12TFBarEncCli ;
      AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel = AV13TFBarEncCli_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ,
                                           AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ,
                                           AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ,
                                           AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ,
                                           AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4812BarEncCli ,
                                           AV35BarEncCli ,
                                           AV33Emprcod ,
                                           Integer.valueOf(AV34Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext), "%", "") ;
      lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext), "%", "") ;
      lV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr), 11, "%") ;
      lV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = GXutil.padr( GXutil.rtrim( AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli), 20, "%") ;
      /* Using cursor P09JY2 */
      pr_default.execute(0, new Object[] {AV33Emprcod, Integer.valueOf(AV34Clicod), AV35BarEncCli, lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext, lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext, lV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr, AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel, lV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli, AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09JY2_A252CliCod[0] ;
         n252CliCod = P09JY2_n252CliCod[0] ;
         A396EmprCod = P09JY2_A396EmprCod[0] ;
         A4812BarEncCli = P09JY2_A4812BarEncCli[0] ;
         A130BarCodPar = P09JY2_A130BarCodPar[0] ;
         A132BarCodReo = P09JY2_A132BarCodReo[0] ;
         A129BarCod = P09JY2_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV18Option = A13696BarNHdr ;
            AV17InsertIndex = 1 ;
            while ( ( AV17InsertIndex <= AV19Options.size() ) && ( GXutil.strcmp((String)AV19Options.elementAt(-1+AV17InsertIndex), AV18Option) < 0 ) )
            {
               AV17InsertIndex = (int)(AV17InsertIndex+1) ;
            }
            if ( ( AV17InsertIndex <= AV19Options.size() ) && ( GXutil.strcmp((String)AV19Options.elementAt(-1+AV17InsertIndex), AV18Option) == 0 ) )
            {
               AV26count = GXutil.lval( (String)AV24OptionIndexes.elementAt(-1+AV17InsertIndex)) ;
               AV26count = (long)(AV26count+1) ;
               AV24OptionIndexes.removeItem(AV17InsertIndex);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), AV17InsertIndex);
            }
            else
            {
               AV19Options.add(AV18Option, AV17InsertIndex);
               AV24OptionIndexes.add("1", AV17InsertIndex);
            }
         }
         if ( AV19Options.size() == 50 )
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
      /* 'LOADBARENCCLIOPTIONS' Routine */
      returnInSub = false ;
      AV12TFBarEncCli = AV14SearchTxt ;
      AV13TFBarEncCli_Sel = "" ;
      AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = AV32FilterFullText ;
      AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = AV12TFBarEncCli ;
      AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel = AV13TFBarEncCli_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ,
                                           AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ,
                                           AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ,
                                           AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ,
                                           AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4812BarEncCli ,
                                           A396EmprCod ,
                                           AV33Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV34Clicod) ,
                                           AV35BarEncCli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext), "%", "") ;
      lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext), "%", "") ;
      lV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr), 11, "%") ;
      lV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = GXutil.padr( GXutil.rtrim( AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli), 20, "%") ;
      /* Using cursor P09JY3 */
      pr_default.execute(1, new Object[] {AV35BarEncCli, AV33Emprcod, Integer.valueOf(AV34Clicod), lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext, lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext, lV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr, AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel, lV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli, AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9JY3 = false ;
         A396EmprCod = P09JY3_A396EmprCod[0] ;
         A252CliCod = P09JY3_A252CliCod[0] ;
         n252CliCod = P09JY3_n252CliCod[0] ;
         A4812BarEncCli = P09JY3_A4812BarEncCli[0] ;
         A130BarCodPar = P09JY3_A130BarCodPar[0] ;
         A132BarCodReo = P09JY3_A132BarCodReo[0] ;
         A129BarCod = P09JY3_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09JY3_A4812BarEncCli[0], A4812BarEncCli) == 0 ) )
         {
            brk9JY3 = false ;
            A396EmprCod = P09JY3_A396EmprCod[0] ;
            A130BarCodPar = P09JY3_A130BarCodPar[0] ;
            A132BarCodReo = P09JY3_A132BarCodReo[0] ;
            A129BarCod = P09JY3_A129BarCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9JY3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4812BarEncCli)==0) )
         {
            AV18Option = A4812BarEncCli ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9JY3 )
         {
            brk9JY3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = impresionhdrscvdetalle_wcgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = impresionhdrscvdetalle_wcgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = impresionhdrscvdetalle_wcgetfilterdata.this.AV25OptionIndexesJson;
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
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV12TFBarEncCli = "" ;
      AV13TFBarEncCli_Sel = "" ;
      A13696BarNHdr = "" ;
      AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = "" ;
      AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = "" ;
      AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel = "" ;
      AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = "" ;
      AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel = "" ;
      scmdbuf = "" ;
      lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext = "" ;
      lV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr = "" ;
      lV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli = "" ;
      A130BarCodPar = "" ;
      A4812BarEncCli = "" ;
      AV35BarEncCli = "" ;
      AV33Emprcod = "" ;
      A396EmprCod = "" ;
      P09JY2_A252CliCod = new int[1] ;
      P09JY2_n252CliCod = new boolean[] {false} ;
      P09JY2_A396EmprCod = new String[] {""} ;
      P09JY2_A4812BarEncCli = new String[] {""} ;
      P09JY2_A130BarCodPar = new String[] {""} ;
      P09JY2_A132BarCodReo = new byte[1] ;
      P09JY2_A129BarCod = new int[1] ;
      AV18Option = "" ;
      P09JY3_A396EmprCod = new String[] {""} ;
      P09JY3_A252CliCod = new int[1] ;
      P09JY3_n252CliCod = new boolean[] {false} ;
      P09JY3_A4812BarEncCli = new String[] {""} ;
      P09JY3_A130BarCodPar = new String[] {""} ;
      P09JY3_A132BarCodReo = new byte[1] ;
      P09JY3_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.impresionhdrscvdetalle_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09JY2_A252CliCod, P09JY2_n252CliCod, P09JY2_A396EmprCod, P09JY2_A4812BarEncCli, P09JY2_A130BarCodPar, P09JY2_A132BarCodReo, P09JY2_A129BarCod
            }
            , new Object[] {
            P09JY3_A396EmprCod, P09JY3_A252CliCod, P09JY3_n252CliCod, P09JY3_A4812BarEncCli, P09JY3_A130BarCodPar, P09JY3_A132BarCodReo, P09JY3_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV38GXV1 ;
   private int A129BarCod ;
   private int AV34Clicod ;
   private int A252CliCod ;
   private int AV17InsertIndex ;
   private long AV26count ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV12TFBarEncCli ;
   private String AV13TFBarEncCli_Sel ;
   private String A13696BarNHdr ;
   private String AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ;
   private String AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ;
   private String AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ;
   private String AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ;
   private String scmdbuf ;
   private String lV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ;
   private String lV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ;
   private String A130BarCodPar ;
   private String A4812BarEncCli ;
   private String AV35BarEncCli ;
   private String AV33Emprcod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean brk9JY3 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ;
   private String lV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09JY2_A252CliCod ;
   private boolean[] P09JY2_n252CliCod ;
   private String[] P09JY2_A396EmprCod ;
   private String[] P09JY2_A4812BarEncCli ;
   private String[] P09JY2_A130BarCodPar ;
   private byte[] P09JY2_A132BarCodReo ;
   private int[] P09JY2_A129BarCod ;
   private String[] P09JY3_A396EmprCod ;
   private int[] P09JY3_A252CliCod ;
   private boolean[] P09JY3_n252CliCod ;
   private String[] P09JY3_A4812BarEncCli ;
   private String[] P09JY3_A130BarCodPar ;
   private byte[] P09JY3_A132BarCodReo ;
   private int[] P09JY3_A129BarCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class impresionhdrscvdetalle_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09JY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ,
                                          String AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ,
                                          String AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ,
                                          String AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ,
                                          String AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4812BarEncCli ,
                                          String AV35BarEncCli ,
                                          String AV33Emprcod ,
                                          int AV34Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CliCod, EmprCod, BarEncCli, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      addWhere(sWhereString, "(BarEncCli = ?)");
      if ( ! (GXutil.strcmp("", AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarEncCli) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09JY3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext ,
                                          String AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel ,
                                          String AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr ,
                                          String AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel ,
                                          String AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4812BarEncCli ,
                                          String A396EmprCod ,
                                          String AV33Emprcod ,
                                          int A252CliCod ,
                                          int AV34Clicod ,
                                          String AV35BarEncCli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, BarEncCli, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(BarEncCli = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV40Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarEncCli) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV41Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV43Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_4_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Pedidosclientesindetalle_impresionhdrscvdetalle_wcds_5_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarEncCli" ;
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
                  return conditional_P09JY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() );
            case 1 :
                  return conditional_P09JY3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09JY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09JY3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
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
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 20);
               }
               return;
      }
   }

}

