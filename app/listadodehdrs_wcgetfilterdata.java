package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodehdrs_wcgetfilterdata extends GXProcedure
{
   public listadodehdrs_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodehdrs_wcgetfilterdata.class ), "" );
   }

   public listadodehdrs_wcgetfilterdata( int remoteHandle ,
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
      listadodehdrs_wcgetfilterdata.this.aP5 = new String[] {""};
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
      listadodehdrs_wcgetfilterdata.this.AV48DDOName = aP0;
      listadodehdrs_wcgetfilterdata.this.AV46SearchTxt = aP1;
      listadodehdrs_wcgetfilterdata.this.AV47SearchTxtTo = aP2;
      listadodehdrs_wcgetfilterdata.this.aP3 = aP3;
      listadodehdrs_wcgetfilterdata.this.aP4 = aP4;
      listadodehdrs_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV51Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV54OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV56OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_PEDIDOCLIENTE") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARTIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARTIPARTDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARFASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASCODOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARMAQCODOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARCUADERNO") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCUADERNOOPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_BARNORMAS") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNORMASOPTIONS' */
         S231 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV52OptionsJson = AV51Options.toJSonString(false) ;
      AV55OptionsDescJson = AV54OptionsDesc.toJSonString(false) ;
      AV57OptionIndexesJson = AV56OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV59Session.getValue("ListadodeHDRs_WCGridState"), "") == 0 )
      {
         AV61GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListadodeHDRs_WCGridState"), null, null);
      }
      else
      {
         AV61GridState.fromxml(AV59Session.getValue("ListadodeHDRs_WCGridState"), null, null);
      }
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV61GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV62GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV61GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV64FilterFullText = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV84TFPedidoCliente = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV85TFPedidoCliente_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV74TFBarNHdr = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV75TFBarNHdr_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV14TFBarSer = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV15TFBarSer_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV16TFBarSerDsc = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV17TFBarSerDsc_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV18TFBarTipArt = (short)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFBarTipArt_To = (short)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV20TFBarTipArtDsc = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV21TFBarTipArtDsc_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV22TFBarColNom = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV23TFBarColNom_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV24TFBarColNum = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFBarColNum_To = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV30TFBarNomCli = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV31TFBarNomCli_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV32TFBarKgm = CommonUtil.decimalVal( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFBarKgm_To = CommonUtil.decimalVal( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV34TFBarMtr = CommonUtil.decimalVal( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFBarMtr_To = CommonUtil.decimalVal( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV36TFBarPie = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFBarPie_To = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV38TFBarFecGen = localUtil.ctod( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV40TFBarFecCli = localUtil.ctod( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV42TFBarFecFpr = localUtil.ctod( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV44TFBarFasCod = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV45TFBarFasCod_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV76TFBarMaqCod = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV77TFBarMaqCod_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV78TFBarSit = (byte)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV79TFBarSit_To = (byte)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBULTIMO") == 0 )
         {
            AV86TFBarAlbUltimo = GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV87TFBarAlbUltimo_To = GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTS") == 0 )
         {
            AV88TFBarAlbMts = CommonUtil.decimalVal( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV89TFBarAlbMts_To = CommonUtil.decimalVal( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGS") == 0 )
         {
            AV90TFBarAlbKgs = CommonUtil.decimalVal( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV91TFBarAlbKgs_To = CommonUtil.decimalVal( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCUADERNO") == 0 )
         {
            AV92TFBarCuaderno = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCUADERNO_SEL") == 0 )
         {
            AV93TFBarCuaderno_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS") == 0 )
         {
            AV94TFBarNormas = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS_SEL") == 0 )
         {
            AV95TFBarNormas_Sel = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBFACT") == 0 )
         {
            AV96TFBarAlbFact = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV97TFBarAlbFact_To = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV65Emprcod = AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV66BarSit = (byte)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV67BarSit_to = (byte)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV68BarFecGen = localUtil.ctod( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV69BarFecGen_to = localUtil.ctod( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV70Clicod = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV71Clicod_to = (int)(GXutil.lval( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLI") == 0 )
         {
            AV72BarFecCli = localUtil.ctod( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLI_TO") == 0 )
         {
            AV73BarFecCli_to = localUtil.ctod( AV62GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV46SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           A396EmprCod ,
                                           AV65Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U6 */
      pr_default.execute(0, new Object[] {AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), AV65Emprcod, Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk97U2 = false ;
         A4466BarAcaAnh = P097U6_A4466BarAcaAnh[0] ;
         A279CliNom = P097U6_A279CliNom[0] ;
         A213BarSit = P097U6_A213BarSit[0] ;
         A180BarMaqCod = P097U6_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U6_A158BarFecFpr[0] ;
         A155BarFecCli = P097U6_A155BarFecCli[0] ;
         A159BarFecGen = P097U6_A159BarFecGen[0] ;
         A1234BarNomCli = P097U6_A1234BarNomCli[0] ;
         A136BarColNum = P097U6_A136BarColNum[0] ;
         A135BarColNom = P097U6_A135BarColNom[0] ;
         A13711BarTipArtD = P097U6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U6_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U6_A217BarTipArt[0] ;
         n217BarTipArt = P097U6_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U6_A1652BarSerDsc[0] ;
         A212BarSer = P097U6_A212BarSer[0] ;
         A13696BarNHdr = P097U6_A13696BarNHdr[0] ;
         A252CliCod = P097U6_A252CliCod[0] ;
         n252CliCod = P097U6_n252CliCod[0] ;
         A13933BarCuadern = P097U6_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U6_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U6_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U6_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U6_A151BarFasCod[0] ;
         n151BarFasCod = P097U6_n151BarFasCod[0] ;
         A184BarMtr = P097U6_A184BarMtr[0] ;
         A166BarKgm = P097U6_A166BarKgm[0] ;
         A143BarDisNum = P097U6_A143BarDisNum[0] ;
         A4812BarEncCli = P097U6_A4812BarEncCli[0] ;
         A199BarPie1 = P097U6_A199BarPie1[0] ;
         A365DisDes = P097U6_A365DisDes[0] ;
         A898BarPieNDes = P097U6_A898BarPieNDes[0] ;
         A361DisCod = P097U6_A361DisCod[0] ;
         A130BarCodPar = P097U6_A130BarCodPar[0] ;
         A132BarCodReo = P097U6_A132BarCodReo[0] ;
         A129BarCod = P097U6_A129BarCod[0] ;
         A396EmprCod = P097U6_A396EmprCod[0] ;
         A13711BarTipArtD = P097U6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U6_n13711BarTipArtD[0] ;
         A279CliNom = P097U6_A279CliNom[0] ;
         A13933BarCuadern = P097U6_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U6_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U6_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U6_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U6_A151BarFasCod[0] ;
         n151BarFasCod = P097U6_n151BarFasCod[0] ;
         A184BarMtr = P097U6_A184BarMtr[0] ;
         A166BarKgm = P097U6_A166BarKgm[0] ;
         A199BarPie1 = P097U6_A199BarPie1[0] ;
         A898BarPieNDes = P097U6_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          AV58count = 0 ;
                                          while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P097U6_A279CliNom[0], A279CliNom) == 0 ) )
                                          {
                                             brk97U2 = false ;
                                             A252CliCod = P097U6_A252CliCod[0] ;
                                             n252CliCod = P097U6_n252CliCod[0] ;
                                             A130BarCodPar = P097U6_A130BarCodPar[0] ;
                                             A132BarCodReo = P097U6_A132BarCodReo[0] ;
                                             A129BarCod = P097U6_A129BarCod[0] ;
                                             A396EmprCod = P097U6_A396EmprCod[0] ;
                                             AV58count = (long)(AV58count+1) ;
                                             brk97U2 = true ;
                                             pr_default.readNext(0);
                                          }
                                          if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                                          {
                                             AV50Option = A279CliNom ;
                                             AV51Options.add(AV50Option, 0);
                                             AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         if ( ! brk97U2 )
         {
            brk97U2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV84TFPedidoCliente = AV46SearchTxt ;
      AV85TFPedidoCliente_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U11 */
      pr_default.execute(1, new Object[] {AV65Emprcod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4466BarAcaAnh = P097U11_A4466BarAcaAnh[0] ;
         A213BarSit = P097U11_A213BarSit[0] ;
         A180BarMaqCod = P097U11_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U11_A158BarFecFpr[0] ;
         A155BarFecCli = P097U11_A155BarFecCli[0] ;
         A159BarFecGen = P097U11_A159BarFecGen[0] ;
         A1234BarNomCli = P097U11_A1234BarNomCli[0] ;
         A136BarColNum = P097U11_A136BarColNum[0] ;
         A135BarColNom = P097U11_A135BarColNom[0] ;
         A13711BarTipArtD = P097U11_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U11_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U11_A217BarTipArt[0] ;
         n217BarTipArt = P097U11_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U11_A1652BarSerDsc[0] ;
         A212BarSer = P097U11_A212BarSer[0] ;
         A13696BarNHdr = P097U11_A13696BarNHdr[0] ;
         A279CliNom = P097U11_A279CliNom[0] ;
         A252CliCod = P097U11_A252CliCod[0] ;
         n252CliCod = P097U11_n252CliCod[0] ;
         A13933BarCuadern = P097U11_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U11_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U11_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U11_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U11_A151BarFasCod[0] ;
         n151BarFasCod = P097U11_n151BarFasCod[0] ;
         A184BarMtr = P097U11_A184BarMtr[0] ;
         A166BarKgm = P097U11_A166BarKgm[0] ;
         A143BarDisNum = P097U11_A143BarDisNum[0] ;
         A4812BarEncCli = P097U11_A4812BarEncCli[0] ;
         A199BarPie1 = P097U11_A199BarPie1[0] ;
         A365DisDes = P097U11_A365DisDes[0] ;
         A898BarPieNDes = P097U11_A898BarPieNDes[0] ;
         A361DisCod = P097U11_A361DisCod[0] ;
         A130BarCodPar = P097U11_A130BarCodPar[0] ;
         A132BarCodReo = P097U11_A132BarCodReo[0] ;
         A129BarCod = P097U11_A129BarCod[0] ;
         A396EmprCod = P097U11_A396EmprCod[0] ;
         A13711BarTipArtD = P097U11_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U11_n13711BarTipArtD[0] ;
         A279CliNom = P097U11_A279CliNom[0] ;
         A13933BarCuadern = P097U11_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U11_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U11_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U11_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U11_A151BarFasCod[0] ;
         n151BarFasCod = P097U11_n151BarFasCod[0] ;
         A184BarMtr = P097U11_A184BarMtr[0] ;
         A166BarKgm = P097U11_A166BarKgm[0] ;
         A199BarPie1 = P097U11_A199BarPie1[0] ;
         A898BarPieNDes = P097U11_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
                                          {
                                             AV50Option = A13878PedidoClie ;
                                             AV49InsertIndex = 1 ;
                                             while ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) < 0 ) )
                                             {
                                                AV49InsertIndex = (int)(AV49InsertIndex+1) ;
                                             }
                                             if ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) == 0 ) )
                                             {
                                                AV58count = GXutil.lval( (String)AV56OptionIndexes.elementAt(-1+AV49InsertIndex)) ;
                                                AV58count = (long)(AV58count+1) ;
                                                AV56OptionIndexes.removeItem(AV49InsertIndex);
                                                AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), AV49InsertIndex);
                                             }
                                             else
                                             {
                                                AV51Options.add(AV50Option, AV49InsertIndex);
                                                AV56OptionIndexes.add("1", AV49InsertIndex);
                                             }
                                          }
                                          if ( AV51Options.size() == 50 )
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
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV74TFBarNHdr = AV46SearchTxt ;
      AV75TFBarNHdr_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U16 */
      pr_default.execute(2, new Object[] {AV65Emprcod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4466BarAcaAnh = P097U16_A4466BarAcaAnh[0] ;
         A213BarSit = P097U16_A213BarSit[0] ;
         A180BarMaqCod = P097U16_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U16_A158BarFecFpr[0] ;
         A155BarFecCli = P097U16_A155BarFecCli[0] ;
         A159BarFecGen = P097U16_A159BarFecGen[0] ;
         A1234BarNomCli = P097U16_A1234BarNomCli[0] ;
         A136BarColNum = P097U16_A136BarColNum[0] ;
         A135BarColNom = P097U16_A135BarColNom[0] ;
         A13711BarTipArtD = P097U16_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U16_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U16_A217BarTipArt[0] ;
         n217BarTipArt = P097U16_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U16_A1652BarSerDsc[0] ;
         A212BarSer = P097U16_A212BarSer[0] ;
         A13696BarNHdr = P097U16_A13696BarNHdr[0] ;
         A279CliNom = P097U16_A279CliNom[0] ;
         A252CliCod = P097U16_A252CliCod[0] ;
         n252CliCod = P097U16_n252CliCod[0] ;
         A13933BarCuadern = P097U16_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U16_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U16_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U16_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U16_A151BarFasCod[0] ;
         n151BarFasCod = P097U16_n151BarFasCod[0] ;
         A184BarMtr = P097U16_A184BarMtr[0] ;
         A166BarKgm = P097U16_A166BarKgm[0] ;
         A143BarDisNum = P097U16_A143BarDisNum[0] ;
         A4812BarEncCli = P097U16_A4812BarEncCli[0] ;
         A199BarPie1 = P097U16_A199BarPie1[0] ;
         A365DisDes = P097U16_A365DisDes[0] ;
         A898BarPieNDes = P097U16_A898BarPieNDes[0] ;
         A361DisCod = P097U16_A361DisCod[0] ;
         A130BarCodPar = P097U16_A130BarCodPar[0] ;
         A132BarCodReo = P097U16_A132BarCodReo[0] ;
         A129BarCod = P097U16_A129BarCod[0] ;
         A396EmprCod = P097U16_A396EmprCod[0] ;
         A13711BarTipArtD = P097U16_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U16_n13711BarTipArtD[0] ;
         A279CliNom = P097U16_A279CliNom[0] ;
         A13933BarCuadern = P097U16_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U16_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U16_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U16_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U16_A151BarFasCod[0] ;
         n151BarFasCod = P097U16_n151BarFasCod[0] ;
         A184BarMtr = P097U16_A184BarMtr[0] ;
         A166BarKgm = P097U16_A166BarKgm[0] ;
         A199BarPie1 = P097U16_A199BarPie1[0] ;
         A898BarPieNDes = P097U16_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
                                          {
                                             AV50Option = A13696BarNHdr ;
                                             AV49InsertIndex = 1 ;
                                             while ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) < 0 ) )
                                             {
                                                AV49InsertIndex = (int)(AV49InsertIndex+1) ;
                                             }
                                             if ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) == 0 ) )
                                             {
                                                AV58count = GXutil.lval( (String)AV56OptionIndexes.elementAt(-1+AV49InsertIndex)) ;
                                                AV58count = (long)(AV58count+1) ;
                                                AV56OptionIndexes.removeItem(AV49InsertIndex);
                                                AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), AV49InsertIndex);
                                             }
                                             else
                                             {
                                                AV51Options.add(AV50Option, AV49InsertIndex);
                                                AV56OptionIndexes.add("1", AV49InsertIndex);
                                             }
                                          }
                                          if ( AV51Options.size() == 50 )
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
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarSer = AV46SearchTxt ;
      AV15TFBarSer_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U21 */
      pr_default.execute(3, new Object[] {AV65Emprcod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk97U6 = false ;
         A4466BarAcaAnh = P097U21_A4466BarAcaAnh[0] ;
         A212BarSer = P097U21_A212BarSer[0] ;
         A213BarSit = P097U21_A213BarSit[0] ;
         A180BarMaqCod = P097U21_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U21_A158BarFecFpr[0] ;
         A155BarFecCli = P097U21_A155BarFecCli[0] ;
         A159BarFecGen = P097U21_A159BarFecGen[0] ;
         A1234BarNomCli = P097U21_A1234BarNomCli[0] ;
         A136BarColNum = P097U21_A136BarColNum[0] ;
         A135BarColNom = P097U21_A135BarColNom[0] ;
         A13711BarTipArtD = P097U21_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U21_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U21_A217BarTipArt[0] ;
         n217BarTipArt = P097U21_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U21_A1652BarSerDsc[0] ;
         A13696BarNHdr = P097U21_A13696BarNHdr[0] ;
         A279CliNom = P097U21_A279CliNom[0] ;
         A252CliCod = P097U21_A252CliCod[0] ;
         n252CliCod = P097U21_n252CliCod[0] ;
         A13933BarCuadern = P097U21_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U21_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U21_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U21_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U21_A151BarFasCod[0] ;
         n151BarFasCod = P097U21_n151BarFasCod[0] ;
         A184BarMtr = P097U21_A184BarMtr[0] ;
         A166BarKgm = P097U21_A166BarKgm[0] ;
         A143BarDisNum = P097U21_A143BarDisNum[0] ;
         A4812BarEncCli = P097U21_A4812BarEncCli[0] ;
         A199BarPie1 = P097U21_A199BarPie1[0] ;
         A365DisDes = P097U21_A365DisDes[0] ;
         A898BarPieNDes = P097U21_A898BarPieNDes[0] ;
         A361DisCod = P097U21_A361DisCod[0] ;
         A130BarCodPar = P097U21_A130BarCodPar[0] ;
         A132BarCodReo = P097U21_A132BarCodReo[0] ;
         A129BarCod = P097U21_A129BarCod[0] ;
         A396EmprCod = P097U21_A396EmprCod[0] ;
         A13711BarTipArtD = P097U21_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U21_n13711BarTipArtD[0] ;
         A279CliNom = P097U21_A279CliNom[0] ;
         A13933BarCuadern = P097U21_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U21_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U21_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U21_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U21_A151BarFasCod[0] ;
         n151BarFasCod = P097U21_n151BarFasCod[0] ;
         A184BarMtr = P097U21_A184BarMtr[0] ;
         A166BarKgm = P097U21_A166BarKgm[0] ;
         A199BarPie1 = P097U21_A199BarPie1[0] ;
         A898BarPieNDes = P097U21_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          AV58count = 0 ;
                                          while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P097U21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P097U21_A212BarSer[0], A212BarSer) == 0 ) )
                                          {
                                             brk97U6 = false ;
                                             A130BarCodPar = P097U21_A130BarCodPar[0] ;
                                             A132BarCodReo = P097U21_A132BarCodReo[0] ;
                                             A129BarCod = P097U21_A129BarCod[0] ;
                                             AV58count = (long)(AV58count+1) ;
                                             brk97U6 = true ;
                                             pr_default.readNext(3);
                                          }
                                          if ( ! (GXutil.strcmp("", A212BarSer)==0) )
                                          {
                                             AV50Option = A212BarSer ;
                                             AV51Options.add(AV50Option, 0);
                                             AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         if ( ! brk97U6 )
         {
            brk97U6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarSerDsc = AV46SearchTxt ;
      AV17TFBarSerDsc_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           A396EmprCod ,
                                           AV65Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U26 */
      pr_default.execute(4, new Object[] {AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), AV65Emprcod, Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk97U8 = false ;
         A4466BarAcaAnh = P097U26_A4466BarAcaAnh[0] ;
         A1652BarSerDsc = P097U26_A1652BarSerDsc[0] ;
         A213BarSit = P097U26_A213BarSit[0] ;
         A180BarMaqCod = P097U26_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U26_A158BarFecFpr[0] ;
         A155BarFecCli = P097U26_A155BarFecCli[0] ;
         A159BarFecGen = P097U26_A159BarFecGen[0] ;
         A1234BarNomCli = P097U26_A1234BarNomCli[0] ;
         A136BarColNum = P097U26_A136BarColNum[0] ;
         A135BarColNom = P097U26_A135BarColNom[0] ;
         A13711BarTipArtD = P097U26_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U26_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U26_A217BarTipArt[0] ;
         n217BarTipArt = P097U26_n217BarTipArt[0] ;
         A212BarSer = P097U26_A212BarSer[0] ;
         A13696BarNHdr = P097U26_A13696BarNHdr[0] ;
         A279CliNom = P097U26_A279CliNom[0] ;
         A252CliCod = P097U26_A252CliCod[0] ;
         n252CliCod = P097U26_n252CliCod[0] ;
         A13933BarCuadern = P097U26_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U26_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U26_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U26_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U26_A151BarFasCod[0] ;
         n151BarFasCod = P097U26_n151BarFasCod[0] ;
         A184BarMtr = P097U26_A184BarMtr[0] ;
         A166BarKgm = P097U26_A166BarKgm[0] ;
         A143BarDisNum = P097U26_A143BarDisNum[0] ;
         A4812BarEncCli = P097U26_A4812BarEncCli[0] ;
         A199BarPie1 = P097U26_A199BarPie1[0] ;
         A365DisDes = P097U26_A365DisDes[0] ;
         A898BarPieNDes = P097U26_A898BarPieNDes[0] ;
         A361DisCod = P097U26_A361DisCod[0] ;
         A130BarCodPar = P097U26_A130BarCodPar[0] ;
         A132BarCodReo = P097U26_A132BarCodReo[0] ;
         A129BarCod = P097U26_A129BarCod[0] ;
         A396EmprCod = P097U26_A396EmprCod[0] ;
         A13711BarTipArtD = P097U26_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U26_n13711BarTipArtD[0] ;
         A279CliNom = P097U26_A279CliNom[0] ;
         A13933BarCuadern = P097U26_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U26_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U26_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U26_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U26_A151BarFasCod[0] ;
         n151BarFasCod = P097U26_n151BarFasCod[0] ;
         A184BarMtr = P097U26_A184BarMtr[0] ;
         A166BarKgm = P097U26_A166BarKgm[0] ;
         A199BarPie1 = P097U26_A199BarPie1[0] ;
         A898BarPieNDes = P097U26_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          AV58count = 0 ;
                                          while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P097U26_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
                                          {
                                             brk97U8 = false ;
                                             A130BarCodPar = P097U26_A130BarCodPar[0] ;
                                             A132BarCodReo = P097U26_A132BarCodReo[0] ;
                                             A129BarCod = P097U26_A129BarCod[0] ;
                                             A396EmprCod = P097U26_A396EmprCod[0] ;
                                             AV58count = (long)(AV58count+1) ;
                                             brk97U8 = true ;
                                             pr_default.readNext(4);
                                          }
                                          if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
                                          {
                                             AV50Option = A1652BarSerDsc ;
                                             AV51Options.add(AV50Option, 0);
                                             AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         if ( ! brk97U8 )
         {
            brk97U8 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarTipArtDsc = AV46SearchTxt ;
      AV21TFBarTipArtDsc_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U31 */
      pr_default.execute(5, new Object[] {AV65Emprcod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk97U10 = false ;
         A4466BarAcaAnh = P097U31_A4466BarAcaAnh[0] ;
         A217BarTipArt = P097U31_A217BarTipArt[0] ;
         n217BarTipArt = P097U31_n217BarTipArt[0] ;
         A213BarSit = P097U31_A213BarSit[0] ;
         A180BarMaqCod = P097U31_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U31_A158BarFecFpr[0] ;
         A155BarFecCli = P097U31_A155BarFecCli[0] ;
         A159BarFecGen = P097U31_A159BarFecGen[0] ;
         A1234BarNomCli = P097U31_A1234BarNomCli[0] ;
         A136BarColNum = P097U31_A136BarColNum[0] ;
         A135BarColNom = P097U31_A135BarColNom[0] ;
         A13711BarTipArtD = P097U31_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U31_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P097U31_A1652BarSerDsc[0] ;
         A212BarSer = P097U31_A212BarSer[0] ;
         A13696BarNHdr = P097U31_A13696BarNHdr[0] ;
         A279CliNom = P097U31_A279CliNom[0] ;
         A252CliCod = P097U31_A252CliCod[0] ;
         n252CliCod = P097U31_n252CliCod[0] ;
         A13933BarCuadern = P097U31_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U31_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U31_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U31_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U31_A151BarFasCod[0] ;
         n151BarFasCod = P097U31_n151BarFasCod[0] ;
         A184BarMtr = P097U31_A184BarMtr[0] ;
         A166BarKgm = P097U31_A166BarKgm[0] ;
         A143BarDisNum = P097U31_A143BarDisNum[0] ;
         A4812BarEncCli = P097U31_A4812BarEncCli[0] ;
         A199BarPie1 = P097U31_A199BarPie1[0] ;
         A365DisDes = P097U31_A365DisDes[0] ;
         A898BarPieNDes = P097U31_A898BarPieNDes[0] ;
         A361DisCod = P097U31_A361DisCod[0] ;
         A130BarCodPar = P097U31_A130BarCodPar[0] ;
         A132BarCodReo = P097U31_A132BarCodReo[0] ;
         A129BarCod = P097U31_A129BarCod[0] ;
         A396EmprCod = P097U31_A396EmprCod[0] ;
         A13711BarTipArtD = P097U31_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U31_n13711BarTipArtD[0] ;
         A279CliNom = P097U31_A279CliNom[0] ;
         A13933BarCuadern = P097U31_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U31_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U31_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U31_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U31_A151BarFasCod[0] ;
         n151BarFasCod = P097U31_n151BarFasCod[0] ;
         A184BarMtr = P097U31_A184BarMtr[0] ;
         A166BarKgm = P097U31_A166BarKgm[0] ;
         A199BarPie1 = P097U31_A199BarPie1[0] ;
         A898BarPieNDes = P097U31_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          AV58count = 0 ;
                                          while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P097U31_A396EmprCod[0], A396EmprCod) == 0 ) && ( P097U31_A217BarTipArt[0] == A217BarTipArt ) )
                                          {
                                             brk97U10 = false ;
                                             A130BarCodPar = P097U31_A130BarCodPar[0] ;
                                             A132BarCodReo = P097U31_A132BarCodReo[0] ;
                                             A129BarCod = P097U31_A129BarCod[0] ;
                                             AV58count = (long)(AV58count+1) ;
                                             brk97U10 = true ;
                                             pr_default.readNext(5);
                                          }
                                          if ( ! (GXutil.strcmp("", A13711BarTipArtD)==0) )
                                          {
                                             AV50Option = A13711BarTipArtD ;
                                             AV49InsertIndex = 1 ;
                                             while ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) < 0 ) )
                                             {
                                                AV49InsertIndex = (int)(AV49InsertIndex+1) ;
                                             }
                                             AV51Options.add(AV50Option, AV49InsertIndex);
                                             AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), AV49InsertIndex);
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         if ( ! brk97U10 )
         {
            brk97U10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarColNom = AV46SearchTxt ;
      AV23TFBarColNom_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           A396EmprCod ,
                                           AV65Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U36 */
      pr_default.execute(6, new Object[] {AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), AV65Emprcod, Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk97U12 = false ;
         A4466BarAcaAnh = P097U36_A4466BarAcaAnh[0] ;
         A135BarColNom = P097U36_A135BarColNom[0] ;
         A213BarSit = P097U36_A213BarSit[0] ;
         A180BarMaqCod = P097U36_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U36_A158BarFecFpr[0] ;
         A155BarFecCli = P097U36_A155BarFecCli[0] ;
         A159BarFecGen = P097U36_A159BarFecGen[0] ;
         A1234BarNomCli = P097U36_A1234BarNomCli[0] ;
         A136BarColNum = P097U36_A136BarColNum[0] ;
         A13711BarTipArtD = P097U36_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U36_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U36_A217BarTipArt[0] ;
         n217BarTipArt = P097U36_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U36_A1652BarSerDsc[0] ;
         A212BarSer = P097U36_A212BarSer[0] ;
         A13696BarNHdr = P097U36_A13696BarNHdr[0] ;
         A279CliNom = P097U36_A279CliNom[0] ;
         A252CliCod = P097U36_A252CliCod[0] ;
         n252CliCod = P097U36_n252CliCod[0] ;
         A13933BarCuadern = P097U36_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U36_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U36_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U36_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U36_A151BarFasCod[0] ;
         n151BarFasCod = P097U36_n151BarFasCod[0] ;
         A184BarMtr = P097U36_A184BarMtr[0] ;
         A166BarKgm = P097U36_A166BarKgm[0] ;
         A143BarDisNum = P097U36_A143BarDisNum[0] ;
         A4812BarEncCli = P097U36_A4812BarEncCli[0] ;
         A199BarPie1 = P097U36_A199BarPie1[0] ;
         A365DisDes = P097U36_A365DisDes[0] ;
         A898BarPieNDes = P097U36_A898BarPieNDes[0] ;
         A361DisCod = P097U36_A361DisCod[0] ;
         A130BarCodPar = P097U36_A130BarCodPar[0] ;
         A132BarCodReo = P097U36_A132BarCodReo[0] ;
         A129BarCod = P097U36_A129BarCod[0] ;
         A396EmprCod = P097U36_A396EmprCod[0] ;
         A13711BarTipArtD = P097U36_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U36_n13711BarTipArtD[0] ;
         A279CliNom = P097U36_A279CliNom[0] ;
         A13933BarCuadern = P097U36_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U36_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U36_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U36_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U36_A151BarFasCod[0] ;
         n151BarFasCod = P097U36_n151BarFasCod[0] ;
         A184BarMtr = P097U36_A184BarMtr[0] ;
         A166BarKgm = P097U36_A166BarKgm[0] ;
         A199BarPie1 = P097U36_A199BarPie1[0] ;
         A898BarPieNDes = P097U36_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          AV58count = 0 ;
                                          while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P097U36_A135BarColNom[0], A135BarColNom) == 0 ) )
                                          {
                                             brk97U12 = false ;
                                             A130BarCodPar = P097U36_A130BarCodPar[0] ;
                                             A132BarCodReo = P097U36_A132BarCodReo[0] ;
                                             A129BarCod = P097U36_A129BarCod[0] ;
                                             A396EmprCod = P097U36_A396EmprCod[0] ;
                                             AV58count = (long)(AV58count+1) ;
                                             brk97U12 = true ;
                                             pr_default.readNext(6);
                                          }
                                          if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
                                          {
                                             AV50Option = A135BarColNom ;
                                             AV51Options.add(AV50Option, 0);
                                             AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         if ( ! brk97U12 )
         {
            brk97U12 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV30TFBarNomCli = AV46SearchTxt ;
      AV31TFBarNomCli_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           A396EmprCod ,
                                           AV65Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U41 */
      pr_default.execute(7, new Object[] {AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), AV65Emprcod, Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk97U14 = false ;
         A4466BarAcaAnh = P097U41_A4466BarAcaAnh[0] ;
         A1234BarNomCli = P097U41_A1234BarNomCli[0] ;
         A213BarSit = P097U41_A213BarSit[0] ;
         A180BarMaqCod = P097U41_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U41_A158BarFecFpr[0] ;
         A155BarFecCli = P097U41_A155BarFecCli[0] ;
         A159BarFecGen = P097U41_A159BarFecGen[0] ;
         A136BarColNum = P097U41_A136BarColNum[0] ;
         A135BarColNom = P097U41_A135BarColNom[0] ;
         A13711BarTipArtD = P097U41_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U41_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U41_A217BarTipArt[0] ;
         n217BarTipArt = P097U41_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U41_A1652BarSerDsc[0] ;
         A212BarSer = P097U41_A212BarSer[0] ;
         A13696BarNHdr = P097U41_A13696BarNHdr[0] ;
         A279CliNom = P097U41_A279CliNom[0] ;
         A252CliCod = P097U41_A252CliCod[0] ;
         n252CliCod = P097U41_n252CliCod[0] ;
         A13933BarCuadern = P097U41_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U41_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U41_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U41_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U41_A151BarFasCod[0] ;
         n151BarFasCod = P097U41_n151BarFasCod[0] ;
         A184BarMtr = P097U41_A184BarMtr[0] ;
         A166BarKgm = P097U41_A166BarKgm[0] ;
         A143BarDisNum = P097U41_A143BarDisNum[0] ;
         A4812BarEncCli = P097U41_A4812BarEncCli[0] ;
         A199BarPie1 = P097U41_A199BarPie1[0] ;
         A365DisDes = P097U41_A365DisDes[0] ;
         A898BarPieNDes = P097U41_A898BarPieNDes[0] ;
         A361DisCod = P097U41_A361DisCod[0] ;
         A130BarCodPar = P097U41_A130BarCodPar[0] ;
         A132BarCodReo = P097U41_A132BarCodReo[0] ;
         A129BarCod = P097U41_A129BarCod[0] ;
         A396EmprCod = P097U41_A396EmprCod[0] ;
         A13711BarTipArtD = P097U41_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U41_n13711BarTipArtD[0] ;
         A279CliNom = P097U41_A279CliNom[0] ;
         A13933BarCuadern = P097U41_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U41_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U41_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U41_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U41_A151BarFasCod[0] ;
         n151BarFasCod = P097U41_n151BarFasCod[0] ;
         A184BarMtr = P097U41_A184BarMtr[0] ;
         A166BarKgm = P097U41_A166BarKgm[0] ;
         A199BarPie1 = P097U41_A199BarPie1[0] ;
         A898BarPieNDes = P097U41_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          AV58count = 0 ;
                                          while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P097U41_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
                                          {
                                             brk97U14 = false ;
                                             A130BarCodPar = P097U41_A130BarCodPar[0] ;
                                             A132BarCodReo = P097U41_A132BarCodReo[0] ;
                                             A129BarCod = P097U41_A129BarCod[0] ;
                                             A396EmprCod = P097U41_A396EmprCod[0] ;
                                             AV58count = (long)(AV58count+1) ;
                                             brk97U14 = true ;
                                             pr_default.readNext(7);
                                          }
                                          if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
                                          {
                                             AV50Option = A1234BarNomCli ;
                                             AV51Options.add(AV50Option, 0);
                                             AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         if ( ! brk97U14 )
         {
            brk97U14 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADBARFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV44TFBarFasCod = AV46SearchTxt ;
      AV45TFBarFasCod_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U46 */
      pr_default.execute(8, new Object[] {AV65Emprcod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A4466BarAcaAnh = P097U46_A4466BarAcaAnh[0] ;
         A213BarSit = P097U46_A213BarSit[0] ;
         A180BarMaqCod = P097U46_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U46_A158BarFecFpr[0] ;
         A155BarFecCli = P097U46_A155BarFecCli[0] ;
         A159BarFecGen = P097U46_A159BarFecGen[0] ;
         A1234BarNomCli = P097U46_A1234BarNomCli[0] ;
         A136BarColNum = P097U46_A136BarColNum[0] ;
         A135BarColNom = P097U46_A135BarColNom[0] ;
         A13711BarTipArtD = P097U46_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U46_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U46_A217BarTipArt[0] ;
         n217BarTipArt = P097U46_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U46_A1652BarSerDsc[0] ;
         A212BarSer = P097U46_A212BarSer[0] ;
         A13696BarNHdr = P097U46_A13696BarNHdr[0] ;
         A279CliNom = P097U46_A279CliNom[0] ;
         A252CliCod = P097U46_A252CliCod[0] ;
         n252CliCod = P097U46_n252CliCod[0] ;
         A13933BarCuadern = P097U46_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U46_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U46_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U46_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U46_A151BarFasCod[0] ;
         n151BarFasCod = P097U46_n151BarFasCod[0] ;
         A184BarMtr = P097U46_A184BarMtr[0] ;
         A166BarKgm = P097U46_A166BarKgm[0] ;
         A143BarDisNum = P097U46_A143BarDisNum[0] ;
         A4812BarEncCli = P097U46_A4812BarEncCli[0] ;
         A199BarPie1 = P097U46_A199BarPie1[0] ;
         A365DisDes = P097U46_A365DisDes[0] ;
         A898BarPieNDes = P097U46_A898BarPieNDes[0] ;
         A361DisCod = P097U46_A361DisCod[0] ;
         A130BarCodPar = P097U46_A130BarCodPar[0] ;
         A132BarCodReo = P097U46_A132BarCodReo[0] ;
         A129BarCod = P097U46_A129BarCod[0] ;
         A396EmprCod = P097U46_A396EmprCod[0] ;
         A13711BarTipArtD = P097U46_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U46_n13711BarTipArtD[0] ;
         A279CliNom = P097U46_A279CliNom[0] ;
         A13933BarCuadern = P097U46_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U46_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U46_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U46_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U46_A151BarFasCod[0] ;
         n151BarFasCod = P097U46_n151BarFasCod[0] ;
         A184BarMtr = P097U46_A184BarMtr[0] ;
         A166BarKgm = P097U46_A166BarKgm[0] ;
         A199BarPie1 = P097U46_A199BarPie1[0] ;
         A898BarPieNDes = P097U46_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          if ( ! (GXutil.strcmp("", A151BarFasCod)==0) )
                                          {
                                             AV50Option = A151BarFasCod ;
                                             AV49InsertIndex = 1 ;
                                             while ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) < 0 ) )
                                             {
                                                AV49InsertIndex = (int)(AV49InsertIndex+1) ;
                                             }
                                             if ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) == 0 ) )
                                             {
                                                AV58count = GXutil.lval( (String)AV56OptionIndexes.elementAt(-1+AV49InsertIndex)) ;
                                                AV58count = (long)(AV58count+1) ;
                                                AV56OptionIndexes.removeItem(AV49InsertIndex);
                                                AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), AV49InsertIndex);
                                             }
                                             else
                                             {
                                                AV51Options.add(AV50Option, AV49InsertIndex);
                                                AV56OptionIndexes.add("1", AV49InsertIndex);
                                             }
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADBARMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV76TFBarMaqCod = AV46SearchTxt ;
      AV77TFBarMaqCod_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U51 */
      pr_default.execute(9, new Object[] {AV65Emprcod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk97U17 = false ;
         A4466BarAcaAnh = P097U51_A4466BarAcaAnh[0] ;
         A180BarMaqCod = P097U51_A180BarMaqCod[0] ;
         A213BarSit = P097U51_A213BarSit[0] ;
         A158BarFecFpr = P097U51_A158BarFecFpr[0] ;
         A155BarFecCli = P097U51_A155BarFecCli[0] ;
         A159BarFecGen = P097U51_A159BarFecGen[0] ;
         A1234BarNomCli = P097U51_A1234BarNomCli[0] ;
         A136BarColNum = P097U51_A136BarColNum[0] ;
         A135BarColNom = P097U51_A135BarColNom[0] ;
         A13711BarTipArtD = P097U51_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U51_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U51_A217BarTipArt[0] ;
         n217BarTipArt = P097U51_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U51_A1652BarSerDsc[0] ;
         A212BarSer = P097U51_A212BarSer[0] ;
         A13696BarNHdr = P097U51_A13696BarNHdr[0] ;
         A279CliNom = P097U51_A279CliNom[0] ;
         A252CliCod = P097U51_A252CliCod[0] ;
         n252CliCod = P097U51_n252CliCod[0] ;
         A13933BarCuadern = P097U51_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U51_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U51_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U51_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U51_A151BarFasCod[0] ;
         n151BarFasCod = P097U51_n151BarFasCod[0] ;
         A184BarMtr = P097U51_A184BarMtr[0] ;
         A166BarKgm = P097U51_A166BarKgm[0] ;
         A143BarDisNum = P097U51_A143BarDisNum[0] ;
         A4812BarEncCli = P097U51_A4812BarEncCli[0] ;
         A199BarPie1 = P097U51_A199BarPie1[0] ;
         A365DisDes = P097U51_A365DisDes[0] ;
         A898BarPieNDes = P097U51_A898BarPieNDes[0] ;
         A361DisCod = P097U51_A361DisCod[0] ;
         A130BarCodPar = P097U51_A130BarCodPar[0] ;
         A132BarCodReo = P097U51_A132BarCodReo[0] ;
         A129BarCod = P097U51_A129BarCod[0] ;
         A396EmprCod = P097U51_A396EmprCod[0] ;
         A13711BarTipArtD = P097U51_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U51_n13711BarTipArtD[0] ;
         A279CliNom = P097U51_A279CliNom[0] ;
         A13933BarCuadern = P097U51_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U51_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U51_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U51_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U51_A151BarFasCod[0] ;
         n151BarFasCod = P097U51_n151BarFasCod[0] ;
         A184BarMtr = P097U51_A184BarMtr[0] ;
         A166BarKgm = P097U51_A166BarKgm[0] ;
         A199BarPie1 = P097U51_A199BarPie1[0] ;
         A898BarPieNDes = P097U51_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          AV58count = 0 ;
                                          while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P097U51_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P097U51_A180BarMaqCod[0], A180BarMaqCod) == 0 ) )
                                          {
                                             brk97U17 = false ;
                                             A130BarCodPar = P097U51_A130BarCodPar[0] ;
                                             A132BarCodReo = P097U51_A132BarCodReo[0] ;
                                             A129BarCod = P097U51_A129BarCod[0] ;
                                             AV58count = (long)(AV58count+1) ;
                                             brk97U17 = true ;
                                             pr_default.readNext(9);
                                          }
                                          if ( ! (GXutil.strcmp("", A180BarMaqCod)==0) )
                                          {
                                             AV50Option = A180BarMaqCod ;
                                             AV51Options.add(AV50Option, 0);
                                             AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         if ( ! brk97U17 )
         {
            brk97U17 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADBARCUADERNOOPTIONS' Routine */
      returnInSub = false ;
      AV92TFBarCuaderno = AV46SearchTxt ;
      AV93TFBarCuaderno_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U56 */
      pr_default.execute(10, new Object[] {AV65Emprcod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A4466BarAcaAnh = P097U56_A4466BarAcaAnh[0] ;
         A213BarSit = P097U56_A213BarSit[0] ;
         A180BarMaqCod = P097U56_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U56_A158BarFecFpr[0] ;
         A155BarFecCli = P097U56_A155BarFecCli[0] ;
         A159BarFecGen = P097U56_A159BarFecGen[0] ;
         A1234BarNomCli = P097U56_A1234BarNomCli[0] ;
         A136BarColNum = P097U56_A136BarColNum[0] ;
         A135BarColNom = P097U56_A135BarColNom[0] ;
         A13711BarTipArtD = P097U56_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U56_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U56_A217BarTipArt[0] ;
         n217BarTipArt = P097U56_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U56_A1652BarSerDsc[0] ;
         A212BarSer = P097U56_A212BarSer[0] ;
         A13696BarNHdr = P097U56_A13696BarNHdr[0] ;
         A279CliNom = P097U56_A279CliNom[0] ;
         A252CliCod = P097U56_A252CliCod[0] ;
         n252CliCod = P097U56_n252CliCod[0] ;
         A13933BarCuadern = P097U56_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U56_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U56_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U56_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U56_A151BarFasCod[0] ;
         n151BarFasCod = P097U56_n151BarFasCod[0] ;
         A184BarMtr = P097U56_A184BarMtr[0] ;
         A166BarKgm = P097U56_A166BarKgm[0] ;
         A143BarDisNum = P097U56_A143BarDisNum[0] ;
         A4812BarEncCli = P097U56_A4812BarEncCli[0] ;
         A199BarPie1 = P097U56_A199BarPie1[0] ;
         A365DisDes = P097U56_A365DisDes[0] ;
         A898BarPieNDes = P097U56_A898BarPieNDes[0] ;
         A361DisCod = P097U56_A361DisCod[0] ;
         A130BarCodPar = P097U56_A130BarCodPar[0] ;
         A132BarCodReo = P097U56_A132BarCodReo[0] ;
         A129BarCod = P097U56_A129BarCod[0] ;
         A396EmprCod = P097U56_A396EmprCod[0] ;
         A13711BarTipArtD = P097U56_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U56_n13711BarTipArtD[0] ;
         A279CliNom = P097U56_A279CliNom[0] ;
         A13933BarCuadern = P097U56_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U56_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U56_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U56_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U56_A151BarFasCod[0] ;
         n151BarFasCod = P097U56_n151BarFasCod[0] ;
         A184BarMtr = P097U56_A184BarMtr[0] ;
         A166BarKgm = P097U56_A166BarKgm[0] ;
         A199BarPie1 = P097U56_A199BarPie1[0] ;
         A898BarPieNDes = P097U56_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          if ( ! (GXutil.strcmp("", A13933BarCuadern)==0) )
                                          {
                                             AV50Option = A13933BarCuadern ;
                                             AV49InsertIndex = 1 ;
                                             while ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) < 0 ) )
                                             {
                                                AV49InsertIndex = (int)(AV49InsertIndex+1) ;
                                             }
                                             if ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) == 0 ) )
                                             {
                                                AV58count = GXutil.lval( (String)AV56OptionIndexes.elementAt(-1+AV49InsertIndex)) ;
                                                AV58count = (long)(AV58count+1) ;
                                                AV56OptionIndexes.removeItem(AV49InsertIndex);
                                                AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), AV49InsertIndex);
                                             }
                                             else
                                             {
                                                AV51Options.add(AV50Option, AV49InsertIndex);
                                                AV56OptionIndexes.add("1", AV49InsertIndex);
                                             }
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S231( )
   {
      /* 'LOADBARNORMASOPTIONS' Routine */
      returnInSub = false ;
      AV94TFBarNormas = AV46SearchTxt ;
      AV95TFBarNormas_Sel = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = AV64FilterFullText ;
      AV103Listadodehdrs_wcds_2_tfclicod = AV10TFCliCod ;
      AV104Listadodehdrs_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV105Listadodehdrs_wcds_4_tfclinom = AV12TFCliNom ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = AV84TFPedidoCliente ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = AV85TFPedidoCliente_Sel ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = AV74TFBarNHdr ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = AV75TFBarNHdr_Sel ;
      AV111Listadodehdrs_wcds_10_tfbarser = AV14TFBarSer ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = AV15TFBarSer_Sel ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = AV16TFBarSerDsc ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = AV17TFBarSerDsc_Sel ;
      AV115Listadodehdrs_wcds_14_tfbartipart = AV18TFBarTipArt ;
      AV116Listadodehdrs_wcds_15_tfbartipart_to = AV19TFBarTipArt_To ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = AV20TFBarTipArtDsc ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV21TFBarTipArtDsc_Sel ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = AV22TFBarColNom ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = AV23TFBarColNom_Sel ;
      AV121Listadodehdrs_wcds_20_tfbarcolnum = AV24TFBarColNum ;
      AV122Listadodehdrs_wcds_21_tfbarcolnum_to = AV25TFBarColNum_To ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = AV30TFBarNomCli ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = AV32TFBarKgm ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = AV33TFBarKgm_To ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = AV34TFBarMtr ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = AV35TFBarMtr_To ;
      AV129Listadodehdrs_wcds_28_tfbarpie = AV36TFBarPie ;
      AV130Listadodehdrs_wcds_29_tfbarpie_to = AV37TFBarPie_To ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = AV38TFBarFecGen ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = AV40TFBarFecCli ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = AV42TFBarFecFpr ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = AV44TFBarFasCod ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = AV45TFBarFasCod_Sel ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = AV76TFBarMaqCod ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV77TFBarMaqCod_Sel ;
      AV138Listadodehdrs_wcds_37_tfbarsit = AV78TFBarSit ;
      AV139Listadodehdrs_wcds_38_tfbarsit_to = AV79TFBarSit_To ;
      AV140Listadodehdrs_wcds_39_tfbaralbultimo = AV86TFBarAlbUltimo ;
      AV141Listadodehdrs_wcds_40_tfbaralbultimo_to = AV87TFBarAlbUltimo_To ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = AV88TFBarAlbMts ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = AV89TFBarAlbMts_To ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = AV90TFBarAlbKgs ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = AV91TFBarAlbKgs_To ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = AV92TFBarCuaderno ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV93TFBarCuaderno_Sel ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = AV94TFBarNormas ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = AV95TFBarNormas_Sel ;
      AV150Listadodehdrs_wcds_49_tfbaralbfact = AV96TFBarAlbFact ;
      AV151Listadodehdrs_wcds_50_tfbaralbfact_to = AV97TFBarAlbFact_To ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV105Listadodehdrs_wcds_4_tfclinom ,
                                           AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV111Listadodehdrs_wcds_10_tfbarser ,
                                           AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV129Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV130Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV140Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV150Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV151Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV68BarFecGen ,
                                           AV69BarFecGen_to ,
                                           AV72BarFecCli ,
                                           AV73BarFecCli_to ,
                                           Integer.valueOf(AV70Clicod) ,
                                           Integer.valueOf(AV71Clicod_to) ,
                                           Byte.valueOf(AV66BarSit) ,
                                           Byte.valueOf(AV67BarSit_to) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV134Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV134Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV146Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV105Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV105Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV111Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV111Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV119Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV136Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097U61 */
      pr_default.execute(11, new Object[] {AV65Emprcod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV134Listadodehdrs_wcds_33_tfbarfascod, lV134Listadodehdrs_wcds_33_tfbarfascod, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV135Listadodehdrs_wcds_34_tfbarfascod_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV146Listadodehdrs_wcds_45_tfbarcuaderno, lV146Listadodehdrs_wcds_45_tfbarcuaderno, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV68BarFecGen, AV69BarFecGen_to, AV72BarFecCli, AV73BarFecCli_to, AV73BarFecCli_to, Integer.valueOf(AV70Clicod), Integer.valueOf(AV71Clicod_to), Byte.valueOf(AV66BarSit), Byte.valueOf(AV67BarSit_to), Integer.valueOf(AV103Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV104Listadodehdrs_wcds_3_tfclicod_to), lV105Listadodehdrs_wcds_4_tfclinom, AV106Listadodehdrs_wcds_5_tfclinom_sel, lV109Listadodehdrs_wcds_8_tfbarnhdr, AV110Listadodehdrs_wcds_9_tfbarnhdr_sel, lV111Listadodehdrs_wcds_10_tfbarser, AV112Listadodehdrs_wcds_11_tfbarser_sel, lV113Listadodehdrs_wcds_12_tfbarserdsc, AV114Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV115Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV116Listadodehdrs_wcds_15_tfbartipart_to), lV117Listadodehdrs_wcds_16_tfbartipartdsc, AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV119Listadodehdrs_wcds_18_tfbarcolnom, AV120Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV121Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV122Listadodehdrs_wcds_21_tfbarcolnum_to), lV123Listadodehdrs_wcds_22_tfbarnomcli, AV124Listadodehdrs_wcds_23_tfbarnomcli_sel, AV125Listadodehdrs_wcds_24_tfbarkgm, AV126Listadodehdrs_wcds_25_tfbarkgm_to, AV127Listadodehdrs_wcds_26_tfbarmtr, AV128Listadodehdrs_wcds_27_tfbarmtr_to, AV131Listadodehdrs_wcds_30_tfbarfecgen, AV132Listadodehdrs_wcds_31_tfbarfeccli, AV133Listadodehdrs_wcds_32_tfbarfecfpr, lV136Listadodehdrs_wcds_35_tfbarmaqcod, AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV138Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV139Listadodehdrs_wcds_38_tfbarsit_to), AV142Listadodehdrs_wcds_41_tfbaralbmts, AV143Listadodehdrs_wcds_42_tfbaralbmts_to, AV144Listadodehdrs_wcds_43_tfbaralbkgs, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A4466BarAcaAnh = P097U61_A4466BarAcaAnh[0] ;
         A213BarSit = P097U61_A213BarSit[0] ;
         A180BarMaqCod = P097U61_A180BarMaqCod[0] ;
         A158BarFecFpr = P097U61_A158BarFecFpr[0] ;
         A155BarFecCli = P097U61_A155BarFecCli[0] ;
         A159BarFecGen = P097U61_A159BarFecGen[0] ;
         A1234BarNomCli = P097U61_A1234BarNomCli[0] ;
         A136BarColNum = P097U61_A136BarColNum[0] ;
         A135BarColNom = P097U61_A135BarColNom[0] ;
         A13711BarTipArtD = P097U61_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U61_n13711BarTipArtD[0] ;
         A217BarTipArt = P097U61_A217BarTipArt[0] ;
         n217BarTipArt = P097U61_n217BarTipArt[0] ;
         A1652BarSerDsc = P097U61_A1652BarSerDsc[0] ;
         A212BarSer = P097U61_A212BarSer[0] ;
         A13696BarNHdr = P097U61_A13696BarNHdr[0] ;
         A279CliNom = P097U61_A279CliNom[0] ;
         A252CliCod = P097U61_A252CliCod[0] ;
         n252CliCod = P097U61_n252CliCod[0] ;
         A13933BarCuadern = P097U61_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U61_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U61_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U61_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U61_A151BarFasCod[0] ;
         n151BarFasCod = P097U61_n151BarFasCod[0] ;
         A184BarMtr = P097U61_A184BarMtr[0] ;
         A166BarKgm = P097U61_A166BarKgm[0] ;
         A143BarDisNum = P097U61_A143BarDisNum[0] ;
         A4812BarEncCli = P097U61_A4812BarEncCli[0] ;
         A199BarPie1 = P097U61_A199BarPie1[0] ;
         A365DisDes = P097U61_A365DisDes[0] ;
         A898BarPieNDes = P097U61_A898BarPieNDes[0] ;
         A361DisCod = P097U61_A361DisCod[0] ;
         A130BarCodPar = P097U61_A130BarCodPar[0] ;
         A132BarCodReo = P097U61_A132BarCodReo[0] ;
         A129BarCod = P097U61_A129BarCod[0] ;
         A396EmprCod = P097U61_A396EmprCod[0] ;
         A13711BarTipArtD = P097U61_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097U61_n13711BarTipArtD[0] ;
         A279CliNom = P097U61_A279CliNom[0] ;
         A13933BarCuadern = P097U61_A13933BarCuadern[0] ;
         n13933BarCuadern = P097U61_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097U61_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097U61_A13931BarAlbMts[0] ;
         A151BarFasCod = P097U61_A151BarFasCod[0] ;
         n151BarFasCod = P097U61_n151BarFasCod[0] ;
         A184BarMtr = P097U61_A184BarMtr[0] ;
         A166BarKgm = P097U61_A166BarKgm[0] ;
         A199BarPie1 = P097U61_A199BarPie1[0] ;
         A898BarPieNDes = P097U61_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         listadodehdrs_wcgetfilterdata.this.A396EmprCod = GXv_char6[0] ;
         listadodehdrs_wcgetfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         listadodehdrs_wcgetfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV107Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV107Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV108Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV108Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcgetfilterdata.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV140Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV140Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV141Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcgetfilterdata.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV148Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV148Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV149Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV149Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcgetfilterdata.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV150Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV150Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV151Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV151Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV102Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV102Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV102Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV129Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV129Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV130Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV130Listadodehdrs_wcds_29_tfbarpie_to ) ) )
                                       {
                                          if ( ! (GXutil.strcmp("", A13934BarNormas)==0) )
                                          {
                                             AV50Option = A13934BarNormas ;
                                             AV49InsertIndex = 1 ;
                                             while ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) < 0 ) )
                                             {
                                                AV49InsertIndex = (int)(AV49InsertIndex+1) ;
                                             }
                                             if ( ( AV49InsertIndex <= AV51Options.size() ) && ( GXutil.strcmp((String)AV51Options.elementAt(-1+AV49InsertIndex), AV50Option) == 0 ) )
                                             {
                                                AV58count = GXutil.lval( (String)AV56OptionIndexes.elementAt(-1+AV49InsertIndex)) ;
                                                AV58count = (long)(AV58count+1) ;
                                                AV56OptionIndexes.removeItem(AV49InsertIndex);
                                                AV56OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV58count), "Z,ZZZ,ZZZ,ZZ9")), AV49InsertIndex);
                                             }
                                             else
                                             {
                                                AV51Options.add(AV50Option, AV49InsertIndex);
                                                AV56OptionIndexes.add("1", AV49InsertIndex);
                                             }
                                          }
                                          if ( AV51Options.size() == 50 )
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
                  }
               }
            }
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP3[0] = listadodehdrs_wcgetfilterdata.this.AV52OptionsJson;
      this.aP4[0] = listadodehdrs_wcgetfilterdata.this.AV55OptionsDescJson;
      this.aP5[0] = listadodehdrs_wcgetfilterdata.this.AV57OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV52OptionsJson = "" ;
      AV55OptionsDescJson = "" ;
      AV57OptionIndexesJson = "" ;
      AV51Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV59Session = httpContext.getWebSession();
      AV61GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV62GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV64FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV84TFPedidoCliente = "" ;
      AV85TFPedidoCliente_Sel = "" ;
      AV74TFBarNHdr = "" ;
      AV75TFBarNHdr_Sel = "" ;
      AV14TFBarSer = "" ;
      AV15TFBarSer_Sel = "" ;
      AV16TFBarSerDsc = "" ;
      AV17TFBarSerDsc_Sel = "" ;
      AV20TFBarTipArtDsc = "" ;
      AV21TFBarTipArtDsc_Sel = "" ;
      AV22TFBarColNom = "" ;
      AV23TFBarColNom_Sel = "" ;
      AV30TFBarNomCli = "" ;
      AV31TFBarNomCli_Sel = "" ;
      AV32TFBarKgm = DecimalUtil.ZERO ;
      AV33TFBarKgm_To = DecimalUtil.ZERO ;
      AV34TFBarMtr = DecimalUtil.ZERO ;
      AV35TFBarMtr_To = DecimalUtil.ZERO ;
      AV38TFBarFecGen = GXutil.nullDate() ;
      AV40TFBarFecCli = GXutil.nullDate() ;
      AV42TFBarFecFpr = GXutil.nullDate() ;
      AV44TFBarFasCod = "" ;
      AV45TFBarFasCod_Sel = "" ;
      AV76TFBarMaqCod = "" ;
      AV77TFBarMaqCod_Sel = "" ;
      AV88TFBarAlbMts = DecimalUtil.ZERO ;
      AV89TFBarAlbMts_To = DecimalUtil.ZERO ;
      AV90TFBarAlbKgs = DecimalUtil.ZERO ;
      AV91TFBarAlbKgs_To = DecimalUtil.ZERO ;
      AV92TFBarCuaderno = "" ;
      AV93TFBarCuaderno_Sel = "" ;
      AV94TFBarNormas = "" ;
      AV95TFBarNormas_Sel = "" ;
      AV65Emprcod = "" ;
      AV68BarFecGen = GXutil.nullDate() ;
      AV69BarFecGen_to = GXutil.nullDate() ;
      AV72BarFecCli = GXutil.nullDate() ;
      AV73BarFecCli_to = GXutil.nullDate() ;
      A279CliNom = "" ;
      AV102Listadodehdrs_wcds_1_filterfulltext = "" ;
      AV105Listadodehdrs_wcds_4_tfclinom = "" ;
      AV106Listadodehdrs_wcds_5_tfclinom_sel = "" ;
      AV107Listadodehdrs_wcds_6_tfpedidocliente = "" ;
      AV108Listadodehdrs_wcds_7_tfpedidocliente_sel = "" ;
      AV109Listadodehdrs_wcds_8_tfbarnhdr = "" ;
      AV110Listadodehdrs_wcds_9_tfbarnhdr_sel = "" ;
      AV111Listadodehdrs_wcds_10_tfbarser = "" ;
      AV112Listadodehdrs_wcds_11_tfbarser_sel = "" ;
      AV113Listadodehdrs_wcds_12_tfbarserdsc = "" ;
      AV114Listadodehdrs_wcds_13_tfbarserdsc_sel = "" ;
      AV117Listadodehdrs_wcds_16_tfbartipartdsc = "" ;
      AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel = "" ;
      AV119Listadodehdrs_wcds_18_tfbarcolnom = "" ;
      AV120Listadodehdrs_wcds_19_tfbarcolnom_sel = "" ;
      AV123Listadodehdrs_wcds_22_tfbarnomcli = "" ;
      AV124Listadodehdrs_wcds_23_tfbarnomcli_sel = "" ;
      AV125Listadodehdrs_wcds_24_tfbarkgm = DecimalUtil.ZERO ;
      AV126Listadodehdrs_wcds_25_tfbarkgm_to = DecimalUtil.ZERO ;
      AV127Listadodehdrs_wcds_26_tfbarmtr = DecimalUtil.ZERO ;
      AV128Listadodehdrs_wcds_27_tfbarmtr_to = DecimalUtil.ZERO ;
      AV131Listadodehdrs_wcds_30_tfbarfecgen = GXutil.nullDate() ;
      AV132Listadodehdrs_wcds_31_tfbarfeccli = GXutil.nullDate() ;
      AV133Listadodehdrs_wcds_32_tfbarfecfpr = GXutil.nullDate() ;
      AV134Listadodehdrs_wcds_33_tfbarfascod = "" ;
      AV135Listadodehdrs_wcds_34_tfbarfascod_sel = "" ;
      AV136Listadodehdrs_wcds_35_tfbarmaqcod = "" ;
      AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel = "" ;
      AV142Listadodehdrs_wcds_41_tfbaralbmts = DecimalUtil.ZERO ;
      AV143Listadodehdrs_wcds_42_tfbaralbmts_to = DecimalUtil.ZERO ;
      AV144Listadodehdrs_wcds_43_tfbaralbkgs = DecimalUtil.ZERO ;
      AV145Listadodehdrs_wcds_44_tfbaralbkgs_to = DecimalUtil.ZERO ;
      AV146Listadodehdrs_wcds_45_tfbarcuaderno = "" ;
      AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel = "" ;
      AV148Listadodehdrs_wcds_47_tfbarnormas = "" ;
      AV149Listadodehdrs_wcds_48_tfbarnormas_sel = "" ;
      scmdbuf = "" ;
      lV134Listadodehdrs_wcds_33_tfbarfascod = "" ;
      lV146Listadodehdrs_wcds_45_tfbarcuaderno = "" ;
      lV105Listadodehdrs_wcds_4_tfclinom = "" ;
      lV109Listadodehdrs_wcds_8_tfbarnhdr = "" ;
      lV111Listadodehdrs_wcds_10_tfbarser = "" ;
      lV113Listadodehdrs_wcds_12_tfbarserdsc = "" ;
      lV117Listadodehdrs_wcds_16_tfbartipartdsc = "" ;
      lV119Listadodehdrs_wcds_18_tfbarcolnom = "" ;
      lV123Listadodehdrs_wcds_22_tfbarnomcli = "" ;
      lV136Listadodehdrs_wcds_35_tfbarmaqcod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      A13931BarAlbMts = DecimalUtil.ZERO ;
      A13932BarAlbKgs = DecimalUtil.ZERO ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A151BarFasCod = "" ;
      A13933BarCuadern = "" ;
      A13934BarNormas = "" ;
      A396EmprCod = "" ;
      P097U6_A9713Tb1_Cod = new short[1] ;
      P097U6_A4466BarAcaAnh = new short[1] ;
      P097U6_A279CliNom = new String[] {""} ;
      P097U6_A213BarSit = new byte[1] ;
      P097U6_A180BarMaqCod = new String[] {""} ;
      P097U6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U6_A1234BarNomCli = new String[] {""} ;
      P097U6_A136BarColNum = new int[1] ;
      P097U6_A135BarColNom = new String[] {""} ;
      P097U6_A13711BarTipArtD = new String[] {""} ;
      P097U6_n13711BarTipArtD = new boolean[] {false} ;
      P097U6_A217BarTipArt = new short[1] ;
      P097U6_n217BarTipArt = new boolean[] {false} ;
      P097U6_A1652BarSerDsc = new String[] {""} ;
      P097U6_A212BarSer = new String[] {""} ;
      P097U6_A13696BarNHdr = new String[] {""} ;
      P097U6_A252CliCod = new int[1] ;
      P097U6_n252CliCod = new boolean[] {false} ;
      P097U6_A13933BarCuadern = new String[] {""} ;
      P097U6_n13933BarCuadern = new boolean[] {false} ;
      P097U6_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U6_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U6_A151BarFasCod = new String[] {""} ;
      P097U6_n151BarFasCod = new boolean[] {false} ;
      P097U6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U6_A143BarDisNum = new String[] {""} ;
      P097U6_A4812BarEncCli = new String[] {""} ;
      P097U6_A199BarPie1 = new short[1] ;
      P097U6_A365DisDes = new String[] {""} ;
      P097U6_A898BarPieNDes = new int[1] ;
      P097U6_A361DisCod = new int[1] ;
      P097U6_A130BarCodPar = new String[] {""} ;
      P097U6_A132BarCodReo = new byte[1] ;
      P097U6_A129BarCod = new int[1] ;
      P097U6_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A365DisDes = "" ;
      AV50Option = "" ;
      P097U11_A9713Tb1_Cod = new short[1] ;
      P097U11_A4466BarAcaAnh = new short[1] ;
      P097U11_A213BarSit = new byte[1] ;
      P097U11_A180BarMaqCod = new String[] {""} ;
      P097U11_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U11_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U11_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U11_A1234BarNomCli = new String[] {""} ;
      P097U11_A136BarColNum = new int[1] ;
      P097U11_A135BarColNom = new String[] {""} ;
      P097U11_A13711BarTipArtD = new String[] {""} ;
      P097U11_n13711BarTipArtD = new boolean[] {false} ;
      P097U11_A217BarTipArt = new short[1] ;
      P097U11_n217BarTipArt = new boolean[] {false} ;
      P097U11_A1652BarSerDsc = new String[] {""} ;
      P097U11_A212BarSer = new String[] {""} ;
      P097U11_A13696BarNHdr = new String[] {""} ;
      P097U11_A279CliNom = new String[] {""} ;
      P097U11_A252CliCod = new int[1] ;
      P097U11_n252CliCod = new boolean[] {false} ;
      P097U11_A13933BarCuadern = new String[] {""} ;
      P097U11_n13933BarCuadern = new boolean[] {false} ;
      P097U11_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U11_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U11_A151BarFasCod = new String[] {""} ;
      P097U11_n151BarFasCod = new boolean[] {false} ;
      P097U11_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U11_A143BarDisNum = new String[] {""} ;
      P097U11_A4812BarEncCli = new String[] {""} ;
      P097U11_A199BarPie1 = new short[1] ;
      P097U11_A365DisDes = new String[] {""} ;
      P097U11_A898BarPieNDes = new int[1] ;
      P097U11_A361DisCod = new int[1] ;
      P097U11_A130BarCodPar = new String[] {""} ;
      P097U11_A132BarCodReo = new byte[1] ;
      P097U11_A129BarCod = new int[1] ;
      P097U11_A396EmprCod = new String[] {""} ;
      P097U16_A9713Tb1_Cod = new short[1] ;
      P097U16_A4466BarAcaAnh = new short[1] ;
      P097U16_A213BarSit = new byte[1] ;
      P097U16_A180BarMaqCod = new String[] {""} ;
      P097U16_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U16_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U16_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U16_A1234BarNomCli = new String[] {""} ;
      P097U16_A136BarColNum = new int[1] ;
      P097U16_A135BarColNom = new String[] {""} ;
      P097U16_A13711BarTipArtD = new String[] {""} ;
      P097U16_n13711BarTipArtD = new boolean[] {false} ;
      P097U16_A217BarTipArt = new short[1] ;
      P097U16_n217BarTipArt = new boolean[] {false} ;
      P097U16_A1652BarSerDsc = new String[] {""} ;
      P097U16_A212BarSer = new String[] {""} ;
      P097U16_A13696BarNHdr = new String[] {""} ;
      P097U16_A279CliNom = new String[] {""} ;
      P097U16_A252CliCod = new int[1] ;
      P097U16_n252CliCod = new boolean[] {false} ;
      P097U16_A13933BarCuadern = new String[] {""} ;
      P097U16_n13933BarCuadern = new boolean[] {false} ;
      P097U16_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U16_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U16_A151BarFasCod = new String[] {""} ;
      P097U16_n151BarFasCod = new boolean[] {false} ;
      P097U16_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U16_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U16_A143BarDisNum = new String[] {""} ;
      P097U16_A4812BarEncCli = new String[] {""} ;
      P097U16_A199BarPie1 = new short[1] ;
      P097U16_A365DisDes = new String[] {""} ;
      P097U16_A898BarPieNDes = new int[1] ;
      P097U16_A361DisCod = new int[1] ;
      P097U16_A130BarCodPar = new String[] {""} ;
      P097U16_A132BarCodReo = new byte[1] ;
      P097U16_A129BarCod = new int[1] ;
      P097U16_A396EmprCod = new String[] {""} ;
      P097U21_A9713Tb1_Cod = new short[1] ;
      P097U21_A4466BarAcaAnh = new short[1] ;
      P097U21_A212BarSer = new String[] {""} ;
      P097U21_A213BarSit = new byte[1] ;
      P097U21_A180BarMaqCod = new String[] {""} ;
      P097U21_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U21_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U21_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U21_A1234BarNomCli = new String[] {""} ;
      P097U21_A136BarColNum = new int[1] ;
      P097U21_A135BarColNom = new String[] {""} ;
      P097U21_A13711BarTipArtD = new String[] {""} ;
      P097U21_n13711BarTipArtD = new boolean[] {false} ;
      P097U21_A217BarTipArt = new short[1] ;
      P097U21_n217BarTipArt = new boolean[] {false} ;
      P097U21_A1652BarSerDsc = new String[] {""} ;
      P097U21_A13696BarNHdr = new String[] {""} ;
      P097U21_A279CliNom = new String[] {""} ;
      P097U21_A252CliCod = new int[1] ;
      P097U21_n252CliCod = new boolean[] {false} ;
      P097U21_A13933BarCuadern = new String[] {""} ;
      P097U21_n13933BarCuadern = new boolean[] {false} ;
      P097U21_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U21_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U21_A151BarFasCod = new String[] {""} ;
      P097U21_n151BarFasCod = new boolean[] {false} ;
      P097U21_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U21_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U21_A143BarDisNum = new String[] {""} ;
      P097U21_A4812BarEncCli = new String[] {""} ;
      P097U21_A199BarPie1 = new short[1] ;
      P097U21_A365DisDes = new String[] {""} ;
      P097U21_A898BarPieNDes = new int[1] ;
      P097U21_A361DisCod = new int[1] ;
      P097U21_A130BarCodPar = new String[] {""} ;
      P097U21_A132BarCodReo = new byte[1] ;
      P097U21_A129BarCod = new int[1] ;
      P097U21_A396EmprCod = new String[] {""} ;
      P097U26_A9713Tb1_Cod = new short[1] ;
      P097U26_A4466BarAcaAnh = new short[1] ;
      P097U26_A1652BarSerDsc = new String[] {""} ;
      P097U26_A213BarSit = new byte[1] ;
      P097U26_A180BarMaqCod = new String[] {""} ;
      P097U26_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U26_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U26_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U26_A1234BarNomCli = new String[] {""} ;
      P097U26_A136BarColNum = new int[1] ;
      P097U26_A135BarColNom = new String[] {""} ;
      P097U26_A13711BarTipArtD = new String[] {""} ;
      P097U26_n13711BarTipArtD = new boolean[] {false} ;
      P097U26_A217BarTipArt = new short[1] ;
      P097U26_n217BarTipArt = new boolean[] {false} ;
      P097U26_A212BarSer = new String[] {""} ;
      P097U26_A13696BarNHdr = new String[] {""} ;
      P097U26_A279CliNom = new String[] {""} ;
      P097U26_A252CliCod = new int[1] ;
      P097U26_n252CliCod = new boolean[] {false} ;
      P097U26_A13933BarCuadern = new String[] {""} ;
      P097U26_n13933BarCuadern = new boolean[] {false} ;
      P097U26_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U26_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U26_A151BarFasCod = new String[] {""} ;
      P097U26_n151BarFasCod = new boolean[] {false} ;
      P097U26_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U26_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U26_A143BarDisNum = new String[] {""} ;
      P097U26_A4812BarEncCli = new String[] {""} ;
      P097U26_A199BarPie1 = new short[1] ;
      P097U26_A365DisDes = new String[] {""} ;
      P097U26_A898BarPieNDes = new int[1] ;
      P097U26_A361DisCod = new int[1] ;
      P097U26_A130BarCodPar = new String[] {""} ;
      P097U26_A132BarCodReo = new byte[1] ;
      P097U26_A129BarCod = new int[1] ;
      P097U26_A396EmprCod = new String[] {""} ;
      P097U31_A9713Tb1_Cod = new short[1] ;
      P097U31_A4466BarAcaAnh = new short[1] ;
      P097U31_A217BarTipArt = new short[1] ;
      P097U31_n217BarTipArt = new boolean[] {false} ;
      P097U31_A213BarSit = new byte[1] ;
      P097U31_A180BarMaqCod = new String[] {""} ;
      P097U31_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U31_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U31_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U31_A1234BarNomCli = new String[] {""} ;
      P097U31_A136BarColNum = new int[1] ;
      P097U31_A135BarColNom = new String[] {""} ;
      P097U31_A13711BarTipArtD = new String[] {""} ;
      P097U31_n13711BarTipArtD = new boolean[] {false} ;
      P097U31_A1652BarSerDsc = new String[] {""} ;
      P097U31_A212BarSer = new String[] {""} ;
      P097U31_A13696BarNHdr = new String[] {""} ;
      P097U31_A279CliNom = new String[] {""} ;
      P097U31_A252CliCod = new int[1] ;
      P097U31_n252CliCod = new boolean[] {false} ;
      P097U31_A13933BarCuadern = new String[] {""} ;
      P097U31_n13933BarCuadern = new boolean[] {false} ;
      P097U31_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U31_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U31_A151BarFasCod = new String[] {""} ;
      P097U31_n151BarFasCod = new boolean[] {false} ;
      P097U31_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U31_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U31_A143BarDisNum = new String[] {""} ;
      P097U31_A4812BarEncCli = new String[] {""} ;
      P097U31_A199BarPie1 = new short[1] ;
      P097U31_A365DisDes = new String[] {""} ;
      P097U31_A898BarPieNDes = new int[1] ;
      P097U31_A361DisCod = new int[1] ;
      P097U31_A130BarCodPar = new String[] {""} ;
      P097U31_A132BarCodReo = new byte[1] ;
      P097U31_A129BarCod = new int[1] ;
      P097U31_A396EmprCod = new String[] {""} ;
      P097U36_A9713Tb1_Cod = new short[1] ;
      P097U36_A4466BarAcaAnh = new short[1] ;
      P097U36_A135BarColNom = new String[] {""} ;
      P097U36_A213BarSit = new byte[1] ;
      P097U36_A180BarMaqCod = new String[] {""} ;
      P097U36_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U36_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U36_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U36_A1234BarNomCli = new String[] {""} ;
      P097U36_A136BarColNum = new int[1] ;
      P097U36_A13711BarTipArtD = new String[] {""} ;
      P097U36_n13711BarTipArtD = new boolean[] {false} ;
      P097U36_A217BarTipArt = new short[1] ;
      P097U36_n217BarTipArt = new boolean[] {false} ;
      P097U36_A1652BarSerDsc = new String[] {""} ;
      P097U36_A212BarSer = new String[] {""} ;
      P097U36_A13696BarNHdr = new String[] {""} ;
      P097U36_A279CliNom = new String[] {""} ;
      P097U36_A252CliCod = new int[1] ;
      P097U36_n252CliCod = new boolean[] {false} ;
      P097U36_A13933BarCuadern = new String[] {""} ;
      P097U36_n13933BarCuadern = new boolean[] {false} ;
      P097U36_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U36_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U36_A151BarFasCod = new String[] {""} ;
      P097U36_n151BarFasCod = new boolean[] {false} ;
      P097U36_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U36_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U36_A143BarDisNum = new String[] {""} ;
      P097U36_A4812BarEncCli = new String[] {""} ;
      P097U36_A199BarPie1 = new short[1] ;
      P097U36_A365DisDes = new String[] {""} ;
      P097U36_A898BarPieNDes = new int[1] ;
      P097U36_A361DisCod = new int[1] ;
      P097U36_A130BarCodPar = new String[] {""} ;
      P097U36_A132BarCodReo = new byte[1] ;
      P097U36_A129BarCod = new int[1] ;
      P097U36_A396EmprCod = new String[] {""} ;
      P097U41_A9713Tb1_Cod = new short[1] ;
      P097U41_A4466BarAcaAnh = new short[1] ;
      P097U41_A1234BarNomCli = new String[] {""} ;
      P097U41_A213BarSit = new byte[1] ;
      P097U41_A180BarMaqCod = new String[] {""} ;
      P097U41_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U41_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U41_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U41_A136BarColNum = new int[1] ;
      P097U41_A135BarColNom = new String[] {""} ;
      P097U41_A13711BarTipArtD = new String[] {""} ;
      P097U41_n13711BarTipArtD = new boolean[] {false} ;
      P097U41_A217BarTipArt = new short[1] ;
      P097U41_n217BarTipArt = new boolean[] {false} ;
      P097U41_A1652BarSerDsc = new String[] {""} ;
      P097U41_A212BarSer = new String[] {""} ;
      P097U41_A13696BarNHdr = new String[] {""} ;
      P097U41_A279CliNom = new String[] {""} ;
      P097U41_A252CliCod = new int[1] ;
      P097U41_n252CliCod = new boolean[] {false} ;
      P097U41_A13933BarCuadern = new String[] {""} ;
      P097U41_n13933BarCuadern = new boolean[] {false} ;
      P097U41_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U41_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U41_A151BarFasCod = new String[] {""} ;
      P097U41_n151BarFasCod = new boolean[] {false} ;
      P097U41_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U41_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U41_A143BarDisNum = new String[] {""} ;
      P097U41_A4812BarEncCli = new String[] {""} ;
      P097U41_A199BarPie1 = new short[1] ;
      P097U41_A365DisDes = new String[] {""} ;
      P097U41_A898BarPieNDes = new int[1] ;
      P097U41_A361DisCod = new int[1] ;
      P097U41_A130BarCodPar = new String[] {""} ;
      P097U41_A132BarCodReo = new byte[1] ;
      P097U41_A129BarCod = new int[1] ;
      P097U41_A396EmprCod = new String[] {""} ;
      P097U46_A9713Tb1_Cod = new short[1] ;
      P097U46_A4466BarAcaAnh = new short[1] ;
      P097U46_A213BarSit = new byte[1] ;
      P097U46_A180BarMaqCod = new String[] {""} ;
      P097U46_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U46_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U46_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U46_A1234BarNomCli = new String[] {""} ;
      P097U46_A136BarColNum = new int[1] ;
      P097U46_A135BarColNom = new String[] {""} ;
      P097U46_A13711BarTipArtD = new String[] {""} ;
      P097U46_n13711BarTipArtD = new boolean[] {false} ;
      P097U46_A217BarTipArt = new short[1] ;
      P097U46_n217BarTipArt = new boolean[] {false} ;
      P097U46_A1652BarSerDsc = new String[] {""} ;
      P097U46_A212BarSer = new String[] {""} ;
      P097U46_A13696BarNHdr = new String[] {""} ;
      P097U46_A279CliNom = new String[] {""} ;
      P097U46_A252CliCod = new int[1] ;
      P097U46_n252CliCod = new boolean[] {false} ;
      P097U46_A13933BarCuadern = new String[] {""} ;
      P097U46_n13933BarCuadern = new boolean[] {false} ;
      P097U46_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U46_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U46_A151BarFasCod = new String[] {""} ;
      P097U46_n151BarFasCod = new boolean[] {false} ;
      P097U46_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U46_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U46_A143BarDisNum = new String[] {""} ;
      P097U46_A4812BarEncCli = new String[] {""} ;
      P097U46_A199BarPie1 = new short[1] ;
      P097U46_A365DisDes = new String[] {""} ;
      P097U46_A898BarPieNDes = new int[1] ;
      P097U46_A361DisCod = new int[1] ;
      P097U46_A130BarCodPar = new String[] {""} ;
      P097U46_A132BarCodReo = new byte[1] ;
      P097U46_A129BarCod = new int[1] ;
      P097U46_A396EmprCod = new String[] {""} ;
      P097U51_A9713Tb1_Cod = new short[1] ;
      P097U51_A4466BarAcaAnh = new short[1] ;
      P097U51_A180BarMaqCod = new String[] {""} ;
      P097U51_A213BarSit = new byte[1] ;
      P097U51_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U51_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U51_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U51_A1234BarNomCli = new String[] {""} ;
      P097U51_A136BarColNum = new int[1] ;
      P097U51_A135BarColNom = new String[] {""} ;
      P097U51_A13711BarTipArtD = new String[] {""} ;
      P097U51_n13711BarTipArtD = new boolean[] {false} ;
      P097U51_A217BarTipArt = new short[1] ;
      P097U51_n217BarTipArt = new boolean[] {false} ;
      P097U51_A1652BarSerDsc = new String[] {""} ;
      P097U51_A212BarSer = new String[] {""} ;
      P097U51_A13696BarNHdr = new String[] {""} ;
      P097U51_A279CliNom = new String[] {""} ;
      P097U51_A252CliCod = new int[1] ;
      P097U51_n252CliCod = new boolean[] {false} ;
      P097U51_A13933BarCuadern = new String[] {""} ;
      P097U51_n13933BarCuadern = new boolean[] {false} ;
      P097U51_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U51_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U51_A151BarFasCod = new String[] {""} ;
      P097U51_n151BarFasCod = new boolean[] {false} ;
      P097U51_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U51_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U51_A143BarDisNum = new String[] {""} ;
      P097U51_A4812BarEncCli = new String[] {""} ;
      P097U51_A199BarPie1 = new short[1] ;
      P097U51_A365DisDes = new String[] {""} ;
      P097U51_A898BarPieNDes = new int[1] ;
      P097U51_A361DisCod = new int[1] ;
      P097U51_A130BarCodPar = new String[] {""} ;
      P097U51_A132BarCodReo = new byte[1] ;
      P097U51_A129BarCod = new int[1] ;
      P097U51_A396EmprCod = new String[] {""} ;
      P097U56_A9713Tb1_Cod = new short[1] ;
      P097U56_A4466BarAcaAnh = new short[1] ;
      P097U56_A213BarSit = new byte[1] ;
      P097U56_A180BarMaqCod = new String[] {""} ;
      P097U56_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U56_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U56_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U56_A1234BarNomCli = new String[] {""} ;
      P097U56_A136BarColNum = new int[1] ;
      P097U56_A135BarColNom = new String[] {""} ;
      P097U56_A13711BarTipArtD = new String[] {""} ;
      P097U56_n13711BarTipArtD = new boolean[] {false} ;
      P097U56_A217BarTipArt = new short[1] ;
      P097U56_n217BarTipArt = new boolean[] {false} ;
      P097U56_A1652BarSerDsc = new String[] {""} ;
      P097U56_A212BarSer = new String[] {""} ;
      P097U56_A13696BarNHdr = new String[] {""} ;
      P097U56_A279CliNom = new String[] {""} ;
      P097U56_A252CliCod = new int[1] ;
      P097U56_n252CliCod = new boolean[] {false} ;
      P097U56_A13933BarCuadern = new String[] {""} ;
      P097U56_n13933BarCuadern = new boolean[] {false} ;
      P097U56_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U56_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U56_A151BarFasCod = new String[] {""} ;
      P097U56_n151BarFasCod = new boolean[] {false} ;
      P097U56_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U56_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U56_A143BarDisNum = new String[] {""} ;
      P097U56_A4812BarEncCli = new String[] {""} ;
      P097U56_A199BarPie1 = new short[1] ;
      P097U56_A365DisDes = new String[] {""} ;
      P097U56_A898BarPieNDes = new int[1] ;
      P097U56_A361DisCod = new int[1] ;
      P097U56_A130BarCodPar = new String[] {""} ;
      P097U56_A132BarCodReo = new byte[1] ;
      P097U56_A129BarCod = new int[1] ;
      P097U56_A396EmprCod = new String[] {""} ;
      P097U61_A9713Tb1_Cod = new short[1] ;
      P097U61_A4466BarAcaAnh = new short[1] ;
      P097U61_A213BarSit = new byte[1] ;
      P097U61_A180BarMaqCod = new String[] {""} ;
      P097U61_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097U61_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097U61_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097U61_A1234BarNomCli = new String[] {""} ;
      P097U61_A136BarColNum = new int[1] ;
      P097U61_A135BarColNom = new String[] {""} ;
      P097U61_A13711BarTipArtD = new String[] {""} ;
      P097U61_n13711BarTipArtD = new boolean[] {false} ;
      P097U61_A217BarTipArt = new short[1] ;
      P097U61_n217BarTipArt = new boolean[] {false} ;
      P097U61_A1652BarSerDsc = new String[] {""} ;
      P097U61_A212BarSer = new String[] {""} ;
      P097U61_A13696BarNHdr = new String[] {""} ;
      P097U61_A279CliNom = new String[] {""} ;
      P097U61_A252CliCod = new int[1] ;
      P097U61_n252CliCod = new boolean[] {false} ;
      P097U61_A13933BarCuadern = new String[] {""} ;
      P097U61_n13933BarCuadern = new boolean[] {false} ;
      P097U61_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U61_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U61_A151BarFasCod = new String[] {""} ;
      P097U61_n151BarFasCod = new boolean[] {false} ;
      P097U61_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U61_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097U61_A143BarDisNum = new String[] {""} ;
      P097U61_A4812BarEncCli = new String[] {""} ;
      P097U61_A199BarPie1 = new short[1] ;
      P097U61_A365DisDes = new String[] {""} ;
      P097U61_A898BarPieNDes = new int[1] ;
      P097U61_A361DisCod = new int[1] ;
      P097U61_A130BarCodPar = new String[] {""} ;
      P097U61_A132BarCodReo = new byte[1] ;
      P097U61_A129BarCod = new int[1] ;
      P097U61_A396EmprCod = new String[] {""} ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new long[1] ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_int10 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadodehdrs_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P097U6_A9713Tb1_Cod, P097U6_A4466BarAcaAnh, P097U6_A279CliNom, P097U6_A213BarSit, P097U6_A180BarMaqCod, P097U6_A158BarFecFpr, P097U6_A155BarFecCli, P097U6_A159BarFecGen, P097U6_A1234BarNomCli, P097U6_A136BarColNum,
            P097U6_A135BarColNom, P097U6_A13711BarTipArtD, P097U6_n13711BarTipArtD, P097U6_A217BarTipArt, P097U6_n217BarTipArt, P097U6_A1652BarSerDsc, P097U6_A212BarSer, P097U6_A13696BarNHdr, P097U6_A252CliCod, P097U6_n252CliCod,
            P097U6_A13933BarCuadern, P097U6_n13933BarCuadern, P097U6_A13932BarAlbKgs, P097U6_A13931BarAlbMts, P097U6_A151BarFasCod, P097U6_n151BarFasCod, P097U6_A184BarMtr, P097U6_A166BarKgm, P097U6_A143BarDisNum, P097U6_A4812BarEncCli,
            P097U6_A199BarPie1, P097U6_A365DisDes, P097U6_A898BarPieNDes, P097U6_A361DisCod, P097U6_A130BarCodPar, P097U6_A132BarCodReo, P097U6_A129BarCod, P097U6_A396EmprCod
            }
            , new Object[] {
            P097U11_A9713Tb1_Cod, P097U11_A4466BarAcaAnh, P097U11_A213BarSit, P097U11_A180BarMaqCod, P097U11_A158BarFecFpr, P097U11_A155BarFecCli, P097U11_A159BarFecGen, P097U11_A1234BarNomCli, P097U11_A136BarColNum, P097U11_A135BarColNom,
            P097U11_A13711BarTipArtD, P097U11_n13711BarTipArtD, P097U11_A217BarTipArt, P097U11_n217BarTipArt, P097U11_A1652BarSerDsc, P097U11_A212BarSer, P097U11_A13696BarNHdr, P097U11_A279CliNom, P097U11_A252CliCod, P097U11_n252CliCod,
            P097U11_A13933BarCuadern, P097U11_n13933BarCuadern, P097U11_A13932BarAlbKgs, P097U11_A13931BarAlbMts, P097U11_A151BarFasCod, P097U11_n151BarFasCod, P097U11_A184BarMtr, P097U11_A166BarKgm, P097U11_A143BarDisNum, P097U11_A4812BarEncCli,
            P097U11_A199BarPie1, P097U11_A365DisDes, P097U11_A898BarPieNDes, P097U11_A361DisCod, P097U11_A130BarCodPar, P097U11_A132BarCodReo, P097U11_A129BarCod, P097U11_A396EmprCod
            }
            , new Object[] {
            P097U16_A9713Tb1_Cod, P097U16_A4466BarAcaAnh, P097U16_A213BarSit, P097U16_A180BarMaqCod, P097U16_A158BarFecFpr, P097U16_A155BarFecCli, P097U16_A159BarFecGen, P097U16_A1234BarNomCli, P097U16_A136BarColNum, P097U16_A135BarColNom,
            P097U16_A13711BarTipArtD, P097U16_n13711BarTipArtD, P097U16_A217BarTipArt, P097U16_n217BarTipArt, P097U16_A1652BarSerDsc, P097U16_A212BarSer, P097U16_A13696BarNHdr, P097U16_A279CliNom, P097U16_A252CliCod, P097U16_n252CliCod,
            P097U16_A13933BarCuadern, P097U16_n13933BarCuadern, P097U16_A13932BarAlbKgs, P097U16_A13931BarAlbMts, P097U16_A151BarFasCod, P097U16_n151BarFasCod, P097U16_A184BarMtr, P097U16_A166BarKgm, P097U16_A143BarDisNum, P097U16_A4812BarEncCli,
            P097U16_A199BarPie1, P097U16_A365DisDes, P097U16_A898BarPieNDes, P097U16_A361DisCod, P097U16_A130BarCodPar, P097U16_A132BarCodReo, P097U16_A129BarCod, P097U16_A396EmprCod
            }
            , new Object[] {
            P097U21_A9713Tb1_Cod, P097U21_A4466BarAcaAnh, P097U21_A212BarSer, P097U21_A213BarSit, P097U21_A180BarMaqCod, P097U21_A158BarFecFpr, P097U21_A155BarFecCli, P097U21_A159BarFecGen, P097U21_A1234BarNomCli, P097U21_A136BarColNum,
            P097U21_A135BarColNom, P097U21_A13711BarTipArtD, P097U21_n13711BarTipArtD, P097U21_A217BarTipArt, P097U21_n217BarTipArt, P097U21_A1652BarSerDsc, P097U21_A13696BarNHdr, P097U21_A279CliNom, P097U21_A252CliCod, P097U21_n252CliCod,
            P097U21_A13933BarCuadern, P097U21_n13933BarCuadern, P097U21_A13932BarAlbKgs, P097U21_A13931BarAlbMts, P097U21_A151BarFasCod, P097U21_n151BarFasCod, P097U21_A184BarMtr, P097U21_A166BarKgm, P097U21_A143BarDisNum, P097U21_A4812BarEncCli,
            P097U21_A199BarPie1, P097U21_A365DisDes, P097U21_A898BarPieNDes, P097U21_A361DisCod, P097U21_A130BarCodPar, P097U21_A132BarCodReo, P097U21_A129BarCod, P097U21_A396EmprCod
            }
            , new Object[] {
            P097U26_A9713Tb1_Cod, P097U26_A4466BarAcaAnh, P097U26_A1652BarSerDsc, P097U26_A213BarSit, P097U26_A180BarMaqCod, P097U26_A158BarFecFpr, P097U26_A155BarFecCli, P097U26_A159BarFecGen, P097U26_A1234BarNomCli, P097U26_A136BarColNum,
            P097U26_A135BarColNom, P097U26_A13711BarTipArtD, P097U26_n13711BarTipArtD, P097U26_A217BarTipArt, P097U26_n217BarTipArt, P097U26_A212BarSer, P097U26_A13696BarNHdr, P097U26_A279CliNom, P097U26_A252CliCod, P097U26_n252CliCod,
            P097U26_A13933BarCuadern, P097U26_n13933BarCuadern, P097U26_A13932BarAlbKgs, P097U26_A13931BarAlbMts, P097U26_A151BarFasCod, P097U26_n151BarFasCod, P097U26_A184BarMtr, P097U26_A166BarKgm, P097U26_A143BarDisNum, P097U26_A4812BarEncCli,
            P097U26_A199BarPie1, P097U26_A365DisDes, P097U26_A898BarPieNDes, P097U26_A361DisCod, P097U26_A130BarCodPar, P097U26_A132BarCodReo, P097U26_A129BarCod, P097U26_A396EmprCod
            }
            , new Object[] {
            P097U31_A9713Tb1_Cod, P097U31_A4466BarAcaAnh, P097U31_A217BarTipArt, P097U31_n217BarTipArt, P097U31_A213BarSit, P097U31_A180BarMaqCod, P097U31_A158BarFecFpr, P097U31_A155BarFecCli, P097U31_A159BarFecGen, P097U31_A1234BarNomCli,
            P097U31_A136BarColNum, P097U31_A135BarColNom, P097U31_A13711BarTipArtD, P097U31_n13711BarTipArtD, P097U31_A1652BarSerDsc, P097U31_A212BarSer, P097U31_A13696BarNHdr, P097U31_A279CliNom, P097U31_A252CliCod, P097U31_n252CliCod,
            P097U31_A13933BarCuadern, P097U31_n13933BarCuadern, P097U31_A13932BarAlbKgs, P097U31_A13931BarAlbMts, P097U31_A151BarFasCod, P097U31_n151BarFasCod, P097U31_A184BarMtr, P097U31_A166BarKgm, P097U31_A143BarDisNum, P097U31_A4812BarEncCli,
            P097U31_A199BarPie1, P097U31_A365DisDes, P097U31_A898BarPieNDes, P097U31_A361DisCod, P097U31_A130BarCodPar, P097U31_A132BarCodReo, P097U31_A129BarCod, P097U31_A396EmprCod
            }
            , new Object[] {
            P097U36_A9713Tb1_Cod, P097U36_A4466BarAcaAnh, P097U36_A135BarColNom, P097U36_A213BarSit, P097U36_A180BarMaqCod, P097U36_A158BarFecFpr, P097U36_A155BarFecCli, P097U36_A159BarFecGen, P097U36_A1234BarNomCli, P097U36_A136BarColNum,
            P097U36_A13711BarTipArtD, P097U36_n13711BarTipArtD, P097U36_A217BarTipArt, P097U36_n217BarTipArt, P097U36_A1652BarSerDsc, P097U36_A212BarSer, P097U36_A13696BarNHdr, P097U36_A279CliNom, P097U36_A252CliCod, P097U36_n252CliCod,
            P097U36_A13933BarCuadern, P097U36_n13933BarCuadern, P097U36_A13932BarAlbKgs, P097U36_A13931BarAlbMts, P097U36_A151BarFasCod, P097U36_n151BarFasCod, P097U36_A184BarMtr, P097U36_A166BarKgm, P097U36_A143BarDisNum, P097U36_A4812BarEncCli,
            P097U36_A199BarPie1, P097U36_A365DisDes, P097U36_A898BarPieNDes, P097U36_A361DisCod, P097U36_A130BarCodPar, P097U36_A132BarCodReo, P097U36_A129BarCod, P097U36_A396EmprCod
            }
            , new Object[] {
            P097U41_A9713Tb1_Cod, P097U41_A4466BarAcaAnh, P097U41_A1234BarNomCli, P097U41_A213BarSit, P097U41_A180BarMaqCod, P097U41_A158BarFecFpr, P097U41_A155BarFecCli, P097U41_A159BarFecGen, P097U41_A136BarColNum, P097U41_A135BarColNom,
            P097U41_A13711BarTipArtD, P097U41_n13711BarTipArtD, P097U41_A217BarTipArt, P097U41_n217BarTipArt, P097U41_A1652BarSerDsc, P097U41_A212BarSer, P097U41_A13696BarNHdr, P097U41_A279CliNom, P097U41_A252CliCod, P097U41_n252CliCod,
            P097U41_A13933BarCuadern, P097U41_n13933BarCuadern, P097U41_A13932BarAlbKgs, P097U41_A13931BarAlbMts, P097U41_A151BarFasCod, P097U41_n151BarFasCod, P097U41_A184BarMtr, P097U41_A166BarKgm, P097U41_A143BarDisNum, P097U41_A4812BarEncCli,
            P097U41_A199BarPie1, P097U41_A365DisDes, P097U41_A898BarPieNDes, P097U41_A361DisCod, P097U41_A130BarCodPar, P097U41_A132BarCodReo, P097U41_A129BarCod, P097U41_A396EmprCod
            }
            , new Object[] {
            P097U46_A9713Tb1_Cod, P097U46_A4466BarAcaAnh, P097U46_A213BarSit, P097U46_A180BarMaqCod, P097U46_A158BarFecFpr, P097U46_A155BarFecCli, P097U46_A159BarFecGen, P097U46_A1234BarNomCli, P097U46_A136BarColNum, P097U46_A135BarColNom,
            P097U46_A13711BarTipArtD, P097U46_n13711BarTipArtD, P097U46_A217BarTipArt, P097U46_n217BarTipArt, P097U46_A1652BarSerDsc, P097U46_A212BarSer, P097U46_A13696BarNHdr, P097U46_A279CliNom, P097U46_A252CliCod, P097U46_n252CliCod,
            P097U46_A13933BarCuadern, P097U46_n13933BarCuadern, P097U46_A13932BarAlbKgs, P097U46_A13931BarAlbMts, P097U46_A151BarFasCod, P097U46_n151BarFasCod, P097U46_A184BarMtr, P097U46_A166BarKgm, P097U46_A143BarDisNum, P097U46_A4812BarEncCli,
            P097U46_A199BarPie1, P097U46_A365DisDes, P097U46_A898BarPieNDes, P097U46_A361DisCod, P097U46_A130BarCodPar, P097U46_A132BarCodReo, P097U46_A129BarCod, P097U46_A396EmprCod
            }
            , new Object[] {
            P097U51_A9713Tb1_Cod, P097U51_A4466BarAcaAnh, P097U51_A180BarMaqCod, P097U51_A213BarSit, P097U51_A158BarFecFpr, P097U51_A155BarFecCli, P097U51_A159BarFecGen, P097U51_A1234BarNomCli, P097U51_A136BarColNum, P097U51_A135BarColNom,
            P097U51_A13711BarTipArtD, P097U51_n13711BarTipArtD, P097U51_A217BarTipArt, P097U51_n217BarTipArt, P097U51_A1652BarSerDsc, P097U51_A212BarSer, P097U51_A13696BarNHdr, P097U51_A279CliNom, P097U51_A252CliCod, P097U51_n252CliCod,
            P097U51_A13933BarCuadern, P097U51_n13933BarCuadern, P097U51_A13932BarAlbKgs, P097U51_A13931BarAlbMts, P097U51_A151BarFasCod, P097U51_n151BarFasCod, P097U51_A184BarMtr, P097U51_A166BarKgm, P097U51_A143BarDisNum, P097U51_A4812BarEncCli,
            P097U51_A199BarPie1, P097U51_A365DisDes, P097U51_A898BarPieNDes, P097U51_A361DisCod, P097U51_A130BarCodPar, P097U51_A132BarCodReo, P097U51_A129BarCod, P097U51_A396EmprCod
            }
            , new Object[] {
            P097U56_A9713Tb1_Cod, P097U56_A4466BarAcaAnh, P097U56_A213BarSit, P097U56_A180BarMaqCod, P097U56_A158BarFecFpr, P097U56_A155BarFecCli, P097U56_A159BarFecGen, P097U56_A1234BarNomCli, P097U56_A136BarColNum, P097U56_A135BarColNom,
            P097U56_A13711BarTipArtD, P097U56_n13711BarTipArtD, P097U56_A217BarTipArt, P097U56_n217BarTipArt, P097U56_A1652BarSerDsc, P097U56_A212BarSer, P097U56_A13696BarNHdr, P097U56_A279CliNom, P097U56_A252CliCod, P097U56_n252CliCod,
            P097U56_A13933BarCuadern, P097U56_n13933BarCuadern, P097U56_A13932BarAlbKgs, P097U56_A13931BarAlbMts, P097U56_A151BarFasCod, P097U56_n151BarFasCod, P097U56_A184BarMtr, P097U56_A166BarKgm, P097U56_A143BarDisNum, P097U56_A4812BarEncCli,
            P097U56_A199BarPie1, P097U56_A365DisDes, P097U56_A898BarPieNDes, P097U56_A361DisCod, P097U56_A130BarCodPar, P097U56_A132BarCodReo, P097U56_A129BarCod, P097U56_A396EmprCod
            }
            , new Object[] {
            P097U61_A9713Tb1_Cod, P097U61_A4466BarAcaAnh, P097U61_A213BarSit, P097U61_A180BarMaqCod, P097U61_A158BarFecFpr, P097U61_A155BarFecCli, P097U61_A159BarFecGen, P097U61_A1234BarNomCli, P097U61_A136BarColNum, P097U61_A135BarColNom,
            P097U61_A13711BarTipArtD, P097U61_n13711BarTipArtD, P097U61_A217BarTipArt, P097U61_n217BarTipArt, P097U61_A1652BarSerDsc, P097U61_A212BarSer, P097U61_A13696BarNHdr, P097U61_A279CliNom, P097U61_A252CliCod, P097U61_n252CliCod,
            P097U61_A13933BarCuadern, P097U61_n13933BarCuadern, P097U61_A13932BarAlbKgs, P097U61_A13931BarAlbMts, P097U61_A151BarFasCod, P097U61_n151BarFasCod, P097U61_A184BarMtr, P097U61_A166BarKgm, P097U61_A143BarDisNum, P097U61_A4812BarEncCli,
            P097U61_A199BarPie1, P097U61_A365DisDes, P097U61_A898BarPieNDes, P097U61_A361DisCod, P097U61_A130BarCodPar, P097U61_A132BarCodReo, P097U61_A129BarCod, P097U61_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV78TFBarSit ;
   private byte AV79TFBarSit_To ;
   private byte AV66BarSit ;
   private byte AV67BarSit_to ;
   private byte AV138Listadodehdrs_wcds_37_tfbarsit ;
   private byte AV139Listadodehdrs_wcds_38_tfbarsit_to ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short AV18TFBarTipArt ;
   private short AV19TFBarTipArt_To ;
   private short AV115Listadodehdrs_wcds_14_tfbartipart ;
   private short AV116Listadodehdrs_wcds_15_tfbartipart_to ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV100GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV24TFBarColNum ;
   private int AV25TFBarColNum_To ;
   private int AV36TFBarPie ;
   private int AV37TFBarPie_To ;
   private int AV96TFBarAlbFact ;
   private int AV97TFBarAlbFact_To ;
   private int AV70Clicod ;
   private int AV71Clicod_to ;
   private int AV103Listadodehdrs_wcds_2_tfclicod ;
   private int AV104Listadodehdrs_wcds_3_tfclicod_to ;
   private int AV121Listadodehdrs_wcds_20_tfbarcolnum ;
   private int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ;
   private int AV129Listadodehdrs_wcds_28_tfbarpie ;
   private int AV130Listadodehdrs_wcds_29_tfbarpie_to ;
   private int AV150Listadodehdrs_wcds_49_tfbaralbfact ;
   private int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int A13935BarAlbFact ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
   private int AV49InsertIndex ;
   private int GXt_int9 ;
   private int GXv_int10[] ;
   private long AV86TFBarAlbUltimo ;
   private long AV87TFBarAlbUltimo_To ;
   private long AV140Listadodehdrs_wcds_39_tfbaralbultimo ;
   private long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ;
   private long A13930BarAlbUlti ;
   private long AV58count ;
   private long GXt_int7 ;
   private long GXv_int8[] ;
   private java.math.BigDecimal AV32TFBarKgm ;
   private java.math.BigDecimal AV33TFBarKgm_To ;
   private java.math.BigDecimal AV34TFBarMtr ;
   private java.math.BigDecimal AV35TFBarMtr_To ;
   private java.math.BigDecimal AV88TFBarAlbMts ;
   private java.math.BigDecimal AV89TFBarAlbMts_To ;
   private java.math.BigDecimal AV90TFBarAlbKgs ;
   private java.math.BigDecimal AV91TFBarAlbKgs_To ;
   private java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ;
   private java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ;
   private java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ;
   private java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ;
   private java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ;
   private java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ;
   private java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ;
   private java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A13931BarAlbMts ;
   private java.math.BigDecimal A13932BarAlbKgs ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV84TFPedidoCliente ;
   private String AV85TFPedidoCliente_Sel ;
   private String AV74TFBarNHdr ;
   private String AV75TFBarNHdr_Sel ;
   private String AV14TFBarSer ;
   private String AV15TFBarSer_Sel ;
   private String AV16TFBarSerDsc ;
   private String AV17TFBarSerDsc_Sel ;
   private String AV20TFBarTipArtDsc ;
   private String AV21TFBarTipArtDsc_Sel ;
   private String AV22TFBarColNom ;
   private String AV23TFBarColNom_Sel ;
   private String AV30TFBarNomCli ;
   private String AV31TFBarNomCli_Sel ;
   private String AV44TFBarFasCod ;
   private String AV45TFBarFasCod_Sel ;
   private String AV76TFBarMaqCod ;
   private String AV77TFBarMaqCod_Sel ;
   private String AV92TFBarCuaderno ;
   private String AV93TFBarCuaderno_Sel ;
   private String AV65Emprcod ;
   private String A279CliNom ;
   private String AV105Listadodehdrs_wcds_4_tfclinom ;
   private String AV106Listadodehdrs_wcds_5_tfclinom_sel ;
   private String AV107Listadodehdrs_wcds_6_tfpedidocliente ;
   private String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ;
   private String AV109Listadodehdrs_wcds_8_tfbarnhdr ;
   private String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ;
   private String AV111Listadodehdrs_wcds_10_tfbarser ;
   private String AV112Listadodehdrs_wcds_11_tfbarser_sel ;
   private String AV113Listadodehdrs_wcds_12_tfbarserdsc ;
   private String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ;
   private String AV117Listadodehdrs_wcds_16_tfbartipartdsc ;
   private String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ;
   private String AV119Listadodehdrs_wcds_18_tfbarcolnom ;
   private String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ;
   private String AV123Listadodehdrs_wcds_22_tfbarnomcli ;
   private String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ;
   private String AV134Listadodehdrs_wcds_33_tfbarfascod ;
   private String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ;
   private String AV136Listadodehdrs_wcds_35_tfbarmaqcod ;
   private String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ;
   private String AV146Listadodehdrs_wcds_45_tfbarcuaderno ;
   private String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ;
   private String scmdbuf ;
   private String lV134Listadodehdrs_wcds_33_tfbarfascod ;
   private String lV146Listadodehdrs_wcds_45_tfbarcuaderno ;
   private String lV105Listadodehdrs_wcds_4_tfclinom ;
   private String lV109Listadodehdrs_wcds_8_tfbarnhdr ;
   private String lV111Listadodehdrs_wcds_10_tfbarser ;
   private String lV113Listadodehdrs_wcds_12_tfbarserdsc ;
   private String lV117Listadodehdrs_wcds_16_tfbartipartdsc ;
   private String lV119Listadodehdrs_wcds_18_tfbarcolnom ;
   private String lV123Listadodehdrs_wcds_22_tfbarnomcli ;
   private String lV136Listadodehdrs_wcds_35_tfbarmaqcod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A180BarMaqCod ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A151BarFasCod ;
   private String A13933BarCuadern ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A365DisDes ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private java.util.Date AV38TFBarFecGen ;
   private java.util.Date AV40TFBarFecCli ;
   private java.util.Date AV42TFBarFecFpr ;
   private java.util.Date AV68BarFecGen ;
   private java.util.Date AV69BarFecGen_to ;
   private java.util.Date AV72BarFecCli ;
   private java.util.Date AV73BarFecCli_to ;
   private java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ;
   private java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ;
   private java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private boolean returnInSub ;
   private boolean brk97U2 ;
   private boolean n13711BarTipArtD ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13933BarCuadern ;
   private boolean n151BarFasCod ;
   private boolean brk97U6 ;
   private boolean brk97U8 ;
   private boolean brk97U10 ;
   private boolean brk97U12 ;
   private boolean brk97U14 ;
   private boolean brk97U17 ;
   private String AV52OptionsJson ;
   private String AV55OptionsDescJson ;
   private String AV57OptionIndexesJson ;
   private String AV48DDOName ;
   private String AV46SearchTxt ;
   private String AV47SearchTxtTo ;
   private String AV64FilterFullText ;
   private String AV94TFBarNormas ;
   private String AV95TFBarNormas_Sel ;
   private String AV102Listadodehdrs_wcds_1_filterfulltext ;
   private String AV148Listadodehdrs_wcds_47_tfbarnormas ;
   private String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ;
   private String A13934BarNormas ;
   private String AV50Option ;
   private com.genexus.webpanels.WebSession AV59Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P097U6_A9713Tb1_Cod ;
   private short[] P097U6_A4466BarAcaAnh ;
   private String[] P097U6_A279CliNom ;
   private byte[] P097U6_A213BarSit ;
   private String[] P097U6_A180BarMaqCod ;
   private java.util.Date[] P097U6_A158BarFecFpr ;
   private java.util.Date[] P097U6_A155BarFecCli ;
   private java.util.Date[] P097U6_A159BarFecGen ;
   private String[] P097U6_A1234BarNomCli ;
   private int[] P097U6_A136BarColNum ;
   private String[] P097U6_A135BarColNom ;
   private String[] P097U6_A13711BarTipArtD ;
   private boolean[] P097U6_n13711BarTipArtD ;
   private short[] P097U6_A217BarTipArt ;
   private boolean[] P097U6_n217BarTipArt ;
   private String[] P097U6_A1652BarSerDsc ;
   private String[] P097U6_A212BarSer ;
   private String[] P097U6_A13696BarNHdr ;
   private int[] P097U6_A252CliCod ;
   private boolean[] P097U6_n252CliCod ;
   private String[] P097U6_A13933BarCuadern ;
   private boolean[] P097U6_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U6_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U6_A13931BarAlbMts ;
   private String[] P097U6_A151BarFasCod ;
   private boolean[] P097U6_n151BarFasCod ;
   private java.math.BigDecimal[] P097U6_A184BarMtr ;
   private java.math.BigDecimal[] P097U6_A166BarKgm ;
   private String[] P097U6_A143BarDisNum ;
   private String[] P097U6_A4812BarEncCli ;
   private short[] P097U6_A199BarPie1 ;
   private String[] P097U6_A365DisDes ;
   private int[] P097U6_A898BarPieNDes ;
   private int[] P097U6_A361DisCod ;
   private String[] P097U6_A130BarCodPar ;
   private byte[] P097U6_A132BarCodReo ;
   private int[] P097U6_A129BarCod ;
   private String[] P097U6_A396EmprCod ;
   private short[] P097U11_A9713Tb1_Cod ;
   private short[] P097U11_A4466BarAcaAnh ;
   private byte[] P097U11_A213BarSit ;
   private String[] P097U11_A180BarMaqCod ;
   private java.util.Date[] P097U11_A158BarFecFpr ;
   private java.util.Date[] P097U11_A155BarFecCli ;
   private java.util.Date[] P097U11_A159BarFecGen ;
   private String[] P097U11_A1234BarNomCli ;
   private int[] P097U11_A136BarColNum ;
   private String[] P097U11_A135BarColNom ;
   private String[] P097U11_A13711BarTipArtD ;
   private boolean[] P097U11_n13711BarTipArtD ;
   private short[] P097U11_A217BarTipArt ;
   private boolean[] P097U11_n217BarTipArt ;
   private String[] P097U11_A1652BarSerDsc ;
   private String[] P097U11_A212BarSer ;
   private String[] P097U11_A13696BarNHdr ;
   private String[] P097U11_A279CliNom ;
   private int[] P097U11_A252CliCod ;
   private boolean[] P097U11_n252CliCod ;
   private String[] P097U11_A13933BarCuadern ;
   private boolean[] P097U11_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U11_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U11_A13931BarAlbMts ;
   private String[] P097U11_A151BarFasCod ;
   private boolean[] P097U11_n151BarFasCod ;
   private java.math.BigDecimal[] P097U11_A184BarMtr ;
   private java.math.BigDecimal[] P097U11_A166BarKgm ;
   private String[] P097U11_A143BarDisNum ;
   private String[] P097U11_A4812BarEncCli ;
   private short[] P097U11_A199BarPie1 ;
   private String[] P097U11_A365DisDes ;
   private int[] P097U11_A898BarPieNDes ;
   private int[] P097U11_A361DisCod ;
   private String[] P097U11_A130BarCodPar ;
   private byte[] P097U11_A132BarCodReo ;
   private int[] P097U11_A129BarCod ;
   private String[] P097U11_A396EmprCod ;
   private short[] P097U16_A9713Tb1_Cod ;
   private short[] P097U16_A4466BarAcaAnh ;
   private byte[] P097U16_A213BarSit ;
   private String[] P097U16_A180BarMaqCod ;
   private java.util.Date[] P097U16_A158BarFecFpr ;
   private java.util.Date[] P097U16_A155BarFecCli ;
   private java.util.Date[] P097U16_A159BarFecGen ;
   private String[] P097U16_A1234BarNomCli ;
   private int[] P097U16_A136BarColNum ;
   private String[] P097U16_A135BarColNom ;
   private String[] P097U16_A13711BarTipArtD ;
   private boolean[] P097U16_n13711BarTipArtD ;
   private short[] P097U16_A217BarTipArt ;
   private boolean[] P097U16_n217BarTipArt ;
   private String[] P097U16_A1652BarSerDsc ;
   private String[] P097U16_A212BarSer ;
   private String[] P097U16_A13696BarNHdr ;
   private String[] P097U16_A279CliNom ;
   private int[] P097U16_A252CliCod ;
   private boolean[] P097U16_n252CliCod ;
   private String[] P097U16_A13933BarCuadern ;
   private boolean[] P097U16_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U16_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U16_A13931BarAlbMts ;
   private String[] P097U16_A151BarFasCod ;
   private boolean[] P097U16_n151BarFasCod ;
   private java.math.BigDecimal[] P097U16_A184BarMtr ;
   private java.math.BigDecimal[] P097U16_A166BarKgm ;
   private String[] P097U16_A143BarDisNum ;
   private String[] P097U16_A4812BarEncCli ;
   private short[] P097U16_A199BarPie1 ;
   private String[] P097U16_A365DisDes ;
   private int[] P097U16_A898BarPieNDes ;
   private int[] P097U16_A361DisCod ;
   private String[] P097U16_A130BarCodPar ;
   private byte[] P097U16_A132BarCodReo ;
   private int[] P097U16_A129BarCod ;
   private String[] P097U16_A396EmprCod ;
   private short[] P097U21_A9713Tb1_Cod ;
   private short[] P097U21_A4466BarAcaAnh ;
   private String[] P097U21_A212BarSer ;
   private byte[] P097U21_A213BarSit ;
   private String[] P097U21_A180BarMaqCod ;
   private java.util.Date[] P097U21_A158BarFecFpr ;
   private java.util.Date[] P097U21_A155BarFecCli ;
   private java.util.Date[] P097U21_A159BarFecGen ;
   private String[] P097U21_A1234BarNomCli ;
   private int[] P097U21_A136BarColNum ;
   private String[] P097U21_A135BarColNom ;
   private String[] P097U21_A13711BarTipArtD ;
   private boolean[] P097U21_n13711BarTipArtD ;
   private short[] P097U21_A217BarTipArt ;
   private boolean[] P097U21_n217BarTipArt ;
   private String[] P097U21_A1652BarSerDsc ;
   private String[] P097U21_A13696BarNHdr ;
   private String[] P097U21_A279CliNom ;
   private int[] P097U21_A252CliCod ;
   private boolean[] P097U21_n252CliCod ;
   private String[] P097U21_A13933BarCuadern ;
   private boolean[] P097U21_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U21_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U21_A13931BarAlbMts ;
   private String[] P097U21_A151BarFasCod ;
   private boolean[] P097U21_n151BarFasCod ;
   private java.math.BigDecimal[] P097U21_A184BarMtr ;
   private java.math.BigDecimal[] P097U21_A166BarKgm ;
   private String[] P097U21_A143BarDisNum ;
   private String[] P097U21_A4812BarEncCli ;
   private short[] P097U21_A199BarPie1 ;
   private String[] P097U21_A365DisDes ;
   private int[] P097U21_A898BarPieNDes ;
   private int[] P097U21_A361DisCod ;
   private String[] P097U21_A130BarCodPar ;
   private byte[] P097U21_A132BarCodReo ;
   private int[] P097U21_A129BarCod ;
   private String[] P097U21_A396EmprCod ;
   private short[] P097U26_A9713Tb1_Cod ;
   private short[] P097U26_A4466BarAcaAnh ;
   private String[] P097U26_A1652BarSerDsc ;
   private byte[] P097U26_A213BarSit ;
   private String[] P097U26_A180BarMaqCod ;
   private java.util.Date[] P097U26_A158BarFecFpr ;
   private java.util.Date[] P097U26_A155BarFecCli ;
   private java.util.Date[] P097U26_A159BarFecGen ;
   private String[] P097U26_A1234BarNomCli ;
   private int[] P097U26_A136BarColNum ;
   private String[] P097U26_A135BarColNom ;
   private String[] P097U26_A13711BarTipArtD ;
   private boolean[] P097U26_n13711BarTipArtD ;
   private short[] P097U26_A217BarTipArt ;
   private boolean[] P097U26_n217BarTipArt ;
   private String[] P097U26_A212BarSer ;
   private String[] P097U26_A13696BarNHdr ;
   private String[] P097U26_A279CliNom ;
   private int[] P097U26_A252CliCod ;
   private boolean[] P097U26_n252CliCod ;
   private String[] P097U26_A13933BarCuadern ;
   private boolean[] P097U26_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U26_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U26_A13931BarAlbMts ;
   private String[] P097U26_A151BarFasCod ;
   private boolean[] P097U26_n151BarFasCod ;
   private java.math.BigDecimal[] P097U26_A184BarMtr ;
   private java.math.BigDecimal[] P097U26_A166BarKgm ;
   private String[] P097U26_A143BarDisNum ;
   private String[] P097U26_A4812BarEncCli ;
   private short[] P097U26_A199BarPie1 ;
   private String[] P097U26_A365DisDes ;
   private int[] P097U26_A898BarPieNDes ;
   private int[] P097U26_A361DisCod ;
   private String[] P097U26_A130BarCodPar ;
   private byte[] P097U26_A132BarCodReo ;
   private int[] P097U26_A129BarCod ;
   private String[] P097U26_A396EmprCod ;
   private short[] P097U31_A9713Tb1_Cod ;
   private short[] P097U31_A4466BarAcaAnh ;
   private short[] P097U31_A217BarTipArt ;
   private boolean[] P097U31_n217BarTipArt ;
   private byte[] P097U31_A213BarSit ;
   private String[] P097U31_A180BarMaqCod ;
   private java.util.Date[] P097U31_A158BarFecFpr ;
   private java.util.Date[] P097U31_A155BarFecCli ;
   private java.util.Date[] P097U31_A159BarFecGen ;
   private String[] P097U31_A1234BarNomCli ;
   private int[] P097U31_A136BarColNum ;
   private String[] P097U31_A135BarColNom ;
   private String[] P097U31_A13711BarTipArtD ;
   private boolean[] P097U31_n13711BarTipArtD ;
   private String[] P097U31_A1652BarSerDsc ;
   private String[] P097U31_A212BarSer ;
   private String[] P097U31_A13696BarNHdr ;
   private String[] P097U31_A279CliNom ;
   private int[] P097U31_A252CliCod ;
   private boolean[] P097U31_n252CliCod ;
   private String[] P097U31_A13933BarCuadern ;
   private boolean[] P097U31_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U31_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U31_A13931BarAlbMts ;
   private String[] P097U31_A151BarFasCod ;
   private boolean[] P097U31_n151BarFasCod ;
   private java.math.BigDecimal[] P097U31_A184BarMtr ;
   private java.math.BigDecimal[] P097U31_A166BarKgm ;
   private String[] P097U31_A143BarDisNum ;
   private String[] P097U31_A4812BarEncCli ;
   private short[] P097U31_A199BarPie1 ;
   private String[] P097U31_A365DisDes ;
   private int[] P097U31_A898BarPieNDes ;
   private int[] P097U31_A361DisCod ;
   private String[] P097U31_A130BarCodPar ;
   private byte[] P097U31_A132BarCodReo ;
   private int[] P097U31_A129BarCod ;
   private String[] P097U31_A396EmprCod ;
   private short[] P097U36_A9713Tb1_Cod ;
   private short[] P097U36_A4466BarAcaAnh ;
   private String[] P097U36_A135BarColNom ;
   private byte[] P097U36_A213BarSit ;
   private String[] P097U36_A180BarMaqCod ;
   private java.util.Date[] P097U36_A158BarFecFpr ;
   private java.util.Date[] P097U36_A155BarFecCli ;
   private java.util.Date[] P097U36_A159BarFecGen ;
   private String[] P097U36_A1234BarNomCli ;
   private int[] P097U36_A136BarColNum ;
   private String[] P097U36_A13711BarTipArtD ;
   private boolean[] P097U36_n13711BarTipArtD ;
   private short[] P097U36_A217BarTipArt ;
   private boolean[] P097U36_n217BarTipArt ;
   private String[] P097U36_A1652BarSerDsc ;
   private String[] P097U36_A212BarSer ;
   private String[] P097U36_A13696BarNHdr ;
   private String[] P097U36_A279CliNom ;
   private int[] P097U36_A252CliCod ;
   private boolean[] P097U36_n252CliCod ;
   private String[] P097U36_A13933BarCuadern ;
   private boolean[] P097U36_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U36_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U36_A13931BarAlbMts ;
   private String[] P097U36_A151BarFasCod ;
   private boolean[] P097U36_n151BarFasCod ;
   private java.math.BigDecimal[] P097U36_A184BarMtr ;
   private java.math.BigDecimal[] P097U36_A166BarKgm ;
   private String[] P097U36_A143BarDisNum ;
   private String[] P097U36_A4812BarEncCli ;
   private short[] P097U36_A199BarPie1 ;
   private String[] P097U36_A365DisDes ;
   private int[] P097U36_A898BarPieNDes ;
   private int[] P097U36_A361DisCod ;
   private String[] P097U36_A130BarCodPar ;
   private byte[] P097U36_A132BarCodReo ;
   private int[] P097U36_A129BarCod ;
   private String[] P097U36_A396EmprCod ;
   private short[] P097U41_A9713Tb1_Cod ;
   private short[] P097U41_A4466BarAcaAnh ;
   private String[] P097U41_A1234BarNomCli ;
   private byte[] P097U41_A213BarSit ;
   private String[] P097U41_A180BarMaqCod ;
   private java.util.Date[] P097U41_A158BarFecFpr ;
   private java.util.Date[] P097U41_A155BarFecCli ;
   private java.util.Date[] P097U41_A159BarFecGen ;
   private int[] P097U41_A136BarColNum ;
   private String[] P097U41_A135BarColNom ;
   private String[] P097U41_A13711BarTipArtD ;
   private boolean[] P097U41_n13711BarTipArtD ;
   private short[] P097U41_A217BarTipArt ;
   private boolean[] P097U41_n217BarTipArt ;
   private String[] P097U41_A1652BarSerDsc ;
   private String[] P097U41_A212BarSer ;
   private String[] P097U41_A13696BarNHdr ;
   private String[] P097U41_A279CliNom ;
   private int[] P097U41_A252CliCod ;
   private boolean[] P097U41_n252CliCod ;
   private String[] P097U41_A13933BarCuadern ;
   private boolean[] P097U41_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U41_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U41_A13931BarAlbMts ;
   private String[] P097U41_A151BarFasCod ;
   private boolean[] P097U41_n151BarFasCod ;
   private java.math.BigDecimal[] P097U41_A184BarMtr ;
   private java.math.BigDecimal[] P097U41_A166BarKgm ;
   private String[] P097U41_A143BarDisNum ;
   private String[] P097U41_A4812BarEncCli ;
   private short[] P097U41_A199BarPie1 ;
   private String[] P097U41_A365DisDes ;
   private int[] P097U41_A898BarPieNDes ;
   private int[] P097U41_A361DisCod ;
   private String[] P097U41_A130BarCodPar ;
   private byte[] P097U41_A132BarCodReo ;
   private int[] P097U41_A129BarCod ;
   private String[] P097U41_A396EmprCod ;
   private short[] P097U46_A9713Tb1_Cod ;
   private short[] P097U46_A4466BarAcaAnh ;
   private byte[] P097U46_A213BarSit ;
   private String[] P097U46_A180BarMaqCod ;
   private java.util.Date[] P097U46_A158BarFecFpr ;
   private java.util.Date[] P097U46_A155BarFecCli ;
   private java.util.Date[] P097U46_A159BarFecGen ;
   private String[] P097U46_A1234BarNomCli ;
   private int[] P097U46_A136BarColNum ;
   private String[] P097U46_A135BarColNom ;
   private String[] P097U46_A13711BarTipArtD ;
   private boolean[] P097U46_n13711BarTipArtD ;
   private short[] P097U46_A217BarTipArt ;
   private boolean[] P097U46_n217BarTipArt ;
   private String[] P097U46_A1652BarSerDsc ;
   private String[] P097U46_A212BarSer ;
   private String[] P097U46_A13696BarNHdr ;
   private String[] P097U46_A279CliNom ;
   private int[] P097U46_A252CliCod ;
   private boolean[] P097U46_n252CliCod ;
   private String[] P097U46_A13933BarCuadern ;
   private boolean[] P097U46_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U46_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U46_A13931BarAlbMts ;
   private String[] P097U46_A151BarFasCod ;
   private boolean[] P097U46_n151BarFasCod ;
   private java.math.BigDecimal[] P097U46_A184BarMtr ;
   private java.math.BigDecimal[] P097U46_A166BarKgm ;
   private String[] P097U46_A143BarDisNum ;
   private String[] P097U46_A4812BarEncCli ;
   private short[] P097U46_A199BarPie1 ;
   private String[] P097U46_A365DisDes ;
   private int[] P097U46_A898BarPieNDes ;
   private int[] P097U46_A361DisCod ;
   private String[] P097U46_A130BarCodPar ;
   private byte[] P097U46_A132BarCodReo ;
   private int[] P097U46_A129BarCod ;
   private String[] P097U46_A396EmprCod ;
   private short[] P097U51_A9713Tb1_Cod ;
   private short[] P097U51_A4466BarAcaAnh ;
   private String[] P097U51_A180BarMaqCod ;
   private byte[] P097U51_A213BarSit ;
   private java.util.Date[] P097U51_A158BarFecFpr ;
   private java.util.Date[] P097U51_A155BarFecCli ;
   private java.util.Date[] P097U51_A159BarFecGen ;
   private String[] P097U51_A1234BarNomCli ;
   private int[] P097U51_A136BarColNum ;
   private String[] P097U51_A135BarColNom ;
   private String[] P097U51_A13711BarTipArtD ;
   private boolean[] P097U51_n13711BarTipArtD ;
   private short[] P097U51_A217BarTipArt ;
   private boolean[] P097U51_n217BarTipArt ;
   private String[] P097U51_A1652BarSerDsc ;
   private String[] P097U51_A212BarSer ;
   private String[] P097U51_A13696BarNHdr ;
   private String[] P097U51_A279CliNom ;
   private int[] P097U51_A252CliCod ;
   private boolean[] P097U51_n252CliCod ;
   private String[] P097U51_A13933BarCuadern ;
   private boolean[] P097U51_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U51_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U51_A13931BarAlbMts ;
   private String[] P097U51_A151BarFasCod ;
   private boolean[] P097U51_n151BarFasCod ;
   private java.math.BigDecimal[] P097U51_A184BarMtr ;
   private java.math.BigDecimal[] P097U51_A166BarKgm ;
   private String[] P097U51_A143BarDisNum ;
   private String[] P097U51_A4812BarEncCli ;
   private short[] P097U51_A199BarPie1 ;
   private String[] P097U51_A365DisDes ;
   private int[] P097U51_A898BarPieNDes ;
   private int[] P097U51_A361DisCod ;
   private String[] P097U51_A130BarCodPar ;
   private byte[] P097U51_A132BarCodReo ;
   private int[] P097U51_A129BarCod ;
   private String[] P097U51_A396EmprCod ;
   private short[] P097U56_A9713Tb1_Cod ;
   private short[] P097U56_A4466BarAcaAnh ;
   private byte[] P097U56_A213BarSit ;
   private String[] P097U56_A180BarMaqCod ;
   private java.util.Date[] P097U56_A158BarFecFpr ;
   private java.util.Date[] P097U56_A155BarFecCli ;
   private java.util.Date[] P097U56_A159BarFecGen ;
   private String[] P097U56_A1234BarNomCli ;
   private int[] P097U56_A136BarColNum ;
   private String[] P097U56_A135BarColNom ;
   private String[] P097U56_A13711BarTipArtD ;
   private boolean[] P097U56_n13711BarTipArtD ;
   private short[] P097U56_A217BarTipArt ;
   private boolean[] P097U56_n217BarTipArt ;
   private String[] P097U56_A1652BarSerDsc ;
   private String[] P097U56_A212BarSer ;
   private String[] P097U56_A13696BarNHdr ;
   private String[] P097U56_A279CliNom ;
   private int[] P097U56_A252CliCod ;
   private boolean[] P097U56_n252CliCod ;
   private String[] P097U56_A13933BarCuadern ;
   private boolean[] P097U56_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U56_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U56_A13931BarAlbMts ;
   private String[] P097U56_A151BarFasCod ;
   private boolean[] P097U56_n151BarFasCod ;
   private java.math.BigDecimal[] P097U56_A184BarMtr ;
   private java.math.BigDecimal[] P097U56_A166BarKgm ;
   private String[] P097U56_A143BarDisNum ;
   private String[] P097U56_A4812BarEncCli ;
   private short[] P097U56_A199BarPie1 ;
   private String[] P097U56_A365DisDes ;
   private int[] P097U56_A898BarPieNDes ;
   private int[] P097U56_A361DisCod ;
   private String[] P097U56_A130BarCodPar ;
   private byte[] P097U56_A132BarCodReo ;
   private int[] P097U56_A129BarCod ;
   private String[] P097U56_A396EmprCod ;
   private short[] P097U61_A9713Tb1_Cod ;
   private short[] P097U61_A4466BarAcaAnh ;
   private byte[] P097U61_A213BarSit ;
   private String[] P097U61_A180BarMaqCod ;
   private java.util.Date[] P097U61_A158BarFecFpr ;
   private java.util.Date[] P097U61_A155BarFecCli ;
   private java.util.Date[] P097U61_A159BarFecGen ;
   private String[] P097U61_A1234BarNomCli ;
   private int[] P097U61_A136BarColNum ;
   private String[] P097U61_A135BarColNom ;
   private String[] P097U61_A13711BarTipArtD ;
   private boolean[] P097U61_n13711BarTipArtD ;
   private short[] P097U61_A217BarTipArt ;
   private boolean[] P097U61_n217BarTipArt ;
   private String[] P097U61_A1652BarSerDsc ;
   private String[] P097U61_A212BarSer ;
   private String[] P097U61_A13696BarNHdr ;
   private String[] P097U61_A279CliNom ;
   private int[] P097U61_A252CliCod ;
   private boolean[] P097U61_n252CliCod ;
   private String[] P097U61_A13933BarCuadern ;
   private boolean[] P097U61_n13933BarCuadern ;
   private java.math.BigDecimal[] P097U61_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097U61_A13931BarAlbMts ;
   private String[] P097U61_A151BarFasCod ;
   private boolean[] P097U61_n151BarFasCod ;
   private java.math.BigDecimal[] P097U61_A184BarMtr ;
   private java.math.BigDecimal[] P097U61_A166BarKgm ;
   private String[] P097U61_A143BarDisNum ;
   private String[] P097U61_A4812BarEncCli ;
   private short[] P097U61_A199BarPie1 ;
   private String[] P097U61_A365DisDes ;
   private int[] P097U61_A898BarPieNDes ;
   private int[] P097U61_A361DisCod ;
   private String[] P097U61_A130BarCodPar ;
   private byte[] P097U61_A132BarCodReo ;
   private int[] P097U61_A129BarCod ;
   private String[] P097U61_A396EmprCod ;
   private GXSimpleCollection<String> AV51Options ;
   private GXSimpleCollection<String> AV54OptionsDesc ;
   private GXSimpleCollection<String> AV56OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV61GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV62GridStateFilterValue ;
}

final  class listadodehdrs_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097U6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV103Listadodehdrs_wcds_2_tfclicod ,
                                          int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                          String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                          String AV105Listadodehdrs_wcds_4_tfclinom ,
                                          String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                          String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                          String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                          String AV111Listadodehdrs_wcds_10_tfbarser ,
                                          String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                          String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                          short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                          short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                          String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                          String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                          String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                          String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                          int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                          int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                          String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                          String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                          java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                          java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                          java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                          java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                          java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                          java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                          java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                          String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                          String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                          byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                          byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                          java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                          java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                          java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                          java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A217BarTipArt ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          String A180BarMaqCod ,
                                          byte A213BarSit ,
                                          java.math.BigDecimal A13931BarAlbMts ,
                                          java.math.BigDecimal A13932BarAlbKgs ,
                                          String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String A151BarFasCod ,
                                          long A13930BarAlbUlti ,
                                          String A13933BarCuadern ,
                                          String A13934BarNormas ,
                                          int A13935BarAlbFact ,
                                          String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                          int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                          int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                          String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                          String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                          long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                          long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                          String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                          String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                          String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                          String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                          int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                          int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                          java.util.Date AV68BarFecGen ,
                                          java.util.Date AV69BarFecGen_to ,
                                          java.util.Date AV72BarFecCli ,
                                          java.util.Date AV73BarFecCli_to ,
                                          int AV70Clicod ,
                                          int AV71Clicod_to ,
                                          byte AV66BarSit ,
                                          byte AV67BarSit_to ,
                                          String A396EmprCod ,
                                          String AV65Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[55];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T3.CliNom, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts, 0) AS BarAlbMts," ;
      scmdbuf += " COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T7.BarPie1," ;
      scmdbuf += " 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN" ;
      scmdbuf += " TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN" ;
      scmdbuf += " TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarAlbMtrE)" ;
      scmdbuf += " AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN" ;
      scmdbuf += " (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON" ;
      scmdbuf += " T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int11[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int11[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int11[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int11[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.CliNom" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P097U11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String AV65Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[55];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int13[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int13[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int13[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int13[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int13[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int13[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int13[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int13[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int13[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int13[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int13[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int13[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int13[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int13[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int13[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int13[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P097U16( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String AV65Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[55];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int15[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int15[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int15[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int15[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int15[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int15[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int15[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int15[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int15[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int15[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int15[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int15[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int15[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int15[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int15[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int15[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int15[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int15[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int15[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int15[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int15[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int15[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int15[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_P097U21( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String AV65Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[55];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSer, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int17[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int17[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int17[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int17[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int17[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int17[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int17[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int17[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarSer" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P097U26( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String A396EmprCod ,
                                           String AV65Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[55];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSerDsc, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc" ;
      scmdbuf += " AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int19[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int19[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int19[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int19[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int19[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int19[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int19[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int19[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int19[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int19[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int19[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int19[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int19[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int19[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int19[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_P097U31( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String AV65Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[55];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarTipArt AS BarTipArt, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom," ;
      scmdbuf += " T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int21[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int21[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int21[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int21[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int21[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int21[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int21[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int21[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int21[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int21[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int21[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int21[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int21[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int21[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int21[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarTipArt" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_P097U36( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String A396EmprCod ,
                                           String AV65Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[55];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarColNom, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int23[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int23[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int23[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int23[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int23[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int23[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int23[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int23[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P097U41( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String A396EmprCod ,
                                           String AV65Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[55];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarNomCli, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int25[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int25[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int25[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int25[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int25[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int25[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int25[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int25[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_P097U46( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String AV65Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[55];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int27[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int27[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int27[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int27[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int27[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int27[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int27[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int27[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_P097U51( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String AV65Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[55];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarMaqCod, T1.BarSit, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarMaqCod" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_P097U56( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String AV65Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[55];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int31[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int31[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int31[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int31[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int31[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int31[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int31[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int31[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int31[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int31[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int31[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int31[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int31[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int31[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int31[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_P097U61( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV103Listadodehdrs_wcds_2_tfclicod ,
                                           int AV104Listadodehdrs_wcds_3_tfclicod_to ,
                                           String AV106Listadodehdrs_wcds_5_tfclinom_sel ,
                                           String AV105Listadodehdrs_wcds_4_tfclinom ,
                                           String AV110Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           String AV109Listadodehdrs_wcds_8_tfbarnhdr ,
                                           String AV112Listadodehdrs_wcds_11_tfbarser_sel ,
                                           String AV111Listadodehdrs_wcds_10_tfbarser ,
                                           String AV114Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           String AV113Listadodehdrs_wcds_12_tfbarserdsc ,
                                           short AV115Listadodehdrs_wcds_14_tfbartipart ,
                                           short AV116Listadodehdrs_wcds_15_tfbartipart_to ,
                                           String AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           String AV117Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           String AV120Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           String AV119Listadodehdrs_wcds_18_tfbarcolnom ,
                                           int AV121Listadodehdrs_wcds_20_tfbarcolnum ,
                                           int AV122Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                           String AV124Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           String AV123Listadodehdrs_wcds_22_tfbarnomcli ,
                                           java.math.BigDecimal AV125Listadodehdrs_wcds_24_tfbarkgm ,
                                           java.math.BigDecimal AV126Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           java.math.BigDecimal AV127Listadodehdrs_wcds_26_tfbarmtr ,
                                           java.math.BigDecimal AV128Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           java.util.Date AV131Listadodehdrs_wcds_30_tfbarfecgen ,
                                           java.util.Date AV132Listadodehdrs_wcds_31_tfbarfeccli ,
                                           java.util.Date AV133Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           String AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           String AV136Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           byte AV138Listadodehdrs_wcds_37_tfbarsit ,
                                           byte AV139Listadodehdrs_wcds_38_tfbarsit_to ,
                                           java.math.BigDecimal AV142Listadodehdrs_wcds_41_tfbaralbmts ,
                                           java.math.BigDecimal AV143Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           java.math.BigDecimal AV144Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           java.math.BigDecimal AV145Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           short A217BarTipArt ,
                                           String A13711BarTipArtD ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String A180BarMaqCod ,
                                           byte A213BarSit ,
                                           java.math.BigDecimal A13931BarAlbMts ,
                                           java.math.BigDecimal A13932BarAlbKgs ,
                                           String AV102Listadodehdrs_wcds_1_filterfulltext ,
                                           String A13878PedidoClie ,
                                           String A13696BarNHdr ,
                                           int A198BarPie ,
                                           String A151BarFasCod ,
                                           long A13930BarAlbUlti ,
                                           String A13933BarCuadern ,
                                           String A13934BarNormas ,
                                           int A13935BarAlbFact ,
                                           String AV108Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           String AV107Listadodehdrs_wcds_6_tfpedidocliente ,
                                           int AV129Listadodehdrs_wcds_28_tfbarpie ,
                                           int AV130Listadodehdrs_wcds_29_tfbarpie_to ,
                                           String AV135Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           String AV134Listadodehdrs_wcds_33_tfbarfascod ,
                                           long AV140Listadodehdrs_wcds_39_tfbaralbultimo ,
                                           long AV141Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                           String AV147Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           String AV146Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           String AV149Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           String AV148Listadodehdrs_wcds_47_tfbarnormas ,
                                           int AV150Listadodehdrs_wcds_49_tfbaralbfact ,
                                           int AV151Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                           java.util.Date AV68BarFecGen ,
                                           java.util.Date AV69BarFecGen_to ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCli_to ,
                                           int AV70Clicod ,
                                           int AV71Clicod_to ,
                                           byte AV66BarSit ,
                                           byte AV67BarSit_to ,
                                           String AV65Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[55];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV103Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! (0==AV104Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( ! (0==AV115Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( ! (0==AV116Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( ! (0==AV121Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! (0==AV122Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int33[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int33[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int33[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int33[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV131Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int33[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int33[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int33[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV136Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int33[48] = (byte)(1) ;
      }
      if ( ! (0==AV138Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int33[49] = (byte)(1) ;
      }
      if ( ! (0==AV139Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int33[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int33[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int33[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int33[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int33[54] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
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
                  return conditional_P097U6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 1 :
                  return conditional_P097U11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 2 :
                  return conditional_P097U16(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 3 :
                  return conditional_P097U21(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 4 :
                  return conditional_P097U26(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 5 :
                  return conditional_P097U31(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 6 :
                  return conditional_P097U36(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 7 :
                  return conditional_P097U41(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 8 :
                  return conditional_P097U46(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 9 :
                  return conditional_P097U51(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 10 :
                  return conditional_P097U56(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
            case 11 :
                  return conditional_P097U61(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , ((Number) dynConstraints[61]).longValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).longValue() , ((Number) dynConstraints[72]).longValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , ((Number) dynConstraints[77]).intValue() , ((Number) dynConstraints[78]).intValue() , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).byteValue() , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097U6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U16", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U21", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U26", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U31", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U36", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U41", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U46", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U51", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U56", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097U61", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 16);
               ((String[]) buf[17])[0] = rslt.getString(16, 11);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
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
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
      }
   }

}

