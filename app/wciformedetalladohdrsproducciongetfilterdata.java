package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wciformedetalladohdrsproducciongetfilterdata extends GXProcedure
{
   public wciformedetalladohdrsproducciongetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wciformedetalladohdrsproducciongetfilterdata.class ), "" );
   }

   public wciformedetalladohdrsproducciongetfilterdata( int remoteHandle ,
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
      wciformedetalladohdrsproducciongetfilterdata.this.aP5 = new String[] {""};
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
      wciformedetalladohdrsproducciongetfilterdata.this.AV22DDOName = aP0;
      wciformedetalladohdrsproducciongetfilterdata.this.AV20SearchTxt = aP1;
      wciformedetalladohdrsproducciongetfilterdata.this.AV21SearchTxtTo = aP2;
      wciformedetalladohdrsproducciongetfilterdata.this.aP3 = aP3;
      wciformedetalladohdrsproducciongetfilterdata.this.aP4 = aP4;
      wciformedetalladohdrsproducciongetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_MAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_HISPROLOT") == 0 )
      {
         /* Execute user subroutine: 'LOADHISPROLOTOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PEDIDOCLIENTE") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDIDOCLIENTEOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_BARTIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARTIPARTDSCOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_BARTIPCOLDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARTIPCOLDSCOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASE") == 0 )
      {
         /* Execute user subroutine: 'LOADFASEOPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FASEDESCRIPCION") == 0 )
      {
         /* Execute user subroutine: 'LOADFASEDESCRIPCIONOPTIONS' */
         S231 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PARCODNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPARCODNOMOPTIONS' */
         S241 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("WCIformedetalladoHdrsProduccionGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCIformedetalladoHdrsProduccionGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("WCIformedetalladoHdrsProduccionGridState"), null, null);
      }
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV67FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV43TFMaqDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV44TFMaqDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV12TFBarNHdr = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV13TFBarNHdr_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT") == 0 )
         {
            AV65TFHisProLot = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT_SEL") == 0 )
         {
            AV66TFHisProLot_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV45TFCliCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFCliCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV47TFCliNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV48TFCliNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV82TFPedidoCliente = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV83TFPedidoCliente_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV49TFBarFecGen = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV51TFBarSer = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV52TFBarSer_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV53TFBarSerDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV54TFBarSerDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV78TFBarTipArtDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV79TFBarTipArtDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOLDSC") == 0 )
         {
            AV80TFBarTipColDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOLDSC_SEL") == 0 )
         {
            AV81TFBarTipColDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV14TFFase = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV15TFFase_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION") == 0 )
         {
            AV86TFFaseDescripcion = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION_SEL") == 0 )
         {
            AV87TFFaseDescripcion_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV16TFHisProDTI = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV18TFHisProDTF = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV55TFHisProKgr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFHisProKgr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV57TFHisProMtr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFHisProMtr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV59TFParCod = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFParCod_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV61TFParCodNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV62TFParCodNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV63TFHisProTur = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFHisProTur_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROREO") == 0 )
         {
            AV70TFHisProReo = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFHisProReo_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV38Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODINICIAL") == 0 )
         {
            AV39MaqCodInicial = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODFINAL") == 0 )
         {
            AV40MaqCodFinal = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPRODTI") == 0 )
         {
            AV41Hisprodti = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPRODTF") == 0 )
         {
            AV42Hisprodtf = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROREO") == 0 )
         {
            AV68HisProReo = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PARCOD") == 0 )
         {
            AV69ParCod = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV20SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX2 */
      pr_default.execute(0, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8LX2 = false ;
         A217BarTipArt = P08LX2_A217BarTipArt[0] ;
         n217BarTipArt = P08LX2_n217BarTipArt[0] ;
         A602MaqCod = P08LX2_A602MaqCod[0] ;
         A3612HisProReo = P08LX2_A3612HisProReo[0] ;
         A566HisProTur = P08LX2_A566HisProTur[0] ;
         A867ParCodNom = P08LX2_A867ParCodNom[0] ;
         n867ParCodNom = P08LX2_n867ParCodNom[0] ;
         A656ParCod = P08LX2_A656ParCod[0] ;
         n656ParCod = P08LX2_n656ParCod[0] ;
         A1526HisProMtr = P08LX2_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX2_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX2_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX2_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX2_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX2_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX2_A1652BarSerDsc[0] ;
         A212BarSer = P08LX2_A212BarSer[0] ;
         A159BarFecGen = P08LX2_A159BarFecGen[0] ;
         A279CliNom = P08LX2_A279CliNom[0] ;
         A252CliCod = P08LX2_A252CliCod[0] ;
         n252CliCod = P08LX2_n252CliCod[0] ;
         A3610HisProLot = P08LX2_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX2_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX2_A606MaqDsc[0] ;
         n606MaqDsc = P08LX2_n606MaqDsc[0] ;
         A129BarCod = P08LX2_A129BarCod[0] ;
         A132BarCodReo = P08LX2_A132BarCodReo[0] ;
         A130BarCodPar = P08LX2_A130BarCodPar[0] ;
         A143BarDisNum = P08LX2_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX2_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX2_A218BarTipCol[0] ;
         A461Fase = P08LX2_A461Fase[0] ;
         A396EmprCod = P08LX2_A396EmprCod[0] ;
         A558HisProFec = P08LX2_A558HisProFec[0] ;
         A561HisProLin = P08LX2_A561HisProLin[0] ;
         A606MaqDsc = P08LX2_A606MaqDsc[0] ;
         n606MaqDsc = P08LX2_n606MaqDsc[0] ;
         A217BarTipArt = P08LX2_A217BarTipArt[0] ;
         n217BarTipArt = P08LX2_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX2_A1652BarSerDsc[0] ;
         A212BarSer = P08LX2_A212BarSer[0] ;
         A159BarFecGen = P08LX2_A159BarFecGen[0] ;
         A252CliCod = P08LX2_A252CliCod[0] ;
         n252CliCod = P08LX2_n252CliCod[0] ;
         A13696BarNHdr = P08LX2_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX2_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX2_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX2_A218BarTipCol[0] ;
         A279CliNom = P08LX2_A279CliNom[0] ;
         A13711BarTipArtD = P08LX2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX2_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX2_A867ParCodNom[0] ;
         n867ParCodNom = P08LX2_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV32count = 0 ;
                              while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08LX2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08LX2_A602MaqCod[0], A602MaqCod) == 0 ) )
                              {
                                 brk8LX2 = false ;
                                 A558HisProFec = P08LX2_A558HisProFec[0] ;
                                 A561HisProLin = P08LX2_A561HisProLin[0] ;
                                 AV32count = (long)(AV32count+1) ;
                                 brk8LX2 = true ;
                                 pr_default.readNext(0);
                              }
                              if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
                              {
                                 AV24Option = A602MaqCod ;
                                 AV25Options.add(AV24Option, 0);
                                 AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8LX2 )
         {
            brk8LX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV43TFMaqDsc = AV20SearchTxt ;
      AV44TFMaqDsc_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           A396EmprCod ,
                                           AV38Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX3 */
      pr_default.execute(1, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8LX4 = false ;
         A217BarTipArt = P08LX3_A217BarTipArt[0] ;
         n217BarTipArt = P08LX3_n217BarTipArt[0] ;
         A606MaqDsc = P08LX3_A606MaqDsc[0] ;
         n606MaqDsc = P08LX3_n606MaqDsc[0] ;
         A3612HisProReo = P08LX3_A3612HisProReo[0] ;
         A566HisProTur = P08LX3_A566HisProTur[0] ;
         A867ParCodNom = P08LX3_A867ParCodNom[0] ;
         n867ParCodNom = P08LX3_n867ParCodNom[0] ;
         A656ParCod = P08LX3_A656ParCod[0] ;
         n656ParCod = P08LX3_n656ParCod[0] ;
         A1526HisProMtr = P08LX3_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX3_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX3_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX3_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX3_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX3_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX3_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX3_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX3_A1652BarSerDsc[0] ;
         A212BarSer = P08LX3_A212BarSer[0] ;
         A159BarFecGen = P08LX3_A159BarFecGen[0] ;
         A279CliNom = P08LX3_A279CliNom[0] ;
         A252CliCod = P08LX3_A252CliCod[0] ;
         n252CliCod = P08LX3_n252CliCod[0] ;
         A3610HisProLot = P08LX3_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX3_A13696BarNHdr[0] ;
         A602MaqCod = P08LX3_A602MaqCod[0] ;
         A129BarCod = P08LX3_A129BarCod[0] ;
         A132BarCodReo = P08LX3_A132BarCodReo[0] ;
         A130BarCodPar = P08LX3_A130BarCodPar[0] ;
         A143BarDisNum = P08LX3_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX3_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX3_A218BarTipCol[0] ;
         A461Fase = P08LX3_A461Fase[0] ;
         A396EmprCod = P08LX3_A396EmprCod[0] ;
         A558HisProFec = P08LX3_A558HisProFec[0] ;
         A561HisProLin = P08LX3_A561HisProLin[0] ;
         A606MaqDsc = P08LX3_A606MaqDsc[0] ;
         n606MaqDsc = P08LX3_n606MaqDsc[0] ;
         A217BarTipArt = P08LX3_A217BarTipArt[0] ;
         n217BarTipArt = P08LX3_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX3_A1652BarSerDsc[0] ;
         A212BarSer = P08LX3_A212BarSer[0] ;
         A159BarFecGen = P08LX3_A159BarFecGen[0] ;
         A252CliCod = P08LX3_A252CliCod[0] ;
         n252CliCod = P08LX3_n252CliCod[0] ;
         A13696BarNHdr = P08LX3_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX3_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX3_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX3_A218BarTipCol[0] ;
         A279CliNom = P08LX3_A279CliNom[0] ;
         A13711BarTipArtD = P08LX3_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX3_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX3_A867ParCodNom[0] ;
         n867ParCodNom = P08LX3_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV32count = 0 ;
                              while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08LX3_A606MaqDsc[0], A606MaqDsc) == 0 ) )
                              {
                                 brk8LX4 = false ;
                                 A602MaqCod = P08LX3_A602MaqCod[0] ;
                                 A396EmprCod = P08LX3_A396EmprCod[0] ;
                                 A558HisProFec = P08LX3_A558HisProFec[0] ;
                                 A561HisProLin = P08LX3_A561HisProLin[0] ;
                                 AV32count = (long)(AV32count+1) ;
                                 brk8LX4 = true ;
                                 pr_default.readNext(1);
                              }
                              if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
                              {
                                 AV24Option = A606MaqDsc ;
                                 AV25Options.add(AV24Option, 0);
                                 AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8LX4 )
         {
            brk8LX4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV12TFBarNHdr = AV20SearchTxt ;
      AV13TFBarNHdr_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX4 */
      pr_default.execute(2, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A217BarTipArt = P08LX4_A217BarTipArt[0] ;
         n217BarTipArt = P08LX4_n217BarTipArt[0] ;
         A3612HisProReo = P08LX4_A3612HisProReo[0] ;
         A566HisProTur = P08LX4_A566HisProTur[0] ;
         A867ParCodNom = P08LX4_A867ParCodNom[0] ;
         n867ParCodNom = P08LX4_n867ParCodNom[0] ;
         A656ParCod = P08LX4_A656ParCod[0] ;
         n656ParCod = P08LX4_n656ParCod[0] ;
         A1526HisProMtr = P08LX4_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX4_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX4_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX4_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX4_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX4_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX4_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX4_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX4_A1652BarSerDsc[0] ;
         A212BarSer = P08LX4_A212BarSer[0] ;
         A159BarFecGen = P08LX4_A159BarFecGen[0] ;
         A279CliNom = P08LX4_A279CliNom[0] ;
         A252CliCod = P08LX4_A252CliCod[0] ;
         n252CliCod = P08LX4_n252CliCod[0] ;
         A3610HisProLot = P08LX4_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX4_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX4_A606MaqDsc[0] ;
         n606MaqDsc = P08LX4_n606MaqDsc[0] ;
         A602MaqCod = P08LX4_A602MaqCod[0] ;
         A129BarCod = P08LX4_A129BarCod[0] ;
         A132BarCodReo = P08LX4_A132BarCodReo[0] ;
         A130BarCodPar = P08LX4_A130BarCodPar[0] ;
         A143BarDisNum = P08LX4_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX4_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX4_A218BarTipCol[0] ;
         A461Fase = P08LX4_A461Fase[0] ;
         A396EmprCod = P08LX4_A396EmprCod[0] ;
         A558HisProFec = P08LX4_A558HisProFec[0] ;
         A561HisProLin = P08LX4_A561HisProLin[0] ;
         A606MaqDsc = P08LX4_A606MaqDsc[0] ;
         n606MaqDsc = P08LX4_n606MaqDsc[0] ;
         A217BarTipArt = P08LX4_A217BarTipArt[0] ;
         n217BarTipArt = P08LX4_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX4_A1652BarSerDsc[0] ;
         A212BarSer = P08LX4_A212BarSer[0] ;
         A159BarFecGen = P08LX4_A159BarFecGen[0] ;
         A252CliCod = P08LX4_A252CliCod[0] ;
         n252CliCod = P08LX4_n252CliCod[0] ;
         A13696BarNHdr = P08LX4_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX4_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX4_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX4_A218BarTipCol[0] ;
         A279CliNom = P08LX4_A279CliNom[0] ;
         A13711BarTipArtD = P08LX4_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX4_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX4_A867ParCodNom[0] ;
         n867ParCodNom = P08LX4_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
                              {
                                 AV24Option = A13696BarNHdr ;
                                 AV23InsertIndex = 1 ;
                                 while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
                                 {
                                    AV23InsertIndex = (int)(AV23InsertIndex+1) ;
                                 }
                                 if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
                                 {
                                    AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
                                    AV32count = (long)(AV32count+1) ;
                                    AV30OptionIndexes.removeItem(AV23InsertIndex);
                                    AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
                                 }
                                 else
                                 {
                                    AV25Options.add(AV24Option, AV23InsertIndex);
                                    AV30OptionIndexes.add("1", AV23InsertIndex);
                                 }
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADHISPROLOTOPTIONS' Routine */
      returnInSub = false ;
      AV65TFHisProLot = AV20SearchTxt ;
      AV66TFHisProLot_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           A396EmprCod ,
                                           AV38Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX5 */
      pr_default.execute(3, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8LX7 = false ;
         A217BarTipArt = P08LX5_A217BarTipArt[0] ;
         n217BarTipArt = P08LX5_n217BarTipArt[0] ;
         A3610HisProLot = P08LX5_A3610HisProLot[0] ;
         A3612HisProReo = P08LX5_A3612HisProReo[0] ;
         A566HisProTur = P08LX5_A566HisProTur[0] ;
         A867ParCodNom = P08LX5_A867ParCodNom[0] ;
         n867ParCodNom = P08LX5_n867ParCodNom[0] ;
         A656ParCod = P08LX5_A656ParCod[0] ;
         n656ParCod = P08LX5_n656ParCod[0] ;
         A1526HisProMtr = P08LX5_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX5_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX5_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX5_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX5_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX5_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX5_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX5_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX5_A1652BarSerDsc[0] ;
         A212BarSer = P08LX5_A212BarSer[0] ;
         A159BarFecGen = P08LX5_A159BarFecGen[0] ;
         A279CliNom = P08LX5_A279CliNom[0] ;
         A252CliCod = P08LX5_A252CliCod[0] ;
         n252CliCod = P08LX5_n252CliCod[0] ;
         A13696BarNHdr = P08LX5_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX5_A606MaqDsc[0] ;
         n606MaqDsc = P08LX5_n606MaqDsc[0] ;
         A602MaqCod = P08LX5_A602MaqCod[0] ;
         A129BarCod = P08LX5_A129BarCod[0] ;
         A132BarCodReo = P08LX5_A132BarCodReo[0] ;
         A130BarCodPar = P08LX5_A130BarCodPar[0] ;
         A143BarDisNum = P08LX5_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX5_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX5_A218BarTipCol[0] ;
         A461Fase = P08LX5_A461Fase[0] ;
         A396EmprCod = P08LX5_A396EmprCod[0] ;
         A558HisProFec = P08LX5_A558HisProFec[0] ;
         A561HisProLin = P08LX5_A561HisProLin[0] ;
         A606MaqDsc = P08LX5_A606MaqDsc[0] ;
         n606MaqDsc = P08LX5_n606MaqDsc[0] ;
         A217BarTipArt = P08LX5_A217BarTipArt[0] ;
         n217BarTipArt = P08LX5_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX5_A1652BarSerDsc[0] ;
         A212BarSer = P08LX5_A212BarSer[0] ;
         A159BarFecGen = P08LX5_A159BarFecGen[0] ;
         A252CliCod = P08LX5_A252CliCod[0] ;
         n252CliCod = P08LX5_n252CliCod[0] ;
         A13696BarNHdr = P08LX5_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX5_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX5_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX5_A218BarTipCol[0] ;
         A279CliNom = P08LX5_A279CliNom[0] ;
         A13711BarTipArtD = P08LX5_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX5_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX5_A867ParCodNom[0] ;
         n867ParCodNom = P08LX5_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV32count = 0 ;
                              while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08LX5_A3610HisProLot[0], A3610HisProLot) == 0 ) )
                              {
                                 brk8LX7 = false ;
                                 A602MaqCod = P08LX5_A602MaqCod[0] ;
                                 A396EmprCod = P08LX5_A396EmprCod[0] ;
                                 A558HisProFec = P08LX5_A558HisProFec[0] ;
                                 A561HisProLin = P08LX5_A561HisProLin[0] ;
                                 AV32count = (long)(AV32count+1) ;
                                 brk8LX7 = true ;
                                 pr_default.readNext(3);
                              }
                              if ( ! (GXutil.strcmp("", A3610HisProLot)==0) )
                              {
                                 AV24Option = A3610HisProLot ;
                                 AV25Options.add(AV24Option, 0);
                                 AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8LX7 )
         {
            brk8LX7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV47TFCliNom = AV20SearchTxt ;
      AV48TFCliNom_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           A396EmprCod ,
                                           AV38Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX6 */
      pr_default.execute(4, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8LX9 = false ;
         A217BarTipArt = P08LX6_A217BarTipArt[0] ;
         n217BarTipArt = P08LX6_n217BarTipArt[0] ;
         A279CliNom = P08LX6_A279CliNom[0] ;
         A3612HisProReo = P08LX6_A3612HisProReo[0] ;
         A566HisProTur = P08LX6_A566HisProTur[0] ;
         A867ParCodNom = P08LX6_A867ParCodNom[0] ;
         n867ParCodNom = P08LX6_n867ParCodNom[0] ;
         A656ParCod = P08LX6_A656ParCod[0] ;
         n656ParCod = P08LX6_n656ParCod[0] ;
         A1526HisProMtr = P08LX6_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX6_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX6_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX6_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX6_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX6_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX6_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX6_A1652BarSerDsc[0] ;
         A212BarSer = P08LX6_A212BarSer[0] ;
         A159BarFecGen = P08LX6_A159BarFecGen[0] ;
         A252CliCod = P08LX6_A252CliCod[0] ;
         n252CliCod = P08LX6_n252CliCod[0] ;
         A3610HisProLot = P08LX6_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX6_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX6_A606MaqDsc[0] ;
         n606MaqDsc = P08LX6_n606MaqDsc[0] ;
         A602MaqCod = P08LX6_A602MaqCod[0] ;
         A129BarCod = P08LX6_A129BarCod[0] ;
         A132BarCodReo = P08LX6_A132BarCodReo[0] ;
         A130BarCodPar = P08LX6_A130BarCodPar[0] ;
         A143BarDisNum = P08LX6_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX6_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX6_A218BarTipCol[0] ;
         A461Fase = P08LX6_A461Fase[0] ;
         A396EmprCod = P08LX6_A396EmprCod[0] ;
         A558HisProFec = P08LX6_A558HisProFec[0] ;
         A561HisProLin = P08LX6_A561HisProLin[0] ;
         A606MaqDsc = P08LX6_A606MaqDsc[0] ;
         n606MaqDsc = P08LX6_n606MaqDsc[0] ;
         A217BarTipArt = P08LX6_A217BarTipArt[0] ;
         n217BarTipArt = P08LX6_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX6_A1652BarSerDsc[0] ;
         A212BarSer = P08LX6_A212BarSer[0] ;
         A159BarFecGen = P08LX6_A159BarFecGen[0] ;
         A252CliCod = P08LX6_A252CliCod[0] ;
         n252CliCod = P08LX6_n252CliCod[0] ;
         A13696BarNHdr = P08LX6_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX6_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX6_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX6_A218BarTipCol[0] ;
         A279CliNom = P08LX6_A279CliNom[0] ;
         A13711BarTipArtD = P08LX6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX6_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX6_A867ParCodNom[0] ;
         n867ParCodNom = P08LX6_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV32count = 0 ;
                              while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08LX6_A279CliNom[0], A279CliNom) == 0 ) )
                              {
                                 brk8LX9 = false ;
                                 A252CliCod = P08LX6_A252CliCod[0] ;
                                 n252CliCod = P08LX6_n252CliCod[0] ;
                                 A602MaqCod = P08LX6_A602MaqCod[0] ;
                                 A129BarCod = P08LX6_A129BarCod[0] ;
                                 A132BarCodReo = P08LX6_A132BarCodReo[0] ;
                                 A130BarCodPar = P08LX6_A130BarCodPar[0] ;
                                 A396EmprCod = P08LX6_A396EmprCod[0] ;
                                 A558HisProFec = P08LX6_A558HisProFec[0] ;
                                 A561HisProLin = P08LX6_A561HisProLin[0] ;
                                 A252CliCod = P08LX6_A252CliCod[0] ;
                                 n252CliCod = P08LX6_n252CliCod[0] ;
                                 AV32count = (long)(AV32count+1) ;
                                 brk8LX9 = true ;
                                 pr_default.readNext(4);
                              }
                              if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                              {
                                 AV24Option = A279CliNom ;
                                 AV25Options.add(AV24Option, 0);
                                 AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8LX9 )
         {
            brk8LX9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV82TFPedidoCliente = AV20SearchTxt ;
      AV83TFPedidoCliente_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX7 */
      pr_default.execute(5, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A217BarTipArt = P08LX7_A217BarTipArt[0] ;
         n217BarTipArt = P08LX7_n217BarTipArt[0] ;
         A3612HisProReo = P08LX7_A3612HisProReo[0] ;
         A566HisProTur = P08LX7_A566HisProTur[0] ;
         A867ParCodNom = P08LX7_A867ParCodNom[0] ;
         n867ParCodNom = P08LX7_n867ParCodNom[0] ;
         A656ParCod = P08LX7_A656ParCod[0] ;
         n656ParCod = P08LX7_n656ParCod[0] ;
         A1526HisProMtr = P08LX7_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX7_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX7_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX7_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX7_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX7_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX7_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX7_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX7_A1652BarSerDsc[0] ;
         A212BarSer = P08LX7_A212BarSer[0] ;
         A159BarFecGen = P08LX7_A159BarFecGen[0] ;
         A279CliNom = P08LX7_A279CliNom[0] ;
         A252CliCod = P08LX7_A252CliCod[0] ;
         n252CliCod = P08LX7_n252CliCod[0] ;
         A3610HisProLot = P08LX7_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX7_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX7_A606MaqDsc[0] ;
         n606MaqDsc = P08LX7_n606MaqDsc[0] ;
         A602MaqCod = P08LX7_A602MaqCod[0] ;
         A129BarCod = P08LX7_A129BarCod[0] ;
         A132BarCodReo = P08LX7_A132BarCodReo[0] ;
         A130BarCodPar = P08LX7_A130BarCodPar[0] ;
         A143BarDisNum = P08LX7_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX7_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX7_A218BarTipCol[0] ;
         A461Fase = P08LX7_A461Fase[0] ;
         A396EmprCod = P08LX7_A396EmprCod[0] ;
         A558HisProFec = P08LX7_A558HisProFec[0] ;
         A561HisProLin = P08LX7_A561HisProLin[0] ;
         A606MaqDsc = P08LX7_A606MaqDsc[0] ;
         n606MaqDsc = P08LX7_n606MaqDsc[0] ;
         A217BarTipArt = P08LX7_A217BarTipArt[0] ;
         n217BarTipArt = P08LX7_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX7_A1652BarSerDsc[0] ;
         A212BarSer = P08LX7_A212BarSer[0] ;
         A159BarFecGen = P08LX7_A159BarFecGen[0] ;
         A252CliCod = P08LX7_A252CliCod[0] ;
         n252CliCod = P08LX7_n252CliCod[0] ;
         A13696BarNHdr = P08LX7_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX7_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX7_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX7_A218BarTipCol[0] ;
         A279CliNom = P08LX7_A279CliNom[0] ;
         A13711BarTipArtD = P08LX7_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX7_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX7_A867ParCodNom[0] ;
         n867ParCodNom = P08LX7_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                              {
                                 AV24Option = A13878PedidoClie ;
                                 AV23InsertIndex = 1 ;
                                 while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
                                 {
                                    AV23InsertIndex = (int)(AV23InsertIndex+1) ;
                                 }
                                 if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
                                 {
                                    AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
                                    AV32count = (long)(AV32count+1) ;
                                    AV30OptionIndexes.removeItem(AV23InsertIndex);
                                    AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
                                 }
                                 else
                                 {
                                    AV25Options.add(AV24Option, AV23InsertIndex);
                                    AV30OptionIndexes.add("1", AV23InsertIndex);
                                 }
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV51TFBarSer = AV20SearchTxt ;
      AV52TFBarSer_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           A396EmprCod ,
                                           AV38Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX8 */
      pr_default.execute(6, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8LX12 = false ;
         A217BarTipArt = P08LX8_A217BarTipArt[0] ;
         n217BarTipArt = P08LX8_n217BarTipArt[0] ;
         A212BarSer = P08LX8_A212BarSer[0] ;
         A3612HisProReo = P08LX8_A3612HisProReo[0] ;
         A566HisProTur = P08LX8_A566HisProTur[0] ;
         A867ParCodNom = P08LX8_A867ParCodNom[0] ;
         n867ParCodNom = P08LX8_n867ParCodNom[0] ;
         A656ParCod = P08LX8_A656ParCod[0] ;
         n656ParCod = P08LX8_n656ParCod[0] ;
         A1526HisProMtr = P08LX8_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX8_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX8_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX8_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX8_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX8_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX8_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX8_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX8_A1652BarSerDsc[0] ;
         A159BarFecGen = P08LX8_A159BarFecGen[0] ;
         A279CliNom = P08LX8_A279CliNom[0] ;
         A252CliCod = P08LX8_A252CliCod[0] ;
         n252CliCod = P08LX8_n252CliCod[0] ;
         A3610HisProLot = P08LX8_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX8_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX8_A606MaqDsc[0] ;
         n606MaqDsc = P08LX8_n606MaqDsc[0] ;
         A602MaqCod = P08LX8_A602MaqCod[0] ;
         A129BarCod = P08LX8_A129BarCod[0] ;
         A132BarCodReo = P08LX8_A132BarCodReo[0] ;
         A130BarCodPar = P08LX8_A130BarCodPar[0] ;
         A143BarDisNum = P08LX8_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX8_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX8_A218BarTipCol[0] ;
         A461Fase = P08LX8_A461Fase[0] ;
         A396EmprCod = P08LX8_A396EmprCod[0] ;
         A558HisProFec = P08LX8_A558HisProFec[0] ;
         A561HisProLin = P08LX8_A561HisProLin[0] ;
         A606MaqDsc = P08LX8_A606MaqDsc[0] ;
         n606MaqDsc = P08LX8_n606MaqDsc[0] ;
         A217BarTipArt = P08LX8_A217BarTipArt[0] ;
         n217BarTipArt = P08LX8_n217BarTipArt[0] ;
         A212BarSer = P08LX8_A212BarSer[0] ;
         A1652BarSerDsc = P08LX8_A1652BarSerDsc[0] ;
         A159BarFecGen = P08LX8_A159BarFecGen[0] ;
         A252CliCod = P08LX8_A252CliCod[0] ;
         n252CliCod = P08LX8_n252CliCod[0] ;
         A13696BarNHdr = P08LX8_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX8_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX8_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX8_A218BarTipCol[0] ;
         A279CliNom = P08LX8_A279CliNom[0] ;
         A13711BarTipArtD = P08LX8_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX8_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX8_A867ParCodNom[0] ;
         n867ParCodNom = P08LX8_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV32count = 0 ;
                              while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08LX8_A212BarSer[0], A212BarSer) == 0 ) )
                              {
                                 brk8LX12 = false ;
                                 A602MaqCod = P08LX8_A602MaqCod[0] ;
                                 A129BarCod = P08LX8_A129BarCod[0] ;
                                 A132BarCodReo = P08LX8_A132BarCodReo[0] ;
                                 A130BarCodPar = P08LX8_A130BarCodPar[0] ;
                                 A396EmprCod = P08LX8_A396EmprCod[0] ;
                                 A558HisProFec = P08LX8_A558HisProFec[0] ;
                                 A561HisProLin = P08LX8_A561HisProLin[0] ;
                                 AV32count = (long)(AV32count+1) ;
                                 brk8LX12 = true ;
                                 pr_default.readNext(6);
                              }
                              if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                              {
                                 AV24Option = A212BarSer ;
                                 AV25Options.add(AV24Option, 0);
                                 AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8LX12 )
         {
            brk8LX12 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV53TFBarSerDsc = AV20SearchTxt ;
      AV54TFBarSerDsc_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           A396EmprCod ,
                                           AV38Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX9 */
      pr_default.execute(7, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8LX14 = false ;
         A217BarTipArt = P08LX9_A217BarTipArt[0] ;
         n217BarTipArt = P08LX9_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX9_A1652BarSerDsc[0] ;
         A3612HisProReo = P08LX9_A3612HisProReo[0] ;
         A566HisProTur = P08LX9_A566HisProTur[0] ;
         A867ParCodNom = P08LX9_A867ParCodNom[0] ;
         n867ParCodNom = P08LX9_n867ParCodNom[0] ;
         A656ParCod = P08LX9_A656ParCod[0] ;
         n656ParCod = P08LX9_n656ParCod[0] ;
         A1526HisProMtr = P08LX9_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX9_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX9_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX9_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX9_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX9_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX9_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX9_n13711BarTipArtD[0] ;
         A212BarSer = P08LX9_A212BarSer[0] ;
         A159BarFecGen = P08LX9_A159BarFecGen[0] ;
         A279CliNom = P08LX9_A279CliNom[0] ;
         A252CliCod = P08LX9_A252CliCod[0] ;
         n252CliCod = P08LX9_n252CliCod[0] ;
         A3610HisProLot = P08LX9_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX9_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX9_A606MaqDsc[0] ;
         n606MaqDsc = P08LX9_n606MaqDsc[0] ;
         A602MaqCod = P08LX9_A602MaqCod[0] ;
         A129BarCod = P08LX9_A129BarCod[0] ;
         A132BarCodReo = P08LX9_A132BarCodReo[0] ;
         A130BarCodPar = P08LX9_A130BarCodPar[0] ;
         A143BarDisNum = P08LX9_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX9_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX9_A218BarTipCol[0] ;
         A461Fase = P08LX9_A461Fase[0] ;
         A396EmprCod = P08LX9_A396EmprCod[0] ;
         A558HisProFec = P08LX9_A558HisProFec[0] ;
         A561HisProLin = P08LX9_A561HisProLin[0] ;
         A606MaqDsc = P08LX9_A606MaqDsc[0] ;
         n606MaqDsc = P08LX9_n606MaqDsc[0] ;
         A217BarTipArt = P08LX9_A217BarTipArt[0] ;
         n217BarTipArt = P08LX9_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX9_A1652BarSerDsc[0] ;
         A212BarSer = P08LX9_A212BarSer[0] ;
         A159BarFecGen = P08LX9_A159BarFecGen[0] ;
         A252CliCod = P08LX9_A252CliCod[0] ;
         n252CliCod = P08LX9_n252CliCod[0] ;
         A13696BarNHdr = P08LX9_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX9_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX9_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX9_A218BarTipCol[0] ;
         A279CliNom = P08LX9_A279CliNom[0] ;
         A13711BarTipArtD = P08LX9_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX9_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX9_A867ParCodNom[0] ;
         n867ParCodNom = P08LX9_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV32count = 0 ;
                              while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08LX9_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                              {
                                 brk8LX14 = false ;
                                 A602MaqCod = P08LX9_A602MaqCod[0] ;
                                 A129BarCod = P08LX9_A129BarCod[0] ;
                                 A132BarCodReo = P08LX9_A132BarCodReo[0] ;
                                 A130BarCodPar = P08LX9_A130BarCodPar[0] ;
                                 A396EmprCod = P08LX9_A396EmprCod[0] ;
                                 A558HisProFec = P08LX9_A558HisProFec[0] ;
                                 A561HisProLin = P08LX9_A561HisProLin[0] ;
                                 AV32count = (long)(AV32count+1) ;
                                 brk8LX14 = true ;
                                 pr_default.readNext(7);
                              }
                              if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                              {
                                 AV24Option = A1652BarSerDsc ;
                                 AV25Options.add(AV24Option, 0);
                                 AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8LX14 )
         {
            brk8LX14 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADBARTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV78TFBarTipArtDsc = AV20SearchTxt ;
      AV79TFBarTipArtDsc_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           A396EmprCod ,
                                           AV38Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX10 */
      pr_default.execute(8, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk8LX16 = false ;
         A217BarTipArt = P08LX10_A217BarTipArt[0] ;
         n217BarTipArt = P08LX10_n217BarTipArt[0] ;
         A13711BarTipArtD = P08LX10_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX10_n13711BarTipArtD[0] ;
         A3612HisProReo = P08LX10_A3612HisProReo[0] ;
         A566HisProTur = P08LX10_A566HisProTur[0] ;
         A867ParCodNom = P08LX10_A867ParCodNom[0] ;
         n867ParCodNom = P08LX10_n867ParCodNom[0] ;
         A656ParCod = P08LX10_A656ParCod[0] ;
         n656ParCod = P08LX10_n656ParCod[0] ;
         A1526HisProMtr = P08LX10_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX10_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX10_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX10_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX10_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX10_n4440HisProDTI[0] ;
         A1652BarSerDsc = P08LX10_A1652BarSerDsc[0] ;
         A212BarSer = P08LX10_A212BarSer[0] ;
         A159BarFecGen = P08LX10_A159BarFecGen[0] ;
         A279CliNom = P08LX10_A279CliNom[0] ;
         A252CliCod = P08LX10_A252CliCod[0] ;
         n252CliCod = P08LX10_n252CliCod[0] ;
         A3610HisProLot = P08LX10_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX10_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX10_A606MaqDsc[0] ;
         n606MaqDsc = P08LX10_n606MaqDsc[0] ;
         A602MaqCod = P08LX10_A602MaqCod[0] ;
         A129BarCod = P08LX10_A129BarCod[0] ;
         A132BarCodReo = P08LX10_A132BarCodReo[0] ;
         A130BarCodPar = P08LX10_A130BarCodPar[0] ;
         A143BarDisNum = P08LX10_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX10_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX10_A218BarTipCol[0] ;
         A461Fase = P08LX10_A461Fase[0] ;
         A396EmprCod = P08LX10_A396EmprCod[0] ;
         A558HisProFec = P08LX10_A558HisProFec[0] ;
         A561HisProLin = P08LX10_A561HisProLin[0] ;
         A606MaqDsc = P08LX10_A606MaqDsc[0] ;
         n606MaqDsc = P08LX10_n606MaqDsc[0] ;
         A217BarTipArt = P08LX10_A217BarTipArt[0] ;
         n217BarTipArt = P08LX10_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX10_A1652BarSerDsc[0] ;
         A212BarSer = P08LX10_A212BarSer[0] ;
         A159BarFecGen = P08LX10_A159BarFecGen[0] ;
         A252CliCod = P08LX10_A252CliCod[0] ;
         n252CliCod = P08LX10_n252CliCod[0] ;
         A13696BarNHdr = P08LX10_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX10_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX10_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX10_A218BarTipCol[0] ;
         A279CliNom = P08LX10_A279CliNom[0] ;
         A13711BarTipArtD = P08LX10_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX10_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX10_A867ParCodNom[0] ;
         n867ParCodNom = P08LX10_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV32count = 0 ;
                              while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P08LX10_A13711BarTipArtD[0], A13711BarTipArtD) == 0 ) )
                              {
                                 brk8LX16 = false ;
                                 A217BarTipArt = P08LX10_A217BarTipArt[0] ;
                                 n217BarTipArt = P08LX10_n217BarTipArt[0] ;
                                 A602MaqCod = P08LX10_A602MaqCod[0] ;
                                 A129BarCod = P08LX10_A129BarCod[0] ;
                                 A132BarCodReo = P08LX10_A132BarCodReo[0] ;
                                 A130BarCodPar = P08LX10_A130BarCodPar[0] ;
                                 A396EmprCod = P08LX10_A396EmprCod[0] ;
                                 A558HisProFec = P08LX10_A558HisProFec[0] ;
                                 A561HisProLin = P08LX10_A561HisProLin[0] ;
                                 A217BarTipArt = P08LX10_A217BarTipArt[0] ;
                                 n217BarTipArt = P08LX10_n217BarTipArt[0] ;
                                 AV32count = (long)(AV32count+1) ;
                                 brk8LX16 = true ;
                                 pr_default.readNext(8);
                              }
                              if ( ! (GXutil.strcmp("", A13711BarTipArtD)==0) )
                              {
                                 AV24Option = A13711BarTipArtD ;
                                 AV25Options.add(AV24Option, 0);
                                 AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8LX16 )
         {
            brk8LX16 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADBARTIPCOLDSCOPTIONS' Routine */
      returnInSub = false ;
      AV80TFBarTipColDsc = AV20SearchTxt ;
      AV81TFBarTipColDsc_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX11 */
      pr_default.execute(9, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A217BarTipArt = P08LX11_A217BarTipArt[0] ;
         n217BarTipArt = P08LX11_n217BarTipArt[0] ;
         A3612HisProReo = P08LX11_A3612HisProReo[0] ;
         A566HisProTur = P08LX11_A566HisProTur[0] ;
         A867ParCodNom = P08LX11_A867ParCodNom[0] ;
         n867ParCodNom = P08LX11_n867ParCodNom[0] ;
         A656ParCod = P08LX11_A656ParCod[0] ;
         n656ParCod = P08LX11_n656ParCod[0] ;
         A1526HisProMtr = P08LX11_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX11_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX11_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX11_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX11_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX11_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX11_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX11_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX11_A1652BarSerDsc[0] ;
         A212BarSer = P08LX11_A212BarSer[0] ;
         A159BarFecGen = P08LX11_A159BarFecGen[0] ;
         A279CliNom = P08LX11_A279CliNom[0] ;
         A252CliCod = P08LX11_A252CliCod[0] ;
         n252CliCod = P08LX11_n252CliCod[0] ;
         A3610HisProLot = P08LX11_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX11_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX11_A606MaqDsc[0] ;
         n606MaqDsc = P08LX11_n606MaqDsc[0] ;
         A602MaqCod = P08LX11_A602MaqCod[0] ;
         A129BarCod = P08LX11_A129BarCod[0] ;
         A132BarCodReo = P08LX11_A132BarCodReo[0] ;
         A130BarCodPar = P08LX11_A130BarCodPar[0] ;
         A143BarDisNum = P08LX11_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX11_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX11_A218BarTipCol[0] ;
         A461Fase = P08LX11_A461Fase[0] ;
         A396EmprCod = P08LX11_A396EmprCod[0] ;
         A558HisProFec = P08LX11_A558HisProFec[0] ;
         A561HisProLin = P08LX11_A561HisProLin[0] ;
         A606MaqDsc = P08LX11_A606MaqDsc[0] ;
         n606MaqDsc = P08LX11_n606MaqDsc[0] ;
         A217BarTipArt = P08LX11_A217BarTipArt[0] ;
         n217BarTipArt = P08LX11_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX11_A1652BarSerDsc[0] ;
         A212BarSer = P08LX11_A212BarSer[0] ;
         A159BarFecGen = P08LX11_A159BarFecGen[0] ;
         A252CliCod = P08LX11_A252CliCod[0] ;
         n252CliCod = P08LX11_n252CliCod[0] ;
         A13696BarNHdr = P08LX11_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX11_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX11_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX11_A218BarTipCol[0] ;
         A279CliNom = P08LX11_A279CliNom[0] ;
         A13711BarTipArtD = P08LX11_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX11_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX11_A867ParCodNom[0] ;
         n867ParCodNom = P08LX11_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              if ( ! (GXutil.strcmp("", A13868BarTipColD)==0) )
                              {
                                 AV24Option = A13868BarTipColD ;
                                 AV23InsertIndex = 1 ;
                                 while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
                                 {
                                    AV23InsertIndex = (int)(AV23InsertIndex+1) ;
                                 }
                                 if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
                                 {
                                    AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
                                    AV32count = (long)(AV32count+1) ;
                                    AV30OptionIndexes.removeItem(AV23InsertIndex);
                                    AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
                                 }
                                 else
                                 {
                                    AV25Options.add(AV24Option, AV23InsertIndex);
                                    AV30OptionIndexes.add("1", AV23InsertIndex);
                                 }
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADFASEOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFase = AV20SearchTxt ;
      AV15TFFase_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX12 */
      pr_default.execute(10, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         brk8LX19 = false ;
         A217BarTipArt = P08LX12_A217BarTipArt[0] ;
         n217BarTipArt = P08LX12_n217BarTipArt[0] ;
         A3612HisProReo = P08LX12_A3612HisProReo[0] ;
         A566HisProTur = P08LX12_A566HisProTur[0] ;
         A867ParCodNom = P08LX12_A867ParCodNom[0] ;
         n867ParCodNom = P08LX12_n867ParCodNom[0] ;
         A656ParCod = P08LX12_A656ParCod[0] ;
         n656ParCod = P08LX12_n656ParCod[0] ;
         A1526HisProMtr = P08LX12_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX12_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX12_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX12_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX12_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX12_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX12_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX12_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX12_A1652BarSerDsc[0] ;
         A212BarSer = P08LX12_A212BarSer[0] ;
         A159BarFecGen = P08LX12_A159BarFecGen[0] ;
         A279CliNom = P08LX12_A279CliNom[0] ;
         A252CliCod = P08LX12_A252CliCod[0] ;
         n252CliCod = P08LX12_n252CliCod[0] ;
         A3610HisProLot = P08LX12_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX12_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX12_A606MaqDsc[0] ;
         n606MaqDsc = P08LX12_n606MaqDsc[0] ;
         A602MaqCod = P08LX12_A602MaqCod[0] ;
         A129BarCod = P08LX12_A129BarCod[0] ;
         A132BarCodReo = P08LX12_A132BarCodReo[0] ;
         A130BarCodPar = P08LX12_A130BarCodPar[0] ;
         A143BarDisNum = P08LX12_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX12_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX12_A218BarTipCol[0] ;
         A461Fase = P08LX12_A461Fase[0] ;
         A396EmprCod = P08LX12_A396EmprCod[0] ;
         A558HisProFec = P08LX12_A558HisProFec[0] ;
         A561HisProLin = P08LX12_A561HisProLin[0] ;
         A606MaqDsc = P08LX12_A606MaqDsc[0] ;
         n606MaqDsc = P08LX12_n606MaqDsc[0] ;
         A217BarTipArt = P08LX12_A217BarTipArt[0] ;
         n217BarTipArt = P08LX12_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX12_A1652BarSerDsc[0] ;
         A212BarSer = P08LX12_A212BarSer[0] ;
         A159BarFecGen = P08LX12_A159BarFecGen[0] ;
         A252CliCod = P08LX12_A252CliCod[0] ;
         n252CliCod = P08LX12_n252CliCod[0] ;
         A13696BarNHdr = P08LX12_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX12_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX12_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX12_A218BarTipCol[0] ;
         A279CliNom = P08LX12_A279CliNom[0] ;
         A13711BarTipArtD = P08LX12_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX12_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX12_A867ParCodNom[0] ;
         n867ParCodNom = P08LX12_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV32count = 0 ;
                              while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(P08LX12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08LX12_A461Fase[0], A461Fase) == 0 ) )
                              {
                                 brk8LX19 = false ;
                                 A602MaqCod = P08LX12_A602MaqCod[0] ;
                                 A558HisProFec = P08LX12_A558HisProFec[0] ;
                                 A561HisProLin = P08LX12_A561HisProLin[0] ;
                                 AV32count = (long)(AV32count+1) ;
                                 brk8LX19 = true ;
                                 pr_default.readNext(10);
                              }
                              if ( ! (GXutil.strcmp("", A461Fase)==0) )
                              {
                                 AV24Option = A461Fase ;
                                 AV25Options.add(AV24Option, 0);
                                 AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8LX19 )
         {
            brk8LX19 = true ;
            pr_default.readNext(10);
         }
      }
      pr_default.close(10);
   }

   public void S231( )
   {
      /* 'LOADFASEDESCRIPCIONOPTIONS' Routine */
      returnInSub = false ;
      AV86TFFaseDescripcion = AV20SearchTxt ;
      AV87TFFaseDescripcion_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX13 */
      pr_default.execute(11, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A217BarTipArt = P08LX13_A217BarTipArt[0] ;
         n217BarTipArt = P08LX13_n217BarTipArt[0] ;
         A3612HisProReo = P08LX13_A3612HisProReo[0] ;
         A566HisProTur = P08LX13_A566HisProTur[0] ;
         A867ParCodNom = P08LX13_A867ParCodNom[0] ;
         n867ParCodNom = P08LX13_n867ParCodNom[0] ;
         A656ParCod = P08LX13_A656ParCod[0] ;
         n656ParCod = P08LX13_n656ParCod[0] ;
         A1526HisProMtr = P08LX13_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX13_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX13_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX13_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX13_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX13_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX13_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX13_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX13_A1652BarSerDsc[0] ;
         A212BarSer = P08LX13_A212BarSer[0] ;
         A159BarFecGen = P08LX13_A159BarFecGen[0] ;
         A279CliNom = P08LX13_A279CliNom[0] ;
         A252CliCod = P08LX13_A252CliCod[0] ;
         n252CliCod = P08LX13_n252CliCod[0] ;
         A3610HisProLot = P08LX13_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX13_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX13_A606MaqDsc[0] ;
         n606MaqDsc = P08LX13_n606MaqDsc[0] ;
         A602MaqCod = P08LX13_A602MaqCod[0] ;
         A129BarCod = P08LX13_A129BarCod[0] ;
         A132BarCodReo = P08LX13_A132BarCodReo[0] ;
         A130BarCodPar = P08LX13_A130BarCodPar[0] ;
         A143BarDisNum = P08LX13_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX13_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX13_A218BarTipCol[0] ;
         A461Fase = P08LX13_A461Fase[0] ;
         A396EmprCod = P08LX13_A396EmprCod[0] ;
         A558HisProFec = P08LX13_A558HisProFec[0] ;
         A561HisProLin = P08LX13_A561HisProLin[0] ;
         A606MaqDsc = P08LX13_A606MaqDsc[0] ;
         n606MaqDsc = P08LX13_n606MaqDsc[0] ;
         A217BarTipArt = P08LX13_A217BarTipArt[0] ;
         n217BarTipArt = P08LX13_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX13_A1652BarSerDsc[0] ;
         A212BarSer = P08LX13_A212BarSer[0] ;
         A159BarFecGen = P08LX13_A159BarFecGen[0] ;
         A252CliCod = P08LX13_A252CliCod[0] ;
         n252CliCod = P08LX13_n252CliCod[0] ;
         A13696BarNHdr = P08LX13_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX13_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX13_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX13_A218BarTipCol[0] ;
         A279CliNom = P08LX13_A279CliNom[0] ;
         A13711BarTipArtD = P08LX13_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX13_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX13_A867ParCodNom[0] ;
         n867ParCodNom = P08LX13_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              if ( ! (GXutil.strcmp("", A13893FaseDescri)==0) )
                              {
                                 AV24Option = A13893FaseDescri ;
                                 AV23InsertIndex = 1 ;
                                 while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
                                 {
                                    AV23InsertIndex = (int)(AV23InsertIndex+1) ;
                                 }
                                 if ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) == 0 ) )
                                 {
                                    AV32count = GXutil.lval( (String)AV30OptionIndexes.elementAt(-1+AV23InsertIndex)) ;
                                    AV32count = (long)(AV32count+1) ;
                                    AV30OptionIndexes.removeItem(AV23InsertIndex);
                                    AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
                                 }
                                 else
                                 {
                                    AV25Options.add(AV24Option, AV23InsertIndex);
                                    AV30OptionIndexes.add("1", AV23InsertIndex);
                                 }
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S241( )
   {
      /* 'LOADPARCODNOMOPTIONS' Routine */
      returnInSub = false ;
      AV61TFParCodNom = AV20SearchTxt ;
      AV62TFParCodNom_Sel = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = AV67FilterFullText ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV10TFMaqCod ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV43TFMaqDsc ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV44TFMaqDsc_Sel ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV12TFBarNHdr ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV13TFBarNHdr_Sel ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV65TFHisProLot ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV66TFHisProLot_Sel ;
      AV102Wciformedetalladohdrsproduccionds_10_tfclicod = AV45TFCliCod ;
      AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV46TFCliCod_To ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = AV47TFCliNom ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV48TFCliNom_Sel ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV82TFPedidoCliente ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV83TFPedidoCliente_Sel ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV49TFBarFecGen ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = AV51TFBarSer ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV52TFBarSer_Sel ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV53TFBarSerDsc ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV54TFBarSerDsc_Sel ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV78TFBarTipArtDsc ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV79TFBarTipArtDsc_Sel ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV80TFBarTipColDsc ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV81TFBarTipColDsc_Sel ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = AV14TFFase ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = AV15TFFase_Sel ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV86TFFaseDescripcion ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV87TFFaseDescripcion_Sel ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV16TFHisProDTI ;
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV18TFHisProDTF ;
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV55TFHisProKgr ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV56TFHisProKgr_To ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV57TFHisProMtr ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV58TFHisProMtr_To ;
      AV127Wciformedetalladohdrsproduccionds_35_tfparcod = AV59TFParCod ;
      AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV60TFParCod_To ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV61TFParCodNom ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV62TFParCodNom_Sel ;
      AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV63TFHisProTur ;
      AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV64TFHisProTur_To ;
      AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV70TFHisProReo ;
      AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV71TFHisProReo_To ;
      pr_default.dynParam(12, new Object[]{ new Object[]{
                                           AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV39MaqCodInicial ,
                                           AV40MaqCodFinal ,
                                           AV41Hisprodti ,
                                           AV42Hisprodtf ,
                                           Byte.valueOf(AV68HisProReo) ,
                                           Short.valueOf(AV69ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           A396EmprCod ,
                                           AV38Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV104Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV117Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LX14 */
      pr_default.execute(12, new Object[] {AV38Emprcod, lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV102Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV104Wciformedetalladohdrsproduccionds_12_tfclinom, AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV109Wciformedetalladohdrsproduccionds_17_tfbarser, AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV117Wciformedetalladohdrsproduccionds_25_tffase, AV118Wciformedetalladohdrsproduccionds_26_tffase_sel, AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV127Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV39MaqCodInicial, AV40MaqCodFinal, AV41Hisprodti, AV42Hisprodtf, Byte.valueOf(AV68HisProReo), Short.valueOf(AV69ParCod)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         brk8LX22 = false ;
         A217BarTipArt = P08LX14_A217BarTipArt[0] ;
         n217BarTipArt = P08LX14_n217BarTipArt[0] ;
         A867ParCodNom = P08LX14_A867ParCodNom[0] ;
         n867ParCodNom = P08LX14_n867ParCodNom[0] ;
         A3612HisProReo = P08LX14_A3612HisProReo[0] ;
         A566HisProTur = P08LX14_A566HisProTur[0] ;
         A656ParCod = P08LX14_A656ParCod[0] ;
         n656ParCod = P08LX14_n656ParCod[0] ;
         A1526HisProMtr = P08LX14_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LX14_A1525HisProKgr[0] ;
         A4441HisProDTF = P08LX14_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LX14_n4441HisProDTF[0] ;
         A4440HisProDTI = P08LX14_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LX14_n4440HisProDTI[0] ;
         A13711BarTipArtD = P08LX14_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX14_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LX14_A1652BarSerDsc[0] ;
         A212BarSer = P08LX14_A212BarSer[0] ;
         A159BarFecGen = P08LX14_A159BarFecGen[0] ;
         A279CliNom = P08LX14_A279CliNom[0] ;
         A252CliCod = P08LX14_A252CliCod[0] ;
         n252CliCod = P08LX14_n252CliCod[0] ;
         A3610HisProLot = P08LX14_A3610HisProLot[0] ;
         A13696BarNHdr = P08LX14_A13696BarNHdr[0] ;
         A606MaqDsc = P08LX14_A606MaqDsc[0] ;
         n606MaqDsc = P08LX14_n606MaqDsc[0] ;
         A602MaqCod = P08LX14_A602MaqCod[0] ;
         A129BarCod = P08LX14_A129BarCod[0] ;
         A132BarCodReo = P08LX14_A132BarCodReo[0] ;
         A130BarCodPar = P08LX14_A130BarCodPar[0] ;
         A143BarDisNum = P08LX14_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX14_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX14_A218BarTipCol[0] ;
         A461Fase = P08LX14_A461Fase[0] ;
         A396EmprCod = P08LX14_A396EmprCod[0] ;
         A558HisProFec = P08LX14_A558HisProFec[0] ;
         A561HisProLin = P08LX14_A561HisProLin[0] ;
         A606MaqDsc = P08LX14_A606MaqDsc[0] ;
         n606MaqDsc = P08LX14_n606MaqDsc[0] ;
         A217BarTipArt = P08LX14_A217BarTipArt[0] ;
         n217BarTipArt = P08LX14_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LX14_A1652BarSerDsc[0] ;
         A212BarSer = P08LX14_A212BarSer[0] ;
         A159BarFecGen = P08LX14_A159BarFecGen[0] ;
         A252CliCod = P08LX14_A252CliCod[0] ;
         n252CliCod = P08LX14_n252CliCod[0] ;
         A13696BarNHdr = P08LX14_A13696BarNHdr[0] ;
         A143BarDisNum = P08LX14_A143BarDisNum[0] ;
         A4812BarEncCli = P08LX14_A4812BarEncCli[0] ;
         A218BarTipCol = P08LX14_A218BarTipCol[0] ;
         A279CliNom = P08LX14_A279CliNom[0] ;
         A13711BarTipArtD = P08LX14_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LX14_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LX14_A867ParCodNom[0] ;
         n867ParCodNom = P08LX14_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproducciongetfilterdata.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproducciongetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV93Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV93Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV93Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              AV32count = 0 ;
                              while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(P08LX14_A867ParCodNom[0], A867ParCodNom) == 0 ) )
                              {
                                 brk8LX22 = false ;
                                 A656ParCod = P08LX14_A656ParCod[0] ;
                                 n656ParCod = P08LX14_n656ParCod[0] ;
                                 A602MaqCod = P08LX14_A602MaqCod[0] ;
                                 A396EmprCod = P08LX14_A396EmprCod[0] ;
                                 A558HisProFec = P08LX14_A558HisProFec[0] ;
                                 A561HisProLin = P08LX14_A561HisProLin[0] ;
                                 AV32count = (long)(AV32count+1) ;
                                 brk8LX22 = true ;
                                 pr_default.readNext(12);
                              }
                              if ( ! (GXutil.strcmp("", A867ParCodNom)==0) )
                              {
                                 AV24Option = A867ParCodNom ;
                                 AV25Options.add(AV24Option, 0);
                                 AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                              }
                              if ( AV25Options.size() == 50 )
                              {
                                 /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                 if (true) break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8LX22 )
         {
            brk8LX22 = true ;
            pr_default.readNext(12);
         }
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wciformedetalladohdrsproducciongetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = wciformedetalladohdrsproducciongetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = wciformedetalladohdrsproducciongetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV67FilterFullText = "" ;
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV43TFMaqDsc = "" ;
      AV44TFMaqDsc_Sel = "" ;
      AV12TFBarNHdr = "" ;
      AV13TFBarNHdr_Sel = "" ;
      AV65TFHisProLot = "" ;
      AV66TFHisProLot_Sel = "" ;
      AV47TFCliNom = "" ;
      AV48TFCliNom_Sel = "" ;
      AV82TFPedidoCliente = "" ;
      AV83TFPedidoCliente_Sel = "" ;
      AV49TFBarFecGen = GXutil.nullDate() ;
      AV51TFBarSer = "" ;
      AV52TFBarSer_Sel = "" ;
      AV53TFBarSerDsc = "" ;
      AV54TFBarSerDsc_Sel = "" ;
      AV78TFBarTipArtDsc = "" ;
      AV79TFBarTipArtDsc_Sel = "" ;
      AV80TFBarTipColDsc = "" ;
      AV81TFBarTipColDsc_Sel = "" ;
      AV14TFFase = "" ;
      AV15TFFase_Sel = "" ;
      AV86TFFaseDescripcion = "" ;
      AV87TFFaseDescripcion_Sel = "" ;
      AV16TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV18TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV55TFHisProKgr = DecimalUtil.ZERO ;
      AV56TFHisProKgr_To = DecimalUtil.ZERO ;
      AV57TFHisProMtr = DecimalUtil.ZERO ;
      AV58TFHisProMtr_To = DecimalUtil.ZERO ;
      AV61TFParCodNom = "" ;
      AV62TFParCodNom_Sel = "" ;
      AV38Emprcod = "" ;
      AV39MaqCodInicial = "" ;
      AV40MaqCodFinal = "" ;
      AV41Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV42Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      AV93Wciformedetalladohdrsproduccionds_1_filterfulltext = "" ;
      AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = "" ;
      AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = "" ;
      AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = "" ;
      AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = "" ;
      AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = "" ;
      AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = "" ;
      AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = "" ;
      AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = "" ;
      AV104Wciformedetalladohdrsproduccionds_12_tfclinom = "" ;
      AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel = "" ;
      AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente = "" ;
      AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = "" ;
      AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen = GXutil.nullDate() ;
      AV109Wciformedetalladohdrsproduccionds_17_tfbarser = "" ;
      AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel = "" ;
      AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = "" ;
      AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = "" ;
      AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = "" ;
      AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = "" ;
      AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = "" ;
      AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = "" ;
      AV117Wciformedetalladohdrsproduccionds_25_tffase = "" ;
      AV118Wciformedetalladohdrsproduccionds_26_tffase_sel = "" ;
      AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion = "" ;
      AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = "" ;
      AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr = DecimalUtil.ZERO ;
      AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr = DecimalUtil.ZERO ;
      AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = DecimalUtil.ZERO ;
      AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = "" ;
      AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = "" ;
      lV93Wciformedetalladohdrsproduccionds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod = "" ;
      lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc = "" ;
      lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr = "" ;
      lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot = "" ;
      lV104Wciformedetalladohdrsproduccionds_12_tfclinom = "" ;
      lV109Wciformedetalladohdrsproduccionds_17_tfbarser = "" ;
      lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc = "" ;
      lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = "" ;
      lV117Wciformedetalladohdrsproduccionds_25_tffase = "" ;
      lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom = "" ;
      A606MaqDsc = "" ;
      A130BarCodPar = "" ;
      A3610HisProLot = "" ;
      A279CliNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A461Fase = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A13696BarNHdr = "" ;
      A13878PedidoClie = "" ;
      A13868BarTipColD = "" ;
      A13893FaseDescri = "" ;
      A396EmprCod = "" ;
      P08LX2_A217BarTipArt = new short[1] ;
      P08LX2_n217BarTipArt = new boolean[] {false} ;
      P08LX2_A602MaqCod = new String[] {""} ;
      P08LX2_A3612HisProReo = new byte[1] ;
      P08LX2_A566HisProTur = new byte[1] ;
      P08LX2_A867ParCodNom = new String[] {""} ;
      P08LX2_n867ParCodNom = new boolean[] {false} ;
      P08LX2_A656ParCod = new short[1] ;
      P08LX2_n656ParCod = new boolean[] {false} ;
      P08LX2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX2_n4441HisProDTF = new boolean[] {false} ;
      P08LX2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX2_n4440HisProDTI = new boolean[] {false} ;
      P08LX2_A13711BarTipArtD = new String[] {""} ;
      P08LX2_n13711BarTipArtD = new boolean[] {false} ;
      P08LX2_A1652BarSerDsc = new String[] {""} ;
      P08LX2_A212BarSer = new String[] {""} ;
      P08LX2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX2_A279CliNom = new String[] {""} ;
      P08LX2_A252CliCod = new int[1] ;
      P08LX2_n252CliCod = new boolean[] {false} ;
      P08LX2_A3610HisProLot = new String[] {""} ;
      P08LX2_A13696BarNHdr = new String[] {""} ;
      P08LX2_A606MaqDsc = new String[] {""} ;
      P08LX2_n606MaqDsc = new boolean[] {false} ;
      P08LX2_A129BarCod = new int[1] ;
      P08LX2_A132BarCodReo = new byte[1] ;
      P08LX2_A130BarCodPar = new String[] {""} ;
      P08LX2_A143BarDisNum = new String[] {""} ;
      P08LX2_A4812BarEncCli = new String[] {""} ;
      P08LX2_A218BarTipCol = new byte[1] ;
      P08LX2_A461Fase = new String[] {""} ;
      P08LX2_A396EmprCod = new String[] {""} ;
      P08LX2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX2_A561HisProLin = new int[1] ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A558HisProFec = GXutil.nullDate() ;
      AV24Option = "" ;
      P08LX3_A217BarTipArt = new short[1] ;
      P08LX3_n217BarTipArt = new boolean[] {false} ;
      P08LX3_A606MaqDsc = new String[] {""} ;
      P08LX3_n606MaqDsc = new boolean[] {false} ;
      P08LX3_A3612HisProReo = new byte[1] ;
      P08LX3_A566HisProTur = new byte[1] ;
      P08LX3_A867ParCodNom = new String[] {""} ;
      P08LX3_n867ParCodNom = new boolean[] {false} ;
      P08LX3_A656ParCod = new short[1] ;
      P08LX3_n656ParCod = new boolean[] {false} ;
      P08LX3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX3_n4441HisProDTF = new boolean[] {false} ;
      P08LX3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX3_n4440HisProDTI = new boolean[] {false} ;
      P08LX3_A13711BarTipArtD = new String[] {""} ;
      P08LX3_n13711BarTipArtD = new boolean[] {false} ;
      P08LX3_A1652BarSerDsc = new String[] {""} ;
      P08LX3_A212BarSer = new String[] {""} ;
      P08LX3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX3_A279CliNom = new String[] {""} ;
      P08LX3_A252CliCod = new int[1] ;
      P08LX3_n252CliCod = new boolean[] {false} ;
      P08LX3_A3610HisProLot = new String[] {""} ;
      P08LX3_A13696BarNHdr = new String[] {""} ;
      P08LX3_A602MaqCod = new String[] {""} ;
      P08LX3_A129BarCod = new int[1] ;
      P08LX3_A132BarCodReo = new byte[1] ;
      P08LX3_A130BarCodPar = new String[] {""} ;
      P08LX3_A143BarDisNum = new String[] {""} ;
      P08LX3_A4812BarEncCli = new String[] {""} ;
      P08LX3_A218BarTipCol = new byte[1] ;
      P08LX3_A461Fase = new String[] {""} ;
      P08LX3_A396EmprCod = new String[] {""} ;
      P08LX3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX3_A561HisProLin = new int[1] ;
      P08LX4_A217BarTipArt = new short[1] ;
      P08LX4_n217BarTipArt = new boolean[] {false} ;
      P08LX4_A3612HisProReo = new byte[1] ;
      P08LX4_A566HisProTur = new byte[1] ;
      P08LX4_A867ParCodNom = new String[] {""} ;
      P08LX4_n867ParCodNom = new boolean[] {false} ;
      P08LX4_A656ParCod = new short[1] ;
      P08LX4_n656ParCod = new boolean[] {false} ;
      P08LX4_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX4_n4441HisProDTF = new boolean[] {false} ;
      P08LX4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX4_n4440HisProDTI = new boolean[] {false} ;
      P08LX4_A13711BarTipArtD = new String[] {""} ;
      P08LX4_n13711BarTipArtD = new boolean[] {false} ;
      P08LX4_A1652BarSerDsc = new String[] {""} ;
      P08LX4_A212BarSer = new String[] {""} ;
      P08LX4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX4_A279CliNom = new String[] {""} ;
      P08LX4_A252CliCod = new int[1] ;
      P08LX4_n252CliCod = new boolean[] {false} ;
      P08LX4_A3610HisProLot = new String[] {""} ;
      P08LX4_A13696BarNHdr = new String[] {""} ;
      P08LX4_A606MaqDsc = new String[] {""} ;
      P08LX4_n606MaqDsc = new boolean[] {false} ;
      P08LX4_A602MaqCod = new String[] {""} ;
      P08LX4_A129BarCod = new int[1] ;
      P08LX4_A132BarCodReo = new byte[1] ;
      P08LX4_A130BarCodPar = new String[] {""} ;
      P08LX4_A143BarDisNum = new String[] {""} ;
      P08LX4_A4812BarEncCli = new String[] {""} ;
      P08LX4_A218BarTipCol = new byte[1] ;
      P08LX4_A461Fase = new String[] {""} ;
      P08LX4_A396EmprCod = new String[] {""} ;
      P08LX4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX4_A561HisProLin = new int[1] ;
      P08LX5_A217BarTipArt = new short[1] ;
      P08LX5_n217BarTipArt = new boolean[] {false} ;
      P08LX5_A3610HisProLot = new String[] {""} ;
      P08LX5_A3612HisProReo = new byte[1] ;
      P08LX5_A566HisProTur = new byte[1] ;
      P08LX5_A867ParCodNom = new String[] {""} ;
      P08LX5_n867ParCodNom = new boolean[] {false} ;
      P08LX5_A656ParCod = new short[1] ;
      P08LX5_n656ParCod = new boolean[] {false} ;
      P08LX5_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX5_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX5_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX5_n4441HisProDTF = new boolean[] {false} ;
      P08LX5_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX5_n4440HisProDTI = new boolean[] {false} ;
      P08LX5_A13711BarTipArtD = new String[] {""} ;
      P08LX5_n13711BarTipArtD = new boolean[] {false} ;
      P08LX5_A1652BarSerDsc = new String[] {""} ;
      P08LX5_A212BarSer = new String[] {""} ;
      P08LX5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX5_A279CliNom = new String[] {""} ;
      P08LX5_A252CliCod = new int[1] ;
      P08LX5_n252CliCod = new boolean[] {false} ;
      P08LX5_A13696BarNHdr = new String[] {""} ;
      P08LX5_A606MaqDsc = new String[] {""} ;
      P08LX5_n606MaqDsc = new boolean[] {false} ;
      P08LX5_A602MaqCod = new String[] {""} ;
      P08LX5_A129BarCod = new int[1] ;
      P08LX5_A132BarCodReo = new byte[1] ;
      P08LX5_A130BarCodPar = new String[] {""} ;
      P08LX5_A143BarDisNum = new String[] {""} ;
      P08LX5_A4812BarEncCli = new String[] {""} ;
      P08LX5_A218BarTipCol = new byte[1] ;
      P08LX5_A461Fase = new String[] {""} ;
      P08LX5_A396EmprCod = new String[] {""} ;
      P08LX5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX5_A561HisProLin = new int[1] ;
      P08LX6_A217BarTipArt = new short[1] ;
      P08LX6_n217BarTipArt = new boolean[] {false} ;
      P08LX6_A279CliNom = new String[] {""} ;
      P08LX6_A3612HisProReo = new byte[1] ;
      P08LX6_A566HisProTur = new byte[1] ;
      P08LX6_A867ParCodNom = new String[] {""} ;
      P08LX6_n867ParCodNom = new boolean[] {false} ;
      P08LX6_A656ParCod = new short[1] ;
      P08LX6_n656ParCod = new boolean[] {false} ;
      P08LX6_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX6_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX6_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX6_n4441HisProDTF = new boolean[] {false} ;
      P08LX6_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX6_n4440HisProDTI = new boolean[] {false} ;
      P08LX6_A13711BarTipArtD = new String[] {""} ;
      P08LX6_n13711BarTipArtD = new boolean[] {false} ;
      P08LX6_A1652BarSerDsc = new String[] {""} ;
      P08LX6_A212BarSer = new String[] {""} ;
      P08LX6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX6_A252CliCod = new int[1] ;
      P08LX6_n252CliCod = new boolean[] {false} ;
      P08LX6_A3610HisProLot = new String[] {""} ;
      P08LX6_A13696BarNHdr = new String[] {""} ;
      P08LX6_A606MaqDsc = new String[] {""} ;
      P08LX6_n606MaqDsc = new boolean[] {false} ;
      P08LX6_A602MaqCod = new String[] {""} ;
      P08LX6_A129BarCod = new int[1] ;
      P08LX6_A132BarCodReo = new byte[1] ;
      P08LX6_A130BarCodPar = new String[] {""} ;
      P08LX6_A143BarDisNum = new String[] {""} ;
      P08LX6_A4812BarEncCli = new String[] {""} ;
      P08LX6_A218BarTipCol = new byte[1] ;
      P08LX6_A461Fase = new String[] {""} ;
      P08LX6_A396EmprCod = new String[] {""} ;
      P08LX6_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX6_A561HisProLin = new int[1] ;
      P08LX7_A217BarTipArt = new short[1] ;
      P08LX7_n217BarTipArt = new boolean[] {false} ;
      P08LX7_A3612HisProReo = new byte[1] ;
      P08LX7_A566HisProTur = new byte[1] ;
      P08LX7_A867ParCodNom = new String[] {""} ;
      P08LX7_n867ParCodNom = new boolean[] {false} ;
      P08LX7_A656ParCod = new short[1] ;
      P08LX7_n656ParCod = new boolean[] {false} ;
      P08LX7_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX7_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX7_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX7_n4441HisProDTF = new boolean[] {false} ;
      P08LX7_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX7_n4440HisProDTI = new boolean[] {false} ;
      P08LX7_A13711BarTipArtD = new String[] {""} ;
      P08LX7_n13711BarTipArtD = new boolean[] {false} ;
      P08LX7_A1652BarSerDsc = new String[] {""} ;
      P08LX7_A212BarSer = new String[] {""} ;
      P08LX7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX7_A279CliNom = new String[] {""} ;
      P08LX7_A252CliCod = new int[1] ;
      P08LX7_n252CliCod = new boolean[] {false} ;
      P08LX7_A3610HisProLot = new String[] {""} ;
      P08LX7_A13696BarNHdr = new String[] {""} ;
      P08LX7_A606MaqDsc = new String[] {""} ;
      P08LX7_n606MaqDsc = new boolean[] {false} ;
      P08LX7_A602MaqCod = new String[] {""} ;
      P08LX7_A129BarCod = new int[1] ;
      P08LX7_A132BarCodReo = new byte[1] ;
      P08LX7_A130BarCodPar = new String[] {""} ;
      P08LX7_A143BarDisNum = new String[] {""} ;
      P08LX7_A4812BarEncCli = new String[] {""} ;
      P08LX7_A218BarTipCol = new byte[1] ;
      P08LX7_A461Fase = new String[] {""} ;
      P08LX7_A396EmprCod = new String[] {""} ;
      P08LX7_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX7_A561HisProLin = new int[1] ;
      P08LX8_A217BarTipArt = new short[1] ;
      P08LX8_n217BarTipArt = new boolean[] {false} ;
      P08LX8_A212BarSer = new String[] {""} ;
      P08LX8_A3612HisProReo = new byte[1] ;
      P08LX8_A566HisProTur = new byte[1] ;
      P08LX8_A867ParCodNom = new String[] {""} ;
      P08LX8_n867ParCodNom = new boolean[] {false} ;
      P08LX8_A656ParCod = new short[1] ;
      P08LX8_n656ParCod = new boolean[] {false} ;
      P08LX8_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX8_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX8_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX8_n4441HisProDTF = new boolean[] {false} ;
      P08LX8_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX8_n4440HisProDTI = new boolean[] {false} ;
      P08LX8_A13711BarTipArtD = new String[] {""} ;
      P08LX8_n13711BarTipArtD = new boolean[] {false} ;
      P08LX8_A1652BarSerDsc = new String[] {""} ;
      P08LX8_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX8_A279CliNom = new String[] {""} ;
      P08LX8_A252CliCod = new int[1] ;
      P08LX8_n252CliCod = new boolean[] {false} ;
      P08LX8_A3610HisProLot = new String[] {""} ;
      P08LX8_A13696BarNHdr = new String[] {""} ;
      P08LX8_A606MaqDsc = new String[] {""} ;
      P08LX8_n606MaqDsc = new boolean[] {false} ;
      P08LX8_A602MaqCod = new String[] {""} ;
      P08LX8_A129BarCod = new int[1] ;
      P08LX8_A132BarCodReo = new byte[1] ;
      P08LX8_A130BarCodPar = new String[] {""} ;
      P08LX8_A143BarDisNum = new String[] {""} ;
      P08LX8_A4812BarEncCli = new String[] {""} ;
      P08LX8_A218BarTipCol = new byte[1] ;
      P08LX8_A461Fase = new String[] {""} ;
      P08LX8_A396EmprCod = new String[] {""} ;
      P08LX8_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX8_A561HisProLin = new int[1] ;
      P08LX9_A217BarTipArt = new short[1] ;
      P08LX9_n217BarTipArt = new boolean[] {false} ;
      P08LX9_A1652BarSerDsc = new String[] {""} ;
      P08LX9_A3612HisProReo = new byte[1] ;
      P08LX9_A566HisProTur = new byte[1] ;
      P08LX9_A867ParCodNom = new String[] {""} ;
      P08LX9_n867ParCodNom = new boolean[] {false} ;
      P08LX9_A656ParCod = new short[1] ;
      P08LX9_n656ParCod = new boolean[] {false} ;
      P08LX9_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX9_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX9_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX9_n4441HisProDTF = new boolean[] {false} ;
      P08LX9_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX9_n4440HisProDTI = new boolean[] {false} ;
      P08LX9_A13711BarTipArtD = new String[] {""} ;
      P08LX9_n13711BarTipArtD = new boolean[] {false} ;
      P08LX9_A212BarSer = new String[] {""} ;
      P08LX9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX9_A279CliNom = new String[] {""} ;
      P08LX9_A252CliCod = new int[1] ;
      P08LX9_n252CliCod = new boolean[] {false} ;
      P08LX9_A3610HisProLot = new String[] {""} ;
      P08LX9_A13696BarNHdr = new String[] {""} ;
      P08LX9_A606MaqDsc = new String[] {""} ;
      P08LX9_n606MaqDsc = new boolean[] {false} ;
      P08LX9_A602MaqCod = new String[] {""} ;
      P08LX9_A129BarCod = new int[1] ;
      P08LX9_A132BarCodReo = new byte[1] ;
      P08LX9_A130BarCodPar = new String[] {""} ;
      P08LX9_A143BarDisNum = new String[] {""} ;
      P08LX9_A4812BarEncCli = new String[] {""} ;
      P08LX9_A218BarTipCol = new byte[1] ;
      P08LX9_A461Fase = new String[] {""} ;
      P08LX9_A396EmprCod = new String[] {""} ;
      P08LX9_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX9_A561HisProLin = new int[1] ;
      P08LX10_A217BarTipArt = new short[1] ;
      P08LX10_n217BarTipArt = new boolean[] {false} ;
      P08LX10_A13711BarTipArtD = new String[] {""} ;
      P08LX10_n13711BarTipArtD = new boolean[] {false} ;
      P08LX10_A3612HisProReo = new byte[1] ;
      P08LX10_A566HisProTur = new byte[1] ;
      P08LX10_A867ParCodNom = new String[] {""} ;
      P08LX10_n867ParCodNom = new boolean[] {false} ;
      P08LX10_A656ParCod = new short[1] ;
      P08LX10_n656ParCod = new boolean[] {false} ;
      P08LX10_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX10_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX10_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX10_n4441HisProDTF = new boolean[] {false} ;
      P08LX10_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX10_n4440HisProDTI = new boolean[] {false} ;
      P08LX10_A1652BarSerDsc = new String[] {""} ;
      P08LX10_A212BarSer = new String[] {""} ;
      P08LX10_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX10_A279CliNom = new String[] {""} ;
      P08LX10_A252CliCod = new int[1] ;
      P08LX10_n252CliCod = new boolean[] {false} ;
      P08LX10_A3610HisProLot = new String[] {""} ;
      P08LX10_A13696BarNHdr = new String[] {""} ;
      P08LX10_A606MaqDsc = new String[] {""} ;
      P08LX10_n606MaqDsc = new boolean[] {false} ;
      P08LX10_A602MaqCod = new String[] {""} ;
      P08LX10_A129BarCod = new int[1] ;
      P08LX10_A132BarCodReo = new byte[1] ;
      P08LX10_A130BarCodPar = new String[] {""} ;
      P08LX10_A143BarDisNum = new String[] {""} ;
      P08LX10_A4812BarEncCli = new String[] {""} ;
      P08LX10_A218BarTipCol = new byte[1] ;
      P08LX10_A461Fase = new String[] {""} ;
      P08LX10_A396EmprCod = new String[] {""} ;
      P08LX10_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX10_A561HisProLin = new int[1] ;
      P08LX11_A217BarTipArt = new short[1] ;
      P08LX11_n217BarTipArt = new boolean[] {false} ;
      P08LX11_A3612HisProReo = new byte[1] ;
      P08LX11_A566HisProTur = new byte[1] ;
      P08LX11_A867ParCodNom = new String[] {""} ;
      P08LX11_n867ParCodNom = new boolean[] {false} ;
      P08LX11_A656ParCod = new short[1] ;
      P08LX11_n656ParCod = new boolean[] {false} ;
      P08LX11_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX11_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX11_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX11_n4441HisProDTF = new boolean[] {false} ;
      P08LX11_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX11_n4440HisProDTI = new boolean[] {false} ;
      P08LX11_A13711BarTipArtD = new String[] {""} ;
      P08LX11_n13711BarTipArtD = new boolean[] {false} ;
      P08LX11_A1652BarSerDsc = new String[] {""} ;
      P08LX11_A212BarSer = new String[] {""} ;
      P08LX11_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX11_A279CliNom = new String[] {""} ;
      P08LX11_A252CliCod = new int[1] ;
      P08LX11_n252CliCod = new boolean[] {false} ;
      P08LX11_A3610HisProLot = new String[] {""} ;
      P08LX11_A13696BarNHdr = new String[] {""} ;
      P08LX11_A606MaqDsc = new String[] {""} ;
      P08LX11_n606MaqDsc = new boolean[] {false} ;
      P08LX11_A602MaqCod = new String[] {""} ;
      P08LX11_A129BarCod = new int[1] ;
      P08LX11_A132BarCodReo = new byte[1] ;
      P08LX11_A130BarCodPar = new String[] {""} ;
      P08LX11_A143BarDisNum = new String[] {""} ;
      P08LX11_A4812BarEncCli = new String[] {""} ;
      P08LX11_A218BarTipCol = new byte[1] ;
      P08LX11_A461Fase = new String[] {""} ;
      P08LX11_A396EmprCod = new String[] {""} ;
      P08LX11_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX11_A561HisProLin = new int[1] ;
      P08LX12_A217BarTipArt = new short[1] ;
      P08LX12_n217BarTipArt = new boolean[] {false} ;
      P08LX12_A3612HisProReo = new byte[1] ;
      P08LX12_A566HisProTur = new byte[1] ;
      P08LX12_A867ParCodNom = new String[] {""} ;
      P08LX12_n867ParCodNom = new boolean[] {false} ;
      P08LX12_A656ParCod = new short[1] ;
      P08LX12_n656ParCod = new boolean[] {false} ;
      P08LX12_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX12_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX12_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX12_n4441HisProDTF = new boolean[] {false} ;
      P08LX12_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX12_n4440HisProDTI = new boolean[] {false} ;
      P08LX12_A13711BarTipArtD = new String[] {""} ;
      P08LX12_n13711BarTipArtD = new boolean[] {false} ;
      P08LX12_A1652BarSerDsc = new String[] {""} ;
      P08LX12_A212BarSer = new String[] {""} ;
      P08LX12_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX12_A279CliNom = new String[] {""} ;
      P08LX12_A252CliCod = new int[1] ;
      P08LX12_n252CliCod = new boolean[] {false} ;
      P08LX12_A3610HisProLot = new String[] {""} ;
      P08LX12_A13696BarNHdr = new String[] {""} ;
      P08LX12_A606MaqDsc = new String[] {""} ;
      P08LX12_n606MaqDsc = new boolean[] {false} ;
      P08LX12_A602MaqCod = new String[] {""} ;
      P08LX12_A129BarCod = new int[1] ;
      P08LX12_A132BarCodReo = new byte[1] ;
      P08LX12_A130BarCodPar = new String[] {""} ;
      P08LX12_A143BarDisNum = new String[] {""} ;
      P08LX12_A4812BarEncCli = new String[] {""} ;
      P08LX12_A218BarTipCol = new byte[1] ;
      P08LX12_A461Fase = new String[] {""} ;
      P08LX12_A396EmprCod = new String[] {""} ;
      P08LX12_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX12_A561HisProLin = new int[1] ;
      P08LX13_A217BarTipArt = new short[1] ;
      P08LX13_n217BarTipArt = new boolean[] {false} ;
      P08LX13_A3612HisProReo = new byte[1] ;
      P08LX13_A566HisProTur = new byte[1] ;
      P08LX13_A867ParCodNom = new String[] {""} ;
      P08LX13_n867ParCodNom = new boolean[] {false} ;
      P08LX13_A656ParCod = new short[1] ;
      P08LX13_n656ParCod = new boolean[] {false} ;
      P08LX13_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX13_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX13_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX13_n4441HisProDTF = new boolean[] {false} ;
      P08LX13_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX13_n4440HisProDTI = new boolean[] {false} ;
      P08LX13_A13711BarTipArtD = new String[] {""} ;
      P08LX13_n13711BarTipArtD = new boolean[] {false} ;
      P08LX13_A1652BarSerDsc = new String[] {""} ;
      P08LX13_A212BarSer = new String[] {""} ;
      P08LX13_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX13_A279CliNom = new String[] {""} ;
      P08LX13_A252CliCod = new int[1] ;
      P08LX13_n252CliCod = new boolean[] {false} ;
      P08LX13_A3610HisProLot = new String[] {""} ;
      P08LX13_A13696BarNHdr = new String[] {""} ;
      P08LX13_A606MaqDsc = new String[] {""} ;
      P08LX13_n606MaqDsc = new boolean[] {false} ;
      P08LX13_A602MaqCod = new String[] {""} ;
      P08LX13_A129BarCod = new int[1] ;
      P08LX13_A132BarCodReo = new byte[1] ;
      P08LX13_A130BarCodPar = new String[] {""} ;
      P08LX13_A143BarDisNum = new String[] {""} ;
      P08LX13_A4812BarEncCli = new String[] {""} ;
      P08LX13_A218BarTipCol = new byte[1] ;
      P08LX13_A461Fase = new String[] {""} ;
      P08LX13_A396EmprCod = new String[] {""} ;
      P08LX13_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX13_A561HisProLin = new int[1] ;
      P08LX14_A217BarTipArt = new short[1] ;
      P08LX14_n217BarTipArt = new boolean[] {false} ;
      P08LX14_A867ParCodNom = new String[] {""} ;
      P08LX14_n867ParCodNom = new boolean[] {false} ;
      P08LX14_A3612HisProReo = new byte[1] ;
      P08LX14_A566HisProTur = new byte[1] ;
      P08LX14_A656ParCod = new short[1] ;
      P08LX14_n656ParCod = new boolean[] {false} ;
      P08LX14_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX14_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LX14_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX14_n4441HisProDTF = new boolean[] {false} ;
      P08LX14_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX14_n4440HisProDTI = new boolean[] {false} ;
      P08LX14_A13711BarTipArtD = new String[] {""} ;
      P08LX14_n13711BarTipArtD = new boolean[] {false} ;
      P08LX14_A1652BarSerDsc = new String[] {""} ;
      P08LX14_A212BarSer = new String[] {""} ;
      P08LX14_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX14_A279CliNom = new String[] {""} ;
      P08LX14_A252CliCod = new int[1] ;
      P08LX14_n252CliCod = new boolean[] {false} ;
      P08LX14_A3610HisProLot = new String[] {""} ;
      P08LX14_A13696BarNHdr = new String[] {""} ;
      P08LX14_A606MaqDsc = new String[] {""} ;
      P08LX14_n606MaqDsc = new boolean[] {false} ;
      P08LX14_A602MaqCod = new String[] {""} ;
      P08LX14_A129BarCod = new int[1] ;
      P08LX14_A132BarCodReo = new byte[1] ;
      P08LX14_A130BarCodPar = new String[] {""} ;
      P08LX14_A143BarDisNum = new String[] {""} ;
      P08LX14_A4812BarEncCli = new String[] {""} ;
      P08LX14_A218BarTipCol = new byte[1] ;
      P08LX14_A461Fase = new String[] {""} ;
      P08LX14_A396EmprCod = new String[] {""} ;
      P08LX14_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LX14_A561HisProLin = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wciformedetalladohdrsproducciongetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08LX2_A217BarTipArt, P08LX2_n217BarTipArt, P08LX2_A602MaqCod, P08LX2_A3612HisProReo, P08LX2_A566HisProTur, P08LX2_A867ParCodNom, P08LX2_n867ParCodNom, P08LX2_A656ParCod, P08LX2_n656ParCod, P08LX2_A1526HisProMtr,
            P08LX2_A1525HisProKgr, P08LX2_A4441HisProDTF, P08LX2_n4441HisProDTF, P08LX2_A4440HisProDTI, P08LX2_n4440HisProDTI, P08LX2_A13711BarTipArtD, P08LX2_n13711BarTipArtD, P08LX2_A1652BarSerDsc, P08LX2_A212BarSer, P08LX2_A159BarFecGen,
            P08LX2_A279CliNom, P08LX2_A252CliCod, P08LX2_n252CliCod, P08LX2_A3610HisProLot, P08LX2_A13696BarNHdr, P08LX2_A606MaqDsc, P08LX2_n606MaqDsc, P08LX2_A129BarCod, P08LX2_A132BarCodReo, P08LX2_A130BarCodPar,
            P08LX2_A143BarDisNum, P08LX2_A4812BarEncCli, P08LX2_A218BarTipCol, P08LX2_A461Fase, P08LX2_A396EmprCod, P08LX2_A558HisProFec, P08LX2_A561HisProLin
            }
            , new Object[] {
            P08LX3_A217BarTipArt, P08LX3_n217BarTipArt, P08LX3_A606MaqDsc, P08LX3_n606MaqDsc, P08LX3_A3612HisProReo, P08LX3_A566HisProTur, P08LX3_A867ParCodNom, P08LX3_n867ParCodNom, P08LX3_A656ParCod, P08LX3_n656ParCod,
            P08LX3_A1526HisProMtr, P08LX3_A1525HisProKgr, P08LX3_A4441HisProDTF, P08LX3_n4441HisProDTF, P08LX3_A4440HisProDTI, P08LX3_n4440HisProDTI, P08LX3_A13711BarTipArtD, P08LX3_n13711BarTipArtD, P08LX3_A1652BarSerDsc, P08LX3_A212BarSer,
            P08LX3_A159BarFecGen, P08LX3_A279CliNom, P08LX3_A252CliCod, P08LX3_n252CliCod, P08LX3_A3610HisProLot, P08LX3_A13696BarNHdr, P08LX3_A602MaqCod, P08LX3_A129BarCod, P08LX3_A132BarCodReo, P08LX3_A130BarCodPar,
            P08LX3_A143BarDisNum, P08LX3_A4812BarEncCli, P08LX3_A218BarTipCol, P08LX3_A461Fase, P08LX3_A396EmprCod, P08LX3_A558HisProFec, P08LX3_A561HisProLin
            }
            , new Object[] {
            P08LX4_A217BarTipArt, P08LX4_n217BarTipArt, P08LX4_A3612HisProReo, P08LX4_A566HisProTur, P08LX4_A867ParCodNom, P08LX4_n867ParCodNom, P08LX4_A656ParCod, P08LX4_n656ParCod, P08LX4_A1526HisProMtr, P08LX4_A1525HisProKgr,
            P08LX4_A4441HisProDTF, P08LX4_n4441HisProDTF, P08LX4_A4440HisProDTI, P08LX4_n4440HisProDTI, P08LX4_A13711BarTipArtD, P08LX4_n13711BarTipArtD, P08LX4_A1652BarSerDsc, P08LX4_A212BarSer, P08LX4_A159BarFecGen, P08LX4_A279CliNom,
            P08LX4_A252CliCod, P08LX4_n252CliCod, P08LX4_A3610HisProLot, P08LX4_A13696BarNHdr, P08LX4_A606MaqDsc, P08LX4_n606MaqDsc, P08LX4_A602MaqCod, P08LX4_A129BarCod, P08LX4_A132BarCodReo, P08LX4_A130BarCodPar,
            P08LX4_A143BarDisNum, P08LX4_A4812BarEncCli, P08LX4_A218BarTipCol, P08LX4_A461Fase, P08LX4_A396EmprCod, P08LX4_A558HisProFec, P08LX4_A561HisProLin
            }
            , new Object[] {
            P08LX5_A217BarTipArt, P08LX5_n217BarTipArt, P08LX5_A3610HisProLot, P08LX5_A3612HisProReo, P08LX5_A566HisProTur, P08LX5_A867ParCodNom, P08LX5_n867ParCodNom, P08LX5_A656ParCod, P08LX5_n656ParCod, P08LX5_A1526HisProMtr,
            P08LX5_A1525HisProKgr, P08LX5_A4441HisProDTF, P08LX5_n4441HisProDTF, P08LX5_A4440HisProDTI, P08LX5_n4440HisProDTI, P08LX5_A13711BarTipArtD, P08LX5_n13711BarTipArtD, P08LX5_A1652BarSerDsc, P08LX5_A212BarSer, P08LX5_A159BarFecGen,
            P08LX5_A279CliNom, P08LX5_A252CliCod, P08LX5_n252CliCod, P08LX5_A13696BarNHdr, P08LX5_A606MaqDsc, P08LX5_n606MaqDsc, P08LX5_A602MaqCod, P08LX5_A129BarCod, P08LX5_A132BarCodReo, P08LX5_A130BarCodPar,
            P08LX5_A143BarDisNum, P08LX5_A4812BarEncCli, P08LX5_A218BarTipCol, P08LX5_A461Fase, P08LX5_A396EmprCod, P08LX5_A558HisProFec, P08LX5_A561HisProLin
            }
            , new Object[] {
            P08LX6_A217BarTipArt, P08LX6_n217BarTipArt, P08LX6_A279CliNom, P08LX6_A3612HisProReo, P08LX6_A566HisProTur, P08LX6_A867ParCodNom, P08LX6_n867ParCodNom, P08LX6_A656ParCod, P08LX6_n656ParCod, P08LX6_A1526HisProMtr,
            P08LX6_A1525HisProKgr, P08LX6_A4441HisProDTF, P08LX6_n4441HisProDTF, P08LX6_A4440HisProDTI, P08LX6_n4440HisProDTI, P08LX6_A13711BarTipArtD, P08LX6_n13711BarTipArtD, P08LX6_A1652BarSerDsc, P08LX6_A212BarSer, P08LX6_A159BarFecGen,
            P08LX6_A252CliCod, P08LX6_n252CliCod, P08LX6_A3610HisProLot, P08LX6_A13696BarNHdr, P08LX6_A606MaqDsc, P08LX6_n606MaqDsc, P08LX6_A602MaqCod, P08LX6_A129BarCod, P08LX6_A132BarCodReo, P08LX6_A130BarCodPar,
            P08LX6_A143BarDisNum, P08LX6_A4812BarEncCli, P08LX6_A218BarTipCol, P08LX6_A461Fase, P08LX6_A396EmprCod, P08LX6_A558HisProFec, P08LX6_A561HisProLin
            }
            , new Object[] {
            P08LX7_A217BarTipArt, P08LX7_n217BarTipArt, P08LX7_A3612HisProReo, P08LX7_A566HisProTur, P08LX7_A867ParCodNom, P08LX7_n867ParCodNom, P08LX7_A656ParCod, P08LX7_n656ParCod, P08LX7_A1526HisProMtr, P08LX7_A1525HisProKgr,
            P08LX7_A4441HisProDTF, P08LX7_n4441HisProDTF, P08LX7_A4440HisProDTI, P08LX7_n4440HisProDTI, P08LX7_A13711BarTipArtD, P08LX7_n13711BarTipArtD, P08LX7_A1652BarSerDsc, P08LX7_A212BarSer, P08LX7_A159BarFecGen, P08LX7_A279CliNom,
            P08LX7_A252CliCod, P08LX7_n252CliCod, P08LX7_A3610HisProLot, P08LX7_A13696BarNHdr, P08LX7_A606MaqDsc, P08LX7_n606MaqDsc, P08LX7_A602MaqCod, P08LX7_A129BarCod, P08LX7_A132BarCodReo, P08LX7_A130BarCodPar,
            P08LX7_A143BarDisNum, P08LX7_A4812BarEncCli, P08LX7_A218BarTipCol, P08LX7_A461Fase, P08LX7_A396EmprCod, P08LX7_A558HisProFec, P08LX7_A561HisProLin
            }
            , new Object[] {
            P08LX8_A217BarTipArt, P08LX8_n217BarTipArt, P08LX8_A212BarSer, P08LX8_A3612HisProReo, P08LX8_A566HisProTur, P08LX8_A867ParCodNom, P08LX8_n867ParCodNom, P08LX8_A656ParCod, P08LX8_n656ParCod, P08LX8_A1526HisProMtr,
            P08LX8_A1525HisProKgr, P08LX8_A4441HisProDTF, P08LX8_n4441HisProDTF, P08LX8_A4440HisProDTI, P08LX8_n4440HisProDTI, P08LX8_A13711BarTipArtD, P08LX8_n13711BarTipArtD, P08LX8_A1652BarSerDsc, P08LX8_A159BarFecGen, P08LX8_A279CliNom,
            P08LX8_A252CliCod, P08LX8_n252CliCod, P08LX8_A3610HisProLot, P08LX8_A13696BarNHdr, P08LX8_A606MaqDsc, P08LX8_n606MaqDsc, P08LX8_A602MaqCod, P08LX8_A129BarCod, P08LX8_A132BarCodReo, P08LX8_A130BarCodPar,
            P08LX8_A143BarDisNum, P08LX8_A4812BarEncCli, P08LX8_A218BarTipCol, P08LX8_A461Fase, P08LX8_A396EmprCod, P08LX8_A558HisProFec, P08LX8_A561HisProLin
            }
            , new Object[] {
            P08LX9_A217BarTipArt, P08LX9_n217BarTipArt, P08LX9_A1652BarSerDsc, P08LX9_A3612HisProReo, P08LX9_A566HisProTur, P08LX9_A867ParCodNom, P08LX9_n867ParCodNom, P08LX9_A656ParCod, P08LX9_n656ParCod, P08LX9_A1526HisProMtr,
            P08LX9_A1525HisProKgr, P08LX9_A4441HisProDTF, P08LX9_n4441HisProDTF, P08LX9_A4440HisProDTI, P08LX9_n4440HisProDTI, P08LX9_A13711BarTipArtD, P08LX9_n13711BarTipArtD, P08LX9_A212BarSer, P08LX9_A159BarFecGen, P08LX9_A279CliNom,
            P08LX9_A252CliCod, P08LX9_n252CliCod, P08LX9_A3610HisProLot, P08LX9_A13696BarNHdr, P08LX9_A606MaqDsc, P08LX9_n606MaqDsc, P08LX9_A602MaqCod, P08LX9_A129BarCod, P08LX9_A132BarCodReo, P08LX9_A130BarCodPar,
            P08LX9_A143BarDisNum, P08LX9_A4812BarEncCli, P08LX9_A218BarTipCol, P08LX9_A461Fase, P08LX9_A396EmprCod, P08LX9_A558HisProFec, P08LX9_A561HisProLin
            }
            , new Object[] {
            P08LX10_A217BarTipArt, P08LX10_n217BarTipArt, P08LX10_A13711BarTipArtD, P08LX10_n13711BarTipArtD, P08LX10_A3612HisProReo, P08LX10_A566HisProTur, P08LX10_A867ParCodNom, P08LX10_n867ParCodNom, P08LX10_A656ParCod, P08LX10_n656ParCod,
            P08LX10_A1526HisProMtr, P08LX10_A1525HisProKgr, P08LX10_A4441HisProDTF, P08LX10_n4441HisProDTF, P08LX10_A4440HisProDTI, P08LX10_n4440HisProDTI, P08LX10_A1652BarSerDsc, P08LX10_A212BarSer, P08LX10_A159BarFecGen, P08LX10_A279CliNom,
            P08LX10_A252CliCod, P08LX10_n252CliCod, P08LX10_A3610HisProLot, P08LX10_A13696BarNHdr, P08LX10_A606MaqDsc, P08LX10_n606MaqDsc, P08LX10_A602MaqCod, P08LX10_A129BarCod, P08LX10_A132BarCodReo, P08LX10_A130BarCodPar,
            P08LX10_A143BarDisNum, P08LX10_A4812BarEncCli, P08LX10_A218BarTipCol, P08LX10_A461Fase, P08LX10_A396EmprCod, P08LX10_A558HisProFec, P08LX10_A561HisProLin
            }
            , new Object[] {
            P08LX11_A217BarTipArt, P08LX11_n217BarTipArt, P08LX11_A3612HisProReo, P08LX11_A566HisProTur, P08LX11_A867ParCodNom, P08LX11_n867ParCodNom, P08LX11_A656ParCod, P08LX11_n656ParCod, P08LX11_A1526HisProMtr, P08LX11_A1525HisProKgr,
            P08LX11_A4441HisProDTF, P08LX11_n4441HisProDTF, P08LX11_A4440HisProDTI, P08LX11_n4440HisProDTI, P08LX11_A13711BarTipArtD, P08LX11_n13711BarTipArtD, P08LX11_A1652BarSerDsc, P08LX11_A212BarSer, P08LX11_A159BarFecGen, P08LX11_A279CliNom,
            P08LX11_A252CliCod, P08LX11_n252CliCod, P08LX11_A3610HisProLot, P08LX11_A13696BarNHdr, P08LX11_A606MaqDsc, P08LX11_n606MaqDsc, P08LX11_A602MaqCod, P08LX11_A129BarCod, P08LX11_A132BarCodReo, P08LX11_A130BarCodPar,
            P08LX11_A143BarDisNum, P08LX11_A4812BarEncCli, P08LX11_A218BarTipCol, P08LX11_A461Fase, P08LX11_A396EmprCod, P08LX11_A558HisProFec, P08LX11_A561HisProLin
            }
            , new Object[] {
            P08LX12_A217BarTipArt, P08LX12_n217BarTipArt, P08LX12_A3612HisProReo, P08LX12_A566HisProTur, P08LX12_A867ParCodNom, P08LX12_n867ParCodNom, P08LX12_A656ParCod, P08LX12_n656ParCod, P08LX12_A1526HisProMtr, P08LX12_A1525HisProKgr,
            P08LX12_A4441HisProDTF, P08LX12_n4441HisProDTF, P08LX12_A4440HisProDTI, P08LX12_n4440HisProDTI, P08LX12_A13711BarTipArtD, P08LX12_n13711BarTipArtD, P08LX12_A1652BarSerDsc, P08LX12_A212BarSer, P08LX12_A159BarFecGen, P08LX12_A279CliNom,
            P08LX12_A252CliCod, P08LX12_n252CliCod, P08LX12_A3610HisProLot, P08LX12_A13696BarNHdr, P08LX12_A606MaqDsc, P08LX12_n606MaqDsc, P08LX12_A602MaqCod, P08LX12_A129BarCod, P08LX12_A132BarCodReo, P08LX12_A130BarCodPar,
            P08LX12_A143BarDisNum, P08LX12_A4812BarEncCli, P08LX12_A218BarTipCol, P08LX12_A461Fase, P08LX12_A396EmprCod, P08LX12_A558HisProFec, P08LX12_A561HisProLin
            }
            , new Object[] {
            P08LX13_A217BarTipArt, P08LX13_n217BarTipArt, P08LX13_A3612HisProReo, P08LX13_A566HisProTur, P08LX13_A867ParCodNom, P08LX13_n867ParCodNom, P08LX13_A656ParCod, P08LX13_n656ParCod, P08LX13_A1526HisProMtr, P08LX13_A1525HisProKgr,
            P08LX13_A4441HisProDTF, P08LX13_n4441HisProDTF, P08LX13_A4440HisProDTI, P08LX13_n4440HisProDTI, P08LX13_A13711BarTipArtD, P08LX13_n13711BarTipArtD, P08LX13_A1652BarSerDsc, P08LX13_A212BarSer, P08LX13_A159BarFecGen, P08LX13_A279CliNom,
            P08LX13_A252CliCod, P08LX13_n252CliCod, P08LX13_A3610HisProLot, P08LX13_A13696BarNHdr, P08LX13_A606MaqDsc, P08LX13_n606MaqDsc, P08LX13_A602MaqCod, P08LX13_A129BarCod, P08LX13_A132BarCodReo, P08LX13_A130BarCodPar,
            P08LX13_A143BarDisNum, P08LX13_A4812BarEncCli, P08LX13_A218BarTipCol, P08LX13_A461Fase, P08LX13_A396EmprCod, P08LX13_A558HisProFec, P08LX13_A561HisProLin
            }
            , new Object[] {
            P08LX14_A217BarTipArt, P08LX14_n217BarTipArt, P08LX14_A867ParCodNom, P08LX14_n867ParCodNom, P08LX14_A3612HisProReo, P08LX14_A566HisProTur, P08LX14_A656ParCod, P08LX14_n656ParCod, P08LX14_A1526HisProMtr, P08LX14_A1525HisProKgr,
            P08LX14_A4441HisProDTF, P08LX14_n4441HisProDTF, P08LX14_A4440HisProDTI, P08LX14_n4440HisProDTI, P08LX14_A13711BarTipArtD, P08LX14_n13711BarTipArtD, P08LX14_A1652BarSerDsc, P08LX14_A212BarSer, P08LX14_A159BarFecGen, P08LX14_A279CliNom,
            P08LX14_A252CliCod, P08LX14_n252CliCod, P08LX14_A3610HisProLot, P08LX14_A13696BarNHdr, P08LX14_A606MaqDsc, P08LX14_n606MaqDsc, P08LX14_A602MaqCod, P08LX14_A129BarCod, P08LX14_A132BarCodReo, P08LX14_A130BarCodPar,
            P08LX14_A143BarDisNum, P08LX14_A4812BarEncCli, P08LX14_A218BarTipCol, P08LX14_A461Fase, P08LX14_A396EmprCod, P08LX14_A558HisProFec, P08LX14_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV63TFHisProTur ;
   private byte AV64TFHisProTur_To ;
   private byte AV70TFHisProReo ;
   private byte AV71TFHisProReo_To ;
   private byte AV68HisProReo ;
   private byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ;
   private byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ;
   private byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ;
   private byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte A3612HisProReo ;
   private byte A218BarTipCol ;
   private byte GXv_int7[] ;
   private short AV59TFParCod ;
   private short AV60TFParCod_To ;
   private short AV69ParCod ;
   private short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ;
   private short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ;
   private short A656ParCod ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV91GXV1 ;
   private int AV45TFCliCod ;
   private int AV46TFCliCod_To ;
   private int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ;
   private int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV55TFHisProKgr ;
   private java.math.BigDecimal AV56TFHisProKgr_To ;
   private java.math.BigDecimal AV57TFHisProMtr ;
   private java.math.BigDecimal AV58TFHisProMtr_To ;
   private java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ;
   private java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ;
   private java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ;
   private java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV43TFMaqDsc ;
   private String AV44TFMaqDsc_Sel ;
   private String AV12TFBarNHdr ;
   private String AV13TFBarNHdr_Sel ;
   private String AV65TFHisProLot ;
   private String AV66TFHisProLot_Sel ;
   private String AV47TFCliNom ;
   private String AV48TFCliNom_Sel ;
   private String AV82TFPedidoCliente ;
   private String AV83TFPedidoCliente_Sel ;
   private String AV51TFBarSer ;
   private String AV52TFBarSer_Sel ;
   private String AV53TFBarSerDsc ;
   private String AV54TFBarSerDsc_Sel ;
   private String AV78TFBarTipArtDsc ;
   private String AV79TFBarTipArtDsc_Sel ;
   private String AV80TFBarTipColDsc ;
   private String AV81TFBarTipColDsc_Sel ;
   private String AV14TFFase ;
   private String AV15TFFase_Sel ;
   private String AV86TFFaseDescripcion ;
   private String AV87TFFaseDescripcion_Sel ;
   private String AV61TFParCodNom ;
   private String AV62TFParCodNom_Sel ;
   private String AV38Emprcod ;
   private String AV39MaqCodInicial ;
   private String AV40MaqCodFinal ;
   private String A602MaqCod ;
   private String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ;
   private String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ;
   private String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ;
   private String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ;
   private String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ;
   private String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ;
   private String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ;
   private String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ;
   private String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ;
   private String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ;
   private String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ;
   private String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ;
   private String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ;
   private String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ;
   private String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ;
   private String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ;
   private String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ;
   private String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ;
   private String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ;
   private String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ;
   private String AV117Wciformedetalladohdrsproduccionds_25_tffase ;
   private String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ;
   private String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ;
   private String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ;
   private String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ;
   private String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ;
   private String lV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ;
   private String lV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ;
   private String lV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ;
   private String lV104Wciformedetalladohdrsproduccionds_12_tfclinom ;
   private String lV109Wciformedetalladohdrsproduccionds_17_tfbarser ;
   private String lV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ;
   private String lV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ;
   private String lV117Wciformedetalladohdrsproduccionds_25_tffase ;
   private String lV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ;
   private String A606MaqDsc ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A461Fase ;
   private String A867ParCodNom ;
   private String A13696BarNHdr ;
   private String A13878PedidoClie ;
   private String A13868BarTipColD ;
   private String A13893FaseDescri ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private java.util.Date AV16TFHisProDTI ;
   private java.util.Date AV18TFHisProDTF ;
   private java.util.Date AV41Hisprodti ;
   private java.util.Date AV42Hisprodtf ;
   private java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ;
   private java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV49TFBarFecGen ;
   private java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk8LX2 ;
   private boolean n217BarTipArt ;
   private boolean n867ParCodNom ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n13711BarTipArtD ;
   private boolean n252CliCod ;
   private boolean n606MaqDsc ;
   private boolean brk8LX4 ;
   private boolean brk8LX7 ;
   private boolean brk8LX9 ;
   private boolean brk8LX12 ;
   private boolean brk8LX14 ;
   private boolean brk8LX16 ;
   private boolean brk8LX19 ;
   private boolean brk8LX22 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV67FilterFullText ;
   private String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ;
   private String lV93Wciformedetalladohdrsproduccionds_1_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P08LX2_A217BarTipArt ;
   private boolean[] P08LX2_n217BarTipArt ;
   private String[] P08LX2_A602MaqCod ;
   private byte[] P08LX2_A3612HisProReo ;
   private byte[] P08LX2_A566HisProTur ;
   private String[] P08LX2_A867ParCodNom ;
   private boolean[] P08LX2_n867ParCodNom ;
   private short[] P08LX2_A656ParCod ;
   private boolean[] P08LX2_n656ParCod ;
   private java.math.BigDecimal[] P08LX2_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX2_A1525HisProKgr ;
   private java.util.Date[] P08LX2_A4441HisProDTF ;
   private boolean[] P08LX2_n4441HisProDTF ;
   private java.util.Date[] P08LX2_A4440HisProDTI ;
   private boolean[] P08LX2_n4440HisProDTI ;
   private String[] P08LX2_A13711BarTipArtD ;
   private boolean[] P08LX2_n13711BarTipArtD ;
   private String[] P08LX2_A1652BarSerDsc ;
   private String[] P08LX2_A212BarSer ;
   private java.util.Date[] P08LX2_A159BarFecGen ;
   private String[] P08LX2_A279CliNom ;
   private int[] P08LX2_A252CliCod ;
   private boolean[] P08LX2_n252CliCod ;
   private String[] P08LX2_A3610HisProLot ;
   private String[] P08LX2_A13696BarNHdr ;
   private String[] P08LX2_A606MaqDsc ;
   private boolean[] P08LX2_n606MaqDsc ;
   private int[] P08LX2_A129BarCod ;
   private byte[] P08LX2_A132BarCodReo ;
   private String[] P08LX2_A130BarCodPar ;
   private String[] P08LX2_A143BarDisNum ;
   private String[] P08LX2_A4812BarEncCli ;
   private byte[] P08LX2_A218BarTipCol ;
   private String[] P08LX2_A461Fase ;
   private String[] P08LX2_A396EmprCod ;
   private java.util.Date[] P08LX2_A558HisProFec ;
   private int[] P08LX2_A561HisProLin ;
   private short[] P08LX3_A217BarTipArt ;
   private boolean[] P08LX3_n217BarTipArt ;
   private String[] P08LX3_A606MaqDsc ;
   private boolean[] P08LX3_n606MaqDsc ;
   private byte[] P08LX3_A3612HisProReo ;
   private byte[] P08LX3_A566HisProTur ;
   private String[] P08LX3_A867ParCodNom ;
   private boolean[] P08LX3_n867ParCodNom ;
   private short[] P08LX3_A656ParCod ;
   private boolean[] P08LX3_n656ParCod ;
   private java.math.BigDecimal[] P08LX3_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX3_A1525HisProKgr ;
   private java.util.Date[] P08LX3_A4441HisProDTF ;
   private boolean[] P08LX3_n4441HisProDTF ;
   private java.util.Date[] P08LX3_A4440HisProDTI ;
   private boolean[] P08LX3_n4440HisProDTI ;
   private String[] P08LX3_A13711BarTipArtD ;
   private boolean[] P08LX3_n13711BarTipArtD ;
   private String[] P08LX3_A1652BarSerDsc ;
   private String[] P08LX3_A212BarSer ;
   private java.util.Date[] P08LX3_A159BarFecGen ;
   private String[] P08LX3_A279CliNom ;
   private int[] P08LX3_A252CliCod ;
   private boolean[] P08LX3_n252CliCod ;
   private String[] P08LX3_A3610HisProLot ;
   private String[] P08LX3_A13696BarNHdr ;
   private String[] P08LX3_A602MaqCod ;
   private int[] P08LX3_A129BarCod ;
   private byte[] P08LX3_A132BarCodReo ;
   private String[] P08LX3_A130BarCodPar ;
   private String[] P08LX3_A143BarDisNum ;
   private String[] P08LX3_A4812BarEncCli ;
   private byte[] P08LX3_A218BarTipCol ;
   private String[] P08LX3_A461Fase ;
   private String[] P08LX3_A396EmprCod ;
   private java.util.Date[] P08LX3_A558HisProFec ;
   private int[] P08LX3_A561HisProLin ;
   private short[] P08LX4_A217BarTipArt ;
   private boolean[] P08LX4_n217BarTipArt ;
   private byte[] P08LX4_A3612HisProReo ;
   private byte[] P08LX4_A566HisProTur ;
   private String[] P08LX4_A867ParCodNom ;
   private boolean[] P08LX4_n867ParCodNom ;
   private short[] P08LX4_A656ParCod ;
   private boolean[] P08LX4_n656ParCod ;
   private java.math.BigDecimal[] P08LX4_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX4_A1525HisProKgr ;
   private java.util.Date[] P08LX4_A4441HisProDTF ;
   private boolean[] P08LX4_n4441HisProDTF ;
   private java.util.Date[] P08LX4_A4440HisProDTI ;
   private boolean[] P08LX4_n4440HisProDTI ;
   private String[] P08LX4_A13711BarTipArtD ;
   private boolean[] P08LX4_n13711BarTipArtD ;
   private String[] P08LX4_A1652BarSerDsc ;
   private String[] P08LX4_A212BarSer ;
   private java.util.Date[] P08LX4_A159BarFecGen ;
   private String[] P08LX4_A279CliNom ;
   private int[] P08LX4_A252CliCod ;
   private boolean[] P08LX4_n252CliCod ;
   private String[] P08LX4_A3610HisProLot ;
   private String[] P08LX4_A13696BarNHdr ;
   private String[] P08LX4_A606MaqDsc ;
   private boolean[] P08LX4_n606MaqDsc ;
   private String[] P08LX4_A602MaqCod ;
   private int[] P08LX4_A129BarCod ;
   private byte[] P08LX4_A132BarCodReo ;
   private String[] P08LX4_A130BarCodPar ;
   private String[] P08LX4_A143BarDisNum ;
   private String[] P08LX4_A4812BarEncCli ;
   private byte[] P08LX4_A218BarTipCol ;
   private String[] P08LX4_A461Fase ;
   private String[] P08LX4_A396EmprCod ;
   private java.util.Date[] P08LX4_A558HisProFec ;
   private int[] P08LX4_A561HisProLin ;
   private short[] P08LX5_A217BarTipArt ;
   private boolean[] P08LX5_n217BarTipArt ;
   private String[] P08LX5_A3610HisProLot ;
   private byte[] P08LX5_A3612HisProReo ;
   private byte[] P08LX5_A566HisProTur ;
   private String[] P08LX5_A867ParCodNom ;
   private boolean[] P08LX5_n867ParCodNom ;
   private short[] P08LX5_A656ParCod ;
   private boolean[] P08LX5_n656ParCod ;
   private java.math.BigDecimal[] P08LX5_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX5_A1525HisProKgr ;
   private java.util.Date[] P08LX5_A4441HisProDTF ;
   private boolean[] P08LX5_n4441HisProDTF ;
   private java.util.Date[] P08LX5_A4440HisProDTI ;
   private boolean[] P08LX5_n4440HisProDTI ;
   private String[] P08LX5_A13711BarTipArtD ;
   private boolean[] P08LX5_n13711BarTipArtD ;
   private String[] P08LX5_A1652BarSerDsc ;
   private String[] P08LX5_A212BarSer ;
   private java.util.Date[] P08LX5_A159BarFecGen ;
   private String[] P08LX5_A279CliNom ;
   private int[] P08LX5_A252CliCod ;
   private boolean[] P08LX5_n252CliCod ;
   private String[] P08LX5_A13696BarNHdr ;
   private String[] P08LX5_A606MaqDsc ;
   private boolean[] P08LX5_n606MaqDsc ;
   private String[] P08LX5_A602MaqCod ;
   private int[] P08LX5_A129BarCod ;
   private byte[] P08LX5_A132BarCodReo ;
   private String[] P08LX5_A130BarCodPar ;
   private String[] P08LX5_A143BarDisNum ;
   private String[] P08LX5_A4812BarEncCli ;
   private byte[] P08LX5_A218BarTipCol ;
   private String[] P08LX5_A461Fase ;
   private String[] P08LX5_A396EmprCod ;
   private java.util.Date[] P08LX5_A558HisProFec ;
   private int[] P08LX5_A561HisProLin ;
   private short[] P08LX6_A217BarTipArt ;
   private boolean[] P08LX6_n217BarTipArt ;
   private String[] P08LX6_A279CliNom ;
   private byte[] P08LX6_A3612HisProReo ;
   private byte[] P08LX6_A566HisProTur ;
   private String[] P08LX6_A867ParCodNom ;
   private boolean[] P08LX6_n867ParCodNom ;
   private short[] P08LX6_A656ParCod ;
   private boolean[] P08LX6_n656ParCod ;
   private java.math.BigDecimal[] P08LX6_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX6_A1525HisProKgr ;
   private java.util.Date[] P08LX6_A4441HisProDTF ;
   private boolean[] P08LX6_n4441HisProDTF ;
   private java.util.Date[] P08LX6_A4440HisProDTI ;
   private boolean[] P08LX6_n4440HisProDTI ;
   private String[] P08LX6_A13711BarTipArtD ;
   private boolean[] P08LX6_n13711BarTipArtD ;
   private String[] P08LX6_A1652BarSerDsc ;
   private String[] P08LX6_A212BarSer ;
   private java.util.Date[] P08LX6_A159BarFecGen ;
   private int[] P08LX6_A252CliCod ;
   private boolean[] P08LX6_n252CliCod ;
   private String[] P08LX6_A3610HisProLot ;
   private String[] P08LX6_A13696BarNHdr ;
   private String[] P08LX6_A606MaqDsc ;
   private boolean[] P08LX6_n606MaqDsc ;
   private String[] P08LX6_A602MaqCod ;
   private int[] P08LX6_A129BarCod ;
   private byte[] P08LX6_A132BarCodReo ;
   private String[] P08LX6_A130BarCodPar ;
   private String[] P08LX6_A143BarDisNum ;
   private String[] P08LX6_A4812BarEncCli ;
   private byte[] P08LX6_A218BarTipCol ;
   private String[] P08LX6_A461Fase ;
   private String[] P08LX6_A396EmprCod ;
   private java.util.Date[] P08LX6_A558HisProFec ;
   private int[] P08LX6_A561HisProLin ;
   private short[] P08LX7_A217BarTipArt ;
   private boolean[] P08LX7_n217BarTipArt ;
   private byte[] P08LX7_A3612HisProReo ;
   private byte[] P08LX7_A566HisProTur ;
   private String[] P08LX7_A867ParCodNom ;
   private boolean[] P08LX7_n867ParCodNom ;
   private short[] P08LX7_A656ParCod ;
   private boolean[] P08LX7_n656ParCod ;
   private java.math.BigDecimal[] P08LX7_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX7_A1525HisProKgr ;
   private java.util.Date[] P08LX7_A4441HisProDTF ;
   private boolean[] P08LX7_n4441HisProDTF ;
   private java.util.Date[] P08LX7_A4440HisProDTI ;
   private boolean[] P08LX7_n4440HisProDTI ;
   private String[] P08LX7_A13711BarTipArtD ;
   private boolean[] P08LX7_n13711BarTipArtD ;
   private String[] P08LX7_A1652BarSerDsc ;
   private String[] P08LX7_A212BarSer ;
   private java.util.Date[] P08LX7_A159BarFecGen ;
   private String[] P08LX7_A279CliNom ;
   private int[] P08LX7_A252CliCod ;
   private boolean[] P08LX7_n252CliCod ;
   private String[] P08LX7_A3610HisProLot ;
   private String[] P08LX7_A13696BarNHdr ;
   private String[] P08LX7_A606MaqDsc ;
   private boolean[] P08LX7_n606MaqDsc ;
   private String[] P08LX7_A602MaqCod ;
   private int[] P08LX7_A129BarCod ;
   private byte[] P08LX7_A132BarCodReo ;
   private String[] P08LX7_A130BarCodPar ;
   private String[] P08LX7_A143BarDisNum ;
   private String[] P08LX7_A4812BarEncCli ;
   private byte[] P08LX7_A218BarTipCol ;
   private String[] P08LX7_A461Fase ;
   private String[] P08LX7_A396EmprCod ;
   private java.util.Date[] P08LX7_A558HisProFec ;
   private int[] P08LX7_A561HisProLin ;
   private short[] P08LX8_A217BarTipArt ;
   private boolean[] P08LX8_n217BarTipArt ;
   private String[] P08LX8_A212BarSer ;
   private byte[] P08LX8_A3612HisProReo ;
   private byte[] P08LX8_A566HisProTur ;
   private String[] P08LX8_A867ParCodNom ;
   private boolean[] P08LX8_n867ParCodNom ;
   private short[] P08LX8_A656ParCod ;
   private boolean[] P08LX8_n656ParCod ;
   private java.math.BigDecimal[] P08LX8_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX8_A1525HisProKgr ;
   private java.util.Date[] P08LX8_A4441HisProDTF ;
   private boolean[] P08LX8_n4441HisProDTF ;
   private java.util.Date[] P08LX8_A4440HisProDTI ;
   private boolean[] P08LX8_n4440HisProDTI ;
   private String[] P08LX8_A13711BarTipArtD ;
   private boolean[] P08LX8_n13711BarTipArtD ;
   private String[] P08LX8_A1652BarSerDsc ;
   private java.util.Date[] P08LX8_A159BarFecGen ;
   private String[] P08LX8_A279CliNom ;
   private int[] P08LX8_A252CliCod ;
   private boolean[] P08LX8_n252CliCod ;
   private String[] P08LX8_A3610HisProLot ;
   private String[] P08LX8_A13696BarNHdr ;
   private String[] P08LX8_A606MaqDsc ;
   private boolean[] P08LX8_n606MaqDsc ;
   private String[] P08LX8_A602MaqCod ;
   private int[] P08LX8_A129BarCod ;
   private byte[] P08LX8_A132BarCodReo ;
   private String[] P08LX8_A130BarCodPar ;
   private String[] P08LX8_A143BarDisNum ;
   private String[] P08LX8_A4812BarEncCli ;
   private byte[] P08LX8_A218BarTipCol ;
   private String[] P08LX8_A461Fase ;
   private String[] P08LX8_A396EmprCod ;
   private java.util.Date[] P08LX8_A558HisProFec ;
   private int[] P08LX8_A561HisProLin ;
   private short[] P08LX9_A217BarTipArt ;
   private boolean[] P08LX9_n217BarTipArt ;
   private String[] P08LX9_A1652BarSerDsc ;
   private byte[] P08LX9_A3612HisProReo ;
   private byte[] P08LX9_A566HisProTur ;
   private String[] P08LX9_A867ParCodNom ;
   private boolean[] P08LX9_n867ParCodNom ;
   private short[] P08LX9_A656ParCod ;
   private boolean[] P08LX9_n656ParCod ;
   private java.math.BigDecimal[] P08LX9_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX9_A1525HisProKgr ;
   private java.util.Date[] P08LX9_A4441HisProDTF ;
   private boolean[] P08LX9_n4441HisProDTF ;
   private java.util.Date[] P08LX9_A4440HisProDTI ;
   private boolean[] P08LX9_n4440HisProDTI ;
   private String[] P08LX9_A13711BarTipArtD ;
   private boolean[] P08LX9_n13711BarTipArtD ;
   private String[] P08LX9_A212BarSer ;
   private java.util.Date[] P08LX9_A159BarFecGen ;
   private String[] P08LX9_A279CliNom ;
   private int[] P08LX9_A252CliCod ;
   private boolean[] P08LX9_n252CliCod ;
   private String[] P08LX9_A3610HisProLot ;
   private String[] P08LX9_A13696BarNHdr ;
   private String[] P08LX9_A606MaqDsc ;
   private boolean[] P08LX9_n606MaqDsc ;
   private String[] P08LX9_A602MaqCod ;
   private int[] P08LX9_A129BarCod ;
   private byte[] P08LX9_A132BarCodReo ;
   private String[] P08LX9_A130BarCodPar ;
   private String[] P08LX9_A143BarDisNum ;
   private String[] P08LX9_A4812BarEncCli ;
   private byte[] P08LX9_A218BarTipCol ;
   private String[] P08LX9_A461Fase ;
   private String[] P08LX9_A396EmprCod ;
   private java.util.Date[] P08LX9_A558HisProFec ;
   private int[] P08LX9_A561HisProLin ;
   private short[] P08LX10_A217BarTipArt ;
   private boolean[] P08LX10_n217BarTipArt ;
   private String[] P08LX10_A13711BarTipArtD ;
   private boolean[] P08LX10_n13711BarTipArtD ;
   private byte[] P08LX10_A3612HisProReo ;
   private byte[] P08LX10_A566HisProTur ;
   private String[] P08LX10_A867ParCodNom ;
   private boolean[] P08LX10_n867ParCodNom ;
   private short[] P08LX10_A656ParCod ;
   private boolean[] P08LX10_n656ParCod ;
   private java.math.BigDecimal[] P08LX10_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX10_A1525HisProKgr ;
   private java.util.Date[] P08LX10_A4441HisProDTF ;
   private boolean[] P08LX10_n4441HisProDTF ;
   private java.util.Date[] P08LX10_A4440HisProDTI ;
   private boolean[] P08LX10_n4440HisProDTI ;
   private String[] P08LX10_A1652BarSerDsc ;
   private String[] P08LX10_A212BarSer ;
   private java.util.Date[] P08LX10_A159BarFecGen ;
   private String[] P08LX10_A279CliNom ;
   private int[] P08LX10_A252CliCod ;
   private boolean[] P08LX10_n252CliCod ;
   private String[] P08LX10_A3610HisProLot ;
   private String[] P08LX10_A13696BarNHdr ;
   private String[] P08LX10_A606MaqDsc ;
   private boolean[] P08LX10_n606MaqDsc ;
   private String[] P08LX10_A602MaqCod ;
   private int[] P08LX10_A129BarCod ;
   private byte[] P08LX10_A132BarCodReo ;
   private String[] P08LX10_A130BarCodPar ;
   private String[] P08LX10_A143BarDisNum ;
   private String[] P08LX10_A4812BarEncCli ;
   private byte[] P08LX10_A218BarTipCol ;
   private String[] P08LX10_A461Fase ;
   private String[] P08LX10_A396EmprCod ;
   private java.util.Date[] P08LX10_A558HisProFec ;
   private int[] P08LX10_A561HisProLin ;
   private short[] P08LX11_A217BarTipArt ;
   private boolean[] P08LX11_n217BarTipArt ;
   private byte[] P08LX11_A3612HisProReo ;
   private byte[] P08LX11_A566HisProTur ;
   private String[] P08LX11_A867ParCodNom ;
   private boolean[] P08LX11_n867ParCodNom ;
   private short[] P08LX11_A656ParCod ;
   private boolean[] P08LX11_n656ParCod ;
   private java.math.BigDecimal[] P08LX11_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX11_A1525HisProKgr ;
   private java.util.Date[] P08LX11_A4441HisProDTF ;
   private boolean[] P08LX11_n4441HisProDTF ;
   private java.util.Date[] P08LX11_A4440HisProDTI ;
   private boolean[] P08LX11_n4440HisProDTI ;
   private String[] P08LX11_A13711BarTipArtD ;
   private boolean[] P08LX11_n13711BarTipArtD ;
   private String[] P08LX11_A1652BarSerDsc ;
   private String[] P08LX11_A212BarSer ;
   private java.util.Date[] P08LX11_A159BarFecGen ;
   private String[] P08LX11_A279CliNom ;
   private int[] P08LX11_A252CliCod ;
   private boolean[] P08LX11_n252CliCod ;
   private String[] P08LX11_A3610HisProLot ;
   private String[] P08LX11_A13696BarNHdr ;
   private String[] P08LX11_A606MaqDsc ;
   private boolean[] P08LX11_n606MaqDsc ;
   private String[] P08LX11_A602MaqCod ;
   private int[] P08LX11_A129BarCod ;
   private byte[] P08LX11_A132BarCodReo ;
   private String[] P08LX11_A130BarCodPar ;
   private String[] P08LX11_A143BarDisNum ;
   private String[] P08LX11_A4812BarEncCli ;
   private byte[] P08LX11_A218BarTipCol ;
   private String[] P08LX11_A461Fase ;
   private String[] P08LX11_A396EmprCod ;
   private java.util.Date[] P08LX11_A558HisProFec ;
   private int[] P08LX11_A561HisProLin ;
   private short[] P08LX12_A217BarTipArt ;
   private boolean[] P08LX12_n217BarTipArt ;
   private byte[] P08LX12_A3612HisProReo ;
   private byte[] P08LX12_A566HisProTur ;
   private String[] P08LX12_A867ParCodNom ;
   private boolean[] P08LX12_n867ParCodNom ;
   private short[] P08LX12_A656ParCod ;
   private boolean[] P08LX12_n656ParCod ;
   private java.math.BigDecimal[] P08LX12_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX12_A1525HisProKgr ;
   private java.util.Date[] P08LX12_A4441HisProDTF ;
   private boolean[] P08LX12_n4441HisProDTF ;
   private java.util.Date[] P08LX12_A4440HisProDTI ;
   private boolean[] P08LX12_n4440HisProDTI ;
   private String[] P08LX12_A13711BarTipArtD ;
   private boolean[] P08LX12_n13711BarTipArtD ;
   private String[] P08LX12_A1652BarSerDsc ;
   private String[] P08LX12_A212BarSer ;
   private java.util.Date[] P08LX12_A159BarFecGen ;
   private String[] P08LX12_A279CliNom ;
   private int[] P08LX12_A252CliCod ;
   private boolean[] P08LX12_n252CliCod ;
   private String[] P08LX12_A3610HisProLot ;
   private String[] P08LX12_A13696BarNHdr ;
   private String[] P08LX12_A606MaqDsc ;
   private boolean[] P08LX12_n606MaqDsc ;
   private String[] P08LX12_A602MaqCod ;
   private int[] P08LX12_A129BarCod ;
   private byte[] P08LX12_A132BarCodReo ;
   private String[] P08LX12_A130BarCodPar ;
   private String[] P08LX12_A143BarDisNum ;
   private String[] P08LX12_A4812BarEncCli ;
   private byte[] P08LX12_A218BarTipCol ;
   private String[] P08LX12_A461Fase ;
   private String[] P08LX12_A396EmprCod ;
   private java.util.Date[] P08LX12_A558HisProFec ;
   private int[] P08LX12_A561HisProLin ;
   private short[] P08LX13_A217BarTipArt ;
   private boolean[] P08LX13_n217BarTipArt ;
   private byte[] P08LX13_A3612HisProReo ;
   private byte[] P08LX13_A566HisProTur ;
   private String[] P08LX13_A867ParCodNom ;
   private boolean[] P08LX13_n867ParCodNom ;
   private short[] P08LX13_A656ParCod ;
   private boolean[] P08LX13_n656ParCod ;
   private java.math.BigDecimal[] P08LX13_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX13_A1525HisProKgr ;
   private java.util.Date[] P08LX13_A4441HisProDTF ;
   private boolean[] P08LX13_n4441HisProDTF ;
   private java.util.Date[] P08LX13_A4440HisProDTI ;
   private boolean[] P08LX13_n4440HisProDTI ;
   private String[] P08LX13_A13711BarTipArtD ;
   private boolean[] P08LX13_n13711BarTipArtD ;
   private String[] P08LX13_A1652BarSerDsc ;
   private String[] P08LX13_A212BarSer ;
   private java.util.Date[] P08LX13_A159BarFecGen ;
   private String[] P08LX13_A279CliNom ;
   private int[] P08LX13_A252CliCod ;
   private boolean[] P08LX13_n252CliCod ;
   private String[] P08LX13_A3610HisProLot ;
   private String[] P08LX13_A13696BarNHdr ;
   private String[] P08LX13_A606MaqDsc ;
   private boolean[] P08LX13_n606MaqDsc ;
   private String[] P08LX13_A602MaqCod ;
   private int[] P08LX13_A129BarCod ;
   private byte[] P08LX13_A132BarCodReo ;
   private String[] P08LX13_A130BarCodPar ;
   private String[] P08LX13_A143BarDisNum ;
   private String[] P08LX13_A4812BarEncCli ;
   private byte[] P08LX13_A218BarTipCol ;
   private String[] P08LX13_A461Fase ;
   private String[] P08LX13_A396EmprCod ;
   private java.util.Date[] P08LX13_A558HisProFec ;
   private int[] P08LX13_A561HisProLin ;
   private short[] P08LX14_A217BarTipArt ;
   private boolean[] P08LX14_n217BarTipArt ;
   private String[] P08LX14_A867ParCodNom ;
   private boolean[] P08LX14_n867ParCodNom ;
   private byte[] P08LX14_A3612HisProReo ;
   private byte[] P08LX14_A566HisProTur ;
   private short[] P08LX14_A656ParCod ;
   private boolean[] P08LX14_n656ParCod ;
   private java.math.BigDecimal[] P08LX14_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LX14_A1525HisProKgr ;
   private java.util.Date[] P08LX14_A4441HisProDTF ;
   private boolean[] P08LX14_n4441HisProDTF ;
   private java.util.Date[] P08LX14_A4440HisProDTI ;
   private boolean[] P08LX14_n4440HisProDTI ;
   private String[] P08LX14_A13711BarTipArtD ;
   private boolean[] P08LX14_n13711BarTipArtD ;
   private String[] P08LX14_A1652BarSerDsc ;
   private String[] P08LX14_A212BarSer ;
   private java.util.Date[] P08LX14_A159BarFecGen ;
   private String[] P08LX14_A279CliNom ;
   private int[] P08LX14_A252CliCod ;
   private boolean[] P08LX14_n252CliCod ;
   private String[] P08LX14_A3610HisProLot ;
   private String[] P08LX14_A13696BarNHdr ;
   private String[] P08LX14_A606MaqDsc ;
   private boolean[] P08LX14_n606MaqDsc ;
   private String[] P08LX14_A602MaqCod ;
   private int[] P08LX14_A129BarCod ;
   private byte[] P08LX14_A132BarCodReo ;
   private String[] P08LX14_A130BarCodPar ;
   private String[] P08LX14_A143BarDisNum ;
   private String[] P08LX14_A4812BarEncCli ;
   private byte[] P08LX14_A218BarTipCol ;
   private String[] P08LX14_A461Fase ;
   private String[] P08LX14_A396EmprCod ;
   private java.util.Date[] P08LX14_A558HisProFec ;
   private int[] P08LX14_A561HisProLin ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class wciformedetalladohdrsproducciongetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08LX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV39MaqCodInicial ,
                                          String AV40MaqCodFinal ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          byte AV68HisProReo ,
                                          short AV69ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[42];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T1.MaqCod, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08LX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV39MaqCodInicial ,
                                          String AV40MaqCodFinal ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          byte AV68HisProReo ,
                                          short AV69ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String A396EmprCod ,
                                          String AV38Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[42];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T2.MaqDsc, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.MaqDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08LX4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV39MaqCodInicial ,
                                          String AV40MaqCodFinal ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          byte AV68HisProReo ,
                                          short AV69ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[42];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08LX5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV39MaqCodInicial ,
                                          String AV40MaqCodFinal ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          byte AV68HisProReo ,
                                          short AV69ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String A396EmprCod ,
                                          String AV38Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[42];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T1.HisProLot, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.HisProLot" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08LX6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV39MaqCodInicial ,
                                          String AV40MaqCodFinal ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          byte AV68HisProReo ,
                                          short AV69ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String A396EmprCod ,
                                          String AV38Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[42];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T4.CliNom, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.CliNom" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P08LX7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV39MaqCodInicial ,
                                          String AV40MaqCodFinal ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          byte AV68HisProReo ,
                                          short AV69ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[42];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P08LX8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV39MaqCodInicial ,
                                          String AV40MaqCodFinal ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          byte AV68HisProReo ,
                                          short AV69ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String A396EmprCod ,
                                          String AV38Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[42];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T3.BarSer, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T3.BarSerDsc, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarSer" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P08LX9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV39MaqCodInicial ,
                                          String AV40MaqCodFinal ,
                                          java.util.Date AV41Hisprodti ,
                                          java.util.Date AV42Hisprodtf ,
                                          byte AV68HisProReo ,
                                          short AV69ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String A396EmprCod ,
                                          String AV38Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[42];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T3.BarSerDsc, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int22[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int22[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int22[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int22[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int22[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int22[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int22[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.BarSerDsc" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_P08LX10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                           int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                           String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                           short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                           String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                           byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                           byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                           byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                           String AV39MaqCodInicial ,
                                           String AV40MaqCodFinal ,
                                           java.util.Date AV41Hisprodti ,
                                           java.util.Date AV42Hisprodtf ,
                                           byte AV68HisProReo ,
                                           short AV69ParCod ,
                                           String A602MaqCod ,
                                           String A606MaqDsc ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A3610HisProLot ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           java.util.Date A159BarFecGen ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A13711BarTipArtD ,
                                           String A461Fase ,
                                           java.util.Date A4440HisProDTI ,
                                           java.util.Date A4441HisProDTF ,
                                           java.math.BigDecimal A1525HisProKgr ,
                                           java.math.BigDecimal A1526HisProMtr ,
                                           short A656ParCod ,
                                           String A867ParCodNom ,
                                           byte A566HisProTur ,
                                           byte A3612HisProReo ,
                                           String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13878PedidoClie ,
                                           String A13868BarTipColD ,
                                           String A13893FaseDescri ,
                                           String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           String A396EmprCod ,
                                           String AV38Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[42];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T5.TipArtDsc AS BarTipArtD, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int24[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int24[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int24[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int24[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int24[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int24[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int24[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int24[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T5.TipArtDsc" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_P08LX11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                           int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                           String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                           short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                           String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                           byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                           byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                           byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                           String AV39MaqCodInicial ,
                                           String AV40MaqCodFinal ,
                                           java.util.Date AV41Hisprodti ,
                                           java.util.Date AV42Hisprodtf ,
                                           byte AV68HisProReo ,
                                           short AV69ParCod ,
                                           String A602MaqCod ,
                                           String A606MaqDsc ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A3610HisProLot ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           java.util.Date A159BarFecGen ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A13711BarTipArtD ,
                                           String A461Fase ,
                                           java.util.Date A4440HisProDTI ,
                                           java.util.Date A4441HisProDTF ,
                                           java.math.BigDecimal A1525HisProKgr ,
                                           java.math.BigDecimal A1526HisProMtr ,
                                           short A656ParCod ,
                                           String A867ParCodNom ,
                                           byte A566HisProTur ,
                                           byte A3612HisProReo ,
                                           String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13878PedidoClie ,
                                           String A13868BarTipColD ,
                                           String A13893FaseDescri ,
                                           String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           String AV38Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[42];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P08LX12( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                           int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                           String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                           short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                           String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                           byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                           byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                           byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                           String AV39MaqCodInicial ,
                                           String AV40MaqCodFinal ,
                                           java.util.Date AV41Hisprodti ,
                                           java.util.Date AV42Hisprodtf ,
                                           byte AV68HisProReo ,
                                           short AV69ParCod ,
                                           String A602MaqCod ,
                                           String A606MaqDsc ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A3610HisProLot ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           java.util.Date A159BarFecGen ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A13711BarTipArtD ,
                                           String A461Fase ,
                                           java.util.Date A4440HisProDTI ,
                                           java.util.Date A4441HisProDTF ,
                                           java.math.BigDecimal A1525HisProKgr ,
                                           java.math.BigDecimal A1526HisProMtr ,
                                           short A656ParCod ,
                                           String A867ParCodNom ,
                                           byte A566HisProTur ,
                                           byte A3612HisProReo ,
                                           String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13878PedidoClie ,
                                           String A13868BarTipColD ,
                                           String A13893FaseDescri ,
                                           String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           String AV38Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[42];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int28[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int28[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int28[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int28[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int28[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int28[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int28[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int28[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int28[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int28[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Fase" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_P08LX13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                           int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                           String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                           short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                           String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                           byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                           byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                           byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                           String AV39MaqCodInicial ,
                                           String AV40MaqCodFinal ,
                                           java.util.Date AV41Hisprodti ,
                                           java.util.Date AV42Hisprodtf ,
                                           byte AV68HisProReo ,
                                           short AV69ParCod ,
                                           String A602MaqCod ,
                                           String A606MaqDsc ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A3610HisProLot ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           java.util.Date A159BarFecGen ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A13711BarTipArtD ,
                                           String A461Fase ,
                                           java.util.Date A4440HisProDTI ,
                                           java.util.Date A4441HisProDTF ,
                                           java.math.BigDecimal A1525HisProKgr ,
                                           java.math.BigDecimal A1526HisProMtr ,
                                           short A656ParCod ,
                                           String A867ParCodNom ,
                                           byte A566HisProTur ,
                                           byte A3612HisProReo ,
                                           String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13878PedidoClie ,
                                           String A13868BarTipColD ,
                                           String A13893FaseDescri ,
                                           String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           String AV38Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[42];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int30[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int30[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int30[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int30[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int30[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int30[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int30[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int30[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int30[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int30[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int30[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int30[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int30[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int30[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int30[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int30[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int30[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int30[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
   }

   protected Object[] conditional_P08LX14( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           String AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           String AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           String AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           String AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           String AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           String AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           String AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           int AV102Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                           int AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                           String AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           String AV104Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           java.util.Date AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           String AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           String AV109Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           String AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           String AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           String AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           String AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           String AV118Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           String AV117Wciformedetalladohdrsproduccionds_25_tffase ,
                                           java.util.Date AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           java.util.Date AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           java.math.BigDecimal AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           java.math.BigDecimal AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           java.math.BigDecimal AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           java.math.BigDecimal AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           short AV127Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                           short AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                           String AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           String AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           byte AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                           byte AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                           byte AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                           byte AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                           String AV39MaqCodInicial ,
                                           String AV40MaqCodFinal ,
                                           java.util.Date AV41Hisprodti ,
                                           java.util.Date AV42Hisprodtf ,
                                           byte AV68HisProReo ,
                                           short AV69ParCod ,
                                           String A602MaqCod ,
                                           String A606MaqDsc ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A3610HisProLot ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           java.util.Date A159BarFecGen ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A13711BarTipArtD ,
                                           String A461Fase ,
                                           java.util.Date A4440HisProDTI ,
                                           java.util.Date A4441HisProDTF ,
                                           java.math.BigDecimal A1525HisProKgr ,
                                           java.math.BigDecimal A1526HisProMtr ,
                                           short A656ParCod ,
                                           String A867ParCodNom ,
                                           byte A566HisProTur ,
                                           byte A3612HisProReo ,
                                           String AV93Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A13878PedidoClie ,
                                           String A13868BarTipColD ,
                                           String A13893FaseDescri ,
                                           String AV107Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           String AV106Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           String AV116Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           String AV115Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           String AV120Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           String AV119Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           String A396EmprCod ,
                                           String AV38Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[42];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T6.ParCodNom, T1.HisProReo, T1.HisProTur, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T1.HisProDTF, T1.HisProDTI, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T3.BarSerDsc, T3.BarSer, T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol, T1.Fase, T1.EmprCod, T1.HisProFec," ;
      scmdbuf += " T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int32[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int32[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV98Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV100Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int32[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV121Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int32[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int32[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( ! (0==AV127Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( ! (0==AV128Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int32[31] = (byte)(1) ;
      }
      if ( ! (0==AV131Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int32[32] = (byte)(1) ;
      }
      if ( ! (0==AV132Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int32[33] = (byte)(1) ;
      }
      if ( ! (0==AV133Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int32[34] = (byte)(1) ;
      }
      if ( ! (0==AV134Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int32[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int32[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int32[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int32[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int32[39] = (byte)(1) ;
      }
      if ( ! ( AV68HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int32[40] = (byte)(1) ;
      }
      if ( AV69ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int32[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T6.ParCodNom" ;
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
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
                  return conditional_P08LX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 1 :
                  return conditional_P08LX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 2 :
                  return conditional_P08LX4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 3 :
                  return conditional_P08LX5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 4 :
                  return conditional_P08LX6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 5 :
                  return conditional_P08LX7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 6 :
                  return conditional_P08LX8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 7 :
                  return conditional_P08LX9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 8 :
                  return conditional_P08LX10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 9 :
                  return conditional_P08LX11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 10 :
                  return conditional_P08LX12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 11 :
                  return conditional_P08LX13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
            case 12 :
                  return conditional_P08LX14(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08LX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LX14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(14);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 10);
               ((String[]) buf[24])[0] = rslt.getString(18, 11);
               ((String[]) buf[25])[0] = rslt.getString(19, 16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 26);
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 30);
               ((int[]) buf[22])[0] = rslt.getInt(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 10);
               ((String[]) buf[25])[0] = rslt.getString(18, 11);
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(14);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((String[]) buf[18])[0] = rslt.getString(13, 16);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(14);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 26);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 26);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(13);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((int[]) buf[20])[0] = rslt.getInt(15);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 10);
               ((String[]) buf[23])[0] = rslt.getString(17, 11);
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 6);
               ((int[]) buf[27])[0] = rslt.getInt(20);
               ((byte[]) buf[28])[0] = rslt.getByte(21);
               ((String[]) buf[29])[0] = rslt.getString(22, 1);
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
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
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
            case 12 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
      }
   }

}

