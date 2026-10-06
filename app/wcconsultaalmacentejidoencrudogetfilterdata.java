package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultaalmacentejidoencrudogetfilterdata extends GXProcedure
{
   public wcconsultaalmacentejidoencrudogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultaalmacentejidoencrudogetfilterdata.class ), "" );
   }

   public wcconsultaalmacentejidoencrudogetfilterdata( int remoteHandle ,
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
      wcconsultaalmacentejidoencrudogetfilterdata.this.aP5 = new String[] {""};
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
      wcconsultaalmacentejidoencrudogetfilterdata.this.AV46DDOName = aP0;
      wcconsultaalmacentejidoencrudogetfilterdata.this.AV44SearchTxt = aP1;
      wcconsultaalmacentejidoencrudogetfilterdata.this.AV45SearchTxtTo = aP2;
      wcconsultaalmacentejidoencrudogetfilterdata.this.aP3 = aP3;
      wcconsultaalmacentejidoencrudogetfilterdata.this.aP4 = aP4;
      wcconsultaalmacentejidoencrudogetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV49Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLINOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBREFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBRDISCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRDISCLIOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBRTARTD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRTARTDOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBRLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRLOTEOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBRLOC") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRLOCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PROCENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCENOMOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_COMPOSICION") == 0 )
      {
         /* Execute user subroutine: 'LOADCOMPOSICIONOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_TIPENTNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPENTNOMOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_ALBRDES") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRDESOPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV50OptionsJson = AV49Options.toJSonString(false) ;
      AV53OptionsDescJson = AV52OptionsDesc.toJSonString(false) ;
      AV55OptionIndexesJson = AV54OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV57Session.getValue("WCConsultaAlmacenTejidoencrudoGridState"), "") == 0 )
      {
         AV59GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaAlmacenTejidoencrudoGridState"), null, null);
      }
      else
      {
         AV59GridState.fromxml(AV57Session.getValue("WCConsultaAlmacenTejidoencrudoGridState"), null, null);
      }
      AV92GXV1 = 1 ;
      while ( AV92GXV1 <= AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV60GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV1));
         if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV62FilterFullText = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV12TFAlbRecCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFAlbRecCod_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV73TFAlbRReo_SelsJson = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV74TFAlbRReo_Sels.fromJSonString(AV73TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV10TFAlbRFen = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV18TFAlbRef = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV19TFAlbRef_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV20TFAlbRefDsc = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV21TFAlbRefDsc_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDISCLI") == 0 )
         {
            AV22TFAlbRDisCli = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDISCLI_SEL") == 0 )
         {
            AV23TFAlbRDisCli_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD") == 0 )
         {
            AV24TFAlbRTartD = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD_SEL") == 0 )
         {
            AV25TFAlbRTartD_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV26TFAlbRLote = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV27TFAlbRLote_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV28TFAlbRLoc = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV29TFAlbRLoc_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV30TFAlbRPieEnt = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFAlbRPieEnt_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV32TFAlbRPieUti = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFAlbRPieUti_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV34TFAlbRPieDis = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFAlbRPieDis_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV36TFAlbRUni_SelsJson = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV37TFAlbRUni_Sels.fromJSonString(AV36TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV38TFAlbRUniEnt = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFAlbRUniEnt_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV40TFAlbRUniUti = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFAlbRUniUti_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV42TFAlbRUniDis = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFAlbRUniDis_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV71TFAlbREst_SelsJson = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV72TFAlbREst_Sels.fromJSonString(AV71TFAlbREst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV75TFProceNom = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV76TFProceNom_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOMPOSICION") == 0 )
         {
            AV79TFComposicion = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOMPOSICION_SEL") == 0 )
         {
            AV80TFComposicion_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV84TFTipEntNom = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV85TFTipEntNom_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV88TFAlbRDes = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV89TFAlbRDes_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV63Emprcod = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRFEN") == 0 )
         {
            AV64Albrfen = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRFEN_TO") == 0 )
         {
            AV65Albrfen_to = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV66Clicod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV67Clicod_to = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF") == 0 )
         {
            AV68AlbRef = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF_TO") == 0 )
         {
            AV83albref_to = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECOD") == 0 )
         {
            AV77Procecod = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECOD_TO") == 0 )
         {
            AV78ProceCod_to = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRREO") == 0 )
         {
            AV69AlbRReo = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREST") == 0 )
         {
            AV70AlbREst = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPENTCOD") == 0 )
         {
            AV86TipEntCod = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRUNI") == 0 )
         {
            AV87AlbRUni = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV92GXV1 = (int)(AV92GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV44SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           AV87AlbRUni } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT2 */
      pr_default.execute(0, new Object[] {AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV63Emprcod, AV87AlbRUni, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8ZT2 = false ;
         A6263AlbRTartC = P08ZT2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT2_n6263AlbRTartC[0] ;
         A56AlbRUni = P08ZT2_A56AlbRUni[0] ;
         A279CliNom = P08ZT2_A279CliNom[0] ;
         A1211TipEntCod = P08ZT2_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT2_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT2_A970ProceCod[0] ;
         n970ProceCod = P08ZT2_n970ProceCod[0] ;
         A1291AlbRDes = P08ZT2_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT2_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT2_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT2_A971ProceNom[0] ;
         n971ProceNom = P08ZT2_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT2_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT2_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT2_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZT2_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT2_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT2_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZT2_A3613AlbRefDsc[0] ;
         A49AlbRFen = P08ZT2_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT2_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT2_A47AlbREst[0] ;
         A55AlbRReo = P08ZT2_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT2_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT2_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT2_A45AlbRef[0] ;
         A252CliCod = P08ZT2_A252CliCod[0] ;
         A396EmprCod = P08ZT2_A396EmprCod[0] ;
         A279CliNom = P08ZT2_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT2_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT2_A971ProceNom[0] ;
         n971ProceNom = P08ZT2_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT2_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT2_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char6[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char3[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char6[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08ZT2_A279CliNom[0], A279CliNom) == 0 ) )
                     {
                        brk8ZT2 = false ;
                        A44AlbRecCod = P08ZT2_A44AlbRecCod[0] ;
                        A252CliCod = P08ZT2_A252CliCod[0] ;
                        A396EmprCod = P08ZT2_A396EmprCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT2 = true ;
                        pr_default.readNext(0);
                     }
                     if ( ! (GXutil.strcmp("", A279CliNom)==0) )
                     {
                        AV48Option = A279CliNom ;
                        AV49Options.add(AV48Option, 0);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT2 )
         {
            brk8ZT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV18TFAlbRef = AV44SearchTxt ;
      AV19TFAlbRef_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           AV87AlbRUni ,
                                           AV68AlbRef ,
                                           AV83albref_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT3 */
      pr_default.execute(1, new Object[] {AV68AlbRef, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV63Emprcod, AV87AlbRUni, AV83albref_to, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8ZT4 = false ;
         A6263AlbRTartC = P08ZT3_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT3_n6263AlbRTartC[0] ;
         A56AlbRUni = P08ZT3_A56AlbRUni[0] ;
         A1211TipEntCod = P08ZT3_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT3_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT3_A970ProceCod[0] ;
         n970ProceCod = P08ZT3_n970ProceCod[0] ;
         A1291AlbRDes = P08ZT3_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT3_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT3_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT3_A971ProceNom[0] ;
         n971ProceNom = P08ZT3_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT3_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT3_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT3_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZT3_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT3_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT3_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT3_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZT3_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZT3_A279CliNom[0] ;
         A49AlbRFen = P08ZT3_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT3_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT3_A47AlbREst[0] ;
         A55AlbRReo = P08ZT3_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT3_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT3_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT3_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT3_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT3_A45AlbRef[0] ;
         A252CliCod = P08ZT3_A252CliCod[0] ;
         A396EmprCod = P08ZT3_A396EmprCod[0] ;
         A279CliNom = P08ZT3_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT3_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT3_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT3_A971ProceNom[0] ;
         n971ProceNom = P08ZT3_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT3_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT3_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08ZT3_A45AlbRef[0], A45AlbRef) == 0 ) )
                     {
                        brk8ZT4 = false ;
                        A44AlbRecCod = P08ZT3_A44AlbRecCod[0] ;
                        A396EmprCod = P08ZT3_A396EmprCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT4 = true ;
                        pr_default.readNext(1);
                     }
                     if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
                     {
                        AV48Option = A45AlbRef ;
                        AV49Options.add(AV48Option, 0);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT4 )
         {
            brk8ZT4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBREFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFAlbRefDsc = AV44SearchTxt ;
      AV21TFAlbRefDsc_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           AV87AlbRUni } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT4 */
      pr_default.execute(2, new Object[] {AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV63Emprcod, AV87AlbRUni, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8ZT6 = false ;
         A6263AlbRTartC = P08ZT4_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT4_n6263AlbRTartC[0] ;
         A56AlbRUni = P08ZT4_A56AlbRUni[0] ;
         A3613AlbRefDsc = P08ZT4_A3613AlbRefDsc[0] ;
         A1211TipEntCod = P08ZT4_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT4_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT4_A970ProceCod[0] ;
         n970ProceCod = P08ZT4_n970ProceCod[0] ;
         A1291AlbRDes = P08ZT4_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT4_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT4_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT4_A971ProceNom[0] ;
         n971ProceNom = P08ZT4_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT4_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT4_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT4_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZT4_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT4_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT4_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT4_A3359AlbRDisCli[0] ;
         A279CliNom = P08ZT4_A279CliNom[0] ;
         A49AlbRFen = P08ZT4_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT4_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT4_A47AlbREst[0] ;
         A55AlbRReo = P08ZT4_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT4_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT4_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT4_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT4_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT4_A45AlbRef[0] ;
         A252CliCod = P08ZT4_A252CliCod[0] ;
         A396EmprCod = P08ZT4_A396EmprCod[0] ;
         A279CliNom = P08ZT4_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT4_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT4_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT4_A971ProceNom[0] ;
         n971ProceNom = P08ZT4_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT4_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT4_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08ZT4_A3613AlbRefDsc[0], A3613AlbRefDsc) == 0 ) )
                     {
                        brk8ZT6 = false ;
                        A44AlbRecCod = P08ZT4_A44AlbRecCod[0] ;
                        A396EmprCod = P08ZT4_A396EmprCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT6 = true ;
                        pr_default.readNext(2);
                     }
                     if ( ! (GXutil.strcmp("", A3613AlbRefDsc)==0) )
                     {
                        AV48Option = A3613AlbRefDsc ;
                        AV49Options.add(AV48Option, 0);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT6 )
         {
            brk8ZT6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBRDISCLIOPTIONS' Routine */
      returnInSub = false ;
      AV22TFAlbRDisCli = AV44SearchTxt ;
      AV23TFAlbRDisCli_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           AV87AlbRUni } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT5 */
      pr_default.execute(3, new Object[] {AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV63Emprcod, AV87AlbRUni, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8ZT8 = false ;
         A6263AlbRTartC = P08ZT5_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT5_n6263AlbRTartC[0] ;
         A56AlbRUni = P08ZT5_A56AlbRUni[0] ;
         A3359AlbRDisCli = P08ZT5_A3359AlbRDisCli[0] ;
         A1211TipEntCod = P08ZT5_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT5_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT5_A970ProceCod[0] ;
         n970ProceCod = P08ZT5_n970ProceCod[0] ;
         A1291AlbRDes = P08ZT5_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT5_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT5_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT5_A971ProceNom[0] ;
         n971ProceNom = P08ZT5_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT5_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT5_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT5_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZT5_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT5_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT5_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P08ZT5_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZT5_A279CliNom[0] ;
         A49AlbRFen = P08ZT5_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT5_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT5_A47AlbREst[0] ;
         A55AlbRReo = P08ZT5_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT5_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT5_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT5_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT5_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT5_A45AlbRef[0] ;
         A252CliCod = P08ZT5_A252CliCod[0] ;
         A396EmprCod = P08ZT5_A396EmprCod[0] ;
         A279CliNom = P08ZT5_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT5_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT5_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT5_A971ProceNom[0] ;
         n971ProceNom = P08ZT5_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT5_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT5_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08ZT5_A3359AlbRDisCli[0], A3359AlbRDisCli) == 0 ) )
                     {
                        brk8ZT8 = false ;
                        A44AlbRecCod = P08ZT5_A44AlbRecCod[0] ;
                        A396EmprCod = P08ZT5_A396EmprCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT8 = true ;
                        pr_default.readNext(3);
                     }
                     if ( ! (GXutil.strcmp("", A3359AlbRDisCli)==0) )
                     {
                        AV48Option = A3359AlbRDisCli ;
                        AV49Options.add(AV48Option, 0);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT8 )
         {
            brk8ZT8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBRTARTDOPTIONS' Routine */
      returnInSub = false ;
      AV24TFAlbRTartD = AV44SearchTxt ;
      AV25TFAlbRTartD_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           AV87AlbRUni ,
                                           AV63Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT6 */
      pr_default.execute(4, new Object[] {AV63Emprcod, AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV87AlbRUni, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8ZT10 = false ;
         A6263AlbRTartC = P08ZT6_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT6_n6263AlbRTartC[0] ;
         A1211TipEntCod = P08ZT6_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT6_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT6_A970ProceCod[0] ;
         n970ProceCod = P08ZT6_n970ProceCod[0] ;
         A1291AlbRDes = P08ZT6_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT6_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT6_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT6_A971ProceNom[0] ;
         n971ProceNom = P08ZT6_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT6_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT6_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT6_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZT6_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT6_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT6_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT6_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZT6_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZT6_A279CliNom[0] ;
         A49AlbRFen = P08ZT6_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT6_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT6_A47AlbREst[0] ;
         A56AlbRUni = P08ZT6_A56AlbRUni[0] ;
         A55AlbRReo = P08ZT6_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT6_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT6_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT6_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT6_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT6_A45AlbRef[0] ;
         A252CliCod = P08ZT6_A252CliCod[0] ;
         A396EmprCod = P08ZT6_A396EmprCod[0] ;
         A279CliNom = P08ZT6_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT6_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT6_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT6_A971ProceNom[0] ;
         n971ProceNom = P08ZT6_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT6_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT6_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08ZT6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08ZT6_A6263AlbRTartC[0] == A6263AlbRTartC ) )
                     {
                        brk8ZT10 = false ;
                        A44AlbRecCod = P08ZT6_A44AlbRecCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT10 = true ;
                        pr_default.readNext(4);
                     }
                     if ( ! (GXutil.strcmp("", A6264AlbRTartD)==0) )
                     {
                        AV48Option = A6264AlbRTartD ;
                        AV47InsertIndex = 1 ;
                        while ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV49Options.elementAt(-1+AV47InsertIndex), AV48Option) < 0 ) )
                        {
                           AV47InsertIndex = (int)(AV47InsertIndex+1) ;
                        }
                        AV49Options.add(AV48Option, AV47InsertIndex);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), AV47InsertIndex);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT10 )
         {
            brk8ZT10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBRLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV26TFAlbRLote = AV44SearchTxt ;
      AV27TFAlbRLote_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           AV87AlbRUni } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT7 */
      pr_default.execute(5, new Object[] {AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV63Emprcod, AV87AlbRUni, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8ZT12 = false ;
         A6263AlbRTartC = P08ZT7_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT7_n6263AlbRTartC[0] ;
         A56AlbRUni = P08ZT7_A56AlbRUni[0] ;
         A6463AlbRLote = P08ZT7_A6463AlbRLote[0] ;
         A1211TipEntCod = P08ZT7_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT7_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT7_A970ProceCod[0] ;
         n970ProceCod = P08ZT7_n970ProceCod[0] ;
         A1291AlbRDes = P08ZT7_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT7_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT7_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT7_A971ProceNom[0] ;
         n971ProceNom = P08ZT7_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT7_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT7_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT7_A50AlbRLoc[0] ;
         A6264AlbRTartD = P08ZT7_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT7_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT7_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZT7_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZT7_A279CliNom[0] ;
         A49AlbRFen = P08ZT7_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT7_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT7_A47AlbREst[0] ;
         A55AlbRReo = P08ZT7_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT7_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT7_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT7_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT7_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT7_A45AlbRef[0] ;
         A252CliCod = P08ZT7_A252CliCod[0] ;
         A396EmprCod = P08ZT7_A396EmprCod[0] ;
         A279CliNom = P08ZT7_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT7_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT7_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT7_A971ProceNom[0] ;
         n971ProceNom = P08ZT7_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT7_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT7_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08ZT7_A6463AlbRLote[0], A6463AlbRLote) == 0 ) )
                     {
                        brk8ZT12 = false ;
                        A44AlbRecCod = P08ZT7_A44AlbRecCod[0] ;
                        A396EmprCod = P08ZT7_A396EmprCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT12 = true ;
                        pr_default.readNext(5);
                     }
                     if ( ! (GXutil.strcmp("", A6463AlbRLote)==0) )
                     {
                        AV48Option = A6463AlbRLote ;
                        AV49Options.add(AV48Option, 0);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT12 )
         {
            brk8ZT12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADALBRLOCOPTIONS' Routine */
      returnInSub = false ;
      AV28TFAlbRLoc = AV44SearchTxt ;
      AV29TFAlbRLoc_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           AV87AlbRUni } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT8 */
      pr_default.execute(6, new Object[] {AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV63Emprcod, AV87AlbRUni, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8ZT14 = false ;
         A6263AlbRTartC = P08ZT8_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT8_n6263AlbRTartC[0] ;
         A56AlbRUni = P08ZT8_A56AlbRUni[0] ;
         A50AlbRLoc = P08ZT8_A50AlbRLoc[0] ;
         A1211TipEntCod = P08ZT8_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT8_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT8_A970ProceCod[0] ;
         n970ProceCod = P08ZT8_n970ProceCod[0] ;
         A1291AlbRDes = P08ZT8_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT8_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT8_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT8_A971ProceNom[0] ;
         n971ProceNom = P08ZT8_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT8_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT8_A51AlbRPieDis[0] ;
         A6463AlbRLote = P08ZT8_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT8_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT8_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT8_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZT8_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZT8_A279CliNom[0] ;
         A49AlbRFen = P08ZT8_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT8_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT8_A47AlbREst[0] ;
         A55AlbRReo = P08ZT8_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT8_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT8_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT8_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT8_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT8_A45AlbRef[0] ;
         A252CliCod = P08ZT8_A252CliCod[0] ;
         A396EmprCod = P08ZT8_A396EmprCod[0] ;
         A279CliNom = P08ZT8_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT8_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT8_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT8_A971ProceNom[0] ;
         n971ProceNom = P08ZT8_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT8_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT8_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08ZT8_A50AlbRLoc[0], A50AlbRLoc) == 0 ) )
                     {
                        brk8ZT14 = false ;
                        A44AlbRecCod = P08ZT8_A44AlbRecCod[0] ;
                        A396EmprCod = P08ZT8_A396EmprCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT14 = true ;
                        pr_default.readNext(6);
                     }
                     if ( ! (GXutil.strcmp("", A50AlbRLoc)==0) )
                     {
                        AV48Option = A50AlbRLoc ;
                        AV49Options.add(AV48Option, 0);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT14 )
         {
            brk8ZT14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADPROCENOMOPTIONS' Routine */
      returnInSub = false ;
      AV75TFProceNom = AV44SearchTxt ;
      AV76TFProceNom_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           AV87AlbRUni ,
                                           AV63Emprcod ,
                                           Short.valueOf(AV77Procecod) ,
                                           A396EmprCod ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV78ProceCod_to) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT9 */
      pr_default.execute(7, new Object[] {AV63Emprcod, Short.valueOf(AV77Procecod), AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV87AlbRUni, Short.valueOf(AV78ProceCod_to), Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8ZT16 = false ;
         A6263AlbRTartC = P08ZT9_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT9_n6263AlbRTartC[0] ;
         A970ProceCod = P08ZT9_A970ProceCod[0] ;
         n970ProceCod = P08ZT9_n970ProceCod[0] ;
         A1211TipEntCod = P08ZT9_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT9_n1211TipEntCod[0] ;
         A1291AlbRDes = P08ZT9_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT9_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT9_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT9_A971ProceNom[0] ;
         n971ProceNom = P08ZT9_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT9_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT9_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT9_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZT9_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT9_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT9_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT9_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZT9_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZT9_A279CliNom[0] ;
         A49AlbRFen = P08ZT9_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT9_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT9_A47AlbREst[0] ;
         A56AlbRUni = P08ZT9_A56AlbRUni[0] ;
         A55AlbRReo = P08ZT9_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT9_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT9_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT9_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT9_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT9_A45AlbRef[0] ;
         A252CliCod = P08ZT9_A252CliCod[0] ;
         A396EmprCod = P08ZT9_A396EmprCod[0] ;
         A279CliNom = P08ZT9_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT9_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT9_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT9_A971ProceNom[0] ;
         n971ProceNom = P08ZT9_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT9_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT9_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08ZT9_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08ZT9_A970ProceCod[0] == A970ProceCod ) )
                     {
                        brk8ZT16 = false ;
                        A44AlbRecCod = P08ZT9_A44AlbRecCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT16 = true ;
                        pr_default.readNext(7);
                     }
                     if ( ! (GXutil.strcmp("", A971ProceNom)==0) )
                     {
                        AV48Option = A971ProceNom ;
                        AV47InsertIndex = 1 ;
                        while ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV49Options.elementAt(-1+AV47InsertIndex), AV48Option) < 0 ) )
                        {
                           AV47InsertIndex = (int)(AV47InsertIndex+1) ;
                        }
                        AV49Options.add(AV48Option, AV47InsertIndex);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), AV47InsertIndex);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT16 )
         {
            brk8ZT16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADCOMPOSICIONOPTIONS' Routine */
      returnInSub = false ;
      AV79TFComposicion = AV44SearchTxt ;
      AV80TFComposicion_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           AV87AlbRUni ,
                                           AV63Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT10 */
      pr_default.execute(8, new Object[] {AV63Emprcod, AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV87AlbRUni, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A6263AlbRTartC = P08ZT10_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT10_n6263AlbRTartC[0] ;
         A1211TipEntCod = P08ZT10_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT10_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT10_A970ProceCod[0] ;
         n970ProceCod = P08ZT10_n970ProceCod[0] ;
         A1291AlbRDes = P08ZT10_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT10_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT10_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT10_A971ProceNom[0] ;
         n971ProceNom = P08ZT10_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT10_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT10_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT10_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZT10_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT10_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT10_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT10_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZT10_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZT10_A279CliNom[0] ;
         A49AlbRFen = P08ZT10_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT10_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT10_A47AlbREst[0] ;
         A56AlbRUni = P08ZT10_A56AlbRUni[0] ;
         A55AlbRReo = P08ZT10_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT10_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT10_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT10_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT10_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT10_A45AlbRef[0] ;
         A252CliCod = P08ZT10_A252CliCod[0] ;
         A396EmprCod = P08ZT10_A396EmprCod[0] ;
         A279CliNom = P08ZT10_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT10_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT10_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT10_A971ProceNom[0] ;
         n971ProceNom = P08ZT10_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT10_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT10_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     if ( ! (GXutil.strcmp("", A13981Composicio)==0) )
                     {
                        AV48Option = A13981Composicio ;
                        AV47InsertIndex = 1 ;
                        while ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV49Options.elementAt(-1+AV47InsertIndex), AV48Option) < 0 ) )
                        {
                           AV47InsertIndex = (int)(AV47InsertIndex+1) ;
                        }
                        if ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV49Options.elementAt(-1+AV47InsertIndex), AV48Option) == 0 ) )
                        {
                           AV56count = GXutil.lval( (String)AV54OptionIndexes.elementAt(-1+AV47InsertIndex)) ;
                           AV56count = (long)(AV56count+1) ;
                           AV54OptionIndexes.removeItem(AV47InsertIndex);
                           AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), AV47InsertIndex);
                        }
                        else
                        {
                           AV49Options.add(AV48Option, AV47InsertIndex);
                           AV54OptionIndexes.add("1", AV47InsertIndex);
                        }
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
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
      /* 'LOADTIPENTNOMOPTIONS' Routine */
      returnInSub = false ;
      AV84TFTipEntNom = AV44SearchTxt ;
      AV85TFTipEntNom_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           AV87AlbRUni ,
                                           AV63Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT11 */
      pr_default.execute(9, new Object[] {AV63Emprcod, AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV87AlbRUni, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk8ZT19 = false ;
         A6263AlbRTartC = P08ZT11_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT11_n6263AlbRTartC[0] ;
         A1211TipEntCod = P08ZT11_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT11_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT11_A970ProceCod[0] ;
         n970ProceCod = P08ZT11_n970ProceCod[0] ;
         A1291AlbRDes = P08ZT11_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZT11_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT11_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT11_A971ProceNom[0] ;
         n971ProceNom = P08ZT11_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT11_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT11_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT11_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZT11_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT11_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT11_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT11_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZT11_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZT11_A279CliNom[0] ;
         A49AlbRFen = P08ZT11_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT11_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT11_A47AlbREst[0] ;
         A56AlbRUni = P08ZT11_A56AlbRUni[0] ;
         A55AlbRReo = P08ZT11_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT11_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT11_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT11_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT11_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT11_A45AlbRef[0] ;
         A252CliCod = P08ZT11_A252CliCod[0] ;
         A396EmprCod = P08ZT11_A396EmprCod[0] ;
         A279CliNom = P08ZT11_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT11_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT11_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT11_A971ProceNom[0] ;
         n971ProceNom = P08ZT11_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT11_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT11_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P08ZT11_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08ZT11_A1211TipEntCod[0] == A1211TipEntCod ) )
                     {
                        brk8ZT19 = false ;
                        A44AlbRecCod = P08ZT11_A44AlbRecCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT19 = true ;
                        pr_default.readNext(9);
                     }
                     if ( ! (GXutil.strcmp("", A1212TipEntNom)==0) )
                     {
                        AV48Option = A1212TipEntNom ;
                        AV47InsertIndex = 1 ;
                        while ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV49Options.elementAt(-1+AV47InsertIndex), AV48Option) < 0 ) )
                        {
                           AV47InsertIndex = (int)(AV47InsertIndex+1) ;
                        }
                        AV49Options.add(AV48Option, AV47InsertIndex);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), AV47InsertIndex);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT19 )
         {
            brk8ZT19 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADALBRDESOPTIONS' Routine */
      returnInSub = false ;
      AV88TFAlbRDes = AV44SearchTxt ;
      AV89TFAlbRDes_Sel = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV62FilterFullText ;
      AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV12TFAlbRecCod ;
      AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV13TFAlbRecCod_To ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV74TFAlbRReo_Sels ;
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV10TFAlbRFen ;
      AV99Wcconsultaalmacentejidoencrudods_6_tfclicod = AV14TFCliCod ;
      AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV15TFCliCod_To ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = AV16TFCliNom ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV17TFCliNom_Sel ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = AV18TFAlbRef ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV19TFAlbRef_Sel ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV20TFAlbRefDsc ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV21TFAlbRefDsc_Sel ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV22TFAlbRDisCli ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV23TFAlbRDisCli_Sel ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV24TFAlbRTartD ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV25TFAlbRTartD_Sel ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV26TFAlbRLote ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV27TFAlbRLote_Sel ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV28TFAlbRLoc ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV29TFAlbRLoc_Sel ;
      AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV30TFAlbRPieEnt ;
      AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV31TFAlbRPieEnt_To ;
      AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV32TFAlbRPieUti ;
      AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV33TFAlbRPieUti_To ;
      AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV34TFAlbRPieDis ;
      AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV35TFAlbRPieDis_To ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV37TFAlbRUni_Sels ;
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV38TFAlbRUniEnt ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV39TFAlbRUniEnt_To ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV40TFAlbRUniUti ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV41TFAlbRUniUti_To ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV42TFAlbRUniDis ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV43TFAlbRUniDis_To ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV72TFAlbREst_Sels ;
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV75TFProceNom ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV76TFProceNom_Sel ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV79TFComposicion ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV80TFComposicion_Sel ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV84TFTipEntNom ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV85TFTipEntNom_Sel ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV88TFAlbRDes ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV89TFAlbRDes_Sel ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV68AlbRef ,
                                           AV83albref_to ,
                                           AV64Albrfen ,
                                           AV65Albrfen_to ,
                                           Integer.valueOf(AV66Clicod) ,
                                           Integer.valueOf(AV67Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV77Procecod) ,
                                           Short.valueOf(AV78ProceCod_to) ,
                                           AV69AlbRReo ,
                                           Byte.valueOf(AV70AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV86TipEntCod) ,
                                           A396EmprCod ,
                                           AV63Emprcod ,
                                           AV87AlbRUni } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV101Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV103Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZT12 */
      pr_default.execute(10, new Object[] {AV68AlbRef, AV83albref_to, AV64Albrfen, AV65Albrfen_to, Integer.valueOf(AV66Clicod), Integer.valueOf(AV67Clicod_to), Short.valueOf(AV77Procecod), Short.valueOf(AV78ProceCod_to), Byte.valueOf(AV70AlbREst), Byte.valueOf(AV70AlbREst), Short.valueOf(AV86TipEntCod), Short.valueOf(AV86TipEntCod), AV63Emprcod, AV87AlbRUni, Integer.valueOf(AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV99Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV101Wcconsultaalmacentejidoencrudods_8_tfclinom, AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV103Wcconsultaalmacentejidoencrudods_10_tfalbref, AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(10) != 101) )
      {
         brk8ZT21 = false ;
         A6263AlbRTartC = P08ZT12_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZT12_n6263AlbRTartC[0] ;
         A56AlbRUni = P08ZT12_A56AlbRUni[0] ;
         A1291AlbRDes = P08ZT12_A1291AlbRDes[0] ;
         A1211TipEntCod = P08ZT12_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZT12_n1211TipEntCod[0] ;
         A970ProceCod = P08ZT12_A970ProceCod[0] ;
         n970ProceCod = P08ZT12_n970ProceCod[0] ;
         A1212TipEntNom = P08ZT12_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT12_n1212TipEntNom[0] ;
         A971ProceNom = P08ZT12_A971ProceNom[0] ;
         n971ProceNom = P08ZT12_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZT12_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZT12_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZT12_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZT12_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZT12_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT12_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZT12_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZT12_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZT12_A279CliNom[0] ;
         A49AlbRFen = P08ZT12_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZT12_A44AlbRecCod[0] ;
         A47AlbREst = P08ZT12_A47AlbREst[0] ;
         A55AlbRReo = P08ZT12_A55AlbRReo[0] ;
         A58AlbRUniEnt = P08ZT12_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZT12_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZT12_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZT12_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZT12_A45AlbRef[0] ;
         A252CliCod = P08ZT12_A252CliCod[0] ;
         A396EmprCod = P08ZT12_A396EmprCod[0] ;
         A279CliNom = P08ZT12_A279CliNom[0] ;
         A6264AlbRTartD = P08ZT12_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZT12_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZT12_A971ProceNom[0] ;
         n971ProceNom = P08ZT12_n971ProceNom[0] ;
         A1212TipEntNom = P08ZT12_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZT12_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV69AlbRReo) == 0 ) || ( GXutil.strcmp(AV69AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char6[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char3[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char3) ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A396EmprCod = GXv_char6[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudogetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
                     AV56count = 0 ;
                     while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(P08ZT12_A1291AlbRDes[0], A1291AlbRDes) == 0 ) )
                     {
                        brk8ZT21 = false ;
                        A44AlbRecCod = P08ZT12_A44AlbRecCod[0] ;
                        A396EmprCod = P08ZT12_A396EmprCod[0] ;
                        AV56count = (long)(AV56count+1) ;
                        brk8ZT21 = true ;
                        pr_default.readNext(10);
                     }
                     if ( ! (GXutil.strcmp("", A1291AlbRDes)==0) )
                     {
                        AV48Option = A1291AlbRDes ;
                        AV49Options.add(AV48Option, 0);
                        AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                     }
                     if ( AV49Options.size() == 50 )
                     {
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                  }
               }
            }
         }
         if ( ! brk8ZT21 )
         {
            brk8ZT21 = true ;
            pr_default.readNext(10);
         }
      }
      pr_default.close(10);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcconsultaalmacentejidoencrudogetfilterdata.this.AV50OptionsJson;
      this.aP4[0] = wcconsultaalmacentejidoencrudogetfilterdata.this.AV53OptionsDescJson;
      this.aP5[0] = wcconsultaalmacentejidoencrudogetfilterdata.this.AV55OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV50OptionsJson = "" ;
      AV53OptionsDescJson = "" ;
      AV55OptionIndexesJson = "" ;
      AV49Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV57Session = httpContext.getWebSession();
      AV59GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV60GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV62FilterFullText = "" ;
      AV73TFAlbRReo_SelsJson = "" ;
      AV74TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV10TFAlbRFen = GXutil.nullDate() ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV18TFAlbRef = "" ;
      AV19TFAlbRef_Sel = "" ;
      AV20TFAlbRefDsc = "" ;
      AV21TFAlbRefDsc_Sel = "" ;
      AV22TFAlbRDisCli = "" ;
      AV23TFAlbRDisCli_Sel = "" ;
      AV24TFAlbRTartD = "" ;
      AV25TFAlbRTartD_Sel = "" ;
      AV26TFAlbRLote = "" ;
      AV27TFAlbRLote_Sel = "" ;
      AV28TFAlbRLoc = "" ;
      AV29TFAlbRLoc_Sel = "" ;
      AV36TFAlbRUni_SelsJson = "" ;
      AV37TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV39TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV40TFAlbRUniUti = DecimalUtil.ZERO ;
      AV41TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV42TFAlbRUniDis = DecimalUtil.ZERO ;
      AV43TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV71TFAlbREst_SelsJson = "" ;
      AV72TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV75TFProceNom = "" ;
      AV76TFProceNom_Sel = "" ;
      AV79TFComposicion = "" ;
      AV80TFComposicion_Sel = "" ;
      AV84TFTipEntNom = "" ;
      AV85TFTipEntNom_Sel = "" ;
      AV88TFAlbRDes = "" ;
      AV89TFAlbRDes_Sel = "" ;
      AV63Emprcod = "" ;
      AV64Albrfen = GXutil.nullDate() ;
      AV65Albrfen_to = GXutil.nullDate() ;
      AV68AlbRef = "" ;
      AV83albref_to = "" ;
      AV69AlbRReo = "" ;
      AV87AlbRUni = "" ;
      A279CliNom = "" ;
      AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = "" ;
      AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen = GXutil.nullDate() ;
      AV101Wcconsultaalmacentejidoencrudods_8_tfclinom = "" ;
      AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = "" ;
      AV103Wcconsultaalmacentejidoencrudods_10_tfalbref = "" ;
      AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = "" ;
      AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = "" ;
      AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = "" ;
      AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = "" ;
      AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = "" ;
      AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = "" ;
      AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = "" ;
      AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = "" ;
      AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = "" ;
      AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = "" ;
      AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = "" ;
      AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient = DecimalUtil.ZERO ;
      AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = DecimalUtil.ZERO ;
      AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = DecimalUtil.ZERO ;
      AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = DecimalUtil.ZERO ;
      AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = "" ;
      AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = "" ;
      AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion = "" ;
      AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = "" ;
      AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = "" ;
      AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = "" ;
      AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = "" ;
      AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = "" ;
      lV94Wcconsultaalmacentejidoencrudods_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV101Wcconsultaalmacentejidoencrudods_8_tfclinom = "" ;
      lV103Wcconsultaalmacentejidoencrudods_10_tfalbref = "" ;
      lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = "" ;
      lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = "" ;
      lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = "" ;
      lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote = "" ;
      lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc = "" ;
      lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom = "" ;
      lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom = "" ;
      lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes = "" ;
      A55AlbRReo = "" ;
      A56AlbRUni = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A3359AlbRDisCli = "" ;
      A6264AlbRTartD = "" ;
      A6463AlbRLote = "" ;
      A50AlbRLoc = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A971ProceNom = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A13981Composicio = "" ;
      A396EmprCod = "" ;
      P08ZT2_A6263AlbRTartC = new short[1] ;
      P08ZT2_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT2_A56AlbRUni = new String[] {""} ;
      P08ZT2_A279CliNom = new String[] {""} ;
      P08ZT2_A1211TipEntCod = new short[1] ;
      P08ZT2_n1211TipEntCod = new boolean[] {false} ;
      P08ZT2_A970ProceCod = new short[1] ;
      P08ZT2_n970ProceCod = new boolean[] {false} ;
      P08ZT2_A1291AlbRDes = new String[] {""} ;
      P08ZT2_A1212TipEntNom = new String[] {""} ;
      P08ZT2_n1212TipEntNom = new boolean[] {false} ;
      P08ZT2_A971ProceNom = new String[] {""} ;
      P08ZT2_n971ProceNom = new boolean[] {false} ;
      P08ZT2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT2_A51AlbRPieDis = new int[1] ;
      P08ZT2_A50AlbRLoc = new String[] {""} ;
      P08ZT2_A6463AlbRLote = new String[] {""} ;
      P08ZT2_A6264AlbRTartD = new String[] {""} ;
      P08ZT2_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT2_A3359AlbRDisCli = new String[] {""} ;
      P08ZT2_A3613AlbRefDsc = new String[] {""} ;
      P08ZT2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT2_A44AlbRecCod = new int[1] ;
      P08ZT2_A47AlbREst = new byte[1] ;
      P08ZT2_A55AlbRReo = new String[] {""} ;
      P08ZT2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT2_A52AlbRPieEnt = new int[1] ;
      P08ZT2_A54AlbRPieUti = new int[1] ;
      P08ZT2_A45AlbRef = new String[] {""} ;
      P08ZT2_A252CliCod = new int[1] ;
      P08ZT2_A396EmprCod = new String[] {""} ;
      AV48Option = "" ;
      P08ZT3_A6263AlbRTartC = new short[1] ;
      P08ZT3_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT3_A56AlbRUni = new String[] {""} ;
      P08ZT3_A1211TipEntCod = new short[1] ;
      P08ZT3_n1211TipEntCod = new boolean[] {false} ;
      P08ZT3_A970ProceCod = new short[1] ;
      P08ZT3_n970ProceCod = new boolean[] {false} ;
      P08ZT3_A1291AlbRDes = new String[] {""} ;
      P08ZT3_A1212TipEntNom = new String[] {""} ;
      P08ZT3_n1212TipEntNom = new boolean[] {false} ;
      P08ZT3_A971ProceNom = new String[] {""} ;
      P08ZT3_n971ProceNom = new boolean[] {false} ;
      P08ZT3_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT3_A51AlbRPieDis = new int[1] ;
      P08ZT3_A50AlbRLoc = new String[] {""} ;
      P08ZT3_A6463AlbRLote = new String[] {""} ;
      P08ZT3_A6264AlbRTartD = new String[] {""} ;
      P08ZT3_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT3_A3359AlbRDisCli = new String[] {""} ;
      P08ZT3_A3613AlbRefDsc = new String[] {""} ;
      P08ZT3_A279CliNom = new String[] {""} ;
      P08ZT3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT3_A44AlbRecCod = new int[1] ;
      P08ZT3_A47AlbREst = new byte[1] ;
      P08ZT3_A55AlbRReo = new String[] {""} ;
      P08ZT3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT3_A52AlbRPieEnt = new int[1] ;
      P08ZT3_A54AlbRPieUti = new int[1] ;
      P08ZT3_A45AlbRef = new String[] {""} ;
      P08ZT3_A252CliCod = new int[1] ;
      P08ZT3_A396EmprCod = new String[] {""} ;
      P08ZT4_A6263AlbRTartC = new short[1] ;
      P08ZT4_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT4_A56AlbRUni = new String[] {""} ;
      P08ZT4_A3613AlbRefDsc = new String[] {""} ;
      P08ZT4_A1211TipEntCod = new short[1] ;
      P08ZT4_n1211TipEntCod = new boolean[] {false} ;
      P08ZT4_A970ProceCod = new short[1] ;
      P08ZT4_n970ProceCod = new boolean[] {false} ;
      P08ZT4_A1291AlbRDes = new String[] {""} ;
      P08ZT4_A1212TipEntNom = new String[] {""} ;
      P08ZT4_n1212TipEntNom = new boolean[] {false} ;
      P08ZT4_A971ProceNom = new String[] {""} ;
      P08ZT4_n971ProceNom = new boolean[] {false} ;
      P08ZT4_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT4_A51AlbRPieDis = new int[1] ;
      P08ZT4_A50AlbRLoc = new String[] {""} ;
      P08ZT4_A6463AlbRLote = new String[] {""} ;
      P08ZT4_A6264AlbRTartD = new String[] {""} ;
      P08ZT4_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT4_A3359AlbRDisCli = new String[] {""} ;
      P08ZT4_A279CliNom = new String[] {""} ;
      P08ZT4_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT4_A44AlbRecCod = new int[1] ;
      P08ZT4_A47AlbREst = new byte[1] ;
      P08ZT4_A55AlbRReo = new String[] {""} ;
      P08ZT4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT4_A52AlbRPieEnt = new int[1] ;
      P08ZT4_A54AlbRPieUti = new int[1] ;
      P08ZT4_A45AlbRef = new String[] {""} ;
      P08ZT4_A252CliCod = new int[1] ;
      P08ZT4_A396EmprCod = new String[] {""} ;
      P08ZT5_A6263AlbRTartC = new short[1] ;
      P08ZT5_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT5_A56AlbRUni = new String[] {""} ;
      P08ZT5_A3359AlbRDisCli = new String[] {""} ;
      P08ZT5_A1211TipEntCod = new short[1] ;
      P08ZT5_n1211TipEntCod = new boolean[] {false} ;
      P08ZT5_A970ProceCod = new short[1] ;
      P08ZT5_n970ProceCod = new boolean[] {false} ;
      P08ZT5_A1291AlbRDes = new String[] {""} ;
      P08ZT5_A1212TipEntNom = new String[] {""} ;
      P08ZT5_n1212TipEntNom = new boolean[] {false} ;
      P08ZT5_A971ProceNom = new String[] {""} ;
      P08ZT5_n971ProceNom = new boolean[] {false} ;
      P08ZT5_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT5_A51AlbRPieDis = new int[1] ;
      P08ZT5_A50AlbRLoc = new String[] {""} ;
      P08ZT5_A6463AlbRLote = new String[] {""} ;
      P08ZT5_A6264AlbRTartD = new String[] {""} ;
      P08ZT5_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT5_A3613AlbRefDsc = new String[] {""} ;
      P08ZT5_A279CliNom = new String[] {""} ;
      P08ZT5_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT5_A44AlbRecCod = new int[1] ;
      P08ZT5_A47AlbREst = new byte[1] ;
      P08ZT5_A55AlbRReo = new String[] {""} ;
      P08ZT5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT5_A52AlbRPieEnt = new int[1] ;
      P08ZT5_A54AlbRPieUti = new int[1] ;
      P08ZT5_A45AlbRef = new String[] {""} ;
      P08ZT5_A252CliCod = new int[1] ;
      P08ZT5_A396EmprCod = new String[] {""} ;
      P08ZT6_A6263AlbRTartC = new short[1] ;
      P08ZT6_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT6_A1211TipEntCod = new short[1] ;
      P08ZT6_n1211TipEntCod = new boolean[] {false} ;
      P08ZT6_A970ProceCod = new short[1] ;
      P08ZT6_n970ProceCod = new boolean[] {false} ;
      P08ZT6_A1291AlbRDes = new String[] {""} ;
      P08ZT6_A1212TipEntNom = new String[] {""} ;
      P08ZT6_n1212TipEntNom = new boolean[] {false} ;
      P08ZT6_A971ProceNom = new String[] {""} ;
      P08ZT6_n971ProceNom = new boolean[] {false} ;
      P08ZT6_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT6_A51AlbRPieDis = new int[1] ;
      P08ZT6_A50AlbRLoc = new String[] {""} ;
      P08ZT6_A6463AlbRLote = new String[] {""} ;
      P08ZT6_A6264AlbRTartD = new String[] {""} ;
      P08ZT6_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT6_A3359AlbRDisCli = new String[] {""} ;
      P08ZT6_A3613AlbRefDsc = new String[] {""} ;
      P08ZT6_A279CliNom = new String[] {""} ;
      P08ZT6_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT6_A44AlbRecCod = new int[1] ;
      P08ZT6_A47AlbREst = new byte[1] ;
      P08ZT6_A56AlbRUni = new String[] {""} ;
      P08ZT6_A55AlbRReo = new String[] {""} ;
      P08ZT6_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT6_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT6_A52AlbRPieEnt = new int[1] ;
      P08ZT6_A54AlbRPieUti = new int[1] ;
      P08ZT6_A45AlbRef = new String[] {""} ;
      P08ZT6_A252CliCod = new int[1] ;
      P08ZT6_A396EmprCod = new String[] {""} ;
      P08ZT7_A6263AlbRTartC = new short[1] ;
      P08ZT7_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT7_A56AlbRUni = new String[] {""} ;
      P08ZT7_A6463AlbRLote = new String[] {""} ;
      P08ZT7_A1211TipEntCod = new short[1] ;
      P08ZT7_n1211TipEntCod = new boolean[] {false} ;
      P08ZT7_A970ProceCod = new short[1] ;
      P08ZT7_n970ProceCod = new boolean[] {false} ;
      P08ZT7_A1291AlbRDes = new String[] {""} ;
      P08ZT7_A1212TipEntNom = new String[] {""} ;
      P08ZT7_n1212TipEntNom = new boolean[] {false} ;
      P08ZT7_A971ProceNom = new String[] {""} ;
      P08ZT7_n971ProceNom = new boolean[] {false} ;
      P08ZT7_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT7_A51AlbRPieDis = new int[1] ;
      P08ZT7_A50AlbRLoc = new String[] {""} ;
      P08ZT7_A6264AlbRTartD = new String[] {""} ;
      P08ZT7_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT7_A3359AlbRDisCli = new String[] {""} ;
      P08ZT7_A3613AlbRefDsc = new String[] {""} ;
      P08ZT7_A279CliNom = new String[] {""} ;
      P08ZT7_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT7_A44AlbRecCod = new int[1] ;
      P08ZT7_A47AlbREst = new byte[1] ;
      P08ZT7_A55AlbRReo = new String[] {""} ;
      P08ZT7_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT7_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT7_A52AlbRPieEnt = new int[1] ;
      P08ZT7_A54AlbRPieUti = new int[1] ;
      P08ZT7_A45AlbRef = new String[] {""} ;
      P08ZT7_A252CliCod = new int[1] ;
      P08ZT7_A396EmprCod = new String[] {""} ;
      P08ZT8_A6263AlbRTartC = new short[1] ;
      P08ZT8_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT8_A56AlbRUni = new String[] {""} ;
      P08ZT8_A50AlbRLoc = new String[] {""} ;
      P08ZT8_A1211TipEntCod = new short[1] ;
      P08ZT8_n1211TipEntCod = new boolean[] {false} ;
      P08ZT8_A970ProceCod = new short[1] ;
      P08ZT8_n970ProceCod = new boolean[] {false} ;
      P08ZT8_A1291AlbRDes = new String[] {""} ;
      P08ZT8_A1212TipEntNom = new String[] {""} ;
      P08ZT8_n1212TipEntNom = new boolean[] {false} ;
      P08ZT8_A971ProceNom = new String[] {""} ;
      P08ZT8_n971ProceNom = new boolean[] {false} ;
      P08ZT8_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT8_A51AlbRPieDis = new int[1] ;
      P08ZT8_A6463AlbRLote = new String[] {""} ;
      P08ZT8_A6264AlbRTartD = new String[] {""} ;
      P08ZT8_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT8_A3359AlbRDisCli = new String[] {""} ;
      P08ZT8_A3613AlbRefDsc = new String[] {""} ;
      P08ZT8_A279CliNom = new String[] {""} ;
      P08ZT8_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT8_A44AlbRecCod = new int[1] ;
      P08ZT8_A47AlbREst = new byte[1] ;
      P08ZT8_A55AlbRReo = new String[] {""} ;
      P08ZT8_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT8_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT8_A52AlbRPieEnt = new int[1] ;
      P08ZT8_A54AlbRPieUti = new int[1] ;
      P08ZT8_A45AlbRef = new String[] {""} ;
      P08ZT8_A252CliCod = new int[1] ;
      P08ZT8_A396EmprCod = new String[] {""} ;
      P08ZT9_A6263AlbRTartC = new short[1] ;
      P08ZT9_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT9_A970ProceCod = new short[1] ;
      P08ZT9_n970ProceCod = new boolean[] {false} ;
      P08ZT9_A1211TipEntCod = new short[1] ;
      P08ZT9_n1211TipEntCod = new boolean[] {false} ;
      P08ZT9_A1291AlbRDes = new String[] {""} ;
      P08ZT9_A1212TipEntNom = new String[] {""} ;
      P08ZT9_n1212TipEntNom = new boolean[] {false} ;
      P08ZT9_A971ProceNom = new String[] {""} ;
      P08ZT9_n971ProceNom = new boolean[] {false} ;
      P08ZT9_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT9_A51AlbRPieDis = new int[1] ;
      P08ZT9_A50AlbRLoc = new String[] {""} ;
      P08ZT9_A6463AlbRLote = new String[] {""} ;
      P08ZT9_A6264AlbRTartD = new String[] {""} ;
      P08ZT9_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT9_A3359AlbRDisCli = new String[] {""} ;
      P08ZT9_A3613AlbRefDsc = new String[] {""} ;
      P08ZT9_A279CliNom = new String[] {""} ;
      P08ZT9_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT9_A44AlbRecCod = new int[1] ;
      P08ZT9_A47AlbREst = new byte[1] ;
      P08ZT9_A56AlbRUni = new String[] {""} ;
      P08ZT9_A55AlbRReo = new String[] {""} ;
      P08ZT9_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT9_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT9_A52AlbRPieEnt = new int[1] ;
      P08ZT9_A54AlbRPieUti = new int[1] ;
      P08ZT9_A45AlbRef = new String[] {""} ;
      P08ZT9_A252CliCod = new int[1] ;
      P08ZT9_A396EmprCod = new String[] {""} ;
      P08ZT10_A6263AlbRTartC = new short[1] ;
      P08ZT10_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT10_A1211TipEntCod = new short[1] ;
      P08ZT10_n1211TipEntCod = new boolean[] {false} ;
      P08ZT10_A970ProceCod = new short[1] ;
      P08ZT10_n970ProceCod = new boolean[] {false} ;
      P08ZT10_A1291AlbRDes = new String[] {""} ;
      P08ZT10_A1212TipEntNom = new String[] {""} ;
      P08ZT10_n1212TipEntNom = new boolean[] {false} ;
      P08ZT10_A971ProceNom = new String[] {""} ;
      P08ZT10_n971ProceNom = new boolean[] {false} ;
      P08ZT10_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT10_A51AlbRPieDis = new int[1] ;
      P08ZT10_A50AlbRLoc = new String[] {""} ;
      P08ZT10_A6463AlbRLote = new String[] {""} ;
      P08ZT10_A6264AlbRTartD = new String[] {""} ;
      P08ZT10_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT10_A3359AlbRDisCli = new String[] {""} ;
      P08ZT10_A3613AlbRefDsc = new String[] {""} ;
      P08ZT10_A279CliNom = new String[] {""} ;
      P08ZT10_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT10_A44AlbRecCod = new int[1] ;
      P08ZT10_A47AlbREst = new byte[1] ;
      P08ZT10_A56AlbRUni = new String[] {""} ;
      P08ZT10_A55AlbRReo = new String[] {""} ;
      P08ZT10_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT10_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT10_A52AlbRPieEnt = new int[1] ;
      P08ZT10_A54AlbRPieUti = new int[1] ;
      P08ZT10_A45AlbRef = new String[] {""} ;
      P08ZT10_A252CliCod = new int[1] ;
      P08ZT10_A396EmprCod = new String[] {""} ;
      P08ZT11_A6263AlbRTartC = new short[1] ;
      P08ZT11_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT11_A1211TipEntCod = new short[1] ;
      P08ZT11_n1211TipEntCod = new boolean[] {false} ;
      P08ZT11_A970ProceCod = new short[1] ;
      P08ZT11_n970ProceCod = new boolean[] {false} ;
      P08ZT11_A1291AlbRDes = new String[] {""} ;
      P08ZT11_A1212TipEntNom = new String[] {""} ;
      P08ZT11_n1212TipEntNom = new boolean[] {false} ;
      P08ZT11_A971ProceNom = new String[] {""} ;
      P08ZT11_n971ProceNom = new boolean[] {false} ;
      P08ZT11_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT11_A51AlbRPieDis = new int[1] ;
      P08ZT11_A50AlbRLoc = new String[] {""} ;
      P08ZT11_A6463AlbRLote = new String[] {""} ;
      P08ZT11_A6264AlbRTartD = new String[] {""} ;
      P08ZT11_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT11_A3359AlbRDisCli = new String[] {""} ;
      P08ZT11_A3613AlbRefDsc = new String[] {""} ;
      P08ZT11_A279CliNom = new String[] {""} ;
      P08ZT11_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT11_A44AlbRecCod = new int[1] ;
      P08ZT11_A47AlbREst = new byte[1] ;
      P08ZT11_A56AlbRUni = new String[] {""} ;
      P08ZT11_A55AlbRReo = new String[] {""} ;
      P08ZT11_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT11_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT11_A52AlbRPieEnt = new int[1] ;
      P08ZT11_A54AlbRPieUti = new int[1] ;
      P08ZT11_A45AlbRef = new String[] {""} ;
      P08ZT11_A252CliCod = new int[1] ;
      P08ZT11_A396EmprCod = new String[] {""} ;
      P08ZT12_A6263AlbRTartC = new short[1] ;
      P08ZT12_n6263AlbRTartC = new boolean[] {false} ;
      P08ZT12_A56AlbRUni = new String[] {""} ;
      P08ZT12_A1291AlbRDes = new String[] {""} ;
      P08ZT12_A1211TipEntCod = new short[1] ;
      P08ZT12_n1211TipEntCod = new boolean[] {false} ;
      P08ZT12_A970ProceCod = new short[1] ;
      P08ZT12_n970ProceCod = new boolean[] {false} ;
      P08ZT12_A1212TipEntNom = new String[] {""} ;
      P08ZT12_n1212TipEntNom = new boolean[] {false} ;
      P08ZT12_A971ProceNom = new String[] {""} ;
      P08ZT12_n971ProceNom = new boolean[] {false} ;
      P08ZT12_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT12_A51AlbRPieDis = new int[1] ;
      P08ZT12_A50AlbRLoc = new String[] {""} ;
      P08ZT12_A6463AlbRLote = new String[] {""} ;
      P08ZT12_A6264AlbRTartD = new String[] {""} ;
      P08ZT12_n6264AlbRTartD = new boolean[] {false} ;
      P08ZT12_A3359AlbRDisCli = new String[] {""} ;
      P08ZT12_A3613AlbRefDsc = new String[] {""} ;
      P08ZT12_A279CliNom = new String[] {""} ;
      P08ZT12_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZT12_A44AlbRecCod = new int[1] ;
      P08ZT12_A47AlbREst = new byte[1] ;
      P08ZT12_A55AlbRReo = new String[] {""} ;
      P08ZT12_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT12_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZT12_A52AlbRPieEnt = new int[1] ;
      P08ZT12_A54AlbRPieUti = new int[1] ;
      P08ZT12_A45AlbRef = new String[] {""} ;
      P08ZT12_A252CliCod = new int[1] ;
      P08ZT12_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultaalmacentejidoencrudogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08ZT2_A6263AlbRTartC, P08ZT2_n6263AlbRTartC, P08ZT2_A56AlbRUni, P08ZT2_A279CliNom, P08ZT2_A1211TipEntCod, P08ZT2_n1211TipEntCod, P08ZT2_A970ProceCod, P08ZT2_n970ProceCod, P08ZT2_A1291AlbRDes, P08ZT2_A1212TipEntNom,
            P08ZT2_n1212TipEntNom, P08ZT2_A971ProceNom, P08ZT2_n971ProceNom, P08ZT2_A57AlbRUniDis, P08ZT2_A51AlbRPieDis, P08ZT2_A50AlbRLoc, P08ZT2_A6463AlbRLote, P08ZT2_A6264AlbRTartD, P08ZT2_n6264AlbRTartD, P08ZT2_A3359AlbRDisCli,
            P08ZT2_A3613AlbRefDsc, P08ZT2_A49AlbRFen, P08ZT2_A44AlbRecCod, P08ZT2_A47AlbREst, P08ZT2_A55AlbRReo, P08ZT2_A58AlbRUniEnt, P08ZT2_A60AlbRUniUti, P08ZT2_A52AlbRPieEnt, P08ZT2_A54AlbRPieUti, P08ZT2_A45AlbRef,
            P08ZT2_A252CliCod, P08ZT2_A396EmprCod
            }
            , new Object[] {
            P08ZT3_A6263AlbRTartC, P08ZT3_n6263AlbRTartC, P08ZT3_A56AlbRUni, P08ZT3_A1211TipEntCod, P08ZT3_n1211TipEntCod, P08ZT3_A970ProceCod, P08ZT3_n970ProceCod, P08ZT3_A1291AlbRDes, P08ZT3_A1212TipEntNom, P08ZT3_n1212TipEntNom,
            P08ZT3_A971ProceNom, P08ZT3_n971ProceNom, P08ZT3_A57AlbRUniDis, P08ZT3_A51AlbRPieDis, P08ZT3_A50AlbRLoc, P08ZT3_A6463AlbRLote, P08ZT3_A6264AlbRTartD, P08ZT3_n6264AlbRTartD, P08ZT3_A3359AlbRDisCli, P08ZT3_A3613AlbRefDsc,
            P08ZT3_A279CliNom, P08ZT3_A49AlbRFen, P08ZT3_A44AlbRecCod, P08ZT3_A47AlbREst, P08ZT3_A55AlbRReo, P08ZT3_A58AlbRUniEnt, P08ZT3_A60AlbRUniUti, P08ZT3_A52AlbRPieEnt, P08ZT3_A54AlbRPieUti, P08ZT3_A45AlbRef,
            P08ZT3_A252CliCod, P08ZT3_A396EmprCod
            }
            , new Object[] {
            P08ZT4_A6263AlbRTartC, P08ZT4_n6263AlbRTartC, P08ZT4_A56AlbRUni, P08ZT4_A3613AlbRefDsc, P08ZT4_A1211TipEntCod, P08ZT4_n1211TipEntCod, P08ZT4_A970ProceCod, P08ZT4_n970ProceCod, P08ZT4_A1291AlbRDes, P08ZT4_A1212TipEntNom,
            P08ZT4_n1212TipEntNom, P08ZT4_A971ProceNom, P08ZT4_n971ProceNom, P08ZT4_A57AlbRUniDis, P08ZT4_A51AlbRPieDis, P08ZT4_A50AlbRLoc, P08ZT4_A6463AlbRLote, P08ZT4_A6264AlbRTartD, P08ZT4_n6264AlbRTartD, P08ZT4_A3359AlbRDisCli,
            P08ZT4_A279CliNom, P08ZT4_A49AlbRFen, P08ZT4_A44AlbRecCod, P08ZT4_A47AlbREst, P08ZT4_A55AlbRReo, P08ZT4_A58AlbRUniEnt, P08ZT4_A60AlbRUniUti, P08ZT4_A52AlbRPieEnt, P08ZT4_A54AlbRPieUti, P08ZT4_A45AlbRef,
            P08ZT4_A252CliCod, P08ZT4_A396EmprCod
            }
            , new Object[] {
            P08ZT5_A6263AlbRTartC, P08ZT5_n6263AlbRTartC, P08ZT5_A56AlbRUni, P08ZT5_A3359AlbRDisCli, P08ZT5_A1211TipEntCod, P08ZT5_n1211TipEntCod, P08ZT5_A970ProceCod, P08ZT5_n970ProceCod, P08ZT5_A1291AlbRDes, P08ZT5_A1212TipEntNom,
            P08ZT5_n1212TipEntNom, P08ZT5_A971ProceNom, P08ZT5_n971ProceNom, P08ZT5_A57AlbRUniDis, P08ZT5_A51AlbRPieDis, P08ZT5_A50AlbRLoc, P08ZT5_A6463AlbRLote, P08ZT5_A6264AlbRTartD, P08ZT5_n6264AlbRTartD, P08ZT5_A3613AlbRefDsc,
            P08ZT5_A279CliNom, P08ZT5_A49AlbRFen, P08ZT5_A44AlbRecCod, P08ZT5_A47AlbREst, P08ZT5_A55AlbRReo, P08ZT5_A58AlbRUniEnt, P08ZT5_A60AlbRUniUti, P08ZT5_A52AlbRPieEnt, P08ZT5_A54AlbRPieUti, P08ZT5_A45AlbRef,
            P08ZT5_A252CliCod, P08ZT5_A396EmprCod
            }
            , new Object[] {
            P08ZT6_A6263AlbRTartC, P08ZT6_n6263AlbRTartC, P08ZT6_A1211TipEntCod, P08ZT6_n1211TipEntCod, P08ZT6_A970ProceCod, P08ZT6_n970ProceCod, P08ZT6_A1291AlbRDes, P08ZT6_A1212TipEntNom, P08ZT6_n1212TipEntNom, P08ZT6_A971ProceNom,
            P08ZT6_n971ProceNom, P08ZT6_A57AlbRUniDis, P08ZT6_A51AlbRPieDis, P08ZT6_A50AlbRLoc, P08ZT6_A6463AlbRLote, P08ZT6_A6264AlbRTartD, P08ZT6_n6264AlbRTartD, P08ZT6_A3359AlbRDisCli, P08ZT6_A3613AlbRefDsc, P08ZT6_A279CliNom,
            P08ZT6_A49AlbRFen, P08ZT6_A44AlbRecCod, P08ZT6_A47AlbREst, P08ZT6_A56AlbRUni, P08ZT6_A55AlbRReo, P08ZT6_A58AlbRUniEnt, P08ZT6_A60AlbRUniUti, P08ZT6_A52AlbRPieEnt, P08ZT6_A54AlbRPieUti, P08ZT6_A45AlbRef,
            P08ZT6_A252CliCod, P08ZT6_A396EmprCod
            }
            , new Object[] {
            P08ZT7_A6263AlbRTartC, P08ZT7_n6263AlbRTartC, P08ZT7_A56AlbRUni, P08ZT7_A6463AlbRLote, P08ZT7_A1211TipEntCod, P08ZT7_n1211TipEntCod, P08ZT7_A970ProceCod, P08ZT7_n970ProceCod, P08ZT7_A1291AlbRDes, P08ZT7_A1212TipEntNom,
            P08ZT7_n1212TipEntNom, P08ZT7_A971ProceNom, P08ZT7_n971ProceNom, P08ZT7_A57AlbRUniDis, P08ZT7_A51AlbRPieDis, P08ZT7_A50AlbRLoc, P08ZT7_A6264AlbRTartD, P08ZT7_n6264AlbRTartD, P08ZT7_A3359AlbRDisCli, P08ZT7_A3613AlbRefDsc,
            P08ZT7_A279CliNom, P08ZT7_A49AlbRFen, P08ZT7_A44AlbRecCod, P08ZT7_A47AlbREst, P08ZT7_A55AlbRReo, P08ZT7_A58AlbRUniEnt, P08ZT7_A60AlbRUniUti, P08ZT7_A52AlbRPieEnt, P08ZT7_A54AlbRPieUti, P08ZT7_A45AlbRef,
            P08ZT7_A252CliCod, P08ZT7_A396EmprCod
            }
            , new Object[] {
            P08ZT8_A6263AlbRTartC, P08ZT8_n6263AlbRTartC, P08ZT8_A56AlbRUni, P08ZT8_A50AlbRLoc, P08ZT8_A1211TipEntCod, P08ZT8_n1211TipEntCod, P08ZT8_A970ProceCod, P08ZT8_n970ProceCod, P08ZT8_A1291AlbRDes, P08ZT8_A1212TipEntNom,
            P08ZT8_n1212TipEntNom, P08ZT8_A971ProceNom, P08ZT8_n971ProceNom, P08ZT8_A57AlbRUniDis, P08ZT8_A51AlbRPieDis, P08ZT8_A6463AlbRLote, P08ZT8_A6264AlbRTartD, P08ZT8_n6264AlbRTartD, P08ZT8_A3359AlbRDisCli, P08ZT8_A3613AlbRefDsc,
            P08ZT8_A279CliNom, P08ZT8_A49AlbRFen, P08ZT8_A44AlbRecCod, P08ZT8_A47AlbREst, P08ZT8_A55AlbRReo, P08ZT8_A58AlbRUniEnt, P08ZT8_A60AlbRUniUti, P08ZT8_A52AlbRPieEnt, P08ZT8_A54AlbRPieUti, P08ZT8_A45AlbRef,
            P08ZT8_A252CliCod, P08ZT8_A396EmprCod
            }
            , new Object[] {
            P08ZT9_A6263AlbRTartC, P08ZT9_n6263AlbRTartC, P08ZT9_A970ProceCod, P08ZT9_n970ProceCod, P08ZT9_A1211TipEntCod, P08ZT9_n1211TipEntCod, P08ZT9_A1291AlbRDes, P08ZT9_A1212TipEntNom, P08ZT9_n1212TipEntNom, P08ZT9_A971ProceNom,
            P08ZT9_n971ProceNom, P08ZT9_A57AlbRUniDis, P08ZT9_A51AlbRPieDis, P08ZT9_A50AlbRLoc, P08ZT9_A6463AlbRLote, P08ZT9_A6264AlbRTartD, P08ZT9_n6264AlbRTartD, P08ZT9_A3359AlbRDisCli, P08ZT9_A3613AlbRefDsc, P08ZT9_A279CliNom,
            P08ZT9_A49AlbRFen, P08ZT9_A44AlbRecCod, P08ZT9_A47AlbREst, P08ZT9_A56AlbRUni, P08ZT9_A55AlbRReo, P08ZT9_A58AlbRUniEnt, P08ZT9_A60AlbRUniUti, P08ZT9_A52AlbRPieEnt, P08ZT9_A54AlbRPieUti, P08ZT9_A45AlbRef,
            P08ZT9_A252CliCod, P08ZT9_A396EmprCod
            }
            , new Object[] {
            P08ZT10_A6263AlbRTartC, P08ZT10_n6263AlbRTartC, P08ZT10_A1211TipEntCod, P08ZT10_n1211TipEntCod, P08ZT10_A970ProceCod, P08ZT10_n970ProceCod, P08ZT10_A1291AlbRDes, P08ZT10_A1212TipEntNom, P08ZT10_n1212TipEntNom, P08ZT10_A971ProceNom,
            P08ZT10_n971ProceNom, P08ZT10_A57AlbRUniDis, P08ZT10_A51AlbRPieDis, P08ZT10_A50AlbRLoc, P08ZT10_A6463AlbRLote, P08ZT10_A6264AlbRTartD, P08ZT10_n6264AlbRTartD, P08ZT10_A3359AlbRDisCli, P08ZT10_A3613AlbRefDsc, P08ZT10_A279CliNom,
            P08ZT10_A49AlbRFen, P08ZT10_A44AlbRecCod, P08ZT10_A47AlbREst, P08ZT10_A56AlbRUni, P08ZT10_A55AlbRReo, P08ZT10_A58AlbRUniEnt, P08ZT10_A60AlbRUniUti, P08ZT10_A52AlbRPieEnt, P08ZT10_A54AlbRPieUti, P08ZT10_A45AlbRef,
            P08ZT10_A252CliCod, P08ZT10_A396EmprCod
            }
            , new Object[] {
            P08ZT11_A6263AlbRTartC, P08ZT11_n6263AlbRTartC, P08ZT11_A1211TipEntCod, P08ZT11_n1211TipEntCod, P08ZT11_A970ProceCod, P08ZT11_n970ProceCod, P08ZT11_A1291AlbRDes, P08ZT11_A1212TipEntNom, P08ZT11_n1212TipEntNom, P08ZT11_A971ProceNom,
            P08ZT11_n971ProceNom, P08ZT11_A57AlbRUniDis, P08ZT11_A51AlbRPieDis, P08ZT11_A50AlbRLoc, P08ZT11_A6463AlbRLote, P08ZT11_A6264AlbRTartD, P08ZT11_n6264AlbRTartD, P08ZT11_A3359AlbRDisCli, P08ZT11_A3613AlbRefDsc, P08ZT11_A279CliNom,
            P08ZT11_A49AlbRFen, P08ZT11_A44AlbRecCod, P08ZT11_A47AlbREst, P08ZT11_A56AlbRUni, P08ZT11_A55AlbRReo, P08ZT11_A58AlbRUniEnt, P08ZT11_A60AlbRUniUti, P08ZT11_A52AlbRPieEnt, P08ZT11_A54AlbRPieUti, P08ZT11_A45AlbRef,
            P08ZT11_A252CliCod, P08ZT11_A396EmprCod
            }
            , new Object[] {
            P08ZT12_A6263AlbRTartC, P08ZT12_n6263AlbRTartC, P08ZT12_A56AlbRUni, P08ZT12_A1291AlbRDes, P08ZT12_A1211TipEntCod, P08ZT12_n1211TipEntCod, P08ZT12_A970ProceCod, P08ZT12_n970ProceCod, P08ZT12_A1212TipEntNom, P08ZT12_n1212TipEntNom,
            P08ZT12_A971ProceNom, P08ZT12_n971ProceNom, P08ZT12_A57AlbRUniDis, P08ZT12_A51AlbRPieDis, P08ZT12_A50AlbRLoc, P08ZT12_A6463AlbRLote, P08ZT12_A6264AlbRTartD, P08ZT12_n6264AlbRTartD, P08ZT12_A3359AlbRDisCli, P08ZT12_A3613AlbRefDsc,
            P08ZT12_A279CliNom, P08ZT12_A49AlbRFen, P08ZT12_A44AlbRecCod, P08ZT12_A47AlbREst, P08ZT12_A55AlbRReo, P08ZT12_A58AlbRUniEnt, P08ZT12_A60AlbRUniUti, P08ZT12_A52AlbRPieEnt, P08ZT12_A54AlbRPieUti, P08ZT12_A45AlbRef,
            P08ZT12_A252CliCod, P08ZT12_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV70AlbREst ;
   private byte A47AlbREst ;
   private short AV77Procecod ;
   private short AV78ProceCod_to ;
   private short AV86TipEntCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short A6263AlbRTartC ;
   private short Gx_err ;
   private int AV92GXV1 ;
   private int AV12TFAlbRecCod ;
   private int AV13TFAlbRecCod_To ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV30TFAlbRPieEnt ;
   private int AV31TFAlbRPieEnt_To ;
   private int AV32TFAlbRPieUti ;
   private int AV33TFAlbRPieUti_To ;
   private int AV34TFAlbRPieDis ;
   private int AV35TFAlbRPieDis_To ;
   private int AV66Clicod ;
   private int AV67Clicod_to ;
   private int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ;
   private int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ;
   private int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ;
   private int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ;
   private int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ;
   private int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ;
   private int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ;
   private int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ;
   private int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ;
   private int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ;
   private int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ;
   private int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ;
   private int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV47InsertIndex ;
   private int GXv_int4[] ;
   private long AV56count ;
   private java.math.BigDecimal AV38TFAlbRUniEnt ;
   private java.math.BigDecimal AV39TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV40TFAlbRUniUti ;
   private java.math.BigDecimal AV41TFAlbRUniUti_To ;
   private java.math.BigDecimal AV42TFAlbRUniDis ;
   private java.math.BigDecimal AV43TFAlbRUniDis_To ;
   private java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ;
   private java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ;
   private java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ;
   private java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ;
   private java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ;
   private java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV18TFAlbRef ;
   private String AV19TFAlbRef_Sel ;
   private String AV20TFAlbRefDsc ;
   private String AV21TFAlbRefDsc_Sel ;
   private String AV22TFAlbRDisCli ;
   private String AV23TFAlbRDisCli_Sel ;
   private String AV24TFAlbRTartD ;
   private String AV25TFAlbRTartD_Sel ;
   private String AV26TFAlbRLote ;
   private String AV27TFAlbRLote_Sel ;
   private String AV28TFAlbRLoc ;
   private String AV29TFAlbRLoc_Sel ;
   private String AV75TFProceNom ;
   private String AV76TFProceNom_Sel ;
   private String AV79TFComposicion ;
   private String AV80TFComposicion_Sel ;
   private String AV84TFTipEntNom ;
   private String AV85TFTipEntNom_Sel ;
   private String AV88TFAlbRDes ;
   private String AV89TFAlbRDes_Sel ;
   private String AV63Emprcod ;
   private String AV68AlbRef ;
   private String AV83albref_to ;
   private String AV69AlbRReo ;
   private String AV87AlbRUni ;
   private String A279CliNom ;
   private String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ;
   private String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ;
   private String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ;
   private String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ;
   private String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ;
   private String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ;
   private String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ;
   private String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ;
   private String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ;
   private String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ;
   private String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ;
   private String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ;
   private String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ;
   private String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ;
   private String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ;
   private String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ;
   private String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ;
   private String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ;
   private String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ;
   private String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ;
   private String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ;
   private String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ;
   private String scmdbuf ;
   private String lV101Wcconsultaalmacentejidoencrudods_8_tfclinom ;
   private String lV103Wcconsultaalmacentejidoencrudods_10_tfalbref ;
   private String lV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ;
   private String lV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ;
   private String lV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ;
   private String lV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ;
   private String lV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ;
   private String lV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ;
   private String lV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ;
   private String lV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ;
   private String A55AlbRReo ;
   private String A56AlbRUni ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A3359AlbRDisCli ;
   private String A6264AlbRTartD ;
   private String A6463AlbRLote ;
   private String A50AlbRLoc ;
   private String A971ProceNom ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String A13981Composicio ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private java.util.Date AV10TFAlbRFen ;
   private java.util.Date AV64Albrfen ;
   private java.util.Date AV65Albrfen_to ;
   private java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ;
   private java.util.Date A49AlbRFen ;
   private boolean returnInSub ;
   private boolean brk8ZT2 ;
   private boolean n6263AlbRTartC ;
   private boolean n1211TipEntCod ;
   private boolean n970ProceCod ;
   private boolean n1212TipEntNom ;
   private boolean n971ProceNom ;
   private boolean n6264AlbRTartD ;
   private boolean brk8ZT4 ;
   private boolean brk8ZT6 ;
   private boolean brk8ZT8 ;
   private boolean brk8ZT10 ;
   private boolean brk8ZT12 ;
   private boolean brk8ZT14 ;
   private boolean brk8ZT16 ;
   private boolean brk8ZT19 ;
   private boolean brk8ZT21 ;
   private String AV50OptionsJson ;
   private String AV53OptionsDescJson ;
   private String AV55OptionIndexesJson ;
   private String AV73TFAlbRReo_SelsJson ;
   private String AV36TFAlbRUni_SelsJson ;
   private String AV71TFAlbREst_SelsJson ;
   private String AV46DDOName ;
   private String AV44SearchTxt ;
   private String AV45SearchTxtTo ;
   private String AV62FilterFullText ;
   private String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ;
   private String lV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ;
   private String AV48Option ;
   private GXSimpleCollection<Byte> AV72TFAlbREst_Sels ;
   private GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ;
   private com.genexus.webpanels.WebSession AV57Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P08ZT2_A6263AlbRTartC ;
   private boolean[] P08ZT2_n6263AlbRTartC ;
   private String[] P08ZT2_A56AlbRUni ;
   private String[] P08ZT2_A279CliNom ;
   private short[] P08ZT2_A1211TipEntCod ;
   private boolean[] P08ZT2_n1211TipEntCod ;
   private short[] P08ZT2_A970ProceCod ;
   private boolean[] P08ZT2_n970ProceCod ;
   private String[] P08ZT2_A1291AlbRDes ;
   private String[] P08ZT2_A1212TipEntNom ;
   private boolean[] P08ZT2_n1212TipEntNom ;
   private String[] P08ZT2_A971ProceNom ;
   private boolean[] P08ZT2_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT2_A57AlbRUniDis ;
   private int[] P08ZT2_A51AlbRPieDis ;
   private String[] P08ZT2_A50AlbRLoc ;
   private String[] P08ZT2_A6463AlbRLote ;
   private String[] P08ZT2_A6264AlbRTartD ;
   private boolean[] P08ZT2_n6264AlbRTartD ;
   private String[] P08ZT2_A3359AlbRDisCli ;
   private String[] P08ZT2_A3613AlbRefDsc ;
   private java.util.Date[] P08ZT2_A49AlbRFen ;
   private int[] P08ZT2_A44AlbRecCod ;
   private byte[] P08ZT2_A47AlbREst ;
   private String[] P08ZT2_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT2_A60AlbRUniUti ;
   private int[] P08ZT2_A52AlbRPieEnt ;
   private int[] P08ZT2_A54AlbRPieUti ;
   private String[] P08ZT2_A45AlbRef ;
   private int[] P08ZT2_A252CliCod ;
   private String[] P08ZT2_A396EmprCod ;
   private short[] P08ZT3_A6263AlbRTartC ;
   private boolean[] P08ZT3_n6263AlbRTartC ;
   private String[] P08ZT3_A56AlbRUni ;
   private short[] P08ZT3_A1211TipEntCod ;
   private boolean[] P08ZT3_n1211TipEntCod ;
   private short[] P08ZT3_A970ProceCod ;
   private boolean[] P08ZT3_n970ProceCod ;
   private String[] P08ZT3_A1291AlbRDes ;
   private String[] P08ZT3_A1212TipEntNom ;
   private boolean[] P08ZT3_n1212TipEntNom ;
   private String[] P08ZT3_A971ProceNom ;
   private boolean[] P08ZT3_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT3_A57AlbRUniDis ;
   private int[] P08ZT3_A51AlbRPieDis ;
   private String[] P08ZT3_A50AlbRLoc ;
   private String[] P08ZT3_A6463AlbRLote ;
   private String[] P08ZT3_A6264AlbRTartD ;
   private boolean[] P08ZT3_n6264AlbRTartD ;
   private String[] P08ZT3_A3359AlbRDisCli ;
   private String[] P08ZT3_A3613AlbRefDsc ;
   private String[] P08ZT3_A279CliNom ;
   private java.util.Date[] P08ZT3_A49AlbRFen ;
   private int[] P08ZT3_A44AlbRecCod ;
   private byte[] P08ZT3_A47AlbREst ;
   private String[] P08ZT3_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT3_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT3_A60AlbRUniUti ;
   private int[] P08ZT3_A52AlbRPieEnt ;
   private int[] P08ZT3_A54AlbRPieUti ;
   private String[] P08ZT3_A45AlbRef ;
   private int[] P08ZT3_A252CliCod ;
   private String[] P08ZT3_A396EmprCod ;
   private short[] P08ZT4_A6263AlbRTartC ;
   private boolean[] P08ZT4_n6263AlbRTartC ;
   private String[] P08ZT4_A56AlbRUni ;
   private String[] P08ZT4_A3613AlbRefDsc ;
   private short[] P08ZT4_A1211TipEntCod ;
   private boolean[] P08ZT4_n1211TipEntCod ;
   private short[] P08ZT4_A970ProceCod ;
   private boolean[] P08ZT4_n970ProceCod ;
   private String[] P08ZT4_A1291AlbRDes ;
   private String[] P08ZT4_A1212TipEntNom ;
   private boolean[] P08ZT4_n1212TipEntNom ;
   private String[] P08ZT4_A971ProceNom ;
   private boolean[] P08ZT4_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT4_A57AlbRUniDis ;
   private int[] P08ZT4_A51AlbRPieDis ;
   private String[] P08ZT4_A50AlbRLoc ;
   private String[] P08ZT4_A6463AlbRLote ;
   private String[] P08ZT4_A6264AlbRTartD ;
   private boolean[] P08ZT4_n6264AlbRTartD ;
   private String[] P08ZT4_A3359AlbRDisCli ;
   private String[] P08ZT4_A279CliNom ;
   private java.util.Date[] P08ZT4_A49AlbRFen ;
   private int[] P08ZT4_A44AlbRecCod ;
   private byte[] P08ZT4_A47AlbREst ;
   private String[] P08ZT4_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT4_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT4_A60AlbRUniUti ;
   private int[] P08ZT4_A52AlbRPieEnt ;
   private int[] P08ZT4_A54AlbRPieUti ;
   private String[] P08ZT4_A45AlbRef ;
   private int[] P08ZT4_A252CliCod ;
   private String[] P08ZT4_A396EmprCod ;
   private short[] P08ZT5_A6263AlbRTartC ;
   private boolean[] P08ZT5_n6263AlbRTartC ;
   private String[] P08ZT5_A56AlbRUni ;
   private String[] P08ZT5_A3359AlbRDisCli ;
   private short[] P08ZT5_A1211TipEntCod ;
   private boolean[] P08ZT5_n1211TipEntCod ;
   private short[] P08ZT5_A970ProceCod ;
   private boolean[] P08ZT5_n970ProceCod ;
   private String[] P08ZT5_A1291AlbRDes ;
   private String[] P08ZT5_A1212TipEntNom ;
   private boolean[] P08ZT5_n1212TipEntNom ;
   private String[] P08ZT5_A971ProceNom ;
   private boolean[] P08ZT5_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT5_A57AlbRUniDis ;
   private int[] P08ZT5_A51AlbRPieDis ;
   private String[] P08ZT5_A50AlbRLoc ;
   private String[] P08ZT5_A6463AlbRLote ;
   private String[] P08ZT5_A6264AlbRTartD ;
   private boolean[] P08ZT5_n6264AlbRTartD ;
   private String[] P08ZT5_A3613AlbRefDsc ;
   private String[] P08ZT5_A279CliNom ;
   private java.util.Date[] P08ZT5_A49AlbRFen ;
   private int[] P08ZT5_A44AlbRecCod ;
   private byte[] P08ZT5_A47AlbREst ;
   private String[] P08ZT5_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT5_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT5_A60AlbRUniUti ;
   private int[] P08ZT5_A52AlbRPieEnt ;
   private int[] P08ZT5_A54AlbRPieUti ;
   private String[] P08ZT5_A45AlbRef ;
   private int[] P08ZT5_A252CliCod ;
   private String[] P08ZT5_A396EmprCod ;
   private short[] P08ZT6_A6263AlbRTartC ;
   private boolean[] P08ZT6_n6263AlbRTartC ;
   private short[] P08ZT6_A1211TipEntCod ;
   private boolean[] P08ZT6_n1211TipEntCod ;
   private short[] P08ZT6_A970ProceCod ;
   private boolean[] P08ZT6_n970ProceCod ;
   private String[] P08ZT6_A1291AlbRDes ;
   private String[] P08ZT6_A1212TipEntNom ;
   private boolean[] P08ZT6_n1212TipEntNom ;
   private String[] P08ZT6_A971ProceNom ;
   private boolean[] P08ZT6_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT6_A57AlbRUniDis ;
   private int[] P08ZT6_A51AlbRPieDis ;
   private String[] P08ZT6_A50AlbRLoc ;
   private String[] P08ZT6_A6463AlbRLote ;
   private String[] P08ZT6_A6264AlbRTartD ;
   private boolean[] P08ZT6_n6264AlbRTartD ;
   private String[] P08ZT6_A3359AlbRDisCli ;
   private String[] P08ZT6_A3613AlbRefDsc ;
   private String[] P08ZT6_A279CliNom ;
   private java.util.Date[] P08ZT6_A49AlbRFen ;
   private int[] P08ZT6_A44AlbRecCod ;
   private byte[] P08ZT6_A47AlbREst ;
   private String[] P08ZT6_A56AlbRUni ;
   private String[] P08ZT6_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT6_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT6_A60AlbRUniUti ;
   private int[] P08ZT6_A52AlbRPieEnt ;
   private int[] P08ZT6_A54AlbRPieUti ;
   private String[] P08ZT6_A45AlbRef ;
   private int[] P08ZT6_A252CliCod ;
   private String[] P08ZT6_A396EmprCod ;
   private short[] P08ZT7_A6263AlbRTartC ;
   private boolean[] P08ZT7_n6263AlbRTartC ;
   private String[] P08ZT7_A56AlbRUni ;
   private String[] P08ZT7_A6463AlbRLote ;
   private short[] P08ZT7_A1211TipEntCod ;
   private boolean[] P08ZT7_n1211TipEntCod ;
   private short[] P08ZT7_A970ProceCod ;
   private boolean[] P08ZT7_n970ProceCod ;
   private String[] P08ZT7_A1291AlbRDes ;
   private String[] P08ZT7_A1212TipEntNom ;
   private boolean[] P08ZT7_n1212TipEntNom ;
   private String[] P08ZT7_A971ProceNom ;
   private boolean[] P08ZT7_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT7_A57AlbRUniDis ;
   private int[] P08ZT7_A51AlbRPieDis ;
   private String[] P08ZT7_A50AlbRLoc ;
   private String[] P08ZT7_A6264AlbRTartD ;
   private boolean[] P08ZT7_n6264AlbRTartD ;
   private String[] P08ZT7_A3359AlbRDisCli ;
   private String[] P08ZT7_A3613AlbRefDsc ;
   private String[] P08ZT7_A279CliNom ;
   private java.util.Date[] P08ZT7_A49AlbRFen ;
   private int[] P08ZT7_A44AlbRecCod ;
   private byte[] P08ZT7_A47AlbREst ;
   private String[] P08ZT7_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT7_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT7_A60AlbRUniUti ;
   private int[] P08ZT7_A52AlbRPieEnt ;
   private int[] P08ZT7_A54AlbRPieUti ;
   private String[] P08ZT7_A45AlbRef ;
   private int[] P08ZT7_A252CliCod ;
   private String[] P08ZT7_A396EmprCod ;
   private short[] P08ZT8_A6263AlbRTartC ;
   private boolean[] P08ZT8_n6263AlbRTartC ;
   private String[] P08ZT8_A56AlbRUni ;
   private String[] P08ZT8_A50AlbRLoc ;
   private short[] P08ZT8_A1211TipEntCod ;
   private boolean[] P08ZT8_n1211TipEntCod ;
   private short[] P08ZT8_A970ProceCod ;
   private boolean[] P08ZT8_n970ProceCod ;
   private String[] P08ZT8_A1291AlbRDes ;
   private String[] P08ZT8_A1212TipEntNom ;
   private boolean[] P08ZT8_n1212TipEntNom ;
   private String[] P08ZT8_A971ProceNom ;
   private boolean[] P08ZT8_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT8_A57AlbRUniDis ;
   private int[] P08ZT8_A51AlbRPieDis ;
   private String[] P08ZT8_A6463AlbRLote ;
   private String[] P08ZT8_A6264AlbRTartD ;
   private boolean[] P08ZT8_n6264AlbRTartD ;
   private String[] P08ZT8_A3359AlbRDisCli ;
   private String[] P08ZT8_A3613AlbRefDsc ;
   private String[] P08ZT8_A279CliNom ;
   private java.util.Date[] P08ZT8_A49AlbRFen ;
   private int[] P08ZT8_A44AlbRecCod ;
   private byte[] P08ZT8_A47AlbREst ;
   private String[] P08ZT8_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT8_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT8_A60AlbRUniUti ;
   private int[] P08ZT8_A52AlbRPieEnt ;
   private int[] P08ZT8_A54AlbRPieUti ;
   private String[] P08ZT8_A45AlbRef ;
   private int[] P08ZT8_A252CliCod ;
   private String[] P08ZT8_A396EmprCod ;
   private short[] P08ZT9_A6263AlbRTartC ;
   private boolean[] P08ZT9_n6263AlbRTartC ;
   private short[] P08ZT9_A970ProceCod ;
   private boolean[] P08ZT9_n970ProceCod ;
   private short[] P08ZT9_A1211TipEntCod ;
   private boolean[] P08ZT9_n1211TipEntCod ;
   private String[] P08ZT9_A1291AlbRDes ;
   private String[] P08ZT9_A1212TipEntNom ;
   private boolean[] P08ZT9_n1212TipEntNom ;
   private String[] P08ZT9_A971ProceNom ;
   private boolean[] P08ZT9_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT9_A57AlbRUniDis ;
   private int[] P08ZT9_A51AlbRPieDis ;
   private String[] P08ZT9_A50AlbRLoc ;
   private String[] P08ZT9_A6463AlbRLote ;
   private String[] P08ZT9_A6264AlbRTartD ;
   private boolean[] P08ZT9_n6264AlbRTartD ;
   private String[] P08ZT9_A3359AlbRDisCli ;
   private String[] P08ZT9_A3613AlbRefDsc ;
   private String[] P08ZT9_A279CliNom ;
   private java.util.Date[] P08ZT9_A49AlbRFen ;
   private int[] P08ZT9_A44AlbRecCod ;
   private byte[] P08ZT9_A47AlbREst ;
   private String[] P08ZT9_A56AlbRUni ;
   private String[] P08ZT9_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT9_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT9_A60AlbRUniUti ;
   private int[] P08ZT9_A52AlbRPieEnt ;
   private int[] P08ZT9_A54AlbRPieUti ;
   private String[] P08ZT9_A45AlbRef ;
   private int[] P08ZT9_A252CliCod ;
   private String[] P08ZT9_A396EmprCod ;
   private short[] P08ZT10_A6263AlbRTartC ;
   private boolean[] P08ZT10_n6263AlbRTartC ;
   private short[] P08ZT10_A1211TipEntCod ;
   private boolean[] P08ZT10_n1211TipEntCod ;
   private short[] P08ZT10_A970ProceCod ;
   private boolean[] P08ZT10_n970ProceCod ;
   private String[] P08ZT10_A1291AlbRDes ;
   private String[] P08ZT10_A1212TipEntNom ;
   private boolean[] P08ZT10_n1212TipEntNom ;
   private String[] P08ZT10_A971ProceNom ;
   private boolean[] P08ZT10_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT10_A57AlbRUniDis ;
   private int[] P08ZT10_A51AlbRPieDis ;
   private String[] P08ZT10_A50AlbRLoc ;
   private String[] P08ZT10_A6463AlbRLote ;
   private String[] P08ZT10_A6264AlbRTartD ;
   private boolean[] P08ZT10_n6264AlbRTartD ;
   private String[] P08ZT10_A3359AlbRDisCli ;
   private String[] P08ZT10_A3613AlbRefDsc ;
   private String[] P08ZT10_A279CliNom ;
   private java.util.Date[] P08ZT10_A49AlbRFen ;
   private int[] P08ZT10_A44AlbRecCod ;
   private byte[] P08ZT10_A47AlbREst ;
   private String[] P08ZT10_A56AlbRUni ;
   private String[] P08ZT10_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT10_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT10_A60AlbRUniUti ;
   private int[] P08ZT10_A52AlbRPieEnt ;
   private int[] P08ZT10_A54AlbRPieUti ;
   private String[] P08ZT10_A45AlbRef ;
   private int[] P08ZT10_A252CliCod ;
   private String[] P08ZT10_A396EmprCod ;
   private short[] P08ZT11_A6263AlbRTartC ;
   private boolean[] P08ZT11_n6263AlbRTartC ;
   private short[] P08ZT11_A1211TipEntCod ;
   private boolean[] P08ZT11_n1211TipEntCod ;
   private short[] P08ZT11_A970ProceCod ;
   private boolean[] P08ZT11_n970ProceCod ;
   private String[] P08ZT11_A1291AlbRDes ;
   private String[] P08ZT11_A1212TipEntNom ;
   private boolean[] P08ZT11_n1212TipEntNom ;
   private String[] P08ZT11_A971ProceNom ;
   private boolean[] P08ZT11_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT11_A57AlbRUniDis ;
   private int[] P08ZT11_A51AlbRPieDis ;
   private String[] P08ZT11_A50AlbRLoc ;
   private String[] P08ZT11_A6463AlbRLote ;
   private String[] P08ZT11_A6264AlbRTartD ;
   private boolean[] P08ZT11_n6264AlbRTartD ;
   private String[] P08ZT11_A3359AlbRDisCli ;
   private String[] P08ZT11_A3613AlbRefDsc ;
   private String[] P08ZT11_A279CliNom ;
   private java.util.Date[] P08ZT11_A49AlbRFen ;
   private int[] P08ZT11_A44AlbRecCod ;
   private byte[] P08ZT11_A47AlbREst ;
   private String[] P08ZT11_A56AlbRUni ;
   private String[] P08ZT11_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT11_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT11_A60AlbRUniUti ;
   private int[] P08ZT11_A52AlbRPieEnt ;
   private int[] P08ZT11_A54AlbRPieUti ;
   private String[] P08ZT11_A45AlbRef ;
   private int[] P08ZT11_A252CliCod ;
   private String[] P08ZT11_A396EmprCod ;
   private short[] P08ZT12_A6263AlbRTartC ;
   private boolean[] P08ZT12_n6263AlbRTartC ;
   private String[] P08ZT12_A56AlbRUni ;
   private String[] P08ZT12_A1291AlbRDes ;
   private short[] P08ZT12_A1211TipEntCod ;
   private boolean[] P08ZT12_n1211TipEntCod ;
   private short[] P08ZT12_A970ProceCod ;
   private boolean[] P08ZT12_n970ProceCod ;
   private String[] P08ZT12_A1212TipEntNom ;
   private boolean[] P08ZT12_n1212TipEntNom ;
   private String[] P08ZT12_A971ProceNom ;
   private boolean[] P08ZT12_n971ProceNom ;
   private java.math.BigDecimal[] P08ZT12_A57AlbRUniDis ;
   private int[] P08ZT12_A51AlbRPieDis ;
   private String[] P08ZT12_A50AlbRLoc ;
   private String[] P08ZT12_A6463AlbRLote ;
   private String[] P08ZT12_A6264AlbRTartD ;
   private boolean[] P08ZT12_n6264AlbRTartD ;
   private String[] P08ZT12_A3359AlbRDisCli ;
   private String[] P08ZT12_A3613AlbRefDsc ;
   private String[] P08ZT12_A279CliNom ;
   private java.util.Date[] P08ZT12_A49AlbRFen ;
   private int[] P08ZT12_A44AlbRecCod ;
   private byte[] P08ZT12_A47AlbREst ;
   private String[] P08ZT12_A55AlbRReo ;
   private java.math.BigDecimal[] P08ZT12_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZT12_A60AlbRUniUti ;
   private int[] P08ZT12_A52AlbRPieEnt ;
   private int[] P08ZT12_A54AlbRPieUti ;
   private String[] P08ZT12_A45AlbRef ;
   private int[] P08ZT12_A252CliCod ;
   private String[] P08ZT12_A396EmprCod ;
   private GXSimpleCollection<String> AV74TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV37TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ;
   private GXSimpleCollection<String> AV49Options ;
   private GXSimpleCollection<String> AV52OptionsDesc ;
   private GXSimpleCollection<String> AV54OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV59GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV60GridStateFilterValue ;
}

final  class wcconsultaalmacentejidoencrudogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV68AlbRef ,
                                          String AV83albref_to ,
                                          java.util.Date AV64Albrfen ,
                                          java.util.Date AV65Albrfen_to ,
                                          int AV66Clicod ,
                                          int AV67Clicod_to ,
                                          short A970ProceCod ,
                                          short AV77Procecod ,
                                          short AV78ProceCod_to ,
                                          String AV69AlbRReo ,
                                          byte AV70AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV86TipEntCod ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          String AV87AlbRUni )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[51];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.AlbRUni, T2.CliNom, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti)" ;
      scmdbuf += " >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc," ;
      scmdbuf += " T1.AlbRLote, T3.TipArtDsc AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int7[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int7[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int7[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int7[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int7[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int7[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int7[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int7[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int7[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int7[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int7[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int7[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int7[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int7[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int7[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int7[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int7[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int7[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int7[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int7[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int7[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int7[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int7[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int7[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P08ZT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          java.util.Date AV64Albrfen ,
                                          java.util.Date AV65Albrfen_to ,
                                          int AV66Clicod ,
                                          int AV67Clicod_to ,
                                          short A970ProceCod ,
                                          short AV77Procecod ,
                                          short AV78ProceCod_to ,
                                          String AV69AlbRReo ,
                                          byte AV70AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV86TipEntCod ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          String AV87AlbRUni ,
                                          String AV68AlbRef ,
                                          String AV83albref_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[51];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.AlbRUni, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0" ;
      scmdbuf += " THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc," ;
      scmdbuf += " T1.AlbRLote, T3.TipArtDsc AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod)" ;
      scmdbuf += " LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRef" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08ZT4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV68AlbRef ,
                                          String AV83albref_to ,
                                          java.util.Date AV64Albrfen ,
                                          java.util.Date AV65Albrfen_to ,
                                          int AV66Clicod ,
                                          int AV67Clicod_to ,
                                          short A970ProceCod ,
                                          short AV77Procecod ,
                                          short AV78ProceCod_to ,
                                          String AV69AlbRReo ,
                                          byte AV70AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV86TipEntCod ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          String AV87AlbRUni )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[51];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.AlbRUni, T1.AlbRefDsc, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti)" ;
      scmdbuf += " >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc," ;
      scmdbuf += " T1.AlbRLote, T3.TipArtDsc AS AlbRTartD, T1.AlbRDisCli, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int13[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int13[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int13[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int13[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int13[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int13[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int13[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int13[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int13[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int13[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int13[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int13[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int13[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int13[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int13[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int13[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P08ZT5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV68AlbRef ,
                                          String AV83albref_to ,
                                          java.util.Date AV64Albrfen ,
                                          java.util.Date AV65Albrfen_to ,
                                          int AV66Clicod ,
                                          int AV67Clicod_to ,
                                          short A970ProceCod ,
                                          short AV77Procecod ,
                                          short AV78ProceCod_to ,
                                          String AV69AlbRReo ,
                                          byte AV70AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV86TipEntCod ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          String AV87AlbRUni )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[51];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.AlbRUni, T1.AlbRDisCli, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti)" ;
      scmdbuf += " >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc," ;
      scmdbuf += " T1.AlbRLote, T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int16[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRDisCli" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P08ZT6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV68AlbRef ,
                                          String AV83albref_to ,
                                          java.util.Date AV64Albrfen ,
                                          java.util.Date AV65Albrfen_to ,
                                          int AV66Clicod ,
                                          int AV67Clicod_to ,
                                          short A970ProceCod ,
                                          short AV77Procecod ,
                                          short AV78ProceCod_to ,
                                          String AV69AlbRReo ,
                                          byte AV70AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV86TipEntCod ,
                                          String AV87AlbRUni ,
                                          String AV63Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[51];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt" ;
      scmdbuf += " - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc, T1.AlbRLote, T3.TipArtDsc" ;
      scmdbuf += " AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int19[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int19[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int19[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int19[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int19[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int19[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int19[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int19[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int19[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRTartC" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_P08ZT7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV68AlbRef ,
                                          String AV83albref_to ,
                                          java.util.Date AV64Albrfen ,
                                          java.util.Date AV65Albrfen_to ,
                                          int AV66Clicod ,
                                          int AV67Clicod_to ,
                                          short A970ProceCod ,
                                          short AV77Procecod ,
                                          short AV78ProceCod_to ,
                                          String AV69AlbRReo ,
                                          byte AV70AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV86TipEntCod ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          String AV87AlbRUni )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[51];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.AlbRUni, T1.AlbRLote, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti)" ;
      scmdbuf += " >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc," ;
      scmdbuf += " T3.TipArtDsc AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int22[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int22[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int22[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int22[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int22[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int22[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int22[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int22[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int22[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int22[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int22[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int22[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int22[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRLote" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_P08ZT8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV68AlbRef ,
                                          String AV83albref_to ,
                                          java.util.Date AV64Albrfen ,
                                          java.util.Date AV65Albrfen_to ,
                                          int AV66Clicod ,
                                          int AV67Clicod_to ,
                                          short A970ProceCod ,
                                          short AV77Procecod ,
                                          short AV78ProceCod_to ,
                                          String AV69AlbRReo ,
                                          byte AV70AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV86TipEntCod ,
                                          String A396EmprCod ,
                                          String AV63Emprcod ,
                                          String AV87AlbRUni )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[51];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.AlbRUni, T1.AlbRLoc, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti)" ;
      scmdbuf += " >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLote," ;
      scmdbuf += " T3.TipArtDsc AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int25[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int25[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int25[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRLoc" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_P08ZT9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV68AlbRef ,
                                          String AV83albref_to ,
                                          java.util.Date AV64Albrfen ,
                                          java.util.Date AV65Albrfen_to ,
                                          int AV66Clicod ,
                                          int AV67Clicod_to ,
                                          String AV69AlbRReo ,
                                          byte AV70AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV86TipEntCod ,
                                          String AV87AlbRUni ,
                                          String AV63Emprcod ,
                                          short AV77Procecod ,
                                          String A396EmprCod ,
                                          short A970ProceCod ,
                                          short AV78ProceCod_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[51];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.ProceCod, T1.TipEntCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt" ;
      scmdbuf += " - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc, T1.AlbRLote, T3.TipArtDsc" ;
      scmdbuf += " AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int28[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int28[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int28[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int28[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int28[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int28[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int28[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int28[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int28[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int28[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int28[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int28[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int28[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int28[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int28[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int28[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int28[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int28[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int28[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int28[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int28[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int28[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int28[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int28[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int28[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int28[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int28[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_P08ZT10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A55AlbRReo ,
                                           GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           String A56AlbRUni ,
                                           GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           byte A47AlbREst ,
                                           GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                           int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                           int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                           java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                           int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                           String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                           int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                           int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                           int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                           int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                           int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                           int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                           java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                           String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           int A44AlbRecCod ,
                                           java.util.Date A49AlbRFen ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A45AlbRef ,
                                           String A3613AlbRefDsc ,
                                           String A3359AlbRDisCli ,
                                           String A6264AlbRTartD ,
                                           String A6463AlbRLote ,
                                           String A50AlbRLoc ,
                                           int A52AlbRPieEnt ,
                                           int A54AlbRPieUti ,
                                           java.math.BigDecimal A58AlbRUniEnt ,
                                           java.math.BigDecimal A60AlbRUniUti ,
                                           String A971ProceNom ,
                                           String A1212TipEntNom ,
                                           String A1291AlbRDes ,
                                           String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           int A51AlbRPieDis ,
                                           java.math.BigDecimal A57AlbRUniDis ,
                                           String A13981Composicio ,
                                           String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           String AV68AlbRef ,
                                           String AV83albref_to ,
                                           java.util.Date AV64Albrfen ,
                                           java.util.Date AV65Albrfen_to ,
                                           int AV66Clicod ,
                                           int AV67Clicod_to ,
                                           short A970ProceCod ,
                                           short AV77Procecod ,
                                           short AV78ProceCod_to ,
                                           String AV69AlbRReo ,
                                           byte AV70AlbREst ,
                                           short A1211TipEntCod ,
                                           short AV86TipEntCod ,
                                           String AV87AlbRUni ,
                                           String AV63Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[51];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt" ;
      scmdbuf += " - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc, T1.AlbRLote, T3.TipArtDsc" ;
      scmdbuf += " AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int31[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int31[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int31[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int31[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int31[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int31[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int31[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int31[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int31[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_P08ZT11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A55AlbRReo ,
                                           GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           String A56AlbRUni ,
                                           GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           byte A47AlbREst ,
                                           GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                           int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                           int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                           java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                           int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                           String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                           int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                           int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                           int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                           int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                           int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                           int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                           java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                           String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           int A44AlbRecCod ,
                                           java.util.Date A49AlbRFen ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A45AlbRef ,
                                           String A3613AlbRefDsc ,
                                           String A3359AlbRDisCli ,
                                           String A6264AlbRTartD ,
                                           String A6463AlbRLote ,
                                           String A50AlbRLoc ,
                                           int A52AlbRPieEnt ,
                                           int A54AlbRPieUti ,
                                           java.math.BigDecimal A58AlbRUniEnt ,
                                           java.math.BigDecimal A60AlbRUniUti ,
                                           String A971ProceNom ,
                                           String A1212TipEntNom ,
                                           String A1291AlbRDes ,
                                           String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           int A51AlbRPieDis ,
                                           java.math.BigDecimal A57AlbRUniDis ,
                                           String A13981Composicio ,
                                           String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           String AV68AlbRef ,
                                           String AV83albref_to ,
                                           java.util.Date AV64Albrfen ,
                                           java.util.Date AV65Albrfen_to ,
                                           int AV66Clicod ,
                                           int AV67Clicod_to ,
                                           short A970ProceCod ,
                                           short AV77Procecod ,
                                           short AV78ProceCod_to ,
                                           String AV69AlbRReo ,
                                           byte AV70AlbREst ,
                                           short A1211TipEntCod ,
                                           short AV86TipEntCod ,
                                           String AV87AlbRUni ,
                                           String AV63Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[51];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt" ;
      scmdbuf += " - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc, T1.AlbRLote, T3.TipArtDsc" ;
      scmdbuf += " AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieEnt," ;
      scmdbuf += " T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int34[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int34[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int34[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int34[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int34[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int34[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int34[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int34[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int34[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int34[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int34[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int34[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int34[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int34[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int34[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int34[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipEntCod" ;
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
   }

   protected Object[] conditional_P08ZT12( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A55AlbRReo ,
                                           GXSimpleCollection<String> AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           String A56AlbRUni ,
                                           GXSimpleCollection<String> AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           byte A47AlbREst ,
                                           GXSimpleCollection<Byte> AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           int AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                           int AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                           int AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                           java.util.Date AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           int AV99Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                           int AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                           String AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           String AV101Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           String AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           String AV103Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           String AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           String AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           String AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           String AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           String AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           String AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           String AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           String AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           String AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           String AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           int AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                           int AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                           int AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                           int AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                           int AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                           int AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                           int AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                           java.math.BigDecimal AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           java.math.BigDecimal AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           java.math.BigDecimal AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           java.math.BigDecimal AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           java.math.BigDecimal AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           int AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                           String AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           String AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           String AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           String AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           String AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           String AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           int A44AlbRecCod ,
                                           java.util.Date A49AlbRFen ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A45AlbRef ,
                                           String A3613AlbRefDsc ,
                                           String A3359AlbRDisCli ,
                                           String A6264AlbRTartD ,
                                           String A6463AlbRLote ,
                                           String A50AlbRLoc ,
                                           int A52AlbRPieEnt ,
                                           int A54AlbRPieUti ,
                                           java.math.BigDecimal A58AlbRUniEnt ,
                                           java.math.BigDecimal A60AlbRUniUti ,
                                           String A971ProceNom ,
                                           String A1212TipEntNom ,
                                           String A1291AlbRDes ,
                                           String AV94Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           int A51AlbRPieDis ,
                                           java.math.BigDecimal A57AlbRUniDis ,
                                           String A13981Composicio ,
                                           String AV132Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           String AV131Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           String AV68AlbRef ,
                                           String AV83albref_to ,
                                           java.util.Date AV64Albrfen ,
                                           java.util.Date AV65Albrfen_to ,
                                           int AV66Clicod ,
                                           int AV67Clicod_to ,
                                           short A970ProceCod ,
                                           short AV77Procecod ,
                                           short AV78ProceCod_to ,
                                           String AV69AlbRReo ,
                                           byte AV70AlbREst ,
                                           short A1211TipEntCod ,
                                           short AV86TipEntCod ,
                                           String A396EmprCod ,
                                           String AV63Emprcod ,
                                           String AV87AlbRUni )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int37 = new byte[51];
      Object[] GXv_Object38 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.AlbRUni, T1.AlbRDes, T1.TipEntCod, T1.ProceCod, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0" ;
      scmdbuf += " THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc," ;
      scmdbuf += " T1.AlbRLote, T3.TipArtDsc AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUniEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod)" ;
      scmdbuf += " LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV95Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int37[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int37[15] = (byte)(1) ;
      }
      if ( AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int37[16] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int37[17] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int37[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int37[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int37[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int37[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int37[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int37[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int37[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int37[32] = (byte)(1) ;
      }
      if ( ! (0==AV115Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int37[33] = (byte)(1) ;
      }
      if ( ! (0==AV116Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int37[34] = (byte)(1) ;
      }
      if ( ! (0==AV117Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int37[35] = (byte)(1) ;
      }
      if ( ! (0==AV118Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int37[36] = (byte)(1) ;
      }
      if ( ! (0==AV119Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int37[37] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int37[38] = (byte)(1) ;
      }
      if ( AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV121Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int37[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int37[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int37[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int37[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int37[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int37[44] = (byte)(1) ;
      }
      if ( AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int37[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV133Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int37[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int37[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbRDes" ;
      GXv_Object38[0] = scmdbuf ;
      GXv_Object38[1] = GXv_int37 ;
      return GXv_Object38 ;
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
                  return conditional_P08ZT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , ((Number) dynConstraints[76]).shortValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).byteValue() , ((Number) dynConstraints[80]).shortValue() , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
            case 1 :
                  return conditional_P08ZT3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() , ((Number) dynConstraints[72]).intValue() , ((Number) dynConstraints[73]).shortValue() , ((Number) dynConstraints[74]).shortValue() , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , ((Number) dynConstraints[77]).byteValue() , ((Number) dynConstraints[78]).shortValue() , ((Number) dynConstraints[79]).shortValue() , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
            case 2 :
                  return conditional_P08ZT4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , ((Number) dynConstraints[76]).shortValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).byteValue() , ((Number) dynConstraints[80]).shortValue() , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
            case 3 :
                  return conditional_P08ZT5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , ((Number) dynConstraints[76]).shortValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).byteValue() , ((Number) dynConstraints[80]).shortValue() , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
            case 4 :
                  return conditional_P08ZT6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , ((Number) dynConstraints[76]).shortValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).byteValue() , ((Number) dynConstraints[80]).shortValue() , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
            case 5 :
                  return conditional_P08ZT7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , ((Number) dynConstraints[76]).shortValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).byteValue() , ((Number) dynConstraints[80]).shortValue() , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
            case 6 :
                  return conditional_P08ZT8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , ((Number) dynConstraints[76]).shortValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).byteValue() , ((Number) dynConstraints[80]).shortValue() , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
            case 7 :
                  return conditional_P08ZT9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , (String)dynConstraints[75] , ((Number) dynConstraints[76]).byteValue() , ((Number) dynConstraints[77]).shortValue() , ((Number) dynConstraints[78]).shortValue() , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , ((Number) dynConstraints[83]).shortValue() , ((Number) dynConstraints[84]).shortValue() );
            case 8 :
                  return conditional_P08ZT10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , ((Number) dynConstraints[76]).shortValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).byteValue() , ((Number) dynConstraints[80]).shortValue() , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
            case 9 :
                  return conditional_P08ZT11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , ((Number) dynConstraints[76]).shortValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).byteValue() , ((Number) dynConstraints[80]).shortValue() , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
            case 10 :
                  return conditional_P08ZT12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (java.math.BigDecimal)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , ((Number) dynConstraints[75]).shortValue() , ((Number) dynConstraints[76]).shortValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).byteValue() , ((Number) dynConstraints[80]).shortValue() , ((Number) dynConstraints[81]).shortValue() , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZT12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((String[]) buf[9])[0] = rslt.getString(7, 25);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 10);
               ((String[]) buf[16])[0] = rslt.getString(12, 20);
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 20);
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(16);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((String[]) buf[8])[0] = rslt.getString(6, 25);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 10);
               ((String[]) buf[15])[0] = rslt.getString(11, 20);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 20);
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(16);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((String[]) buf[9])[0] = rslt.getString(7, 25);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 10);
               ((String[]) buf[16])[0] = rslt.getString(12, 20);
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 20);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(16);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((String[]) buf[9])[0] = rslt.getString(7, 25);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 10);
               ((String[]) buf[16])[0] = rslt.getString(12, 20);
               ((String[]) buf[17])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(16);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 20);
               ((String[]) buf[7])[0] = rslt.getString(5, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((String[]) buf[9])[0] = rslt.getString(7, 25);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 10);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 20);
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(16);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((String[]) buf[9])[0] = rslt.getString(7, 25);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((String[]) buf[15])[0] = rslt.getString(11, 20);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 20);
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(16);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 20);
               ((String[]) buf[7])[0] = rslt.getString(5, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 20);
               ((String[]) buf[7])[0] = rslt.getString(5, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 20);
               ((String[]) buf[7])[0] = rslt.getString(5, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 25);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 10);
               ((String[]) buf[15])[0] = rslt.getString(11, 20);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 20);
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(16);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((int[]) buf[28])[0] = rslt.getInt(23);
               ((String[]) buf[29])[0] = rslt.getString(24, 16);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 3);
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
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
      }
   }

}

