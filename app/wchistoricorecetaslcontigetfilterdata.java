package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wchistoricorecetaslcontigetfilterdata extends GXProcedure
{
   public wchistoricorecetaslcontigetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wchistoricorecetaslcontigetfilterdata.class ), "" );
   }

   public wchistoricorecetaslcontigetfilterdata( int remoteHandle ,
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
      wchistoricorecetaslcontigetfilterdata.this.aP5 = new String[] {""};
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
      wchistoricorecetaslcontigetfilterdata.this.AV46DDOName = aP0;
      wchistoricorecetaslcontigetfilterdata.this.AV44SearchTxt = aP1;
      wchistoricorecetaslcontigetfilterdata.this.AV45SearchTxtTo = aP2;
      wchistoricorecetaslcontigetfilterdata.this.aP3 = aP3;
      wchistoricorecetaslcontigetfilterdata.this.aP4 = aP4;
      wchistoricorecetaslcontigetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_BARNHDR_LCONTI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDR_LCONTIOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_BARAGRLOT") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRLOTOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_BARSERTIN") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERTINOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_BARDSCTIN") == 0 )
      {
         /* Execute user subroutine: 'LOADBARDSCTINOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_BARCOLNOT") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOTOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_BARMAQTIN") == 0 )
      {
         /* Execute user subroutine: 'LOADBARMAQTINOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_BARDISPCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARDISPCLIOPTIONS' */
         S191 ();
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
      if ( GXutil.strcmp(AV57Session.getValue("WCHistoricoRecetasLcontiGridState"), "") == 0 )
      {
         AV59GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCHistoricoRecetasLcontiGridState"), null, null);
      }
      else
      {
         AV59GridState.fromxml(AV57Session.getValue("WCHistoricoRecetasLcontiGridState"), null, null);
      }
      AV94GXV1 = 1 ;
      while ( AV94GXV1 <= AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV60GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV94GXV1));
         if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV89FilterFullText = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTFECCIER") == 0 )
         {
            AV10TFEstFecCier = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTTINNR") == 0 )
         {
            AV12TFEstTinNr = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFEstTinNr_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_LCONTI") == 0 )
         {
            AV90TFBarnhdr_lconti = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_LCONTI_SEL") == 0 )
         {
            AV91TFBarnhdr_lconti_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT") == 0 )
         {
            AV40TFBarAgrLot = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT_SEL") == 0 )
         {
            AV41TFBarAgrLot_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN") == 0 )
         {
            AV18TFBarSerTin = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN_SEL") == 0 )
         {
            AV19TFBarSerTin_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN") == 0 )
         {
            AV20TFBarDscTin = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN_SEL") == 0 )
         {
            AV21TFBarDscTin_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT") == 0 )
         {
            AV22TFBarColNoT = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT_SEL") == 0 )
         {
            AV23TFBarColNoT_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUT") == 0 )
         {
            AV24TFBarColNuT = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFBarColNuT_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOT") == 0 )
         {
            AV26TFBarTipCoT = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFBarTipCoT_To = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGMTIN") == 0 )
         {
            AV28TFBarKgmTin = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarKgmTin_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGSTT") == 0 )
         {
            AV30TFBarKgsTt = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFBarKgsTt_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTRTIN") == 0 )
         {
            AV32TFBarMtrTin = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFBarMtrTin_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTSTT") == 0 )
         {
            AV34TFBarMtsTt = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFBarMtsTt_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN") == 0 )
         {
            AV36TFBarMaqTin = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN_SEL") == 0 )
         {
            AV37TFBarMaqTin_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARVOLTIN") == 0 )
         {
            AV38TFBarVolTin = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarVolTin_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI") == 0 )
         {
            AV87TFBarDispCli = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI_SEL") == 0 )
         {
            AV88TFBarDispCli_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANA") == 0 )
         {
            AV85TFBarNumAna = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV86TFBarNumAna_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV62Emprcod = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV63Fec1 = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC3") == 0 )
         {
            AV64Fec3 = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCLICOD") == 0 )
         {
            AV65PCliCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODP") == 0 )
         {
            AV66CliCodP = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCOD") == 0 )
         {
            AV67PBarCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODP") == 0 )
         {
            AV68Barcodp = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODREO") == 0 )
         {
            AV69PBarCodReo = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOP") == 0 )
         {
            AV70BarCodReoP = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODPAR") == 0 )
         {
            AV71PBarCodPar = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARP") == 0 )
         {
            AV72BarCodParP = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PSERIE") == 0 )
         {
            AV73PSerie = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SERIEP") == 0 )
         {
            AV74SerieP = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLOR") == 0 )
         {
            AV75PColor = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLORP") == 0 )
         {
            AV76ColorP = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLNUM") == 0 )
         {
            AV77PColNum = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLNUMP") == 0 )
         {
            AV78ColNumP = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI1") == 0 )
         {
            AV79DispCli1 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI3") == 0 )
         {
            AV80DispCli3 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV81HreRacab = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODI") == 0 )
         {
            AV82MaqCodi = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD3") == 0 )
         {
            AV83MaqCod3 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV94GXV1 = (int)(AV94GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDR_LCONTIOPTIONS' Routine */
      returnInSub = false ;
      AV90TFBarnhdr_lconti = AV44SearchTxt ;
      AV91TFBarnhdr_lconti_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV89FilterFullText ,
                                           AV10TFEstFecCier ,
                                           Short.valueOf(AV12TFEstTinNr) ,
                                           Short.valueOf(AV13TFEstTinNr_To) ,
                                           AV91TFBarnhdr_lconti_Sel ,
                                           AV90TFBarnhdr_lconti ,
                                           AV41TFBarAgrLot_Sel ,
                                           AV40TFBarAgrLot ,
                                           Integer.valueOf(AV14TFCliCod) ,
                                           Integer.valueOf(AV15TFCliCod_To) ,
                                           AV17TFCliNom_Sel ,
                                           AV16TFCliNom ,
                                           AV19TFBarSerTin_Sel ,
                                           AV18TFBarSerTin ,
                                           AV21TFBarDscTin_Sel ,
                                           AV20TFBarDscTin ,
                                           AV23TFBarColNoT_Sel ,
                                           AV22TFBarColNoT ,
                                           Integer.valueOf(AV24TFBarColNuT) ,
                                           Integer.valueOf(AV25TFBarColNuT_To) ,
                                           Byte.valueOf(AV26TFBarTipCoT) ,
                                           Byte.valueOf(AV27TFBarTipCoT_To) ,
                                           AV28TFBarKgmTin ,
                                           AV29TFBarKgmTin_To ,
                                           AV30TFBarKgsTt ,
                                           AV31TFBarKgsTt_To ,
                                           AV32TFBarMtrTin ,
                                           AV33TFBarMtrTin_To ,
                                           AV34TFBarMtsTt ,
                                           AV35TFBarMtsTt_To ,
                                           AV37TFBarMaqTin_Sel ,
                                           AV36TFBarMaqTin ,
                                           Integer.valueOf(AV38TFBarVolTin) ,
                                           Integer.valueOf(AV39TFBarVolTin_To) ,
                                           AV88TFBarDispCli_Sel ,
                                           AV87TFBarDispCli ,
                                           Short.valueOf(AV85TFBarNumAna) ,
                                           Short.valueOf(AV86TFBarNumAna_To) ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV63Fec1 ,
                                           AV64Fec3 ,
                                           Integer.valueOf(AV65PCliCod) ,
                                           Integer.valueOf(AV66CliCodP) ,
                                           Integer.valueOf(AV67PBarCod) ,
                                           Integer.valueOf(AV68Barcodp) ,
                                           Byte.valueOf(AV69PBarCodReo) ,
                                           Byte.valueOf(AV70BarCodReoP) ,
                                           AV71PBarCodPar ,
                                           AV72BarCodParP ,
                                           AV73PSerie ,
                                           AV74SerieP ,
                                           AV75PColor ,
                                           AV76ColorP ,
                                           Integer.valueOf(AV77PColNum) ,
                                           Integer.valueOf(AV78ColNumP) ,
                                           AV79DispCli1 ,
                                           AV80DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV81HreRacab ,
                                           AV82MaqCodi ,
                                           AV83MaqCod3 ,
                                           AV62Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV90TFBarnhdr_lconti = GXutil.padr( GXutil.rtrim( AV90TFBarnhdr_lconti), 11, "%") ;
      lV40TFBarAgrLot = GXutil.padr( GXutil.rtrim( AV40TFBarAgrLot), 10, "%") ;
      lV16TFCliNom = GXutil.padr( GXutil.rtrim( AV16TFCliNom), 30, "%") ;
      lV18TFBarSerTin = GXutil.padr( GXutil.rtrim( AV18TFBarSerTin), 16, "%") ;
      lV20TFBarDscTin = GXutil.padr( GXutil.rtrim( AV20TFBarDscTin), 26, "%") ;
      lV22TFBarColNoT = GXutil.padr( GXutil.rtrim( AV22TFBarColNoT), 13, "%") ;
      lV36TFBarMaqTin = GXutil.padr( GXutil.rtrim( AV36TFBarMaqTin), 6, "%") ;
      lV87TFBarDispCli = GXutil.padr( GXutil.rtrim( AV87TFBarDispCli), 20, "%") ;
      /* Using cursor P08LA2 */
      pr_default.execute(0, new Object[] {AV62Emprcod, AV63Fec1, AV64Fec3, Integer.valueOf(AV65PCliCod), Integer.valueOf(AV66CliCodP), Integer.valueOf(AV67PBarCod), Integer.valueOf(AV68Barcodp), Byte.valueOf(AV69PBarCodReo), Byte.valueOf(AV70BarCodReoP), AV71PBarCodPar, AV72BarCodParP, AV73PSerie, AV74SerieP, AV75PColor, AV76ColorP, Integer.valueOf(AV77PColNum), Integer.valueOf(AV78ColNumP), AV79DispCli1, AV80DispCli3, AV81HreRacab, AV81HreRacab, AV82MaqCodi, AV83MaqCod3, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, AV10TFEstFecCier, Short.valueOf(AV12TFEstTinNr), Short.valueOf(AV13TFEstTinNr_To), lV90TFBarnhdr_lconti, AV91TFBarnhdr_lconti_Sel, lV40TFBarAgrLot, AV41TFBarAgrLot_Sel, Integer.valueOf(AV14TFCliCod), Integer.valueOf(AV15TFCliCod_To), lV16TFCliNom, AV17TFCliNom_Sel, lV18TFBarSerTin, AV19TFBarSerTin_Sel, lV20TFBarDscTin, AV21TFBarDscTin_Sel, lV22TFBarColNoT, AV23TFBarColNoT_Sel, Integer.valueOf(AV24TFBarColNuT), Integer.valueOf(AV25TFBarColNuT_To), Byte.valueOf(AV26TFBarTipCoT), Byte.valueOf(AV27TFBarTipCoT_To), AV28TFBarKgmTin, AV29TFBarKgmTin_To, AV30TFBarKgsTt, AV31TFBarKgsTt_To, AV32TFBarMtrTin, AV33TFBarMtrTin_To, AV34TFBarMtsTt, AV35TFBarMtsTt_To, lV36TFBarMaqTin, AV37TFBarMaqTin_Sel, Integer.valueOf(AV38TFBarVolTin), Integer.valueOf(AV39TFBarVolTin_To), lV87TFBarDispCli, AV88TFBarDispCli_Sel, Short.valueOf(AV85TFBarNumAna), Short.valueOf(AV86TFBarNumAna_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6634BarRecAcb = P08LA2_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08LA2_n6634BarRecAcb[0] ;
         A396EmprCod = P08LA2_A396EmprCod[0] ;
         A13759EstFecCier = P08LA2_A13759EstFecCier[0] ;
         A3650BarNumAna = P08LA2_A3650BarNumAna[0] ;
         n3650BarNumAna = P08LA2_n3650BarNumAna[0] ;
         A11762BarDispCli = P08LA2_A11762BarDispCli[0] ;
         n11762BarDispCli = P08LA2_n11762BarDispCli[0] ;
         A1946BarVolTin = P08LA2_A1946BarVolTin[0] ;
         n1946BarVolTin = P08LA2_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08LA2_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08LA2_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08LA2_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08LA2_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08LA2_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08LA2_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08LA2_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08LA2_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08LA2_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08LA2_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08LA2_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08LA2_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08LA2_A1941BarColNuT[0] ;
         n1941BarColNuT = P08LA2_n1941BarColNuT[0] ;
         A1940BarColNoT = P08LA2_A1940BarColNoT[0] ;
         n1940BarColNoT = P08LA2_n1940BarColNoT[0] ;
         A1937BarDscTin = P08LA2_A1937BarDscTin[0] ;
         n1937BarDscTin = P08LA2_n1937BarDscTin[0] ;
         A1936BarSerTin = P08LA2_A1936BarSerTin[0] ;
         n1936BarSerTin = P08LA2_n1936BarSerTin[0] ;
         A279CliNom = P08LA2_A279CliNom[0] ;
         A252CliCod = P08LA2_A252CliCod[0] ;
         A2316BarAgrLot = P08LA2_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08LA2_n2316BarAgrLot[0] ;
         A1929EstTinNr = P08LA2_A1929EstTinNr[0] ;
         A1935BarParTin = P08LA2_A1935BarParTin[0] ;
         n1935BarParTin = P08LA2_n1935BarParTin[0] ;
         A1934BarReoTin = P08LA2_A1934BarReoTin[0] ;
         n1934BarReoTin = P08LA2_n1934BarReoTin[0] ;
         A1933BarCodTin = P08LA2_A1933BarCodTin[0] ;
         n1933BarCodTin = P08LA2_n1933BarCodTin[0] ;
         A3646EstTinAny = P08LA2_A3646EstTinAny[0] ;
         A3647EstTinMes = P08LA2_A3647EstTinMes[0] ;
         A3648EstTinDia = P08LA2_A3648EstTinDia[0] ;
         A279CliNom = P08LA2_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         if ( ! (GXutil.strcmp("", A13841Barnhdr_lc)==0) )
         {
            AV48Option = A13841Barnhdr_lc ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARAGRLOTOPTIONS' Routine */
      returnInSub = false ;
      AV40TFBarAgrLot = AV44SearchTxt ;
      AV41TFBarAgrLot_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV89FilterFullText ,
                                           AV10TFEstFecCier ,
                                           Short.valueOf(AV12TFEstTinNr) ,
                                           Short.valueOf(AV13TFEstTinNr_To) ,
                                           AV91TFBarnhdr_lconti_Sel ,
                                           AV90TFBarnhdr_lconti ,
                                           AV41TFBarAgrLot_Sel ,
                                           AV40TFBarAgrLot ,
                                           Integer.valueOf(AV14TFCliCod) ,
                                           Integer.valueOf(AV15TFCliCod_To) ,
                                           AV17TFCliNom_Sel ,
                                           AV16TFCliNom ,
                                           AV19TFBarSerTin_Sel ,
                                           AV18TFBarSerTin ,
                                           AV21TFBarDscTin_Sel ,
                                           AV20TFBarDscTin ,
                                           AV23TFBarColNoT_Sel ,
                                           AV22TFBarColNoT ,
                                           Integer.valueOf(AV24TFBarColNuT) ,
                                           Integer.valueOf(AV25TFBarColNuT_To) ,
                                           Byte.valueOf(AV26TFBarTipCoT) ,
                                           Byte.valueOf(AV27TFBarTipCoT_To) ,
                                           AV28TFBarKgmTin ,
                                           AV29TFBarKgmTin_To ,
                                           AV30TFBarKgsTt ,
                                           AV31TFBarKgsTt_To ,
                                           AV32TFBarMtrTin ,
                                           AV33TFBarMtrTin_To ,
                                           AV34TFBarMtsTt ,
                                           AV35TFBarMtsTt_To ,
                                           AV37TFBarMaqTin_Sel ,
                                           AV36TFBarMaqTin ,
                                           Integer.valueOf(AV38TFBarVolTin) ,
                                           Integer.valueOf(AV39TFBarVolTin_To) ,
                                           AV88TFBarDispCli_Sel ,
                                           AV87TFBarDispCli ,
                                           Short.valueOf(AV85TFBarNumAna) ,
                                           Short.valueOf(AV86TFBarNumAna_To) ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV63Fec1 ,
                                           AV64Fec3 ,
                                           Integer.valueOf(AV65PCliCod) ,
                                           Integer.valueOf(AV66CliCodP) ,
                                           Integer.valueOf(AV67PBarCod) ,
                                           Integer.valueOf(AV68Barcodp) ,
                                           Byte.valueOf(AV69PBarCodReo) ,
                                           Byte.valueOf(AV70BarCodReoP) ,
                                           AV71PBarCodPar ,
                                           AV72BarCodParP ,
                                           AV73PSerie ,
                                           AV74SerieP ,
                                           AV75PColor ,
                                           AV76ColorP ,
                                           Integer.valueOf(AV77PColNum) ,
                                           Integer.valueOf(AV78ColNumP) ,
                                           AV79DispCli1 ,
                                           AV80DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV81HreRacab ,
                                           AV82MaqCodi ,
                                           AV83MaqCod3 ,
                                           A396EmprCod ,
                                           AV62Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV90TFBarnhdr_lconti = GXutil.padr( GXutil.rtrim( AV90TFBarnhdr_lconti), 11, "%") ;
      lV40TFBarAgrLot = GXutil.padr( GXutil.rtrim( AV40TFBarAgrLot), 10, "%") ;
      lV16TFCliNom = GXutil.padr( GXutil.rtrim( AV16TFCliNom), 30, "%") ;
      lV18TFBarSerTin = GXutil.padr( GXutil.rtrim( AV18TFBarSerTin), 16, "%") ;
      lV20TFBarDscTin = GXutil.padr( GXutil.rtrim( AV20TFBarDscTin), 26, "%") ;
      lV22TFBarColNoT = GXutil.padr( GXutil.rtrim( AV22TFBarColNoT), 13, "%") ;
      lV36TFBarMaqTin = GXutil.padr( GXutil.rtrim( AV36TFBarMaqTin), 6, "%") ;
      lV87TFBarDispCli = GXutil.padr( GXutil.rtrim( AV87TFBarDispCli), 20, "%") ;
      /* Using cursor P08LA3 */
      pr_default.execute(1, new Object[] {AV63Fec1, AV64Fec3, Integer.valueOf(AV65PCliCod), Integer.valueOf(AV66CliCodP), Integer.valueOf(AV67PBarCod), Integer.valueOf(AV68Barcodp), Byte.valueOf(AV69PBarCodReo), Byte.valueOf(AV70BarCodReoP), AV71PBarCodPar, AV72BarCodParP, AV73PSerie, AV74SerieP, AV75PColor, AV76ColorP, Integer.valueOf(AV77PColNum), Integer.valueOf(AV78ColNumP), AV79DispCli1, AV80DispCli3, AV81HreRacab, AV81HreRacab, AV82MaqCodi, AV83MaqCod3, AV62Emprcod, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, AV10TFEstFecCier, Short.valueOf(AV12TFEstTinNr), Short.valueOf(AV13TFEstTinNr_To), lV90TFBarnhdr_lconti, AV91TFBarnhdr_lconti_Sel, lV40TFBarAgrLot, AV41TFBarAgrLot_Sel, Integer.valueOf(AV14TFCliCod), Integer.valueOf(AV15TFCliCod_To), lV16TFCliNom, AV17TFCliNom_Sel, lV18TFBarSerTin, AV19TFBarSerTin_Sel, lV20TFBarDscTin, AV21TFBarDscTin_Sel, lV22TFBarColNoT, AV23TFBarColNoT_Sel, Integer.valueOf(AV24TFBarColNuT), Integer.valueOf(AV25TFBarColNuT_To), Byte.valueOf(AV26TFBarTipCoT), Byte.valueOf(AV27TFBarTipCoT_To), AV28TFBarKgmTin, AV29TFBarKgmTin_To, AV30TFBarKgsTt, AV31TFBarKgsTt_To, AV32TFBarMtrTin, AV33TFBarMtrTin_To, AV34TFBarMtsTt, AV35TFBarMtsTt_To, lV36TFBarMaqTin, AV37TFBarMaqTin_Sel, Integer.valueOf(AV38TFBarVolTin), Integer.valueOf(AV39TFBarVolTin_To), lV87TFBarDispCli, AV88TFBarDispCli_Sel, Short.valueOf(AV85TFBarNumAna), Short.valueOf(AV86TFBarNumAna_To)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8LA3 = false ;
         A396EmprCod = P08LA3_A396EmprCod[0] ;
         A2316BarAgrLot = P08LA3_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08LA3_n2316BarAgrLot[0] ;
         A6634BarRecAcb = P08LA3_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08LA3_n6634BarRecAcb[0] ;
         A13759EstFecCier = P08LA3_A13759EstFecCier[0] ;
         A3650BarNumAna = P08LA3_A3650BarNumAna[0] ;
         n3650BarNumAna = P08LA3_n3650BarNumAna[0] ;
         A11762BarDispCli = P08LA3_A11762BarDispCli[0] ;
         n11762BarDispCli = P08LA3_n11762BarDispCli[0] ;
         A1946BarVolTin = P08LA3_A1946BarVolTin[0] ;
         n1946BarVolTin = P08LA3_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08LA3_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08LA3_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08LA3_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08LA3_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08LA3_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08LA3_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08LA3_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08LA3_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08LA3_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08LA3_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08LA3_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08LA3_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08LA3_A1941BarColNuT[0] ;
         n1941BarColNuT = P08LA3_n1941BarColNuT[0] ;
         A1940BarColNoT = P08LA3_A1940BarColNoT[0] ;
         n1940BarColNoT = P08LA3_n1940BarColNoT[0] ;
         A1937BarDscTin = P08LA3_A1937BarDscTin[0] ;
         n1937BarDscTin = P08LA3_n1937BarDscTin[0] ;
         A1936BarSerTin = P08LA3_A1936BarSerTin[0] ;
         n1936BarSerTin = P08LA3_n1936BarSerTin[0] ;
         A279CliNom = P08LA3_A279CliNom[0] ;
         A252CliCod = P08LA3_A252CliCod[0] ;
         A1929EstTinNr = P08LA3_A1929EstTinNr[0] ;
         A1935BarParTin = P08LA3_A1935BarParTin[0] ;
         n1935BarParTin = P08LA3_n1935BarParTin[0] ;
         A1934BarReoTin = P08LA3_A1934BarReoTin[0] ;
         n1934BarReoTin = P08LA3_n1934BarReoTin[0] ;
         A1933BarCodTin = P08LA3_A1933BarCodTin[0] ;
         n1933BarCodTin = P08LA3_n1933BarCodTin[0] ;
         A3646EstTinAny = P08LA3_A3646EstTinAny[0] ;
         A3647EstTinMes = P08LA3_A3647EstTinMes[0] ;
         A3648EstTinDia = P08LA3_A3648EstTinDia[0] ;
         A279CliNom = P08LA3_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08LA3_A2316BarAgrLot[0], A2316BarAgrLot) == 0 ) )
         {
            brk8LA3 = false ;
            A396EmprCod = P08LA3_A396EmprCod[0] ;
            A1929EstTinNr = P08LA3_A1929EstTinNr[0] ;
            A3646EstTinAny = P08LA3_A3646EstTinAny[0] ;
            A3647EstTinMes = P08LA3_A3647EstTinMes[0] ;
            A3648EstTinDia = P08LA3_A3648EstTinDia[0] ;
            AV56count = (long)(AV56count+1) ;
            brk8LA3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2316BarAgrLot)==0) )
         {
            AV48Option = A2316BarAgrLot ;
            AV49Options.add(AV48Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8LA3 )
         {
            brk8LA3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV44SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV89FilterFullText ,
                                           AV10TFEstFecCier ,
                                           Short.valueOf(AV12TFEstTinNr) ,
                                           Short.valueOf(AV13TFEstTinNr_To) ,
                                           AV91TFBarnhdr_lconti_Sel ,
                                           AV90TFBarnhdr_lconti ,
                                           AV41TFBarAgrLot_Sel ,
                                           AV40TFBarAgrLot ,
                                           Integer.valueOf(AV14TFCliCod) ,
                                           Integer.valueOf(AV15TFCliCod_To) ,
                                           AV17TFCliNom_Sel ,
                                           AV16TFCliNom ,
                                           AV19TFBarSerTin_Sel ,
                                           AV18TFBarSerTin ,
                                           AV21TFBarDscTin_Sel ,
                                           AV20TFBarDscTin ,
                                           AV23TFBarColNoT_Sel ,
                                           AV22TFBarColNoT ,
                                           Integer.valueOf(AV24TFBarColNuT) ,
                                           Integer.valueOf(AV25TFBarColNuT_To) ,
                                           Byte.valueOf(AV26TFBarTipCoT) ,
                                           Byte.valueOf(AV27TFBarTipCoT_To) ,
                                           AV28TFBarKgmTin ,
                                           AV29TFBarKgmTin_To ,
                                           AV30TFBarKgsTt ,
                                           AV31TFBarKgsTt_To ,
                                           AV32TFBarMtrTin ,
                                           AV33TFBarMtrTin_To ,
                                           AV34TFBarMtsTt ,
                                           AV35TFBarMtsTt_To ,
                                           AV37TFBarMaqTin_Sel ,
                                           AV36TFBarMaqTin ,
                                           Integer.valueOf(AV38TFBarVolTin) ,
                                           Integer.valueOf(AV39TFBarVolTin_To) ,
                                           AV88TFBarDispCli_Sel ,
                                           AV87TFBarDispCli ,
                                           Short.valueOf(AV85TFBarNumAna) ,
                                           Short.valueOf(AV86TFBarNumAna_To) ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV63Fec1 ,
                                           AV64Fec3 ,
                                           Integer.valueOf(AV65PCliCod) ,
                                           Integer.valueOf(AV66CliCodP) ,
                                           Integer.valueOf(AV67PBarCod) ,
                                           Integer.valueOf(AV68Barcodp) ,
                                           Byte.valueOf(AV69PBarCodReo) ,
                                           Byte.valueOf(AV70BarCodReoP) ,
                                           AV71PBarCodPar ,
                                           AV72BarCodParP ,
                                           AV73PSerie ,
                                           AV74SerieP ,
                                           AV75PColor ,
                                           AV76ColorP ,
                                           Integer.valueOf(AV77PColNum) ,
                                           Integer.valueOf(AV78ColNumP) ,
                                           AV79DispCli1 ,
                                           AV80DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV81HreRacab ,
                                           AV82MaqCodi ,
                                           AV83MaqCod3 ,
                                           A396EmprCod ,
                                           AV62Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV90TFBarnhdr_lconti = GXutil.padr( GXutil.rtrim( AV90TFBarnhdr_lconti), 11, "%") ;
      lV40TFBarAgrLot = GXutil.padr( GXutil.rtrim( AV40TFBarAgrLot), 10, "%") ;
      lV16TFCliNom = GXutil.padr( GXutil.rtrim( AV16TFCliNom), 30, "%") ;
      lV18TFBarSerTin = GXutil.padr( GXutil.rtrim( AV18TFBarSerTin), 16, "%") ;
      lV20TFBarDscTin = GXutil.padr( GXutil.rtrim( AV20TFBarDscTin), 26, "%") ;
      lV22TFBarColNoT = GXutil.padr( GXutil.rtrim( AV22TFBarColNoT), 13, "%") ;
      lV36TFBarMaqTin = GXutil.padr( GXutil.rtrim( AV36TFBarMaqTin), 6, "%") ;
      lV87TFBarDispCli = GXutil.padr( GXutil.rtrim( AV87TFBarDispCli), 20, "%") ;
      /* Using cursor P08LA4 */
      pr_default.execute(2, new Object[] {AV63Fec1, AV64Fec3, Integer.valueOf(AV65PCliCod), Integer.valueOf(AV66CliCodP), Integer.valueOf(AV67PBarCod), Integer.valueOf(AV68Barcodp), Byte.valueOf(AV69PBarCodReo), Byte.valueOf(AV70BarCodReoP), AV71PBarCodPar, AV72BarCodParP, AV73PSerie, AV74SerieP, AV75PColor, AV76ColorP, Integer.valueOf(AV77PColNum), Integer.valueOf(AV78ColNumP), AV79DispCli1, AV80DispCli3, AV81HreRacab, AV81HreRacab, AV82MaqCodi, AV83MaqCod3, AV62Emprcod, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, AV10TFEstFecCier, Short.valueOf(AV12TFEstTinNr), Short.valueOf(AV13TFEstTinNr_To), lV90TFBarnhdr_lconti, AV91TFBarnhdr_lconti_Sel, lV40TFBarAgrLot, AV41TFBarAgrLot_Sel, Integer.valueOf(AV14TFCliCod), Integer.valueOf(AV15TFCliCod_To), lV16TFCliNom, AV17TFCliNom_Sel, lV18TFBarSerTin, AV19TFBarSerTin_Sel, lV20TFBarDscTin, AV21TFBarDscTin_Sel, lV22TFBarColNoT, AV23TFBarColNoT_Sel, Integer.valueOf(AV24TFBarColNuT), Integer.valueOf(AV25TFBarColNuT_To), Byte.valueOf(AV26TFBarTipCoT), Byte.valueOf(AV27TFBarTipCoT_To), AV28TFBarKgmTin, AV29TFBarKgmTin_To, AV30TFBarKgsTt, AV31TFBarKgsTt_To, AV32TFBarMtrTin, AV33TFBarMtrTin_To, AV34TFBarMtsTt, AV35TFBarMtsTt_To, lV36TFBarMaqTin, AV37TFBarMaqTin_Sel, Integer.valueOf(AV38TFBarVolTin), Integer.valueOf(AV39TFBarVolTin_To), lV87TFBarDispCli, AV88TFBarDispCli_Sel, Short.valueOf(AV85TFBarNumAna), Short.valueOf(AV86TFBarNumAna_To)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8LA5 = false ;
         A396EmprCod = P08LA4_A396EmprCod[0] ;
         A279CliNom = P08LA4_A279CliNom[0] ;
         A6634BarRecAcb = P08LA4_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08LA4_n6634BarRecAcb[0] ;
         A13759EstFecCier = P08LA4_A13759EstFecCier[0] ;
         A3650BarNumAna = P08LA4_A3650BarNumAna[0] ;
         n3650BarNumAna = P08LA4_n3650BarNumAna[0] ;
         A11762BarDispCli = P08LA4_A11762BarDispCli[0] ;
         n11762BarDispCli = P08LA4_n11762BarDispCli[0] ;
         A1946BarVolTin = P08LA4_A1946BarVolTin[0] ;
         n1946BarVolTin = P08LA4_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08LA4_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08LA4_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08LA4_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08LA4_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08LA4_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08LA4_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08LA4_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08LA4_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08LA4_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08LA4_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08LA4_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08LA4_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08LA4_A1941BarColNuT[0] ;
         n1941BarColNuT = P08LA4_n1941BarColNuT[0] ;
         A1940BarColNoT = P08LA4_A1940BarColNoT[0] ;
         n1940BarColNoT = P08LA4_n1940BarColNoT[0] ;
         A1937BarDscTin = P08LA4_A1937BarDscTin[0] ;
         n1937BarDscTin = P08LA4_n1937BarDscTin[0] ;
         A1936BarSerTin = P08LA4_A1936BarSerTin[0] ;
         n1936BarSerTin = P08LA4_n1936BarSerTin[0] ;
         A252CliCod = P08LA4_A252CliCod[0] ;
         A2316BarAgrLot = P08LA4_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08LA4_n2316BarAgrLot[0] ;
         A1929EstTinNr = P08LA4_A1929EstTinNr[0] ;
         A1935BarParTin = P08LA4_A1935BarParTin[0] ;
         n1935BarParTin = P08LA4_n1935BarParTin[0] ;
         A1934BarReoTin = P08LA4_A1934BarReoTin[0] ;
         n1934BarReoTin = P08LA4_n1934BarReoTin[0] ;
         A1933BarCodTin = P08LA4_A1933BarCodTin[0] ;
         n1933BarCodTin = P08LA4_n1933BarCodTin[0] ;
         A3646EstTinAny = P08LA4_A3646EstTinAny[0] ;
         A3647EstTinMes = P08LA4_A3647EstTinMes[0] ;
         A3648EstTinDia = P08LA4_A3648EstTinDia[0] ;
         A279CliNom = P08LA4_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08LA4_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk8LA5 = false ;
            A396EmprCod = P08LA4_A396EmprCod[0] ;
            A252CliCod = P08LA4_A252CliCod[0] ;
            A1929EstTinNr = P08LA4_A1929EstTinNr[0] ;
            A3646EstTinAny = P08LA4_A3646EstTinAny[0] ;
            A3647EstTinMes = P08LA4_A3647EstTinMes[0] ;
            A3648EstTinDia = P08LA4_A3648EstTinDia[0] ;
            AV56count = (long)(AV56count+1) ;
            brk8LA5 = true ;
            pr_default.readNext(2);
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
         if ( ! brk8LA5 )
         {
            brk8LA5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERTINOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarSerTin = AV44SearchTxt ;
      AV19TFBarSerTin_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV89FilterFullText ,
                                           AV10TFEstFecCier ,
                                           Short.valueOf(AV12TFEstTinNr) ,
                                           Short.valueOf(AV13TFEstTinNr_To) ,
                                           AV91TFBarnhdr_lconti_Sel ,
                                           AV90TFBarnhdr_lconti ,
                                           AV41TFBarAgrLot_Sel ,
                                           AV40TFBarAgrLot ,
                                           Integer.valueOf(AV14TFCliCod) ,
                                           Integer.valueOf(AV15TFCliCod_To) ,
                                           AV17TFCliNom_Sel ,
                                           AV16TFCliNom ,
                                           AV19TFBarSerTin_Sel ,
                                           AV18TFBarSerTin ,
                                           AV21TFBarDscTin_Sel ,
                                           AV20TFBarDscTin ,
                                           AV23TFBarColNoT_Sel ,
                                           AV22TFBarColNoT ,
                                           Integer.valueOf(AV24TFBarColNuT) ,
                                           Integer.valueOf(AV25TFBarColNuT_To) ,
                                           Byte.valueOf(AV26TFBarTipCoT) ,
                                           Byte.valueOf(AV27TFBarTipCoT_To) ,
                                           AV28TFBarKgmTin ,
                                           AV29TFBarKgmTin_To ,
                                           AV30TFBarKgsTt ,
                                           AV31TFBarKgsTt_To ,
                                           AV32TFBarMtrTin ,
                                           AV33TFBarMtrTin_To ,
                                           AV34TFBarMtsTt ,
                                           AV35TFBarMtsTt_To ,
                                           AV37TFBarMaqTin_Sel ,
                                           AV36TFBarMaqTin ,
                                           Integer.valueOf(AV38TFBarVolTin) ,
                                           Integer.valueOf(AV39TFBarVolTin_To) ,
                                           AV88TFBarDispCli_Sel ,
                                           AV87TFBarDispCli ,
                                           Short.valueOf(AV85TFBarNumAna) ,
                                           Short.valueOf(AV86TFBarNumAna_To) ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV63Fec1 ,
                                           AV64Fec3 ,
                                           Integer.valueOf(AV65PCliCod) ,
                                           Integer.valueOf(AV66CliCodP) ,
                                           Integer.valueOf(AV67PBarCod) ,
                                           Integer.valueOf(AV68Barcodp) ,
                                           Byte.valueOf(AV69PBarCodReo) ,
                                           Byte.valueOf(AV70BarCodReoP) ,
                                           AV71PBarCodPar ,
                                           AV72BarCodParP ,
                                           AV75PColor ,
                                           AV76ColorP ,
                                           Integer.valueOf(AV77PColNum) ,
                                           Integer.valueOf(AV78ColNumP) ,
                                           AV79DispCli1 ,
                                           AV80DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV81HreRacab ,
                                           AV82MaqCodi ,
                                           AV83MaqCod3 ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           AV73PSerie ,
                                           AV74SerieP } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV90TFBarnhdr_lconti = GXutil.padr( GXutil.rtrim( AV90TFBarnhdr_lconti), 11, "%") ;
      lV40TFBarAgrLot = GXutil.padr( GXutil.rtrim( AV40TFBarAgrLot), 10, "%") ;
      lV16TFCliNom = GXutil.padr( GXutil.rtrim( AV16TFCliNom), 30, "%") ;
      lV18TFBarSerTin = GXutil.padr( GXutil.rtrim( AV18TFBarSerTin), 16, "%") ;
      lV20TFBarDscTin = GXutil.padr( GXutil.rtrim( AV20TFBarDscTin), 26, "%") ;
      lV22TFBarColNoT = GXutil.padr( GXutil.rtrim( AV22TFBarColNoT), 13, "%") ;
      lV36TFBarMaqTin = GXutil.padr( GXutil.rtrim( AV36TFBarMaqTin), 6, "%") ;
      lV87TFBarDispCli = GXutil.padr( GXutil.rtrim( AV87TFBarDispCli), 20, "%") ;
      /* Using cursor P08LA5 */
      pr_default.execute(3, new Object[] {AV73PSerie, AV63Fec1, AV64Fec3, Integer.valueOf(AV65PCliCod), Integer.valueOf(AV66CliCodP), Integer.valueOf(AV67PBarCod), Integer.valueOf(AV68Barcodp), Byte.valueOf(AV69PBarCodReo), Byte.valueOf(AV70BarCodReoP), AV71PBarCodPar, AV72BarCodParP, AV75PColor, AV76ColorP, Integer.valueOf(AV77PColNum), Integer.valueOf(AV78ColNumP), AV79DispCli1, AV80DispCli3, AV81HreRacab, AV81HreRacab, AV82MaqCodi, AV83MaqCod3, AV62Emprcod, AV74SerieP, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, AV10TFEstFecCier, Short.valueOf(AV12TFEstTinNr), Short.valueOf(AV13TFEstTinNr_To), lV90TFBarnhdr_lconti, AV91TFBarnhdr_lconti_Sel, lV40TFBarAgrLot, AV41TFBarAgrLot_Sel, Integer.valueOf(AV14TFCliCod), Integer.valueOf(AV15TFCliCod_To), lV16TFCliNom, AV17TFCliNom_Sel, lV18TFBarSerTin, AV19TFBarSerTin_Sel, lV20TFBarDscTin, AV21TFBarDscTin_Sel, lV22TFBarColNoT, AV23TFBarColNoT_Sel, Integer.valueOf(AV24TFBarColNuT), Integer.valueOf(AV25TFBarColNuT_To), Byte.valueOf(AV26TFBarTipCoT), Byte.valueOf(AV27TFBarTipCoT_To), AV28TFBarKgmTin, AV29TFBarKgmTin_To, AV30TFBarKgsTt, AV31TFBarKgsTt_To, AV32TFBarMtrTin, AV33TFBarMtrTin_To, AV34TFBarMtsTt, AV35TFBarMtsTt_To, lV36TFBarMaqTin, AV37TFBarMaqTin_Sel, Integer.valueOf(AV38TFBarVolTin), Integer.valueOf(AV39TFBarVolTin_To), lV87TFBarDispCli, AV88TFBarDispCli_Sel, Short.valueOf(AV85TFBarNumAna), Short.valueOf(AV86TFBarNumAna_To)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8LA7 = false ;
         A396EmprCod = P08LA5_A396EmprCod[0] ;
         A1936BarSerTin = P08LA5_A1936BarSerTin[0] ;
         n1936BarSerTin = P08LA5_n1936BarSerTin[0] ;
         A6634BarRecAcb = P08LA5_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08LA5_n6634BarRecAcb[0] ;
         A13759EstFecCier = P08LA5_A13759EstFecCier[0] ;
         A3650BarNumAna = P08LA5_A3650BarNumAna[0] ;
         n3650BarNumAna = P08LA5_n3650BarNumAna[0] ;
         A11762BarDispCli = P08LA5_A11762BarDispCli[0] ;
         n11762BarDispCli = P08LA5_n11762BarDispCli[0] ;
         A1946BarVolTin = P08LA5_A1946BarVolTin[0] ;
         n1946BarVolTin = P08LA5_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08LA5_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08LA5_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08LA5_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08LA5_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08LA5_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08LA5_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08LA5_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08LA5_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08LA5_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08LA5_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08LA5_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08LA5_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08LA5_A1941BarColNuT[0] ;
         n1941BarColNuT = P08LA5_n1941BarColNuT[0] ;
         A1940BarColNoT = P08LA5_A1940BarColNoT[0] ;
         n1940BarColNoT = P08LA5_n1940BarColNoT[0] ;
         A1937BarDscTin = P08LA5_A1937BarDscTin[0] ;
         n1937BarDscTin = P08LA5_n1937BarDscTin[0] ;
         A279CliNom = P08LA5_A279CliNom[0] ;
         A252CliCod = P08LA5_A252CliCod[0] ;
         A2316BarAgrLot = P08LA5_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08LA5_n2316BarAgrLot[0] ;
         A1929EstTinNr = P08LA5_A1929EstTinNr[0] ;
         A1935BarParTin = P08LA5_A1935BarParTin[0] ;
         n1935BarParTin = P08LA5_n1935BarParTin[0] ;
         A1934BarReoTin = P08LA5_A1934BarReoTin[0] ;
         n1934BarReoTin = P08LA5_n1934BarReoTin[0] ;
         A1933BarCodTin = P08LA5_A1933BarCodTin[0] ;
         n1933BarCodTin = P08LA5_n1933BarCodTin[0] ;
         A3646EstTinAny = P08LA5_A3646EstTinAny[0] ;
         A3647EstTinMes = P08LA5_A3647EstTinMes[0] ;
         A3648EstTinDia = P08LA5_A3648EstTinDia[0] ;
         A279CliNom = P08LA5_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08LA5_A1936BarSerTin[0], A1936BarSerTin) == 0 ) )
         {
            brk8LA7 = false ;
            A396EmprCod = P08LA5_A396EmprCod[0] ;
            A1929EstTinNr = P08LA5_A1929EstTinNr[0] ;
            A3646EstTinAny = P08LA5_A3646EstTinAny[0] ;
            A3647EstTinMes = P08LA5_A3647EstTinMes[0] ;
            A3648EstTinDia = P08LA5_A3648EstTinDia[0] ;
            AV56count = (long)(AV56count+1) ;
            brk8LA7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1936BarSerTin)==0) )
         {
            AV48Option = A1936BarSerTin ;
            AV49Options.add(AV48Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8LA7 )
         {
            brk8LA7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARDSCTINOPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarDscTin = AV44SearchTxt ;
      AV21TFBarDscTin_Sel = "" ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV89FilterFullText ,
                                           AV10TFEstFecCier ,
                                           Short.valueOf(AV12TFEstTinNr) ,
                                           Short.valueOf(AV13TFEstTinNr_To) ,
                                           AV91TFBarnhdr_lconti_Sel ,
                                           AV90TFBarnhdr_lconti ,
                                           AV41TFBarAgrLot_Sel ,
                                           AV40TFBarAgrLot ,
                                           Integer.valueOf(AV14TFCliCod) ,
                                           Integer.valueOf(AV15TFCliCod_To) ,
                                           AV17TFCliNom_Sel ,
                                           AV16TFCliNom ,
                                           AV19TFBarSerTin_Sel ,
                                           AV18TFBarSerTin ,
                                           AV21TFBarDscTin_Sel ,
                                           AV20TFBarDscTin ,
                                           AV23TFBarColNoT_Sel ,
                                           AV22TFBarColNoT ,
                                           Integer.valueOf(AV24TFBarColNuT) ,
                                           Integer.valueOf(AV25TFBarColNuT_To) ,
                                           Byte.valueOf(AV26TFBarTipCoT) ,
                                           Byte.valueOf(AV27TFBarTipCoT_To) ,
                                           AV28TFBarKgmTin ,
                                           AV29TFBarKgmTin_To ,
                                           AV30TFBarKgsTt ,
                                           AV31TFBarKgsTt_To ,
                                           AV32TFBarMtrTin ,
                                           AV33TFBarMtrTin_To ,
                                           AV34TFBarMtsTt ,
                                           AV35TFBarMtsTt_To ,
                                           AV37TFBarMaqTin_Sel ,
                                           AV36TFBarMaqTin ,
                                           Integer.valueOf(AV38TFBarVolTin) ,
                                           Integer.valueOf(AV39TFBarVolTin_To) ,
                                           AV88TFBarDispCli_Sel ,
                                           AV87TFBarDispCli ,
                                           Short.valueOf(AV85TFBarNumAna) ,
                                           Short.valueOf(AV86TFBarNumAna_To) ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV63Fec1 ,
                                           AV64Fec3 ,
                                           Integer.valueOf(AV65PCliCod) ,
                                           Integer.valueOf(AV66CliCodP) ,
                                           Integer.valueOf(AV67PBarCod) ,
                                           Integer.valueOf(AV68Barcodp) ,
                                           Byte.valueOf(AV69PBarCodReo) ,
                                           Byte.valueOf(AV70BarCodReoP) ,
                                           AV71PBarCodPar ,
                                           AV72BarCodParP ,
                                           AV73PSerie ,
                                           AV74SerieP ,
                                           AV75PColor ,
                                           AV76ColorP ,
                                           Integer.valueOf(AV77PColNum) ,
                                           Integer.valueOf(AV78ColNumP) ,
                                           AV79DispCli1 ,
                                           AV80DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV81HreRacab ,
                                           AV82MaqCodi ,
                                           AV83MaqCod3 ,
                                           A396EmprCod ,
                                           AV62Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV90TFBarnhdr_lconti = GXutil.padr( GXutil.rtrim( AV90TFBarnhdr_lconti), 11, "%") ;
      lV40TFBarAgrLot = GXutil.padr( GXutil.rtrim( AV40TFBarAgrLot), 10, "%") ;
      lV16TFCliNom = GXutil.padr( GXutil.rtrim( AV16TFCliNom), 30, "%") ;
      lV18TFBarSerTin = GXutil.padr( GXutil.rtrim( AV18TFBarSerTin), 16, "%") ;
      lV20TFBarDscTin = GXutil.padr( GXutil.rtrim( AV20TFBarDscTin), 26, "%") ;
      lV22TFBarColNoT = GXutil.padr( GXutil.rtrim( AV22TFBarColNoT), 13, "%") ;
      lV36TFBarMaqTin = GXutil.padr( GXutil.rtrim( AV36TFBarMaqTin), 6, "%") ;
      lV87TFBarDispCli = GXutil.padr( GXutil.rtrim( AV87TFBarDispCli), 20, "%") ;
      /* Using cursor P08LA6 */
      pr_default.execute(4, new Object[] {AV63Fec1, AV64Fec3, Integer.valueOf(AV65PCliCod), Integer.valueOf(AV66CliCodP), Integer.valueOf(AV67PBarCod), Integer.valueOf(AV68Barcodp), Byte.valueOf(AV69PBarCodReo), Byte.valueOf(AV70BarCodReoP), AV71PBarCodPar, AV72BarCodParP, AV73PSerie, AV74SerieP, AV75PColor, AV76ColorP, Integer.valueOf(AV77PColNum), Integer.valueOf(AV78ColNumP), AV79DispCli1, AV80DispCli3, AV81HreRacab, AV81HreRacab, AV82MaqCodi, AV83MaqCod3, AV62Emprcod, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, AV10TFEstFecCier, Short.valueOf(AV12TFEstTinNr), Short.valueOf(AV13TFEstTinNr_To), lV90TFBarnhdr_lconti, AV91TFBarnhdr_lconti_Sel, lV40TFBarAgrLot, AV41TFBarAgrLot_Sel, Integer.valueOf(AV14TFCliCod), Integer.valueOf(AV15TFCliCod_To), lV16TFCliNom, AV17TFCliNom_Sel, lV18TFBarSerTin, AV19TFBarSerTin_Sel, lV20TFBarDscTin, AV21TFBarDscTin_Sel, lV22TFBarColNoT, AV23TFBarColNoT_Sel, Integer.valueOf(AV24TFBarColNuT), Integer.valueOf(AV25TFBarColNuT_To), Byte.valueOf(AV26TFBarTipCoT), Byte.valueOf(AV27TFBarTipCoT_To), AV28TFBarKgmTin, AV29TFBarKgmTin_To, AV30TFBarKgsTt, AV31TFBarKgsTt_To, AV32TFBarMtrTin, AV33TFBarMtrTin_To, AV34TFBarMtsTt, AV35TFBarMtsTt_To, lV36TFBarMaqTin, AV37TFBarMaqTin_Sel, Integer.valueOf(AV38TFBarVolTin), Integer.valueOf(AV39TFBarVolTin_To), lV87TFBarDispCli, AV88TFBarDispCli_Sel, Short.valueOf(AV85TFBarNumAna), Short.valueOf(AV86TFBarNumAna_To)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8LA9 = false ;
         A396EmprCod = P08LA6_A396EmprCod[0] ;
         A1937BarDscTin = P08LA6_A1937BarDscTin[0] ;
         n1937BarDscTin = P08LA6_n1937BarDscTin[0] ;
         A6634BarRecAcb = P08LA6_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08LA6_n6634BarRecAcb[0] ;
         A13759EstFecCier = P08LA6_A13759EstFecCier[0] ;
         A3650BarNumAna = P08LA6_A3650BarNumAna[0] ;
         n3650BarNumAna = P08LA6_n3650BarNumAna[0] ;
         A11762BarDispCli = P08LA6_A11762BarDispCli[0] ;
         n11762BarDispCli = P08LA6_n11762BarDispCli[0] ;
         A1946BarVolTin = P08LA6_A1946BarVolTin[0] ;
         n1946BarVolTin = P08LA6_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08LA6_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08LA6_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08LA6_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08LA6_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08LA6_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08LA6_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08LA6_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08LA6_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08LA6_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08LA6_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08LA6_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08LA6_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08LA6_A1941BarColNuT[0] ;
         n1941BarColNuT = P08LA6_n1941BarColNuT[0] ;
         A1940BarColNoT = P08LA6_A1940BarColNoT[0] ;
         n1940BarColNoT = P08LA6_n1940BarColNoT[0] ;
         A1936BarSerTin = P08LA6_A1936BarSerTin[0] ;
         n1936BarSerTin = P08LA6_n1936BarSerTin[0] ;
         A279CliNom = P08LA6_A279CliNom[0] ;
         A252CliCod = P08LA6_A252CliCod[0] ;
         A2316BarAgrLot = P08LA6_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08LA6_n2316BarAgrLot[0] ;
         A1929EstTinNr = P08LA6_A1929EstTinNr[0] ;
         A1935BarParTin = P08LA6_A1935BarParTin[0] ;
         n1935BarParTin = P08LA6_n1935BarParTin[0] ;
         A1934BarReoTin = P08LA6_A1934BarReoTin[0] ;
         n1934BarReoTin = P08LA6_n1934BarReoTin[0] ;
         A1933BarCodTin = P08LA6_A1933BarCodTin[0] ;
         n1933BarCodTin = P08LA6_n1933BarCodTin[0] ;
         A3646EstTinAny = P08LA6_A3646EstTinAny[0] ;
         A3647EstTinMes = P08LA6_A3647EstTinMes[0] ;
         A3648EstTinDia = P08LA6_A3648EstTinDia[0] ;
         A279CliNom = P08LA6_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08LA6_A1937BarDscTin[0], A1937BarDscTin) == 0 ) )
         {
            brk8LA9 = false ;
            A396EmprCod = P08LA6_A396EmprCod[0] ;
            A1929EstTinNr = P08LA6_A1929EstTinNr[0] ;
            A3646EstTinAny = P08LA6_A3646EstTinAny[0] ;
            A3647EstTinMes = P08LA6_A3647EstTinMes[0] ;
            A3648EstTinDia = P08LA6_A3648EstTinDia[0] ;
            AV56count = (long)(AV56count+1) ;
            brk8LA9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1937BarDscTin)==0) )
         {
            AV48Option = A1937BarDscTin ;
            AV49Options.add(AV48Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8LA9 )
         {
            brk8LA9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARCOLNOTOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarColNoT = AV44SearchTxt ;
      AV23TFBarColNoT_Sel = "" ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV89FilterFullText ,
                                           AV10TFEstFecCier ,
                                           Short.valueOf(AV12TFEstTinNr) ,
                                           Short.valueOf(AV13TFEstTinNr_To) ,
                                           AV91TFBarnhdr_lconti_Sel ,
                                           AV90TFBarnhdr_lconti ,
                                           AV41TFBarAgrLot_Sel ,
                                           AV40TFBarAgrLot ,
                                           Integer.valueOf(AV14TFCliCod) ,
                                           Integer.valueOf(AV15TFCliCod_To) ,
                                           AV17TFCliNom_Sel ,
                                           AV16TFCliNom ,
                                           AV19TFBarSerTin_Sel ,
                                           AV18TFBarSerTin ,
                                           AV21TFBarDscTin_Sel ,
                                           AV20TFBarDscTin ,
                                           AV23TFBarColNoT_Sel ,
                                           AV22TFBarColNoT ,
                                           Integer.valueOf(AV24TFBarColNuT) ,
                                           Integer.valueOf(AV25TFBarColNuT_To) ,
                                           Byte.valueOf(AV26TFBarTipCoT) ,
                                           Byte.valueOf(AV27TFBarTipCoT_To) ,
                                           AV28TFBarKgmTin ,
                                           AV29TFBarKgmTin_To ,
                                           AV30TFBarKgsTt ,
                                           AV31TFBarKgsTt_To ,
                                           AV32TFBarMtrTin ,
                                           AV33TFBarMtrTin_To ,
                                           AV34TFBarMtsTt ,
                                           AV35TFBarMtsTt_To ,
                                           AV37TFBarMaqTin_Sel ,
                                           AV36TFBarMaqTin ,
                                           Integer.valueOf(AV38TFBarVolTin) ,
                                           Integer.valueOf(AV39TFBarVolTin_To) ,
                                           AV88TFBarDispCli_Sel ,
                                           AV87TFBarDispCli ,
                                           Short.valueOf(AV85TFBarNumAna) ,
                                           Short.valueOf(AV86TFBarNumAna_To) ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV63Fec1 ,
                                           AV64Fec3 ,
                                           Integer.valueOf(AV65PCliCod) ,
                                           Integer.valueOf(AV66CliCodP) ,
                                           Integer.valueOf(AV67PBarCod) ,
                                           Integer.valueOf(AV68Barcodp) ,
                                           Byte.valueOf(AV69PBarCodReo) ,
                                           Byte.valueOf(AV70BarCodReoP) ,
                                           AV71PBarCodPar ,
                                           AV72BarCodParP ,
                                           AV73PSerie ,
                                           AV74SerieP ,
                                           Integer.valueOf(AV77PColNum) ,
                                           Integer.valueOf(AV78ColNumP) ,
                                           AV79DispCli1 ,
                                           AV80DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV81HreRacab ,
                                           AV82MaqCodi ,
                                           AV83MaqCod3 ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           AV75PColor ,
                                           AV76ColorP } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV90TFBarnhdr_lconti = GXutil.padr( GXutil.rtrim( AV90TFBarnhdr_lconti), 11, "%") ;
      lV40TFBarAgrLot = GXutil.padr( GXutil.rtrim( AV40TFBarAgrLot), 10, "%") ;
      lV16TFCliNom = GXutil.padr( GXutil.rtrim( AV16TFCliNom), 30, "%") ;
      lV18TFBarSerTin = GXutil.padr( GXutil.rtrim( AV18TFBarSerTin), 16, "%") ;
      lV20TFBarDscTin = GXutil.padr( GXutil.rtrim( AV20TFBarDscTin), 26, "%") ;
      lV22TFBarColNoT = GXutil.padr( GXutil.rtrim( AV22TFBarColNoT), 13, "%") ;
      lV36TFBarMaqTin = GXutil.padr( GXutil.rtrim( AV36TFBarMaqTin), 6, "%") ;
      lV87TFBarDispCli = GXutil.padr( GXutil.rtrim( AV87TFBarDispCli), 20, "%") ;
      /* Using cursor P08LA7 */
      pr_default.execute(5, new Object[] {AV75PColor, AV63Fec1, AV64Fec3, Integer.valueOf(AV65PCliCod), Integer.valueOf(AV66CliCodP), Integer.valueOf(AV67PBarCod), Integer.valueOf(AV68Barcodp), Byte.valueOf(AV69PBarCodReo), Byte.valueOf(AV70BarCodReoP), AV71PBarCodPar, AV72BarCodParP, AV73PSerie, AV74SerieP, Integer.valueOf(AV77PColNum), Integer.valueOf(AV78ColNumP), AV79DispCli1, AV80DispCli3, AV81HreRacab, AV81HreRacab, AV82MaqCodi, AV83MaqCod3, AV62Emprcod, AV76ColorP, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, AV10TFEstFecCier, Short.valueOf(AV12TFEstTinNr), Short.valueOf(AV13TFEstTinNr_To), lV90TFBarnhdr_lconti, AV91TFBarnhdr_lconti_Sel, lV40TFBarAgrLot, AV41TFBarAgrLot_Sel, Integer.valueOf(AV14TFCliCod), Integer.valueOf(AV15TFCliCod_To), lV16TFCliNom, AV17TFCliNom_Sel, lV18TFBarSerTin, AV19TFBarSerTin_Sel, lV20TFBarDscTin, AV21TFBarDscTin_Sel, lV22TFBarColNoT, AV23TFBarColNoT_Sel, Integer.valueOf(AV24TFBarColNuT), Integer.valueOf(AV25TFBarColNuT_To), Byte.valueOf(AV26TFBarTipCoT), Byte.valueOf(AV27TFBarTipCoT_To), AV28TFBarKgmTin, AV29TFBarKgmTin_To, AV30TFBarKgsTt, AV31TFBarKgsTt_To, AV32TFBarMtrTin, AV33TFBarMtrTin_To, AV34TFBarMtsTt, AV35TFBarMtsTt_To, lV36TFBarMaqTin, AV37TFBarMaqTin_Sel, Integer.valueOf(AV38TFBarVolTin), Integer.valueOf(AV39TFBarVolTin_To), lV87TFBarDispCli, AV88TFBarDispCli_Sel, Short.valueOf(AV85TFBarNumAna), Short.valueOf(AV86TFBarNumAna_To)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8LA11 = false ;
         A396EmprCod = P08LA7_A396EmprCod[0] ;
         A1940BarColNoT = P08LA7_A1940BarColNoT[0] ;
         n1940BarColNoT = P08LA7_n1940BarColNoT[0] ;
         A6634BarRecAcb = P08LA7_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08LA7_n6634BarRecAcb[0] ;
         A13759EstFecCier = P08LA7_A13759EstFecCier[0] ;
         A3650BarNumAna = P08LA7_A3650BarNumAna[0] ;
         n3650BarNumAna = P08LA7_n3650BarNumAna[0] ;
         A11762BarDispCli = P08LA7_A11762BarDispCli[0] ;
         n11762BarDispCli = P08LA7_n11762BarDispCli[0] ;
         A1946BarVolTin = P08LA7_A1946BarVolTin[0] ;
         n1946BarVolTin = P08LA7_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08LA7_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08LA7_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08LA7_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08LA7_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08LA7_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08LA7_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08LA7_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08LA7_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08LA7_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08LA7_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08LA7_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08LA7_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08LA7_A1941BarColNuT[0] ;
         n1941BarColNuT = P08LA7_n1941BarColNuT[0] ;
         A1937BarDscTin = P08LA7_A1937BarDscTin[0] ;
         n1937BarDscTin = P08LA7_n1937BarDscTin[0] ;
         A1936BarSerTin = P08LA7_A1936BarSerTin[0] ;
         n1936BarSerTin = P08LA7_n1936BarSerTin[0] ;
         A279CliNom = P08LA7_A279CliNom[0] ;
         A252CliCod = P08LA7_A252CliCod[0] ;
         A2316BarAgrLot = P08LA7_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08LA7_n2316BarAgrLot[0] ;
         A1929EstTinNr = P08LA7_A1929EstTinNr[0] ;
         A1935BarParTin = P08LA7_A1935BarParTin[0] ;
         n1935BarParTin = P08LA7_n1935BarParTin[0] ;
         A1934BarReoTin = P08LA7_A1934BarReoTin[0] ;
         n1934BarReoTin = P08LA7_n1934BarReoTin[0] ;
         A1933BarCodTin = P08LA7_A1933BarCodTin[0] ;
         n1933BarCodTin = P08LA7_n1933BarCodTin[0] ;
         A3646EstTinAny = P08LA7_A3646EstTinAny[0] ;
         A3647EstTinMes = P08LA7_A3647EstTinMes[0] ;
         A3648EstTinDia = P08LA7_A3648EstTinDia[0] ;
         A279CliNom = P08LA7_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08LA7_A1940BarColNoT[0], A1940BarColNoT) == 0 ) )
         {
            brk8LA11 = false ;
            A396EmprCod = P08LA7_A396EmprCod[0] ;
            A1929EstTinNr = P08LA7_A1929EstTinNr[0] ;
            A3646EstTinAny = P08LA7_A3646EstTinAny[0] ;
            A3647EstTinMes = P08LA7_A3647EstTinMes[0] ;
            A3648EstTinDia = P08LA7_A3648EstTinDia[0] ;
            AV56count = (long)(AV56count+1) ;
            brk8LA11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A1940BarColNoT)==0) )
         {
            AV48Option = A1940BarColNoT ;
            AV49Options.add(AV48Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8LA11 )
         {
            brk8LA11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARMAQTINOPTIONS' Routine */
      returnInSub = false ;
      AV36TFBarMaqTin = AV44SearchTxt ;
      AV37TFBarMaqTin_Sel = "" ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV89FilterFullText ,
                                           AV10TFEstFecCier ,
                                           Short.valueOf(AV12TFEstTinNr) ,
                                           Short.valueOf(AV13TFEstTinNr_To) ,
                                           AV91TFBarnhdr_lconti_Sel ,
                                           AV90TFBarnhdr_lconti ,
                                           AV41TFBarAgrLot_Sel ,
                                           AV40TFBarAgrLot ,
                                           Integer.valueOf(AV14TFCliCod) ,
                                           Integer.valueOf(AV15TFCliCod_To) ,
                                           AV17TFCliNom_Sel ,
                                           AV16TFCliNom ,
                                           AV19TFBarSerTin_Sel ,
                                           AV18TFBarSerTin ,
                                           AV21TFBarDscTin_Sel ,
                                           AV20TFBarDscTin ,
                                           AV23TFBarColNoT_Sel ,
                                           AV22TFBarColNoT ,
                                           Integer.valueOf(AV24TFBarColNuT) ,
                                           Integer.valueOf(AV25TFBarColNuT_To) ,
                                           Byte.valueOf(AV26TFBarTipCoT) ,
                                           Byte.valueOf(AV27TFBarTipCoT_To) ,
                                           AV28TFBarKgmTin ,
                                           AV29TFBarKgmTin_To ,
                                           AV30TFBarKgsTt ,
                                           AV31TFBarKgsTt_To ,
                                           AV32TFBarMtrTin ,
                                           AV33TFBarMtrTin_To ,
                                           AV34TFBarMtsTt ,
                                           AV35TFBarMtsTt_To ,
                                           AV37TFBarMaqTin_Sel ,
                                           AV36TFBarMaqTin ,
                                           Integer.valueOf(AV38TFBarVolTin) ,
                                           Integer.valueOf(AV39TFBarVolTin_To) ,
                                           AV88TFBarDispCli_Sel ,
                                           AV87TFBarDispCli ,
                                           Short.valueOf(AV85TFBarNumAna) ,
                                           Short.valueOf(AV86TFBarNumAna_To) ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV63Fec1 ,
                                           AV64Fec3 ,
                                           Integer.valueOf(AV65PCliCod) ,
                                           Integer.valueOf(AV66CliCodP) ,
                                           Integer.valueOf(AV67PBarCod) ,
                                           Integer.valueOf(AV68Barcodp) ,
                                           Byte.valueOf(AV69PBarCodReo) ,
                                           Byte.valueOf(AV70BarCodReoP) ,
                                           AV71PBarCodPar ,
                                           AV72BarCodParP ,
                                           AV73PSerie ,
                                           AV74SerieP ,
                                           AV75PColor ,
                                           AV76ColorP ,
                                           Integer.valueOf(AV77PColNum) ,
                                           Integer.valueOf(AV78ColNumP) ,
                                           AV79DispCli1 ,
                                           AV80DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV81HreRacab ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           AV82MaqCodi ,
                                           AV83MaqCod3 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV90TFBarnhdr_lconti = GXutil.padr( GXutil.rtrim( AV90TFBarnhdr_lconti), 11, "%") ;
      lV40TFBarAgrLot = GXutil.padr( GXutil.rtrim( AV40TFBarAgrLot), 10, "%") ;
      lV16TFCliNom = GXutil.padr( GXutil.rtrim( AV16TFCliNom), 30, "%") ;
      lV18TFBarSerTin = GXutil.padr( GXutil.rtrim( AV18TFBarSerTin), 16, "%") ;
      lV20TFBarDscTin = GXutil.padr( GXutil.rtrim( AV20TFBarDscTin), 26, "%") ;
      lV22TFBarColNoT = GXutil.padr( GXutil.rtrim( AV22TFBarColNoT), 13, "%") ;
      lV36TFBarMaqTin = GXutil.padr( GXutil.rtrim( AV36TFBarMaqTin), 6, "%") ;
      lV87TFBarDispCli = GXutil.padr( GXutil.rtrim( AV87TFBarDispCli), 20, "%") ;
      /* Using cursor P08LA8 */
      pr_default.execute(6, new Object[] {AV82MaqCodi, AV63Fec1, AV64Fec3, Integer.valueOf(AV65PCliCod), Integer.valueOf(AV66CliCodP), Integer.valueOf(AV67PBarCod), Integer.valueOf(AV68Barcodp), Byte.valueOf(AV69PBarCodReo), Byte.valueOf(AV70BarCodReoP), AV71PBarCodPar, AV72BarCodParP, AV73PSerie, AV74SerieP, AV75PColor, AV76ColorP, Integer.valueOf(AV77PColNum), Integer.valueOf(AV78ColNumP), AV79DispCli1, AV80DispCli3, AV81HreRacab, AV81HreRacab, AV62Emprcod, AV83MaqCod3, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, AV10TFEstFecCier, Short.valueOf(AV12TFEstTinNr), Short.valueOf(AV13TFEstTinNr_To), lV90TFBarnhdr_lconti, AV91TFBarnhdr_lconti_Sel, lV40TFBarAgrLot, AV41TFBarAgrLot_Sel, Integer.valueOf(AV14TFCliCod), Integer.valueOf(AV15TFCliCod_To), lV16TFCliNom, AV17TFCliNom_Sel, lV18TFBarSerTin, AV19TFBarSerTin_Sel, lV20TFBarDscTin, AV21TFBarDscTin_Sel, lV22TFBarColNoT, AV23TFBarColNoT_Sel, Integer.valueOf(AV24TFBarColNuT), Integer.valueOf(AV25TFBarColNuT_To), Byte.valueOf(AV26TFBarTipCoT), Byte.valueOf(AV27TFBarTipCoT_To), AV28TFBarKgmTin, AV29TFBarKgmTin_To, AV30TFBarKgsTt, AV31TFBarKgsTt_To, AV32TFBarMtrTin, AV33TFBarMtrTin_To, AV34TFBarMtsTt, AV35TFBarMtsTt_To, lV36TFBarMaqTin, AV37TFBarMaqTin_Sel, Integer.valueOf(AV38TFBarVolTin), Integer.valueOf(AV39TFBarVolTin_To), lV87TFBarDispCli, AV88TFBarDispCli_Sel, Short.valueOf(AV85TFBarNumAna), Short.valueOf(AV86TFBarNumAna_To)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8LA13 = false ;
         A396EmprCod = P08LA8_A396EmprCod[0] ;
         A1945BarMaqTin = P08LA8_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08LA8_n1945BarMaqTin[0] ;
         A6634BarRecAcb = P08LA8_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08LA8_n6634BarRecAcb[0] ;
         A13759EstFecCier = P08LA8_A13759EstFecCier[0] ;
         A3650BarNumAna = P08LA8_A3650BarNumAna[0] ;
         n3650BarNumAna = P08LA8_n3650BarNumAna[0] ;
         A11762BarDispCli = P08LA8_A11762BarDispCli[0] ;
         n11762BarDispCli = P08LA8_n11762BarDispCli[0] ;
         A1946BarVolTin = P08LA8_A1946BarVolTin[0] ;
         n1946BarVolTin = P08LA8_n1946BarVolTin[0] ;
         A12993BarMtsTt = P08LA8_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08LA8_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08LA8_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08LA8_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08LA8_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08LA8_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08LA8_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08LA8_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08LA8_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08LA8_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08LA8_A1941BarColNuT[0] ;
         n1941BarColNuT = P08LA8_n1941BarColNuT[0] ;
         A1940BarColNoT = P08LA8_A1940BarColNoT[0] ;
         n1940BarColNoT = P08LA8_n1940BarColNoT[0] ;
         A1937BarDscTin = P08LA8_A1937BarDscTin[0] ;
         n1937BarDscTin = P08LA8_n1937BarDscTin[0] ;
         A1936BarSerTin = P08LA8_A1936BarSerTin[0] ;
         n1936BarSerTin = P08LA8_n1936BarSerTin[0] ;
         A279CliNom = P08LA8_A279CliNom[0] ;
         A252CliCod = P08LA8_A252CliCod[0] ;
         A2316BarAgrLot = P08LA8_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08LA8_n2316BarAgrLot[0] ;
         A1929EstTinNr = P08LA8_A1929EstTinNr[0] ;
         A1935BarParTin = P08LA8_A1935BarParTin[0] ;
         n1935BarParTin = P08LA8_n1935BarParTin[0] ;
         A1934BarReoTin = P08LA8_A1934BarReoTin[0] ;
         n1934BarReoTin = P08LA8_n1934BarReoTin[0] ;
         A1933BarCodTin = P08LA8_A1933BarCodTin[0] ;
         n1933BarCodTin = P08LA8_n1933BarCodTin[0] ;
         A3646EstTinAny = P08LA8_A3646EstTinAny[0] ;
         A3647EstTinMes = P08LA8_A3647EstTinMes[0] ;
         A3648EstTinDia = P08LA8_A3648EstTinDia[0] ;
         A279CliNom = P08LA8_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08LA8_A1945BarMaqTin[0], A1945BarMaqTin) == 0 ) )
         {
            brk8LA13 = false ;
            A396EmprCod = P08LA8_A396EmprCod[0] ;
            A1929EstTinNr = P08LA8_A1929EstTinNr[0] ;
            A3646EstTinAny = P08LA8_A3646EstTinAny[0] ;
            A3647EstTinMes = P08LA8_A3647EstTinMes[0] ;
            A3648EstTinDia = P08LA8_A3648EstTinDia[0] ;
            AV56count = (long)(AV56count+1) ;
            brk8LA13 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A1945BarMaqTin)==0) )
         {
            AV48Option = A1945BarMaqTin ;
            AV49Options.add(AV48Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8LA13 )
         {
            brk8LA13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADBARDISPCLIOPTIONS' Routine */
      returnInSub = false ;
      AV87TFBarDispCli = AV44SearchTxt ;
      AV88TFBarDispCli_Sel = "" ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV89FilterFullText ,
                                           AV10TFEstFecCier ,
                                           Short.valueOf(AV12TFEstTinNr) ,
                                           Short.valueOf(AV13TFEstTinNr_To) ,
                                           AV91TFBarnhdr_lconti_Sel ,
                                           AV90TFBarnhdr_lconti ,
                                           AV41TFBarAgrLot_Sel ,
                                           AV40TFBarAgrLot ,
                                           Integer.valueOf(AV14TFCliCod) ,
                                           Integer.valueOf(AV15TFCliCod_To) ,
                                           AV17TFCliNom_Sel ,
                                           AV16TFCliNom ,
                                           AV19TFBarSerTin_Sel ,
                                           AV18TFBarSerTin ,
                                           AV21TFBarDscTin_Sel ,
                                           AV20TFBarDscTin ,
                                           AV23TFBarColNoT_Sel ,
                                           AV22TFBarColNoT ,
                                           Integer.valueOf(AV24TFBarColNuT) ,
                                           Integer.valueOf(AV25TFBarColNuT_To) ,
                                           Byte.valueOf(AV26TFBarTipCoT) ,
                                           Byte.valueOf(AV27TFBarTipCoT_To) ,
                                           AV28TFBarKgmTin ,
                                           AV29TFBarKgmTin_To ,
                                           AV30TFBarKgsTt ,
                                           AV31TFBarKgsTt_To ,
                                           AV32TFBarMtrTin ,
                                           AV33TFBarMtrTin_To ,
                                           AV34TFBarMtsTt ,
                                           AV35TFBarMtsTt_To ,
                                           AV37TFBarMaqTin_Sel ,
                                           AV36TFBarMaqTin ,
                                           Integer.valueOf(AV38TFBarVolTin) ,
                                           Integer.valueOf(AV39TFBarVolTin_To) ,
                                           AV88TFBarDispCli_Sel ,
                                           AV87TFBarDispCli ,
                                           Short.valueOf(AV85TFBarNumAna) ,
                                           Short.valueOf(AV86TFBarNumAna_To) ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A13759EstFecCier ,
                                           AV63Fec1 ,
                                           AV64Fec3 ,
                                           Integer.valueOf(AV65PCliCod) ,
                                           Integer.valueOf(AV66CliCodP) ,
                                           Integer.valueOf(AV67PBarCod) ,
                                           Integer.valueOf(AV68Barcodp) ,
                                           Byte.valueOf(AV69PBarCodReo) ,
                                           Byte.valueOf(AV70BarCodReoP) ,
                                           AV71PBarCodPar ,
                                           AV72BarCodParP ,
                                           AV73PSerie ,
                                           AV74SerieP ,
                                           AV75PColor ,
                                           AV76ColorP ,
                                           Integer.valueOf(AV77PColNum) ,
                                           Integer.valueOf(AV78ColNumP) ,
                                           A6634BarRecAcb ,
                                           AV81HreRacab ,
                                           AV82MaqCodi ,
                                           AV83MaqCod3 ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           AV79DispCli1 ,
                                           AV80DispCli3 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV89FilterFullText = GXutil.concat( GXutil.rtrim( AV89FilterFullText), "%", "") ;
      lV90TFBarnhdr_lconti = GXutil.padr( GXutil.rtrim( AV90TFBarnhdr_lconti), 11, "%") ;
      lV40TFBarAgrLot = GXutil.padr( GXutil.rtrim( AV40TFBarAgrLot), 10, "%") ;
      lV16TFCliNom = GXutil.padr( GXutil.rtrim( AV16TFCliNom), 30, "%") ;
      lV18TFBarSerTin = GXutil.padr( GXutil.rtrim( AV18TFBarSerTin), 16, "%") ;
      lV20TFBarDscTin = GXutil.padr( GXutil.rtrim( AV20TFBarDscTin), 26, "%") ;
      lV22TFBarColNoT = GXutil.padr( GXutil.rtrim( AV22TFBarColNoT), 13, "%") ;
      lV36TFBarMaqTin = GXutil.padr( GXutil.rtrim( AV36TFBarMaqTin), 6, "%") ;
      lV87TFBarDispCli = GXutil.padr( GXutil.rtrim( AV87TFBarDispCli), 20, "%") ;
      /* Using cursor P08LA9 */
      pr_default.execute(7, new Object[] {AV79DispCli1, AV63Fec1, AV64Fec3, Integer.valueOf(AV65PCliCod), Integer.valueOf(AV66CliCodP), Integer.valueOf(AV67PBarCod), Integer.valueOf(AV68Barcodp), Byte.valueOf(AV69PBarCodReo), Byte.valueOf(AV70BarCodReoP), AV71PBarCodPar, AV72BarCodParP, AV73PSerie, AV74SerieP, AV75PColor, AV76ColorP, Integer.valueOf(AV77PColNum), Integer.valueOf(AV78ColNumP), AV81HreRacab, AV81HreRacab, AV82MaqCodi, AV83MaqCod3, AV62Emprcod, AV80DispCli3, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, lV89FilterFullText, AV10TFEstFecCier, Short.valueOf(AV12TFEstTinNr), Short.valueOf(AV13TFEstTinNr_To), lV90TFBarnhdr_lconti, AV91TFBarnhdr_lconti_Sel, lV40TFBarAgrLot, AV41TFBarAgrLot_Sel, Integer.valueOf(AV14TFCliCod), Integer.valueOf(AV15TFCliCod_To), lV16TFCliNom, AV17TFCliNom_Sel, lV18TFBarSerTin, AV19TFBarSerTin_Sel, lV20TFBarDscTin, AV21TFBarDscTin_Sel, lV22TFBarColNoT, AV23TFBarColNoT_Sel, Integer.valueOf(AV24TFBarColNuT), Integer.valueOf(AV25TFBarColNuT_To), Byte.valueOf(AV26TFBarTipCoT), Byte.valueOf(AV27TFBarTipCoT_To), AV28TFBarKgmTin, AV29TFBarKgmTin_To, AV30TFBarKgsTt, AV31TFBarKgsTt_To, AV32TFBarMtrTin, AV33TFBarMtrTin_To, AV34TFBarMtsTt, AV35TFBarMtsTt_To, lV36TFBarMaqTin, AV37TFBarMaqTin_Sel, Integer.valueOf(AV38TFBarVolTin), Integer.valueOf(AV39TFBarVolTin_To), lV87TFBarDispCli, AV88TFBarDispCli_Sel, Short.valueOf(AV85TFBarNumAna), Short.valueOf(AV86TFBarNumAna_To)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8LA15 = false ;
         A396EmprCod = P08LA9_A396EmprCod[0] ;
         A11762BarDispCli = P08LA9_A11762BarDispCli[0] ;
         n11762BarDispCli = P08LA9_n11762BarDispCli[0] ;
         A6634BarRecAcb = P08LA9_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08LA9_n6634BarRecAcb[0] ;
         A13759EstFecCier = P08LA9_A13759EstFecCier[0] ;
         A3650BarNumAna = P08LA9_A3650BarNumAna[0] ;
         n3650BarNumAna = P08LA9_n3650BarNumAna[0] ;
         A1946BarVolTin = P08LA9_A1946BarVolTin[0] ;
         n1946BarVolTin = P08LA9_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08LA9_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08LA9_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08LA9_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08LA9_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08LA9_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08LA9_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08LA9_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08LA9_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08LA9_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08LA9_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08LA9_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08LA9_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08LA9_A1941BarColNuT[0] ;
         n1941BarColNuT = P08LA9_n1941BarColNuT[0] ;
         A1940BarColNoT = P08LA9_A1940BarColNoT[0] ;
         n1940BarColNoT = P08LA9_n1940BarColNoT[0] ;
         A1937BarDscTin = P08LA9_A1937BarDscTin[0] ;
         n1937BarDscTin = P08LA9_n1937BarDscTin[0] ;
         A1936BarSerTin = P08LA9_A1936BarSerTin[0] ;
         n1936BarSerTin = P08LA9_n1936BarSerTin[0] ;
         A279CliNom = P08LA9_A279CliNom[0] ;
         A252CliCod = P08LA9_A252CliCod[0] ;
         A2316BarAgrLot = P08LA9_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08LA9_n2316BarAgrLot[0] ;
         A1929EstTinNr = P08LA9_A1929EstTinNr[0] ;
         A1935BarParTin = P08LA9_A1935BarParTin[0] ;
         n1935BarParTin = P08LA9_n1935BarParTin[0] ;
         A1934BarReoTin = P08LA9_A1934BarReoTin[0] ;
         n1934BarReoTin = P08LA9_n1934BarReoTin[0] ;
         A1933BarCodTin = P08LA9_A1933BarCodTin[0] ;
         n1933BarCodTin = P08LA9_n1933BarCodTin[0] ;
         A3646EstTinAny = P08LA9_A3646EstTinAny[0] ;
         A3647EstTinMes = P08LA9_A3647EstTinMes[0] ;
         A3648EstTinDia = P08LA9_A3648EstTinDia[0] ;
         A279CliNom = P08LA9_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08LA9_A11762BarDispCli[0], A11762BarDispCli) == 0 ) )
         {
            brk8LA15 = false ;
            A396EmprCod = P08LA9_A396EmprCod[0] ;
            A1929EstTinNr = P08LA9_A1929EstTinNr[0] ;
            A3646EstTinAny = P08LA9_A3646EstTinAny[0] ;
            A3647EstTinMes = P08LA9_A3647EstTinMes[0] ;
            A3648EstTinDia = P08LA9_A3648EstTinDia[0] ;
            AV56count = (long)(AV56count+1) ;
            brk8LA15 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A11762BarDispCli)==0) )
         {
            AV48Option = A11762BarDispCli ;
            AV49Options.add(AV48Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8LA15 )
         {
            brk8LA15 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wchistoricorecetaslcontigetfilterdata.this.AV50OptionsJson;
      this.aP4[0] = wchistoricorecetaslcontigetfilterdata.this.AV53OptionsDescJson;
      this.aP5[0] = wchistoricorecetaslcontigetfilterdata.this.AV55OptionIndexesJson;
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
      AV89FilterFullText = "" ;
      AV10TFEstFecCier = GXutil.nullDate() ;
      AV90TFBarnhdr_lconti = "" ;
      AV91TFBarnhdr_lconti_Sel = "" ;
      AV40TFBarAgrLot = "" ;
      AV41TFBarAgrLot_Sel = "" ;
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV18TFBarSerTin = "" ;
      AV19TFBarSerTin_Sel = "" ;
      AV20TFBarDscTin = "" ;
      AV21TFBarDscTin_Sel = "" ;
      AV22TFBarColNoT = "" ;
      AV23TFBarColNoT_Sel = "" ;
      AV28TFBarKgmTin = DecimalUtil.ZERO ;
      AV29TFBarKgmTin_To = DecimalUtil.ZERO ;
      AV30TFBarKgsTt = DecimalUtil.ZERO ;
      AV31TFBarKgsTt_To = DecimalUtil.ZERO ;
      AV32TFBarMtrTin = DecimalUtil.ZERO ;
      AV33TFBarMtrTin_To = DecimalUtil.ZERO ;
      AV34TFBarMtsTt = DecimalUtil.ZERO ;
      AV35TFBarMtsTt_To = DecimalUtil.ZERO ;
      AV36TFBarMaqTin = "" ;
      AV37TFBarMaqTin_Sel = "" ;
      AV87TFBarDispCli = "" ;
      AV88TFBarDispCli_Sel = "" ;
      AV62Emprcod = "" ;
      AV63Fec1 = GXutil.nullDate() ;
      AV64Fec3 = GXutil.nullDate() ;
      AV71PBarCodPar = "" ;
      AV72BarCodParP = "" ;
      AV73PSerie = "" ;
      AV74SerieP = "" ;
      AV75PColor = "" ;
      AV76ColorP = "" ;
      AV79DispCli1 = "" ;
      AV80DispCli3 = "" ;
      AV81HreRacab = "" ;
      AV82MaqCodi = "" ;
      AV83MaqCod3 = "" ;
      scmdbuf = "" ;
      lV89FilterFullText = "" ;
      lV90TFBarnhdr_lconti = "" ;
      lV40TFBarAgrLot = "" ;
      lV16TFCliNom = "" ;
      lV18TFBarSerTin = "" ;
      lV20TFBarDscTin = "" ;
      lV22TFBarColNoT = "" ;
      lV36TFBarMaqTin = "" ;
      lV87TFBarDispCli = "" ;
      A1935BarParTin = "" ;
      A2316BarAgrLot = "" ;
      A279CliNom = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A1940BarColNoT = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A1945BarMaqTin = "" ;
      A11762BarDispCli = "" ;
      A13759EstFecCier = GXutil.nullDate() ;
      A6634BarRecAcb = "" ;
      A396EmprCod = "" ;
      P08LA2_A6634BarRecAcb = new String[] {""} ;
      P08LA2_n6634BarRecAcb = new boolean[] {false} ;
      P08LA2_A396EmprCod = new String[] {""} ;
      P08LA2_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08LA2_A3650BarNumAna = new short[1] ;
      P08LA2_n3650BarNumAna = new boolean[] {false} ;
      P08LA2_A11762BarDispCli = new String[] {""} ;
      P08LA2_n11762BarDispCli = new boolean[] {false} ;
      P08LA2_A1946BarVolTin = new int[1] ;
      P08LA2_n1946BarVolTin = new boolean[] {false} ;
      P08LA2_A1945BarMaqTin = new String[] {""} ;
      P08LA2_n1945BarMaqTin = new boolean[] {false} ;
      P08LA2_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA2_n12993BarMtsTt = new boolean[] {false} ;
      P08LA2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA2_n1948BarMtrTin = new boolean[] {false} ;
      P08LA2_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA2_n8563BarKgsTt = new boolean[] {false} ;
      P08LA2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA2_n1947BarKgmTin = new boolean[] {false} ;
      P08LA2_A1942BarTipCoT = new byte[1] ;
      P08LA2_n1942BarTipCoT = new boolean[] {false} ;
      P08LA2_A1941BarColNuT = new int[1] ;
      P08LA2_n1941BarColNuT = new boolean[] {false} ;
      P08LA2_A1940BarColNoT = new String[] {""} ;
      P08LA2_n1940BarColNoT = new boolean[] {false} ;
      P08LA2_A1937BarDscTin = new String[] {""} ;
      P08LA2_n1937BarDscTin = new boolean[] {false} ;
      P08LA2_A1936BarSerTin = new String[] {""} ;
      P08LA2_n1936BarSerTin = new boolean[] {false} ;
      P08LA2_A279CliNom = new String[] {""} ;
      P08LA2_A252CliCod = new int[1] ;
      P08LA2_A2316BarAgrLot = new String[] {""} ;
      P08LA2_n2316BarAgrLot = new boolean[] {false} ;
      P08LA2_A1929EstTinNr = new short[1] ;
      P08LA2_A1935BarParTin = new String[] {""} ;
      P08LA2_n1935BarParTin = new boolean[] {false} ;
      P08LA2_A1934BarReoTin = new byte[1] ;
      P08LA2_n1934BarReoTin = new boolean[] {false} ;
      P08LA2_A1933BarCodTin = new int[1] ;
      P08LA2_n1933BarCodTin = new boolean[] {false} ;
      P08LA2_A3646EstTinAny = new short[1] ;
      P08LA2_A3647EstTinMes = new byte[1] ;
      P08LA2_A3648EstTinDia = new byte[1] ;
      A13841Barnhdr_lc = "" ;
      AV48Option = "" ;
      P08LA3_A396EmprCod = new String[] {""} ;
      P08LA3_A2316BarAgrLot = new String[] {""} ;
      P08LA3_n2316BarAgrLot = new boolean[] {false} ;
      P08LA3_A6634BarRecAcb = new String[] {""} ;
      P08LA3_n6634BarRecAcb = new boolean[] {false} ;
      P08LA3_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08LA3_A3650BarNumAna = new short[1] ;
      P08LA3_n3650BarNumAna = new boolean[] {false} ;
      P08LA3_A11762BarDispCli = new String[] {""} ;
      P08LA3_n11762BarDispCli = new boolean[] {false} ;
      P08LA3_A1946BarVolTin = new int[1] ;
      P08LA3_n1946BarVolTin = new boolean[] {false} ;
      P08LA3_A1945BarMaqTin = new String[] {""} ;
      P08LA3_n1945BarMaqTin = new boolean[] {false} ;
      P08LA3_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA3_n12993BarMtsTt = new boolean[] {false} ;
      P08LA3_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA3_n1948BarMtrTin = new boolean[] {false} ;
      P08LA3_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA3_n8563BarKgsTt = new boolean[] {false} ;
      P08LA3_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA3_n1947BarKgmTin = new boolean[] {false} ;
      P08LA3_A1942BarTipCoT = new byte[1] ;
      P08LA3_n1942BarTipCoT = new boolean[] {false} ;
      P08LA3_A1941BarColNuT = new int[1] ;
      P08LA3_n1941BarColNuT = new boolean[] {false} ;
      P08LA3_A1940BarColNoT = new String[] {""} ;
      P08LA3_n1940BarColNoT = new boolean[] {false} ;
      P08LA3_A1937BarDscTin = new String[] {""} ;
      P08LA3_n1937BarDscTin = new boolean[] {false} ;
      P08LA3_A1936BarSerTin = new String[] {""} ;
      P08LA3_n1936BarSerTin = new boolean[] {false} ;
      P08LA3_A279CliNom = new String[] {""} ;
      P08LA3_A252CliCod = new int[1] ;
      P08LA3_A1929EstTinNr = new short[1] ;
      P08LA3_A1935BarParTin = new String[] {""} ;
      P08LA3_n1935BarParTin = new boolean[] {false} ;
      P08LA3_A1934BarReoTin = new byte[1] ;
      P08LA3_n1934BarReoTin = new boolean[] {false} ;
      P08LA3_A1933BarCodTin = new int[1] ;
      P08LA3_n1933BarCodTin = new boolean[] {false} ;
      P08LA3_A3646EstTinAny = new short[1] ;
      P08LA3_A3647EstTinMes = new byte[1] ;
      P08LA3_A3648EstTinDia = new byte[1] ;
      P08LA4_A396EmprCod = new String[] {""} ;
      P08LA4_A279CliNom = new String[] {""} ;
      P08LA4_A6634BarRecAcb = new String[] {""} ;
      P08LA4_n6634BarRecAcb = new boolean[] {false} ;
      P08LA4_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08LA4_A3650BarNumAna = new short[1] ;
      P08LA4_n3650BarNumAna = new boolean[] {false} ;
      P08LA4_A11762BarDispCli = new String[] {""} ;
      P08LA4_n11762BarDispCli = new boolean[] {false} ;
      P08LA4_A1946BarVolTin = new int[1] ;
      P08LA4_n1946BarVolTin = new boolean[] {false} ;
      P08LA4_A1945BarMaqTin = new String[] {""} ;
      P08LA4_n1945BarMaqTin = new boolean[] {false} ;
      P08LA4_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA4_n12993BarMtsTt = new boolean[] {false} ;
      P08LA4_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA4_n1948BarMtrTin = new boolean[] {false} ;
      P08LA4_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA4_n8563BarKgsTt = new boolean[] {false} ;
      P08LA4_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA4_n1947BarKgmTin = new boolean[] {false} ;
      P08LA4_A1942BarTipCoT = new byte[1] ;
      P08LA4_n1942BarTipCoT = new boolean[] {false} ;
      P08LA4_A1941BarColNuT = new int[1] ;
      P08LA4_n1941BarColNuT = new boolean[] {false} ;
      P08LA4_A1940BarColNoT = new String[] {""} ;
      P08LA4_n1940BarColNoT = new boolean[] {false} ;
      P08LA4_A1937BarDscTin = new String[] {""} ;
      P08LA4_n1937BarDscTin = new boolean[] {false} ;
      P08LA4_A1936BarSerTin = new String[] {""} ;
      P08LA4_n1936BarSerTin = new boolean[] {false} ;
      P08LA4_A252CliCod = new int[1] ;
      P08LA4_A2316BarAgrLot = new String[] {""} ;
      P08LA4_n2316BarAgrLot = new boolean[] {false} ;
      P08LA4_A1929EstTinNr = new short[1] ;
      P08LA4_A1935BarParTin = new String[] {""} ;
      P08LA4_n1935BarParTin = new boolean[] {false} ;
      P08LA4_A1934BarReoTin = new byte[1] ;
      P08LA4_n1934BarReoTin = new boolean[] {false} ;
      P08LA4_A1933BarCodTin = new int[1] ;
      P08LA4_n1933BarCodTin = new boolean[] {false} ;
      P08LA4_A3646EstTinAny = new short[1] ;
      P08LA4_A3647EstTinMes = new byte[1] ;
      P08LA4_A3648EstTinDia = new byte[1] ;
      P08LA5_A396EmprCod = new String[] {""} ;
      P08LA5_A1936BarSerTin = new String[] {""} ;
      P08LA5_n1936BarSerTin = new boolean[] {false} ;
      P08LA5_A6634BarRecAcb = new String[] {""} ;
      P08LA5_n6634BarRecAcb = new boolean[] {false} ;
      P08LA5_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08LA5_A3650BarNumAna = new short[1] ;
      P08LA5_n3650BarNumAna = new boolean[] {false} ;
      P08LA5_A11762BarDispCli = new String[] {""} ;
      P08LA5_n11762BarDispCli = new boolean[] {false} ;
      P08LA5_A1946BarVolTin = new int[1] ;
      P08LA5_n1946BarVolTin = new boolean[] {false} ;
      P08LA5_A1945BarMaqTin = new String[] {""} ;
      P08LA5_n1945BarMaqTin = new boolean[] {false} ;
      P08LA5_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA5_n12993BarMtsTt = new boolean[] {false} ;
      P08LA5_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA5_n1948BarMtrTin = new boolean[] {false} ;
      P08LA5_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA5_n8563BarKgsTt = new boolean[] {false} ;
      P08LA5_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA5_n1947BarKgmTin = new boolean[] {false} ;
      P08LA5_A1942BarTipCoT = new byte[1] ;
      P08LA5_n1942BarTipCoT = new boolean[] {false} ;
      P08LA5_A1941BarColNuT = new int[1] ;
      P08LA5_n1941BarColNuT = new boolean[] {false} ;
      P08LA5_A1940BarColNoT = new String[] {""} ;
      P08LA5_n1940BarColNoT = new boolean[] {false} ;
      P08LA5_A1937BarDscTin = new String[] {""} ;
      P08LA5_n1937BarDscTin = new boolean[] {false} ;
      P08LA5_A279CliNom = new String[] {""} ;
      P08LA5_A252CliCod = new int[1] ;
      P08LA5_A2316BarAgrLot = new String[] {""} ;
      P08LA5_n2316BarAgrLot = new boolean[] {false} ;
      P08LA5_A1929EstTinNr = new short[1] ;
      P08LA5_A1935BarParTin = new String[] {""} ;
      P08LA5_n1935BarParTin = new boolean[] {false} ;
      P08LA5_A1934BarReoTin = new byte[1] ;
      P08LA5_n1934BarReoTin = new boolean[] {false} ;
      P08LA5_A1933BarCodTin = new int[1] ;
      P08LA5_n1933BarCodTin = new boolean[] {false} ;
      P08LA5_A3646EstTinAny = new short[1] ;
      P08LA5_A3647EstTinMes = new byte[1] ;
      P08LA5_A3648EstTinDia = new byte[1] ;
      P08LA6_A396EmprCod = new String[] {""} ;
      P08LA6_A1937BarDscTin = new String[] {""} ;
      P08LA6_n1937BarDscTin = new boolean[] {false} ;
      P08LA6_A6634BarRecAcb = new String[] {""} ;
      P08LA6_n6634BarRecAcb = new boolean[] {false} ;
      P08LA6_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08LA6_A3650BarNumAna = new short[1] ;
      P08LA6_n3650BarNumAna = new boolean[] {false} ;
      P08LA6_A11762BarDispCli = new String[] {""} ;
      P08LA6_n11762BarDispCli = new boolean[] {false} ;
      P08LA6_A1946BarVolTin = new int[1] ;
      P08LA6_n1946BarVolTin = new boolean[] {false} ;
      P08LA6_A1945BarMaqTin = new String[] {""} ;
      P08LA6_n1945BarMaqTin = new boolean[] {false} ;
      P08LA6_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA6_n12993BarMtsTt = new boolean[] {false} ;
      P08LA6_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA6_n1948BarMtrTin = new boolean[] {false} ;
      P08LA6_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA6_n8563BarKgsTt = new boolean[] {false} ;
      P08LA6_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA6_n1947BarKgmTin = new boolean[] {false} ;
      P08LA6_A1942BarTipCoT = new byte[1] ;
      P08LA6_n1942BarTipCoT = new boolean[] {false} ;
      P08LA6_A1941BarColNuT = new int[1] ;
      P08LA6_n1941BarColNuT = new boolean[] {false} ;
      P08LA6_A1940BarColNoT = new String[] {""} ;
      P08LA6_n1940BarColNoT = new boolean[] {false} ;
      P08LA6_A1936BarSerTin = new String[] {""} ;
      P08LA6_n1936BarSerTin = new boolean[] {false} ;
      P08LA6_A279CliNom = new String[] {""} ;
      P08LA6_A252CliCod = new int[1] ;
      P08LA6_A2316BarAgrLot = new String[] {""} ;
      P08LA6_n2316BarAgrLot = new boolean[] {false} ;
      P08LA6_A1929EstTinNr = new short[1] ;
      P08LA6_A1935BarParTin = new String[] {""} ;
      P08LA6_n1935BarParTin = new boolean[] {false} ;
      P08LA6_A1934BarReoTin = new byte[1] ;
      P08LA6_n1934BarReoTin = new boolean[] {false} ;
      P08LA6_A1933BarCodTin = new int[1] ;
      P08LA6_n1933BarCodTin = new boolean[] {false} ;
      P08LA6_A3646EstTinAny = new short[1] ;
      P08LA6_A3647EstTinMes = new byte[1] ;
      P08LA6_A3648EstTinDia = new byte[1] ;
      P08LA7_A396EmprCod = new String[] {""} ;
      P08LA7_A1940BarColNoT = new String[] {""} ;
      P08LA7_n1940BarColNoT = new boolean[] {false} ;
      P08LA7_A6634BarRecAcb = new String[] {""} ;
      P08LA7_n6634BarRecAcb = new boolean[] {false} ;
      P08LA7_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08LA7_A3650BarNumAna = new short[1] ;
      P08LA7_n3650BarNumAna = new boolean[] {false} ;
      P08LA7_A11762BarDispCli = new String[] {""} ;
      P08LA7_n11762BarDispCli = new boolean[] {false} ;
      P08LA7_A1946BarVolTin = new int[1] ;
      P08LA7_n1946BarVolTin = new boolean[] {false} ;
      P08LA7_A1945BarMaqTin = new String[] {""} ;
      P08LA7_n1945BarMaqTin = new boolean[] {false} ;
      P08LA7_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA7_n12993BarMtsTt = new boolean[] {false} ;
      P08LA7_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA7_n1948BarMtrTin = new boolean[] {false} ;
      P08LA7_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA7_n8563BarKgsTt = new boolean[] {false} ;
      P08LA7_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA7_n1947BarKgmTin = new boolean[] {false} ;
      P08LA7_A1942BarTipCoT = new byte[1] ;
      P08LA7_n1942BarTipCoT = new boolean[] {false} ;
      P08LA7_A1941BarColNuT = new int[1] ;
      P08LA7_n1941BarColNuT = new boolean[] {false} ;
      P08LA7_A1937BarDscTin = new String[] {""} ;
      P08LA7_n1937BarDscTin = new boolean[] {false} ;
      P08LA7_A1936BarSerTin = new String[] {""} ;
      P08LA7_n1936BarSerTin = new boolean[] {false} ;
      P08LA7_A279CliNom = new String[] {""} ;
      P08LA7_A252CliCod = new int[1] ;
      P08LA7_A2316BarAgrLot = new String[] {""} ;
      P08LA7_n2316BarAgrLot = new boolean[] {false} ;
      P08LA7_A1929EstTinNr = new short[1] ;
      P08LA7_A1935BarParTin = new String[] {""} ;
      P08LA7_n1935BarParTin = new boolean[] {false} ;
      P08LA7_A1934BarReoTin = new byte[1] ;
      P08LA7_n1934BarReoTin = new boolean[] {false} ;
      P08LA7_A1933BarCodTin = new int[1] ;
      P08LA7_n1933BarCodTin = new boolean[] {false} ;
      P08LA7_A3646EstTinAny = new short[1] ;
      P08LA7_A3647EstTinMes = new byte[1] ;
      P08LA7_A3648EstTinDia = new byte[1] ;
      P08LA8_A396EmprCod = new String[] {""} ;
      P08LA8_A1945BarMaqTin = new String[] {""} ;
      P08LA8_n1945BarMaqTin = new boolean[] {false} ;
      P08LA8_A6634BarRecAcb = new String[] {""} ;
      P08LA8_n6634BarRecAcb = new boolean[] {false} ;
      P08LA8_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08LA8_A3650BarNumAna = new short[1] ;
      P08LA8_n3650BarNumAna = new boolean[] {false} ;
      P08LA8_A11762BarDispCli = new String[] {""} ;
      P08LA8_n11762BarDispCli = new boolean[] {false} ;
      P08LA8_A1946BarVolTin = new int[1] ;
      P08LA8_n1946BarVolTin = new boolean[] {false} ;
      P08LA8_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA8_n12993BarMtsTt = new boolean[] {false} ;
      P08LA8_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA8_n1948BarMtrTin = new boolean[] {false} ;
      P08LA8_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA8_n8563BarKgsTt = new boolean[] {false} ;
      P08LA8_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA8_n1947BarKgmTin = new boolean[] {false} ;
      P08LA8_A1942BarTipCoT = new byte[1] ;
      P08LA8_n1942BarTipCoT = new boolean[] {false} ;
      P08LA8_A1941BarColNuT = new int[1] ;
      P08LA8_n1941BarColNuT = new boolean[] {false} ;
      P08LA8_A1940BarColNoT = new String[] {""} ;
      P08LA8_n1940BarColNoT = new boolean[] {false} ;
      P08LA8_A1937BarDscTin = new String[] {""} ;
      P08LA8_n1937BarDscTin = new boolean[] {false} ;
      P08LA8_A1936BarSerTin = new String[] {""} ;
      P08LA8_n1936BarSerTin = new boolean[] {false} ;
      P08LA8_A279CliNom = new String[] {""} ;
      P08LA8_A252CliCod = new int[1] ;
      P08LA8_A2316BarAgrLot = new String[] {""} ;
      P08LA8_n2316BarAgrLot = new boolean[] {false} ;
      P08LA8_A1929EstTinNr = new short[1] ;
      P08LA8_A1935BarParTin = new String[] {""} ;
      P08LA8_n1935BarParTin = new boolean[] {false} ;
      P08LA8_A1934BarReoTin = new byte[1] ;
      P08LA8_n1934BarReoTin = new boolean[] {false} ;
      P08LA8_A1933BarCodTin = new int[1] ;
      P08LA8_n1933BarCodTin = new boolean[] {false} ;
      P08LA8_A3646EstTinAny = new short[1] ;
      P08LA8_A3647EstTinMes = new byte[1] ;
      P08LA8_A3648EstTinDia = new byte[1] ;
      P08LA9_A396EmprCod = new String[] {""} ;
      P08LA9_A11762BarDispCli = new String[] {""} ;
      P08LA9_n11762BarDispCli = new boolean[] {false} ;
      P08LA9_A6634BarRecAcb = new String[] {""} ;
      P08LA9_n6634BarRecAcb = new boolean[] {false} ;
      P08LA9_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08LA9_A3650BarNumAna = new short[1] ;
      P08LA9_n3650BarNumAna = new boolean[] {false} ;
      P08LA9_A1946BarVolTin = new int[1] ;
      P08LA9_n1946BarVolTin = new boolean[] {false} ;
      P08LA9_A1945BarMaqTin = new String[] {""} ;
      P08LA9_n1945BarMaqTin = new boolean[] {false} ;
      P08LA9_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA9_n12993BarMtsTt = new boolean[] {false} ;
      P08LA9_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA9_n1948BarMtrTin = new boolean[] {false} ;
      P08LA9_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA9_n8563BarKgsTt = new boolean[] {false} ;
      P08LA9_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LA9_n1947BarKgmTin = new boolean[] {false} ;
      P08LA9_A1942BarTipCoT = new byte[1] ;
      P08LA9_n1942BarTipCoT = new boolean[] {false} ;
      P08LA9_A1941BarColNuT = new int[1] ;
      P08LA9_n1941BarColNuT = new boolean[] {false} ;
      P08LA9_A1940BarColNoT = new String[] {""} ;
      P08LA9_n1940BarColNoT = new boolean[] {false} ;
      P08LA9_A1937BarDscTin = new String[] {""} ;
      P08LA9_n1937BarDscTin = new boolean[] {false} ;
      P08LA9_A1936BarSerTin = new String[] {""} ;
      P08LA9_n1936BarSerTin = new boolean[] {false} ;
      P08LA9_A279CliNom = new String[] {""} ;
      P08LA9_A252CliCod = new int[1] ;
      P08LA9_A2316BarAgrLot = new String[] {""} ;
      P08LA9_n2316BarAgrLot = new boolean[] {false} ;
      P08LA9_A1929EstTinNr = new short[1] ;
      P08LA9_A1935BarParTin = new String[] {""} ;
      P08LA9_n1935BarParTin = new boolean[] {false} ;
      P08LA9_A1934BarReoTin = new byte[1] ;
      P08LA9_n1934BarReoTin = new boolean[] {false} ;
      P08LA9_A1933BarCodTin = new int[1] ;
      P08LA9_n1933BarCodTin = new boolean[] {false} ;
      P08LA9_A3646EstTinAny = new short[1] ;
      P08LA9_A3647EstTinMes = new byte[1] ;
      P08LA9_A3648EstTinDia = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wchistoricorecetaslcontigetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08LA2_A6634BarRecAcb, P08LA2_n6634BarRecAcb, P08LA2_A396EmprCod, P08LA2_A13759EstFecCier, P08LA2_A3650BarNumAna, P08LA2_n3650BarNumAna, P08LA2_A11762BarDispCli, P08LA2_n11762BarDispCli, P08LA2_A1946BarVolTin, P08LA2_n1946BarVolTin,
            P08LA2_A1945BarMaqTin, P08LA2_n1945BarMaqTin, P08LA2_A12993BarMtsTt, P08LA2_n12993BarMtsTt, P08LA2_A1948BarMtrTin, P08LA2_n1948BarMtrTin, P08LA2_A8563BarKgsTt, P08LA2_n8563BarKgsTt, P08LA2_A1947BarKgmTin, P08LA2_n1947BarKgmTin,
            P08LA2_A1942BarTipCoT, P08LA2_n1942BarTipCoT, P08LA2_A1941BarColNuT, P08LA2_n1941BarColNuT, P08LA2_A1940BarColNoT, P08LA2_n1940BarColNoT, P08LA2_A1937BarDscTin, P08LA2_n1937BarDscTin, P08LA2_A1936BarSerTin, P08LA2_n1936BarSerTin,
            P08LA2_A279CliNom, P08LA2_A252CliCod, P08LA2_A2316BarAgrLot, P08LA2_n2316BarAgrLot, P08LA2_A1929EstTinNr, P08LA2_A1935BarParTin, P08LA2_n1935BarParTin, P08LA2_A1934BarReoTin, P08LA2_n1934BarReoTin, P08LA2_A1933BarCodTin,
            P08LA2_n1933BarCodTin, P08LA2_A3646EstTinAny, P08LA2_A3647EstTinMes, P08LA2_A3648EstTinDia
            }
            , new Object[] {
            P08LA3_A396EmprCod, P08LA3_A2316BarAgrLot, P08LA3_n2316BarAgrLot, P08LA3_A6634BarRecAcb, P08LA3_n6634BarRecAcb, P08LA3_A13759EstFecCier, P08LA3_A3650BarNumAna, P08LA3_n3650BarNumAna, P08LA3_A11762BarDispCli, P08LA3_n11762BarDispCli,
            P08LA3_A1946BarVolTin, P08LA3_n1946BarVolTin, P08LA3_A1945BarMaqTin, P08LA3_n1945BarMaqTin, P08LA3_A12993BarMtsTt, P08LA3_n12993BarMtsTt, P08LA3_A1948BarMtrTin, P08LA3_n1948BarMtrTin, P08LA3_A8563BarKgsTt, P08LA3_n8563BarKgsTt,
            P08LA3_A1947BarKgmTin, P08LA3_n1947BarKgmTin, P08LA3_A1942BarTipCoT, P08LA3_n1942BarTipCoT, P08LA3_A1941BarColNuT, P08LA3_n1941BarColNuT, P08LA3_A1940BarColNoT, P08LA3_n1940BarColNoT, P08LA3_A1937BarDscTin, P08LA3_n1937BarDscTin,
            P08LA3_A1936BarSerTin, P08LA3_n1936BarSerTin, P08LA3_A279CliNom, P08LA3_A252CliCod, P08LA3_A1929EstTinNr, P08LA3_A1935BarParTin, P08LA3_n1935BarParTin, P08LA3_A1934BarReoTin, P08LA3_n1934BarReoTin, P08LA3_A1933BarCodTin,
            P08LA3_n1933BarCodTin, P08LA3_A3646EstTinAny, P08LA3_A3647EstTinMes, P08LA3_A3648EstTinDia
            }
            , new Object[] {
            P08LA4_A396EmprCod, P08LA4_A279CliNom, P08LA4_A6634BarRecAcb, P08LA4_n6634BarRecAcb, P08LA4_A13759EstFecCier, P08LA4_A3650BarNumAna, P08LA4_n3650BarNumAna, P08LA4_A11762BarDispCli, P08LA4_n11762BarDispCli, P08LA4_A1946BarVolTin,
            P08LA4_n1946BarVolTin, P08LA4_A1945BarMaqTin, P08LA4_n1945BarMaqTin, P08LA4_A12993BarMtsTt, P08LA4_n12993BarMtsTt, P08LA4_A1948BarMtrTin, P08LA4_n1948BarMtrTin, P08LA4_A8563BarKgsTt, P08LA4_n8563BarKgsTt, P08LA4_A1947BarKgmTin,
            P08LA4_n1947BarKgmTin, P08LA4_A1942BarTipCoT, P08LA4_n1942BarTipCoT, P08LA4_A1941BarColNuT, P08LA4_n1941BarColNuT, P08LA4_A1940BarColNoT, P08LA4_n1940BarColNoT, P08LA4_A1937BarDscTin, P08LA4_n1937BarDscTin, P08LA4_A1936BarSerTin,
            P08LA4_n1936BarSerTin, P08LA4_A252CliCod, P08LA4_A2316BarAgrLot, P08LA4_n2316BarAgrLot, P08LA4_A1929EstTinNr, P08LA4_A1935BarParTin, P08LA4_n1935BarParTin, P08LA4_A1934BarReoTin, P08LA4_n1934BarReoTin, P08LA4_A1933BarCodTin,
            P08LA4_n1933BarCodTin, P08LA4_A3646EstTinAny, P08LA4_A3647EstTinMes, P08LA4_A3648EstTinDia
            }
            , new Object[] {
            P08LA5_A396EmprCod, P08LA5_A1936BarSerTin, P08LA5_n1936BarSerTin, P08LA5_A6634BarRecAcb, P08LA5_n6634BarRecAcb, P08LA5_A13759EstFecCier, P08LA5_A3650BarNumAna, P08LA5_n3650BarNumAna, P08LA5_A11762BarDispCli, P08LA5_n11762BarDispCli,
            P08LA5_A1946BarVolTin, P08LA5_n1946BarVolTin, P08LA5_A1945BarMaqTin, P08LA5_n1945BarMaqTin, P08LA5_A12993BarMtsTt, P08LA5_n12993BarMtsTt, P08LA5_A1948BarMtrTin, P08LA5_n1948BarMtrTin, P08LA5_A8563BarKgsTt, P08LA5_n8563BarKgsTt,
            P08LA5_A1947BarKgmTin, P08LA5_n1947BarKgmTin, P08LA5_A1942BarTipCoT, P08LA5_n1942BarTipCoT, P08LA5_A1941BarColNuT, P08LA5_n1941BarColNuT, P08LA5_A1940BarColNoT, P08LA5_n1940BarColNoT, P08LA5_A1937BarDscTin, P08LA5_n1937BarDscTin,
            P08LA5_A279CliNom, P08LA5_A252CliCod, P08LA5_A2316BarAgrLot, P08LA5_n2316BarAgrLot, P08LA5_A1929EstTinNr, P08LA5_A1935BarParTin, P08LA5_n1935BarParTin, P08LA5_A1934BarReoTin, P08LA5_n1934BarReoTin, P08LA5_A1933BarCodTin,
            P08LA5_n1933BarCodTin, P08LA5_A3646EstTinAny, P08LA5_A3647EstTinMes, P08LA5_A3648EstTinDia
            }
            , new Object[] {
            P08LA6_A396EmprCod, P08LA6_A1937BarDscTin, P08LA6_n1937BarDscTin, P08LA6_A6634BarRecAcb, P08LA6_n6634BarRecAcb, P08LA6_A13759EstFecCier, P08LA6_A3650BarNumAna, P08LA6_n3650BarNumAna, P08LA6_A11762BarDispCli, P08LA6_n11762BarDispCli,
            P08LA6_A1946BarVolTin, P08LA6_n1946BarVolTin, P08LA6_A1945BarMaqTin, P08LA6_n1945BarMaqTin, P08LA6_A12993BarMtsTt, P08LA6_n12993BarMtsTt, P08LA6_A1948BarMtrTin, P08LA6_n1948BarMtrTin, P08LA6_A8563BarKgsTt, P08LA6_n8563BarKgsTt,
            P08LA6_A1947BarKgmTin, P08LA6_n1947BarKgmTin, P08LA6_A1942BarTipCoT, P08LA6_n1942BarTipCoT, P08LA6_A1941BarColNuT, P08LA6_n1941BarColNuT, P08LA6_A1940BarColNoT, P08LA6_n1940BarColNoT, P08LA6_A1936BarSerTin, P08LA6_n1936BarSerTin,
            P08LA6_A279CliNom, P08LA6_A252CliCod, P08LA6_A2316BarAgrLot, P08LA6_n2316BarAgrLot, P08LA6_A1929EstTinNr, P08LA6_A1935BarParTin, P08LA6_n1935BarParTin, P08LA6_A1934BarReoTin, P08LA6_n1934BarReoTin, P08LA6_A1933BarCodTin,
            P08LA6_n1933BarCodTin, P08LA6_A3646EstTinAny, P08LA6_A3647EstTinMes, P08LA6_A3648EstTinDia
            }
            , new Object[] {
            P08LA7_A396EmprCod, P08LA7_A1940BarColNoT, P08LA7_n1940BarColNoT, P08LA7_A6634BarRecAcb, P08LA7_n6634BarRecAcb, P08LA7_A13759EstFecCier, P08LA7_A3650BarNumAna, P08LA7_n3650BarNumAna, P08LA7_A11762BarDispCli, P08LA7_n11762BarDispCli,
            P08LA7_A1946BarVolTin, P08LA7_n1946BarVolTin, P08LA7_A1945BarMaqTin, P08LA7_n1945BarMaqTin, P08LA7_A12993BarMtsTt, P08LA7_n12993BarMtsTt, P08LA7_A1948BarMtrTin, P08LA7_n1948BarMtrTin, P08LA7_A8563BarKgsTt, P08LA7_n8563BarKgsTt,
            P08LA7_A1947BarKgmTin, P08LA7_n1947BarKgmTin, P08LA7_A1942BarTipCoT, P08LA7_n1942BarTipCoT, P08LA7_A1941BarColNuT, P08LA7_n1941BarColNuT, P08LA7_A1937BarDscTin, P08LA7_n1937BarDscTin, P08LA7_A1936BarSerTin, P08LA7_n1936BarSerTin,
            P08LA7_A279CliNom, P08LA7_A252CliCod, P08LA7_A2316BarAgrLot, P08LA7_n2316BarAgrLot, P08LA7_A1929EstTinNr, P08LA7_A1935BarParTin, P08LA7_n1935BarParTin, P08LA7_A1934BarReoTin, P08LA7_n1934BarReoTin, P08LA7_A1933BarCodTin,
            P08LA7_n1933BarCodTin, P08LA7_A3646EstTinAny, P08LA7_A3647EstTinMes, P08LA7_A3648EstTinDia
            }
            , new Object[] {
            P08LA8_A396EmprCod, P08LA8_A1945BarMaqTin, P08LA8_n1945BarMaqTin, P08LA8_A6634BarRecAcb, P08LA8_n6634BarRecAcb, P08LA8_A13759EstFecCier, P08LA8_A3650BarNumAna, P08LA8_n3650BarNumAna, P08LA8_A11762BarDispCli, P08LA8_n11762BarDispCli,
            P08LA8_A1946BarVolTin, P08LA8_n1946BarVolTin, P08LA8_A12993BarMtsTt, P08LA8_n12993BarMtsTt, P08LA8_A1948BarMtrTin, P08LA8_n1948BarMtrTin, P08LA8_A8563BarKgsTt, P08LA8_n8563BarKgsTt, P08LA8_A1947BarKgmTin, P08LA8_n1947BarKgmTin,
            P08LA8_A1942BarTipCoT, P08LA8_n1942BarTipCoT, P08LA8_A1941BarColNuT, P08LA8_n1941BarColNuT, P08LA8_A1940BarColNoT, P08LA8_n1940BarColNoT, P08LA8_A1937BarDscTin, P08LA8_n1937BarDscTin, P08LA8_A1936BarSerTin, P08LA8_n1936BarSerTin,
            P08LA8_A279CliNom, P08LA8_A252CliCod, P08LA8_A2316BarAgrLot, P08LA8_n2316BarAgrLot, P08LA8_A1929EstTinNr, P08LA8_A1935BarParTin, P08LA8_n1935BarParTin, P08LA8_A1934BarReoTin, P08LA8_n1934BarReoTin, P08LA8_A1933BarCodTin,
            P08LA8_n1933BarCodTin, P08LA8_A3646EstTinAny, P08LA8_A3647EstTinMes, P08LA8_A3648EstTinDia
            }
            , new Object[] {
            P08LA9_A396EmprCod, P08LA9_A11762BarDispCli, P08LA9_n11762BarDispCli, P08LA9_A6634BarRecAcb, P08LA9_n6634BarRecAcb, P08LA9_A13759EstFecCier, P08LA9_A3650BarNumAna, P08LA9_n3650BarNumAna, P08LA9_A1946BarVolTin, P08LA9_n1946BarVolTin,
            P08LA9_A1945BarMaqTin, P08LA9_n1945BarMaqTin, P08LA9_A12993BarMtsTt, P08LA9_n12993BarMtsTt, P08LA9_A1948BarMtrTin, P08LA9_n1948BarMtrTin, P08LA9_A8563BarKgsTt, P08LA9_n8563BarKgsTt, P08LA9_A1947BarKgmTin, P08LA9_n1947BarKgmTin,
            P08LA9_A1942BarTipCoT, P08LA9_n1942BarTipCoT, P08LA9_A1941BarColNuT, P08LA9_n1941BarColNuT, P08LA9_A1940BarColNoT, P08LA9_n1940BarColNoT, P08LA9_A1937BarDscTin, P08LA9_n1937BarDscTin, P08LA9_A1936BarSerTin, P08LA9_n1936BarSerTin,
            P08LA9_A279CliNom, P08LA9_A252CliCod, P08LA9_A2316BarAgrLot, P08LA9_n2316BarAgrLot, P08LA9_A1929EstTinNr, P08LA9_A1935BarParTin, P08LA9_n1935BarParTin, P08LA9_A1934BarReoTin, P08LA9_n1934BarReoTin, P08LA9_A1933BarCodTin,
            P08LA9_n1933BarCodTin, P08LA9_A3646EstTinAny, P08LA9_A3647EstTinMes, P08LA9_A3648EstTinDia
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26TFBarTipCoT ;
   private byte AV27TFBarTipCoT_To ;
   private byte AV69PBarCodReo ;
   private byte AV70BarCodReoP ;
   private byte A1934BarReoTin ;
   private byte A1942BarTipCoT ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private short AV12TFEstTinNr ;
   private short AV13TFEstTinNr_To ;
   private short AV85TFBarNumAna ;
   private short AV86TFBarNumAna_To ;
   private short A1929EstTinNr ;
   private short A3650BarNumAna ;
   private short A3646EstTinAny ;
   private short Gx_err ;
   private int AV94GXV1 ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV24TFBarColNuT ;
   private int AV25TFBarColNuT_To ;
   private int AV38TFBarVolTin ;
   private int AV39TFBarVolTin_To ;
   private int AV65PCliCod ;
   private int AV66CliCodP ;
   private int AV67PBarCod ;
   private int AV68Barcodp ;
   private int AV77PColNum ;
   private int AV78ColNumP ;
   private int A1933BarCodTin ;
   private int A252CliCod ;
   private int A1941BarColNuT ;
   private int A1946BarVolTin ;
   private int AV47InsertIndex ;
   private long AV56count ;
   private java.math.BigDecimal AV28TFBarKgmTin ;
   private java.math.BigDecimal AV29TFBarKgmTin_To ;
   private java.math.BigDecimal AV30TFBarKgsTt ;
   private java.math.BigDecimal AV31TFBarKgsTt_To ;
   private java.math.BigDecimal AV32TFBarMtrTin ;
   private java.math.BigDecimal AV33TFBarMtrTin_To ;
   private java.math.BigDecimal AV34TFBarMtsTt ;
   private java.math.BigDecimal AV35TFBarMtsTt_To ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private String AV90TFBarnhdr_lconti ;
   private String AV91TFBarnhdr_lconti_Sel ;
   private String AV40TFBarAgrLot ;
   private String AV41TFBarAgrLot_Sel ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV18TFBarSerTin ;
   private String AV19TFBarSerTin_Sel ;
   private String AV20TFBarDscTin ;
   private String AV21TFBarDscTin_Sel ;
   private String AV22TFBarColNoT ;
   private String AV23TFBarColNoT_Sel ;
   private String AV36TFBarMaqTin ;
   private String AV37TFBarMaqTin_Sel ;
   private String AV87TFBarDispCli ;
   private String AV88TFBarDispCli_Sel ;
   private String AV62Emprcod ;
   private String AV71PBarCodPar ;
   private String AV72BarCodParP ;
   private String AV73PSerie ;
   private String AV74SerieP ;
   private String AV75PColor ;
   private String AV76ColorP ;
   private String AV79DispCli1 ;
   private String AV80DispCli3 ;
   private String AV81HreRacab ;
   private String AV82MaqCodi ;
   private String AV83MaqCod3 ;
   private String scmdbuf ;
   private String lV90TFBarnhdr_lconti ;
   private String lV40TFBarAgrLot ;
   private String lV16TFCliNom ;
   private String lV18TFBarSerTin ;
   private String lV20TFBarDscTin ;
   private String lV22TFBarColNoT ;
   private String lV36TFBarMaqTin ;
   private String lV87TFBarDispCli ;
   private String A1935BarParTin ;
   private String A2316BarAgrLot ;
   private String A279CliNom ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A1940BarColNoT ;
   private String A1945BarMaqTin ;
   private String A11762BarDispCli ;
   private String A6634BarRecAcb ;
   private String A396EmprCod ;
   private String A13841Barnhdr_lc ;
   private java.util.Date AV10TFEstFecCier ;
   private java.util.Date AV63Fec1 ;
   private java.util.Date AV64Fec3 ;
   private java.util.Date A13759EstFecCier ;
   private boolean returnInSub ;
   private boolean n6634BarRecAcb ;
   private boolean n3650BarNumAna ;
   private boolean n11762BarDispCli ;
   private boolean n1946BarVolTin ;
   private boolean n1945BarMaqTin ;
   private boolean n12993BarMtsTt ;
   private boolean n1948BarMtrTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1947BarKgmTin ;
   private boolean n1942BarTipCoT ;
   private boolean n1941BarColNuT ;
   private boolean n1940BarColNoT ;
   private boolean n1937BarDscTin ;
   private boolean n1936BarSerTin ;
   private boolean n2316BarAgrLot ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private boolean brk8LA3 ;
   private boolean brk8LA5 ;
   private boolean brk8LA7 ;
   private boolean brk8LA9 ;
   private boolean brk8LA11 ;
   private boolean brk8LA13 ;
   private boolean brk8LA15 ;
   private String AV50OptionsJson ;
   private String AV53OptionsDescJson ;
   private String AV55OptionIndexesJson ;
   private String AV46DDOName ;
   private String AV44SearchTxt ;
   private String AV45SearchTxtTo ;
   private String AV89FilterFullText ;
   private String lV89FilterFullText ;
   private String AV48Option ;
   private com.genexus.webpanels.WebSession AV57Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08LA2_A6634BarRecAcb ;
   private boolean[] P08LA2_n6634BarRecAcb ;
   private String[] P08LA2_A396EmprCod ;
   private java.util.Date[] P08LA2_A13759EstFecCier ;
   private short[] P08LA2_A3650BarNumAna ;
   private boolean[] P08LA2_n3650BarNumAna ;
   private String[] P08LA2_A11762BarDispCli ;
   private boolean[] P08LA2_n11762BarDispCli ;
   private int[] P08LA2_A1946BarVolTin ;
   private boolean[] P08LA2_n1946BarVolTin ;
   private String[] P08LA2_A1945BarMaqTin ;
   private boolean[] P08LA2_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08LA2_A12993BarMtsTt ;
   private boolean[] P08LA2_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08LA2_A1948BarMtrTin ;
   private boolean[] P08LA2_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08LA2_A8563BarKgsTt ;
   private boolean[] P08LA2_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08LA2_A1947BarKgmTin ;
   private boolean[] P08LA2_n1947BarKgmTin ;
   private byte[] P08LA2_A1942BarTipCoT ;
   private boolean[] P08LA2_n1942BarTipCoT ;
   private int[] P08LA2_A1941BarColNuT ;
   private boolean[] P08LA2_n1941BarColNuT ;
   private String[] P08LA2_A1940BarColNoT ;
   private boolean[] P08LA2_n1940BarColNoT ;
   private String[] P08LA2_A1937BarDscTin ;
   private boolean[] P08LA2_n1937BarDscTin ;
   private String[] P08LA2_A1936BarSerTin ;
   private boolean[] P08LA2_n1936BarSerTin ;
   private String[] P08LA2_A279CliNom ;
   private int[] P08LA2_A252CliCod ;
   private String[] P08LA2_A2316BarAgrLot ;
   private boolean[] P08LA2_n2316BarAgrLot ;
   private short[] P08LA2_A1929EstTinNr ;
   private String[] P08LA2_A1935BarParTin ;
   private boolean[] P08LA2_n1935BarParTin ;
   private byte[] P08LA2_A1934BarReoTin ;
   private boolean[] P08LA2_n1934BarReoTin ;
   private int[] P08LA2_A1933BarCodTin ;
   private boolean[] P08LA2_n1933BarCodTin ;
   private short[] P08LA2_A3646EstTinAny ;
   private byte[] P08LA2_A3647EstTinMes ;
   private byte[] P08LA2_A3648EstTinDia ;
   private String[] P08LA3_A396EmprCod ;
   private String[] P08LA3_A2316BarAgrLot ;
   private boolean[] P08LA3_n2316BarAgrLot ;
   private String[] P08LA3_A6634BarRecAcb ;
   private boolean[] P08LA3_n6634BarRecAcb ;
   private java.util.Date[] P08LA3_A13759EstFecCier ;
   private short[] P08LA3_A3650BarNumAna ;
   private boolean[] P08LA3_n3650BarNumAna ;
   private String[] P08LA3_A11762BarDispCli ;
   private boolean[] P08LA3_n11762BarDispCli ;
   private int[] P08LA3_A1946BarVolTin ;
   private boolean[] P08LA3_n1946BarVolTin ;
   private String[] P08LA3_A1945BarMaqTin ;
   private boolean[] P08LA3_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08LA3_A12993BarMtsTt ;
   private boolean[] P08LA3_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08LA3_A1948BarMtrTin ;
   private boolean[] P08LA3_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08LA3_A8563BarKgsTt ;
   private boolean[] P08LA3_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08LA3_A1947BarKgmTin ;
   private boolean[] P08LA3_n1947BarKgmTin ;
   private byte[] P08LA3_A1942BarTipCoT ;
   private boolean[] P08LA3_n1942BarTipCoT ;
   private int[] P08LA3_A1941BarColNuT ;
   private boolean[] P08LA3_n1941BarColNuT ;
   private String[] P08LA3_A1940BarColNoT ;
   private boolean[] P08LA3_n1940BarColNoT ;
   private String[] P08LA3_A1937BarDscTin ;
   private boolean[] P08LA3_n1937BarDscTin ;
   private String[] P08LA3_A1936BarSerTin ;
   private boolean[] P08LA3_n1936BarSerTin ;
   private String[] P08LA3_A279CliNom ;
   private int[] P08LA3_A252CliCod ;
   private short[] P08LA3_A1929EstTinNr ;
   private String[] P08LA3_A1935BarParTin ;
   private boolean[] P08LA3_n1935BarParTin ;
   private byte[] P08LA3_A1934BarReoTin ;
   private boolean[] P08LA3_n1934BarReoTin ;
   private int[] P08LA3_A1933BarCodTin ;
   private boolean[] P08LA3_n1933BarCodTin ;
   private short[] P08LA3_A3646EstTinAny ;
   private byte[] P08LA3_A3647EstTinMes ;
   private byte[] P08LA3_A3648EstTinDia ;
   private String[] P08LA4_A396EmprCod ;
   private String[] P08LA4_A279CliNom ;
   private String[] P08LA4_A6634BarRecAcb ;
   private boolean[] P08LA4_n6634BarRecAcb ;
   private java.util.Date[] P08LA4_A13759EstFecCier ;
   private short[] P08LA4_A3650BarNumAna ;
   private boolean[] P08LA4_n3650BarNumAna ;
   private String[] P08LA4_A11762BarDispCli ;
   private boolean[] P08LA4_n11762BarDispCli ;
   private int[] P08LA4_A1946BarVolTin ;
   private boolean[] P08LA4_n1946BarVolTin ;
   private String[] P08LA4_A1945BarMaqTin ;
   private boolean[] P08LA4_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08LA4_A12993BarMtsTt ;
   private boolean[] P08LA4_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08LA4_A1948BarMtrTin ;
   private boolean[] P08LA4_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08LA4_A8563BarKgsTt ;
   private boolean[] P08LA4_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08LA4_A1947BarKgmTin ;
   private boolean[] P08LA4_n1947BarKgmTin ;
   private byte[] P08LA4_A1942BarTipCoT ;
   private boolean[] P08LA4_n1942BarTipCoT ;
   private int[] P08LA4_A1941BarColNuT ;
   private boolean[] P08LA4_n1941BarColNuT ;
   private String[] P08LA4_A1940BarColNoT ;
   private boolean[] P08LA4_n1940BarColNoT ;
   private String[] P08LA4_A1937BarDscTin ;
   private boolean[] P08LA4_n1937BarDscTin ;
   private String[] P08LA4_A1936BarSerTin ;
   private boolean[] P08LA4_n1936BarSerTin ;
   private int[] P08LA4_A252CliCod ;
   private String[] P08LA4_A2316BarAgrLot ;
   private boolean[] P08LA4_n2316BarAgrLot ;
   private short[] P08LA4_A1929EstTinNr ;
   private String[] P08LA4_A1935BarParTin ;
   private boolean[] P08LA4_n1935BarParTin ;
   private byte[] P08LA4_A1934BarReoTin ;
   private boolean[] P08LA4_n1934BarReoTin ;
   private int[] P08LA4_A1933BarCodTin ;
   private boolean[] P08LA4_n1933BarCodTin ;
   private short[] P08LA4_A3646EstTinAny ;
   private byte[] P08LA4_A3647EstTinMes ;
   private byte[] P08LA4_A3648EstTinDia ;
   private String[] P08LA5_A396EmprCod ;
   private String[] P08LA5_A1936BarSerTin ;
   private boolean[] P08LA5_n1936BarSerTin ;
   private String[] P08LA5_A6634BarRecAcb ;
   private boolean[] P08LA5_n6634BarRecAcb ;
   private java.util.Date[] P08LA5_A13759EstFecCier ;
   private short[] P08LA5_A3650BarNumAna ;
   private boolean[] P08LA5_n3650BarNumAna ;
   private String[] P08LA5_A11762BarDispCli ;
   private boolean[] P08LA5_n11762BarDispCli ;
   private int[] P08LA5_A1946BarVolTin ;
   private boolean[] P08LA5_n1946BarVolTin ;
   private String[] P08LA5_A1945BarMaqTin ;
   private boolean[] P08LA5_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08LA5_A12993BarMtsTt ;
   private boolean[] P08LA5_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08LA5_A1948BarMtrTin ;
   private boolean[] P08LA5_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08LA5_A8563BarKgsTt ;
   private boolean[] P08LA5_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08LA5_A1947BarKgmTin ;
   private boolean[] P08LA5_n1947BarKgmTin ;
   private byte[] P08LA5_A1942BarTipCoT ;
   private boolean[] P08LA5_n1942BarTipCoT ;
   private int[] P08LA5_A1941BarColNuT ;
   private boolean[] P08LA5_n1941BarColNuT ;
   private String[] P08LA5_A1940BarColNoT ;
   private boolean[] P08LA5_n1940BarColNoT ;
   private String[] P08LA5_A1937BarDscTin ;
   private boolean[] P08LA5_n1937BarDscTin ;
   private String[] P08LA5_A279CliNom ;
   private int[] P08LA5_A252CliCod ;
   private String[] P08LA5_A2316BarAgrLot ;
   private boolean[] P08LA5_n2316BarAgrLot ;
   private short[] P08LA5_A1929EstTinNr ;
   private String[] P08LA5_A1935BarParTin ;
   private boolean[] P08LA5_n1935BarParTin ;
   private byte[] P08LA5_A1934BarReoTin ;
   private boolean[] P08LA5_n1934BarReoTin ;
   private int[] P08LA5_A1933BarCodTin ;
   private boolean[] P08LA5_n1933BarCodTin ;
   private short[] P08LA5_A3646EstTinAny ;
   private byte[] P08LA5_A3647EstTinMes ;
   private byte[] P08LA5_A3648EstTinDia ;
   private String[] P08LA6_A396EmprCod ;
   private String[] P08LA6_A1937BarDscTin ;
   private boolean[] P08LA6_n1937BarDscTin ;
   private String[] P08LA6_A6634BarRecAcb ;
   private boolean[] P08LA6_n6634BarRecAcb ;
   private java.util.Date[] P08LA6_A13759EstFecCier ;
   private short[] P08LA6_A3650BarNumAna ;
   private boolean[] P08LA6_n3650BarNumAna ;
   private String[] P08LA6_A11762BarDispCli ;
   private boolean[] P08LA6_n11762BarDispCli ;
   private int[] P08LA6_A1946BarVolTin ;
   private boolean[] P08LA6_n1946BarVolTin ;
   private String[] P08LA6_A1945BarMaqTin ;
   private boolean[] P08LA6_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08LA6_A12993BarMtsTt ;
   private boolean[] P08LA6_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08LA6_A1948BarMtrTin ;
   private boolean[] P08LA6_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08LA6_A8563BarKgsTt ;
   private boolean[] P08LA6_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08LA6_A1947BarKgmTin ;
   private boolean[] P08LA6_n1947BarKgmTin ;
   private byte[] P08LA6_A1942BarTipCoT ;
   private boolean[] P08LA6_n1942BarTipCoT ;
   private int[] P08LA6_A1941BarColNuT ;
   private boolean[] P08LA6_n1941BarColNuT ;
   private String[] P08LA6_A1940BarColNoT ;
   private boolean[] P08LA6_n1940BarColNoT ;
   private String[] P08LA6_A1936BarSerTin ;
   private boolean[] P08LA6_n1936BarSerTin ;
   private String[] P08LA6_A279CliNom ;
   private int[] P08LA6_A252CliCod ;
   private String[] P08LA6_A2316BarAgrLot ;
   private boolean[] P08LA6_n2316BarAgrLot ;
   private short[] P08LA6_A1929EstTinNr ;
   private String[] P08LA6_A1935BarParTin ;
   private boolean[] P08LA6_n1935BarParTin ;
   private byte[] P08LA6_A1934BarReoTin ;
   private boolean[] P08LA6_n1934BarReoTin ;
   private int[] P08LA6_A1933BarCodTin ;
   private boolean[] P08LA6_n1933BarCodTin ;
   private short[] P08LA6_A3646EstTinAny ;
   private byte[] P08LA6_A3647EstTinMes ;
   private byte[] P08LA6_A3648EstTinDia ;
   private String[] P08LA7_A396EmprCod ;
   private String[] P08LA7_A1940BarColNoT ;
   private boolean[] P08LA7_n1940BarColNoT ;
   private String[] P08LA7_A6634BarRecAcb ;
   private boolean[] P08LA7_n6634BarRecAcb ;
   private java.util.Date[] P08LA7_A13759EstFecCier ;
   private short[] P08LA7_A3650BarNumAna ;
   private boolean[] P08LA7_n3650BarNumAna ;
   private String[] P08LA7_A11762BarDispCli ;
   private boolean[] P08LA7_n11762BarDispCli ;
   private int[] P08LA7_A1946BarVolTin ;
   private boolean[] P08LA7_n1946BarVolTin ;
   private String[] P08LA7_A1945BarMaqTin ;
   private boolean[] P08LA7_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08LA7_A12993BarMtsTt ;
   private boolean[] P08LA7_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08LA7_A1948BarMtrTin ;
   private boolean[] P08LA7_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08LA7_A8563BarKgsTt ;
   private boolean[] P08LA7_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08LA7_A1947BarKgmTin ;
   private boolean[] P08LA7_n1947BarKgmTin ;
   private byte[] P08LA7_A1942BarTipCoT ;
   private boolean[] P08LA7_n1942BarTipCoT ;
   private int[] P08LA7_A1941BarColNuT ;
   private boolean[] P08LA7_n1941BarColNuT ;
   private String[] P08LA7_A1937BarDscTin ;
   private boolean[] P08LA7_n1937BarDscTin ;
   private String[] P08LA7_A1936BarSerTin ;
   private boolean[] P08LA7_n1936BarSerTin ;
   private String[] P08LA7_A279CliNom ;
   private int[] P08LA7_A252CliCod ;
   private String[] P08LA7_A2316BarAgrLot ;
   private boolean[] P08LA7_n2316BarAgrLot ;
   private short[] P08LA7_A1929EstTinNr ;
   private String[] P08LA7_A1935BarParTin ;
   private boolean[] P08LA7_n1935BarParTin ;
   private byte[] P08LA7_A1934BarReoTin ;
   private boolean[] P08LA7_n1934BarReoTin ;
   private int[] P08LA7_A1933BarCodTin ;
   private boolean[] P08LA7_n1933BarCodTin ;
   private short[] P08LA7_A3646EstTinAny ;
   private byte[] P08LA7_A3647EstTinMes ;
   private byte[] P08LA7_A3648EstTinDia ;
   private String[] P08LA8_A396EmprCod ;
   private String[] P08LA8_A1945BarMaqTin ;
   private boolean[] P08LA8_n1945BarMaqTin ;
   private String[] P08LA8_A6634BarRecAcb ;
   private boolean[] P08LA8_n6634BarRecAcb ;
   private java.util.Date[] P08LA8_A13759EstFecCier ;
   private short[] P08LA8_A3650BarNumAna ;
   private boolean[] P08LA8_n3650BarNumAna ;
   private String[] P08LA8_A11762BarDispCli ;
   private boolean[] P08LA8_n11762BarDispCli ;
   private int[] P08LA8_A1946BarVolTin ;
   private boolean[] P08LA8_n1946BarVolTin ;
   private java.math.BigDecimal[] P08LA8_A12993BarMtsTt ;
   private boolean[] P08LA8_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08LA8_A1948BarMtrTin ;
   private boolean[] P08LA8_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08LA8_A8563BarKgsTt ;
   private boolean[] P08LA8_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08LA8_A1947BarKgmTin ;
   private boolean[] P08LA8_n1947BarKgmTin ;
   private byte[] P08LA8_A1942BarTipCoT ;
   private boolean[] P08LA8_n1942BarTipCoT ;
   private int[] P08LA8_A1941BarColNuT ;
   private boolean[] P08LA8_n1941BarColNuT ;
   private String[] P08LA8_A1940BarColNoT ;
   private boolean[] P08LA8_n1940BarColNoT ;
   private String[] P08LA8_A1937BarDscTin ;
   private boolean[] P08LA8_n1937BarDscTin ;
   private String[] P08LA8_A1936BarSerTin ;
   private boolean[] P08LA8_n1936BarSerTin ;
   private String[] P08LA8_A279CliNom ;
   private int[] P08LA8_A252CliCod ;
   private String[] P08LA8_A2316BarAgrLot ;
   private boolean[] P08LA8_n2316BarAgrLot ;
   private short[] P08LA8_A1929EstTinNr ;
   private String[] P08LA8_A1935BarParTin ;
   private boolean[] P08LA8_n1935BarParTin ;
   private byte[] P08LA8_A1934BarReoTin ;
   private boolean[] P08LA8_n1934BarReoTin ;
   private int[] P08LA8_A1933BarCodTin ;
   private boolean[] P08LA8_n1933BarCodTin ;
   private short[] P08LA8_A3646EstTinAny ;
   private byte[] P08LA8_A3647EstTinMes ;
   private byte[] P08LA8_A3648EstTinDia ;
   private String[] P08LA9_A396EmprCod ;
   private String[] P08LA9_A11762BarDispCli ;
   private boolean[] P08LA9_n11762BarDispCli ;
   private String[] P08LA9_A6634BarRecAcb ;
   private boolean[] P08LA9_n6634BarRecAcb ;
   private java.util.Date[] P08LA9_A13759EstFecCier ;
   private short[] P08LA9_A3650BarNumAna ;
   private boolean[] P08LA9_n3650BarNumAna ;
   private int[] P08LA9_A1946BarVolTin ;
   private boolean[] P08LA9_n1946BarVolTin ;
   private String[] P08LA9_A1945BarMaqTin ;
   private boolean[] P08LA9_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08LA9_A12993BarMtsTt ;
   private boolean[] P08LA9_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08LA9_A1948BarMtrTin ;
   private boolean[] P08LA9_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08LA9_A8563BarKgsTt ;
   private boolean[] P08LA9_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08LA9_A1947BarKgmTin ;
   private boolean[] P08LA9_n1947BarKgmTin ;
   private byte[] P08LA9_A1942BarTipCoT ;
   private boolean[] P08LA9_n1942BarTipCoT ;
   private int[] P08LA9_A1941BarColNuT ;
   private boolean[] P08LA9_n1941BarColNuT ;
   private String[] P08LA9_A1940BarColNoT ;
   private boolean[] P08LA9_n1940BarColNoT ;
   private String[] P08LA9_A1937BarDscTin ;
   private boolean[] P08LA9_n1937BarDscTin ;
   private String[] P08LA9_A1936BarSerTin ;
   private boolean[] P08LA9_n1936BarSerTin ;
   private String[] P08LA9_A279CliNom ;
   private int[] P08LA9_A252CliCod ;
   private String[] P08LA9_A2316BarAgrLot ;
   private boolean[] P08LA9_n2316BarAgrLot ;
   private short[] P08LA9_A1929EstTinNr ;
   private String[] P08LA9_A1935BarParTin ;
   private boolean[] P08LA9_n1935BarParTin ;
   private byte[] P08LA9_A1934BarReoTin ;
   private boolean[] P08LA9_n1934BarReoTin ;
   private int[] P08LA9_A1933BarCodTin ;
   private boolean[] P08LA9_n1933BarCodTin ;
   private short[] P08LA9_A3646EstTinAny ;
   private byte[] P08LA9_A3647EstTinMes ;
   private byte[] P08LA9_A3648EstTinDia ;
   private GXSimpleCollection<String> AV49Options ;
   private GXSimpleCollection<String> AV52OptionsDesc ;
   private GXSimpleCollection<String> AV54OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV59GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV60GridStateFilterValue ;
}

final  class wchistoricorecetaslcontigetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08LA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89FilterFullText ,
                                          java.util.Date AV10TFEstFecCier ,
                                          short AV12TFEstTinNr ,
                                          short AV13TFEstTinNr_To ,
                                          String AV91TFBarnhdr_lconti_Sel ,
                                          String AV90TFBarnhdr_lconti ,
                                          String AV41TFBarAgrLot_Sel ,
                                          String AV40TFBarAgrLot ,
                                          int AV14TFCliCod ,
                                          int AV15TFCliCod_To ,
                                          String AV17TFCliNom_Sel ,
                                          String AV16TFCliNom ,
                                          String AV19TFBarSerTin_Sel ,
                                          String AV18TFBarSerTin ,
                                          String AV21TFBarDscTin_Sel ,
                                          String AV20TFBarDscTin ,
                                          String AV23TFBarColNoT_Sel ,
                                          String AV22TFBarColNoT ,
                                          int AV24TFBarColNuT ,
                                          int AV25TFBarColNuT_To ,
                                          byte AV26TFBarTipCoT ,
                                          byte AV27TFBarTipCoT_To ,
                                          java.math.BigDecimal AV28TFBarKgmTin ,
                                          java.math.BigDecimal AV29TFBarKgmTin_To ,
                                          java.math.BigDecimal AV30TFBarKgsTt ,
                                          java.math.BigDecimal AV31TFBarKgsTt_To ,
                                          java.math.BigDecimal AV32TFBarMtrTin ,
                                          java.math.BigDecimal AV33TFBarMtrTin_To ,
                                          java.math.BigDecimal AV34TFBarMtsTt ,
                                          java.math.BigDecimal AV35TFBarMtsTt_To ,
                                          String AV37TFBarMaqTin_Sel ,
                                          String AV36TFBarMaqTin ,
                                          int AV38TFBarVolTin ,
                                          int AV39TFBarVolTin_To ,
                                          String AV88TFBarDispCli_Sel ,
                                          String AV87TFBarDispCli ,
                                          short AV85TFBarNumAna ,
                                          short AV86TFBarNumAna_To ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV63Fec1 ,
                                          java.util.Date AV64Fec3 ,
                                          int AV65PCliCod ,
                                          int AV66CliCodP ,
                                          int AV67PBarCod ,
                                          int AV68Barcodp ,
                                          byte AV69PBarCodReo ,
                                          byte AV70BarCodReoP ,
                                          String AV71PBarCodPar ,
                                          String AV72BarCodParP ,
                                          String AV73PSerie ,
                                          String AV74SerieP ,
                                          String AV75PColor ,
                                          String AV76ColorP ,
                                          int AV77PColNum ,
                                          int AV78ColNumP ,
                                          String AV79DispCli1 ,
                                          String AV80DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV81HreRacab ,
                                          String AV82MaqCodi ,
                                          String AV83MaqCod3 ,
                                          String AV62Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[78];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.BarRecAcb, T1.EmprCod, T1.EstFecCier, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT," ;
      scmdbuf += " T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      if ( ! (GXutil.strcmp("", AV89FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
         GXv_int2[24] = (byte)(1) ;
         GXv_int2[25] = (byte)(1) ;
         GXv_int2[26] = (byte)(1) ;
         GXv_int2[27] = (byte)(1) ;
         GXv_int2[28] = (byte)(1) ;
         GXv_int2[29] = (byte)(1) ;
         GXv_int2[30] = (byte)(1) ;
         GXv_int2[31] = (byte)(1) ;
         GXv_int2[32] = (byte)(1) ;
         GXv_int2[33] = (byte)(1) ;
         GXv_int2[34] = (byte)(1) ;
         GXv_int2[35] = (byte)(1) ;
         GXv_int2[36] = (byte)(1) ;
         GXv_int2[37] = (byte)(1) ;
         GXv_int2[38] = (byte)(1) ;
         GXv_int2[39] = (byte)(1) ;
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFEstFecCier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (0==AV12TFEstTinNr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (0==AV13TFEstTinNr_To) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarnhdr_lconti)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin = ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarAgrLot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarSerTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFBarDscTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarColNoT)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarColNuT) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( ! (0==AV25TFBarColNuT_To) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( ! (0==AV26TFBarTipCoT) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( ! (0==AV27TFBarTipCoT_To) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarKgmTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int2[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarKgmTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int2[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarKgsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int2[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarKgsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int2[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarMtrTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int2[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarMtrTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int2[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarMtsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int2[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarMtsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int2[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarMaqTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int2[71] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarVolTin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int2[72] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarVolTin_To) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int2[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) && ( ! (GXutil.strcmp("", AV87TFBarDispCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int2[75] = (byte)(1) ;
      }
      if ( ! (0==AV85TFBarNumAna) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int2[76] = (byte)(1) ;
      }
      if ( ! (0==AV86TFBarNumAna_To) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int2[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08LA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89FilterFullText ,
                                          java.util.Date AV10TFEstFecCier ,
                                          short AV12TFEstTinNr ,
                                          short AV13TFEstTinNr_To ,
                                          String AV91TFBarnhdr_lconti_Sel ,
                                          String AV90TFBarnhdr_lconti ,
                                          String AV41TFBarAgrLot_Sel ,
                                          String AV40TFBarAgrLot ,
                                          int AV14TFCliCod ,
                                          int AV15TFCliCod_To ,
                                          String AV17TFCliNom_Sel ,
                                          String AV16TFCliNom ,
                                          String AV19TFBarSerTin_Sel ,
                                          String AV18TFBarSerTin ,
                                          String AV21TFBarDscTin_Sel ,
                                          String AV20TFBarDscTin ,
                                          String AV23TFBarColNoT_Sel ,
                                          String AV22TFBarColNoT ,
                                          int AV24TFBarColNuT ,
                                          int AV25TFBarColNuT_To ,
                                          byte AV26TFBarTipCoT ,
                                          byte AV27TFBarTipCoT_To ,
                                          java.math.BigDecimal AV28TFBarKgmTin ,
                                          java.math.BigDecimal AV29TFBarKgmTin_To ,
                                          java.math.BigDecimal AV30TFBarKgsTt ,
                                          java.math.BigDecimal AV31TFBarKgsTt_To ,
                                          java.math.BigDecimal AV32TFBarMtrTin ,
                                          java.math.BigDecimal AV33TFBarMtrTin_To ,
                                          java.math.BigDecimal AV34TFBarMtsTt ,
                                          java.math.BigDecimal AV35TFBarMtsTt_To ,
                                          String AV37TFBarMaqTin_Sel ,
                                          String AV36TFBarMaqTin ,
                                          int AV38TFBarVolTin ,
                                          int AV39TFBarVolTin_To ,
                                          String AV88TFBarDispCli_Sel ,
                                          String AV87TFBarDispCli ,
                                          short AV85TFBarNumAna ,
                                          short AV86TFBarNumAna_To ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV63Fec1 ,
                                          java.util.Date AV64Fec3 ,
                                          int AV65PCliCod ,
                                          int AV66CliCodP ,
                                          int AV67PBarCod ,
                                          int AV68Barcodp ,
                                          byte AV69PBarCodReo ,
                                          byte AV70BarCodReoP ,
                                          String AV71PBarCodPar ,
                                          String AV72BarCodParP ,
                                          String AV73PSerie ,
                                          String AV74SerieP ,
                                          String AV75PColor ,
                                          String AV76ColorP ,
                                          int AV77PColNum ,
                                          int AV78ColNumP ,
                                          String AV79DispCli1 ,
                                          String AV80DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV81HreRacab ,
                                          String AV82MaqCodi ,
                                          String AV83MaqCod3 ,
                                          String A396EmprCod ,
                                          String AV62Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[78];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarAgrLot, T1.BarRecAcb, T1.EstFecCier, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin," ;
      scmdbuf += " T1.BarTipCoT, T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.EstTinNr, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV89FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
         GXv_int4[24] = (byte)(1) ;
         GXv_int4[25] = (byte)(1) ;
         GXv_int4[26] = (byte)(1) ;
         GXv_int4[27] = (byte)(1) ;
         GXv_int4[28] = (byte)(1) ;
         GXv_int4[29] = (byte)(1) ;
         GXv_int4[30] = (byte)(1) ;
         GXv_int4[31] = (byte)(1) ;
         GXv_int4[32] = (byte)(1) ;
         GXv_int4[33] = (byte)(1) ;
         GXv_int4[34] = (byte)(1) ;
         GXv_int4[35] = (byte)(1) ;
         GXv_int4[36] = (byte)(1) ;
         GXv_int4[37] = (byte)(1) ;
         GXv_int4[38] = (byte)(1) ;
         GXv_int4[39] = (byte)(1) ;
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFEstFecCier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (0==AV12TFEstTinNr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (0==AV13TFEstTinNr_To) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarnhdr_lconti)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin = ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarAgrLot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[51] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarSerTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[52] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int4[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFBarDscTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int4[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarColNoT)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int4[57] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarColNuT) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int4[58] = (byte)(1) ;
      }
      if ( ! (0==AV25TFBarColNuT_To) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int4[59] = (byte)(1) ;
      }
      if ( ! (0==AV26TFBarTipCoT) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int4[60] = (byte)(1) ;
      }
      if ( ! (0==AV27TFBarTipCoT_To) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int4[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarKgmTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int4[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarKgmTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int4[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarKgsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int4[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarKgsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int4[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarMtrTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int4[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarMtrTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int4[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarMtsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int4[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarMtsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int4[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarMaqTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int4[71] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarVolTin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int4[72] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarVolTin_To) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int4[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) && ( ! (GXutil.strcmp("", AV87TFBarDispCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int4[75] = (byte)(1) ;
      }
      if ( ! (0==AV85TFBarNumAna) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int4[76] = (byte)(1) ;
      }
      if ( ! (0==AV86TFBarNumAna_To) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int4[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarAgrLot" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08LA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89FilterFullText ,
                                          java.util.Date AV10TFEstFecCier ,
                                          short AV12TFEstTinNr ,
                                          short AV13TFEstTinNr_To ,
                                          String AV91TFBarnhdr_lconti_Sel ,
                                          String AV90TFBarnhdr_lconti ,
                                          String AV41TFBarAgrLot_Sel ,
                                          String AV40TFBarAgrLot ,
                                          int AV14TFCliCod ,
                                          int AV15TFCliCod_To ,
                                          String AV17TFCliNom_Sel ,
                                          String AV16TFCliNom ,
                                          String AV19TFBarSerTin_Sel ,
                                          String AV18TFBarSerTin ,
                                          String AV21TFBarDscTin_Sel ,
                                          String AV20TFBarDscTin ,
                                          String AV23TFBarColNoT_Sel ,
                                          String AV22TFBarColNoT ,
                                          int AV24TFBarColNuT ,
                                          int AV25TFBarColNuT_To ,
                                          byte AV26TFBarTipCoT ,
                                          byte AV27TFBarTipCoT_To ,
                                          java.math.BigDecimal AV28TFBarKgmTin ,
                                          java.math.BigDecimal AV29TFBarKgmTin_To ,
                                          java.math.BigDecimal AV30TFBarKgsTt ,
                                          java.math.BigDecimal AV31TFBarKgsTt_To ,
                                          java.math.BigDecimal AV32TFBarMtrTin ,
                                          java.math.BigDecimal AV33TFBarMtrTin_To ,
                                          java.math.BigDecimal AV34TFBarMtsTt ,
                                          java.math.BigDecimal AV35TFBarMtsTt_To ,
                                          String AV37TFBarMaqTin_Sel ,
                                          String AV36TFBarMaqTin ,
                                          int AV38TFBarVolTin ,
                                          int AV39TFBarVolTin_To ,
                                          String AV88TFBarDispCli_Sel ,
                                          String AV87TFBarDispCli ,
                                          short AV85TFBarNumAna ,
                                          short AV86TFBarNumAna_To ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV63Fec1 ,
                                          java.util.Date AV64Fec3 ,
                                          int AV65PCliCod ,
                                          int AV66CliCodP ,
                                          int AV67PBarCod ,
                                          int AV68Barcodp ,
                                          byte AV69PBarCodReo ,
                                          byte AV70BarCodReoP ,
                                          String AV71PBarCodPar ,
                                          String AV72BarCodParP ,
                                          String AV73PSerie ,
                                          String AV74SerieP ,
                                          String AV75PColor ,
                                          String AV76ColorP ,
                                          int AV77PColNum ,
                                          int AV78ColNumP ,
                                          String AV79DispCli1 ,
                                          String AV80DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV81HreRacab ,
                                          String AV82MaqCodi ,
                                          String AV83MaqCod3 ,
                                          String A396EmprCod ,
                                          String AV62Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[78];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.BarRecAcb, T1.EstFecCier, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin," ;
      scmdbuf += " T1.BarTipCoT, T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV89FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
         GXv_int6[24] = (byte)(1) ;
         GXv_int6[25] = (byte)(1) ;
         GXv_int6[26] = (byte)(1) ;
         GXv_int6[27] = (byte)(1) ;
         GXv_int6[28] = (byte)(1) ;
         GXv_int6[29] = (byte)(1) ;
         GXv_int6[30] = (byte)(1) ;
         GXv_int6[31] = (byte)(1) ;
         GXv_int6[32] = (byte)(1) ;
         GXv_int6[33] = (byte)(1) ;
         GXv_int6[34] = (byte)(1) ;
         GXv_int6[35] = (byte)(1) ;
         GXv_int6[36] = (byte)(1) ;
         GXv_int6[37] = (byte)(1) ;
         GXv_int6[38] = (byte)(1) ;
         GXv_int6[39] = (byte)(1) ;
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFEstFecCier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (0==AV12TFEstTinNr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (0==AV13TFEstTinNr_To) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarnhdr_lconti)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin = ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarAgrLot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarSerTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFBarDscTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarColNoT)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarColNuT) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( ! (0==AV25TFBarColNuT_To) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( ! (0==AV26TFBarTipCoT) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (0==AV27TFBarTipCoT_To) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarKgmTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int6[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarKgmTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int6[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarKgsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int6[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarKgsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int6[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarMtrTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int6[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarMtrTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int6[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarMtsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int6[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarMtsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int6[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarMaqTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int6[71] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarVolTin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int6[72] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarVolTin_To) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int6[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) && ( ! (GXutil.strcmp("", AV87TFBarDispCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int6[75] = (byte)(1) ;
      }
      if ( ! (0==AV85TFBarNumAna) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int6[76] = (byte)(1) ;
      }
      if ( ! (0==AV86TFBarNumAna_To) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int6[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08LA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89FilterFullText ,
                                          java.util.Date AV10TFEstFecCier ,
                                          short AV12TFEstTinNr ,
                                          short AV13TFEstTinNr_To ,
                                          String AV91TFBarnhdr_lconti_Sel ,
                                          String AV90TFBarnhdr_lconti ,
                                          String AV41TFBarAgrLot_Sel ,
                                          String AV40TFBarAgrLot ,
                                          int AV14TFCliCod ,
                                          int AV15TFCliCod_To ,
                                          String AV17TFCliNom_Sel ,
                                          String AV16TFCliNom ,
                                          String AV19TFBarSerTin_Sel ,
                                          String AV18TFBarSerTin ,
                                          String AV21TFBarDscTin_Sel ,
                                          String AV20TFBarDscTin ,
                                          String AV23TFBarColNoT_Sel ,
                                          String AV22TFBarColNoT ,
                                          int AV24TFBarColNuT ,
                                          int AV25TFBarColNuT_To ,
                                          byte AV26TFBarTipCoT ,
                                          byte AV27TFBarTipCoT_To ,
                                          java.math.BigDecimal AV28TFBarKgmTin ,
                                          java.math.BigDecimal AV29TFBarKgmTin_To ,
                                          java.math.BigDecimal AV30TFBarKgsTt ,
                                          java.math.BigDecimal AV31TFBarKgsTt_To ,
                                          java.math.BigDecimal AV32TFBarMtrTin ,
                                          java.math.BigDecimal AV33TFBarMtrTin_To ,
                                          java.math.BigDecimal AV34TFBarMtsTt ,
                                          java.math.BigDecimal AV35TFBarMtsTt_To ,
                                          String AV37TFBarMaqTin_Sel ,
                                          String AV36TFBarMaqTin ,
                                          int AV38TFBarVolTin ,
                                          int AV39TFBarVolTin_To ,
                                          String AV88TFBarDispCli_Sel ,
                                          String AV87TFBarDispCli ,
                                          short AV85TFBarNumAna ,
                                          short AV86TFBarNumAna_To ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV63Fec1 ,
                                          java.util.Date AV64Fec3 ,
                                          int AV65PCliCod ,
                                          int AV66CliCodP ,
                                          int AV67PBarCod ,
                                          int AV68Barcodp ,
                                          byte AV69PBarCodReo ,
                                          byte AV70BarCodReoP ,
                                          String AV71PBarCodPar ,
                                          String AV72BarCodParP ,
                                          String AV75PColor ,
                                          String AV76ColorP ,
                                          int AV77PColNum ,
                                          int AV78ColNumP ,
                                          String AV79DispCli1 ,
                                          String AV80DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV81HreRacab ,
                                          String AV82MaqCodi ,
                                          String AV83MaqCod3 ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          String AV73PSerie ,
                                          String AV74SerieP )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[78];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarSerTin, T1.BarRecAcb, T1.EstFecCier, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin," ;
      scmdbuf += " T1.BarTipCoT, T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      if ( ! (GXutil.strcmp("", AV89FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
         GXv_int8[24] = (byte)(1) ;
         GXv_int8[25] = (byte)(1) ;
         GXv_int8[26] = (byte)(1) ;
         GXv_int8[27] = (byte)(1) ;
         GXv_int8[28] = (byte)(1) ;
         GXv_int8[29] = (byte)(1) ;
         GXv_int8[30] = (byte)(1) ;
         GXv_int8[31] = (byte)(1) ;
         GXv_int8[32] = (byte)(1) ;
         GXv_int8[33] = (byte)(1) ;
         GXv_int8[34] = (byte)(1) ;
         GXv_int8[35] = (byte)(1) ;
         GXv_int8[36] = (byte)(1) ;
         GXv_int8[37] = (byte)(1) ;
         GXv_int8[38] = (byte)(1) ;
         GXv_int8[39] = (byte)(1) ;
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFEstFecCier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV12TFEstTinNr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (0==AV13TFEstTinNr_To) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarnhdr_lconti)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin = ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarAgrLot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarSerTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFBarDscTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarColNoT)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int8[57] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarColNuT) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int8[58] = (byte)(1) ;
      }
      if ( ! (0==AV25TFBarColNuT_To) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int8[59] = (byte)(1) ;
      }
      if ( ! (0==AV26TFBarTipCoT) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int8[60] = (byte)(1) ;
      }
      if ( ! (0==AV27TFBarTipCoT_To) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int8[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarKgmTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int8[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarKgmTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int8[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarKgsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int8[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarKgsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int8[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarMtrTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int8[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarMtrTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int8[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarMtsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int8[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarMtsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int8[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarMaqTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int8[71] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarVolTin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int8[72] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarVolTin_To) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int8[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) && ( ! (GXutil.strcmp("", AV87TFBarDispCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int8[75] = (byte)(1) ;
      }
      if ( ! (0==AV85TFBarNumAna) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int8[76] = (byte)(1) ;
      }
      if ( ! (0==AV86TFBarNumAna_To) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int8[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerTin" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08LA6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89FilterFullText ,
                                          java.util.Date AV10TFEstFecCier ,
                                          short AV12TFEstTinNr ,
                                          short AV13TFEstTinNr_To ,
                                          String AV91TFBarnhdr_lconti_Sel ,
                                          String AV90TFBarnhdr_lconti ,
                                          String AV41TFBarAgrLot_Sel ,
                                          String AV40TFBarAgrLot ,
                                          int AV14TFCliCod ,
                                          int AV15TFCliCod_To ,
                                          String AV17TFCliNom_Sel ,
                                          String AV16TFCliNom ,
                                          String AV19TFBarSerTin_Sel ,
                                          String AV18TFBarSerTin ,
                                          String AV21TFBarDscTin_Sel ,
                                          String AV20TFBarDscTin ,
                                          String AV23TFBarColNoT_Sel ,
                                          String AV22TFBarColNoT ,
                                          int AV24TFBarColNuT ,
                                          int AV25TFBarColNuT_To ,
                                          byte AV26TFBarTipCoT ,
                                          byte AV27TFBarTipCoT_To ,
                                          java.math.BigDecimal AV28TFBarKgmTin ,
                                          java.math.BigDecimal AV29TFBarKgmTin_To ,
                                          java.math.BigDecimal AV30TFBarKgsTt ,
                                          java.math.BigDecimal AV31TFBarKgsTt_To ,
                                          java.math.BigDecimal AV32TFBarMtrTin ,
                                          java.math.BigDecimal AV33TFBarMtrTin_To ,
                                          java.math.BigDecimal AV34TFBarMtsTt ,
                                          java.math.BigDecimal AV35TFBarMtsTt_To ,
                                          String AV37TFBarMaqTin_Sel ,
                                          String AV36TFBarMaqTin ,
                                          int AV38TFBarVolTin ,
                                          int AV39TFBarVolTin_To ,
                                          String AV88TFBarDispCli_Sel ,
                                          String AV87TFBarDispCli ,
                                          short AV85TFBarNumAna ,
                                          short AV86TFBarNumAna_To ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV63Fec1 ,
                                          java.util.Date AV64Fec3 ,
                                          int AV65PCliCod ,
                                          int AV66CliCodP ,
                                          int AV67PBarCod ,
                                          int AV68Barcodp ,
                                          byte AV69PBarCodReo ,
                                          byte AV70BarCodReoP ,
                                          String AV71PBarCodPar ,
                                          String AV72BarCodParP ,
                                          String AV73PSerie ,
                                          String AV74SerieP ,
                                          String AV75PColor ,
                                          String AV76ColorP ,
                                          int AV77PColNum ,
                                          int AV78ColNumP ,
                                          String AV79DispCli1 ,
                                          String AV80DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV81HreRacab ,
                                          String AV82MaqCodi ,
                                          String AV83MaqCod3 ,
                                          String A396EmprCod ,
                                          String AV62Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[78];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarDscTin, T1.BarRecAcb, T1.EstFecCier, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin," ;
      scmdbuf += " T1.BarTipCoT, T1.BarColNuT, T1.BarColNoT, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV89FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
         GXv_int10[24] = (byte)(1) ;
         GXv_int10[25] = (byte)(1) ;
         GXv_int10[26] = (byte)(1) ;
         GXv_int10[27] = (byte)(1) ;
         GXv_int10[28] = (byte)(1) ;
         GXv_int10[29] = (byte)(1) ;
         GXv_int10[30] = (byte)(1) ;
         GXv_int10[31] = (byte)(1) ;
         GXv_int10[32] = (byte)(1) ;
         GXv_int10[33] = (byte)(1) ;
         GXv_int10[34] = (byte)(1) ;
         GXv_int10[35] = (byte)(1) ;
         GXv_int10[36] = (byte)(1) ;
         GXv_int10[37] = (byte)(1) ;
         GXv_int10[38] = (byte)(1) ;
         GXv_int10[39] = (byte)(1) ;
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFEstFecCier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (0==AV12TFEstTinNr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (0==AV13TFEstTinNr_To) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarnhdr_lconti)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin = ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarAgrLot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarSerTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[52] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int10[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFBarDscTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int10[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarColNoT)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int10[57] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarColNuT) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int10[58] = (byte)(1) ;
      }
      if ( ! (0==AV25TFBarColNuT_To) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int10[59] = (byte)(1) ;
      }
      if ( ! (0==AV26TFBarTipCoT) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int10[60] = (byte)(1) ;
      }
      if ( ! (0==AV27TFBarTipCoT_To) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int10[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarKgmTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int10[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarKgmTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int10[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarKgsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int10[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarKgsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int10[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarMtrTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int10[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarMtrTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int10[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarMtsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int10[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarMtsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int10[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarMaqTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int10[71] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarVolTin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int10[72] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarVolTin_To) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int10[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) && ( ! (GXutil.strcmp("", AV87TFBarDispCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int10[75] = (byte)(1) ;
      }
      if ( ! (0==AV85TFBarNumAna) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int10[76] = (byte)(1) ;
      }
      if ( ! (0==AV86TFBarNumAna_To) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int10[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarDscTin" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08LA7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89FilterFullText ,
                                          java.util.Date AV10TFEstFecCier ,
                                          short AV12TFEstTinNr ,
                                          short AV13TFEstTinNr_To ,
                                          String AV91TFBarnhdr_lconti_Sel ,
                                          String AV90TFBarnhdr_lconti ,
                                          String AV41TFBarAgrLot_Sel ,
                                          String AV40TFBarAgrLot ,
                                          int AV14TFCliCod ,
                                          int AV15TFCliCod_To ,
                                          String AV17TFCliNom_Sel ,
                                          String AV16TFCliNom ,
                                          String AV19TFBarSerTin_Sel ,
                                          String AV18TFBarSerTin ,
                                          String AV21TFBarDscTin_Sel ,
                                          String AV20TFBarDscTin ,
                                          String AV23TFBarColNoT_Sel ,
                                          String AV22TFBarColNoT ,
                                          int AV24TFBarColNuT ,
                                          int AV25TFBarColNuT_To ,
                                          byte AV26TFBarTipCoT ,
                                          byte AV27TFBarTipCoT_To ,
                                          java.math.BigDecimal AV28TFBarKgmTin ,
                                          java.math.BigDecimal AV29TFBarKgmTin_To ,
                                          java.math.BigDecimal AV30TFBarKgsTt ,
                                          java.math.BigDecimal AV31TFBarKgsTt_To ,
                                          java.math.BigDecimal AV32TFBarMtrTin ,
                                          java.math.BigDecimal AV33TFBarMtrTin_To ,
                                          java.math.BigDecimal AV34TFBarMtsTt ,
                                          java.math.BigDecimal AV35TFBarMtsTt_To ,
                                          String AV37TFBarMaqTin_Sel ,
                                          String AV36TFBarMaqTin ,
                                          int AV38TFBarVolTin ,
                                          int AV39TFBarVolTin_To ,
                                          String AV88TFBarDispCli_Sel ,
                                          String AV87TFBarDispCli ,
                                          short AV85TFBarNumAna ,
                                          short AV86TFBarNumAna_To ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV63Fec1 ,
                                          java.util.Date AV64Fec3 ,
                                          int AV65PCliCod ,
                                          int AV66CliCodP ,
                                          int AV67PBarCod ,
                                          int AV68Barcodp ,
                                          byte AV69PBarCodReo ,
                                          byte AV70BarCodReoP ,
                                          String AV71PBarCodPar ,
                                          String AV72BarCodParP ,
                                          String AV73PSerie ,
                                          String AV74SerieP ,
                                          int AV77PColNum ,
                                          int AV78ColNumP ,
                                          String AV79DispCli1 ,
                                          String AV80DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV81HreRacab ,
                                          String AV82MaqCodi ,
                                          String AV83MaqCod3 ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          String AV75PColor ,
                                          String AV76ColorP )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[78];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarColNoT, T1.BarRecAcb, T1.EstFecCier, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin," ;
      scmdbuf += " T1.BarTipCoT, T1.BarColNuT, T1.BarDscTin, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      if ( ! (GXutil.strcmp("", AV89FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
         GXv_int12[24] = (byte)(1) ;
         GXv_int12[25] = (byte)(1) ;
         GXv_int12[26] = (byte)(1) ;
         GXv_int12[27] = (byte)(1) ;
         GXv_int12[28] = (byte)(1) ;
         GXv_int12[29] = (byte)(1) ;
         GXv_int12[30] = (byte)(1) ;
         GXv_int12[31] = (byte)(1) ;
         GXv_int12[32] = (byte)(1) ;
         GXv_int12[33] = (byte)(1) ;
         GXv_int12[34] = (byte)(1) ;
         GXv_int12[35] = (byte)(1) ;
         GXv_int12[36] = (byte)(1) ;
         GXv_int12[37] = (byte)(1) ;
         GXv_int12[38] = (byte)(1) ;
         GXv_int12[39] = (byte)(1) ;
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFEstFecCier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (0==AV12TFEstTinNr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (0==AV13TFEstTinNr_To) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarnhdr_lconti)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin = ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarAgrLot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[51] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarSerTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[52] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int12[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFBarDscTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int12[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarColNoT)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int12[57] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarColNuT) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int12[58] = (byte)(1) ;
      }
      if ( ! (0==AV25TFBarColNuT_To) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int12[59] = (byte)(1) ;
      }
      if ( ! (0==AV26TFBarTipCoT) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int12[60] = (byte)(1) ;
      }
      if ( ! (0==AV27TFBarTipCoT_To) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int12[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarKgmTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int12[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarKgmTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int12[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarKgsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int12[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarKgsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int12[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarMtrTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int12[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarMtrTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int12[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarMtsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int12[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarMtsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int12[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarMaqTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int12[71] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarVolTin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int12[72] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarVolTin_To) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int12[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) && ( ! (GXutil.strcmp("", AV87TFBarDispCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int12[75] = (byte)(1) ;
      }
      if ( ! (0==AV85TFBarNumAna) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int12[76] = (byte)(1) ;
      }
      if ( ! (0==AV86TFBarNumAna_To) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int12[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNoT" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08LA8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89FilterFullText ,
                                          java.util.Date AV10TFEstFecCier ,
                                          short AV12TFEstTinNr ,
                                          short AV13TFEstTinNr_To ,
                                          String AV91TFBarnhdr_lconti_Sel ,
                                          String AV90TFBarnhdr_lconti ,
                                          String AV41TFBarAgrLot_Sel ,
                                          String AV40TFBarAgrLot ,
                                          int AV14TFCliCod ,
                                          int AV15TFCliCod_To ,
                                          String AV17TFCliNom_Sel ,
                                          String AV16TFCliNom ,
                                          String AV19TFBarSerTin_Sel ,
                                          String AV18TFBarSerTin ,
                                          String AV21TFBarDscTin_Sel ,
                                          String AV20TFBarDscTin ,
                                          String AV23TFBarColNoT_Sel ,
                                          String AV22TFBarColNoT ,
                                          int AV24TFBarColNuT ,
                                          int AV25TFBarColNuT_To ,
                                          byte AV26TFBarTipCoT ,
                                          byte AV27TFBarTipCoT_To ,
                                          java.math.BigDecimal AV28TFBarKgmTin ,
                                          java.math.BigDecimal AV29TFBarKgmTin_To ,
                                          java.math.BigDecimal AV30TFBarKgsTt ,
                                          java.math.BigDecimal AV31TFBarKgsTt_To ,
                                          java.math.BigDecimal AV32TFBarMtrTin ,
                                          java.math.BigDecimal AV33TFBarMtrTin_To ,
                                          java.math.BigDecimal AV34TFBarMtsTt ,
                                          java.math.BigDecimal AV35TFBarMtsTt_To ,
                                          String AV37TFBarMaqTin_Sel ,
                                          String AV36TFBarMaqTin ,
                                          int AV38TFBarVolTin ,
                                          int AV39TFBarVolTin_To ,
                                          String AV88TFBarDispCli_Sel ,
                                          String AV87TFBarDispCli ,
                                          short AV85TFBarNumAna ,
                                          short AV86TFBarNumAna_To ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV63Fec1 ,
                                          java.util.Date AV64Fec3 ,
                                          int AV65PCliCod ,
                                          int AV66CliCodP ,
                                          int AV67PBarCod ,
                                          int AV68Barcodp ,
                                          byte AV69PBarCodReo ,
                                          byte AV70BarCodReoP ,
                                          String AV71PBarCodPar ,
                                          String AV72BarCodParP ,
                                          String AV73PSerie ,
                                          String AV74SerieP ,
                                          String AV75PColor ,
                                          String AV76ColorP ,
                                          int AV77PColNum ,
                                          int AV78ColNumP ,
                                          String AV79DispCli1 ,
                                          String AV80DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV81HreRacab ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          String AV82MaqCodi ,
                                          String AV83MaqCod3 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[78];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarMaqTin, T1.BarRecAcb, T1.EstFecCier, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT," ;
      scmdbuf += " T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      if ( ! (GXutil.strcmp("", AV89FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
         GXv_int14[24] = (byte)(1) ;
         GXv_int14[25] = (byte)(1) ;
         GXv_int14[26] = (byte)(1) ;
         GXv_int14[27] = (byte)(1) ;
         GXv_int14[28] = (byte)(1) ;
         GXv_int14[29] = (byte)(1) ;
         GXv_int14[30] = (byte)(1) ;
         GXv_int14[31] = (byte)(1) ;
         GXv_int14[32] = (byte)(1) ;
         GXv_int14[33] = (byte)(1) ;
         GXv_int14[34] = (byte)(1) ;
         GXv_int14[35] = (byte)(1) ;
         GXv_int14[36] = (byte)(1) ;
         GXv_int14[37] = (byte)(1) ;
         GXv_int14[38] = (byte)(1) ;
         GXv_int14[39] = (byte)(1) ;
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFEstFecCier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (0==AV12TFEstTinNr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (0==AV13TFEstTinNr_To) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarnhdr_lconti)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin = ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarAgrLot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarSerTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFBarDscTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int14[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarColNoT)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int14[57] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarColNuT) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int14[58] = (byte)(1) ;
      }
      if ( ! (0==AV25TFBarColNuT_To) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int14[59] = (byte)(1) ;
      }
      if ( ! (0==AV26TFBarTipCoT) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int14[60] = (byte)(1) ;
      }
      if ( ! (0==AV27TFBarTipCoT_To) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int14[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarKgmTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int14[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarKgmTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int14[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarKgsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int14[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarKgsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int14[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarMtrTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int14[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarMtrTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int14[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarMtsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int14[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarMtsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int14[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarMaqTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int14[71] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarVolTin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int14[72] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarVolTin_To) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int14[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) && ( ! (GXutil.strcmp("", AV87TFBarDispCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int14[75] = (byte)(1) ;
      }
      if ( ! (0==AV85TFBarNumAna) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int14[76] = (byte)(1) ;
      }
      if ( ! (0==AV86TFBarNumAna_To) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int14[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarMaqTin" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08LA9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89FilterFullText ,
                                          java.util.Date AV10TFEstFecCier ,
                                          short AV12TFEstTinNr ,
                                          short AV13TFEstTinNr_To ,
                                          String AV91TFBarnhdr_lconti_Sel ,
                                          String AV90TFBarnhdr_lconti ,
                                          String AV41TFBarAgrLot_Sel ,
                                          String AV40TFBarAgrLot ,
                                          int AV14TFCliCod ,
                                          int AV15TFCliCod_To ,
                                          String AV17TFCliNom_Sel ,
                                          String AV16TFCliNom ,
                                          String AV19TFBarSerTin_Sel ,
                                          String AV18TFBarSerTin ,
                                          String AV21TFBarDscTin_Sel ,
                                          String AV20TFBarDscTin ,
                                          String AV23TFBarColNoT_Sel ,
                                          String AV22TFBarColNoT ,
                                          int AV24TFBarColNuT ,
                                          int AV25TFBarColNuT_To ,
                                          byte AV26TFBarTipCoT ,
                                          byte AV27TFBarTipCoT_To ,
                                          java.math.BigDecimal AV28TFBarKgmTin ,
                                          java.math.BigDecimal AV29TFBarKgmTin_To ,
                                          java.math.BigDecimal AV30TFBarKgsTt ,
                                          java.math.BigDecimal AV31TFBarKgsTt_To ,
                                          java.math.BigDecimal AV32TFBarMtrTin ,
                                          java.math.BigDecimal AV33TFBarMtrTin_To ,
                                          java.math.BigDecimal AV34TFBarMtsTt ,
                                          java.math.BigDecimal AV35TFBarMtsTt_To ,
                                          String AV37TFBarMaqTin_Sel ,
                                          String AV36TFBarMaqTin ,
                                          int AV38TFBarVolTin ,
                                          int AV39TFBarVolTin_To ,
                                          String AV88TFBarDispCli_Sel ,
                                          String AV87TFBarDispCli ,
                                          short AV85TFBarNumAna ,
                                          short AV86TFBarNumAna_To ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV63Fec1 ,
                                          java.util.Date AV64Fec3 ,
                                          int AV65PCliCod ,
                                          int AV66CliCodP ,
                                          int AV67PBarCod ,
                                          int AV68Barcodp ,
                                          byte AV69PBarCodReo ,
                                          byte AV70BarCodReoP ,
                                          String AV71PBarCodPar ,
                                          String AV72BarCodParP ,
                                          String AV73PSerie ,
                                          String AV74SerieP ,
                                          String AV75PColor ,
                                          String AV76ColorP ,
                                          int AV77PColNum ,
                                          int AV78ColNumP ,
                                          String A6634BarRecAcb ,
                                          String AV81HreRacab ,
                                          String AV82MaqCodi ,
                                          String AV83MaqCod3 ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          String AV79DispCli1 ,
                                          String AV80DispCli3 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[78];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarDispCli, T1.BarRecAcb, T1.EstFecCier, T1.BarNumAna, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT," ;
      scmdbuf += " T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      if ( ! (GXutil.strcmp("", AV89FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
         GXv_int16[24] = (byte)(1) ;
         GXv_int16[25] = (byte)(1) ;
         GXv_int16[26] = (byte)(1) ;
         GXv_int16[27] = (byte)(1) ;
         GXv_int16[28] = (byte)(1) ;
         GXv_int16[29] = (byte)(1) ;
         GXv_int16[30] = (byte)(1) ;
         GXv_int16[31] = (byte)(1) ;
         GXv_int16[32] = (byte)(1) ;
         GXv_int16[33] = (byte)(1) ;
         GXv_int16[34] = (byte)(1) ;
         GXv_int16[35] = (byte)(1) ;
         GXv_int16[36] = (byte)(1) ;
         GXv_int16[37] = (byte)(1) ;
         GXv_int16[38] = (byte)(1) ;
         GXv_int16[39] = (byte)(1) ;
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFEstFecCier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (0==AV12TFEstTinNr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (0==AV13TFEstTinNr_To) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarnhdr_lconti)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarnhdr_lconti_Sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin = ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFBarAgrLot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFBarAgrLot_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      if ( ! (0==AV14TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int16[48] = (byte)(1) ;
      }
      if ( ! (0==AV15TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int16[49] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int16[51] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFBarSerTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[52] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFBarSerTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int16[53] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) && ( ! (GXutil.strcmp("", AV20TFBarDscTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21TFBarDscTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int16[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) && ( ! (GXutil.strcmp("", AV22TFBarColNoT)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV23TFBarColNoT_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int16[57] = (byte)(1) ;
      }
      if ( ! (0==AV24TFBarColNuT) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int16[58] = (byte)(1) ;
      }
      if ( ! (0==AV25TFBarColNuT_To) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int16[59] = (byte)(1) ;
      }
      if ( ! (0==AV26TFBarTipCoT) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int16[60] = (byte)(1) ;
      }
      if ( ! (0==AV27TFBarTipCoT_To) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int16[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFBarKgmTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int16[62] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFBarKgmTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int16[63] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFBarKgsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int16[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarKgsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int16[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarMtrTin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int16[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarMtrTin_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int16[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarMtsTt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int16[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarMtsTt_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int16[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) && ( ! (GXutil.strcmp("", AV36TFBarMaqTin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFBarMaqTin_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int16[71] = (byte)(1) ;
      }
      if ( ! (0==AV38TFBarVolTin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int16[72] = (byte)(1) ;
      }
      if ( ! (0==AV39TFBarVolTin_To) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int16[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) && ( ! (GXutil.strcmp("", AV87TFBarDispCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88TFBarDispCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int16[75] = (byte)(1) ;
      }
      if ( ! (0==AV85TFBarNumAna) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int16[76] = (byte)(1) ;
      }
      if ( ! (0==AV86TFBarNumAna_To) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int16[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarDispCli" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P08LA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , (java.util.Date)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
            case 1 :
                  return conditional_P08LA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , (java.util.Date)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
            case 2 :
                  return conditional_P08LA4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , (java.util.Date)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
            case 3 :
                  return conditional_P08LA5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , (java.util.Date)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
            case 4 :
                  return conditional_P08LA6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , (java.util.Date)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
            case 5 :
                  return conditional_P08LA7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , (java.util.Date)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
            case 6 :
                  return conditional_P08LA8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , (java.util.Date)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
            case 7 :
                  return conditional_P08LA9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , (java.util.Date)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).intValue() , ((Number) dynConstraints[65]).byteValue() , ((Number) dynConstraints[66]).byteValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).intValue() , ((Number) dynConstraints[74]).intValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08LA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LA6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LA7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LA8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08LA9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((byte[]) buf[43])[0] = rslt.getByte(26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((int[]) buf[33])[0] = rslt.getInt(19);
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((byte[]) buf[43])[0] = rslt.getByte(26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((byte[]) buf[43])[0] = rslt.getByte(26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((byte[]) buf[43])[0] = rslt.getByte(26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((byte[]) buf[43])[0] = rslt.getByte(26);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((byte[]) buf[43])[0] = rslt.getByte(26);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((byte[]) buf[43])[0] = rslt.getByte(26);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((byte[]) buf[42])[0] = rslt.getByte(25);
               ((byte[]) buf[43])[0] = rslt.getByte(26);
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
                  stmt.setString(sIdx, (String)parms[78], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[121]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 11);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 11);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 10);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 26);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[139]).byteValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[142], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[143], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[144], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[146], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[147], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 6);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 20);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 20);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[154]).shortValue());
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[121]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 11);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 11);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 10);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 26);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[139]).byteValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[142], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[143], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[144], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[146], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[147], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 6);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 20);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 20);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[154]).shortValue());
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[121]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 11);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 11);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 10);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 26);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[139]).byteValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[142], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[143], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[144], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[146], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[147], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 6);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 20);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 20);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[154]).shortValue());
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[121]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 11);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 11);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 10);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 26);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[139]).byteValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[142], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[143], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[144], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[146], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[147], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 6);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 20);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 20);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[154]).shortValue());
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[84]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[121]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 11);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 11);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 10);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 26);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[139]).byteValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[142], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[143], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[144], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[146], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[147], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 6);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 20);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 20);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[154]).shortValue());
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 13);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[121]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 11);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 11);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 10);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 26);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[139]).byteValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[142], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[143], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[144], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[146], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[147], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 6);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 20);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 20);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[154]).shortValue());
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[121]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 11);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 11);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 10);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 26);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[139]).byteValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[142], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[143], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[144], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[146], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[147], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 6);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 20);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 20);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[154]).shortValue());
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[111], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[112], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[113], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[114], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[115], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[116], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[117], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[118], 100);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[121]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 11);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 11);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 10);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 26);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 13);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[139]).byteValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[140], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[142], 2);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[143], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[144], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[146], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[147], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 6);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 6);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 20);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 20);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[154]).shortValue());
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               return;
      }
   }

}

