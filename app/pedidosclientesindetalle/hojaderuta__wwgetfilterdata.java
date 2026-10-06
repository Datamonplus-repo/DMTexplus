package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta__wwgetfilterdata extends GXProcedure
{
   public hojaderuta__wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta__wwgetfilterdata.class ), "" );
   }

   public hojaderuta__wwgetfilterdata( int remoteHandle ,
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
      hojaderuta__wwgetfilterdata.this.aP5 = new String[] {""};
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
      hojaderuta__wwgetfilterdata.this.AV28DDOName = aP0;
      hojaderuta__wwgetfilterdata.this.AV29SearchTxt = aP1;
      hojaderuta__wwgetfilterdata.this.AV30SearchTxtTo = aP2;
      hojaderuta__wwgetfilterdata.this.aP3 = aP3;
      hojaderuta__wwgetfilterdata.this.aP4 = aP4;
      hojaderuta__wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PEDIDOCLIENTE") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDIDOCLIENTEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARMAQCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARACAQUI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARACAQUIOPTIONS' */
         S181 ();
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
      if ( GXutil.strcmp(AV23Session.getValue("PedidosClienteSinDetalle.HojadeRuta__WWGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta__WWGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("PedidosClienteSinDetalle.HojadeRuta__WWGridState"), null, null);
      }
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOD") == 0 )
         {
            AV38BarCod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCODREO") == 0 )
         {
            AV39BarCodReo = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCODPAR") == 0 )
         {
            AV70BarCodPar = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLICOD") == 0 )
         {
            AV41CliCod = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECGEN") == 0 )
         {
            AV71BarFecGen = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV72BarFecGen_To = localUtil.ctod( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSIT") == 0 )
         {
            AV73BarSit = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74BarSit_To = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV14TFPedidoCliente = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV15TFPedidoCliente_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV46TFBarSer = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV47TFBarSer_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV48TFBarSerDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV49TFBarSerDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV50TFBarColNom = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV51TFBarColNom_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV52TFBarColNum = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFBarColNum_To = (int)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV58TFBarMaqCod = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV59TFBarMaqCod_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI") == 0 )
         {
            AV66TFBarAcaQui = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI_SEL") == 0 )
         {
            AV67TFBarAcaQui_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV75TFHayRec_Sel = (byte)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV29SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV38BarCod) ,
                                           Byte.valueOf(AV39BarCodReo) ,
                                           AV70BarCodPar ,
                                           Integer.valueOf(AV41CliCod) ,
                                           AV71BarFecGen ,
                                           AV72BarFecGen_To ,
                                           Byte.valueOf(AV73BarSit) ,
                                           Byte.valueOf(AV74BarSit_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV59TFBarMaqCod_Sel ,
                                           AV58TFBarMaqCod ,
                                           AV67TFBarAcaQui_Sel ,
                                           AV66TFBarAcaQui ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A118BarAcaQui ,
                                           AV34FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV15TFPedidoCliente_Sel ,
                                           AV14TFPedidoCliente ,
                                           Byte.valueOf(AV75TFHayRec_Sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           A396EmprCod ,
                                           AV35Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV58TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV58TFBarMaqCod), 6, "%") ;
      lV66TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV66TFBarAcaQui), 6, "%") ;
      /* Using cursor P0AHM2 */
      pr_default.execute(0, new Object[] {AV35Emprcod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV70BarCodPar, Integer.valueOf(AV41CliCod), AV71BarFecGen, AV72BarFecGen_To, Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_To), lV12TFCliNom, AV13TFCliNom_Sel, lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV58TFBarMaqCod, AV59TFBarMaqCod_Sel, lV66TFBarAcaQui, AV67TFBarAcaQui_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAHM2 = false ;
         A279CliNom = P0AHM2_A279CliNom[0] ;
         A213BarSit = P0AHM2_A213BarSit[0] ;
         A159BarFecGen = P0AHM2_A159BarFecGen[0] ;
         A118BarAcaQui = P0AHM2_A118BarAcaQui[0] ;
         A180BarMaqCod = P0AHM2_A180BarMaqCod[0] ;
         A136BarColNum = P0AHM2_A136BarColNum[0] ;
         A135BarColNom = P0AHM2_A135BarColNom[0] ;
         A1652BarSerDsc = P0AHM2_A1652BarSerDsc[0] ;
         A212BarSer = P0AHM2_A212BarSer[0] ;
         A13696BarNHdr = P0AHM2_A13696BarNHdr[0] ;
         A252CliCod = P0AHM2_A252CliCod[0] ;
         n252CliCod = P0AHM2_n252CliCod[0] ;
         A143BarDisNum = P0AHM2_A143BarDisNum[0] ;
         A4812BarEncCli = P0AHM2_A4812BarEncCli[0] ;
         A130BarCodPar = P0AHM2_A130BarCodPar[0] ;
         A132BarCodReo = P0AHM2_A132BarCodReo[0] ;
         A129BarCod = P0AHM2_A129BarCod[0] ;
         A396EmprCod = P0AHM2_A396EmprCod[0] ;
         A279CliNom = P0AHM2_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         hojaderuta__wwgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         hojaderuta__wwgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         hojaderuta__wwgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         hojaderuta__wwgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV34FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV14TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV15TFPedidoCliente_Sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  hojaderuta__wwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV75TFHayRec_Sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV75TFHayRec_Sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV22count = 0 ;
                        while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AHM2_A279CliNom[0], A279CliNom) == 0 ) )
                        {
                           brkAHM2 = false ;
                           A252CliCod = P0AHM2_A252CliCod[0] ;
                           n252CliCod = P0AHM2_n252CliCod[0] ;
                           A130BarCodPar = P0AHM2_A130BarCodPar[0] ;
                           A132BarCodReo = P0AHM2_A132BarCodReo[0] ;
                           A129BarCod = P0AHM2_A129BarCod[0] ;
                           A396EmprCod = P0AHM2_A396EmprCod[0] ;
                           AV22count = (long)(AV22count+1) ;
                           brkAHM2 = true ;
                           pr_default.readNext(0);
                        }
                        if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                        {
                           AV17Option = A279CliNom ;
                           AV18Options.add(AV17Option, 0);
                           AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV18Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkAHM2 )
         {
            brkAHM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPedidoCliente = AV29SearchTxt ;
      AV15TFPedidoCliente_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV38BarCod) ,
                                           Byte.valueOf(AV39BarCodReo) ,
                                           AV70BarCodPar ,
                                           Integer.valueOf(AV41CliCod) ,
                                           AV71BarFecGen ,
                                           AV72BarFecGen_To ,
                                           Byte.valueOf(AV73BarSit) ,
                                           Byte.valueOf(AV74BarSit_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV59TFBarMaqCod_Sel ,
                                           AV58TFBarMaqCod ,
                                           AV67TFBarAcaQui_Sel ,
                                           AV66TFBarAcaQui ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A118BarAcaQui ,
                                           AV34FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV15TFPedidoCliente_Sel ,
                                           AV14TFPedidoCliente ,
                                           Byte.valueOf(AV75TFHayRec_Sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV58TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV58TFBarMaqCod), 6, "%") ;
      lV66TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV66TFBarAcaQui), 6, "%") ;
      /* Using cursor P0AHM3 */
      pr_default.execute(1, new Object[] {AV35Emprcod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV70BarCodPar, Integer.valueOf(AV41CliCod), AV71BarFecGen, AV72BarFecGen_To, Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_To), lV12TFCliNom, AV13TFCliNom_Sel, lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV58TFBarMaqCod, AV59TFBarMaqCod_Sel, lV66TFBarAcaQui, AV67TFBarAcaQui_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A213BarSit = P0AHM3_A213BarSit[0] ;
         A159BarFecGen = P0AHM3_A159BarFecGen[0] ;
         A118BarAcaQui = P0AHM3_A118BarAcaQui[0] ;
         A180BarMaqCod = P0AHM3_A180BarMaqCod[0] ;
         A136BarColNum = P0AHM3_A136BarColNum[0] ;
         A135BarColNom = P0AHM3_A135BarColNom[0] ;
         A1652BarSerDsc = P0AHM3_A1652BarSerDsc[0] ;
         A212BarSer = P0AHM3_A212BarSer[0] ;
         A13696BarNHdr = P0AHM3_A13696BarNHdr[0] ;
         A279CliNom = P0AHM3_A279CliNom[0] ;
         A252CliCod = P0AHM3_A252CliCod[0] ;
         n252CliCod = P0AHM3_n252CliCod[0] ;
         A143BarDisNum = P0AHM3_A143BarDisNum[0] ;
         A4812BarEncCli = P0AHM3_A4812BarEncCli[0] ;
         A130BarCodPar = P0AHM3_A130BarCodPar[0] ;
         A132BarCodReo = P0AHM3_A132BarCodReo[0] ;
         A129BarCod = P0AHM3_A129BarCod[0] ;
         A396EmprCod = P0AHM3_A396EmprCod[0] ;
         A279CliNom = P0AHM3_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta__wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta__wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta__wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV34FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV14TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV15TFPedidoCliente_Sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  hojaderuta__wwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV75TFHayRec_Sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV75TFHayRec_Sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                        {
                           AV17Option = A13878PedidoClie ;
                           AV16InsertIndex = 1 ;
                           while ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) < 0 ) )
                           {
                              AV16InsertIndex = (int)(AV16InsertIndex+1) ;
                           }
                           if ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) == 0 ) )
                           {
                              AV22count = GXutil.lval( (String)AV21OptionIndexes.elementAt(-1+AV16InsertIndex)) ;
                              AV22count = (long)(AV22count+1) ;
                              AV21OptionIndexes.removeItem(AV16InsertIndex);
                              AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), AV16InsertIndex);
                           }
                           else
                           {
                              AV18Options.add(AV17Option, AV16InsertIndex);
                              AV21OptionIndexes.add("1", AV16InsertIndex);
                           }
                        }
                        if ( AV18Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV46TFBarSer = AV29SearchTxt ;
      AV47TFBarSer_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV38BarCod) ,
                                           Byte.valueOf(AV39BarCodReo) ,
                                           AV70BarCodPar ,
                                           Integer.valueOf(AV41CliCod) ,
                                           AV71BarFecGen ,
                                           AV72BarFecGen_To ,
                                           Byte.valueOf(AV73BarSit) ,
                                           Byte.valueOf(AV74BarSit_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV59TFBarMaqCod_Sel ,
                                           AV58TFBarMaqCod ,
                                           AV67TFBarAcaQui_Sel ,
                                           AV66TFBarAcaQui ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A118BarAcaQui ,
                                           AV34FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV15TFPedidoCliente_Sel ,
                                           AV14TFPedidoCliente ,
                                           Byte.valueOf(AV75TFHayRec_Sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV58TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV58TFBarMaqCod), 6, "%") ;
      lV66TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV66TFBarAcaQui), 6, "%") ;
      /* Using cursor P0AHM4 */
      pr_default.execute(2, new Object[] {AV35Emprcod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV70BarCodPar, Integer.valueOf(AV41CliCod), AV71BarFecGen, AV72BarFecGen_To, Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_To), lV12TFCliNom, AV13TFCliNom_Sel, lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV58TFBarMaqCod, AV59TFBarMaqCod_Sel, lV66TFBarAcaQui, AV67TFBarAcaQui_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAHM5 = false ;
         A212BarSer = P0AHM4_A212BarSer[0] ;
         A213BarSit = P0AHM4_A213BarSit[0] ;
         A159BarFecGen = P0AHM4_A159BarFecGen[0] ;
         A118BarAcaQui = P0AHM4_A118BarAcaQui[0] ;
         A180BarMaqCod = P0AHM4_A180BarMaqCod[0] ;
         A136BarColNum = P0AHM4_A136BarColNum[0] ;
         A135BarColNom = P0AHM4_A135BarColNom[0] ;
         A1652BarSerDsc = P0AHM4_A1652BarSerDsc[0] ;
         A13696BarNHdr = P0AHM4_A13696BarNHdr[0] ;
         A279CliNom = P0AHM4_A279CliNom[0] ;
         A252CliCod = P0AHM4_A252CliCod[0] ;
         n252CliCod = P0AHM4_n252CliCod[0] ;
         A143BarDisNum = P0AHM4_A143BarDisNum[0] ;
         A4812BarEncCli = P0AHM4_A4812BarEncCli[0] ;
         A130BarCodPar = P0AHM4_A130BarCodPar[0] ;
         A132BarCodReo = P0AHM4_A132BarCodReo[0] ;
         A129BarCod = P0AHM4_A129BarCod[0] ;
         A396EmprCod = P0AHM4_A396EmprCod[0] ;
         A279CliNom = P0AHM4_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta__wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta__wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta__wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV34FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV14TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV15TFPedidoCliente_Sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  hojaderuta__wwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV75TFHayRec_Sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV75TFHayRec_Sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV22count = 0 ;
                        while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AHM4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AHM4_A212BarSer[0], A212BarSer) == 0 ) )
                        {
                           brkAHM5 = false ;
                           A130BarCodPar = P0AHM4_A130BarCodPar[0] ;
                           A132BarCodReo = P0AHM4_A132BarCodReo[0] ;
                           A129BarCod = P0AHM4_A129BarCod[0] ;
                           AV22count = (long)(AV22count+1) ;
                           brkAHM5 = true ;
                           pr_default.readNext(2);
                        }
                        if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                        {
                           AV17Option = A212BarSer ;
                           AV18Options.add(AV17Option, 0);
                           AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV18Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkAHM5 )
         {
            brkAHM5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV48TFBarSerDsc = AV29SearchTxt ;
      AV49TFBarSerDsc_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV38BarCod) ,
                                           Byte.valueOf(AV39BarCodReo) ,
                                           AV70BarCodPar ,
                                           Integer.valueOf(AV41CliCod) ,
                                           AV71BarFecGen ,
                                           AV72BarFecGen_To ,
                                           Byte.valueOf(AV73BarSit) ,
                                           Byte.valueOf(AV74BarSit_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV59TFBarMaqCod_Sel ,
                                           AV58TFBarMaqCod ,
                                           AV67TFBarAcaQui_Sel ,
                                           AV66TFBarAcaQui ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A118BarAcaQui ,
                                           AV34FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV15TFPedidoCliente_Sel ,
                                           AV14TFPedidoCliente ,
                                           Byte.valueOf(AV75TFHayRec_Sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           A396EmprCod ,
                                           AV35Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV58TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV58TFBarMaqCod), 6, "%") ;
      lV66TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV66TFBarAcaQui), 6, "%") ;
      /* Using cursor P0AHM5 */
      pr_default.execute(3, new Object[] {AV35Emprcod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV70BarCodPar, Integer.valueOf(AV41CliCod), AV71BarFecGen, AV72BarFecGen_To, Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_To), lV12TFCliNom, AV13TFCliNom_Sel, lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV58TFBarMaqCod, AV59TFBarMaqCod_Sel, lV66TFBarAcaQui, AV67TFBarAcaQui_Sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAHM7 = false ;
         A1652BarSerDsc = P0AHM5_A1652BarSerDsc[0] ;
         A213BarSit = P0AHM5_A213BarSit[0] ;
         A159BarFecGen = P0AHM5_A159BarFecGen[0] ;
         A118BarAcaQui = P0AHM5_A118BarAcaQui[0] ;
         A180BarMaqCod = P0AHM5_A180BarMaqCod[0] ;
         A136BarColNum = P0AHM5_A136BarColNum[0] ;
         A135BarColNom = P0AHM5_A135BarColNom[0] ;
         A212BarSer = P0AHM5_A212BarSer[0] ;
         A13696BarNHdr = P0AHM5_A13696BarNHdr[0] ;
         A279CliNom = P0AHM5_A279CliNom[0] ;
         A252CliCod = P0AHM5_A252CliCod[0] ;
         n252CliCod = P0AHM5_n252CliCod[0] ;
         A143BarDisNum = P0AHM5_A143BarDisNum[0] ;
         A4812BarEncCli = P0AHM5_A4812BarEncCli[0] ;
         A130BarCodPar = P0AHM5_A130BarCodPar[0] ;
         A132BarCodReo = P0AHM5_A132BarCodReo[0] ;
         A129BarCod = P0AHM5_A129BarCod[0] ;
         A396EmprCod = P0AHM5_A396EmprCod[0] ;
         A279CliNom = P0AHM5_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta__wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta__wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta__wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV34FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV14TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV15TFPedidoCliente_Sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  hojaderuta__wwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV75TFHayRec_Sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV75TFHayRec_Sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV22count = 0 ;
                        while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AHM5_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                        {
                           brkAHM7 = false ;
                           A130BarCodPar = P0AHM5_A130BarCodPar[0] ;
                           A132BarCodReo = P0AHM5_A132BarCodReo[0] ;
                           A129BarCod = P0AHM5_A129BarCod[0] ;
                           A396EmprCod = P0AHM5_A396EmprCod[0] ;
                           AV22count = (long)(AV22count+1) ;
                           brkAHM7 = true ;
                           pr_default.readNext(3);
                        }
                        if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                        {
                           AV17Option = A1652BarSerDsc ;
                           AV18Options.add(AV17Option, 0);
                           AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV18Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkAHM7 )
         {
            brkAHM7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV50TFBarColNom = AV29SearchTxt ;
      AV51TFBarColNom_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV38BarCod) ,
                                           Byte.valueOf(AV39BarCodReo) ,
                                           AV70BarCodPar ,
                                           Integer.valueOf(AV41CliCod) ,
                                           AV71BarFecGen ,
                                           AV72BarFecGen_To ,
                                           Byte.valueOf(AV73BarSit) ,
                                           Byte.valueOf(AV74BarSit_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV59TFBarMaqCod_Sel ,
                                           AV58TFBarMaqCod ,
                                           AV67TFBarAcaQui_Sel ,
                                           AV66TFBarAcaQui ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A118BarAcaQui ,
                                           AV34FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV15TFPedidoCliente_Sel ,
                                           AV14TFPedidoCliente ,
                                           Byte.valueOf(AV75TFHayRec_Sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           A396EmprCod ,
                                           AV35Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV58TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV58TFBarMaqCod), 6, "%") ;
      lV66TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV66TFBarAcaQui), 6, "%") ;
      /* Using cursor P0AHM6 */
      pr_default.execute(4, new Object[] {AV35Emprcod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV70BarCodPar, Integer.valueOf(AV41CliCod), AV71BarFecGen, AV72BarFecGen_To, Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_To), lV12TFCliNom, AV13TFCliNom_Sel, lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV58TFBarMaqCod, AV59TFBarMaqCod_Sel, lV66TFBarAcaQui, AV67TFBarAcaQui_Sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAHM9 = false ;
         A135BarColNom = P0AHM6_A135BarColNom[0] ;
         A213BarSit = P0AHM6_A213BarSit[0] ;
         A159BarFecGen = P0AHM6_A159BarFecGen[0] ;
         A118BarAcaQui = P0AHM6_A118BarAcaQui[0] ;
         A180BarMaqCod = P0AHM6_A180BarMaqCod[0] ;
         A136BarColNum = P0AHM6_A136BarColNum[0] ;
         A1652BarSerDsc = P0AHM6_A1652BarSerDsc[0] ;
         A212BarSer = P0AHM6_A212BarSer[0] ;
         A13696BarNHdr = P0AHM6_A13696BarNHdr[0] ;
         A279CliNom = P0AHM6_A279CliNom[0] ;
         A252CliCod = P0AHM6_A252CliCod[0] ;
         n252CliCod = P0AHM6_n252CliCod[0] ;
         A143BarDisNum = P0AHM6_A143BarDisNum[0] ;
         A4812BarEncCli = P0AHM6_A4812BarEncCli[0] ;
         A130BarCodPar = P0AHM6_A130BarCodPar[0] ;
         A132BarCodReo = P0AHM6_A132BarCodReo[0] ;
         A129BarCod = P0AHM6_A129BarCod[0] ;
         A396EmprCod = P0AHM6_A396EmprCod[0] ;
         A279CliNom = P0AHM6_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta__wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta__wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta__wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV34FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV14TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV15TFPedidoCliente_Sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  hojaderuta__wwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV75TFHayRec_Sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV75TFHayRec_Sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV22count = 0 ;
                        while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AHM6_A135BarColNom[0], A135BarColNom) == 0 ) )
                        {
                           brkAHM9 = false ;
                           A130BarCodPar = P0AHM6_A130BarCodPar[0] ;
                           A132BarCodReo = P0AHM6_A132BarCodReo[0] ;
                           A129BarCod = P0AHM6_A129BarCod[0] ;
                           A396EmprCod = P0AHM6_A396EmprCod[0] ;
                           AV22count = (long)(AV22count+1) ;
                           brkAHM9 = true ;
                           pr_default.readNext(4);
                        }
                        if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                        {
                           AV17Option = A135BarColNom ;
                           AV18Options.add(AV17Option, 0);
                           AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV18Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkAHM9 )
         {
            brkAHM9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV58TFBarMaqCod = AV29SearchTxt ;
      AV59TFBarMaqCod_Sel = "" ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV38BarCod) ,
                                           Byte.valueOf(AV39BarCodReo) ,
                                           AV70BarCodPar ,
                                           Integer.valueOf(AV41CliCod) ,
                                           AV71BarFecGen ,
                                           AV72BarFecGen_To ,
                                           Byte.valueOf(AV73BarSit) ,
                                           Byte.valueOf(AV74BarSit_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV59TFBarMaqCod_Sel ,
                                           AV58TFBarMaqCod ,
                                           AV67TFBarAcaQui_Sel ,
                                           AV66TFBarAcaQui ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A118BarAcaQui ,
                                           AV34FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV15TFPedidoCliente_Sel ,
                                           AV14TFPedidoCliente ,
                                           Byte.valueOf(AV75TFHayRec_Sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV58TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV58TFBarMaqCod), 6, "%") ;
      lV66TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV66TFBarAcaQui), 6, "%") ;
      /* Using cursor P0AHM7 */
      pr_default.execute(5, new Object[] {AV35Emprcod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV70BarCodPar, Integer.valueOf(AV41CliCod), AV71BarFecGen, AV72BarFecGen_To, Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_To), lV12TFCliNom, AV13TFCliNom_Sel, lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV58TFBarMaqCod, AV59TFBarMaqCod_Sel, lV66TFBarAcaQui, AV67TFBarAcaQui_Sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAHM11 = false ;
         A180BarMaqCod = P0AHM7_A180BarMaqCod[0] ;
         A213BarSit = P0AHM7_A213BarSit[0] ;
         A159BarFecGen = P0AHM7_A159BarFecGen[0] ;
         A118BarAcaQui = P0AHM7_A118BarAcaQui[0] ;
         A136BarColNum = P0AHM7_A136BarColNum[0] ;
         A135BarColNom = P0AHM7_A135BarColNom[0] ;
         A1652BarSerDsc = P0AHM7_A1652BarSerDsc[0] ;
         A212BarSer = P0AHM7_A212BarSer[0] ;
         A13696BarNHdr = P0AHM7_A13696BarNHdr[0] ;
         A279CliNom = P0AHM7_A279CliNom[0] ;
         A252CliCod = P0AHM7_A252CliCod[0] ;
         n252CliCod = P0AHM7_n252CliCod[0] ;
         A143BarDisNum = P0AHM7_A143BarDisNum[0] ;
         A4812BarEncCli = P0AHM7_A4812BarEncCli[0] ;
         A130BarCodPar = P0AHM7_A130BarCodPar[0] ;
         A132BarCodReo = P0AHM7_A132BarCodReo[0] ;
         A129BarCod = P0AHM7_A129BarCod[0] ;
         A396EmprCod = P0AHM7_A396EmprCod[0] ;
         A279CliNom = P0AHM7_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta__wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta__wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta__wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV34FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV14TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV15TFPedidoCliente_Sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  hojaderuta__wwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV75TFHayRec_Sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV75TFHayRec_Sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV22count = 0 ;
                        while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AHM7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AHM7_A180BarMaqCod[0], A180BarMaqCod) == 0 ) )
                        {
                           brkAHM11 = false ;
                           A130BarCodPar = P0AHM7_A130BarCodPar[0] ;
                           A132BarCodReo = P0AHM7_A132BarCodReo[0] ;
                           A129BarCod = P0AHM7_A129BarCod[0] ;
                           AV22count = (long)(AV22count+1) ;
                           brkAHM11 = true ;
                           pr_default.readNext(5);
                        }
                        if ( ! (GXutil.strcmp("", A180BarMaqCod)==0) )
                        {
                           AV17Option = A180BarMaqCod ;
                           AV18Options.add(AV17Option, 0);
                           AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV18Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkAHM11 )
         {
            brkAHM11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARACAQUIOPTIONS' Routine */
      returnInSub = false ;
      AV66TFBarAcaQui = AV29SearchTxt ;
      AV67TFBarAcaQui_Sel = "" ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Integer.valueOf(AV38BarCod) ,
                                           Byte.valueOf(AV39BarCodReo) ,
                                           AV70BarCodPar ,
                                           Integer.valueOf(AV41CliCod) ,
                                           AV71BarFecGen ,
                                           AV72BarFecGen_To ,
                                           Byte.valueOf(AV73BarSit) ,
                                           Byte.valueOf(AV74BarSit_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV47TFBarSer_Sel ,
                                           AV46TFBarSer ,
                                           AV49TFBarSerDsc_Sel ,
                                           AV48TFBarSerDsc ,
                                           AV51TFBarColNom_Sel ,
                                           AV50TFBarColNom ,
                                           Integer.valueOf(AV52TFBarColNum) ,
                                           Integer.valueOf(AV53TFBarColNum_To) ,
                                           AV59TFBarMaqCod_Sel ,
                                           AV58TFBarMaqCod ,
                                           AV67TFBarAcaQui_Sel ,
                                           AV66TFBarAcaQui ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A118BarAcaQui ,
                                           AV34FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV15TFPedidoCliente_Sel ,
                                           AV14TFPedidoCliente ,
                                           Byte.valueOf(AV75TFHayRec_Sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           A396EmprCod ,
                                           AV35Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV46TFBarSer = GXutil.padr( GXutil.rtrim( AV46TFBarSer), 16, "%") ;
      lV48TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV48TFBarSerDsc), 26, "%") ;
      lV50TFBarColNom = GXutil.padr( GXutil.rtrim( AV50TFBarColNom), 13, "%") ;
      lV58TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV58TFBarMaqCod), 6, "%") ;
      lV66TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV66TFBarAcaQui), 6, "%") ;
      /* Using cursor P0AHM8 */
      pr_default.execute(6, new Object[] {AV35Emprcod, Integer.valueOf(AV38BarCod), Byte.valueOf(AV39BarCodReo), AV70BarCodPar, Integer.valueOf(AV41CliCod), AV71BarFecGen, AV72BarFecGen_To, Byte.valueOf(AV73BarSit), Byte.valueOf(AV74BarSit_To), lV12TFCliNom, AV13TFCliNom_Sel, lV46TFBarSer, AV47TFBarSer_Sel, lV48TFBarSerDsc, AV49TFBarSerDsc_Sel, lV50TFBarColNom, AV51TFBarColNom_Sel, Integer.valueOf(AV52TFBarColNum), Integer.valueOf(AV53TFBarColNum_To), lV58TFBarMaqCod, AV59TFBarMaqCod_Sel, lV66TFBarAcaQui, AV67TFBarAcaQui_Sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkAHM13 = false ;
         A118BarAcaQui = P0AHM8_A118BarAcaQui[0] ;
         A213BarSit = P0AHM8_A213BarSit[0] ;
         A159BarFecGen = P0AHM8_A159BarFecGen[0] ;
         A180BarMaqCod = P0AHM8_A180BarMaqCod[0] ;
         A136BarColNum = P0AHM8_A136BarColNum[0] ;
         A135BarColNom = P0AHM8_A135BarColNom[0] ;
         A1652BarSerDsc = P0AHM8_A1652BarSerDsc[0] ;
         A212BarSer = P0AHM8_A212BarSer[0] ;
         A13696BarNHdr = P0AHM8_A13696BarNHdr[0] ;
         A279CliNom = P0AHM8_A279CliNom[0] ;
         A252CliCod = P0AHM8_A252CliCod[0] ;
         n252CliCod = P0AHM8_n252CliCod[0] ;
         A143BarDisNum = P0AHM8_A143BarDisNum[0] ;
         A4812BarEncCli = P0AHM8_A4812BarEncCli[0] ;
         A130BarCodPar = P0AHM8_A130BarCodPar[0] ;
         A132BarCodReo = P0AHM8_A132BarCodReo[0] ;
         A129BarCod = P0AHM8_A129BarCod[0] ;
         A396EmprCod = P0AHM8_A396EmprCod[0] ;
         A279CliNom = P0AHM8_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         hojaderuta__wwgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         hojaderuta__wwgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         hojaderuta__wwgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         hojaderuta__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV34FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV34FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV34FilterFullText) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV14TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV15TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV15TFPedidoCliente_Sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  hojaderuta__wwgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV75TFHayRec_Sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV75TFHayRec_Sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
                        AV22count = 0 ;
                        while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0AHM8_A118BarAcaQui[0], A118BarAcaQui) == 0 ) )
                        {
                           brkAHM13 = false ;
                           A130BarCodPar = P0AHM8_A130BarCodPar[0] ;
                           A132BarCodReo = P0AHM8_A132BarCodReo[0] ;
                           A129BarCod = P0AHM8_A129BarCod[0] ;
                           A396EmprCod = P0AHM8_A396EmprCod[0] ;
                           AV22count = (long)(AV22count+1) ;
                           brkAHM13 = true ;
                           pr_default.readNext(6);
                        }
                        if ( ! (GXutil.strcmp("", A118BarAcaQui)==0) )
                        {
                           AV17Option = A118BarAcaQui ;
                           AV18Options.add(AV17Option, 0);
                           AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                        }
                        if ( AV18Options.size() == 50 )
                        {
                           /* Exit For each command. Update data (if necessary), close cursors & exit. */
                           if (true) break;
                        }
                     }
                  }
               }
            }
         }
         if ( ! brkAHM13 )
         {
            brkAHM13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = hojaderuta__wwgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = hojaderuta__wwgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = hojaderuta__wwgetfilterdata.this.AV33OptionIndexesJson;
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
      AV70BarCodPar = "" ;
      AV71BarFecGen = GXutil.nullDate() ;
      AV72BarFecGen_To = GXutil.nullDate() ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFPedidoCliente = "" ;
      AV15TFPedidoCliente_Sel = "" ;
      AV46TFBarSer = "" ;
      AV47TFBarSer_Sel = "" ;
      AV48TFBarSerDsc = "" ;
      AV49TFBarSerDsc_Sel = "" ;
      AV50TFBarColNom = "" ;
      AV51TFBarColNom_Sel = "" ;
      AV58TFBarMaqCod = "" ;
      AV59TFBarMaqCod_Sel = "" ;
      AV66TFBarAcaQui = "" ;
      AV67TFBarAcaQui_Sel = "" ;
      lV34FilterFullText = "" ;
      scmdbuf = "" ;
      lV12TFCliNom = "" ;
      lV46TFBarSer = "" ;
      lV48TFBarSerDsc = "" ;
      lV50TFBarColNom = "" ;
      lV58TFBarMaqCod = "" ;
      lV66TFBarAcaQui = "" ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A180BarMaqCod = "" ;
      A118BarAcaQui = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A396EmprCod = "" ;
      AV35Emprcod = "" ;
      P0AHM2_A279CliNom = new String[] {""} ;
      P0AHM2_A213BarSit = new byte[1] ;
      P0AHM2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHM2_A118BarAcaQui = new String[] {""} ;
      P0AHM2_A180BarMaqCod = new String[] {""} ;
      P0AHM2_A136BarColNum = new int[1] ;
      P0AHM2_A135BarColNom = new String[] {""} ;
      P0AHM2_A1652BarSerDsc = new String[] {""} ;
      P0AHM2_A212BarSer = new String[] {""} ;
      P0AHM2_A13696BarNHdr = new String[] {""} ;
      P0AHM2_A252CliCod = new int[1] ;
      P0AHM2_n252CliCod = new boolean[] {false} ;
      P0AHM2_A143BarDisNum = new String[] {""} ;
      P0AHM2_A4812BarEncCli = new String[] {""} ;
      P0AHM2_A130BarCodPar = new String[] {""} ;
      P0AHM2_A132BarCodReo = new byte[1] ;
      P0AHM2_A129BarCod = new int[1] ;
      P0AHM2_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      AV17Option = "" ;
      P0AHM3_A213BarSit = new byte[1] ;
      P0AHM3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHM3_A118BarAcaQui = new String[] {""} ;
      P0AHM3_A180BarMaqCod = new String[] {""} ;
      P0AHM3_A136BarColNum = new int[1] ;
      P0AHM3_A135BarColNom = new String[] {""} ;
      P0AHM3_A1652BarSerDsc = new String[] {""} ;
      P0AHM3_A212BarSer = new String[] {""} ;
      P0AHM3_A13696BarNHdr = new String[] {""} ;
      P0AHM3_A279CliNom = new String[] {""} ;
      P0AHM3_A252CliCod = new int[1] ;
      P0AHM3_n252CliCod = new boolean[] {false} ;
      P0AHM3_A143BarDisNum = new String[] {""} ;
      P0AHM3_A4812BarEncCli = new String[] {""} ;
      P0AHM3_A130BarCodPar = new String[] {""} ;
      P0AHM3_A132BarCodReo = new byte[1] ;
      P0AHM3_A129BarCod = new int[1] ;
      P0AHM3_A396EmprCod = new String[] {""} ;
      P0AHM4_A212BarSer = new String[] {""} ;
      P0AHM4_A213BarSit = new byte[1] ;
      P0AHM4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHM4_A118BarAcaQui = new String[] {""} ;
      P0AHM4_A180BarMaqCod = new String[] {""} ;
      P0AHM4_A136BarColNum = new int[1] ;
      P0AHM4_A135BarColNom = new String[] {""} ;
      P0AHM4_A1652BarSerDsc = new String[] {""} ;
      P0AHM4_A13696BarNHdr = new String[] {""} ;
      P0AHM4_A279CliNom = new String[] {""} ;
      P0AHM4_A252CliCod = new int[1] ;
      P0AHM4_n252CliCod = new boolean[] {false} ;
      P0AHM4_A143BarDisNum = new String[] {""} ;
      P0AHM4_A4812BarEncCli = new String[] {""} ;
      P0AHM4_A130BarCodPar = new String[] {""} ;
      P0AHM4_A132BarCodReo = new byte[1] ;
      P0AHM4_A129BarCod = new int[1] ;
      P0AHM4_A396EmprCod = new String[] {""} ;
      P0AHM5_A1652BarSerDsc = new String[] {""} ;
      P0AHM5_A213BarSit = new byte[1] ;
      P0AHM5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHM5_A118BarAcaQui = new String[] {""} ;
      P0AHM5_A180BarMaqCod = new String[] {""} ;
      P0AHM5_A136BarColNum = new int[1] ;
      P0AHM5_A135BarColNom = new String[] {""} ;
      P0AHM5_A212BarSer = new String[] {""} ;
      P0AHM5_A13696BarNHdr = new String[] {""} ;
      P0AHM5_A279CliNom = new String[] {""} ;
      P0AHM5_A252CliCod = new int[1] ;
      P0AHM5_n252CliCod = new boolean[] {false} ;
      P0AHM5_A143BarDisNum = new String[] {""} ;
      P0AHM5_A4812BarEncCli = new String[] {""} ;
      P0AHM5_A130BarCodPar = new String[] {""} ;
      P0AHM5_A132BarCodReo = new byte[1] ;
      P0AHM5_A129BarCod = new int[1] ;
      P0AHM5_A396EmprCod = new String[] {""} ;
      P0AHM6_A135BarColNom = new String[] {""} ;
      P0AHM6_A213BarSit = new byte[1] ;
      P0AHM6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHM6_A118BarAcaQui = new String[] {""} ;
      P0AHM6_A180BarMaqCod = new String[] {""} ;
      P0AHM6_A136BarColNum = new int[1] ;
      P0AHM6_A1652BarSerDsc = new String[] {""} ;
      P0AHM6_A212BarSer = new String[] {""} ;
      P0AHM6_A13696BarNHdr = new String[] {""} ;
      P0AHM6_A279CliNom = new String[] {""} ;
      P0AHM6_A252CliCod = new int[1] ;
      P0AHM6_n252CliCod = new boolean[] {false} ;
      P0AHM6_A143BarDisNum = new String[] {""} ;
      P0AHM6_A4812BarEncCli = new String[] {""} ;
      P0AHM6_A130BarCodPar = new String[] {""} ;
      P0AHM6_A132BarCodReo = new byte[1] ;
      P0AHM6_A129BarCod = new int[1] ;
      P0AHM6_A396EmprCod = new String[] {""} ;
      P0AHM7_A180BarMaqCod = new String[] {""} ;
      P0AHM7_A213BarSit = new byte[1] ;
      P0AHM7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHM7_A118BarAcaQui = new String[] {""} ;
      P0AHM7_A136BarColNum = new int[1] ;
      P0AHM7_A135BarColNom = new String[] {""} ;
      P0AHM7_A1652BarSerDsc = new String[] {""} ;
      P0AHM7_A212BarSer = new String[] {""} ;
      P0AHM7_A13696BarNHdr = new String[] {""} ;
      P0AHM7_A279CliNom = new String[] {""} ;
      P0AHM7_A252CliCod = new int[1] ;
      P0AHM7_n252CliCod = new boolean[] {false} ;
      P0AHM7_A143BarDisNum = new String[] {""} ;
      P0AHM7_A4812BarEncCli = new String[] {""} ;
      P0AHM7_A130BarCodPar = new String[] {""} ;
      P0AHM7_A132BarCodReo = new byte[1] ;
      P0AHM7_A129BarCod = new int[1] ;
      P0AHM7_A396EmprCod = new String[] {""} ;
      P0AHM8_A118BarAcaQui = new String[] {""} ;
      P0AHM8_A213BarSit = new byte[1] ;
      P0AHM8_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AHM8_A180BarMaqCod = new String[] {""} ;
      P0AHM8_A136BarColNum = new int[1] ;
      P0AHM8_A135BarColNom = new String[] {""} ;
      P0AHM8_A1652BarSerDsc = new String[] {""} ;
      P0AHM8_A212BarSer = new String[] {""} ;
      P0AHM8_A13696BarNHdr = new String[] {""} ;
      P0AHM8_A279CliNom = new String[] {""} ;
      P0AHM8_A252CliCod = new int[1] ;
      P0AHM8_n252CliCod = new boolean[] {false} ;
      P0AHM8_A143BarDisNum = new String[] {""} ;
      P0AHM8_A4812BarEncCli = new String[] {""} ;
      P0AHM8_A130BarCodPar = new String[] {""} ;
      P0AHM8_A132BarCodReo = new byte[1] ;
      P0AHM8_A129BarCod = new int[1] ;
      P0AHM8_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta__wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AHM2_A279CliNom, P0AHM2_A213BarSit, P0AHM2_A159BarFecGen, P0AHM2_A118BarAcaQui, P0AHM2_A180BarMaqCod, P0AHM2_A136BarColNum, P0AHM2_A135BarColNom, P0AHM2_A1652BarSerDsc, P0AHM2_A212BarSer, P0AHM2_A13696BarNHdr,
            P0AHM2_A252CliCod, P0AHM2_n252CliCod, P0AHM2_A143BarDisNum, P0AHM2_A4812BarEncCli, P0AHM2_A130BarCodPar, P0AHM2_A132BarCodReo, P0AHM2_A129BarCod, P0AHM2_A396EmprCod
            }
            , new Object[] {
            P0AHM3_A213BarSit, P0AHM3_A159BarFecGen, P0AHM3_A118BarAcaQui, P0AHM3_A180BarMaqCod, P0AHM3_A136BarColNum, P0AHM3_A135BarColNom, P0AHM3_A1652BarSerDsc, P0AHM3_A212BarSer, P0AHM3_A13696BarNHdr, P0AHM3_A279CliNom,
            P0AHM3_A252CliCod, P0AHM3_n252CliCod, P0AHM3_A143BarDisNum, P0AHM3_A4812BarEncCli, P0AHM3_A130BarCodPar, P0AHM3_A132BarCodReo, P0AHM3_A129BarCod, P0AHM3_A396EmprCod
            }
            , new Object[] {
            P0AHM4_A212BarSer, P0AHM4_A213BarSit, P0AHM4_A159BarFecGen, P0AHM4_A118BarAcaQui, P0AHM4_A180BarMaqCod, P0AHM4_A136BarColNum, P0AHM4_A135BarColNom, P0AHM4_A1652BarSerDsc, P0AHM4_A13696BarNHdr, P0AHM4_A279CliNom,
            P0AHM4_A252CliCod, P0AHM4_n252CliCod, P0AHM4_A143BarDisNum, P0AHM4_A4812BarEncCli, P0AHM4_A130BarCodPar, P0AHM4_A132BarCodReo, P0AHM4_A129BarCod, P0AHM4_A396EmprCod
            }
            , new Object[] {
            P0AHM5_A1652BarSerDsc, P0AHM5_A213BarSit, P0AHM5_A159BarFecGen, P0AHM5_A118BarAcaQui, P0AHM5_A180BarMaqCod, P0AHM5_A136BarColNum, P0AHM5_A135BarColNom, P0AHM5_A212BarSer, P0AHM5_A13696BarNHdr, P0AHM5_A279CliNom,
            P0AHM5_A252CliCod, P0AHM5_n252CliCod, P0AHM5_A143BarDisNum, P0AHM5_A4812BarEncCli, P0AHM5_A130BarCodPar, P0AHM5_A132BarCodReo, P0AHM5_A129BarCod, P0AHM5_A396EmprCod
            }
            , new Object[] {
            P0AHM6_A135BarColNom, P0AHM6_A213BarSit, P0AHM6_A159BarFecGen, P0AHM6_A118BarAcaQui, P0AHM6_A180BarMaqCod, P0AHM6_A136BarColNum, P0AHM6_A1652BarSerDsc, P0AHM6_A212BarSer, P0AHM6_A13696BarNHdr, P0AHM6_A279CliNom,
            P0AHM6_A252CliCod, P0AHM6_n252CliCod, P0AHM6_A143BarDisNum, P0AHM6_A4812BarEncCli, P0AHM6_A130BarCodPar, P0AHM6_A132BarCodReo, P0AHM6_A129BarCod, P0AHM6_A396EmprCod
            }
            , new Object[] {
            P0AHM7_A180BarMaqCod, P0AHM7_A213BarSit, P0AHM7_A159BarFecGen, P0AHM7_A118BarAcaQui, P0AHM7_A136BarColNum, P0AHM7_A135BarColNom, P0AHM7_A1652BarSerDsc, P0AHM7_A212BarSer, P0AHM7_A13696BarNHdr, P0AHM7_A279CliNom,
            P0AHM7_A252CliCod, P0AHM7_n252CliCod, P0AHM7_A143BarDisNum, P0AHM7_A4812BarEncCli, P0AHM7_A130BarCodPar, P0AHM7_A132BarCodReo, P0AHM7_A129BarCod, P0AHM7_A396EmprCod
            }
            , new Object[] {
            P0AHM8_A118BarAcaQui, P0AHM8_A213BarSit, P0AHM8_A159BarFecGen, P0AHM8_A180BarMaqCod, P0AHM8_A136BarColNum, P0AHM8_A135BarColNom, P0AHM8_A1652BarSerDsc, P0AHM8_A212BarSer, P0AHM8_A13696BarNHdr, P0AHM8_A279CliNom,
            P0AHM8_A252CliCod, P0AHM8_n252CliCod, P0AHM8_A143BarDisNum, P0AHM8_A4812BarEncCli, P0AHM8_A130BarCodPar, P0AHM8_A132BarCodReo, P0AHM8_A129BarCod, P0AHM8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV39BarCodReo ;
   private byte AV73BarSit ;
   private byte AV74BarSit_To ;
   private byte AV75TFHayRec_Sel ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short Gx_err ;
   private int AV78GXV1 ;
   private int AV38BarCod ;
   private int AV41CliCod ;
   private int AV52TFBarColNum ;
   private int AV53TFBarColNum_To ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV16InsertIndex ;
   private long AV22count ;
   private String AV70BarCodPar ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFPedidoCliente ;
   private String AV15TFPedidoCliente_Sel ;
   private String AV46TFBarSer ;
   private String AV47TFBarSer_Sel ;
   private String AV48TFBarSerDsc ;
   private String AV49TFBarSerDsc_Sel ;
   private String AV50TFBarColNom ;
   private String AV51TFBarColNom_Sel ;
   private String AV58TFBarMaqCod ;
   private String AV59TFBarMaqCod_Sel ;
   private String AV66TFBarAcaQui ;
   private String AV67TFBarAcaQui_Sel ;
   private String scmdbuf ;
   private String lV12TFCliNom ;
   private String lV46TFBarSer ;
   private String lV48TFBarSerDsc ;
   private String lV50TFBarColNom ;
   private String lV58TFBarMaqCod ;
   private String lV66TFBarAcaQui ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A180BarMaqCod ;
   private String A118BarAcaQui ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A396EmprCod ;
   private String AV35Emprcod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date AV71BarFecGen ;
   private java.util.Date AV72BarFecGen_To ;
   private java.util.Date A159BarFecGen ;
   private boolean returnInSub ;
   private boolean brkAHM2 ;
   private boolean n252CliCod ;
   private boolean brkAHM5 ;
   private boolean brkAHM7 ;
   private boolean brkAHM9 ;
   private boolean brkAHM11 ;
   private boolean brkAHM13 ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV34FilterFullText ;
   private String lV34FilterFullText ;
   private String AV17Option ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHM2_A279CliNom ;
   private byte[] P0AHM2_A213BarSit ;
   private java.util.Date[] P0AHM2_A159BarFecGen ;
   private String[] P0AHM2_A118BarAcaQui ;
   private String[] P0AHM2_A180BarMaqCod ;
   private int[] P0AHM2_A136BarColNum ;
   private String[] P0AHM2_A135BarColNom ;
   private String[] P0AHM2_A1652BarSerDsc ;
   private String[] P0AHM2_A212BarSer ;
   private String[] P0AHM2_A13696BarNHdr ;
   private int[] P0AHM2_A252CliCod ;
   private boolean[] P0AHM2_n252CliCod ;
   private String[] P0AHM2_A143BarDisNum ;
   private String[] P0AHM2_A4812BarEncCli ;
   private String[] P0AHM2_A130BarCodPar ;
   private byte[] P0AHM2_A132BarCodReo ;
   private int[] P0AHM2_A129BarCod ;
   private String[] P0AHM2_A396EmprCod ;
   private byte[] P0AHM3_A213BarSit ;
   private java.util.Date[] P0AHM3_A159BarFecGen ;
   private String[] P0AHM3_A118BarAcaQui ;
   private String[] P0AHM3_A180BarMaqCod ;
   private int[] P0AHM3_A136BarColNum ;
   private String[] P0AHM3_A135BarColNom ;
   private String[] P0AHM3_A1652BarSerDsc ;
   private String[] P0AHM3_A212BarSer ;
   private String[] P0AHM3_A13696BarNHdr ;
   private String[] P0AHM3_A279CliNom ;
   private int[] P0AHM3_A252CliCod ;
   private boolean[] P0AHM3_n252CliCod ;
   private String[] P0AHM3_A143BarDisNum ;
   private String[] P0AHM3_A4812BarEncCli ;
   private String[] P0AHM3_A130BarCodPar ;
   private byte[] P0AHM3_A132BarCodReo ;
   private int[] P0AHM3_A129BarCod ;
   private String[] P0AHM3_A396EmprCod ;
   private String[] P0AHM4_A212BarSer ;
   private byte[] P0AHM4_A213BarSit ;
   private java.util.Date[] P0AHM4_A159BarFecGen ;
   private String[] P0AHM4_A118BarAcaQui ;
   private String[] P0AHM4_A180BarMaqCod ;
   private int[] P0AHM4_A136BarColNum ;
   private String[] P0AHM4_A135BarColNom ;
   private String[] P0AHM4_A1652BarSerDsc ;
   private String[] P0AHM4_A13696BarNHdr ;
   private String[] P0AHM4_A279CliNom ;
   private int[] P0AHM4_A252CliCod ;
   private boolean[] P0AHM4_n252CliCod ;
   private String[] P0AHM4_A143BarDisNum ;
   private String[] P0AHM4_A4812BarEncCli ;
   private String[] P0AHM4_A130BarCodPar ;
   private byte[] P0AHM4_A132BarCodReo ;
   private int[] P0AHM4_A129BarCod ;
   private String[] P0AHM4_A396EmprCod ;
   private String[] P0AHM5_A1652BarSerDsc ;
   private byte[] P0AHM5_A213BarSit ;
   private java.util.Date[] P0AHM5_A159BarFecGen ;
   private String[] P0AHM5_A118BarAcaQui ;
   private String[] P0AHM5_A180BarMaqCod ;
   private int[] P0AHM5_A136BarColNum ;
   private String[] P0AHM5_A135BarColNom ;
   private String[] P0AHM5_A212BarSer ;
   private String[] P0AHM5_A13696BarNHdr ;
   private String[] P0AHM5_A279CliNom ;
   private int[] P0AHM5_A252CliCod ;
   private boolean[] P0AHM5_n252CliCod ;
   private String[] P0AHM5_A143BarDisNum ;
   private String[] P0AHM5_A4812BarEncCli ;
   private String[] P0AHM5_A130BarCodPar ;
   private byte[] P0AHM5_A132BarCodReo ;
   private int[] P0AHM5_A129BarCod ;
   private String[] P0AHM5_A396EmprCod ;
   private String[] P0AHM6_A135BarColNom ;
   private byte[] P0AHM6_A213BarSit ;
   private java.util.Date[] P0AHM6_A159BarFecGen ;
   private String[] P0AHM6_A118BarAcaQui ;
   private String[] P0AHM6_A180BarMaqCod ;
   private int[] P0AHM6_A136BarColNum ;
   private String[] P0AHM6_A1652BarSerDsc ;
   private String[] P0AHM6_A212BarSer ;
   private String[] P0AHM6_A13696BarNHdr ;
   private String[] P0AHM6_A279CliNom ;
   private int[] P0AHM6_A252CliCod ;
   private boolean[] P0AHM6_n252CliCod ;
   private String[] P0AHM6_A143BarDisNum ;
   private String[] P0AHM6_A4812BarEncCli ;
   private String[] P0AHM6_A130BarCodPar ;
   private byte[] P0AHM6_A132BarCodReo ;
   private int[] P0AHM6_A129BarCod ;
   private String[] P0AHM6_A396EmprCod ;
   private String[] P0AHM7_A180BarMaqCod ;
   private byte[] P0AHM7_A213BarSit ;
   private java.util.Date[] P0AHM7_A159BarFecGen ;
   private String[] P0AHM7_A118BarAcaQui ;
   private int[] P0AHM7_A136BarColNum ;
   private String[] P0AHM7_A135BarColNom ;
   private String[] P0AHM7_A1652BarSerDsc ;
   private String[] P0AHM7_A212BarSer ;
   private String[] P0AHM7_A13696BarNHdr ;
   private String[] P0AHM7_A279CliNom ;
   private int[] P0AHM7_A252CliCod ;
   private boolean[] P0AHM7_n252CliCod ;
   private String[] P0AHM7_A143BarDisNum ;
   private String[] P0AHM7_A4812BarEncCli ;
   private String[] P0AHM7_A130BarCodPar ;
   private byte[] P0AHM7_A132BarCodReo ;
   private int[] P0AHM7_A129BarCod ;
   private String[] P0AHM7_A396EmprCod ;
   private String[] P0AHM8_A118BarAcaQui ;
   private byte[] P0AHM8_A213BarSit ;
   private java.util.Date[] P0AHM8_A159BarFecGen ;
   private String[] P0AHM8_A180BarMaqCod ;
   private int[] P0AHM8_A136BarColNum ;
   private String[] P0AHM8_A135BarColNom ;
   private String[] P0AHM8_A1652BarSerDsc ;
   private String[] P0AHM8_A212BarSer ;
   private String[] P0AHM8_A13696BarNHdr ;
   private String[] P0AHM8_A279CliNom ;
   private int[] P0AHM8_A252CliCod ;
   private boolean[] P0AHM8_n252CliCod ;
   private String[] P0AHM8_A143BarDisNum ;
   private String[] P0AHM8_A4812BarEncCli ;
   private String[] P0AHM8_A130BarCodPar ;
   private byte[] P0AHM8_A132BarCodReo ;
   private int[] P0AHM8_A129BarCod ;
   private String[] P0AHM8_A396EmprCod ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class hojaderuta__wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AHM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV70BarCodPar ,
                                          int AV41CliCod ,
                                          java.util.Date AV71BarFecGen ,
                                          java.util.Date AV72BarFecGen_To ,
                                          byte AV73BarSit ,
                                          byte AV74BarSit_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV47TFBarSer_Sel ,
                                          String AV46TFBarSer ,
                                          String AV49TFBarSerDsc_Sel ,
                                          String AV48TFBarSerDsc ,
                                          String AV51TFBarColNom_Sel ,
                                          String AV50TFBarColNom ,
                                          int AV52TFBarColNum ,
                                          int AV53TFBarColNum_To ,
                                          String AV59TFBarMaqCod_Sel ,
                                          String AV58TFBarMaqCod ,
                                          String AV67TFBarAcaQui_Sel ,
                                          String AV66TFBarAcaQui ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A118BarAcaQui ,
                                          String AV34FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV15TFPedidoCliente_Sel ,
                                          String AV14TFPedidoCliente ,
                                          byte AV75TFHayRec_Sel ,
                                          byte A13710HayRec ,
                                          String A396EmprCod ,
                                          String AV35Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[23];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T2.CliNom, T1.BarSit, T1.BarFecGen, T1.BarAcaQui, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T1.CliCod, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV38BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (0==AV39BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70BarCodPar)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) = UPPER(?))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV41CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV73BarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV74BarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_P0AHM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV70BarCodPar ,
                                          int AV41CliCod ,
                                          java.util.Date AV71BarFecGen ,
                                          java.util.Date AV72BarFecGen_To ,
                                          byte AV73BarSit ,
                                          byte AV74BarSit_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV47TFBarSer_Sel ,
                                          String AV46TFBarSer ,
                                          String AV49TFBarSerDsc_Sel ,
                                          String AV48TFBarSerDsc ,
                                          String AV51TFBarColNom_Sel ,
                                          String AV50TFBarColNom ,
                                          int AV52TFBarColNum ,
                                          int AV53TFBarColNum_To ,
                                          String AV59TFBarMaqCod_Sel ,
                                          String AV58TFBarMaqCod ,
                                          String AV67TFBarAcaQui_Sel ,
                                          String AV66TFBarAcaQui ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A118BarAcaQui ,
                                          String AV34FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV15TFPedidoCliente_Sel ,
                                          String AV14TFPedidoCliente ,
                                          byte AV75TFHayRec_Sel ,
                                          byte A13710HayRec ,
                                          String AV35Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[23];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.BarSit, T1.BarFecGen, T1.BarAcaQui, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV38BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (0==AV39BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70BarCodPar)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) = UPPER(?))");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV41CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (0==AV73BarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV74BarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0AHM4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV70BarCodPar ,
                                          int AV41CliCod ,
                                          java.util.Date AV71BarFecGen ,
                                          java.util.Date AV72BarFecGen_To ,
                                          byte AV73BarSit ,
                                          byte AV74BarSit_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV47TFBarSer_Sel ,
                                          String AV46TFBarSer ,
                                          String AV49TFBarSerDsc_Sel ,
                                          String AV48TFBarSerDsc ,
                                          String AV51TFBarColNom_Sel ,
                                          String AV50TFBarColNom ,
                                          int AV52TFBarColNum ,
                                          int AV53TFBarColNum_To ,
                                          String AV59TFBarMaqCod_Sel ,
                                          String AV58TFBarMaqCod ,
                                          String AV67TFBarAcaQui_Sel ,
                                          String AV66TFBarAcaQui ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A118BarAcaQui ,
                                          String AV34FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV15TFPedidoCliente_Sel ,
                                          String AV14TFPedidoCliente ,
                                          byte AV75TFHayRec_Sel ,
                                          byte A13710HayRec ,
                                          String AV35Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[23];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarSer, T1.BarSit, T1.BarFecGen, T1.BarAcaQui, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV38BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
      }
      if ( ! (0==AV39BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70BarCodPar)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) = UPPER(?))");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! (0==AV41CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (0==AV73BarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (0==AV74BarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarSer" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P0AHM5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV70BarCodPar ,
                                          int AV41CliCod ,
                                          java.util.Date AV71BarFecGen ,
                                          java.util.Date AV72BarFecGen_To ,
                                          byte AV73BarSit ,
                                          byte AV74BarSit_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV47TFBarSer_Sel ,
                                          String AV46TFBarSer ,
                                          String AV49TFBarSerDsc_Sel ,
                                          String AV48TFBarSerDsc ,
                                          String AV51TFBarColNom_Sel ,
                                          String AV50TFBarColNom ,
                                          int AV52TFBarColNum ,
                                          int AV53TFBarColNum_To ,
                                          String AV59TFBarMaqCod_Sel ,
                                          String AV58TFBarMaqCod ,
                                          String AV67TFBarAcaQui_Sel ,
                                          String AV66TFBarAcaQui ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A118BarAcaQui ,
                                          String AV34FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV15TFPedidoCliente_Sel ,
                                          String AV14TFPedidoCliente ,
                                          byte AV75TFHayRec_Sel ,
                                          byte A13710HayRec ,
                                          String A396EmprCod ,
                                          String AV35Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[23];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.BarSerDsc, T1.BarSit, T1.BarFecGen, T1.BarAcaQui, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV38BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
      }
      if ( ! (0==AV39BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70BarCodPar)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) = UPPER(?))");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ! (0==AV41CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (0==AV73BarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV74BarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P0AHM6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV70BarCodPar ,
                                          int AV41CliCod ,
                                          java.util.Date AV71BarFecGen ,
                                          java.util.Date AV72BarFecGen_To ,
                                          byte AV73BarSit ,
                                          byte AV74BarSit_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV47TFBarSer_Sel ,
                                          String AV46TFBarSer ,
                                          String AV49TFBarSerDsc_Sel ,
                                          String AV48TFBarSerDsc ,
                                          String AV51TFBarColNom_Sel ,
                                          String AV50TFBarColNom ,
                                          int AV52TFBarColNum ,
                                          int AV53TFBarColNum_To ,
                                          String AV59TFBarMaqCod_Sel ,
                                          String AV58TFBarMaqCod ,
                                          String AV67TFBarAcaQui_Sel ,
                                          String AV66TFBarAcaQui ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A118BarAcaQui ,
                                          String AV34FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV15TFPedidoCliente_Sel ,
                                          String AV14TFPedidoCliente ,
                                          byte AV75TFHayRec_Sel ,
                                          byte A13710HayRec ,
                                          String A396EmprCod ,
                                          String AV35Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[23];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.BarColNom, T1.BarSit, T1.BarFecGen, T1.BarAcaQui, T1.BarMaqCod, T1.BarColNum, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV38BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV39BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70BarCodPar)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) = UPPER(?))");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV41CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (0==AV73BarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV74BarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P0AHM7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV70BarCodPar ,
                                          int AV41CliCod ,
                                          java.util.Date AV71BarFecGen ,
                                          java.util.Date AV72BarFecGen_To ,
                                          byte AV73BarSit ,
                                          byte AV74BarSit_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV47TFBarSer_Sel ,
                                          String AV46TFBarSer ,
                                          String AV49TFBarSerDsc_Sel ,
                                          String AV48TFBarSerDsc ,
                                          String AV51TFBarColNom_Sel ,
                                          String AV50TFBarColNom ,
                                          int AV52TFBarColNum ,
                                          int AV53TFBarColNum_To ,
                                          String AV59TFBarMaqCod_Sel ,
                                          String AV58TFBarMaqCod ,
                                          String AV67TFBarAcaQui_Sel ,
                                          String AV66TFBarAcaQui ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A118BarAcaQui ,
                                          String AV34FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV15TFPedidoCliente_Sel ,
                                          String AV14TFPedidoCliente ,
                                          byte AV75TFHayRec_Sel ,
                                          byte A13710HayRec ,
                                          String AV35Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[23];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.BarMaqCod, T1.BarSit, T1.BarFecGen, T1.BarAcaQui, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV38BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( ! (0==AV39BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70BarCodPar)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) = UPPER(?))");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (0==AV41CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (0==AV73BarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV74BarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarMaqCod" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_P0AHM8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV38BarCod ,
                                          byte AV39BarCodReo ,
                                          String AV70BarCodPar ,
                                          int AV41CliCod ,
                                          java.util.Date AV71BarFecGen ,
                                          java.util.Date AV72BarFecGen_To ,
                                          byte AV73BarSit ,
                                          byte AV74BarSit_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV47TFBarSer_Sel ,
                                          String AV46TFBarSer ,
                                          String AV49TFBarSerDsc_Sel ,
                                          String AV48TFBarSerDsc ,
                                          String AV51TFBarColNom_Sel ,
                                          String AV50TFBarColNom ,
                                          int AV52TFBarColNum ,
                                          int AV53TFBarColNum_To ,
                                          String AV59TFBarMaqCod_Sel ,
                                          String AV58TFBarMaqCod ,
                                          String AV67TFBarAcaQui_Sel ,
                                          String AV66TFBarAcaQui ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A118BarAcaQui ,
                                          String AV34FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV15TFPedidoCliente_Sel ,
                                          String AV14TFPedidoCliente ,
                                          byte AV75TFHayRec_Sel ,
                                          byte A13710HayRec ,
                                          String A396EmprCod ,
                                          String AV35Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[23];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T1.BarAcaQui, T1.BarSit, T1.BarFecGen, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV38BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
      }
      if ( ! (0==AV39BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70BarCodPar)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) = UPPER(?))");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( ! (0==AV41CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (0==AV73BarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! (0==AV74BarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarAcaQui" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_P0AHM2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 1 :
                  return conditional_P0AHM3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 2 :
                  return conditional_P0AHM4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 3 :
                  return conditional_P0AHM5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 4 :
                  return conditional_P0AHM6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 5 :
                  return conditional_P0AHM7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 6 :
                  return conditional_P0AHM8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHM4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHM5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHM6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHM7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AHM8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 11);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 8);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               return;
      }
   }

}

