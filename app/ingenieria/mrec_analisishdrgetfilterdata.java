package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_analisishdrgetfilterdata extends GXProcedure
{
   public mrec_analisishdrgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_analisishdrgetfilterdata.class ), "" );
   }

   public mrec_analisishdrgetfilterdata( int remoteHandle ,
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
      mrec_analisishdrgetfilterdata.this.aP5 = new String[] {""};
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
      mrec_analisishdrgetfilterdata.this.AV72DDOName = aP0;
      mrec_analisishdrgetfilterdata.this.AV73SearchTxt = aP1;
      mrec_analisishdrgetfilterdata.this.AV74SearchTxtTo = aP2;
      mrec_analisishdrgetfilterdata.this.aP3 = aP3;
      mrec_analisishdrgetfilterdata.this.aP4 = aP4;
      mrec_analisishdrgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_EMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_BARCODPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCODPAROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRHDROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRHDR2") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRHDR2OPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRMAQCODOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRMAQDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRFASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRFASCODOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRFASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRFASDSCOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRPARDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRPARDSCOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRPLC") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRPLCOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRVALMIN") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRVALMINOPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRVAL") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRVALOPTIONS' */
         S231 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV72DDOName), "DDO_MRPRVALMAX") == 0 )
      {
         /* Execute user subroutine: 'LOADMRPRVALMAXOPTIONS' */
         S241 ();
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
      if ( GXutil.strcmp(AV67Session.getValue("Ingenieria.MRec_AnalisisHdrGridState"), "") == 0 )
      {
         AV69GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Ingenieria.MRec_AnalisisHdrGridState"), null, null);
      }
      else
      {
         AV69GridState.fromxml(AV67Session.getValue("Ingenieria.MRec_AnalisisHdrGridState"), null, null);
      }
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV70GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV69GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV78FilterFullText = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV12TFEmprCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV13TFEmprCod_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
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
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR") == 0 )
         {
            AV32TFMRPrHdr = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR_SEL") == 0 )
         {
            AV33TFMRPrHdr_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR2") == 0 )
         {
            AV34TFMRPrHdr2 = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRHDR2_SEL") == 0 )
         {
            AV35TFMRPrHdr2_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRORD") == 0 )
         {
            AV20TFMRPrOrd = (short)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFMRPrOrd_To = (short)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRLIN") == 0 )
         {
            AV22TFMRPrLin = GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV23TFMRPrLin_To = GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQCOD") == 0 )
         {
            AV28TFMRPrMaqCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQCOD_SEL") == 0 )
         {
            AV29TFMRPrMaqCod_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQDSC") == 0 )
         {
            AV30TFMRPrMaqDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRMAQDSC_SEL") == 0 )
         {
            AV31TFMRPrMaqDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASCOD") == 0 )
         {
            AV24TFMRPrFasCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASCOD_SEL") == 0 )
         {
            AV25TFMRPrFasCod_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASDSC") == 0 )
         {
            AV26TFMRPrFasDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFASDSC_SEL") == 0 )
         {
            AV27TFMRPrFasDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARID") == 0 )
         {
            AV50TFMRPrParId = GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV51TFMRPrParId_To = GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARCOD") == 0 )
         {
            AV46TFMRPrParCod = (short)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFMRPrParCod_To = (short)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARDSC") == 0 )
         {
            AV48TFMRPrParDsc = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPARDSC_SEL") == 0 )
         {
            AV49TFMRPrParDsc_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPLC") == 0 )
         {
            AV44TFMRPrPLC = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRPLC_SEL") == 0 )
         {
            AV45TFMRPrPLC_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFEC") == 0 )
         {
            AV37TFMRPrFec = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMIN") == 0 )
         {
            AV40TFMRPrValMin = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMIN_SEL") == 0 )
         {
            AV41TFMRPrValMin_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVAL") == 0 )
         {
            AV38TFMRPrVal = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVAL_SEL") == 0 )
         {
            AV39TFMRPrVal_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMAX") == 0 )
         {
            AV42TFMRPrValMax = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRVALMAX_SEL") == 0 )
         {
            AV43TFMRPrValMax_Sel = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRER_SEL") == 0 )
         {
            AV36TFMRPrEr_Sel = (byte)(GXutil.lval( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRPRFECEV") == 0 )
         {
            AV52TFMRPrFecEv = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INEMPRCOD") == 0 )
         {
            AV94inEmprCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODJSON") == 0 )
         {
            AV80MaqCodJSON = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCODJSON") == 0 )
         {
            AV81FasCodJSON = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HDRJSON") == 0 )
         {
            AV82HdrJSON = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DESDE") == 0 )
         {
            AV85Desde = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HASTA") == 0 )
         {
            AV86Hasta = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INUSURCOD") == 0 )
         {
            AV95inUsurCod = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&IP") == 0 )
         {
            AV88Ip = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&NOW") == 0 )
         {
            AV89Now = localUtil.ctot( AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MTKN") == 0 )
         {
            AV90MTkn = AV70GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFEmprCod = AV73SearchTxt ;
      AV13TFEmprCod_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn ,
                                           AV79EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV92 */
      pr_default.execute(0, new Object[] {AV79EmprCod, AV85Desde, AV86Hasta, AV89Now, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAV92 = false ;
         A396EmprCod = P0AV92_A396EmprCod[0] ;
         A14756MRPrTkn = P0AV92_A14756MRPrTkn[0] ;
         A14753MRPrReg = P0AV92_A14753MRPrReg[0] ;
         A14752MRPrIp = P0AV92_A14752MRPrIp[0] ;
         A14751MRPrUsu = P0AV92_A14751MRPrUsu[0] ;
         A14763MRPrFecEv = P0AV92_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV92_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV92_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV92_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV92_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV92_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV92_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV92_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV92_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV92_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV92_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV92_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV92_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV92_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV92_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV92_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV92_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV92_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV92_A130BarCodPar[0] ;
         A132BarCodReo = P0AV92_A132BarCodReo[0] ;
         A129BarCod = P0AV92_A129BarCod[0] ;
         A14681MRPrId = P0AV92_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AV92_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brkAV92 = false ;
            A14681MRPrId = P0AV92_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV92 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A396EmprCod)==0) )
         {
            AV61Option = A396EmprCod ;
            AV63OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))) ;
            AV62Options.add(AV61Option, 0);
            AV64OptionsDesc.add(AV63OptionDesc, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV92 )
         {
            brkAV92 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarCodPar = AV73SearchTxt ;
      AV19TFBarCodPar_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV93 */
      pr_default.execute(1, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAV94 = false ;
         A396EmprCod = P0AV93_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV93_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV93_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV93_A14756MRPrTkn[0] ;
         A130BarCodPar = P0AV93_A130BarCodPar[0] ;
         A14753MRPrReg = P0AV93_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV93_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV93_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV93_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV93_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV93_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV93_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV93_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV93_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV93_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV93_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV93_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV93_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV93_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV93_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV93_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV93_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV93_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV93_A14755MRPrHdr[0] ;
         A132BarCodReo = P0AV93_A132BarCodReo[0] ;
         A129BarCod = P0AV93_A129BarCod[0] ;
         A14681MRPrId = P0AV93_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AV93_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brkAV94 = false ;
            A14681MRPrId = P0AV93_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV94 = true ;
            pr_default.readNext(1);
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
         if ( ! brkAV94 )
         {
            brkAV94 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMRPRHDROPTIONS' Routine */
      returnInSub = false ;
      AV32TFMRPrHdr = AV73SearchTxt ;
      AV33TFMRPrHdr_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV94 */
      pr_default.execute(2, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAV96 = false ;
         A396EmprCod = P0AV94_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV94_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV94_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV94_A14756MRPrTkn[0] ;
         A14755MRPrHdr = P0AV94_A14755MRPrHdr[0] ;
         A14753MRPrReg = P0AV94_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV94_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV94_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV94_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV94_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV94_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV94_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV94_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV94_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV94_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV94_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV94_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV94_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV94_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV94_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV94_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV94_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV94_A14754MRPrHdr2[0] ;
         A130BarCodPar = P0AV94_A130BarCodPar[0] ;
         A132BarCodReo = P0AV94_A132BarCodReo[0] ;
         A129BarCod = P0AV94_A129BarCod[0] ;
         A14681MRPrId = P0AV94_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AV94_A14755MRPrHdr[0], A14755MRPrHdr) == 0 ) )
         {
            brkAV96 = false ;
            A14681MRPrId = P0AV94_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV96 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A14755MRPrHdr)==0) )
         {
            AV61Option = A14755MRPrHdr ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV96 )
         {
            brkAV96 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMRPRHDR2OPTIONS' Routine */
      returnInSub = false ;
      AV34TFMRPrHdr2 = AV73SearchTxt ;
      AV35TFMRPrHdr2_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV95 */
      pr_default.execute(3, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAV98 = false ;
         A396EmprCod = P0AV95_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV95_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV95_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV95_A14756MRPrTkn[0] ;
         A14754MRPrHdr2 = P0AV95_A14754MRPrHdr2[0] ;
         A14753MRPrReg = P0AV95_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV95_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV95_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV95_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV95_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV95_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV95_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV95_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV95_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV95_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV95_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV95_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV95_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV95_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV95_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV95_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV95_A14761MRPrOrd[0] ;
         A14755MRPrHdr = P0AV95_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV95_A130BarCodPar[0] ;
         A132BarCodReo = P0AV95_A132BarCodReo[0] ;
         A129BarCod = P0AV95_A129BarCod[0] ;
         A14681MRPrId = P0AV95_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AV95_A14754MRPrHdr2[0], A14754MRPrHdr2) == 0 ) )
         {
            brkAV98 = false ;
            A14681MRPrId = P0AV95_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV98 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A14754MRPrHdr2)==0) )
         {
            AV61Option = A14754MRPrHdr2 ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV98 )
         {
            brkAV98 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADMRPRMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV28TFMRPrMaqCod = AV73SearchTxt ;
      AV29TFMRPrMaqCod_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV96 */
      pr_default.execute(4, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAV910 = false ;
         A396EmprCod = P0AV96_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV96_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV96_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV96_A14756MRPrTkn[0] ;
         A14720MRPrMaqCod = P0AV96_A14720MRPrMaqCod[0] ;
         A14753MRPrReg = P0AV96_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV96_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV96_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV96_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV96_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV96_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV96_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV96_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV96_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV96_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV96_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV96_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV96_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV96_A14760MRPrMaqDsc[0] ;
         A14762MRPrLin = P0AV96_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV96_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV96_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV96_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV96_A130BarCodPar[0] ;
         A132BarCodReo = P0AV96_A132BarCodReo[0] ;
         A129BarCod = P0AV96_A129BarCod[0] ;
         A14681MRPrId = P0AV96_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AV96_A14720MRPrMaqCod[0], A14720MRPrMaqCod) == 0 ) )
         {
            brkAV910 = false ;
            A14681MRPrId = P0AV96_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV910 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A14720MRPrMaqCod)==0) )
         {
            AV61Option = A14720MRPrMaqCod ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV910 )
         {
            brkAV910 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADMRPRMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV30TFMRPrMaqDsc = AV73SearchTxt ;
      AV31TFMRPrMaqDsc_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV97 */
      pr_default.execute(5, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAV912 = false ;
         A396EmprCod = P0AV97_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV97_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV97_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV97_A14756MRPrTkn[0] ;
         A14760MRPrMaqDsc = P0AV97_A14760MRPrMaqDsc[0] ;
         A14753MRPrReg = P0AV97_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV97_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV97_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV97_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV97_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV97_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV97_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV97_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV97_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV97_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV97_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV97_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV97_A14719MRPrFasCod[0] ;
         A14720MRPrMaqCod = P0AV97_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV97_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV97_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV97_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV97_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV97_A130BarCodPar[0] ;
         A132BarCodReo = P0AV97_A132BarCodReo[0] ;
         A129BarCod = P0AV97_A129BarCod[0] ;
         A14681MRPrId = P0AV97_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AV97_A14760MRPrMaqDsc[0], A14760MRPrMaqDsc) == 0 ) )
         {
            brkAV912 = false ;
            A14681MRPrId = P0AV97_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV912 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A14760MRPrMaqDsc)==0) )
         {
            AV61Option = A14760MRPrMaqDsc ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV912 )
         {
            brkAV912 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADMRPRFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV24TFMRPrFasCod = AV73SearchTxt ;
      AV25TFMRPrFasCod_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV98 */
      pr_default.execute(6, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkAV914 = false ;
         A396EmprCod = P0AV98_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV98_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV98_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV98_A14756MRPrTkn[0] ;
         A14719MRPrFasCod = P0AV98_A14719MRPrFasCod[0] ;
         A14753MRPrReg = P0AV98_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV98_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV98_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV98_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV98_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV98_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV98_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV98_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV98_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV98_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV98_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV98_A14759MRPrFasDsc[0] ;
         A14760MRPrMaqDsc = P0AV98_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV98_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV98_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV98_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV98_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV98_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV98_A130BarCodPar[0] ;
         A132BarCodReo = P0AV98_A132BarCodReo[0] ;
         A129BarCod = P0AV98_A129BarCod[0] ;
         A14681MRPrId = P0AV98_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0AV98_A14719MRPrFasCod[0], A14719MRPrFasCod) == 0 ) )
         {
            brkAV914 = false ;
            A14681MRPrId = P0AV98_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV914 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A14719MRPrFasCod)==0) )
         {
            AV61Option = A14719MRPrFasCod ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV914 )
         {
            brkAV914 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADMRPRFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFMRPrFasDsc = AV73SearchTxt ;
      AV27TFMRPrFasDsc_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV99 */
      pr_default.execute(7, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brkAV916 = false ;
         A396EmprCod = P0AV99_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV99_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV99_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV99_A14756MRPrTkn[0] ;
         A14759MRPrFasDsc = P0AV99_A14759MRPrFasDsc[0] ;
         A14753MRPrReg = P0AV99_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV99_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV99_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV99_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV99_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV99_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV99_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV99_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV99_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV99_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV99_A14723MRPrParId[0] ;
         A14719MRPrFasCod = P0AV99_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV99_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV99_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV99_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV99_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV99_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV99_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV99_A130BarCodPar[0] ;
         A132BarCodReo = P0AV99_A132BarCodReo[0] ;
         A129BarCod = P0AV99_A129BarCod[0] ;
         A14681MRPrId = P0AV99_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P0AV99_A14759MRPrFasDsc[0], A14759MRPrFasDsc) == 0 ) )
         {
            brkAV916 = false ;
            A14681MRPrId = P0AV99_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV916 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A14759MRPrFasDsc)==0) )
         {
            AV61Option = A14759MRPrFasDsc ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV916 )
         {
            brkAV916 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADMRPRPARDSCOPTIONS' Routine */
      returnInSub = false ;
      AV48TFMRPrParDsc = AV73SearchTxt ;
      AV49TFMRPrParDsc_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV910 */
      pr_default.execute(8, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brkAV918 = false ;
         A396EmprCod = P0AV910_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV910_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV910_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV910_A14756MRPrTkn[0] ;
         A14758MRPrParDsc = P0AV910_A14758MRPrParDsc[0] ;
         A14753MRPrReg = P0AV910_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV910_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV910_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV910_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV910_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV910_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV910_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV910_A14757MRPrPLC[0] ;
         A14750MRPrParCod = P0AV910_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV910_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV910_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV910_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV910_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV910_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV910_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV910_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV910_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV910_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV910_A130BarCodPar[0] ;
         A132BarCodReo = P0AV910_A132BarCodReo[0] ;
         A129BarCod = P0AV910_A129BarCod[0] ;
         A14681MRPrId = P0AV910_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P0AV910_A14758MRPrParDsc[0], A14758MRPrParDsc) == 0 ) )
         {
            brkAV918 = false ;
            A14681MRPrId = P0AV910_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV918 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A14758MRPrParDsc)==0) )
         {
            AV61Option = A14758MRPrParDsc ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV918 )
         {
            brkAV918 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADMRPRPLCOPTIONS' Routine */
      returnInSub = false ;
      AV44TFMRPrPLC = AV73SearchTxt ;
      AV45TFMRPrPLC_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV911 */
      pr_default.execute(9, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brkAV920 = false ;
         A396EmprCod = P0AV911_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV911_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV911_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV911_A14756MRPrTkn[0] ;
         A14757MRPrPLC = P0AV911_A14757MRPrPLC[0] ;
         A14753MRPrReg = P0AV911_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV911_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV911_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV911_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV911_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV911_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV911_A14682MRPrFec[0] ;
         A14758MRPrParDsc = P0AV911_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV911_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV911_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV911_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV911_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV911_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV911_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV911_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV911_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV911_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV911_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV911_A130BarCodPar[0] ;
         A132BarCodReo = P0AV911_A132BarCodReo[0] ;
         A129BarCod = P0AV911_A129BarCod[0] ;
         A14681MRPrId = P0AV911_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P0AV911_A14757MRPrPLC[0], A14757MRPrPLC) == 0 ) )
         {
            brkAV920 = false ;
            A14681MRPrId = P0AV911_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV920 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A14757MRPrPLC)==0) )
         {
            AV61Option = A14757MRPrPLC ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV920 )
         {
            brkAV920 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADMRPRVALMINOPTIONS' Routine */
      returnInSub = false ;
      AV40TFMRPrValMin = AV73SearchTxt ;
      AV41TFMRPrValMin_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV912 */
      pr_default.execute(10, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(10) != 101) )
      {
         brkAV922 = false ;
         A396EmprCod = P0AV912_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV912_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV912_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV912_A14756MRPrTkn[0] ;
         A14764MRPrValMin = P0AV912_A14764MRPrValMin[0] ;
         A14753MRPrReg = P0AV912_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV912_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV912_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV912_A14765MRPrValMax[0] ;
         A14721MRPrVal = P0AV912_A14721MRPrVal[0] ;
         A14682MRPrFec = P0AV912_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV912_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV912_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV912_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV912_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV912_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV912_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV912_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV912_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV912_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV912_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV912_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV912_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV912_A130BarCodPar[0] ;
         A132BarCodReo = P0AV912_A132BarCodReo[0] ;
         A129BarCod = P0AV912_A129BarCod[0] ;
         A14681MRPrId = P0AV912_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(P0AV912_A14764MRPrValMin[0], A14764MRPrValMin) == 0 ) )
         {
            brkAV922 = false ;
            A14681MRPrId = P0AV912_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV922 = true ;
            pr_default.readNext(10);
         }
         if ( ! (GXutil.strcmp("", A14764MRPrValMin)==0) )
         {
            AV61Option = A14764MRPrValMin ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV922 )
         {
            brkAV922 = true ;
            pr_default.readNext(10);
         }
      }
      pr_default.close(10);
   }

   public void S231( )
   {
      /* 'LOADMRPRVALOPTIONS' Routine */
      returnInSub = false ;
      AV38TFMRPrVal = AV73SearchTxt ;
      AV39TFMRPrVal_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV913 */
      pr_default.execute(11, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(11) != 101) )
      {
         brkAV924 = false ;
         A396EmprCod = P0AV913_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV913_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV913_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV913_A14756MRPrTkn[0] ;
         A14721MRPrVal = P0AV913_A14721MRPrVal[0] ;
         A14753MRPrReg = P0AV913_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV913_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV913_A14722MRPrEr[0] ;
         A14765MRPrValMax = P0AV913_A14765MRPrValMax[0] ;
         A14764MRPrValMin = P0AV913_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV913_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV913_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV913_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV913_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV913_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV913_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV913_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV913_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV913_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV913_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV913_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV913_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV913_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV913_A130BarCodPar[0] ;
         A132BarCodReo = P0AV913_A132BarCodReo[0] ;
         A129BarCod = P0AV913_A129BarCod[0] ;
         A14681MRPrId = P0AV913_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(P0AV913_A14721MRPrVal[0], A14721MRPrVal) == 0 ) )
         {
            brkAV924 = false ;
            A14681MRPrId = P0AV913_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV924 = true ;
            pr_default.readNext(11);
         }
         if ( ! (GXutil.strcmp("", A14721MRPrVal)==0) )
         {
            AV61Option = A14721MRPrVal ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV924 )
         {
            brkAV924 = true ;
            pr_default.readNext(11);
         }
      }
      pr_default.close(11);
   }

   public void S241( )
   {
      /* 'LOADMRPRVALMAXOPTIONS' Routine */
      returnInSub = false ;
      AV42TFMRPrValMax = AV73SearchTxt ;
      AV43TFMRPrValMax_Sel = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = AV78FilterFullText ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = AV12TFEmprCod ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = AV13TFEmprCod_Sel ;
      AV105Ingenieria_mrec_analisishdrds_4_tfbarcod = AV14TFBarCod ;
      AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to = AV15TFBarCod_To ;
      AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo = AV16TFBarCodReo ;
      AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to = AV17TFBarCodReo_To ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = AV18TFBarCodPar ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = AV19TFBarCodPar_Sel ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = AV32TFMRPrHdr ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = AV33TFMRPrHdr_Sel ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = AV34TFMRPrHdr2 ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = AV35TFMRPrHdr2_Sel ;
      AV115Ingenieria_mrec_analisishdrds_14_tfmrprord = AV20TFMRPrOrd ;
      AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to = AV21TFMRPrOrd_To ;
      AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin = AV22TFMRPrLin ;
      AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to = AV23TFMRPrLin_To ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = AV28TFMRPrMaqCod ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = AV29TFMRPrMaqCod_Sel ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = AV30TFMRPrMaqDsc ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = AV31TFMRPrMaqDsc_Sel ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = AV24TFMRPrFasCod ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = AV25TFMRPrFasCod_Sel ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = AV26TFMRPrFasDsc ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = AV27TFMRPrFasDsc_Sel ;
      AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid = AV50TFMRPrParId ;
      AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to = AV51TFMRPrParId_To ;
      AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod = AV46TFMRPrParCod ;
      AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to = AV47TFMRPrParCod_To ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = AV48TFMRPrParDsc ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = AV49TFMRPrParDsc_Sel ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = AV44TFMRPrPLC ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = AV45TFMRPrPLC_Sel ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = AV37TFMRPrFec ;
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = AV40TFMRPrValMin ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = AV41TFMRPrValMin_Sel ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = AV38TFMRPrVal ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = AV39TFMRPrVal_Sel ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = AV42TFMRPrValMax ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = AV43TFMRPrValMax_Sel ;
      AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel = AV36TFMRPrEr_Sel ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = AV52TFMRPrFecEv ;
      pr_default.dynParam(12, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV91MaqCod ,
                                           A14719MRPrFasCod ,
                                           AV92FasCod ,
                                           A14755MRPrHdr ,
                                           AV93Hdr ,
                                           AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) ,
                                           Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) ,
                                           AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) ,
                                           Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) ,
                                           Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) ,
                                           Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) ,
                                           AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) ,
                                           Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) ,
                                           Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) ,
                                           Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) ,
                                           AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           Byte.valueOf(AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel) ,
                                           AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           Integer.valueOf(AV91MaqCod.size()) ,
                                           Integer.valueOf(AV92FasCod.size()) ,
                                           Integer.valueOf(AV93Hdr.size()) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14761MRPrOrd) ,
                                           Long.valueOf(A14762MRPrLin) ,
                                           A14760MRPrMaqDsc ,
                                           A14759MRPrFasDsc ,
                                           Long.valueOf(A14723MRPrParId) ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           A14758MRPrParDsc ,
                                           A14757MRPrPLC ,
                                           A14764MRPrValMin ,
                                           A14721MRPrVal ,
                                           A14765MRPrValMax ,
                                           A14682MRPrFec ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14763MRPrFecEv ,
                                           AV85Desde ,
                                           AV86Hasta ,
                                           A14753MRPrReg ,
                                           AV89Now ,
                                           AV79EmprCod ,
                                           A14751MRPrUsu ,
                                           AV87UsurCod ,
                                           A14752MRPrIp ,
                                           AV88Ip ,
                                           A14756MRPrTkn ,
                                           AV90MTkn } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Ingenieria_mrec_analisishdrds_1_filterfulltext), "%", "") ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV103Ingenieria_mrec_analisishdrds_2_tfemprcod), 3, "%") ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar), 1, "%") ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = GXutil.padr( GXutil.rtrim( AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr), 10, "%") ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = GXutil.concat( GXutil.rtrim( AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2), "%", "") ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = GXutil.padr( GXutil.rtrim( AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod), 6, "%") ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = GXutil.concat( GXutil.rtrim( AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc), "%", "") ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = GXutil.padr( GXutil.rtrim( AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod), 8, "%") ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = GXutil.concat( GXutil.rtrim( AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc), "%", "") ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = GXutil.concat( GXutil.rtrim( AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc), "%", "") ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = GXutil.concat( GXutil.rtrim( AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc), "%", "") ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = GXutil.padr( GXutil.rtrim( AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin), 12, "%") ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = GXutil.padr( GXutil.rtrim( AV138Ingenieria_mrec_analisishdrds_37_tfmrprval), 12, "%") ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = GXutil.padr( GXutil.rtrim( AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax), 12, "%") ;
      /* Using cursor P0AV914 */
      pr_default.execute(12, new Object[] {AV85Desde, AV86Hasta, AV89Now, AV79EmprCod, AV87UsurCod, AV88Ip, AV90MTkn, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV102Ingenieria_mrec_analisishdrds_1_filterfulltext, lV103Ingenieria_mrec_analisishdrds_2_tfemprcod, AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel, Integer.valueOf(AV105Ingenieria_mrec_analisishdrds_4_tfbarcod), Integer.valueOf(AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to), Byte.valueOf(AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo), Byte.valueOf(AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to), lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar, AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel, lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr, AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel, lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2, AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel, Short.valueOf(AV115Ingenieria_mrec_analisishdrds_14_tfmrprord), Short.valueOf(AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to), Long.valueOf(AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin), Long.valueOf(AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to), lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod, AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel, lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc, AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel, lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod, AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel, lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc, AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel, Long.valueOf(AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid), Long.valueOf(AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to), Short.valueOf(AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod), Short.valueOf(AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to), lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc, AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel, lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc, AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel, AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec, lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin, AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel, lV138Ingenieria_mrec_analisishdrds_37_tfmrprval, AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel, lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax, AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel, AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev});
      while ( (pr_default.getStatus(12) != 101) )
      {
         brkAV926 = false ;
         A396EmprCod = P0AV914_A396EmprCod[0] ;
         A14751MRPrUsu = P0AV914_A14751MRPrUsu[0] ;
         A14752MRPrIp = P0AV914_A14752MRPrIp[0] ;
         A14756MRPrTkn = P0AV914_A14756MRPrTkn[0] ;
         A14765MRPrValMax = P0AV914_A14765MRPrValMax[0] ;
         A14753MRPrReg = P0AV914_A14753MRPrReg[0] ;
         A14763MRPrFecEv = P0AV914_A14763MRPrFecEv[0] ;
         A14722MRPrEr = P0AV914_A14722MRPrEr[0] ;
         A14721MRPrVal = P0AV914_A14721MRPrVal[0] ;
         A14764MRPrValMin = P0AV914_A14764MRPrValMin[0] ;
         A14682MRPrFec = P0AV914_A14682MRPrFec[0] ;
         A14757MRPrPLC = P0AV914_A14757MRPrPLC[0] ;
         A14758MRPrParDsc = P0AV914_A14758MRPrParDsc[0] ;
         A14750MRPrParCod = P0AV914_A14750MRPrParCod[0] ;
         A14723MRPrParId = P0AV914_A14723MRPrParId[0] ;
         A14759MRPrFasDsc = P0AV914_A14759MRPrFasDsc[0] ;
         A14719MRPrFasCod = P0AV914_A14719MRPrFasCod[0] ;
         A14760MRPrMaqDsc = P0AV914_A14760MRPrMaqDsc[0] ;
         A14720MRPrMaqCod = P0AV914_A14720MRPrMaqCod[0] ;
         A14762MRPrLin = P0AV914_A14762MRPrLin[0] ;
         A14761MRPrOrd = P0AV914_A14761MRPrOrd[0] ;
         A14754MRPrHdr2 = P0AV914_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P0AV914_A14755MRPrHdr[0] ;
         A130BarCodPar = P0AV914_A130BarCodPar[0] ;
         A132BarCodReo = P0AV914_A132BarCodReo[0] ;
         A129BarCod = P0AV914_A129BarCod[0] ;
         A14681MRPrId = P0AV914_A14681MRPrId[0] ;
         AV66count = 0 ;
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(P0AV914_A14765MRPrValMax[0], A14765MRPrValMax) == 0 ) )
         {
            brkAV926 = false ;
            A14681MRPrId = P0AV914_A14681MRPrId[0] ;
            AV66count = (long)(AV66count+1) ;
            brkAV926 = true ;
            pr_default.readNext(12);
         }
         if ( ! (GXutil.strcmp("", A14765MRPrValMax)==0) )
         {
            AV61Option = A14765MRPrValMax ;
            AV62Options.add(AV61Option, 0);
            AV65OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV66count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV62Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAV926 )
         {
            brkAV926 = true ;
            pr_default.readNext(12);
         }
      }
      pr_default.close(12);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mrec_analisishdrgetfilterdata.this.AV75OptionsJson;
      this.aP4[0] = mrec_analisishdrgetfilterdata.this.AV76OptionsDescJson;
      this.aP5[0] = mrec_analisishdrgetfilterdata.this.AV77OptionIndexesJson;
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
      AV78FilterFullText = "" ;
      AV12TFEmprCod = "" ;
      AV13TFEmprCod_Sel = "" ;
      AV18TFBarCodPar = "" ;
      AV19TFBarCodPar_Sel = "" ;
      AV32TFMRPrHdr = "" ;
      AV33TFMRPrHdr_Sel = "" ;
      AV34TFMRPrHdr2 = "" ;
      AV35TFMRPrHdr2_Sel = "" ;
      AV28TFMRPrMaqCod = "" ;
      AV29TFMRPrMaqCod_Sel = "" ;
      AV30TFMRPrMaqDsc = "" ;
      AV31TFMRPrMaqDsc_Sel = "" ;
      AV24TFMRPrFasCod = "" ;
      AV25TFMRPrFasCod_Sel = "" ;
      AV26TFMRPrFasDsc = "" ;
      AV27TFMRPrFasDsc_Sel = "" ;
      AV48TFMRPrParDsc = "" ;
      AV49TFMRPrParDsc_Sel = "" ;
      AV44TFMRPrPLC = "" ;
      AV45TFMRPrPLC_Sel = "" ;
      AV37TFMRPrFec = GXutil.resetTime( GXutil.nullDate() );
      AV40TFMRPrValMin = "" ;
      AV41TFMRPrValMin_Sel = "" ;
      AV38TFMRPrVal = "" ;
      AV39TFMRPrVal_Sel = "" ;
      AV42TFMRPrValMax = "" ;
      AV43TFMRPrValMax_Sel = "" ;
      AV52TFMRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      AV94inEmprCod = "" ;
      AV80MaqCodJSON = "" ;
      AV81FasCodJSON = "" ;
      AV82HdrJSON = "" ;
      AV85Desde = GXutil.resetTime( GXutil.nullDate() );
      AV86Hasta = GXutil.resetTime( GXutil.nullDate() );
      AV95inUsurCod = "" ;
      AV88Ip = "" ;
      AV89Now = GXutil.resetTime( GXutil.nullDate() );
      AV90MTkn = "" ;
      A396EmprCod = "" ;
      AV102Ingenieria_mrec_analisishdrds_1_filterfulltext = "" ;
      AV103Ingenieria_mrec_analisishdrds_2_tfemprcod = "" ;
      AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel = "" ;
      AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = "" ;
      AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel = "" ;
      AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = "" ;
      AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel = "" ;
      AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = "" ;
      AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel = "" ;
      AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = "" ;
      AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel = "" ;
      AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = "" ;
      AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel = "" ;
      AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = "" ;
      AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel = "" ;
      AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = "" ;
      AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel = "" ;
      AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = "" ;
      AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel = "" ;
      AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = "" ;
      AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel = "" ;
      AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec = GXutil.resetTime( GXutil.nullDate() );
      AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = "" ;
      AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel = "" ;
      AV138Ingenieria_mrec_analisishdrds_37_tfmrprval = "" ;
      AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel = "" ;
      AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = "" ;
      AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel = "" ;
      AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev = GXutil.resetTime( GXutil.nullDate() );
      AV91MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV92FasCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV93Hdr = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV102Ingenieria_mrec_analisishdrds_1_filterfulltext = "" ;
      lV103Ingenieria_mrec_analisishdrds_2_tfemprcod = "" ;
      lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar = "" ;
      lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr = "" ;
      lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 = "" ;
      lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod = "" ;
      lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc = "" ;
      lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod = "" ;
      lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc = "" ;
      lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc = "" ;
      lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc = "" ;
      lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin = "" ;
      lV138Ingenieria_mrec_analisishdrds_37_tfmrprval = "" ;
      lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax = "" ;
      A14720MRPrMaqCod = "" ;
      A14719MRPrFasCod = "" ;
      A14755MRPrHdr = "" ;
      A130BarCodPar = "" ;
      A14754MRPrHdr2 = "" ;
      A14760MRPrMaqDsc = "" ;
      A14759MRPrFasDsc = "" ;
      A14758MRPrParDsc = "" ;
      A14757MRPrPLC = "" ;
      A14764MRPrValMin = "" ;
      A14721MRPrVal = "" ;
      A14765MRPrValMax = "" ;
      A14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      A14763MRPrFecEv = GXutil.resetTime( GXutil.nullDate() );
      A14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      A14751MRPrUsu = "" ;
      AV87UsurCod = "" ;
      A14752MRPrIp = "" ;
      A14756MRPrTkn = "" ;
      AV79EmprCod = "" ;
      P0AV92_A396EmprCod = new String[] {""} ;
      P0AV92_A14756MRPrTkn = new String[] {""} ;
      P0AV92_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV92_A14752MRPrIp = new String[] {""} ;
      P0AV92_A14751MRPrUsu = new String[] {""} ;
      P0AV92_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV92_A14722MRPrEr = new boolean[] {false} ;
      P0AV92_A14765MRPrValMax = new String[] {""} ;
      P0AV92_A14721MRPrVal = new String[] {""} ;
      P0AV92_A14764MRPrValMin = new String[] {""} ;
      P0AV92_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV92_A14757MRPrPLC = new String[] {""} ;
      P0AV92_A14758MRPrParDsc = new String[] {""} ;
      P0AV92_A14750MRPrParCod = new short[1] ;
      P0AV92_A14723MRPrParId = new long[1] ;
      P0AV92_A14759MRPrFasDsc = new String[] {""} ;
      P0AV92_A14719MRPrFasCod = new String[] {""} ;
      P0AV92_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV92_A14720MRPrMaqCod = new String[] {""} ;
      P0AV92_A14762MRPrLin = new long[1] ;
      P0AV92_A14761MRPrOrd = new short[1] ;
      P0AV92_A14754MRPrHdr2 = new String[] {""} ;
      P0AV92_A14755MRPrHdr = new String[] {""} ;
      P0AV92_A130BarCodPar = new String[] {""} ;
      P0AV92_A132BarCodReo = new byte[1] ;
      P0AV92_A129BarCod = new int[1] ;
      P0AV92_A14681MRPrId = new long[1] ;
      AV61Option = "" ;
      AV63OptionDesc = "" ;
      P0AV93_A396EmprCod = new String[] {""} ;
      P0AV93_A14751MRPrUsu = new String[] {""} ;
      P0AV93_A14752MRPrIp = new String[] {""} ;
      P0AV93_A14756MRPrTkn = new String[] {""} ;
      P0AV93_A130BarCodPar = new String[] {""} ;
      P0AV93_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV93_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV93_A14722MRPrEr = new boolean[] {false} ;
      P0AV93_A14765MRPrValMax = new String[] {""} ;
      P0AV93_A14721MRPrVal = new String[] {""} ;
      P0AV93_A14764MRPrValMin = new String[] {""} ;
      P0AV93_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV93_A14757MRPrPLC = new String[] {""} ;
      P0AV93_A14758MRPrParDsc = new String[] {""} ;
      P0AV93_A14750MRPrParCod = new short[1] ;
      P0AV93_A14723MRPrParId = new long[1] ;
      P0AV93_A14759MRPrFasDsc = new String[] {""} ;
      P0AV93_A14719MRPrFasCod = new String[] {""} ;
      P0AV93_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV93_A14720MRPrMaqCod = new String[] {""} ;
      P0AV93_A14762MRPrLin = new long[1] ;
      P0AV93_A14761MRPrOrd = new short[1] ;
      P0AV93_A14754MRPrHdr2 = new String[] {""} ;
      P0AV93_A14755MRPrHdr = new String[] {""} ;
      P0AV93_A132BarCodReo = new byte[1] ;
      P0AV93_A129BarCod = new int[1] ;
      P0AV93_A14681MRPrId = new long[1] ;
      P0AV94_A396EmprCod = new String[] {""} ;
      P0AV94_A14751MRPrUsu = new String[] {""} ;
      P0AV94_A14752MRPrIp = new String[] {""} ;
      P0AV94_A14756MRPrTkn = new String[] {""} ;
      P0AV94_A14755MRPrHdr = new String[] {""} ;
      P0AV94_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV94_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV94_A14722MRPrEr = new boolean[] {false} ;
      P0AV94_A14765MRPrValMax = new String[] {""} ;
      P0AV94_A14721MRPrVal = new String[] {""} ;
      P0AV94_A14764MRPrValMin = new String[] {""} ;
      P0AV94_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV94_A14757MRPrPLC = new String[] {""} ;
      P0AV94_A14758MRPrParDsc = new String[] {""} ;
      P0AV94_A14750MRPrParCod = new short[1] ;
      P0AV94_A14723MRPrParId = new long[1] ;
      P0AV94_A14759MRPrFasDsc = new String[] {""} ;
      P0AV94_A14719MRPrFasCod = new String[] {""} ;
      P0AV94_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV94_A14720MRPrMaqCod = new String[] {""} ;
      P0AV94_A14762MRPrLin = new long[1] ;
      P0AV94_A14761MRPrOrd = new short[1] ;
      P0AV94_A14754MRPrHdr2 = new String[] {""} ;
      P0AV94_A130BarCodPar = new String[] {""} ;
      P0AV94_A132BarCodReo = new byte[1] ;
      P0AV94_A129BarCod = new int[1] ;
      P0AV94_A14681MRPrId = new long[1] ;
      P0AV95_A396EmprCod = new String[] {""} ;
      P0AV95_A14751MRPrUsu = new String[] {""} ;
      P0AV95_A14752MRPrIp = new String[] {""} ;
      P0AV95_A14756MRPrTkn = new String[] {""} ;
      P0AV95_A14754MRPrHdr2 = new String[] {""} ;
      P0AV95_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV95_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV95_A14722MRPrEr = new boolean[] {false} ;
      P0AV95_A14765MRPrValMax = new String[] {""} ;
      P0AV95_A14721MRPrVal = new String[] {""} ;
      P0AV95_A14764MRPrValMin = new String[] {""} ;
      P0AV95_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV95_A14757MRPrPLC = new String[] {""} ;
      P0AV95_A14758MRPrParDsc = new String[] {""} ;
      P0AV95_A14750MRPrParCod = new short[1] ;
      P0AV95_A14723MRPrParId = new long[1] ;
      P0AV95_A14759MRPrFasDsc = new String[] {""} ;
      P0AV95_A14719MRPrFasCod = new String[] {""} ;
      P0AV95_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV95_A14720MRPrMaqCod = new String[] {""} ;
      P0AV95_A14762MRPrLin = new long[1] ;
      P0AV95_A14761MRPrOrd = new short[1] ;
      P0AV95_A14755MRPrHdr = new String[] {""} ;
      P0AV95_A130BarCodPar = new String[] {""} ;
      P0AV95_A132BarCodReo = new byte[1] ;
      P0AV95_A129BarCod = new int[1] ;
      P0AV95_A14681MRPrId = new long[1] ;
      P0AV96_A396EmprCod = new String[] {""} ;
      P0AV96_A14751MRPrUsu = new String[] {""} ;
      P0AV96_A14752MRPrIp = new String[] {""} ;
      P0AV96_A14756MRPrTkn = new String[] {""} ;
      P0AV96_A14720MRPrMaqCod = new String[] {""} ;
      P0AV96_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV96_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV96_A14722MRPrEr = new boolean[] {false} ;
      P0AV96_A14765MRPrValMax = new String[] {""} ;
      P0AV96_A14721MRPrVal = new String[] {""} ;
      P0AV96_A14764MRPrValMin = new String[] {""} ;
      P0AV96_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV96_A14757MRPrPLC = new String[] {""} ;
      P0AV96_A14758MRPrParDsc = new String[] {""} ;
      P0AV96_A14750MRPrParCod = new short[1] ;
      P0AV96_A14723MRPrParId = new long[1] ;
      P0AV96_A14759MRPrFasDsc = new String[] {""} ;
      P0AV96_A14719MRPrFasCod = new String[] {""} ;
      P0AV96_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV96_A14762MRPrLin = new long[1] ;
      P0AV96_A14761MRPrOrd = new short[1] ;
      P0AV96_A14754MRPrHdr2 = new String[] {""} ;
      P0AV96_A14755MRPrHdr = new String[] {""} ;
      P0AV96_A130BarCodPar = new String[] {""} ;
      P0AV96_A132BarCodReo = new byte[1] ;
      P0AV96_A129BarCod = new int[1] ;
      P0AV96_A14681MRPrId = new long[1] ;
      P0AV97_A396EmprCod = new String[] {""} ;
      P0AV97_A14751MRPrUsu = new String[] {""} ;
      P0AV97_A14752MRPrIp = new String[] {""} ;
      P0AV97_A14756MRPrTkn = new String[] {""} ;
      P0AV97_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV97_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV97_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV97_A14722MRPrEr = new boolean[] {false} ;
      P0AV97_A14765MRPrValMax = new String[] {""} ;
      P0AV97_A14721MRPrVal = new String[] {""} ;
      P0AV97_A14764MRPrValMin = new String[] {""} ;
      P0AV97_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV97_A14757MRPrPLC = new String[] {""} ;
      P0AV97_A14758MRPrParDsc = new String[] {""} ;
      P0AV97_A14750MRPrParCod = new short[1] ;
      P0AV97_A14723MRPrParId = new long[1] ;
      P0AV97_A14759MRPrFasDsc = new String[] {""} ;
      P0AV97_A14719MRPrFasCod = new String[] {""} ;
      P0AV97_A14720MRPrMaqCod = new String[] {""} ;
      P0AV97_A14762MRPrLin = new long[1] ;
      P0AV97_A14761MRPrOrd = new short[1] ;
      P0AV97_A14754MRPrHdr2 = new String[] {""} ;
      P0AV97_A14755MRPrHdr = new String[] {""} ;
      P0AV97_A130BarCodPar = new String[] {""} ;
      P0AV97_A132BarCodReo = new byte[1] ;
      P0AV97_A129BarCod = new int[1] ;
      P0AV97_A14681MRPrId = new long[1] ;
      P0AV98_A396EmprCod = new String[] {""} ;
      P0AV98_A14751MRPrUsu = new String[] {""} ;
      P0AV98_A14752MRPrIp = new String[] {""} ;
      P0AV98_A14756MRPrTkn = new String[] {""} ;
      P0AV98_A14719MRPrFasCod = new String[] {""} ;
      P0AV98_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV98_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV98_A14722MRPrEr = new boolean[] {false} ;
      P0AV98_A14765MRPrValMax = new String[] {""} ;
      P0AV98_A14721MRPrVal = new String[] {""} ;
      P0AV98_A14764MRPrValMin = new String[] {""} ;
      P0AV98_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV98_A14757MRPrPLC = new String[] {""} ;
      P0AV98_A14758MRPrParDsc = new String[] {""} ;
      P0AV98_A14750MRPrParCod = new short[1] ;
      P0AV98_A14723MRPrParId = new long[1] ;
      P0AV98_A14759MRPrFasDsc = new String[] {""} ;
      P0AV98_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV98_A14720MRPrMaqCod = new String[] {""} ;
      P0AV98_A14762MRPrLin = new long[1] ;
      P0AV98_A14761MRPrOrd = new short[1] ;
      P0AV98_A14754MRPrHdr2 = new String[] {""} ;
      P0AV98_A14755MRPrHdr = new String[] {""} ;
      P0AV98_A130BarCodPar = new String[] {""} ;
      P0AV98_A132BarCodReo = new byte[1] ;
      P0AV98_A129BarCod = new int[1] ;
      P0AV98_A14681MRPrId = new long[1] ;
      P0AV99_A396EmprCod = new String[] {""} ;
      P0AV99_A14751MRPrUsu = new String[] {""} ;
      P0AV99_A14752MRPrIp = new String[] {""} ;
      P0AV99_A14756MRPrTkn = new String[] {""} ;
      P0AV99_A14759MRPrFasDsc = new String[] {""} ;
      P0AV99_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV99_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV99_A14722MRPrEr = new boolean[] {false} ;
      P0AV99_A14765MRPrValMax = new String[] {""} ;
      P0AV99_A14721MRPrVal = new String[] {""} ;
      P0AV99_A14764MRPrValMin = new String[] {""} ;
      P0AV99_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV99_A14757MRPrPLC = new String[] {""} ;
      P0AV99_A14758MRPrParDsc = new String[] {""} ;
      P0AV99_A14750MRPrParCod = new short[1] ;
      P0AV99_A14723MRPrParId = new long[1] ;
      P0AV99_A14719MRPrFasCod = new String[] {""} ;
      P0AV99_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV99_A14720MRPrMaqCod = new String[] {""} ;
      P0AV99_A14762MRPrLin = new long[1] ;
      P0AV99_A14761MRPrOrd = new short[1] ;
      P0AV99_A14754MRPrHdr2 = new String[] {""} ;
      P0AV99_A14755MRPrHdr = new String[] {""} ;
      P0AV99_A130BarCodPar = new String[] {""} ;
      P0AV99_A132BarCodReo = new byte[1] ;
      P0AV99_A129BarCod = new int[1] ;
      P0AV99_A14681MRPrId = new long[1] ;
      P0AV910_A396EmprCod = new String[] {""} ;
      P0AV910_A14751MRPrUsu = new String[] {""} ;
      P0AV910_A14752MRPrIp = new String[] {""} ;
      P0AV910_A14756MRPrTkn = new String[] {""} ;
      P0AV910_A14758MRPrParDsc = new String[] {""} ;
      P0AV910_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV910_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV910_A14722MRPrEr = new boolean[] {false} ;
      P0AV910_A14765MRPrValMax = new String[] {""} ;
      P0AV910_A14721MRPrVal = new String[] {""} ;
      P0AV910_A14764MRPrValMin = new String[] {""} ;
      P0AV910_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV910_A14757MRPrPLC = new String[] {""} ;
      P0AV910_A14750MRPrParCod = new short[1] ;
      P0AV910_A14723MRPrParId = new long[1] ;
      P0AV910_A14759MRPrFasDsc = new String[] {""} ;
      P0AV910_A14719MRPrFasCod = new String[] {""} ;
      P0AV910_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV910_A14720MRPrMaqCod = new String[] {""} ;
      P0AV910_A14762MRPrLin = new long[1] ;
      P0AV910_A14761MRPrOrd = new short[1] ;
      P0AV910_A14754MRPrHdr2 = new String[] {""} ;
      P0AV910_A14755MRPrHdr = new String[] {""} ;
      P0AV910_A130BarCodPar = new String[] {""} ;
      P0AV910_A132BarCodReo = new byte[1] ;
      P0AV910_A129BarCod = new int[1] ;
      P0AV910_A14681MRPrId = new long[1] ;
      P0AV911_A396EmprCod = new String[] {""} ;
      P0AV911_A14751MRPrUsu = new String[] {""} ;
      P0AV911_A14752MRPrIp = new String[] {""} ;
      P0AV911_A14756MRPrTkn = new String[] {""} ;
      P0AV911_A14757MRPrPLC = new String[] {""} ;
      P0AV911_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV911_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV911_A14722MRPrEr = new boolean[] {false} ;
      P0AV911_A14765MRPrValMax = new String[] {""} ;
      P0AV911_A14721MRPrVal = new String[] {""} ;
      P0AV911_A14764MRPrValMin = new String[] {""} ;
      P0AV911_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV911_A14758MRPrParDsc = new String[] {""} ;
      P0AV911_A14750MRPrParCod = new short[1] ;
      P0AV911_A14723MRPrParId = new long[1] ;
      P0AV911_A14759MRPrFasDsc = new String[] {""} ;
      P0AV911_A14719MRPrFasCod = new String[] {""} ;
      P0AV911_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV911_A14720MRPrMaqCod = new String[] {""} ;
      P0AV911_A14762MRPrLin = new long[1] ;
      P0AV911_A14761MRPrOrd = new short[1] ;
      P0AV911_A14754MRPrHdr2 = new String[] {""} ;
      P0AV911_A14755MRPrHdr = new String[] {""} ;
      P0AV911_A130BarCodPar = new String[] {""} ;
      P0AV911_A132BarCodReo = new byte[1] ;
      P0AV911_A129BarCod = new int[1] ;
      P0AV911_A14681MRPrId = new long[1] ;
      P0AV912_A396EmprCod = new String[] {""} ;
      P0AV912_A14751MRPrUsu = new String[] {""} ;
      P0AV912_A14752MRPrIp = new String[] {""} ;
      P0AV912_A14756MRPrTkn = new String[] {""} ;
      P0AV912_A14764MRPrValMin = new String[] {""} ;
      P0AV912_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV912_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV912_A14722MRPrEr = new boolean[] {false} ;
      P0AV912_A14765MRPrValMax = new String[] {""} ;
      P0AV912_A14721MRPrVal = new String[] {""} ;
      P0AV912_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV912_A14757MRPrPLC = new String[] {""} ;
      P0AV912_A14758MRPrParDsc = new String[] {""} ;
      P0AV912_A14750MRPrParCod = new short[1] ;
      P0AV912_A14723MRPrParId = new long[1] ;
      P0AV912_A14759MRPrFasDsc = new String[] {""} ;
      P0AV912_A14719MRPrFasCod = new String[] {""} ;
      P0AV912_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV912_A14720MRPrMaqCod = new String[] {""} ;
      P0AV912_A14762MRPrLin = new long[1] ;
      P0AV912_A14761MRPrOrd = new short[1] ;
      P0AV912_A14754MRPrHdr2 = new String[] {""} ;
      P0AV912_A14755MRPrHdr = new String[] {""} ;
      P0AV912_A130BarCodPar = new String[] {""} ;
      P0AV912_A132BarCodReo = new byte[1] ;
      P0AV912_A129BarCod = new int[1] ;
      P0AV912_A14681MRPrId = new long[1] ;
      P0AV913_A396EmprCod = new String[] {""} ;
      P0AV913_A14751MRPrUsu = new String[] {""} ;
      P0AV913_A14752MRPrIp = new String[] {""} ;
      P0AV913_A14756MRPrTkn = new String[] {""} ;
      P0AV913_A14721MRPrVal = new String[] {""} ;
      P0AV913_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV913_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV913_A14722MRPrEr = new boolean[] {false} ;
      P0AV913_A14765MRPrValMax = new String[] {""} ;
      P0AV913_A14764MRPrValMin = new String[] {""} ;
      P0AV913_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV913_A14757MRPrPLC = new String[] {""} ;
      P0AV913_A14758MRPrParDsc = new String[] {""} ;
      P0AV913_A14750MRPrParCod = new short[1] ;
      P0AV913_A14723MRPrParId = new long[1] ;
      P0AV913_A14759MRPrFasDsc = new String[] {""} ;
      P0AV913_A14719MRPrFasCod = new String[] {""} ;
      P0AV913_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV913_A14720MRPrMaqCod = new String[] {""} ;
      P0AV913_A14762MRPrLin = new long[1] ;
      P0AV913_A14761MRPrOrd = new short[1] ;
      P0AV913_A14754MRPrHdr2 = new String[] {""} ;
      P0AV913_A14755MRPrHdr = new String[] {""} ;
      P0AV913_A130BarCodPar = new String[] {""} ;
      P0AV913_A132BarCodReo = new byte[1] ;
      P0AV913_A129BarCod = new int[1] ;
      P0AV913_A14681MRPrId = new long[1] ;
      P0AV914_A396EmprCod = new String[] {""} ;
      P0AV914_A14751MRPrUsu = new String[] {""} ;
      P0AV914_A14752MRPrIp = new String[] {""} ;
      P0AV914_A14756MRPrTkn = new String[] {""} ;
      P0AV914_A14765MRPrValMax = new String[] {""} ;
      P0AV914_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV914_A14763MRPrFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV914_A14722MRPrEr = new boolean[] {false} ;
      P0AV914_A14721MRPrVal = new String[] {""} ;
      P0AV914_A14764MRPrValMin = new String[] {""} ;
      P0AV914_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AV914_A14757MRPrPLC = new String[] {""} ;
      P0AV914_A14758MRPrParDsc = new String[] {""} ;
      P0AV914_A14750MRPrParCod = new short[1] ;
      P0AV914_A14723MRPrParId = new long[1] ;
      P0AV914_A14759MRPrFasDsc = new String[] {""} ;
      P0AV914_A14719MRPrFasCod = new String[] {""} ;
      P0AV914_A14760MRPrMaqDsc = new String[] {""} ;
      P0AV914_A14720MRPrMaqCod = new String[] {""} ;
      P0AV914_A14762MRPrLin = new long[1] ;
      P0AV914_A14761MRPrOrd = new short[1] ;
      P0AV914_A14754MRPrHdr2 = new String[] {""} ;
      P0AV914_A14755MRPrHdr = new String[] {""} ;
      P0AV914_A130BarCodPar = new String[] {""} ;
      P0AV914_A132BarCodReo = new byte[1] ;
      P0AV914_A129BarCod = new int[1] ;
      P0AV914_A14681MRPrId = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_analisishdrgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AV92_A396EmprCod, P0AV92_A14756MRPrTkn, P0AV92_A14753MRPrReg, P0AV92_A14752MRPrIp, P0AV92_A14751MRPrUsu, P0AV92_A14763MRPrFecEv, P0AV92_A14722MRPrEr, P0AV92_A14765MRPrValMax, P0AV92_A14721MRPrVal, P0AV92_A14764MRPrValMin,
            P0AV92_A14682MRPrFec, P0AV92_A14757MRPrPLC, P0AV92_A14758MRPrParDsc, P0AV92_A14750MRPrParCod, P0AV92_A14723MRPrParId, P0AV92_A14759MRPrFasDsc, P0AV92_A14719MRPrFasCod, P0AV92_A14760MRPrMaqDsc, P0AV92_A14720MRPrMaqCod, P0AV92_A14762MRPrLin,
            P0AV92_A14761MRPrOrd, P0AV92_A14754MRPrHdr2, P0AV92_A14755MRPrHdr, P0AV92_A130BarCodPar, P0AV92_A132BarCodReo, P0AV92_A129BarCod, P0AV92_A14681MRPrId
            }
            , new Object[] {
            P0AV93_A396EmprCod, P0AV93_A14751MRPrUsu, P0AV93_A14752MRPrIp, P0AV93_A14756MRPrTkn, P0AV93_A130BarCodPar, P0AV93_A14753MRPrReg, P0AV93_A14763MRPrFecEv, P0AV93_A14722MRPrEr, P0AV93_A14765MRPrValMax, P0AV93_A14721MRPrVal,
            P0AV93_A14764MRPrValMin, P0AV93_A14682MRPrFec, P0AV93_A14757MRPrPLC, P0AV93_A14758MRPrParDsc, P0AV93_A14750MRPrParCod, P0AV93_A14723MRPrParId, P0AV93_A14759MRPrFasDsc, P0AV93_A14719MRPrFasCod, P0AV93_A14760MRPrMaqDsc, P0AV93_A14720MRPrMaqCod,
            P0AV93_A14762MRPrLin, P0AV93_A14761MRPrOrd, P0AV93_A14754MRPrHdr2, P0AV93_A14755MRPrHdr, P0AV93_A132BarCodReo, P0AV93_A129BarCod, P0AV93_A14681MRPrId
            }
            , new Object[] {
            P0AV94_A396EmprCod, P0AV94_A14751MRPrUsu, P0AV94_A14752MRPrIp, P0AV94_A14756MRPrTkn, P0AV94_A14755MRPrHdr, P0AV94_A14753MRPrReg, P0AV94_A14763MRPrFecEv, P0AV94_A14722MRPrEr, P0AV94_A14765MRPrValMax, P0AV94_A14721MRPrVal,
            P0AV94_A14764MRPrValMin, P0AV94_A14682MRPrFec, P0AV94_A14757MRPrPLC, P0AV94_A14758MRPrParDsc, P0AV94_A14750MRPrParCod, P0AV94_A14723MRPrParId, P0AV94_A14759MRPrFasDsc, P0AV94_A14719MRPrFasCod, P0AV94_A14760MRPrMaqDsc, P0AV94_A14720MRPrMaqCod,
            P0AV94_A14762MRPrLin, P0AV94_A14761MRPrOrd, P0AV94_A14754MRPrHdr2, P0AV94_A130BarCodPar, P0AV94_A132BarCodReo, P0AV94_A129BarCod, P0AV94_A14681MRPrId
            }
            , new Object[] {
            P0AV95_A396EmprCod, P0AV95_A14751MRPrUsu, P0AV95_A14752MRPrIp, P0AV95_A14756MRPrTkn, P0AV95_A14754MRPrHdr2, P0AV95_A14753MRPrReg, P0AV95_A14763MRPrFecEv, P0AV95_A14722MRPrEr, P0AV95_A14765MRPrValMax, P0AV95_A14721MRPrVal,
            P0AV95_A14764MRPrValMin, P0AV95_A14682MRPrFec, P0AV95_A14757MRPrPLC, P0AV95_A14758MRPrParDsc, P0AV95_A14750MRPrParCod, P0AV95_A14723MRPrParId, P0AV95_A14759MRPrFasDsc, P0AV95_A14719MRPrFasCod, P0AV95_A14760MRPrMaqDsc, P0AV95_A14720MRPrMaqCod,
            P0AV95_A14762MRPrLin, P0AV95_A14761MRPrOrd, P0AV95_A14755MRPrHdr, P0AV95_A130BarCodPar, P0AV95_A132BarCodReo, P0AV95_A129BarCod, P0AV95_A14681MRPrId
            }
            , new Object[] {
            P0AV96_A396EmprCod, P0AV96_A14751MRPrUsu, P0AV96_A14752MRPrIp, P0AV96_A14756MRPrTkn, P0AV96_A14720MRPrMaqCod, P0AV96_A14753MRPrReg, P0AV96_A14763MRPrFecEv, P0AV96_A14722MRPrEr, P0AV96_A14765MRPrValMax, P0AV96_A14721MRPrVal,
            P0AV96_A14764MRPrValMin, P0AV96_A14682MRPrFec, P0AV96_A14757MRPrPLC, P0AV96_A14758MRPrParDsc, P0AV96_A14750MRPrParCod, P0AV96_A14723MRPrParId, P0AV96_A14759MRPrFasDsc, P0AV96_A14719MRPrFasCod, P0AV96_A14760MRPrMaqDsc, P0AV96_A14762MRPrLin,
            P0AV96_A14761MRPrOrd, P0AV96_A14754MRPrHdr2, P0AV96_A14755MRPrHdr, P0AV96_A130BarCodPar, P0AV96_A132BarCodReo, P0AV96_A129BarCod, P0AV96_A14681MRPrId
            }
            , new Object[] {
            P0AV97_A396EmprCod, P0AV97_A14751MRPrUsu, P0AV97_A14752MRPrIp, P0AV97_A14756MRPrTkn, P0AV97_A14760MRPrMaqDsc, P0AV97_A14753MRPrReg, P0AV97_A14763MRPrFecEv, P0AV97_A14722MRPrEr, P0AV97_A14765MRPrValMax, P0AV97_A14721MRPrVal,
            P0AV97_A14764MRPrValMin, P0AV97_A14682MRPrFec, P0AV97_A14757MRPrPLC, P0AV97_A14758MRPrParDsc, P0AV97_A14750MRPrParCod, P0AV97_A14723MRPrParId, P0AV97_A14759MRPrFasDsc, P0AV97_A14719MRPrFasCod, P0AV97_A14720MRPrMaqCod, P0AV97_A14762MRPrLin,
            P0AV97_A14761MRPrOrd, P0AV97_A14754MRPrHdr2, P0AV97_A14755MRPrHdr, P0AV97_A130BarCodPar, P0AV97_A132BarCodReo, P0AV97_A129BarCod, P0AV97_A14681MRPrId
            }
            , new Object[] {
            P0AV98_A396EmprCod, P0AV98_A14751MRPrUsu, P0AV98_A14752MRPrIp, P0AV98_A14756MRPrTkn, P0AV98_A14719MRPrFasCod, P0AV98_A14753MRPrReg, P0AV98_A14763MRPrFecEv, P0AV98_A14722MRPrEr, P0AV98_A14765MRPrValMax, P0AV98_A14721MRPrVal,
            P0AV98_A14764MRPrValMin, P0AV98_A14682MRPrFec, P0AV98_A14757MRPrPLC, P0AV98_A14758MRPrParDsc, P0AV98_A14750MRPrParCod, P0AV98_A14723MRPrParId, P0AV98_A14759MRPrFasDsc, P0AV98_A14760MRPrMaqDsc, P0AV98_A14720MRPrMaqCod, P0AV98_A14762MRPrLin,
            P0AV98_A14761MRPrOrd, P0AV98_A14754MRPrHdr2, P0AV98_A14755MRPrHdr, P0AV98_A130BarCodPar, P0AV98_A132BarCodReo, P0AV98_A129BarCod, P0AV98_A14681MRPrId
            }
            , new Object[] {
            P0AV99_A396EmprCod, P0AV99_A14751MRPrUsu, P0AV99_A14752MRPrIp, P0AV99_A14756MRPrTkn, P0AV99_A14759MRPrFasDsc, P0AV99_A14753MRPrReg, P0AV99_A14763MRPrFecEv, P0AV99_A14722MRPrEr, P0AV99_A14765MRPrValMax, P0AV99_A14721MRPrVal,
            P0AV99_A14764MRPrValMin, P0AV99_A14682MRPrFec, P0AV99_A14757MRPrPLC, P0AV99_A14758MRPrParDsc, P0AV99_A14750MRPrParCod, P0AV99_A14723MRPrParId, P0AV99_A14719MRPrFasCod, P0AV99_A14760MRPrMaqDsc, P0AV99_A14720MRPrMaqCod, P0AV99_A14762MRPrLin,
            P0AV99_A14761MRPrOrd, P0AV99_A14754MRPrHdr2, P0AV99_A14755MRPrHdr, P0AV99_A130BarCodPar, P0AV99_A132BarCodReo, P0AV99_A129BarCod, P0AV99_A14681MRPrId
            }
            , new Object[] {
            P0AV910_A396EmprCod, P0AV910_A14751MRPrUsu, P0AV910_A14752MRPrIp, P0AV910_A14756MRPrTkn, P0AV910_A14758MRPrParDsc, P0AV910_A14753MRPrReg, P0AV910_A14763MRPrFecEv, P0AV910_A14722MRPrEr, P0AV910_A14765MRPrValMax, P0AV910_A14721MRPrVal,
            P0AV910_A14764MRPrValMin, P0AV910_A14682MRPrFec, P0AV910_A14757MRPrPLC, P0AV910_A14750MRPrParCod, P0AV910_A14723MRPrParId, P0AV910_A14759MRPrFasDsc, P0AV910_A14719MRPrFasCod, P0AV910_A14760MRPrMaqDsc, P0AV910_A14720MRPrMaqCod, P0AV910_A14762MRPrLin,
            P0AV910_A14761MRPrOrd, P0AV910_A14754MRPrHdr2, P0AV910_A14755MRPrHdr, P0AV910_A130BarCodPar, P0AV910_A132BarCodReo, P0AV910_A129BarCod, P0AV910_A14681MRPrId
            }
            , new Object[] {
            P0AV911_A396EmprCod, P0AV911_A14751MRPrUsu, P0AV911_A14752MRPrIp, P0AV911_A14756MRPrTkn, P0AV911_A14757MRPrPLC, P0AV911_A14753MRPrReg, P0AV911_A14763MRPrFecEv, P0AV911_A14722MRPrEr, P0AV911_A14765MRPrValMax, P0AV911_A14721MRPrVal,
            P0AV911_A14764MRPrValMin, P0AV911_A14682MRPrFec, P0AV911_A14758MRPrParDsc, P0AV911_A14750MRPrParCod, P0AV911_A14723MRPrParId, P0AV911_A14759MRPrFasDsc, P0AV911_A14719MRPrFasCod, P0AV911_A14760MRPrMaqDsc, P0AV911_A14720MRPrMaqCod, P0AV911_A14762MRPrLin,
            P0AV911_A14761MRPrOrd, P0AV911_A14754MRPrHdr2, P0AV911_A14755MRPrHdr, P0AV911_A130BarCodPar, P0AV911_A132BarCodReo, P0AV911_A129BarCod, P0AV911_A14681MRPrId
            }
            , new Object[] {
            P0AV912_A396EmprCod, P0AV912_A14751MRPrUsu, P0AV912_A14752MRPrIp, P0AV912_A14756MRPrTkn, P0AV912_A14764MRPrValMin, P0AV912_A14753MRPrReg, P0AV912_A14763MRPrFecEv, P0AV912_A14722MRPrEr, P0AV912_A14765MRPrValMax, P0AV912_A14721MRPrVal,
            P0AV912_A14682MRPrFec, P0AV912_A14757MRPrPLC, P0AV912_A14758MRPrParDsc, P0AV912_A14750MRPrParCod, P0AV912_A14723MRPrParId, P0AV912_A14759MRPrFasDsc, P0AV912_A14719MRPrFasCod, P0AV912_A14760MRPrMaqDsc, P0AV912_A14720MRPrMaqCod, P0AV912_A14762MRPrLin,
            P0AV912_A14761MRPrOrd, P0AV912_A14754MRPrHdr2, P0AV912_A14755MRPrHdr, P0AV912_A130BarCodPar, P0AV912_A132BarCodReo, P0AV912_A129BarCod, P0AV912_A14681MRPrId
            }
            , new Object[] {
            P0AV913_A396EmprCod, P0AV913_A14751MRPrUsu, P0AV913_A14752MRPrIp, P0AV913_A14756MRPrTkn, P0AV913_A14721MRPrVal, P0AV913_A14753MRPrReg, P0AV913_A14763MRPrFecEv, P0AV913_A14722MRPrEr, P0AV913_A14765MRPrValMax, P0AV913_A14764MRPrValMin,
            P0AV913_A14682MRPrFec, P0AV913_A14757MRPrPLC, P0AV913_A14758MRPrParDsc, P0AV913_A14750MRPrParCod, P0AV913_A14723MRPrParId, P0AV913_A14759MRPrFasDsc, P0AV913_A14719MRPrFasCod, P0AV913_A14760MRPrMaqDsc, P0AV913_A14720MRPrMaqCod, P0AV913_A14762MRPrLin,
            P0AV913_A14761MRPrOrd, P0AV913_A14754MRPrHdr2, P0AV913_A14755MRPrHdr, P0AV913_A130BarCodPar, P0AV913_A132BarCodReo, P0AV913_A129BarCod, P0AV913_A14681MRPrId
            }
            , new Object[] {
            P0AV914_A396EmprCod, P0AV914_A14751MRPrUsu, P0AV914_A14752MRPrIp, P0AV914_A14756MRPrTkn, P0AV914_A14765MRPrValMax, P0AV914_A14753MRPrReg, P0AV914_A14763MRPrFecEv, P0AV914_A14722MRPrEr, P0AV914_A14721MRPrVal, P0AV914_A14764MRPrValMin,
            P0AV914_A14682MRPrFec, P0AV914_A14757MRPrPLC, P0AV914_A14758MRPrParDsc, P0AV914_A14750MRPrParCod, P0AV914_A14723MRPrParId, P0AV914_A14759MRPrFasDsc, P0AV914_A14719MRPrFasCod, P0AV914_A14760MRPrMaqDsc, P0AV914_A14720MRPrMaqCod, P0AV914_A14762MRPrLin,
            P0AV914_A14761MRPrOrd, P0AV914_A14754MRPrHdr2, P0AV914_A14755MRPrHdr, P0AV914_A130BarCodPar, P0AV914_A132BarCodReo, P0AV914_A129BarCod, P0AV914_A14681MRPrId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFBarCodReo ;
   private byte AV17TFBarCodReo_To ;
   private byte AV36TFMRPrEr_Sel ;
   private byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ;
   private byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ;
   private byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ;
   private byte A132BarCodReo ;
   private short AV20TFMRPrOrd ;
   private short AV21TFMRPrOrd_To ;
   private short AV46TFMRPrParCod ;
   private short AV47TFMRPrParCod_To ;
   private short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ;
   private short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ;
   private short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ;
   private short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ;
   private short A14761MRPrOrd ;
   private short A14750MRPrParCod ;
   private short Gx_err ;
   private int AV100GXV1 ;
   private int AV14TFBarCod ;
   private int AV15TFBarCod_To ;
   private int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ;
   private int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ;
   private int AV91MaqCod_size ;
   private int AV92FasCod_size ;
   private int AV93Hdr_size ;
   private int A129BarCod ;
   private long AV22TFMRPrLin ;
   private long AV23TFMRPrLin_To ;
   private long AV50TFMRPrParId ;
   private long AV51TFMRPrParId_To ;
   private long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ;
   private long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ;
   private long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ;
   private long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ;
   private long A14762MRPrLin ;
   private long A14723MRPrParId ;
   private long A14681MRPrId ;
   private long AV66count ;
   private String AV12TFEmprCod ;
   private String AV13TFEmprCod_Sel ;
   private String AV18TFBarCodPar ;
   private String AV19TFBarCodPar_Sel ;
   private String AV32TFMRPrHdr ;
   private String AV33TFMRPrHdr_Sel ;
   private String AV28TFMRPrMaqCod ;
   private String AV29TFMRPrMaqCod_Sel ;
   private String AV24TFMRPrFasCod ;
   private String AV25TFMRPrFasCod_Sel ;
   private String AV40TFMRPrValMin ;
   private String AV41TFMRPrValMin_Sel ;
   private String AV38TFMRPrVal ;
   private String AV39TFMRPrVal_Sel ;
   private String AV42TFMRPrValMax ;
   private String AV43TFMRPrValMax_Sel ;
   private String AV94inEmprCod ;
   private String AV95inUsurCod ;
   private String A396EmprCod ;
   private String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ;
   private String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ;
   private String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ;
   private String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ;
   private String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ;
   private String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ;
   private String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ;
   private String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ;
   private String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ;
   private String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ;
   private String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ;
   private String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ;
   private String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ;
   private String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ;
   private String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ;
   private String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ;
   private String scmdbuf ;
   private String lV103Ingenieria_mrec_analisishdrds_2_tfemprcod ;
   private String lV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ;
   private String lV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ;
   private String lV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ;
   private String lV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ;
   private String lV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ;
   private String lV138Ingenieria_mrec_analisishdrds_37_tfmrprval ;
   private String lV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ;
   private String A14720MRPrMaqCod ;
   private String A14719MRPrFasCod ;
   private String A14755MRPrHdr ;
   private String A130BarCodPar ;
   private String A14764MRPrValMin ;
   private String A14721MRPrVal ;
   private String A14765MRPrValMax ;
   private String A14751MRPrUsu ;
   private String AV87UsurCod ;
   private String AV79EmprCod ;
   private java.util.Date AV37TFMRPrFec ;
   private java.util.Date AV52TFMRPrFecEv ;
   private java.util.Date AV85Desde ;
   private java.util.Date AV86Hasta ;
   private java.util.Date AV89Now ;
   private java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ;
   private java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ;
   private java.util.Date A14682MRPrFec ;
   private java.util.Date A14763MRPrFecEv ;
   private java.util.Date A14753MRPrReg ;
   private boolean returnInSub ;
   private boolean A14722MRPrEr ;
   private boolean brkAV92 ;
   private boolean brkAV94 ;
   private boolean brkAV96 ;
   private boolean brkAV98 ;
   private boolean brkAV910 ;
   private boolean brkAV912 ;
   private boolean brkAV914 ;
   private boolean brkAV916 ;
   private boolean brkAV918 ;
   private boolean brkAV920 ;
   private boolean brkAV922 ;
   private boolean brkAV924 ;
   private boolean brkAV926 ;
   private String AV75OptionsJson ;
   private String AV76OptionsDescJson ;
   private String AV77OptionIndexesJson ;
   private String AV72DDOName ;
   private String AV73SearchTxt ;
   private String AV74SearchTxtTo ;
   private String AV78FilterFullText ;
   private String AV34TFMRPrHdr2 ;
   private String AV35TFMRPrHdr2_Sel ;
   private String AV30TFMRPrMaqDsc ;
   private String AV31TFMRPrMaqDsc_Sel ;
   private String AV26TFMRPrFasDsc ;
   private String AV27TFMRPrFasDsc_Sel ;
   private String AV48TFMRPrParDsc ;
   private String AV49TFMRPrParDsc_Sel ;
   private String AV44TFMRPrPLC ;
   private String AV45TFMRPrPLC_Sel ;
   private String AV80MaqCodJSON ;
   private String AV81FasCodJSON ;
   private String AV82HdrJSON ;
   private String AV88Ip ;
   private String AV90MTkn ;
   private String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ;
   private String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ;
   private String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ;
   private String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ;
   private String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ;
   private String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ;
   private String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ;
   private String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ;
   private String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ;
   private String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ;
   private String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ;
   private String lV102Ingenieria_mrec_analisishdrds_1_filterfulltext ;
   private String lV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ;
   private String lV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ;
   private String lV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ;
   private String lV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ;
   private String lV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ;
   private String A14754MRPrHdr2 ;
   private String A14760MRPrMaqDsc ;
   private String A14759MRPrFasDsc ;
   private String A14758MRPrParDsc ;
   private String A14757MRPrPLC ;
   private String A14752MRPrIp ;
   private String A14756MRPrTkn ;
   private String AV61Option ;
   private String AV63OptionDesc ;
   private com.genexus.webpanels.WebSession AV67Session ;
   private GXSimpleCollection<String> AV91MaqCod ;
   private GXSimpleCollection<String> AV92FasCod ;
   private GXSimpleCollection<String> AV93Hdr ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AV92_A396EmprCod ;
   private String[] P0AV92_A14756MRPrTkn ;
   private java.util.Date[] P0AV92_A14753MRPrReg ;
   private String[] P0AV92_A14752MRPrIp ;
   private String[] P0AV92_A14751MRPrUsu ;
   private java.util.Date[] P0AV92_A14763MRPrFecEv ;
   private boolean[] P0AV92_A14722MRPrEr ;
   private String[] P0AV92_A14765MRPrValMax ;
   private String[] P0AV92_A14721MRPrVal ;
   private String[] P0AV92_A14764MRPrValMin ;
   private java.util.Date[] P0AV92_A14682MRPrFec ;
   private String[] P0AV92_A14757MRPrPLC ;
   private String[] P0AV92_A14758MRPrParDsc ;
   private short[] P0AV92_A14750MRPrParCod ;
   private long[] P0AV92_A14723MRPrParId ;
   private String[] P0AV92_A14759MRPrFasDsc ;
   private String[] P0AV92_A14719MRPrFasCod ;
   private String[] P0AV92_A14760MRPrMaqDsc ;
   private String[] P0AV92_A14720MRPrMaqCod ;
   private long[] P0AV92_A14762MRPrLin ;
   private short[] P0AV92_A14761MRPrOrd ;
   private String[] P0AV92_A14754MRPrHdr2 ;
   private String[] P0AV92_A14755MRPrHdr ;
   private String[] P0AV92_A130BarCodPar ;
   private byte[] P0AV92_A132BarCodReo ;
   private int[] P0AV92_A129BarCod ;
   private long[] P0AV92_A14681MRPrId ;
   private String[] P0AV93_A396EmprCod ;
   private String[] P0AV93_A14751MRPrUsu ;
   private String[] P0AV93_A14752MRPrIp ;
   private String[] P0AV93_A14756MRPrTkn ;
   private String[] P0AV93_A130BarCodPar ;
   private java.util.Date[] P0AV93_A14753MRPrReg ;
   private java.util.Date[] P0AV93_A14763MRPrFecEv ;
   private boolean[] P0AV93_A14722MRPrEr ;
   private String[] P0AV93_A14765MRPrValMax ;
   private String[] P0AV93_A14721MRPrVal ;
   private String[] P0AV93_A14764MRPrValMin ;
   private java.util.Date[] P0AV93_A14682MRPrFec ;
   private String[] P0AV93_A14757MRPrPLC ;
   private String[] P0AV93_A14758MRPrParDsc ;
   private short[] P0AV93_A14750MRPrParCod ;
   private long[] P0AV93_A14723MRPrParId ;
   private String[] P0AV93_A14759MRPrFasDsc ;
   private String[] P0AV93_A14719MRPrFasCod ;
   private String[] P0AV93_A14760MRPrMaqDsc ;
   private String[] P0AV93_A14720MRPrMaqCod ;
   private long[] P0AV93_A14762MRPrLin ;
   private short[] P0AV93_A14761MRPrOrd ;
   private String[] P0AV93_A14754MRPrHdr2 ;
   private String[] P0AV93_A14755MRPrHdr ;
   private byte[] P0AV93_A132BarCodReo ;
   private int[] P0AV93_A129BarCod ;
   private long[] P0AV93_A14681MRPrId ;
   private String[] P0AV94_A396EmprCod ;
   private String[] P0AV94_A14751MRPrUsu ;
   private String[] P0AV94_A14752MRPrIp ;
   private String[] P0AV94_A14756MRPrTkn ;
   private String[] P0AV94_A14755MRPrHdr ;
   private java.util.Date[] P0AV94_A14753MRPrReg ;
   private java.util.Date[] P0AV94_A14763MRPrFecEv ;
   private boolean[] P0AV94_A14722MRPrEr ;
   private String[] P0AV94_A14765MRPrValMax ;
   private String[] P0AV94_A14721MRPrVal ;
   private String[] P0AV94_A14764MRPrValMin ;
   private java.util.Date[] P0AV94_A14682MRPrFec ;
   private String[] P0AV94_A14757MRPrPLC ;
   private String[] P0AV94_A14758MRPrParDsc ;
   private short[] P0AV94_A14750MRPrParCod ;
   private long[] P0AV94_A14723MRPrParId ;
   private String[] P0AV94_A14759MRPrFasDsc ;
   private String[] P0AV94_A14719MRPrFasCod ;
   private String[] P0AV94_A14760MRPrMaqDsc ;
   private String[] P0AV94_A14720MRPrMaqCod ;
   private long[] P0AV94_A14762MRPrLin ;
   private short[] P0AV94_A14761MRPrOrd ;
   private String[] P0AV94_A14754MRPrHdr2 ;
   private String[] P0AV94_A130BarCodPar ;
   private byte[] P0AV94_A132BarCodReo ;
   private int[] P0AV94_A129BarCod ;
   private long[] P0AV94_A14681MRPrId ;
   private String[] P0AV95_A396EmprCod ;
   private String[] P0AV95_A14751MRPrUsu ;
   private String[] P0AV95_A14752MRPrIp ;
   private String[] P0AV95_A14756MRPrTkn ;
   private String[] P0AV95_A14754MRPrHdr2 ;
   private java.util.Date[] P0AV95_A14753MRPrReg ;
   private java.util.Date[] P0AV95_A14763MRPrFecEv ;
   private boolean[] P0AV95_A14722MRPrEr ;
   private String[] P0AV95_A14765MRPrValMax ;
   private String[] P0AV95_A14721MRPrVal ;
   private String[] P0AV95_A14764MRPrValMin ;
   private java.util.Date[] P0AV95_A14682MRPrFec ;
   private String[] P0AV95_A14757MRPrPLC ;
   private String[] P0AV95_A14758MRPrParDsc ;
   private short[] P0AV95_A14750MRPrParCod ;
   private long[] P0AV95_A14723MRPrParId ;
   private String[] P0AV95_A14759MRPrFasDsc ;
   private String[] P0AV95_A14719MRPrFasCod ;
   private String[] P0AV95_A14760MRPrMaqDsc ;
   private String[] P0AV95_A14720MRPrMaqCod ;
   private long[] P0AV95_A14762MRPrLin ;
   private short[] P0AV95_A14761MRPrOrd ;
   private String[] P0AV95_A14755MRPrHdr ;
   private String[] P0AV95_A130BarCodPar ;
   private byte[] P0AV95_A132BarCodReo ;
   private int[] P0AV95_A129BarCod ;
   private long[] P0AV95_A14681MRPrId ;
   private String[] P0AV96_A396EmprCod ;
   private String[] P0AV96_A14751MRPrUsu ;
   private String[] P0AV96_A14752MRPrIp ;
   private String[] P0AV96_A14756MRPrTkn ;
   private String[] P0AV96_A14720MRPrMaqCod ;
   private java.util.Date[] P0AV96_A14753MRPrReg ;
   private java.util.Date[] P0AV96_A14763MRPrFecEv ;
   private boolean[] P0AV96_A14722MRPrEr ;
   private String[] P0AV96_A14765MRPrValMax ;
   private String[] P0AV96_A14721MRPrVal ;
   private String[] P0AV96_A14764MRPrValMin ;
   private java.util.Date[] P0AV96_A14682MRPrFec ;
   private String[] P0AV96_A14757MRPrPLC ;
   private String[] P0AV96_A14758MRPrParDsc ;
   private short[] P0AV96_A14750MRPrParCod ;
   private long[] P0AV96_A14723MRPrParId ;
   private String[] P0AV96_A14759MRPrFasDsc ;
   private String[] P0AV96_A14719MRPrFasCod ;
   private String[] P0AV96_A14760MRPrMaqDsc ;
   private long[] P0AV96_A14762MRPrLin ;
   private short[] P0AV96_A14761MRPrOrd ;
   private String[] P0AV96_A14754MRPrHdr2 ;
   private String[] P0AV96_A14755MRPrHdr ;
   private String[] P0AV96_A130BarCodPar ;
   private byte[] P0AV96_A132BarCodReo ;
   private int[] P0AV96_A129BarCod ;
   private long[] P0AV96_A14681MRPrId ;
   private String[] P0AV97_A396EmprCod ;
   private String[] P0AV97_A14751MRPrUsu ;
   private String[] P0AV97_A14752MRPrIp ;
   private String[] P0AV97_A14756MRPrTkn ;
   private String[] P0AV97_A14760MRPrMaqDsc ;
   private java.util.Date[] P0AV97_A14753MRPrReg ;
   private java.util.Date[] P0AV97_A14763MRPrFecEv ;
   private boolean[] P0AV97_A14722MRPrEr ;
   private String[] P0AV97_A14765MRPrValMax ;
   private String[] P0AV97_A14721MRPrVal ;
   private String[] P0AV97_A14764MRPrValMin ;
   private java.util.Date[] P0AV97_A14682MRPrFec ;
   private String[] P0AV97_A14757MRPrPLC ;
   private String[] P0AV97_A14758MRPrParDsc ;
   private short[] P0AV97_A14750MRPrParCod ;
   private long[] P0AV97_A14723MRPrParId ;
   private String[] P0AV97_A14759MRPrFasDsc ;
   private String[] P0AV97_A14719MRPrFasCod ;
   private String[] P0AV97_A14720MRPrMaqCod ;
   private long[] P0AV97_A14762MRPrLin ;
   private short[] P0AV97_A14761MRPrOrd ;
   private String[] P0AV97_A14754MRPrHdr2 ;
   private String[] P0AV97_A14755MRPrHdr ;
   private String[] P0AV97_A130BarCodPar ;
   private byte[] P0AV97_A132BarCodReo ;
   private int[] P0AV97_A129BarCod ;
   private long[] P0AV97_A14681MRPrId ;
   private String[] P0AV98_A396EmprCod ;
   private String[] P0AV98_A14751MRPrUsu ;
   private String[] P0AV98_A14752MRPrIp ;
   private String[] P0AV98_A14756MRPrTkn ;
   private String[] P0AV98_A14719MRPrFasCod ;
   private java.util.Date[] P0AV98_A14753MRPrReg ;
   private java.util.Date[] P0AV98_A14763MRPrFecEv ;
   private boolean[] P0AV98_A14722MRPrEr ;
   private String[] P0AV98_A14765MRPrValMax ;
   private String[] P0AV98_A14721MRPrVal ;
   private String[] P0AV98_A14764MRPrValMin ;
   private java.util.Date[] P0AV98_A14682MRPrFec ;
   private String[] P0AV98_A14757MRPrPLC ;
   private String[] P0AV98_A14758MRPrParDsc ;
   private short[] P0AV98_A14750MRPrParCod ;
   private long[] P0AV98_A14723MRPrParId ;
   private String[] P0AV98_A14759MRPrFasDsc ;
   private String[] P0AV98_A14760MRPrMaqDsc ;
   private String[] P0AV98_A14720MRPrMaqCod ;
   private long[] P0AV98_A14762MRPrLin ;
   private short[] P0AV98_A14761MRPrOrd ;
   private String[] P0AV98_A14754MRPrHdr2 ;
   private String[] P0AV98_A14755MRPrHdr ;
   private String[] P0AV98_A130BarCodPar ;
   private byte[] P0AV98_A132BarCodReo ;
   private int[] P0AV98_A129BarCod ;
   private long[] P0AV98_A14681MRPrId ;
   private String[] P0AV99_A396EmprCod ;
   private String[] P0AV99_A14751MRPrUsu ;
   private String[] P0AV99_A14752MRPrIp ;
   private String[] P0AV99_A14756MRPrTkn ;
   private String[] P0AV99_A14759MRPrFasDsc ;
   private java.util.Date[] P0AV99_A14753MRPrReg ;
   private java.util.Date[] P0AV99_A14763MRPrFecEv ;
   private boolean[] P0AV99_A14722MRPrEr ;
   private String[] P0AV99_A14765MRPrValMax ;
   private String[] P0AV99_A14721MRPrVal ;
   private String[] P0AV99_A14764MRPrValMin ;
   private java.util.Date[] P0AV99_A14682MRPrFec ;
   private String[] P0AV99_A14757MRPrPLC ;
   private String[] P0AV99_A14758MRPrParDsc ;
   private short[] P0AV99_A14750MRPrParCod ;
   private long[] P0AV99_A14723MRPrParId ;
   private String[] P0AV99_A14719MRPrFasCod ;
   private String[] P0AV99_A14760MRPrMaqDsc ;
   private String[] P0AV99_A14720MRPrMaqCod ;
   private long[] P0AV99_A14762MRPrLin ;
   private short[] P0AV99_A14761MRPrOrd ;
   private String[] P0AV99_A14754MRPrHdr2 ;
   private String[] P0AV99_A14755MRPrHdr ;
   private String[] P0AV99_A130BarCodPar ;
   private byte[] P0AV99_A132BarCodReo ;
   private int[] P0AV99_A129BarCod ;
   private long[] P0AV99_A14681MRPrId ;
   private String[] P0AV910_A396EmprCod ;
   private String[] P0AV910_A14751MRPrUsu ;
   private String[] P0AV910_A14752MRPrIp ;
   private String[] P0AV910_A14756MRPrTkn ;
   private String[] P0AV910_A14758MRPrParDsc ;
   private java.util.Date[] P0AV910_A14753MRPrReg ;
   private java.util.Date[] P0AV910_A14763MRPrFecEv ;
   private boolean[] P0AV910_A14722MRPrEr ;
   private String[] P0AV910_A14765MRPrValMax ;
   private String[] P0AV910_A14721MRPrVal ;
   private String[] P0AV910_A14764MRPrValMin ;
   private java.util.Date[] P0AV910_A14682MRPrFec ;
   private String[] P0AV910_A14757MRPrPLC ;
   private short[] P0AV910_A14750MRPrParCod ;
   private long[] P0AV910_A14723MRPrParId ;
   private String[] P0AV910_A14759MRPrFasDsc ;
   private String[] P0AV910_A14719MRPrFasCod ;
   private String[] P0AV910_A14760MRPrMaqDsc ;
   private String[] P0AV910_A14720MRPrMaqCod ;
   private long[] P0AV910_A14762MRPrLin ;
   private short[] P0AV910_A14761MRPrOrd ;
   private String[] P0AV910_A14754MRPrHdr2 ;
   private String[] P0AV910_A14755MRPrHdr ;
   private String[] P0AV910_A130BarCodPar ;
   private byte[] P0AV910_A132BarCodReo ;
   private int[] P0AV910_A129BarCod ;
   private long[] P0AV910_A14681MRPrId ;
   private String[] P0AV911_A396EmprCod ;
   private String[] P0AV911_A14751MRPrUsu ;
   private String[] P0AV911_A14752MRPrIp ;
   private String[] P0AV911_A14756MRPrTkn ;
   private String[] P0AV911_A14757MRPrPLC ;
   private java.util.Date[] P0AV911_A14753MRPrReg ;
   private java.util.Date[] P0AV911_A14763MRPrFecEv ;
   private boolean[] P0AV911_A14722MRPrEr ;
   private String[] P0AV911_A14765MRPrValMax ;
   private String[] P0AV911_A14721MRPrVal ;
   private String[] P0AV911_A14764MRPrValMin ;
   private java.util.Date[] P0AV911_A14682MRPrFec ;
   private String[] P0AV911_A14758MRPrParDsc ;
   private short[] P0AV911_A14750MRPrParCod ;
   private long[] P0AV911_A14723MRPrParId ;
   private String[] P0AV911_A14759MRPrFasDsc ;
   private String[] P0AV911_A14719MRPrFasCod ;
   private String[] P0AV911_A14760MRPrMaqDsc ;
   private String[] P0AV911_A14720MRPrMaqCod ;
   private long[] P0AV911_A14762MRPrLin ;
   private short[] P0AV911_A14761MRPrOrd ;
   private String[] P0AV911_A14754MRPrHdr2 ;
   private String[] P0AV911_A14755MRPrHdr ;
   private String[] P0AV911_A130BarCodPar ;
   private byte[] P0AV911_A132BarCodReo ;
   private int[] P0AV911_A129BarCod ;
   private long[] P0AV911_A14681MRPrId ;
   private String[] P0AV912_A396EmprCod ;
   private String[] P0AV912_A14751MRPrUsu ;
   private String[] P0AV912_A14752MRPrIp ;
   private String[] P0AV912_A14756MRPrTkn ;
   private String[] P0AV912_A14764MRPrValMin ;
   private java.util.Date[] P0AV912_A14753MRPrReg ;
   private java.util.Date[] P0AV912_A14763MRPrFecEv ;
   private boolean[] P0AV912_A14722MRPrEr ;
   private String[] P0AV912_A14765MRPrValMax ;
   private String[] P0AV912_A14721MRPrVal ;
   private java.util.Date[] P0AV912_A14682MRPrFec ;
   private String[] P0AV912_A14757MRPrPLC ;
   private String[] P0AV912_A14758MRPrParDsc ;
   private short[] P0AV912_A14750MRPrParCod ;
   private long[] P0AV912_A14723MRPrParId ;
   private String[] P0AV912_A14759MRPrFasDsc ;
   private String[] P0AV912_A14719MRPrFasCod ;
   private String[] P0AV912_A14760MRPrMaqDsc ;
   private String[] P0AV912_A14720MRPrMaqCod ;
   private long[] P0AV912_A14762MRPrLin ;
   private short[] P0AV912_A14761MRPrOrd ;
   private String[] P0AV912_A14754MRPrHdr2 ;
   private String[] P0AV912_A14755MRPrHdr ;
   private String[] P0AV912_A130BarCodPar ;
   private byte[] P0AV912_A132BarCodReo ;
   private int[] P0AV912_A129BarCod ;
   private long[] P0AV912_A14681MRPrId ;
   private String[] P0AV913_A396EmprCod ;
   private String[] P0AV913_A14751MRPrUsu ;
   private String[] P0AV913_A14752MRPrIp ;
   private String[] P0AV913_A14756MRPrTkn ;
   private String[] P0AV913_A14721MRPrVal ;
   private java.util.Date[] P0AV913_A14753MRPrReg ;
   private java.util.Date[] P0AV913_A14763MRPrFecEv ;
   private boolean[] P0AV913_A14722MRPrEr ;
   private String[] P0AV913_A14765MRPrValMax ;
   private String[] P0AV913_A14764MRPrValMin ;
   private java.util.Date[] P0AV913_A14682MRPrFec ;
   private String[] P0AV913_A14757MRPrPLC ;
   private String[] P0AV913_A14758MRPrParDsc ;
   private short[] P0AV913_A14750MRPrParCod ;
   private long[] P0AV913_A14723MRPrParId ;
   private String[] P0AV913_A14759MRPrFasDsc ;
   private String[] P0AV913_A14719MRPrFasCod ;
   private String[] P0AV913_A14760MRPrMaqDsc ;
   private String[] P0AV913_A14720MRPrMaqCod ;
   private long[] P0AV913_A14762MRPrLin ;
   private short[] P0AV913_A14761MRPrOrd ;
   private String[] P0AV913_A14754MRPrHdr2 ;
   private String[] P0AV913_A14755MRPrHdr ;
   private String[] P0AV913_A130BarCodPar ;
   private byte[] P0AV913_A132BarCodReo ;
   private int[] P0AV913_A129BarCod ;
   private long[] P0AV913_A14681MRPrId ;
   private String[] P0AV914_A396EmprCod ;
   private String[] P0AV914_A14751MRPrUsu ;
   private String[] P0AV914_A14752MRPrIp ;
   private String[] P0AV914_A14756MRPrTkn ;
   private String[] P0AV914_A14765MRPrValMax ;
   private java.util.Date[] P0AV914_A14753MRPrReg ;
   private java.util.Date[] P0AV914_A14763MRPrFecEv ;
   private boolean[] P0AV914_A14722MRPrEr ;
   private String[] P0AV914_A14721MRPrVal ;
   private String[] P0AV914_A14764MRPrValMin ;
   private java.util.Date[] P0AV914_A14682MRPrFec ;
   private String[] P0AV914_A14757MRPrPLC ;
   private String[] P0AV914_A14758MRPrParDsc ;
   private short[] P0AV914_A14750MRPrParCod ;
   private long[] P0AV914_A14723MRPrParId ;
   private String[] P0AV914_A14759MRPrFasDsc ;
   private String[] P0AV914_A14719MRPrFasCod ;
   private String[] P0AV914_A14760MRPrMaqDsc ;
   private String[] P0AV914_A14720MRPrMaqCod ;
   private long[] P0AV914_A14762MRPrLin ;
   private short[] P0AV914_A14761MRPrOrd ;
   private String[] P0AV914_A14754MRPrHdr2 ;
   private String[] P0AV914_A14755MRPrHdr ;
   private String[] P0AV914_A130BarCodPar ;
   private byte[] P0AV914_A132BarCodReo ;
   private int[] P0AV914_A129BarCod ;
   private long[] P0AV914_A14681MRPrId ;
   private GXSimpleCollection<String> AV62Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV65OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV69GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV70GridStateFilterValue ;
}

final  class mrec_analisishdrgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AV92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV91MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV92FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV93Hdr ,
                                          String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV91MaqCod_size ,
                                          int AV92FasCod_size ,
                                          int AV93Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          java.util.Date AV85Desde ,
                                          java.util.Date AV86Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV89Now ,
                                          String A14751MRPrUsu ,
                                          String AV87UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV88Ip ,
                                          String A14756MRPrTkn ,
                                          String AV90MTkn ,
                                          String AV79EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[66];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrTkn, MRPrReg, MRPrIp, MRPrUsu, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId, MRPrFasDsc," ;
      scmdbuf += " MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
         GXv_int2[18] = (byte)(1) ;
         GXv_int2[19] = (byte)(1) ;
         GXv_int2[20] = (byte)(1) ;
         GXv_int2[21] = (byte)(1) ;
         GXv_int2[22] = (byte)(1) ;
         GXv_int2[23] = (byte)(1) ;
         GXv_int2[24] = (byte)(1) ;
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int2[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int2[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int2[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AV93( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV91MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV92FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV93Hdr ,
                                          String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV91MaqCod_size ,
                                          int AV92FasCod_size ,
                                          int AV93Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          java.util.Date AV85Desde ,
                                          java.util.Date AV86Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV89Now ,
                                          String AV79EmprCod ,
                                          String A14751MRPrUsu ,
                                          String AV87UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV88Ip ,
                                          String A14756MRPrTkn ,
                                          String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[66];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, BarCodPar, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId," ;
      scmdbuf += " MRPrFasDsc, MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
         GXv_int5[10] = (byte)(1) ;
         GXv_int5[11] = (byte)(1) ;
         GXv_int5[12] = (byte)(1) ;
         GXv_int5[13] = (byte)(1) ;
         GXv_int5[14] = (byte)(1) ;
         GXv_int5[15] = (byte)(1) ;
         GXv_int5[16] = (byte)(1) ;
         GXv_int5[17] = (byte)(1) ;
         GXv_int5[18] = (byte)(1) ;
         GXv_int5[19] = (byte)(1) ;
         GXv_int5[20] = (byte)(1) ;
         GXv_int5[21] = (byte)(1) ;
         GXv_int5[22] = (byte)(1) ;
         GXv_int5[23] = (byte)(1) ;
         GXv_int5[24] = (byte)(1) ;
         GXv_int5[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int5[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int5[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int5[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int5[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int5[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int5[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int5[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int5[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int5[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int5[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int5[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int5[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int5[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int5[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int5[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int5[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarCodPar" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0AV94( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV91MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV92FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV93Hdr ,
                                          String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV91MaqCod_size ,
                                          int AV92FasCod_size ,
                                          int AV93Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          java.util.Date AV85Desde ,
                                          java.util.Date AV86Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV89Now ,
                                          String AV79EmprCod ,
                                          String A14751MRPrUsu ,
                                          String AV87UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV88Ip ,
                                          String A14756MRPrTkn ,
                                          String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[66];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrHdr, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId," ;
      scmdbuf += " MRPrFasDsc, MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
         GXv_int8[16] = (byte)(1) ;
         GXv_int8[17] = (byte)(1) ;
         GXv_int8[18] = (byte)(1) ;
         GXv_int8[19] = (byte)(1) ;
         GXv_int8[20] = (byte)(1) ;
         GXv_int8[21] = (byte)(1) ;
         GXv_int8[22] = (byte)(1) ;
         GXv_int8[23] = (byte)(1) ;
         GXv_int8[24] = (byte)(1) ;
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int8[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int8[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int8[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int8[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int8[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int8[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrHdr" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AV95( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV91MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV92FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV93Hdr ,
                                          String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV91MaqCod_size ,
                                          int AV92FasCod_size ,
                                          int AV93Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          java.util.Date AV85Desde ,
                                          java.util.Date AV86Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV89Now ,
                                          String AV79EmprCod ,
                                          String A14751MRPrUsu ,
                                          String AV87UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV88Ip ,
                                          String A14756MRPrTkn ,
                                          String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[66];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrHdr2, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId," ;
      scmdbuf += " MRPrFasDsc, MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
         GXv_int11[10] = (byte)(1) ;
         GXv_int11[11] = (byte)(1) ;
         GXv_int11[12] = (byte)(1) ;
         GXv_int11[13] = (byte)(1) ;
         GXv_int11[14] = (byte)(1) ;
         GXv_int11[15] = (byte)(1) ;
         GXv_int11[16] = (byte)(1) ;
         GXv_int11[17] = (byte)(1) ;
         GXv_int11[18] = (byte)(1) ;
         GXv_int11[19] = (byte)(1) ;
         GXv_int11[20] = (byte)(1) ;
         GXv_int11[21] = (byte)(1) ;
         GXv_int11[22] = (byte)(1) ;
         GXv_int11[23] = (byte)(1) ;
         GXv_int11[24] = (byte)(1) ;
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int11[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int11[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int11[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int11[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int11[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int11[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int11[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int11[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int11[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int11[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int11[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrHdr2" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0AV96( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV91MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV92FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV93Hdr ,
                                          String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV91MaqCod_size ,
                                          int AV92FasCod_size ,
                                          int AV93Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          java.util.Date AV85Desde ,
                                          java.util.Date AV86Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV89Now ,
                                          String AV79EmprCod ,
                                          String A14751MRPrUsu ,
                                          String AV87UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV88Ip ,
                                          String A14756MRPrTkn ,
                                          String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[66];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrMaqCod, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId," ;
      scmdbuf += " MRPrFasDsc, MRPrFasCod, MRPrMaqDsc, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
         GXv_int14[12] = (byte)(1) ;
         GXv_int14[13] = (byte)(1) ;
         GXv_int14[14] = (byte)(1) ;
         GXv_int14[15] = (byte)(1) ;
         GXv_int14[16] = (byte)(1) ;
         GXv_int14[17] = (byte)(1) ;
         GXv_int14[18] = (byte)(1) ;
         GXv_int14[19] = (byte)(1) ;
         GXv_int14[20] = (byte)(1) ;
         GXv_int14[21] = (byte)(1) ;
         GXv_int14[22] = (byte)(1) ;
         GXv_int14[23] = (byte)(1) ;
         GXv_int14[24] = (byte)(1) ;
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int14[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int14[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int14[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int14[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int14[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int14[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int14[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrMaqCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0AV97( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV91MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV92FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV93Hdr ,
                                          String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV91MaqCod_size ,
                                          int AV92FasCod_size ,
                                          int AV93Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          java.util.Date AV85Desde ,
                                          java.util.Date AV86Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV89Now ,
                                          String AV79EmprCod ,
                                          String A14751MRPrUsu ,
                                          String AV87UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV88Ip ,
                                          String A14756MRPrTkn ,
                                          String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[66];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrMaqDsc, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId," ;
      scmdbuf += " MRPrFasDsc, MRPrFasCod, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
         GXv_int17[10] = (byte)(1) ;
         GXv_int17[11] = (byte)(1) ;
         GXv_int17[12] = (byte)(1) ;
         GXv_int17[13] = (byte)(1) ;
         GXv_int17[14] = (byte)(1) ;
         GXv_int17[15] = (byte)(1) ;
         GXv_int17[16] = (byte)(1) ;
         GXv_int17[17] = (byte)(1) ;
         GXv_int17[18] = (byte)(1) ;
         GXv_int17[19] = (byte)(1) ;
         GXv_int17[20] = (byte)(1) ;
         GXv_int17[21] = (byte)(1) ;
         GXv_int17[22] = (byte)(1) ;
         GXv_int17[23] = (byte)(1) ;
         GXv_int17[24] = (byte)(1) ;
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int17[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int17[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int17[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int17[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int17[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int17[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int17[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int17[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int17[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int17[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int17[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int17[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int17[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrMaqDsc" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P0AV98( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV91MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV92FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV93Hdr ,
                                          String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV91MaqCod_size ,
                                          int AV92FasCod_size ,
                                          int AV93Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          java.util.Date AV85Desde ,
                                          java.util.Date AV86Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV89Now ,
                                          String AV79EmprCod ,
                                          String A14751MRPrUsu ,
                                          String AV87UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV88Ip ,
                                          String A14756MRPrTkn ,
                                          String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[66];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrFasCod, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId," ;
      scmdbuf += " MRPrFasDsc, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
         GXv_int20[8] = (byte)(1) ;
         GXv_int20[9] = (byte)(1) ;
         GXv_int20[10] = (byte)(1) ;
         GXv_int20[11] = (byte)(1) ;
         GXv_int20[12] = (byte)(1) ;
         GXv_int20[13] = (byte)(1) ;
         GXv_int20[14] = (byte)(1) ;
         GXv_int20[15] = (byte)(1) ;
         GXv_int20[16] = (byte)(1) ;
         GXv_int20[17] = (byte)(1) ;
         GXv_int20[18] = (byte)(1) ;
         GXv_int20[19] = (byte)(1) ;
         GXv_int20[20] = (byte)(1) ;
         GXv_int20[21] = (byte)(1) ;
         GXv_int20[22] = (byte)(1) ;
         GXv_int20[23] = (byte)(1) ;
         GXv_int20[24] = (byte)(1) ;
         GXv_int20[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int20[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int20[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int20[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int20[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int20[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int20[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int20[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int20[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int20[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int20[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int20[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int20[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int20[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrFasCod" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P0AV99( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV91MaqCod ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV92FasCod ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV93Hdr ,
                                          String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                          String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                          String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                          int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                          int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                          byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                          byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                          String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                          String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                          String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                          String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                          String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                          String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                          short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                          short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                          long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                          long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                          String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                          String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                          String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                          String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                          String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                          String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                          String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                          String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                          long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                          long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                          short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                          short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                          String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                          String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                          String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                          String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                          java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                          String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                          String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                          String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                          String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                          String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                          String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                          byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                          java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                          int AV91MaqCod_size ,
                                          int AV92FasCod_size ,
                                          int AV93Hdr_size ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A14754MRPrHdr2 ,
                                          short A14761MRPrOrd ,
                                          long A14762MRPrLin ,
                                          String A14760MRPrMaqDsc ,
                                          String A14759MRPrFasDsc ,
                                          long A14723MRPrParId ,
                                          short A14750MRPrParCod ,
                                          String A14758MRPrParDsc ,
                                          String A14757MRPrPLC ,
                                          String A14764MRPrValMin ,
                                          String A14721MRPrVal ,
                                          String A14765MRPrValMax ,
                                          java.util.Date A14682MRPrFec ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14763MRPrFecEv ,
                                          java.util.Date AV85Desde ,
                                          java.util.Date AV86Hasta ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV89Now ,
                                          String AV79EmprCod ,
                                          String A14751MRPrUsu ,
                                          String AV87UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV88Ip ,
                                          String A14756MRPrTkn ,
                                          String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[66];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrFasDsc, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId," ;
      scmdbuf += " MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
         GXv_int23[8] = (byte)(1) ;
         GXv_int23[9] = (byte)(1) ;
         GXv_int23[10] = (byte)(1) ;
         GXv_int23[11] = (byte)(1) ;
         GXv_int23[12] = (byte)(1) ;
         GXv_int23[13] = (byte)(1) ;
         GXv_int23[14] = (byte)(1) ;
         GXv_int23[15] = (byte)(1) ;
         GXv_int23[16] = (byte)(1) ;
         GXv_int23[17] = (byte)(1) ;
         GXv_int23[18] = (byte)(1) ;
         GXv_int23[19] = (byte)(1) ;
         GXv_int23[20] = (byte)(1) ;
         GXv_int23[21] = (byte)(1) ;
         GXv_int23[22] = (byte)(1) ;
         GXv_int23[23] = (byte)(1) ;
         GXv_int23[24] = (byte)(1) ;
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int23[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int23[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int23[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int23[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int23[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int23[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int23[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int23[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int23[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int23[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int23[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int23[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrFasDsc" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P0AV910( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A14720MRPrMaqCod ,
                                           GXSimpleCollection<String> AV91MaqCod ,
                                           String A14719MRPrFasCod ,
                                           GXSimpleCollection<String> AV92FasCod ,
                                           String A14755MRPrHdr ,
                                           GXSimpleCollection<String> AV93Hdr ,
                                           String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                           int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                           byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                           byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                           String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                           short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                           long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                           long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                           String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                           long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                           short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                           short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                           String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                           java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           int AV91MaqCod_size ,
                                           int AV92FasCod_size ,
                                           int AV93Hdr_size ,
                                           String A396EmprCod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A14754MRPrHdr2 ,
                                           short A14761MRPrOrd ,
                                           long A14762MRPrLin ,
                                           String A14760MRPrMaqDsc ,
                                           String A14759MRPrFasDsc ,
                                           long A14723MRPrParId ,
                                           short A14750MRPrParCod ,
                                           String A14758MRPrParDsc ,
                                           String A14757MRPrPLC ,
                                           String A14764MRPrValMin ,
                                           String A14721MRPrVal ,
                                           String A14765MRPrValMax ,
                                           java.util.Date A14682MRPrFec ,
                                           boolean A14722MRPrEr ,
                                           java.util.Date A14763MRPrFecEv ,
                                           java.util.Date AV85Desde ,
                                           java.util.Date AV86Hasta ,
                                           java.util.Date A14753MRPrReg ,
                                           java.util.Date AV89Now ,
                                           String AV79EmprCod ,
                                           String A14751MRPrUsu ,
                                           String AV87UsurCod ,
                                           String A14752MRPrIp ,
                                           String AV88Ip ,
                                           String A14756MRPrTkn ,
                                           String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[66];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrParDsc, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParCod, MRPrParId, MRPrFasDsc," ;
      scmdbuf += " MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
         GXv_int26[8] = (byte)(1) ;
         GXv_int26[9] = (byte)(1) ;
         GXv_int26[10] = (byte)(1) ;
         GXv_int26[11] = (byte)(1) ;
         GXv_int26[12] = (byte)(1) ;
         GXv_int26[13] = (byte)(1) ;
         GXv_int26[14] = (byte)(1) ;
         GXv_int26[15] = (byte)(1) ;
         GXv_int26[16] = (byte)(1) ;
         GXv_int26[17] = (byte)(1) ;
         GXv_int26[18] = (byte)(1) ;
         GXv_int26[19] = (byte)(1) ;
         GXv_int26[20] = (byte)(1) ;
         GXv_int26[21] = (byte)(1) ;
         GXv_int26[22] = (byte)(1) ;
         GXv_int26[23] = (byte)(1) ;
         GXv_int26[24] = (byte)(1) ;
         GXv_int26[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int26[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int26[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int26[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int26[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int26[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int26[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int26[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int26[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int26[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int26[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int26[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int26[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int26[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int26[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int26[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrParDsc" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P0AV911( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A14720MRPrMaqCod ,
                                           GXSimpleCollection<String> AV91MaqCod ,
                                           String A14719MRPrFasCod ,
                                           GXSimpleCollection<String> AV92FasCod ,
                                           String A14755MRPrHdr ,
                                           GXSimpleCollection<String> AV93Hdr ,
                                           String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                           int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                           byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                           byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                           String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                           short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                           long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                           long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                           String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                           long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                           short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                           short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                           String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                           java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           int AV91MaqCod_size ,
                                           int AV92FasCod_size ,
                                           int AV93Hdr_size ,
                                           String A396EmprCod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A14754MRPrHdr2 ,
                                           short A14761MRPrOrd ,
                                           long A14762MRPrLin ,
                                           String A14760MRPrMaqDsc ,
                                           String A14759MRPrFasDsc ,
                                           long A14723MRPrParId ,
                                           short A14750MRPrParCod ,
                                           String A14758MRPrParDsc ,
                                           String A14757MRPrPLC ,
                                           String A14764MRPrValMin ,
                                           String A14721MRPrVal ,
                                           String A14765MRPrValMax ,
                                           java.util.Date A14682MRPrFec ,
                                           boolean A14722MRPrEr ,
                                           java.util.Date A14763MRPrFecEv ,
                                           java.util.Date AV85Desde ,
                                           java.util.Date AV86Hasta ,
                                           java.util.Date A14753MRPrReg ,
                                           java.util.Date AV89Now ,
                                           String AV79EmprCod ,
                                           String A14751MRPrUsu ,
                                           String AV87UsurCod ,
                                           String A14752MRPrIp ,
                                           String AV88Ip ,
                                           String A14756MRPrTkn ,
                                           String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[66];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrPLC, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrValMin, MRPrFec, MRPrParDsc, MRPrParCod, MRPrParId, MRPrFasDsc," ;
      scmdbuf += " MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
         GXv_int29[8] = (byte)(1) ;
         GXv_int29[9] = (byte)(1) ;
         GXv_int29[10] = (byte)(1) ;
         GXv_int29[11] = (byte)(1) ;
         GXv_int29[12] = (byte)(1) ;
         GXv_int29[13] = (byte)(1) ;
         GXv_int29[14] = (byte)(1) ;
         GXv_int29[15] = (byte)(1) ;
         GXv_int29[16] = (byte)(1) ;
         GXv_int29[17] = (byte)(1) ;
         GXv_int29[18] = (byte)(1) ;
         GXv_int29[19] = (byte)(1) ;
         GXv_int29[20] = (byte)(1) ;
         GXv_int29[21] = (byte)(1) ;
         GXv_int29[22] = (byte)(1) ;
         GXv_int29[23] = (byte)(1) ;
         GXv_int29[24] = (byte)(1) ;
         GXv_int29[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int29[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int29[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int29[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int29[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int29[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int29[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int29[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrPLC" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_P0AV912( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A14720MRPrMaqCod ,
                                           GXSimpleCollection<String> AV91MaqCod ,
                                           String A14719MRPrFasCod ,
                                           GXSimpleCollection<String> AV92FasCod ,
                                           String A14755MRPrHdr ,
                                           GXSimpleCollection<String> AV93Hdr ,
                                           String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                           int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                           byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                           byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                           String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                           short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                           long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                           long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                           String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                           long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                           short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                           short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                           String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                           java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           int AV91MaqCod_size ,
                                           int AV92FasCod_size ,
                                           int AV93Hdr_size ,
                                           String A396EmprCod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A14754MRPrHdr2 ,
                                           short A14761MRPrOrd ,
                                           long A14762MRPrLin ,
                                           String A14760MRPrMaqDsc ,
                                           String A14759MRPrFasDsc ,
                                           long A14723MRPrParId ,
                                           short A14750MRPrParCod ,
                                           String A14758MRPrParDsc ,
                                           String A14757MRPrPLC ,
                                           String A14764MRPrValMin ,
                                           String A14721MRPrVal ,
                                           String A14765MRPrValMax ,
                                           java.util.Date A14682MRPrFec ,
                                           boolean A14722MRPrEr ,
                                           java.util.Date A14763MRPrFecEv ,
                                           java.util.Date AV85Desde ,
                                           java.util.Date AV86Hasta ,
                                           java.util.Date A14753MRPrReg ,
                                           java.util.Date AV89Now ,
                                           String AV79EmprCod ,
                                           String A14751MRPrUsu ,
                                           String AV87UsurCod ,
                                           String A14752MRPrIp ,
                                           String AV88Ip ,
                                           String A14756MRPrTkn ,
                                           String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[66];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrValMin, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrVal, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId, MRPrFasDsc," ;
      scmdbuf += " MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
         GXv_int32[8] = (byte)(1) ;
         GXv_int32[9] = (byte)(1) ;
         GXv_int32[10] = (byte)(1) ;
         GXv_int32[11] = (byte)(1) ;
         GXv_int32[12] = (byte)(1) ;
         GXv_int32[13] = (byte)(1) ;
         GXv_int32[14] = (byte)(1) ;
         GXv_int32[15] = (byte)(1) ;
         GXv_int32[16] = (byte)(1) ;
         GXv_int32[17] = (byte)(1) ;
         GXv_int32[18] = (byte)(1) ;
         GXv_int32[19] = (byte)(1) ;
         GXv_int32[20] = (byte)(1) ;
         GXv_int32[21] = (byte)(1) ;
         GXv_int32[22] = (byte)(1) ;
         GXv_int32[23] = (byte)(1) ;
         GXv_int32[24] = (byte)(1) ;
         GXv_int32[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int32[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int32[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int32[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int32[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int32[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int32[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int32[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int32[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int32[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int32[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int32[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int32[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int32[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int32[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int32[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int32[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int32[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int32[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int32[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int32[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int32[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int32[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int32[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int32[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrValMin" ;
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
   }

   protected Object[] conditional_P0AV913( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A14720MRPrMaqCod ,
                                           GXSimpleCollection<String> AV91MaqCod ,
                                           String A14719MRPrFasCod ,
                                           GXSimpleCollection<String> AV92FasCod ,
                                           String A14755MRPrHdr ,
                                           GXSimpleCollection<String> AV93Hdr ,
                                           String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                           int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                           byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                           byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                           String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                           short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                           long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                           long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                           String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                           long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                           short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                           short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                           String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                           java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           int AV91MaqCod_size ,
                                           int AV92FasCod_size ,
                                           int AV93Hdr_size ,
                                           String A396EmprCod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A14754MRPrHdr2 ,
                                           short A14761MRPrOrd ,
                                           long A14762MRPrLin ,
                                           String A14760MRPrMaqDsc ,
                                           String A14759MRPrFasDsc ,
                                           long A14723MRPrParId ,
                                           short A14750MRPrParCod ,
                                           String A14758MRPrParDsc ,
                                           String A14757MRPrPLC ,
                                           String A14764MRPrValMin ,
                                           String A14721MRPrVal ,
                                           String A14765MRPrValMax ,
                                           java.util.Date A14682MRPrFec ,
                                           boolean A14722MRPrEr ,
                                           java.util.Date A14763MRPrFecEv ,
                                           java.util.Date AV85Desde ,
                                           java.util.Date AV86Hasta ,
                                           java.util.Date A14753MRPrReg ,
                                           java.util.Date AV89Now ,
                                           String AV79EmprCod ,
                                           String A14751MRPrUsu ,
                                           String AV87UsurCod ,
                                           String A14752MRPrIp ,
                                           String AV88Ip ,
                                           String A14756MRPrTkn ,
                                           String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[66];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrVal, MRPrReg, MRPrFecEv, MRPrEr, MRPrValMax, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId, MRPrFasDsc," ;
      scmdbuf += " MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int35[7] = (byte)(1) ;
         GXv_int35[8] = (byte)(1) ;
         GXv_int35[9] = (byte)(1) ;
         GXv_int35[10] = (byte)(1) ;
         GXv_int35[11] = (byte)(1) ;
         GXv_int35[12] = (byte)(1) ;
         GXv_int35[13] = (byte)(1) ;
         GXv_int35[14] = (byte)(1) ;
         GXv_int35[15] = (byte)(1) ;
         GXv_int35[16] = (byte)(1) ;
         GXv_int35[17] = (byte)(1) ;
         GXv_int35[18] = (byte)(1) ;
         GXv_int35[19] = (byte)(1) ;
         GXv_int35[20] = (byte)(1) ;
         GXv_int35[21] = (byte)(1) ;
         GXv_int35[22] = (byte)(1) ;
         GXv_int35[23] = (byte)(1) ;
         GXv_int35[24] = (byte)(1) ;
         GXv_int35[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int35[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int35[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int35[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int35[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int35[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int35[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int35[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int35[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int35[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int35[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int35[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int35[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int35[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int35[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int35[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int35[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int35[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int35[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int35[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int35[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrVal" ;
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
   }

   protected Object[] conditional_P0AV914( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A14720MRPrMaqCod ,
                                           GXSimpleCollection<String> AV91MaqCod ,
                                           String A14719MRPrFasCod ,
                                           GXSimpleCollection<String> AV92FasCod ,
                                           String A14755MRPrHdr ,
                                           GXSimpleCollection<String> AV93Hdr ,
                                           String AV102Ingenieria_mrec_analisishdrds_1_filterfulltext ,
                                           String AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel ,
                                           String AV103Ingenieria_mrec_analisishdrds_2_tfemprcod ,
                                           int AV105Ingenieria_mrec_analisishdrds_4_tfbarcod ,
                                           int AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to ,
                                           byte AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo ,
                                           byte AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to ,
                                           String AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel ,
                                           String AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar ,
                                           String AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel ,
                                           String AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr ,
                                           String AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel ,
                                           String AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2 ,
                                           short AV115Ingenieria_mrec_analisishdrds_14_tfmrprord ,
                                           short AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to ,
                                           long AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin ,
                                           long AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to ,
                                           String AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel ,
                                           String AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod ,
                                           String AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel ,
                                           String AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc ,
                                           String AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel ,
                                           String AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod ,
                                           String AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel ,
                                           String AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc ,
                                           long AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid ,
                                           long AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to ,
                                           short AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod ,
                                           short AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to ,
                                           String AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel ,
                                           String AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc ,
                                           String AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel ,
                                           String AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc ,
                                           java.util.Date AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec ,
                                           String AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel ,
                                           String AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin ,
                                           String AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel ,
                                           String AV138Ingenieria_mrec_analisishdrds_37_tfmrprval ,
                                           String AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel ,
                                           String AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax ,
                                           byte AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel ,
                                           java.util.Date AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev ,
                                           int AV91MaqCod_size ,
                                           int AV92FasCod_size ,
                                           int AV93Hdr_size ,
                                           String A396EmprCod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A14754MRPrHdr2 ,
                                           short A14761MRPrOrd ,
                                           long A14762MRPrLin ,
                                           String A14760MRPrMaqDsc ,
                                           String A14759MRPrFasDsc ,
                                           long A14723MRPrParId ,
                                           short A14750MRPrParCod ,
                                           String A14758MRPrParDsc ,
                                           String A14757MRPrPLC ,
                                           String A14764MRPrValMin ,
                                           String A14721MRPrVal ,
                                           String A14765MRPrValMax ,
                                           java.util.Date A14682MRPrFec ,
                                           boolean A14722MRPrEr ,
                                           java.util.Date A14763MRPrFecEv ,
                                           java.util.Date AV85Desde ,
                                           java.util.Date AV86Hasta ,
                                           java.util.Date A14753MRPrReg ,
                                           java.util.Date AV89Now ,
                                           String AV79EmprCod ,
                                           String A14751MRPrUsu ,
                                           String AV87UsurCod ,
                                           String A14752MRPrIp ,
                                           String AV88Ip ,
                                           String A14756MRPrTkn ,
                                           String AV90MTkn )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int38 = new byte[66];
      Object[] GXv_Object39 = new Object[2];
      scmdbuf = "SELECT EmprCod, MRPrUsu, MRPrIp, MRPrTkn, MRPrValMax, MRPrReg, MRPrFecEv, MRPrEr, MRPrVal, MRPrValMin, MRPrFec, MRPrPLC, MRPrParDsc, MRPrParCod, MRPrParId, MRPrFasDsc," ;
      scmdbuf += " MRPrFasCod, MRPrMaqDsc, MRPrMaqCod, MRPrLin, MRPrOrd, MRPrHdr2, MRPrHdr, BarCodPar, BarCodReo, BarCod, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      if ( ! (GXutil.strcmp("", AV102Ingenieria_mrec_analisishdrds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(BarCodPar) like '%' || UPPER(?)) or ( UPPER(MRPrHdr) like '%' || UPPER(?)) or ( UPPER(MRPrHdr2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrOrd,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrLin,'999999999990'), 2) like '%' || ?) or ( UPPER(MRPrMaqCod) like '%' || UPPER(?)) or ( UPPER(MRPrMaqDsc) like '%' || UPPER(?)) or ( UPPER(MRPrFasCod) like '%' || UPPER(?)) or ( UPPER(MRPrFasDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MRPrParId,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MRPrParCod,'9990'), 2) like '%' || ?) or ( UPPER(MRPrParDsc) like '%' || UPPER(?)) or ( UPPER(MRPrPLC) like '%' || UPPER(?)) or ( UPPER(MRPrValMin) like '%' || UPPER(?)) or ( UPPER(MRPrVal) like '%' || UPPER(?)) or ( UPPER(MRPrValMax) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int38[7] = (byte)(1) ;
         GXv_int38[8] = (byte)(1) ;
         GXv_int38[9] = (byte)(1) ;
         GXv_int38[10] = (byte)(1) ;
         GXv_int38[11] = (byte)(1) ;
         GXv_int38[12] = (byte)(1) ;
         GXv_int38[13] = (byte)(1) ;
         GXv_int38[14] = (byte)(1) ;
         GXv_int38[15] = (byte)(1) ;
         GXv_int38[16] = (byte)(1) ;
         GXv_int38[17] = (byte)(1) ;
         GXv_int38[18] = (byte)(1) ;
         GXv_int38[19] = (byte)(1) ;
         GXv_int38[20] = (byte)(1) ;
         GXv_int38[21] = (byte)(1) ;
         GXv_int38[22] = (byte)(1) ;
         GXv_int38[23] = (byte)(1) ;
         GXv_int38[24] = (byte)(1) ;
         GXv_int38[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Ingenieria_mrec_analisishdrds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ingenieria_mrec_analisishdrds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int38[27] = (byte)(1) ;
      }
      if ( ! (0==AV105Ingenieria_mrec_analisishdrds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int38[28] = (byte)(1) ;
      }
      if ( ! (0==AV106Ingenieria_mrec_analisishdrds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int38[29] = (byte)(1) ;
      }
      if ( ! (0==AV107Ingenieria_mrec_analisishdrds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int38[30] = (byte)(1) ;
      }
      if ( ! (0==AV108Ingenieria_mrec_analisishdrds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int38[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV109Ingenieria_mrec_analisishdrds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Ingenieria_mrec_analisishdrds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int38[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) && ( ! (GXutil.strcmp("", AV111Ingenieria_mrec_analisishdrds_10_tfmrprhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Ingenieria_mrec_analisishdrds_11_tfmrprhdr_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr = ?)");
      }
      else
      {
         GXv_int38[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) && ( ! (GXutil.strcmp("", AV113Ingenieria_mrec_analisishdrds_12_tfmrprhdr2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrHdr2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Ingenieria_mrec_analisishdrds_13_tfmrprhdr2_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrHdr2 = ?)");
      }
      else
      {
         GXv_int38[37] = (byte)(1) ;
      }
      if ( ! (0==AV115Ingenieria_mrec_analisishdrds_14_tfmrprord) )
      {
         addWhere(sWhereString, "(MRPrOrd >= ?)");
      }
      else
      {
         GXv_int38[38] = (byte)(1) ;
      }
      if ( ! (0==AV116Ingenieria_mrec_analisishdrds_15_tfmrprord_to) )
      {
         addWhere(sWhereString, "(MRPrOrd <= ?)");
      }
      else
      {
         GXv_int38[39] = (byte)(1) ;
      }
      if ( ! (0==AV117Ingenieria_mrec_analisishdrds_16_tfmrprlin) )
      {
         addWhere(sWhereString, "(MRPrLin >= ?)");
      }
      else
      {
         GXv_int38[40] = (byte)(1) ;
      }
      if ( ! (0==AV118Ingenieria_mrec_analisishdrds_17_tfmrprlin_to) )
      {
         addWhere(sWhereString, "(MRPrLin <= ?)");
      }
      else
      {
         GXv_int38[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Ingenieria_mrec_analisishdrds_18_tfmrprmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Ingenieria_mrec_analisishdrds_19_tfmrprmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqCod = ?)");
      }
      else
      {
         GXv_int38[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Ingenieria_mrec_analisishdrds_20_tfmrprmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Ingenieria_mrec_analisishdrds_21_tfmrprmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrMaqDsc = ?)");
      }
      else
      {
         GXv_int38[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) && ( ! (GXutil.strcmp("", AV123Ingenieria_mrec_analisishdrds_22_tfmrprfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Ingenieria_mrec_analisishdrds_23_tfmrprfascod_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasCod = ?)");
      }
      else
      {
         GXv_int38[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Ingenieria_mrec_analisishdrds_24_tfmrprfasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrFasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Ingenieria_mrec_analisishdrds_25_tfmrprfasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrFasDsc = ?)");
      }
      else
      {
         GXv_int38[49] = (byte)(1) ;
      }
      if ( ! (0==AV127Ingenieria_mrec_analisishdrds_26_tfmrprparid) )
      {
         addWhere(sWhereString, "(MRPrParId >= ?)");
      }
      else
      {
         GXv_int38[50] = (byte)(1) ;
      }
      if ( ! (0==AV128Ingenieria_mrec_analisishdrds_27_tfmrprparid_to) )
      {
         addWhere(sWhereString, "(MRPrParId <= ?)");
      }
      else
      {
         GXv_int38[51] = (byte)(1) ;
      }
      if ( ! (0==AV129Ingenieria_mrec_analisishdrds_28_tfmrprparcod) )
      {
         addWhere(sWhereString, "(MRPrParCod >= ?)");
      }
      else
      {
         GXv_int38[52] = (byte)(1) ;
      }
      if ( ! (0==AV130Ingenieria_mrec_analisishdrds_29_tfmrprparcod_to) )
      {
         addWhere(sWhereString, "(MRPrParCod <= ?)");
      }
      else
      {
         GXv_int38[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) && ( ! (GXutil.strcmp("", AV131Ingenieria_mrec_analisishdrds_30_tfmrprpardsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrParDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ingenieria_mrec_analisishdrds_31_tfmrprpardsc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrParDsc = ?)");
      }
      else
      {
         GXv_int38[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) && ( ! (GXutil.strcmp("", AV133Ingenieria_mrec_analisishdrds_32_tfmrprplc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrPLC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ingenieria_mrec_analisishdrds_33_tfmrprplc_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrPLC = ?)");
      }
      else
      {
         GXv_int38[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV135Ingenieria_mrec_analisishdrds_34_tfmrprfec) )
      {
         addWhere(sWhereString, "(MRPrFec >= ?)");
      }
      else
      {
         GXv_int38[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) && ( ! (GXutil.strcmp("", AV136Ingenieria_mrec_analisishdrds_35_tfmrprvalmin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Ingenieria_mrec_analisishdrds_36_tfmrprvalmin_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMin = ?)");
      }
      else
      {
         GXv_int38[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) && ( ! (GXutil.strcmp("", AV138Ingenieria_mrec_analisishdrds_37_tfmrprval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Ingenieria_mrec_analisishdrds_38_tfmrprval_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrVal = ?)");
      }
      else
      {
         GXv_int38[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) && ( ! (GXutil.strcmp("", AV140Ingenieria_mrec_analisishdrds_39_tfmrprvalmax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MRPrValMax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Ingenieria_mrec_analisishdrds_40_tfmrprvalmax_sel)==0) )
      {
         addWhere(sWhereString, "(MRPrValMax = ?)");
      }
      else
      {
         GXv_int38[64] = (byte)(1) ;
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 1 )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      if ( AV142Ingenieria_mrec_analisishdrds_41_tfmrprer_sel == 2 )
      {
         addWhere(sWhereString, "(MRPrEr = 0)");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Ingenieria_mrec_analisishdrds_42_tfmrprfecev) )
      {
         addWhere(sWhereString, "(MRPrFecEv >= ?)");
      }
      else
      {
         GXv_int38[65] = (byte)(1) ;
      }
      if ( AV91MaqCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91MaqCod, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV92FasCod_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92FasCod, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV93Hdr_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Hdr, "MRPrHdr IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrValMax" ;
      GXv_Object39[0] = scmdbuf ;
      GXv_Object39[1] = GXv_int38 ;
      return GXv_Object39 ;
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
                  return conditional_P0AV92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 1 :
                  return conditional_P0AV93(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 2 :
                  return conditional_P0AV94(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 3 :
                  return conditional_P0AV95(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 4 :
                  return conditional_P0AV96(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 5 :
                  return conditional_P0AV97(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 6 :
                  return conditional_P0AV98(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 7 :
                  return conditional_P0AV99(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 8 :
                  return conditional_P0AV910(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 9 :
                  return conditional_P0AV911(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 10 :
                  return conditional_P0AV912(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 11 :
                  return conditional_P0AV913(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
            case 12 :
                  return conditional_P0AV914(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).longValue() , ((Number) dynConstraints[22]).longValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).longValue() , ((Number) dynConstraints[32]).longValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).longValue() , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (java.util.Date)dynConstraints[67] , ((Boolean) dynConstraints[68]).booleanValue() , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AV92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV93", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV94", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV95", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV96", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV97", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV98", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV99", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV910", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV911", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV912", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV913", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AV914", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3, true);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.getBoolean(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               ((long[]) buf[20])[0] = rslt.getLong(21);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 10);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               ((long[]) buf[20])[0] = rslt.getLong(21);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((String[]) buf[22])[0] = rslt.getVarchar(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               ((long[]) buf[20])[0] = rslt.getLong(21);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((long[]) buf[15])[0] = rslt.getLong(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6, true);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[7])[0] = rslt.getBoolean(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((long[]) buf[14])[0] = rslt.getLong(15);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getVarchar(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((long[]) buf[19])[0] = rslt.getLong(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 10);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((long[]) buf[26])[0] = rslt.getLong(27);
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
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[69], false, true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
            case 12 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false, true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 256);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[97]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 10);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 10);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[104]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[105]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[106]).longValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[107]).longValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[117]).longValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[118]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[120], 100);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[121], 100);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[122], 100);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[123], 100);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[124], false);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 12);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 12);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 12);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 12);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 12);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 12);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[131], false);
               }
               return;
      }
   }

}

