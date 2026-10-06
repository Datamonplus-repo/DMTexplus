package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_sdt_wcgetfilterdata extends GXProcedure
{
   public consultadeproduccion_sdt_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_sdt_wcgetfilterdata.class ), "" );
   }

   public consultadeproduccion_sdt_wcgetfilterdata( int remoteHandle ,
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
      consultadeproduccion_sdt_wcgetfilterdata.this.aP5 = new String[] {""};
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
      consultadeproduccion_sdt_wcgetfilterdata.this.AV27DDOName = aP0;
      consultadeproduccion_sdt_wcgetfilterdata.this.AV28SearchTxt = aP1;
      consultadeproduccion_sdt_wcgetfilterdata.this.AV29SearchTxtTo = aP2;
      consultadeproduccion_sdt_wcgetfilterdata.this.aP3 = aP3;
      consultadeproduccion_sdt_wcgetfilterdata.this.aP4 = aP4;
      consultadeproduccion_sdt_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV27DDOName), "DDO_CONSULTADEPRODUCCION_SDT__BARNHDR") == 0 )
      {
         AV72TFConsultadeProduccion_SDT__BarNHdr = AV28SearchTxt ;
         AV73TFConsultadeProduccion_SDT__BarNHdr_Sel = "" ;
         /* Execute user subroutine: 'LOADCONSULTADEPRODUCCION_SDT__BARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV27DDOName), "DDO_CONSULTADEPRODUCCION_SDT__BARSER") == 0 )
      {
         AV78TFConsultadeProduccion_SDT__Barser = AV28SearchTxt ;
         AV79TFConsultadeProduccion_SDT__Barser_Sel = "" ;
         /* Execute user subroutine: 'LOADCONSULTADEPRODUCCION_SDT__BARSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV27DDOName), "DDO_CONSULTADEPRODUCCION_SDT__BARKGM") == 0 )
      {
         AV92TFConsultadeProduccion_SDT__BarKgm = CommonUtil.decimalVal( AV28SearchTxt, ".") ;
         AV93TFConsultadeProduccion_SDT__BarKgm_Sel = DecimalUtil.ZERO ;
         /* Execute user subroutine: 'LOADCONSULTADEPRODUCCION_SDT__BARKGMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV27DDOName), "DDO_CONSULTADEPRODUCCION_SDT__BARMTR") == 0 )
      {
         AV94TFConsultadeProduccion_SDT__BarMtr = CommonUtil.decimalVal( AV28SearchTxt, ".") ;
         AV95TFConsultadeProduccion_SDT__BarMtr_Sel = DecimalUtil.ZERO ;
         /* Execute user subroutine: 'LOADCONSULTADEPRODUCCION_SDT__BARMTROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV27DDOName), "DDO_CONSULTADEPRODUCCION_SDT__BARPIE") == 0 )
      {
         AV96TFConsultadeProduccion_SDT__BarPie = (int)(GXutil.lval( AV28SearchTxt)) ;
         AV97TFConsultadeProduccion_SDT__BarPie_Sel = 0 ;
         /* Execute user subroutine: 'LOADCONSULTADEPRODUCCION_SDT__BARPIEOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV27DDOName), "DDO_CONSULTADEPRODUCCION_SDT__BARALBMTS") == 0 )
      {
         AV114TFConsultadeProduccion_SDT__BarAlbMts = CommonUtil.decimalVal( AV28SearchTxt, ".") ;
         AV115TFConsultadeProduccion_SDT__BarAlbMts_Sel = DecimalUtil.ZERO ;
         /* Execute user subroutine: 'LOADCONSULTADEPRODUCCION_SDT__BARALBMTSOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV27DDOName), "DDO_CONSULTADEPRODUCCION_SDT__BARALBKGS") == 0 )
      {
         AV116TFConsultadeProduccion_SDT__BarAlbKgs = CommonUtil.decimalVal( AV28SearchTxt, ".") ;
         AV117TFConsultadeProduccion_SDT__BarAlbKgs_Sel = DecimalUtil.ZERO ;
         /* Execute user subroutine: 'LOADCONSULTADEPRODUCCION_SDT__BARALBKGSOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30OptionsJson = AV17Options.toJSonString(false) ;
      AV31OptionsDescJson = AV19OptionsDesc.toJSonString(false) ;
      AV32OptionIndexesJson = AV20OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue("Produccion.ConsultadeProduccion_SDT_WCGridState"), "") == 0 )
      {
         AV24GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_SDT_WCGridState"), null, null);
      }
      else
      {
         AV24GridState.fromxml(AV22Session.getValue("Produccion.ConsultadeProduccion_SDT_WCGridState"), null, null);
      }
      AV145GXV1 = 1 ;
      while ( AV145GXV1 <= AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV25GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV24GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV145GXV1));
         if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__CLICOD") == 0 )
         {
            AV11TFConsultadeProduccion_SDT__Clicod = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV12TFConsultadeProduccion_SDT__Clicod_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__CLINOM") == 0 )
         {
            AV70TFConsultadeProduccion_SDT__CliNom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARNHDR") == 0 )
         {
            AV72TFConsultadeProduccion_SDT__BarNHdr = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARNHDR_SEL") == 0 )
         {
            AV73TFConsultadeProduccion_SDT__BarNHdr_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARAGREST") == 0 )
         {
            AV74TFConsultadeProduccion_SDT__BarAgrEst = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__PEDIDOCLIENTE") == 0 )
         {
            AV76TFConsultadeProduccion_SDT__PedidoCliente = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARSER") == 0 )
         {
            AV78TFConsultadeProduccion_SDT__Barser = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARSER_SEL") == 0 )
         {
            AV79TFConsultadeProduccion_SDT__Barser_Sel = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARSERDSC") == 0 )
         {
            AV80TFConsultadeProduccion_SDT__Barserdsc = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARTIPART") == 0 )
         {
            AV82TFConsultadeProduccion_SDT__BarTipArt = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV132TFConsultadeProduccion_SDT__BarTipArt_To = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARTIPARTDSC") == 0 )
         {
            AV84TFConsultadeProduccion_SDT__BarTipArtDsc = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARCOLNOM") == 0 )
         {
            AV86TFConsultadeProduccion_SDT__Barcolnom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARCOLNUM") == 0 )
         {
            AV88TFConsultadeProduccion_SDT__Barcolnum = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV133TFConsultadeProduccion_SDT__Barcolnum_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARNOMCLI") == 0 )
         {
            AV90TFConsultadeProduccion_SDT__BarNomCli = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARKGM") == 0 )
         {
            AV92TFConsultadeProduccion_SDT__BarKgm = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARKGM_SEL") == 0 )
         {
            AV93TFConsultadeProduccion_SDT__BarKgm_Sel = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARMTR") == 0 )
         {
            AV94TFConsultadeProduccion_SDT__BarMtr = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARMTR_SEL") == 0 )
         {
            AV95TFConsultadeProduccion_SDT__BarMtr_Sel = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARPIE") == 0 )
         {
            AV96TFConsultadeProduccion_SDT__BarPie = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARPIE_SEL") == 0 )
         {
            AV97TFConsultadeProduccion_SDT__BarPie_Sel = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARSIT") == 0 )
         {
            AV98TFConsultadeProduccion_SDT__BarSit = (byte)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV134TFConsultadeProduccion_SDT__BarSit_To = (byte)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFECGEN") == 0 )
         {
            AV100TFConsultadeProduccion_SDT__BarFecgen = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV137TFConsultadeProduccion_SDT__BarFecgen_To = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFECCLI") == 0 )
         {
            AV102TFConsultadeProduccion_SDT__BarFecCli = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV138TFConsultadeProduccion_SDT__BarFecCli_To = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFECFPR") == 0 )
         {
            AV141TFConsultadeProduccion_SDT__BarFecFpr = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV142TFConsultadeProduccion_SDT__BarFecFpr_To = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFECSAL") == 0 )
         {
            AV104TFConsultadeProduccion_SDT__BarFecsal = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV140TFConsultadeProduccion_SDT__BarFecsal_To = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFASCOD") == 0 )
         {
            AV106TFConsultadeProduccion_SDT__Barfascod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARFASSIG") == 0 )
         {
            AV108TFConsultadeProduccion_SDT__BarFasSig = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBULTIMO") == 0 )
         {
            AV110TFConsultadeProduccion_SDT__BarAlbUltimo = GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV135TFConsultadeProduccion_SDT__BarAlbUltimo_To = GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBFACT") == 0 )
         {
            AV112TFConsultadeProduccion_SDT__BarAlbFact = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV136TFConsultadeProduccion_SDT__BarAlbFact_To = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBMTS") == 0 )
         {
            AV114TFConsultadeProduccion_SDT__BarAlbMts = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBMTS_SEL") == 0 )
         {
            AV115TFConsultadeProduccion_SDT__BarAlbMts_Sel = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBKGS") == 0 )
         {
            AV116TFConsultadeProduccion_SDT__BarAlbKgs = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARALBKGS_SEL") == 0 )
         {
            AV117TFConsultadeProduccion_SDT__BarAlbKgs_Sel = CommonUtil.decimalVal( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARGIRAR") == 0 )
         {
            AV118TFConsultadeProduccion_SDT__BarGirar = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARACAANH") == 0 )
         {
            AV120TFConsultadeProduccion_SDT__BarAcaAnh = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV139TFConsultadeProduccion_SDT__BarAcaAnh_To = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARCUADERNO") == 0 )
         {
            AV122TFConsultadeProduccion_SDT__BarCuaderno = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARPROPER") == 0 )
         {
            AV124TFConsultadeProduccion_SDT__BarProPer = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARPROPERIDTX") == 0 )
         {
            AV126TFConsultadeProduccion_SDT__BarProPerIdtx = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__BARNORMAS") == 0 )
         {
            AV128TFConsultadeProduccion_SDT__BarNormas = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCONSULTADEPRODUCCION_SDT__DISUSRCOD") == 0 )
         {
            AV130TFConsultadeProduccion_SDT__DisUsrCod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODFROM") == 0 )
         {
            AV35clicodfrom = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODTO") == 0 )
         {
            AV36clicodto = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUMFROM") == 0 )
         {
            AV37bardisnumfrom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUMTO") == 0 )
         {
            AV38bardisnumto = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGENFROM") == 0 )
         {
            AV39barfecgenfrom = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGENTO") == 0 )
         {
            AV40barfecgento = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSITFROM") == 0 )
         {
            AV41barsitfrom = (byte)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSITTO") == 0 )
         {
            AV42barsitto = (byte)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLIFROM") == 0 )
         {
            AV43barfecclifrom = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLITO") == 0 )
         {
            AV44barfecclito = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECFPRFROM") == 0 )
         {
            AV45BarFecFprfrom = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECFPRTO") == 0 )
         {
            AV46BarFecFprto = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSALFROM") == 0 )
         {
            AV47barfecsalfrom = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSALTO") == 0 )
         {
            AV48barfecsalto = localUtil.ctod( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERFROM") == 0 )
         {
            AV49barserfrom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERTO") == 0 )
         {
            AV50barserto = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTFROM") == 0 )
         {
            AV51bartipartfrom = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTTO") == 0 )
         {
            AV52bartipartto = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOMFROM") == 0 )
         {
            AV53BarColNomfrom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOMTO") == 0 )
         {
            AV54BarColNomto = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUMFROM") == 0 )
         {
            AV55BarColNumfrom = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUMTO") == 0 )
         {
            AV56BarColNumto = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNOMCLIFROM") == 0 )
         {
            AV57BarNomClifrom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNOMCLITO") == 0 )
         {
            AV58BarNomClito = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNUMCLIFROM") == 0 )
         {
            AV59BarNumclifrom = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARNUMCLITO") == 0 )
         {
            AV60barnumclito = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTFROM") == 0 )
         {
            AV51bartipartfrom = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPARTTO") == 0 )
         {
            AV52bartipartto = (short)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MUESTRAS") == 0 )
         {
            AV61muestras = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODFROM") == 0 )
         {
            AV62barcodfrom = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODTO") == 0 )
         {
            AV63barcodto = (int)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOFROM") == 0 )
         {
            AV64barcodreofrom = (byte)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOTO") == 0 )
         {
            AV65barcodreoto = (byte)(GXutil.lval( AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARFROM") == 0 )
         {
            AV66barcodparfrom = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARTO") == 0 )
         {
            AV67barcodparto = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COD_IDTX") == 0 )
         {
            AV68Cod_idtx = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARGIRAR") == 0 )
         {
            AV69BarGirar = AV25GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV145GXV1 = (int)(AV145GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCONSULTADEPRODUCCION_SDT__BARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV146GXV2 = 1 ;
      while ( AV146GXV2 <= AV10ConsultadeProduccion_SDT.size() )
      {
         AV14ConsultadeProduccion_SDTItem = (app.produccion.SdtConsultadeProduccion_SDT_Item)((app.produccion.SdtConsultadeProduccion_SDT_Item)AV10ConsultadeProduccion_SDT.elementAt(-1+AV146GXV2));
         if ( ! (GXutil.strcmp("", AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr())==0) )
         {
            AV16Option = AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr() ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( ( AV15InsertIndex == AV17Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) != 0 ) )
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
            }
         }
         AV146GXV2 = (int)(AV146GXV2+1) ;
      }
   }

   public void S131( )
   {
      /* 'LOADCONSULTADEPRODUCCION_SDT__BARSEROPTIONS' Routine */
      returnInSub = false ;
      AV147GXV3 = 1 ;
      while ( AV147GXV3 <= AV10ConsultadeProduccion_SDT.size() )
      {
         AV14ConsultadeProduccion_SDTItem = (app.produccion.SdtConsultadeProduccion_SDT_Item)((app.produccion.SdtConsultadeProduccion_SDT_Item)AV10ConsultadeProduccion_SDT.elementAt(-1+AV147GXV3));
         if ( ! (GXutil.strcmp("", AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barser())==0) )
         {
            AV16Option = AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barser() ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( ( AV15InsertIndex == AV17Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) != 0 ) )
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
            }
         }
         AV147GXV3 = (int)(AV147GXV3+1) ;
      }
   }

   public void S141( )
   {
      /* 'LOADCONSULTADEPRODUCCION_SDT__BARKGMOPTIONS' Routine */
      returnInSub = false ;
      AV148GXV4 = 1 ;
      while ( AV148GXV4 <= AV10ConsultadeProduccion_SDT.size() )
      {
         AV14ConsultadeProduccion_SDTItem = (app.produccion.SdtConsultadeProduccion_SDT_Item)((app.produccion.SdtConsultadeProduccion_SDT_Item)AV10ConsultadeProduccion_SDT.elementAt(-1+AV148GXV4));
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barkgm())==0) )
         {
            AV16Option = GXutil.str( AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barkgm(), 9, 2) ;
            AV18OptionDesc = GXutil.trim( localUtil.format( AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barkgm(), "ZZZZZ9.99")) ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV19OptionsDesc.elementAt(-1+AV15InsertIndex), AV18OptionDesc) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( ( AV15InsertIndex == AV17Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV19OptionsDesc.elementAt(-1+AV15InsertIndex), AV18OptionDesc) != 0 ) )
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
               AV19OptionsDesc.add(AV18OptionDesc, AV15InsertIndex);
            }
         }
         AV148GXV4 = (int)(AV148GXV4+1) ;
      }
   }

   public void S151( )
   {
      /* 'LOADCONSULTADEPRODUCCION_SDT__BARMTROPTIONS' Routine */
      returnInSub = false ;
      AV149GXV5 = 1 ;
      while ( AV149GXV5 <= AV10ConsultadeProduccion_SDT.size() )
      {
         AV14ConsultadeProduccion_SDTItem = (app.produccion.SdtConsultadeProduccion_SDT_Item)((app.produccion.SdtConsultadeProduccion_SDT_Item)AV10ConsultadeProduccion_SDT.elementAt(-1+AV149GXV5));
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barmtr())==0) )
         {
            AV16Option = GXutil.str( AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barmtr(), 9, 2) ;
            AV18OptionDesc = GXutil.trim( localUtil.format( AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barmtr(), "ZZZZZ9.99")) ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV19OptionsDesc.elementAt(-1+AV15InsertIndex), AV18OptionDesc) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( ( AV15InsertIndex == AV17Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV19OptionsDesc.elementAt(-1+AV15InsertIndex), AV18OptionDesc) != 0 ) )
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
               AV19OptionsDesc.add(AV18OptionDesc, AV15InsertIndex);
            }
         }
         AV149GXV5 = (int)(AV149GXV5+1) ;
      }
   }

   public void S161( )
   {
      /* 'LOADCONSULTADEPRODUCCION_SDT__BARPIEOPTIONS' Routine */
      returnInSub = false ;
      AV150GXV6 = 1 ;
      while ( AV150GXV6 <= AV10ConsultadeProduccion_SDT.size() )
      {
         AV14ConsultadeProduccion_SDTItem = (app.produccion.SdtConsultadeProduccion_SDT_Item)((app.produccion.SdtConsultadeProduccion_SDT_Item)AV10ConsultadeProduccion_SDT.elementAt(-1+AV150GXV6));
         if ( ! (0==AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barpie()) )
         {
            AV16Option = GXutil.str( AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barpie(), 6, 0) ;
            AV18OptionDesc = GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Barpie()), "ZZZZZ9")) ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV19OptionsDesc.elementAt(-1+AV15InsertIndex), AV18OptionDesc) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( ( AV15InsertIndex == AV17Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV19OptionsDesc.elementAt(-1+AV15InsertIndex), AV18OptionDesc) != 0 ) )
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
               AV19OptionsDesc.add(AV18OptionDesc, AV15InsertIndex);
            }
         }
         AV150GXV6 = (int)(AV150GXV6+1) ;
      }
   }

   public void S171( )
   {
      /* 'LOADCONSULTADEPRODUCCION_SDT__BARALBMTSOPTIONS' Routine */
      returnInSub = false ;
      AV151GXV7 = 1 ;
      while ( AV151GXV7 <= AV10ConsultadeProduccion_SDT.size() )
      {
         AV14ConsultadeProduccion_SDTItem = (app.produccion.SdtConsultadeProduccion_SDT_Item)((app.produccion.SdtConsultadeProduccion_SDT_Item)AV10ConsultadeProduccion_SDT.elementAt(-1+AV151GXV7));
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts())==0) )
         {
            AV16Option = GXutil.str( AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts(), 9, 2) ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( ( AV15InsertIndex == AV17Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) != 0 ) )
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
            }
         }
         AV151GXV7 = (int)(AV151GXV7+1) ;
      }
   }

   public void S181( )
   {
      /* 'LOADCONSULTADEPRODUCCION_SDT__BARALBKGSOPTIONS' Routine */
      returnInSub = false ;
      AV152GXV8 = 1 ;
      while ( AV152GXV8 <= AV10ConsultadeProduccion_SDT.size() )
      {
         AV14ConsultadeProduccion_SDTItem = (app.produccion.SdtConsultadeProduccion_SDT_Item)((app.produccion.SdtConsultadeProduccion_SDT_Item)AV10ConsultadeProduccion_SDT.elementAt(-1+AV152GXV8));
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs())==0) )
         {
            AV16Option = GXutil.str( AV14ConsultadeProduccion_SDTItem.getgxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs(), 9, 2) ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( ( AV15InsertIndex == AV17Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) != 0 ) )
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
            }
         }
         AV152GXV8 = (int)(AV152GXV8+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultadeproduccion_sdt_wcgetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = consultadeproduccion_sdt_wcgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = consultadeproduccion_sdt_wcgetfilterdata.this.AV32OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV32OptionIndexesJson = "" ;
      AV17Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV72TFConsultadeProduccion_SDT__BarNHdr = "" ;
      AV73TFConsultadeProduccion_SDT__BarNHdr_Sel = "" ;
      AV78TFConsultadeProduccion_SDT__Barser = "" ;
      AV79TFConsultadeProduccion_SDT__Barser_Sel = "" ;
      AV92TFConsultadeProduccion_SDT__BarKgm = DecimalUtil.ZERO ;
      AV93TFConsultadeProduccion_SDT__BarKgm_Sel = DecimalUtil.ZERO ;
      AV94TFConsultadeProduccion_SDT__BarMtr = DecimalUtil.ZERO ;
      AV95TFConsultadeProduccion_SDT__BarMtr_Sel = DecimalUtil.ZERO ;
      AV114TFConsultadeProduccion_SDT__BarAlbMts = DecimalUtil.ZERO ;
      AV115TFConsultadeProduccion_SDT__BarAlbMts_Sel = DecimalUtil.ZERO ;
      AV116TFConsultadeProduccion_SDT__BarAlbKgs = DecimalUtil.ZERO ;
      AV117TFConsultadeProduccion_SDT__BarAlbKgs_Sel = DecimalUtil.ZERO ;
      AV22Session = httpContext.getWebSession();
      AV24GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV25GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV70TFConsultadeProduccion_SDT__CliNom = "" ;
      AV74TFConsultadeProduccion_SDT__BarAgrEst = "" ;
      AV76TFConsultadeProduccion_SDT__PedidoCliente = "" ;
      AV80TFConsultadeProduccion_SDT__Barserdsc = "" ;
      AV84TFConsultadeProduccion_SDT__BarTipArtDsc = "" ;
      AV86TFConsultadeProduccion_SDT__Barcolnom = "" ;
      AV90TFConsultadeProduccion_SDT__BarNomCli = "" ;
      AV100TFConsultadeProduccion_SDT__BarFecgen = GXutil.nullDate() ;
      AV137TFConsultadeProduccion_SDT__BarFecgen_To = GXutil.nullDate() ;
      AV102TFConsultadeProduccion_SDT__BarFecCli = GXutil.nullDate() ;
      AV138TFConsultadeProduccion_SDT__BarFecCli_To = GXutil.nullDate() ;
      AV141TFConsultadeProduccion_SDT__BarFecFpr = GXutil.nullDate() ;
      AV142TFConsultadeProduccion_SDT__BarFecFpr_To = GXutil.nullDate() ;
      AV104TFConsultadeProduccion_SDT__BarFecsal = GXutil.nullDate() ;
      AV140TFConsultadeProduccion_SDT__BarFecsal_To = GXutil.nullDate() ;
      AV106TFConsultadeProduccion_SDT__Barfascod = "" ;
      AV108TFConsultadeProduccion_SDT__BarFasSig = "" ;
      AV118TFConsultadeProduccion_SDT__BarGirar = "" ;
      AV122TFConsultadeProduccion_SDT__BarCuaderno = "" ;
      AV124TFConsultadeProduccion_SDT__BarProPer = "" ;
      AV126TFConsultadeProduccion_SDT__BarProPerIdtx = "" ;
      AV128TFConsultadeProduccion_SDT__BarNormas = "" ;
      AV130TFConsultadeProduccion_SDT__DisUsrCod = "" ;
      AV34Emprcod = "" ;
      AV37bardisnumfrom = "" ;
      AV38bardisnumto = "" ;
      AV39barfecgenfrom = GXutil.nullDate() ;
      AV40barfecgento = GXutil.nullDate() ;
      AV43barfecclifrom = GXutil.nullDate() ;
      AV44barfecclito = GXutil.nullDate() ;
      AV45BarFecFprfrom = GXutil.nullDate() ;
      AV46BarFecFprto = GXutil.nullDate() ;
      AV47barfecsalfrom = GXutil.nullDate() ;
      AV48barfecsalto = GXutil.nullDate() ;
      AV49barserfrom = "" ;
      AV50barserto = "" ;
      AV53BarColNomfrom = "" ;
      AV54BarColNomto = "" ;
      AV57BarNomClifrom = "" ;
      AV58BarNomClito = "" ;
      AV61muestras = "" ;
      AV66barcodparfrom = "" ;
      AV67barcodparto = "" ;
      AV68Cod_idtx = "" ;
      AV69BarGirar = "" ;
      AV10ConsultadeProduccion_SDT = new GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item>(app.produccion.SdtConsultadeProduccion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV14ConsultadeProduccion_SDTItem = new app.produccion.SdtConsultadeProduccion_SDT_Item(remoteHandle, context);
      AV16Option = "" ;
      AV18OptionDesc = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV98TFConsultadeProduccion_SDT__BarSit ;
   private byte AV134TFConsultadeProduccion_SDT__BarSit_To ;
   private byte AV41barsitfrom ;
   private byte AV42barsitto ;
   private byte AV64barcodreofrom ;
   private byte AV65barcodreoto ;
   private short AV82TFConsultadeProduccion_SDT__BarTipArt ;
   private short AV132TFConsultadeProduccion_SDT__BarTipArt_To ;
   private short AV120TFConsultadeProduccion_SDT__BarAcaAnh ;
   private short AV139TFConsultadeProduccion_SDT__BarAcaAnh_To ;
   private short AV51bartipartfrom ;
   private short AV52bartipartto ;
   private short Gx_err ;
   private int AV96TFConsultadeProduccion_SDT__BarPie ;
   private int AV97TFConsultadeProduccion_SDT__BarPie_Sel ;
   private int AV145GXV1 ;
   private int AV11TFConsultadeProduccion_SDT__Clicod ;
   private int AV12TFConsultadeProduccion_SDT__Clicod_To ;
   private int AV88TFConsultadeProduccion_SDT__Barcolnum ;
   private int AV133TFConsultadeProduccion_SDT__Barcolnum_To ;
   private int AV112TFConsultadeProduccion_SDT__BarAlbFact ;
   private int AV136TFConsultadeProduccion_SDT__BarAlbFact_To ;
   private int AV35clicodfrom ;
   private int AV36clicodto ;
   private int AV55BarColNumfrom ;
   private int AV56BarColNumto ;
   private int AV59BarNumclifrom ;
   private int AV60barnumclito ;
   private int AV62barcodfrom ;
   private int AV63barcodto ;
   private int AV146GXV2 ;
   private int AV15InsertIndex ;
   private int AV147GXV3 ;
   private int AV148GXV4 ;
   private int AV149GXV5 ;
   private int AV150GXV6 ;
   private int AV151GXV7 ;
   private int AV152GXV8 ;
   private long AV110TFConsultadeProduccion_SDT__BarAlbUltimo ;
   private long AV135TFConsultadeProduccion_SDT__BarAlbUltimo_To ;
   private java.math.BigDecimal AV92TFConsultadeProduccion_SDT__BarKgm ;
   private java.math.BigDecimal AV93TFConsultadeProduccion_SDT__BarKgm_Sel ;
   private java.math.BigDecimal AV94TFConsultadeProduccion_SDT__BarMtr ;
   private java.math.BigDecimal AV95TFConsultadeProduccion_SDT__BarMtr_Sel ;
   private java.math.BigDecimal AV114TFConsultadeProduccion_SDT__BarAlbMts ;
   private java.math.BigDecimal AV115TFConsultadeProduccion_SDT__BarAlbMts_Sel ;
   private java.math.BigDecimal AV116TFConsultadeProduccion_SDT__BarAlbKgs ;
   private java.math.BigDecimal AV117TFConsultadeProduccion_SDT__BarAlbKgs_Sel ;
   private String AV72TFConsultadeProduccion_SDT__BarNHdr ;
   private String AV73TFConsultadeProduccion_SDT__BarNHdr_Sel ;
   private String AV78TFConsultadeProduccion_SDT__Barser ;
   private String AV79TFConsultadeProduccion_SDT__Barser_Sel ;
   private String AV70TFConsultadeProduccion_SDT__CliNom ;
   private String AV74TFConsultadeProduccion_SDT__BarAgrEst ;
   private String AV76TFConsultadeProduccion_SDT__PedidoCliente ;
   private String AV80TFConsultadeProduccion_SDT__Barserdsc ;
   private String AV84TFConsultadeProduccion_SDT__BarTipArtDsc ;
   private String AV86TFConsultadeProduccion_SDT__Barcolnom ;
   private String AV90TFConsultadeProduccion_SDT__BarNomCli ;
   private String AV106TFConsultadeProduccion_SDT__Barfascod ;
   private String AV108TFConsultadeProduccion_SDT__BarFasSig ;
   private String AV118TFConsultadeProduccion_SDT__BarGirar ;
   private String AV122TFConsultadeProduccion_SDT__BarCuaderno ;
   private String AV124TFConsultadeProduccion_SDT__BarProPer ;
   private String AV126TFConsultadeProduccion_SDT__BarProPerIdtx ;
   private String AV130TFConsultadeProduccion_SDT__DisUsrCod ;
   private String AV34Emprcod ;
   private String AV37bardisnumfrom ;
   private String AV38bardisnumto ;
   private String AV49barserfrom ;
   private String AV50barserto ;
   private String AV53BarColNomfrom ;
   private String AV54BarColNomto ;
   private String AV57BarNomClifrom ;
   private String AV58BarNomClito ;
   private String AV61muestras ;
   private String AV66barcodparfrom ;
   private String AV67barcodparto ;
   private String AV68Cod_idtx ;
   private String AV69BarGirar ;
   private java.util.Date AV100TFConsultadeProduccion_SDT__BarFecgen ;
   private java.util.Date AV137TFConsultadeProduccion_SDT__BarFecgen_To ;
   private java.util.Date AV102TFConsultadeProduccion_SDT__BarFecCli ;
   private java.util.Date AV138TFConsultadeProduccion_SDT__BarFecCli_To ;
   private java.util.Date AV141TFConsultadeProduccion_SDT__BarFecFpr ;
   private java.util.Date AV142TFConsultadeProduccion_SDT__BarFecFpr_To ;
   private java.util.Date AV104TFConsultadeProduccion_SDT__BarFecsal ;
   private java.util.Date AV140TFConsultadeProduccion_SDT__BarFecsal_To ;
   private java.util.Date AV39barfecgenfrom ;
   private java.util.Date AV40barfecgento ;
   private java.util.Date AV43barfecclifrom ;
   private java.util.Date AV44barfecclito ;
   private java.util.Date AV45BarFecFprfrom ;
   private java.util.Date AV46BarFecFprto ;
   private java.util.Date AV47barfecsalfrom ;
   private java.util.Date AV48barfecsalto ;
   private boolean returnInSub ;
   private String AV30OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV32OptionIndexesJson ;
   private String AV27DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV128TFConsultadeProduccion_SDT__BarNormas ;
   private String AV16Option ;
   private String AV18OptionDesc ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item> AV10ConsultadeProduccion_SDT ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private GXSimpleCollection<String> AV17Options ;
   private GXSimpleCollection<String> AV19OptionsDesc ;
   private GXSimpleCollection<String> AV20OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.produccion.SdtConsultadeProduccion_SDT_Item AV14ConsultadeProduccion_SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV24GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV25GridStateFilterValue ;
}

